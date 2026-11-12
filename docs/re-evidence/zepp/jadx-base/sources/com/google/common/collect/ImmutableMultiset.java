package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
public abstract class ImmutableMultiset<E> extends j1<E> implements Multiset<E> {

    @LazyInit
    private transient ImmutableList<E> b;

    @LazyInit
    private transient ImmutableSet<Multiset.Entry<E>> c;

    public static class Builder<E> extends ImmutableCollection.Builder<E> {
        public u1<E> b;
        public boolean c;
        public boolean d;

        public Builder() {
            this(4);
        }

        @NullableDecl
        public static <T> u1<T> b(Iterable<T> iterable) {
            if (iterable instanceof d2) {
                return ((d2) iterable).d;
            }
            if (iterable instanceof e) {
                return ((e) iterable).c;
            }
            return null;
        }

        @CanIgnoreReturnValue
        public Builder<E> addCopies(E e, int i) {
            if (i == 0) {
                return this;
            }
            if (this.c) {
                this.b = new u1<>(this.b);
                this.d = false;
            }
            this.c = false;
            Preconditions.checkNotNull(e);
            u1<E> u1Var = this.b;
            u1Var.v(e, i + u1Var.g(e));
            return this;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @CanIgnoreReturnValue
        public Builder<E> setCount(E e, int i) {
            if (i == 0 && !this.d) {
                this.b = new v1(this.b);
                this.d = true;
            } else if (this.c) {
                this.b = new u1<>(this.b);
                this.d = false;
            }
            this.c = false;
            Preconditions.checkNotNull(e);
            if (i == 0) {
                this.b.w(e);
            } else {
                this.b.v((E) Preconditions.checkNotNull(e), i);
            }
            return this;
        }

        public Builder(int i) {
            this.c = false;
            this.d = false;
            this.b = u1.d(i);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableMultiset<E> build() {
            if (this.b.D() == 0) {
                return ImmutableMultiset.of();
            }
            if (this.d) {
                this.b = new u1<>(this.b);
                this.d = false;
            }
            this.c = true;
            return new d2(this.b);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e) {
            return addCopies(e, 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            if (iterable instanceof Multiset) {
                Multiset multisetD = Multisets.d(iterable);
                u1 u1VarB = b(multisetD);
                if (u1VarB != null) {
                    u1<E> u1Var = this.b;
                    u1Var.e(Math.max(u1Var.D(), u1VarB.D()));
                    for (int iF = u1VarB.f(); iF >= 0; iF = u1VarB.t(iF)) {
                        addCopies(u1VarB.j(iF), u1VarB.l(iF));
                    }
                } else {
                    Set<Multiset.Entry<E>> setEntrySet = multisetD.entrySet();
                    u1<E> u1Var2 = this.b;
                    u1Var2.e(Math.max(u1Var2.D(), setEntrySet.size()));
                    for (Multiset.Entry<E> entry : multisetD.entrySet()) {
                        addCopies(entry.getElement(), entry.getCount());
                    }
                }
            } else {
                super.addAll((Iterable) iterable);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }

        public Builder(boolean z) {
            this.c = false;
            this.d = false;
            this.b = null;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it2) {
            super.addAll((Iterator) it2);
            return this;
        }
    }

    public class a extends UnmodifiableIterator<E> {
        public int a;

        @MonotonicNonNullDecl
        public E b;
        public final /* synthetic */ Iterator c;

        public a(Iterator it2) {
            this.c = it2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a > 0 || this.c.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.a <= 0) {
                Multiset.Entry entry = (Multiset.Entry) this.c.next();
                this.b = (E) entry.getElement();
                this.a = entry.getCount();
            }
            this.a--;
            return this.b;
        }
    }

    public final class b extends n1<Multiset.Entry<E>> {
        private static final long serialVersionUID = 0;

        private b() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return entry.getCount() > 0 && ImmutableMultiset.this.count(entry.getElement()) == entry.getCount();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean f() {
            return ImmutableMultiset.this.f();
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // com.google.common.collect.n1
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Multiset.Entry<E> get(int i) {
            return ImmutableMultiset.this.j(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ImmutableMultiset.this.elementSet().size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @GwtIncompatible
        public Object writeReplace() {
            return new c(ImmutableMultiset.this);
        }

        public /* synthetic */ b(ImmutableMultiset immutableMultiset, a aVar) {
            this();
        }
    }

    @GwtIncompatible
    public static class c<E> implements Serializable {
        public final ImmutableMultiset<E> a;

        public c(ImmutableMultiset<E> immutableMultiset) {
            this.a = immutableMultiset;
        }

        public Object readResolve() {
            return this.a.entrySet();
        }
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
        return g(eArr);
    }

    private static <E> ImmutableMultiset<E> g(E... eArr) {
        return new Builder().add((Object[]) eArr).build();
    }

    public static <E> ImmutableMultiset<E> h(Collection<? extends Multiset.Entry<? extends E>> collection) {
        Builder builder = new Builder(collection.size());
        for (Multiset.Entry<? extends E> entry : collection) {
            builder.addCopies(entry.getElement(), entry.getCount());
        }
        return builder.build();
    }

    private ImmutableSet<Multiset.Entry<E>> i() {
        return isEmpty() ? ImmutableSet.of() : new b(this, null);
    }

    public static <E> ImmutableMultiset<E> of() {
        return d2.g;
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public int a(Object[] objArr, int i) {
        UnmodifiableIterator<Multiset.Entry<E>> it2 = entrySet().iterator();
        while (it2.hasNext()) {
            Multiset.Entry<E> next = it2.next();
            Arrays.fill(objArr, i, next.getCount() + i, next.getElement());
            i += next.getCount();
        }
        return i;
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @Deprecated
    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.b;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListAsList = super.asList();
        this.b = immutableListAsList;
        return immutableListAsList;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@NullableDecl Object obj) {
        return count(obj) > 0;
    }

    @Override // com.google.common.collect.Multiset
    public abstract ImmutableSet<E> elementSet();

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(@NullableDecl Object obj) {
        return Multisets.f(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
        return Sets.b(entrySet());
    }

    public abstract Multiset.Entry<E> j(int i);

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @Deprecated
    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @Deprecated
    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    abstract Object writeReplace();

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.f()) {
                return immutableMultiset;
            }
        }
        Builder builder = new Builder(Multisets.g(iterable));
        builder.addAll((Iterable) iterable);
        return builder.build();
    }

    public static <E> ImmutableMultiset<E> of(E e) {
        return g(e);
    }

    @Override // com.google.common.collect.Multiset
    public ImmutableSet<Multiset.Entry<E>> entrySet() {
        ImmutableSet<Multiset.Entry<E>> immutableSet = this.c;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Multiset.Entry<E>> immutableSetI = i();
        this.c = immutableSetI;
        return immutableSetI;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public UnmodifiableIterator<E> iterator() {
        return new a(entrySet().iterator());
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2) {
        return g(e, e2);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3) {
        return g(e, e2, e3);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4) {
        return g(e, e2, e3, e4);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4, E e5) {
        return g(e, e2, e3, e4, e5);
    }

    public static <E> ImmutableMultiset<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new Builder().add((Object) e).add((Object) e2).add((Object) e3).add((Object) e4).add((Object) e5).add((Object) e6).add((Object[]) eArr).build();
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it2) {
        return new Builder().addAll((Iterator) it2).build();
    }
}
