package org.threeten.bp.format;

import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.jdk8.Jdk8Methods;

/* JADX INFO: loaded from: classes23.dex */
public final class DecimalStyle {
    public static final DecimalStyle STANDARD = new DecimalStyle('0', '+', '-', '.');
    private static final ConcurrentMap<Locale, DecimalStyle> e = new ConcurrentHashMap(16, 0.75f, 2);
    private final char a;
    private final char b;
    private final char c;
    private final char d;

    private DecimalStyle(char c, char c2, char c3, char c4) {
        this.a = c;
        this.b = c2;
        this.c = c3;
        this.d = c4;
    }

    private static DecimalStyle c(Locale locale) {
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
        char zeroDigit = decimalFormatSymbols.getZeroDigit();
        char minusSign = decimalFormatSymbols.getMinusSign();
        char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
        return (zeroDigit == '0' && minusSign == '-' && decimalSeparator == '.') ? STANDARD : new DecimalStyle(zeroDigit, '+', minusSign, decimalSeparator);
    }

    public static Set<Locale> getAvailableLocales() {
        return new HashSet(Arrays.asList(DecimalFormatSymbols.getAvailableLocales()));
    }

    public static DecimalStyle of(Locale locale) {
        Jdk8Methods.requireNonNull(locale, "locale");
        ConcurrentMap<Locale, DecimalStyle> concurrentMap = e;
        DecimalStyle decimalStyle = concurrentMap.get(locale);
        if (decimalStyle != null) {
            return decimalStyle;
        }
        concurrentMap.putIfAbsent(locale, c(locale));
        return concurrentMap.get(locale);
    }

    public static DecimalStyle ofDefaultLocale() {
        return of(Locale.getDefault());
    }

    public String a(String str) {
        char c = this.a;
        if (c == '0') {
            return str;
        }
        int i = c - '0';
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            charArray[i2] = (char) (charArray[i2] + i);
        }
        return new String(charArray);
    }

    public int b(char c) {
        int i = c - this.a;
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecimalStyle)) {
            return false;
        }
        DecimalStyle decimalStyle = (DecimalStyle) obj;
        return this.a == decimalStyle.a && this.b == decimalStyle.b && this.c == decimalStyle.c && this.d == decimalStyle.d;
    }

    public char getDecimalSeparator() {
        return this.d;
    }

    public char getNegativeSign() {
        return this.c;
    }

    public char getPositiveSign() {
        return this.b;
    }

    public char getZeroDigit() {
        return this.a;
    }

    public int hashCode() {
        return this.a + this.b + this.c + this.d;
    }

    public String toString() {
        return "DecimalStyle[" + this.a + this.b + this.c + this.d + "]";
    }

    public DecimalStyle withDecimalSeparator(char c) {
        return c == this.d ? this : new DecimalStyle(this.a, this.b, this.c, c);
    }

    public DecimalStyle withNegativeSign(char c) {
        return c == this.c ? this : new DecimalStyle(this.a, this.b, c, this.d);
    }

    public DecimalStyle withPositiveSign(char c) {
        return c == this.b ? this : new DecimalStyle(this.a, c, this.c, this.d);
    }

    public DecimalStyle withZeroDigit(char c) {
        return c == this.a ? this : new DecimalStyle(c, this.b, this.c, this.d);
    }
}
