package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class hv extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20200e;

    static {
        bk bkVar = new bk("split_score_card", 395);
        f20200e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("status", 0, 0, 1.0d, 0.0d, "", false, zn.SPLIT_SCORE_CARD_STATUS));
        bkVar.e(new rc("rank", 1, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("ranks_possible", 2, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("number_won", 3, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("avg_wins", 5, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public hv() {
        super(wb.b(395));
    }

    public hv(bk bkVar) {
        super(bkVar);
    }
}
