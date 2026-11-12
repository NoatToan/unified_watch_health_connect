package hc2;

import android.content.Context;
import bs2.ad;
import com.garmin.device.datatypes.DeviceProfile;
import p005kotlin.Metadata;
import wb2.g0;
import wb2.t0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhc2/f;", "Lbc2/a;", "<init>", "()V", "connect-device-sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class f implements bc2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f83305a;

    @Override // bc2.a
    public final void a(Context context, g0 g0Var) {
        context.getClass();
        g0Var.getClass();
    }

    @Override // bc2.a
    public final void b() {
        e eVar = this.f83305a;
        if (eVar != null) {
            eVar.g();
        }
        this.f83305a = null;
    }

    @Override // bc2.a
    public final e c(t0 t0Var) {
        if (t0Var.f184147g == ((byte) ad.GOLF_SWING.f19675a)) {
            return this.f83305a;
        }
        return null;
    }

    @Override // bc2.a
    public final void d(Context context) {
        context.getClass();
        this.f83305a = new e(context);
    }

    @Override // bc2.a
    public final a e(String str, String str2, DeviceProfile deviceProfile, t0 t0Var) {
        str.getClass();
        str2.getClass();
        if (t0Var.f184147g != ((byte) ad.GOLF_SWING.f19675a)) {
            return null;
        }
        if (deviceProfile != null && deviceProfile.getConfigurationFlags().contains(30)) {
            a aVar = new a(str, str2);
            aVar.f83280a = true;
            return aVar;
        }
        if (deviceProfile == null || !deviceProfile.getConfigurationFlags().contains(31)) {
            return null;
        }
        a aVar2 = new a(str, str2);
        aVar2.f83280a = false;
        return aVar2;
    }

    @Override // bc2.a
    public final void f(Context context, g0 g0Var) {
        context.getClass();
        g0Var.getClass();
    }

    public abstract as1.b g();
}
