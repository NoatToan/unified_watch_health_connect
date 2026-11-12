package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.wallet.WalletConstants;

/* JADX INFO: loaded from: classes11.dex */
public class i9 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20210e;

    static {
        bk bkVar = new bk("endurance_score_contributor", WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
        f20210e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("sport", 0, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 1, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("group", 2, 0, 1.0d, 0.0d, "", false, zn.ENDURANCE_SCORE_CONTRIBUTOR_GROUP));
        bkVar.e(new rc("contribution", 3, 132, 100.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public i9() {
        super(wb.b(WalletConstants.ERROR_CODE_INVALID_PARAMETERS));
    }

    public i9(bk bkVar) {
        super(bkVar);
    }
}
