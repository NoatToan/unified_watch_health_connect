package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.internal.RegexCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class AsYouTypeFormatter {
    private static final int MIN_LEADING_DIGITS_LENGTH = 3;
    private static final char SEPARATOR_BEFORE_NATIONAL_NUMBER = ' ';
    private Phonemetadata.PhoneMetadata currentMetadata;
    private String defaultCountry;
    private Phonemetadata.PhoneMetadata defaultMetadata;
    private static final Phonemetadata.PhoneMetadata EMPTY_METADATA = Phonemetadata.PhoneMetadata.newBuilder().setId("<ignored>").setInternationalPrefix("NA").build();
    private static final Pattern ELIGIBLE_FORMAT_PATTERN = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)*");
    private static final Pattern NATIONAL_PREFIX_SEPARATORS_PATTERN = Pattern.compile("[- ]");
    private static final String DIGIT_PLACEHOLDER = "\u2008";
    private static final Pattern DIGIT_PATTERN = Pattern.compile(DIGIT_PLACEHOLDER);
    private String currentOutput = "";
    private StringBuilder formattingTemplate = new StringBuilder();
    private String currentFormattingPattern = "";
    private StringBuilder accruedInput = new StringBuilder();
    private StringBuilder accruedInputWithoutFormatting = new StringBuilder();
    private boolean ableToFormat = true;
    private boolean inputHasFormatting = false;
    private boolean isCompleteNumber = false;
    private boolean isExpectingCountryCallingCode = false;
    private final PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
    private int lastMatchPosition = 0;
    private int originalPosition = 0;
    private int positionToRemember = 0;
    private StringBuilder prefixBeforeNationalNumber = new StringBuilder();
    private boolean shouldAddSpaceAfterNationalPrefix = false;
    private String extractedNationalPrefix = "";
    private StringBuilder nationalNumber = new StringBuilder();
    private List<Phonemetadata.NumberFormat> possibleFormats = new ArrayList();
    private RegexCache regexCache = new RegexCache(64);

    public AsYouTypeFormatter(String str) {
        this.defaultCountry = str;
        Phonemetadata.PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        this.currentMetadata = metadataForRegion;
        this.defaultMetadata = metadataForRegion;
    }

    private boolean ableToExtractLongerNdd() {
        if (this.extractedNationalPrefix.length() > 0) {
            this.nationalNumber.insert(0, this.extractedNationalPrefix);
            this.prefixBeforeNationalNumber.setLength(this.prefixBeforeNationalNumber.lastIndexOf(this.extractedNationalPrefix));
        }
        return !this.extractedNationalPrefix.equals(removeNationalPrefixFromNationalNumber());
    }

    private String appendNationalNumber(String str) {
        int length = this.prefixBeforeNationalNumber.length();
        if (!this.shouldAddSpaceAfterNationalPrefix || length <= 0 || this.prefixBeforeNationalNumber.charAt(length - 1) == ' ') {
            return ((Object) this.prefixBeforeNationalNumber) + str;
        }
        return new String(this.prefixBeforeNationalNumber) + SEPARATOR_BEFORE_NATIONAL_NUMBER + str;
    }

    private String attemptToChooseFormattingPattern() {
        int length = this.nationalNumber.length();
        StringBuilder sb3 = this.nationalNumber;
        if (length < 3) {
            return appendNationalNumber(sb3.toString());
        }
        getAvailableFormats(sb3.toString());
        String strAttemptToFormatAccruedDigits = attemptToFormatAccruedDigits();
        if (strAttemptToFormatAccruedDigits.length() > 0) {
            return strAttemptToFormatAccruedDigits;
        }
        return maybeCreateNewTemplate() ? inputAccruedNationalNumber() : this.accruedInput.toString();
    }

    private String attemptToChoosePatternWithPrefixExtracted() {
        this.ableToFormat = true;
        this.isExpectingCountryCallingCode = false;
        this.possibleFormats.clear();
        this.lastMatchPosition = 0;
        this.formattingTemplate.setLength(0);
        this.currentFormattingPattern = "";
        return attemptToChooseFormattingPattern();
    }

    private boolean attemptToExtractCountryCallingCode() {
        StringBuilder sb3;
        int iExtractCountryCode;
        if (this.nationalNumber.length() == 0 || (iExtractCountryCode = this.phoneUtil.extractCountryCode(this.nationalNumber, (sb3 = new StringBuilder()))) == 0) {
            return false;
        }
        this.nationalNumber.setLength(0);
        this.nationalNumber.append((CharSequence) sb3);
        String regionCodeForCountryCode = this.phoneUtil.getRegionCodeForCountryCode(iExtractCountryCode);
        if ("001".equals(regionCodeForCountryCode)) {
            this.currentMetadata = this.phoneUtil.getMetadataForNonGeographicalRegion(iExtractCountryCode);
        } else if (!regionCodeForCountryCode.equals(this.defaultCountry)) {
            this.currentMetadata = getMetadataForRegion(regionCodeForCountryCode);
        }
        String string = Integer.toString(iExtractCountryCode);
        StringBuilder sb4 = this.prefixBeforeNationalNumber;
        sb4.append(string);
        sb4.append(SEPARATOR_BEFORE_NATIONAL_NUMBER);
        this.extractedNationalPrefix = "";
        return true;
    }

    private boolean attemptToExtractIdd() {
        Matcher matcher = this.regexCache.getPatternForRegex("\\+|" + this.currentMetadata.getInternationalPrefix()).matcher(this.accruedInputWithoutFormatting);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.isCompleteNumber = true;
        int iEnd = matcher.end();
        this.nationalNumber.setLength(0);
        this.nationalNumber.append(this.accruedInputWithoutFormatting.substring(iEnd));
        this.prefixBeforeNationalNumber.setLength(0);
        this.prefixBeforeNationalNumber.append(this.accruedInputWithoutFormatting.substring(0, iEnd));
        if (this.accruedInputWithoutFormatting.charAt(0) != '+') {
            this.prefixBeforeNationalNumber.append(SEPARATOR_BEFORE_NATIONAL_NUMBER);
        }
        return true;
    }

    private boolean createFormattingTemplate(Phonemetadata.NumberFormat numberFormat) {
        String pattern = numberFormat.getPattern();
        this.formattingTemplate.setLength(0);
        String formattingTemplate = getFormattingTemplate(pattern, numberFormat.getFormat());
        if (formattingTemplate.length() <= 0) {
            return false;
        }
        this.formattingTemplate.append(formattingTemplate);
        return true;
    }

    private void getAvailableFormats(String str) {
        for (Phonemetadata.NumberFormat numberFormat : (this.isCompleteNumber && this.extractedNationalPrefix.length() == 0 && this.currentMetadata.getIntlNumberFormatCount() > 0) ? this.currentMetadata.getIntlNumberFormatList() : this.currentMetadata.getNumberFormatList()) {
            if (this.extractedNationalPrefix.length() <= 0 || !PhoneNumberUtil.formattingRuleHasFirstGroupOnly(numberFormat.getNationalPrefixFormattingRule()) || numberFormat.getNationalPrefixOptionalWhenFormatting() || numberFormat.hasDomesticCarrierCodeFormattingRule()) {
                if (this.extractedNationalPrefix.length() != 0 || this.isCompleteNumber || PhoneNumberUtil.formattingRuleHasFirstGroupOnly(numberFormat.getNationalPrefixFormattingRule()) || numberFormat.getNationalPrefixOptionalWhenFormatting()) {
                    if (ELIGIBLE_FORMAT_PATTERN.matcher(numberFormat.getFormat()).matches()) {
                        this.possibleFormats.add(numberFormat);
                    }
                }
            }
        }
        narrowDownPossibleFormats(str);
    }

    private String getFormattingTemplate(String str, String str2) {
        Matcher matcher = this.regexCache.getPatternForRegex(str).matcher("999999999999999");
        matcher.find();
        String strGroup = matcher.group();
        return strGroup.length() < this.nationalNumber.length() ? "" : strGroup.replaceAll(str, str2).replaceAll("9", DIGIT_PLACEHOLDER);
    }

    private Phonemetadata.PhoneMetadata getMetadataForRegion(String str) {
        Phonemetadata.PhoneMetadata metadataForRegion = this.phoneUtil.getMetadataForRegion(this.phoneUtil.getRegionCodeForCountryCode(this.phoneUtil.getCountryCodeForRegion(str)));
        return metadataForRegion != null ? metadataForRegion : EMPTY_METADATA;
    }

    private String inputAccruedNationalNumber() {
        int length = this.nationalNumber.length();
        if (length <= 0) {
            return this.prefixBeforeNationalNumber.toString();
        }
        String strInputDigitHelper = "";
        for (int i14 = 0; i14 < length; i14++) {
            strInputDigitHelper = inputDigitHelper(this.nationalNumber.charAt(i14));
        }
        return this.ableToFormat ? appendNationalNumber(strInputDigitHelper) : this.accruedInput.toString();
    }

    private String inputDigitHelper(char c14) {
        Matcher matcher = DIGIT_PATTERN.matcher(this.formattingTemplate);
        if (!matcher.find(this.lastMatchPosition)) {
            if (this.possibleFormats.size() == 1) {
                this.ableToFormat = false;
            }
            this.currentFormattingPattern = "";
            return this.accruedInput.toString();
        }
        String strReplaceFirst = matcher.replaceFirst(Character.toString(c14));
        this.formattingTemplate.replace(0, strReplaceFirst.length(), strReplaceFirst);
        int iStart = matcher.start();
        this.lastMatchPosition = iStart;
        return this.formattingTemplate.substring(0, iStart + 1);
    }

    private String inputDigitWithOptionToRememberPosition(char c14, boolean z14) {
        this.accruedInput.append(c14);
        if (z14) {
            this.originalPosition = this.accruedInput.length();
        }
        if (isDigitOrLeadingPlusSign(c14)) {
            c14 = normalizeAndAccrueDigitsAndPlusSign(c14, z14);
        } else {
            this.ableToFormat = false;
            this.inputHasFormatting = true;
        }
        if (!this.ableToFormat) {
            if (this.inputHasFormatting) {
                return this.accruedInput.toString();
            }
            if (attemptToExtractIdd()) {
                if (attemptToExtractCountryCallingCode()) {
                    return attemptToChoosePatternWithPrefixExtracted();
                }
            } else if (ableToExtractLongerNdd()) {
                this.prefixBeforeNationalNumber.append(SEPARATOR_BEFORE_NATIONAL_NUMBER);
                return attemptToChoosePatternWithPrefixExtracted();
            }
            return this.accruedInput.toString();
        }
        int length = this.accruedInputWithoutFormatting.length();
        if (length == 0 || length == 1 || length == 2) {
            return this.accruedInput.toString();
        }
        if (length == 3) {
            if (!attemptToExtractIdd()) {
                this.extractedNationalPrefix = removeNationalPrefixFromNationalNumber();
                return attemptToChooseFormattingPattern();
            }
            this.isExpectingCountryCallingCode = true;
        }
        if (this.isExpectingCountryCallingCode) {
            if (attemptToExtractCountryCallingCode()) {
                this.isExpectingCountryCallingCode = false;
            }
            return ((Object) this.prefixBeforeNationalNumber) + this.nationalNumber.toString();
        }
        if (this.possibleFormats.size() <= 0) {
            return attemptToChooseFormattingPattern();
        }
        String strInputDigitHelper = inputDigitHelper(c14);
        String strAttemptToFormatAccruedDigits = attemptToFormatAccruedDigits();
        if (strAttemptToFormatAccruedDigits.length() > 0) {
            return strAttemptToFormatAccruedDigits;
        }
        narrowDownPossibleFormats(this.nationalNumber.toString());
        if (maybeCreateNewTemplate()) {
            return inputAccruedNationalNumber();
        }
        return this.ableToFormat ? appendNationalNumber(strInputDigitHelper) : this.accruedInput.toString();
    }

    private boolean isDigitOrLeadingPlusSign(char c14) {
        return Character.isDigit(c14) || (this.accruedInput.length() == 1 && PhoneNumberUtil.PLUS_CHARS_PATTERN.matcher(Character.toString(c14)).matches());
    }

    private boolean isNanpaNumberWithNationalPrefix() {
        return this.currentMetadata.getCountryCode() == 1 && this.nationalNumber.charAt(0) == '1' && this.nationalNumber.charAt(1) != '0' && this.nationalNumber.charAt(1) != '1';
    }

    private boolean maybeCreateNewTemplate() {
        Iterator<Phonemetadata.NumberFormat> it = this.possibleFormats.iterator();
        while (it.hasNext()) {
            Phonemetadata.NumberFormat next = it.next();
            String pattern = next.getPattern();
            if (this.currentFormattingPattern.equals(pattern)) {
                return false;
            }
            if (createFormattingTemplate(next)) {
                this.currentFormattingPattern = pattern;
                this.shouldAddSpaceAfterNationalPrefix = NATIONAL_PREFIX_SEPARATORS_PATTERN.matcher(next.getNationalPrefixFormattingRule()).find();
                this.lastMatchPosition = 0;
                return true;
            }
            it.remove();
        }
        this.ableToFormat = false;
        return false;
    }

    private void narrowDownPossibleFormats(String str) {
        int length = str.length() - 3;
        Iterator<Phonemetadata.NumberFormat> it = this.possibleFormats.iterator();
        while (it.hasNext()) {
            Phonemetadata.NumberFormat next = it.next();
            if (next.getLeadingDigitsPatternCount() != 0) {
                if (!this.regexCache.getPatternForRegex(next.getLeadingDigitsPattern(Math.min(length, next.getLeadingDigitsPatternCount() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    private char normalizeAndAccrueDigitsAndPlusSign(char c14, boolean z14) {
        if (c14 == '+') {
            this.accruedInputWithoutFormatting.append(c14);
        } else {
            c14 = Character.forDigit(Character.digit(c14, 10), 10);
            this.accruedInputWithoutFormatting.append(c14);
            this.nationalNumber.append(c14);
        }
        if (z14) {
            this.positionToRemember = this.accruedInputWithoutFormatting.length();
        }
        return c14;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004f  */
    private String removeNationalPrefixFromNationalNumber() {
        int iEnd = 1;
        if (isNanpaNumberWithNationalPrefix()) {
            StringBuilder sb3 = this.prefixBeforeNationalNumber;
            sb3.append('1');
            sb3.append(SEPARATOR_BEFORE_NATIONAL_NUMBER);
            this.isCompleteNumber = true;
        } else if (this.currentMetadata.hasNationalPrefixForParsing()) {
            Matcher matcher = this.regexCache.getPatternForRegex(this.currentMetadata.getNationalPrefixForParsing()).matcher(this.nationalNumber);
            if (!matcher.lookingAt() || matcher.end() <= 0) {
                iEnd = 0;
            } else {
                this.isCompleteNumber = true;
                iEnd = matcher.end();
                this.prefixBeforeNationalNumber.append(this.nationalNumber.substring(0, iEnd));
            }
        } else {
            iEnd = 0;
        }
        String strSubstring = this.nationalNumber.substring(0, iEnd);
        this.nationalNumber.delete(0, iEnd);
        return strSubstring;
    }

    public String attemptToFormatAccruedDigits() {
        for (Phonemetadata.NumberFormat numberFormat : this.possibleFormats) {
            Matcher matcher = this.regexCache.getPatternForRegex(numberFormat.getPattern()).matcher(this.nationalNumber);
            if (matcher.matches()) {
                this.shouldAddSpaceAfterNationalPrefix = NATIONAL_PREFIX_SEPARATORS_PATTERN.matcher(numberFormat.getNationalPrefixFormattingRule()).find();
                String strAppendNationalNumber = appendNationalNumber(matcher.replaceAll(numberFormat.getFormat()));
                if (PhoneNumberUtil.normalizeDiallableCharsOnly(strAppendNationalNumber).contentEquals(this.accruedInputWithoutFormatting)) {
                    return strAppendNationalNumber;
                }
            }
        }
        return "";
    }

    public void clear() {
        this.currentOutput = "";
        this.accruedInput.setLength(0);
        this.accruedInputWithoutFormatting.setLength(0);
        this.formattingTemplate.setLength(0);
        this.lastMatchPosition = 0;
        this.currentFormattingPattern = "";
        this.prefixBeforeNationalNumber.setLength(0);
        this.extractedNationalPrefix = "";
        this.nationalNumber.setLength(0);
        this.ableToFormat = true;
        this.inputHasFormatting = false;
        this.positionToRemember = 0;
        this.originalPosition = 0;
        this.isCompleteNumber = false;
        this.isExpectingCountryCallingCode = false;
        this.possibleFormats.clear();
        this.shouldAddSpaceAfterNationalPrefix = false;
        if (this.currentMetadata.equals(this.defaultMetadata)) {
            return;
        }
        this.currentMetadata = getMetadataForRegion(this.defaultCountry);
    }

    public String getExtractedNationalPrefix() {
        return this.extractedNationalPrefix;
    }

    public int getRememberedPosition() {
        if (!this.ableToFormat) {
            return this.originalPosition;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.positionToRemember && i15 < this.currentOutput.length()) {
            if (this.accruedInputWithoutFormatting.charAt(i14) == this.currentOutput.charAt(i15)) {
                i14++;
            }
            i15++;
        }
        return i15;
    }

    public String inputDigit(char c14) {
        String strInputDigitWithOptionToRememberPosition = inputDigitWithOptionToRememberPosition(c14, false);
        this.currentOutput = strInputDigitWithOptionToRememberPosition;
        return strInputDigitWithOptionToRememberPosition;
    }

    public String inputDigitAndRememberPosition(char c14) {
        String strInputDigitWithOptionToRememberPosition = inputDigitWithOptionToRememberPosition(c14, true);
        this.currentOutput = strInputDigitWithOptionToRememberPosition;
        return strInputDigitWithOptionToRememberPosition;
    }
}
