package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class c00 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19767e;

    static {
        bk bkVar = new bk("underwater_waypoint", 414);
        f19767e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("waypoint_type", 0, 0, 1.0d, 0.0d, "", false, zn.UNDERWATER_WAYPOINT_TYPE));
        bkVar.e(new rc("depth", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, zn.UINT32));
        zn znVar = zn.SINT32;
        bkVar.e(new rc("position_lat", 2, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        bkVar.e(new rc("position_long", 3, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        bkVar.e(new rc("source_name", 4, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public c00() {
        super(wb.b(414));
    }

    public c00(bk bkVar) {
        super(bkVar);
    }
}
