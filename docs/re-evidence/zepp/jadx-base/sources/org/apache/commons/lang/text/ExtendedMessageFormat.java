package org.apache.commons.lang.text;

import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.Validate;

/* JADX INFO: loaded from: classes23.dex */
public class ExtendedMessageFormat extends MessageFormat {
    private static final int c = 31;
    private static final String d = "";
    private static final String e = "''";
    private static final char f = ',';
    private static final char g = '}';
    private static final char h = '{';
    private static final char i = '\'';
    private static final long serialVersionUID = -2362048321261811743L;
    private String a;
    private final Map b;

    public ExtendedMessageFormat(String str) {
        this(str, Locale.getDefault());
    }

    private StrBuilder a(String str, ParsePosition parsePosition, StrBuilder strBuilder, boolean z) {
        int index = parsePosition.getIndex();
        char[] charArray = str.toCharArray();
        if (z && charArray[index] == '\'') {
            g(parsePosition);
            if (strBuilder == null) {
                return null;
            }
            return strBuilder.append(i);
        }
        int index2 = index;
        for (int index3 = parsePosition.getIndex(); index3 < str.length(); index3++) {
            if (z && str.substring(index3).startsWith(e)) {
                strBuilder.append(charArray, index2, parsePosition.getIndex() - index2).append(i);
                parsePosition.setIndex(index3 + 2);
                index2 = parsePosition.getIndex();
            } else {
                if (charArray[parsePosition.getIndex()] == '\'') {
                    g(parsePosition);
                    if (strBuilder == null) {
                        return null;
                    }
                    return strBuilder.append(charArray, index2, parsePosition.getIndex() - index2);
                }
                g(parsePosition);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unterminated quoted string at position ");
        stringBuffer.append(index);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    private boolean b(Collection collection) {
        if (collection != null && collection.size() != 0) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (it2.next() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    private Format c(String str) {
        String strTrim;
        if (this.b != null) {
            int iIndexOf = str.indexOf(44);
            if (iIndexOf > 0) {
                String strTrim2 = str.substring(0, iIndexOf).trim();
                strTrim = str.substring(iIndexOf + 1).trim();
                str = strTrim2;
            } else {
                strTrim = null;
            }
            FormatFactory formatFactory = (FormatFactory) this.b.get(str);
            if (formatFactory != null) {
                return formatFactory.getFormat(str, strTrim, getLocale());
            }
        }
        return null;
    }

    private void e(String str, ParsePosition parsePosition, boolean z) {
        a(str, parsePosition, null, z);
    }

    private String f(String str, ArrayList arrayList) {
        if (!b(arrayList)) {
            return str;
        }
        StrBuilder strBuilder = new StrBuilder(str.length() * 2);
        ParsePosition parsePosition = new ParsePosition(0);
        int i2 = -1;
        int i3 = 0;
        while (parsePosition.getIndex() < str.length()) {
            char cCharAt = str.charAt(parsePosition.getIndex());
            if (cCharAt == '\'') {
                a(str, parsePosition, strBuilder, false);
            } else if (cCharAt != '{') {
                if (cCharAt == '}') {
                    i3--;
                }
                strBuilder.append(cCharAt);
                g(parsePosition);
            } else {
                i3++;
                if (i3 == 1) {
                    i2++;
                    strBuilder.append('{').append(i(str, g(parsePosition)));
                    String str2 = (String) arrayList.get(i2);
                    if (str2 != null) {
                        strBuilder.append(',').append(str2);
                    }
                }
            }
        }
        return strBuilder.toString();
    }

    private ParsePosition g(ParsePosition parsePosition) {
        parsePosition.setIndex(parsePosition.getIndex() + 1);
        return parsePosition;
    }

    private String h(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        j(str, parsePosition);
        int index2 = parsePosition.getIndex();
        int i2 = 1;
        while (parsePosition.getIndex() < str.length()) {
            char cCharAt = str.charAt(parsePosition.getIndex());
            if (cCharAt == '\'') {
                e(str, parsePosition, false);
            } else if (cCharAt == '{') {
                i2++;
            } else if (cCharAt == '}' && (i2 = i2 - 1) == 0) {
                return str.substring(index2, parsePosition.getIndex());
            }
            g(parsePosition);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unterminated format element at position ");
        stringBuffer.append(index);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d A[PHI: r2
      0x003d: PHI (r2v5 char) = (r2v4 char), (r2v9 char), (r2v9 char) binds: [B:7:0x002a, B:9:0x0037, B:10:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    private int i(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        j(str, parsePosition);
        StrBuilder strBuilder = new StrBuilder();
        boolean z = false;
        while (!z && parsePosition.getIndex() < str.length()) {
            char cCharAt = str.charAt(parsePosition.getIndex());
            if (Character.isWhitespace(cCharAt)) {
                j(str, parsePosition);
                cCharAt = str.charAt(parsePosition.getIndex());
                if (cCharAt == ',' || cCharAt == '}') {
                    if ((cCharAt != ',' || cCharAt == '}') && strBuilder.length() > 0) {
                    }
                    boolean z2 = !Character.isDigit(cCharAt);
                    strBuilder.append(cCharAt);
                    z = z2;
                } else {
                    z = true;
                }
            } else {
                return cCharAt != ',' ? Integer.parseInt(strBuilder.toString()) : Integer.parseInt(strBuilder.toString());
                boolean z3 = !Character.isDigit(cCharAt);
                strBuilder.append(cCharAt);
                z = z3;
            }
            g(parsePosition);
        }
        if (!z) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unterminated format element at position ");
            stringBuffer.append(index);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Invalid format argument index at position ");
        stringBuffer2.append(index);
        stringBuffer2.append(": ");
        stringBuffer2.append(str.substring(index, parsePosition.getIndex()));
        throw new IllegalArgumentException(stringBuffer2.toString());
    }

    private void j(String str, ParsePosition parsePosition) {
        char[] charArray = str.toCharArray();
        do {
            int iIsMatch = StrMatcher.splitMatcher().isMatch(charArray, parsePosition.getIndex());
            parsePosition.setIndex(parsePosition.getIndex() + iIsMatch);
            if (iIsMatch <= 0) {
                return;
            }
        } while (parsePosition.getIndex() < str.length());
    }

    @Override // java.text.MessageFormat
    public final void applyPattern(String str) {
        String strH;
        Format formatC;
        if (this.b == null) {
            super.applyPattern(str);
            this.a = super.toPattern();
            return;
        }
        ArrayList<Format> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        StrBuilder strBuilder = new StrBuilder(str.length());
        int i2 = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        char[] charArray = str.toCharArray();
        int i3 = 0;
        while (parsePosition.getIndex() < str.length()) {
            char c2 = charArray[parsePosition.getIndex()];
            if (c2 != '\'') {
                if (c2 == '{') {
                    i3++;
                    j(str, parsePosition);
                    int index = parsePosition.getIndex();
                    strBuilder.append('{').append(i(str, g(parsePosition)));
                    j(str, parsePosition);
                    if (charArray[parsePosition.getIndex()] == ',') {
                        strH = h(str, g(parsePosition));
                        formatC = c(strH);
                        if (formatC == null) {
                            strBuilder.append(',').append(strH);
                        }
                    } else {
                        strH = null;
                        formatC = null;
                    }
                    arrayList.add(formatC);
                    arrayList2.add(formatC != null ? strH : null);
                    Validate.isTrue(arrayList.size() == i3);
                    Validate.isTrue(arrayList2.size() == i3);
                    if (charArray[parsePosition.getIndex()] != '}') {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Unreadable format element at position ");
                        stringBuffer.append(index);
                        throw new IllegalArgumentException(stringBuffer.toString());
                    }
                }
                strBuilder.append(charArray[parsePosition.getIndex()]);
                g(parsePosition);
            } else {
                a(str, parsePosition, strBuilder, true);
            }
        }
        super.applyPattern(strBuilder.toString());
        this.a = f(super.toPattern(), arrayList2);
        if (b(arrayList)) {
            Format[] formats = getFormats();
            for (Format format : arrayList) {
                if (format != null) {
                    formats[i2] = format;
                }
                i2++;
            }
            super.setFormats(formats);
        }
    }

    @Override // java.text.MessageFormat
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !super.equals(obj) || ObjectUtils.notEqual(getClass(), obj.getClass())) {
            return false;
        }
        ExtendedMessageFormat extendedMessageFormat = (ExtendedMessageFormat) obj;
        return (ObjectUtils.notEqual(this.a, extendedMessageFormat.a) || ObjectUtils.notEqual(this.b, extendedMessageFormat.b)) ? false : true;
    }

    @Override // java.text.MessageFormat
    public int hashCode() {
        return (((super.hashCode() * 31) + ObjectUtils.hashCode(this.b)) * 31) + ObjectUtils.hashCode(this.a);
    }

    @Override // java.text.MessageFormat
    public void setFormat(int i2, Format format) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormatByArgumentIndex(int i2, Format format) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormats(Format[] formatArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormatsByArgumentIndex(Format[] formatArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public String toPattern() {
        return this.a;
    }

    public ExtendedMessageFormat(String str, Locale locale) {
        this(str, locale, null);
    }

    public ExtendedMessageFormat(String str, Map map) {
        this(str, Locale.getDefault(), map);
    }

    public ExtendedMessageFormat(String str, Locale locale, Map map) {
        super("");
        setLocale(locale);
        this.b = map;
        applyPattern(str);
    }
}
