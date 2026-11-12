package org.joda.time;

import com.miui.tsmclient.util.Constants;
import defpackage.bw3;
import defpackage.cei;
import defpackage.d1a;
import defpackage.d8i;
import defpackage.e8q;
import defpackage.fl9;
import defpackage.fw5;
import defpackage.h1s;
import defpackage.jq5;
import defpackage.kgj;
import defpackage.lgg;
import defpackage.lq5;
import defpackage.wq5;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DateTimeZone implements Serializable {
    public static final String DEFAULT_TZ_DATA_PATH = "org/joda/time/tz/data";
    private static final int MAX_MILLIS = 86399999;
    private static final long serialVersionUID = 5546345482340108586L;
    private final String iID;
    public static final DateTimeZone UTC = org.joda.time.a.f29539a;
    private static final AtomicReference<cei> cProvider = new AtomicReference<>();
    private static final AtomicReference<lgg> cNameProvider = new AtomicReference<>();
    private static final AtomicReference<DateTimeZone> cDefault = new AtomicReference<>();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map<String, String> f29535a = b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final jq5 f29536b = a();

        /* JADX INFO: renamed from: org.joda.time.DateTimeZone$a$a, reason: collision with other inner class name */
        public static class C1065a extends BaseChronology {
            private static final long serialVersionUID = -3128740902654445468L;

            @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
            public DateTimeZone getZone() {
                return null;
            }

            @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
            public String toString() {
                return C1065a.class.getName();
            }

            @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
            public bw3 withUTC() {
                return this;
            }

            @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
            public bw3 withZone(DateTimeZone dateTimeZone) {
                return this;
            }
        }

        public static jq5 a() {
            return new lq5().M(null, true, 2, 4).e0().u(new C1065a());
        }

        public static Map<String, String> b() {
            HashMap map = new HashMap();
            map.put("GMT", "UTC");
            map.put("WET", "WET");
            map.put("CET", "CET");
            map.put("MET", "CET");
            map.put("ECT", "CET");
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

    public static final class b implements Serializable {
        private static final long serialVersionUID = -6471952376487863581L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient String f29537a;

        public b(String str) {
            this.f29537a = str;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            this.f29537a = objectInputStream.readUTF();
        }

        private Object readResolve() throws ObjectStreamException {
            return DateTimeZone.forID(this.f29537a);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeUTF(this.f29537a);
        }
    }

    public DateTimeZone(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Id must not be null");
        }
        this.iID = str;
    }

    private static String convertToAsciiNumber(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            int iDigit = Character.digit(sb.charAt(i), 10);
            if (iDigit >= 0) {
                sb.setCharAt(i, (char) (iDigit + 48));
            }
        }
        return sb.toString();
    }

    private static DateTimeZone fixedOffsetZone(String str, int i) {
        return i == 0 ? UTC : new FixedDateTimeZone(str, null, i, i);
    }

    @FromString
    public static DateTimeZone forID(String str) {
        if (str == null) {
            return getDefault();
        }
        if (str.equals("UTC")) {
            return UTC;
        }
        DateTimeZone dateTimeZoneA = getProvider().a(str);
        if (dateTimeZoneA != null) {
            return dateTimeZoneA;
        }
        if (str.startsWith(Marker.ANY_NON_NULL_MARKER) || str.startsWith("-")) {
            int offset = parseOffset(str);
            return ((long) offset) == 0 ? UTC : fixedOffsetZone(printOffset(offset), offset);
        }
        throw new IllegalArgumentException("The datetime zone id '" + str + "' is not recognised");
    }

    public static DateTimeZone forOffsetHours(int i) throws IllegalArgumentException {
        return forOffsetHoursMinutes(i, 0);
    }

    public static DateTimeZone forOffsetHoursMinutes(int i, int i2) throws IllegalArgumentException {
        if (i == 0 && i2 == 0) {
            return UTC;
        }
        if (i < -23 || i > 23) {
            throw new IllegalArgumentException("Hours out of range: " + i);
        }
        if (i2 < -59 || i2 > 59) {
            throw new IllegalArgumentException("Minutes out of range: " + i2);
        }
        if (i <= 0 || i2 >= 0) {
            int i3 = i * 60;
            try {
                return forOffsetMillis(fl9.h(i3 < 0 ? i3 - Math.abs(i2) : i3 + i2, 60000));
            } catch (ArithmeticException unused) {
                throw new IllegalArgumentException("Offset is too large");
            }
        }
        throw new IllegalArgumentException("Positive hours must not have negative minutes: " + i2);
    }

    public static DateTimeZone forOffsetMillis(int i) {
        if (i >= -86399999 && i <= MAX_MILLIS) {
            return fixedOffsetZone(printOffset(i), i);
        }
        throw new IllegalArgumentException("Millis out of range: " + i);
    }

    public static DateTimeZone forTimeZone(TimeZone timeZone) {
        char cCharAt;
        if (timeZone == null) {
            return getDefault();
        }
        String id = timeZone.getID();
        if (id == null) {
            throw new IllegalArgumentException("The TimeZone id must not be null");
        }
        if (id.equals("UTC")) {
            return UTC;
        }
        String convertedId = getConvertedId(id);
        cei provider = getProvider();
        DateTimeZone dateTimeZoneA = convertedId != null ? provider.a(convertedId) : null;
        if (dateTimeZoneA == null) {
            dateTimeZoneA = provider.a(id);
        }
        if (dateTimeZoneA != null) {
            return dateTimeZoneA;
        }
        if (convertedId != null || (!id.startsWith("GMT+") && !id.startsWith("GMT-"))) {
            throw new IllegalArgumentException("The datetime zone id '" + id + "' is not recognised");
        }
        String strSubstring = id.substring(3);
        if (strSubstring.length() > 2 && (cCharAt = strSubstring.charAt(1)) > '9' && Character.isDigit(cCharAt)) {
            strSubstring = convertToAsciiNumber(strSubstring);
        }
        int offset = parseOffset(strSubstring);
        return ((long) offset) == 0 ? UTC : fixedOffsetZone(printOffset(offset), offset);
    }

    public static Set<String> getAvailableIDs() {
        return getProvider().b();
    }

    private static String getConvertedId(String str) {
        return a.f29535a.get(str);
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
        AtomicReference<DateTimeZone> atomicReference = cDefault;
        return !d8i.a(atomicReference, null, dateTimeZoneForTimeZone) ? atomicReference.get() : dateTimeZoneForTimeZone;
    }

    private static lgg getDefaultNameProvider() {
        lgg lggVar = null;
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if (property != null) {
                try {
                    Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                    if (!lgg.class.isAssignableFrom(cls)) {
                        throw new IllegalArgumentException("System property referred to class that does not implement " + lgg.class);
                    }
                    lggVar = (lgg) cls.asSubclass(lgg.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (SecurityException unused) {
        }
        return lggVar == null ? new fw5() : lggVar;
    }

    private static cei getDefaultProvider() {
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.Provider");
            if (property != null) {
                try {
                    Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                    if (cei.class.isAssignableFrom(cls)) {
                        return validateProvider((cei) cls.asSubclass(cei.class).getConstructor(new Class[0]).newInstance(new Object[0]));
                    }
                    throw new IllegalArgumentException("System property referred to class that does not implement " + cei.class);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (SecurityException unused) {
        }
        try {
            String property2 = System.getProperty("org.joda.time.DateTimeZone.Folder");
            if (property2 != null) {
                try {
                    return validateProvider(new h1s(new File(property2)));
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
        } catch (SecurityException unused2) {
        }
        try {
            return validateProvider(new h1s(DEFAULT_TZ_DATA_PATH));
        } catch (Exception e3) {
            e3.printStackTrace();
            return new e8q();
        }
    }

    public static lgg getNameProvider() {
        AtomicReference<lgg> atomicReference = cNameProvider;
        lgg lggVar = atomicReference.get();
        if (lggVar != null) {
            return lggVar;
        }
        lgg defaultNameProvider = getDefaultNameProvider();
        return !d8i.a(atomicReference, null, defaultNameProvider) ? atomicReference.get() : defaultNameProvider;
    }

    public static cei getProvider() {
        AtomicReference<cei> atomicReference = cProvider;
        cei ceiVar = atomicReference.get();
        if (ceiVar != null) {
            return ceiVar;
        }
        cei defaultProvider = getDefaultProvider();
        return !d8i.a(atomicReference, null, defaultProvider) ? atomicReference.get() : defaultProvider;
    }

    private static int parseOffset(String str) {
        return -((int) a.f29536b.j(str));
    }

    private static String printOffset(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i = -i;
        }
        int i2 = i / 3600000;
        d1a.b(stringBuffer, i2, 2);
        int i3 = i - (i2 * 3600000);
        int i4 = i3 / 60000;
        stringBuffer.append(AbstractJsonLexerKt.COLON);
        d1a.b(stringBuffer, i4, 2);
        int i5 = i3 - (i4 * 60000);
        if (i5 == 0) {
            return stringBuffer.toString();
        }
        int i6 = i5 / 1000;
        stringBuffer.append(AbstractJsonLexerKt.COLON);
        d1a.b(stringBuffer, i6, 2);
        int i7 = i5 - (i6 * 1000);
        if (i7 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        d1a.b(stringBuffer, i7, 3);
        return stringBuffer.toString();
    }

    public static void setDefault(DateTimeZone dateTimeZone) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        if (dateTimeZone == null) {
            throw new IllegalArgumentException("The datetime zone must not be null");
        }
        cDefault.set(dateTimeZone);
    }

    public static void setNameProvider(lgg lggVar) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setNameProvider"));
        }
        if (lggVar == null) {
            lggVar = getDefaultNameProvider();
        }
        cNameProvider.set(lggVar);
    }

    public static void setProvider(cei ceiVar) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        if (ceiVar == null) {
            ceiVar = getDefaultProvider();
        } else {
            validateProvider(ceiVar);
        }
        cProvider.set(ceiVar);
    }

    private static cei validateProvider(cei ceiVar) {
        Set<String> setB = ceiVar.b();
        if (setB == null || setB.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!setB.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        if (UTC.equals(ceiVar.a("UTC"))) {
            return ceiVar;
        }
        throw new IllegalArgumentException("Invalid UTC zone provided");
    }

    public long adjustOffset(long j, boolean z) {
        long j2 = j - Constants.TIME_OFFSET;
        long j3 = Constants.TIME_OFFSET + j;
        long offset = getOffset(j2);
        long offset2 = getOffset(j3);
        if (offset <= offset2) {
            return j;
        }
        long j4 = offset - offset2;
        long jNextTransition = nextTransition(j2);
        long j5 = jNextTransition - j4;
        long j6 = jNextTransition + j4;
        if (j < j5 || j >= j6) {
            return j;
        }
        if (j - j5 >= j4) {
            return z ? j : j - j4;
        }
        return z ? j + j4 : j;
    }

    public long convertLocalToUTC(long j, boolean z, long j2) {
        int offset = getOffset(j2);
        long j3 = j - ((long) offset);
        return getOffset(j3) == offset ? j3 : convertLocalToUTC(j, z);
    }

    public long convertUTCToLocal(long j) {
        long offset = getOffset(j);
        long j2 = j + offset;
        if ((j ^ j2) >= 0 || (j ^ offset) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract boolean equals(Object obj);

    @ToString
    public final String getID() {
        return this.iID;
    }

    public long getMillisKeepLocal(DateTimeZone dateTimeZone, long j) {
        if (dateTimeZone == null) {
            dateTimeZone = getDefault();
        }
        DateTimeZone dateTimeZone2 = dateTimeZone;
        return dateTimeZone2 == this ? j : dateTimeZone2.convertLocalToUTC(convertUTCToLocal(j), false, j);
    }

    public final String getName(long j) {
        return getName(j, null);
    }

    public abstract String getNameKey(long j);

    public abstract int getOffset(long j);

    public final int getOffset(kgj kgjVar) {
        return kgjVar == null ? getOffset(wq5.b()) : getOffset(kgjVar.getMillis());
    }

    public int getOffsetFromLocal(long j) {
        int offset = getOffset(j);
        long j2 = j - ((long) offset);
        int offset2 = getOffset(j2);
        if (offset != offset2) {
            if (offset - offset2 < 0) {
                long jNextTransition = nextTransition(j2);
                if (jNextTransition == j2) {
                    jNextTransition = Long.MAX_VALUE;
                }
                long j3 = j - ((long) offset2);
                long jNextTransition2 = nextTransition(j3);
                if (jNextTransition != (jNextTransition2 != j3 ? jNextTransition2 : Long.MAX_VALUE)) {
                    return offset;
                }
            }
        } else if (offset >= 0) {
            long jPreviousTransition = previousTransition(j2);
            if (jPreviousTransition < j2) {
                int offset3 = getOffset(jPreviousTransition);
                if (j2 - jPreviousTransition <= offset3 - offset) {
                    return offset3;
                }
            }
        }
        return offset2;
    }

    public final String getShortName(long j) {
        return getShortName(j, null);
    }

    public abstract int getStandardOffset(long j);

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

    public boolean isStandardOffset(long j) {
        return getOffset(j) == getStandardOffset(j);
    }

    public abstract long nextTransition(long j);

    public abstract long previousTransition(long j);

    public String toString() {
        return getID();
    }

    public TimeZone toTimeZone() {
        return TimeZone.getTimeZone(this.iID);
    }

    public Object writeReplace() throws ObjectStreamException {
        return new b(this.iID);
    }

    public String getName(long j, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j);
        if (nameKey == null) {
            return this.iID;
        }
        lgg nameProvider = getNameProvider();
        String strD = nameProvider instanceof fw5 ? ((fw5) nameProvider).d(locale, this.iID, nameKey, isStandardOffset(j)) : nameProvider.b(locale, this.iID, nameKey);
        return strD != null ? strD : printOffset(getOffset(j));
    }

    public String getShortName(long j, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j);
        if (nameKey == null) {
            return this.iID;
        }
        lgg nameProvider = getNameProvider();
        String strG = nameProvider instanceof fw5 ? ((fw5) nameProvider).g(locale, this.iID, nameKey, isStandardOffset(j)) : nameProvider.a(locale, this.iID, nameKey);
        return strG != null ? strG : printOffset(getOffset(j));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    public long convertLocalToUTC(long j, boolean z) {
        int offset = getOffset(j);
        long j2 = j - ((long) offset);
        int offset2 = getOffset(j2);
        if (offset == offset2 || (!z && offset >= 0)) {
            offset = offset2;
        } else {
            long jNextTransition = nextTransition(j2);
            if (jNextTransition == j2) {
                jNextTransition = Long.MAX_VALUE;
            }
            long j3 = j - ((long) offset2);
            long jNextTransition2 = nextTransition(j3);
            if (jNextTransition == (jNextTransition2 != j3 ? jNextTransition2 : Long.MAX_VALUE)) {
                offset = offset2;
            } else if (z) {
                throw new IllegalInstantException(j, getID());
            }
        }
        long j4 = offset;
        long j5 = j - j4;
        if ((j ^ j5) >= 0 || (j ^ j4) >= 0) {
            return j5;
        }
        throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }
}
