package x21;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f188499b;

    public /* synthetic */ e(g gVar, int i14) {
        this.f188498a = i14;
        this.f188499b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f188498a) {
            case 0:
                g gVar = this.f188499b;
                if (gVar.f188513k) {
                    gVar.g();
                }
                break;
            case 1:
                g gVar2 = this.f188499b;
                if (gVar2.f188513k) {
                    gVar2.f();
                }
                break;
            default:
                g gVar3 = this.f188499b;
                int[] iArr = g.f188502t;
                gVar3.i();
                break;
        }
    }
}
