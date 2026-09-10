package pedidos;

public class Main {
    public static void main(String[] args) {
        System.out.println("[Inicio de zona de carga]");
        System.out.println();

        ZonaDeCarga zonaDeCarga = new ZonaDeCarga();

        zonaDeCarga.agregarPedido(new Pedido(1, "Republica", EstadoPedido.PENDIENTE));
        zonaDeCarga.agregarPedido(new Pedido(2, "Los Leones", EstadoPedido.PENDIENTE));
        zonaDeCarga.agregarPedido(new Pedido(3, "Manuel Montt", EstadoPedido.PENDIENTE));
        zonaDeCarga.agregarPedido(new Pedido(4, "Recoleta", EstadoPedido.PENDIENTE));
        zonaDeCarga.agregarPedido(new Pedido(5, "Los Heroes", EstadoPedido.PENDIENTE));

        Thread repartidor1 = new Thread(new Repartidor("Alvaro", zonaDeCarga));
        Thread repartidor2 = new Thread(new Repartidor("Fabian", zonaDeCarga));
        Thread repartidor3 = new Thread(new Repartidor("Tomas", zonaDeCarga));

        repartidor1.start();
        repartidor2.start();
        repartidor3.start();

        try {
            repartidor1.join();
            repartidor2.join();
            repartidor3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println();
        System.out.println("[Zona de carga sin repartidores]");
        System.out.println();
        System.out.println("[Se han entregado todo los pedidos]");

    }
}