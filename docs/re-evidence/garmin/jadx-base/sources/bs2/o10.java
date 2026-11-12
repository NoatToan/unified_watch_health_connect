package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class o10 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20370e;

    static {
        bk bkVar = new bk("video_settings", 218);
        f20370e = bkVar;
        bkVar.e(new rc("resolution", 0, 2, 1.0d, 0.0d, "", false, zn.VIDEO_RESOLUTION));
        bkVar.e(new rc("overlay", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.VIDEO_OVERLAY_BITS));
        bkVar.e(new rc("auto_record_on_startup", 2, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public o10() {
        super(wb.b(218));
    }

    public o10(bk bkVar) {
        super(bkVar);
    }
}
