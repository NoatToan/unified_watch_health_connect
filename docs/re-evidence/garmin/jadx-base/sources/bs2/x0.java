package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes11.dex */
public class x0 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20659e;

    static {
        bk bkVar = new bk("ant_measurement_output", 287);
        f20659e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("fractional_timestamp", 0, 132, 32768.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc(TtmlNode.ATTR_ID, 1, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("value", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, zn.FLOAT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public x0() {
        super(wb.b(287));
    }

    public x0(bk bkVar) {
        super(bkVar);
    }
}
