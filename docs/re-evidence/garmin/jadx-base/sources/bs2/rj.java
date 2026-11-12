package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class rj extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20462e;

    static {
        bk bkVar = new bk("mct_user_behavior", 320);
        f20462e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("mct_event", 0, 140, 1.0d, 0.0d, "", false, zn.MCT_EVENT));
        bkVar.e(new rc("mct_popup", 1, 0, 1.0d, 0.0d, "", false, zn.MCT_POPUP));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public rj() {
        super(wb.b(320));
    }

    public rj(bk bkVar) {
        super(bkVar);
    }
}
