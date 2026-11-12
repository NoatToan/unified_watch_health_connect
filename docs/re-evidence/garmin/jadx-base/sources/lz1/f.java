package lz1;

import am.x0;
import android.content.Context;
import c22.j0;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import f12.l;
import fg0.r;
import gg0.h;
import gg0.i;
import i3.e5;
import java.util.List;
import lc.u0;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llz1/f;", "", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f115404a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f115405b;

    static {
        int i14 = gt2.c.f79010a;
        f115405b = gt2.b.f79005a.h("TrainingInitiativeUtil");
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Llz1/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "", "COMPRESS_QUALITY", "I", "", "DEFAULT_LATITUDE", "D", "DEFAULT_LONGITUDE", "EXTRA_GARMIN_COACH_DTO", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: lz1.f$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2199a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f115406a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f115407b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f115408c;

            static {
                int[] iArr = new int[bg0.a.b.values().length];
                try {
                    iArr[bg0.a.b.MILE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[bg0.a.b.METER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[bg0.a.b.KILOMETER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[bg0.a.b.YARD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f115406a = iArr;
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
                f115407b = iArr2;
                int[] iArr3 = new int[gg0.f.values().length];
                try {
                    iArr3[gg0.f.f77130f.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr3[gg0.f.f77131g.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr3[gg0.f.f77132h.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[gg0.f.f77134j.ordinal()] = 4;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr3[gg0.f.f77133i.ordinal()] = 5;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr3[gg0.f.f77138n.ordinal()] = 6;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr3[gg0.f.f77144v.ordinal()] = 7;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr3[gg0.f.f77136l.ordinal()] = 8;
                } catch (NoSuchFieldError unused16) {
                }
                f115408c = iArr3;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static DateTime a(LocalDate localDate, r rVar) {
            LocalTime localTimeF = rVar.f();
            DateTimeZone dateTimeZoneB = rVar.b();
            if (localTimeF == null || dateTimeZoneB == null) {
                return null;
            }
            return new DateTime(localDate.getYear(), localDate.getMonthOfYear(), localDate.getDayOfMonth(), localTimeF.getHourOfDay(), localTimeF.getMinuteOfHour(), dateTimeZoneB);
        }

        public static p b(Context context, double d14, double d15, boolean z14) {
            if (z14) {
                double d16 = d14 / d15;
                q3 q3Var = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                l3.f23124b.getClass();
                String strL0 = l3.a.L0(d16, q3Var, l3.f23130h);
                String string = context.getString(R.string.string_space_string_bracket_pattern, context.getString(R.string.lbl_course_goal_speed), context.getString(q3Var.f23223e));
                string.getClass();
                return new p(string, strL0);
            }
            double d17 = d15 / d14;
            bg0.a.f17827a.getClass();
            double dO = bg0.a.C0255a.e() ? o(d17 * 1000.0d, 0) : o(d17 * 1609.344d, 0);
            l3.f23124b.getClass();
            String strE1 = l3.a.e1((long) dO);
            if (strE1 == null) {
                strE1 = "";
            }
            String strV = u.v(strE1, ".", ":", false);
            String string2 = context.getString(R.string.string_space_string_bracket_pattern, context.getString(R.string.lbl_course_goal_pace), context.getString(bg0.a.C0255a.e() ? R.string.lbl_minute_per_km : R.string.lbl_minute_per_mile));
            string2.getClass();
            return new p(string2, strV);
        }

        public static double c(fg0.d dVar) {
            double dDoubleValue;
            double d14;
            Double value = dVar.getValue();
            if (value == null) {
                return 0.0d;
            }
            i unit = dVar.getUnit();
            int i14 = unit == null ? -1 : C2199a.f115407b[unit.ordinal()];
            if (i14 == 1) {
                return value.doubleValue();
            }
            if (i14 == 2) {
                l3.a aVar = l3.f23124b;
                dDoubleValue = value.doubleValue();
                aVar.getClass();
                d14 = 1000.0d;
            } else if (i14 == 3) {
                l3.a aVar2 = l3.f23124b;
                dDoubleValue = value.doubleValue();
                aVar2.getClass();
                d14 = 1609.344d;
            } else {
                if (i14 != 4) {
                    return 0.0d;
                }
                l3.a aVar3 = l3.f23124b;
                dDoubleValue = value.doubleValue();
                aVar3.getClass();
                d14 = 0.9144d;
            }
            return dDoubleValue * d14;
        }

        public static double d(bg0.a.c cVar) {
            double dDoubleValue;
            double d14;
            Number number = cVar.f17834a;
            int i14 = C2199a.f115406a[cVar.f17835b.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        l3.a aVar = l3.f23124b;
                        dDoubleValue = number != null ? number.doubleValue() : 0.0d;
                        aVar.getClass();
                        d14 = 1000.0d;
                    } else if (i14 == 4) {
                        l3.a aVar2 = l3.f23124b;
                        dDoubleValue = number != null ? number.doubleValue() : 0.0d;
                        aVar2.getClass();
                        d14 = 0.9144d;
                    }
                } else if (number != null) {
                    return number.doubleValue();
                }
                return 0.0d;
            }
            l3.a aVar3 = l3.f23124b;
            dDoubleValue = number != null ? number.doubleValue() : 0.0d;
            aVar3.getClass();
            d14 = 1609.344d;
            return dDoubleValue * d14;
        }

        public static bg0.a.c e(double d14) {
            bg0.a.f17827a.getClass();
            if (bg0.a.C0255a.e()) {
                l3.f23124b.getClass();
                return new bg0.a.c(Double.valueOf(o(d14 / 1000.0d, 2)), bg0.a.b.KILOMETER);
            }
            l3.f23124b.getClass();
            return new bg0.a.c(Double.valueOf(o(d14 / 1609.344d, 2)), bg0.a.b.MILE);
        }

        public static x0 f(gg0.f fVar) {
            switch (fVar == null ? -1 : C2199a.f115408c[fVar.ordinal()]) {
                case 1:
                    return x0.f4308n;
                case 2:
                    return x0.J0;
                case 3:
                    return x0.f4312o;
                case 4:
                    return x0.V0;
                case 5:
                    return x0.Z0;
                case 6:
                    return x0.f4320q;
                case 7:
                    return x0.f4346x;
                default:
                    return null;
            }
        }

        public static List g(gg0.f fVar) {
            int i14 = fVar == null ? -1 : C2199a.f115408c[fVar.ordinal()];
            if (i14 == 3) {
                return x.k(x0.f4312o, x0.X0);
            }
            if (i14 == 8) {
                return x.k(x0.f4312o, x0.Z0, x0.V0, x0.X0, x0.f4308n, x0.J0);
            }
            x0 x0VarF = f(fVar);
            if (x0VarF == null) {
                return null;
            }
            return w.c(x0VarF);
        }

        public static String h(Context context, fg0.d dVar) {
            String string;
            context.getClass();
            String strA = null;
            if (dVar.getUnitType() == h.TIME) {
                l3.a aVar = l3.f23124b;
                Double value = dVar.getValue();
                Long lValueOf = value != null ? Long.valueOf((long) value.doubleValue()) : null;
                aVar.getClass();
                return l3.a.g1(lValueOf);
            }
            l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
            if (lVar != null) {
                string = lVar.y() ? context.getString(R.string.lbl_km) : context.getString(R.string.lbl_mile);
            } else {
                string = null;
            }
            Double dB = dVar.b();
            if (dB != null) {
                double dDoubleValue = dB.doubleValue();
                lz1.a.f115397a.getClass();
                strA = lz1.a.C2198a.a(dDoubleValue);
            }
            return e5.g(strA, StringUtils.SPACE, string);
        }

        public static i i(bg0.a.c cVar) {
            bg0.a.b bVarA;
            if (cVar != null) {
                bVarA = cVar.f17835b;
            } else {
                bg0.a.f17827a.getClass();
                bVarA = bg0.a.C0255a.a();
            }
            int i14 = C2199a.f115406a[bVarA.ordinal()];
            if (i14 == 1) {
                return i.MILE;
            }
            if (i14 == 2) {
                return i.METER;
            }
            if (i14 == 3) {
                return i.KILOMETER;
            }
            if (i14 == 4) {
                return i.YARD;
            }
            u0.r();
            return null;
        }

        public static double j(bg0.a.b bVar, double d14) {
            double d15;
            bVar.getClass();
            int i14 = C2199a.f115406a[bVar.ordinal()];
            if (i14 == 1) {
                l3.f23124b.getClass();
                d15 = 1609.344d;
            } else {
                if (i14 == 2) {
                    return d14;
                }
                if (i14 == 3) {
                    l3.f23124b.getClass();
                    d15 = 1000.0d;
                } else {
                    if (i14 != 4) {
                        u0.r();
                        return 0.0d;
                    }
                    l3.f23124b.getClass();
                    d15 = 0.9144d;
                }
            }
            return d14 * d15;
        }

        public static p k(Context context, DateTime dateTime, DateTime dateTime2) {
            String strJ = u0.j(context.getString(R.string.pregnancy_week_abbreviation));
            String strJ2 = u0.j(context.getString(R.string.lbl_abbreviation_day));
            String string = context.getString(R.string.common_weeks_label);
            String strD = p6.b.d(context, R.string.common_days, string);
            String string2 = context.getString(R.string.lbl_hours_abbreviation);
            String strD2 = p6.b.d(context, R.string.lbl_minutes_abbreviation, string2);
            String string3 = context.getString(R.string.common_minutes_label);
            String strD3 = p6.b.d(context, R.string.lbl_hours, string3);
            int days = Days.daysBetween(dateTime.toLocalDate(), dateTime2.toLocalDate()).getDays();
            if (days >= 7) {
                int i14 = days / 7;
                int i15 = days % 7;
                if (i15 == 0 && i14 == 0) {
                    return new p("", "");
                }
                if (i14 == 0) {
                    return new p(org.apache.commons.lang3.e.d(i15, StringUtils.SPACE, strJ2), org.apache.commons.lang3.e.d(i15, StringUtils.SPACE, strD));
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i14);
                sb3.append(StringUtils.SPACE);
                sb3.append(strJ);
                sb3.append(StringUtils.SPACE);
                sb3.append(i15);
                String strO = am.j.o(StringUtils.SPACE, strJ2, sb3);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i14);
                sb4.append(StringUtils.SPACE);
                sb4.append(string);
                sb4.append(StringUtils.SPACE);
                sb4.append(i15);
                return new p(strO, am.j.o(StringUtils.SPACE, strD, sb4));
            }
            if (days > 1 && days < 7) {
                return new p(androidx.core.view.j.f(days, " d"), org.apache.commons.lang3.e.d(days, StringUtils.SPACE, strD));
            }
            if (days > 1) {
                return new p(dateTime2.toString("MMMM dd, yyyy"), "");
            }
            int millis = (int) ((dateTime2.getMillis() - dateTime.getMillis()) / ((long) 1000));
            int i16 = millis / DateTimeConstants.SECONDS_PER_HOUR;
            int i17 = (millis / 60) - (i16 * 60);
            if (i16 >= 24) {
                return new p(org.apache.commons.lang3.e.d(days, StringUtils.SPACE, strJ2), org.apache.commons.lang3.e.d(days, StringUtils.SPACE, strD));
            }
            if (dateTime.isAfter(dateTime2)) {
                return dateTime.getYear() == dateTime2.getYear() ? new p(dateTime2.toString("MMM dd"), "") : new p(dateTime2.toString("MMM dd, yyyy"), "");
            }
            if (i16 == 0 && i17 == 0) {
                return new p(dateTime2.toString("MMM dd"), "");
            }
            if (i16 == 0) {
                return new p(org.apache.commons.lang3.e.d(i17, StringUtils.SPACE, strD2), org.apache.commons.lang3.e.d(i17, StringUtils.SPACE, string3));
            }
            if (i17 == 0) {
                return new p(org.apache.commons.lang3.e.d(i16, StringUtils.SPACE, string2), org.apache.commons.lang3.e.d(i16, StringUtils.SPACE, strD3));
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(i16);
            sb5.append(StringUtils.SPACE);
            sb5.append(string2);
            sb5.append(StringUtils.SPACE);
            sb5.append(i17);
            String strO2 = am.j.o(StringUtils.SPACE, strD2, sb5);
            StringBuilder sb6 = new StringBuilder();
            sb6.append(i16);
            sb6.append(StringUtils.SPACE);
            sb6.append(strD3);
            sb6.append(StringUtils.SPACE);
            sb6.append(i17);
            return new p(strO2, am.j.o(StringUtils.SPACE, strD2, sb6));
        }

        public static p l(Context context, LocalDate localDate, LocalDate localDate2) {
            String strJ = u0.j(context.getString(R.string.pregnancy_week_abbreviation));
            String strJ2 = u0.j(context.getString(R.string.lbl_abbreviation_day));
            String string = context.getString(R.string.common_weeks_label);
            String strD = p6.b.d(context, R.string.common_days, string);
            int days = Days.daysBetween(localDate.toDateTimeAtStartOfDay(), localDate2.toDateTimeAtStartOfDay()).getDays();
            if (days < 7) {
                return (days < 1 || days >= 7) ? new p(localDate2.toString("MMM dd"), localDate2.toString("MMM dd")) : new p(org.apache.commons.lang3.e.d(days, StringUtils.SPACE, strJ2), org.apache.commons.lang3.e.d(days, StringUtils.SPACE, strD));
            }
            int i14 = days / 7;
            int i15 = days % 7;
            if (i15 == 0 && i14 == 0) {
                return new p("", "");
            }
            if (i14 == 0) {
                return new p(org.apache.commons.lang3.e.d(i15, StringUtils.SPACE, strJ2), org.apache.commons.lang3.e.d(i15, StringUtils.SPACE, strD));
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i14);
            sb3.append(StringUtils.SPACE);
            sb3.append(strJ);
            sb3.append(StringUtils.SPACE);
            sb3.append(i15);
            String strO = am.j.o(StringUtils.SPACE, strJ2, sb3);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i14);
            sb4.append(StringUtils.SPACE);
            sb4.append(string);
            sb4.append(StringUtils.SPACE);
            sb4.append(i15);
            return new p(strO, am.j.o(StringUtils.SPACE, strD, sb4));
        }

        public static String m(Integer num) {
            if (num != null) {
                j0 j0Var = j0.f23099a;
                String string = DateTime.now().plusDays(num.intValue()).toLocalDate().toString();
                j0Var.getClass();
                String string2 = j0.c(string, "yyyy-MM-dd", "MM/dd/yy", "").toString();
                if (string2 != null) {
                    return string2;
                }
            }
            j0 j0Var2 = j0.f23099a;
            String string3 = DateTime.now().toLocalDate().toString();
            j0Var2.getClass();
            return j0.c(string3, "yyyy-MM-dd", "MM/dd/yy", "").toString();
        }

        public static p n(LocalDate localDate, LocalDate localDate2) {
            String string;
            String string2;
            localDate.getClass();
            int days = Days.daysBetween(LocalDate.now(), localDate).getDays();
            if (days < 7) {
                j0 j0Var = j0.f23099a;
                String string3 = localDate.minusDays(days).toString();
                j0Var.getClass();
                string = j0.c(string3, "yyyy-MM-dd", "MM/dd/yy", "").toString();
            } else {
                j0 j0Var2 = j0.f23099a;
                String string4 = localDate.minusDays(7).toString();
                j0Var2.getClass();
                string = j0.c(string4, "yyyy-MM-dd", "MM/dd/yy", "").toString();
            }
            if (localDate2 != null) {
                j0 j0Var3 = j0.f23099a;
                String string5 = localDate2.toString();
                j0Var3.getClass();
                string2 = j0.c(string5, "yyyy-MM-dd", "MM/dd/yy", "").toString();
            } else {
                j0 j0Var4 = j0.f23099a;
                String string6 = localDate.plusDays(7).toString();
                j0Var4.getClass();
                string2 = j0.c(string6, "yyyy-MM-dd", "MM/dd/yy", "").toString();
            }
            return new p(string, string2);
        }

        public static double o(double d14, int i14) {
            if (i14 >= 0) {
                double dPow = (long) Math.pow(10.0d, i14);
                return ((double) MathKt.b(d14 * dPow)) / dPow;
            }
            vb.h.w();
            return 0.0d;
        }

        private a() {
        }
    }
}
