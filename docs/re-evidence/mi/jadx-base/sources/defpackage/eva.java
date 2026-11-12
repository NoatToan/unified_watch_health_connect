package defpackage;

import java.text.DateFormatSymbols;
import java.util.Comparator;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* JADX INFO: loaded from: classes3.dex */
public class eva {
    public static ConcurrentMap<Locale, eva> p = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f17097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f17098b;
    public final String[] c;
    public final String[] d;
    public final String[] e;
    public final String[] f;
    public final TreeMap<String, Integer> g;
    public final TreeMap<String, Integer> h;
    public final TreeMap<String, Integer> i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f17099k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;

    public eva(Locale locale) {
        DateFormatSymbols dateFormatSymbolsD = wq5.d(locale);
        this.f17097a = dateFormatSymbolsD.getEras();
        this.f17098b = u(dateFormatSymbolsD.getWeekdays());
        this.c = u(dateFormatSymbolsD.getShortWeekdays());
        this.d = v(dateFormatSymbolsD.getMonths());
        this.e = v(dateFormatSymbolsD.getShortMonths());
        this.f = dateFormatSymbolsD.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i = 0; i < 13; i++) {
            numArr[i] = Integer.valueOf(i);
        }
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        TreeMap<String, Integer> treeMap = new TreeMap<>((Comparator<? super String>) comparator);
        this.g = treeMap;
        b(treeMap, this.f17097a, numArr);
        if ("en".equals(locale.getLanguage())) {
            treeMap.put("BCE", numArr[0]);
            treeMap.put("CE", numArr[1]);
        }
        TreeMap<String, Integer> treeMap2 = new TreeMap<>((Comparator<? super String>) comparator);
        this.h = treeMap2;
        b(treeMap2, this.f17098b, numArr);
        b(treeMap2, this.c, numArr);
        a(treeMap2, 1, 7, numArr);
        TreeMap<String, Integer> treeMap3 = new TreeMap<>((Comparator<? super String>) comparator);
        this.i = treeMap3;
        b(treeMap3, this.d, numArr);
        b(treeMap3, this.e, numArr);
        a(treeMap3, 1, 12, numArr);
        this.j = q(this.f17097a);
        this.f17099k = q(this.f17098b);
        this.l = q(this.c);
        this.m = q(this.d);
        this.n = q(this.e);
        this.o = q(this.f);
    }

    public static void a(TreeMap<String, Integer> treeMap, int i, int i2, Integer[] numArr) {
        while (i <= i2) {
            treeMap.put(String.valueOf(i).intern(), numArr[i]);
            i++;
        }
    }

    public static void b(TreeMap<String, Integer> treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            String str = strArr[length];
            if (str != null) {
                treeMap.put(str, numArr[length]);
            }
        }
    }

    public static eva h(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        eva evaVar = p.get(locale);
        if (evaVar != null) {
            return evaVar;
        }
        eva evaVar2 = new eva(locale);
        eva evaVarPutIfAbsent = p.putIfAbsent(locale, evaVar2);
        return evaVarPutIfAbsent != null ? evaVarPutIfAbsent : evaVar2;
    }

    public static int q(String[] strArr) {
        int length;
        int length2 = strArr.length;
        int i = 0;
        while (true) {
            length2--;
            if (length2 < 0) {
                return i;
            }
            String str = strArr[length2];
            if (str != null && (length = str.length()) > i) {
                i = length;
            }
        }
    }

    public static String[] u(String[] strArr) {
        String[] strArr2 = new String[8];
        int i = 1;
        while (i < 8) {
            strArr2[i] = strArr[i < 7 ? i + 1 : 1];
            i++;
        }
        return strArr2;
    }

    public static String[] v(String[] strArr) {
        String[] strArr2 = new String[13];
        for (int i = 1; i < 13; i++) {
            strArr2[i] = strArr[i - 1];
        }
        return strArr2;
    }

    public int c(String str) {
        Integer num = this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.dayOfWeek(), str);
    }

    public String d(int i) {
        return this.c[i];
    }

    public String e(int i) {
        return this.f17098b[i];
    }

    public int f(String str) {
        Integer num = this.g.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.era(), str);
    }

    public String g(int i) {
        return this.f17097a[i];
    }

    public int i() {
        return this.l;
    }

    public int j() {
        return this.f17099k;
    }

    public int k() {
        return this.j;
    }

    public int l() {
        return this.o;
    }

    public int m() {
        return this.n;
    }

    public int n() {
        return this.m;
    }

    public int o(String str) {
        String[] strArr = this.f;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new IllegalFieldValueException(DateTimeFieldType.halfdayOfDay(), str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return length;
    }

    public String p(int i) {
        return this.f[i];
    }

    public int r(String str) {
        Integer num = this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.monthOfYear(), str);
    }

    public String s(int i) {
        return this.e[i];
    }

    public String t(int i) {
        return this.d[i];
    }
}
