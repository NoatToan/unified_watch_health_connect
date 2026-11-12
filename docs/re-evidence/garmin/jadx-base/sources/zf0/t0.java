package zf0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel", f = "RaceAndEventBaseViewModel.kt", l = {250}, m = "getHistoricalWeatherData", v = 2)
public final class t0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f204501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f204502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f204503c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(j0 j0Var, t13.d<? super t0> dVar) {
        super(dVar);
        this.f204502b = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204501a = obj;
        this.f204503c |= Integer.MIN_VALUE;
        int i14 = j0.F;
        return this.f204502b.K4(0, 0, 0L, this);
    }
}
