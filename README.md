# BuilderPattern

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

      
            public User(String firstName, String lastName, String email,
                       String address, String phone, int age) {
                 // ...
            }
      
However, you encounter challenges:

- Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.
- Optional fields: Not all customers provide complete information, but the constructor forces them to.
- Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.

Implement solution using the Builder Pattern to address the issue.


# Class Diagram
- Builderpattern
![Blank diagram (1)](https://github.com/ErikkaEnaje/Builderpattern/assets/142382057/4b55de64-3035-480b-a91d-0d87cdfb2098)


