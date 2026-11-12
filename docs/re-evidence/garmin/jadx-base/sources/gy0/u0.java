package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetMultiDayActivityElevationDataUseCase", f = "GetMultiDayActivityElevationDataUseCase.kt", l = {14}, m = "invoke", v = 2)
public final class u0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f80239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, t13.d<? super u0> dVar) {
        super(dVar);
        this.f80239b = v0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80238a = obj;
        this.f80240c |= Integer.MIN_VALUE;
        return this.f80239b.a(null, this);
    }
}
