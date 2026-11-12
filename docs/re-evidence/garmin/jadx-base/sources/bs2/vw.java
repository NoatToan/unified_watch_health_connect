package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class vw extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20633e;

    static {
        bk bkVar = new bk("subwave_diver_message_event", 424);
        f20633e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("msg_direction", 0, 0, 1.0d, 0.0d, "", false, zn.SUBWAVE_MSG_DIRECTION));
        bkVar.e(new rc("subwave_msg_id", 1, 0, 1.0d, 0.0d, "", false, zn.SUBWAVE_MSG_ID));
        zn znVar = zn.STRING;
        bkVar.e(new rc("message_body_text", 2, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("message_data_text", 3, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("message_data", 4, 2, 1.0d, 0.0d, "s", false, zn.UINT8));
        bkVar.e(new rc("message_data_type", 5, 0, 1.0d, 0.0d, "", false, zn.SUBWAVE_MESSAGE_DATA_TYPE));
        bkVar.e(new rc("src_dest_text", 6, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("src_dest_ant_id", 7, 140, 1.0d, 0.0d, "", false, zn.ANT_CHANNEL_ID));
        zn znVar2 = zn.BOOL;
        bkVar.e(new rc("broadcast", 8, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("msg_about_me", 9, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public vw() {
        super(wb.b(424));
    }

    public vw(bk bkVar) {
        super(bkVar);
    }
}
