# Spring Boot Rest Api Example
## Things to do:
### Clone this project:
```
git clone https://github.com/hendisantika/SpringBootRestApiExample.git 
```

### Go to the folder
```
cd SpringBootRestApiExample
```
### To run this project
`mvn clean spring-boot:run`

### Open your browser :
http://localhost:8080/SpringBootRestApi

### Open Your Favorite REST Client App (I am using POSTMAN)

#### Get All Users

![Get All Users](img/all.png "Get All Users")

Request:
```
http localhost:8080/SpringBootRestApi/api/user/
```

Response:
```
HTTP/1.1 200 
Content-Type: application/json;charset=UTF-8
Date: Wed, 10 Apr 2019 12:22:41 GMT
Transfer-Encoding: chunked

[
    {
        "age": 30,
        "id": 1,
        "name": "Naruto",
        "salary": 70000.0
    },
    {
        "age": 40,
        "id": 2,
        "name": "Sasuke",
        "salary": 50000.0
    },
    {
        "age": 45,
        "id": 3,
        "name": "Sakura",
        "salary": 30000.0
    },
    {
        "age": 50,
        "id": 4,
        "name": "Kakashi",
        "salary": 40000.0
    },
    {
        "age": 50,
        "id": 5,
        "name": "Minato",
        "salary": 40000.0
    },
    {
        "age": 50,
        "id": 6,
        "name": "Sarutobi",
        "salary": 40000.0
    },
    {
        "age": 50,
        "id": 7,
        "name": "Orochimaru",
        "salary": 40000.0
    },
    {
        "age": 50,
        "id": 8,
        "name": "Jiraiya",
        "salary": 40000.0
    },
    {
        "age": 50,
        "id": 9,
        "name": "Tsunade",
        "salary": 40000.0
    },
    {
        "age": 50,
        "id": 10,
        "name": "Kiba",
        "salary": 40000.0
    },
    {
        "age": 50,
        "id": 11,
        "name": "Hyuuga",
        "salary": 40000.0
    },
    {
        "age": 50,
        "id": 12,
        "name": "Hinata",
        "salary": 40000.0
    },
    {
        "age": 50,
        "id": 13,
        "name": "Shino",
        "salary": 40000.0
    },
    {
        "age": 50,
        "id": 14,
        "name": "Ten-ten",
        "salary": 40000.0
    },
    {
        "age": 50,
        "id": 15,
        "name": "Rock Lee",
        "salary": 40000.0
    }
]

```


#### Get User By Id

![Get User By Id](img/find.png "Get User By Id")

Request:
```
http localhost:8080/SpringBootRestApi/api/user/1
```

Response:
```
HTTP/1.1 200 
Content-Type: application/json;charset=UTF-8
Date: Wed, 10 Apr 2019 12:24:19 GMT
Transfer-Encoding: chunked

{
    "age": 30,
    "id": 1,
    "name": "Naruto",
    "salary": 70000.0
}
```
#### Add New User
#### Update User by Id

![Update User By Id](img/update.png "Update User By Id")

Request:
```
http put localhost:8080/SpringBootRestApi/api/user/13
```
Response:
#### Delete User by Id

![Delete User By Id](img/delete.png "Delete User By Id")

Request:
```
http delete localhost:8080/SpringBootRestApi/api/user/13
```
Response:
```
HTTP/1.1 204 
Date: Wed, 10 Apr 2019 12:25:27 GMT
```
Cek User that has been deleted
```
http localhost:8080/SpringBootRestApi/api/user/1

HTTP/1.1 404 
Content-Type: application/json;charset=UTF-8
Date: Wed, 10 Apr 2019 12:26:11 GMT
Transfer-Encoding: chunked

{
    "errorMessage": "User with id 13 not found"
}
```

#### Delete All Users
Request:
```
http delete localhost:8080/SpringBootRestApi/api/user/
```
Response:
```
http delete localhost:8080/SpringBootRestApi/api/user/
```