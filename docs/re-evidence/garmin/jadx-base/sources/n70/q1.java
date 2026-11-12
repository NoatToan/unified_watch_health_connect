package n70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDevicesInfoUseCase", f = "GetDevicesInfoUseCase.kt", l = {44}, m = "getDeviceInfo", v = 2)
public final class q1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f124502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f124503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f124504c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(p1 p1Var, t13.d<? super q1> dVar) {
        super(dVar);
        this.f124503b = p1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f124502a = obj;
        this.f124504c |= Integer.MIN_VALUE;
        return p1.a(this.f124503b, this);
    }
}
