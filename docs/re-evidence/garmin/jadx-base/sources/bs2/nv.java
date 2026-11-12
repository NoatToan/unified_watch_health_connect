package bs2;

/* JADX INFO: loaded from: classes11.dex */
public enum nv {
    GENERIC(0),
    RUNNING(1),
    CYCLING(2),
    TRANSITION(3),
    FITNESS_EQUIPMENT(4),
    SWIMMING(5),
    BASKETBALL(6),
    SOCCER(7),
    /* JADX INFO: Fake field, exist only in values array */
    TENNIS(8),
    AMERICAN_FOOTBALL(9),
    TRAINING(10),
    WALKING(11),
    CROSS_COUNTRY_SKIING(12),
    /* JADX INFO: Fake field, exist only in values array */
    ALPINE_SKIING(13),
    /* JADX INFO: Fake field, exist only in values array */
    SNOWBOARDING(14),
    ROWING(15),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(16),
    HIKING(17),
    MULTISPORT(18),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(19),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(20),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(21),
    MOTORCYCLING(22),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(23),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(24),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(25),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(26),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(27),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(28),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(29),
    INLINE_SKATING(30),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(31),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(32),
    ICE_SKATING(33),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(34),
    SNOWSHOEING(35),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(36),
    STAND_UP_PADDLEBOARDING(37),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(38),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(39),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(40),
    KAYAKING(41),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(42),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(43),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(44),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(45),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(46),
    BOXING(47),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(48),
    BASEBALL(49),
    SOFTBALL_FAST_PITCH(50),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(51),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(52),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(53),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(54),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(55),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(56),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(57),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(58),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(59),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(60),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(61),
    HIIT(62),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(63),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(64),
    WHEELCHAIR_PUSH_WALK(65),
    WHEELCHAIR_PUSH_RUN(66),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(67),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(68),
    DISC_GOLF(69),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(70),
    CRICKET(71),
    RUGBY(72),
    HOCKEY(73),
    LACROSSE(74),
    VOLLEYBALL(75),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(76),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(77),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(78),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(79),
    MIXED_MARTIAL_ARTS(80),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(81),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(82),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(83),
    JUMP_ROPE(84),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(85),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(86),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(87),
    /* JADX INFO: Fake field, exist only in values array */
    CANOEING(88),
    /* JADX INFO: Fake field, exist only in values array */
    ALL(254),
    INVALID(255);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f20362a;

    nv(short s8) {
        this.f20362a = s8;
    }

    public static nv a(Short sh3) {
        for (nv nvVar : values()) {
            if (sh3.shortValue() == nvVar.f20362a) {
                return nvVar;
            }
        }
        return INVALID;
    }
}
