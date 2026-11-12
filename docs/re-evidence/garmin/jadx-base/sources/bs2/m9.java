package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class m9 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20307e;

    static {
        bk bkVar = new bk("eqn_ambient_metrics", 476);
        f20307e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("ambient_temperature", 0, 131, 100.0d, 0.0d, "C", false, zn.SINT16));
        bkVar.e(new rc("relative_humidity", 1, 2, 1.0d, 0.0d, "%", false, zn.UINT8));
        bkVar.e(new rc("heat_risk_value", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, zn.FLOAT32));
        bkVar.e(new rc("heat_risk_severity", 3, 0, 1.0d, 0.0d, "", false, zn.EQN_HEAT_RISK_LEVELS));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public m9() {
        super(wb.b(476));
    }

    public m9(bk bkVar) {
        super(bkVar);
    }
}
