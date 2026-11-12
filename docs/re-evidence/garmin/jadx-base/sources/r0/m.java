package r0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o.a f148740b;

    public /* synthetic */ m(o.a aVar, int i14) {
        this.f148739a = i14;
        this.f148740b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f148739a) {
            case 0:
                this.f148740b.a();
                break;
            case 1:
                this.f148740b.b();
                break;
            default:
                o.a aVar = this.f148740b;
                p pVar = aVar.f148761q;
                if (pVar != null) {
                    pVar.c();
                }
                if (aVar.f148760p == null) {
                    aVar.f148759o.c();
                }
                aVar.f148760p = null;
                break;
        }
    }
}
