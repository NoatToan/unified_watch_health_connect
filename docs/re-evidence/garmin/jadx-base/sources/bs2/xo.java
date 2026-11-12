package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class xo extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20671e;

    static {
        bk bkVar = new bk("rally_x10_gyro_cal", 440);
        f20671e = bkVar;
        zn znVar = zn.FLOAT32;
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 0, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("gain", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "radian/s/lsb", false, znVar));
        bkVar.e(new rc("temperature", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "degrees C", false, znVar));
        bkVar.e(new rc("range", 3, 132, 1.0d, 0.0d, "deg/s", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public xo() {
        super(wb.b(440));
    }

    public xo(bk bkVar) {
        super(bkVar);
    }
}
