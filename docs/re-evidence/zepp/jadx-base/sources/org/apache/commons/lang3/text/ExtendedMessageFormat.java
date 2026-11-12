package org.apache.commons.lang3.text;

import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public class ExtendedMessageFormat extends MessageFormat {
    private static final int c = 31;
    private static final String d = "";
    private static final char e = ',';
    private static final char f = '}';
    private static final char g = '{';
    private static final char h = '\'';
    public static final /* synthetic */ boolean i = false;
    private static final long serialVersionUID = -2362048321261811743L;
    private String a;
    private final Map<String, ? extends FormatFactory> b;

    public ExtendedMessageFormat(String str) {
        this(str, Locale.getDefault());
    }

    private StringBuilder a(String str, ParsePosition parsePosition, StringBuilder sb) {
        if (sb != null) {
            sb.append(h);
        }
        g(parsePosition);
        int index = parsePosition.getIndex();
        char[] charArray = str.toCharArray();
        for (int index2 = parsePosition.getIndex(); index2 < str.length(); index2++) {
            if (charArray[parsePosition.getIndex()] == '\'') {
                g(parsePosition);
                if (sb == null) {
                    return null;
                }
                sb.append(charArray, index, parsePosition.getIndex() - index);
                return sb;
            }
            g(parsePosition);
        }
        throw new IllegalArgumentException("Unterminated quoted string at position " + index);
    }

    private boolean b(Collection<?> collection) {
        if (collection != null && !collection.isEmpty()) {
            Iterator<?> it2 = collection.iterator();
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
            FormatFactory formatFactory = this.b.get(str);
            if (formatFactory != null) {
                return formatFactory.getFormat(str, strTrim, getLocale());
            }
        }
        return null;
    }

    private void e(String str, ParsePosition parsePosition) {
        a(str, parsePosition, null);
    }

    private String f(String str, ArrayList<String> arrayList) {
        String str2;
        if (!b(arrayList)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() * 2);
        int i2 = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        int i3 = -1;
        while (parsePosition.getIndex() < str.length()) {
            char cCharAt = str.charAt(parsePosition.getIndex());
            if (cCharAt == '\'') {
                a(str, parsePosition, sb);
            } else if (cCharAt != '{') {
                if (cCharAt == '}') {
                    i2--;
                }
                sb.append(cCharAt);
                g(parsePosition);
            } else {
                i2++;
                sb.append('{');
                sb.append(i(str, g(parsePosition)));
                if (i2 == 1 && (str2 = arrayList.get((i3 = i3 + 1))) != null) {
                    sb.append(',');
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
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
                e(str, parsePosition);
            } else if (cCharAt == '{') {
                i2++;
            } else if (cCharAt == '}' && (i2 = i2 - 1) == 0) {
                return str.substring(index2, parsePosition.getIndex());
            }
            g(parsePosition);
        }
        throw new IllegalArgumentException("Unterminated format element at position " + index);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d A[PHI: r2
      0x003d: PHI (r2v5 char) = (r2v4 char), (r2v9 char), (r2v9 char) binds: [B:7:0x002a, B:9:0x0037, B:10:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    private int i(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        j(str, parsePosition);
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (!z && parsePosition.getIndex() < str.length()) {
            char cCharAt = str.charAt(parsePosition.getIndex());
            if (Character.isWhitespace(cCharAt)) {
                j(str, parsePosition);
                cCharAt = str.charAt(parsePosition.getIndex());
                if (cCharAt == ',' || cCharAt == '}') {
                    if ((cCharAt != ',' || cCharAt == '}') && sb.length() > 0) {
                    }
                    boolean z2 = !Character.isDigit(cCharAt);
                    sb.append(cCharAt);
                    z = z2;
                } else {
                    z = true;
                }
            } else {
                return cCharAt != ',' ? Integer.parseInt(sb.toString()) : Integer.parseInt(sb.toString());
                boolean z3 = !Character.isDigit(cCharAt);
                sb.append(cCharAt);
                z = z3;
            }
            g(parsePosition);
        }
        if (!z) {
            throw new IllegalArgumentException("Unterminated format element at position " + index);
        }
        throw new IllegalArgumentException("Invalid format argument index at position " + index + ": " + str.substring(index, parsePosition.getIndex()));
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
        ArrayList<String> arrayList2 = new ArrayList<>();
        StringBuilder sb = new StringBuilder(str.length());
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
                    int i4 = i(str, g(parsePosition));
                    sb.append('{');
                    sb.append(i4);
                    j(str, parsePosition);
                    if (charArray[parsePosition.getIndex()] == ',') {
                        strH = h(str, g(parsePosition));
                        formatC = c(strH);
                        if (formatC == null) {
                            sb.append(',');
                            sb.append(strH);
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
                        throw new IllegalArgumentException("Unreadable format element at position " + index);
                    }
                }
                sb.append(charArray[parsePosition.getIndex()]);
                g(parsePosition);
            } else {
                a(str, parsePosition, sb);
            }
        }
        super.applyPattern(sb.toString());
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
        if (ObjectUtils.notEqual(this.a, extendedMessageFormat.a)) {
            return false;
        }
        return !ObjectUtils.notEqual(this.b, extendedMessageFormat.b);
    }

    @Override // java.text.MessageFormat
    public int hashCode() {
        return (((super.hashCode() * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.a);
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

    public ExtendedMessageFormat(String str, Map<String, ? extends FormatFactory> map) {
        this(str, Locale.getDefault(), map);
    }

    public ExtendedMessageFormat(String str, Locale locale, Map<String, ? extends FormatFactory> map) {
        super("");
        setLocale(locale);
        this.b = map;
        applyPattern(str);
    }
}
