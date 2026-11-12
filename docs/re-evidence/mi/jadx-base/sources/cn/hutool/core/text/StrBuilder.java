package cn.hutool.core.text;

import defpackage.p8i;
import defpackage.qj1;
import defpackage.yj4;
import java.io.Serializable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class StrBuilder implements CharSequence, Appendable, Serializable {
    public static final int DEFAULT_CAPACITY = 16;
    private static final long serialVersionUID = 6341229705927508451L;
    private int position;
    private char[] value;

    public StrBuilder() {
        this(16);
    }

    public static StrBuilder create() {
        return new StrBuilder();
    }

    private void ensureCapacity(int i) {
        if (i - this.value.length > 0) {
            expandCapacity(i);
        }
    }

    private void expandCapacity(int i) {
        char[] cArr = this.value;
        int length = (cArr.length << 1) + 2;
        if (length - i >= 0) {
            i = length;
        }
        if (i < 0) {
            throw new OutOfMemoryError("Capacity is too long and max than Integer.MAX");
        }
        this.value = Arrays.copyOf(cArr, i);
    }

    private void moveDataAfterIndex(int i, int i2) {
        ensureCapacity(Math.max(this.position, i) + i2);
        int i3 = this.position;
        if (i < i3) {
            char[] cArr = this.value;
            System.arraycopy(cArr, i, cArr, i2 + i, i3 - i);
        } else if (i > i3) {
            Arrays.fill(this.value, i3, i, ' ');
        }
    }

    private static int totalLength(CharSequence... charSequenceArr) {
        int length = charSequenceArr.length;
        int length2 = 0;
        for (int i = 0; i < length; i++) {
            CharSequence charSequence = charSequenceArr[i];
            length2 += charSequence == null ? 4 : charSequence.length();
        }
        return length2;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        if (i < 0) {
            i += this.position;
        }
        if (i < 0 || i > this.position) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return this.value[i];
    }

    public StrBuilder clear() {
        return reset();
    }

    public StrBuilder del(int i, int i2) throws StringIndexOutOfBoundsException {
        if (i < 0) {
            i = 0;
        }
        int i3 = this.position;
        if (i2 >= i3) {
            this.position = i;
            return this;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int i4 = i2 - i;
        if (i4 > 0) {
            char[] cArr = this.value;
            System.arraycopy(cArr, i + i4, cArr, i, i3 - i2);
            this.position -= i4;
        } else if (i4 < 0) {
            throw new StringIndexOutOfBoundsException("Start is greater than End.");
        }
        return this;
    }

    public StrBuilder delTo(int i) {
        if (i < 0) {
            i = 0;
        }
        return del(i, this.position);
    }

    public StrBuilder getChars(int i, int i2, char[] cArr, int i3) {
        int i4 = 0;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0 || i2 > (i4 = this.position)) {
            i2 = i4;
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException("srcBegin > srcEnd");
        }
        System.arraycopy(this.value, i, cArr, i3, i2 - i);
        return this;
    }

    public boolean hasContent() {
        return this.position > 0;
    }

    public StrBuilder insert(int i, Object obj) {
        return obj instanceof CharSequence ? insert(i, (CharSequence) obj) : insert(i, (CharSequence) yj4.w(obj));
    }

    public boolean isEmpty() {
        return this.position == 0;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.position;
    }

    public StrBuilder reset() {
        this.position = 0;
        return this;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return subString(i, i2);
    }

    public String subString(int i) {
        return subString(i, this.position);
    }

    public String toString(boolean z) {
        int i = this.position;
        if (i <= 0) {
            return "";
        }
        String str = new String(this.value, 0, i);
        if (z) {
            reset();
        }
        return str;
    }

    public String toStringAndReset() {
        return toString(true);
    }

    public StrBuilder(int i) {
        this.value = new char[i];
    }

    public static StrBuilder create(int i) {
        return new StrBuilder(i);
    }

    public String subString(int i, int i2) {
        return new String(this.value, i, i2 - i);
    }

    public static StrBuilder create(CharSequence... charSequenceArr) {
        return new StrBuilder(charSequenceArr);
    }

    public StrBuilder(CharSequence... charSequenceArr) {
        this(qj1.D(charSequenceArr) ? 16 : 16 + totalLength(charSequenceArr));
        for (CharSequence charSequence : charSequenceArr) {
            append(charSequence);
        }
    }

    public StrBuilder append(Object obj) {
        return insert(this.position, obj);
    }

    public StrBuilder insert(int i, char c) {
        if (i < 0) {
            i += this.position;
        }
        if (i >= 0) {
            moveDataAfterIndex(i, 1);
            this.value[i] = c;
            this.position = Math.max(this.position, i) + 1;
            return this;
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    @Override // java.lang.Appendable
    public StrBuilder append(char c) {
        return insert(this.position, c);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return toString(false);
    }

    public StrBuilder append(char[] cArr) {
        return p8i.d(cArr) ? this : append(cArr, 0, cArr.length);
    }

    public StrBuilder append(char[] cArr, int i, int i2) {
        return insert(this.position, cArr, i, i2);
    }

    @Override // java.lang.Appendable
    public StrBuilder append(CharSequence charSequence) {
        return insert(this.position, charSequence);
    }

    public StrBuilder insert(int i, char[] cArr) {
        return p8i.d(cArr) ? this : insert(i, cArr, 0, cArr.length);
    }

    @Override // java.lang.Appendable
    public StrBuilder append(CharSequence charSequence, int i, int i2) {
        return insert(this.position, charSequence, i, i2);
    }

    public StrBuilder insert(int i, char[] cArr, int i2, int i3) {
        if (p8i.d(cArr) || i2 > cArr.length || i3 <= 0) {
            return this;
        }
        if (i < 0) {
            i += this.position;
        }
        if (i >= 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 + i3 > cArr.length) {
                i3 = cArr.length - i2;
            }
            moveDataAfterIndex(i, i3);
            System.arraycopy(cArr, i2, this.value, i, i3);
            this.position = Math.max(this.position, i) + i3;
            return this;
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    public StrBuilder insert(int i, CharSequence charSequence) {
        if (i < 0) {
            i += this.position;
        }
        if (i >= 0) {
            if (charSequence == null) {
                charSequence = "";
            }
            int length = charSequence.length();
            moveDataAfterIndex(i, charSequence.length());
            int i2 = 0;
            if (charSequence instanceof String) {
                ((String) charSequence).getChars(0, length, this.value, i);
            } else if (charSequence instanceof StringBuilder) {
                ((StringBuilder) charSequence).getChars(0, length, this.value, i);
            } else if (charSequence instanceof StringBuffer) {
                ((StringBuffer) charSequence).getChars(0, length, this.value, i);
            } else if (charSequence instanceof StrBuilder) {
                ((StrBuilder) charSequence).getChars(0, length, this.value, i);
            } else {
                int i3 = this.position;
                while (i2 < length) {
                    this.value[i3] = charSequence.charAt(i2);
                    i2++;
                    i3++;
                }
            }
            this.position = Math.max(this.position, i) + length;
            return this;
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    public StrBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        if (charSequence == null) {
            charSequence = AbstractJsonLexerKt.NULL;
        }
        int length = charSequence.length();
        if (i2 > length) {
            return this;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > length) {
            i3 = length;
        }
        if (i2 >= i3) {
            return this;
        }
        if (i < 0) {
            i += this.position;
        }
        if (i >= 0) {
            int i4 = i3 - i2;
            moveDataAfterIndex(i, i4);
            int i5 = this.position;
            while (i2 < i3) {
                this.value[i5] = charSequence.charAt(i2);
                i2++;
                i5++;
            }
            this.position = Math.max(this.position, i) + i4;
            return this;
        }
        throw new StringIndexOutOfBoundsException(i);
    }
}
