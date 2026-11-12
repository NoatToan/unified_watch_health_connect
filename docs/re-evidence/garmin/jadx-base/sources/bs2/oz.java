package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class oz extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20391e;

    static {
        bk bkVar = new bk("ui_active_question", 68);
        f20391e = bkVar;
        bkVar.e(new rc("question_index", 0, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("response_value_default", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("response_string_default", 2, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public oz() {
        super(wb.b(68));
    }

    public oz(bk bkVar) {
        super(bkVar);
    }
}
