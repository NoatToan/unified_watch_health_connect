package b70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.cyclingability.domain.reports.GetLatestCyclingAbilityDataUseCase", f = "GetLatestCyclingAbilityDataUseCase.kt", l = {71}, m = "getPrimaryEvent", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f16289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f16289b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f16288a = obj;
        this.f16290c |= Integer.MIN_VALUE;
        int i14 = g.f16300d;
        return this.f16289b.d(this);
    }
}
