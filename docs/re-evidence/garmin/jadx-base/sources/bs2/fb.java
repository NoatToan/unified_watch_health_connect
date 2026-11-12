package bs2;

/* JADX INFO: loaded from: classes11.dex */
public enum fb {
    START(0),
    STOP(1),
    CONSECUTIVE_DEPRECIATED(2),
    MARKER(3),
    STOP_ALL(4),
    BEGIN_DEPRECIATED(5),
    END_DEPRECIATED(6),
    END_ALL_DEPRECIATED(7),
    STOP_DISABLE(8),
    STOP_DISABLE_ALL(9),
    /* JADX INFO: Fake field, exist only in values array */
    PAUSE(10),
    /* JADX INFO: Fake field, exist only in values array */
    RESUME(11),
    /* JADX INFO: Fake field, exist only in values array */
    INITIAL_START(12),
    INVALID(255);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f20128a;

    fb(short s8) {
        this.f20128a = s8;
    }

    public static fb a(Short sh3) {
        for (fb fbVar : values()) {
            if (sh3.shortValue() == fbVar.f20128a) {
                return fbVar;
            }
        }
        return INVALID;
    }
}
