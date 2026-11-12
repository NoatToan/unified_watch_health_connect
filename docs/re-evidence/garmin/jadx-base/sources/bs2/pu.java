package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* JADX INFO: loaded from: classes11.dex */
public class pu extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20408e;

    static {
        bk bkVar = new bk("spindle_cal_status", 95);
        f20408e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("fractional_timestamp", 0, 132, 32768.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("status", 1, 0, 1.0d, 0.0d, "", false, zn.SPINDLE_CORE_STATUS));
        bkVar.e(new rc(RemoteConfigConstants.ResponseFieldKey.STATE, 2, 0, 1.0d, 0.0d, "", false, zn.SPINDLE_CAL_STATE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public pu() {
        super(wb.b(95));
    }

    public pu(bk bkVar) {
        super(bkVar);
    }
}
