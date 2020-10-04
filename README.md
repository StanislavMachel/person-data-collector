# Person data collector
Person data collector microservice

## Endpoints

`curl -X POST -d '{ "first_name": "John", "last_name": "Smith", "age": 26 }' -H "Content-Type: application/json" http://localhost:8080/api/persons | json_pp`