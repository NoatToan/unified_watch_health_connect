package dr0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f60830b;

    public /* synthetic */ c(f fVar, int i14) {
        this.f60829a = i14;
        this.f60830b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f60829a) {
            case 0:
                f fVar = this.f60830b;
                if (fVar != null) {
                    fVar.a(false);
                }
                break;
            case 1:
                f fVar2 = this.f60830b;
                if (fVar2 != null) {
                    fVar2.a(false);
                }
                break;
            default:
                f fVar3 = this.f60830b;
                if (fVar3 != null) {
                    fVar3.a(false);
                }
                break;
        }
    }
}
