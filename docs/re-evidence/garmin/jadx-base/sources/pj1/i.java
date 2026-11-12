package pj1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.BaseSafetyFeaturesViewModel", f = "BaseSafetyFeaturesViewModel.kt", l = {141}, m = "getSubscriberBillingInfo", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f137924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f137925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f137926c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f137925b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f137924a = obj;
        this.f137926c |= Integer.MIN_VALUE;
        int i14 = e.f137898o;
        return this.f137925b.D4(this);
    }
}
