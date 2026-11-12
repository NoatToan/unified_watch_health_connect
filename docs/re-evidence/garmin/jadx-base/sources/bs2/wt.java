package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.wallet.WalletConstants;

/* JADX INFO: loaded from: classes11.dex */
public class wt extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20653e;

    static {
        bk bkVar = new bk("sleep_summary", WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE);
        f20653e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("overall_sleep_score", 0, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("deep_duration", 1, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("light_duration", 2, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("rem_duration", 3, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("awake_duration", 4, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("unmeasurable_duration", 5, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("captured_with_primary", 6, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        zn znVar2 = zn.LOCAL_DATE_TIME;
        bkVar.e(new rc("sleep_end_timestamp_local", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.DATE_TIME;
        bkVar.e(new rc("sleep_end_timestamp_utc", 8, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("sleep_start_timestamp_local", 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("sleep_start_timestamp_utc", 10, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public wt() {
        super(wb.b(WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE));
    }

    public wt(bk bkVar) {
        super(bkVar);
    }
}
