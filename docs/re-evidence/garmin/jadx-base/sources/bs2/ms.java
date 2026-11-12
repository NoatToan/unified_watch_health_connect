package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes11.dex */
public class ms extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20318e;

    static {
        bk bkVar = new bk("set_summary", 295);
        f20318e = bkVar;
        bkVar.e(new rc("time_stamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("message_index", 0, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("set_number", 1, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("bike_position", 2, 0, 1.0d, 0.0d, "", false, zn.BIKE_POSITION));
        bkVar.e(new rc("bike_equipment", 3, 0, 1.0d, 0.0d, "", false, zn.BIKE_EQUIPMENT));
        bkVar.e(new rc("cda", 4, 132, 1000.0d, 0.0d, "m^2", false, znVar));
        bkVar.e(new rc(Constants.IPC_BUNDLE_KEY_SEND_ERROR, 5, 132, 1000.0d, 0.0d, "m^2", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ms() {
        super(wb.b(295));
    }

    public ms(bk bkVar) {
        super(bkVar);
    }
}
