## Project Catalog

```mermaid
classDiagram
  class User {
    + id: Long
    + firstName: String
    + lastName: String
    + email: String
    + password: String
  }

  class Role {
    + authority: String
    + id: Long
  }

  class Product {
    + id: Long
    + name: String
    + description: String
    + price: Double
    + imgUrl: String
  }

  class Category {
    + id: Long
    + name: String
  }

  User "1" -- "N" Role : Has Roles
  Product "N" -- "N" Category : Belongs To Categories


```

### Project Dependencies `maven`
```bash
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
	<groupId>com.h2database</groupId>
	<artifactId>h2</artifactId>
	<scope>runtime</scope>
</dependency>

<dependency>
	<groupId>org.postgresql</groupId>
	<artifactId>postgresql</artifactId>
	<scope>runtime</scope>
</dependency>

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-validation</artifactId>
</dependency>

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-security</artifactId>
</dependency>
```