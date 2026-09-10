package pedidos;

import java.util.LinkedList;
import java.util.Queue;

public class ZonaDeCarga {
    private Queue<Pedido> pedidos = new LinkedList<>();

    public synchronized void agregarPedido(Pedido p) {
        pedidos.add(p);
        System.out.println("pedidos.Pedido #" + p.getId() + " agregado. Destino: " + p.getDireccionEntrega());
    }

    public synchronized Pedido retirarPedido() {
        if (pedidos.isEmpty()) {
            return null;
    }
        return pedidos.poll();
    }
}
