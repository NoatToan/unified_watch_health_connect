package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class c7 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19775e;

    static {
        bk bkVar = new bk("delta_zone", 11);
        f19775e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 1, 0, 1.0d, 0.0d, "", false, zn.DELTA_TARGET));
        bkVar.e(new rc("value", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("name", 3, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("delta", 4, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public c7() {
        super(wb.b(11));
    }

    public c7(bk bkVar) {
        super(bkVar);
    }
}
