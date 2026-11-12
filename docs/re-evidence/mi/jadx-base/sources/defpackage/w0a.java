package defpackage;

import cn.hutool.core.lang.Tuple;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class w0a<F extends Format> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentMap<Tuple, String> f37411b = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentMap<Tuple, F> f37412a = new ConcurrentHashMap(7);

    public static String f(Integer num, Integer num2, Locale locale) {
        DateFormat dateInstance;
        Tuple tuple = new Tuple(num, num2, locale);
        ConcurrentMap<Tuple, String> concurrentMap = f37411b;
        String str = concurrentMap.get(tuple);
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
            String strPutIfAbsent = concurrentMap.putIfAbsent(tuple, pattern);
            return strPutIfAbsent != null ? strPutIfAbsent : pattern;
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("No date time pattern for locale: " + locale);
        }
    }

    public abstract F a(String str, TimeZone timeZone, Locale locale);

    public F b(int i, TimeZone timeZone, Locale locale) {
        return (F) c(Integer.valueOf(i), null, timeZone, locale);
    }

    public F c(Integer num, Integer num2, TimeZone timeZone, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return (F) e(f(num, num2, locale), timeZone, locale);
    }

    public F d() {
        return (F) c(3, 3, null, null);
    }

    public F e(String str, TimeZone timeZone, Locale locale) {
        qk1.p(str, "pattern must not be blank", new Object[0]);
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Tuple tuple = new Tuple(str, timeZone, locale);
        F f = this.f37412a.get(tuple);
        if (f != null) {
            return f;
        }
        F f2 = (F) a(str, timeZone, locale);
        F fPutIfAbsent = this.f37412a.putIfAbsent(tuple, f2);
        return fPutIfAbsent != null ? fPutIfAbsent : f2;
    }

    public F g(int i, TimeZone timeZone, Locale locale) {
        return (F) c(null, Integer.valueOf(i), timeZone, locale);
    }
}
