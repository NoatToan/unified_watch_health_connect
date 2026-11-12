package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.d f7224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e.g f7225c;

    public /* synthetic */ f(q0.d dVar, e.g gVar, int i14) {
        this.f7223a = i14;
        this.f7224b = dVar;
        this.f7225c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7223a) {
            case 0:
                boolean zR = v.R(2);
                q0.d dVar = this.f7224b;
                if (zR) {
                    dVar.toString();
                }
                dVar.c(this.f7225c);
                break;
            default:
                boolean zR2 = v.R(2);
                q0.d dVar2 = this.f7224b;
                if (zR2) {
                    dVar2.toString();
                }
                dVar2.c(this.f7225c);
                break;
        }
    }
}
