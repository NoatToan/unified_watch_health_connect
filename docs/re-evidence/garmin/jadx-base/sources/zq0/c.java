package zq0;

import i63.h;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import zd0.r0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzq0/c;", "Lzq0/e;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class c extends e {
    public static final c INSTANCE = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Object f206637a = m.a(n.PUBLICATION, new r0(27));

    private c() {
        super(null);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c);
    }

    public final int hashCode() {
        return 942691561;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final i63.c<c> serializer() {
        return (i63.c) f206637a.getValue();
    }

    public final String toString() {
        return "HomeRoute";
    }
}
