package com.huawei.profile.utils;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import com.google.common.base.Ascii;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.operation.utils.Constants;
import com.huawei.profile.utils.logger.DsLog;
import java.math.BigInteger;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes15.dex */
public final class NaieJsonSanitizer {
    private static final int[] DIGITS_BY_BASE_FIT_IN_63B;
    private static final char[] HEX_DIGITS_CHARS;
    public static final int NESTING_DEFAULT_DEPTH = 64;
    public static final int NESTING_MAXIMUM_DEPTH = 4096;
    private static final String TAG = "NaieJsonSanitizer";
    private static final UnbracketedNaieComma UNBRACKETED_NAIE_COMMA;
    private int bracketDepth;
    private int cleaned;
    private boolean[] isMap;
    private final String jsonStr;
    private final int nestingMaximumDepth;
    private StringBuilder sanitizedNaieJson;

    enum KeyState {
        BEFORE_ARRAY,
        START_ELEMENT,
        END_ELEMENT,
        BEFORE_MAP,
        START_KEY,
        END_KEY,
        START_VALUE,
        END_VALUE
    }

    private boolean charEquals1(char c2, char c3, char c4) {
        return c2 == '!' && c3 == '-' && c4 == '-';
    }

    private boolean charEquals2(char c2, char c3, char c4) {
        return c2 == 's' && c3 == 'c' && c4 == 'r';
    }

    private boolean charEquals3(char c2, char c3, char c4) {
        return c2 == '/' && c3 == 's' && c4 == 'c';
    }

    private static boolean charJudge1(char c2) {
        return 'a' <= c2 && c2 <= 'z';
    }

    private static boolean charJudge2(char c2) {
        return '0' <= c2 && c2 <= '9';
    }

    private static boolean charJudge3(char c2) {
        return c2 == '+' || c2 == '-' || c2 == '.';
    }

    private static boolean charJudge4(char c2) {
        return ('A' <= c2 && c2 <= 'Z') || c2 == '_' || c2 == '$';
    }

    private static int hexVal(char c2) {
        int i = c2 | ' ';
        return i - (i <= 57 ? 48 : 87);
    }

    private static boolean isHex(char c2) {
        if ('0' <= c2 && c2 <= '9') {
            return true;
        }
        int i = c2 | ' ';
        return 97 <= i && i <= 102;
    }

    private static boolean isOct(char c2) {
        return '0' <= c2 && c2 <= '7';
    }

    private boolean numberJudge(char c2) {
        return c2 == '.' || c2 == '+' || c2 == '-';
    }

    private static boolean startEndJudge(int i, int i2, int i3, int i4) {
        return i <= i2 && i2 <= i3 && i3 <= i4;
    }

    static {
        UnbracketedNaieComma unbracketedNaieComma = new UnbracketedNaieComma();
        UNBRACKETED_NAIE_COMMA = unbracketedNaieComma;
        HEX_DIGITS_CHARS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        DIGITS_BY_BASE_FIT_IN_63B = new int[]{-1, -1, 63, 39, 31, 27, 24, 22, 21, 19, 18, 18, 17, 17, 16, 16, 15};
        unbracketedNaieComma.setStackTrace(new StackTraceElement[0]);
    }

    NaieJsonSanitizer(String str) {
        this(str, 64);
    }

    NaieJsonSanitizer(String str, int i) {
        this.nestingMaximumDepth = Math.min(Math.max(1, i), 4096);
        this.jsonStr = str == null ? Constants.NULL : str;
    }

    public static String sanitize(String str) {
        return sanitize(str, 64);
    }

    public static String sanitize(String str, int i) {
        NaieJsonSanitizer naieJsonSanitizer = new NaieJsonSanitizer(str, i);
        naieJsonSanitizer.sanitize();
        return naieJsonSanitizer.toString();
    }

    private static int endOfString(String str, int i) {
        int i2;
        char cCharAt = str.charAt(i);
        int iIndexOf = i;
        do {
            iIndexOf = str.indexOf(cCharAt, iIndexOf + 1);
            if (iIndexOf >= 0) {
                i2 = iIndexOf;
                while (i2 > i && str.charAt(i2 - 1) == '\\') {
                    i2--;
                }
            } else {
                return str.length();
            }
        } while (((iIndexOf - i2) & 1) != 0);
        return iIndexOf + 1;
    }

