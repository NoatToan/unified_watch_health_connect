package pj1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.BaseSafetyFeaturesViewModel", f = "BaseSafetyFeaturesViewModel.kt", l = {226}, m = "checkAndUpdateLTESubscription", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f137915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f137916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f137917c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f137916b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f137915a = obj;
        this.f137917c |= Integer.MIN_VALUE;
        return this.f137916b.x4(this);
    }
}
