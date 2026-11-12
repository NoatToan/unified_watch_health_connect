package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.GetEpicPolylinesUseCase", f = "GetEpicPolylinesUseCase.kt", l = {10}, m = "invoke", v = 2)
public final class m0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f80196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f80197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, t13.d<? super m0> dVar) {
        super(dVar);
        this.f80197b = n0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80196a = obj;
        this.f80198c |= Integer.MIN_VALUE;
        return this.f80197b.a(null, this);
    }
}
