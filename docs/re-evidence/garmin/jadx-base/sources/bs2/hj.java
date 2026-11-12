package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class hj extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20192e;

    static {
        bk bkVar = new bk("map_imagery_raster_providers", 399);
        f20192e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("provider_id", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public hj() {
        super(wb.b(399));
    }

    public hj(bk bkVar) {
        super(bkVar);
    }
}
