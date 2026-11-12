package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class o8 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20373e;

    static {
        bk bkVar = new bk("dog_correction", 224);
        f20373e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("source", 0, 0, 1.0d, 0.0d, "", false, zn.DOG_CORRECTION_SOURCE));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 1, 2, 1.0d, 0.0d, "", false, zn.DOG_CORRECTION_TYPE));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("intensity", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("duration", 3, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("serial_number", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public o8() {
        super(wb.b(224));
    }

    public o8(bk bkVar) {
        super(bkVar);
    }
}
