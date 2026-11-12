package ek1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.domain.ConnectThirdPartyUseCase", f = "ConnectThirdPartyUseCase.kt", l = {55, 61}, m = "getAuthorizeResult", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f64432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hk1.w.a f64433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f64434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f64435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f64436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f64437f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(dVar2);
        this.f64436e = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64435d = obj;
        this.f64437f |= Integer.MIN_VALUE;
        int i14 = d.f64430b;
        return this.f64436e.a(null, null, this);
    }
}
