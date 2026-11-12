package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.wallet.WalletConstants;

/* JADX INFO: loaded from: classes11.dex */
public class qt extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20441e;

    static {
        bk bkVar = new bk("sleep_need", WalletConstants.ERROR_CODE_INVALID_TRANSACTION);
        f20441e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("baseline", 0, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("actual", 1, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("feedback", 2, 2, 1.0d, 0.0d, "", false, zn.SLEEP_NEED_FEEDBACK));
        bkVar.e(new rc("training_feedback", 3, 2, 1.0d, 0.0d, "", false, zn.SLEEP_NEED_FEEDBACK_TRAINING));
        zn znVar2 = zn.SLEEP_NEED_FEEDBACK_ADJUSTMENT;
        bkVar.e(new rc("sleep_history_adjustment", 4, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("hrv_adjustment", 5, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("nap_adjustment", 6, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public qt() {
        super(wb.b(WalletConstants.ERROR_CODE_INVALID_TRANSACTION));
    }

    public qt(bk bkVar) {
        super(bkVar);
    }
}
