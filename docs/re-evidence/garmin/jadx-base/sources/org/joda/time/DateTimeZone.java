package org.joda.time;

import am.j;
import ch.qos.logback.core.CoreConstants;
import com.google.common.net.HttpHeaders;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang3.e;
import org.apache.commons.lang3.time.TimeZones;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.FormatUtils;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;
import org.slf4j.Marker;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DateTimeZone implements Serializable {
    public static final String DEFAULT_TZ_DATA_PATH = "org/joda/time/tz/data";
    private static final int MAX_MILLIS = 86399999;
    private static final long serialVersionUID = 5546345482340108586L;
    private final String iID;
    public static final DateTimeZone UTC = UTCDateTimeZone.INSTANCE;
    private static final AtomicReference<Provider> cProvider = new AtomicReference<>();
    private static final AtomicReference<NameProvider> cNameProvider = new AtomicReference<>();
    private static final AtomicReference<DateTimeZone> cDefault = new AtomicReference<>();

    public static final class LazyInit {
        static final Map<String, String> CONVERSION_MAP = buildMap();
        static final DateTimeFormatter OFFSET_FORMATTER = buildFormatter();

        private static DateTimeFormatter buildFormatter() {
            return new DateTimeFormatterBuilder().appendTimeZoneOffset(null, true, 2, 4).toFormatter().withChronology(new BaseChronology() { // from class: org.joda.time.DateTimeZone.LazyInit.1
                private static final long serialVersionUID = -3128740902654445468L;

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public DateTimeZone getZone() {
                    return null;
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public String toString() {
                    return AnonymousClass1.class.getName();
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public Chronology withUTC() {
                    return this;
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public Chronology withZone(DateTimeZone dateTimeZone) {
                    return this;
                }
            });
        }

        private static Map<String, String> buildMap() {
            HashMap map = new HashMap();
            map.put(TimeZones.GMT_ID, "UTC");
            map.put("WET", "WET");
            map.put("CET", "CET");
            map.put("MET", "CET");
            map.put(HttpHeaders.ECT, "CET");
            map.put("EET", "EET");
            map.put("MIT", "Pacific/Apia");
            map.put("HST", "Pacific/Honolulu");
            map.put("AST", "America/Anchorage");
            map.put("PST", "America/Los_Angeles");
            map.put("MST", "America/Denver");
            map.put("PNT", "America/Phoenix");
            map.put("CST", "America/Chicago");
            map.put("EST", "America/New_York");
            map.put("IET", "America/Indiana/Indianapolis");
            map.put("PRT", "America/Puerto_Rico");
            map.put("CNT", "America/St_Johns");
            map.put("AGT", "America/Argentina/Buenos_Aires");
            map.put("BET", "America/Sao_Paulo");
            map.put("ART", "Africa/Cairo");
            map.put("CAT", "Africa/Harare");
            map.put("EAT", "Africa/Addis_Ababa");
            map.put("NET", "Asia/Yerevan");
            map.put("PLT", "Asia/Karachi");
            map.put("IST", "Asia/Kolkata");
            map.put("BST", "Asia/Dhaka");
            map.put("VST", "Asia/Ho_Chi_Minh");
            map.put("CTT", "Asia/Shanghai");
            map.put("JST", "Asia/Tokyo");
            map.put("ACT", "Australia/Darwin");
            map.put("AET", "Australia/Sydney");
            map.put("SST", "Pacific/Guadalcanal");
            map.put("NST", "Pacific/Auckland");
            return Collections.unmodifiableMap(map);
        }
    }

    public static final class Stub implements Serializable {
        private static final long serialVersionUID = -6471952376487863581L;
        private transient String iID;

        public Stub(String str) {
            this.iID = str;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iID = objectInputStream.readUTF();
        }

        private Object readResolve() {
            return DateTimeZone.forID(this.iID);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeUTF(this.iID);
        }
    }

    public DateTimeZone(String str) {
        if (str != null) {
            this.iID = str;
        } else {
            h.s("Id must not be null");
            throw null;
        }
    }

    private static String convertToAsciiNumber(String str) {
        StringBuilder sb3 = new StringBuilder(str);
        for (int i14 = 0; i14 < sb3.length(); i14++) {
            int iDigit = Character.digit(sb3.charAt(i14), 10);
            if (iDigit >= 0) {
                sb3.setCharAt(i14, (char) (iDigit + 48));
            }
        }
        return sb3.toString();
    }

    private static DateTimeZone fixedOffsetZone(String str, int i14) {
        return i14 == 0 ? UTC : new FixedDateTimeZone(str, null, i14, i14);
    }

    @FromString
    public static DateTimeZone forID(String str) {
        String strSubstring;
        if (str == null) {
            return getDefault();
        }
        if (str.equals("UTC")) {
            return UTC;
        }
        DateTimeZone zone = getProvider().getZone(str);
        if (zone != null) {
            return zone;
        }
        if (str.equals("UT") || str.equals(TimeZones.GMT_ID) || str.equals("Z")) {
            return UTC;
        }
        if (str.startsWith("UTC+") || str.startsWith("UTC-") || str.startsWith("GMT+") || str.startsWith("GMT-")) {
            strSubstring = str.substring(3);
        } else {
            strSubstring = (str.startsWith("UT+") || str.startsWith("UT-")) ? str.substring(2) : str;
        }
        if (strSubstring.startsWith(Marker.ANY_NON_NULL_MARKER) || strSubstring.startsWith("-")) {
            int offset = parseOffset(strSubstring);
            return ((long) offset) == 0 ? UTC : fixedOffsetZone(printOffset(offset), offset);
        }
        h.s(j.m("The datetime zone id '", str, "' is not recognised"));
        return null;
    }

    public static DateTimeZone forOffsetHours(int i14) {
        return forOffsetHoursMinutes(i14, 0);
    }

    public static DateTimeZone forOffsetHoursMinutes(int i14, int i15) {
        if (i14 == 0 && i15 == 0) {
            return UTC;
        }
        if (i14 < -23 || i14 > 23) {
            h.s(j.h(i14, "Hours out of range: "));
            return null;
        }
        if (i15 < -59 || i15 > 59) {
            h.s(j.h(i15, "Minutes out of range: "));
            return null;
        }
        if (i14 > 0 && i15 < 0) {
            h.s(j.h(i15, "Positive hours must not have negative minutes: "));
            return null;
        }
        int i16 = i14 * 60;
        try {
            return forOffsetMillis(FieldUtils.safeMultiply(i16 < 0 ? i16 - Math.abs(i15) : i16 + i15, DateTimeConstants.MILLIS_PER_MINUTE));
        } catch (ArithmeticException unused) {
            h.s("Offset is too large");
            return null;
        }
    }

    public static DateTimeZone forOffsetMillis(int i14) {
        if (i14 >= -86399999 && i14 <= MAX_MILLIS) {
            return fixedOffsetZone(printOffset(i14), i14);
        }
        h.s(j.h(i14, "Millis out of range: "));
        return null;
    }

    public static DateTimeZone forTimeZone(TimeZone timeZone) {
        char cCharAt;
        if (timeZone == null) {
            return getDefault();
        }
        String id3 = timeZone.getID();
        if (id3 == null) {
            h.s("The TimeZone id must not be null");
            return null;
        }
        if (id3.equals("UTC")) {
            return UTC;
        }
        String convertedId = getConvertedId(id3);
        Provider provider = getProvider();
        DateTimeZone zone = convertedId != null ? provider.getZone(convertedId) : null;
        if (zone == null) {
            zone = provider.getZone(id3);
        }
        if (zone != null) {
            return zone;
        }
        if (convertedId != null || (!id3.startsWith("GMT+") && !id3.startsWith("GMT-"))) {
            h.s(j.m("The datetime zone id '", id3, "' is not recognised"));
            return null;
        }
        String strSubstring = id3.substring(3);
        if (strSubstring.length() > 2 && (cCharAt = strSubstring.charAt(1)) > '9' && Character.isDigit(cCharAt)) {
            strSubstring = convertToAsciiNumber(strSubstring);
        }
        int offset = parseOffset(strSubstring);
        return ((long) offset) == 0 ? UTC : fixedOffsetZone(printOffset(offset), offset);
    }

    public static Set<String> getAvailableIDs() {
        return getProvider().getAvailableIDs();
    }

    private static String getConvertedId(String str) {
        return LazyInit.CONVERSION_MAP.get(str);
    }

    public static DateTimeZone getDefault() {
        DateTimeZone dateTimeZoneForTimeZone = cDefault.get();
        if (dateTimeZoneForTimeZone != null) {
            return dateTimeZoneForTimeZone;
        }
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.Timezone");
            if (property != null) {
                dateTimeZoneForTimeZone = forID(property);
            }
        } catch (RuntimeException unused) {
        }
        if (dateTimeZoneForTimeZone == null) {
            try {
                dateTimeZoneForTimeZone = forTimeZone(TimeZone.getDefault());
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (dateTimeZoneForTimeZone == null) {
            dateTimeZoneForTimeZone = UTC;
        }
        DateTimeZone dateTimeZone = dateTimeZoneForTimeZone;
        AtomicReference<DateTimeZone> atomicReference = cDefault;
        while (!atomicReference.compareAndSet(null, dateTimeZone)) {
            if (atomicReference.get() != null) {
                return cDefault.get();
            }
        }
        return dateTimeZone;
    }

    private static NameProvider getDefaultNameProvider() {
        NameProvider nameProvider = null;
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if (property != null) {
                try {
                    Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                    if (!NameProvider.class.isAssignableFrom(cls)) {
                        throw new IllegalArgumentException("System property referred to class that does not implement " + NameProvider.class);
                    }
                    nameProvider = (NameProvider) cls.asSubclass(NameProvider.class).getConstructor(null).newInstance(null);
                } catch (Exception e4) {
                    throw new RuntimeException(e4);
                }
            }
        } catch (SecurityException unused) {
        }
        return nameProvider == null ? new DefaultNameProvider() : nameProvider;
    }

    private static Provider getDefaultProvider() {
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.Provider");
            if (property != null) {
                try {
                    Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                    if (Provider.class.isAssignableFrom(cls)) {
                        return validateProvider((Provider) cls.asSubclass(Provider.class).getConstructor(null).newInstance(null));
                    }
                    throw new IllegalArgumentException("System property referred to class that does not implement " + Provider.class);
                } catch (Exception e4) {
                    throw new RuntimeException(e4);
                }
            }
        } catch (SecurityException unused) {
        }
        try {
            String property2 = System.getProperty("org.joda.time.DateTimeZone.Folder");
            if (property2 != null) {
                try {
                    return validateProvider(new ZoneInfoProvider(new File(property2)));
                } catch (Exception e14) {
                    throw new RuntimeException(e14);
                }
            }
        } catch (SecurityException unused2) {
        }
        try {
            return validateProvider(new ZoneInfoProvider(DEFAULT_TZ_DATA_PATH));
        } catch (Exception e15) {
            e15.printStackTrace();
            return new UTCProvider();
        }
    }

    public static NameProvider getNameProvider() {
        AtomicReference<NameProvider> atomicReference = cNameProvider;
        NameProvider nameProvider = atomicReference.get();
        if (nameProvider != null) {
            return nameProvider;
        }
        NameProvider defaultNameProvider = getDefaultNameProvider();
        while (!atomicReference.compareAndSet(null, defaultNameProvider)) {
            if (atomicReference.get() != null) {
                return cNameProvider.get();
            }
        }
        return defaultNameProvider;
    }

    public static Provider getProvider() {
        AtomicReference<Provider> atomicReference = cProvider;
        Provider provider = atomicReference.get();
        if (provider != null) {
            return provider;
        }
        Provider defaultProvider = getDefaultProvider();
        while (!atomicReference.compareAndSet(null, defaultProvider)) {
            if (atomicReference.get() != null) {
                return cProvider.get();
            }
        }
        return defaultProvider;
    }

    private static int parseOffset(String str) {
        return -((int) LazyInit.OFFSET_FORMATTER.parseMillis(str));
    }

    private static String printOffset(int i14) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i14 >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i14 = -i14;
        }
        int i15 = i14 / DateTimeConstants.MILLIS_PER_HOUR;
        FormatUtils.appendPaddedInteger(stringBuffer, i15, 2);
        int i16 = i14 - (i15 * DateTimeConstants.MILLIS_PER_HOUR);
        int i17 = i16 / DateTimeConstants.MILLIS_PER_MINUTE;
        stringBuffer.append(CoreConstants.COLON_CHAR);
        FormatUtils.appendPaddedInteger(stringBuffer, i17, 2);
        int i18 = i16 - (i17 * DateTimeConstants.MILLIS_PER_MINUTE);
        if (i18 == 0) {
            return stringBuffer.toString();
        }
        int i19 = i18 / 1000;
        stringBuffer.append(CoreConstants.COLON_CHAR);
        FormatUtils.appendPaddedInteger(stringBuffer, i19, 2);
        int i24 = i18 - (i19 * 1000);
        if (i24 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        FormatUtils.appendPaddedInteger(stringBuffer, i24, 3);
        return stringBuffer.toString();
    }

    public static void setDefault(DateTimeZone dateTimeZone) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        if (dateTimeZone != null) {
            cDefault.set(dateTimeZone);
        } else {
            h.s("The datetime zone must not be null");
        }
    }

    public static void setNameProvider(NameProvider nameProvider) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setNameProvider"));
        }
        if (nameProvider == null) {
            nameProvider = getDefaultNameProvider();
        }
        cNameProvider.set(nameProvider);
    }

    public static void setProvider(Provider provider) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        if (provider == null) {
            provider = getDefaultProvider();
        } else {
            validateProvider(provider);
        }
        cProvider.set(provider);
    }

    private static Provider validateProvider(Provider provider) {
        Set<String> availableIDs = provider.getAvailableIDs();
        if (availableIDs == null || availableIDs.size() == 0) {
            h.s("The provider doesn't have any available ids");
            return null;
        }
        if (!availableIDs.contains("UTC")) {
            h.s("The provider doesn't support UTC");
            return null;
        }
        if (UTC.equals(provider.getZone("UTC"))) {
            return provider;
        }
        h.s("Invalid UTC zone provided");
        return null;
    }

    public long adjustOffset(long j8, boolean z14) {
        long j14 = j8 - 10800000;
        long offset = getOffset(j14);
        long offset2 = getOffset(10800000 + j8);
        if (offset <= offset2) {
            return j8;
        }
        long j15 = offset - offset2;
        long jNextTransition = nextTransition(j14);
        long j16 = jNextTransition - j15;
        long j17 = jNextTransition + j15;
        if (j8 < j16 || j8 >= j17) {
            return j8;
        }
        if (j8 - j16 >= j15) {
            return z14 ? j8 : j8 - j15;
        }
        return z14 ? j8 + j15 : j8;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    public long convertLocalToUTC(long j8, boolean z14) {
        int offset = getOffset(j8);
        long j14 = j8 - ((long) offset);
        int offset2 = getOffset(j14);
        if (offset == offset2 || (!z14 && offset >= 0)) {
            offset = offset2;
        } else {
            long jNextTransition = nextTransition(j14);
            if (jNextTransition == j14) {
                jNextTransition = Long.MAX_VALUE;
            }
            long j15 = j8 - ((long) offset2);
            long jNextTransition2 = nextTransition(j15);
            if (jNextTransition == (jNextTransition2 != j15 ? jNextTransition2 : Long.MAX_VALUE)) {
                offset = offset2;
            } else if (z14) {
                throw new IllegalInstantException(j8, getID());
            }
        }
        long j16 = offset;
        long j17 = j8 - j16;
        if ((j8 ^ j17) >= 0 || (j8 ^ j16) >= 0) {
            return j17;
        }
        e.u("Subtracting time zone offset caused overflow");
        return 0L;
    }

    public long convertUTCToLocal(long j8) {
        long offset = getOffset(j8);
        long j14 = j8 + offset;
        if ((j8 ^ j14) >= 0 || (j8 ^ offset) < 0) {
            return j14;
        }
        e.u("Adding time zone offset caused overflow");
        return 0L;
    }

    public abstract boolean equals(Object obj);

    @ToString
    public final String getID() {
        return this.iID;
    }

    public long getMillisKeepLocal(DateTimeZone dateTimeZone, long j8) {
        if (dateTimeZone == null) {
            dateTimeZone = getDefault();
        }
        DateTimeZone dateTimeZone2 = dateTimeZone;
        return dateTimeZone2 == this ? j8 : dateTimeZone2.convertLocalToUTC(convertUTCToLocal(j8), false, j8);
    }

    public String getName(long j8, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j8);
        if (nameKey == null) {
            return this.iID;
        }
        NameProvider nameProvider = getNameProvider();
        boolean z14 = nameProvider instanceof DefaultNameProvider;
        String str = this.iID;
        String name = z14 ? ((DefaultNameProvider) nameProvider).getName(locale, str, nameKey, isStandardOffset(j8)) : nameProvider.getName(locale, str, nameKey);
        return name != null ? name : printOffset(getOffset(j8));
    }

    public abstract String getNameKey(long j8);

    public abstract int getOffset(long j8);

    public final int getOffset(ReadableInstant readableInstant) {
        return readableInstant == null ? getOffset(DateTimeUtils.currentTimeMillis()) : getOffset(readableInstant.getMillis());
    }

    public int getOffsetFromLocal(long j8) {
        int offset = getOffset(j8);
        long j14 = j8 - ((long) offset);
        int offset2 = getOffset(j14);
        if (offset != offset2) {
            if (offset - offset2 < 0) {
                long jNextTransition = nextTransition(j14);
                if (jNextTransition == j14) {
                    jNextTransition = Long.MAX_VALUE;
                }
                long j15 = j8 - ((long) offset2);
                long jNextTransition2 = nextTransition(j15);
                if (jNextTransition != (jNextTransition2 != j15 ? jNextTransition2 : Long.MAX_VALUE)) {
                    return offset;
                }
            }
        } else if (offset >= 0) {
            long jPreviousTransition = previousTransition(j14);
            if (jPreviousTransition < j14) {
                int offset3 = getOffset(jPreviousTransition);
                if (j14 - jPreviousTransition <= offset3 - offset) {
                    return offset3;
                }
            }
        }
        return offset2;
    }

    public String getShortName(long j8, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j8);
        if (nameKey == null) {
            return this.iID;
        }
        NameProvider nameProvider = getNameProvider();
        boolean z14 = nameProvider instanceof DefaultNameProvider;
        String str = this.iID;
        String shortName = z14 ? ((DefaultNameProvider) nameProvider).getShortName(locale, str, nameKey, isStandardOffset(j8)) : nameProvider.getShortName(locale, str, nameKey);
        return shortName != null ? shortName : printOffset(getOffset(j8));
    }

    public abstract int getStandardOffset(long j8);

    public int hashCode() {
        return getID().hashCode() + 57;
    }

    public abstract boolean isFixed();

    public boolean isLocalDateTimeGap(LocalDateTime localDateTime) {
        if (isFixed()) {
            return false;
        }
        try {
            localDateTime.toDateTime(this);
            return false;
        } catch (IllegalInstantException unused) {
            return true;
        }
    }

    public boolean isStandardOffset(long j8) {
        return getOffset(j8) == getStandardOffset(j8);
    }

    public abstract long nextTransition(long j8);

    public abstract long previousTransition(long j8);

    public String toString() {
        return getID();
    }

    public TimeZone toTimeZone() {
        return TimeZone.getTimeZone(this.iID);
    }

    public Object writeReplace() {
        return new Stub(this.iID);
    }

    public final String getName(long j8) {
        return getName(j8, null);
    }

    public final String getShortName(long j8) {
        return getShortName(j8, null);
    }

    public long convertLocalToUTC(long j8, boolean z14, long j14) {
        int offset = getOffset(j14);
        long j15 = j8 - ((long) offset);
        return getOffset(j15) == offset ? j15 : convertLocalToUTC(j8, z14);
    }
}
