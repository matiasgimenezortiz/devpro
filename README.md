# dev.pro

This project includes a simple logging function and an inventory management function. The logging function records events and errors with timestamps, while the inventory management function sorts products based on different criteria.

## Logger

### Introduction

The Logger module provides a basic logging function that writes messages to a text file with timestamps.

### Usage

To log messages, use the `log_message` function provided by the `Logger` class. Pass the log filename, message, and log level as parameters.

```java
Logger.log_message("application.log", "User logged in", "INFO");
Logger.log_message("application.log", "Failed login attempt", "WARNING");
```

### Example log entries in application.log:
```java
[2023-08-10 15:23:45] [INFO] User logged in
[2023-08-10 15:25:30] [WARNING] Failed login attempt
```

### Tests
Tests for the Logger class are included in the LoggerTest class. These tests validate the correctness of the log messages and the logging functionality.


## Inventory Management

### Introduction
The Inventory Management module includes a function for sorting a list of products by name, price, or stock level. The sorting order can be set to ascending or descending.

### Usage
To sort products, use the sortProducts function provided by the InventoryManager class. Pass the list of products, sort key, and sorting order as parameters.
List<Product> sortedProducts = InventoryManager.sortProducts(products, "price", false);

### Example output:
```java
[INFO] Sorted products based on price in descending order:

Product{name='Product B', price=200, stock=3}
Product{name='Product A', price=100, stock=5}
Product{name='Product C', price=50, stock=10}
```
