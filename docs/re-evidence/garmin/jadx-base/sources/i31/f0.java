package i31;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.UpdateDeviceOnboardingItemUseCase", f = "UpdateDeviceOnboardingItemUseCase.kt", l = {21, 28}, m = "invoke-BWLJW6A", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f90679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f90680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d31.d f90681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d31.c f90682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f90683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f90684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f90685g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e0 e0Var, t13.d<? super f0> dVar) {
        super(dVar);
        this.f90684f = e0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f90683e = obj;
        this.f90685g |= Integer.MIN_VALUE;
        Object objA = this.f90684f.a(0L, null, null, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : o13.q.a(objA);
    }
}
