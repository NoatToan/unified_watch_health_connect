package og0;

import a73.j;
import android.content.Context;
import androidx.fragment.app.v;
import c22.j0;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.reusablecomponents.InlineUnitsTextFieldView;
import com.garmin.android.apps.connectmobile.workouts.data.model.k;
import com.garmin.android.apps.connectmobile.workouts.data.model.z;
import d53.w;
import e23.l;
import fg0.d;
import fg0.r;
import gg0.i;
import i3.e5;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import k52.g;
import lc.u0;
import m52.c;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.Weeks;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import qs.y;
import vb.h;
import vt1.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Log0/a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f131967a = new a();

    /* JADX INFO: renamed from: og0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2503a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f131969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f131970c;

        static {
            int[] iArr = new int[bg0.a.b.values().length];
            try {
                iArr[bg0.a.b.METER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bg0.a.b.KILOMETER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bg0.a.b.MILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[bg0.a.b.YARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f131968a = iArr;
            int[] iArr2 = new int[i.values().length];
            try {
                iArr2[i.METER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[i.KILOMETER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[i.MILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[i.YARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[i.HOUR.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[i.SECOND.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            f131969b = iArr2;
            int[] iArr3 = new int[c.values().length];
            try {
                iArr3[c.SWIMMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[c.LAP_SWIMMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[c.OPEN_WATER_SWIMMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[c.CYCLING.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[c.RUNNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            f131970c = iArr3;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"og0/a$b", "Lag0/b$b;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements ag0.b.InterfaceC0051b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Long, Unit> f131971a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super Long, Unit> lVar) {
            this.f131971a = lVar;
        }

        @Override // ag0.b.InterfaceC0051b
        public final void a(long j8) {
            this.f131971a.invoke(Long.valueOf(j8));
        }
    }

    private a() {
    }

    public static double A(double d14, int i14) {
        if (i14 >= 0) {
            double dPow = (long) Math.pow(10.0d, i14);
            return ((double) MathKt.b(d14 * dPow)) / dPow;
        }
        h.w();
        return 0.0d;
    }

    public static boolean B() {
        return !((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).c();
    }

    public static String C(String str, String str2, String str3, boolean z14) {
        String strD = hb2.h.d(Locale.getDefault());
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        if (!s.g(str3, strD) || str2.length() == 0) {
            return (str2.length() != 0 && z14) ? com.nimbusds.jose.shaded.gson.internal.a.h(str, " (", str2, ")") : str;
        }
        return str2;
    }

    public static double D(List list) {
        list.getClass();
        Iterator it = list.iterator();
        double dA = 0.0d;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            i unit = kVar.getUnit();
            y yVarD = unit != null ? unit.d() : null;
            Double value = kVar.getValue();
            if (value != null) {
                dA = g.a(value.doubleValue(), yVarD) + dA;
            }
        }
        return dA;
    }

    public static void E(v vVar, Context context, String str, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar, l lVar) {
        context.getClass();
        str.getClass();
        cVar.getClass();
        Integer transitionOutDurationSeconds = cVar.getTransitionOutDurationSeconds();
        long jIntValue = transitionOutDurationSeconds != null ? transitionOutDurationSeconds.intValue() : 0;
        String string = context.getString(R.string.common_abbrev_mm_ss_string);
        string.getClass();
        ag0.b.Z0.getClass();
        ag0.b bVarA = ag0.b.a.a(jIntValue, 0L, 1199L, str + " (" + string + ")", R.string.lbl_empty_string);
        String string2 = context.getString(R.string.lbl_done);
        String strD = p6.b.d(context, R.string.lbl_cancel, string2);
        b bVar = new b(lVar);
        bVarA.I = string2;
        bVarA.T = new j(bVar, bVarA, 2);
        bVarA.F = strD;
        bVarA.P = new j(bVarA, 3);
        bVarA.show(vVar, "GoalPacePicker");
    }

    public static DateTime a(LocalDate localDate, r rVar) {
        localDate.getClass();
        LocalTime localTimeF = rVar != null ? rVar.f() : null;
        DateTime dateTimeWithZone = new DateTime(localDate.getYear(), localDate.getMonthOfYear(), localDate.getDayOfMonth(), localTimeF != null ? localTimeF.getHourOfDay() : 0, localTimeF != null ? localTimeF.getMinuteOfHour() : 0).withZone(DateTimeZone.getDefault());
        dateTimeWithZone.getClass();
        return dateTimeWithZone;
    }

    public static String b(double d14, double d15) {
        l3.a aVar = l3.f23124b;
        long jD = (long) d(d14, d15);
        aVar.getClass();
        String strE1 = l3.a.e1(jD);
        return strE1 == null ? "" : strE1;
    }

    public static String c(Context context, double d14, double d15) {
        context.getClass();
        double d16 = d14 / d15;
        bg0.a.f17827a.getClass();
        double dA = bg0.a.C0255a.e() ? A(d16 * 1000.0d, 2) : A(d16 * 1609.344d, 2);
        List listW = w.W(String.valueOf(dA), new String[]{"."});
        Integer.parseInt((String) listW.get(0));
        Integer.parseInt((String) listW.get(1));
        l3.a aVar = l3.f23124b;
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        String string = context.getString(R.string.no_value);
        string.getClass();
        return aVar.r0(context, dA, zY, true, string);
    }

    public static double d(double d14, double d15) {
        bg0.a.f17827a.getClass();
        return e(d14, d15, bg0.a.C0255a.e());
    }

    public static double e(double d14, double d15, boolean z14) {
        double d16 = d15 != 0.0d ? d14 / d15 : 0.0d;
        return z14 ? A(d16 * 1000.0d, 0) : A(d16 * 1609.344d, 0);
    }

    public static z f(List list) {
        double d14;
        list.getClass();
        double D = D(list);
        bg0.a.f17827a.getClass();
        i iVar = bg0.a.C0255a.e() ? i.KILOMETER : i.MILE;
        if (bg0.a.C0255a.e()) {
            l3.f23124b.getClass();
            d14 = 1000.0d;
        } else {
            l3.f23124b.getClass();
            d14 = 1609.344d;
        }
        return new z(iVar, gg0.h.DISTANCE, Double.valueOf(D / d14));
    }

    public static double g(double d14, i iVar) {
        double d15;
        int i14 = iVar == null ? -1 : C2503a.f131969b[iVar.ordinal()];
        if (i14 == 1) {
            return d14;
        }
        if (i14 == 2) {
            l3.f23124b.getClass();
            d15 = 1000.0d;
        } else if (i14 == 3) {
            l3.f23124b.getClass();
            d15 = 1609.344d;
        } else {
            if (i14 != 4) {
                return 0.0d;
            }
            l3.f23124b.getClass();
            d15 = 0.9144d;
        }
        return d14 * d15;
    }

    public static n h(double d14) {
        fg0.v vVarL = l(d14);
        n nVar = n.FIVE_K;
        if (vVarL.b(nVar.f180173c)) {
            return nVar;
        }
        n nVar2 = n.TEN_K;
        if (vVarL.b(nVar2.f180173c)) {
            return nVar2;
        }
        n nVar3 = n.HALF_MARATHON;
        if (vVarL.b(nVar3.f180173c)) {
            return nVar3;
        }
        n nVar4 = n.MARATHON;
        return vVarL.b((double) nVar4.f180173c) ? nVar4 : n.OTHER;
    }

    public static String i(a aVar, double d14) {
        aVar.getClass();
        bg0.a.f17827a.getClass();
        if (bg0.a.C0255a.e()) {
            l3.f23124b.getClass();
            String str = new DecimalFormat("0.00").format(d14 / 1000.0d);
            str.getClass();
            return str;
        }
        l3.f23124b.getClass();
        String str2 = new DecimalFormat("0.00").format(d14 / 1609.344d);
        str2.getClass();
        return str2;
    }

    public static double j(double d14, i iVar) {
        iVar.getClass();
        int i14 = C2503a.f131969b[iVar.ordinal()];
        if (i14 == 5) {
            l3.f23124b.getClass();
            return l3.a.y((int) d14, 0, 0);
        }
        if (i14 != 6) {
            return 0.0d;
        }
        return d14;
    }

    public static String k(a aVar, Double d14, i iVar, Context context) {
        String str;
        String strQ;
        aVar.getClass();
        context.getClass();
        double dG = g(d14 != null ? d14.doubleValue() : 0.0d, iVar);
        bg0.a.f17827a.getClass();
        if (bg0.a.C0255a.e()) {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            l3.f23124b.getClass();
            str = decimalFormat.format(dG / 1000.0d);
            strQ = q(context);
        } else {
            DecimalFormat decimalFormat2 = new DecimalFormat("0.00");
            l3.f23124b.getClass();
            str = decimalFormat2.format(dG / 1609.344d);
            strQ = q(context);
        }
        return e5.g(str, StringUtils.SPACE, strQ);
    }

    public static fg0.v l(double d14) {
        double d15 = (((double) 5) * d14) / ((double) 100);
        return new fg0.v(gg0.h.DISTANCE.f77161a, Double.valueOf(d14 + d15), Double.valueOf(d14 - d15));
    }

    public static String m(Context context, d dVar, String str) {
        context.getClass();
        if (dVar.getUnitType() != gg0.h.DISTANCE) {
            l3.a aVar = l3.f23124b;
            Double value = dVar.getValue();
            Long lValueOf = value != null ? Long.valueOf((long) value.doubleValue()) : null;
            aVar.getClass();
            return context.getString(R.string.string_space_dot_space_string_pattern, l3.a.g1(lValueOf), str);
        }
        return context.getString(R.string.string_space_dot_space_string_pattern, dVar.d() + StringUtils.SPACE + u(context), str);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:58:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0142  */
    /* JADX WARN: Code duplicated, block: B:66:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0150  */
    /* JADX WARN: Code duplicated, block: B:68:0x015c  */
    public static String n(Context context, LocalDate localDate, r rVar, boolean z14) {
        DateTime dateTimeNow;
        int i14;
        boolean z15;
        boolean z16;
        String str;
        String str2;
        String string;
        int i15;
        int i16;
        int i17;
        context.getClass();
        if (localDate == null) {
            return null;
        }
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        boolean z17 = rVar != null;
        if (rVar == null || (dateTimeNow = rVar.d()) == null) {
            dateTimeNow = DateTime.now();
        }
        DateTime dateTimeA = a(localDate, rVar);
        int minutes = Minutes.minutesBetween(dateTimeNow, dateTimeA).getMinutes();
        int hours = Hours.hoursBetween(dateTimeNow, dateTimeA).getHours();
        int days = Days.daysBetween(dateTimeNow.toLocalDate(), dateTimeA.toLocalDate()).getDays();
        int weeks = Weeks.weeksBetween(dateTimeNow.toLocalDate(), dateTimeA.toLocalDate()).getWeeks();
        if (dateTimeNow.isAfter(dateTimeA) && z17) {
            return context.getString(R.string.label_started);
        }
        if (!z17 && g22.k.g(dateTimeA.toLocalDate(), dateTimeNow.toLocalDate())) {
            string = context.getString(R.string.mct_lbl_today);
        } else if (!z17) {
            LocalDate localDate2 = dateTimeA.toLocalDate();
            LocalDate localDate3 = dateTimeNow.toLocalDate();
            localDate3.getClass();
            if (g22.k.g(localDate2, jg.b.G(localDate3))) {
                string = context.getString(R.string.common_tomorrow);
            } else if (minutes < 60) {
                String str3 = integerInstance.format(Integer.valueOf(minutes));
                if (minutes == 1) {
                    i17 = R.string.in_singular_minute;
                } else {
                    i17 = R.string.in_num_minutes;
                }
                string = context.getString(i17, str3);
            } else if (hours < 24) {
                String str4 = integerInstance.format(Integer.valueOf(hours));
                if (hours == 1) {
                    i16 = R.string.in_singular_hour;
                } else {
                    i16 = R.string.in_num_hours;
                }
                string = context.getString(i16, str4);
            } else if (days < 7) {
                String str5 = integerInstance.format(Integer.valueOf(days));
                if (days == 1) {
                    i15 = R.string.in_singular_day;
                } else {
                    i15 = R.string.in_num_days;
                }
                string = context.getString(i15, str5);
            } else {
                i14 = days % 7;
                if (weeks == 1) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = i14 == 1;
                str = integerInstance.format(Integer.valueOf(weeks));
                str2 = integerInstance.format(Integer.valueOf(i14));
                if (i14 != 0 && z15) {
                    string = context.getString(R.string.in_singular_week, str);
                } else if (i14 != 0 && !z15) {
                    string = context.getString(R.string.in_num_weeks, str);
                } else if (!z15 && z16) {
                    string = context.getString(R.string.in_singular_week_singular_day, str, str2);
                } else if (z15) {
                    string = context.getString(R.string.in_singular_week_num_days, str, str2);
                } else if (z16) {
                    string = context.getString(R.string.in_num_weeks_singular_day, str, str2);
                } else {
                    string = context.getString(R.string.in_num_weeks_num_days, str, str2);
                }
            }
        } else if (minutes < 60) {
            String str6 = integerInstance.format(Integer.valueOf(minutes));
            if (minutes == 1) {
                i17 = R.string.in_singular_minute;
            } else {
                i17 = R.string.in_num_minutes;
            }
            string = context.getString(i17, str6);
        } else if (hours < 24) {
            String str7 = integerInstance.format(Integer.valueOf(hours));
            if (hours == 1) {
                i16 = R.string.in_singular_hour;
            } else {
                i16 = R.string.in_num_hours;
            }
            string = context.getString(i16, str7);
        } else if (days < 7) {
            String str8 = integerInstance.format(Integer.valueOf(days));
            if (days == 1) {
                i15 = R.string.in_singular_day;
            } else {
                i15 = R.string.in_num_days;
            }
            string = context.getString(i15, str8);
        } else {
            i14 = days % 7;
            if (weeks == 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (i14 == 1) {
            }
            str = integerInstance.format(Integer.valueOf(weeks));
            str2 = integerInstance.format(Integer.valueOf(i14));
            if (i14 != 0) {
                if (i14 != 0) {
                    if (!z15) {
                        if (z15) {
                            string = context.getString(R.string.in_singular_week_num_days, str, str2);
                        } else if (z16) {
                            string = context.getString(R.string.in_num_weeks_singular_day, str, str2);
                        } else {
                            string = context.getString(R.string.in_num_weeks_num_days, str, str2);
                        }
                    } else if (z15) {
                        string = context.getString(R.string.in_singular_week_num_days, str, str2);
                    } else if (z16) {
                        string = context.getString(R.string.in_num_weeks_singular_day, str, str2);
                    } else {
                        string = context.getString(R.string.in_num_weeks_num_days, str, str2);
                    }
                } else if (!z15) {
                    if (z15) {
                        string = context.getString(R.string.in_singular_week_num_days, str, str2);
                    } else if (z16) {
                        string = context.getString(R.string.in_num_weeks_singular_day, str, str2);
                    } else {
                        string = context.getString(R.string.in_num_weeks_num_days, str, str2);
                    }
                } else if (z15) {
                    string = context.getString(R.string.in_singular_week_num_days, str, str2);
                } else if (z16) {
                    string = context.getString(R.string.in_num_weeks_singular_day, str, str2);
                } else {
                    string = context.getString(R.string.in_num_weeks_num_days, str, str2);
                }
            } else if (i14 != 0) {
                if (!z15) {
                    if (z15) {
                        string = context.getString(R.string.in_singular_week_num_days, str, str2);
                    } else if (z16) {
                        string = context.getString(R.string.in_num_weeks_singular_day, str, str2);
                    } else {
                        string = context.getString(R.string.in_num_weeks_num_days, str, str2);
                    }
                } else if (z15) {
                    string = context.getString(R.string.in_singular_week_num_days, str, str2);
                } else if (z16) {
                    string = context.getString(R.string.in_num_weeks_singular_day, str, str2);
                } else {
                    string = context.getString(R.string.in_num_weeks_num_days, str, str2);
                }
            } else if (!z15) {
                if (z15) {
                    string = context.getString(R.string.in_singular_week_num_days, str, str2);
                } else if (z16) {
                    string = context.getString(R.string.in_num_weeks_singular_day, str, str2);
                } else {
                    string = context.getString(R.string.in_num_weeks_num_days, str, str2);
                }
            } else if (z15) {
                string = context.getString(R.string.in_singular_week_num_days, str, str2);
            } else if (z16) {
                string = context.getString(R.string.in_num_weeks_singular_day, str, str2);
            } else {
                string = context.getString(R.string.in_num_weeks_num_days, str, str2);
            }
        }
        string.getClass();
        return z14 ? context.getString(R.string.lbl_starts, string) : string;
    }

    public static String o(Context context, LocalDate localDate, r rVar, boolean z14) {
        String string;
        String strG = null;
        if (localDate == null) {
            return null;
        }
        DateTime dateTimeNow = DateTime.now();
        DateTime dateTimeA = a(localDate, rVar);
        String str = z14 ? "EEEE, MMMM d" : "EEE, MMM d";
        Date date = localDate.toDate();
        date.getClass();
        String strG2 = j0.g(date, str, null);
        if (g22.k.g(dateTimeA.toLocalDate(), dateTimeNow.toLocalDate())) {
            string = context.getString(R.string.mct_lbl_today);
        } else {
            LocalDate localDate2 = dateTimeA.toLocalDate();
            LocalDate localDate3 = dateTimeNow.toLocalDate();
            localDate3.getClass();
            string = g22.k.g(localDate2, jg.b.G(localDate3)) ? context.getString(R.string.common_tomorrow) : strG2;
        }
        string.getClass();
        if (rVar != null) {
            Date date2 = a(localDate, rVar).toDate();
            date2.getClass();
            strG = j0.g(date2, "h:mm a", null);
        }
        if (strG != null) {
            String string2 = z14 ? context.getString(R.string.social_date_at_time, string, strG) : e5.g(string, " @ ", strG);
            if (string2 != null) {
                return string2;
            }
        }
        return strG2;
    }

    public static DateTime p(LocalDate localDate, LocalTime localTime, String str) {
        return new DateTime(localDate.getYear(), localDate.getMonthOfYear(), localDate.getDayOfMonth(), localTime.getHourOfDay(), localTime.getMinuteOfHour(), DateTimeZone.forTimeZone(g22.n.d(str) ? TimeZone.getTimeZone(str) : null));
    }

    public static String q(Context context) {
        context.getClass();
        bg0.a.f17827a.getClass();
        if (bg0.a.C0255a.e()) {
            String string = context.getString(R.string.unit_enum_km);
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.unit_enum_mi);
        string2.getClass();
        return string2;
    }

    public static String r(Context context) {
        context.getClass();
        bg0.a.f17827a.getClass();
        if (bg0.a.C0255a.e()) {
            String string = context.getString(R.string.kilometers);
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.miles);
        string2.getClass();
        return string2;
    }

    public static String s(String str, String str2) {
        if (g22.n.d(str) && g22.n.d(str2)) {
            return e5.g(str2, " • ", str);
        }
        return g22.n.d(str) ? str.toString() : str2;
    }

    public static String u(Context context) {
        context.getClass();
        if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()) {
            String string = context.getString(R.string.unit_enum_km);
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.unit_enum_mi);
        string2.getClass();
        return string2;
    }

    public static final Integer v(bg0.a.b bVar) {
        bVar.getClass();
        int i14 = C2503a.f131968a[bVar.ordinal()];
        if (i14 == 1) {
            return 1609344;
        }
        if (i14 == 2) {
            return 1609;
        }
        if (i14 == 3) {
            return 1000;
        }
        if (i14 == 4) {
            return 1760000;
        }
        u0.r();
        return null;
    }

    public static bg0.a.b w(InlineUnitsTextFieldView.a aVar) {
        aVar.getClass();
        bg0.a.b bVar = bg0.a.b.METER;
        if (aVar.equals(new eg0.b(bVar))) {
            return bVar;
        }
        bg0.a.b bVar2 = bg0.a.b.KILOMETER;
        if (aVar.equals(new eg0.b(bVar2))) {
            return bVar2;
        }
        bg0.a.b bVar3 = bg0.a.b.MILE;
        if (aVar.equals(new eg0.b(bVar3))) {
            return bVar3;
        }
        bg0.a.b bVar4 = bg0.a.b.YARD;
        if (aVar.equals(new eg0.b(bVar4))) {
            return bVar4;
        }
        bg0.a.f17827a.getClass();
        return bg0.a.C0255a.a();
    }

    public static p x(double d14, double d15) {
        double d16 = d15 * d14;
        return new p(Double.valueOf(d14 - d16), Double.valueOf(d14 + d16));
    }

    public static p y(String str, String str2, boolean z14) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yy", Locale.getDefault());
        Date date = simpleDateFormat.parse(str);
        Date date2 = simpleDateFormat.parse(str2);
        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        Calendar calendar2 = Calendar.getInstance();
        if (date2 != null) {
            calendar2.setTime(date2);
        }
        int i14 = Calendar.getInstance().get(1);
        int i15 = calendar.get(1);
        int i16 = calendar2.get(1);
        int i17 = calendar.get(2);
        int i18 = calendar2.get(2);
        String str3 = "MMM d, yyyy";
        String str4 = (i15 < i16 || (i15 > i14 && i15 > i16) || (s.g(str, str2) && i15 > i14)) ? "MMM d, yyyy" : "MMM d";
        if (z14 && i15 == i16 && i15 == i14 && i17 == i18) {
            str3 = "d";
        } else if (i16 <= i14) {
            str3 = "MMM d";
        }
        j0.f23099a.getClass();
        return new p(j0.d(str, str4).toString(), j0.d(str2, str3).toString());
    }

    public static p z(long j8) {
        long j14 = 60;
        return new p(Integer.valueOf((int) (j8 / j14)), Integer.valueOf((int) (j8 % j14)));
    }

    public final p<String, String> t(Context context, k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar, c cVar2, boolean z14) {
        i unit;
        String strG;
        i unit2;
        String strK;
        Double value;
        i unit3;
        String strK2;
        Double value2;
        i unit4;
        Double value3;
        i unit5;
        Double value4;
        context.getClass();
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        double dA = g.a((kVar == null || (value4 = kVar.getValue()) == null) ? 0.0d : value4.doubleValue(), (kVar == null || (unit5 = kVar.getUnit()) == null) ? null : unit5.d());
        double dDoubleValue = (cVar == null || (value3 = cVar.getValue()) == null) ? 0.0d : value3.doubleValue();
        if (cVar == null || (unit = cVar.getUnit()) == null) {
            unit = i.SECOND;
        }
        double dJ = j(dDoubleValue, unit);
        l3.a aVar = l3.f23124b;
        aVar.getClass();
        String strE1 = l3.a.e1((long) dJ);
        String strK1 = l3.a.k1(new l22.a(context), true, (int) dJ);
        double d14 = dJ == 0.0d ? 0.0d : dA / dJ;
        int i14 = cVar2 == null ? -1 : C2503a.f131970c[cVar2.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            double d15 = d14;
            if (z14) {
                strG = (kVar != null ? kVar.getValue() : null) + StringUtils.SPACE + ((kVar == null || (unit2 = kVar.getUnit()) == null) ? null : unit2.c(context));
            } else {
                strG = e5.g(new DecimalFormat("0.00").format(dA), StringUtils.SPACE, i.METER.c(context));
            }
            String str = strG;
            String string = context.getString(R.string.enter_goal_speed);
            string.getClass();
            return new p<>(context.getString(R.string.string_bullet_string_bullet_string_pattern, str, strE1, aVar.M1(context, d15, true, true, string)), context.getString(R.string.string_bullet_string_bullet_string_pattern, str, strK1, com.nimbusds.jose.shaded.gson.internal.a.h(l3.a.k1(new l22.a(context), true, l3.a.r(d15, true)), context.getString(R.string.lbl_per), "100", context.getString(R.string.lbl_meter))));
        }
        if (i14 == 4) {
            if (z14) {
                strK = (kVar != null ? kVar.getValue() : null) + StringUtils.SPACE + ((kVar == null || (unit3 = kVar.getUnit()) == null) ? null : unit3.c(context));
            } else {
                strK = k(this, Double.valueOf((kVar == null || (value = kVar.getValue()) == null) ? 0.0d : value.doubleValue()), kVar != null ? kVar.getUnit() : null, context);
            }
            String str2 = strK;
            String strM0 = l3.a.M0(context, d14, zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR, l3.f23130h, true);
            return new p<>(context.getString(R.string.string_bullet_string_bullet_string_pattern, str2, strE1, strM0), context.getString(R.string.string_bullet_string_bullet_string_pattern, str2, strE1, strM0));
        }
        if (i14 != 5) {
            return new p<>("", "");
        }
        if (z14) {
            strK2 = (kVar != null ? kVar.getValue() : null) + StringUtils.SPACE + ((kVar == null || (unit4 = kVar.getUnit()) == null) ? null : unit4.c(context));
        } else {
            strK2 = k(this, Double.valueOf((kVar == null || (value2 = kVar.getValue()) == null) ? 0.0d : value2.doubleValue()), kVar != null ? kVar.getUnit() : null, context);
        }
        String string2 = context.getString(zY ? R.string.lbl_pace_unit_km : R.string.lbl_pace_unit_mi);
        string2.getClass();
        return new p<>(context.getString(R.string.string_bullet_string_bullet_string_pattern, strK2, strE1, e5.g(b(dJ, dA), StringUtils.SPACE, string2)), context.getString(R.string.string_bullet_string_bullet_string_pattern, strK2, strE1, e5.g(l3.a.k1(new l22.a(context), true, (int) d(dJ, dA)), StringUtils.SPACE, string2)));
    }
}
