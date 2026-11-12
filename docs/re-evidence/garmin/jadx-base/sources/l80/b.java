package l80;

import android.content.Context;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDISmartProto;
import java.util.ArrayList;
import sd2.f;
import wb2.x;

/* JADX INFO: loaded from: classes8.dex */
public interface b {
    boolean a(long j8);

    DeviceProfile b(long j8);

    void c(GDISmartProto.Smart smart, long j8, wm2.b bVar);

    void d(long j8);

    boolean e(f fVar);

    boolean f(String str);

    void g(String str);

    <T> T getCapability(String str, Class<T> cls);

    boolean h(long j8);

    void i(long j8);

    void j();

    void k(String str, boolean z14);

    x l(long j8);

    void m();

    void n(Context context, long j8, String str);

    void o(String str, byte[] bArr, byte[] bArr2, byte[] bArr3);

    int p(String str, String str2);

    int q(String str);

    void r();

    void s(GDISmartProto.Smart smart, long j8);

    void t(long j8);

    void u();

    boolean v(String str);

    ArrayList w();

    da2.b x();

    void y();

    void z();
}
