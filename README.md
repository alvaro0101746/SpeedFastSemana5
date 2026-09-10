# SpeedFast - Gestión Concurrente de Pedidos

Sistema en Java para la gestión de entregas en tiempo real. Permite coordinar los pedidos a múltiples repartidores de forma simultánea mediante hilos Thread, Runnable y acceso a recursos compartidos synchronized.

## Estructura del Proyecto

src/

└── pedidos/

├── EstadoPedido.java

├── Pedido.java

├── ZonaDeCarga.java

├── Repartidor.java

└── Main.java



## Componentes

EstadoPedido: Enum que define estados del ciclo de un envío.

Pedido: Modelo que almacena la información de cada entrega.

ZonaDeCarga: Recurso compartido que almacena los paquetes en una cola utilizando métodos sincronizados para evitar accesos al mismo recurso al mismo tiempo.

Repartidor: Clase que implementa Runnable para procesar las entregas en paralelo dentro de su hilo, actualizando el estado y simulando trayectos con Thread.sleep().

Main: Clase principal del programa. Carga 5 pedidos, instancia 3 hilos de repartidores y coordina el cierre del proceso mediante .join().

## Ejecución

1. Abre el proyecto en IntelliJ IDEA.


2. Ve a la ruta src/pedidos/Main.java.


3. Ejecuta la clase Main y ve la consola para ver los repartidores retirando y entregando pedidos en paralelo hasta vaciar la zona de carga.

Alvaro Moreno

Duoc UC