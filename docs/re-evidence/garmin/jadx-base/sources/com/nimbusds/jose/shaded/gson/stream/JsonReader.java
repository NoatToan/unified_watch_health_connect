package com.nimbusds.jose.shaded.gson.stream;

import am.j;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import com.google.firebase.messaging.l;
import com.google.maps.android.BuildConfig;
import com.nimbusds.jose.shaded.gson.Strictness;
import com.nimbusds.jose.shaded.gson.internal.JsonReaderInternalAccess;
import com.nimbusds.jose.shaded.gson.internal.TroubleshootingGuide;
import com.nimbusds.jose.shaded.gson.internal.bind.JsonTreeReader;
import hb.a;
import i3.e5;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.CharUtils;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class JsonReader implements Closeable {
    static final int BUFFER_SIZE = 1024;
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    private final Reader f54744in;
    private int[] pathIndices;
    private String[] pathNames;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int[] stack;
    private Strictness strictness = Strictness.LEGACY_STRICT;
    private final char[] buffer = new char[1024];
    private int pos = 0;
    private int limit = 0;
    private int lineNumber = 0;
    private int lineStart = 0;
    int peeked = 0;
    private int stackSize = 1;

    static {
        JsonReaderInternalAccess.INSTANCE = new JsonReaderInternalAccess() { // from class: com.nimbusds.jose.shaded.gson.stream.JsonReader.1
            @Override // com.nimbusds.jose.shaded.gson.internal.JsonReaderInternalAccess
            public void promoteNameToValue(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof JsonTreeReader) {
                    ((JsonTreeReader) jsonReader).promoteNameToValue();
                    return;
                }
                int iDoPeek = jsonReader.peeked;
                if (iDoPeek == 0) {
                    iDoPeek = jsonReader.doPeek();
                }
                if (iDoPeek == 13) {
                    jsonReader.peeked = 9;
                } else if (iDoPeek == 12) {
                    jsonReader.peeked = 8;
                } else {
                    if (iDoPeek != 14) {
                        throw jsonReader.unexpectedTokenError("a name");
                    }
                    jsonReader.peeked = 10;
                }
            }
        };
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.stack = iArr;
        iArr[0] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f54744in = reader;
    }

    private void checkLenient() throws MalformedJsonException {
        if (this.strictness != Strictness.LENIENT) {
            throw syntaxError("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private void consumeNonExecutePrefix() throws IOException {
        nextNonWhitespace(true);
        int i14 = this.pos;
        this.pos = i14 - 1;
        if (i14 + 4 <= this.limit || fillBuffer(5)) {
            int i15 = this.pos;
            char[] cArr = this.buffer;
            if (cArr[i15] == ')' && cArr[i15 + 1] == ']' && cArr[i15 + 2] == '}' && cArr[i15 + 3] == '\'' && cArr[i15 + 4] == '\n') {
                this.pos = i15 + 5;
            }
        }
    }

    private boolean fillBuffer(int i14) throws IOException {
        int i15;
        int i16;
        char[] cArr = this.buffer;
        int i17 = this.lineStart;
        int i18 = this.pos;
        this.lineStart = i17 - i18;
        int i19 = this.limit;
        if (i19 != i18) {
            int i24 = i19 - i18;
            this.limit = i24;
            System.arraycopy(cArr, i18, cArr, 0, i24);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            Reader reader = this.f54744in;
            int i25 = this.limit;
            int i26 = reader.read(cArr, i25, cArr.length - i25);
            if (i26 == -1) {
                return false;
            }
            i15 = this.limit + i26;
            this.limit = i15;
            if (this.lineNumber == 0 && (i16 = this.lineStart) == 0 && i15 > 0 && cArr[0] == 65279) {
                this.pos++;
                this.lineStart = i16 + 1;
                i14++;
            }
        } while (i15 < i14);
        return true;
    }

    private String getPath(boolean z14) {
        StringBuilder sb3 = new StringBuilder("$");
        int i14 = 0;
        while (true) {
            int i15 = this.stackSize;
            if (i14 >= i15) {
                return sb3.toString();
            }
            int i16 = this.stack[i14];
            switch (i16) {
                case 1:
                case 2:
                    int i17 = this.pathIndices[i14];
                    if (z14 && i17 > 0 && i14 == i15 - 1) {
                        i17--;
                    }
                    sb3.append('[');
                    sb3.append(i17);
                    sb3.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb3.append('.');
                    String str = this.pathNames[i14];
                    if (str != null) {
                        sb3.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    h.q(j.h(i16, "Unknown scope value: "));
                    return null;
            }
            i14++;
        }
    }

    private boolean isLiteral(char c14) throws MalformedJsonException {
        if (c14 == '\t' || c14 == '\n' || c14 == '\f' || c14 == '\r' || c14 == ' ') {
            return false;
        }
        if (c14 != '#') {
            if (c14 == ',') {
                return false;
            }
            if (c14 != '/' && c14 != '=') {
                if (c14 == '{' || c14 == '}' || c14 == ':') {
                    return false;
                }
                if (c14 != ';') {
                    switch (c14) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    private int nextNonWhitespace(boolean z14) throws IOException {
        char[] cArr = this.buffer;
        int i14 = this.pos;
        int i15 = this.limit;
        while (true) {
            if (i14 == i15) {
                this.pos = i14;
                if (!fillBuffer(1)) {
                    if (!z14) {
                        return -1;
                    }
                    l.p(locationString(), "End of input");
                    return 0;
                }
                i14 = this.pos;
                i15 = this.limit;
            }
            int i16 = i14 + 1;
            char c14 = cArr[i14];
            if (c14 == '\n') {
                this.lineNumber++;
                this.lineStart = i16;
            } else if (c14 != ' ' && c14 != '\r' && c14 != '\t') {
                if (c14 == '/') {
                    this.pos = i16;
                    if (i16 == i15) {
                        this.pos = i14;
                        boolean zFillBuffer = fillBuffer(2);
                        this.pos++;
                        if (!zFillBuffer) {
                        }
                        return c14;
                    }
                    checkLenient();
                    int i17 = this.pos;
                    char c15 = cArr[i17];
                    if (c15 == '*') {
                        this.pos = i17 + 1;
                        if (!skipTo("*/")) {
                            throw syntaxError("Unterminated comment");
                        }
                        i14 = this.pos + 2;
                        i15 = this.limit;
                    } else {
                        if (c15 != '/') {
                            return c14;
                        }
                        this.pos = i17 + 1;
                        skipToEndOfLine();
                        i14 = this.pos;
                        i15 = this.limit;
                    }
                } else {
                    if (c14 != '#') {
                        this.pos = i16;
                        return c14;
                    }
                    this.pos = i16;
                    checkLenient();
                    skipToEndOfLine();
                    i14 = this.pos;
                    i15 = this.limit;
                }
            }
            i14 = i16;
        }
    }

    private String nextQuotedValue(char c14) throws MalformedJsonException {
        int i14;
        char[] cArr = this.buffer;
        StringBuilder sb3 = null;
        do {
            int i15 = this.pos;
            int i16 = this.limit;
            while (true) {
                int i17 = i16;
                i14 = i15;
                while (true) {
                    if (i15 < i17) {
                        int i18 = i15 + 1;
                        char c15 = cArr[i15];
                        if (this.strictness == Strictness.STRICT && c15 < ' ') {
                            throw syntaxError("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        }
                        if (c15 == c14) {
                            this.pos = i18;
                            int i19 = (i18 - i14) - 1;
                            if (sb3 == null) {
                                return new String(cArr, i14, i19);
                            }
                            sb3.append(cArr, i14, i19);
                            return sb3.toString();
                        }
                        if (c15 == '\\') {
                            this.pos = i18;
                            int i24 = i18 - i14;
                            int i25 = i24 - 1;
                            if (sb3 == null) {
                                sb3 = new StringBuilder(Math.max(i24 * 2, 16));
                            }
                            sb3.append(cArr, i14, i25);
                            sb3.append(readEscapeCharacter());
                            i15 = this.pos;
                            i16 = this.limit;
                        } else {
                            if (c15 == '\n') {
                                this.lineNumber++;
                                this.lineStart = i18;
                            }
                            i15 = i18;
                        }
                    }
                }
            }
            if (sb3 == null) {
                sb3 = new StringBuilder(Math.max((i15 - i14) * 2, 16));
            }
            sb3.append(cArr, i14, i15 - i14);
            this.pos = i15;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String nextUnquotedValue() throws MalformedJsonException {
        String string;
        StringBuilder sb3 = null;
        int i14 = 0;
        while (true) {
            int i15 = 0;
            while (true) {
                int i16 = this.pos;
                int i17 = i16 + i15;
                int i18 = this.limit;
                char[] cArr = this.buffer;
                if (i17 < i18) {
                    char c14 = cArr[i16 + i15];
                    if (c14 != '\t' && c14 != '\n' && c14 != '\f' && c14 != '\r' && c14 != ' ') {
                        if (c14 != '#') {
                            if (c14 != ',') {
                                if (c14 != '/' && c14 != '=') {
                                    if (c14 != '{' && c14 != '}' && c14 != ':') {
                                        if (c14 != ';') {
                                            switch (c14) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i15++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        checkLenient();
                    }
                    i14 = i15;
                } else if (i15 >= cArr.length) {
                    if (sb3 == null) {
                        sb3 = new StringBuilder(Math.max(i15, 16));
                    }
                    sb3.append(this.buffer, this.pos, i15);
                    this.pos += i15;
                    if (!fillBuffer(1)) {
                    }
                } else if (!fillBuffer(i15 + 1)) {
                    i14 = i15;
                }
                char[] cArr2 = this.buffer;
                if (sb3 == null) {
                    string = new String(cArr2, this.pos, i14);
                } else {
                    sb3.append(cArr2, this.pos, i14);
                    string = sb3.toString();
                }
                this.pos += i14;
                return string;
            }
        }
    }

    private int peekKeyword() {
        String str;
        String str2;
        int i14;
        char c14 = this.buffer[this.pos];
        if (c14 == 't' || c14 == 'T') {
            str = BooleanUtils.TRUE;
            str2 = "TRUE";
            i14 = 5;
        } else if (c14 == 'f' || c14 == 'F') {
            str = BooleanUtils.FALSE;
            str2 = "FALSE";
            i14 = 6;
        } else {
            if (c14 != 'n' && c14 != 'N') {
                return 0;
            }
            str = BuildConfig.TRAVIS;
            str2 = ActionConst.NULL;
            i14 = 7;
        }
        boolean z14 = this.strictness != Strictness.STRICT;
        int length = str.length();
        int i15 = 0;
        while (true) {
            int i16 = this.pos;
            if (i15 >= length) {
                if ((i16 + length < this.limit || fillBuffer(length + 1)) && isLiteral(this.buffer[this.pos + length])) {
                    return 0;
                }
                this.pos += length;
                this.peeked = i14;
                return i14;
            }
            if (i16 + i15 >= this.limit && !fillBuffer(i15 + 1)) {
                return 0;
            }
            char c15 = this.buffer[this.pos + i15];
            if (c15 != str.charAt(i15) && (!z14 || c15 != str2.charAt(i15))) {
                break;
            }
            i15++;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00da  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e1  */
    private int peekNumber() {
        char c14;
        int i14;
        char[] cArr = this.buffer;
        int i15 = this.pos;
        int i16 = this.limit;
        int i17 = 0;
        int i18 = 0;
        char c15 = 0;
        boolean z14 = false;
        int i19 = 1;
        long j8 = 0;
        while (true) {
            char c16 = 2;
            if (i15 + i18 != i16) {
                c14 = cArr[i15 + i18];
                i14 = i17;
                if (c14 != '+') {
                    if (c14 != 'E' || c14 == 'e') {
                        if (c15 == 2 && c15 != 4) {
                            return i14;
                        }
                        c15 = 5;
                    } else if (c14 == '-') {
                        c16 = 6;
                        if (c15 == 0) {
                            c15 = 1;
                            z14 = true;
                        } else if (c15 != 5) {
                            return i14;
                        }
                    } else if (c14 != '.') {
                        if (c14 < '0' || c14 > '9') {
                            if (!isLiteral(c14)) {
                                break;
                            }
                            return i14;
                        }
                        if (c15 == 1 || c15 == 0) {
                            j8 = -(c14 - '0');
                        } else if (c15 == 2) {
                            if (j8 == 0) {
                                return i14;
                            }
                            long j14 = (10 * j8) - ((long) (c14 - '0'));
                            i19 &= (j8 > MIN_INCOMPLETE_INTEGER || (j8 == MIN_INCOMPLETE_INTEGER && j14 < j8)) ? 1 : i14;
                            j8 = j14;
                        } else if (c15 == 3) {
                            c15 = 4;
                        } else if (c15 == 5 || c15 == 6) {
                            c15 = 7;
                        }
                    } else {
                        if (c15 != 2) {
                            return i14;
                        }
                        c15 = 3;
                    }
                    i18++;
                    i17 = i14;
                } else {
                    c16 = 6;
                    if (c15 != 5) {
                        return i14;
                    }
                }
                c15 = c16;
                i18++;
                i17 = i14;
            } else {
                if (i18 == cArr.length) {
                    return i17;
                }
                if (!fillBuffer(i18 + 1)) {
                    i14 = i17;
                    break;
                }
                i15 = this.pos;
                i16 = this.limit;
                c14 = cArr[i15 + i18];
                i14 = i17;
                if (c14 != '+') {
                    if (c14 != 'E') {
                        if (c15 == 2) {
                        }
                        c15 = 5;
                    } else {
                        if (c15 == 2) {
                        }
                        c15 = 5;
                    }
                    i18++;
                    i17 = i14;
                } else {
                    c16 = 6;
                    if (c15 != 5) {
                        return i14;
                    }
                }
                c15 = c16;
                i18++;
                i17 = i14;
            }
        }
        if (c15 == 2 && i19 != 0 && ((j8 != Long.MIN_VALUE || z14) && (j8 != 0 || !z14))) {
            if (!z14) {
                j8 = -j8;
            }
            this.peekedLong = j8;
            this.pos += i18;
            this.peeked = 15;
            return 15;
        }
        if (c15 != 2 && c15 != 4 && c15 != 7) {
            return i14;
        }
        this.peekedNumberLength = i18;
        this.peeked = 16;
        return 16;
    }

    private void push(int i14) {
        int i15 = this.stackSize;
        int[] iArr = this.stack;
        if (i15 == iArr.length) {
            int i16 = i15 * 2;
            this.stack = Arrays.copyOf(iArr, i16);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i16);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i16);
        }
        int[] iArr2 = this.stack;
        int i17 = this.stackSize;
        this.stackSize = i17 + 1;
        iArr2[i17] = i14;
    }

    private char readEscapeCharacter() throws MalformedJsonException {
        int i14;
        if (this.pos == this.limit && !fillBuffer(1)) {
            throw syntaxError("Unterminated escape sequence");
        }
        char[] cArr = this.buffer;
        int i15 = this.pos;
        int i16 = i15 + 1;
        this.pos = i16;
        char c14 = cArr[i15];
        if (c14 != '\n') {
            if (c14 != '\"') {
                if (c14 != '\'') {
                    if (c14 != '/' && c14 != '\\') {
                        if (c14 == 'b') {
                            return '\b';
                        }
                        if (c14 == 'f') {
                            return '\f';
                        }
                        if (c14 == 'n') {
                            return '\n';
                        }
                        if (c14 == 'r') {
                            return CharUtils.CR;
                        }
                        if (c14 == 't') {
                            return '\t';
                        }
                        if (c14 != 'u') {
                            throw syntaxError("Invalid escape sequence");
                        }
                        if (i15 + 5 > this.limit && !fillBuffer(4)) {
                            throw syntaxError("Unterminated escape sequence");
                        }
                        int i17 = this.pos;
                        int i18 = i17 + 4;
                        int i19 = 0;
                        while (i17 < i18) {
                            char[] cArr2 = this.buffer;
                            char c15 = cArr2[i17];
                            int i24 = i19 << 4;
                            if (c15 >= '0' && c15 <= '9') {
                                i14 = c15 - '0';
                            } else if (c15 >= 'a' && c15 <= 'f') {
                                i14 = c15 - 'W';
                            } else {
                                if (c15 < 'A' || c15 > 'F') {
                                    throw syntaxError("Malformed Unicode escape \\u".concat(new String(cArr2, this.pos, 4)));
                                }
                                i14 = c15 - '7';
                            }
                            i19 = i14 + i24;
                            i17++;
                        }
                        this.pos += 4;
                        return (char) i19;
                    }
                }
            }
            return c14;
        }
        if (this.strictness == Strictness.STRICT) {
            throw syntaxError("Cannot escape a newline character in strict mode");
        }
        this.lineNumber++;
        this.lineStart = i16;
        if (this.strictness == Strictness.STRICT) {
            throw syntaxError("Invalid escaped character \"'\" in strict mode");
        }
        return c14;
    }

    private void skipQuotedValue(char c14) throws MalformedJsonException {
        char[] cArr = this.buffer;
        do {
            int i14 = this.pos;
            int i15 = this.limit;
            while (i14 < i15) {
                int i16 = i14 + 1;
                char c15 = cArr[i14];
                if (c15 == c14) {
                    this.pos = i16;
                    return;
                }
                if (c15 == '\\') {
                    this.pos = i16;
                    readEscapeCharacter();
                    i14 = this.pos;
                    i15 = this.limit;
                } else {
                    if (c15 == '\n') {
                        this.lineNumber++;
                        this.lineStart = i16;
                    }
                    i14 = i16;
                }
            }
            this.pos = i14;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    private boolean skipTo(String str) {
        int length = str.length();
        while (true) {
            if (this.pos + length > this.limit && !fillBuffer(length)) {
                return false;
            }
            char[] cArr = this.buffer;
            int i14 = this.pos;
            if (cArr[i14] != '\n') {
                for (int i15 = 0; i15 < length; i15++) {
                    if (this.buffer[this.pos + i15] == str.charAt(i15)) {
                    }
                }
                return true;
            }
            this.lineNumber++;
            this.lineStart = i14 + 1;
            this.pos++;
        }
    }

    private void skipToEndOfLine() {
        char c14;
        do {
            if (this.pos >= this.limit && !fillBuffer(1)) {
                return;
            }
            char[] cArr = this.buffer;
            int i14 = this.pos;
            int i15 = i14 + 1;
            this.pos = i15;
            c14 = cArr[i14];
            if (c14 == '\n') {
                this.lineNumber++;
                this.lineStart = i15;
                return;
            }
        } while (c14 != '\r');
    }

    private void skipUnquotedValue() throws MalformedJsonException {
        do {
            int i14 = 0;
            while (true) {
                int i15 = this.pos;
                if (i15 + i14 < this.limit) {
                    char c14 = this.buffer[i15 + i14];
                    if (c14 != '\t' && c14 != '\n' && c14 != '\f' && c14 != '\r' && c14 != ' ') {
                        if (c14 != '#') {
                            if (c14 != ',') {
                                if (c14 != '/' && c14 != '=') {
                                    if (c14 != '{' && c14 != '}' && c14 != ':') {
                                        if (c14 != ';') {
                                            switch (c14) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i14++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        checkLenient();
                    }
                    this.pos += i14;
                    return;
                }
                this.pos = i15 + i14;
            }
        } while (fillBuffer(1));
    }

    private MalformedJsonException syntaxError(String str) throws MalformedJsonException {
        StringBuilder sbK = e5.k(str);
        sbK.append(locationString());
        sbK.append("\nSee ");
        sbK.append(TroubleshootingGuide.createUrl("malformed-json"));
        throw new MalformedJsonException(sbK.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IllegalStateException unexpectedTokenError(String str) {
        String str2 = peek() == JsonToken.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbL = a.l("Expected ", str, " but was ");
        sbL.append(peek());
        sbL.append(locationString());
        sbL.append("\nSee ");
        sbL.append(TroubleshootingGuide.createUrl(str2));
        return new IllegalStateException(sbL.toString());
    }

    public void beginArray() {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 3) {
            throw unexpectedTokenError("BEGIN_ARRAY");
        }
        push(1);
        this.pathIndices[this.stackSize - 1] = 0;
        this.peeked = 0;
    }

    public void beginObject() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 1) {
            throw unexpectedTokenError("BEGIN_OBJECT");
        }
        push(3);
        this.peeked = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.f54744in.close();
    }

    public int doPeek() throws IOException {
        int iNextNonWhitespace;
        int[] iArr = this.stack;
        int i14 = this.stackSize;
        int i15 = iArr[i14 - 1];
        if (i15 == 1) {
            iArr[i14 - 1] = 2;
        } else if (i15 == 2) {
            int iNextNonWhitespace2 = nextNonWhitespace(true);
            if (iNextNonWhitespace2 != 44) {
                if (iNextNonWhitespace2 != 59) {
                    if (iNextNonWhitespace2 != 93) {
                        throw syntaxError("Unterminated array");
                    }
                    this.peeked = 4;
                    return 4;
                }
                checkLenient();
            }
        } else {
            if (i15 == 3 || i15 == 5) {
                iArr[i14 - 1] = 4;
                if (i15 == 5 && (iNextNonWhitespace = nextNonWhitespace(true)) != 44) {
                    if (iNextNonWhitespace != 59) {
                        if (iNextNonWhitespace != 125) {
                            throw syntaxError("Unterminated object");
                        }
                        this.peeked = 2;
                        return 2;
                    }
                    checkLenient();
                }
                int iNextNonWhitespace3 = nextNonWhitespace(true);
                if (iNextNonWhitespace3 == 34) {
                    this.peeked = 13;
                    return 13;
                }
                if (iNextNonWhitespace3 == 39) {
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (iNextNonWhitespace3 == 125) {
                    if (i15 == 5) {
                        throw syntaxError("Expected name");
                    }
                    this.peeked = 2;
                    return 2;
                }
                checkLenient();
                this.pos--;
                if (!isLiteral((char) iNextNonWhitespace3)) {
                    throw syntaxError("Expected name");
                }
                this.peeked = 14;
                return 14;
            }
            if (i15 == 4) {
                iArr[i14 - 1] = 5;
                int iNextNonWhitespace4 = nextNonWhitespace(true);
                if (iNextNonWhitespace4 != 58) {
                    if (iNextNonWhitespace4 != 61) {
                        throw syntaxError("Expected ':'");
                    }
                    checkLenient();
                    if (this.pos < this.limit || fillBuffer(1)) {
                        char[] cArr = this.buffer;
                        int i16 = this.pos;
                        if (cArr[i16] == '>') {
                            this.pos = i16 + 1;
                        }
                    }
                }
            } else if (i15 == 6) {
                if (this.strictness == Strictness.LENIENT) {
                    consumeNonExecutePrefix();
                }
                this.stack[this.stackSize - 1] = 7;
            } else if (i15 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                checkLenient();
                this.pos--;
            } else if (i15 == 8) {
                h.z("JsonReader is closed");
                return 0;
            }
        }
        int iNextNonWhitespace5 = nextNonWhitespace(true);
        if (iNextNonWhitespace5 == 34) {
            this.peeked = 9;
            return 9;
        }
        if (iNextNonWhitespace5 == 39) {
            checkLenient();
            this.peeked = 8;
            return 8;
        }
        if (iNextNonWhitespace5 != 44 && iNextNonWhitespace5 != 59) {
            if (iNextNonWhitespace5 == 91) {
                this.peeked = 3;
                return 3;
            }
            if (iNextNonWhitespace5 != 93) {
                if (iNextNonWhitespace5 == 123) {
                    this.peeked = 1;
                    return 1;
                }
                this.pos--;
                int iPeekKeyword = peekKeyword();
                if (iPeekKeyword != 0) {
                    return iPeekKeyword;
                }
                int iPeekNumber = peekNumber();
                if (iPeekNumber != 0) {
                    return iPeekNumber;
                }
                if (!isLiteral(this.buffer[this.pos])) {
                    throw syntaxError("Expected value");
                }
                checkLenient();
                this.peeked = 10;
                return 10;
            }
            if (i15 == 1) {
                this.peeked = 4;
                return 4;
            }
        }
        if (i15 != 1 && i15 != 2) {
            throw syntaxError("Unexpected value");
        }
        checkLenient();
        this.pos--;
        this.peeked = 7;
        return 7;
    }

    public void endArray() {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 4) {
            throw unexpectedTokenError("END_ARRAY");
        }
        int i14 = this.stackSize;
        this.stackSize = i14 - 1;
        int[] iArr = this.pathIndices;
        int i15 = i14 - 2;
        iArr[i15] = iArr[i15] + 1;
        this.peeked = 0;
    }

    public void endObject() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 2) {
            throw unexpectedTokenError("END_OBJECT");
        }
        int i14 = this.stackSize;
        int i15 = i14 - 1;
        this.stackSize = i15;
        this.pathNames[i15] = null;
        int[] iArr = this.pathIndices;
        int i16 = i14 - 2;
        iArr[i16] = iArr[i16] + 1;
        this.peeked = 0;
    }

    public String getPreviousPath() {
        return getPath(true);
    }

    public final Strictness getStrictness() {
        return this.strictness;
    }

    public boolean hasNext() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        return (iDoPeek == 2 || iDoPeek == 4 || iDoPeek == 17) ? false : true;
    }

    public final boolean isLenient() {
        return this.strictness == Strictness.LENIENT;
    }

    public String locationString() {
        StringBuilder sbJ = e5.j(this.lineNumber + 1, (this.pos - this.lineStart) + 1, " at line ", " column ", " path ");
        sbJ.append(getPath());
        return sbJ.toString();
    }

    public boolean nextBoolean() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i14 = this.stackSize - 1;
            iArr[i14] = iArr[i14] + 1;
            return true;
        }
        if (iDoPeek != 6) {
            throw unexpectedTokenError("a boolean");
        }
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i15 = this.stackSize - 1;
        iArr2[i15] = iArr2[i15] + 1;
        return false;
    }

    public double nextDouble() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i14 = this.stackSize - 1;
            iArr[i14] = iArr[i14] + 1;
            return this.peekedLong;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (iDoPeek == 8 || iDoPeek == 9) {
            this.peekedString = nextQuotedValue(iDoPeek == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (iDoPeek == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (iDoPeek != 11) {
            throw unexpectedTokenError("a double");
        }
        this.peeked = 11;
        double d14 = Double.parseDouble(this.peekedString);
        if (this.strictness != Strictness.LENIENT && (Double.isNaN(d14) || Double.isInfinite(d14))) {
            throw syntaxError("JSON forbids NaN and infinities: " + d14);
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i15 = this.stackSize - 1;
        iArr2[i15] = iArr2[i15] + 1;
        return d14;
    }

    public int nextInt() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            long j8 = this.peekedLong;
            int i14 = (int) j8;
            if (j8 == i14) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i15 = this.stackSize - 1;
                iArr[i15] = iArr[i15] + 1;
                return i14;
            }
            throw new NumberFormatException("Expected an int but was " + this.peekedLong + locationString());
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (iDoPeek != 8 && iDoPeek != 9 && iDoPeek != 10) {
                throw unexpectedTokenError("an int");
            }
            if (iDoPeek == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(iDoPeek == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            try {
                int i16 = Integer.parseInt(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i17 = this.stackSize - 1;
                iArr2[i17] = iArr2[i17] + 1;
                return i16;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double d14 = Double.parseDouble(this.peekedString);
        int i18 = (int) d14;
        if (i18 != d14) {
            l.l("Expected an int but was ", this.peekedString, locationString());
            return 0;
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i19 = this.stackSize - 1;
        iArr3[i19] = iArr3[i19] + 1;
        return i18;
    }

    public long nextLong() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i14 = this.stackSize - 1;
            iArr[i14] = iArr[i14] + 1;
            return this.peekedLong;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (iDoPeek != 8 && iDoPeek != 9 && iDoPeek != 10) {
                throw unexpectedTokenError("a long");
            }
            if (iDoPeek == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(iDoPeek == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            try {
                long j8 = Long.parseLong(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i15 = this.stackSize - 1;
                iArr2[i15] = iArr2[i15] + 1;
                return j8;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double d14 = Double.parseDouble(this.peekedString);
        long j14 = (long) d14;
        if (j14 != d14) {
            l.l("Expected a long but was ", this.peekedString, locationString());
            return 0L;
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i16 = this.stackSize - 1;
        iArr3[i16] = iArr3[i16] + 1;
        return j14;
    }

    public String nextName() throws IOException {
        String strNextQuotedValue;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 14) {
            strNextQuotedValue = nextUnquotedValue();
        } else if (iDoPeek == 12) {
            strNextQuotedValue = nextQuotedValue(CoreConstants.SINGLE_QUOTE_CHAR);
        } else {
            if (iDoPeek != 13) {
                throw unexpectedTokenError("a name");
            }
            strNextQuotedValue = nextQuotedValue(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = strNextQuotedValue;
        return strNextQuotedValue;
    }

    public void nextNull() {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 7) {
            throw unexpectedTokenError(BuildConfig.TRAVIS);
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i14 = this.stackSize - 1;
        iArr[i14] = iArr[i14] + 1;
    }

    public String nextString() throws IOException {
        String str;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 10) {
            str = nextUnquotedValue();
        } else if (iDoPeek == 8) {
            str = nextQuotedValue(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (iDoPeek == 9) {
            str = nextQuotedValue(CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (iDoPeek == 11) {
            str = this.peekedString;
            this.peekedString = null;
        } else if (iDoPeek == 15) {
            str = Long.toString(this.peekedLong);
        } else {
            if (iDoPeek != 16) {
                throw unexpectedTokenError("a string");
            }
            str = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i14 = this.stackSize - 1;
        iArr[i14] = iArr[i14] + 1;
        return str;
    }

    public JsonToken peek() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        switch (iDoPeek) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                e0.l();
                return null;
        }
    }

    @Deprecated
    public final void setLenient(boolean z14) {
        setStrictness(z14 ? Strictness.LENIENT : Strictness.LEGACY_STRICT);
    }

    public final void setStrictness(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.strictness = strictness;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void skipValue() throws IOException {
        int i14 = 0;
        do {
            int iDoPeek = this.peeked;
            if (iDoPeek == 0) {
                iDoPeek = doPeek();
            }
            switch (iDoPeek) {
                case 1:
                    push(3);
                    i14++;
                    this.peeked = 0;
                    break;
                case 2:
                    if (i14 == 0) {
                        this.pathNames[this.stackSize - 1] = null;
                    }
                    this.stackSize--;
                    i14--;
                    this.peeked = 0;
                    break;
                case 3:
                    push(1);
                    i14++;
                    this.peeked = 0;
                    break;
                case 4:
                    this.stackSize--;
                    i14--;
                    this.peeked = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.peeked = 0;
                    break;
                case 8:
                    skipQuotedValue(CoreConstants.SINGLE_QUOTE_CHAR);
                    this.peeked = 0;
                    break;
                case 9:
                    skipQuotedValue(CoreConstants.DOUBLE_QUOTE_CHAR);
                    this.peeked = 0;
                    break;
                case 10:
                    skipUnquotedValue();
                    this.peeked = 0;
                    break;
                case 12:
                    skipQuotedValue(CoreConstants.SINGLE_QUOTE_CHAR);
                    if (i14 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 13:
                    skipQuotedValue(CoreConstants.DOUBLE_QUOTE_CHAR);
                    if (i14 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 14:
                    skipUnquotedValue();
                    if (i14 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 16:
                    this.pos += this.peekedNumberLength;
                    this.peeked = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i14 > 0);
        int[] iArr = this.pathIndices;
        int i15 = this.stackSize - 1;
        iArr[i15] = iArr[i15] + 1;
    }

    public String toString() {
        return getClass().getSimpleName() + locationString();
    }

    public String getPath() {
        return getPath(false);
    }
}
