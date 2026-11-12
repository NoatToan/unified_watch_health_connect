package k90;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.GetDeviceInfoUseCase", f = "GetDeviceInfoUseCase.kt", l = {23, 29, 37}, m = "getDeviceInfo", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dk2.d f103482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f103483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z80.d f103484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f103485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f103486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f103487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f103488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f103489h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(d0 d0Var, t13.d<? super f0> dVar) {
        super(dVar);
        this.f103488g = d0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f103487f = obj;
        this.f103489h |= Integer.MIN_VALUE;
        return this.f103488g.b(null, null, this);
    }
}
