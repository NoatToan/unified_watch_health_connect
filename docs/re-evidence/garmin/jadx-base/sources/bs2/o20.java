package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes11.dex */
public class o20 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20371e;

    static {
        bk bkVar = new bk("whrm_event", MlKitException.CODE_SCANNER_TASK_IN_PROGRESS);
        f20371e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        zn znVar = zn.BYTE;
        bkVar.e(new rc("data", 1, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("fractional_timestamp", 2, 132, 32768.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar));
    }

    public o20() {
        super(wb.b(MlKitException.CODE_SCANNER_TASK_IN_PROGRESS));
    }

    public o20(bk bkVar) {
        super(bkVar);
    }
}
