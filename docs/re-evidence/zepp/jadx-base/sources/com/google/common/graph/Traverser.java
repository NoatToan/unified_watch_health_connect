package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
public abstract class Traverser<N> {

    public enum c {
        PREORDER,
        POSTORDER
    }

    public static <N> Traverser<N> forGraph(SuccessorsFunction<N> successorsFunction) {
        Preconditions.checkNotNull(successorsFunction);
        return new b(successorsFunction);
    }

    public static <N> Traverser<N> forTree(SuccessorsFunction<N> successorsFunction) {
        Preconditions.checkNotNull(successorsFunction);
        if (successorsFunction instanceof e) {
            Preconditions.checkArgument(((e) successorsFunction).isDirected(), "Undirected graphs can never be trees.");
        }
        if (successorsFunction instanceof Network) {
            Preconditions.checkArgument(((Network) successorsFunction).isDirected(), "Undirected networks can never be trees.");
        }
        return new d(successorsFunction);
    }

    public abstract Iterable<N> breadthFirst(Iterable<? extends N> iterable);

    public abstract Iterable<N> breadthFirst(N n);

    public abstract Iterable<N> depthFirstPostOrder(Iterable<? extends N> iterable);

    public abstract Iterable<N> depthFirstPostOrder(N n);

    public abstract Iterable<N> depthFirstPreOrder(Iterable<? extends N> iterable);

    public abstract Iterable<N> depthFirstPreOrder(N n);

    public static final class b<N> extends Traverser<N> {
        private final SuccessorsFunction<N> a;

        public class a implements Iterable<N> {
            public final /* synthetic */ Iterable a;

