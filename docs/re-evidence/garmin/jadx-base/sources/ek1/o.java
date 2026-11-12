package ek1;

import aq1.d0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.domain.ProcessThirdPartyAppsListUseCase", f = "ProcessThirdPartyAppsListUseCase.kt", l = {86}, m = "handleMFPConnectStatus", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d0 f64476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f64477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f64478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f64479d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f64478c = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64477b = obj;
        this.f64479d |= Integer.MIN_VALUE;
        int i14 = m.f64465g;
        return this.f64478c.b(null, null, this);
    }
}
