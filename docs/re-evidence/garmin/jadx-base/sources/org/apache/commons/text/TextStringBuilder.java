package org.apache.commons.text;

import am.j;
import com.google.firebase.messaging.l;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o2.c;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.e;
import org.apache.commons.text.matcher.StringMatcher;

/* JADX INFO: loaded from: classes3.dex */
public class TextStringBuilder implements CharSequence, Appendable, Serializable, Builder<String> {
    static final int CAPACITY = 32;
    private static final int EOS = -1;
    private static final char SPACE = ' ';
    private static final long serialVersionUID = 1;
    private char[] buffer;
    private String newLine;
    private String nullText;
    private int reallocations;
    private int size;
    private static final int FALSE_STRING_SIZE = Boolean.FALSE.toString().length();
    private static final int TRUE_STRING_SIZE = Boolean.TRUE.toString().length();

    public class TextStringBuilderTokenizer extends StringTokenizer {
        public TextStringBuilderTokenizer() {
        }

        @Override // org.apache.commons.text.StringTokenizer
        public String getContent() {
            String content = super.getContent();
            return content == null ? TextStringBuilder.this.toString() : content;
        }

        @Override // org.apache.commons.text.StringTokenizer
        public List<String> tokenize(char[] cArr, int i14, int i15) {
            return cArr == null ? super.tokenize(TextStringBuilder.this.getBuffer(), 0, TextStringBuilder.this.size()) : super.tokenize(cArr, i14, i15);
        }
    }

    private TextStringBuilder(char[] cArr, int i14) {
        Objects.requireNonNull(cArr, "initialBuffer");
        this.buffer = cArr;
        if (i14 < 0 || i14 > cArr.length) {
            l.h(", length=", cArr.length, i14, "initialBuffer.length=");
            throw null;
        }
        this.size = i14;
    }

    private void appendFalse(int i14) {
        char[] cArr = this.buffer;
        cArr[i14] = 'f';
        cArr[i14 + 1] = 'a';
        cArr[i14 + 2] = 'l';
        cArr[i14 + 3] = 's';
        cArr[i14 + 4] = 'e';
        this.size += FALSE_STRING_SIZE;
    }

    private void appendTrue(int i14) {
        char[] cArr = this.buffer;
        cArr[i14] = 't';
        cArr[i14 + 1] = 'r';
        cArr[i14 + 2] = 'u';
        cArr[i14 + 3] = 'e';
        this.size += TRUE_STRING_SIZE;
    }

    private void deleteImpl(int i14, int i15, int i16) {
        char[] cArr = this.buffer;
        System.arraycopy(cArr, i15, cArr, i14, this.size - i15);
        this.size -= i16;
    }

    private void reallocate(int i14) {
        this.buffer = Arrays.copyOf(this.buffer, i14);
        this.reallocations++;
    }

