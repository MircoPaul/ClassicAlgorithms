// Stack based algorithm to find topological sort of a DAG

static void DFS(int s, List[] G, boolean[] visited, int[] topoSort, int[] index){
	visited[s] = true;
	for(int v : G[s]){
		if(!visited[v]){
			DFS(v, G, visited, topoSort, index);
		}
	}
	topoSort[index[0]] = s;
	index[0]--;
}

static int[] topologicalSort(int s, List[] G){
	int[] topoSort = new int[G.size());
	boolean[] visited = new boolean[G.size());
	int[] index = {G.v - 1};
	DFS(s, G, visited, topoSort, index);
}