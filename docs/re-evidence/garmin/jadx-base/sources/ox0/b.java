package ox0;

import i63.h;
import o13.m;
import o13.n;
import oe0.e;
import p005kotlin.Metadata;
import sc.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lox0/b;", "", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class b implements j {
    public static final b INSTANCE = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Object f134329a = m.a(n.PUBLICATION, new e(19));

    private b() {
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b);
    }

    public final int hashCode() {
        return 1100806044;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final i63.c<b> serializer() {
        return (i63.c) f134329a.getValue();
    }

    public final String toString() {
        return "Init";
    }
}
