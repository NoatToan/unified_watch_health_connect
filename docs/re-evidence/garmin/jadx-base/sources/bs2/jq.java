package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class jq extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20237e;

    static {
        bk bkVar = new bk("round_info_2", 286);
        f20237e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("second_tee_box_used", 0, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("second_tee_box_slope", 1, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("second_tee_box_rating", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, zn.FLOAT32));
        bkVar.e(new rc("second_tee_box_type", 3, 0, 1.0d, 0.0d, "", false, zn.GOLF_TEE_BOX));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public jq() {
        super(wb.b(286));
    }

    public jq(bk bkVar) {
        super(bkVar);
    }
}
