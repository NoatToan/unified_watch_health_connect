package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ml extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20316e;

    static {
        bk bkVar = new bk("music_player_event", 244);
        f20316e = bkVar;
        bkVar.e(new rc("timestamp", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("music_player_state", 1, 0, 1.0d, 0.0d, "s", false, zn.MUSIC_PLAYER_EVENT));
        bkVar.e(new rc("song_time", 2, 132, 1.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ml() {
        super(wb.b(244));
    }

    public ml(bk bkVar) {
        super(bkVar);
    }
}
