package org.apache.commons.codec.language.bm;

import am.j;
import androidx.room.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.regex.Pattern;
import org.apache.commons.codec.Resources;
import org.apache.commons.lang3.StringUtils;
import tn.k;

/* JADX INFO: loaded from: classes3.dex */
public class Rule {
    public static final String ALL = "ALL";
    private static final String DOUBLE_QUOTE = "\"";
    private static final String HASH_INCLUDE = "#include";
    private static final int HASH_INCLUDE_LENGTH = 8;
    private final RPattern lContext;
    private final String pattern;
    private final PhonemeExpr phoneme;
    private final RPattern rContext;
    public static final RPattern ALL_STRINGS_RMATCHER = new o2.c(23);
    private static final Map<NameType, Map<RuleType, Map<String, Map<String, List<Rule>>>>> RULES = new EnumMap(NameType.class);

    public interface PhonemeExpr {
        Iterable<Phoneme> getPhonemes();

        default int size() {
            return (int) Math.min(getPhonemes().spliterator().getExactSizeIfKnown(), 2147483647L);
        }
    }

    public interface RPattern {
        boolean isMatch(CharSequence charSequence);
    }

    static {
        for (NameType nameType : NameType.values()) {
            EnumMap enumMap = new EnumMap(RuleType.class);
            for (RuleType ruleType : RuleType.values()) {
                HashMap map = new HashMap();
                Languages.getInstance(nameType).getLanguages().forEach(new d(nameType, ruleType, map, 1));
                if (!ruleType.equals(RuleType.RULES)) {
                    Scanner scannerCreateScanner = createScanner(nameType, ruleType, "common");
                    try {
                        map.put("common", parseRules(scannerCreateScanner, createResourceName(nameType, ruleType, "common")));
                        if (scannerCreateScanner != null) {
                            scannerCreateScanner.close();
                        }
                    } catch (Throwable th3) {
                        if (scannerCreateScanner != null) {
                            try {
                                scannerCreateScanner.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
                enumMap.put(ruleType, Collections.unmodifiableMap(map));
            }
            RULES.put(nameType, Collections.unmodifiableMap(enumMap));
        }
    }

    public Rule(String str, String str2, String str3, PhonemeExpr phonemeExpr) {
        this.pattern = str;
        this.lContext = pattern(k.g(str2, "$"));
        this.rContext = pattern(fb1.c.n("^", str3));
        this.phoneme = phonemeExpr;
    }

    private static boolean contains(CharSequence charSequence, final char c14) {
        return charSequence.chars().anyMatch(new IntPredicate() { // from class: org.apache.commons.codec.language.bm.h
            @Override // java.util.function.IntPredicate
            public final boolean test(int i14) {
                return Rule.lambda$contains$2(c14, i14);
            }
        });
    }

    private static String createResourceName(NameType nameType, RuleType ruleType, String str) {
        return j.o(str, ".txt", p6.b.i("org/apache/commons/codec/language/bm/", nameType.getName(), "_", ruleType.getName(), "_"));
    }

    private static Scanner createScanner(String str) {
        return new Scanner(Resources.getInputStream(j.m("org/apache/commons/codec/language/bm/", str, ".txt")), ResourceConstants.ENCODING);
    }

    private static boolean endsWith(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        int length2 = charSequence.length();
        if (length > length2) {
            return false;
        }
        int i14 = length2 - 1;
        for (int i15 = length - 1; i15 >= 0; i15--) {
            if (charSequence.charAt(i14) != charSequence2.charAt(i15)) {
                return false;
            }
            i14--;
        }
        return true;
    }

    public static List<Rule> getInstance(NameType nameType, RuleType ruleType, Languages.LanguageSet languageSet) {
        Map<String, List<Rule>> instanceMap = getInstanceMap(nameType, ruleType, languageSet);
        ArrayList arrayList = new ArrayList();
        instanceMap.values().forEach(new c(1, arrayList));
        return arrayList;
    }

    public static Map<String, List<Rule>> getInstanceMap(NameType nameType, RuleType ruleType, String str) {
        Map<String, List<Rule>> map = RULES.get(nameType).get(ruleType).get(str);
        if (map != null) {
            return map;
        }
        vb.h.s(j.o(str, ".", p6.b.i("No rules found for ", nameType.getName(), ", ", ruleType.getName(), ", ")));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$contains$2(char c14, int i14) {
        return i14 == c14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$parseRules$4(String str) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$pattern$10(String str, boolean z14, CharSequence charSequence) {
        return charSequence.length() > 0 && contains(str, charSequence.charAt(0)) == z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$pattern$11(String str, boolean z14, CharSequence charSequence) {
        return charSequence.length() > 0 && contains(str, charSequence.charAt(charSequence.length() - 1)) == z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$pattern$5(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$pattern$6(String str, CharSequence charSequence) {
        return charSequence.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$pattern$7(String str, CharSequence charSequence) {
        return startsWith(charSequence, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$pattern$8(String str, CharSequence charSequence) {
        return endsWith(charSequence, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$pattern$9(String str, boolean z14, CharSequence charSequence) {
        return charSequence.length() == 1 && contains(str, charSequence.charAt(0)) == z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(CharSequence charSequence) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$1(NameType nameType, RuleType ruleType, Map map, String str) {
        try {
            Scanner scannerCreateScanner = createScanner(nameType, ruleType, str);
            try {
                map.put(str, parseRules(scannerCreateScanner, createResourceName(nameType, ruleType, str)));
                if (scannerCreateScanner != null) {
                    scannerCreateScanner.close();
                }
            } catch (Throwable th3) {
                if (scannerCreateScanner != null) {
                    try {
                        scannerCreateScanner.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (IllegalStateException e4) {
            throw new IllegalStateException("Problem processing " + createResourceName(nameType, ruleType, str), e4);
        }
    }

    private static Phoneme parsePhoneme(String str) {
        int iIndexOf = str.indexOf("[");
        if (iIndexOf < 0) {
            return new Phoneme(str, Languages.ANY_LANGUAGE);
        }
        if (str.endsWith("]")) {
            return new Phoneme(str.substring(0, iIndexOf), Languages.LanguageSet.from(new HashSet(Arrays.asList(fb1.c.m(1, iIndexOf + 1, str).split("[+]")))));
        }
        vb.h.s("Phoneme expression contains a '[' but does not end in ']'");
        return null;
    }

    private static PhonemeExpr parsePhonemeExpr(String str) {
        if (!str.startsWith("(")) {
            return parsePhoneme(str);
        }
        if (!str.endsWith(")")) {
            vb.h.s("Phoneme starts with '(' so must end with ')'");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String strM = fb1.c.m(1, 1, str);
        for (String str2 : strM.split("[|]")) {
            arrayList.add(parsePhoneme(str2));
        }
        if (strM.startsWith("|") || strM.endsWith("|")) {
            arrayList.add(new Phoneme("", Languages.ANY_LANGUAGE));
        }
        return new PhonemeList(arrayList);
    }

    private static Map<String, List<Rule>> parseRules(Scanner scanner, String str) {
        HashMap map = new HashMap();
        int i14 = 0;
        boolean z14 = false;
        while (scanner.hasNextLine()) {
            int i15 = i14 + 1;
            String strNextLine = scanner.nextLine();
            if (z14) {
                if (strNextLine.endsWith("*/")) {
                    z14 = false;
                }
            } else if (strNextLine.startsWith("/*")) {
                z14 = true;
            } else {
                int iIndexOf = strNextLine.indexOf("//");
                String strTrim = (iIndexOf >= 0 ? strNextLine.substring(0, iIndexOf) : strNextLine).trim();
                if (strTrim.isEmpty()) {
                    continue;
                } else if (strTrim.startsWith(HASH_INCLUDE)) {
                    String strTrim2 = strTrim.substring(HASH_INCLUDE_LENGTH).trim();
                    if (strTrim2.contains(StringUtils.SPACE)) {
                        vb.h.s(a0.j("Malformed import statement '", strNextLine, "' in ", str));
                        return null;
                    }
                    Scanner scannerCreateScanner = createScanner(strTrim2);
                    try {
                        map.putAll(parseRules(scannerCreateScanner, str + "->" + strTrim2));
                        if (scannerCreateScanner != null) {
                            scannerCreateScanner.close();
                        }
                    } catch (Throwable th3) {
                        if (scannerCreateScanner == null) {
                            throw th3;
                        }
                        try {
                            scannerCreateScanner.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } else {
                    String[] strArrSplit = strTrim.split("\\s+");
                    if (strArrSplit.length != 4) {
                        StringBuilder sb3 = new StringBuilder("Malformed rule statement split into ");
                        wr.g.t(strArrSplit.length, " parts: ", strNextLine, " in ", sb3);
                        com.nimbusds.jose.shaded.gson.internal.a.v(sb3, str);
                        return null;
                    }
                    try {
                        String strStripQuotes = stripQuotes(strArrSplit[0]);
                        String strStripQuotes2 = stripQuotes(strArrSplit[1]);
                        String strStripQuotes3 = stripQuotes(strArrSplit[2]);
                        Rule rule = new Rule(strStripQuotes, strStripQuotes2, strStripQuotes3, parsePhonemeExpr(stripQuotes(strArrSplit[3])), i15, str, strStripQuotes, strStripQuotes2, strStripQuotes3) { // from class: org.apache.commons.codec.language.bm.Rule.1
                            private final String loc;
                            private final int myLine;
                            final /* synthetic */ int val$cLine;
                            final /* synthetic */ String val$lCon;
                            final /* synthetic */ String val$location;
                            final /* synthetic */ String val$pat;
                            final /* synthetic */ String val$rCon;

                            {
                                this.val$cLine = i15;
                                this.val$location = str;
                                this.val$pat = strStripQuotes;
                                this.val$lCon = strStripQuotes2;
                                this.val$rCon = strStripQuotes3;
                                this.myLine = i15;
                                this.loc = str;
                            }

                            public String toString() {
                                StringBuilder sb4 = new StringBuilder("Rule{line=");
                                sb4.append(this.myLine);
                                sb4.append(", loc='");
                                sb4.append(this.loc);
                                sb4.append("', pat='");
                                sb4.append(this.val$pat);
                                sb4.append("', lcon='");
                                sb4.append(this.val$lCon);
                                sb4.append("', rcon='");
                                return j.o(this.val$rCon, "'}", sb4);
                            }
                        };
                        ((List) map.computeIfAbsent(rule.pattern.substring(0, 1), new com.google.android.material.color.utilities.f(5))).add(rule);
                    } catch (IllegalArgumentException e4) {
                        com.airbnb.lottie.animation.keyframe.a.x(sn.a.e(i15, "Problem parsing line '", "' in ", str), e4);
                        return null;
                    }
                }
            }
            i14 = i15;
        }
        return map;
    }

    private static RPattern pattern(String str) {
        boolean zStartsWith = str.startsWith("^");
        boolean zEndsWith = str.endsWith("$");
        int length = str.length();
        if (zEndsWith) {
            length--;
        }
        final String strSubstring = str.substring(zStartsWith ? 1 : 0, length);
        if (strSubstring.contains("[")) {
            boolean zStartsWith2 = strSubstring.startsWith("[");
            boolean zEndsWith2 = strSubstring.endsWith("]");
            if (zStartsWith2 && zEndsWith2) {
                final String strM = fb1.c.m(1, 1, strSubstring);
                if (!strM.contains("[")) {
                    boolean zStartsWith3 = strM.startsWith("^");
                    if (zStartsWith3) {
                        strM = strM.substring(1);
                    }
                    final boolean z14 = !zStartsWith3;
                    if (zStartsWith && zEndsWith) {
                        final int i14 = 0;
                        return new RPattern() { // from class: org.apache.commons.codec.language.bm.g
                            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                            public final boolean isMatch(CharSequence charSequence) {
                                switch (i14) {
                                    case 0:
                                        return Rule.lambda$pattern$9(strM, z14, charSequence);
                                    case 1:
                                        return Rule.lambda$pattern$10(strM, z14, charSequence);
                                    default:
                                        return Rule.lambda$pattern$11(strM, z14, charSequence);
                                }
                            }
                        };
                    }
                    if (zStartsWith) {
                        final int i15 = 1;
                        return new RPattern() { // from class: org.apache.commons.codec.language.bm.g
                            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                            public final boolean isMatch(CharSequence charSequence) {
                                switch (i15) {
                                    case 0:
                                        return Rule.lambda$pattern$9(strM, z14, charSequence);
                                    case 1:
                                        return Rule.lambda$pattern$10(strM, z14, charSequence);
                                    default:
                                        return Rule.lambda$pattern$11(strM, z14, charSequence);
                                }
                            }
                        };
                    }
                    if (zEndsWith) {
                        final int i16 = 2;
                        return new RPattern() { // from class: org.apache.commons.codec.language.bm.g
                            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                            public final boolean isMatch(CharSequence charSequence) {
                                switch (i16) {
                                    case 0:
                                        return Rule.lambda$pattern$9(strM, z14, charSequence);
                                    case 1:
                                        return Rule.lambda$pattern$10(strM, z14, charSequence);
                                    default:
                                        return Rule.lambda$pattern$11(strM, z14, charSequence);
                                }
                            }
                        };
                    }
                }
            }
        } else {
            if (zStartsWith && zEndsWith) {
                if (strSubstring.isEmpty()) {
                    return new o2.c(22);
                }
                final int i17 = 0;
                return new RPattern() { // from class: org.apache.commons.codec.language.bm.f
                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public final boolean isMatch(CharSequence charSequence) {
                        switch (i17) {
                            case 0:
                                return Rule.lambda$pattern$6(strSubstring, charSequence);
                            case 1:
                                return Rule.lambda$pattern$7(strSubstring, charSequence);
                            default:
                                return Rule.lambda$pattern$8(strSubstring, charSequence);
                        }
                    }
                };
            }
            if ((zStartsWith || zEndsWith) && strSubstring.isEmpty()) {
                return ALL_STRINGS_RMATCHER;
            }
            if (zStartsWith) {
                final int i18 = 1;
                return new RPattern() { // from class: org.apache.commons.codec.language.bm.f
                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public final boolean isMatch(CharSequence charSequence) {
                        switch (i18) {
                            case 0:
                                return Rule.lambda$pattern$6(strSubstring, charSequence);
                            case 1:
                                return Rule.lambda$pattern$7(strSubstring, charSequence);
                            default:
                                return Rule.lambda$pattern$8(strSubstring, charSequence);
                        }
                    }
                };
            }
            if (zEndsWith) {
                final int i19 = 2;
                return new RPattern() { // from class: org.apache.commons.codec.language.bm.f
                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public final boolean isMatch(CharSequence charSequence) {
                        switch (i19) {
                            case 0:
                                return Rule.lambda$pattern$6(strSubstring, charSequence);
                            case 1:
                                return Rule.lambda$pattern$7(strSubstring, charSequence);
                            default:
                                return Rule.lambda$pattern$8(strSubstring, charSequence);
                        }
                    }
                };
            }
        }
        return new RPattern(str) { // from class: org.apache.commons.codec.language.bm.Rule.2
            final Pattern pattern;
            final /* synthetic */ String val$regex;

            {
                this.val$regex = str;
                this.pattern = Pattern.compile(str);
            }

            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
            public boolean isMatch(CharSequence charSequence) {
                return this.pattern.matcher(charSequence).find();
            }
        };
    }

    private static boolean startsWith(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        for (int i14 = 0; i14 < charSequence2.length(); i14++) {
            if (charSequence.charAt(i14) != charSequence2.charAt(i14)) {
                return false;
            }
        }
        return true;
    }

    private static String stripQuotes(String str) {
        if (str.startsWith(DOUBLE_QUOTE)) {
            str = str.substring(1);
        }
        return str.endsWith(DOUBLE_QUOTE) ? fb1.c.m(1, 0, str) : str;
    }

    public RPattern getLContext() {
        return this.lContext;
    }

    public String getPattern() {
        return this.pattern;
    }

    public PhonemeExpr getPhoneme() {
        return this.phoneme;
    }

    public RPattern getRContext() {
        return this.rContext;
    }

    public boolean patternAndContextMatches(CharSequence charSequence, int i14) {
        if (i14 < 0) {
            org.apache.commons.lang3.e.v("Can not match pattern at negative indexes");
            return false;
        }
        int length = this.pattern.length() + i14;
        if (length <= charSequence.length() && charSequence.subSequence(i14, length).equals(this.pattern) && this.rContext.isMatch(charSequence.subSequence(length, charSequence.length()))) {
            return this.lContext.isMatch(charSequence.subSequence(0, i14));
        }
        return false;
    }

    public static final class PhonemeList implements PhonemeExpr {
        private final List<Phoneme> phonemeList;

        public PhonemeList(List<Phoneme> list) {
            this.phonemeList = list;
        }

        @Override // org.apache.commons.codec.language.bm.Rule.PhonemeExpr
        public int size() {
            return this.phonemeList.size();
        }

        @Override // org.apache.commons.codec.language.bm.Rule.PhonemeExpr
        public List<Phoneme> getPhonemes() {
            return this.phonemeList;
        }
    }

    public static final class Phoneme implements PhonemeExpr {
        public static final Comparator<Phoneme> COMPARATOR = new androidx.browser.trusted.c(23);
        private final Languages.LanguageSet languages;
        private final StringBuilder phonemeText;

        public Phoneme(Phoneme phoneme, Phoneme phoneme2) {
            this(phoneme.phonemeText, phoneme.languages);
            this.phonemeText.append((CharSequence) phoneme2.phonemeText);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(Phoneme phoneme, Phoneme phoneme2) {
            int length = phoneme.phonemeText.length();
            int length2 = phoneme2.phonemeText.length();
            for (int i14 = 0; i14 < length; i14++) {
                if (i14 >= length2) {
                    return 1;
                }
                int iCharAt = phoneme.phonemeText.charAt(i14) - phoneme2.phonemeText.charAt(i14);
                if (iCharAt != 0) {
                    return iCharAt;
                }
            }
            return length < length2 ? -1 : 0;
        }

        public Phoneme append(CharSequence charSequence) {
            this.phonemeText.append(charSequence);
            return this;
        }

        public Languages.LanguageSet getLanguages() {
            return this.languages;
        }

        public CharSequence getPhonemeText() {
            return this.phonemeText;
        }

        @Override // org.apache.commons.codec.language.bm.Rule.PhonemeExpr
        public Iterable<Phoneme> getPhonemes() {
            return Collections.singleton(this);
        }

        @Deprecated
        public Phoneme join(Phoneme phoneme) {
            return new Phoneme(this.phonemeText.toString().concat(phoneme.phonemeText.toString()), this.languages.restrictTo(phoneme.languages));
        }

        public Phoneme mergeWithLanguage(Languages.LanguageSet languageSet) {
            return new Phoneme(this.phonemeText.toString(), this.languages.merge(languageSet));
        }

        @Override // org.apache.commons.codec.language.bm.Rule.PhonemeExpr
        public int size() {
            return 1;
        }

        public String toString() {
            return this.phonemeText.toString() + "[" + this.languages + "]";
        }

        public Phoneme(CharSequence charSequence, Languages.LanguageSet languageSet) {
            this.phonemeText = new StringBuilder(charSequence);
            this.languages = languageSet;
        }

        public Phoneme(Phoneme phoneme, Phoneme phoneme2, Languages.LanguageSet languageSet) {
            this(phoneme.phonemeText, languageSet);
            this.phonemeText.append((CharSequence) phoneme2.phonemeText);
        }
    }

    private static Scanner createScanner(NameType nameType, RuleType ruleType, String str) {
        return new Scanner(Resources.getInputStream(createResourceName(nameType, ruleType, str)), ResourceConstants.ENCODING);
    }

    public static List<Rule> getInstance(NameType nameType, RuleType ruleType, String str) {
        return getInstance(nameType, ruleType, Languages.LanguageSet.from(new HashSet(Arrays.asList(str))));
    }

    public static Map<String, List<Rule>> getInstanceMap(NameType nameType, RuleType ruleType, Languages.LanguageSet languageSet) {
        return languageSet.isSingleton() ? getInstanceMap(nameType, ruleType, languageSet.getAny()) : getInstanceMap(nameType, ruleType, Languages.ANY);
    }
}