            public a(Iterable iterable) {
                this.a = iterable;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return new d(this.a);
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.Traverser$b$b, reason: collision with other inner class name */
        public class C0213b implements Iterable<N> {
            public final /* synthetic */ Iterable a;

            public C0213b(Iterable iterable) {
                this.a = iterable;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return new e(this.a, c.PREORDER);
            }
        }

        public class c implements Iterable<N> {
            public final /* synthetic */ Iterable a;

            public c(Iterable iterable) {
                this.a = iterable;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return new e(this.a, c.POSTORDER);
            }
        }

        public final class d extends UnmodifiableIterator<N> {
            private final Queue<N> a = new ArrayDeque();
            private final Set<N> b = new HashSet();

            public d(Iterable<? extends N> iterable) {
                for (N n : iterable) {
                    if (this.b.add(n)) {
                        this.a.add(n);
                    }
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.a.isEmpty();
            }

            @Override // java.util.Iterator
            public N next() {
                N nRemove = this.a.remove();
                for (N n : b.this.a.successors(nRemove)) {
                    if (this.b.add(n)) {
                        this.a.add(n);
                    }
                }
                return nRemove;
            }
        }

        public final class e extends AbstractIterator<N> {
            private final Deque<b<N>.e.a> c;
            private final Set<N> d;
            private final c e;

            public final class a {

                @NullableDecl
                public final N a;
                public final Iterator<? extends N> b;

                public a(N n, Iterable<? extends N> iterable) {
                    this.a = n;
                    this.b = iterable.iterator();
                }
            }

            public e(Iterable<? extends N> iterable, c cVar) {
                ArrayDeque arrayDeque = new ArrayDeque();
                this.c = arrayDeque;
                this.d = new HashSet();
                arrayDeque.push(new a(null, iterable));
                this.e = cVar;
            }

            public b<N>.e.a b(N n) {
                return new a(n, b.this.a.successors(n));
            }

            @Override // com.google.common.collect.AbstractIterator
            public N computeNext() {
                N n;
                while (!this.c.isEmpty()) {
                    b<N>.e.a first = this.c.getFirst();
                    boolean zAdd = this.d.add(first.a);
                    boolean z = true;
                    boolean z2 = !first.b.hasNext();
                    if ((!zAdd || this.e != c.PREORDER) && (!z2 || this.e != c.POSTORDER)) {
                        z = false;
                    }
                    if (z2) {
                        this.c.pop();
                    } else {
                        N next = first.b.next();
                        if (!this.d.contains(next)) {
                            this.c.push(b(next));
                        }
                    }
                    if (z && (n = first.a) != null) {
                        return n;
                    }
                }
                return (N) endOfData();
            }
        }

        public b(SuccessorsFunction<N> successorsFunction) {
            super();
            this.a = (SuccessorsFunction) Preconditions.checkNotNull(successorsFunction);
        }

        private void b(N n) {
            this.a.successors(n);
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> breadthFirst(N n) {
            Preconditions.checkNotNull(n);
            return breadthFirst((Iterable) ImmutableSet.of(n));
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> depthFirstPostOrder(N n) {
            Preconditions.checkNotNull(n);
            return depthFirstPostOrder((Iterable) ImmutableSet.of(n));
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> depthFirstPreOrder(N n) {
            Preconditions.checkNotNull(n);
            return depthFirstPreOrder((Iterable) ImmutableSet.of(n));
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> breadthFirst(Iterable<? extends N> iterable) {
            Preconditions.checkNotNull(iterable);
            if (Iterables.isEmpty(iterable)) {
                return ImmutableSet.of();
            }
            Iterator<? extends N> it2 = iterable.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
            return new a(iterable);
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> depthFirstPostOrder(Iterable<? extends N> iterable) {
            Preconditions.checkNotNull(iterable);
            if (Iterables.isEmpty(iterable)) {
                return ImmutableSet.of();
            }
            Iterator<? extends N> it2 = iterable.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
            return new c(iterable);
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> depthFirstPreOrder(Iterable<? extends N> iterable) {
            Preconditions.checkNotNull(iterable);
            if (Iterables.isEmpty(iterable)) {
                return ImmutableSet.of();
            }
            Iterator<? extends N> it2 = iterable.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
            return new C0213b(iterable);
        }
    }

    public static final class d<N> extends Traverser<N> {
        private final SuccessorsFunction<N> a;

        public class a implements Iterable<N> {
            public final /* synthetic */ Iterable a;

            public a(Iterable iterable) {
                this.a = iterable;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return new C0214d(this.a);
            }
        }

        public class b implements Iterable<N> {
            public final /* synthetic */ Iterable a;

            public b(Iterable iterable) {
                this.a = iterable;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return new f(this.a);
            }
        }

        public class c implements Iterable<N> {
            public final /* synthetic */ Iterable a;

            public c(Iterable iterable) {
                this.a = iterable;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return new e(this.a);
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.Traverser$d$d, reason: collision with other inner class name */
        public final class C0214d extends UnmodifiableIterator<N> {
            private final Queue<N> a = new ArrayDeque();

            public C0214d(Iterable<? extends N> iterable) {
                Iterator<? extends N> it2 = iterable.iterator();
                while (it2.hasNext()) {
                    this.a.add(it2.next());
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.a.isEmpty();
            }

            @Override // java.util.Iterator
            public N next() {
                N nRemove = this.a.remove();
                Iterables.addAll(this.a, d.this.a.successors(nRemove));
                return nRemove;
            }
        }

        public final class e extends AbstractIterator<N> {
            private final ArrayDeque<d<N>.e.a> c;

            public final class a {

                @NullableDecl
                public final N a;
                public final Iterator<? extends N> b;

                public a(N n, Iterable<? extends N> iterable) {
                    this.a = n;
                    this.b = iterable.iterator();
                }
            }

            public e(Iterable<? extends N> iterable) {
                ArrayDeque<d<N>.e.a> arrayDeque = new ArrayDeque<>();
                this.c = arrayDeque;
                arrayDeque.addLast(new a(null, iterable));
            }

            public d<N>.e.a b(N n) {
                return new a(n, d.this.a.successors(n));
            }

            @Override // com.google.common.collect.AbstractIterator
            public N computeNext() {
                while (!this.c.isEmpty()) {
                    d<N>.e.a last = this.c.getLast();
                    if (last.b.hasNext()) {
                        this.c.addLast(b(last.b.next()));
                    } else {
                        this.c.removeLast();
                        N n = last.a;
                        if (n != null) {
                            return n;
                        }
                    }
                }
                return (N) endOfData();
            }
        }

        public final class f extends UnmodifiableIterator<N> {
            private final Deque<Iterator<? extends N>> a;

            public f(Iterable<? extends N> iterable) {
                ArrayDeque arrayDeque = new ArrayDeque();
                this.a = arrayDeque;
                arrayDeque.addLast(iterable.iterator());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.a.isEmpty();
            }

            @Override // java.util.Iterator
            public N next() {
                Iterator<? extends N> last = this.a.getLast();
                N n = (N) Preconditions.checkNotNull(last.next());
                if (!last.hasNext()) {
                    this.a.removeLast();
                }
                Iterator<? extends N> it2 = d.this.a.successors(n).iterator();
                if (it2.hasNext()) {
                    this.a.addLast(it2);
                }
                return n;
            }
        }

        public d(SuccessorsFunction<N> successorsFunction) {
            super();
            this.a = (SuccessorsFunction) Preconditions.checkNotNull(successorsFunction);
        }

        private void b(N n) {
            this.a.successors(n);
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> breadthFirst(N n) {
            Preconditions.checkNotNull(n);
            return breadthFirst((Iterable) ImmutableSet.of(n));
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> depthFirstPostOrder(N n) {
            Preconditions.checkNotNull(n);
            return depthFirstPostOrder((Iterable) ImmutableSet.of(n));
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> depthFirstPreOrder(N n) {
            Preconditions.checkNotNull(n);
            return depthFirstPreOrder((Iterable) ImmutableSet.of(n));
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> breadthFirst(Iterable<? extends N> iterable) {
            Preconditions.checkNotNull(iterable);
            if (Iterables.isEmpty(iterable)) {
                return ImmutableSet.of();
            }
            Iterator<? extends N> it2 = iterable.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
            return new a(iterable);
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> depthFirstPostOrder(Iterable<? extends N> iterable) {
            Preconditions.checkNotNull(iterable);
            if (Iterables.isEmpty(iterable)) {
                return ImmutableSet.of();
            }
            Iterator<? extends N> it2 = iterable.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
            return new c(iterable);
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> depthFirstPreOrder(Iterable<? extends N> iterable) {
            Preconditions.checkNotNull(iterable);
            if (Iterables.isEmpty(iterable)) {
                return ImmutableSet.of();
            }
            Iterator<? extends N> it2 = iterable.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
            return new b(iterable);
        }
    }

    private Traverser() {
    }
}
