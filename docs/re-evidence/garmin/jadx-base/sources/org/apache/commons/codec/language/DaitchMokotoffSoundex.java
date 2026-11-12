package org.apache.commons.codec.language;

import androidx.room.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.Resources;
import org.apache.commons.codec.StringEncoder;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes3.dex */
public class DaitchMokotoffSoundex implements StringEncoder {
    private static final String COMMENT = "//";
    private static final String DOUBLE_QUOTE = "\"";
    private static final Map<Character, Character> FOLDINGS;
    private static final int MAX_LENGTH = 6;
    private static final String MULTILINE_COMMENT_END = "*/";
    private static final String MULTILINE_COMMENT_START = "/*";
    private static final String RESOURCE_FILE = "org/apache/commons/codec/language/dmrules.txt";
    private static final Map<Character, List<Rule>> RULES;
    private final boolean folding;

    public static final class Branch {
        private final StringBuilder builder;
        private String cachedString;
        private String lastReplacement;

        private Branch() {
            this.builder = new StringBuilder();
            this.lastReplacement = null;
            this.cachedString = null;
        }

        public Branch createBranch() {
            Branch branch = new Branch();
            branch.builder.append(toString());
            branch.lastReplacement = this.lastReplacement;
            return branch;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Branch) {
                return toString().equals(((Branch) obj).toString());
            }
            return false;
        }

        public void finish() {
            while (this.builder.length() < 6) {
                this.builder.append('0');
                this.cachedString = null;
            }
        }

        public int hashCode() {
            return toString().hashCode();
        }

        public void processNextReplacement(String str, boolean z14) {
            String str2 = this.lastReplacement;
            if ((str2 == null || !str2.endsWith(str) || z14) && this.builder.length() < 6) {
                this.builder.append(str);
                if (this.builder.length() > 6) {
                    StringBuilder sb3 = this.builder;
                    sb3.delete(6, sb3.length());
                }
                this.cachedString = null;
            }
            this.lastReplacement = str;
        }

