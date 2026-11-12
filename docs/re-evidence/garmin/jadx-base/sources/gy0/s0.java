package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetMultiDayActivityDailyActivityDurationUseCase", f = "GetMultiDayActivityDailyActivityDurationUseCase.kt", l = {21}, m = "invoke", v = 2)
public final class s0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f80229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80230c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, t13.d<? super s0> dVar) {
        super(dVar);
        this.f80229b = t0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80228a = obj;
        this.f80230c |= Integer.MIN_VALUE;
        return this.f80229b.a(null, null, false, this);
    }
}
