# 📦 miconsole-maven — Proyecto Maven con Gson y Apache Commons

Proyecto Java de consola construido con **Apache Maven**, que demuestra la integración y uso de dependencias externas mediante el repositorio central de Maven.

![Java](https://img.shields.io/badge/Java-8%2B-blue?logo=openjdk) ![Maven](https://img.shields.io/badge/Maven-3.x-orange?logo=apachemaven) ![Gson](https://img.shields.io/badge/Gson-2.10.1-green) ![Commons Lang](https://img.shields.io/badge/Commons--Lang3-3.12.0-blue)

---

## 📋 Descripción

Aplicación de consola que integra dos bibliotecas populares del ecosistema Java:

- **Gson** (Google): Serialización y deserialización de objetos Java a JSON
- **Apache Commons Lang3**: Utilidades de manipulación de Strings (trim, isBlank, etc.)

El objetivo es aprender a gestionar dependencias con Maven y comprender el ciclo de vida de un proyecto Java profesional.

---

## 🏗️ Estructura del proyecto

```
miconsole-maven/
├── src/
│   └── main/java/com/tuusuario/miconsole/
│       ├── App.java        # Clase principal, punto de entrada
│       └── Persona.java    # Modelo POJO para serialización JSON
└── pom.xml             # Configuración Maven y dependencias
```

---

## 🛠️ Tecnologías y dependencias

| Dependencia | Versión | Propósito |
|---|---|---|
| Java | 8+ | Lenguaje principal |
| Maven | 3.x | Build y gestión de dependencias |
| Gson | 2.10.1 | Convertir objetos Java ↔ JSON |
| Apache Commons Lang3 | 3.12.0 | Utilidades para Strings |

---

## 🚀 Cómo ejecutar

### Prerrequisitos
- Java JDK 8+
- Maven 3.x instalado y en el PATH

```bash
# 1. Clonar el repositorio
git clone https://github.com/Carl0gonzalez/miconsole-maven.git
cd miconsole-maven

# 2. Compilar el proyecto
mvn compile

# 3. Ejecutar la aplicación
mvn exec:java -Dexec.mainClass="com.tuusuario.miconsole.App"

# 4. Empaquetar en JAR
mvn package
java -cp target/miconsole-1.0-SNAPSHOT.jar com.tuusuario.miconsole.App
```

### Salida esperada

```
¿Texto está en blanco?: false
Texto sin espacios: 'Hola Maven en la nube'
Persona en JSON: {"nombre":"Brayan","edad":30}
```

---

## 📚 Conceptos demostrados

- Estructura estándar de un proyecto Maven (`src/main/java`, `pom.xml`)
- Declaración de dependencias en `pom.xml` con `groupId`, `artifactId` y `version`
- Descarga automática de dependencias desde Maven Central
- Serialización de objetos POJO a JSON con Gson
- Uso de utilidades `StringUtils` de Apache Commons

---

## 💡 Aprendizajes clave

- Cómo funciona el ciclo de vida de Maven: `validate → compile → test → package → install`
- Diferencia entre scope `compile`, `test` y `provided` en dependencias
- Cómo Maven resuelve y descarga transitive dependencies automáticamente
- Ventajas de usar bibliotecas maduras vs. escribir utilidades desde cero

---

## 👤 Autor

**Carlo González** — [GitHub](https://github.com/Carl0gonzalez)
