package ne2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.MapboxCameraAlgorithm$Companion", f = "MapboxCameraAlgorithm.kt", l = {288}, m = "scoreBearingValue", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f125679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f125680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f125681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f125682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f125683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f125684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f125685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h.d f125686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f125687i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h.d dVar, t13.d<? super m> dVar2) {
        super(dVar2);
        this.f125686h = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f125685g = obj;
        this.f125687i |= Integer.MIN_VALUE;
        return h.d.a(this.f125686h, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 0, null, 0.0d, 0.0d, null, this);
    }
}
