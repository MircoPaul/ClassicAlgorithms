// Recursive DFS for graphs given as adjacency list

static void DFS(int s, List[] G, boolean[] visited){
	visited[s] = true;
	for(int v : G[s]){
		if(!visited[v]){
			DFS(v, G, visited);
		}
	}
}