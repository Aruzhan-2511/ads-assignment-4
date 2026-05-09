# Assignment 4: Graph Traversal and Representation System

## Project Overview

This project demonstrates graph traversal algorithms in Java using an adjacency list representation.

The program implements:

* Breadth-First Search (BFS)
* Depth-First Search (DFS)

The system creates graphs of different sizes and compares traversal performance using execution time measurements.

---

# Graph Structure

A graph consists of:

* **Vertices** — nodes in the graph
* **Edges** — connections between vertices

This project uses an **adjacency list** representation to store graph connections.

### Example Graph

```text
0 -> 1 2
1 -> 2
2 -> 3 4
3 -> 4
4 -> 5 6
```

---

# Project Structure

```text
assignment3-graphs/
├── src/
│   ├── Vertex.java
│   ├── Edge.java
│   ├── Graph.java
│   ├── Experiment.java
│   └── Main.java
├── docs/
│   ├── screenshots/
│   └── diagrams/
├── README.md
└── .gitignore
```

---

# Class Descriptions

| Class             | Description                                              |
| ----------------- | -------------------------------------------------------- |
| `Vertex.java`     | Represents a graph vertex                                |
| `Edge.java`       | Represents a connection between two vertices             |
| `Graph.java`      | Stores graph using adjacency list and implements BFS/DFS |
| `Experiment.java` | Runs traversal tests and measures execution time         |
| `Main.java`       | Starts the program                                       |

---

# Vertex Class

### Fields

| Field | Description              |
| ----- | ------------------------ |
| `id`  | Unique vertex identifier |

### Methods

* Constructor
* Getter
* `toString()`

---

# Edge Class

### Fields

| Field         | Description     |
| ------------- | --------------- |
| `source`      | Starting vertex |
| `destination` | Ending vertex   |

### Methods

* Constructor
* Getters
* `toString()`

---

# Graph Class

The graph is implemented using an adjacency list.

### Main Methods

| Method         | Purpose                       |
| -------------- | ----------------------------- |
| `addVertex()`  | Adds vertex to graph          |
| `addEdge()`    | Adds edge between vertices    |
| `printGraph()` | Displays graph structure      |
| `bfs()`        | Performs Breadth-First Search |
| `dfs()`        | Performs Depth-First Search   |

---

# BFS Algorithm

## Breadth-First Search

BFS visits vertices level by level.

### Steps

1. Start from a selected vertex
2. Add neighbors into queue
3. Visit closest vertices first
4. Continue until queue becomes empty

### Uses of BFS

* Shortest path search
* Network traversal
* Connected components

### Time Complexity

```text
O(V + E)
```

Where:

* `V` = number of vertices
* `E` = number of edges

---

# DFS Algorithm

## Depth-First Search

DFS explores one path deeply before returning back.

### Steps

1. Start from a selected vertex
2. Visit neighbor vertex
3. Continue recursively
4. Return back when no neighbors remain

### Uses of DFS

* Path finding
* Cycle detection
* Maze solving

### Time Complexity

```text
O(V + E)
```

---

# Experimental Results

## Execution Time Comparison

| Graph Size   |  BFS Time |  DFS Time |
| ------------ | --------: | --------: |
| 10 vertices  | 547125 ns |  26458 ns |
| 30 vertices  |  57083 ns |  37667 ns |
| 100 vertices | 140084 ns | 354583 ns |

---

# Observations and Analysis

* DFS was faster on small and medium graphs in this experiment.
* BFS became faster on the large graph.
* Both algorithms still follow the expected complexity `O(V + E)`.
* Traversal order changes depending on graph structure.
* BFS is preferred when shortest path is needed.
* DFS may become inefficient for very deep graphs because of recursion depth.

---

# Screenshots

Screenshots are stored in:

```text
docs/screenshots/
```

Examples:

* Graph structure output
* BFS traversal output
* DFS traversal output
* Performance results

---

# Reflection

This assignment helped me understand graph traversal algorithms in practice.

I learned:

* the difference between BFS and DFS
* how adjacency lists work
* how graph structure affects traversal order
* how to measure execution time using `System.nanoTime()`

One challenge was implementing recursive DFS and understanding graph representation using adjacency lists.

I also improved my GitHub workflow and Java project organization skills.
