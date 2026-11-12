package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements fa.j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9357b;

    public /* synthetic */ s(boolean z14, int i14) {
        this.f9356a = i14;
        this.f9357b = z14;
    }

    @Override // fa.j.a
    public final void invoke(Object obj) {
        int i14 = this.f9356a;
        boolean z14 = this.f9357b;
        androidx.media3.common.z.d dVar = (androidx.media3.common.z.d) obj;
        switch (i14) {
            case 0:
                int i15 = v.f9731j0;
                dVar.onShuffleModeEnabledChanged(z14);
                break;
            default:
                dVar.onSkipSilenceEnabledChanged(z14);
                break;
        }
    }
}
