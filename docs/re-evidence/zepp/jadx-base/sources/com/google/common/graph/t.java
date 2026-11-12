package com.google.common.graph;

/* JADX INFO: loaded from: classes3.dex */
final class t {
    public static final int a = 2;
    public static final int b = 10;
    public static final int c = 20;
    public static final float d = 1.0f;
    public static final int e = 2;
    public static final String f = "Node %s is not an element of this graph.";
    public static final String g = "Edge %s is not an element of this graph.";
    public static final String h = "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.";
    public static final String i = "Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.";
    public static final String j = "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.";
    public static final String k = "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.";
    public static final String l = "Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.";
    public static final String m = "Edge %s already exists in the graph.";

    public enum a {
        EDGE_EXISTS
    }

    private t() {
    }
}
