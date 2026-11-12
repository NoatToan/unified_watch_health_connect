package org.apache.commons.codec.language.bm;

import androidx.room.a0;
import com.google.firebase.messaging.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public class PhoneticEngine {
    private static final int DEFAULT_MAX_PHONEMES = 20;
    private static final Map<NameType, Set<String>> NAME_PREFIXES;
    private final boolean concat;
    private final Lang lang;
    private final int maxPhonemes;
    private final NameType nameType;
    private final RuleType ruleType;

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.PhoneticEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$codec$language$bm$NameType;

        static {
            int[] iArr = new int[NameType.values().length];
            $SwitchMap$org$apache$commons$codec$language$bm$NameType = iArr;
            try {
                iArr[NameType.SEPHARDIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$commons$codec$language$bm$NameType[NameType.ASHKENAZI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$commons$codec$language$bm$NameType[NameType.GENERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class RulesApplication {
        private final Map<String, List<Rule>> finalRules;
        private boolean found;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f133426i;
        private final CharSequence input;
        private final int maxPhonemes;
        private final PhonemeBuilder phonemeBuilder;

        public RulesApplication(Map<String, List<Rule>> map, CharSequence charSequence, PhonemeBuilder phonemeBuilder, int i14, int i15) {
            Objects.requireNonNull(map, "finalRules");
            this.finalRules = map;
            this.phonemeBuilder = phonemeBuilder;
            this.input = charSequence;
            this.f133426i = i14;
            this.maxPhonemes = i15;
        }

        public int getI() {
            return this.f133426i;
        }

        public PhonemeBuilder getPhonemeBuilder() {
            return this.phonemeBuilder;
        }

        public RulesApplication invoke() {
            int i14;
            this.found = false;
            Map<String, List<Rule>> map = this.finalRules;
            CharSequence charSequence = this.input;
            int i15 = this.f133426i;
            List<Rule> list = map.get(charSequence.subSequence(i15, i15 + 1));
            if (list != null) {
                i14 = 1;
                for (Rule rule : list) {
                    int length = rule.getPattern().length();
                    if (rule.patternAndContextMatches(this.input, this.f133426i)) {
                        this.phonemeBuilder.apply(rule.getPhoneme(), this.maxPhonemes);
                        this.found = true;
                        i14 = length;
                        break;
                    }
                    i14 = length;
                }
            } else {
                i14 = 1;
            }
            this.f133426i += this.found ? i14 : 1;
            return this;
        }

        public boolean isFound() {
            return this.found;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(NameType.class);
        NAME_PREFIXES = enumMap;
        enumMap.put(NameType.ASHKENAZI, Collections.unmodifiableSet(new HashSet(Arrays.asList("bar", "ben", "da", "de", "van", "von"))));
        enumMap.put(NameType.SEPHARDIC, Collections.unmodifiableSet(new HashSet(Arrays.asList("al", "el", "da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
        enumMap.put(NameType.GENERIC, Collections.unmodifiableSet(new HashSet(Arrays.asList("da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
    }

    public PhoneticEngine(NameType nameType, RuleType ruleType, boolean z14, int i14) {
        RuleType ruleType2 = RuleType.RULES;
        if (ruleType == ruleType2) {
            l.j(ruleType2, "ruleType must not be ");
            throw null;
        }
        this.nameType = nameType;
        this.ruleType = ruleType;
        this.concat = z14;
        this.lang = Lang.instance(nameType);
        this.maxPhonemes = i14;
    }

    private PhonemeBuilder applyFinalRules(PhonemeBuilder phonemeBuilder, Map<String, List<Rule>> map) {
        Objects.requireNonNull(map, "finalRules");
        if (map.isEmpty()) {
            return phonemeBuilder;
        }
        TreeMap treeMap = new TreeMap(Rule.Phoneme.COMPARATOR);
        phonemeBuilder.getPhonemes().forEach(new d(this, map, treeMap, 0));
        return new PhonemeBuilder(treeMap.keySet(), null);
    }

    private static String join(List<String> list, String str) {
        return (String) list.stream().collect(Collectors.joining(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyFinalRules$0(Map map, Rule.Phoneme phoneme) {
        if (!map.containsKey(phoneme)) {
            map.put(phoneme, phoneme);
        } else {
            Rule.Phoneme phonemeMergeWithLanguage = ((Rule.Phoneme) map.remove(phoneme)).mergeWithLanguage(phoneme.getLanguages());
            map.put(phonemeMergeWithLanguage, phonemeMergeWithLanguage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyFinalRules$1(Map map, Map map2, Rule.Phoneme phoneme) {
        PhonemeBuilder phonemeBuilderEmpty = PhonemeBuilder.empty(phoneme.getLanguages());
        String string = phoneme.getPhonemeText().toString();
        int i14 = 0;
        PhonemeBuilder phonemeBuilder = phonemeBuilderEmpty;
        while (i14 < string.length()) {
            Map map3 = map;
            RulesApplication rulesApplicationInvoke = new RulesApplication(map3, string, phonemeBuilder, i14, this.maxPhonemes).invoke();
            boolean zIsFound = rulesApplicationInvoke.isFound();
            phonemeBuilder = rulesApplicationInvoke.getPhonemeBuilder();
            if (!zIsFound) {
                phonemeBuilder.append(string.subSequence(i14, i14 + 1));
            }
            i14 = rulesApplicationInvoke.getI();
            map = map3;
        }
        phonemeBuilder.getPhonemes().forEach(new e(map2, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$encode$2(List list, String str) {
        String[] strArrSplit = str.split("'", -1);
        list.add(strArrSplit[strArrSplit.length - 1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$encode$3(StringBuilder sb3, String str) {
        sb3.append("-");
        sb3.append(encode(str));
    }

    public String encode(String str, Languages.LanguageSet languageSet) {
        Map<String, List<Rule>> instanceMap = Rule.getInstanceMap(this.nameType, RuleType.RULES, languageSet);
        Map<String, List<Rule>> instanceMap2 = Rule.getInstanceMap(this.nameType, this.ruleType, "common");
        Map<String, List<Rule>> instanceMap3 = Rule.getInstanceMap(this.nameType, this.ruleType, languageSet);
        String strTrim = str.toLowerCase(Locale.ENGLISH).replace('-', ' ').trim();
        if (this.nameType == NameType.GENERIC) {
            if (strTrim.startsWith("d'")) {
                String strSubstring = strTrim.substring(2);
                return "(" + encode(strSubstring) + ")-(" + encode("d".concat(strSubstring)) + ")";
            }
            for (String str2 : NAME_PREFIXES.get(this.nameType)) {
                if (strTrim.startsWith(str2 + StringUtils.SPACE)) {
                    String strSubstring2 = strTrim.substring(str2.length() + 1);
                    return "(" + encode(strSubstring2) + ")-(" + encode(str2.concat(strSubstring2)) + ")";
                }
            }
        }
        List listAsList = Arrays.asList(strTrim.split("\\s+"));
        ArrayList arrayList = new ArrayList();
        int i14 = AnonymousClass1.$SwitchMap$org$apache$commons$codec$language$bm$NameType[this.nameType.ordinal()];
        if (i14 == 1) {
            listAsList.forEach(new c(0, arrayList));
            arrayList.removeAll(NAME_PREFIXES.get(this.nameType));
        } else if (i14 == 2) {
            arrayList.addAll(listAsList);
            arrayList.removeAll(NAME_PREFIXES.get(this.nameType));
        } else {
            if (i14 != 3) {
                a0.s(this.nameType, "Unreachable case: ");
                return null;
            }
            arrayList.addAll(listAsList);
        }
        if (this.concat) {
            strTrim = join(arrayList, StringUtils.SPACE);
        } else if (arrayList.size() == 1) {
            strTrim = (String) listAsList.iterator().next();
        } else if (!arrayList.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            arrayList.forEach(new a(this, sb3, 1));
            return sb3.substring(1);
        }
        String str3 = strTrim;
        PhonemeBuilder phonemeBuilderEmpty = PhonemeBuilder.empty(languageSet);
        int i15 = 0;
        while (i15 < str3.length()) {
            RulesApplication rulesApplicationInvoke = new RulesApplication(instanceMap, str3, phonemeBuilderEmpty, i15, this.maxPhonemes).invoke();
            i15 = rulesApplicationInvoke.getI();
            phonemeBuilderEmpty = rulesApplicationInvoke.getPhonemeBuilder();
        }
        return applyFinalRules(applyFinalRules(phonemeBuilderEmpty, instanceMap2), instanceMap3).makeString();
    }

    public Lang getLang() {
        return this.lang;
    }

    public int getMaxPhonemes() {
        return this.maxPhonemes;
    }

    public NameType getNameType() {
        return this.nameType;
    }

    public RuleType getRuleType() {
        return this.ruleType;
    }

    public boolean isConcat() {
        return this.concat;
    }

    public static final class PhonemeBuilder {
        private final Set<Rule.Phoneme> phonemes;

        private PhonemeBuilder(Rule.Phoneme phoneme) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            this.phonemes = linkedHashSet;
            linkedHashSet.add(phoneme);
        }

        public static PhonemeBuilder empty(Languages.LanguageSet languageSet) {
            return new PhonemeBuilder(new Rule.Phoneme("", languageSet));
        }

        public void append(CharSequence charSequence) {
            this.phonemes.forEach(new e(charSequence, 0));
        }

        public void apply(Rule.PhonemeExpr phonemeExpr, int i14) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(Math.min(phonemeExpr.size() * this.phonemes.size(), i14));
            loop0: for (Rule.Phoneme phoneme : this.phonemes) {
                for (Rule.Phoneme phoneme2 : phonemeExpr.getPhonemes()) {
                    Languages.LanguageSet languageSetRestrictTo = phoneme.getLanguages().restrictTo(phoneme2.getLanguages());
                    if (!languageSetRestrictTo.isEmpty()) {
                        Rule.Phoneme phoneme3 = new Rule.Phoneme(phoneme, phoneme2, languageSetRestrictTo);
                        if (linkedHashSet.size() < i14) {
                            linkedHashSet.add(phoneme3);
                            if (linkedHashSet.size() >= i14) {
                                break loop0;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            this.phonemes.clear();
            this.phonemes.addAll(linkedHashSet);
        }

        public Set<Rule.Phoneme> getPhonemes() {
            return this.phonemes;
        }

        public String makeString() {
            return (String) this.phonemes.stream().map(new com.google.android.material.color.utilities.f(4)).collect(Collectors.joining("|"));
        }

        public /* synthetic */ PhonemeBuilder(Set set, AnonymousClass1 anonymousClass1) {
            this((Set<Rule.Phoneme>) set);
        }

        private PhonemeBuilder(Set<Rule.Phoneme> set) {
            this.phonemes = set;
        }
    }

    public PhoneticEngine(NameType nameType, RuleType ruleType, boolean z14) {
        this(nameType, ruleType, z14, 20);
    }

    public String encode(String str) {
        return encode(str, this.lang.guessLanguages(str));
    }
}
