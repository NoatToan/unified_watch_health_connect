package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtCompatible
@Deprecated
public abstract class TreeTraverser<T> {

    public static class a extends TreeTraverser<T> {
        public final /* synthetic */ Function a;

        public a(Function function) {
            this.a = function;
        }

        @Override // com.google.common.collect.TreeTraverser
        public Iterable<T> children(T t) {
            return (Iterable) this.a.apply(t);
        }
    }

    public class b extends FluentIterable<T> {
        public final /* synthetic */ Object b;

        public b(Object obj) {
            this.b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public UnmodifiableIterator<T> iterator() {
            return TreeTraverser.this.b(this.b);
        }
    }

    public class c extends FluentIterable<T> {
        public final /* synthetic */ Object b;

        public c(Object obj) {
            this.b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public UnmodifiableIterator<T> iterator() {
            return TreeTraverser.this.a(this.b);
        }
    }

    public class d extends FluentIterable<T> {
        public final /* synthetic */ Object b;

        public d(Object obj) {
            this.b = obj;
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public UnmodifiableIterator<T> iterator() {
            return new e(this.b);
        }
    }

    public final class e extends UnmodifiableIterator<T> implements PeekingIterator<T> {
        private final Queue<T> a;

        public e(T t) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.a = arrayDeque;
            arrayDeque.add(t);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.a.isEmpty();
        }

        @Override // java.util.Iterator, com.google.common.collect.PeekingIterator
        public T next() {
            T tRemove = this.a.remove();
            Iterables.addAll(this.a, TreeTraverser.this.children(tRemove));
            return tRemove;
        }

        @Override // com.google.common.collect.PeekingIterator
        public T peek() {
            return this.a.element();
        }
    }

    public final class f extends AbstractIterator<T> {
        private final ArrayDeque<g<T>> c;

        public f(T t) {
            ArrayDeque<g<T>> arrayDeque = new ArrayDeque<>();
            this.c = arrayDeque;
            arrayDeque.addLast(b(t));
        }

        private g<T> b(T t) {
            return new g<>(t, TreeTraverser.this.children(t).iterator());
        }

        @Override // com.google.common.collect.AbstractIterator
        public T computeNext() {
            while (!this.c.isEmpty()) {
                g<T> last = this.c.getLast();
                if (!last.b.hasNext()) {
                    this.c.removeLast();
                    return last.a;
                }
                this.c.addLast(b(last.b.next()));
            }
            return endOfData();
        }
    }

    public static final class g<T> {
        public final T a;
        public final Iterator<T> b;

        public g(T t, Iterator<T> it2) {
            this.a = (T) Preconditions.checkNotNull(t);
            this.b = (Iterator) Preconditions.checkNotNull(it2);
        }
    }

    public final class h extends UnmodifiableIterator<T> {
        private final Deque<Iterator<T>> a;

        public h(T t) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.a = arrayDeque;
            arrayDeque.addLast(Iterators.singletonIterator(Preconditions.checkNotNull(t)));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.a.isEmpty();
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
            Iterator<T> last = this.a.getLast();
            T t = (T) Preconditions.checkNotNull(last.next());
            if (!last.hasNext()) {
                this.a.removeLast();
            }
            Iterator<T> it2 = TreeTraverser.this.children(t).iterator();
            if (it2.hasNext()) {
                this.a.addLast(it2);
            }
            return t;
        }
    }

    @Deprecated
    public static <T> TreeTraverser<T> using(Function<T, ? extends Iterable<T>> function) {
        Preconditions.checkNotNull(function);
        return new a(function);
    }

    public UnmodifiableIterator<T> a(T t) {
        return new f(t);
    }

    public UnmodifiableIterator<T> b(T t) {
        return new h(t);
    }

    @Deprecated
    public final FluentIterable<T> breadthFirstTraversal(T t) {
        Preconditions.checkNotNull(t);
        return new d(t);
    }

    public abstract Iterable<T> children(T t);

    @Deprecated
    public final FluentIterable<T> postOrderTraversal(T t) {
        Preconditions.checkNotNull(t);
        return new c(t);
    }

    @Deprecated
    public final FluentIterable<T> preOrderTraversal(T t) {
        Preconditions.checkNotNull(t);
        return new b(t);
    }
}
