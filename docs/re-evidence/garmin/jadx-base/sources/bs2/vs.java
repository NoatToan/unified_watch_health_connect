package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class vs extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20630e;

    static {
        bk bkVar = new bk("shot_timer", 490);
        f20630e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("drill_mode", 0, 0, 1.0d, 0.0d, "", false, zn.SHOT_TIMER_MODE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public vs() {
        super(wb.b(490));
    }

    public vs(bk bkVar) {
        super(bkVar);
    }
}
