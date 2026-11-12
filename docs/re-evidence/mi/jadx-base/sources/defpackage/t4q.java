package defpackage;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes4.dex */
public class t4q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f34313b;
    public JavaType c;
    public boolean d;

    public t4q() {
    }

    public t4q(Class<?> cls, boolean z) {
        this.f34313b = cls;
        this.c = null;
        this.d = z;
        this.f34312a = z ? e(cls) : g(cls);
    }

    public static final int d(JavaType javaType) {
        return javaType.hashCode() - 2;
    }

    public static final int e(Class<?> cls) {
        return cls.getName().hashCode() + 1;
    }

    public static final int f(JavaType javaType) {
        return javaType.hashCode() - 1;
    }

    public static final int g(Class<?> cls) {
        return cls.getName().hashCode();
    }

    public Class<?> a() {
        return this.f34313b;
    }

    public JavaType b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
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
        t4q t4qVar = (t4q) obj;
        if (t4qVar.d != this.d) {
            return false;
        }
        Class<?> cls = this.f34313b;
        if (cls != null) {
            return t4qVar.f34313b == cls;
        }
        return this.c.equals(t4qVar.c);
    }

    public final int hashCode() {
        return this.f34312a;
    }

    public final String toString() {
        if (this.f34313b != null) {
            return "{class: " + this.f34313b.getName() + ", typed? " + this.d + "}";
        }
        return "{type: " + this.c + ", typed? " + this.d + "}";
    }

    public t4q(JavaType javaType, boolean z) {
        this.c = javaType;
        this.f34313b = null;
        this.d = z;
        this.f34312a = z ? d(javaType) : f(javaType);
    }
}
