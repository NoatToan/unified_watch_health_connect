package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes14.dex */
@Beta
@GwtCompatible
@Deprecated
@ElementTypesAreNonnullByDefault
public abstract class TreeTraverser<T> {

    public final class BreadthFirstIterator extends UnmodifiableIterator<T> implements PeekingIterator<T> {
        private final Queue<T> queue;

        public BreadthFirstIterator(T t7) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.queue = arrayDeque;
            arrayDeque.add(t7);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.queue.isEmpty();
        }

        @Override // java.util.Iterator, com.google.common.collect.PeekingIterator
        public T next() {
            T tRemove = this.queue.remove();
            Iterables.addAll(this.queue, TreeTraverser.this.children(tRemove));
            return tRemove;
        }

        @Override // com.google.common.collect.PeekingIterator
        public T peek() {
            return this.queue.element();
        }
    }

    public final class PostOrderIterator extends AbstractIterator<T> {
        private final ArrayDeque<PostOrderNode<T>> stack;

        public PostOrderIterator(T t7) {
            ArrayDeque<PostOrderNode<T>> arrayDeque = new ArrayDeque<>();
            this.stack = arrayDeque;
            arrayDeque.addLast(expand(t7));
        }

        private PostOrderNode<T> expand(T t7) {
            return new PostOrderNode<>(t7, TreeTraverser.this.children(t7).iterator());
        }

        @Override // com.google.common.collect.AbstractIterator
        public T computeNext() {
            while (!this.stack.isEmpty()) {
                PostOrderNode<T> last = this.stack.getLast();
                if (!last.childIterator.hasNext()) {
                    this.stack.removeLast();
                    return last.root;
                }
                this.stack.addLast(expand(last.childIterator.next()));
            }
            return endOfData();
        }
    }

    public static final class PostOrderNode<T> {
        final Iterator<T> childIterator;
        final T root;

        public PostOrderNode(T t7, Iterator<T> it) {
            this.root = (T) Preconditions.checkNotNull(t7);
            this.childIterator = (Iterator) Preconditions.checkNotNull(it);
        }
    }

    public final class PreOrderIterator extends UnmodifiableIterator<T> {
        private final Deque<Iterator<T>> stack;

        public PreOrderIterator(T t7) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.stack = arrayDeque;
            arrayDeque.addLast(Iterators.singletonIterator(Preconditions.checkNotNull(t7)));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.stack.isEmpty();
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
            Iterator<T> last = this.stack.getLast();
            T t7 = (T) Preconditions.checkNotNull(last.next());
            if (!last.hasNext()) {
                this.stack.removeLast();
            }
            Iterator<T> it = TreeTraverser.this.children(t7).iterator();
            if (it.hasNext()) {
                this.stack.addLast(it);
            }
            return t7;
        }
    }

    @Deprecated
    public static <T> TreeTraverser<T> using(final Function<T, ? extends Iterable<T>> function) {
        Preconditions.checkNotNull(function);
        return new TreeTraverser<T>() { // from class: com.google.common.collect.TreeTraverser.1
            @Override // com.google.common.collect.TreeTraverser
            public Iterable<T> children(T t7) {
                return (Iterable) function.apply(t7);
            }
        };
    }

    @Deprecated
    public final FluentIterable<T> breadthFirstTraversal(final T t7) {
        Preconditions.checkNotNull(t7);
        return new FluentIterable<T>(this) { // from class: com.google.common.collect.TreeTraverser.4
            final /* synthetic */ TreeTraverser this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Iterable
            public UnmodifiableIterator<T> iterator() {
                return new BreadthFirstIterator(t7);
            }
        };
    }

    public abstract Iterable<T> children(T t7);

    public UnmodifiableIterator<T> postOrderIterator(T t7) {
        return new PostOrderIterator(t7);
    }

    @Deprecated
    public final FluentIterable<T> postOrderTraversal(final T t7) {
        Preconditions.checkNotNull(t7);
        return new FluentIterable<T>(this) { // from class: com.google.common.collect.TreeTraverser.3
            final /* synthetic */ TreeTraverser this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Iterable
            public UnmodifiableIterator<T> iterator() {
                return this.this$0.postOrderIterator(t7);
            }
        };
    }

    public UnmodifiableIterator<T> preOrderIterator(T t7) {
        return new PreOrderIterator(t7);
    }

    @Deprecated
    public final FluentIterable<T> preOrderTraversal(final T t7) {
        Preconditions.checkNotNull(t7);
        return new FluentIterable<T>(this) { // from class: com.google.common.collect.TreeTraverser.2
            final /* synthetic */ TreeTraverser this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Iterable
            public UnmodifiableIterator<T> iterator() {
                return this.this$0.preOrderIterator(t7);
            }
        };
    }
}
