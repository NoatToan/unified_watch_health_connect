package jp2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationViewModel", f = "FitPayCardVerificationViewModel.kt", l = {133}, m = "refreshCreditCardsSuspendable", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f99936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a f99937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f99938c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f99937b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f99936a = obj;
        this.f99938c |= Integer.MIN_VALUE;
        return this.f99937b.B4(this);
    }
}
