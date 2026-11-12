package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class jn extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20234e;

    static {
        bk bkVar = new bk("player_hole_stats", 192);
        f20234e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("player_index", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("hole_number", 1, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT8;
        bkVar.e(new rc("gross_score", 2, 1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("handicap_score", 3, 1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("game_score", 4, 131, 1.0d, 0.0d, "", false, zn.SINT16));
        bkVar.e(new rc("hole_putts", 5, 1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("fairway", 6, 0, 1.0d, 0.0d, "", false, zn.GOLF_FAIRWAY_TYPE));
        bkVar.e(new rc("green_used", 7, 0, 1.0d, 0.0d, "", false, zn.GOLF_GREEN_USED_TYPE));
        bkVar.e(new rc("handicap_allotted_strokes", 8, 1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("penalty_strokes", 9, 1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public jn() {
        super(wb.b(192));
    }

    public jn(bk bkVar) {
        super(bkVar);
    }
}
