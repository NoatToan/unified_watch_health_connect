package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class nu extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20337e;

    static {
        bk bkVar = new bk("spindle_cal_cmd", 91);
        f20337e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("fractional_timestamp", 0, 132, 32768.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("spindle_cal_cmd_type", 1, 0, 1.0d, 0.0d, "", false, zn.SPINDLE_CAL_CMD_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public nu() {
        super(wb.b(91));
    }

    public nu(bk bkVar) {
        super(bkVar);
    }
}
