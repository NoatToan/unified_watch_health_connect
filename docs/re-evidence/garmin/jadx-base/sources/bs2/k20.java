package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class k20 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20251e;

    static {
        bk bkVar = new bk("whrm_activity_level", 199);
        f20251e = bkVar;
        bkVar.e(new rc("fractional_timestamp", 0, 132, 32768.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("activity_level", 1, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("raw32", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public k20() {
        super(wb.b(199));
    }

    public k20(bk bkVar) {
        super(bkVar);
    }
}
