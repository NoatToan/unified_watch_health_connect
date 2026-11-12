package b0;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List<Integer> f14007h = Arrays.asList(1, 2, 3, 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f14011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1 f14012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f14013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k7.b<Throwable> f14014g;

    public l(int i14, Executor executor, o0 o0Var, k7.b<Throwable> bVar) {
        k7.h.b(i14 == 4, "Currently ImageProcessor can only target IMAGE_CAPTURE.");
        this.f14008a = i14;
        this.f14010c = 0;
        this.f14009b = 0;
        this.f14011d = executor;
        this.f14012e = null;
        this.f14013f = o0Var;
        this.f14014g = bVar;
    }

    public l(int i14, int i15, Executor executor, d1 d1Var, k7.b<Throwable> bVar) {
        this(i14, 0, i15, executor, d1Var, bVar);
    }

    public l(int i14, int i15, int i16, Executor executor, d1 d1Var, k7.b<Throwable> bVar) {
        r0.t.a(i14, f14007h);
        this.f14008a = i14;
        this.f14009b = i15;
        this.f14010c = i16;
        this.f14011d = executor;
        this.f14012e = d1Var;
        this.f14013f = null;
        this.f14014g = bVar;
    }

    public l(int i14, Executor executor, d1 d1Var, k7.b<Throwable> bVar) {
        this(i14, 0, 0, executor, d1Var, bVar);
    }
}
