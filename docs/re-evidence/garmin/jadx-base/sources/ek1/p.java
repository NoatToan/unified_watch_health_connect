package ek1;

import com.garmin.android.apps.connectmobile.workouts.data.model.g0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.domain.ProcessThirdPartyAppsListUseCase", f = "ProcessThirdPartyAppsListUseCase.kt", l = {100}, m = "handleOffice365ConnectStatus", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0 f64480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f64481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f64482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f64483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f64482c = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64481b = obj;
        this.f64483d |= Integer.MIN_VALUE;
        int i14 = m.f64465g;
        return this.f64482c.c(null, null, this);
    }
}
