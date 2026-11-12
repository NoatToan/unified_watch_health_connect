package vr2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.viewmodels.PaymentCardDetailsViewModel", f = "PaymentCardDetailsViewModel.kt", l = {259}, m = "deletePaymentCard", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f179626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f179627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f179628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f179627b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179626a = obj;
        this.f179628c |= Integer.MIN_VALUE;
        return this.f179627b.x4(this);
    }
}
