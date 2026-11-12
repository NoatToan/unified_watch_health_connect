package org.apache.commons.lang3.time;

import com.google.firebase.messaging.l;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.lang3.LocaleUtils;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes3.dex */
abstract class FormatCache<F extends Format> {
    static final int NONE = -1;
    private static final ConcurrentMap<ArrayKey, String> cDateTimeInstanceCache = new ConcurrentHashMap(7);
    private final ConcurrentMap<ArrayKey, F> cInstanceCache = new ConcurrentHashMap(7);

    public static final class ArrayKey {
        private final int hashCode;
        private final Object[] keys;

        public ArrayKey(Object... objArr) {
            this.keys = objArr;
            this.hashCode = computeHashCode(objArr);
        }

        private static int computeHashCode(Object[] objArr) {
            return Arrays.hashCode(objArr) + 31;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && ArrayKey.class == obj.getClass()) {
                return Arrays.deepEquals(this.keys, ((ArrayKey) obj).keys);
            }
            return false;
        }

        public int hashCode() {
            return this.hashCode;
        }
    }

    private F getDateTimeInstance(Integer num, Integer num2, TimeZone timeZone, Locale locale) {
        Locale locale2 = LocaleUtils.toLocale(locale);
        return (F) getInstance(getPatternForStyle(num, num2, locale2), timeZone, locale2);
    }

    public static String getPatternForStyle(Integer num, Integer num2, Locale locale) {
        DateFormat dateInstance;
        Locale locale2 = LocaleUtils.toLocale(locale);
        ArrayKey arrayKey = new ArrayKey(num, num2, locale2);
        ConcurrentMap<ArrayKey, String> concurrentMap = cDateTimeInstanceCache;
        String str = concurrentMap.get(arrayKey);
        if (str != null) {
            return str;
        }
        try {
            if (num == null) {
                dateInstance = DateFormat.getTimeInstance(num2.intValue(), locale2);
            } else {
                dateInstance = num2 == null ? DateFormat.getDateInstance(num.intValue(), locale2) : DateFormat.getDateTimeInstance(num.intValue(), num2.intValue(), locale2);
            }
            String pattern = ((SimpleDateFormat) dateInstance).toPattern();
            String strPutIfAbsent = concurrentMap.putIfAbsent(arrayKey, pattern);
            return strPutIfAbsent != null ? strPutIfAbsent : pattern;
        } catch (ClassCastException unused) {
            l.j(locale2, "No date time pattern for locale: ");
            return null;
        }
    }

    public abstract F createInstance(String str, TimeZone timeZone, Locale locale);

    public F getDateInstance(int i14, TimeZone timeZone, Locale locale) {
        return (F) getDateTimeInstance(Integer.valueOf(i14), (Integer) null, timeZone, locale);
    }

    public F getInstance(String str, TimeZone timeZone, Locale locale) {
        Validate.notNull(str, "pattern", new Object[0]);
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        Locale locale2 = LocaleUtils.toLocale(locale);
        ArrayKey arrayKey = new ArrayKey(str, timeZone, locale2);
        F f14 = this.cInstanceCache.get(arrayKey);
        if (f14 != null) {
            return f14;
        }
        F f15 = (F) createInstance(str, timeZone, locale2);
        F fPutIfAbsent = this.cInstanceCache.putIfAbsent(arrayKey, f15);
        return fPutIfAbsent != null ? fPutIfAbsent : f15;
    }

    public F getTimeInstance(int i14, TimeZone timeZone, Locale locale) {
        return (F) getDateTimeInstance((Integer) null, Integer.valueOf(i14), timeZone, locale);
    }

    public F getDateTimeInstance(int i14, int i15, TimeZone timeZone, Locale locale) {
        return (F) getDateTimeInstance(Integer.valueOf(i14), Integer.valueOf(i15), timeZone, locale);
    }

    public F getInstance() {
        return (F) getDateTimeInstance(3, 3, TimeZone.getDefault(), Locale.getDefault());
    }
}
