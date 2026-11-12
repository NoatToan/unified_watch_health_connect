package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class lo extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20282e;

    static {
        bk bkVar = new bk("rally_x10_accel_cal", 439);
        f20282e = bkVar;
        zn znVar = zn.FLOAT32;
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 0, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("gain", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "m/s^2/lsb", false, znVar));
        bkVar.e(new rc("temperature", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "degrees C", false, znVar));
        bkVar.e(new rc("g_range", 3, 2, 1.0d, 0.0d, "g", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public lo() {
        super(wb.b(439));
    }

    public lo(bk bkVar) {
        super(bkVar);
    }
}
