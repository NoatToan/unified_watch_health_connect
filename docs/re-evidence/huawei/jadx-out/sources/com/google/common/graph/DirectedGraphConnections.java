package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.DirectedGraphConnections;
import com.google.common.graph.EndpointPair;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class DirectedGraphConnections<N, V> implements GraphConnections<N, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f4538b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4539a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private final List<NodeConnection<N>> f4540c;
    private final Map<N, Object> d;
    private int e;

    static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f4548b;

        b(Object obj) {
            this.f4548b = obj;
        }
    }

    public static abstract class NodeConnection<N> {
        final N node;

        NodeConnection(N n) {
            this.node = (N) Preconditions.checkNotNull(n);
        }

        static final class a<N> extends NodeConnection<N> {
            a(N n) {
                super(n);
            }

            public boolean equals(@CheckForNull Object obj) {
                if (obj instanceof a) {
                    return this.node.equals(((a) obj).node);
                }
                return false;
            }

            public int hashCode() {
                return a.class.hashCode() + this.node.hashCode();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static final class c<N> extends NodeConnection<N> {
            c(N n) {
                super(n);
            }

            public boolean equals(@CheckForNull Object obj) {
                if (obj instanceof c) {
                    return this.node.equals(((c) obj).node);
                }
                return false;
            }

            public int hashCode() {
                return c.class.hashCode() + this.node.hashCode();
            }
        }
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> adjacentNodes() {
        if (this.f4540c == null) {
            return Collections.unmodifiableSet(this.d.keySet());
        }
        return new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.5
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public UnmodifiableIterator<N> iterator() {
                final Iterator it = DirectedGraphConnections.this.f4540c.iterator();
                final HashSet hashSet = new HashSet();
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.5.4
                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public N computeNext() {
                        while (it.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) it.next();
                            if (hashSet.add(nodeConnection.node)) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.d.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return DirectedGraphConnections.this.d.containsKey(obj);
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> predecessors() {
        return new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public UnmodifiableIterator<N> iterator() {
                if (DirectedGraphConnections.this.f4540c == null) {
                    final Iterator it = DirectedGraphConnections.this.d.entrySet().iterator();
                    return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.1.1
                        @Override // com.google.common.collect.AbstractIterator
                        @CheckForNull
                        public N computeNext() {
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (DirectedGraphConnections.b(entry.getValue())) {
                                    return (N) entry.getKey();
                                }
                            }
                            return endOfData();
                        }
                    };
                }
                final Iterator it2 = DirectedGraphConnections.this.f4540c.iterator();
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.1.3
                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public N computeNext() {
                        while (it2.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) it2.next();
                            if (nodeConnection instanceof NodeConnection.a) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.e;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return DirectedGraphConnections.b(DirectedGraphConnections.this.d.get(obj));
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> successors() {
        return new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public UnmodifiableIterator<N> iterator() {
                if (DirectedGraphConnections.this.f4540c == null) {
                    final Iterator it = DirectedGraphConnections.this.d.entrySet().iterator();
                    return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.1
                        @Override // com.google.common.collect.AbstractIterator
                        @CheckForNull
                        public N computeNext() {
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (DirectedGraphConnections.d(entry.getValue())) {
                                    return (N) entry.getKey();
                                }
                            }
                            return endOfData();
                        }
                    };
                }
                final Iterator it2 = DirectedGraphConnections.this.f4540c.iterator();
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.2
                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public N computeNext() {
                        while (it2.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) it2.next();
                            if (nodeConnection instanceof NodeConnection.c) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.f4539a;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return DirectedGraphConnections.d(DirectedGraphConnections.this.d.get(obj));
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public Iterator<EndpointPair<N>> incidentEdgeIterator(final N n) {
        final Iterator itB;
        Preconditions.checkNotNull(n);
        List<NodeConnection<N>> list = this.f4540c;
        if (list == null) {
            itB = Iterators.d(Iterators.b(predecessors().iterator(), new Function() { // from class: aos
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return EndpointPair.ordered(obj, n);
                }
            }), Iterators.b(successors().iterator(), new Function() { // from class: aop
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return EndpointPair.ordered(n, obj);
                }
            }));
        } else {
            itB = Iterators.b((Iterator) list.iterator(), new Function() { // from class: aor
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return DirectedGraphConnections.b(n, (DirectedGraphConnections.NodeConnection) obj);
                }
            });
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return new AbstractIterator<EndpointPair<N>>(this) { // from class: com.google.common.graph.DirectedGraphConnections.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public EndpointPair<N> computeNext() {
                while (itB.hasNext()) {
                    EndpointPair<N> endpointPair = (EndpointPair) itB.next();
                    if (!endpointPair.nodeU().equals(endpointPair.nodeV()) || !atomicBoolean.getAndSet(true)) {
                        return endpointPair;
                    }
                }
                return endOfData();
            }
        };
    }

    public static /* synthetic */ EndpointPair b(Object obj, NodeConnection nodeConnection) {
        if (nodeConnection instanceof NodeConnection.c) {
            return EndpointPair.ordered(obj, nodeConnection.node);
        }
        return EndpointPair.ordered(nodeConnection.node, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.GraphConnections
    @CheckForNull
    public V value(N n) {
        Preconditions.checkNotNull(n);
        V v = (V) this.d.get(n);
        if (v == f4538b) {
            return null;
        }
        return v instanceof b ? (V) ((b) v).f4548b : v;
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N n) {
        Preconditions.checkNotNull(n);
        Object obj = this.d.get(n);
        if (obj == f4538b) {
            this.d.remove(n);
        } else if (!(obj instanceof b)) {
            return;
        } else {
            this.d.put(n, ((b) obj).f4548b);
        }
        int i = this.e - 1;
        this.e = i;
        Graphs.d(i);
        List<NodeConnection<N>> list = this.f4540c;
        if (list != null) {
            list.remove(new NodeConnection.a(n));
        }
    }

    @Override // com.google.common.graph.GraphConnections
    @CheckForNull
    public V removeSuccessor(Object obj) {
        Object obj2;
        Preconditions.checkNotNull(obj);
        Object obj3 = (V) this.d.get(obj);
        if (obj3 == null || obj3 == (obj2 = f4538b)) {
            obj3 = (V) null;
        } else if (obj3 instanceof b) {
            this.d.put(obj, obj2);
            obj3 = (V) ((b) obj3).f4548b;
        } else {
            this.d.remove(obj);
        }
        if (obj3 != null) {
            int i = this.f4539a - 1;
            this.f4539a = i;
            Graphs.d(i);
            List<NodeConnection<N>> list = this.f4540c;
            if (list != null) {
                list.remove(new NodeConnection.c(obj));
            }
        }
        if (obj3 == null) {
            return null;
        }
        return (V) obj3;
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N n, V v) {
        Map<N, Object> map = this.d;
        Object obj = f4538b;
        Object objPut = map.put(n, obj);
        if (objPut != null) {
            if (objPut instanceof b) {
                this.d.put(n, objPut);
                return;
            } else if (objPut == obj) {
                return;
            } else {
                this.d.put(n, new b(objPut));
            }
        }
        int i = this.e + 1;
        this.e = i;
        Graphs.b(i);
        List<NodeConnection<N>> list = this.f4540c;
        if (list != null) {
            list.add(new NodeConnection.a(n));
        }
    }

    @Override // com.google.common.graph.GraphConnections
    @CheckForNull
    public V addSuccessor(N n, V v) {
        Object obj = (V) this.d.put(n, v);
        if (obj == null) {
            obj = (V) null;
        } else if (obj instanceof b) {
            this.d.put(n, new b(v));
            obj = (V) ((b) obj).f4548b;
        } else if (obj == f4538b) {
            this.d.put(n, new b(v));
            obj = (V) null;
        }
        if (obj == null) {
            int i = this.f4539a + 1;
            this.f4539a = i;
            Graphs.b(i);
            List<NodeConnection<N>> list = this.f4540c;
            if (list != null) {
                list.add(new NodeConnection.c(n));
            }
        }
        if (obj == null) {
            return null;
        }
        return (V) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(@CheckForNull Object obj) {
        return obj == f4538b || (obj instanceof b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(@CheckForNull Object obj) {
        return (obj == f4538b || obj == null) ? false : true;
    }
}
