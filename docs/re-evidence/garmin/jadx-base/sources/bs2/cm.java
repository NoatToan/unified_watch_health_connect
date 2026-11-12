package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class cm extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20038e;

    static {
        bk bkVar = new bk("new_song_event", 243);
        f20038e = bkVar;
        bkVar.e(new rc("timestamp", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("song_start_time", 1, 132, 1.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.STRING;
        bkVar.e(new rc("title", 2, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("artist", 3, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("genre", 4, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("length", 5, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("tempo", 6, 132, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public cm() {
        super(wb.b(243));
    }

    public cm(bk bkVar) {
        super(bkVar);
    }
}
