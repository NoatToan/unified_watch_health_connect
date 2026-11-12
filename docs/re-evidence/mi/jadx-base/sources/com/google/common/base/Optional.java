package com.google.common.base;

import defpackage.a10;
import defpackage.c6i;
import defpackage.dua;
import defpackage.m7i;
import defpackage.spo;
import defpackage.yz;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public class a implements Iterable<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f8988a;

        /* JADX INFO: renamed from: com.google.common.base.Optional$a$a, reason: collision with other inner class name */
        public class C0227a extends a10<T> {
            public final Iterator<? extends Optional<? extends T>> c;

            public C0227a() {
                this.c = (Iterator) c6i.o(a.this.f8988a.iterator());
            }

            @Override // defpackage.a10
            public T a() {
                while (this.c.hasNext()) {
                    Optional<? extends T> next = this.c.next();
                    if (next.isPresent()) {
                        return next.get();
                    }
                }
                return b();
            }
        }

        public a(Iterable iterable) {
            this.f8988a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new C0227a();
        }
    }

    public static <T> Optional<T> absent() {
        return yz.a();
    }

    public static <T> Optional<T> fromNullable(T t) {
        return t == null ? absent() : new m7i(t);
    }

    public static <T> Optional<T> of(T t) {
        return new m7i(c6i.o(t));
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends Optional<? extends T>> iterable) {
        c6i.o(iterable);
        return new a(iterable);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> optional);

    public abstract T or(T t);

    public abstract T or(spo<? extends T> spoVar);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(dua<? super T, V> duaVar);
}
