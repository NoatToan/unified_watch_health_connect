package bs2;

import com.garmin.android.gncs.NotificationConstants;

/* JADX INFO: loaded from: classes11.dex */
public class cy extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20041e;

    static {
        bk bkVar = new bk("tracking_session", 422);
        f20041e = bkVar;
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 0, 0, 1.0d, 0.0d, "", false, zn.TRACKING_SESSION_TYPE));
        bkVar.e(new rc("uuid", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public cy() {
        super(wb.b(422));
    }

    public cy(bk bkVar) {
        super(bkVar);
    }
}
