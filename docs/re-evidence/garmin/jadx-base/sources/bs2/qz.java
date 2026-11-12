package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class qz extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20444e;

    static {
        bk bkVar = new bk("ui_bar_graph_option", 77);
        f20444e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("group", 0, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("text", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("value", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public qz() {
        super(wb.b(77));
    }

    public qz(bk bkVar) {
        super(bkVar);
    }
}
