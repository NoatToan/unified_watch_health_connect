package zf0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel", f = "RaceAndEventBaseViewModel.kt", l = {233}, m = "getActivityWeatherByID", v = 2)
public final class o0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f204465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f204466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f204467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(j0 j0Var, t13.d<? super o0> dVar) {
        super(dVar);
        this.f204466b = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204465a = obj;
        this.f204467c |= Integer.MIN_VALUE;
        int i14 = j0.F;
        return this.f204466b.C4(0L, this);
    }
}
