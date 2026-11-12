package ts2;

import com.garmin.proto.generated.GDIConnectedDevicesReporting;
import java.util.List;
import o13.x;
import p13.h0;
import tn2.n0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static final String a(List<GDIConnectedDevicesReporting.ConnectedDevice> list, List<Integer> list2) {
        return list2 == null ? h0.k0(list, null, null, null, new n0(15), 31) : h0.k0(h0.k1(list, list2), null, null, null, new n0(16), 31);
    }

    public static final long b(GDIConnectedDevicesReporting.ConnectedDevice connectedDevice) {
        connectedDevice.getClass();
        int unitId = connectedDevice.getUnitId();
        x.a aVar = x.f128613b;
        return ((long) unitId) & 4294967295L;
    }
}
