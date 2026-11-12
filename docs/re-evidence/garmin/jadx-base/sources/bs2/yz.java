package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class yz extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20700e;

    static {
        bk bkVar = new bk("ui_response", 69);
        f20700e = bkVar;
        bkVar.e(new rc("question_index", 0, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("response_value", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("response_string", 2, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public yz() {
        super(wb.b(69));
    }

    public yz(bk bkVar) {
        super(bkVar);
    }
}
