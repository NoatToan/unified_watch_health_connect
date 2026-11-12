package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetEnduranceScoreDataUseCase", f = "GetEnduranceScoreDataUseCase.kt", l = {30}, m = "getEnduranceScoreData", v = 2)
public final class e0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f80137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80138c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, t13.d<? super e0> dVar) {
        super(dVar);
        this.f80137b = g0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80136a = obj;
        this.f80138c |= Integer.MIN_VALUE;
        return this.f80137b.a(null, null, null, null, this);
    }
}
