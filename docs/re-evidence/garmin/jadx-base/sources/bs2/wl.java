package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class wl extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20651e;

    static {
        bk bkVar = new bk("nav_event", 261);
        f20651e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("nav_event", 0, 0, 1.0d, 0.0d, "", false, zn.NAV_EVENT));
        zn znVar = zn.SINT32;
        bkVar.e(new rc("position_lat", 1, 133, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("position_long", 2, 133, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("data", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public wl() {
        super(wb.b(261));
    }

    public wl(bk bkVar) {
        super(bkVar);
    }
}
