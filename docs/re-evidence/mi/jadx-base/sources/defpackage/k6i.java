package defpackage;

import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public final class k6i {

    public static class b<A, B> implements h6i<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h6i<B> f23518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dua<A, ? extends B> f23519b;

        @Override // defpackage.h6i
        public boolean apply(A a2) {
            return this.f23518a.apply(this.f23519b.apply(a2));
        }

        @Override // defpackage.h6i
        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f23519b.equals(bVar.f23519b) && this.f23518a.equals(bVar.f23518a);
        }

        public int hashCode() {
            return this.f23519b.hashCode() ^ this.f23518a.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f23518a);
            String strValueOf2 = String.valueOf(this.f23519b);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 2 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append("(");
            sb.append(strValueOf2);
            sb.append(")");
            return sb.toString();
        }

        public b(h6i<B> h6iVar, dua<A, ? extends B> duaVar) {
            this.f23518a = (h6i) c6i.o(h6iVar);
            this.f23519b = (dua) c6i.o(duaVar);
        }
    }

    public static class c<T> implements h6i<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Collection<?> f23520a;

        @Override // defpackage.h6i
        public boolean apply(T t) {
            try {
                return this.f23520a.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // defpackage.h6i
        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.f23520a.equals(((c) obj).f23520a);
            }
            return false;
        }

        public int hashCode() {
            return this.f23520a.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f23520a);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 15);
            sb.append("Predicates.in(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }

        public c(Collection<?> collection) {
            this.f23520a = (Collection) c6i.o(collection);
        }
    }

    public static class d implements h6i<Object>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f23521a;

        public <T> h6i<T> a() {
            return this;
        }

        @Override // defpackage.h6i
        public boolean apply(Object obj) {
            return this.f23521a.equals(obj);
        }

        @Override // defpackage.h6i
        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f23521a.equals(((d) obj).f23521a);
            }
            return false;
        }

        public int hashCode() {
            return this.f23521a.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f23521a);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
            sb.append("Predicates.equalTo(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }

        public d(Object obj) {
            this.f23521a = obj;
        }
    }

    public static class e<T> implements h6i<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h6i<T> f23522a;

        public e(h6i<T> h6iVar) {
            this.f23522a = (h6i) c6i.o(h6iVar);
        }

        @Override // defpackage.h6i
        public boolean apply(T t) {
            return !this.f23522a.apply(t);
        }

        @Override // defpackage.h6i
        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return this.f23522a.equals(((e) obj).f23522a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f23522a.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f23522a);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
            sb.append("Predicates.not(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class f implements h6i<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f23523a = new a("ALWAYS_TRUE", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f23524b = new b("ALWAYS_FALSE", 1);
        public static final f c = new c("IS_NULL", 2);
        public static final f d = new d("NOT_NULL", 3);
        public static final /* synthetic */ f[] e = a();

        public final enum a extends f {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // defpackage.h6i
            public boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        public final enum b extends f {
            public b(String str, int i) {
                super(str, i);
            }

            @Override // defpackage.h6i
            public boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        public final enum c extends f {
            public c(String str, int i) {
                super(str, i);
            }

            @Override // defpackage.h6i
            public boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        }

        public final enum d extends f {
            public d(String str, int i) {
                super(str, i);
            }

            @Override // defpackage.h6i
            public boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        }

        public f(String str, int i) {
            super(str, i);
        }

        public static /* synthetic */ f[] a() {
            return new f[]{f23523a, f23524b, c, d};
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) e.clone();
        }

        public <T> h6i<T> b() {
            return this;
        }
    }

    public static <T> h6i<T> a() {
        return f.f23523a.b();
    }

    public static <A, B> h6i<A> b(h6i<B> h6iVar, dua<A, ? extends B> duaVar) {
        return new b(h6iVar, duaVar);
    }

    public static <T> h6i<T> c(T t) {
        return t == null ? e() : new d(t).a();
    }

    public static <T> h6i<T> d(Collection<? extends T> collection) {
        return new c(collection);
    }

    public static <T> h6i<T> e() {
        return f.c.b();
    }

    public static <T> h6i<T> f(h6i<T> h6iVar) {
        return new e(h6iVar);
    }
}
