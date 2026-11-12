package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.common.HttpHeaders;

/* JADX INFO: loaded from: classes11.dex */
public class ne extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20330e;

    static {
        bk bkVar = new bk("gnss_injct_posn", 329);
        f20330e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.SINT32;
        bkVar.e(new rc("posn_lat", 0, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        bkVar.e(new rc("posn_lon", 1, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc(HttpHeaders.AGE, 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("accuracy", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("altitude", 4, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "m", false, zn.FLOAT32));
        bkVar.e(new rc("alt_info", 5, 2, 1.0d, 0.0d, "enum", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ne() {
        super(wb.b(329));
    }

    public ne(bk bkVar) {
        super(bkVar);
    }
}
