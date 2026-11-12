package org.apache.commons.text;

import am.j;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o2.c;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class StrBuilder implements CharSequence, Appendable, Serializable, Builder<String> {
    static final int CAPACITY = 32;
    private static final long serialVersionUID = 7628716375283629643L;
    char[] buffer;
    private String newLine;
    private String nullText;
    private int size;

    public class StrBuilderTokenizer extends StrTokenizer {
        public StrBuilderTokenizer() {
        }

        @Override // org.apache.commons.text.StrTokenizer
        public String getContent() {
            String content = super.getContent();
            return content == null ? StrBuilder.this.toString() : content;
        }

        @Override // org.apache.commons.text.StrTokenizer
        public List<String> tokenize(char[] cArr, int i14, int i15) {
            if (cArr != null) {
                return super.tokenize(cArr, i14, i15);
            }
            StrBuilder strBuilder = StrBuilder.this;
            return super.tokenize(strBuilder.buffer, 0, strBuilder.size());
        }
    }

    public StrBuilder(String str) {
        if (str == null) {
            this.buffer = new char[32];
        } else {
            this.buffer = new char[str.length() + 32];
            append(str);
        }
    }

    private void deleteImpl(int i14, int i15, int i16) {
        char[] cArr = this.buffer;
        System.arraycopy(cArr, i15, cArr, i14, this.size - i15);
        this.size -= i16;
    }

    private StrBuilder replaceImpl(StrMatcher strMatcher, String str, int i14, int i15, int i16) {
        String str2;
        if (strMatcher != null && this.size != 0) {
            int length = str == null ? 0 : str.length();
            int i17 = i14;
            while (i17 < i15 && i16 != 0) {
                int iIsMatch = strMatcher.isMatch(this.buffer, i17, i14, i15);
                if (iIsMatch > 0) {
                    str2 = str;
                    replaceImpl(i17, i17 + iIsMatch, iIsMatch, str2, length);
                    i15 = (i15 - iIsMatch) + length;
                    i17 = (i17 + length) - 1;
                    if (i16 > 0) {
                        i16--;
                    }
                } else {
                    str2 = str;
                }
                i17++;
                str = str2;
            }
        }
        return this;
    }

    public StrBuilder append(boolean z14) {
        int i14 = this.size;
        if (z14) {
            ensureCapacity(i14 + 4);
            char[] cArr = this.buffer;
            int i15 = this.size;
            int i16 = i15 + 1;
            this.size = i16;
            cArr[i15] = 't';
            int i17 = i15 + 2;
            this.size = i17;
            cArr[i16] = 'r';
            int i18 = i15 + 3;
            this.size = i18;
            cArr[i17] = 'u';
            this.size = i15 + 4;
            cArr[i18] = 'e';
            return this;
        }
        ensureCapacity(i14 + 5);
        char[] cArr2 = this.buffer;
        int i19 = this.size;
        int i24 = i19 + 1;
        this.size = i24;
        cArr2[i19] = 'f';
        int i25 = i19 + 2;
        this.size = i25;
        cArr2[i24] = 'a';
        int i26 = i19 + 3;
        this.size = i26;
        cArr2[i25] = 'l';
        int i27 = i19 + 4;
        this.size = i27;
        cArr2[i26] = 's';
        this.size = i19 + 5;
        cArr2[i27] = 'e';
        return this;
    }

    public StrBuilder appendAll(Iterable<?> iterable) {
        if (iterable != null) {
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                append(it.next());
            }
        }
        return this;
    }

    public StrBuilder appendFixedWidthPadLeft(Object obj, int i14, char c14) {
        char[] cArr;
        if (i14 > 0) {
            ensureCapacity(this.size + i14);
            String nullText = obj == null ? getNullText() : obj.toString();
            if (nullText == null) {
                nullText = "";
            }
            int length = nullText.length();
            if (length >= i14) {
                nullText.getChars(length - i14, length, this.buffer, this.size);
            } else {
                int i15 = i14 - length;
                int i16 = 0;
                while (true) {
                    cArr = this.buffer;
                    if (i16 >= i15) {
                        break;
                    }
                    cArr[this.size + i16] = c14;
                    i16++;
                }
                nullText.getChars(0, length, cArr, this.size + i15);
            }
            this.size += i14;
        }
        return this;
    }

    public StrBuilder appendFixedWidthPadRight(Object obj, int i14, char c14) {
        if (i14 > 0) {
            ensureCapacity(this.size + i14);
            String nullText = obj == null ? getNullText() : obj.toString();
            if (nullText == null) {
                nullText = "";
            }
            int length = nullText.length();
            char[] cArr = this.buffer;
            if (length >= i14) {
                nullText.getChars(0, i14, cArr, this.size);
            } else {
                int i15 = i14 - length;
                nullText.getChars(0, length, cArr, this.size);
                for (int i16 = 0; i16 < i15; i16++) {
                    this.buffer[this.size + length + i16] = c14;
                }
            }
            this.size += i14;
        }
        return this;
    }

    public StrBuilder appendNewLine() {
        String str = this.newLine;
        if (str != null) {
            return append(str);
        }
        append(System.lineSeparator());
        return this;
    }

    public StrBuilder appendNull() {
        String str = this.nullText;
        return str == null ? this : append(str);
    }

    public StrBuilder appendPadding(int i14, char c14) {
        if (i14 >= 0) {
            ensureCapacity(this.size + i14);
            for (int i15 = 0; i15 < i14; i15++) {
                char[] cArr = this.buffer;
                int i16 = this.size;
                this.size = i16 + 1;
                cArr[i16] = c14;
            }
        }
        return this;
    }

    public StrBuilder appendSeparator(char c14, char c15) {
        if (size() > 0) {
            append(c14);
            return this;
        }
        append(c15);
        return this;
    }

    public void appendTo(Appendable appendable) throws IOException {
        if (appendable instanceof Writer) {
            ((Writer) appendable).write(this.buffer, 0, this.size);
            return;
        }
        if (appendable instanceof StringBuilder) {
            ((StringBuilder) appendable).append(this.buffer, 0, this.size);
            return;
        }
        if (appendable instanceof StringBuffer) {
            ((StringBuffer) appendable).append(this.buffer, 0, this.size);
        } else if (appendable instanceof CharBuffer) {
            ((CharBuffer) appendable).put(this.buffer, 0, this.size);
        } else {
            appendable.append(this);
        }
    }

    public StrBuilder appendWithSeparators(Iterable<?> iterable, String str) {
        if (iterable != null) {
            String string = Objects.toString(str, "");
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                append(it.next());
                if (it.hasNext()) {
                    append(string);
                }
            }
        }
        return this;
    }

    public StrBuilder appendln(Object obj) {
        return append(obj).appendNewLine();
    }

    public Reader asReader() {
        return new StrBuilderReader();
    }

    public StrTokenizer asTokenizer() {
        return new StrBuilderTokenizer();
    }

    public Writer asWriter() {
        return new StrBuilderWriter();
    }

    public int capacity() {
        return this.buffer.length;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i14) {
        if (i14 < 0 || i14 >= length()) {
            throw new StringIndexOutOfBoundsException(i14);
        }
        return this.buffer[i14];
    }

    public StrBuilder clear() {
        this.size = 0;
        return this;
    }

    public boolean contains(char c14) {
        char[] cArr = this.buffer;
        for (int i14 = 0; i14 < this.size; i14++) {
            if (cArr[i14] == c14) {
                return true;
            }
        }
        return false;
    }

    public StrBuilder delete(int i14, int i15) {
        int iValidateRange = validateRange(i14, i15);
        int i16 = iValidateRange - i14;
        if (i16 > 0) {
            deleteImpl(i14, iValidateRange, i16);
        }
        return this;
    }

    public StrBuilder deleteAll(char c14) {
        int i14 = 0;
        while (i14 < this.size) {
            if (this.buffer[i14] == c14) {
                int i15 = i14;
                do {
                    i15++;
                    if (i15 >= this.size) {
                        break;
                    }
                } while (this.buffer[i15] == c14);
                int i16 = i15 - i14;
                deleteImpl(i14, i15, i16);
                i14 = i15 - i16;
            }
            i14++;
        }
        return this;
    }

    public StrBuilder deleteCharAt(int i14) {
        if (i14 < 0 || i14 >= this.size) {
            throw new StringIndexOutOfBoundsException(i14);
        }
        deleteImpl(i14, i14 + 1, 1);
        return this;
    }

    public StrBuilder deleteFirst(String str) {
        int iIndexOf;
        int length = str == null ? 0 : str.length();
        if (length > 0 && (iIndexOf = indexOf(str, 0)) >= 0) {
            deleteImpl(iIndexOf, iIndexOf + length, length);
        }
        return this;
    }

    public boolean endsWith(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        int i14 = this.size;
        if (length > i14) {
            return false;
        }
        int i15 = i14 - length;
        int i16 = 0;
        while (i16 < length) {
            if (this.buffer[i15] != str.charAt(i16)) {
                return false;
            }
            i16++;
            i15++;
        }
        return true;
    }

    public StrBuilder ensureCapacity(int i14) {
        char[] cArr = this.buffer;
        if (i14 > cArr.length) {
            char[] cArr2 = new char[i14 * 2];
            this.buffer = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, this.size);
        }
        return this;
    }

    public boolean equals(StrBuilder strBuilder) {
        int i14;
        if (this == strBuilder) {
            return true;
        }
        if (strBuilder == null || (i14 = this.size) != strBuilder.size) {
            return false;
        }
        char[] cArr = this.buffer;
        char[] cArr2 = strBuilder.buffer;
        for (int i15 = i14 - 1; i15 >= 0; i15--) {
            if (cArr[i15] != cArr2[i15]) {
                return false;
            }
        }
        return true;
    }

    public boolean equalsIgnoreCase(StrBuilder strBuilder) {
        if (this == strBuilder) {
            return true;
        }
        int i14 = this.size;
        if (i14 != strBuilder.size) {
            return false;
        }
        char[] cArr = this.buffer;
        char[] cArr2 = strBuilder.buffer;
        for (int i15 = i14 - 1; i15 >= 0; i15--) {
            char c14 = cArr[i15];
            char c15 = cArr2[i15];
            if (c14 != c15 && Character.toUpperCase(c14) != Character.toUpperCase(c15)) {
                return false;
            }
        }
        return true;
    }

    public void getChars(int i14, int i15, char[] cArr, int i16) {
        if (i14 < 0) {
            throw new StringIndexOutOfBoundsException(i14);
        }
        if (i15 < 0 || i15 > length()) {
            throw new StringIndexOutOfBoundsException(i15);
        }
        if (i14 <= i15) {
            System.arraycopy(this.buffer, i14, cArr, i16, i15 - i14);
        } else {
            e.k("end < start");
        }
    }

    public String getNewLineText() {
        return this.newLine;
    }

    public String getNullText() {
        return this.nullText;
    }

    public int hashCode() {
        char[] cArr = this.buffer;
        int i14 = 0;
        for (int i15 = this.size - 1; i15 >= 0; i15--) {
            i14 = (i14 * 31) + cArr[i15];
        }
        return i14;
    }

    public int indexOf(String str, int i14) {
        if (i14 < 0) {
            i14 = 0;
        }
        if (str != null && i14 < this.size) {
            int length = str.length();
            if (length == 1) {
                return indexOf(str.charAt(0), i14);
            }
            if (length == 0) {
                return i14;
            }
            int i15 = this.size;
            if (length > i15) {
                return -1;
            }
            char[] cArr = this.buffer;
            int i16 = (i15 - length) + 1;
            while (i14 < i16) {
                for (int i17 = 0; i17 < length; i17++) {
                    if (str.charAt(i17) != cArr[i14 + i17]) {
                        i14++;
                    }
                }
                return i14;
            }
        }
        return -1;
    }

    public StrBuilder insert(int i14, boolean z14) {
        validateIndex(i14);
        int i15 = this.size;
        if (z14) {
            ensureCapacity(i15 + 4);
            char[] cArr = this.buffer;
            System.arraycopy(cArr, i14, cArr, i14 + 4, this.size - i14);
            char[] cArr2 = this.buffer;
            cArr2[i14] = 't';
            cArr2[i14 + 1] = 'r';
            cArr2[i14 + 2] = 'u';
            cArr2[i14 + 3] = 'e';
            this.size += 4;
            return this;
        }
        ensureCapacity(i15 + 5);
        char[] cArr3 = this.buffer;
        System.arraycopy(cArr3, i14, cArr3, i14 + 5, this.size - i14);
        char[] cArr4 = this.buffer;
        cArr4[i14] = 'f';
        cArr4[i14 + 1] = 'a';
        cArr4[i14 + 2] = 'l';
        cArr4[i14 + 3] = 's';
        cArr4[i14 + 4] = 'e';
        this.size += 5;
        return this;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int lastIndexOf(String str, int i14) {
        int i15 = this.size;
        if (i14 >= i15) {
            i14 = i15 - 1;
        }
        if (str != null && i14 >= 0) {
            int length = str.length();
            if (length > 0 && length <= this.size) {
                if (length == 1) {
                    return lastIndexOf(str.charAt(0), i14);
                }
                for (int i16 = (i14 - length) + 1; i16 >= 0; i16--) {
                    for (int i17 = 0; i17 < length; i17++) {
                        if (str.charAt(i17) != this.buffer[i16 + i17]) {
                        }
                    }
                    return i16;
                }
            }
            if (length == 0) {
                return i14;
            }
        }
        return -1;
    }

    public String leftString(int i14) {
        if (i14 <= 0) {
            return "";
        }
        int i15 = this.size;
        char[] cArr = this.buffer;
        return i14 >= i15 ? new String(cArr, 0, i15) : new String(cArr, 0, i14);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.size;
    }

    public String midString(int i14, int i15) {
        int i16;
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 <= 0 || i14 >= (i16 = this.size)) {
            return "";
        }
        int i17 = i14 + i15;
        char[] cArr = this.buffer;
        return i16 <= i17 ? new String(cArr, i14, i16 - i14) : new String(cArr, i14, i15);
    }

    public StrBuilder minimizeCapacity() {
        if (this.buffer.length > length()) {
            char[] cArr = this.buffer;
            char[] cArr2 = new char[length()];
            this.buffer = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, this.size);
        }
        return this;
    }

    public int readFrom(Readable readable) throws IOException {
        int i14 = this.size;
        if (readable instanceof Reader) {
            Reader reader = (Reader) readable;
            ensureCapacity(i14 + 1);
            while (true) {
                char[] cArr = this.buffer;
                int i15 = this.size;
                int i16 = reader.read(cArr, i15, cArr.length - i15);
                if (i16 == -1) {
                    break;
                }
                int i17 = this.size + i16;
                this.size = i17;
                ensureCapacity(i17 + 1);
            }
        } else if (readable instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) readable;
            int iRemaining = charBuffer.remaining();
            ensureCapacity(this.size + iRemaining);
            charBuffer.get(this.buffer, this.size, iRemaining);
            this.size += iRemaining;
        } else {
            while (true) {
                ensureCapacity(this.size + 1);
                char[] cArr2 = this.buffer;
                int i18 = this.size;
                int i19 = readable.read(CharBuffer.wrap(cArr2, i18, cArr2.length - i18));
                if (i19 == -1) {
                    break;
                }
                this.size += i19;
            }
        }
        return this.size - i14;
    }

    public StrBuilder replace(int i14, int i15, String str) {
        int iValidateRange = validateRange(i14, i15);
        replaceImpl(i14, iValidateRange, iValidateRange - i14, str, str == null ? 0 : str.length());
        return this;
    }

    public StrBuilder replaceAll(String str, String str2) {
        int length = str == null ? 0 : str.length();
        if (length > 0) {
            int length2 = str2 == null ? 0 : str2.length();
            int iIndexOf = indexOf(str, 0);
            while (iIndexOf >= 0) {
                replaceImpl(iIndexOf, iIndexOf + length, length, str2, length2);
                iIndexOf = indexOf(str, iIndexOf + length2);
            }
        }
        return this;
    }

    public StrBuilder replaceFirst(String str, String str2) {
        int iIndexOf;
        int length = str == null ? 0 : str.length();
        if (length <= 0 || (iIndexOf = indexOf(str, 0)) < 0) {
            return this;
        }
        replaceImpl(iIndexOf, iIndexOf + length, length, str2, str2 != null ? str2.length() : 0);
        return this;
    }

    public StrBuilder reverse() {
        int i14 = this.size;
        if (i14 != 0) {
            int i15 = i14 / 2;
            char[] cArr = this.buffer;
            int i16 = i14 - 1;
            int i17 = 0;
            while (i17 < i15) {
                char c14 = cArr[i17];
                cArr[i17] = cArr[i16];
                cArr[i16] = c14;
                i17++;
                i16--;
            }
        }
        return this;
    }

    public String rightString(int i14) {
        if (i14 <= 0) {
            return "";
        }
        int i15 = this.size;
        char[] cArr = this.buffer;
        return i14 >= i15 ? new String(cArr, 0, i15) : new String(cArr, i15 - i14, i14);
    }

    public StrBuilder setCharAt(int i14, char c14) {
        if (i14 < 0 || i14 >= length()) {
            throw new StringIndexOutOfBoundsException(i14);
        }
        this.buffer[i14] = c14;
        return this;
    }

    public StrBuilder setLength(int i14) {
        if (i14 < 0) {
            throw new StringIndexOutOfBoundsException(i14);
        }
        int i15 = this.size;
        if (i14 < i15) {
            this.size = i14;
            return this;
        }
        if (i14 > i15) {
            ensureCapacity(i14);
            this.size = i14;
            for (int i16 = this.size; i16 < i14; i16++) {
                this.buffer[i16] = 0;
            }
        }
        return this;
    }

    public StrBuilder setNewLineText(String str) {
        this.newLine = str;
        return this;
    }

    public StrBuilder setNullText(String str) {
        if (str != null && str.isEmpty()) {
            str = null;
        }
        this.nullText = str;
        return this;
    }

    public int size() {
        return this.size;
    }

    public boolean startsWith(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        if (length > this.size) {
            return false;
        }
        for (int i14 = 0; i14 < length; i14++) {
            if (this.buffer[i14] != str.charAt(i14)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i14, int i15) {
        if (i14 < 0) {
            throw new StringIndexOutOfBoundsException(i14);
        }
        if (i15 > this.size) {
            throw new StringIndexOutOfBoundsException(i15);
        }
        if (i14 <= i15) {
            return substring(i14, i15);
        }
        throw new StringIndexOutOfBoundsException(i15 - i14);
    }

    public String substring(int i14, int i15) {
        return new String(this.buffer, i14, validateRange(i14, i15) - i14);
    }

    public char[] toCharArray(int i14, int i15) {
        int iValidateRange = validateRange(i14, i15) - i14;
        if (iValidateRange == 0) {
            return ArrayUtils.EMPTY_CHAR_ARRAY;
        }
        char[] cArr = new char[iValidateRange];
        System.arraycopy(this.buffer, i14, cArr, 0, iValidateRange);
        return cArr;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return new String(this.buffer, 0, this.size);
    }

    public StringBuffer toStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer(this.size);
        stringBuffer.append(this.buffer, 0, this.size);
        return stringBuffer;
    }

    public StringBuilder toStringBuilder() {
        StringBuilder sb3 = new StringBuilder(this.size);
        sb3.append(this.buffer, 0, this.size);
        return sb3;
    }

    public StrBuilder trim() {
        int i14 = this.size;
        if (i14 != 0) {
            char[] cArr = this.buffer;
            int i15 = 0;
            while (i15 < i14 && cArr[i15] <= ' ') {
                i15++;
            }
            while (i15 < i14 && cArr[i14 - 1] <= ' ') {
                i14--;
            }
            int i16 = this.size;
            if (i14 < i16) {
                delete(i14, i16);
            }
            if (i15 > 0) {
                delete(0, i15);
            }
        }
        return this;
    }

    public void validateIndex(int i14) {
        if (i14 < 0 || i14 > this.size) {
            throw new StringIndexOutOfBoundsException(i14);
        }
    }

    public int validateRange(int i14, int i15) {
        if (i14 < 0) {
            throw new StringIndexOutOfBoundsException(i14);
        }
        int i16 = this.size;
        if (i15 > i16) {
            i15 = i16;
        }
        if (i14 <= i15) {
            return i15;
        }
        e.k("end < start");
        return 0;
    }

    @Override // org.apache.commons.text.Builder
    public String build() {
        return toString();
    }

    public class StrBuilderWriter extends Writer {
        public StrBuilderWriter() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i14) {
            StrBuilder.this.append((char) i14);
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            StrBuilder.this.append(cArr);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i14, int i15) {
            StrBuilder.this.append(cArr, i14, i15);
        }

        @Override // java.io.Writer
        public void write(String str) {
            StrBuilder.this.append(str);
        }

        @Override // java.io.Writer
        public void write(String str, int i14, int i15) {
            StrBuilder.this.append(str, i14, i15);
        }
    }

    public StrBuilder appendln(String str) {
        return append(str).appendNewLine();
    }

    public StrBuilder appendln(String str, int i14, int i15) {
        return append(str, i14, i15).appendNewLine();
    }

    public StrBuilder appendln(String str, Object... objArr) {
        return append(str, objArr).appendNewLine();
    }

    public StrBuilder appendln(StringBuffer stringBuffer) {
        return append(stringBuffer).appendNewLine();
    }

    public StrBuilder appendln(StringBuilder sb3) {
        return append(sb3).appendNewLine();
    }

    public String substring(int i14) {
        return substring(i14, this.size);
    }

    public StrBuilder appendSeparator(String str, String str2) {
        if (isEmpty()) {
            str = str2;
        }
        if (str != null) {
            append(str);
        }
        return this;
    }

    public StrBuilder appendln(StringBuilder sb3, int i14, int i15) {
        return append(sb3, i14, i15).appendNewLine();
    }

    public StrBuilder appendln(StringBuffer stringBuffer, int i14, int i15) {
        return append(stringBuffer, i14, i15).appendNewLine();
    }

    public StrBuilder appendSeparator(char c14) {
        if (size() > 0) {
            append(c14);
        }
        return this;
    }

    public StrBuilder appendln(StrBuilder strBuilder) {
        return append(strBuilder).appendNewLine();
    }

    public StrBuilder appendln(StrBuilder strBuilder, int i14, int i15) {
        return append(strBuilder, i14, i15).appendNewLine();
    }

    public StrBuilder appendSeparator(String str) {
        return appendSeparator(str, (String) null);
    }

    public StrBuilder appendln(char[] cArr) {
        return append(cArr).appendNewLine();
    }

    public boolean contains(String str) {
        return indexOf(str, 0) >= 0;
    }

    public StrBuilder appendSeparator(String str, int i14) {
        if (str != null && i14 > 0) {
            append(str);
        }
        return this;
    }

    public StrBuilder appendln(char[] cArr, int i14, int i15) {
        return append(cArr, i14, i15).appendNewLine();
    }

    public boolean contains(StrMatcher strMatcher) {
        return indexOf(strMatcher, 0) >= 0;
    }

    public char[] toCharArray() {
        int i14 = this.size;
        if (i14 == 0) {
            return ArrayUtils.EMPTY_CHAR_ARRAY;
        }
        char[] cArr = new char[i14];
        System.arraycopy(this.buffer, 0, cArr, 0, i14);
        return cArr;
    }

    public StrBuilder appendSeparator(char c14, int i14) {
        if (i14 > 0) {
            append(c14);
        }
        return this;
    }

    public StrBuilder appendln(boolean z14) {
        return append(z14).appendNewLine();
    }

    public <T> StrBuilder appendAll(T... tArr) {
        if (tArr != null && tArr.length > 0) {
            for (T t7 : tArr) {
                append(t7);
            }
        }
        return this;
    }

    public StrBuilder appendln(char c14) {
        return append(c14).appendNewLine();
    }

    public StrBuilder appendln(int i14) {
        return append(i14).appendNewLine();
    }

    public StrBuilder appendln(long j8) {
        return append(j8).appendNewLine();
    }

    public StrBuilder deleteFirst(char c14) {
        for (int i14 = 0; i14 < this.size; i14++) {
            if (this.buffer[i14] == c14) {
                deleteImpl(i14, i14 + 1, 1);
                return this;
            }
        }
        return this;
    }

    public StrBuilder replace(StrMatcher strMatcher, String str, int i14, int i15, int i16) {
        return replaceImpl(strMatcher, str, i14, validateRange(i14, i15), i16);
    }

    public StrBuilder appendAll(Iterator<?> it) {
        if (it != null) {
            while (it.hasNext()) {
                append(it.next());
            }
        }
        return this;
    }

    public StrBuilder appendln(float f14) {
        return append(f14).appendNewLine();
    }

    public StrBuilder(int i14) {
        this.buffer = new char[i14 <= 0 ? 32 : i14];
    }

    public StrBuilder appendln(double d14) {
        return append(d14).appendNewLine();
    }

    public StrBuilder deleteFirst(StrMatcher strMatcher) {
        return replace(strMatcher, null, 0, this.size, 1);
    }

    public StrBuilder() {
        this(32);
    }

    public boolean equals(Object obj) {
        return (obj instanceof StrBuilder) && equals((StrBuilder) obj);
    }

    public StrBuilder deleteAll(String str) {
        int length = str == null ? 0 : str.length();
        if (length > 0) {
            int iIndexOf = indexOf(str, 0);
            while (iIndexOf >= 0) {
                deleteImpl(iIndexOf, iIndexOf + length, length);
                iIndexOf = indexOf(str, iIndexOf);
            }
        }
        return this;
    }

    public StrBuilder appendWithSeparators(Object[] objArr, String str) {
        if (objArr != null && objArr.length > 0) {
            String string = Objects.toString(str, "");
            append(objArr[0]);
            for (int i14 = 1; i14 < objArr.length; i14++) {
                append(string);
                append(objArr[i14]);
            }
        }
        return this;
    }

    public char[] getChars(char[] cArr) {
        int length = length();
        if (cArr == null || cArr.length < length) {
            cArr = new char[length];
        }
        System.arraycopy(this.buffer, 0, cArr, 0, length);
        return cArr;
    }

    public StrBuilder replaceFirst(char c14, char c15) {
        if (c14 != c15) {
            for (int i14 = 0; i14 < this.size; i14++) {
                char[] cArr = this.buffer;
                if (cArr[i14] == c14) {
                    cArr[i14] = c15;
                    return this;
                }
            }
        }
        return this;
    }

    public StrBuilder deleteAll(StrMatcher strMatcher) {
        return replace(strMatcher, null, 0, this.size, -1);
    }

    public StrBuilder replaceFirst(StrMatcher strMatcher, String str) {
        return replace(strMatcher, str, 0, this.size, 1);
    }

    public StrBuilder appendWithSeparators(Iterator<?> it, String str) {
        if (it != null) {
            String string = Objects.toString(str, "");
            while (it.hasNext()) {
                append(it.next());
                if (it.hasNext()) {
                    append(string);
                }
            }
        }
        return this;
    }

    public StrBuilder replaceAll(char c14, char c15) {
        if (c14 != c15) {
            for (int i14 = 0; i14 < this.size; i14++) {
                char[] cArr = this.buffer;
                if (cArr[i14] == c14) {
                    cArr[i14] = c15;
                }
            }
        }
        return this;
    }

    public StrBuilder replaceAll(StrMatcher strMatcher, String str) {
        return replace(strMatcher, str, 0, this.size, -1);
    }

    private void replaceImpl(int i14, int i15, int i16, String str, int i17) {
        int i18 = (this.size - i16) + i17;
        if (i17 != i16) {
            ensureCapacity(i18);
            char[] cArr = this.buffer;
            System.arraycopy(cArr, i15, cArr, i14 + i17, this.size - i15);
            this.size = i18;
        }
        if (i17 > 0) {
            str.getChars(0, i17, this.buffer, i14);
        }
    }

    public int indexOf(char c14, int i14) {
        if (i14 < 0) {
            i14 = 0;
        }
        if (i14 >= this.size) {
            return -1;
        }
        char[] cArr = this.buffer;
        while (i14 < this.size) {
            if (cArr[i14] == c14) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public StrBuilder appendFixedWidthPadRight(int i14, int i15, char c14) {
        return appendFixedWidthPadRight(String.valueOf(i14), i15, c14);
    }

    public int lastIndexOf(char c14, int i14) {
        int i15 = this.size;
        if (i14 >= i15) {
            i14 = i15 - 1;
        }
        if (i14 < 0) {
            return -1;
        }
        while (i14 >= 0) {
            if (this.buffer[i14] == c14) {
                return i14;
            }
            i14--;
        }
        return -1;
    }

    public StrBuilder appendFixedWidthPadLeft(int i14, int i15, char c14) {
        return appendFixedWidthPadLeft(String.valueOf(i14), i15, c14);
    }

    public int indexOf(String str) {
        return indexOf(str, 0);
    }

    public int lastIndexOf(String str) {
        return lastIndexOf(str, this.size - 1);
    }

    public int indexOf(char c14) {
        return indexOf(c14, 0);
    }

    public int lastIndexOf(char c14) {
        return lastIndexOf(c14, this.size - 1);
    }

    public class StrBuilderReader extends Reader {
        private int mark;
        private int pos;

        public StrBuilderReader() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Reader
        public void mark(int i14) {
            this.mark = this.pos;
        }

        @Override // java.io.Reader
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i14, int i15) {
            int i16;
            if (i14 < 0 || i15 < 0 || i14 > cArr.length || (i16 = i14 + i15) > cArr.length || i16 < 0) {
                c.q();
                return 0;
            }
            if (i15 == 0) {
                return 0;
            }
            if (this.pos >= StrBuilder.this.size()) {
                return -1;
            }
            if (this.pos + i15 > StrBuilder.this.size()) {
                i15 = StrBuilder.this.size() - this.pos;
            }
            StrBuilder strBuilder = StrBuilder.this;
            int i17 = this.pos;
            strBuilder.getChars(i17, i17 + i15, cArr, i14);
            this.pos += i15;
            return i15;
        }

        @Override // java.io.Reader
        public boolean ready() {
            return this.pos < StrBuilder.this.size();
        }

        @Override // java.io.Reader
        public void reset() {
            this.pos = this.mark;
        }

        @Override // java.io.Reader
        public long skip(long j8) {
            if (((long) this.pos) + j8 > StrBuilder.this.size()) {
                j8 = StrBuilder.this.size() - this.pos;
            }
            if (j8 < 0) {
                return 0L;
            }
            this.pos = (int) (((long) this.pos) + j8);
            return j8;
        }

        @Override // java.io.Reader
        public int read() {
            if (!ready()) {
                return -1;
            }
            StrBuilder strBuilder = StrBuilder.this;
            int i14 = this.pos;
            this.pos = i14 + 1;
            return strBuilder.charAt(i14);
        }
    }

    public int indexOf(StrMatcher strMatcher) {
        return indexOf(strMatcher, 0);
    }

    public int lastIndexOf(StrMatcher strMatcher) {
        return lastIndexOf(strMatcher, this.size);
    }

    public int indexOf(StrMatcher strMatcher, int i14) {
        int i15;
        if (i14 < 0) {
            i14 = 0;
        }
        if (strMatcher != null && i14 < (i15 = this.size)) {
            char[] cArr = this.buffer;
            for (int i16 = i14; i16 < i15; i16++) {
                if (strMatcher.isMatch(cArr, i16, i14, i15) > 0) {
                    return i16;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(StrMatcher strMatcher, int i14) {
        int i15 = this.size;
        if (i14 >= i15) {
            i14 = i15 - 1;
        }
        if (strMatcher != null && i14 >= 0) {
            char[] cArr = this.buffer;
            int i16 = i14 + 1;
            while (i14 >= 0) {
                if (strMatcher.isMatch(cArr, i14, 0, i16) > 0) {
                    return i14;
                }
                i14--;
            }
        }
        return -1;
    }

    public StrBuilder append(Object obj) {
        if (obj == null) {
            return appendNull();
        }
        if (obj instanceof CharSequence) {
            return append((CharSequence) obj);
        }
        return append(obj.toString());
    }

    @Override // java.lang.Appendable
    public StrBuilder append(CharSequence charSequence) {
        if (charSequence == null) {
            return appendNull();
        }
        if (charSequence instanceof StrBuilder) {
            return append((StrBuilder) charSequence);
        }
        if (charSequence instanceof StringBuilder) {
            return append((StringBuilder) charSequence);
        }
        if (charSequence instanceof StringBuffer) {
            return append((StringBuffer) charSequence);
        }
        if (charSequence instanceof CharBuffer) {
            return append((CharBuffer) charSequence);
        }
        return append(charSequence.toString());
    }

    public StrBuilder insert(int i14, String str) {
        int length;
        validateIndex(i14);
        if (str == null) {
            str = this.nullText;
        }
        if (str != null && (length = str.length()) > 0) {
            int i15 = this.size + length;
            ensureCapacity(i15);
            char[] cArr = this.buffer;
            System.arraycopy(cArr, i14, cArr, i14 + length, this.size - i14);
            this.size = i15;
            str.getChars(0, length, this.buffer, i14);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public StrBuilder append(CharSequence charSequence, int i14, int i15) {
        if (charSequence == null) {
            return appendNull();
        }
        return append(charSequence.toString(), i14, i15);
    }

    public StrBuilder insert(int i14, char[] cArr) {
        validateIndex(i14);
        if (cArr == null) {
            return insert(i14, this.nullText);
        }
        int length = cArr.length;
        if (length > 0) {
            ensureCapacity(this.size + length);
            char[] cArr2 = this.buffer;
            System.arraycopy(cArr2, i14, cArr2, i14 + length, this.size - i14);
            System.arraycopy(cArr, 0, this.buffer, i14, length);
            this.size += length;
        }
        return this;
    }

    public StrBuilder append(String str) {
        if (str == null) {
            return appendNull();
        }
        int length = str.length();
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            str.getChars(0, length, this.buffer, length2);
            this.size += length;
        }
        return this;
    }

    public StrBuilder append(String str, int i14, int i15) {
        int i16;
        if (str == null) {
            return appendNull();
        }
        if (i14 >= 0 && i14 <= str.length()) {
            if (i15 < 0 || (i16 = i14 + i15) > str.length()) {
                e.k("length must be valid");
                return null;
            }
            if (i15 > 0) {
                int length = length();
                ensureCapacity(length + i15);
                str.getChars(i14, i16, this.buffer, length);
                this.size += i15;
            }
            return this;
        }
        e.k("startIndex must be valid");
        return null;
    }

    public StrBuilder insert(int i14, char[] cArr, int i15, int i16) {
        validateIndex(i14);
        if (cArr == null) {
            return insert(i14, this.nullText);
        }
        if (i15 >= 0 && i15 <= cArr.length) {
            if (i16 < 0 || i15 + i16 > cArr.length) {
                throw new StringIndexOutOfBoundsException(j.h(i16, "Invalid length: "));
            }
            if (i16 > 0) {
                ensureCapacity(this.size + i16);
                char[] cArr2 = this.buffer;
                System.arraycopy(cArr2, i14, cArr2, i14 + i16, this.size - i14);
                System.arraycopy(cArr, i15, this.buffer, i14, i16);
                this.size += i16;
            }
            return this;
        }
        throw new StringIndexOutOfBoundsException(j.h(i15, "Invalid offset: "));
    }

    public StrBuilder append(String str, Object... objArr) {
        return append(String.format(str, objArr));
    }

    public StrBuilder append(CharBuffer charBuffer) {
        if (charBuffer == null) {
            return appendNull();
        }
        if (charBuffer.hasArray()) {
            int iRemaining = charBuffer.remaining();
            int length = length();
            ensureCapacity(length + iRemaining);
            System.arraycopy(charBuffer.array(), charBuffer.position() + charBuffer.arrayOffset(), this.buffer, length, iRemaining);
            this.size += iRemaining;
            return this;
        }
        append(charBuffer.toString());
        return this;
    }

    public StrBuilder insert(int i14, Object obj) {
        if (obj == null) {
            return insert(i14, this.nullText);
        }
        return insert(i14, obj.toString());
    }

    public StrBuilder insert(int i14, char c14) {
        validateIndex(i14);
        ensureCapacity(this.size + 1);
        char[] cArr = this.buffer;
        System.arraycopy(cArr, i14, cArr, i14 + 1, this.size - i14);
        this.buffer[i14] = c14;
        this.size++;
        return this;
    }

    public StrBuilder append(CharBuffer charBuffer, int i14, int i15) {
        if (charBuffer == null) {
            return appendNull();
        }
        if (charBuffer.hasArray()) {
            int iRemaining = charBuffer.remaining();
            if (i14 < 0 || i14 > iRemaining) {
                e.k("startIndex must be valid");
                return null;
            }
            if (i15 >= 0 && i14 + i15 <= iRemaining) {
                int length = length();
                ensureCapacity(length + i15);
                System.arraycopy(charBuffer.array(), charBuffer.position() + charBuffer.arrayOffset() + i14, this.buffer, length, i15);
                this.size += i15;
                return this;
            }
            e.k("length must be valid");
            return null;
        }
        append(charBuffer.toString(), i14, i15);
        return this;
    }

    public StrBuilder insert(int i14, int i15) {
        return insert(i14, String.valueOf(i15));
    }

    public StrBuilder insert(int i14, long j8) {
        return insert(i14, String.valueOf(j8));
    }

    public StrBuilder insert(int i14, float f14) {
        return insert(i14, String.valueOf(f14));
    }

    public StrBuilder insert(int i14, double d14) {
        return insert(i14, String.valueOf(d14));
    }

    public StrBuilder append(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return appendNull();
        }
        int length = stringBuffer.length();
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            stringBuffer.getChars(0, length, this.buffer, length2);
            this.size += length;
        }
        return this;
    }

    public StrBuilder append(StringBuffer stringBuffer, int i14, int i15) {
        int i16;
        if (stringBuffer == null) {
            return appendNull();
        }
        if (i14 >= 0 && i14 <= stringBuffer.length()) {
            if (i15 < 0 || (i16 = i14 + i15) > stringBuffer.length()) {
                e.k("length must be valid");
                return null;
            }
            if (i15 > 0) {
                int length = length();
                ensureCapacity(length + i15);
                stringBuffer.getChars(i14, i16, this.buffer, length);
                this.size += i15;
            }
            return this;
        }
        e.k("startIndex must be valid");
        return null;
    }

    public StrBuilder append(StringBuilder sb3) {
        if (sb3 == null) {
            return appendNull();
        }
        int length = sb3.length();
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            sb3.getChars(0, length, this.buffer, length2);
            this.size += length;
        }
        return this;
    }

    public StrBuilder append(StringBuilder sb3, int i14, int i15) {
        int i16;
        if (sb3 == null) {
            return appendNull();
        }
        if (i14 >= 0 && i14 <= sb3.length()) {
            if (i15 < 0 || (i16 = i14 + i15) > sb3.length()) {
                e.k("length must be valid");
                return null;
            }
            if (i15 > 0) {
                int length = length();
                ensureCapacity(length + i15);
                sb3.getChars(i14, i16, this.buffer, length);
                this.size += i15;
            }
            return this;
        }
        e.k("startIndex must be valid");
        return null;
    }

    public StrBuilder append(StrBuilder strBuilder) {
        if (strBuilder == null) {
            return appendNull();
        }
        int length = strBuilder.length();
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            System.arraycopy(strBuilder.buffer, 0, this.buffer, length2, length);
            this.size += length;
        }
        return this;
    }

    public StrBuilder append(StrBuilder strBuilder, int i14, int i15) {
        int i16;
        if (strBuilder == null) {
            return appendNull();
        }
        if (i14 >= 0 && i14 <= strBuilder.length()) {
            if (i15 < 0 || (i16 = i14 + i15) > strBuilder.length()) {
                e.k("length must be valid");
                return null;
            }
            if (i15 > 0) {
                int length = length();
                ensureCapacity(length + i15);
                strBuilder.getChars(i14, i16, this.buffer, length);
                this.size += i15;
            }
            return this;
        }
        e.k("startIndex must be valid");
        return null;
    }

    public StrBuilder append(char[] cArr) {
        if (cArr == null) {
            return appendNull();
        }
        int length = cArr.length;
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            System.arraycopy(cArr, 0, this.buffer, length2, length);
            this.size += length;
        }
        return this;
    }

    public StrBuilder append(char[] cArr, int i14, int i15) {
        if (cArr == null) {
            return appendNull();
        }
        if (i14 >= 0 && i14 <= cArr.length) {
            if (i15 < 0 || i14 + i15 > cArr.length) {
                throw new StringIndexOutOfBoundsException(j.h(i15, "Invalid length: "));
            }
            if (i15 > 0) {
                int length = length();
                ensureCapacity(length + i15);
                System.arraycopy(cArr, i14, this.buffer, length, i15);
                this.size += i15;
            }
            return this;
        }
        throw new StringIndexOutOfBoundsException(j.h(i15, "Invalid startIndex: "));
    }

    @Override // java.lang.Appendable
    public StrBuilder append(char c14) {
        ensureCapacity(length() + 1);
        char[] cArr = this.buffer;
        int i14 = this.size;
        this.size = i14 + 1;
        cArr[i14] = c14;
        return this;
    }

    public StrBuilder append(int i14) {
        return append(String.valueOf(i14));
    }

    public StrBuilder append(long j8) {
        return append(String.valueOf(j8));
    }

    public StrBuilder append(float f14) {
        return append(String.valueOf(f14));
    }

    public StrBuilder append(double d14) {
        return append(String.valueOf(d14));
    }
}
