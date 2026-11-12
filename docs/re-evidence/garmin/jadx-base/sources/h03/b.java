package h03;

import am.j;
import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f80681i = Pattern.compile("\\|[^\\|]*\\|");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f80682j = Pattern.compile("f{1,9}");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ArrayList f80683k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Locale f80685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f80686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f80687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f80688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f80689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f80690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1611b f80691h;

    /* JADX INFO: renamed from: h03.b$b, reason: collision with other inner class name */
    public final class C1611b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f80692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<String> f80693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<String> f80694c;

        public C1611b(b bVar, List<String> list, List<String> list2, List<String> list3) {
            if (list.size() != 12) {
                sn.a.z(list.size(), "Your List of custom months must have size 12, but its size is ");
                throw null;
            }
            if (list2.size() != 7) {
                sn.a.z(list2.size(), "Your List of custom weekdays must have size 7, but its size is ");
                throw null;
            }
            if (list3.size() != 2) {
                sn.a.z(list3.size(), "Your List of custom a.m./p.m. indicators must have size 2, but its size is ");
                throw null;
            }
            this.f80692a = list;
            this.f80693b = list2;
            this.f80694c = list3;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f80695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f80696b;

        private c() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f80697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f80698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f80699c;

        private d() {
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Start:");
            sb3.append(this.f80697a);
            sb3.append(" End:");
            sb3.append(this.f80698b);
            sb3.append(" '");
            return j.o(this.f80699c, "'", sb3);
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f80683k = arrayList;
        arrayList.add("YYYY");
        arrayList.add("YY");
        arrayList.add("MMMM");
        arrayList.add("MMM");
        arrayList.add(LocaleUnitResolver.ImperialCountryCode.MYANMAR);
        arrayList.add("M");
        arrayList.add("DD");
        arrayList.add("D");
        arrayList.add("WWWW");
        arrayList.add("WWW");
        arrayList.add("hh12");
        arrayList.add("h12");
        arrayList.add("hh");
        arrayList.add("h");
        arrayList.add("mm");
        arrayList.add("m");
        arrayList.add("ss");
        arrayList.add("s");
        arrayList.add("a");
        arrayList.add("fffffffff");
        arrayList.add("ffffffff");
        arrayList.add("fffffff");
        arrayList.add("ffffff");
        arrayList.add("fffff");
        arrayList.add("ffff");
        arrayList.add("fff");
        arrayList.add("ff");
        arrayList.add("f");
    }

    public b(String str, List<String> list, List<String> list2, List<String> list3) {
        this.f80688e = new LinkedHashMap();
        this.f80689f = new LinkedHashMap();
        this.f80690g = new LinkedHashMap();
        this.f80684a = str;
        this.f80685b = null;
        this.f80691h = new C1611b(this, list, list2, list3);
        if (f.b(str)) {
            return;
        }
        h.s("DateTime format has no content.");
        throw null;
    }

    public static String a(String str) {
        return (f.b(str) && str.length() == 1) ? "0".concat(str) : str;
    }

    public static String e(Object obj) {
        return obj != null ? String.valueOf(obj) : "";
    }

    public final String b(Integer num) {
        if (num == null) {
            return "";
        }
        C1611b c1611b = this.f80691h;
        if (c1611b != null) {
            return c1611b.f80692a.get(num.intValue() - 1);
        }
        Locale locale = this.f80685b;
        if (locale == null) {
            h.s("Your date pattern requires either a Locale, or your own custom localizations for text:".concat(f.a(this.f80684a)));
            return null;
        }
        LinkedHashMap linkedHashMap = this.f80688e;
        if (!linkedHashMap.containsKey(locale)) {
            ArrayList arrayList = new ArrayList();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM", locale);
            for (int i14 = 0; i14 <= 11; i14++) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.set(1, 2000);
                gregorianCalendar.set(2, i14);
                gregorianCalendar.set(5, 15);
                arrayList.add(simpleDateFormat.format(gregorianCalendar.getTime()));
            }
            linkedHashMap.put(locale, arrayList);
        }
        return (String) ((List) linkedHashMap.get(locale)).get(num.intValue() - 1);
    }

    public final String c(Integer num) {
        C1611b c1611b = this.f80691h;
        if (c1611b != null) {
            return c1611b.f80693b.get(num.intValue() - 1);
        }
        Locale locale = this.f80685b;
        if (locale == null) {
            h.s("Your date pattern requires either a Locale, or your own custom localizations for text:".concat(f.a(this.f80684a)));
            return null;
        }
        LinkedHashMap linkedHashMap = this.f80689f;
        if (!linkedHashMap.containsKey(locale)) {
            ArrayList arrayList = new ArrayList();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", locale);
            for (int i14 = 8; i14 <= 14; i14++) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.set(1, 2009);
                gregorianCalendar.set(2, 1);
                gregorianCalendar.set(5, i14);
                arrayList.add(simpleDateFormat.format(gregorianCalendar.getTime()));
            }
            linkedHashMap.put(locale, arrayList);
        }
        return (String) ((List) linkedHashMap.get(locale)).get(num.intValue() - 1);
    }

    public final String d(Integer num) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("a", this.f80685b);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, 2000);
        gregorianCalendar.set(2, 6);
        gregorianCalendar.set(5, 15);
        gregorianCalendar.set(11, num.intValue());
        return simpleDateFormat.format(gregorianCalendar.getTime());
    }

    public b(String str, Locale locale) {
        this.f80688e = new LinkedHashMap();
        this.f80689f = new LinkedHashMap();
        this.f80690g = new LinkedHashMap();
        this.f80684a = str;
        this.f80685b = locale;
        this.f80691h = null;
        if (f.b(str)) {
            return;
        }
        h.s("DateTime format has no content.");
        throw null;
    }

    public b(String str) {
        this.f80688e = new LinkedHashMap();
        this.f80689f = new LinkedHashMap();
        this.f80690g = new LinkedHashMap();
        this.f80684a = str;
        this.f80685b = null;
        this.f80691h = null;
        if (f.b(str)) {
            return;
        }
        h.s("DateTime format has no content.");
        throw null;
    }
}
