package b31;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.data.PromptOnboardingRepositoryImpl", f = "PromptOnboardingRepositoryImpl.kt", l = {62, 64}, m = "updateOnboardingPromptItem-BWLJW6A", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d31.d f15660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d31.c f15661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f15662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f15664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f15665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15666h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f15665g = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f15664f = obj;
        this.f15666h |= Integer.MIN_VALUE;
        Object objB = this.f15665g.b(0L, null, null, this);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : q.a(objB);
    }
}
