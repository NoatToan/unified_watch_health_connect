package com.google.i18n.phonenumbers;

import am.j;
import c22.t;
import com.google.i18n.phonenumbers.internal.RegexCache;
import com.google.i18n.phonenumbers.metadata.DefaultMetadataDependenciesProvider;
import fb1.c;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.text.StringSubstitutor;
import p6.b;
import sn.a;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class PhoneNumberMatcher implements Iterator<PhoneNumberMatch> {
    private static final Pattern LEAD_CLASS;
    private static final Pattern PATTERN;
    private final PhoneNumberUtil.Leniency leniency;
    private long maxTries;
    private final PhoneNumberUtil phoneUtil;
    private final String preferredRegion;
    private final CharSequence text;
    private static final Pattern PUB_PAGES = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    private static final Pattern SLASH_SEPARATED_DATES = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    private static final Pattern TIME_STAMPS = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");
    private static final Pattern TIME_STAMPS_SUFFIX = Pattern.compile(":[0-5]\\d");
    private static final Pattern[] INNER_MATCHES = {Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[‒-―－]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")};
    private static final Pattern MATCHING_BRACKETS = Pattern.compile("(?:[(\\[（［])?(?:[^(\\[（［)\\]）］]+[)\\]）］])?[^(\\[（［)\\]）］]+(?:[(\\[（［][^(\\[（［)\\]）］]+[)\\]）］])" + limit(0, 3) + "[^(\\[（［)\\]）］]*");
    private State state = State.NOT_READY;
    private PhoneNumberMatch lastMatch = null;
    private int searchIndex = 0;
    private final RegexCache regexCache = new RegexCache(32);

    public interface NumberGroupingChecker {
        boolean checkGroups(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb3, String[] strArr);
    }

    public enum State {
        NOT_READY,
        READY,
        DONE
    }

    static {
        String strLimit = limit(0, 2);
        String strLimit2 = limit(0, 4);
        String strLimit3 = limit(0, 20);
        String strN = c.n("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]", strLimit2);
        String str = "\\p{Nd}" + limit(1, 20);
        LEAD_CLASS = Pattern.compile("[(\\[（［+＋]");
        StringBuilder sbI = b.i("(?:[(\\[（［+＋]", strN, ")", strLimit, str);
        a.t(sbI, "(?:", strN, str, ")");
        sbI.append(strLimit3);
        sbI.append("(?:");
        sbI.append(PhoneNumberUtil.EXTN_PATTERNS_FOR_MATCHING);
        sbI.append(")?");
        PATTERN = Pattern.compile(sbI.toString(), 66);
    }

    public PhoneNumberMatcher(PhoneNumberUtil phoneNumberUtil, String str, String str2, PhoneNumberUtil.Leniency leniency, long j8) {
        if (phoneNumberUtil == null || leniency == null) {
            throw null;
        }
        if (j8 < 0) {
            h.w();
            throw null;
        }
        this.phoneUtil = phoneNumberUtil;
        this.text = str == null ? "" : str;
        this.preferredRegion = str2;
        this.leniency = leniency;
        this.maxTries = j8;
    }

    public static boolean allNumberGroupsAreExactlyPresent(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb3, String[] strArr) {
        String[] strArrSplit = PhoneNumberUtil.NON_DIGITS_PATTERN.split(sb3.toString());
        int length = phoneNumber.hasExtension() ? strArrSplit.length - 2 : strArrSplit.length - 1;
        if (strArrSplit.length == 1 || strArrSplit[length].contains(phoneNumberUtil.getNationalSignificantNumber(phoneNumber))) {
            return true;
        }
        int length2 = strArr.length - 1;
        while (length2 > 0 && length >= 0) {
            if (!strArrSplit[length].equals(strArr[length2])) {
                return false;
            }
            length2--;
            length--;
        }
        return length >= 0 && strArrSplit[length].endsWith(strArr[0]);
    }

    public static boolean allNumberGroupsRemainGrouped(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb3, String[] strArr) {
        int length;
        if (phoneNumber.getCountryCodeSource() != Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            String string = Integer.toString(phoneNumber.getCountryCode());
            length = string.length() + sb3.indexOf(string);
        } else {
            length = 0;
        }
        for (int i14 = 0; i14 < strArr.length; i14++) {
            int iIndexOf = sb3.indexOf(strArr[i14], length);
            if (iIndexOf < 0) {
                return false;
            }
            length = iIndexOf + strArr[i14].length();
            if (i14 == 0 && length < sb3.length() && phoneNumberUtil.getNddPrefixForRegion(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumber.getCountryCode()), true) != null && Character.isDigit(sb3.charAt(length))) {
                return sb3.substring(length - strArr[i14].length()).startsWith(phoneNumberUtil.getNationalSignificantNumber(phoneNumber));
            }
        }
        return sb3.substring(length).contains(phoneNumber.getExtension());
    }

    public static boolean containsMoreThanOneSlashInNationalNumber(Phonenumber.PhoneNumber phoneNumber, String str) {
        int iIndexOf;
        int iIndexOf2 = str.indexOf(47);
        if (iIndexOf2 < 0 || (iIndexOf = str.indexOf(47, iIndexOf2 + 1)) < 0) {
            return false;
        }
        if ((phoneNumber.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN || phoneNumber.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN) && PhoneNumberUtil.normalizeDigitsOnly(str.substring(0, iIndexOf2)).equals(Integer.toString(phoneNumber.getCountryCode()))) {
            return str.substring(iIndexOf + 1).contains("/");
        }
        return true;
    }

    public static boolean containsOnlyValidXChars(Phonenumber.PhoneNumber phoneNumber, String str, PhoneNumberUtil phoneNumberUtil) {
        int i14 = 0;
        while (i14 < str.length() - 1) {
            char cCharAt = str.charAt(i14);
            if (cCharAt == 'x' || cCharAt == 'X') {
                int i15 = i14 + 1;
                char cCharAt2 = str.charAt(i15);
                if (cCharAt2 == 'x' || cCharAt2 == 'X') {
                    if (phoneNumberUtil.isNumberMatch(phoneNumber, str.substring(i15)) != PhoneNumberUtil.MatchType.NSN_MATCH) {
                        return false;
                    }
                    i14 = i15;
                } else if (!PhoneNumberUtil.normalizeDigitsOnly(str.substring(i14)).equals(phoneNumber.getExtension())) {
                    return false;
                }
            }
            i14++;
        }
        return true;
    }

    private PhoneNumberMatch extractInnerMatch(CharSequence charSequence, int i14) {
        for (Pattern pattern : INNER_MATCHES) {
            Matcher matcher = pattern.matcher(charSequence);
            boolean z14 = true;
            while (matcher.find() && this.maxTries > 0) {
                if (z14) {
                    PhoneNumberMatch andVerify = parseAndVerify(trimAfterFirstMatch(PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN, charSequence.subSequence(0, matcher.start())), i14);
                    if (andVerify != null) {
                        return andVerify;
                    }
                    this.maxTries--;
                    z14 = false;
                }
                PhoneNumberMatch andVerify2 = parseAndVerify(trimAfterFirstMatch(PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN, matcher.group(1)), matcher.start(1) + i14);
                if (andVerify2 != null) {
                    return andVerify2;
                }
                this.maxTries--;
            }
        }
        return null;
    }

    private PhoneNumberMatch extractMatch(CharSequence charSequence, int i14) {
        if (SLASH_SEPARATED_DATES.matcher(charSequence).find()) {
            return null;
        }
        if (TIME_STAMPS.matcher(charSequence).find()) {
            if (TIME_STAMPS_SUFFIX.matcher(this.text.toString().substring(charSequence.length() + i14)).lookingAt()) {
                return null;
            }
        }
        PhoneNumberMatch andVerify = parseAndVerify(charSequence, i14);
        return andVerify != null ? andVerify : extractInnerMatch(charSequence, i14);
    }

    private PhoneNumberMatch find(int i14) {
        Matcher matcher = PATTERN.matcher(this.text);
        while (this.maxTries > 0 && matcher.find(i14)) {
            int iStart = matcher.start();
            CharSequence charSequenceTrimAfterFirstMatch = trimAfterFirstMatch(PhoneNumberUtil.SECOND_NUMBER_START_PATTERN, this.text.subSequence(iStart, matcher.end()));
            PhoneNumberMatch phoneNumberMatchExtractMatch = extractMatch(charSequenceTrimAfterFirstMatch, iStart);
            if (phoneNumberMatchExtractMatch != null) {
                return phoneNumberMatchExtractMatch;
            }
            i14 = iStart + charSequenceTrimAfterFirstMatch.length();
            this.maxTries--;
        }
        return null;
    }

    private static String[] getNationalNumberGroups(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber) {
        String str = phoneNumberUtil.format(phoneNumber, PhoneNumberUtil.PhoneNumberFormat.RFC3966);
        int iIndexOf = str.indexOf(59);
        if (iIndexOf < 0) {
            iIndexOf = str.length();
        }
        return str.substring(str.indexOf(45) + 1, iIndexOf).split("-");
    }

    private static boolean isInvalidPunctuationSymbol(char c14) {
        return c14 == '%' || Character.getType(c14) == 26;
    }

    public static boolean isLatinLetter(char c14) {
        if (!Character.isLetter(c14) && Character.getType(c14) != 6) {
            return false;
        }
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(c14);
        return unicodeBlockOf.equals(Character.UnicodeBlock.BASIC_LATIN) || unicodeBlockOf.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || unicodeBlockOf.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || unicodeBlockOf.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || unicodeBlockOf.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || unicodeBlockOf.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS);
    }

    public static boolean isNationalPrefixPresentIfRequired(Phonenumber.PhoneNumber phoneNumber, PhoneNumberUtil phoneNumberUtil) {
        Phonemetadata.PhoneMetadata metadataForRegion;
        if (phoneNumber.getCountryCodeSource() != Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY || (metadataForRegion = phoneNumberUtil.getMetadataForRegion(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumber.getCountryCode()))) == null) {
            return true;
        }
        Phonemetadata.NumberFormat numberFormatChooseFormattingPatternForNumber = phoneNumberUtil.chooseFormattingPatternForNumber(metadataForRegion.getNumberFormatList(), phoneNumberUtil.getNationalSignificantNumber(phoneNumber));
        if (numberFormatChooseFormattingPatternForNumber == null || numberFormatChooseFormattingPatternForNumber.getNationalPrefixFormattingRule().length() <= 0 || numberFormatChooseFormattingPatternForNumber.getNationalPrefixOptionalWhenFormatting() || PhoneNumberUtil.formattingRuleHasFirstGroupOnly(numberFormatChooseFormattingPatternForNumber.getNationalPrefixFormattingRule())) {
            return true;
        }
        return phoneNumberUtil.maybeStripNationalPrefixAndCarrierCode(new StringBuilder(PhoneNumberUtil.normalizeDigitsOnly(phoneNumber.getRawInput())), metadataForRegion, null);
    }

    private static String limit(int i14, int i15) {
        if (i14 >= 0 && i15 > 0 && i15 >= i14) {
            return j.g(i14, i15, "{", ",", StringSubstitutor.DEFAULT_VAR_END);
        }
        h.w();
        return null;
    }

    private PhoneNumberMatch parseAndVerify(CharSequence charSequence, int i14) {
        try {
            if (MATCHING_BRACKETS.matcher(charSequence).matches() && !PUB_PAGES.matcher(charSequence).find()) {
                if (this.leniency.compareTo(PhoneNumberUtil.Leniency.VALID) >= 0) {
                    if (i14 > 0 && !LEAD_CLASS.matcher(charSequence).lookingAt()) {
                        char cCharAt = this.text.charAt(i14 - 1);
                        if (isInvalidPunctuationSymbol(cCharAt) || isLatinLetter(cCharAt)) {
                            return null;
                        }
                    }
                    int length = charSequence.length() + i14;
                    if (length < this.text.length()) {
                        char cCharAt2 = this.text.charAt(length);
                        if (isInvalidPunctuationSymbol(cCharAt2) || isLatinLetter(cCharAt2)) {
                            return null;
                        }
                    }
                }
                Phonenumber.PhoneNumber andKeepRawInput = this.phoneUtil.parseAndKeepRawInput(charSequence, this.preferredRegion);
                if (this.leniency.verify(andKeepRawInput, charSequence, this.phoneUtil, this)) {
                    andKeepRawInput.clearCountryCodeSource();
                    andKeepRawInput.clearRawInput();
                    andKeepRawInput.clearPreferredDomesticCarrierCode();
                    return new PhoneNumberMatch(i14, charSequence.toString(), andKeepRawInput);
                }
            }
        } catch (NumberParseException unused) {
        }
        return null;
    }

    private static CharSequence trimAfterFirstMatch(Pattern pattern, CharSequence charSequence) {
        Matcher matcher = pattern.matcher(charSequence);
        return matcher.find() ? charSequence.subSequence(0, matcher.start()) : charSequence;
    }

    public boolean checkNumberGroupingIsValid(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, NumberGroupingChecker numberGroupingChecker) {
        StringBuilder sbNormalizeDigits = PhoneNumberUtil.normalizeDigits(charSequence, true);
        if (numberGroupingChecker.checkGroups(phoneNumberUtil, phoneNumber, sbNormalizeDigits, getNationalNumberGroups(phoneNumberUtil, phoneNumber))) {
            return true;
        }
        Phonemetadata.PhoneMetadata formattingMetadataForCountryCallingCode = DefaultMetadataDependenciesProvider.getInstance().getAlternateFormatsMetadataSource().getFormattingMetadataForCountryCallingCode(phoneNumber.getCountryCode());
        String nationalSignificantNumber = phoneNumberUtil.getNationalSignificantNumber(phoneNumber);
        if (formattingMetadataForCountryCallingCode != null) {
            for (Phonemetadata.NumberFormat numberFormat : formattingMetadataForCountryCallingCode.getNumberFormatList()) {
                if (numberFormat.getLeadingDigitsPatternCount() <= 0 || this.regexCache.getPatternForRegex(numberFormat.getLeadingDigitsPattern(0)).matcher(nationalSignificantNumber).lookingAt()) {
                    if (numberGroupingChecker.checkGroups(phoneNumberUtil, phoneNumber, sbNormalizeDigits, getNationalNumberGroups(phoneNumberUtil, phoneNumber, numberFormat))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.state == State.NOT_READY) {
            PhoneNumberMatch phoneNumberMatchFind = find(this.searchIndex);
            this.lastMatch = phoneNumberMatchFind;
            if (phoneNumberMatchFind == null) {
                this.state = State.DONE;
            } else {
                this.searchIndex = phoneNumberMatchFind.end();
                this.state = State.READY;
            }
        }
        return this.state == State.READY;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public PhoneNumberMatch next() {
        if (!hasNext()) {
            t.g();
            return null;
        }
        PhoneNumberMatch phoneNumberMatch = this.lastMatch;
        this.lastMatch = null;
        this.state = State.NOT_READY;
        return phoneNumberMatch;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    private static String[] getNationalNumberGroups(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, Phonemetadata.NumberFormat numberFormat) {
        return phoneNumberUtil.formatNsnUsingPattern(phoneNumberUtil.getNationalSignificantNumber(phoneNumber), numberFormat, PhoneNumberUtil.PhoneNumberFormat.RFC3966).split("-");
    }
}
