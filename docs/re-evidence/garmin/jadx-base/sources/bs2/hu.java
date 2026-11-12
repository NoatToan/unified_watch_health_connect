package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes11.dex */
public class hu extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20199e;

    static {
        bk bkVar = new bk("sonar_message_event", 363);
        f20199e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.STRING;
        bkVar.e(new rc("displayed_message", 0, 7, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.BOOL;
        bkVar.e(new rc("message_unknown", 1, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("sonar_packet_id", 2, 0, 1.0d, 0.0d, "", false, zn.SONAR_PACKET_ID));
        zn znVar3 = zn.UINT8;
        bkVar.e(new rc(Constants.MessagePayloadKeys.MSGID_SERVER, 3, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("message_data", 4, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("formatted_message_data", 5, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(Constants.MessagePayloadKeys.MESSAGE_TYPE, 6, 0, 1.0d, 0.0d, "", false, zn.SONAR_MESSAGE_TYPE));
        bkVar.e(new rc("source_ant_id", 7, 140, 1.0d, 0.0d, "", false, zn.ANT_CHANNEL_ID));
        bkVar.e(new rc("broadcast", 8, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("ack_type", 9, 0, 1.0d, 0.0d, "", false, zn.SONAR_ACK_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public hu() {
        super(wb.b(363));
    }

    public hu(bk bkVar) {
        super(bkVar);
    }
}
