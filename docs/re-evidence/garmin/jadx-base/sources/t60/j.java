package t60;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.cross_selling.CrossSellingPreferencesImpl", f = "CrossSellingPreferencesImpl.kt", l = {41, 46}, m = "showCrossSellingBanner", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f162717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f162718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f162719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f162720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f162719c = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f162718b = obj;
        this.f162720d |= Integer.MIN_VALUE;
        return this.f162719c.b(null, this);
    }
}
