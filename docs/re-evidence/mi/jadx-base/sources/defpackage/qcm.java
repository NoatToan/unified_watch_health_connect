package defpackage;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.temporal.ChronoField;

/* JADX INFO: loaded from: classes3.dex */
public final class qcm extends uq5 {
    public static final Comparator<Map.Entry<String, Long>> c = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap<Map.Entry<z4p, Locale>, Object> f31375b = new ConcurrentHashMap(16, 0.75f, 2);

    public class a implements Comparator<Map.Entry<String, Long>> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getKey().length() - entry.getKey().length();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<TextStyle, Map<Long, String>> f31376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<TextStyle, List<Map.Entry<String, Long>>> f31377b;

        public b(Map<TextStyle, Map<Long, String>> map) {
            this.f31376a = map;
            HashMap map2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (TextStyle textStyle : map.keySet()) {
                HashMap map3 = new HashMap();
                for (Map.Entry<Long, String> entry : map.get(textStyle).entrySet()) {
                    map3.put(entry.getValue(), qcm.g(entry.getValue(), entry.getKey()));
                }
                ArrayList arrayList2 = new ArrayList(map3.values());
                Collections.sort(arrayList2, qcm.c);
                map2.put(textStyle, arrayList2);
                arrayList.addAll(arrayList2);
                map2.put(null, arrayList);
            }
            Collections.sort(arrayList, qcm.c);
            this.f31377b = map2;
        }

        public String a(long j, TextStyle textStyle) {
            Map<Long, String> map = this.f31376a.get(textStyle);
            if (map != null) {
                return map.get(Long.valueOf(j));
            }
            return null;
        }

