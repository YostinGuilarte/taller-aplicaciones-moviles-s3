# Taller de Aplicaciones Móviles - Semana 3
## Distribuidora de Alimentos - Caso de Estudio

### Requerimientos Funcionales
- RF01: El sistema debe permitir al usuario registrarse mediante cuenta Gmail.
- RF02: El sistema debe permitir al usuario realizar compras de productos.
- RF03: El sistema debe calcular automáticamente el costo de despacho según el monto de la compra.
- RF04: Para compras sobre $50.000, el despacho es gratuito dentro de un radio de 20 km.
- RF05: Para compras entre $25.000 y $49.999, el despacho tiene un costo de $150 por km recorrido.
- RF06: Para compras menores a $25.000, el despacho tiene un costo de $300 por km recorrido.
- RF07: El sistema debe mostrar al usuario el costo total incluyendo despacho.

### Requerimientos No Funcionales
- RNF01: La aplicación debe ejecutarse sobre la JVM (Java Virtual Machine) para portabilidad.
- RNF02: El código fuente debe ser compilable mediante javac sin necesidad de IDE.
- RNF03: La aplicación debe responder en menos de 3 segundos al calcular el despacho.
- RNF04: La interfaz debe ser intuitiva y accesible desde dispositivos móviles Android.
- RNF05: Los datos de usuarios deben almacenarse de forma segura.

### Historias de Usuario

**HU01 - Registro de usuario**
Como cliente de la distribuidora, quiero registrarme con mi cuenta Gmail, para acceder a la aplicación y realizar compras.
- Criterio de aceptación: El usuario puede iniciar sesión con Gmail y acceder al catálogo.

**HU02 - Realizar compra**
Como cliente, quiero seleccionar productos y agregarlos a un carrito, para realizar mi pedido.
- Criterio de aceptación: El usuario puede ver productos, agregarlos al carrito y ver el subtotal.

**HU03 - Cálculo de despacho**
Como cliente, quiero que el sistema calcule automáticamente el costo de despacho, para saber cuánto pagaré en total.
- Criterio de aceptación: El sistema aplica la tarifa correcta según el monto de compra y la distancia.

**HU04 - Visualización de resumen**
Como cliente, quiero ver un resumen con el detalle de mi compra y el costo de despacho antes de confirmar.
- Criterio de aceptación: Se muestra subtotal, costo despacho, distancia y total final.
