package tp2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.managecard.FitPayCardDetailsViewModel", f = "FitPayCardDetailsViewModel.kt", l = {227}, m = "reactivateCard", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f165978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f165979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f165980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f165981d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f165980c = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f165979b = obj;
        this.f165981d |= Integer.MIN_VALUE;
        return this.f165980c.A4(this);
    }
}
