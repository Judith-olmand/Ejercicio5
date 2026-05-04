# 🗄️ Ejercicio5 [ConexionOracleMaven] — Actualización con PreparedStatement

Este proyecto Java gestionado con Maven permite conectar con una base de datos Oracle para realizar operaciones de actualización de datos (DML) de forma segura, utilizando sentencias preparadas para modificar registros existentes en la tabla `empleado`.

## 📋 Descripción del Proyecto
El propósito de esta aplicación es demostrar la modificación de registros mediante JDBC. El foco principal es el uso de la cláusula `UPDATE`, permitiendo cambiar valores específicos (como el salario) de un registro identificado por su `ID`. Se hace especial énfasis en la seguridad mediante el uso de parámetros para evitar la inyección SQL.

## 🎯 Funcionalidades del Menú
Al ejecutarse, el programa realiza el siguiente flujo de trabajo:
* **Conexión Automatizada**: Carga los datos de acceso desde el archivo externo `db.properties`.
* **Sentencia Preparada**: Configura una instrucción SQL de tipo `UPDATE` con marcadores de posición (`?`).
* **Mapeo de Parámetros**: Asigna el nuevo salario (`355.15`) y el ID del objetivo (`10`) de forma dinámica.
* **Confirmación de Acción**: Ejecuta la actualización y devuelve por consola el número de filas que fueron modificadas con éxito.

## 🏗️ Estructura del Proyecto
```text
Ejercicio5 [ConexionOracleMaven]/
│
├── 📁 src/
│   └── 📁 main/
│       ├── 📁 java/
│       │   └── 📁 org/example/
│       │       ├── ☕ DBConfig.java        # Gestiona la carga de configuración
│       │       └── ☕ Main.java            # Lógica de actualización (UPDATE)
│       └── 📁 resources/
│           └── 📄 db.properties           # Credenciales de base de datos
│
├── 📁 target/                             # Binarios generados
├── 🚫 .gitignore                          # Exclusión de archivos sensibles
└── 📄 pom.xml                             # Gestión de dependencias (OJDBC11)
```

## 📄 Formato del Archivo de Entrada
Asegúrate de que el archivo `src/main/resources/db.properties` tenga la siguiente estructura:
```properties
db.url=jdbc:oracle:thin:@localhost:1521:xe
db.user=TU_USUARIO
db.password=TU_CONTRASEÑA
```

## 🚀 Compilación y Ejecución
### Requisitos
* Java JDK 17 o superior.
* Maven 3.8+ instalado.
* Base de datos Oracle con la tabla `empleado` creada.

### Comandos
```bash
# Compilar el proyecto
mvn clean compile

# Ejecutar la aplicación
mvn exec:java -Dexec.mainClass="org.example.Main"
```

## 🔧 Características Técnicas Implementadas
* **Uso de PreparedStatement**: Implementación segura de actualizaciones parametrizadas.
* **Gestión Eficiente de Recursos**: Uso de bloque `try-with-resources` para garantizar el cierre de conexiones.
* **Control de Transacciones DML**: Retorno del conteo de filas afectadas mediante `executeUpdate()`.
* **Arquitectura Limpia**: Separación de la lógica de conexión (DBConfig) de la lógica de negocio (Main).

## 🎮 Ejemplo de Uso Visual

**Estado deseado:**
* **Campo a editar**: Salario.
* **Nuevo valor**: 355.15.
* **Condición**: Donde ID sea igual a 10.

**Salida en Consola:**
```bash
Conexión establecida con Oracle.
Empleado modificado con éxito: 1
```

---
**Autor:** Judith Olmedo Andrés  
*Ejercicio 5 - Actualización de registros con JDBC y Maven.*
```