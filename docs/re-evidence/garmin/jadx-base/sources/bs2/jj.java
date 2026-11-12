package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class jj extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20233e;

    static {
        bk bkVar = new bk("map_profile_extended", 239);
        f20233e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("custom_map_name", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("map_type", 2, 0, 1.0d, 0.0d, "", false, zn.MAP_TYPE));
        bkVar.e(new rc("map_id", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("gamma_value", 4, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, zn.FLOAT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public jj() {
        super(wb.b(239));
    }

    public jj(bk bkVar) {
        super(bkVar);
    }
}
