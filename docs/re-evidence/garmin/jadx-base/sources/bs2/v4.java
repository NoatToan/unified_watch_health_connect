package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class v4 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20611e;

    static {
        bk bkVar = new bk("camera_event", 161);
        f20611e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, zn.UINT16));
        bkVar.e(new rc("camera_event_type", 1, 0, 1.0d, 0.0d, "", false, zn.CAMERA_EVENT_TYPE));
        bkVar.e(new rc("camera_file_uuid", 2, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("camera_orientation", 3, 0, 1.0d, 0.0d, "", false, zn.CAMERA_ORIENTATION_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public v4() {
        super(wb.b(161));
    }

    public v4(bk bkVar) {
        super(bkVar);
    }
}
