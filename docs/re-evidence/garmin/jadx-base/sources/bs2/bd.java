package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class bd extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19748e;

    static {
        bk bkVar = new bk("file_capabilities", 37);
        f19748e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 0, 0, 1.0d, 0.0d, "", false, zn.FILE));
        bkVar.e(new rc("flags", 1, 10, 1.0d, 0.0d, "", false, zn.FILE_FLAGS));
        bkVar.e(new rc("directory", 2, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("max_count", 3, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("max_size", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "bytes", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public bd() {
        super(wb.b(37));
    }

    public bd(bk bkVar) {
        super(bkVar);
    }
}
