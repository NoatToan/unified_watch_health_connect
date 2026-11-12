package h0;

/* JADX INFO: loaded from: classes.dex */
public class k0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f80521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0.a f80522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.concurrent.futures.b.d f80523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.concurrent.futures.b.d f80524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.concurrent.futures.b.a<Void> f80525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.concurrent.futures.b.a<Void> f80526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f80527g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f80528h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l0.b f80529i;

    public k0(v0 v0Var, v0.a aVar) {
        this.f80521a = v0Var;
        this.f80522b = aVar;
        androidx.concurrent.futures.b.a<Void> aVar2 = new androidx.concurrent.futures.b.a<>();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar2);
        aVar2.f6080b = dVar;
        try {
            this.f80525e = aVar2;
            aVar2.f6079a = "CaptureCompleteFuture";
        } catch (Exception e4) {
            dVar.a(e4);
        }
        this.f80523c = dVar;
        androidx.concurrent.futures.b.a<Void> aVar3 = new androidx.concurrent.futures.b.a<>();
        androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar3);
        aVar3.f6080b = dVar2;
        try {
            this.f80526f = aVar3;
            aVar3.f6079a = "RequestCompleteFuture";
        } catch (Exception e14) {
            dVar2.a(e14);
        }
        this.f80524d = dVar2;
    }

    public final void a() {
        v0 v0Var = this.f80521a;
        if (!v0Var.m() || v0Var.l()) {
            if (!v0Var.m()) {
                k7.h.f(!this.f80524d.f6084b.isDone(), "The callback can only complete once.");
            }
            this.f80526f.b(null);
        }
    }

    public final void b() {
        j0.u.a();
        if (this.f80527g || this.f80528h) {
            return;
        }
        this.f80528h = true;
        b0.l0.f fVarD = this.f80521a.d();
        if (fVarD != null) {
            fVarD.a();
        }
    }
}
