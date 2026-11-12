package com.huami.watch.companion.sport.pb;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'RUN_3_KM' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes16.dex */
public final class PBType {
    private static final /* synthetic */ PBType[] $VALUES;
    public static final PBType CLIMB_HIGHEST_ALTITUDE_M;
    public static final PBType CLIMB_LONGEST_CLIMBING_M;
    public static final PBType CLIMB_MOST_DOWN_M;
    public static final PBType CLIMB_MOST_UP_M;
    public static final PBType FULL_MARATHON_SHORTEST_TIME;
    public static final PBType HALF_MARATHON_SHORTEST_TIME;
    public static final PBType RIDE_10_KM;
    public static final PBType RIDE_10_MI;
    public static final PBType RIDE_20_KM;
    public static final PBType RIDE_20_MI;
    public static final PBType RIDE_40_KM;
    public static final PBType RIDE_40_MI;
    public static final PBType RIDE_5_KM;
    public static final PBType RIDE_5_MI;
    public static final PBType RIDE_FURTHEST_KM;
    public static final PBType RIDE_LONGEST_TIME;
    public static final PBType RIDE_MOST_UP_M;
    public static final PBType RUN_10_KM;
    public static final PBType RUN_10_MI;
    public static final PBType RUN_3_KM;
    public static final PBType RUN_3_MI;
    public static final PBType RUN_5_KM;
    public static final PBType RUN_5_MI;
    public static final PBType RUN_FURTHEST_KM;
    public static final PBType RUN_LONGEST_TIME;
    private String name;
    private int showType;
    private PBConfig.Unit unit;

    static {
        PBType pBType = new PBType("RUN_FURTHEST_KM", 0, "run_furthest_km", 1);
        RUN_FURTHEST_KM = pBType;
        PBType pBType2 = new PBType("RUN_LONGEST_TIME", 1, "run_longest_time", 1);
        RUN_LONGEST_TIME = pBType2;
        PBConfig.Unit unit = PBConfig.Unit.METRIC;
        PBType pBType3 = new PBType("RUN_3_KM", 2, "run_3_km", 1, unit);
        RUN_3_KM = pBType3;
        PBType pBType4 = new PBType("RUN_5_KM", 3, "run_5_km", 1, unit);
        RUN_5_KM = pBType4;
        PBType pBType5 = new PBType("RUN_10_KM", 4, "run_10_km", 1, unit);
        RUN_10_KM = pBType5;
        PBConfig.Unit unit2 = PBConfig.Unit.IMPERIAL;
        PBType pBType6 = new PBType("RUN_3_MI", 5, "run_3_mi", 1, unit2);
        RUN_3_MI = pBType6;
        PBType pBType7 = new PBType("RUN_5_MI", 6, "run_5_mi", 1, unit2);
        RUN_5_MI = pBType7;
        PBType pBType8 = new PBType("RUN_10_MI", 7, "run_10_mi", 1, unit2);
        RUN_10_MI = pBType8;
        PBType pBType9 = new PBType("HALF_MARATHON_SHORTEST_TIME", 8, "half_marathon_shortest_time", 1);
        HALF_MARATHON_SHORTEST_TIME = pBType9;
        PBType pBType10 = new PBType("FULL_MARATHON_SHORTEST_TIME", 9, "full_marathon_shortest_time", 1);
        FULL_MARATHON_SHORTEST_TIME = pBType10;
        PBType pBType11 = new PBType("RIDE_FURTHEST_KM", 10, "ride_furthest_km", 2);
        RIDE_FURTHEST_KM = pBType11;
        PBType pBType12 = new PBType("RIDE_LONGEST_TIME", 11, "ride_longest_time", 2);
        RIDE_LONGEST_TIME = pBType12;
        PBType pBType13 = new PBType("RIDE_MOST_UP_M", 12, "ride_most_up_m", 2);
        RIDE_MOST_UP_M = pBType13;
        PBType pBType14 = new PBType("RIDE_5_KM", 13, "ride_5_km", 2, unit);
        RIDE_5_KM = pBType14;
        PBType pBType15 = new PBType("RIDE_10_KM", 14, "ride_10_km", 2, unit);
        RIDE_10_KM = pBType15;
        PBType pBType16 = new PBType("RIDE_20_KM", 15, "ride_20_km", 2, unit);
        RIDE_20_KM = pBType16;
        PBType pBType17 = new PBType("RIDE_40_KM", 16, "ride_40_km", 2, unit);
        RIDE_40_KM = pBType17;
        PBType pBType18 = new PBType("RIDE_5_MI", 17, "ride_5_mi", 2, unit2);
        RIDE_5_MI = pBType18;
        PBType pBType19 = new PBType("RIDE_10_MI", 18, "ride_10_mi", 2, unit2);
        RIDE_10_MI = pBType19;
        PBType pBType20 = new PBType("RIDE_20_MI", 19, "ride_20_mi", 2, unit2);
        RIDE_20_MI = pBType20;
        PBType pBType21 = new PBType("RIDE_40_MI", 20, "ride_40_mi", 2, unit2);
        RIDE_40_MI = pBType21;
        PBType pBType22 = new PBType("CLIMB_HIGHEST_ALTITUDE_M", 21, "climb_highest_altitude_m", 4);
        CLIMB_HIGHEST_ALTITUDE_M = pBType22;
        PBType pBType23 = new PBType("CLIMB_MOST_UP_M", 22, "climb_most_up_m", 4);
        CLIMB_MOST_UP_M = pBType23;
        PBType pBType24 = new PBType("CLIMB_MOST_DOWN_M", 23, "climb_most_down_m", 4);
        CLIMB_MOST_DOWN_M = pBType24;
        PBType pBType25 = new PBType("CLIMB_LONGEST_CLIMBING_M", 24, "climb_longest_climbing_m", 4);
        CLIMB_LONGEST_CLIMBING_M = pBType25;
        $VALUES = new PBType[]{pBType, pBType2, pBType3, pBType4, pBType5, pBType6, pBType7, pBType8, pBType9, pBType10, pBType11, pBType12, pBType13, pBType14, pBType15, pBType16, pBType17, pBType18, pBType19, pBType20, pBType21, pBType22, pBType23, pBType24, pBType25};
    }

    private PBType(String str, int i, String str2, int i2) {
        super(str, i);
        this.name = str2;
        this.showType = i2;
        this.unit = PBConfig.Unit.NONE;
    }

    public static PBType find(String str) {
        for (PBType pBType : values()) {
            if (pBType.name.equals(str)) {
                return pBType;
            }
        }
        return null;
    }

    public static PBType valueOf(String str) {
        return (PBType) Enum.valueOf(PBType.class, str);
    }

    public static PBType[] values() {
        return (PBType[]) $VALUES.clone();
    }

    public String getName() {
        return this.name;
    }

    public int getShowType() {
        return this.showType;
    }

    public PBConfig.Unit getUnit() {
        return this.unit;
    }

    private PBType(String str, int i, String str2, int i2, PBConfig.Unit unit) {
        super(str, i);
        this.name = str2;
        this.showType = i2;
        this.unit = unit;
    }
}
