package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class qf extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20431e;

    static {
        bk bkVar = new bk("guest_round_info", 433);
        f20431e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.STRING;
        bkVar.e(new rc("player_name", 0, 7, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("player_index", 1, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("tee_box_used", 2, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("tee_box_slope", 3, 2, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.FLOAT32;
        bkVar.e(new rc("tee_box_rating", 4, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar3));
        zn znVar4 = zn.GOLF_TEE_BOX;
        bkVar.e(new rc("tee_box_type", 5, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("second_tee_box_used", 6, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("second_tee_box_slope", 7, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("second_tee_box_rating", 8, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("second_tee_box_type", 9, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public qf() {
        super(wb.b(433));
    }

    public qf(bk bkVar) {
        super(bkVar);
    }
}
