package i31;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.GetOnboardingDeviceFilterTypeUseCase", f = "GetOnboardingDeviceFilterTypeUseCase.kt", l = {21}, m = "invoke", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f90761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f90762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f90763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f90764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s sVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f90763c = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f90762b = obj;
        this.f90764d |= Integer.MIN_VALUE;
        return this.f90763c.a(0L, null, this);
    }
}
