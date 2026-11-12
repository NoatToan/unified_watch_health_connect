package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class y9 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20685e;

    static {
        bk bkVar = new bk("eqn_horse_metrics", 479);
        f20685e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("activity", 0, 0, 1.0d, 0.0d, "", false, zn.EQN_HORSE_ACTIVITY));
        bkVar.e(new rc("heart_rate", 1, 132, 1.0d, 0.0d, "bpm", false, zn.UINT16));
        zn znVar = zn.SINT16;
        bkVar.e(new rc("skin_temperature", 2, 131, 100.0d, 0.0d, "C", false, znVar));
        bkVar.e(new rc("core_temperature", 3, 131, 100.0d, 0.0d, "C", false, znVar));
        bkVar.e(new rc("contact_temperature", 4, 131, 100.0d, 0.0d, "C", false, znVar));
        bkVar.e(new rc("board_temperature", 5, 131, 100.0d, 0.0d, "C", false, znVar));
        bkVar.e(new rc("gait", 6, 0, 1.0d, 0.0d, "", false, zn.EQN_HORSE_GAIT));
        bkVar.e(new rc("stride_frequency", 7, 2, 1.0d, 0.0d, "strides/min", false, zn.UINT8));
        zn znVar2 = zn.FLOAT32;
        bkVar.e(new rc("accel", 8, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "g", false, znVar2));
        bkVar.e(new rc("gyro", 9, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "deg/s", false, znVar2));
        bkVar.e(new rc("delta_temperature", 10, 131, 100.0d, 0.0d, "C", false, znVar));
        zn znVar3 = zn.UINT32;
        bkVar.e(new rc("calc_distance", 11, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("app_distance", 12, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("delta_temperature_max", 13, 131, 100.0d, 0.0d, "C", false, znVar));
        bkVar.e(new rc("delta_temperature_avg", 14, 131, 100.0d, 0.0d, "C", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public y9() {
        super(wb.b(479));
    }

    public y9(bk bkVar) {
        super(bkVar);
    }
}
