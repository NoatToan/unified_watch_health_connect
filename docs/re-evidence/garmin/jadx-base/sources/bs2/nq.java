package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class nq extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20335e;

    static {
        bk bkVar = new bk("round_results", 191);
        f20335e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("player_name", 0, 7, 1.0d, 0.0d, "", false, zn.STRING));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("player_index", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("out_score", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("in_score", 3, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("total_score", 4, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("total_handicap_score", 5, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("total_game_score", 6, 131, 1.0d, 0.0d, "", false, zn.SINT16));
        bkVar.e(new rc("fairways_hit", 7, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("gir_count", 8, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("total_putts", 9, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("player_count", 10, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public nq() {
        super(wb.b(191));
    }

    public nq(bk bkVar) {
        super(bkVar);
    }
}
