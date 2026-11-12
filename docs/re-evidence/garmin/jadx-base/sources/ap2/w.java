package ap2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel", f = "FitPayAddCardViewModel.kt", l = {825}, m = "refreshAllCachedCreditCardsSuspendable", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f11793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11794c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(h hVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f11793b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f11792a = obj;
        this.f11794c |= Integer.MIN_VALUE;
        return this.f11793b.G4(this);
    }
}
