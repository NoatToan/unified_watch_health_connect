package l70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.FitnessStatsActivityRepo", f = "FitnessStatsActivityRepo.kt", l = {35}, m = "fetchFromServer", v = 2)
public final class h0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f110688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f110689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110690c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, t13.d<? super h0> dVar) {
        super(dVar);
        this.f110689b = i0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f110688a = obj;
        this.f110690c |= Integer.MIN_VALUE;
        i0 i0Var = i0.f110697a;
        return this.f110689b.a(null, null, this);
    }
}
