package org.apache.commons.lang.text;

import defpackage.anq;
import defpackage.eio;
import defpackage.hio;
import defpackage.y0a;
import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang.ObjectUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ExtendedMessageFormat extends MessageFormat {
    private static final String DUMMY_PATTERN = "";
    private static final char END_FE = '}';
    private static final String ESCAPED_QUOTE = "''";
    private static final int HASH_SEED = 31;
    private static final char QUOTE = '\'';
    private static final char START_FE = '{';
    private static final char START_FMT = ',';
    private static final long serialVersionUID = -2362048321261811743L;
    private final Map registry;
    private String toPattern;

    public ExtendedMessageFormat(String str) {
        this(str, Locale.getDefault());
    }

    private eio appendQuotedString(String str, ParsePosition parsePosition, eio eioVar, boolean z) {
        int index = parsePosition.getIndex();
        char[] charArray = str.toCharArray();
        if (z && charArray[index] == '\'') {
            next(parsePosition);
            if (eioVar == null) {
                return null;
            }
            return eioVar.a(QUOTE);
        }
        int index2 = index;
        for (int index3 = parsePosition.getIndex(); index3 < str.length(); index3++) {
            if (z && str.substring(index3).startsWith(ESCAPED_QUOTE)) {
                eioVar.g(charArray, index2, parsePosition.getIndex() - index2).a(QUOTE);
                parsePosition.setIndex(index3 + 2);
                index2 = parsePosition.getIndex();
            } else {
                if (charArray[parsePosition.getIndex()] == '\'') {
                    next(parsePosition);
                    if (eioVar == null) {
                        return null;
                    }
                    return eioVar.g(charArray, index2, parsePosition.getIndex() - index2);
                }
                next(parsePosition);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unterminated quoted string at position ");
        stringBuffer.append(index);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    private boolean containsElements(Collection collection) {
        if (collection != null && collection.size() != 0) {
            Iterator it = collection.iterator();
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
            y0a y0aVar = (y0a) this.registry.get(str);
            if (y0aVar != null) {
                return y0aVar.a(str, strTrim, getLocale());
            }
        }
        return null;
    }

    private void getQuotedString(String str, ParsePosition parsePosition, boolean z) {
        appendQuotedString(str, parsePosition, null, z);
    }

    private String insertFormats(String str, ArrayList arrayList) {
        if (!containsElements(arrayList)) {
            return str;
        }
        eio eioVar = new eio(str.length() * 2);
        ParsePosition parsePosition = new ParsePosition(0);
        int i = -1;
        int i2 = 0;
        while (parsePosition.getIndex() < str.length()) {
            char cCharAt = str.charAt(parsePosition.getIndex());
            if (cCharAt == '\'') {
                appendQuotedString(str, parsePosition, eioVar, false);
            } else if (cCharAt != '{') {
                if (cCharAt == '}') {
                    i2--;
                }
                eioVar.a(cCharAt);
                next(parsePosition);
            } else {
                i2++;
                if (i2 == 1) {
                    i++;
                    eioVar.a('{').c(readArgumentIndex(str, next(parsePosition)));
                    String str2 = (String) arrayList.get(i);
                    if (str2 != null) {
                        eioVar.a(',').f(str2);
                    }
                }
            }
        }
        return eioVar.toString();
    }

    private ParsePosition next(ParsePosition parsePosition) {
        parsePosition.setIndex(parsePosition.getIndex() + 1);
        return parsePosition;
    }

    private String parseFormatDescription(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        seekNonWs(str, parsePosition);
        int index2 = parsePosition.getIndex();
        int i = 1;
        while (parsePosition.getIndex() < str.length()) {
            char cCharAt = str.charAt(parsePosition.getIndex());
            if (cCharAt == '\'') {
                getQuotedString(str, parsePosition, false);
            } else if (cCharAt == '{') {
                i++;
            } else if (cCharAt == '}' && (i = i - 1) == 0) {
                return str.substring(index2, parsePosition.getIndex());
            }
            next(parsePosition);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unterminated format element at position ");
        stringBuffer.append(index);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d A[PHI: r2
      0x003d: PHI (r2v5 char) = (r2v4 char), (r2v9 char), (r2v9 char) binds: [B:7:0x002a, B:9:0x0037, B:10:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    private int readArgumentIndex(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        seekNonWs(str, parsePosition);
        eio eioVar = new eio();
        boolean z = false;
        while (!z && parsePosition.getIndex() < str.length()) {
            char cCharAt = str.charAt(parsePosition.getIndex());
            if (Character.isWhitespace(cCharAt)) {
                seekNonWs(str, parsePosition);
                cCharAt = str.charAt(parsePosition.getIndex());
                if (cCharAt == ',' || cCharAt == '}') {
                    if ((cCharAt != ',' || cCharAt == '}') && eioVar.k() > 0) {
                    }
                    boolean z2 = !Character.isDigit(cCharAt);
                    eioVar.a(cCharAt);
                    z = z2;
                } else {
                    z = true;
                }
            } else {
                return cCharAt != ',' ? Integer.parseInt(eioVar.toString()) : Integer.parseInt(eioVar.toString());
                boolean z3 = !Character.isDigit(cCharAt);
                eioVar.a(cCharAt);
                z = z3;
            }
            next(parsePosition);
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

    private void seekNonWs(String str, ParsePosition parsePosition) {
        char[] charArray = str.toCharArray();
        do {
            int iA = hio.c().a(charArray, parsePosition.getIndex());
            parsePosition.setIndex(parsePosition.getIndex() + iA);
            if (iA <= 0) {
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
        ArrayList arrayList2 = new ArrayList();
        eio eioVar = new eio(str.length());
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        char[] charArray = str.toCharArray();
        int i2 = 0;
        while (parsePosition.getIndex() < str.length()) {
            char c = charArray[parsePosition.getIndex()];
            if (c != '\'') {
                if (c == '{') {
                    i2++;
                    seekNonWs(str, parsePosition);
                    int index = parsePosition.getIndex();
                    eioVar.a('{').c(readArgumentIndex(str, next(parsePosition)));
                    seekNonWs(str, parsePosition);
                    if (charArray[parsePosition.getIndex()] == ',') {
                        formatDescription = parseFormatDescription(str, next(parsePosition));
                        format = getFormat(formatDescription);
                        if (format == null) {
                            eioVar.a(',').f(formatDescription);
                        }
                    } else {
                        formatDescription = null;
                        format = null;
                    }
                    arrayList.add(format);
                    arrayList2.add(format != null ? formatDescription : null);
                    anq.a(arrayList.size() == i2);
                    anq.a(arrayList2.size() == i2);
                    if (charArray[parsePosition.getIndex()] != '}') {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Unreadable format element at position ");
                        stringBuffer.append(index);
                        throw new IllegalArgumentException(stringBuffer.toString());
                    }
                }
                eioVar.a(charArray[parsePosition.getIndex()]);
                next(parsePosition);
            } else {
                appendQuotedString(str, parsePosition, eioVar, true);
            }
        }
        super.applyPattern(eioVar.toString());
        this.toPattern = insertFormats(super.toPattern(), arrayList2);
        if (containsElements(arrayList)) {
            Format[] formats = getFormats();
            for (Format format2 : arrayList) {
                if (format2 != null) {
                    formats[i] = format2;
                }
                i++;
            }
            super.setFormats(formats);
        }
    }

    @Override // java.text.MessageFormat
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !super.equals(obj) || ObjectUtils.d(getClass(), obj.getClass())) {
            return false;
        }
        ExtendedMessageFormat extendedMessageFormat = (ExtendedMessageFormat) obj;
        return (ObjectUtils.d(this.toPattern, extendedMessageFormat.toPattern) || ObjectUtils.d(this.registry, extendedMessageFormat.registry)) ? false : true;
    }

    @Override // java.text.MessageFormat
    public int hashCode() {
        return (((super.hashCode() * 31) + ObjectUtils.b(this.registry)) * 31) + ObjectUtils.b(this.toPattern);
    }

    @Override // java.text.MessageFormat
    public void setFormat(int i, Format format) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormatByArgumentIndex(int i, Format format) {
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

    public ExtendedMessageFormat(String str, Map map) {
        this(str, Locale.getDefault(), map);
    }

    public ExtendedMessageFormat(String str, Locale locale, Map map) {
        super("");
        setLocale(locale);
        this.registry = map;
        applyPattern(str);
    }
}
