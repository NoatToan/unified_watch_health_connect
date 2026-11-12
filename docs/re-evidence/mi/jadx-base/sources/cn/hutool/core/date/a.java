package cn.hutool.core.date;

import defpackage.fa3;
import defpackage.imh;
import defpackage.jcj;
import defpackage.lio;
import defpackage.qk1;
import defpackage.s2h;
import defpackage.tt3;
import defpackage.v4p;
import defpackage.vp5;
import defpackage.wp5;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class a extends fa3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f5512a = {"sun", "mon", "tue", "wed", "thu", "fri", "sat", "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec", "gmt", "ut", "utc", "est", "edt", "cst", "cdt", "mst", "mdt", "pst", "pdt"};

    public static int d(Date date, Date date2) {
        qk1.u(date, "Birthday can not be null !", new Object[0]);
        if (date2 == null) {
            date2 = e();
        }
        return fa3.a(date.getTime(), date2.getTime());
    }

    public static DateTime e() {
        return new DateTime();
    }

    public static DateTime f(long j) {
        return new DateTime(j);
    }

    public static DateTime g(TemporalAccessor temporalAccessor) {
        return new DateTime(temporalAccessor);
    }

    public static DateTime h(Calendar calendar) {
        return new DateTime(calendar);
    }

    public static DateTime i(Date date) {
        return date instanceof DateTime ? (DateTime) date : j(date);
    }

    public static DateTime j(Date date) {
        return new DateTime(date);
    }

    public static String k(long j) {
        return new BetweenFormatter(j, BetweenFormatter.Level.MILLISECOND).format();
    }

    public static String l(long j, BetweenFormatter.Level level) {
        return new BetweenFormatter(j, level).format();
    }

    public static String m(Date date) {
        if (date == null) {
            return null;
        }
        return wp5.f.format(date);
    }

    public static boolean n(int i) {
        return new GregorianCalendar().isLeapYear(i);
    }

    public static SimpleDateFormat o(String str) {
        return p(str, null, null);
    }

    public static SimpleDateFormat p(String str, Locale locale, TimeZone timeZone) {
        if (locale == null) {
            locale = Locale.getDefault(Locale.Category.FORMAT);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static String q(CharSequence charSequence) {
        if (tt3.F(charSequence)) {
            return tt3.j0(charSequence);
        }
        List<String> listD0 = tt3.d0(charSequence, ' ');
        int size = listD0.size();
        if (size < 1 || size > 2) {
            return tt3.j0(charSequence);
        }
        StringBuilder sbA0 = lio.A0();
        sbA0.append(tt3.S(listD0.get(0).replaceAll("[/.年月]", "-"), "日"));
        if (size == 2) {
            sbA0.append(' ');
            sbA0.append(tt3.S(listD0.get(1).replaceAll("[时分秒]", ":"), ":").replace(',', '.'));
        }
        return sbA0.toString();
    }

    public static DateTime r(CharSequence charSequence) {
        if (tt3.F(charSequence)) {
            return null;
        }
        String strO = tt3.O(charSequence.toString().trim(), 26085, 31186);
        int length = strO.length();
        if (s2h.q(strO)) {
            if (length == 14) {
                return s(strO, wp5.z);
            }
            if (length == 17) {
                return s(strO, wp5.B);
            }
            if (length == 8) {
                return s(strO, wp5.v);
            }
            if (length == 6) {
                return s(strO, wp5.x);
            }
        } else {
            if (jcj.a(imh.A, strO)) {
                return v(strO);
            }
            if (tt3.m(strO, f5512a)) {
                return u(strO);
            }
            if (tt3.i(strO, 'T')) {
                return w(strO);
            }
        }
        String strQ = q(strO);
        if (jcj.a(wp5.f38202a, strQ)) {
            int iO = tt3.o(strQ, AbstractJsonLexerKt.COLON);
            if (iO == 0) {
                return s(strQ, wp5.f);
            }
            if (iO == 1) {
                return s(strQ, wp5.j);
            }
            if (iO == 2) {
                return tt3.i(strQ, '.') ? s(strQ, wp5.n) : s(strQ, wp5.l);
            }
        }
        throw new DateException("No format fit for date String [{}] !", strQ);
    }

    public static DateTime s(CharSequence charSequence, vp5 vp5Var) {
        return new DateTime(charSequence, vp5Var);
    }

    public static DateTime t(CharSequence charSequence, String str) {
        return new DateTime(charSequence, str);
    }

    public static DateTime u(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return s(charSequence, wp5.E);
    }

    public static DateTime v(CharSequence charSequence) {
        String strY = tt3.y("{} {}", y(), charSequence);
        return 1 == tt3.o(strY, AbstractJsonLexerKt.COLON) ? t(strY, "yyyy-MM-dd HH:mm") : s(strY, wp5.l);
    }

    public static DateTime w(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (tt3.i(str, 'Z')) {
            if (length == 20) {
                return s(str, wp5.H);
            }
            if (length <= 24 && length >= 22) {
                return s(str, wp5.J);
            }
        } else {
            if (length == 24 || length == 25) {
                return s(str, wp5.I);
            }
            if (length == 28 || length == 29) {
                return s(str, wp5.K);
            }
            if (length == 19) {
                return s(str, wp5.F);
            }
            if (tt3.i(str, '.')) {
                return s(str, wp5.G);
            }
        }
        throw new DateException("No format fit for date String [{}] !", str);
    }

    public static Instant x(TemporalAccessor temporalAccessor) {
        return v4p.a(temporalAccessor);
    }

    public static String y() {
        return m(new DateTime());
    }

    public static int z(Date date) {
        return DateTime.of(date).year();
    }
}
