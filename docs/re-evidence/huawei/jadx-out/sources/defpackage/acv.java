package defpackage;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;

/* JADX INFO: loaded from: classes21.dex */
public class acv {
    private static final acv j = new acv(ys.f53793b, Object.class, null, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Class<?> f275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final ys f276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f277c;
    protected final Class<? extends ObjectIdGenerator<?>> d;
    protected final Class<? extends ObjectIdResolver> e;

    public acv(ys ysVar, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, Class<? extends ObjectIdResolver> cls3) {
        this(ysVar, cls, cls2, false, cls3);
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=java.lang.Class<? extends com.fasterxml.jackson.annotation.ObjectIdResolver>, code=java.lang.Class, for r5v0, types: [java.lang.Class<? extends com.fasterxml.jackson.annotation.ObjectIdResolver>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected acv(ys ysVar, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, boolean z, Class cls3) {
        this.f276b = ysVar;
        this.f275a = cls;
        this.d = cls2;
        this.f277c = z;
        this.e = cls3 == null ? wi.class : cls3;
    }

    public static acv d() {
        return j;
    }

    public acv e(boolean z) {
        return this.f277c == z ? this : new acv(this.f276b, this.f275a, this.d, z, this.e);
    }

    public ys c() {
        return this.f276b;
    }

    public Class<?> f() {
        return this.f275a;
    }

    public Class<? extends ObjectIdGenerator<?>> e() {
        return this.d;
    }

    public Class<? extends ObjectIdResolver> a() {
        return this.e;
    }

    public boolean b() {
        return this.f277c;
    }

    public String toString() {
        return "ObjectIdInfo: propName=" + this.f276b + ", scope=" + ahw.u(this.f275a) + ", generatorType=" + ahw.u(this.d) + ", alwaysAsId=" + this.f277c;
    }
}
