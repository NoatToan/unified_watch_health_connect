package tp2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.managecard.FitPayCardDetailsViewModel", f = "FitPayCardDetailsViewModel.kt", l = {260}, m = "refreshCreditCardsSuspendable", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f165982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f165983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f165984c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f165983b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f165982a = obj;
        this.f165984c |= Integer.MIN_VALUE;
        return this.f165983b.B4(this);
    }
}
