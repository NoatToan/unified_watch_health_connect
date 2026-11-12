package jp2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationViewModel", f = "FitPayCardVerificationViewModel.kt", l = {122}, m = "getVerificationMethods", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f99926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a f99927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f99928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f99927b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f99926a = obj;
        this.f99928c |= Integer.MIN_VALUE;
        return com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.x4(this.f99927b, null, this);
    }
}
