package zb0;

import c22.u1;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.google.common.primitives.UnsignedBytes;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public class d extends com.garmin.android.library.backgroundtaskmanagement.a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f203472b;

    private d() {
    }

    public static synchronized d M() {
        try {
            if (f203472b == null) {
                f203472b = new d();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f203472b;
    }

    @Override // zb0.e
    public final long D(long j8, vg1.r0 r0Var, vg1.k0.a aVar) {
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new cc0.g(j8, r0Var, this), aVar);
    }

    @Override // zb0.e
    public final void b(long j8, a aVar) {
        com.garmin.android.apps.connectmobile.audioprompts.b.f30221d.getClass();
        com.garmin.android.apps.connectmobile.audioprompts.b bVarA = com.garmin.android.apps.connectmobile.audioprompts.b.a.a();
        bVarA.getClass();
        bVarA.b(new bd0.d(bVarA, j8, aVar, 4));
    }

    @Override // zb0.e
    public final String d(long j8) {
        return u1.a(j8);
    }

    @Override // zb0.e
    public final void h(long j8) {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.ENTERED_WIDGETS_SETUP_SCREEN);
    }

    @Override // zb0.e
    public final void n(String str, int i14, String str2, String str3, uv.g gVar) {
        if (str2 != null) {
            hk0.d.h().f(str, i14, str2, str3, gVar);
        }
    }

    @Override // zb0.e
    public final d80.f<DeviceSettingsDTO> r(long j8, d80.b bVar) {
        return com.garmin.android.apps.connectmobile.settings.devices.e.N().r(j8, bVar);
    }

    @Override // zb0.e
    public final void u(String str, int i14, String str2, String str3, byte b14, uv.g gVar) {
        hk0.d.h().g(str, i14, str2, str3, UnsignedBytes.MAX_POWER_OF_TWO, b14, 0, gVar);
    }

    @Override // zb0.e
    public final long z(int i14, long j8, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b) {
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new cc0.a(j8, i14, this), interfaceC0995b);
    }
}
