package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class nj extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20331e;

    static {
        bk bkVar = new bk("map_user_behavior", 340);
        f20331e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("map_event", 0, 140, 1.0d, 0.0d, "", false, zn.MAP_EVENT));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public nj() {
        super(wb.b(340));
    }

    public nj(bk bkVar) {
        super(bkVar);
    }
}
