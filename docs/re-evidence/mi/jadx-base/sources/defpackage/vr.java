package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum vr {
    UNKNOWN(0),
    GSENSOR(1),
    PPG(2),
    ECG(4),
    NMEA(8),
    GYRO(16),
    ADATA(32),
    GEO(64),
    TIME(128),
    SPO2(256),
    HR(512),
    PRESSURE(1024),
    PP(16384),
    BAROMETER(32768),
    BODY_TEMPERATURE(65536),
    TOUCH_DATA(128);

    public int t;

    vr(int i) {
        this.t = i;
    }

    public static vr b(int i) {
        for (vr vrVar : values()) {
            if ((vrVar.a() >> i) == 1) {
                return vrVar;
            }
        }
        return UNKNOWN;
    }

    public int a() {
        return this.t;
    }

    public static vr a(int i) {
        for (vr vrVar : values()) {
            if (vrVar.a() == i) {
                return vrVar;
            }
        }
        return UNKNOWN;
    }
}
