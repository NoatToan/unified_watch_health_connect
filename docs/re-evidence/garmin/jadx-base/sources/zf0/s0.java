package zf0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel", f = "RaceAndEventBaseViewModel.kt", l = {215}, m = "getForecastWeather", v = 2)
public final class s0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f204494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f204495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f204496c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(j0 j0Var, t13.d<? super s0> dVar) {
        super(dVar);
        this.f204495b = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204494a = obj;
        this.f204496c |= Integer.MIN_VALUE;
        int i14 = j0.F;
        return this.f204495b.J4(0.0d, 0.0d, 0L, this);
    }
}
