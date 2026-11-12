package t60;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.cross_selling.CrossSellingPreferencesImpl", f = "CrossSellingPreferencesImpl.kt", l = {59}, m = "updateCrossSellingBannerState", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f162721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f162722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f162723c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f162722b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f162721a = obj;
        this.f162723c |= Integer.MIN_VALUE;
        return this.f162722b.c(null, null, this);
    }
}
