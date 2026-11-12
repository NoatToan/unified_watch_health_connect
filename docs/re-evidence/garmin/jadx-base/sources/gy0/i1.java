package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetTrainingReadinessDataUseCase", f = "GetTrainingReadinessDataUseCase.kt", l = {21}, m = "invoke", v = 2)
public final class i1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o82.a f80176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f80177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1 f80178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, t13.d<? super i1> dVar) {
        super(dVar);
        this.f80178c = j1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80177b = obj;
        this.f80179d |= Integer.MIN_VALUE;
        return this.f80178c.a(null, null, null, null, this);
    }
}
