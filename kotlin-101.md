# Kotlin Lang 101

## Basics:
- Statically typed
- Client & Server
- Java and Kotlin are compatible with each other 
- *.kt 
- Type-Inference - You don’t need to specify the type if you declare it’s value
## Variables/Arrays:
- val = const (Read-only)
- var = let/var (Read/Write)
- declare a collection of elements with listOf() method
- by default collections (i.e arrays) are immutable and can’t be changed
- if you want a mutable collection use mutableListOf() method
- collections can only contain 1 type of item
## Loops:
- for(name in names) // loop
## Functions
- declare functions like: fun sayHello(name: String)
- private functions cant be accessed from other classes or files
## Null
- println(instagramAccount?.uppercase()) to check if var is null before calling the method. Calling a method on a var defined as null will throw an error.
