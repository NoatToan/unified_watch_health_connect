package org.apache.commons.lang3.time;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes23.dex */
abstract class a<F extends Format> {
    public static final int b = -1;
    private static final ConcurrentMap<C1200a, String> c = new ConcurrentHashMap(7);
    private final ConcurrentMap<C1200a, F> a = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: org.apache.commons.lang3.time.a$a, reason: collision with other inner class name */
    public static class C1200a {
        private final Object[] a;
        private int b;

        public C1200a(Object... objArr) {
            this.a = objArr;
        }

        public boolean equals(Object obj) {
            return Arrays.equals(this.a, ((C1200a) obj).a);
        }

        public int hashCode() {
            if (this.b == 0) {
                int iHashCode = 0;
                for (Object obj : this.a) {
                    if (obj != null) {
                        iHashCode = (iHashCode * 7) + obj.hashCode();
                    }
                }
                this.b = iHashCode;
            }
            return this.b;
        }
    }

    private F d(Integer num, Integer num2, TimeZone timeZone, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return (F) f(g(num, num2, locale), timeZone, locale);
    }

    public static String g(Integer num, Integer num2, Locale locale) {
        DateFormat dateInstance;
        C1200a c1200a = new C1200a(num, num2, locale);
        ConcurrentMap<C1200a, String> concurrentMap = c;
        String str = concurrentMap.get(c1200a);
        if (str != null) {
            return str;
        }
        try {
            if (num == null) {
                dateInstance = DateFormat.getTimeInstance(num2.intValue(), locale);
            } else {
                dateInstance = num2 == null ? DateFormat.getDateInstance(num.intValue(), locale) : DateFormat.getDateTimeInstance(num.intValue(), num2.intValue(), locale);
            }
            String pattern = ((SimpleDateFormat) dateInstance).toPattern();
            String strPutIfAbsent = concurrentMap.putIfAbsent(c1200a, pattern);
            return strPutIfAbsent != null ? strPutIfAbsent : pattern;
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("No date time pattern for locale: " + locale);
        }
    }

    public abstract F a(String str, TimeZone timeZone, Locale locale);

    public F b(int i, TimeZone timeZone, Locale locale) {
        return (F) d(Integer.valueOf(i), null, timeZone, locale);
    }

    public F c(int i, int i2, TimeZone timeZone, Locale locale) {
        return (F) d(Integer.valueOf(i), Integer.valueOf(i2), timeZone, locale);
    }

    public F e() {
        return (F) c(3, 3, TimeZone.getDefault(), Locale.getDefault());
    }

    public F f(String str, TimeZone timeZone, Locale locale) {
        Validate.notNull(str, "pattern must not be null", new Object[0]);
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        C1200a c1200a = new C1200a(str, timeZone, locale);
        F f = this.a.get(c1200a);
        if (f != null) {
            return f;
        }
        F f2 = (F) a(str, timeZone, locale);
        F fPutIfAbsent = this.a.putIfAbsent(c1200a, f2);
        return fPutIfAbsent != null ? fPutIfAbsent : f2;
    }

    public F h(int i, TimeZone timeZone, Locale locale) {
        return (F) d(null, Integer.valueOf(i), timeZone, locale);
    }
}
