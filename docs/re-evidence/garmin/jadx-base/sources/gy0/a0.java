package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetDailyRacePredictorDataUseCase", f = "GetDailyRacePredictorDataUseCase.kt", l = {21}, m = "invoke", v = 2)
public final class a0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o82.a f80095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f80096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f80097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, t13.d<? super a0> dVar) {
        super(dVar);
        this.f80097c = b0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80096b = obj;
        this.f80098d |= Integer.MIN_VALUE;
        return this.f80097c.a(null, null, null, null, this);
    }
}
