package h03;

import androidx.room.a0;
import b71.i;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import j20.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Comparable<a>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f80659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f80660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f80661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f80662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f80663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f80664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f80665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f80666i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f80667j;

    /* JADX INFO: renamed from: h03.a$a, reason: collision with other inner class name */
    public enum EnumC1610a {
        LastDay,
        FirstDay,
        Spillover,
        Abort
    }

    public static final class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    public static final class c extends RuntimeException {
        public c(String str) {
            super(str);
        }
    }

    public enum d {
        YEAR,
        MONTH,
        DAY,
        HOUR,
        MINUTE,
        SECOND,
        NANOSECONDS
    }

    public a(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.f80659b = num;
        this.f80660c = num2;
        this.f80661d = num3;
        this.f80662e = num4;
        this.f80663f = num5;
        this.f80664g = num6;
        this.f80665h = num7;
        w();
    }

    public static void a(Object obj, String str, StringBuilder sb3) {
        StringBuilder sbI = sn.a.i(str, ":");
        sbI.append(String.valueOf(obj));
        sbI.append(StringUtils.SPACE);
        sb3.append(sbI.toString());
    }

    public static void d(String str, int i14, int i15, Integer num) {
        if (num != null) {
            if (num.intValue() < i14 || num.intValue() > i15) {
                throw new b(str + " is not in the range " + i14 + CallerDataConverter.DEFAULT_RANGE_DELIMITER + i15 + ". Value is:" + num);
            }
        }
    }

    public static a h(long j8, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setTimeInMillis(j8);
        return new a(Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13)), Integer.valueOf(gregorianCalendar.get(14) * 1000000));
    }

    public static Integer l(Integer num, Integer num2) {
        if (num == null || num2 == null) {
            return null;
        }
        if (num2.intValue() == 1) {
            return 31;
        }
        if (num2.intValue() == 2) {
            return Integer.valueOf(p(num) ? 29 : 28);
        }
        if (num2.intValue() == 3) {
            return 31;
        }
        if (num2.intValue() == 4) {
            return 30;
        }
        if (num2.intValue() == 5) {
            return 31;
        }
        if (num2.intValue() == 6) {
            return 30;
        }
        if (num2.intValue() == 7 || num2.intValue() == 8) {
            return 31;
        }
        if (num2.intValue() == 9) {
            return 30;
        }
        if (num2.intValue() == 10) {
            return 31;
        }
        if (num2.intValue() == 11) {
            return 30;
        }
        if (num2.intValue() == 12) {
            return 31;
        }
        h.q(a0.g(num2, "Month is out of range 1..12:"));
        return null;
    }

    public static boolean p(Integer num) {
        if (num.intValue() % 100 == 0) {
            return num.intValue() % 400 == 0;
        }
        return num.intValue() % 4 == 0;
    }

    public final String b() {
        d dVar = d.YEAR;
        if (v(dVar) && u(d.MONTH, d.DAY, d.HOUR, d.MINUTE, d.SECOND, d.NANOSECONDS)) {
            return "YYYY";
        }
        d dVar2 = d.MONTH;
        if (v(dVar, dVar2) && u(d.DAY, d.HOUR, d.MINUTE, d.SECOND, d.NANOSECONDS)) {
            return "YYYY-MM";
        }
        d dVar3 = d.DAY;
        if (v(dVar, dVar2, dVar3) && u(d.HOUR, d.MINUTE, d.SECOND, d.NANOSECONDS)) {
            return "YYYY-MM-DD";
        }
        d dVar4 = d.HOUR;
        if (v(dVar, dVar2, dVar3, dVar4) && u(d.MINUTE, d.SECOND, d.NANOSECONDS)) {
            return "YYYY-MM-DD hh";
        }
        d dVar5 = d.MINUTE;
        if (v(dVar, dVar2, dVar3, dVar4, dVar5) && u(d.SECOND, d.NANOSECONDS)) {
            return "YYYY-MM-DD hh:mm";
        }
        d dVar6 = d.SECOND;
        if (v(dVar, dVar2, dVar3, dVar4, dVar5, dVar6) && u(d.NANOSECONDS)) {
            return "YYYY-MM-DD hh:mm:ss";
        }
        d dVar7 = d.NANOSECONDS;
        if (v(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7)) {
            return "YYYY-MM-DD hh:mm:ss.fffffffff";
        }
        if (u(dVar, dVar2, dVar3) && v(dVar4, dVar5, dVar6, dVar7)) {
            return "hh:mm:ss.fffffffff";
        }
        if (u(dVar, dVar2, dVar3, dVar7) && v(dVar4, dVar5, dVar6)) {
            return "hh:mm:ss";
        }
        if (u(dVar, dVar2, dVar3, dVar6, dVar7) && v(dVar4, dVar5)) {
            return "hh:mm";
        }
        return null;
    }

    public final int c() {
        int iIntValue = this.f80659b.intValue();
        int iIntValue2 = this.f80660c.intValue();
        int i14 = (iIntValue2 - 14) / 12;
        return (((((((iIntValue2 - 2) - (i14 * 12)) * 367) / 12) + ((((iIntValue + 4800) + i14) * 1461) / 4)) - (((((iIntValue + 4900) + i14) / 100) * 3) / 4)) + this.f80661d.intValue()) - 32075;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(a aVar) {
        if (this == aVar) {
            return 0;
        }
        g();
        aVar.g();
        e.a aVar2 = e.a.FIRST;
        int iA = e.a(this.f80659b, aVar.f80659b, aVar2);
        if (iA != 0) {
            return iA;
        }
        int iA2 = e.a(this.f80660c, aVar.f80660c, aVar2);
        if (iA2 != 0) {
            return iA2;
        }
        int iA3 = e.a(this.f80661d, aVar.f80661d, aVar2);
        if (iA3 != 0) {
            return iA3;
        }
        int iA4 = e.a(this.f80662e, aVar.f80662e, aVar2);
        if (iA4 != 0) {
            return iA4;
        }
        int iA5 = e.a(this.f80663f, aVar.f80663f, aVar2);
        if (iA5 != 0) {
            return iA5;
        }
        int iA6 = e.a(this.f80664g, aVar.f80664g, aVar2);
        if (iA6 != 0) {
            return iA6;
        }
        int iA7 = e.a(this.f80665h, aVar.f80665h, aVar2);
        if (iA7 != 0) {
            return iA7;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        Boolean boolValueOf;
        g();
        if (this == obj) {
            boolValueOf = Boolean.TRUE;
        } else {
            boolValueOf = !a.class.isInstance(obj) ? Boolean.FALSE : null;
        }
        if (boolValueOf == null) {
            a aVar = (a) obj;
            aVar.g();
            Object[] objArrM = m();
            Object[] objArrM2 = aVar.m();
            boolean z14 = false;
            int i14 = 0;
            while (true) {
                boolean zEquals = true;
                if (i14 >= 7) {
                    z14 = true;
                    break;
                }
                Object obj2 = objArrM[i14];
                Object obj3 = objArrM2[i14];
                if ((obj2 != null && obj2.getClass().isArray()) || (obj3 != null && obj3.getClass().isArray())) {
                    h.s("This method does not currently support arrays.");
                    return false;
                }
                if (obj2 != null) {
                    zEquals = obj2.equals(obj3);
                } else if (obj3 != null) {
                    zEquals = false;
                }
                if (!zEquals) {
                    break;
                }
                i14++;
            }
            boolValueOf = Boolean.valueOf(z14);
        }
        return boolValueOf.booleanValue();
    }

    public final void f() {
        g();
        if (!v(d.YEAR, d.MONTH, d.DAY)) {
            throw new c("DateTime does not include year/month/day.");
        }
    }

    public final void g() {
        if (this.f80666i) {
            return;
        }
        h03.d dVar = new h03.d();
        String str = this.f80658a;
        if (str == null) {
            x.l("DateTime string is null");
            return;
        }
        String strTrim = str.trim();
        h03.d.b bVar = new h03.d.b();
        int iIndexOf = strTrim.indexOf(StringUtils.SPACE);
        if (iIndexOf == -1) {
            iIndexOf = strTrim.indexOf("T");
        }
        if (iIndexOf <= 0 || iIndexOf >= strTrim.length()) {
            if (strTrim.length() >= 2 ? ":".equals(strTrim.substring(2, 3)) : false) {
                bVar.f80728b = strTrim;
            } else {
                bVar.f80727a = strTrim;
            }
        } else {
            bVar.f80727a = strTrim.substring(0, iIndexOf);
            bVar.f80728b = strTrim.substring(iIndexOf + 1);
        }
        String str2 = bVar.f80727a;
        if ((str2 == null || bVar.f80728b == null) ? false : true) {
            dVar.b(str2);
            dVar.c(bVar.f80728b);
        } else {
            String str3 = bVar.f80728b;
            if (str3 == null) {
                dVar.b(str2);
            } else {
                if (str2 == null) {
                    dVar.c(str3);
                }
            }
        }
        a aVar = new a(dVar.f80720a, dVar.f80721b, dVar.f80722c, dVar.f80723d, dVar.f80724e, dVar.f80725f, dVar.f80726g);
        this.f80659b = aVar.f80659b;
        this.f80660c = aVar.f80660c;
        this.f80661d = aVar.f80661d;
        this.f80662e = aVar.f80662e;
        this.f80663f = aVar.f80663f;
        this.f80664g = aVar.f80664g;
        this.f80665h = aVar.f80665h;
        w();
    }

    public final int hashCode() {
        if (this.f80667j == 0) {
            g();
            Object[] objArrM = m();
            int iB = 23;
            for (int i14 = 0; i14 < 7; i14++) {
                iB = e.b(iB, objArrM[i14]);
            }
            this.f80667j = iB;
        }
        return this.f80667j;
    }

    public final String i(String str) {
        int i14;
        h03.b.a aVar;
        String strSubstring;
        h03.b bVar = new h03.b(str);
        bVar.f80687d = new ArrayList();
        bVar.f80686c = new ArrayList();
        Pattern pattern = h03.b.f80681i;
        String str2 = bVar.f80684a;
        Matcher matcher = pattern.matcher(str2);
        while (true) {
            i14 = 1;
            aVar = null;
            if (!matcher.find()) {
                break;
            }
            h03.b.c cVar = new h03.b.c();
            cVar.f80695a = matcher.start();
            cVar.f80696b = matcher.end() - 1;
            bVar.f80687d.add(cVar);
        }
        Iterator it = h03.b.f80683k.iterator();
        String strReplace = str2;
        while (true) {
            int i15 = 0;
            if (!it.hasNext()) {
                StringBuilder sb3 = new StringBuilder();
                while (i15 < str2.length()) {
                    String strSubstring2 = str2.substring(i15, i15 + 1);
                    h03.b.d dVar = null;
                    for (h03.b.d dVar2 : bVar.f80686c) {
                        if (dVar2.f80697a == i15) {
                            dVar = dVar2;
                        }
                    }
                    if (dVar != null) {
                        sb3.append(dVar.f80699c);
                        i15 = dVar.f80698b;
                    } else if (!"|".equals(strSubstring2)) {
                        sb3.append(strSubstring2);
                    }
                    i15++;
                }
                return sb3.toString();
            }
            String str3 = (String) it.next();
            Matcher matcher2 = Pattern.compile(str3).matcher(strReplace);
            while (matcher2.find()) {
                h03.b.d dVar3 = new h03.b.d();
                dVar3.f80697a = matcher2.start();
                dVar3.f80698b = matcher2.end() - i14;
                Iterator it3 = bVar.f80687d.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        String strGroup = matcher2.group();
                        if ("YYYY".equals(strGroup)) {
                            g();
                            strSubstring = h03.b.e(this.f80659b);
                        } else if ("YY".equals(strGroup)) {
                            g();
                            String strE = h03.b.e(this.f80659b);
                            strSubstring = f.b(strE) ? strE.substring(2) : "";
                        } else if ("MMMM".equals(strGroup)) {
                            g();
                            Integer num = this.f80660c;
                            num.getClass();
                            strSubstring = bVar.b(num);
                        } else if ("MMM".equals(strGroup)) {
                            g();
                            Integer num2 = this.f80660c;
                            num2.getClass();
                            strSubstring = bVar.b(num2);
                            if (f.b(strSubstring) && strSubstring.length() >= 3) {
                                strSubstring = strSubstring.substring(0, 3);
                            }
                        } else if (LocaleUnitResolver.ImperialCountryCode.MYANMAR.equals(strGroup)) {
                            g();
                            strSubstring = h03.b.a(h03.b.e(this.f80660c));
                        } else if ("M".equals(strGroup)) {
                            g();
                            strSubstring = h03.b.e(this.f80660c);
                        } else if ("DD".equals(strGroup)) {
                            g();
                            strSubstring = h03.b.a(h03.b.e(this.f80661d));
                        } else if ("D".equals(strGroup)) {
                            g();
                            strSubstring = h03.b.e(this.f80661d);
                        } else if ("WWWW".equals(strGroup)) {
                            strSubstring = bVar.c(n());
                        } else if ("WWW".equals(strGroup)) {
                            strSubstring = bVar.c(n());
                            if (f.b(strSubstring) && strSubstring.length() >= 3) {
                                strSubstring = strSubstring.substring(0, 3);
                            }
                        } else if ("hh".equals(strGroup)) {
                            g();
                            strSubstring = h03.b.a(h03.b.e(this.f80662e));
                        } else if ("h".equals(strGroup)) {
                            g();
                            strSubstring = h03.b.e(this.f80662e);
                        } else if ("h12".equals(strGroup)) {
                            g();
                            Integer numE = this.f80662e;
                            if (numE != null) {
                                if (numE.intValue() == 0) {
                                    numE = 12;
                                } else if (numE.intValue() > 12) {
                                    numE = i.e(12, numE);
                                }
                            }
                            strSubstring = h03.b.e(numE);
                        } else if ("hh12".equals(strGroup)) {
                            g();
                            Integer numE2 = this.f80662e;
                            if (numE2 != null) {
                                if (numE2.intValue() == 0) {
                                    numE2 = 12;
                                } else if (numE2.intValue() > 12) {
                                    numE2 = i.e(12, numE2);
                                }
                            }
                            strSubstring = h03.b.a(h03.b.e(numE2));
                        } else if ("a".equals(strGroup)) {
                            g();
                            Integer num3 = this.f80662e;
                            num3.getClass();
                            h03.b.C1611b c1611b = bVar.f80691h;
                            if (c1611b != null) {
                                int iIntValue = num3.intValue();
                                List<String> list = c1611b.f80694c;
                                strSubstring = iIntValue < 12 ? list.get(0) : list.get(i14);
                            } else {
                                Locale locale = bVar.f80685b;
                                if (locale == null) {
                                    h.s("Your date pattern requires either a Locale, or your own custom localizations for text:".concat(f.a(str2)));
                                    return null;
                                }
                                LinkedHashMap linkedHashMap = bVar.f80690g;
                                if (!linkedHashMap.containsKey(locale)) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(bVar.d(6));
                                    arrayList.add(bVar.d(18));
                                    linkedHashMap.put(locale, arrayList);
                                }
                                strSubstring = num3.intValue() < 12 ? (String) ((List) linkedHashMap.get(locale)).get(0) : (String) ((List) linkedHashMap.get(locale)).get(1);
                            }
                        } else if ("mm".equals(strGroup)) {
                            g();
                            strSubstring = h03.b.a(h03.b.e(this.f80663f));
                        } else if ("m".equals(strGroup)) {
                            g();
                            strSubstring = h03.b.e(this.f80663f);
                        } else if ("ss".equals(strGroup)) {
                            g();
                            strSubstring = h03.b.a(h03.b.e(this.f80664g));
                        } else if ("s".equals(strGroup)) {
                            g();
                            strSubstring = h03.b.e(this.f80664g);
                        } else {
                            if (!strGroup.startsWith("f")) {
                                h.s("Unknown token in date formatting pattern: ".concat(strGroup));
                                return null;
                            }
                            if (!h03.b.f80682j.matcher(strGroup).matches()) {
                                h.s("Unknown token in date formatting pattern: ".concat(strGroup));
                                return null;
                            }
                            g();
                            String strE2 = h03.b.e(this.f80665h);
                            while (strE2.length() < 9) {
                                strE2 = "0".concat(strE2);
                            }
                            int length = strGroup.length();
                            strSubstring = (!f.b(strE2) || strE2.length() < length) ? strE2 : strE2.substring(0, length);
                        }
                        dVar3.f80699c = strSubstring;
                        bVar.f80686c.add(dVar3);
                        break;
                    }
                    h03.b.c cVar2 = (h03.b.c) it3.next();
                    int i16 = cVar2.f80695a;
                    int i17 = dVar3.f80697a;
                    if (i16 <= i17 && i17 <= cVar2.f80696b) {
                        break;
                    }
                }
                i14 = 1;
                aVar = null;
            }
            StringBuilder sb4 = new StringBuilder();
            for (int i18 = 1; i18 <= str3.length(); i18++) {
                sb4.append("@");
            }
            strReplace = strReplace.replace(str3, sb4.toString());
            i14 = 1;
            aVar = null;
        }
    }

    public final Integer k() {
        f();
        g();
        Integer num = this.f80659b;
        if (new Object[]{num}[0] != null) {
            return Integer.valueOf((this.f80661d.intValue() + (((this.f80660c.intValue() * 275) / 9) - (((this.f80660c.intValue() + 9) / 12) * (p(num) ? 1 : 2)))) - 30);
        }
        throw new c("Year is absent. Cannot determine if leap year.");
    }

    public final Object[] m() {
        return new Object[]{this.f80659b, this.f80660c, this.f80661d, this.f80662e, this.f80663f, this.f80664g, this.f80665h};
    }

    public final Integer n() {
        f();
        return Integer.valueOf(((c() + 1) % 7) + 1);
    }

    public final boolean o(a aVar) {
        return compareTo(aVar) > 0;
    }

    public final boolean q(a aVar) {
        f();
        aVar.f();
        return this.f80659b.equals(aVar.f80659b) && this.f80660c.equals(aVar.f80660c) && this.f80661d.equals(aVar.f80661d);
    }

    public final boolean r(a aVar) {
        return compareTo(aVar) < 0;
    }

    public final a s(Integer num) {
        f();
        f();
        int iIntValue = num.intValue() + c() + 68569;
        int i14 = (iIntValue * 4) / 146097;
        int i15 = iIntValue - (((146097 * i14) + 3) / 4);
        int i16 = ((i15 + 1) * 4000) / 1461001;
        int i17 = (i15 - ((i16 * 1461) / 4)) + 31;
        int i18 = (i17 * 80) / 2447;
        int i19 = i18 / 11;
        a aVar = new a(Integer.valueOf(((i14 - 49) * 100) + i16 + i19), Integer.valueOf((i18 + 2) - (i19 * 12)), Integer.valueOf(i17 - ((i18 * 2447) / 80)), null, null, null, null);
        aVar.g();
        Integer num2 = aVar.f80659b;
        aVar.g();
        Integer num3 = aVar.f80660c;
        aVar.g();
        return new a(num2, num3, aVar.f80661d, this.f80662e, this.f80663f, this.f80664g, this.f80665h);
    }

    public final a t(d dVar) {
        g();
        if (d.NANOSECONDS == dVar) {
            h.s("It makes no sense to truncate to nanosecond precision, since that's the highest precision available.");
            return null;
        }
        if (d.SECOND == dVar) {
            return new a(this.f80659b, this.f80660c, this.f80661d, this.f80662e, this.f80663f, this.f80664g, null);
        }
        if (d.MINUTE == dVar) {
            return new a(this.f80659b, this.f80660c, this.f80661d, this.f80662e, this.f80663f, null, null);
        }
        if (d.HOUR == dVar) {
            return new a(this.f80659b, this.f80660c, this.f80661d, this.f80662e, null, null, null);
        }
        if (d.DAY == dVar) {
            return new a(this.f80659b, this.f80660c, this.f80661d, null, null, null, null);
        }
        if (d.MONTH == dVar) {
            return new a(this.f80659b, this.f80660c, null, null, null, null, null);
        }
        if (d.YEAR == dVar) {
            return new a(this.f80659b, null, null, null, null, null, null);
        }
        return null;
    }

    public final String toString() {
        String str = this.f80658a;
        if (f.b(str)) {
            return str;
        }
        if (b() != null) {
            return i(b());
        }
        StringBuilder sb3 = new StringBuilder();
        a(this.f80659b, "Y", sb3);
        a(this.f80660c, "M", sb3);
        a(this.f80661d, "D", sb3);
        a(this.f80662e, "h", sb3);
        a(this.f80663f, "m", sb3);
        a(this.f80664g, "s", sb3);
        a(this.f80665h, "f", sb3);
        return sb3.toString().trim();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public final boolean u(d... dVarArr) {
        g();
        boolean z14 = true;
        for (d dVar : dVarArr) {
            if (d.NANOSECONDS == dVar) {
                if (z14 && this.f80665h == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else if (d.SECOND == dVar) {
                if (z14 && this.f80664g == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else if (d.MINUTE == dVar) {
                if (z14 && this.f80663f == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else if (d.HOUR == dVar) {
                if (z14 && this.f80662e == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else if (d.DAY == dVar) {
                if (z14 && this.f80661d == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else if (d.MONTH == dVar) {
                if (z14 && this.f80660c == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else if (d.YEAR == dVar) {
                if (z14 && this.f80659b == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
        }
        return z14;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public final boolean v(d... dVarArr) {
        g();
        boolean z14 = true;
        for (d dVar : dVarArr) {
            if (d.NANOSECONDS == dVar) {
                if (!z14 || this.f80665h == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else if (d.SECOND == dVar) {
                if (!z14 || this.f80664g == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else if (d.MINUTE == dVar) {
                if (!z14 || this.f80663f == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else if (d.HOUR == dVar) {
                if (!z14 || this.f80662e == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else if (d.DAY == dVar) {
                if (!z14 || this.f80661d == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else if (d.MONTH == dVar) {
                if (!z14 || this.f80660c == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else if (d.YEAR == dVar) {
                if (!z14 || this.f80659b == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            }
        }
        return z14;
    }

    public final void w() {
        d("Year", 1, 9999, this.f80659b);
        d("Month", 1, 12, this.f80660c);
        d("Day", 1, 31, this.f80661d);
        d("Hour", 0, 23, this.f80662e);
        d("Minute", 0, 59, this.f80663f);
        d("Second", 0, 59, this.f80664g);
        d("Nanosecond", 0, 999999999, this.f80665h);
        Integer num = this.f80659b;
        Integer num2 = this.f80660c;
        Integer num3 = this.f80661d;
        Object[] objArr = {num, num2, num3};
        for (int i14 = 0; i14 < 3; i14++) {
            if (objArr[i14] == null) {
                return;
            }
        }
        if (num3.intValue() <= l(num, num2).intValue()) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("The day-of-the-month value '");
        sb3.append(num3);
        Integer numL = l(num, num2);
        sb3.append("' exceeds the number of days in the month: ");
        sb3.append(numL);
        throw new b(sb3.toString());
    }

    public a(String str) {
        if (str != null) {
            this.f80658a = str;
        } else {
            h.s("String passed to DateTime constructor is null. You can use an empty string, but not a null reference.");
            throw null;
        }
    }
}