    private static boolean canonicalizeNumber(StringBuilder sb, int i, int i2) {
        int i3;
        int fractionEnd;
        int i4;
        int i5 = 0;
        int i6 = (sb.charAt(i) == '-' ? 1 : 0) + i;
        int i7 = i6;
        while (i7 < i2) {
            char cCharAt = sb.charAt(i7);
            if ('0' > cCharAt || cCharAt > '9') {
                break;
            }
            i7++;
        }
        if (i7 == i2 || '.' != sb.charAt(i7)) {
            i3 = i7;
            fractionEnd = i3;
        } else {
            i3 = i7 + 1;
            fractionEnd = getFractionEnd(sb, i2, i3);
        }
        if (fractionEnd == i2) {
            i4 = i2;
        } else {
            if (101 != (sb.charAt(fractionEnd) | ' ')) {
                throw new AssertionError();
            }
            i4 = fractionEnd + 1;
            if (sb.charAt(i4) == '+') {
                i4 = fractionEnd + 2;
            }
        }
        if (!startEndJudge(i6, i7, i3, fractionEnd) || fractionEnd > i4 || i4 > i2) {
            throw new AssertionError();
        }
        if (i2 != i4) {
            try {
                i5 = Integer.parseInt(sb.substring(i4, i2), 10);
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return extracted(sb, i, i6, fractionEnd, i5);
    }

    private static int getFractionEnd(StringBuilder sb, int i, int i2) {
        while (i2 < i) {
            char cCharAt = sb.charAt(i2);
            if ('0' > cCharAt || cCharAt > '9') {
                break;
            }
            i2++;
        }
        return i2;
    }

    private static boolean extracted(StringBuilder sb, int i, int i2, int i3, int i4) {
        char c2;
        int i5 = i2;
        int i6 = i5;
        boolean z = false;
        int i7 = 0;
        boolean z2 = true;
        while (i5 < i3) {
            char cCharAt = sb.charAt(i5);
            if (cCharAt == '.') {
                if (z2) {
                    i7 = 0;
                }
                z = true;
            } else {
                if ((!z2 || cCharAt != '0') && !z) {
                    i4++;
                }
                if (cCharAt == '0') {
                    i7++;
                } else {
                    if (z2) {
                        if (z) {
                            i4 -= i7;
                        }
                        i7 = 0;
                    }
                    while (true) {
                        if (i7 == 0 && cCharAt == 0) {
                            break;
                        }
                        if (i7 == 0) {
                            c2 = 0;
                        } else {
                            i7--;
                            c2 = cCharAt;
                            cCharAt = '0';
                        }
                        sb.setCharAt(i6, cCharAt);
                        i6++;
                        cCharAt = c2;
                    }
                    z2 = false;
                }
            }
            i5++;
        }
        sb.setLength(i6);
        if (extracted(sb, i, z2)) {
            return true;
        }
        extracted(sb, i2, i4, i6 - i2);
        return true;
    }

    private static boolean extracted(StringBuilder sb, int i, boolean z) {
        if (!z) {
            return false;
        }
        sb.setLength(i);
        sb.append('0');
        return true;
    }

    private static void extracted(StringBuilder sb, int i, int i2, int i3) {
        if (i3 <= i2 && i2 <= 21) {
            while (i3 < i2) {
                sb.append('0');
                i3++;
            }
            return;
        }
        if (i2 > 0 && i2 <= 21) {
            sb.insert(i + i2, FilenameUtils.EXTENSION_SEPARATOR);
            return;
        }
        if (-6 < i2 && i2 <= 0) {
            sb.insert(i, "0.000000".substring(0, 2 - i2));
            return;
        }
        if (i3 == 1) {
            DsLog.it(TAG, "Nothing to do", new Object[0]);
        } else {
            sb.insert(i + 1, FilenameUtils.EXTENSION_SEPARATOR);
        }
        int i4 = i2 - 1;
        sb.append('e');
        sb.append(i4 < 0 ? '-' : '+');
        sb.append(Math.abs(i4));
    }

    private static int unescapedChar(String str, int i) {
        int length = str.length();
        if (i >= length) {
            return 0;
        }
        char cCharAt = str.charAt(i);
        if (cCharAt != '\\') {
            return cCharAt | Ascii.MIN;
        }
        int i2 = i + 1;
        if (i2 == length) {
            return 65536;
        }
        char cCharAt2 = str.charAt(i2);
        Integer octalEnd = getOctalEnd(str, i, length, cCharAt2);
        return octalEnd != null ? octalEnd.intValue() : 0 | cCharAt2;
    }

    private static Integer getOctalEnd1(String str, int i, int i2, char c2) {
        switch (c2) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
                return Integer.valueOf(extracted(str, i, i2, c2));
            default:
                return null;
        }
    }

    private static Integer getOctalEnd(String str, int i, int i2, char c2) {
        Integer integer1;
        Integer integer;
        Integer octalEnd1 = getOctalEnd1(str, i, i2, c2);
        if (octalEnd1 != null) {
            return octalEnd1;
        }
        if (c2 == 'b') {
            return 131080;
        }
        if (c2 == 'f') {
            return 131084;
        }
        if (c2 == 'n') {
            return 131082;
        }
        if (c2 == 'r') {
            return 131085;
        }
        if (c2 == 'x') {
            if (i + 3 >= i2 || (integer1 = getInteger1(str, i)) == null) {
                return null;
            }
            return integer1;
        }
        switch (c2) {
            case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                return 131081;
            case 'u':
                if (i + 5 >= i2 || (integer = getInteger(str, i)) == null) {
                    return null;
                }
                return integer;
            case AgrConstant.HEALTH_AGREEMENT_CODE /* 118 */:
                return 131080;
            default:
                return null;
        }
    }

    private static Integer getInteger1(String str, int i) {
        char cCharAt = str.charAt(i + 2);
        char cCharAt2 = str.charAt(i + 3);
        if (!isHex(cCharAt) || !isHex(cCharAt2)) {
            return null;
        }
        return Integer.valueOf(hexVal(cCharAt2) | (hexVal(cCharAt) << 4) | 16384);
    }

    private static Integer getInteger(String str, int i) {
        char cCharAt = str.charAt(i + 2);
        char cCharAt2 = str.charAt(i + 3);
        char cCharAt3 = str.charAt(i + 4);
        char cCharAt4 = str.charAt(i + 5);
        if (!isHex(cCharAt) || !isHex(cCharAt2) || !isHex(cCharAt3) || !isHex(cCharAt4)) {
            return null;
        }
        return Integer.valueOf(hexVal(cCharAt4) | (hexVal(cCharAt) << 12) | 24576 | (hexVal(cCharAt2) << 8) | (hexVal(cCharAt3) << 4));
    }

    private static int extracted(String str, int i, int i2, char c2) {
        int i3 = i + 2;
        if (i3 < i2 && isOct(str.charAt(i3))) {
            i3 = i + 3;
            if (c2 <= '3' && i3 < i2 && isOct(str.charAt(i3))) {
                i3 = i + 4;
            }
        }
        int iCharAt = 0;
        for (int i4 = i + 1; i4 < i3; i4++) {
            iCharAt = (iCharAt << 3) | (str.charAt(i4) - '0');
        }
        return ((i3 - i) << 16) | iCharAt;
    }

    private static int unescapedCharRev(String str, int i) {
        int i2;
        if (i < 0) {
            return 0;
        }
        for (int i3 = 1; i3 < 6 && (i2 = i - i3) >= 0; i3++) {
            if (str.charAt(i2) == '\\') {
                int i4 = 1;
                while (true) {
                    int i5 = i2 - i4;
                    if (i5 < 0 || str.charAt(i5) != '\\') {
                        break;
                    }
                    i4++;
                }
                if ((1 & i4) != 0) {
                    break;
                }
                int iUnescapedChar = unescapedChar(str, i2);
                if ((iUnescapedChar >>> 16) != i3) {
                    break;
                }
                return iUnescapedChar;
            }
        }
        return str.charAt(i) | Ascii.MIN;
    }

    int getNestingMaximumDepth() {
        return this.nestingMaximumDepth;
    }

    void sanitize() {
        this.cleaned = 0;
        this.bracketDepth = 0;
        this.sanitizedNaieJson = null;
        KeyState keyState = KeyState.BEFORE_ARRAY;
        int length = this.jsonStr.length();
        KeyState state = getState(keyState, length);
        if (state == KeyState.BEFORE_ARRAY && this.bracketDepth == 0) {
            insert(length, Constants.NULL);
            state = KeyState.END_ELEMENT;
        }
        StringBuilder sb = this.sanitizedNaieJson;
        if ((sb == null || sb.length() == 0) && this.cleaned == 0 && this.bracketDepth == 0) {
            return;
        }
        if (this.sanitizedNaieJson == null) {
            this.sanitizedNaieJson = new StringBuilder(this.bracketDepth + length);
        }
        this.sanitizedNaieJson.append((CharSequence) this.jsonStr, this.cleaned, length);
        this.cleaned = length;
        int iOrdinal = state.ordinal();
        if (iOrdinal == 1 || iOrdinal == 4) {
            elideTrailingComma(length);
        } else if (iOrdinal == 5) {
            this.sanitizedNaieJson.append(":null");
        } else if (iOrdinal == 6) {
            this.sanitizedNaieJson.append(Constants.NULL);
        }
        while (true) {
            int i = this.bracketDepth;
            if (i <= 0) {
                return;
            }
            StringBuilder sb2 = this.sanitizedNaieJson;
            boolean[] zArr = this.isMap;
            int i2 = i - 1;
            this.bracketDepth = i2;
            sb2.append(zArr[i2] ? '}' : ']');
        }
    }

    private boolean stateDeal(char c2, int i) {
        if (c2 == '\t' || c2 == '\n' || c2 == '\r' || c2 == ' ') {
            return true;
        }
        if (c2 != '(' && c2 != ')') {
            return false;
        }
        change(i, i + 1);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0050 A[Catch: UnbracketedNaieComma -> 0x0087, TryCatch #0 {UnbracketedNaieComma -> 0x0087, blocks: (B:4:0x0004, B:25:0x0037, B:27:0x003d, B:28:0x0043, B:29:0x0050, B:31:0x0054, B:33:0x005e, B:34:0x0063, B:35:0x006c, B:36:0x0071, B:37:0x0076, B:38:0x007b), top: B:43:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x005e A[Catch: UnbracketedNaieComma -> 0x0087, TryCatch #0 {UnbracketedNaieComma -> 0x0087, blocks: (B:4:0x0004, B:25:0x0037, B:27:0x003d, B:28:0x0043, B:29:0x0050, B:31:0x0054, B:33:0x005e, B:34:0x0063, B:35:0x006c, B:36:0x0071, B:37:0x0076, B:38:0x007b), top: B:43:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[Catch: UnbracketedNaieComma -> 0x0087, TryCatch #0 {UnbracketedNaieComma -> 0x0087, blocks: (B:4:0x0004, B:25:0x0037, B:27:0x003d, B:28:0x0043, B:29:0x0050, B:31:0x0054, B:33:0x005e, B:34:0x0063, B:35:0x006c, B:36:0x0071, B:37:0x0076, B:38:0x007b), top: B:43:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0054 A[SYNTHETIC] */
    private KeyState getState(KeyState keyState, int i) {
        int i2;
        int i3 = 0;
        while (i3 < i) {
            try {
                char cCharAt = this.jsonStr.charAt(i3);
                if (!stateDeal(cCharAt, i3)) {
                    if (cCharAt == '\"' || cCharAt == '\'') {
                        keyState = requireValueState(i3, keyState, true);
                        i2 = getI(i3);
                    } else if (cCharAt == ',') {
                        keyState = getKeyState(keyState, i3);
                    } else if (cCharAt == '/') {
                        i2 = getAnInt(i, i3);
                    } else if (cCharAt == ':') {
                        keyState = getKeyState1(keyState, i3);
                    } else if (cCharAt == '[') {
                        requireValueState(i3, keyState, false);
                        keyState = getKeyState(cCharAt);
                    } else if (cCharAt == ']') {
                        if (this.bracketDepth == 0) {
                            change(i3, this.jsonStr.length());
                            return keyState;
                        }
                        keyState = getKeyState(keyState, i3, cCharAt);
                    } else if (cCharAt == '{') {
                        requireValueState(i3, keyState, false);
                        keyState = getKeyState(cCharAt);
                    } else if (cCharAt == '}') {
                        if (this.bracketDepth == 0) {
                            change(i3, this.jsonStr.length());
                            return keyState;
                        }
                        keyState = getKeyState(keyState, i3, cCharAt);
                    } else {
                        int runEnd = getRunEnd(i, i3);
                        if (runEnd == i3) {
                            change(i3, i3 + 1);
                        } else {
                            keyState = requireValueState(i3, keyState, true);
                            i3 = getI(keyState, i, i3, cCharAt, runEnd);
                        }
                    }
                    i3 = i2;
                }
                i3++;
            } catch (UnbracketedNaieComma unused) {
                change(i3, this.jsonStr.length());
            }
        }
        return keyState;
    }

    private KeyState getKeyState(char c2) {
        boolean zIsMap = isMap(c2);
        this.bracketDepth++;
        return zIsMap ? KeyState.BEFORE_MAP : KeyState.BEFORE_ARRAY;
    }

    private KeyState getKeyState1(KeyState keyState, int i) {
        if (keyState == KeyState.END_KEY) {
            return KeyState.START_VALUE;
        }
        change(i, i + 1);
        return keyState;
    }

    private boolean isMap(char c2) {
        if (this.isMap == null) {
            this.isMap = new boolean[this.nestingMaximumDepth];
        }
        boolean z = c2 == '{';
        this.isMap[this.bracketDepth] = z;
        return z;
    }

    private int getI(int i) {
        int iEndOfString = endOfString(this.jsonStr, i);
        sanitizeString(i, iEndOfString);
        return iEndOfString - 1;
    }

    private int getRunEnd(int i, int i2) {
        while (i2 < i) {
            char cCharAt = this.jsonStr.charAt(i2);
            if (!charJudge5(cCharAt) && !charJudge4(cCharAt)) {
                break;
            }
            i2++;
        }
        return i2;
    }

    private static boolean charJudge5(char c2) {
        return charJudge1(c2) || charJudge2(c2) || charJudge3(c2);
    }

    private int getI(KeyState keyState, int i, int i2, char c2, int i3) {
        boolean z = ('0' <= c2 && c2 <= '9') || numberJudge(c2);
        boolean z2 = !z && isKeyword(i2, i3);
        if (!z && !z2) {
            while (i3 < i && !isSpecialChar(i3)) {
                i3++;
            }
            if (i3 < i && this.jsonStr.charAt(i3) == '\"') {
                i3++;
            }
        }
        return getAnInt(keyState, i2, i3, z, z2);
    }

    private int getAnInt(KeyState keyState, int i, int i2, boolean z, boolean z2) {
        if (keyState == KeyState.END_KEY) {
            insert(i, '\"');
            if (z) {
                canonicalizeNumber(i, i2);
                insert(i2, '\"');
            } else {
                sanitizeString(i, i2);
            }
        } else if (z) {
            normalizeNumber(i, i2);
        } else if (!z2) {
            insert(i, '\"');
            sanitizeString(i, i2);
        }
        return i2 - 1;
    }

    private int getAnInt(int i, int i2) {
        int anInt = i2 + 1;
        if (anInt < i) {
            char cCharAt = this.jsonStr.charAt(anInt);
            if (cCharAt == '*') {
                anInt = getAnInt(i, i2, i);
            } else if (cCharAt == '/') {
                anInt = getEnd(i, i2, i);
            }
        }
        change(i2, anInt);
        return anInt - 1;
    }

    private int getAnInt(int i, int i2, int i3) {
        if (i2 + 3 < i) {
            int iIndexOf = i2 + 2;
            do {
                iIndexOf = this.jsonStr.indexOf(47, iIndexOf + 1);
                if (iIndexOf >= 0) {
                }
            } while (this.jsonStr.charAt(iIndexOf - 1) != '*');
            return iIndexOf + 1;
        }
        return i3;
    }

    private int getEnd(int i, int i2, int i3) {
        for (int i4 = i2 + 2; i4 < i; i4++) {
            char cCharAt = this.jsonStr.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r' || cCharAt == 8232 || cCharAt == 8233) {
                return i4 + 1;
            }
        }
        return i3;
    }

    private KeyState getKeyState(KeyState keyState, int i) throws UnbracketedNaieComma {
        if (this.bracketDepth == 0) {
            throw UNBRACKETED_NAIE_COMMA;
        }
        switch (keyState) {
            case BEFORE_ARRAY:
            case START_ELEMENT:
                insert(i, Constants.NULL);
                return KeyState.START_ELEMENT;
            case END_ELEMENT:
                return KeyState.START_ELEMENT;
            case BEFORE_MAP:
            case START_KEY:
            case END_KEY:
                change(i, i + 1);
                return keyState;
            case START_VALUE:
                insert(i, Constants.NULL);
                return KeyState.START_KEY;
            case END_VALUE:
                return KeyState.START_KEY;
            default:
                return keyState;
        }
    }

    private KeyState getKeyState(KeyState keyState, int i, char c2) {
        int iOrdinal = keyState.ordinal();
        if (iOrdinal == 1 || iOrdinal == 4) {
            elideTrailingComma(i);
        } else if (iOrdinal == 5) {
            insert(i, ":null");
        } else if (iOrdinal == 6) {
            insert(i, Constants.NULL);
        }
        int i2 = this.bracketDepth - 1;
        this.bracketDepth = i2;
        char c3 = this.isMap[i2] ? '}' : ']';
        if (c2 != c3) {
            replace(i, i + 1, c3);
        }
        int i3 = this.bracketDepth;
        return (i3 == 0 || !this.isMap[i3 - 1]) ? KeyState.END_ELEMENT : KeyState.END_VALUE;
    }

    private void sanitizeString(int i, int i2) {
        if (isClosed(i, i2, false)) {
            return;
        }
        insert(i2, '\"');
    }

    private boolean isSingle(char c2, int i) {
        if (c2 == '\t') {
            replace(i, i + 1, "\\t");
            return true;
        }
        if (c2 == '\n') {
            replace(i, i + 1, "\\n");
            return true;
        }
        if (c2 == '\r') {
            replace(i, i + 1, "\\r");
            return true;
        }
        if (c2 == 8232) {
            replace(i, i + 1, "\\u2028");
            return true;
        }
        if (c2 != 8233) {
            return false;
        }
        replace(i, i + 1, "\\u2029");
        return true;
    }

    private boolean isClosed(int i, int i2, boolean z) {
        int i3;
        boolean zIsClosed = z;
        int i4 = i;
        while (i4 < i2) {
            char cCharAt = this.jsonStr.charAt(i4);
            if (isSingle(cCharAt, i4)) {
                break;
            }
            if (cCharAt == '\"' || cCharAt == '\'') {
                zIsClosed = isClosed(i, i2, zIsClosed, i4, cCharAt);
            } else if (cCharAt == '<') {
                extracted2(i2, i4);
            } else if (cCharAt == '>') {
                extracted(i, i4);
            } else if (cCharAt == '\\') {
                int i5 = i4 + 1;
                if (i5 == i2) {
                    change(i4, i5);
                } else {
                    i4 = getI(i2, i4);
                }
            } else if (cCharAt == ']') {
                extracted1(i2, i4);
            } else {
                if (cCharAt < ' ') {
                    DsLog.it(TAG, "Nothing to do", new Object[0]);
                } else if (cCharAt >= 55296) {
                    if (cCharAt < 57344) {
                        if (Character.isHighSurrogate(cCharAt) && (i3 = i4 + 1) < i2 && Character.isLowSurrogate(this.jsonStr.charAt(i3))) {
                            i4 = i3;
                        }
                    } else if (cCharAt <= 65533) {
                    }
                }
                extracted(i4, cCharAt);
            }
            i4++;
        }
        return zIsClosed;
    }

    private void extracted2(int i, int i2) {
        if (i2 + 3 >= i) {
            return;
        }
        extracted(i2);
    }

    private void extracted(int i, char c2) {
        replace(i, i + 1, "\\u");
        int i2 = 4;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                this.sanitizedNaieJson.append(HEX_DIGITS_CHARS[(c2 >>> (i2 << 2)) & 15]);
            }
        }
    }

