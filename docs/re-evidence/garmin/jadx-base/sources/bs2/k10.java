package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class k10 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20250e;

    static {
        bk bkVar = new bk("video_gaming_game_info", 396);
        f20250e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("game_type", 0, 0, 1.0d, 0.0d, "", false, zn.VIDEO_GAMING_GAME_TYPE));
        bkVar.e(new rc("game_name", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public k10() {
        super(wb.b(396));
    }

    public k10(bk bkVar) {
        super(bkVar);
    }
}
