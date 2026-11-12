package tl2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f165327b;

    public /* synthetic */ h(i iVar, int i14) {
        this.f165326a = i14;
        this.f165327b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f165326a;
        i iVar = this.f165327b;
        switch (i14) {
            case 0:
                g gVar = i.f165328k;
                iVar.g(false);
                break;
            default:
                g gVar2 = i.f165328k;
                iVar.g(true);
                break;
        }
    }
}
