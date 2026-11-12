package tp2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.managecard.FitPayCardDetailsViewModel", f = "FitPayCardDetailsViewModel.kt", l = {248}, m = "removeCard", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f165985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f165986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f165987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f165986b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f165985a = obj;
        this.f165987c |= Integer.MIN_VALUE;
        return this.f165986b.C4(this);
    }
}
