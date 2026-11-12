package com.google.firebase.components;

import com.huami.watch.companion.event.WatchFaceArrivingEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class Dependency {
    private final Class<?> a;
    private final int b;
    private final int c;

    private Dependency(Class<?> cls, int i, int i2) {
        this.a = (Class) Preconditions.checkNotNull(cls, "Null dependency anInterface.");
        this.b = i;
        this.c = i2;
    }

    private static String a(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    public static Dependency deferred(Class<?> cls) {
        return new Dependency(cls, 0, 2);
    }

    @Deprecated
    public static Dependency optional(Class<?> cls) {
        return new Dependency(cls, 0, 0);
    }

    public static Dependency optionalProvider(Class<?> cls) {
        return new Dependency(cls, 0, 1);
    }

    public static Dependency required(Class<?> cls) {
        return new Dependency(cls, 1, 0);
    }

    public static Dependency requiredProvider(Class<?> cls) {
        return new Dependency(cls, 1, 1);
    }

    public static Dependency setOf(Class<?> cls) {
        return new Dependency(cls, 2, 0);
    }

    public static Dependency setOfProvider(Class<?> cls) {
        return new Dependency(cls, 2, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Dependency)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        return this.a == dependency.a && this.b == dependency.b && this.c == dependency.c;
    }

    public Class<?> getInterface() {
        return this.a;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public boolean isDeferred() {
        return this.c == 2;
    }

    public boolean isDirectInjection() {
        return this.c == 0;
    }

    public boolean isRequired() {
        return this.b == 1;
    }

    public boolean isSet() {
        return this.b == 2;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : WatchFaceArrivingEvent.CMD_SET;
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(a(this.c));
        sb.append(com.alipay.sdk.m.u.i.d);
        return sb.toString();
    }
}
