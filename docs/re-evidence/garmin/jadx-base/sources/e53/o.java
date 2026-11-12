package e53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le53/o;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f63125a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f63126b = System.nanoTime();

    private o() {
    }

    public static long b() {
        return System.nanoTime() - f63126b;
    }

    @Override // e53.p
    public final p.a.C1330a a() {
        return p.a.C1330a.a(b());
    }

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
