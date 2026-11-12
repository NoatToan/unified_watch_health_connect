package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class k8 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20254e;

    static {
        bk bkVar = new bk("dog_bark_quality_factor", 283);
        f20254e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("bark_quality_factor", 0, 0, 1.0d, 0.0d, "", false, zn.BARK_QUALITY_FACTOR));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public k8() {
        super(wb.b(283));
    }

    public k8(bk bkVar) {
        super(bkVar);
    }
}