    private boolean getJudge(char c2, int i) {
        if (c2 == '\"' || c2 == '/' || c2 == '\\' || c2 == 'b' || c2 == 'f' || c2 == 'n' || c2 == 'r' || c2 == 't') {
            return true;
        }
        if (c2 != 'v') {
            return false;
        }
        replace(i, i + 2, "\\u0008");
        return true;
    }

    private int getI(int i, int i2) {
        int i3 = i2 + 1;
        char cCharAt = this.jsonStr.charAt(i3);
        if (getJudge(cCharAt, i2)) {
            return i3;
        }
        if (cCharAt == 'u') {
            if (indexJudge(i2, i) && isHexAt(i2 + 4)) {
                int i4 = i2 + 5;
                if (isHexAt(i4)) {
                    return i4;
                }
            }
            change(i2, i3);
            return i2;
        }
        if (cCharAt == 'x') {
            if (i2 + 4 < i) {
                int i5 = i2 + 2;
                if (isHexAt(i5)) {
                    int i6 = i2 + 3;
                    if (isHexAt(i6)) {
                        replace(i2, i5, "\\u00");
                        return i6;
                    }
                }
            }
            change(i2, i3);
            return i2;
        }
        switch (cCharAt) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
                return getIndex(i, i2, cCharAt);
            default:
                change(i2, i3);
                return i2;
        }
    }

    private boolean indexJudge(int i, int i2) {
        return i + 6 < i2 && isHexAt(i + 2) && isHexAt(i + 3);
    }

    private int getIndex(int i, int i2, char c2) {
        int i3 = i2 + 1;
        int i4 = i2 + 2;
        if (i4 < i && isOctAt(i4)) {
            i4 = i2 + 3;
            if (c2 <= '3' && i4 < i && isOctAt(i4)) {
                i4 = i2 + 4;
            }
        }
        int iCharAt = 0;
        for (int i5 = i3; i5 < i4; i5++) {
            iCharAt = (iCharAt << 3) | (this.jsonStr.charAt(i5) - '0');
        }
        replace(i3, i4, "u00");
        appendHex(iCharAt, 2);
        return i4 - 1;
    }

    private void extracted1(int i, int i2) {
        if (i2 + 2 < i) {
            int i3 = i2 + 1;
            long jUnescapedChar = unescapedChar(this.jsonStr, i3);
            char c2 = (char) jUnescapedChar;
            char cUnescapedChar = (char) unescapedChar(this.jsonStr, (int) (((long) i3) + (jUnescapedChar >>> 16)));
            if (']' == c2 && '>' == cUnescapedChar) {
                replace(i2, i3, "\\u005d");
            }
        }
    }

    private void extracted(int i, int i2) {
        if (i2 - 2 >= i) {
            int i3 = i2 - 1;
            int iUnescapedCharRev = unescapedCharRev(this.jsonStr, i3);
            char c2 = (char) iUnescapedCharRev;
            if ('-' == ((char) unescapedCharRev(this.jsonStr, i3 - (iUnescapedCharRev >>> 16))) && '-' == c2) {
                replace(i2, i2 + 1, "\\u003e");
            }
        }
    }

    private boolean isClosed(int i, int i2, boolean z, int i3, char c2) {
        if (i3 == i) {
            if (c2 == '\'') {
                replace(i3, i3 + 1, '\"');
            }
            return z;
        }
        int i4 = i3 + 1;
        if (i4 == i2) {
            char cCharAt = this.jsonStr.charAt(i);
            if (cCharAt != '\'') {
                cCharAt = '\"';
            }
            z = cCharAt == c2;
        }
        if (z) {
            if (c2 == '\'') {
                replace(i3, i4, '\"');
                return z;
            }
        } else if (c2 == '\"') {
            insert(i3, IOUtils.DIR_SEPARATOR_WINDOWS);
        }
        return z;
    }

    private void extracted(int i) {
        int i2 = i + 1;
        int iUnescapedChar = unescapedChar(this.jsonStr, i2);
        char c2 = (char) iUnescapedChar;
        int i3 = (iUnescapedChar >>> 16) + i2;
        long jUnescapedChar = unescapedChar(this.jsonStr, i3);
        char c3 = (char) jUnescapedChar;
        char cUnescapedChar = (char) unescapedChar(this.jsonStr, (int) (((long) i3) + (jUnescapedChar >>> 16)));
        char c4 = (char) (c2 | ' ');
        char c5 = (char) (c3 | ' ');
        char c6 = (char) (cUnescapedChar | ' ');
        if (charEquals1(c2, c3, cUnescapedChar) || charEquals2(c4, c5, c6) || charEquals3(c2, c5, c6)) {
            replace(i, i2, "\\u003c");
        }
    }

    private KeyState requireValueState(int i, KeyState keyState, boolean z) throws UnbracketedNaieComma {
        switch (keyState) {
            case BEFORE_ARRAY:
            case START_ELEMENT:
                return KeyState.END_ELEMENT;
            case END_ELEMENT:
                if (this.bracketDepth == 0) {
                    throw UNBRACKETED_NAIE_COMMA;
                }
                insert(i, ',');
                return KeyState.END_ELEMENT;
            case BEFORE_MAP:
            case START_KEY:
                if (z) {
                    return KeyState.END_KEY;
                }
                insert(i, "\"\":");
                return KeyState.END_VALUE;
            case END_KEY:
                insert(i, ':');
                return KeyState.END_VALUE;
            case START_VALUE:
                return KeyState.END_VALUE;
            case END_VALUE:
                if (z) {
                    insert(i, ',');
                    return KeyState.END_KEY;
                }
                insert(i, ",\"\":");
                return KeyState.END_VALUE;
            default:
                throw new AssertionError();
        }
    }

    private void insert(int i, char c2) {
        replace(i, i, c2);
    }

    private void insert(int i, String str) {
        replace(i, i, str);
    }

    private void change(int i, int i2) {
        if (this.sanitizedNaieJson == null) {
            this.sanitizedNaieJson = new StringBuilder(this.jsonStr.length() + 16);
        }
        this.sanitizedNaieJson.append((CharSequence) this.jsonStr, this.cleaned, i);
        this.cleaned = i2;
    }

    private void replace(int i, int i2, char c2) {
        change(i, i2);
        this.sanitizedNaieJson.append(c2);
    }

    private void replace(int i, int i2, String str) {
        change(i, i2);
        this.sanitizedNaieJson.append(str);
    }

    private void elideTrailingComma(int i) {
        while (true) {
            int i2 = i - 1;
            if (i2 >= this.cleaned) {
                char cCharAt = this.jsonStr.charAt(i2);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                    if (cCharAt == ',') {
                        change(i2, i);
                        return;
                    } else {
                        throw new AssertionError("" + this.jsonStr.charAt(i2));
                    }
                }
                i = i2;
            } else {
                StringBuilder sb = this.sanitizedNaieJson;
                if (sb == null) {
                    throw new AssertionError();
                }
                int length = sb.length();
                while (true) {
                    length--;
                    if (length >= 0) {
                        char cCharAt2 = this.sanitizedNaieJson.charAt(length);
                        if (cCharAt2 != '\t' && cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ') {
                            if (cCharAt2 == ',') {
                                this.sanitizedNaieJson.setLength(length);
                                return;
                            } else {
                                throw new AssertionError("" + this.sanitizedNaieJson.charAt(length));
                            }
                        }
                    } else {
                        throw new AssertionError("Trailing comma not found in " + this.jsonStr + " or " + ((Object) this.sanitizedNaieJson));
                    }
                }
            }
        }
    }

    private void normalizeNumber(int i, int i2) {
        char cCharAt;
        int pos = getPos(i2, i);
        int endDigit = getEndDigit(pos, i2);
        if (pos == endDigit) {
            insert(pos, '0');
        } else if ('0' == this.jsonStr.charAt(pos)) {
            endDigit = getIntEnd(i2, pos, endDigit);
        }
        if (endDigit < i2 && this.jsonStr.charAt(endDigit) == '.') {
            int i3 = endDigit + 1;
            int endDigit2 = getEndDigit(i3, i2);
            if (endDigit2 == i3) {
                insert(i3, '0');
            }
            endDigit = endDigit2;
        }
        if (endDigit < i2 && 101 == (this.jsonStr.charAt(endDigit) | ' ')) {
            int i4 = endDigit + 1;
            if (i4 < i2 && ((cCharAt = this.jsonStr.charAt(i4)) == '+' || cCharAt == '-')) {
                i4 = endDigit + 2;
            }
            endDigit = getEndDigit(i4, i2);
            if (endDigit == i4) {
                insert(i4, '0');
            }
        }
        if (endDigit != i2) {
            change(endDigit, i2);
        }
    }

    private int getPos(int i, int i2) {
        if (i2 < i) {
            char cCharAt = this.jsonStr.charAt(i2);
            if (cCharAt == '+') {
                int i3 = i2 + 1;
                change(i2, i3);
                return i3;
            }
            if (cCharAt == '-') {
                return i2 + 1;
            }
        }
        return i2;
    }

    private int getIntEnd(int i, int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i3 - i2;
        int iMax = 0;
        if (i11 != 1 || i3 >= i || 120 != (this.jsonStr.charAt(i3) | ' ')) {
            if (i11 > 1) {
                for (int i12 = i2; i12 < i3; i12++) {
                    int iCharAt = this.jsonStr.charAt(i12) - '0';
                    if (iCharAt < 0) {
                        break;
                    }
                    iMax = Math.max(iCharAt, iMax);
                }
                i7 = 8;
                i8 = i3;
                i9 = i2;
            } else {
                i4 = 10;
                i5 = -1;
                z = false;
                i6 = 0;
            }
            extracted(i2, i3, z, i6, i4, i5);
            return i3;
        }
        i9 = i3 + 1;
        i8 = i9;
        while (i8 < i) {
            char cCharAt = this.jsonStr.charAt(i8);
            if ('0' > cCharAt || cCharAt > '9') {
                char c2 = (char) (cCharAt | ' ');
                if ('a' > c2 || c2 > 'f') {
                    break;
                }
                i10 = c2 - 'W';
            } else {
                i10 = cCharAt - '0';
            }
            iMax = Math.max(i10, iMax);
            i8++;
        }
        i7 = 16;
        i4 = i7;
        i5 = i9;
        i3 = i8;
        i6 = iMax;
        z = true;
        extracted(i2, i3, z, i6, i4, i5);
        return i3;
    }

    private void extracted(int i, int i2, boolean z, int i3, int i4, int i5) {
        if (z) {
            change(i, i2);
            if (this.jsonStr.length() < i2) {
                return;
            }
            String strSubstring = this.jsonStr.substring(i5, i2);
            int length = strSubstring.length();
            if (i4 <= i3) {
                i4 = 10;
                if (i3 > 10) {
                    i4 = 16;
                }
            }
            if (length == 0) {
                this.sanitizedNaieJson.append('0');
                return;
            }
            if (DIGITS_BY_BASE_FIT_IN_63B[i4] >= length) {
                try {
                    this.sanitizedNaieJson.append(Long.parseLong(strSubstring, i4));
                    return;
                } catch (NumberFormatException unused) {
                    DsLog.et(TAG, "cant get int from string", new Object[0]);
                    return;
                }
            }
            this.sanitizedNaieJson.append(new BigInteger(strSubstring, i4));
        }
    }

    private boolean canonicalizeNumber(int i, int i2) {
        change(i, i);
        int length = this.sanitizedNaieJson.length();
        normalizeNumber(i, i2);
        change(i2, i2);
        return canonicalizeNumber(this.sanitizedNaieJson, length, this.sanitizedNaieJson.length());
    }

    private boolean isKeyword(int i, int i2) {
        int i3 = i2 - i;
        if (i3 == 5) {
            return "false".regionMatches(0, this.jsonStr, i, i3);
        }
        if (i3 == 4) {
            return Constants.NULL.regionMatches(0, this.jsonStr, i, i3) || "true".regionMatches(0, this.jsonStr, i, i3);
        }
        return false;
    }

    private boolean isOctAt(int i) {
        return isOct(this.jsonStr.charAt(i));
    }

    private boolean isHexAt(int i) {
        return isHex(this.jsonStr.charAt(i));
    }

    private boolean isSpecialChar(int i) {
        char cCharAt = this.jsonStr.charAt(i);
        return cCharAt <= ' ' || cCharAt == '\"' || cCharAt == ',' || cCharAt == ':' || cCharAt == '[' || cCharAt == ']' || cCharAt == '{' || cCharAt == '}';
    }

    private void appendHex(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            int i3 = (i >>> (i2 * 4)) & 15;
            this.sanitizedNaieJson.append((char) (i3 + (i3 < 10 ? 48 : 87)));
        }
    }

    private int getEndDigit(int i, int i2) {
        while (i < i2) {
            char cCharAt = this.jsonStr.charAt(i);
            if ('0' > cCharAt || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return i2;
    }

    CharSequence toCharSequence() {
        StringBuilder sb = this.sanitizedNaieJson;
        return sb != null ? sb.toString() : this.jsonStr;
    }

    public String toString() {
        StringBuilder sb = this.sanitizedNaieJson;
        return sb != null ? sb.toString() : this.jsonStr;
    }

    static final class UnbracketedNaieComma extends Exception {
        private static final long serialVersionUID = 783239978717247850L;

        private UnbracketedNaieComma() {
        }
    }
}