    private TextStringBuilder replaceImpl(StringMatcher stringMatcher, String str, int i14, int i15, int i16) {
        String str2;
        if (stringMatcher != null && this.size != 0) {
            int length = str == null ? 0 : str.length();
            int i17 = i14;
            while (i17 < i15 && i16 != 0) {
                int iIsMatch = stringMatcher.isMatch(this.buffer, i17, i14, i15);
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

    public static TextStringBuilder wrap(char[] cArr) {
        Objects.requireNonNull(cArr, "initialBuffer");
        return new TextStringBuilder(cArr, cArr.length);
    }

    public TextStringBuilder append(CharBuffer charBuffer, int i14, int i15) {
        if (charBuffer == null) {
            return appendNull();
        }
        if (!charBuffer.hasArray()) {
            append(charBuffer.toString(), i14, i15);
            return this;
        }
        int iRemaining = charBuffer.remaining();
        if (i14 < 0 || i14 > iRemaining) {
            e.k("startIndex must be valid");
            return null;
        }
        if (i15 < 0 || i14 + i15 > iRemaining) {
            e.k("length must be valid");
            return null;
        }
        int length = length();
        ensureCapacity(length + i15);
        System.arraycopy(charBuffer.array(), charBuffer.position() + charBuffer.arrayOffset() + i14, this.buffer, length, i15);
        this.size += i15;
        return this;
    }

    public TextStringBuilder appendAll(Iterable<?> iterable) {
        if (iterable != null) {
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                append(it.next());
            }
        }
        return this;
    }

    public TextStringBuilder appendFixedWidthPadLeft(Object obj, int i14, char c14) {
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

    public TextStringBuilder appendFixedWidthPadRight(Object obj, int i14, char c14) {
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

    public TextStringBuilder appendNewLine() {
        String str = this.newLine;
        if (str != null) {
            return append(str);
        }
        append(System.lineSeparator());
        return this;
    }

    public TextStringBuilder appendNull() {
        String str = this.nullText;
        return str == null ? this : append(str);
    }

    public TextStringBuilder appendPadding(int i14, char c14) {
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

    public TextStringBuilder appendSeparator(char c14, char c15) {
        if (isEmpty()) {
            append(c15);
            return this;
        }
        append(c14);
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

    public TextStringBuilder appendWithSeparators(Iterable<?> iterable, String str) {
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

    public TextStringBuilder appendln(boolean z14) {
        return append(z14).appendNewLine();
    }

    public Reader asReader() {
        return new TextStringBuilderReader();
    }

    public StringTokenizer asTokenizer() {
        return new TextStringBuilderTokenizer();
    }

    public Writer asWriter() {
        return new TextStringBuilderWriter();
    }

    public int capacity() {
        return this.buffer.length;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i14) {
        validateIndex(i14);
        return this.buffer[i14];
    }

    public TextStringBuilder clear() {
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

    public TextStringBuilder delete(int i14, int i15) {
        int iValidateRange = validateRange(i14, i15);
        int i16 = iValidateRange - i14;
        if (i16 > 0) {
            deleteImpl(i14, iValidateRange, i16);
        }
        return this;
    }

    public TextStringBuilder deleteAll(char c14) {
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

    public TextStringBuilder deleteCharAt(int i14) {
        validateIndex(i14);
        deleteImpl(i14, i14 + 1, 1);
        return this;
    }

    public TextStringBuilder deleteFirst(String str) {
        int iIndexOf;
        int length = str == null ? 0 : str.length();
        if (length > 0 && (iIndexOf = indexOf(str, 0)) >= 0) {
            deleteImpl(iIndexOf, iIndexOf + length, length);
        }
        return this;
    }

    public char drainChar(int i14) {
        validateIndex(i14);
        char c14 = this.buffer[i14];
        deleteCharAt(i14);
        return c14;
    }

    public int drainChars(int i14, int i15, char[] cArr, int i16) {
        int i17 = i15 - i14;
        if (isEmpty() || i17 == 0 || cArr.length == 0) {
            return 0;
        }
        int iMin = Math.min(Math.min(this.size, i17), cArr.length - i16);
        getChars(i14, iMin, cArr, i16);
        delete(i14, iMin);
        return iMin;
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

    public TextStringBuilder ensureCapacity(int i14) {
        if (i14 > this.buffer.length) {
            reallocate(i14 * 2);
        }
        return this;
    }

    public boolean equals(Object obj) {
        return (obj instanceof TextStringBuilder) && equals((TextStringBuilder) obj);
    }

    public boolean equalsIgnoreCase(TextStringBuilder textStringBuilder) {
        if (this == textStringBuilder) {
            return true;
        }
        int i14 = this.size;
        if (i14 != textStringBuilder.size) {
            return false;
        }
        char[] cArr = this.buffer;
        char[] cArr2 = textStringBuilder.buffer;
        for (int i15 = i14 - 1; i15 >= 0; i15--) {
            char c14 = cArr[i15];
            char c15 = cArr2[i15];
            if (c14 != c15 && Character.toUpperCase(c14) != Character.toUpperCase(c15)) {
                return false;
            }
        }
        return true;
    }

    public char[] getBuffer() {
        return this.buffer;
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
        return Arrays.hashCode(this.buffer);
    }

    public int indexOf(String str, int i14) {
        int iMax = Math.max(0, i14);
        if (str != null && iMax < this.size) {
            int length = str.length();
            if (length == 1) {
                return indexOf(str.charAt(0), iMax);
            }
            if (length == 0) {
                return iMax;
            }
            int i15 = this.size;
            if (length > i15) {
                return -1;
            }
            char[] cArr = this.buffer;
            int i16 = (i15 - length) + 1;
            while (iMax < i16) {
                for (int i17 = 0; i17 < length; i17++) {
                    if (str.charAt(i17) != cArr[iMax + i17]) {
                        iMax++;
                    }
                }
                return iMax;
            }
        }
        return -1;
    }

    public TextStringBuilder insert(int i14, char[] cArr, int i15, int i16) {
        validateIndex(i14);
        if (cArr == null) {
            return insert(i14, this.nullText);
        }
        if (i15 < 0 || i15 > cArr.length) {
            throw new StringIndexOutOfBoundsException(j.h(i15, "Invalid offset: "));
        }
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

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isNotEmpty() {
        return this.size != 0;
    }

    public boolean isReallocated() {
        return this.reallocations > 0;
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

    public TextStringBuilder minimizeCapacity() {
        int length = this.buffer.length;
        int i14 = this.size;
        if (length > i14) {
            reallocate(i14);
        }
        return this;
    }

    public int readFrom(Readable readable) throws IOException {
        if (readable instanceof Reader) {
            return readFrom((Reader) readable);
        }
        if (readable instanceof CharBuffer) {
            return readFrom((CharBuffer) readable);
        }
        int i14 = this.size;
        while (true) {
            ensureCapacity(this.size + 1);
            char[] cArr = this.buffer;
            int i15 = this.size;
            int i16 = readable.read(CharBuffer.wrap(cArr, i15, cArr.length - i15));
            int i17 = this.size;
            if (i16 == -1) {
                return i17 - i14;
            }
            this.size = i17 + i16;
        }
    }

    public TextStringBuilder replace(int i14, int i15, String str) {
        int iValidateRange = validateRange(i14, i15);
        replaceImpl(i14, iValidateRange, iValidateRange - i14, str, str == null ? 0 : str.length());
        return this;
    }

    public TextStringBuilder replaceAll(String str, String str2) {
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

    public TextStringBuilder replaceFirst(String str, String str2) {
        int iIndexOf;
        int length = str == null ? 0 : str.length();
        if (length <= 0 || (iIndexOf = indexOf(str, 0)) < 0) {
            return this;
        }
        replaceImpl(iIndexOf, iIndexOf + length, length, str2, str2 != null ? str2.length() : 0);
        return this;
    }

    public TextStringBuilder reverse() {
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

    public TextStringBuilder set(CharSequence charSequence) {
        clear();
        append(charSequence);
        return this;
    }

    public TextStringBuilder setCharAt(int i14, char c14) {
        validateIndex(i14);
        this.buffer[i14] = c14;
        return this;
    }

    public TextStringBuilder setLength(int i14) {
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
            int i16 = this.size;
            this.size = i14;
            Arrays.fill(this.buffer, i16, i14, (char) 0);
        }
        return this;
    }

    public TextStringBuilder setNewLineText(String str) {
        this.newLine = str;
        return this;
    }

    public TextStringBuilder setNullText(String str) {
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
        int iValidateRange = validateRange(i14, i15);
        return iValidateRange - i14 == 0 ? ArrayUtils.EMPTY_CHAR_ARRAY : Arrays.copyOfRange(this.buffer, i14, iValidateRange);
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

    public TextStringBuilder trim() {
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
        if (i14 < 0 || i14 >= this.size) {
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

    public class TextStringBuilderWriter extends Writer {
        public TextStringBuilderWriter() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i14) {
            TextStringBuilder.this.append((char) i14);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i14, int i15) {
            TextStringBuilder.this.append(cArr, i14, i15);
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            TextStringBuilder.this.append(cArr);
        }

        @Override // java.io.Writer
        public void write(String str) {
            TextStringBuilder.this.append(str);
        }

        @Override // java.io.Writer
        public void write(String str, int i14, int i15) {
            TextStringBuilder.this.append(str, i14, i15);
        }
    }

    public TextStringBuilder appendln(char c14) {
        return append(c14).appendNewLine();
    }

    public TextStringBuilder appendln(char[] cArr) {
        return append(cArr).appendNewLine();
    }

    public TextStringBuilder appendln(char[] cArr, int i14, int i15) {
        return append(cArr, i14, i15).appendNewLine();
    }

    public static TextStringBuilder wrap(char[] cArr, int i14) {
        return new TextStringBuilder(cArr, i14);
    }

    public TextStringBuilder appendln(double d14) {
        return append(d14).appendNewLine();
    }

    public TextStringBuilder appendln(float f14) {
        return append(f14).appendNewLine();
    }

    public String substring(int i14) {
        return substring(i14, this.size);
    }

    public TextStringBuilder appendSeparator(char c14) {
        if (isNotEmpty()) {
            append(c14);
        }
        return this;
    }

    public TextStringBuilder appendln(int i14) {
        return append(i14).appendNewLine();
    }

    public TextStringBuilder appendln(long j8) {
        return append(j8).appendNewLine();
    }

    public TextStringBuilder appendSeparator(char c14, int i14) {
        if (i14 > 0) {
            append(c14);
        }
        return this;
    }

    public TextStringBuilder appendln(Object obj) {
        return append(obj).appendNewLine();
    }

    public boolean equals(TextStringBuilder textStringBuilder) {
        return textStringBuilder != null && Arrays.equals(this.buffer, textStringBuilder.buffer);
    }

    public TextStringBuilder appendSeparator(String str) {
        return appendSeparator(str, (String) null);
    }

    public TextStringBuilder appendln(String str) {
        return append(str).appendNewLine();
    }

    public TextStringBuilder appendSeparator(String str, int i14) {
        if (str != null && i14 > 0) {
            append(str);
        }
        return this;
    }

    public TextStringBuilder appendln(String str, int i14, int i15) {
        return append(str, i14, i15).appendNewLine();
    }

    public boolean contains(String str) {
        return indexOf(str, 0) >= 0;
    }

    public char[] toCharArray() {
        int i14 = this.size;
        return i14 == 0 ? ArrayUtils.EMPTY_CHAR_ARRAY : Arrays.copyOf(this.buffer, i14);
    }

    public TextStringBuilder appendSeparator(String str, String str2) {
        if (isEmpty()) {
            str = str2;
        }
        if (str != null) {
            append(str);
        }
        return this;
    }

    public TextStringBuilder appendln(String str, Object... objArr) {
        return append(str, objArr).appendNewLine();
    }

    public boolean contains(StringMatcher stringMatcher) {
        return indexOf(stringMatcher, 0) >= 0;
    }

    public TextStringBuilder appendln(StringBuffer stringBuffer) {
        return append(stringBuffer).appendNewLine();
    }

    public TextStringBuilder appendAll(Iterator<?> it) {
        if (it != null) {
            while (it.hasNext()) {
                append(it.next());
            }
        }
        return this;
    }

    public TextStringBuilder appendln(StringBuffer stringBuffer, int i14, int i15) {
        return append(stringBuffer, i14, i15).appendNewLine();
    }

    public TextStringBuilder appendln(StringBuilder sb3) {
        return append(sb3).appendNewLine();
    }

    public <T> TextStringBuilder appendAll(T... tArr) {
        if (tArr != null && tArr.length > 0) {
            for (T t7 : tArr) {
                append(t7);
            }
        }
        return this;
    }

    public TextStringBuilder appendln(StringBuilder sb3, int i14, int i15) {
        return append(sb3, i14, i15).appendNewLine();
    }

    public TextStringBuilder deleteFirst(char c14) {
        for (int i14 = 0; i14 < this.size; i14++) {
            if (this.buffer[i14] == c14) {
                deleteImpl(i14, i14 + 1, 1);
                return this;
            }
        }
        return this;
    }

    public TextStringBuilder replace(StringMatcher stringMatcher, String str, int i14, int i15, int i16) {
        return replaceImpl(stringMatcher, str, i14, validateRange(i14, i15), i16);
    }

    public TextStringBuilder appendln(TextStringBuilder textStringBuilder) {
        return append(textStringBuilder).appendNewLine();
    }

    public TextStringBuilder appendln(TextStringBuilder textStringBuilder, int i14, int i15) {
        return append(textStringBuilder, i14, i15).appendNewLine();
    }

    public TextStringBuilder deleteFirst(StringMatcher stringMatcher) {
        return replace(stringMatcher, null, 0, this.size, 1);
    }

    public TextStringBuilder() {
        this(32);
    }

    public TextStringBuilder(CharSequence charSequence) {
        this(StringUtils.length(charSequence) + 32);
        if (charSequence != null) {
            append(charSequence);
        }
    }

    public TextStringBuilder(int i14) {
        this.buffer = new char[i14 <= 0 ? 32 : i14];
    }

    public TextStringBuilder deleteAll(String str) {
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

    public TextStringBuilder(String str) {
        this(StringUtils.length(str) + 32);
        if (str != null) {
            append(str);
        }
    }

    public TextStringBuilder appendWithSeparators(Iterator<?> it, String str) {
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

    public char[] getChars(char[] cArr) {
        int length = length();
        if (cArr == null || cArr.length < length) {
            cArr = new char[length];
        }
        System.arraycopy(this.buffer, 0, cArr, 0, length);
        return cArr;
    }

    public TextStringBuilder replaceFirst(char c14, char c15) {
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

    public TextStringBuilder deleteAll(StringMatcher stringMatcher) {
        return replace(stringMatcher, null, 0, this.size, -1);
    }

    public TextStringBuilder replaceFirst(StringMatcher stringMatcher, String str) {
        return replace(stringMatcher, str, 0, this.size, 1);
    }

    public TextStringBuilder appendWithSeparators(Object[] objArr, String str) {
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

    public TextStringBuilder replaceAll(char c14, char c15) {
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

    public TextStringBuilder replaceAll(StringMatcher stringMatcher, String str) {
        return replace(stringMatcher, str, 0, this.size, -1);
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

    public int readFrom(CharBuffer charBuffer) {
        int i14 = this.size;
        int iRemaining = charBuffer.remaining();
        ensureCapacity(this.size + iRemaining);
        charBuffer.get(this.buffer, this.size, iRemaining);
        int i15 = this.size + iRemaining;
        this.size = i15;
        return i15 - i14;
    }

    public int readFrom(Reader reader) throws IOException {
        int i14 = this.size;
        ensureCapacity(i14 + 1);
        char[] cArr = this.buffer;
        int i15 = this.size;
        int i16 = reader.read(cArr, i15, cArr.length - i15);
        if (i16 == -1) {
            return -1;
        }
        do {
            int i17 = this.size + i16;
            this.size = i17;
            ensureCapacity(i17 + 1);
            char[] cArr2 = this.buffer;
            int i18 = this.size;
            i16 = reader.read(cArr2, i18, cArr2.length - i18);
        } while (i16 != -1);
        return this.size - i14;
    }

    public TextStringBuilder appendFixedWidthPadRight(int i14, int i15, char c14) {
        return appendFixedWidthPadRight(String.valueOf(i14), i15, c14);
    }

    public int indexOf(char c14, int i14) {
        int iMax = Math.max(0, i14);
        if (iMax >= this.size) {
            return -1;
        }
        char[] cArr = this.buffer;
        while (iMax < this.size) {
            if (cArr[iMax] == c14) {
                return iMax;
            }
            iMax++;
        }
        return -1;
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

    public TextStringBuilder appendFixedWidthPadLeft(int i14, int i15, char c14) {
        return appendFixedWidthPadLeft(String.valueOf(i14), i15, c14);
    }

    public int lastIndexOf(String str) {
        return lastIndexOf(str, this.size - 1);
    }

    public int lastIndexOf(char c14) {
        return lastIndexOf(c14, this.size - 1);
    }

    public int readFrom(Reader reader, int i14) throws IOException {
        if (i14 <= 0) {
            return 0;
        }
        int i15 = this.size;
        ensureCapacity(i15 + i14);
        int i16 = reader.read(this.buffer, this.size, i14);
        if (i16 == -1) {
            return -1;
        }
        do {
            i14 -= i16;
            int i17 = this.size + i16;
            this.size = i17;
            i16 = reader.read(this.buffer, i17, i14);
            if (i14 <= 0) {
                break;
            }
        } while (i16 != -1);
        return this.size - i15;
    }

    public class TextStringBuilderReader extends Reader {
        private int mark;
        private int pos;

        public TextStringBuilderReader() {
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
            if (this.pos >= TextStringBuilder.this.size()) {
                return -1;
            }
            if (this.pos + i15 > TextStringBuilder.this.size()) {
                i15 = TextStringBuilder.this.size() - this.pos;
            }
            TextStringBuilder textStringBuilder = TextStringBuilder.this;
            int i17 = this.pos;
            textStringBuilder.getChars(i17, i17 + i15, cArr, i14);
            this.pos += i15;
            return i15;
        }

        @Override // java.io.Reader
        public boolean ready() {
            return this.pos < TextStringBuilder.this.size();
        }

        @Override // java.io.Reader
        public void reset() {
            this.pos = this.mark;
        }

        @Override // java.io.Reader
        public long skip(long j8) {
            if (((long) this.pos) + j8 > TextStringBuilder.this.size()) {
                j8 = TextStringBuilder.this.size() - this.pos;
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
            TextStringBuilder textStringBuilder = TextStringBuilder.this;
            int i14 = this.pos;
            this.pos = i14 + 1;
            return textStringBuilder.charAt(i14);
        }
    }

    public int indexOf(String str) {
        return indexOf(str, 0);
    }

    public int lastIndexOf(StringMatcher stringMatcher) {
        return lastIndexOf(stringMatcher, this.size);
    }

    public int indexOf(char c14) {
        return indexOf(c14, 0);
    }

    public int lastIndexOf(StringMatcher stringMatcher, int i14) {
        int i15 = this.size;
        if (i14 >= i15) {
            i14 = i15 - 1;
        }
        if (stringMatcher != null && i14 >= 0) {
            char[] cArr = this.buffer;
            int i16 = i14 + 1;
            while (i14 >= 0) {
                if (stringMatcher.isMatch(cArr, i14, 0, i16) > 0) {
                    return i14;
                }
                i14--;
            }
        }
        return -1;
    }

    public int indexOf(StringMatcher stringMatcher) {
        return indexOf(stringMatcher, 0);
    }

    public int indexOf(StringMatcher stringMatcher, int i14) {
        int i15;
        int iMax = Math.max(0, i14);
        if (stringMatcher != null && iMax < (i15 = this.size)) {
            char[] cArr = this.buffer;
            for (int i16 = iMax; i16 < i15; i16++) {
                if (stringMatcher.isMatch(cArr, i16, iMax, i15) > 0) {
                    return i16;
                }
            }
        }
        return -1;
    }

    public TextStringBuilder insert(int i14, char c14) {
        validateIndex(i14);
        ensureCapacity(this.size + 1);
        char[] cArr = this.buffer;
        System.arraycopy(cArr, i14, cArr, i14 + 1, this.size - i14);
        this.buffer[i14] = c14;
        this.size++;
        return this;
    }

    public TextStringBuilder insert(int i14, char[] cArr) {
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

    public TextStringBuilder append(boolean z14) {
        int i14 = this.size;
        if (z14) {
            ensureCapacity(i14 + TRUE_STRING_SIZE);
            appendTrue(this.size);
            return this;
        }
        ensureCapacity(i14 + FALSE_STRING_SIZE);
        appendFalse(this.size);
        return this;
    }

    @Override // java.lang.Appendable
    public TextStringBuilder append(char c14) {
        ensureCapacity(length() + 1);
        char[] cArr = this.buffer;
        int i14 = this.size;
        this.size = i14 + 1;
        cArr[i14] = c14;
        return this;
    }

    public TextStringBuilder insert(int i14, boolean z14) {
        validateIndex(i14);
        int i15 = this.size;
        if (z14) {
            int i16 = TRUE_STRING_SIZE;
            ensureCapacity(i15 + i16);
            char[] cArr = this.buffer;
            System.arraycopy(cArr, i14, cArr, i16 + i14, this.size - i14);
            appendTrue(i14);
            return this;
        }
        int i17 = FALSE_STRING_SIZE;
        ensureCapacity(i15 + i17);
        char[] cArr2 = this.buffer;
        System.arraycopy(cArr2, i14, cArr2, i17 + i14, this.size - i14);
        appendFalse(i14);
        return this;
    }

    public TextStringBuilder append(char[] cArr) {
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

    public TextStringBuilder insert(int i14, double d14) {
        return insert(i14, String.valueOf(d14));
    }

    public TextStringBuilder append(char[] cArr, int i14, int i15) {
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

    public TextStringBuilder insert(int i14, float f14) {
        return insert(i14, String.valueOf(f14));
    }

    public TextStringBuilder insert(int i14, int i15) {
        return insert(i14, String.valueOf(i15));
    }

    public TextStringBuilder insert(int i14, long j8) {
        return insert(i14, String.valueOf(j8));
    }

    public TextStringBuilder insert(int i14, Object obj) {
        if (obj == null) {
            return insert(i14, this.nullText);
        }
        return insert(i14, obj.toString());
    }

    public TextStringBuilder insert(int i14, String str) {
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

    public TextStringBuilder append(CharBuffer charBuffer) {
        return append(charBuffer, 0, StringUtils.length(charBuffer));
    }

    @Override // java.lang.Appendable
    public TextStringBuilder append(CharSequence charSequence) {
        if (charSequence == null) {
            return appendNull();
        }
        if (charSequence instanceof TextStringBuilder) {
            return append((TextStringBuilder) charSequence);
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

    @Override // java.lang.Appendable
    public TextStringBuilder append(CharSequence charSequence, int i14, int i15) {
        if (charSequence == null) {
            return appendNull();
        }
        if (i15 <= 0) {
            e.k("endIndex must be valid");
            return null;
        }
        if (i14 < i15) {
            return append(charSequence.toString(), i14, i15 - i14);
        }
        e.k("endIndex must be greater than startIndex");
        return null;
    }

    public TextStringBuilder append(double d14) {
        return append(String.valueOf(d14));
    }

    public TextStringBuilder append(float f14) {
        return append(String.valueOf(f14));
    }

    public TextStringBuilder append(int i14) {
        return append(String.valueOf(i14));
    }

    public TextStringBuilder append(long j8) {
        return append(String.valueOf(j8));
    }

    public TextStringBuilder append(Object obj) {
        if (obj == null) {
            return appendNull();
        }
        if (obj instanceof CharSequence) {
            return append((CharSequence) obj);
        }
        return append(obj.toString());
    }

    public TextStringBuilder append(String str) {
        return append(str, 0, StringUtils.length(str));
    }

    public TextStringBuilder append(String str, int i14, int i15) {
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

    public TextStringBuilder append(String str, Object... objArr) {
        return append(String.format(str, objArr));
    }

    public TextStringBuilder append(StringBuffer stringBuffer) {
        return append(stringBuffer, 0, StringUtils.length(stringBuffer));
    }

    public TextStringBuilder append(StringBuffer stringBuffer, int i14, int i15) {
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

    public TextStringBuilder append(StringBuilder sb3) {
        return append(sb3, 0, StringUtils.length(sb3));
    }

    public TextStringBuilder append(StringBuilder sb3, int i14, int i15) {
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

    public TextStringBuilder append(TextStringBuilder textStringBuilder) {
        return append(textStringBuilder, 0, StringUtils.length(textStringBuilder));
    }

    public TextStringBuilder append(TextStringBuilder textStringBuilder, int i14, int i15) {
        int i16;
        if (textStringBuilder == null) {
            return appendNull();
        }
        if (i14 >= 0 && i14 <= textStringBuilder.length()) {
            if (i15 < 0 || (i16 = i14 + i15) > textStringBuilder.length()) {
                e.k("length must be valid");
                return null;
            }
            if (i15 > 0) {
                int length = length();
                ensureCapacity(length + i15);
                textStringBuilder.getChars(i14, i16, this.buffer, length);
                this.size += i15;
            }
            return this;
        }
        e.k("startIndex must be valid");
        return null;
    }
}
