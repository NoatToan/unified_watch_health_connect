package bs2;

/* JADX INFO: loaded from: classes11.dex */
public enum ve {
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_LW(0),
    /* JADX INFO: Fake field, exist only in values array */
    DRIVER(1),
    /* JADX INFO: Fake field, exist only in values array */
    WOOD_3(2),
    /* JADX INFO: Fake field, exist only in values array */
    WOOD_5(3),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_1(4),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_2(5),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_3(6),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_4(7),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_5(8),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_6(9),
    /* JADX INFO: Fake field, exist only in values array */
    IRON_1(10),
    /* JADX INFO: Fake field, exist only in values array */
    IRON_2(11),
    /* JADX INFO: Fake field, exist only in values array */
    IRON_3(12),
    /* JADX INFO: Fake field, exist only in values array */
    IRON_4(13),
    /* JADX INFO: Fake field, exist only in values array */
    IRON_5(14),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_SW(15),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_LW(16),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_SW(17),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_LW(18),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_SW(19),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_LW(20),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_SW(21),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_LW(22),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_SW(23),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_LW(24),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_SW(25),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_LW(26),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_SW(27),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_LW(28),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_SW(29),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_LW(30),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_SW(31),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_LW(32),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_SW(33),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_LW(34),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_SW(35),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_LW(36),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_SW(37),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_LW(38),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_SW(39),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_LW(40),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_SW(41),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_LW(42),
    INVALID(255);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f20622a;

    ve(short s8) {
        this.f20622a = s8;
    }

    public static ve a(Short sh3) {
        for (ve veVar : values()) {
            if (sh3.shortValue() == veVar.f20622a) {
                return veVar;
            }
        }
        return INVALID;
    }
}
