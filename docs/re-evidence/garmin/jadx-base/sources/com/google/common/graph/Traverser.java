package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.DoNotMock;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
@Beta
@ElementTypesAreNonnullByDefault
@DoNotMock("Call forGraph or forTree, passing a lambda or a Graph with the desired edges (built with GraphBuilder)")
public abstract class Traverser<N> {
    private final SuccessorsFunction<N> successorFunction;

    public enum InsertionOrder {
        FRONT { // from class: com.google.common.graph.Traverser.InsertionOrder.1
            @Override // com.google.common.graph.Traverser.InsertionOrder
            public <T> void insertInto(Deque<T> deque, T t7) {
                deque.addFirst(t7);
            }
        },
        BACK { // from class: com.google.common.graph.Traverser.InsertionOrder.2
            @Override // com.google.common.graph.Traverser.InsertionOrder
            public <T> void insertInto(Deque<T> deque, T t7) {
                deque.addLast(t7);
            }
        };

        public abstract <T> void insertInto(Deque<T> deque, T t7);
    }

    public static abstract class Traversal<N> {
        final SuccessorsFunction<N> successorFunction;

        public Traversal(SuccessorsFunction<N> successorsFunction) {
            this.successorFunction = successorsFunction;
        }

        public static <N> Traversal<N> inGraph(SuccessorsFunction<N> successorsFunction) {
            final HashSet hashSet = new HashSet();
            return new Traversal<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.Traversal.1
                @Override // com.google.common.graph.Traverser.Traversal
                public N visitNext(Deque<Iterator<? extends N>> deque) {
                    Iterator<? extends N> first = deque.getFirst();
                    while (first.hasNext()) {
                        N next = first.next();
                        Objects.requireNonNull(next);
                        if (hashSet.add(next)) {
                            return next;
                        }
                    }
                    deque.removeFirst();
                    return null;
                }
            };
        }

        public static <N> Traversal<N> inTree(SuccessorsFunction<N> successorsFunction) {
            return new Traversal<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.Traversal.2
                @Override // com.google.common.graph.Traverser.Traversal
                public N visitNext(Deque<Iterator<? extends N>> deque) {
                    Iterator<? extends N> first = deque.getFirst();
                    if (first.hasNext()) {
                        return (N) Preconditions.checkNotNull(first.next());
                    }
                    deque.removeFirst();
                    return null;
                }
            };
        }

        private Iterator<N> topDown(Iterator<? extends N> it, final InsertionOrder insertionOrder) {
            final ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(it);
            return new AbstractIterator<N>(this) { // from class: com.google.common.graph.Traverser.Traversal.3
                final /* synthetic */ Traversal this$0;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // com.google.common.collect.AbstractIterator
                public N computeNext() {
                    do {
                        N n14 = (N) this.this$0.visitNext(arrayDeque);
                        if (n14 != null) {
                            Iterator<? extends N> it3 = this.this$0.successorFunction.successors(n14).iterator();
                            if (it3.hasNext()) {
                                insertionOrder.insertInto(arrayDeque, it3);
                            }
                            return n14;
                        }
                    } while (!arrayDeque.isEmpty());
                    return endOfData();
                }
            };
        }

        public final Iterator<N> breadthFirst(Iterator<? extends N> it) {
            return topDown(it, InsertionOrder.BACK);
        }

        public final Iterator<N> postOrder(Iterator<? extends N> it) {
            final ArrayDeque arrayDeque = new ArrayDeque();
            final ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(it);
            return new AbstractIterator<N>(this) { // from class: com.google.common.graph.Traverser.Traversal.4
                final /* synthetic */ Traversal this$0;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // com.google.common.collect.AbstractIterator
                public N computeNext() {
                    while (true) {
                        N n14 = (N) this.this$0.visitNext(arrayDeque2);
                        if (n14 == null) {
                            return !arrayDeque.isEmpty() ? (N) arrayDeque.pop() : endOfData();
                        }
                        Iterator<? extends N> it3 = this.this$0.successorFunction.successors(n14).iterator();
                        if (!it3.hasNext()) {
                            return n14;
                        }
                        arrayDeque2.addFirst(it3);
                        arrayDeque.push(n14);
                    }
                }
            };
        }

        public final Iterator<N> preOrder(Iterator<? extends N> it) {
            return topDown(it, InsertionOrder.FRONT);
        }

        public abstract N visitNext(Deque<Iterator<? extends N>> deque);
    }

    private Traverser(SuccessorsFunction<N> successorsFunction) {
        this.successorFunction = (SuccessorsFunction) Preconditions.checkNotNull(successorsFunction);
    }

    public static <N> Traverser<N> forGraph(final SuccessorsFunction<N> successorsFunction) {
        return new Traverser<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.1
            @Override // com.google.common.graph.Traverser
            public Traversal<N> newTraversal() {
                return Traversal.inGraph(successorsFunction);
            }
        };
    }

    public static <N> Traverser<N> forTree(final SuccessorsFunction<N> successorsFunction) {
        if (successorsFunction instanceof BaseGraph) {
            Preconditions.checkArgument(((BaseGraph) successorsFunction).isDirected(), "Undirected graphs can never be trees.");
        }
        if (successorsFunction instanceof Network) {
            Preconditions.checkArgument(((Network) successorsFunction).isDirected(), "Undirected networks can never be trees.");
        }
        return new Traverser<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.2
            @Override // com.google.common.graph.Traverser
            public Traversal<N> newTraversal() {
                return Traversal.inTree(successorsFunction);
            }
        };
    }

    private ImmutableSet<N> validate(Iterable<? extends N> iterable) {
        ImmutableSet<N> immutableSetCopyOf = ImmutableSet.copyOf(iterable);
        UnmodifiableIterator<N> it = immutableSetCopyOf.iterator();
        while (it.hasNext()) {
            this.successorFunction.successors(it.next());
        }
        return immutableSetCopyOf;
    }

    public final Iterable<N> breadthFirst(Iterable<? extends N> iterable) {
        final ImmutableSet<N> immutableSetValidate = validate(iterable);
        return new Iterable<N>(this) { // from class: com.google.common.graph.Traverser.3
            final /* synthetic */ Traverser this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return this.this$0.newTraversal().breadthFirst(immutableSetValidate.iterator());
            }
        };
    }

    public final Iterable<N> depthFirstPostOrder(Iterable<? extends N> iterable) {
        final ImmutableSet<N> immutableSetValidate = validate(iterable);
        return new Iterable<N>(this) { // from class: com.google.common.graph.Traverser.5
            final /* synthetic */ Traverser this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return this.this$0.newTraversal().postOrder(immutableSetValidate.iterator());
            }
        };
    }

    public final Iterable<N> depthFirstPreOrder(Iterable<? extends N> iterable) {
        final ImmutableSet<N> immutableSetValidate = validate(iterable);
        return new Iterable<N>(this) { // from class: com.google.common.graph.Traverser.4
            final /* synthetic */ Traverser this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return this.this$0.newTraversal().preOrder(immutableSetValidate.iterator());
            }
        };
    }

    public abstract Traversal<N> newTraversal();

    public final Iterable<N> breadthFirst(N n14) {
        return breadthFirst((Iterable) ImmutableSet.of(n14));
    }

    public final Iterable<N> depthFirstPostOrder(N n14) {
        return depthFirstPostOrder((Iterable) ImmutableSet.of(n14));
    }

    public final Iterable<N> depthFirstPreOrder(N n14) {
        return depthFirstPreOrder((Iterable) ImmutableSet.of(n14));
    }
}
