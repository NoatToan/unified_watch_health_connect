package cn.hutool.core.date;

import java.time.temporal.ChronoUnit;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'MINUTE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class DateUnit {
    private static final /* synthetic */ DateUnit[] $VALUES;
    public static final DateUnit DAY;
    public static final DateUnit HOUR;
    public static final DateUnit MINUTE;
    public static final DateUnit MS;
    public static final DateUnit SECOND;
    public static final DateUnit WEEK;
    private final long millis;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5510b;

        static {
            int[] iArr = new int[DateUnit.values().length];
            f5510b = iArr;
            try {
                iArr[DateUnit.MS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5510b[DateUnit.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5510b[DateUnit.MINUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5510b[DateUnit.HOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5510b[DateUnit.DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5510b[DateUnit.WEEK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[ChronoUnit.values().length];
            f5509a = iArr2;
            try {
                iArr2[ChronoUnit.MICROS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5509a[ChronoUnit.SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5509a[ChronoUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5509a[ChronoUnit.HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5509a[ChronoUnit.DAYS.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5509a[ChronoUnit.WEEKS.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        DateUnit dateUnit = new DateUnit("MS", 0, 1L);
        MS = dateUnit;
        DateUnit dateUnit2 = new DateUnit("SECOND", 1, 1000L);
        SECOND = dateUnit2;
        DateUnit dateUnit3 = new DateUnit("MINUTE", 2, dateUnit2.getMillis() * 60);
        MINUTE = dateUnit3;
        DateUnit dateUnit4 = new DateUnit("HOUR", 3, dateUnit3.getMillis() * 60);
        HOUR = dateUnit4;
        DateUnit dateUnit5 = new DateUnit("DAY", 4, dateUnit4.getMillis() * 24);
        DAY = dateUnit5;
        DateUnit dateUnit6 = new DateUnit("WEEK", 5, dateUnit5.getMillis() * 7);
        WEEK = dateUnit6;
        $VALUES = new DateUnit[]{dateUnit, dateUnit2, dateUnit3, dateUnit4, dateUnit5, dateUnit6};
    }

    private DateUnit(String str, int i, long j) {
        super(str, i);
        this.millis = j;
    }

    public static DateUnit of(ChronoUnit chronoUnit) {
        switch (a.f5509a[chronoUnit.ordinal()]) {
            case 1:
                return MS;
            case 2:
                return SECOND;
            case 3:
                return MINUTE;
            case 4:
                return HOUR;
            case 5:
                return DAY;
            case 6:
                return WEEK;
            default:
                return null;
        }
    }

    public static DateUnit valueOf(String str) {
        return (DateUnit) Enum.valueOf(DateUnit.class, str);
    }

    public static DateUnit[] values() {
        return (DateUnit[]) $VALUES.clone();
    }

    public long getMillis() {
        return this.millis;
    }

    public ChronoUnit toChronoUnit() {
        return toChronoUnit(this);
    }

    public static ChronoUnit toChronoUnit(DateUnit dateUnit) {
        switch (a.f5510b[dateUnit.ordinal()]) {
            case 1:
                return ChronoUnit.MICROS;
            case 2:
                return ChronoUnit.SECONDS;
            case 3:
                return ChronoUnit.MINUTES;
            case 4:
                return ChronoUnit.HOURS;
            case 5:
                return ChronoUnit.DAYS;
            case 6:
                return ChronoUnit.WEEKS;
            default:
                return null;
        }
    }
}