        public Iterator<Map.Entry<String, Long>> b(TextStyle textStyle) {
            List<Map.Entry<String, Long>> list = this.f31377b.get(textStyle);
            if (list != null) {
                return list.iterator();
            }
            return null;
        }
    }

    public static <A, B> Map.Entry<A, B> g(A a2, B b2) {
        return new AbstractMap.SimpleImmutableEntry(a2, b2);
    }

    public static b h(Map<TextStyle, Map<Long, String>> map) {
        map.put(TextStyle.FULL_STANDALONE, map.get(TextStyle.FULL));
        map.put(TextStyle.SHORT_STANDALONE, map.get(TextStyle.SHORT));
        TextStyle textStyle = TextStyle.NARROW;
        if (map.containsKey(textStyle)) {
            TextStyle textStyle2 = TextStyle.NARROW_STANDALONE;
            if (!map.containsKey(textStyle2)) {
                map.put(textStyle2, map.get(textStyle));
            }
        }
        return new b(map);
    }

    @Override // defpackage.uq5
    public String c(z4p z4pVar, long j, TextStyle textStyle, Locale locale) {
        Object objJ = j(z4pVar, locale);
        if (objJ instanceof b) {
            return ((b) objJ).a(j, textStyle);
        }
        return null;
    }

    @Override // defpackage.uq5
    public Iterator<Map.Entry<String, Long>> d(z4p z4pVar, TextStyle textStyle, Locale locale) {
        Object objJ = j(z4pVar, locale);
        if (objJ instanceof b) {
            return ((b) objJ).b(textStyle);
        }
        return null;
    }

    public final Object i(z4p z4pVar, Locale locale) {
        if (z4pVar == ChronoField.MONTH_OF_YEAR) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map = new HashMap();
            String[] months = dateFormatSymbols.getMonths();
            HashMap map2 = new HashMap();
            map2.put(1L, months[0]);
            map2.put(2L, months[1]);
            map2.put(3L, months[2]);
            map2.put(4L, months[3]);
            map2.put(5L, months[4]);
            map2.put(6L, months[5]);
            map2.put(7L, months[6]);
            map2.put(8L, months[7]);
            map2.put(9L, months[8]);
            map2.put(10L, months[9]);
            map2.put(11L, months[10]);
            map2.put(12L, months[11]);
            map.put(TextStyle.FULL, map2);
            HashMap map3 = new HashMap();
            map3.put(1L, months[0].substring(0, 1));
            map3.put(2L, months[1].substring(0, 1));
            map3.put(3L, months[2].substring(0, 1));
            map3.put(4L, months[3].substring(0, 1));
            map3.put(5L, months[4].substring(0, 1));
            map3.put(6L, months[5].substring(0, 1));
            map3.put(7L, months[6].substring(0, 1));
            map3.put(8L, months[7].substring(0, 1));
            map3.put(9L, months[8].substring(0, 1));
            map3.put(10L, months[9].substring(0, 1));
            map3.put(11L, months[10].substring(0, 1));
            map3.put(12L, months[11].substring(0, 1));
            map.put(TextStyle.NARROW, map3);
            String[] shortMonths = dateFormatSymbols.getShortMonths();
            HashMap map4 = new HashMap();
            map4.put(1L, shortMonths[0]);
            map4.put(2L, shortMonths[1]);
            map4.put(3L, shortMonths[2]);
            map4.put(4L, shortMonths[3]);
            map4.put(5L, shortMonths[4]);
            map4.put(6L, shortMonths[5]);
            map4.put(7L, shortMonths[6]);
            map4.put(8L, shortMonths[7]);
            map4.put(9L, shortMonths[8]);
            map4.put(10L, shortMonths[9]);
            map4.put(11L, shortMonths[10]);
            map4.put(12L, shortMonths[11]);
            map.put(TextStyle.SHORT, map4);
            return h(map);
        }
        if (z4pVar == ChronoField.DAY_OF_WEEK) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap map5 = new HashMap();
            String[] weekdays = dateFormatSymbols2.getWeekdays();
            HashMap map6 = new HashMap();
            map6.put(1L, weekdays[2]);
            map6.put(2L, weekdays[3]);
            map6.put(3L, weekdays[4]);
            map6.put(4L, weekdays[5]);
            map6.put(5L, weekdays[6]);
            map6.put(6L, weekdays[7]);
            map6.put(7L, weekdays[1]);
            map5.put(TextStyle.FULL, map6);
            HashMap map7 = new HashMap();
            map7.put(1L, weekdays[2].substring(0, 1));
            map7.put(2L, weekdays[3].substring(0, 1));
            map7.put(3L, weekdays[4].substring(0, 1));
            map7.put(4L, weekdays[5].substring(0, 1));
            map7.put(5L, weekdays[6].substring(0, 1));
            map7.put(6L, weekdays[7].substring(0, 1));
            map7.put(7L, weekdays[1].substring(0, 1));
            map5.put(TextStyle.NARROW, map7);
            String[] shortWeekdays = dateFormatSymbols2.getShortWeekdays();
            HashMap map8 = new HashMap();
            map8.put(1L, shortWeekdays[2]);
            map8.put(2L, shortWeekdays[3]);
            map8.put(3L, shortWeekdays[4]);
            map8.put(4L, shortWeekdays[5]);
            map8.put(5L, shortWeekdays[6]);
            map8.put(6L, shortWeekdays[7]);
            map8.put(7L, shortWeekdays[1]);
            map5.put(TextStyle.SHORT, map8);
            return h(map5);
        }
        if (z4pVar == ChronoField.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
            HashMap map9 = new HashMap();
            String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
            HashMap map10 = new HashMap();
            map10.put(0L, amPmStrings[0]);
            map10.put(1L, amPmStrings[1]);
            map9.put(TextStyle.FULL, map10);
            map9.put(TextStyle.SHORT, map10);
            return h(map9);
        }
        if (z4pVar != ChronoField.ERA) {
            if (z4pVar != did.f15555b) {
                return "";
            }
            HashMap map11 = new HashMap();
            HashMap map12 = new HashMap();
            map12.put(1L, "Q1");
            map12.put(2L, "Q2");
            map12.put(3L, "Q3");
            map12.put(4L, "Q4");
            map11.put(TextStyle.SHORT, map12);
            HashMap map13 = new HashMap();
            map13.put(1L, "1st quarter");
            map13.put(2L, "2nd quarter");
            map13.put(3L, "3rd quarter");
            map13.put(4L, "4th quarter");
            map11.put(TextStyle.FULL, map13);
            return h(map11);
        }
        DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
        HashMap map14 = new HashMap();
        String[] eras = dateFormatSymbols4.getEras();
        HashMap map15 = new HashMap();
        map15.put(0L, eras[0]);
        map15.put(1L, eras[1]);
        map14.put(TextStyle.SHORT, map15);
        if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
            HashMap map16 = new HashMap();
            map16.put(0L, "Before Christ");
            map16.put(1L, "Anno Domini");
            map14.put(TextStyle.FULL, map16);
        } else {
            map14.put(TextStyle.FULL, map15);
        }
        HashMap map17 = new HashMap();
        map17.put(0L, eras[0].substring(0, 1));
        map17.put(1L, eras[1].substring(0, 1));
        map14.put(TextStyle.NARROW, map17);
        return h(map14);
    }

    public final Object j(z4p z4pVar, Locale locale) {
        Map.Entry<z4p, Locale> entryG = g(z4pVar, locale);
        Object obj = this.f31375b.get(entryG);
        if (obj != null) {
            return obj;
        }
        this.f31375b.putIfAbsent(entryG, i(z4pVar, locale));
        return this.f31375b.get(entryG);
    }
}
