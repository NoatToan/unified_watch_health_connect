package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class e10 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20069e;

    static {
        bk bkVar = new bk("video_clip", 187);
        f20069e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("clip_number", 0, 132, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.DATE_TIME;
        bkVar.e(new rc("start_timestamp", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("start_timestamp_ms", 2, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("end_timestamp", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("end_timestamp_ms", 4, 132, 1.0d, 0.0d, "", false, znVar));
        zn znVar3 = zn.UINT32;
        bkVar.e(new rc("clip_start", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "ms", false, znVar3));
        bkVar.e(new rc("clip_end", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "ms", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public e10() {
        super(wb.b(187));
    }

    public e10(bk bkVar) {
        super(bkVar);
    }
}
