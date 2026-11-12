package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import defpackage.amn;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
@Deprecated
public abstract class TreeTraverser<T> {
    public abstract Iterable<T> children(T t);

    @Deprecated
    public static <T> TreeTraverser<T> using(final Function<T, ? extends Iterable<T>> function) {
        Preconditions.checkNotNull(function);
        return new TreeTraverser<T>() { // from class: com.google.common.collect.TreeTraverser.4
            @Override // com.google.common.collect.TreeTraverser
            public Iterable<T> children(T t) {
                return (Iterable) function.apply(t);
            }
        };
    }

    @Deprecated
    public final FluentIterable<T> preOrderTraversal(final T t) {
        Preconditions.checkNotNull(t);
        return new FluentIterable<T>() { // from class: com.google.common.collect.TreeTraverser.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Iterable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public UnmodifiableIterator<T> iterator() {
                return TreeTraverser.this.preOrderIterator(t);
            }
        };
    }

    UnmodifiableIterator<T> preOrderIterator(T t) {
        return new e(t);
    }

    final class e extends UnmodifiableIterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Deque<Iterator<T>> f4526b;

        e(T t) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f4526b = arrayDeque;
            arrayDeque.addLast(Iterators.b(Preconditions.checkNotNull(t)));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f4526b.isEmpty();
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
        @Override // java.util.Iterator
        public T next() {
            Iterator<T> last = this.f4526b.getLast();
            T t = (T) Preconditions.checkNotNull(last.next());
            if (!last.hasNext()) {
                this.f4526b.removeLast();
            }
            Iterator<T> it = TreeTraverser.this.children(t).iterator();
            if (it.hasNext()) {
                this.f4526b.addLast(it);
            }
            return t;
        }
    }

    @Deprecated
    public final FluentIterable<T> postOrderTraversal(final T t) {
        Preconditions.checkNotNull(t);
        return new FluentIterable<T>() { // from class: com.google.common.collect.TreeTraverser.5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Iterable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public UnmodifiableIterator<T> iterator() {
                return TreeTraverser.this.postOrderIterator(t);
            }
        };
    }

    UnmodifiableIterator<T> postOrderIterator(T t) {
        return new a(t);
    }

    static final class d<T> {
        final T d;
        final Iterator<T> e;

        d(T t, Iterator<T> it) {
            this.d = (T) Preconditions.checkNotNull(t);
            this.e = (Iterator) Preconditions.checkNotNull(it);
        }
    }

    final class a extends AbstractIterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayDeque<d<T>> f4523a;

        a(T t) {
            ArrayDeque<d<T>> arrayDeque = new ArrayDeque<>();
            this.f4523a = arrayDeque;
            arrayDeque.addLast(c(t));
        }

        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        protected T computeNext() {
            while (!this.f4523a.isEmpty()) {
                d<T> last = this.f4523a.getLast();
                if (last.e.hasNext()) {
                    this.f4523a.addLast(c(last.e.next()));
                } else {
                    this.f4523a.removeLast();
                    return last.d;
                }
            }
            return endOfData();
        }

        private d<T> c(T t) {
            return new d<>(t, TreeTraverser.this.children(t).iterator());
        }
    }

    @Deprecated
    public final FluentIterable<T> breadthFirstTraversal(final T t) {
        Preconditions.checkNotNull(t);
        return new FluentIterable<T>() { // from class: com.google.common.collect.TreeTraverser.2
            @Override // java.lang.Iterable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public UnmodifiableIterator<T> iterator() {
                return new b(t);
            }
        };
    }

    final class b extends UnmodifiableIterator<T> implements PeekingIterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Queue<T> f4525b;

        b(T t) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f4525b = arrayDeque;
            arrayDeque.add(t);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f4525b.isEmpty();
        }

        @Override // com.google.common.collect.PeekingIterator
        public T peek() {
            return this.f4525b.element();
        }

        @Override // java.util.Iterator, com.google.common.collect.PeekingIterator
        public T next() {
            T tRemove = this.f4525b.remove();
            amn.e((Collection) this.f4525b, (Iterable) TreeTraverser.this.children(tRemove));
            return tRemove;
        }
    }
}
