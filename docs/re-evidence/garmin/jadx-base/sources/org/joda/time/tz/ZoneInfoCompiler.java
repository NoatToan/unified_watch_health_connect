package org.joda.time.tz;

import com.nimbusds.jose.jwk.JWKParameterNames;
import hb.a;
import i3.e5;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import n23.j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.TimeZones;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.slf4j.Marker;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class ZoneInfoCompiler {
    static final Map<String, Integer> DOW_LOOKUP;
    static final Map<String, Integer> MONTH_LOOKUP;
    static Chronology cLenientISO;
    static DateTimeOfYear cStartOfYear;
    static final Set<String> RULE_LOOKUP = expand("rule", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
    static final Set<String> ZONE_LOOKUP = expand("zone", "z");
    static final Set<String> LINK_LOOKUP = expand("link", "l");
    static final Set<String> MIN_YEAR_LOOKUP = expand("minimum", "mi");
    static final Set<String> MAX_YEAR_LOOKUP = expand("maximum", "ma");
    static final Set<String> ONLY_YEAR_LOOKUP = expand("only", "o");
    private Map<String, RuleSet> iRuleSets = new HashMap();
    private List<Zone> iZones = new ArrayList();
    private List<String> iGoodLinks = new ArrayList();
    private List<String> iBackLinks = new ArrayList();

    public static class RuleSet {
        private List<Rule> iRules;

        public RuleSet(Rule rule) {
            ArrayList arrayList = new ArrayList();
            this.iRules = arrayList;
            arrayList.add(rule);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, int i14, String str) {
            int iMin = 0;
            for (int i15 = 0; i15 < this.iRules.size(); i15++) {
                int i16 = this.iRules.get(i15).iSaveMillis;
                if (i16 < 0) {
                    iMin = Math.min(iMin, i16);
                }
            }
            if (iMin < 0) {
                if (ZoneInfoLogger.verbose()) {
                    System.out.println("Fixed negative save values for rule '" + this.iRules.get(0).iName + "'");
                }
                i14 += iMin;
                int iIndexOf = str.indexOf("/");
                if (iIndexOf > 0) {
                    str = str.substring(iIndexOf + 1) + "/" + str.substring(0, iIndexOf);
                }
            }
            dateTimeZoneBuilder.setStandardOffset(i14);
            if (iMin < 0) {
                new Rule(this.iRules.get(0)).addRecurring(dateTimeZoneBuilder, i14, iMin, str);
            }
            for (int i17 = 0; i17 < this.iRules.size(); i17++) {
                this.iRules.get(i17).addRecurring(dateTimeZoneBuilder, i14, iMin, str);
            }
        }

        public void addRule(Rule rule) {
            if (rule.iName.equals(this.iRules.get(0).iName)) {
                this.iRules.add(rule);
            } else {
                h.s("Rule name mismatch");
            }
        }
    }

    static {
        HashMap map = new HashMap();
        MONTH_LOOKUP = map;
        put(expand("january", "ja"), 1, map);
        put(expand("february", "f"), 2, map);
        put(expand("march", "mar"), 3, map);
        put(expand("april", "ap"), 4, map);
        put(expand("may", "may"), 5, map);
        put(expand("june", "jun"), 6, map);
        put(expand("july", "jul"), 7, map);
        put(expand("august", "au"), 8, map);
        put(expand("september", "s"), 9, map);
        put(expand("october", "o"), 10, map);
        put(expand("november", JWKParameterNames.RSA_MODULUS), 11, map);
        put(expand("december", "d"), 12, map);
        HashMap map2 = new HashMap();
        DOW_LOOKUP = map2;
        put(expand("monday", "m"), 1, map2);
        put(expand("tuesday", "tu"), 2, map2);
        put(expand("wednesday", "w"), 3, map2);
        put(expand("thursday", "th"), 4, map2);
        put(expand("friday", "f"), 5, map2);
        put(expand("saturday", "sa"), 6, map2);
        put(expand("sunday", "su"), 7, map2);
    }

    private static Set<String> expand(String str, String str2) {
        HashSet hashSet = new HashSet();
        while (!str.equals(str2)) {
            hashSet.add(str);
            str = str.substring(0, str.length() - 1);
        }
        hashSet.add(str);
        return hashSet;
    }

    public static Chronology getLenientISOChronology() {
        if (cLenientISO == null) {
            cLenientISO = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        }
        return cLenientISO;
    }

    public static DateTimeOfYear getStartOfYear() {
        if (cStartOfYear == null) {
            cStartOfYear = new DateTimeOfYear();
        }
        return cStartOfYear;
    }

    public static void main(String[] strArr) throws Throwable {
        if (strArr.length == 0) {
            printUsage();
            return;
        }
        File file = null;
        int i14 = 0;
        File file2 = null;
        int i15 = 0;
        boolean z14 = false;
        while (i15 < strArr.length) {
            if (!"-src".equals(strArr[i15])) {
                if (!"-dst".equals(strArr[i15])) {
                    if (!"-verbose".equals(strArr[i15])) {
                        if (!"-?".equals(strArr[i15])) {
                            break;
                        }
                        printUsage();
                        return;
                    }
                    z14 = true;
                } else {
                    i15++;
                    if (i15 >= strArr.length) {
                        printUsage();
                        return;
                    }
                    file2 = new File(strArr[i15]);
                }
            } else {
                i15++;
                if (i15 >= strArr.length) {
                    printUsage();
                    return;
                }
                file = new File(strArr[i15]);
            }
            i15++;
        }
        if (i15 >= strArr.length) {
            printUsage();
            return;
        }
        File[] fileArr = new File[strArr.length - i15];
        while (i15 < strArr.length) {
            fileArr[i14] = file == null ? new File(strArr[i15]) : new File(file, strArr[i15]);
            i15++;
            i14++;
        }
        ZoneInfoLogger.set(z14);
        new ZoneInfoCompiler().compile(file2, fileArr);
    }

    public static int parseDayOfWeek(String str) {
        Integer num = DOW_LOOKUP.get(str.toLowerCase(Locale.ENGLISH));
        if (num != null) {
            return num.intValue();
        }
        h.s("Unknown day-of-week: ".concat(str));
        return 0;
    }

    public static int parseMonth(String str) {
        Integer num = MONTH_LOOKUP.get(str.toLowerCase(Locale.ENGLISH));
        if (num != null) {
            return num.intValue();
        }
        h.s("Unknown month: ".concat(str));
        return 0;
    }

    public static String parseOptional(String str) {
        if (str.equals("-")) {
            return null;
        }
        return str;
    }

    public static int parseTime(String str) {
        if (str.equals("-")) {
            return 0;
        }
        DateTimeFormatter dateTimeFormatterHourMinuteSecondFraction = ISODateTimeFormat.hourMinuteSecondFraction();
        MutableDateTime mutableDateTime = new MutableDateTime(0L, getLenientISOChronology());
        boolean zStartsWith = str.startsWith("-");
        if (dateTimeFormatterHourMinuteSecondFraction.parseInto(mutableDateTime, str, zStartsWith ? 1 : 0) != (~(zStartsWith ? 1 : 0))) {
            int millis = (int) mutableDateTime.getMillis();
            return zStartsWith ? -millis : millis;
        }
        h.s(str);
        return 0;
    }

    public static int parseYear(String str, int i14) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (MIN_YEAR_LOOKUP.contains(lowerCase)) {
            return Integer.MIN_VALUE;
        }
        if (MAX_YEAR_LOOKUP.contains(lowerCase)) {
            return Integer.MAX_VALUE;
        }
        return ONLY_YEAR_LOOKUP.contains(lowerCase) ? i14 : Integer.parseInt(str);
    }

    public static char parseZoneChar(char c14) {
        if (c14 != 'G') {
            if (c14 != 'S') {
                if (c14 != 'U' && c14 != 'Z' && c14 != 'g') {
                    if (c14 != 's') {
                        if (c14 != 'u' && c14 != 'z') {
                            return 'w';
                        }
                    }
                }
            }
            return 's';
        }
        return 'u';
    }

    private static void printUsage() {
        System.out.println("Usage: java org.joda.time.tz.ZoneInfoCompiler <options> <source files>");
        System.out.println("where possible options include:");
        System.out.println("  -src <directory>    Specify where to read source files");
        System.out.println("  -dst <directory>    Specify where to write generated files");
        System.out.println("  -verbose            Output verbosely (default false)");
    }

    private static void put(Set<String> set, int i14, Map<String, Integer> map) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            map.put(it.next(), Integer.valueOf(i14));
        }
    }

    public static boolean test(String str, DateTimeZone dateTimeZone) {
        boolean z14;
        boolean z15 = true;
        if (!str.equals(dateTimeZone.getID())) {
            return true;
        }
        long j8 = ISOChronology.getInstanceUTC().year().set(0L, 1850);
        long j14 = ISOChronology.getInstanceUTC().year().set(0L, 2050);
        int offset = dateTimeZone.getOffset(j8);
        int standardOffset = dateTimeZone.getStandardOffset(j8);
        String nameKey = dateTimeZone.getNameKey(j8);
        ArrayList arrayList = new ArrayList();
        while (true) {
            long jNextTransition = dateTimeZone.nextTransition(j8);
            z14 = z15;
            if (jNextTransition == j8 || jNextTransition > j14) {
                break;
            }
            int offset2 = dateTimeZone.getOffset(jNextTransition);
            int standardOffset2 = dateTimeZone.getStandardOffset(jNextTransition);
            String nameKey2 = dateTimeZone.getNameKey(jNextTransition);
            if (offset == offset2 && standardOffset == standardOffset2 && nameKey.equals(nameKey2)) {
                System.out.println("*d* Error in " + dateTimeZone.getID() + StringUtils.SPACE + new DateTime(jNextTransition, ISOChronology.getInstanceUTC()));
                return false;
            }
            if (nameKey2 == null || !(nameKey2.length() >= 3 || "??".equals(nameKey2) || "%z".equals(nameKey2))) {
                System.out.println("*s* Error in " + dateTimeZone.getID() + StringUtils.SPACE + new DateTime(jNextTransition, ISOChronology.getInstanceUTC()) + ", nameKey=" + nameKey2);
                return false;
            }
            arrayList.add(Long.valueOf(jNextTransition));
            z15 = z14;
            nameKey = nameKey2;
            offset = offset2;
            j8 = jNextTransition;
        }
        long j15 = ISOChronology.getInstanceUTC().year().set(0L, 2050);
        long j16 = ISOChronology.getInstanceUTC().year().set(0L, 1850);
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            long jPreviousTransition = dateTimeZone.previousTransition(j15);
            if (jPreviousTransition == j15 || jPreviousTransition < j16) {
                break;
            }
            long jLongValue = ((Long) arrayList.get(size)).longValue() - 1;
            if (jLongValue != jPreviousTransition) {
                System.out.println("*r* Error in " + dateTimeZone.getID() + StringUtils.SPACE + new DateTime(jPreviousTransition, ISOChronology.getInstanceUTC()) + " != " + new DateTime(jLongValue, ISOChronology.getInstanceUTC()));
                return false;
            }
            j15 = jPreviousTransition;
        }
        return z14;
    }

    private void writeZone(File file, DateTimeZoneBuilder dateTimeZoneBuilder, DateTimeZone dateTimeZone) throws IOException {
        if (ZoneInfoLogger.verbose()) {
            System.out.println("Writing " + dateTimeZone.getID());
        }
        File file2 = new File(file, dateTimeZone.getID());
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            dateTimeZoneBuilder.writeTo(dateTimeZone.getID(), fileOutputStream);
            fileOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream(file2);
            DateTimeZone from = DateTimeZoneBuilder.readFrom(fileInputStream, dateTimeZone.getID());
            fileInputStream.close();
            if (dateTimeZone.equals(from)) {
                return;
            }
            System.out.println("*e* Error in " + dateTimeZone.getID() + ": Didn't read properly from file");
        } catch (Throwable th3) {
            fileOutputStream.close();
            throw th3;
        }
    }

    public static void writeZoneInfoMap(DataOutputStream dataOutputStream, Map<String, DateTimeZone> map) throws IOException {
        if (dataOutputStream == null) {
            h.s("DataOutputStream must not be null.");
            return;
        }
        HashMap map2 = new HashMap(map.size());
        TreeMap treeMap = new TreeMap();
        short s8 = 0;
        for (Map.Entry<String, DateTimeZone> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!map2.containsKey(key)) {
                Short shValueOf = Short.valueOf(s8);
                map2.put(key, shValueOf);
                treeMap.put(shValueOf, key);
                s8 = (short) (s8 + 1);
                if (s8 == Short.MAX_VALUE) {
                    throw new InternalError("Too many time zone ids");
                }
            }
            String id3 = entry.getValue().getID();
            if (!map2.containsKey(id3)) {
                Short shValueOf2 = Short.valueOf(s8);
                map2.put(id3, shValueOf2);
                treeMap.put(shValueOf2, id3);
                s8 = (short) (s8 + 1);
                if (s8 == Short.MAX_VALUE) {
                    throw new InternalError("Too many time zone ids");
                }
            }
        }
        dataOutputStream.writeShort(treeMap.size());
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            dataOutputStream.writeUTF((String) it.next());
        }
        dataOutputStream.writeShort(map.size());
        for (Map.Entry<String, DateTimeZone> entry2 : map.entrySet()) {
            dataOutputStream.writeShort(((Short) map2.get(entry2.getKey())).shortValue());
            dataOutputStream.writeShort(((Short) map2.get(entry2.getValue().getID())).shortValue());
        }
    }

    public Map<String, DateTimeZone> compile(File file, File[] fileArr) throws Throwable {
        if (fileArr != null) {
            for (int i14 = 0; i14 < fileArr.length; i14++) {
                BufferedReader bufferedReader = null;
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(fileArr[i14]));
                    try {
                        parseDataFile(bufferedReader2, "backward".equals(fileArr[i14].getName()));
                        bufferedReader2.close();
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        if (file != null) {
            if (!file.exists() && !file.mkdirs()) {
                h.C(v.h.v(file, "Destination directory doesn't exist and cannot be created: "));
                return null;
            }
            if (!file.isDirectory()) {
                h.C(v.h.v(file, "Destination is not a directory: "));
                return null;
            }
        }
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        System.out.println("Writing zoneinfo files");
        for (int i15 = 0; i15 < this.iZones.size(); i15++) {
            Zone zone = this.iZones.get(i15);
            DateTimeZoneBuilder dateTimeZoneBuilder = new DateTimeZoneBuilder();
            zone.addToBuilder(dateTimeZoneBuilder, this.iRuleSets);
            DateTimeZone dateTimeZone = dateTimeZoneBuilder.toDateTimeZone(zone.iName, true);
            if (test(dateTimeZone.getID(), dateTimeZone)) {
                treeMap.put(dateTimeZone.getID(), dateTimeZone);
                treeMap2.put(dateTimeZone.getID(), zone);
                if (file != null) {
                    writeZone(file, dateTimeZoneBuilder, dateTimeZone);
                }
            }
        }
        for (int i16 = 0; i16 < this.iGoodLinks.size(); i16 += 2) {
            String str = this.iGoodLinks.get(i16);
            String str2 = this.iGoodLinks.get(i16 + 1);
            Zone zone2 = (Zone) treeMap2.get(str);
            if (zone2 == null) {
                System.out.println(e0.g("Cannot find source zone '", str, "' to link alias '", str2, "' to"));
            } else {
                DateTimeZoneBuilder dateTimeZoneBuilder2 = new DateTimeZoneBuilder();
                zone2.addToBuilder(dateTimeZoneBuilder2, this.iRuleSets);
                DateTimeZone dateTimeZone2 = dateTimeZoneBuilder2.toDateTimeZone(str2, true);
                if (test(dateTimeZone2.getID(), dateTimeZone2)) {
                    treeMap.put(dateTimeZone2.getID(), dateTimeZone2);
                    if (file != null) {
                        writeZone(file, dateTimeZoneBuilder2, dateTimeZone2);
                    }
                }
                treeMap.put(dateTimeZone2.getID(), dateTimeZone2);
                if (ZoneInfoLogger.verbose()) {
                    System.out.println(e0.g("Good link: ", str2, " -> ", str, " revived"));
                }
            }
        }
        for (int i17 = 0; i17 < 2; i17++) {
            for (int i18 = 0; i18 < this.iBackLinks.size(); i18 += 2) {
                String str3 = this.iBackLinks.get(i18);
                String str4 = this.iBackLinks.get(i18 + 1);
                DateTimeZone dateTimeZone3 = (DateTimeZone) treeMap.get(str3);
                if (dateTimeZone3 != null) {
                    treeMap.put(str4, dateTimeZone3);
                    if (ZoneInfoLogger.verbose()) {
                        PrintStream printStream = System.out;
                        StringBuilder sbL = a.l("Back link: ", str4, " -> ");
                        sbL.append(dateTimeZone3.getID());
                        printStream.println(sbL.toString());
                    }
                } else if (i17 > 0) {
                    System.out.println(e0.g("Cannot find time zone '", str3, "' to link alias '", str4, "' to"));
                }
            }
        }
        if (file == null) {
            return treeMap;
        }
        System.out.println("Writing ZoneInfoMap");
        File file2 = new File(file, "ZoneInfoMap");
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file2));
        try {
            TreeMap treeMap3 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            treeMap3.putAll(treeMap);
            writeZoneInfoMap(dataOutputStream, treeMap3);
            return treeMap;
        } finally {
            dataOutputStream.close();
        }
    }

    public void parseDataFile(BufferedReader bufferedReader, boolean z14) throws IOException {
        while (true) {
            Zone zone = null;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    if (zone != null) {
                        this.iZones.add(zone);
                        return;
                    }
                    return;
                }
                String strTrim = line.trim();
                if (strTrim.length() != 0 && strTrim.charAt(0) != '#') {
                    int iIndexOf = line.indexOf(35);
                    if (iIndexOf >= 0) {
                        line = line.substring(0, iIndexOf);
                    }
                    StringTokenizer stringTokenizer = new StringTokenizer(line, " \f\r\t\u000b");
                    if (!Character.isWhitespace(line.charAt(0)) || !stringTokenizer.hasMoreTokens()) {
                        if (zone != null) {
                            this.iZones.add(zone);
                        }
                        if (!stringTokenizer.hasMoreTokens()) {
                            break;
                        }
                        String lowerCase = stringTokenizer.nextToken().toLowerCase(Locale.ENGLISH);
                        if (!RULE_LOOKUP.contains(lowerCase)) {
                            if (!ZONE_LOOKUP.contains(lowerCase)) {
                                if (!LINK_LOOKUP.contains(lowerCase)) {
                                    System.out.println("Unknown line: ".concat(line));
                                    break;
                                }
                                String strNextToken = stringTokenizer.nextToken();
                                String strNextToken2 = stringTokenizer.nextToken();
                                if (!strNextToken2.equals("WET") && !strNextToken2.equals("CET") && !strNextToken2.equals("EET")) {
                                    if (!strNextToken2.equals("MET")) {
                                        if (!z14 && !strNextToken2.equals("US/Pacific-New") && !strNextToken2.startsWith("Etc/") && !strNextToken2.equals(TimeZones.GMT_ID)) {
                                            this.iGoodLinks.add(strNextToken);
                                            this.iGoodLinks.add(strNextToken2);
                                            break;
                                        } else {
                                            this.iBackLinks.add(strNextToken);
                                            this.iBackLinks.add(strNextToken2);
                                            break;
                                        }
                                    }
                                    this.iBackLinks.add("CET");
                                    this.iBackLinks.add(strNextToken2);
                                    break;
                                }
                                this.iGoodLinks.add(strNextToken);
                                this.iGoodLinks.add(strNextToken2);
                                break;
                            }
                            if (stringTokenizer.countTokens() < 4) {
                                h.s("Attempting to create a Zone from an incomplete tokenizer");
                                return;
                            }
                            zone = new Zone(stringTokenizer);
                        } else {
                            Rule rule = new Rule(stringTokenizer);
                            RuleSet ruleSet = this.iRuleSets.get(rule.iName);
                            if (ruleSet != null) {
                                ruleSet.addRule(rule);
                                break;
                            } else {
                                this.iRuleSets.put(rule.iName, new RuleSet(rule));
                                break;
                            }
                        }
                    } else if (zone != null) {
                        zone.chain(stringTokenizer);
                    }
                }
            }
        }
    }

    public static class Zone {
        public final String iFormat;
        public final String iName;
        private Zone iNext;
        public final int iOffsetMillis;
        public final String iRules;
        public final DateTimeOfYear iUntilDateTimeOfYear;
        public final int iUntilYear;

        private Zone(String str, StringTokenizer stringTokenizer) {
            int i14;
            this.iName = str.intern();
            this.iOffsetMillis = ZoneInfoCompiler.parseTime(stringTokenizer.nextToken());
            this.iRules = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
            this.iFormat = stringTokenizer.nextToken().intern();
            DateTimeOfYear startOfYear = ZoneInfoCompiler.getStartOfYear();
            if (stringTokenizer.hasMoreTokens()) {
                i14 = Integer.parseInt(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    startOfYear = new DateTimeOfYear(stringTokenizer);
                }
            } else {
                i14 = Integer.MAX_VALUE;
            }
            this.iUntilYear = i14;
            this.iUntilDateTimeOfYear = startOfYear;
        }

        private static void addToBuilder(Zone zone, DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, RuleSet> map) {
            while (zone != null) {
                String str = zone.iRules;
                if (str == null) {
                    String name = Rule.formatName(zone.iFormat, zone.iOffsetMillis, 0, null);
                    dateTimeZoneBuilder.setStandardOffset(zone.iOffsetMillis);
                    dateTimeZoneBuilder.setFixedSavings(name, 0);
                } else {
                    try {
                        int time = ZoneInfoCompiler.parseTime(str);
                        String name2 = Rule.formatName(zone.iFormat, zone.iOffsetMillis, time, null);
                        dateTimeZoneBuilder.setStandardOffset(zone.iOffsetMillis);
                        dateTimeZoneBuilder.setFixedSavings(name2, time);
                    } catch (Exception unused) {
                        RuleSet ruleSet = map.get(zone.iRules);
                        if (ruleSet == null) {
                            j.A(zone.iRules, "Rules not found: ");
                            return;
                        }
                        ruleSet.addRecurring(dateTimeZoneBuilder, zone.iOffsetMillis, zone.iFormat);
                    }
                }
                int i14 = zone.iUntilYear;
                if (i14 == Integer.MAX_VALUE) {
                    return;
                }
                zone.iUntilDateTimeOfYear.addCutover(dateTimeZoneBuilder, i14);
                zone = zone.iNext;
            }
        }

        public void chain(StringTokenizer stringTokenizer) {
            Zone zone = this.iNext;
            if (zone != null) {
                zone.chain(stringTokenizer);
            } else {
                this.iNext = new Zone(this.iName, stringTokenizer);
            }
        }

        public String toString() {
            String str = "[Zone]\nName: " + this.iName + "\nOffsetMillis: " + this.iOffsetMillis + "\nRules: " + this.iRules + "\nFormat: " + this.iFormat + "\nUntilYear: " + this.iUntilYear + "\n" + this.iUntilDateTimeOfYear;
            if (this.iNext == null) {
                return str;
            }
            StringBuilder sbI = sn.a.i(str, "...\n");
            sbI.append(this.iNext.toString());
            return sbI.toString();
        }

        public Zone(StringTokenizer stringTokenizer) {
            this(stringTokenizer.nextToken(), stringTokenizer);
        }

        public void addToBuilder(DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, RuleSet> map) {
            addToBuilder(this, dateTimeZoneBuilder, map);
        }
    }

    public static class Rule {
        public final DateTimeOfYear iDateTimeOfYear;
        public final int iFromYear;
        public final String iLetterS;
        public final String iName;
        public final int iSaveMillis;
        public final int iToYear;
        public final String iType;

        public Rule(StringTokenizer stringTokenizer) {
            if (stringTokenizer.countTokens() < 6) {
                h.s("Attempting to create a Rule from an incomplete tokenizer");
                throw null;
            }
            this.iName = stringTokenizer.nextToken().intern();
            int year = ZoneInfoCompiler.parseYear(stringTokenizer.nextToken(), 0);
            this.iFromYear = year;
            int year2 = ZoneInfoCompiler.parseYear(stringTokenizer.nextToken(), year);
            this.iToYear = year2;
            if (year2 < year) {
                h.w();
                throw null;
            }
            this.iType = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
            this.iDateTimeOfYear = new DateTimeOfYear(stringTokenizer);
            this.iSaveMillis = ZoneInfoCompiler.parseTime(stringTokenizer.nextToken());
            this.iLetterS = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
        }

        public static String formatName(String str, int i14, int i15, String str2) {
            int iIndexOf = str.indexOf(47);
            if (iIndexOf > 0) {
                return i15 == 0 ? str.substring(0, iIndexOf).intern() : str.substring(iIndexOf + 1).intern();
            }
            int iIndexOf2 = str.indexOf("%s");
            if (iIndexOf2 < 0) {
                if (str.equals("%z")) {
                    return i15 == 0 ? formatOffset(i14).intern() : formatOffset(i14 + i15).intern();
                }
                return str;
            }
            String strSubstring = str.substring(0, iIndexOf2);
            String strSubstring2 = str.substring(iIndexOf2 + 2);
            StringBuilder sbK = e5.k(strSubstring);
            if (str2 == null) {
                str2 = "";
            }
            sbK.append(str2);
            sbK.append(strSubstring2);
            return sbK.toString().intern();
        }

        private static String formatOffset(int i14) {
            String str = i14 < 0 ? "-" : Marker.ANY_NON_NULL_MARKER;
            int iAbs = Math.abs(i14) / 1000;
            int i15 = iAbs / DateTimeConstants.SECONDS_PER_HOUR;
            int i16 = (iAbs / 60) % 60;
            int i17 = iAbs % 60;
            if (i17 != 0) {
                StringBuilder sbK = e5.k(str);
                sbK.append(twoDigitString(i15));
                sbK.append(twoDigitString(i16));
                sbK.append(twoDigitString(i17));
                return sbK.toString();
            }
            if (i16 == 0) {
                StringBuilder sbK2 = e5.k(str);
                sbK2.append(twoDigitString(i15));
                return sbK2.toString();
            }
            StringBuilder sbK3 = e5.k(str);
            sbK3.append(twoDigitString(i15));
            sbK3.append(twoDigitString(i16));
            return sbK3.toString();
        }

        private static String twoDigitString(int i14) {
            return Integer.toString(i14 + 100).substring(1);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, int i14, int i15, String str) {
            int i16 = this.iSaveMillis + (-i15);
            this.iDateTimeOfYear.addRecurring(dateTimeZoneBuilder, formatName(str, i14, i16, this.iLetterS), i16, this.iFromYear, this.iToYear);
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("[Rule]\nName: ");
            sb3.append(this.iName);
            sb3.append("\nFromYear: ");
            sb3.append(this.iFromYear);
            sb3.append("\nToYear: ");
            sb3.append(this.iToYear);
            sb3.append("\nType: ");
            sb3.append(this.iType);
            sb3.append("\n");
            sb3.append(this.iDateTimeOfYear);
            sb3.append("SaveMillis: ");
            sb3.append(this.iSaveMillis);
            sb3.append("\nLetterS: ");
            return am.j.o(this.iLetterS, "\n", sb3);
        }

        public Rule(Rule rule) {
            this.iName = rule.iName;
            this.iFromYear = 1800;
            this.iToYear = rule.iFromYear;
            this.iType = null;
            this.iDateTimeOfYear = rule.iDateTimeOfYear;
            this.iSaveMillis = 0;
            this.iLetterS = rule.iLetterS;
        }
    }

    public static class DateTimeOfYear {
        public final boolean iAdvanceDayOfWeek;
        public final int iDayOfMonth;
        public final int iDayOfWeek;
        public final int iMillisOfDay;
        public final int iMonthOfYear;
        public final char iZoneChar;

        public DateTimeOfYear(StringTokenizer stringTokenizer) {
            int i14;
            int i15;
            boolean z14;
            int dayOfWeek;
            int i16 = 1;
            int time = 0;
            char zoneChar = 'w';
            if (stringTokenizer.hasMoreTokens()) {
                int month = ZoneInfoCompiler.parseMonth(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    String strNextToken = stringTokenizer.nextToken();
                    if (strNextToken.toLowerCase(Locale.ENGLISH).startsWith("last")) {
                        z14 = false;
                        dayOfWeek = ZoneInfoCompiler.parseDayOfWeek(strNextToken.substring(4));
                        i14 = -1;
                    } else {
                        try {
                            i14 = Integer.parseInt(strNextToken);
                            dayOfWeek = 0;
                            z14 = false;
                        } catch (NumberFormatException unused) {
                            int iIndexOf = strNextToken.indexOf(">=");
                            if (iIndexOf > 0) {
                                int i17 = Integer.parseInt(strNextToken.substring(iIndexOf + 2));
                                dayOfWeek = ZoneInfoCompiler.parseDayOfWeek(strNextToken.substring(0, iIndexOf));
                                i14 = i17;
                                z14 = true;
                            } else {
                                int iIndexOf2 = strNextToken.indexOf("<=");
                                if (iIndexOf2 <= 0) {
                                    h.s(strNextToken);
                                    throw null;
                                }
                                int i18 = Integer.parseInt(strNextToken.substring(iIndexOf2 + 2));
                                dayOfWeek = ZoneInfoCompiler.parseDayOfWeek(strNextToken.substring(0, iIndexOf2));
                                i14 = i18;
                                z14 = false;
                            }
                        }
                    }
                    if (stringTokenizer.hasMoreTokens()) {
                        String strNextToken2 = stringTokenizer.nextToken();
                        zoneChar = ZoneInfoCompiler.parseZoneChar(strNextToken2.charAt(strNextToken2.length() - 1));
                        if (!strNextToken2.equals("24:00")) {
                            time = ZoneInfoCompiler.parseTime(strNextToken2);
                        } else if (month == 12 && i14 == 31) {
                            time = ZoneInfoCompiler.parseTime("23:59:59.999");
                        } else {
                            LocalDate localDatePlusMonths = i14 == -1 ? new LocalDate(2001, month, 1).plusMonths(1) : new LocalDate(2001, month, i14).plusDays(1);
                            boolean z15 = (i14 == -1 || dayOfWeek == 0) ? false : true;
                            int monthOfYear = localDatePlusMonths.getMonthOfYear();
                            int dayOfMonth = localDatePlusMonths.getDayOfMonth();
                            dayOfWeek = dayOfWeek != 0 ? (dayOfWeek % 7) + 1 : dayOfWeek;
                            z14 = z15;
                            i16 = monthOfYear;
                            i14 = dayOfMonth;
                        }
                        i16 = month;
                    } else {
                        i16 = month;
                    }
                    i15 = time;
                    time = dayOfWeek;
                } else {
                    i14 = 1;
                    i15 = 0;
                    z14 = false;
                    i16 = month;
                }
            } else {
                i14 = 1;
                i15 = 0;
                z14 = false;
            }
            this.iMonthOfYear = i16;
            this.iDayOfMonth = i14;
            this.iDayOfWeek = time;
            this.iAdvanceDayOfWeek = z14;
            this.iMillisOfDay = i15;
            this.iZoneChar = zoneChar;
        }

        public void addCutover(DateTimeZoneBuilder dateTimeZoneBuilder, int i14) {
            dateTimeZoneBuilder.addCutover(i14, this.iZoneChar, this.iMonthOfYear, this.iDayOfMonth, this.iDayOfWeek, this.iAdvanceDayOfWeek, this.iMillisOfDay);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, String str, int i14, int i15, int i16) {
            dateTimeZoneBuilder.addRecurringSavings(str, i14, i15, i16, this.iZoneChar, this.iMonthOfYear, this.iDayOfMonth, this.iDayOfWeek, this.iAdvanceDayOfWeek, this.iMillisOfDay);
        }

        public String toString() {
            return "MonthOfYear: " + this.iMonthOfYear + "\nDayOfMonth: " + this.iDayOfMonth + "\nDayOfWeek: " + this.iDayOfWeek + "\nAdvanceDayOfWeek: " + this.iAdvanceDayOfWeek + "\nMillisOfDay: " + this.iMillisOfDay + "\nZoneChar: " + this.iZoneChar + "\n";
        }

        public DateTimeOfYear() {
            this.iMonthOfYear = 1;
            this.iDayOfMonth = 1;
            this.iDayOfWeek = 0;
            this.iAdvanceDayOfWeek = false;
            this.iMillisOfDay = 0;
            this.iZoneChar = 'w';
        }
    }
}
