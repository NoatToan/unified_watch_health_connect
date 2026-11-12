package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class fp extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20139e;

    static {
        bk bkVar = new bk("rally_x10_resample", 445);
        f20139e = bkVar;
        bkVar.e(new rc("timestamp_32k", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 32768.0d, 0.0d, "s", false, zn.UINT32));
        zn znVar = zn.FLOAT32;
        bkVar.e(new rc("accel", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("gyro", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("strain", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public fp() {
        super(wb.b(445));
    }

    public fp(bk bkVar) {
        super(bkVar);
    }
}
