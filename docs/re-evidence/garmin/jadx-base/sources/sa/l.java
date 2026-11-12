package sa;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.o f158130b;

    public /* synthetic */ l(androidx.media3.exoplayer.source.o oVar, int i14) {
        this.f158129a = i14;
        this.f158130b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f158129a;
        androidx.media3.exoplayer.source.o oVar = this.f158130b;
        switch (i14) {
            case 0:
                oVar.Z = true;
                break;
            case 1:
                Map<String, String> map = androidx.media3.exoplayer.source.o.M0;
                oVar.n();
                break;
            default:
                if (!oVar.L0) {
                    androidx.media3.exoplayer.source.i.a aVar = oVar.f9560t;
                    aVar.getClass();
                    aVar.b(oVar);
                }
                break;
        }
    }
}
