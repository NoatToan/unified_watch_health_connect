package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.wallet.WalletConstants;

/* JADX INFO: loaded from: classes11.dex */
public class sl extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20537e;

    static {
        bk bkVar = new bk("nap_event", WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION);
        f20537e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("start_time", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "seconds", false, znVar));
        zn znVar2 = zn.SINT16;
        bkVar.e(new rc("start_timezone_offset", 1, 131, 1.0d, 0.0d, "minutes", false, znVar2));
        bkVar.e(new rc("end_time", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "seconds", false, znVar));
        bkVar.e(new rc("end_timezone_offset", 3, 131, 1.0d, 0.0d, "minutes", false, znVar2));
        bkVar.e(new rc("feedback", 4, 0, 1.0d, 0.0d, "", false, zn.NAP_PERIOD_FEEDBACK));
        bkVar.e(new rc("is_deleted", 5, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("source", 6, 0, 1.0d, 0.0d, "", false, zn.NAP_SOURCE));
        bkVar.e(new rc("update_timestamp", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public sl() {
        super(wb.b(WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION));
    }

    public sl(bk bkVar) {
        super(bkVar);
    }
}
