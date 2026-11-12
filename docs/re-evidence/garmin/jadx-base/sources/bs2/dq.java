package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class dq extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20058e;

    static {
        bk bkVar = new bk("respiration_rate", 297);
        f20058e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("respiration_rate", 0, 131, 100.0d, 0.0d, "breaths/min", false, zn.SINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public dq() {
        super(wb.b(297));
    }

    public dq(bk bkVar) {
        super(bkVar);
    }
}
