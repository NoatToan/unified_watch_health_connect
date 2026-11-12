package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.wallet.WalletConstants;

/* JADX INFO: loaded from: classes11.dex */
public class wh extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20649e;

    static {
        bk bkVar = new bk("hsa_wrist_temperature_data", WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR);
        f20649e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("processing_interval", 0, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("value", 1, 132, 1000.0d, 0.0d, "degC", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public wh() {
        super(wb.b(WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR));
    }

    public wh(bk bkVar) {
        super(bkVar);
    }
}
