package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes11.dex */
public class m10 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20293e;

    static {
        bk bkVar = new bk(MimeTypes.BASE_TYPE_VIDEO, SyslogConstants.LOG_LOCAL7);
        f20293e = bkVar;
        zn znVar = zn.STRING;
        bkVar.e(new rc("url", 0, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("hosting_provider", 1, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("duration", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "ms", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public m10() {
        super(wb.b(SyslogConstants.LOG_LOCAL7));
    }

    public m10(bk bkVar) {
        super(bkVar);
    }
}
