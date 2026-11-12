package com.google.common.base;

import defpackage.c6i;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Equivalence<T> {

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;
        private final T reference;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.d(this.reference, wrapper.reference);
            }
            return false;
        }

        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.e(this.reference);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.equivalence);
            String strValueOf2 = String.valueOf(this.reference);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 7 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append(".wrap(");
            sb.append(strValueOf2);
            sb.append(")");
            return sb.toString();
        }

        private Wrapper(Equivalence<? super T> equivalence, T t) {
            this.equivalence = (Equivalence) c6i.o(equivalence);
            this.reference = t;
        }
    }

    public static final class b extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f8986a = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f8986a;
        }

        @Override // com.google.common.base.Equivalence
        public boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        public int b(Object obj) {
            return obj.hashCode();
        }
    }

    public static final class c extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f8987a = new c();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f8987a;
        }

        @Override // com.google.common.base.Equivalence
        public boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.Equivalence
        public int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static Equivalence<Object> c() {
        return b.f8986a;
    }

    public static Equivalence<Object> f() {
        return c.f8987a;
    }

    public abstract boolean a(T t, T t2);

    public abstract int b(T t);

    public final boolean d(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return a(t, t2);
    }

    public final int e(T t) {
        if (t == null) {
            return 0;
        }
        return b(t);
    }
}
