# TecnologiasServiciosInternet_ConsumerDrivenContract 
Practica para la asignatura _Tecnologías y Servicios de Internet_ del master MasterCloudApps of the URJC.
Pruebas con Consumer Driven Contract Testing

# Enunciado
En la aplicación de la práctica 3 de la asignatura 2.1 Tecnologías de Servicios de Internet, se desarrolló una aplicación con cuatro servicios. Dicha aplicación ha sido refactorizada y se han dejado exclusivamente los servicios planner y toposervice (se proporciona un zip con ambos servicios: (cdct_enunciado).

El servicio planner utiliza el servicio toposervice para conocer la orografía de una determinada ciudad. Ambos servicios van a ser desarrollados por equipos diferentes y deben poder ser desplegados en cualquier momento sin depender el uno del otro y asegurando la compatibilidad entre ellos. Para ello, ambos equipos han acordado utilizar Consumer Driven Contract Testing usando Spring Cloud Contract.

## Requisitos/Especificaciones
- Definir un contrato para el endpoint getCity del servicio toposervice. Dicho contrato debe devolver una ciudad y su orografía.
- Configurar el servicio toposervice de forma que se pueda validar el contrato contra la
implementación de la API proporcionada por toposervice.
- Configurar el servicio planner e implementar un test que verifique el funcionamiento
esperado del endpoint getCity del servicio toposervice.

*NOTA:* Para evaluar la corrección de la solución proporcionada, se utilizarán los siguientes comandos por consola, usando una versión Maven 3.6.x:
- En el servicio toposervice:  ```mvn clean install```
- debe generar y ejecutar correctamente el test de aceptación (que deben pasar), generar el stub e instalarlo en el repositorio maven local
- En el servicio planner: ```mvn clean test```
- Debe descargar el stub y usarlo en el test como mock del servicio toposervice. Los tests deben pasar.
 
 
## Entregables
- El código de los dos servicios se entregará dentro de una carpeta CDCT en el zip
que se entregará con la práctica (ver instrucciones de entrega más abajo)
  
# Uso

## topoService
Lanzar el comando, dentro de la carpeta del proyecto
```shell
$ mvn clean install
```
* Mediante este comando se lanzarán los tests de aceptación definidos en el fichero *get_city.groovy* <-> BaseCDC.java
* Para evitar posibles conflictos el stub se genera con los datos:
    - groupId: *jjhernandez2020*
    - artifactId: *toposervice*

## planner
Lanzar el comando, dentro de la carpeta del proyecto
```shell
$ mvn clean test
```
* Mediante este comando se descargará el stub y se ejecutará el trest que verifica el endpoint para obtener la topografía de una ciudad (del toposervice))

# Author

👤 **Jaime Hernández Ortiz**

* Github: [@zuldare](https://github.com/zuldare)

Se debe tener [instalado JDK 11](https://www.oracle.com/java/technologies/javase/javase-jdk11-downloads.html) y [Maven](https://maven.apache.org/install.html) 
