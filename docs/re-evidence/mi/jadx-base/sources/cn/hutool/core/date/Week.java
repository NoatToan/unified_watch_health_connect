package cn.hutool.core.date;

/* JADX INFO: loaded from: classes.dex */
public enum Week {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    private final int value;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5511a;

        static {
            int[] iArr = new int[Week.values().length];
            f5511a = iArr;
            try {
                iArr[Week.SUNDAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5511a[Week.MONDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5511a[Week.TUESDAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5511a[Week.WEDNESDAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5511a[Week.THURSDAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5511a[Week.FRIDAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5511a[Week.SATURDAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    Week(int i) {
        this.value = i;
    }

    public static Week of(int i) {
        switch (i) {
            case 1:
                return SUNDAY;
            case 2:
                return MONDAY;
            case 3:
                return TUESDAY;
            case 4:
                return WEDNESDAY;
            case 5:
                return THURSDAY;
            case 6:
                return FRIDAY;
            case 7:
                return SATURDAY;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }

    public String toChinese() {
        return toChinese("星期");
    }

    public String toChinese(String str) {
        switch (a.f5511a[ordinal()]) {
            case 1:
                return str + "日";
            case 2:
                return str + "一";
            case 3:
                return str + "二";
            case 4:
                return str + "三";
            case 5:
                return str + "四";
            case 6:
                return str + "五";
            case 7:
                return str + "六";
            default:
                return null;
        }
    }
}
