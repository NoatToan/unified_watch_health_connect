package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.messaging.Constants;
import com.mapbox.turf.TurfConstants;

/* JADX INFO: loaded from: classes11.dex */
public class kz extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20271e;

    static {
        bk bkVar = new bk("tsb_sonar_message_event", 364);
        f20271e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("sonar_packet_id", 0, 0, 1.0d, 0.0d, "", false, zn.SONAR_PACKET_ID));
        bkVar.e(new rc("ant_id", 1, 140, 1.0d, 0.0d, "", false, zn.ANT_CHANNEL_ID));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("slot_num", 2, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("rssi", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("total_distance", 4, 132, 1.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("pressure", 5, 132, 1.0d, 0.0d, "psi", false, znVar3));
        bkVar.e(new rc("depth", 6, 132, 1.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("battery", 7, 2, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("dest_id", 8, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc(Constants.MessagePayloadKeys.MSGID_SERVER, 9, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("message_data", 10, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar4 = zn.SINT32;
        bkVar.e(new rc("diver_latitude", 11, 133, 1.0d, 0.0d, "semicircles", false, znVar4));
        bkVar.e(new rc("diver_longitude", 12, 133, 1.0d, 0.0d, "semicircles", false, znVar4));
        bkVar.e(new rc("tsb_latitude", 13, 133, 1.0d, 0.0d, "semicircles", false, znVar4));
        bkVar.e(new rc("tsb_longitude", 14, 133, 1.0d, 0.0d, "semicircles", false, znVar4));
        bkVar.e(new rc("diver_heading_angle", 15, 132, 1.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar3));
        bkVar.e(new rc("tsb_heading_angle", 16, 132, 1.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar3));
        bkVar.e(new rc("horizontal_distance", 17, 132, 1.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("tsb_battery", 18, 132, 1.0d, 0.0d, "%", false, znVar3));
        bkVar.e(new rc("retransmit_count", 19, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar5 = zn.STRING;
        bkVar.e(new rc("message_text", 20, 7, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("diver_location_accuracy", 21, 132, 1.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar3));
        bkVar.e(new rc(Constants.MessagePayloadKeys.MESSAGE_TYPE, 22, 0, 1.0d, 0.0d, "", false, zn.SONAR_MESSAGE_TYPE));
        bkVar.e(new rc("message_source", 23, 0, 1.0d, 0.0d, "", false, zn.SONAR_MESSAGE_SOURCE));
        bkVar.e(new rc("info_id", 24, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("info_resp", 25, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("diver_destination", 26, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("formatted_message_data", 27, 7, 1.0d, 0.0d, "", false, znVar5));
        zn znVar6 = zn.BOOL;
        bkVar.e(new rc("broadcast", 28, 0, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("ack_type", 29, 0, 1.0d, 0.0d, "", false, zn.SONAR_ACK_TYPE));
        bkVar.e(new rc("sent_to_topside", 30, 0, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("source_id", 31, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("emergency", 32, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("nav_context", 33, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("ut_heading_to_st_deg", 34, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, zn.FLOAT32));
        bkVar.e(new rc("converted_device_id", 35, 140, 1.0d, 0.0d, "", false, zn.UINT32Z));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public kz() {
        super(wb.b(364));
    }

    public kz(bk bkVar) {
        super(bkVar);
    }
}
