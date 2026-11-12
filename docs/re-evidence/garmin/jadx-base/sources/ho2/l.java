package ho2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainViewModel", f = "PushProvMainViewModel.kt", l = {74}, m = "verifyPushProvDeepLinkData", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f84867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f84868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f84868b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f84867a = obj;
        this.f84869c |= Integer.MIN_VALUE;
        return this.f84868b.z4(null, this);
    }
}
