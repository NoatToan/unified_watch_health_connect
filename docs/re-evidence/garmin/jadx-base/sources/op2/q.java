package op2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebPresenterViewModel", f = "NewFitPayWebPresenterViewModel.kt", l = {75}, m = "initializePreviousNumberOfCards", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f133255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f133256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f133257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f133258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o oVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f133257c = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f133256b = obj;
        this.f133258d |= Integer.MIN_VALUE;
        return o.y4(this.f133257c, this);
    }
}
