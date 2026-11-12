package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetDailyVO2MaxDataUseCase", f = "GetDailyVO2MaxDataUseCase.kt", l = {21}, m = "invoke", v = 2)
public final class c0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o82.a f80120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f80121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f80122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, t13.d<? super c0> dVar) {
        super(dVar);
        this.f80122c = d0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80121b = obj;
        this.f80123d |= Integer.MIN_VALUE;
        return this.f80122c.a(null, null, null, null, this);
    }
}
