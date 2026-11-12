package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public class y implements t0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f9879a;

    public y(z zVar) {
        this.f9879a = zVar;
    }

    @Override // androidx.media3.exoplayer.t0.a
    public final void a() {
        this.f9879a.J0 = true;
    }

    @Override // androidx.media3.exoplayer.t0.a
    public final void onWakeup() {
        z zVar = this.f9879a;
        if (zVar.A || zVar.K0) {
            zVar.f9893i.sendEmptyMessage(2);
        }
    }
}
