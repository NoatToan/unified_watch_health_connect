package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class hp extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20194e;

    static {
        bk bkVar = new bk("rally_x10_strain_cal", 437);
        f20194e = bkVar;
        zn znVar = zn.FLOAT32;
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 0, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("fp_coef", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N/lsb", false, znVar));
        bkVar.e(new rc("fn_coef", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N/lsb", false, znVar));
        bkVar.e(new rc("mp_coef", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N*mm/lsb", false, znVar));
        bkVar.e(new rc("mn_coef", 4, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N*mm/lsb", false, znVar));
        bkVar.e(new rc("vex_offset", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "lsb", false, zn.UINT32));
        bkVar.e(new rc("temperature", 6, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "degrees C", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public hp() {
        super(wb.b(437));
    }

    public hp(bk bkVar) {
        super(bkVar);
    }
}
