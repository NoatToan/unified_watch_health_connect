package org.apache.commons.text;

import am.j;
import b71.i;
import com.nimbusds.jose.shaded.gson.internal.a;
import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.text.matcher.StringMatcherFactory;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class ExtendedMessageFormat extends MessageFormat {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String DUMMY_PATTERN = "";
    private static final char END_FE = '}';
    private static final int HASH_SEED = 31;
    private static final char QUOTE = '\'';
    private static final char START_FE = '{';
    private static final char START_FMT = ',';
    private static final long serialVersionUID = -2362048321261811743L;
    private final Map<String, ? extends FormatFactory> registry;
    private String toPattern;

    public ExtendedMessageFormat(String str, Locale locale, Map<String, ? extends FormatFactory> map) {
        super("");
        setLocale(locale);
        this.registry = map;
        applyPattern(str);
    }

    private StringBuilder appendQuotedString(String str, ParsePosition parsePosition, StringBuilder sb3) {
        if (sb3 != null) {
            sb3.append('\'');
        }
        next(parsePosition);
        int index = parsePosition.getIndex();
        char[] charArray = str.toCharArray();
        for (int index2 = parsePosition.getIndex(); index2 < str.length(); index2++) {
            if (charArray[parsePosition.getIndex()] == '\'') {
                next(parsePosition);
                if (sb3 == null) {
                    return null;
                }
                sb3.append(charArray, index, parsePosition.getIndex() - index);
                return sb3;
            }
            next(parsePosition);
        }
        h.s(j.h(index, "Unterminated quoted string at position "));
        return null;
    }

    private boolean containsElements(Collection<?> collection) {
        if (collection != null && !collection.isEmpty()) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    private Format getFormat(String str) {
        String strTrim;
        if (this.registry != null) {
            int iIndexOf = str.indexOf(44);
            if (iIndexOf > 0) {
                String strTrim2 = str.substring(0, iIndexOf).trim();
                strTrim = str.substring(iIndexOf + 1).trim();
                str = strTrim2;
            } else {
                strTrim = null;
            }
            FormatFactory formatFactory = this.registry.get(str);
            if (formatFactory != null) {
                return formatFactory.getFormat(str, strTrim, getLocale());
            }
        }
        return null;
    }

    private void getQuotedString(String str, ParsePosition parsePosition) {
        appendQuotedString(str, parsePosition, null);
    }

    private String insertFormats(String str, ArrayList<String> arrayList) {
        String str2;
        if (!containsElements(arrayList)) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(str.length() * 2);
        int i14 = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        int i15 = -1;
        while (parsePosition.getIndex() < str.length()) {
            char cCharAt = str.charAt(parsePosition.getIndex());
            if (cCharAt == '\'') {
                appendQuotedString(str, parsePosition, sb3);
            } else if (cCharAt != '{') {
                if (cCharAt == '}') {
                    i14--;
                }
                sb3.append(cCharAt);
                next(parsePosition);
            } else {
                i14++;
                sb3.append('{');
                sb3.append(readArgumentIndex(str, next(parsePosition)));
                if (i14 == 1 && (str2 = arrayList.get((i15 = i15 + 1))) != null) {
                    sb3.append(',');
                    sb3.append(str2);
                }
            }
        }
        return sb3.toString();
    }

    private ParsePosition next(ParsePosition parsePosition) {
        parsePosition.setIndex(parsePosition.getIndex() + 1);
        return parsePosition;
    }

    private String parseFormatDescription(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        seekNonWs(str, parsePosition);
        int index2 = parsePosition.getIndex();
        int i14 = 1;
        while (parsePosition.getIndex() < str.length()) {
            char cCharAt = str.charAt(parsePosition.getIndex());
            if (cCharAt == '\'') {
                getQuotedString(str, parsePosition);
            } else if (cCharAt == '{') {
                i14++;
                next(parsePosition);
            } else if (cCharAt != '}') {
                next(parsePosition);
            } else {
                i14--;
                if (i14 == 0) {
                    return str.substring(index2, parsePosition.getIndex());
                }
                next(parsePosition);
            }
        }
        h.s(j.h(index, "Unterminated format element at position "));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d A[PHI: r2
      0x003d: PHI (r2v5 char) = (r2v4 char), (r2v9 char), (r2v9 char) binds: [B:7:0x002a, B:9:0x0037, B:10:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    private int readArgumentIndex(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        seekNonWs(str, parsePosition);
        StringBuilder sb3 = new StringBuilder();
        boolean z14 = false;
        while (!z14 && parsePosition.getIndex() < str.length()) {
            char cCharAt = str.charAt(parsePosition.getIndex());
            if (Character.isWhitespace(cCharAt)) {
                seekNonWs(str, parsePosition);
                cCharAt = str.charAt(parsePosition.getIndex());
                if (cCharAt == ',' || cCharAt == '}') {
                    if ((cCharAt != ',' || cCharAt == '}') && sb3.length() > 0) {
                    }
                    boolean z15 = !Character.isDigit(cCharAt);
                    sb3.append(cCharAt);
                    z14 = z15;
                } else {
                    z14 = true;
                }
            } else {
                return cCharAt != ',' ? Integer.parseInt(sb3.toString()) : Integer.parseInt(sb3.toString());
                boolean z16 = !Character.isDigit(cCharAt);
                sb3.append(cCharAt);
                z14 = z16;
            }
            next(parsePosition);
        }
        if (z14) {
            a.v(i.i(index, "Invalid format argument index at position ", ": "), str.substring(index, parsePosition.getIndex()));
            return 0;
        }
        h.s(j.h(index, "Unterminated format element at position "));
        return 0;
    }

    private void seekNonWs(String str, ParsePosition parsePosition) {
        char[] charArray = str.toCharArray();
        do {
            int iIsMatch = StringMatcherFactory.INSTANCE.splitMatcher().isMatch(charArray, parsePosition.getIndex(), 0, charArray.length);
            parsePosition.setIndex(parsePosition.getIndex() + iIsMatch);
            if (iIsMatch <= 0) {
                return;
            }
        } while (parsePosition.getIndex() < str.length());
    }

    @Override // java.text.MessageFormat
    public final void applyPattern(String str) {
        String formatDescription;
        Format format;
        if (this.registry == null) {
            super.applyPattern(str);
            this.toPattern = super.toPattern();
            return;
        }
        ArrayList<Format> arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<>();
        StringBuilder sb3 = new StringBuilder(str.length());
        int i14 = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        char[] charArray = str.toCharArray();
        int i15 = 0;
        while (parsePosition.getIndex() < str.length()) {
            char c14 = charArray[parsePosition.getIndex()];
            if (c14 != '\'') {
                if (c14 == '{') {
                    i15++;
                    seekNonWs(str, parsePosition);
                    int index = parsePosition.getIndex();
                    int argumentIndex = readArgumentIndex(str, next(parsePosition));
                    sb3.append('{');
                    sb3.append(argumentIndex);
                    seekNonWs(str, parsePosition);
                    if (charArray[parsePosition.getIndex()] == ',') {
                        formatDescription = parseFormatDescription(str, next(parsePosition));
                        format = getFormat(formatDescription);
                        if (format == null) {
                            sb3.append(',');
                            sb3.append(formatDescription);
                        }
                    } else {
                        formatDescription = null;
                        format = null;
                    }
                    arrayList.add(format);
                    arrayList2.add(format != null ? formatDescription : null);
                    if (arrayList.size() != i15) {
                        h.s("The validated expression is false");
                        return;
                    } else if (arrayList2.size() != i15) {
                        h.s("The validated expression is false");
                        return;
                    } else if (charArray[parsePosition.getIndex()] != '}') {
                        h.s(j.h(index, "Unreadable format element at position "));
                        return;
                    }
                }
                sb3.append(charArray[parsePosition.getIndex()]);
                next(parsePosition);
            } else {
                appendQuotedString(str, parsePosition, sb3);
            }
        }
        super.applyPattern(sb3.toString());
        this.toPattern = insertFormats(super.toPattern(), arrayList2);
        if (containsElements(arrayList)) {
            Format[] formats = getFormats();
            for (Format format2 : arrayList) {
                if (format2 != null) {
                    formats[i14] = format2;
                }
                i14++;
            }
            super.setFormats(formats);
        }
    }

    @Override // java.text.MessageFormat
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        ExtendedMessageFormat extendedMessageFormat = (ExtendedMessageFormat) obj;
        if (Objects.equals(this.toPattern, extendedMessageFormat.toPattern) && super.equals(obj)) {
            return Objects.equals(this.registry, extendedMessageFormat.registry);
        }
        return false;
    }

    @Override // java.text.MessageFormat
    public int hashCode() {
        return Objects.hashCode(this.toPattern) + ((Objects.hashCode(this.registry) + (super.hashCode() * 31)) * 31);
    }

    @Override // java.text.MessageFormat
    public void setFormat(int i14, Format format) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormatByArgumentIndex(int i14, Format format) {
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
        return this.toPattern;
    }

    public ExtendedMessageFormat(String str, Locale locale) {
        this(str, locale, null);
    }

    public ExtendedMessageFormat(String str, Map<String, ? extends FormatFactory> map) {
        this(str, Locale.getDefault(Locale.Category.FORMAT), map);
    }

    public ExtendedMessageFormat(String str) {
        this(str, Locale.getDefault(Locale.Category.FORMAT));
    }
}
