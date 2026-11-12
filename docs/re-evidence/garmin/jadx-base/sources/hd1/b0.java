package hd1;

import com.garmin.device.datatypes.DeviceProfile;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhd1/b0;", "Lhd1/r;", "Lhd1/g;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lhd1/g;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f83370a;

    public b0(g gVar) {
        gVar.getClass();
        this.f83370a = gVar;
    }

    @Override // ym2.b
    public final void e(String str, xm2.i iVar) {
        iVar.getClass();
        a0 a0Var = new a0(iVar.f191550a.ordinal(), iVar.f191551b, iVar.f191552c, iVar.f191554e, iVar.f191553d, iVar.f191555f);
        DeviceProfile deviceProfileD = da2.d.b().f58886a.f111646e.d(str);
        Long lValueOf = deviceProfileD != null ? Long.valueOf(deviceProfileD.getF92746j()) : null;
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.CACHED;
        this.f83370a.a(a0Var, lValueOf);
    }
}
