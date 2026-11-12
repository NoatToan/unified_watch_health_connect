package n22;

/* JADX INFO: loaded from: classes10.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f122369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f122370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f122371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f122372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f122373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f122374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.util.simplecropimage.c f122375g;

    public b(com.garmin.android.apps.connectmobile.util.simplecropimage.c cVar, float f14, long j8, float f15, float f16, float f17, float f18) {
        this.f122375g = cVar;
        this.f122369a = f14;
        this.f122370b = j8;
        this.f122371c = f15;
        this.f122372d = f16;
        this.f122373e = f17;
        this.f122374f = f18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float fCurrentTimeMillis = System.currentTimeMillis() - this.f122370b;
        float f14 = this.f122369a;
        float fMin = Math.min(f14, fCurrentTimeMillis);
        float f15 = (this.f122372d * fMin) + this.f122371c;
        float f16 = this.f122373e;
        float f17 = this.f122374f;
        com.garmin.android.apps.connectmobile.util.simplecropimage.c cVar = this.f122375g;
        cVar.g(f15, f16, f17);
        if (fMin < f14) {
            cVar.f47362m.post(this);
        }
    }
}
