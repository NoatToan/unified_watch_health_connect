package b31;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.data.DeviceOnboardingRepositoryImpl", f = "DeviceOnboardingRepositoryImpl.kt", l = {110, 112, 114, 132}, m = "updateDeviceOnboardingItem-yxL6bBk", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d31.d f15603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d31.c f15604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d31.a f15605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f15606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f15608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f15609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15610j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f15609i = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f15608h = obj;
        this.f15610j |= Integer.MIN_VALUE;
        Object objH = this.f15609i.h(0L, 0L, null, null, this);
        return objH == u13.a.COROUTINE_SUSPENDED ? objH : q.a(objH);
    }
}
