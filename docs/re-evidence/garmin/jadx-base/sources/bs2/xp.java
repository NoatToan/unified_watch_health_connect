package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class xp extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20672e;

    static {
        bk bkVar = new bk("raw_track_mesg", 429);
        f20672e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.SINT32;
        bkVar.e(new rc("position_lat", 0, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        bkVar.e(new rc("position_lon", 1, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        bkVar.e(new rc("distance", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public xp() {
        super(wb.b(429));
    }

    public xp(bk bkVar) {
        super(bkVar);
    }
}
