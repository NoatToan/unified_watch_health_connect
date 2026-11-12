package defpackage;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes21.dex */
public class aig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected JavaType f455b;
    protected Class<?> d;
    protected int e;

    public aig() {
    }

    public aig(Class<?> cls, boolean z) {
        this.d = cls;
        this.f455b = null;
        this.f454a = z;
        this.e = z ? a(cls) : d(cls);
    }

    public aig(JavaType javaType, boolean z) {
        this.f455b = javaType;
        this.d = null;
        this.f454a = z;
        this.e = z ? c(javaType) : d(javaType);
    }

    public static final int d(Class<?> cls) {
        return cls.getName().hashCode();
    }

    public static final int a(Class<?> cls) {
        return cls.getName().hashCode() + 1;
    }

    public static final int d(JavaType javaType) {
        return javaType.hashCode() - 1;
    }

    public static final int c(JavaType javaType) {
        return javaType.hashCode() - 2;
    }

    public boolean e() {
        return this.f454a;
    }

    public Class<?> a() {
        return this.d;
    }

    public JavaType d() {
        return this.f455b;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        if (this.d != null) {
            return "{class: " + this.d.getName() + ", typed? " + this.f454a + "}";
        }
        return "{type: " + this.f455b + ", typed? " + this.f454a + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        aig aigVar = (aig) obj;
        if (aigVar.f454a != this.f454a) {
            return false;
        }
        Class<?> cls = this.d;
        if (cls != null) {
            return aigVar.d == cls;
        }
        return this.f455b.equals(aigVar.f455b);
    }
}
