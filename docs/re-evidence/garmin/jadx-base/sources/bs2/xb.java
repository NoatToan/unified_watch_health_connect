package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.wallet.WalletConstants;

/* JADX INFO: loaded from: classes11.dex */
public class xb extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20666e;

    static {
        bk bkVar = new bk("fbt_body_battery_dynamic_feedback_data", WalletConstants.ERROR_CODE_UNKNOWN);
        f20666e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("physical_activity_duration_scaled", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("body_battery_level", 1, 0, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_LEVEL));
        bkVar.e(new rc("average_stress_level", 2, 1, 1.0d, 0.0d, "", false, zn.SINT8));
        zn znVar = zn.BOOL;
        bkVar.e(new rc("device_on_more_than_50_percent_after_wakeup", 3, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("rsi_data_50_percent_or_more_after_wakeup", 4, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("dynamic_feedback_type", 5, 0, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_DYNAMIC_FEEDBACK_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public xb() {
        super(wb.b(WalletConstants.ERROR_CODE_UNKNOWN));
    }

    public xb(bk bkVar) {
        super(bkVar);
    }
}
