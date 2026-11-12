package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class gi extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20167e;

    static {
        bk bkVar = new bk("inertial_event", 44);
        f20167e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("time256", 0, 2, 256.0d, 0.0d, "s", false, zn.UINT8));
        bkVar.f19753c.get(1).f20459h.add(new vc(3, false, 8, 256.0d, 0.0d));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 1, 0, 1.0d, 0.0d, "", false, zn.INERTIAL_EVENT_TYPE));
        zn znVar = zn.BYTE;
        bkVar.e(new rc("data", 2, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("fractional_timestamp", 3, 132, 32768.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar));
    }

    public gi() {
        super(wb.b(44));
    }

    public gi(bk bkVar) {
        super(bkVar);
    }
}
