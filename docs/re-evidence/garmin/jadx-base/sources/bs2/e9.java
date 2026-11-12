package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class e9 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20076e;

    static {
        bk bkVar = new bk("ecg_session", 336);
        f20076e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("version", 0, 132, 100.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("classification", 1, 0, 1.0d, 0.0d, "", false, zn.ECG_CLASSIFICATION));
        zn znVar2 = zn.FLOAT32;
        bkVar.e(new rc("raw_sample_rate", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("filtered_sample_rate", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("start_time", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("start_time_local", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("mounting_side", 6, 0, 1.0d, 0.0d, "", false, zn.SIDE));
        bkVar.e(new rc("avg_hr", 7, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("symptoms", 8, 140, 1.0d, 0.0d, "", false, zn.ECG_SYMPTOMS));
        bkVar.e(new rc("udi", 10, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("duration", 11, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("rmssd_hrv", 12, 2, 1.0d, 0.0d, "ms", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public e9() {
        super(wb.b(336));
    }

    public e9(bk bkVar) {
        super(bkVar);
    }
}
