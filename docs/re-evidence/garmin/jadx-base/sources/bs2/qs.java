package bs2;

/* JADX INFO: loaded from: classes11.dex */
public enum qs {
    /* JADX INFO: Fake field, exist only in values array */
    REGULAR(0),
    /* JADX INFO: Fake field, exist only in values array */
    STIFF(1),
    /* JADX INFO: Fake field, exist only in values array */
    EXTRA_STIFF(2),
    /* JADX INFO: Fake field, exist only in values array */
    SENIOR(3),
    /* JADX INFO: Fake field, exist only in values array */
    LADIES(4),
    /* JADX INFO: Fake field, exist only in values array */
    STIFF_REGULAR(5),
    INVALID(255);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f20440a;

    qs(short s8) {
        this.f20440a = s8;
    }

    public static qs a(Short sh3) {
        for (qs qsVar : values()) {
            if (sh3.shortValue() == qsVar.f20440a) {
                return qsVar;
            }
        }
        return INVALID;
    }
}
