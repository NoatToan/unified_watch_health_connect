package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class m8 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20306e;

    static {
        bk bkVar = new bk("dog_containment", 253);
        f20306e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("dog_containment_event", 0, 0, 1.0d, 0.0d, "", false, zn.DOG_CONTAINMENT_EVENT));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public m8() {
        super(wb.b(253));
    }

    public m8(bk bkVar) {
        super(bkVar);
    }
}
