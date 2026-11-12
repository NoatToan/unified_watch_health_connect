package m12;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.domain.GetActivityListWithSocialInfoUseCase", f = "GetActivityListWithSocialInfoUseCase.kt", l = {50}, m = "fetchServerData", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e.a f115821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f115822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f115823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f115824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f115823c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f115822b = obj;
        this.f115824d |= Integer.MIN_VALUE;
        int i14 = e.f115815b;
        return this.f115823c.a(null, null, this);
    }
}
