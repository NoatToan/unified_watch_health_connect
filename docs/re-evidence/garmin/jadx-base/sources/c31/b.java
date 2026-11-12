package c31;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.data.local.DeviceOnboardingDao", f = "DeviceOnboardingDao.kt", l = {21, 22}, m = "syncItems$suspendImpl", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f24073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f24074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f24077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24078f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f24077e = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f24076d = obj;
        this.f24078f |= Integer.MIN_VALUE;
        return c.b(this.f24077e, 0L, null, this);
    }
}
