package b31;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.data.DeviceOnboardingRepositoryImpl", f = "DeviceOnboardingRepositoryImpl.kt", l = {28, 42, 65}, m = "fetchDeviceOnboardingItems-BWLJW6A", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f15588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f15589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f15590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f15591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f15592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f15593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f15598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f15599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15600m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f15599l = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f15598k = obj;
        this.f15600m |= Integer.MIN_VALUE;
        Object objF = this.f15599l.f(null, null, false, this);
        return objF == u13.a.COROUTINE_SUSPENDED ? objF : q.a(objF);
    }
}
