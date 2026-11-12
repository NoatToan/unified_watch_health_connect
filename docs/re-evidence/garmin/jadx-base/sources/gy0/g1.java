package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetTrainingLoadDataUseCase", f = "GetTrainingLoadDataUseCase.kt", l = {21}, m = "invoke", v = 2)
public final class g1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o82.a f80162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f80163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1 f80164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var, t13.d<? super g1> dVar) {
        super(dVar);
        this.f80164c = h1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80163b = obj;
        this.f80165d |= Integer.MIN_VALUE;
        return this.f80164c.a(null, null, null, null, this);
    }
}
