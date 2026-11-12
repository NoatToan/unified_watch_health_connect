package i31;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.FetchDeviceOnboardingItemsUseCase", f = "FetchDeviceOnboardingItemsUseCase.kt", l = {18}, m = "invoke-0E7RQCE", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f90655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f90656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f90657c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f90656b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f90655a = obj;
        this.f90657c |= Integer.MIN_VALUE;
        Object objA = this.f90656b.a(null, null, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : o13.q.a(objA);
    }
}
