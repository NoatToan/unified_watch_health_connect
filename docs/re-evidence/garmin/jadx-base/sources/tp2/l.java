package tp2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.managecard.FitPayCardDetailsViewModel", f = "FitPayCardDetailsViewModel.kt", l = {192}, m = "suspendCard", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f165988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f165989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f165990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f165991d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f165990c = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f165989b = obj;
        this.f165991d |= Integer.MIN_VALUE;
        return this.f165990c.D4(this);
    }
}
