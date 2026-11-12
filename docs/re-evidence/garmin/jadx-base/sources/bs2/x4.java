package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class x4 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20663e;

    static {
        bk bkVar = new bk("camera_exposure", 272);
        f20663e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("sample_time_offset", 1, 132, 1.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("camera_exposure_frame_time", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "s", false, zn.FLOAT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public x4() {
        super(wb.b(272));
    }

    public x4(bk bkVar) {
        super(bkVar);
    }
}
