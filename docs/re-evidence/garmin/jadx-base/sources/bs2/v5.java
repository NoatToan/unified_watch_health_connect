package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class v5 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20612e;

    static {
        bk bkVar = new bk("connectivity", 127);
        f20612e = bkVar;
        zn znVar = zn.BOOL;
        bkVar.e(new rc("bluetooth_enabled", 0, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("bluetooth_le_enabled", 1, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("ant_enabled", 2, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("name", 3, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("live_tracking_enabled", 4, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("weather_conditions_enabled", 5, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("weather_alerts_enabled", 6, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("auto_activity_upload_enabled", 7, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("course_download_enabled", 8, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("workout_download_enabled", 9, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("gps_ephemeris_download_enabled", 10, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("incident_detection_enabled", 11, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("grouptrack_enabled", 12, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("live_track_auto_start_enabled", 13, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("text_reply_signature_enabled", 14, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("bluetooth_during_sleep_enabled", 15, 0, 1.0d, 0.0d, "", false, zn.SWITCH));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public v5() {
        super(wb.b(127));
    }

    public v5(bk bkVar) {
        super(bkVar);
    }
}
