package vv0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvv0/e0;", "", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class e0 {
    public static final e0 INSTANCE = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Object f180441a = o13.m.a(o13.n.PUBLICATION, new u(5));

    private e0() {
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e0);
    }

    public final int hashCode() {
        return -1130026484;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final i63.c<e0> serializer() {
        return (i63.c) f180441a.getValue();
    }

    public final String toString() {
        return "AutoLogBehaviors";
    }
}
