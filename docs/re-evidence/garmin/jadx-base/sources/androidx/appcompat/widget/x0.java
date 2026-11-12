package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f5277b;

    public /* synthetic */ x0(Toolbar toolbar, int i14) {
        this.f5276a = i14;
        this.f5277b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5276a) {
            case 0:
                this.f5277b.collapseActionView();
                break;
            default:
                this.f5277b.invalidateMenu();
                break;
        }
    }
}
