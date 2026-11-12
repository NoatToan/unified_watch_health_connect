package org.joda.time.format;

import com.airbnb.lottie.animation.keyframe.a;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class PeriodFormatterBuilder {
    private static final int DAYS = 3;
    private static final int HOURS = 4;
    private static final int MAX_FIELD = 9;
    private static final int MILLIS = 7;
    private static final int MINUTES = 5;
    private static final int MONTHS = 1;
    private static final ConcurrentMap<String, Pattern> PATTERNS = new ConcurrentHashMap();
    private static final int PRINT_ZERO_ALWAYS = 4;
    private static final int PRINT_ZERO_IF_SUPPORTED = 3;
    private static final int PRINT_ZERO_NEVER = 5;
    private static final int PRINT_ZERO_RARELY_FIRST = 1;
    private static final int PRINT_ZERO_RARELY_LAST = 2;
    private static final int SECONDS = 6;
    private static final int SECONDS_MILLIS = 8;
    private static final int SECONDS_OPTIONAL_MILLIS = 9;
    private static final int WEEKS = 2;
    private static final int YEARS = 0;
    private List<Object> iElementPairs;
    private FieldFormatter[] iFieldFormatters;
    private int iMaxParsedDigits;
    private int iMinPrintedDigits;
    private boolean iNotParser;
    private boolean iNotPrinter;
    private PeriodFieldAffix iPrefix;
    private int iPrintZeroSetting;
    private boolean iRejectSignedValues;

    public static abstract class IgnorableAffix implements PeriodFieldAffix {
        private volatile String[] iOtherAffixes;

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void finish(Set<PeriodFieldAffix> set) {
            if (this.iOtherAffixes == null) {
                int length = Integer.MAX_VALUE;
                String str = null;
                for (String str2 : getAffixes()) {
                    if (str2.length() < length) {
                        length = str2.length();
                        str = str2;
                    }
                }
                HashSet hashSet = new HashSet();
                for (PeriodFieldAffix periodFieldAffix : set) {
                    if (periodFieldAffix != null) {
                        for (String str3 : periodFieldAffix.getAffixes()) {
                            if (str3.length() > length || (str3.equalsIgnoreCase(str) && !str3.equals(str))) {
                                hashSet.add(str3);
                            }
                        }
                    }
                }
                this.iOtherAffixes = (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
        }

        public boolean matchesOtherAffix(int i14, String str, int i15) {
            String str2;
            int i16;
            if (this.iOtherAffixes != null) {
                String[] strArr = this.iOtherAffixes;
                int length = strArr.length;
                int i17 = 0;
                while (i17 < length) {
                    String str3 = strArr[i17];
                    int length2 = str3.length();
                    if (i14 < length2) {
                        str2 = str;
                        i16 = i15;
                        if (str2.regionMatches(true, i16, str3, 0, length2)) {
                            return true;
                        }
                    } else {
                        str2 = str;
                        i16 = i15;
                    }
                    if (i14 == length2 && str2.regionMatches(false, i16, str3, 0, length2)) {
                        return true;
                    }
                    i17++;
                    str = str2;
                    i15 = i16;
                }
            }
            return false;
        }
    }

    public interface PeriodFieldAffix {
        int calculatePrintedLength(int i14);

        void finish(Set<PeriodFieldAffix> set);

        String[] getAffixes();

        int parse(String str, int i14);

        void printTo(Writer writer, int i14);

        void printTo(StringBuffer stringBuffer, int i14);

        int scan(String str, int i14);
    }

    public PeriodFormatterBuilder() {
        clear();
    }

    private PeriodFormatterBuilder append0(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        this.iElementPairs.add(periodPrinter);
        this.iElementPairs.add(periodParser);
        this.iNotPrinter = (periodPrinter == null) | this.iNotPrinter;
        this.iNotParser |= periodParser == null;
        return this;
    }

    private void appendField(int i14, int i15) {
        FieldFormatter fieldFormatter = new FieldFormatter(i15, this.iPrintZeroSetting, this.iMaxParsedDigits, this.iRejectSignedValues, i14, this.iFieldFormatters, this.iPrefix, null);
        append0(fieldFormatter, fieldFormatter);
        this.iFieldFormatters[i14] = fieldFormatter;
        this.iPrefix = null;
    }

    private PeriodFormatterBuilder appendSeparator(String str, String str2, String[] strArr, boolean z14, boolean z15) {
        Separator separator;
        if (str == null || str2 == null) {
            h.w();
            return null;
        }
        clearPrefix();
        List<Object> listSubList = this.iElementPairs;
        if (listSubList.size() == 0) {
            if (z15 && !z14) {
                Literal literal = Literal.EMPTY;
                Separator separator2 = new Separator(str, str2, strArr, literal, literal, z14, z15);
                append0(separator2, separator2);
            }
            return this;
        }
        int size = listSubList.size();
        while (true) {
            int i14 = size - 1;
            if (i14 < 0) {
                separator = null;
                break;
            }
            if (listSubList.get(i14) instanceof Separator) {
                separator = (Separator) listSubList.get(i14);
                listSubList = listSubList.subList(size, listSubList.size());
                break;
            }
            size -= 2;
        }
        if (separator != null && listSubList.size() == 0) {
            h.z("Cannot have two adjacent separators");
            return null;
        }
        Object[] objArrCreateComposite = createComposite(listSubList);
        listSubList.clear();
        Separator separator3 = new Separator(str, str2, strArr, (PeriodPrinter) objArrCreateComposite[0], (PeriodParser) objArrCreateComposite[1], z14, z15);
        listSubList.add(separator3);
        listSubList.add(separator3);
        return this;
    }

    private PeriodFormatterBuilder appendSuffix(PeriodFieldAffix periodFieldAffix) {
        Object objC;
        Object objC2;
        if (this.iElementPairs.size() > 0) {
            objC = a.c(2, this.iElementPairs);
            objC2 = a.c(1, this.iElementPairs);
        } else {
            objC = null;
            objC2 = null;
        }
        if (objC == null || objC2 == null || objC != objC2 || !(objC instanceof FieldFormatter)) {
            h.z("No field to apply suffix to");
            return null;
        }
        clearPrefix();
        FieldFormatter fieldFormatter = new FieldFormatter((FieldFormatter) objC, periodFieldAffix);
        List<Object> list = this.iElementPairs;
        list.set(list.size() - 2, fieldFormatter);
        List<Object> list2 = this.iElementPairs;
        list2.set(list2.size() - 1, fieldFormatter);
        this.iFieldFormatters[fieldFormatter.getFieldType()] = fieldFormatter;
        return this;
    }

    private void clearPrefix() {
        if (this.iPrefix == null) {
            this.iPrefix = null;
        } else {
            h.z("Prefix not followed by field");
        }
    }

    private static Object[] createComposite(List<Object> list) {
        int size = list.size();
        if (size == 0) {
            Literal literal = Literal.EMPTY;
            return new Object[]{literal, literal};
        }
        if (size == 1) {
            return new Object[]{list.get(0), list.get(1)};
        }
        Composite composite = new Composite(list);
        return new Object[]{composite, composite};
    }

    private static PeriodFormatter toFormatter(List<Object> list, boolean z14, boolean z15) {
        if (z14 && z15) {
            h.z("Builder has created neither a printer nor a parser");
            return null;
        }
        int size = list.size();
        if (size >= 2 && (list.get(0) instanceof Separator)) {
            Separator separator = (Separator) list.get(0);
            if (separator.iAfterParser == null && separator.iAfterPrinter == null) {
                PeriodFormatter formatter = toFormatter(list.subList(2, size), z14, z15);
                Separator separatorFinish = separator.finish(formatter.getPrinter(), formatter.getParser());
                return new PeriodFormatter(separatorFinish, separatorFinish);
            }
        }
        Object[] objArrCreateComposite = createComposite(list);
        if (z14) {
            return new PeriodFormatter(null, (PeriodParser) objArrCreateComposite[1]);
        }
        return z15 ? new PeriodFormatter((PeriodPrinter) objArrCreateComposite[0], null) : new PeriodFormatter((PeriodPrinter) objArrCreateComposite[0], (PeriodParser) objArrCreateComposite[1]);
    }

    public PeriodFormatterBuilder append(PeriodFormatter periodFormatter) {
        if (periodFormatter == null) {
            h.s("No formatter supplied");
            return null;
        }
        clearPrefix();
        append0(periodFormatter.getPrinter(), periodFormatter.getParser());
        return this;
    }

    public PeriodFormatterBuilder appendDays() {
        appendField(3);
        return this;
    }

    public PeriodFormatterBuilder appendHours() {
        appendField(4);
        return this;
    }

    public PeriodFormatterBuilder appendLiteral(String str) {
        if (str == null) {
            h.s("Literal must not be null");
            return null;
        }
        clearPrefix();
        Literal literal = new Literal(str);
        append0(literal, literal);
        return this;
    }

    public PeriodFormatterBuilder appendMillis() {
        appendField(7);
        return this;
    }

    public PeriodFormatterBuilder appendMillis3Digit() {
        appendField(7, 3);
        return this;
    }

    public PeriodFormatterBuilder appendMinutes() {
        appendField(5);
        return this;
    }

    public PeriodFormatterBuilder appendMonths() {
        appendField(1);
        return this;
    }

    public PeriodFormatterBuilder appendPrefix(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length >= 1 && strArr.length == strArr2.length) {
            return appendPrefix(new RegExAffix(strArr, strArr2));
        }
        h.w();
        return null;
    }

    public PeriodFormatterBuilder appendSeconds() {
        appendField(6);
        return this;
    }

    public PeriodFormatterBuilder appendSecondsWithMillis() {
        appendField(8);
        return this;
    }

    public PeriodFormatterBuilder appendSecondsWithOptionalMillis() {
        appendField(9);
        return this;
    }

    public PeriodFormatterBuilder appendSeparatorIfFieldsAfter(String str) {
        return appendSeparator(str, str, null, false, true);
    }

    public PeriodFormatterBuilder appendSeparatorIfFieldsBefore(String str) {
        return appendSeparator(str, str, null, true, false);
    }

    public PeriodFormatterBuilder appendWeeks() {
        appendField(2);
        return this;
    }

    public PeriodFormatterBuilder appendYears() {
        appendField(0);
        return this;
    }

    public void clear() {
        this.iMinPrintedDigits = 1;
        this.iPrintZeroSetting = 2;
        this.iMaxParsedDigits = 10;
        this.iRejectSignedValues = false;
        this.iPrefix = null;
        List<Object> list = this.iElementPairs;
        if (list == null) {
            this.iElementPairs = new ArrayList();
        } else {
            list.clear();
        }
        this.iNotPrinter = false;
        this.iNotParser = false;
        this.iFieldFormatters = new FieldFormatter[10];
    }

    public PeriodFormatterBuilder maximumParsedDigits(int i14) {
        this.iMaxParsedDigits = i14;
        return this;
    }

    public PeriodFormatterBuilder minimumPrintedDigits(int i14) {
        this.iMinPrintedDigits = i14;
        return this;
    }

    public PeriodFormatterBuilder printZeroAlways() {
        this.iPrintZeroSetting = 4;
        return this;
    }

    public PeriodFormatterBuilder printZeroIfSupported() {
        this.iPrintZeroSetting = 3;
        return this;
    }

    public PeriodFormatterBuilder printZeroNever() {
        this.iPrintZeroSetting = 5;
        return this;
    }

    public PeriodFormatterBuilder printZeroRarelyFirst() {
        this.iPrintZeroSetting = 1;
        return this;
    }

    public PeriodFormatterBuilder printZeroRarelyLast() {
        this.iPrintZeroSetting = 2;
        return this;
    }

    public PeriodFormatterBuilder rejectSignedValues(boolean z14) {
        this.iRejectSignedValues = z14;
        return this;
    }

    public PeriodParser toParser() {
        if (this.iNotParser) {
            return null;
        }
        return toFormatter().getParser();
    }

    public PeriodPrinter toPrinter() {
        if (this.iNotPrinter) {
            return null;
        }
        return toFormatter().getPrinter();
    }

    public static class Literal implements PeriodPrinter, PeriodParser {
        static final Literal EMPTY = new Literal("");
        private final String iText;

        public Literal(String str) {
            this.iText = str;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            return this.iText.length();
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i14, Locale locale) {
            return 0;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i14, Locale locale) {
            String str2 = this.iText;
            return str.regionMatches(true, i14, str2, 0, str2.length()) ? this.iText.length() + i14 : ~i14;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            stringBuffer.append(this.iText);
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            writer.write(this.iText);
        }
    }

    public static class SimpleAffix extends IgnorableAffix {
        private final String iText;

        public SimpleAffix(String str) {
            this.iText = str;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i14) {
            return this.iText.length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return new String[]{this.iText};
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i14) {
            String str2 = this.iText;
            int length = str2.length();
            return (!str.regionMatches(true, i14, str2, 0, length) || matchesOtherAffix(length, str, i14)) ? ~i14 : i14 + length;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i14) {
            stringBuffer.append(this.iText);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i14) {
            String str2 = this.iText;
            int length = str2.length();
            int length2 = str.length();
            int i15 = i14;
            while (i15 < length2) {
                String str3 = str;
                if (str3.regionMatches(true, i15, str2, 0, length) && !matchesOtherAffix(length, str3, i15)) {
                    return i15;
                }
                switch (str3.charAt(i15)) {
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        i15++;
                        str = str3;
                        break;
                }
                return ~i14;
            }
            return ~i14;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i14) throws IOException {
            writer.write(this.iText);
        }
    }

    public static class CompositeAffix extends IgnorableAffix {
        private final PeriodFieldAffix iLeft;
        private final String[] iLeftRightCombinations;
        private final PeriodFieldAffix iRight;

        public CompositeAffix(PeriodFieldAffix periodFieldAffix, PeriodFieldAffix periodFieldAffix2) {
            this.iLeft = periodFieldAffix;
            this.iRight = periodFieldAffix2;
            HashSet hashSet = new HashSet();
            for (String str : periodFieldAffix.getAffixes()) {
                for (String str2 : this.iRight.getAffixes()) {
                    hashSet.add(str + str2);
                }
            }
            this.iLeftRightCombinations = (String[]) hashSet.toArray(new String[hashSet.size()]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i14) {
            return this.iLeft.calculatePrintedLength(i14) + this.iRight.calculatePrintedLength(i14);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return (String[]) this.iLeftRightCombinations.clone();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i14) {
            int i15 = this.iLeft.parse(str, i14);
            return (i15 < 0 || (i15 = this.iRight.parse(str, i15)) < 0 || !matchesOtherAffix(parse(str, i15) - i15, str, i14)) ? i15 : ~i14;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i14) {
            this.iLeft.printTo(stringBuffer, i14);
            this.iRight.printTo(stringBuffer, i14);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i14) {
            int iScan;
            int iScan2 = this.iLeft.scan(str, i14);
            if (iScan2 < 0 || ((iScan = this.iRight.scan(str, this.iLeft.parse(str, iScan2))) >= 0 && matchesOtherAffix(this.iRight.parse(str, iScan) - iScan2, str, i14))) {
                return ~i14;
            }
            return iScan2 > 0 ? iScan2 : iScan;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i14) {
            this.iLeft.printTo(writer, i14);
            this.iRight.printTo(writer, i14);
        }
    }

    public static class PluralAffix extends IgnorableAffix {
        private final String iPluralText;
        private final String iSingularText;

        public PluralAffix(String str, String str2) {
            this.iSingularText = str;
            this.iPluralText = str2;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i14) {
            return (i14 == 1 ? this.iSingularText : this.iPluralText).length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return new String[]{this.iSingularText, this.iPluralText};
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i14) {
            String str2;
            String str3;
            int length;
            String str4 = this.iPluralText;
            String str5 = this.iSingularText;
            if (str4.length() < str5.length()) {
                str3 = str4;
                str2 = str5;
            } else {
                str2 = str4;
                str3 = str5;
            }
            if (str.regionMatches(true, i14, str2, 0, str2.length()) && !matchesOtherAffix(str2.length(), str, i14)) {
                length = str2.length();
            } else {
                if (!str.regionMatches(true, i14, str3, 0, str3.length()) || matchesOtherAffix(str3.length(), str, i14)) {
                    return ~i14;
                }
                length = str3.length();
            }
            return length + i14;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i14) {
            stringBuffer.append(i14 == 1 ? this.iSingularText : this.iPluralText);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i14) {
            String str2;
            String str3;
            String str4 = this.iPluralText;
            String str5 = this.iSingularText;
            if (str4.length() < str5.length()) {
                str3 = str4;
                str2 = str5;
            } else {
                str2 = str4;
                str3 = str5;
            }
            int length = str2.length();
            int length2 = str3.length();
            int length3 = str.length();
            int i15 = i14;
            while (i15 < length3) {
                String str6 = str;
                if (!str6.regionMatches(true, i15, str2, 0, length) || matchesOtherAffix(str2.length(), str6, i15)) {
                    int i16 = length2;
                    if (!str6.regionMatches(true, i15, str3, 0, i16) || matchesOtherAffix(str3.length(), str6, i15)) {
                        i15++;
                        str = str6;
                        length2 = i16;
                    }
                }
                return i15;
            }
            return ~i14;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i14) throws IOException {
            writer.write(i14 == 1 ? this.iSingularText : this.iPluralText);
        }
    }

    public static class RegExAffix extends IgnorableAffix {
        private static final Comparator<String> LENGTH_DESC_COMPARATOR = new Comparator<String>() { // from class: org.joda.time.format.PeriodFormatterBuilder.RegExAffix.1
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return str2.length() - str.length();
            }
        };
        private final Pattern[] iPatterns;
        private final String[] iSuffixes;
        private final String[] iSuffixesSortedDescByLength;

        public RegExAffix(String[] strArr, String[] strArr2) {
            this.iSuffixes = (String[]) strArr2.clone();
            this.iPatterns = new Pattern[strArr.length];
            for (int i14 = 0; i14 < strArr.length; i14++) {
                Pattern patternCompile = (Pattern) PeriodFormatterBuilder.PATTERNS.get(strArr[i14]);
                if (patternCompile == null) {
                    patternCompile = Pattern.compile(strArr[i14]);
                    PeriodFormatterBuilder.PATTERNS.putIfAbsent(strArr[i14], patternCompile);
                }
                this.iPatterns[i14] = patternCompile;
            }
            String[] strArr3 = (String[]) this.iSuffixes.clone();
            this.iSuffixesSortedDescByLength = strArr3;
            Arrays.sort(strArr3, LENGTH_DESC_COMPARATOR);
        }

        private int selectSuffixIndex(int i14) {
            String strValueOf = String.valueOf(i14);
            int i15 = 0;
            while (true) {
                Pattern[] patternArr = this.iPatterns;
                if (i15 >= patternArr.length) {
                    return patternArr.length - 1;
                }
                if (patternArr[i15].matcher(strValueOf).matches()) {
                    return i15;
                }
                i15++;
            }
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i14) {
            return this.iSuffixes[selectSuffixIndex(i14)].length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return (String[]) this.iSuffixes.clone();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i14) {
            String[] strArr = this.iSuffixesSortedDescByLength;
            int length = strArr.length;
            int i15 = 0;
            while (i15 < length) {
                String str2 = strArr[i15];
                String str3 = str;
                int i16 = i14;
                if (str3.regionMatches(true, i16, str2, 0, str2.length()) && !matchesOtherAffix(str2.length(), str3, i16)) {
                    return str2.length() + i16;
                }
                i15++;
                str = str3;
                i14 = i16;
            }
            return ~i14;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i14) {
            stringBuffer.append(this.iSuffixes[selectSuffixIndex(i14)]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i14) {
            int length = str.length();
            for (int i15 = i14; i15 < length; i15++) {
                String[] strArr = this.iSuffixesSortedDescByLength;
                int length2 = strArr.length;
                int i16 = 0;
                while (i16 < length2) {
                    String str2 = strArr[i16];
                    String str3 = str;
                    if (str3.regionMatches(true, i15, str2, 0, str2.length()) && !matchesOtherAffix(str2.length(), str3, i15)) {
                        return i15;
                    }
                    i16++;
                    str = str3;
                }
            }
            return ~i14;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i14) throws IOException {
            writer.write(this.iSuffixes[selectSuffixIndex(i14)]);
        }
    }

    public static class Composite implements PeriodPrinter, PeriodParser {
        private final PeriodParser[] iParsers;
        private final PeriodPrinter[] iPrinters;

        public Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.size() <= 0) {
                this.iPrinters = null;
            } else {
                this.iPrinters = (PeriodPrinter[]) arrayList.toArray(new PeriodPrinter[arrayList.size()]);
            }
            if (arrayList2.size() <= 0) {
                this.iParsers = null;
            } else {
                this.iParsers = (PeriodParser[]) arrayList2.toArray(new PeriodParser[arrayList2.size()]);
            }
        }

        private void addArrayToList(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        private void decompose(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14 += 2) {
                Object obj = list.get(i14);
                if (obj instanceof PeriodPrinter) {
                    if (obj instanceof Composite) {
                        addArrayToList(list2, ((Composite) obj).iPrinters);
                    } else {
                        list2.add(obj);
                    }
                }
                Object obj2 = list.get(i14 + 1);
                if (obj2 instanceof PeriodParser) {
                    if (obj2 instanceof Composite) {
                        addArrayToList(list3, ((Composite) obj2).iParsers);
                    } else {
                        list3.add(obj2);
                    }
                }
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter[] periodPrinterArr = this.iPrinters;
            int length = periodPrinterArr.length;
            int iCalculatePrintedLength = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return iCalculatePrintedLength;
                }
                iCalculatePrintedLength += periodPrinterArr[length].calculatePrintedLength(readablePeriod, locale);
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i14, Locale locale) {
            PeriodPrinter[] periodPrinterArr = this.iPrinters;
            int length = periodPrinterArr.length;
            int iCountFieldsToPrint = 0;
            while (iCountFieldsToPrint < i14) {
                length--;
                if (length < 0) {
                    break;
                }
                iCountFieldsToPrint += periodPrinterArr[length].countFieldsToPrint(readablePeriod, Integer.MAX_VALUE, locale);
            }
            return iCountFieldsToPrint;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i14, Locale locale) {
            PeriodParser[] periodParserArr = this.iParsers;
            if (periodParserArr == null) {
                com.google.protobuf.a.m();
                return 0;
            }
            int length = periodParserArr.length;
            for (int i15 = 0; i15 < length && i14 >= 0; i15++) {
                i14 = periodParserArr[i15].parseInto(readWritablePeriod, str, i14, locale);
            }
            return i14;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            for (PeriodPrinter periodPrinter : this.iPrinters) {
                periodPrinter.printTo(stringBuffer, readablePeriod, locale);
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) {
            for (PeriodPrinter periodPrinter : this.iPrinters) {
                periodPrinter.printTo(writer, readablePeriod, locale);
            }
        }
    }

    public PeriodFormatterBuilder append(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        if (periodPrinter == null && periodParser == null) {
            h.s("No printer or parser supplied");
            return null;
        }
        clearPrefix();
        append0(periodPrinter, periodParser);
        return this;
    }

    public PeriodFormatterBuilder appendPrefix(String str, String str2) {
        if (str != null && str2 != null) {
            return appendPrefix(new PluralAffix(str, str2));
        }
        h.w();
        return null;
    }

    private void appendField(int i14) {
        appendField(i14, this.iMinPrintedDigits);
    }

    public PeriodFormatterBuilder appendPrefix(String str) {
        if (str != null) {
            return appendPrefix(new SimpleAffix(str));
        }
        h.w();
        return null;
    }

    private PeriodFormatterBuilder appendPrefix(PeriodFieldAffix periodFieldAffix) {
        if (periodFieldAffix != null) {
            PeriodFieldAffix periodFieldAffix2 = this.iPrefix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix = new CompositeAffix(periodFieldAffix2, periodFieldAffix);
            }
            this.iPrefix = periodFieldAffix;
            return this;
        }
        h.w();
        return null;
    }

    public static class FieldFormatter implements PeriodPrinter, PeriodParser {
        private final FieldFormatter[] iFieldFormatters;
        private final int iFieldType;
        private final int iMaxParsedDigits;
        private final int iMinPrintedDigits;
        private final PeriodFieldAffix iPrefix;
        private final int iPrintZeroSetting;
        private final boolean iRejectSignedValues;
        private final PeriodFieldAffix iSuffix;

        public FieldFormatter(FieldFormatter fieldFormatter, PeriodFieldAffix periodFieldAffix) {
            this.iMinPrintedDigits = fieldFormatter.iMinPrintedDigits;
            this.iPrintZeroSetting = fieldFormatter.iPrintZeroSetting;
            this.iMaxParsedDigits = fieldFormatter.iMaxParsedDigits;
            this.iRejectSignedValues = fieldFormatter.iRejectSignedValues;
            this.iFieldType = fieldFormatter.iFieldType;
            this.iFieldFormatters = fieldFormatter.iFieldFormatters;
            this.iPrefix = fieldFormatter.iPrefix;
            PeriodFieldAffix periodFieldAffix2 = fieldFormatter.iSuffix;
            this.iSuffix = periodFieldAffix2 != null ? new CompositeAffix(periodFieldAffix2, periodFieldAffix) : periodFieldAffix;
        }

        private int parseInt(String str, int i14, int i15) {
            if (i15 >= 10) {
                return Integer.parseInt(str.substring(i14, i15 + i14));
            }
            boolean z14 = false;
            if (i15 <= 0) {
                return 0;
            }
            int i16 = i14 + 1;
            char cCharAt = str.charAt(i14);
            int i17 = i15 - 1;
            if (cCharAt == '-') {
                i17 = i15 - 2;
                if (i17 < 0) {
                    return 0;
                }
                cCharAt = str.charAt(i16);
                z14 = true;
                i16 = i14 + 2;
            }
            int i18 = cCharAt - '0';
            while (true) {
                int i19 = i17 - 1;
                if (i17 <= 0) {
                    break;
                }
                int iCharAt = (str.charAt(i16) + ((i18 << 3) + (i18 << 1))) - 48;
                i17 = i19;
                i16++;
                i18 = iCharAt;
            }
            return z14 ? -i18 : i18;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == Long.MAX_VALUE) {
                return 0;
            }
            int iMax = Math.max(FormatUtils.calculateDigitCount(fieldValue), this.iMinPrintedDigits);
            if (this.iFieldType >= 8) {
                int iMax2 = Math.max(iMax, fieldValue < 0 ? 5 : 4);
                iMax = (this.iFieldType == 9 && Math.abs(fieldValue) % 1000 == 0) ? iMax2 - 3 : iMax2 + 1;
                fieldValue /= 1000;
            }
            int i14 = (int) fieldValue;
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                iMax += periodFieldAffix.calculatePrintedLength(i14);
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            return periodFieldAffix2 != null ? iMax + periodFieldAffix2.calculatePrintedLength(i14) : iMax;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i14, Locale locale) {
            if (i14 <= 0) {
                return 0;
            }
            return (this.iPrintZeroSetting == 4 || getFieldValue(readablePeriod) != Long.MAX_VALUE) ? 1 : 0;
        }

        public void finish(FieldFormatter[] fieldFormatterArr) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (FieldFormatter fieldFormatter : fieldFormatterArr) {
                if (fieldFormatter != null && !equals(fieldFormatter)) {
                    hashSet.add(fieldFormatter.iPrefix);
                    hashSet2.add(fieldFormatter.iSuffix);
                }
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.finish(hashSet);
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.finish(hashSet2);
            }
        }

        public int getFieldType() {
            return this.iFieldType;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0087  */
        /* JADX WARN: Code duplicated, block: B:28:0x008c  */
        /* JADX WARN: Code duplicated, block: B:30:0x008f  */
        /* JADX WARN: Code duplicated, block: B:33:0x0093 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x0094  */
        /* JADX WARN: Code duplicated, block: B:36:0x009a  */
        /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:50:0x00be  */
        /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:55:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:63:0x00b4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:65:0x00dd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x00d6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:69:0x00cc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        public long getFieldValue(ReadablePeriod readablePeriod) {
            int i14;
            long j8;
            int i15;
            FieldFormatter[] fieldFormatterArr;
            int i16;
            int iMin;
            FieldFormatter[] fieldFormatterArr2;
            int i17;
            int i18;
            PeriodType periodType = this.iPrintZeroSetting == 4 ? null : readablePeriod.getPeriodType();
            if (periodType != null && !isSupported(periodType, this.iFieldType)) {
                return Long.MAX_VALUE;
            }
            switch (this.iFieldType) {
                case 0:
                    i14 = readablePeriod.get(DurationFieldType.years());
                    j8 = i14;
                    if (j8 == 0) {
                        i15 = this.iPrintZeroSetting;
                        if (i15 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr[i16] == this) {
                                    iMin = Math.min(i16, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin) || this.iFieldFormatters[iMin] == null) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i17 = this.iFieldType;
                                if (fieldFormatterArr2[i17] == this) {
                                    for (i18 = i17 + 1; i18 <= 9; i18++) {
                                        if (!isSupported(periodType, i18) && this.iFieldFormatters[i18] != null) {
                                            return Long.MAX_VALUE;
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j8;
                case 1:
                    i14 = readablePeriod.get(DurationFieldType.months());
                    j8 = i14;
                    if (j8 == 0) {
                        i15 = this.iPrintZeroSetting;
                        if (i15 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr[i16] == this) {
                                    iMin = Math.min(i16, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i17 = this.iFieldType;
                                if (fieldFormatterArr2[i17] == this) {
                                    while (i18 <= 9) {
                                        if (!isSupported(periodType, i18)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j8;
                case 2:
                    i14 = readablePeriod.get(DurationFieldType.weeks());
                    j8 = i14;
                    if (j8 == 0) {
                        i15 = this.iPrintZeroSetting;
                        if (i15 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr[i16] == this) {
                                    iMin = Math.min(i16, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i17 = this.iFieldType;
                                if (fieldFormatterArr2[i17] == this) {
                                    while (i18 <= 9) {
                                        if (!isSupported(periodType, i18)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j8;
                case 3:
                    i14 = readablePeriod.get(DurationFieldType.days());
                    j8 = i14;
                    if (j8 == 0) {
                        i15 = this.iPrintZeroSetting;
                        if (i15 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr[i16] == this) {
                                    iMin = Math.min(i16, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i17 = this.iFieldType;
                                if (fieldFormatterArr2[i17] == this) {
                                    while (i18 <= 9) {
                                        if (!isSupported(periodType, i18)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j8;
                case 4:
                    i14 = readablePeriod.get(DurationFieldType.hours());
                    j8 = i14;
                    if (j8 == 0) {
                        i15 = this.iPrintZeroSetting;
                        if (i15 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr[i16] == this) {
                                    iMin = Math.min(i16, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i17 = this.iFieldType;
                                if (fieldFormatterArr2[i17] == this) {
                                    while (i18 <= 9) {
                                        if (!isSupported(periodType, i18)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j8;
                case 5:
                    i14 = readablePeriod.get(DurationFieldType.minutes());
                    j8 = i14;
                    if (j8 == 0) {
                        i15 = this.iPrintZeroSetting;
                        if (i15 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr[i16] == this) {
                                    iMin = Math.min(i16, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i17 = this.iFieldType;
                                if (fieldFormatterArr2[i17] == this) {
                                    while (i18 <= 9) {
                                        if (!isSupported(periodType, i18)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j8;
                case 6:
                    i14 = readablePeriod.get(DurationFieldType.seconds());
                    j8 = i14;
                    if (j8 == 0) {
                        i15 = this.iPrintZeroSetting;
                        if (i15 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr[i16] == this) {
                                    iMin = Math.min(i16, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i17 = this.iFieldType;
                                if (fieldFormatterArr2[i17] == this) {
                                    while (i18 <= 9) {
                                        if (!isSupported(periodType, i18)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j8;
                case 7:
                    i14 = readablePeriod.get(DurationFieldType.millis());
                    j8 = i14;
                    if (j8 == 0) {
                        i15 = this.iPrintZeroSetting;
                        if (i15 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr[i16] == this) {
                                    iMin = Math.min(i16, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i17 = this.iFieldType;
                                if (fieldFormatterArr2[i17] == this) {
                                    while (i18 <= 9) {
                                        if (!isSupported(periodType, i18)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j8;
                case 8:
                case 9:
                    j8 = (((long) readablePeriod.get(DurationFieldType.seconds())) * 1000) + ((long) readablePeriod.get(DurationFieldType.millis()));
                    if (j8 == 0) {
                        i15 = this.iPrintZeroSetting;
                        if (i15 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr[i16] == this) {
                                    iMin = Math.min(i16, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i17 = this.iFieldType;
                                if (fieldFormatterArr2[i17] == this) {
                                    while (i18 <= 9) {
                                        if (!isSupported(periodType, i18)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i15 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j8;
                default:
                    return Long.MAX_VALUE;
            }
        }

        public boolean isSupported(PeriodType periodType, int i14) {
            switch (i14) {
                case 0:
                    return periodType.isSupported(DurationFieldType.years());
                case 1:
                    return periodType.isSupported(DurationFieldType.months());
                case 2:
                    return periodType.isSupported(DurationFieldType.weeks());
                case 3:
                    return periodType.isSupported(DurationFieldType.days());
                case 4:
                    return periodType.isSupported(DurationFieldType.hours());
                case 5:
                    return periodType.isSupported(DurationFieldType.minutes());
                case 6:
                    return periodType.isSupported(DurationFieldType.seconds());
                case 7:
                    return periodType.isSupported(DurationFieldType.millis());
                case 8:
                case 9:
                    return periodType.isSupported(DurationFieldType.seconds()) || periodType.isSupported(DurationFieldType.millis());
                default:
                    return false;
            }
        }

        public boolean isZero(ReadablePeriod readablePeriod) {
            int size = readablePeriod.size();
            for (int i14 = 0; i14 < size; i14++) {
                if (readablePeriod.getValue(i14) != 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i14, Locale locale) {
            int iScan;
            int i15;
            PeriodFieldAffix periodFieldAffix;
            int i16;
            char cCharAt;
            int i17 = i14;
            boolean z14 = this.iPrintZeroSetting == 4;
            if (i17 >= str.length()) {
                return z14 ? ~i17 : i17;
            }
            PeriodFieldAffix periodFieldAffix2 = this.iPrefix;
            if (periodFieldAffix2 != null) {
                i17 = periodFieldAffix2.parse(str, i17);
                if (i17 < 0) {
                    return !z14 ? ~i17 : i17;
                }
                z14 = true;
            }
            PeriodFieldAffix periodFieldAffix3 = this.iSuffix;
            int i18 = -1;
            if (periodFieldAffix3 == null || z14) {
                iScan = -1;
            } else {
                iScan = periodFieldAffix3.scan(str, i17);
                if (iScan < 0) {
                    return !z14 ? ~iScan : iScan;
                }
                z14 = true;
            }
            if (!z14 && !isSupported(readWritablePeriod.getPeriodType(), this.iFieldType)) {
                return i17;
            }
            int i19 = this.iMaxParsedDigits;
            int iMin = iScan > 0 ? Math.min(i19, iScan - i17) : Math.min(i19, str.length() - i17);
            int i24 = 0;
            boolean z15 = false;
            boolean z16 = false;
            while (true) {
                if (i24 >= iMin) {
                    i15 = 1;
                    break;
                }
                int i25 = i17 + i24;
                char cCharAt2 = str.charAt(i25);
                i15 = 1;
                if (i24 != 0 || (!(cCharAt2 == '-' || cCharAt2 == '+') || this.iRejectSignedValues)) {
                    if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                        z15 = true;
                    } else {
                        if ((cCharAt2 != '.' && cCharAt2 != ',') || (((i16 = this.iFieldType) != 8 && i16 != 9) || i18 >= 0)) {
                            break;
                        }
                        iMin = Math.min(iMin + 1, str.length() - i17);
                        i18 = i25 + 1;
                    }
                    i24++;
                } else {
                    z16 = cCharAt2 == '-';
                    int i26 = i24 + 1;
                    if (i26 >= iMin || (cCharAt = str.charAt(i25 + 1)) < '0' || cCharAt > '9') {
                        break;
                    }
                    if (z16) {
                        i24 = i26;
                    } else {
                        i17++;
                    }
                    iMin = Math.min(iMin + 1, str.length() - i17);
                }
            }
            if (!z15) {
                return ~i17;
            }
            if (iScan >= 0 && i17 + i24 != iScan) {
                return i17;
            }
            int i27 = this.iFieldType;
            if (i27 != 8 && i27 != 9) {
                setFieldValue(readWritablePeriod, i27, parseInt(str, i17, i24));
            } else if (i18 < 0) {
                setFieldValue(readWritablePeriod, 6, parseInt(str, i17, i24));
                setFieldValue(readWritablePeriod, 7, 0);
            } else {
                int i28 = 0;
                int i29 = parseInt(str, i17, (i18 - i17) - 1);
                setFieldValue(readWritablePeriod, 6, i29);
                int i30 = (i17 + i24) - i18;
                if (i30 > 0) {
                    if (i30 >= 3) {
                        i28 = parseInt(str, i18, 3);
                    } else {
                        int i34 = parseInt(str, i18, i30);
                        i28 = i30 == i15 ? i34 * 100 : i34 * 10;
                    }
                    if (z16 || i29 < 0) {
                        i28 = -i28;
                    }
                }
                setFieldValue(readWritablePeriod, 7, i28);
            }
            int i35 = i17 + i24;
            return (i35 < 0 || (periodFieldAffix = this.iSuffix) == null) ? i35 : periodFieldAffix.parse(str, i35);
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == Long.MAX_VALUE) {
                return;
            }
            int i14 = (int) fieldValue;
            if (this.iFieldType >= 8) {
                i14 = (int) (fieldValue / 1000);
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.printTo(stringBuffer, i14);
            }
            int length = stringBuffer.length();
            int i15 = this.iMinPrintedDigits;
            if (i15 <= 1) {
                FormatUtils.appendUnpaddedInteger(stringBuffer, i14);
            } else {
                FormatUtils.appendPaddedInteger(stringBuffer, i14, i15);
            }
            if (this.iFieldType >= 8) {
                int iAbs = (int) (Math.abs(fieldValue) % 1000);
                if (this.iFieldType == 8 || iAbs > 0) {
                    if (fieldValue < 0 && fieldValue > -1000) {
                        stringBuffer.insert(length, '-');
                    }
                    stringBuffer.append('.');
                    FormatUtils.appendPaddedInteger(stringBuffer, iAbs, 3);
                }
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.printTo(stringBuffer, i14);
            }
        }

        public void setFieldValue(ReadWritablePeriod readWritablePeriod, int i14, int i15) {
            switch (i14) {
                case 0:
                    readWritablePeriod.setYears(i15);
                    break;
                case 1:
                    readWritablePeriod.setMonths(i15);
                    break;
                case 2:
                    readWritablePeriod.setWeeks(i15);
                    break;
                case 3:
                    readWritablePeriod.setDays(i15);
                    break;
                case 4:
                    readWritablePeriod.setHours(i15);
                    break;
                case 5:
                    readWritablePeriod.setMinutes(i15);
                    break;
                case 6:
                    readWritablePeriod.setSeconds(i15);
                    break;
                case 7:
                    readWritablePeriod.setMillis(i15);
                    break;
            }
        }

        public FieldFormatter(int i14, int i15, int i16, boolean z14, int i17, FieldFormatter[] fieldFormatterArr, PeriodFieldAffix periodFieldAffix, PeriodFieldAffix periodFieldAffix2) {
            this.iMinPrintedDigits = i14;
            this.iPrintZeroSetting = i15;
            this.iMaxParsedDigits = i16;
            this.iRejectSignedValues = z14;
            this.iFieldType = i17;
            this.iFieldFormatters = fieldFormatterArr;
            this.iPrefix = periodFieldAffix;
            this.iSuffix = periodFieldAffix2;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == Long.MAX_VALUE) {
                return;
            }
            int i14 = (int) fieldValue;
            if (this.iFieldType >= 8) {
                i14 = (int) (fieldValue / 1000);
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.printTo(writer, i14);
            }
            int i15 = this.iMinPrintedDigits;
            if (i15 <= 1) {
                FormatUtils.writeUnpaddedInteger(writer, i14);
            } else {
                FormatUtils.writePaddedInteger(writer, i14, i15);
            }
            if (this.iFieldType >= 8) {
                int iAbs = (int) (Math.abs(fieldValue) % 1000);
                if (this.iFieldType == 8 || iAbs > 0) {
                    writer.write(46);
                    FormatUtils.writePaddedInteger(writer, iAbs, 3);
                }
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.printTo(writer, i14);
            }
        }
    }

    public static class Separator implements PeriodPrinter, PeriodParser {
        private volatile PeriodParser iAfterParser;
        private volatile PeriodPrinter iAfterPrinter;
        private final PeriodParser iBeforeParser;
        private final PeriodPrinter iBeforePrinter;
        private final String iFinalText;
        private final String[] iParsedForms;
        private final String iText;
        private final boolean iUseAfter;
        private final boolean iUseBefore;

        public Separator(String str, String str2, String[] strArr, PeriodPrinter periodPrinter, PeriodParser periodParser, boolean z14, boolean z15) {
            this.iText = str;
            this.iFinalText = str2;
            if ((str2 == null || str.equals(str2)) && (strArr == null || strArr.length == 0)) {
                this.iParsedForms = new String[]{str};
            } else {
                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                treeSet.add(str);
                treeSet.add(str2);
                if (strArr != null) {
                    int length = strArr.length;
                    while (true) {
                        length--;
                        if (length < 0) {
                            break;
                        } else {
                            treeSet.add(strArr[length]);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(treeSet);
                Collections.reverse(arrayList);
                this.iParsedForms = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            this.iBeforePrinter = periodPrinter;
            this.iBeforeParser = periodParser;
            this.iUseBefore = z14;
            this.iUseAfter = z15;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            int length;
            PeriodPrinter periodPrinter = this.iBeforePrinter;
            PeriodPrinter periodPrinter2 = this.iAfterPrinter;
            int iCalculatePrintedLength = periodPrinter2.calculatePrintedLength(readablePeriod, locale) + periodPrinter.calculatePrintedLength(readablePeriod, locale);
            if (!this.iUseBefore) {
                if (this.iUseAfter && periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                    length = this.iText.length();
                    return length + iCalculatePrintedLength;
                }
                return iCalculatePrintedLength;
            }
            if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                if (this.iUseAfter) {
                    int iCountFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                    if (iCountFieldsToPrint > 0) {
                        length = (iCountFieldsToPrint > 1 ? this.iText : this.iFinalText).length();
                    }
                } else {
                    length = this.iText.length();
                }
                return length + iCalculatePrintedLength;
            }
            return iCalculatePrintedLength;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i14, Locale locale) {
            int iCountFieldsToPrint = this.iBeforePrinter.countFieldsToPrint(readablePeriod, i14, locale);
            return iCountFieldsToPrint < i14 ? this.iAfterPrinter.countFieldsToPrint(readablePeriod, i14, locale) + iCountFieldsToPrint : iCountFieldsToPrint;
        }

        public Separator finish(PeriodPrinter periodPrinter, PeriodParser periodParser) {
            this.iAfterPrinter = periodPrinter;
            this.iAfterParser = periodParser;
            return this;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i14, Locale locale) {
            String str2;
            int i15;
            int into = this.iBeforeParser.parseInto(readWritablePeriod, str, i14, locale);
            if (into < 0) {
                return into;
            }
            int length = 0;
            if (into > i14) {
                String[] strArr = this.iParsedForms;
                int length2 = strArr.length;
                int i16 = 0;
                while (true) {
                    if (i16 >= length2) {
                        str2 = str;
                        i15 = -1;
                    } else {
                        String str3 = strArr[i16];
                        if (str3 == null || str3.length() == 0) {
                            str2 = str;
                        } else {
                            str2 = str;
                            if (!str2.regionMatches(true, into, str3, 0, str3.length())) {
                                i16++;
                                str = str2;
                            }
                        }
                        length = str3 != null ? str3.length() : 0;
                        into += length;
                        int i17 = length;
                        length = 1;
                        i15 = i17;
                    }
                }
            } else {
                str2 = str;
                i15 = -1;
            }
            int into2 = this.iAfterParser.parseInto(readWritablePeriod, str2, into, locale);
            if (into2 < 0) {
                return into2;
            }
            if (length == 0 || into2 != into || i15 <= 0) {
                return (into2 <= into || length != 0 || this.iUseBefore) ? into2 : ~into;
            }
            return ~into;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter periodPrinter = this.iBeforePrinter;
            PeriodPrinter periodPrinter2 = this.iAfterPrinter;
            periodPrinter.printTo(stringBuffer, readablePeriod, locale);
            if (this.iUseBefore) {
                if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                    if (this.iUseAfter) {
                        int iCountFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                        if (iCountFieldsToPrint > 0) {
                            stringBuffer.append(iCountFieldsToPrint > 1 ? this.iText : this.iFinalText);
                        }
                    } else {
                        stringBuffer.append(this.iText);
                    }
                }
            } else if (this.iUseAfter && periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                stringBuffer.append(this.iText);
            }
            periodPrinter2.printTo(stringBuffer, readablePeriod, locale);
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            PeriodPrinter periodPrinter = this.iBeforePrinter;
            PeriodPrinter periodPrinter2 = this.iAfterPrinter;
            periodPrinter.printTo(writer, readablePeriod, locale);
            if (this.iUseBefore) {
                if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                    if (this.iUseAfter) {
                        int iCountFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                        if (iCountFieldsToPrint > 0) {
                            writer.write(iCountFieldsToPrint > 1 ? this.iText : this.iFinalText);
                        }
                    } else {
                        writer.write(this.iText);
                    }
                }
            } else if (this.iUseAfter && periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                writer.write(this.iText);
            }
            periodPrinter2.printTo(writer, readablePeriod, locale);
        }
    }

    public PeriodFormatterBuilder appendSuffix(String str, String str2) {
        if (str != null && str2 != null) {
            return appendSuffix(new PluralAffix(str, str2));
        }
        h.w();
        return null;
    }

    public PeriodFormatterBuilder appendSuffix(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length >= 1 && strArr.length == strArr2.length) {
            return appendSuffix(new RegExAffix(strArr, strArr2));
        }
        h.w();
        return null;
    }

    public PeriodFormatterBuilder appendSuffix(String str) {
        if (str != null) {
            return appendSuffix(new SimpleAffix(str));
        }
        h.w();
        return null;
    }

    public PeriodFormatter toFormatter() {
        PeriodFormatter formatter = toFormatter(this.iElementPairs, this.iNotPrinter, this.iNotParser);
        for (FieldFormatter fieldFormatter : this.iFieldFormatters) {
            if (fieldFormatter != null) {
                fieldFormatter.finish(this.iFieldFormatters);
            }
        }
        this.iFieldFormatters = (FieldFormatter[]) this.iFieldFormatters.clone();
        return formatter;
    }

    public PeriodFormatterBuilder appendSeparator(String str, String str2) {
        return appendSeparator(str, str2, null, true, true);
    }

    public PeriodFormatterBuilder appendSeparator(String str, String str2, String[] strArr) {
        return appendSeparator(str, str2, strArr, true, true);
    }

    public PeriodFormatterBuilder appendSeparator(String str) {
        return appendSeparator(str, str, null, true, true);
    }
}
