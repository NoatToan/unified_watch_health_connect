package bs2;

/* JADX INFO: loaded from: classes11.dex */
public enum gf {
    OFF(0),
    GPS(1),
    GPS_GLONASS(2),
    /* JADX INFO: Fake field, exist only in values array */
    POWER_SAVING(3),
    /* JADX INFO: Fake field, exist only in values array */
    AUTO_GLONASS(4),
    GPS_GALILEO(5),
    /* JADX INFO: Fake field, exist only in values array */
    GPS_BEIDOU(6),
    /* JADX INFO: Fake field, exist only in values array */
    MULTI_GNSS(7),
    /* JADX INFO: Fake field, exist only in values array */
    MULTI_GNSS_DUAL_BAND(8),
    /* JADX INFO: Fake field, exist only in values array */
    AUTO_GNSS(9),
    /* JADX INFO: Fake field, exist only in values array */
    SELECTION_REQUIRED(254),
    INVALID(255);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f20164a;

    gf(short s8) {
        this.f20164a = s8;
    }
}
