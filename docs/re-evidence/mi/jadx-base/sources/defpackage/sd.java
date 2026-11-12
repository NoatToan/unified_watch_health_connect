package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum sd {
    VDevice(-1),
    MILI(0),
    SENSORHUB(2),
    WEIGHT(1),
    SHOES(3),
    WATCH(4),
    OTHER(5),
    TREADMILL(6),
    HEADSET(7),
    BLOOD_PRESSURE(8),
    EARBUD(9),
    HEARING_AID(12);

    public int t;

    sd(int i) {
        this.t = i;
    }

    public int a() {
        return this.t;
    }
}
