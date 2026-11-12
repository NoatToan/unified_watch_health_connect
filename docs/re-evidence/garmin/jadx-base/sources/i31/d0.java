package i31;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.RefreshDeviceOnboardingItemsUseCase", f = "RefreshDeviceOnboardingItemsUseCase.kt", l = {20, 21, 30, 35}, m = "invoke", v = 2)
public final class d0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f90658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f90659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d31.a f90660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f90661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f90662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f90663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f90664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0 f90665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f90666i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c0 c0Var, t13.d<? super d0> dVar) {
        super(dVar);
        this.f90665h = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f90664g = obj;
        this.f90666i |= Integer.MIN_VALUE;
        return this.f90665h.a(0L, this);
    }
}
