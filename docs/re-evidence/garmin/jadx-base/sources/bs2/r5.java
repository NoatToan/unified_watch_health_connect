package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.wallet.WalletConstants;

/* JADX INFO: loaded from: classes11.dex */
public class r5 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20451e;

    static {
        bk bkVar = new bk("common_activity", WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR);
        f20451e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("features_supported", 0, 140, 1.0d, 0.0d, "", false, zn.COMMON_ACTIVITY_FEATURES));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public r5() {
        super(wb.b(WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR));
    }

    public r5(bk bkVar) {
        super(bkVar);
    }
}
