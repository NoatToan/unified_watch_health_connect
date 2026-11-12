package b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f13793b;

    public /* synthetic */ d(g gVar, int i14) {
        this.f13792a = i14;
        this.f13793b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13792a) {
            case 0:
                g.onBackPressedDispatcher_delegate$lambda$0$0(this.f13793b);
                break;
            default:
                this.f13793b.invalidateMenu();
                break;
        }
    }
}
