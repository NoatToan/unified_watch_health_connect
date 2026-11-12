package com.google.i18n.phonenumbers;

import java.util.Iterator;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Iterator<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f9452a;
    public static final Pattern f;
    public static final Pattern h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f9453b = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    public static final Pattern c = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    public static final Pattern d = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");
    public static final Pattern e = Pattern.compile(":[0-5]\\d");
    public static final Pattern[] g = {Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[‒-―－]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")};

    static {
        String str = "[^(\\[（［)\\]）］]";
        f = Pattern.compile("(?:[(\\[（［])?(?:" + str + "+[)\\]）］])?" + str + "+(?:[(\\[（［]" + str + "+[)\\]）］])" + d(0, 3) + str + Marker.ANY_MARKER);
        String strD = d(0, 2);
        String strD2 = d(0, 4);
        String strD3 = d(0, 20);
        String str2 = "[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]" + strD2;
        String str3 = "\\p{Nd}" + d(1, 20);
        String str4 = "[" + ("(\\[（［+＋") + "]";
        h = Pattern.compile(str4);
        f9452a = Pattern.compile("(?:" + str4 + str2 + ")" + strD + str3 + "(?:" + str2 + str3 + ")" + strD3 + "(?:" + PhoneNumberUtil.A + ")?", 66);
    }

    public static boolean a(Phonenumber$PhoneNumber phonenumber$PhoneNumber, String str) {
        int iIndexOf;
        int iIndexOf2 = str.indexOf(47);
        if (iIndexOf2 < 0 || (iIndexOf = str.indexOf(47, iIndexOf2 + 1)) < 0) {
            return false;
        }
        if ((phonenumber$PhoneNumber.getCountryCodeSource() == Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN || phonenumber$PhoneNumber.getCountryCodeSource() == Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN) && PhoneNumberUtil.O(str.substring(0, iIndexOf2)).equals(Integer.toString(phonenumber$PhoneNumber.getCountryCode()))) {
            return str.substring(iIndexOf + 1).contains("/");
        }
        return true;
    }

    public static boolean b(Phonenumber$PhoneNumber phonenumber$PhoneNumber, String str, PhoneNumberUtil phoneNumberUtil) {
        int i = 0;
        while (i < str.length() - 1) {
            char cCharAt = str.charAt(i);
            if (cCharAt == 'x' || cCharAt == 'X') {
                int i2 = i + 1;
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 == 'x' || cCharAt2 == 'X') {
                    if (phoneNumberUtil.z(phonenumber$PhoneNumber, str.substring(i2)) != PhoneNumberUtil.MatchType.NSN_MATCH) {
                        return false;
                    }
                    i = i2;
                } else if (!PhoneNumberUtil.O(str.substring(i)).equals(phonenumber$PhoneNumber.getExtension())) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }

    public static boolean c(Phonenumber$PhoneNumber phonenumber$PhoneNumber, PhoneNumberUtil phoneNumberUtil) {
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadataO;
        if (phonenumber$PhoneNumber.getCountryCodeSource() != Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY || (phonemetadata$PhoneMetadataO = phoneNumberUtil.o(phoneNumberUtil.t(phonenumber$PhoneNumber.getCountryCode()))) == null) {
            return true;
        }
        Phonemetadata$NumberFormat phonemetadata$NumberFormatC = phoneNumberUtil.c(phonemetadata$PhoneMetadataO.getNumberFormatList(), phoneNumberUtil.q(phonenumber$PhoneNumber));
        if (phonemetadata$NumberFormatC == null || phonemetadata$NumberFormatC.getNationalPrefixFormattingRule().length() <= 0 || phonemetadata$NumberFormatC.getNationalPrefixOptionalWhenFormatting() || PhoneNumberUtil.k(phonemetadata$NumberFormatC.getNationalPrefixFormattingRule())) {
            return true;
        }
        return phoneNumberUtil.L(new StringBuilder(PhoneNumberUtil.O(phonenumber$PhoneNumber.getRawInput())), phonemetadata$PhoneMetadataO, null);
    }

    public static String d(int i, int i2) {
        if (i < 0 || i2 <= 0 || i2 < i) {
            throw new IllegalArgumentException();
        }
        return "{" + i + "," + i2 + "}";
    }
}
