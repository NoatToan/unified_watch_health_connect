package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class f1 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20087e;

    static {
        bk bkVar = new bk("archery_x_coord", 501);
        f20087e = bkVar;
        zn znVar = zn.MESSAGE_INDEX;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("part_index", 250, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("parent_index", 0, 132, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.FLOAT32;
        bkVar.e(new rc("aim_x_coord", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("aim_y_coord", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public f1() {
        super(wb.b(501));
    }

    public f1(bk bkVar) {
        super(bkVar);
    }
}
