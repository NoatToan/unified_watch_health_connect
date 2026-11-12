package com.fasterxml.jackson.databind.cfg;

import defpackage.ahw;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public final class ConstructorDetector implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f4103c;
    protected final SingleArgConstructor h;
    protected final boolean i;
    public static final ConstructorDetector e = new ConstructorDetector(SingleArgConstructor.HEURISTIC);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConstructorDetector f4102b = new ConstructorDetector(SingleArgConstructor.PROPERTIES);
    public static final ConstructorDetector d = new ConstructorDetector(SingleArgConstructor.DELEGATING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConstructorDetector f4101a = new ConstructorDetector(SingleArgConstructor.REQUIRE_MODE);

    public enum SingleArgConstructor {
        DELEGATING,
        PROPERTIES,
        HEURISTIC,
        REQUIRE_MODE
    }

    protected ConstructorDetector(SingleArgConstructor singleArgConstructor, boolean z, boolean z2) {
        this.h = singleArgConstructor;
        this.i = z;
        this.f4103c = z2;
    }

    protected ConstructorDetector(SingleArgConstructor singleArgConstructor) {
        this(singleArgConstructor, false, false);
    }

    public SingleArgConstructor d() {
        return this.h;
    }

    public boolean b() {
        return this.i;
    }

    public boolean e() {
        return this.h == SingleArgConstructor.DELEGATING;
    }

    public boolean a() {
        return this.h == SingleArgConstructor.PROPERTIES;
    }

    public boolean a(Class<?> cls) {
        if (this.i) {
            return false;
        }
        return this.f4103c || !ahw.n(cls) || Throwable.class.isAssignableFrom(cls);
    }
}
