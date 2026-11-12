package b31;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.data.DeviceOnboardingRepositoryImpl", f = "DeviceOnboardingRepositoryImpl.kt", l = {150}, m = "deleteAllOnboardingItems-gIAlu-s", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f15586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f15586b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f15585a = obj;
        this.f15587c |= Integer.MIN_VALUE;
        Object objI = this.f15586b.i(0, this);
        return objI == u13.a.COROUTINE_SUSPENDED ? objI : q.a(objI);
    }
}
