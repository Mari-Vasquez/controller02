# 🚀 API REST de Gestión de Series (Spring Boot)

Este proyecto es una API REST desarrollada en Java utilizando Spring Boot, Spring Data JPA, Lombok y una base de datos en memoria H2, cumpliendo con una arquitectura por capas (MVC).

## 🛠️ Tecnologías Utilizadas

* **Java** (Versión 17)
* **Spring Boot** (v3.2.5)
* **Spring Data JPA** (para la persistencia de datos)
* **H2 Database** (Base de datos en memoria para desarrollo/pruebas)
* **Lombok** (para simplificar la creación de constructores, getters y setters)
* **Maven** (Gestor de dependencias)

## 📂 Estructura del Proyecto

El proyecto está organizado en las siguientes capas obligatorias:

* `com.example.demo.models`: Contiene la entidad principal (`Serie.java`).
* `com.example.demo.repository`: Contiene la interfaz de acceso a datos (`SerieRepository.java`).
* `com.example.demo.service`: Contiene la lógica de negocio (`SerieService.java`).
* `com.example.demo.controller`: Contiene los endpoints REST expuestos (`SerieController.java`).

## ⚙️ Configuración y Ejecución

1. Clona o abre el proyecto en tu entorno de desarrollo favorito (**IntelliJ IDEA**).
2. Asegúrate de que las dependencias de Maven estén descargadas correctamente.
3. Ejecuta la clase principal **`DemoApplication.java`**.
4. La aplicación se iniciará por defecto en el puerto `8080`.

## 🔗 Endpoints de la API (Rutas Disponibles)

Puedes probar las siguientes peticiones utilizando herramientas como Postman o Thunder Client:

* **Listar todas las series (GET):**
  `http://localhost:8080/api/series`
* **Buscar serie por ID (GET):**
  `http://localhost:8080/api/series/{id}`
* **Crear una nueva serie (POST):**
  `http://localhost:8080/api/series`
  *(Enviar en el Body un JSON con: `titulo`, `plataforma`, `calificacion`)*
* **Eliminar una serie por ID (DELETE):**
  `http://localhost:8080/api/series/{id}`

## 🗄️ Consola H2 (Base de Datos)

Para visualizar los datos almacenados en memoria mientras corre la app, ingresa a:

* **URL:** `http://localhost:8080/h2-console`
* **JDBC URL:** `jdbc:h2:mem:seriesdb`
* **User Name:** `sa`
* **Password:** *(dejar en blanco)*
## Link postman:
https://marielenavasquezguaita90-8514840.postman.co/workspace/7d30ad16-0bd3-48fe-85bf-caec22719630/collection/60053288-79526018-538b-4174-898d-f8c5fb8b6af9?action=share&source=copy-link&creator=60053288
