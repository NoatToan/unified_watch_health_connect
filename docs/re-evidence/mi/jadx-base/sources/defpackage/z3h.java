package defpackage;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.a;
import com.fasterxml.jackson.databind.PropertyName;

/* JADX INFO: loaded from: classes4.dex */
public class z3h {
    public static final z3h f = new z3h(PropertyName.NO_NAME, Object.class, null, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PropertyName f40837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<? extends ObjectIdGenerator<?>> f40838b;
    public final Class<? extends a> c;
    public final Class<?> d;
    public final boolean e;

    public z3h(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, Class<? extends a> cls3) {
        this(propertyName, cls, cls2, false, cls3);
    }

    public static z3h a() {
        return f;
    }

    public boolean b() {
        return this.e;
    }

    public Class<? extends ObjectIdGenerator<?>> c() {
        return this.f40838b;
    }

    public PropertyName d() {
        return this.f40837a;
    }

    public Class<? extends a> e() {
        return this.c;
    }

    public Class<?> f() {
        return this.d;
    }

    public z3h g(boolean z) {
        return this.e == z ? this : new z3h(this.f40837a, this.d, this.f40838b, z, this.c);
    }

    public String toString() {
        return "ObjectIdInfo: propName=" + this.f40837a + ", scope=" + h04.T(this.d) + ", generatorType=" + h04.T(this.f40838b) + ", alwaysAsId=" + this.e;
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=java.lang.Class<? extends com.fasterxml.jackson.annotation.a>, code=java.lang.Class, for r5v0, types: [java.lang.Class<? extends com.fasterxml.jackson.annotation.a>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z3h(com.fasterxml.jackson.databind.PropertyName r1, java.lang.Class<?> r2, java.lang.Class<? extends com.fasterxml.jackson.annotation.ObjectIdGenerator<?>> r3, boolean r4, java.lang.Class r5) {
        /*
            r0 = this;
            r0.<init>()
            r0.f40837a = r1
            r0.d = r2
            r0.f40838b = r3
            r0.e = r4
            if (r5 != 0) goto Lf
            java.lang.Class<com.fasterxml.jackson.annotation.b> r5 = com.fasterxml.jackson.annotation.b.class
        Lf:
            r0.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3h.<init>(com.fasterxml.jackson.databind.PropertyName, java.lang.Class, java.lang.Class, boolean, java.lang.Class):void");
    }
}
