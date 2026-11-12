package org.apache.commons.codec.language.bm;

import am.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.commons.codec.Resources;
import org.apache.commons.lang3.BooleanUtils;

/* JADX INFO: loaded from: classes3.dex */
public class Lang {
    private static final Map<NameType, Lang> LANGS = new EnumMap(NameType.class);
    private static final String LANGUAGE_RULES_RN = "org/apache/commons/codec/language/bm/%s_lang.txt";
    private final Languages languages;
    private final List<LangRule> rules;

    public static final class LangRule {
        private final boolean acceptOnMatch;
        private final Set<String> languages;
        private final Pattern pattern;

        private LangRule(Pattern pattern, Set<String> set, boolean z14) {
            this.pattern = pattern;
            this.languages = set;
            this.acceptOnMatch = z14;
        }

        public boolean matches(String str) {
            return this.pattern.matcher(str).find();
        }
    }

    static {
        for (NameType nameType : NameType.values()) {
            LANGS.put(nameType, loadFromResource(j.m("org/apache/commons/codec/language/bm/", nameType.getName(), "_lang.txt"), Languages.getInstance(nameType)));
        }
    }

    private Lang(List<LangRule> list, Languages languages) {
        this.rules = Collections.unmodifiableList(list);
        this.languages = languages;
    }

    public static Lang instance(NameType nameType) {
        return LANGS.get(nameType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$guessLanguages$0(String str, Set set, LangRule langRule) {
        if (langRule.matches(str)) {
            if (langRule.acceptOnMatch) {
                set.retainAll(langRule.languages);
            } else {
                set.removeAll(langRule.languages);
            }
        }
    }

    public static Lang loadFromResource(String str, Languages languages) {
        ArrayList arrayList = new ArrayList();
        Scanner scanner = new Scanner(Resources.getInputStream(str), ResourceConstants.ENCODING);
        while (true) {
            boolean z14 = false;
            while (true) {
                try {
                    if (!scanner.hasNextLine()) {
                        scanner.close();
                        return new Lang(arrayList, languages);
                    }
                    String strNextLine = scanner.nextLine();
                    if (z14) {
                        if (strNextLine.endsWith("*/")) {
                            break;
                        }
                    } else if (strNextLine.startsWith("/*")) {
                        z14 = true;
                    } else {
                        int iIndexOf = strNextLine.indexOf("//");
                        String strTrim = (iIndexOf >= 0 ? strNextLine.substring(0, iIndexOf) : strNextLine).trim();
                        if (!strTrim.isEmpty()) {
                            String[] strArrSplit = strTrim.split("\\s+");
                            if (strArrSplit.length != 3) {
                                throw new IllegalArgumentException("Malformed line '" + strNextLine + "' in language resource '" + str + "'");
                            }
                            arrayList.add(new LangRule(Pattern.compile(strArrSplit[0]), new HashSet(Arrays.asList(strArrSplit[1].split("\\+"))), strArrSplit[2].equals(BooleanUtils.TRUE)));
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        scanner.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
    }

    public String guessLanguage(String str) {
        Languages.LanguageSet languageSetGuessLanguages = guessLanguages(str);
        return languageSetGuessLanguages.isSingleton() ? languageSetGuessLanguages.getAny() : Languages.ANY;
    }

    public Languages.LanguageSet guessLanguages(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        HashSet hashSet = new HashSet(this.languages.getLanguages());
        this.rules.forEach(new a(lowerCase, hashSet, 0));
        Languages.LanguageSet languageSetFrom = Languages.LanguageSet.from(hashSet);
        return languageSetFrom.equals(Languages.NO_LANGUAGES) ? Languages.ANY_LANGUAGE : languageSetFrom;
    }
}
