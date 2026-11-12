package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class dt extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20061e;

    static {
        bk bkVar = new bk("skin_temp_reading", 397);
        f20061e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("local_timestamp", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("deviation", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, zn.FLOAT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public dt() {
        super(wb.b(397));
    }

    public dt(bk bkVar) {
        super(bkVar);
    }
}
