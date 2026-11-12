package lo;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements com.garmin.android.apps.connectmobile.q1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f113718b;

    public /* synthetic */ c(f fVar, int i14) {
        this.f113717a = i14;
        this.f113718b = fVar;
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public final void g(boolean z14) {
        switch (this.f113717a) {
            case 0:
                if (z14) {
                    this.f113718b.M6();
                }
                break;
            case 1:
                if (z14) {
                    this.f113718b.S6();
                }
                break;
            default:
                if (z14) {
                    f fVar = this.f113718b;
                    if (fVar.f113749x != null) {
                        fVar.f113751z.f(false);
                        fVar.f113749x.d();
                    }
                }
                break;
        }
    }
}
