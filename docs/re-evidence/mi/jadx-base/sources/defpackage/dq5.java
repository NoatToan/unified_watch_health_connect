package defpackage;

import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DayType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.TimeSubType;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class dq5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f15803b = Pattern.compile("^[0-9零一二两三四五六七八九千]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Calendar f15804a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f15806b;

        static {
            int[] iArr = new int[DateType.values().length];
            f15806b = iArr;
            try {
                iArr[DateType.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15806b[DateType.LUNARDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15806b[DateType.DATETIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15806b[DateType.DURATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[DayType.values().length];
            f15805a = iArr2;
            try {
                iArr2[DayType.EARLY_MORNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15805a[DayType.MORNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15805a[DayType.FORENOON.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15805a[DayType.NOON.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15805a[DayType.AFTERNOON.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15805a[DayType.EVENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15805a[DayType.NIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public dq5(int i, int i2, int i3, int i4, int i5, int i6) {
        this(i, i2, i3, i4, i5, i6, null);
    }

    public static dq5 a(String str) throws ParseException {
        return b(str, null);
    }

    public static dq5 b(String str, TimeZone timeZone) throws ParseException {
        return new dq5(u(str, timeZone), timeZone);
    }

    public static mq5 c(dq5 dq5Var, dq5 dq5Var2, DateType dateType) {
        return d(dq5Var, dq5Var2, dateType, false);
    }

    public static mq5 d(dq5 dq5Var, dq5 dq5Var2, DateType dateType, boolean z) {
        mq5 mq5Var = new mq5(dateType);
        if (dq5Var == null) {
            return mq5Var;
        }
        TimeZone timeZoneP = dq5Var.p();
        int i = a.f15806b[dateType.ordinal()];
        if (i == 1) {
            mq5Var.q(new dq5(dq5Var).D(DateType.DATE.getFormat(), timeZoneP));
            mq5Var.k(GrainType.DATE);
            mq5Var.n(TimeSubType.CONCRETE);
        } else if (i == 2) {
            mq5Var.q(new dq5(dq5Var).D(DateType.LUNARDATE.getFormat(), timeZoneP));
            mq5Var.k(GrainType.DATE);
            mq5Var.n(TimeSubType.CONCRETE);
        } else if (i == 3) {
            mq5Var.q(new dq5(dq5Var).D(DateType.DATETIME.getFormat(), timeZoneP));
            mq5Var.k(GrainType.DATETIME);
        } else if (i == 4) {
            dq5 dq5Var3 = new dq5(dq5Var);
            DateType dateType2 = DateType.DURATION;
            mq5Var.m(dq5Var3.D(dateType2.getFormat(), timeZoneP));
            mq5Var.h(new dq5(dq5Var2).D(dateType2.getFormat(), timeZoneP));
        }
        if (z) {
            mq5Var.i(z);
        }
        return mq5Var;
    }

    public static long j(String str) throws ParseException {
        return k(str, null);
    }

    public static long k(String str, TimeZone timeZone) throws ParseException {
        return u(str, timeZone).getTime();
    }

    public static ljh<dq5, dq5> n(dq5 dq5Var, DayType dayType) {
        dq5 dq5VarM;
        dq5 dq5VarM2;
        switch (a.f15805a[dayType.ordinal()]) {
            case 1:
                dq5VarM = dq5Var.M(0, 0, 0);
                dq5VarM2 = dq5Var.M(6, 0, 0);
                break;
            case 2:
                dq5VarM = dq5Var.M(6, 0, 0);
                dq5VarM2 = dq5Var.M(8, 0, 0);
                break;
            case 3:
                dq5VarM = dq5Var.M(8, 0, 0);
                dq5VarM2 = dq5Var.M(11, 0, 0);
                break;
            case 4:
                dq5VarM = dq5Var.M(11, 0, 0);
                dq5VarM2 = dq5Var.M(12, 0, 0);
                break;
            case 5:
                dq5VarM = dq5Var.M(12, 0, 0);
                dq5VarM2 = dq5Var.M(17, 0, 0);
                break;
            case 6:
                dq5VarM = dq5Var.M(17, 0, 0);
                dq5VarM2 = dq5Var.M(18, 0, 0);
                break;
            case 7:
                dq5VarM = dq5Var.M(18, 0, 0);
                dq5VarM2 = dq5Var.M(23, 59, 59);
                break;
            default:
                dq5VarM = dq5Var.M(0, 0, 0);
                dq5VarM2 = dq5Var.M(6, 0, 0);
                break;
        }
        return new ljh<>(dq5VarM, dq5VarM2);
    }

    public static boolean r(int i, String str) {
        if (!f15803b.matcher(str).matches()) {
            return false;
        }
        if ((i >= 10 || str.startsWith("零") || str.startsWith("0")) && i <= 3000) {
            return i <= 100 || i >= 1000;
        }
        return false;
    }

    public static int s(DayType dayType, int i) {
        int i2 = a.f15805a[dayType.ordinal()];
        if (i2 != 4) {
            if (i2 == 5 || i2 == 6) {
                if (i > 12) {
                    return i;
                }
            } else if (i2 != 7 || i < 5 || i > 12) {
                return i;
            }
        } else if (i > 2) {
            return i;
        }
        return i + 12;
    }

    public static int t(int i) {
        if (i < 20) {
            return i + 2000;
        }
        return i < 100 ? i + 1900 : i;
    }

    public static Date u(String str, TimeZone timeZone) throws ParseException {
        if (jlo.b(str)) {
            return new Date();
        }
        SimpleDateFormat simpleDateFormat = str.contains("T") ? new SimpleDateFormat(ParserHelper.DATA_FORMAT4) : new SimpleDateFormat("yyyy-MM-dd");
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        try {
            return simpleDateFormat.parse(str);
        } catch (Exception unused) {
            return new Date();
        }
    }

    public dq5 A(int i) {
        return v(i * 7);
    }

    public dq5 B(int i) {
        Calendar calendar = (Calendar) this.f15804a.clone();
        calendar.add(1, i);
        return new dq5(calendar);
    }

    public String C(String str) {
        return D(str, null);
    }

    public String D(String str, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat.format(this.f15804a.getTime());
    }

    public dq5 E(int i) {
        Calendar calendar = (Calendar) this.f15804a.clone();
        calendar.set(5, i);
        return new dq5(calendar);
    }

    public dq5 F(int i) {
        Calendar calendar = (Calendar) this.f15804a.clone();
        calendar.set(7, i != 7 ? 1 + i : 1);
        return new dq5(calendar);
    }

    public dq5 G(int i) {
        Calendar calendar = (Calendar) this.f15804a.clone();
        calendar.set(11, i);
        return new dq5(calendar);
    }

    public dq5 H() {
        Calendar calendar = (Calendar) this.f15804a.clone();
        calendar.set(5, calendar.getActualMaximum(5));
        return new dq5(calendar);
    }

    public dq5 I() {
        Calendar calendar = (Calendar) this.f15804a.clone();
        calendar.set(5, calendar.getActualMinimum(5));
        return new dq5(calendar);
    }

    public dq5 J(int i) {
        Calendar calendar = (Calendar) this.f15804a.clone();
        calendar.set(12, i);
        return new dq5(calendar);
    }

    public dq5 K(int i) {
        Calendar calendar = (Calendar) this.f15804a.clone();
        calendar.set(2, i - 1);
        return new dq5(calendar);
    }

    public dq5 L(int i) {
        Calendar calendar = (Calendar) this.f15804a.clone();
        this.f15804a.set(13, i);
        return new dq5(calendar);
    }

    public dq5 M(int i, int i2, int i3) {
        Calendar calendar = (Calendar) this.f15804a.clone();
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, i3);
        return new dq5(calendar);
    }

    public dq5 N() {
        return M(23, 59, 59);
    }

    public dq5 O() {
        return M(0, 0, 0);
    }

    public dq5 P(int i) {
        Calendar calendar = (Calendar) this.f15804a.clone();
        calendar.set(1, i);
        return new dq5(calendar);
    }

    public int e() {
        return this.f15804a.get(5);
    }

    public int f() {
        int i = this.f15804a.get(7);
        if (i == 1) {
            return 7;
        }
        return i - 1;
    }

    public int g() {
        return this.f15804a.get(11);
    }

    public int h() {
        return this.f15804a.getActualMaximum(5);
    }

    public long i() {
        return this.f15804a.getTimeInMillis();
    }

    public int l() {
        return this.f15804a.get(12);
    }

    public int m() {
        return this.f15804a.get(2) + 1;
    }

    public int o() {
        return this.f15804a.get(13);
    }

    public TimeZone p() {
        return this.f15804a.getTimeZone();
    }

    public int q() {
        return this.f15804a.get(1);
    }

    public String toString() {
        return D(ParserHelper.DATA_FORMAT4, this.f15804a.getTimeZone());
    }

    public dq5 v(int i) {
        Calendar calendar = (Calendar) this.f15804a.clone();
        calendar.add(6, i);
        return new dq5(calendar);
    }

    public dq5 w(int i) {
        Calendar calendar = (Calendar) this.f15804a.clone();
        calendar.add(11, i);
        return new dq5(calendar);
    }

    public dq5 x(int i) {
        Calendar calendar = (Calendar) this.f15804a.clone();
        calendar.add(12, i);
        return new dq5(calendar);
    }

    public dq5 y(int i) {
        Calendar calendar = (Calendar) this.f15804a.clone();
        calendar.add(2, i);
        return new dq5(calendar);
    }

    public dq5 z(int i) {
        Calendar calendar = (Calendar) this.f15804a.clone();
        calendar.add(13, i);
        return new dq5(calendar);
    }

    public dq5() {
        Calendar calendar = Calendar.getInstance();
        this.f15804a = calendar;
        calendar.setFirstDayOfWeek(2);
    }

    public dq5(TimeZone timeZone) {
        if (timeZone == null) {
            this.f15804a = Calendar.getInstance();
        } else {
            this.f15804a = Calendar.getInstance(timeZone);
        }
        this.f15804a.setFirstDayOfWeek(2);
    }

    public dq5(Calendar calendar) {
        this.f15804a = calendar;
        calendar.setFirstDayOfWeek(2);
    }

    public dq5(dq5 dq5Var) {
        Calendar calendar = (Calendar) dq5Var.f15804a.clone();
        this.f15804a = calendar;
        calendar.setFirstDayOfWeek(2);
    }

    public dq5(int i, int i2, int i3, int i4, int i5, int i6, TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        calendar.set(1, i);
        calendar.set(2, i2 - 1);
        calendar.set(5, i3);
        calendar.set(11, i4);
        calendar.set(12, i5);
        calendar.set(13, i6);
        this.f15804a = calendar;
        calendar.setFirstDayOfWeek(2);
    }

    public dq5(Date date, TimeZone timeZone) {
        if (timeZone == null) {
            this.f15804a = Calendar.getInstance();
        } else {
            this.f15804a = Calendar.getInstance(timeZone);
        }
        this.f15804a.setTime(date);
        this.f15804a.setFirstDayOfWeek(2);
    }

    public dq5(long j, TimeZone timeZone) {
        if (timeZone == null) {
            this.f15804a = Calendar.getInstance();
        } else {
            this.f15804a = Calendar.getInstance(timeZone);
        }
        this.f15804a.setTimeInMillis(j);
        this.f15804a.setFirstDayOfWeek(2);
    }
}