        public String toString() {
            if (this.cachedString == null) {
                this.cachedString = this.builder.toString();
            }
            return this.cachedString;
        }
    }

    public static final class Rule {
        private final String pattern;
        private final String[] replacementAtStart;
        private final String[] replacementBeforeVowel;
        private final String[] replacementDefault;

        public Rule(String str, String str2, String str3, String str4) {
            this.pattern = str;
            this.replacementAtStart = str2.split("\\|");
            this.replacementBeforeVowel = str3.split("\\|");
            this.replacementDefault = str4.split("\\|");
        }

        private boolean isVowel(char c14) {
            return c14 == 'a' || c14 == 'e' || c14 == 'i' || c14 == 'o' || c14 == 'u';
        }

        public int getPatternLength() {
            return this.pattern.length();
        }

        public String[] getReplacements(String str, boolean z14) {
            if (z14) {
                return this.replacementAtStart;
            }
            int patternLength = getPatternLength();
            return (patternLength >= str.length() || !isVowel(str.charAt(patternLength))) ? this.replacementDefault : this.replacementBeforeVowel;
        }

        public boolean matches(String str) {
            return str.startsWith(this.pattern);
        }

        public String toString() {
            return String.format("%s=(%s,%s,%s)", this.pattern, Arrays.asList(this.replacementAtStart), Arrays.asList(this.replacementBeforeVowel), Arrays.asList(this.replacementDefault));
        }
    }

    static {
        HashMap map = new HashMap();
        RULES = map;
        HashMap map2 = new HashMap();
        FOLDINGS = map2;
        Scanner scanner = new Scanner(Resources.getInputStream(RESOURCE_FILE), CharEncoding.UTF_8);
        try {
            parseRules(scanner, RESOURCE_FILE, map, map2);
            scanner.close();
            map.forEach(new c());
        } catch (Throwable th3) {
            try {
                scanner.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public DaitchMokotoffSoundex(boolean z14) {
        this.folding = z14;
    }

    private String cleanup(String str) {
        StringBuilder sb3 = new StringBuilder();
        for (char c14 : str.toCharArray()) {
            if (!Character.isWhitespace(c14)) {
                char lowerCase = Character.toLowerCase(c14);
                Character ch3 = FOLDINGS.get(Character.valueOf(lowerCase));
                if (this.folding && ch3 != null) {
                    lowerCase = ch3.charValue();
                }
                sb3.append(lowerCase);
            }
        }
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$parseRules$2(Character ch3) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(Rule rule, Rule rule2) {
        return rule2.getPatternLength() - rule.getPatternLength();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$1(Character ch3, List list) {
        list.sort(new b());
    }

    private static void parseRules(Scanner scanner, String str, Map<Character, List<Rule>> map, Map<Character, Character> map2) {
        int i14 = 0;
        boolean z14 = false;
        while (scanner.hasNextLine()) {
            i14++;
            String strNextLine = scanner.nextLine();
            if (z14) {
                if (strNextLine.endsWith(MULTILINE_COMMENT_END)) {
                    z14 = false;
                }
            } else if (strNextLine.startsWith(MULTILINE_COMMENT_START)) {
                z14 = true;
            } else {
                int iIndexOf = strNextLine.indexOf(COMMENT);
                String strTrim = (iIndexOf >= 0 ? strNextLine.substring(0, iIndexOf) : strNextLine).trim();
                if (strTrim.isEmpty()) {
                    continue;
                } else if (strTrim.contains("=")) {
                    String[] strArrSplit = strTrim.split("=");
                    if (strArrSplit.length != 2) {
                        StringBuilder sb3 = new StringBuilder("Malformed folding statement split into ");
                        g.t(strArrSplit.length, " parts: ", strNextLine, " in ", sb3);
                        com.nimbusds.jose.shaded.gson.internal.a.v(sb3, str);
                        return;
                    } else {
                        String str2 = strArrSplit[0];
                        String str3 = strArrSplit[1];
                        if (str2.length() != 1 || str3.length() != 1) {
                            h.s(a0.j("Malformed folding statement - patterns are not single characters: ", strNextLine, " in ", str));
                            return;
                        }
                        map2.put(Character.valueOf(str2.charAt(0)), Character.valueOf(str3.charAt(0)));
                    }
                } else {
                    String[] strArrSplit2 = strTrim.split("\\s+");
                    if (strArrSplit2.length != 4) {
                        StringBuilder sb4 = new StringBuilder("Malformed rule statement split into ");
                        g.t(strArrSplit2.length, " parts: ", strNextLine, " in ", sb4);
                        com.nimbusds.jose.shaded.gson.internal.a.v(sb4, str);
                        return;
                    } else {
                        try {
                            Rule rule = new Rule(stripQuotes(strArrSplit2[0]), stripQuotes(strArrSplit2[1]), stripQuotes(strArrSplit2[2]), stripQuotes(strArrSplit2[3]));
                            map.computeIfAbsent(Character.valueOf(rule.pattern.charAt(0)), new a()).add(rule);
                        } catch (IllegalArgumentException e4) {
                            com.airbnb.lottie.animation.keyframe.a.x(sn.a.e(i14, "Problem parsing line '", "' in ", str), e4);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    private String[] soundex(String str, boolean z14) {
        String str2;
        String str3;
        boolean z15;
        if (str == null) {
            return null;
        }
        String strCleanup = cleanup(str);
        LinkedHashSet<Branch> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Branch());
        int patternLength = 0;
        char c14 = 0;
        while (patternLength < strCleanup.length()) {
            char cCharAt = strCleanup.charAt(patternLength);
            boolean z16 = true;
            if (Character.isWhitespace(cCharAt)) {
                str2 = strCleanup;
            } else {
                String strSubstring = strCleanup.substring(patternLength);
                List<Rule> list = RULES.get(Character.valueOf(cCharAt));
                if (list == null) {
                    str2 = strCleanup;
                } else {
                    List arrayList = z14 ? new ArrayList() : Collections.EMPTY_LIST;
                    Iterator<Rule> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str2 = strCleanup;
                            break;
                        }
                        Rule next = it.next();
                        if (next.matches(strSubstring)) {
                            if (z14) {
                                arrayList.clear();
                            }
                            String[] replacements = next.getReplacements(strSubstring, c14 == 0);
                            boolean z17 = replacements.length > 1 && z14;
                            for (Branch branch : linkedHashSet) {
                                int length = replacements.length;
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= length) {
                                        str3 = strCleanup;
                                        z15 = z16;
                                        break;
                                    }
                                    String str4 = replacements[i14];
                                    Branch branchCreateBranch = z17 ? branch.createBranch() : branch;
                                    z15 = z16;
                                    str3 = strCleanup;
                                    branchCreateBranch.processNextReplacement(str4, ((c14 == 'm' && cCharAt == 'n') || (c14 == 'n' && cCharAt == 'm')) ? z15 : false);
                                    if (!z14) {
                                        break;
                                    }
                                    arrayList.add(branchCreateBranch);
                                    i14++;
                                    z16 = z15;
                                    strCleanup = str3;
                                }
                                z16 = z15;
                                strCleanup = str3;
                            }
                            str2 = strCleanup;
                            if (z14) {
                                linkedHashSet.clear();
                                linkedHashSet.addAll(arrayList);
                            }
                            patternLength += next.getPatternLength() - 1;
                            break;
                        }
                    }
                    c14 = cCharAt;
                }
            }
            patternLength++;
            strCleanup = str2;
        }
        String[] strArr = new String[linkedHashSet.size()];
        int i15 = 0;
        for (Branch branch2 : linkedHashSet) {
            branch2.finish();
            strArr[i15] = branch2.toString();
            i15++;
        }
        return strArr;
    }

    private static String stripQuotes(String str) {
        if (str.startsWith(DOUBLE_QUOTE)) {
            str = str.substring(1);
        }
        return str.endsWith(DOUBLE_QUOTE) ? fb1.c.m(1, 0, str) : str;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Parameter supplied to DaitchMokotoffSoundex encode is not of type java.lang.String");
    }

    public DaitchMokotoffSoundex() {
        this(true);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        if (str == null) {
            return null;
        }
        return soundex(str, false)[0];
    }

    public String soundex(String str) {
        String[] strArrSoundex = soundex(str, true);
        StringBuilder sb3 = new StringBuilder();
        int i14 = 0;
        for (String str2 : strArrSoundex) {
            sb3.append(str2);
            i14++;
            if (i14 < strArrSoundex.length) {
                sb3.append('|');
            }
        }
        return sb3.toString();
    }
}
