# Bank Account #

RestFul API With Java Spring

## Diagrama de Classes ##

``` mermaid

classDiagram
  class User {
    - String name
  }

  class Account {
    - String number
    - String accountAgency
    - Number accountBalance
    - Number accountLimit
  }

  class Feature {
    - String icon
    - String description
  }

  class Card {
    - String number
    - Number limit
  }

  class News {
    - String icon
    - String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News


```
