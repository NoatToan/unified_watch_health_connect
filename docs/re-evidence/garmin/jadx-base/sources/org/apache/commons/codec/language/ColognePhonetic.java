package org.apache.commons.codec.language;

import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ColognePhonetic implements StringEncoder {
    private static final char CHAR_IGNORE = '-';
    private static final char[] AEIJOUY = {'A', 'E', 'I', 'J', 'O', 'U', 'Y'};
    private static final char[] CSZ = {'C', 'S', 'Z'};
    private static final char[] FPVW = {'F', 'P', 'V', 'W'};
    private static final char[] GKQ = {'G', 'K', 'Q'};
    private static final char[] CKQ = {'C', 'K', 'Q'};
    private static final char[] AHKLOQRUX = {'A', 'H', 'K', 'L', 'O', 'Q', 'R', 'U', 'X'};
    private static final char[] SZ = {'S', 'Z'};
    private static final char[] AHKOQUX = {'A', 'H', 'K', 'O', 'Q', 'U', 'X'};
    private static final char[] DTX = {'D', 'T', 'X'};

    public final class CologneInputBuffer extends CologneBuffer {
        public CologneInputBuffer(char[] cArr) {
            super(cArr);
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        public char[] copyData(int i14, int i15) {
            char[] cArr = new char[i15];
            char[] cArr2 = this.data;
            System.arraycopy(cArr2, (cArr2.length - this.length) + i14, cArr, 0, i15);
            return cArr;
        }

        public char getNextChar() {
            return this.data[getNextPos()];
        }

        public int getNextPos() {
            return this.data.length - this.length;
        }

        public char removeNext() {
            char nextChar = getNextChar();
            this.length--;
            return nextChar;
        }
    }

    public final class CologneOutputBuffer extends CologneBuffer {
        private char lastCode;

        public CologneOutputBuffer(int i14) {
            super(i14);
            this.lastCode = IOUtils.DIR_SEPARATOR_UNIX;
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        public char[] copyData(int i14, int i15) {
            return Arrays.copyOfRange(this.data, i14, i15);
        }

        public void put(char c14) {
            if (c14 != '-' && this.lastCode != c14 && (c14 != '0' || this.length == 0)) {
                char[] cArr = this.data;
                int i14 = this.length;
                cArr[i14] = c14;
                this.length = i14 + 1;
            }
            this.lastCode = c14;
        }
    }

    private static boolean arrayContains(char[] cArr, char c14) {
        for (char c15 : cArr) {
            if (c15 == c14) {
                return true;
            }
        }
        return false;
    }

    private char[] preprocess(String str) {
        char[] charArray = str.toUpperCase(Locale.GERMAN).toCharArray();
        for (int i14 = 0; i14 < charArray.length; i14++) {
            char c14 = charArray[i14];
            if (c14 == 196) {
                charArray[i14] = 'A';
            } else if (c14 == 214) {
                charArray[i14] = 'O';
            } else if (c14 == 220) {
                charArray[i14] = 'U';
            }
        }
        return charArray;
    }

    public String colognePhonetic(String str) {
        if (str == null) {
            return null;
        }
        CologneInputBuffer cologneInputBuffer = new CologneInputBuffer(preprocess(str));
        CologneOutputBuffer cologneOutputBuffer = new CologneOutputBuffer(cologneInputBuffer.length() * 2);
        char c14 = '-';
        while (!cologneInputBuffer.isEmpty()) {
            char cRemoveNext = cologneInputBuffer.removeNext();
            char nextChar = !cologneInputBuffer.isEmpty() ? cologneInputBuffer.getNextChar() : '-';
            if (cRemoveNext >= 'A' && cRemoveNext <= 'Z') {
                if (arrayContains(AEIJOUY, cRemoveNext)) {
                    cologneOutputBuffer.put('0');
                } else if (cRemoveNext == 'B' || (cRemoveNext == 'P' && nextChar != 'H')) {
                    cologneOutputBuffer.put('1');
                } else if ((cRemoveNext == 'D' || cRemoveNext == 'T') && !arrayContains(CSZ, nextChar)) {
                    cologneOutputBuffer.put('2');
                } else if (arrayContains(FPVW, cRemoveNext)) {
                    cologneOutputBuffer.put('3');
                } else if (arrayContains(GKQ, cRemoveNext)) {
                    cologneOutputBuffer.put('4');
                } else if (cRemoveNext == 'X' && !arrayContains(CKQ, c14)) {
                    cologneOutputBuffer.put('4');
                    cologneOutputBuffer.put('8');
                } else if (cRemoveNext == 'S' || cRemoveNext == 'Z') {
                    cologneOutputBuffer.put('8');
                } else if (cRemoveNext == 'C') {
                    if (cologneOutputBuffer.isEmpty()) {
                        if (arrayContains(AHKLOQRUX, nextChar)) {
                            cologneOutputBuffer.put('4');
                        } else {
                            cologneOutputBuffer.put('8');
                        }
                    } else if (arrayContains(SZ, c14) || !arrayContains(AHKOQUX, nextChar)) {
                        cologneOutputBuffer.put('8');
                    } else {
                        cologneOutputBuffer.put('4');
                    }
                } else if (arrayContains(DTX, cRemoveNext)) {
                    cologneOutputBuffer.put('8');
                } else if (cRemoveNext == 'H') {
                    cologneOutputBuffer.put('-');
                } else if (cRemoveNext != 'R') {
                    switch (cRemoveNext) {
                        case 'L':
                            cologneOutputBuffer.put('5');
                            break;
                        case 'M':
                        case 'N':
                            cologneOutputBuffer.put('6');
                            break;
                    }
                } else {
                    cologneOutputBuffer.put('7');
                }
                c14 = cRemoveNext;
            }
        }
        return cologneOutputBuffer.toString();
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("This method's parameter was expected to be of the type " + String.class.getName() + ". But actually it was of the type " + obj.getClass().getName() + ".");
    }

    public boolean isEncodeEqual(String str, String str2) {
        return colognePhonetic(str).equals(colognePhonetic(str2));
    }

    public static abstract class CologneBuffer {
        protected final char[] data;
        protected int length;

        public CologneBuffer(int i14) {
            this.data = new char[i14];
            this.length = 0;
        }

        public abstract char[] copyData(int i14, int i15);

        public boolean isEmpty() {
            return length() == 0;
        }

        public int length() {
            return this.length;
        }

        public String toString() {
            return new String(copyData(0, this.length));
        }

        public CologneBuffer(char[] cArr) {
            this.data = cArr;
            this.length = cArr.length;
        }
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return colognePhonetic(str);
    }
}
