package l4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll4/p;", "Ll4/a;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f109853a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f109854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g6.o f109855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g6.d f109856d;

    static {
        n4.g.f123559b.getClass();
        f109854b = n4.g.f123560c;
        f109855c = g6.o.Ltr;
        f109856d = new g6.d(1.0f, 1.0f);
    }

    private p() {
    }

    @Override // l4.a
    public final long b() {
        return f109854b;
    }

    @Override // l4.a
    public final g6.c getDensity() {
        return f109856d;
    }

    @Override // l4.a
    public final g6.o getLayoutDirection() {
        return f109855c;
    }
}
