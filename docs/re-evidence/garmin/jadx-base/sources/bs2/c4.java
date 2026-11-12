package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class c4 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19774e;

    static {
        bk bkVar = new bk("bridge_inter_cal_bin", TsExtractor.TS_STREAM_TYPE_E_AC3);
        f19774e = bkVar;
        bkVar.e(new rc("message_index", 0, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("bridge", 1, 132, 16.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public c4() {
        super(wb.b(TsExtractor.TS_STREAM_TYPE_E_AC3));
    }

    public c4(bk bkVar) {
        super(bkVar);
    }
}
