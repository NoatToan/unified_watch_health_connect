package mn2;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class r implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f119834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f119835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f119836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f119837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f119838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f119839f;

    public /* synthetic */ r(o oVar, long j8, int i14, int i15, int i16, String str) {
        this.f119834a = oVar;
        this.f119835b = j8;
        this.f119836c = i14;
        this.f119837d = i15;
        this.f119838e = i16;
        this.f119839f = str;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        sd2.f fVar = (sd2.f) obj;
        fVar.getClass();
        final HashMap mapB = t.b(fVar);
        final o oVar = this.f119834a;
        final long j8 = this.f119835b;
        final int i14 = this.f119836c;
        final int i15 = this.f119837d;
        final int i16 = this.f119838e;
        final String str = this.f119839f;
        Callable callable = new Callable() { // from class: mn2.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return oVar.a(mapB, j8, i14, true, i15, i16, str).execute();
            }
        };
        int i17 = w03.b.f181178a;
        return new e13.m(callable);
    }
}
