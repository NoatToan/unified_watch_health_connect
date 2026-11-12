package com.google.gdata.util.common.base;

import java.io.IOException;
import org.apache.commons.lang3.e;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UnicodeEscaper implements Escaper {
    private static final int DEST_PAD = 32;
    private static final ThreadLocal<char[]> DEST_TL = new ThreadLocal<char[]>() { // from class: com.google.gdata.util.common.base.UnicodeEscaper.2
        @Override // java.lang.ThreadLocal
        public char[] initialValue() {
            return new char[1024];
        }
    };

    public static final int codePointAt(CharSequence charSequence, int i14, int i15) {
        if (i14 >= i15) {
            e.v("Index exceeds specified range");
            return 0;
        }
        int i16 = i14 + 1;
        char cCharAt = charSequence.charAt(i14);
        if (cCharAt < 55296 || cCharAt > 57343) {
            return cCharAt;
        }
        if (cCharAt > 56319) {
            throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt + "' with value " + ((int) cCharAt) + " at index " + i14);
        }
        if (i16 == i15) {
            return -cCharAt;
        }
        char cCharAt2 = charSequence.charAt(i16);
        if (Character.isLowSurrogate(cCharAt2)) {
            return Character.toCodePoint(cCharAt, cCharAt2);
        }
        throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt2 + "' with value " + ((int) cCharAt2) + " at index " + i16);
    }

    private static final char[] growBuffer(char[] cArr, int i14, int i15) {
        char[] cArr2 = new char[i15];
        if (i14 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i14);
        }
        return cArr2;
    }

    @Override // com.google.gdata.util.common.base.Escaper
    public String escape(String str) {
        int length = str.length();
        int iNextEscapeIndex = nextEscapeIndex(str, 0, length);
        return iNextEscapeIndex == length ? str : escapeSlow(str, iNextEscapeIndex);
    }

    public abstract char[] escape(int i14);

    public final String escapeSlow(String str, int i14) {
        int length = str.length();
        char[] cArrGrowBuffer = DEST_TL.get();
        int i15 = 0;
        int length2 = 0;
        while (i14 < length) {
            int iCodePointAt = codePointAt(str, i14, length);
            if (iCodePointAt < 0) {
                h.s("Trailing high surrogate at end of input");
                return null;
            }
            char[] cArrEscape = escape(iCodePointAt);
            if (cArrEscape != null) {
                int i16 = i14 - i15;
                int i17 = length2 + i16;
                int length3 = cArrEscape.length + i17;
                if (cArrGrowBuffer.length < length3) {
                    cArrGrowBuffer = growBuffer(cArrGrowBuffer, length2, (length - i14) + length3 + 32);
                }
                if (i16 > 0) {
                    str.getChars(i15, i14, cArrGrowBuffer, length2);
                    length2 = i17;
                }
                if (cArrEscape.length > 0) {
                    System.arraycopy(cArrEscape, 0, cArrGrowBuffer, length2, cArrEscape.length);
                    length2 += cArrEscape.length;
                }
            }
            i15 = (Character.isSupplementaryCodePoint(iCodePointAt) ? 2 : 1) + i14;
            i14 = nextEscapeIndex(str, i15, length);
        }
        int i18 = length - i15;
        if (i18 > 0) {
            int i19 = i18 + length2;
            if (cArrGrowBuffer.length < i19) {
                cArrGrowBuffer = growBuffer(cArrGrowBuffer, length2, i19);
            }
            str.getChars(i15, length, cArrGrowBuffer, length2);
            length2 = i19;
        }
        return new String(cArrGrowBuffer, 0, length2);
    }

    public int nextEscapeIndex(CharSequence charSequence, int i14, int i15) {
        while (i14 < i15) {
            int iCodePointAt = codePointAt(charSequence, i14, i15);
            if (iCodePointAt < 0 || escape(iCodePointAt) != null) {
                break;
            }
            i14 += Character.isSupplementaryCodePoint(iCodePointAt) ? 2 : 1;
        }
        return i14;
    }

    @Override // com.google.gdata.util.common.base.Escaper
    public Appendable escape(final Appendable appendable) {
        Preconditions.checkNotNull(appendable);
        return new Appendable() { // from class: com.google.gdata.util.common.base.UnicodeEscaper.1
            int pendingHighSurrogate = -1;
            char[] decodedChars = new char[2];

            private void outputChars(char[] cArr, int i14) throws IOException {
                for (int i15 = 0; i15 < i14; i15++) {
                    appendable.append(cArr[i15]);
                }
            }

            @Override // java.lang.Appendable
            public Appendable append(char c14) throws IOException {
                if (this.pendingHighSurrogate != -1) {
                    if (!Character.isLowSurrogate(c14)) {
                        throw new IllegalArgumentException("Expected low surrogate character but got '" + c14 + "' with value " + ((int) c14));
                    }
                    char[] cArrEscape = UnicodeEscaper.this.escape(Character.toCodePoint((char) this.pendingHighSurrogate, c14));
                    if (cArrEscape != null) {
                        outputChars(cArrEscape, cArrEscape.length);
                    } else {
                        appendable.append((char) this.pendingHighSurrogate);
                        appendable.append(c14);
                    }
                    this.pendingHighSurrogate = -1;
                    return this;
                }
                if (Character.isHighSurrogate(c14)) {
                    this.pendingHighSurrogate = c14;
                    return this;
                }
                if (Character.isLowSurrogate(c14)) {
                    throw new IllegalArgumentException("Unexpected low surrogate character '" + c14 + "' with value " + ((int) c14));
                }
                char[] cArrEscape2 = UnicodeEscaper.this.escape(c14);
                if (cArrEscape2 != null) {
                    outputChars(cArrEscape2, cArrEscape2.length);
                    return this;
                }
                appendable.append(c14);
                return this;
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence, int i14, int i15) throws IOException {
                int i16;
                if (i14 < i15) {
                    if (this.pendingHighSurrogate != -1) {
                        int i17 = i14 + 1;
                        char cCharAt = charSequence.charAt(i14);
                        if (Character.isLowSurrogate(cCharAt)) {
                            char[] cArrEscape = UnicodeEscaper.this.escape(Character.toCodePoint((char) this.pendingHighSurrogate, cCharAt));
                            if (cArrEscape != null) {
                                outputChars(cArrEscape, cArrEscape.length);
                                i14 = i17;
                            } else {
                                appendable.append((char) this.pendingHighSurrogate);
                            }
                            this.pendingHighSurrogate = -1;
                            i16 = i14;
                            i14 = i17;
                        } else {
                            h.s(k.f("Expected low surrogate character but got ", cCharAt));
                            return null;
                        }
                    } else {
                        i16 = i14;
                    }
                    while (true) {
                        int iNextEscapeIndex = UnicodeEscaper.this.nextEscapeIndex(charSequence, i14, i15);
                        if (iNextEscapeIndex > i16) {
                            appendable.append(charSequence, i16, iNextEscapeIndex);
                        }
                        if (iNextEscapeIndex == i15) {
                            break;
                        }
                        int iCodePointAt = UnicodeEscaper.codePointAt(charSequence, iNextEscapeIndex, i15);
                        if (iCodePointAt < 0) {
                            this.pendingHighSurrogate = -iCodePointAt;
                            return this;
                        }
                        char[] cArrEscape2 = UnicodeEscaper.this.escape(iCodePointAt);
                        if (cArrEscape2 != null) {
                            outputChars(cArrEscape2, cArrEscape2.length);
                        } else {
                            outputChars(this.decodedChars, Character.toChars(iCodePointAt, this.decodedChars, 0));
                        }
                        i16 = (Character.isSupplementaryCodePoint(iCodePointAt) ? 2 : 1) + iNextEscapeIndex;
                        i14 = i16;
                    }
                }
                return this;
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence) {
                return append(charSequence, 0, charSequence.length());
            }
        };
    }
}
