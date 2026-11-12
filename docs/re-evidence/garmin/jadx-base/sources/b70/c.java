package b70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.cyclingability.domain.reports.GetLatestCyclingAbilityDataUseCase", f = "GetLatestCyclingAbilityDataUseCase.kt", l = {107}, m = "getFBTPlan", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f16286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16287c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f16286b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f16285a = obj;
        this.f16287c |= Integer.MIN_VALUE;
        int i14 = g.f16300d;
        return this.f16286b.c(0L, this);
    }
}
