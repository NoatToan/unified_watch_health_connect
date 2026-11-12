package com.airbnb.lottie.parser.moshi;

import ch.qos.logback.core.joran.action.ActionConst;
import com.google.firebase.messaging.l;
import com.google.maps.android.BuildConfig;
import d53.c;
import j20.x;
import java.io.EOFException;
import java.io.IOException;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.CharUtils;
import v.e0;
import w63.e;
import w63.g;
import w63.h;

/* JADX INFO: loaded from: classes7.dex */
final class JsonUtf8Reader extends JsonReader {
    private static final h CLOSING_BLOCK_COMMENT;
    private static final h DOUBLE_QUOTE_OR_SLASH;
    private static final h LINEFEED_OR_CARRIAGE_RETURN;
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
    private static final int PEEKED_BUFFERED_NAME = 15;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 18;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 16;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 17;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private static final h SINGLE_QUOTE_OR_SLASH;
    private static final h UNQUOTED_STRING_TERMINALS;
    private final e buffer;
    private int peeked = 0;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private final g source;

    static {
        h.f183361d.getClass();
        SINGLE_QUOTE_OR_SLASH = h.a.c("'\\");
        DOUBLE_QUOTE_OR_SLASH = h.a.c("\"\\");
        UNQUOTED_STRING_TERMINALS = h.a.c("{}[]:, \n\t\r\f/\\;#=");
        LINEFEED_OR_CARRIAGE_RETURN = h.a.c("\n\r");
        CLOSING_BLOCK_COMMENT = h.a.c("*/");
    }

    public JsonUtf8Reader(g gVar) {
        if (gVar == null) {
            x.l("source == null");
            throw null;
        }
        this.source = gVar;
        this.buffer = gVar.j3();
        pushScope(6);
    }

    private void checkLenient() throws JsonEncodingException {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int doPeek() throws JsonEncodingException, EOFException {
        int[] iArr = this.scopes;
        int i14 = this.stackSize;
        int i15 = iArr[i14 - 1];
        if (i15 == 1) {
            iArr[i14 - 1] = 2;
        } else if (i15 == 2) {
            int iNextNonWhitespace = nextNonWhitespace(true);
            this.buffer.readByte();
            if (iNextNonWhitespace != 44) {
                if (iNextNonWhitespace != 59) {
                    if (iNextNonWhitespace != 93) {
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
                if (i15 == 5) {
                    int iNextNonWhitespace2 = nextNonWhitespace(true);
                    this.buffer.readByte();
                    if (iNextNonWhitespace2 != 44) {
                        if (iNextNonWhitespace2 != 59) {
                            if (iNextNonWhitespace2 != 125) {
                                throw syntaxError("Unterminated object");
                            }
                            this.peeked = 2;
                            return 2;
                        }
                        checkLenient();
                    }
                }
                int iNextNonWhitespace3 = nextNonWhitespace(true);
                if (iNextNonWhitespace3 == 34) {
                    this.buffer.readByte();
                    this.peeked = 13;
                    return 13;
                }
                if (iNextNonWhitespace3 == 39) {
                    this.buffer.readByte();
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (iNextNonWhitespace3 != 125) {
                    checkLenient();
                    if (!isLiteral((char) iNextNonWhitespace3)) {
                        throw syntaxError("Expected name");
                    }
                    this.peeked = 14;
                    return 14;
                }
                if (i15 == 5) {
                    throw syntaxError("Expected name");
                }
                this.buffer.readByte();
                this.peeked = 2;
                return 2;
            }
            if (i15 == 4) {
                iArr[i14 - 1] = 5;
                int iNextNonWhitespace4 = nextNonWhitespace(true);
                this.buffer.readByte();
                if (iNextNonWhitespace4 != 58) {
                    if (iNextNonWhitespace4 != 61) {
                        throw syntaxError("Expected ':'");
                    }
                    checkLenient();
                    if (this.source.b(1L) && this.buffer.j(0L) == 62) {
                        this.buffer.readByte();
                    }
                }
            } else if (i15 == 6) {
                iArr[i14 - 1] = 7;
            } else if (i15 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 18;
                    return 18;
                }
                checkLenient();
            } else if (i15 == 8) {
                vb.h.z("JsonReader is closed");
                return 0;
            }
        }
        int iNextNonWhitespace5 = nextNonWhitespace(true);
        if (iNextNonWhitespace5 == 34) {
            this.buffer.readByte();
            this.peeked = 9;
            return 9;
        }
        if (iNextNonWhitespace5 == 39) {
            checkLenient();
            this.buffer.readByte();
            this.peeked = 8;
            return 8;
        }
        if (iNextNonWhitespace5 != 44 && iNextNonWhitespace5 != 59) {
            if (iNextNonWhitespace5 == 91) {
                this.buffer.readByte();
                this.peeked = 3;
                return 3;
            }
            if (iNextNonWhitespace5 != 93) {
                if (iNextNonWhitespace5 == 123) {
                    this.buffer.readByte();
                    this.peeked = 1;
                    return 1;
                }
                int iPeekKeyword = peekKeyword();
                if (iPeekKeyword != 0) {
                    return iPeekKeyword;
                }
                int iPeekNumber = peekNumber();
                if (iPeekNumber != 0) {
                    return iPeekNumber;
                }
                if (!isLiteral(this.buffer.j(0L))) {
                    throw syntaxError("Expected value");
                }
                checkLenient();
                this.peeked = 10;
                return 10;
            }
            if (i15 == 1) {
                this.buffer.readByte();
                this.peeked = 4;
                return 4;
            }
        }
        if (i15 != 1 && i15 != 2) {
            throw syntaxError("Unexpected value");
        }
        checkLenient();
        this.peeked = 7;
        return 7;
    }

    private int findName(String str, JsonReader.Options options) {
        int length = options.strings.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (str.equals(options.strings[i14])) {
                this.peeked = 0;
                this.pathNames[this.stackSize - 1] = str;
                return i14;
            }
        }
        return -1;
    }

    private boolean isLiteral(int i14) throws JsonEncodingException {
        if (i14 == 9 || i14 == 10 || i14 == 12 || i14 == 13 || i14 == 32) {
            return false;
        }
        if (i14 != 35) {
            if (i14 == 44) {
                return false;
            }
            if (i14 != 47 && i14 != 61) {
                if (i14 == 123 || i14 == 125 || i14 == 58) {
                    return false;
                }
                if (i14 != 59) {
                    switch (i14) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
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

    private int nextNonWhitespace(boolean z14) throws JsonEncodingException, EOFException {
        byte bJ;
        while (true) {
            int i14 = 0;
            while (true) {
                int i15 = i14 + 1;
                if (!this.source.b(i15)) {
                    if (z14) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bJ = this.buffer.j(i14);
                if (bJ == 10 || bJ == 32 || bJ == 13 || bJ == 9) {
                    i14 = i15;
                }
            }
            this.buffer.skip(i14);
            if (bJ == 47) {
                if (this.source.b(2L)) {
                    checkLenient();
                    byte bJ2 = this.buffer.j(1L);
                    if (bJ2 == 42) {
                        this.buffer.readByte();
                        this.buffer.readByte();
                        if (!skipToEndOfBlockComment()) {
                            throw syntaxError("Unterminated comment");
                        }
                    } else if (bJ2 == 47) {
                        this.buffer.readByte();
                        this.buffer.readByte();
                        skipToEndOfLine();
                    }
                }
                return bJ;
            }
            if (bJ != 35) {
                return bJ;
            }
            checkLenient();
            skipToEndOfLine();
        }
    }

    private String nextQuotedValue(h hVar) throws JsonEncodingException, EOFException {
        StringBuilder sb3 = null;
        while (true) {
            long jT1 = this.source.t1(hVar);
            if (jT1 == -1) {
                throw syntaxError("Unterminated string");
            }
            if (this.buffer.j(jT1) != 92) {
                e eVar = this.buffer;
                if (sb3 == null) {
                    eVar.getClass();
                    String strW = eVar.w(jT1, c.f57666b);
                    this.buffer.readByte();
                    return strW;
                }
                eVar.getClass();
                sb3.append(eVar.w(jT1, c.f57666b));
                this.buffer.readByte();
                return sb3.toString();
            }
            if (sb3 == null) {
                sb3 = new StringBuilder();
            }
            e eVar2 = this.buffer;
            eVar2.getClass();
            sb3.append(eVar2.w(jT1, c.f57666b));
            this.buffer.readByte();
            sb3.append(readEscapeCharacter());
        }
    }

    private String nextUnquotedValue() {
        long jT1 = this.source.t1(UNQUOTED_STRING_TERMINALS);
        e eVar = this.buffer;
        if (jT1 == -1) {
            return eVar.x();
        }
        eVar.getClass();
        return eVar.w(jT1, c.f57666b);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private int peekKeyword() throws EOFException {
        String str;
        String str2;
        int i14;
        byte bJ = this.buffer.j(0L);
        if (bJ == 116 || bJ == 84) {
            str = BooleanUtils.TRUE;
            str2 = "TRUE";
            i14 = 5;
        } else if (bJ == 102 || bJ == 70) {
            str = BooleanUtils.FALSE;
            str2 = "FALSE";
            i14 = 6;
        } else {
            if (bJ != 110 && bJ != 78) {
                return 0;
            }
            str = BuildConfig.TRAVIS;
            str2 = ActionConst.NULL;
            i14 = 7;
        }
        int length = str.length();
        int i15 = 1;
        while (true) {
            g gVar = this.source;
            if (i15 >= length) {
                if (gVar.b(length + 1) && isLiteral(this.buffer.j(length))) {
                    return 0;
                }
                this.buffer.skip(length);
                this.peeked = i14;
                return i14;
            }
            int i16 = i15 + 1;
            if (!gVar.b(i16)) {
                return 0;
            }
            byte bJ2 = this.buffer.j(i15);
            if (bJ2 != str.charAt(i15) && bJ2 != str2.charAt(i15)) {
                return 0;
            }
            i15 = i16;
        }
    }

    private int peekNumber() throws EOFException {
        long j8;
        int i14;
        boolean z14 = true;
        int i15 = 0;
        char c14 = 0;
        long j14 = 0;
        boolean z15 = false;
        while (true) {
            int i16 = i15 + 1;
            if (!this.source.b(i16)) {
                j8 = 0;
                i14 = 0;
                break;
            }
            j8 = 0;
            byte bJ = this.buffer.j(i15);
            i14 = 0;
            if (bJ != 43) {
                if (bJ == 69 || bJ == 101) {
                    if (c14 != 2 && c14 != 4) {
                        return 0;
                    }
                    c14 = 5;
                } else if (bJ != 45) {
                    if (bJ != 46) {
                        if (bJ < 48 || bJ > 57) {
                            if (!isLiteral(bJ)) {
                                break;
                            }
                            return 0;
                        }
                        if (c14 == 1 || c14 == 0) {
                            j14 = -(bJ - 48);
                            c14 = 2;
                        } else if (c14 == 2) {
                            if (j14 == 0) {
                                return 0;
                            }
                            long j15 = (10 * j14) - ((long) (bJ - 48));
                            z14 &= j14 > MIN_INCOMPLETE_INTEGER || (j14 == MIN_INCOMPLETE_INTEGER && j15 < j14);
                            j14 = j15;
                        } else if (c14 == 3) {
                            c14 = 4;
                        } else if (c14 == 5 || c14 == 6) {
                            c14 = 7;
                        }
                    } else {
                        if (c14 != 2) {
                            return 0;
                        }
                        c14 = 3;
                    }
                } else if (c14 == 0) {
                    c14 = 1;
                    z15 = true;
                } else if (c14 != 5) {
                    return 0;
                }
                i15 = i16;
            } else if (c14 != 5) {
                return 0;
            }
            c14 = 6;
            i15 = i16;
        }
        if (c14 == 2 && z14 && ((j14 != Long.MIN_VALUE || z15) && (j14 != j8 || !z15))) {
            if (!z15) {
                j14 = -j14;
            }
            this.peekedLong = j14;
            this.buffer.skip(i15);
            this.peeked = 16;
            return 16;
        }
        if (c14 != 2 && c14 != 4 && c14 != 7) {
            return i14;
        }
        this.peekedNumberLength = i15;
        this.peeked = 17;
        return 17;
    }

    private char readEscapeCharacter() throws JsonEncodingException, EOFException {
        int i14;
        if (!this.source.b(1L)) {
            throw syntaxError("Unterminated escape sequence");
        }
        byte b14 = this.buffer.readByte();
        if (b14 == 10 || b14 == 34 || b14 == 39 || b14 == 47 || b14 == 92) {
            return (char) b14;
        }
        if (b14 == 98) {
            return '\b';
        }
        if (b14 == 102) {
            return '\f';
        }
        if (b14 == 110) {
            return '\n';
        }
        if (b14 == 114) {
            return CharUtils.CR;
        }
        if (b14 == 116) {
            return '\t';
        }
        if (b14 != 117) {
            if (this.lenient) {
                return (char) b14;
            }
            throw syntaxError("Invalid escape sequence: \\" + ((char) b14));
        }
        if (!this.source.b(4L)) {
            l.p(getPath(), "Unterminated escape sequence at path ");
            return (char) 0;
        }
        int i15 = 0;
        char c14 = 0;
        while (true) {
            e eVar = this.buffer;
            if (i15 >= 4) {
                eVar.skip(4L);
                return c14;
            }
            byte bJ = eVar.j(i15);
            char c15 = (char) (c14 << 4);
            if (bJ >= 48 && bJ <= 57) {
                i14 = bJ - 48;
            } else if (bJ >= 97 && bJ <= 102) {
                i14 = bJ - 87;
            } else {
                if (bJ < 65 || bJ > 70) {
                    e eVar2 = this.buffer;
                    eVar2.getClass();
                    throw syntaxError("\\u".concat(eVar2.w(4L, c.f57666b)));
                }
                i14 = bJ - 55;
            }
            c14 = (char) (i14 + c15);
            i15++;
        }
    }

    private void skipQuotedValue(h hVar) throws JsonEncodingException, EOFException {
        while (true) {
            long jT1 = this.source.t1(hVar);
            if (jT1 == -1) {
                throw syntaxError("Unterminated string");
            }
            byte bJ = this.buffer.j(jT1);
            e eVar = this.buffer;
            if (bJ != 92) {
                eVar.skip(jT1 + 1);
                return;
            } else {
                eVar.skip(jT1 + 1);
                readEscapeCharacter();
            }
        }
    }

    private boolean skipToEndOfBlockComment() throws EOFException {
        g gVar = this.source;
        h hVar = CLOSING_BLOCK_COMMENT;
        long jE0 = gVar.E0(hVar);
        boolean z14 = jE0 != -1;
        e eVar = this.buffer;
        eVar.skip(z14 ? jE0 + ((long) hVar.d()) : eVar.f183349b);
        return z14;
    }

    private void skipToEndOfLine() throws EOFException {
        long jT1 = this.source.t1(LINEFEED_OR_CARRIAGE_RETURN);
        e eVar = this.buffer;
        eVar.skip(jT1 != -1 ? jT1 + 1 : eVar.f183349b);
    }

    private void skipUnquotedValue() throws EOFException {
        long jT1 = this.source.t1(UNQUOTED_STRING_TERMINALS);
        e eVar = this.buffer;
        if (jT1 == -1) {
            jT1 = eVar.f183349b;
        }
        eVar.skip(jT1);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginArray() throws JsonEncodingException, EOFException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 3) {
            pushScope(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
        } else {
            StringBuilder sb3 = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb3.append(peek());
            a.b(sb3, " at path ", getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginObject() throws JsonEncodingException, EOFException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 1) {
            pushScope(3);
            this.peeked = 0;
        } else {
            StringBuilder sb3 = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb3.append(peek());
            a.b(sb3, " at path ", getPath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.peeked = 0;
        this.scopes[0] = 8;
        this.stackSize = 1;
        this.buffer.a();
        this.source.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endArray() throws JsonEncodingException, EOFException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 4) {
            StringBuilder sb3 = new StringBuilder("Expected END_ARRAY but was ");
            sb3.append(peek());
            a.b(sb3, " at path ", getPath());
        } else {
            int i14 = this.stackSize;
            this.stackSize = i14 - 1;
            int[] iArr = this.pathIndices;
            int i15 = i14 - 2;
            iArr[i15] = iArr[i15] + 1;
            this.peeked = 0;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endObject() throws JsonEncodingException, EOFException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 2) {
            StringBuilder sb3 = new StringBuilder("Expected END_OBJECT but was ");
            sb3.append(peek());
            a.b(sb3, " at path ", getPath());
            return;
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

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean hasNext() throws JsonEncodingException, EOFException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        return (iDoPeek == 2 || iDoPeek == 4 || iDoPeek == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean nextBoolean() throws JsonEncodingException, EOFException {
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
            StringBuilder sb3 = new StringBuilder("Expected a boolean but was ");
            sb3.append(peek());
            a.b(sb3, " at path ", getPath());
            return false;
        }
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i15 = this.stackSize - 1;
        iArr2[i15] = iArr2[i15] + 1;
        return false;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double nextDouble() throws JsonEncodingException, EOFException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 16) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i14 = this.stackSize - 1;
            iArr[i14] = iArr[i14] + 1;
            return this.peekedLong;
        }
        if (iDoPeek == 17) {
            e eVar = this.buffer;
            long j8 = this.peekedNumberLength;
            eVar.getClass();
            this.peekedString = eVar.w(j8, c.f57666b);
        } else if (iDoPeek == 9) {
            this.peekedString = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (iDoPeek == 8) {
            this.peekedString = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (iDoPeek == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (iDoPeek != 11) {
            StringBuilder sb3 = new StringBuilder("Expected a double but was ");
            sb3.append(peek());
            a.b(sb3, " at path ", getPath());
            return 0.0d;
        }
        this.peeked = 11;
        try {
            double d14 = Double.parseDouble(this.peekedString);
            if (!this.lenient && (Double.isNaN(d14) || Double.isInfinite(d14))) {
                StringBuilder sbA = a.a("JSON forbids NaN and infinities: ", d14, " at path ");
                sbA.append(getPath());
                throw new JsonEncodingException(sbA.toString());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i15 = this.stackSize - 1;
            iArr2[i15] = iArr2[i15] + 1;
            return d14;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.peekedString + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int nextInt() throws JsonEncodingException, EOFException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 16) {
            long j8 = this.peekedLong;
            int i14 = (int) j8;
            if (j8 == i14) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i15 = this.stackSize - 1;
                iArr[i15] = iArr[i15] + 1;
                return i14;
            }
            throw new JsonDataException("Expected an int but was " + this.peekedLong + " at path " + getPath());
        }
        if (iDoPeek == 17) {
            e eVar = this.buffer;
            long j14 = this.peekedNumberLength;
            eVar.getClass();
            this.peekedString = eVar.w(j14, c.f57666b);
        } else if (iDoPeek == 9 || iDoPeek == 8) {
            String strNextQuotedValue = iDoPeek == 9 ? nextQuotedValue(DOUBLE_QUOTE_OR_SLASH) : nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
            this.peekedString = strNextQuotedValue;
            try {
                int i16 = Integer.parseInt(strNextQuotedValue);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i17 = this.stackSize - 1;
                iArr2[i17] = iArr2[i17] + 1;
                return i16;
            } catch (NumberFormatException unused) {
            }
        } else if (iDoPeek != 11) {
            StringBuilder sb3 = new StringBuilder("Expected an int but was ");
            sb3.append(peek());
            a.b(sb3, " at path ", getPath());
            return 0;
        }
        this.peeked = 11;
        try {
            double d14 = Double.parseDouble(this.peekedString);
            int i18 = (int) d14;
            if (i18 == d14) {
                this.peekedString = null;
                this.peeked = 0;
                int[] iArr3 = this.pathIndices;
                int i19 = this.stackSize - 1;
                iArr3[i19] = iArr3[i19] + 1;
                return i18;
            }
            throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextName() throws JsonEncodingException, EOFException {
        String strNextQuotedValue;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 14) {
            strNextQuotedValue = nextUnquotedValue();
        } else if (iDoPeek == 13) {
            strNextQuotedValue = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (iDoPeek == 12) {
            strNextQuotedValue = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else {
            if (iDoPeek != 15) {
                StringBuilder sb3 = new StringBuilder("Expected a name but was ");
                sb3.append(peek());
                a.b(sb3, " at path ", getPath());
                return null;
            }
            strNextQuotedValue = this.peekedString;
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = strNextQuotedValue;
        return strNextQuotedValue;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextString() throws JsonEncodingException, EOFException {
        String strW;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 10) {
            strW = nextUnquotedValue();
        } else if (iDoPeek == 9) {
            strW = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (iDoPeek == 8) {
            strW = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (iDoPeek == 11) {
            strW = this.peekedString;
            this.peekedString = null;
        } else if (iDoPeek == 16) {
            strW = Long.toString(this.peekedLong);
        } else {
            if (iDoPeek != 17) {
                StringBuilder sb3 = new StringBuilder("Expected a string but was ");
                sb3.append(peek());
                a.b(sb3, " at path ", getPath());
                return null;
            }
            e eVar = this.buffer;
            long j8 = this.peekedNumberLength;
            eVar.getClass();
            strW = eVar.w(j8, c.f57666b);
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i14 = this.stackSize - 1;
        iArr[i14] = iArr[i14] + 1;
        return strW;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token peek() throws JsonEncodingException, EOFException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        switch (iDoPeek) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                e0.l();
                return null;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int selectName(JsonReader.Options options) throws JsonEncodingException, EOFException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek < 12 || iDoPeek > 15) {
            return -1;
        }
        if (iDoPeek == 15) {
            return findName(this.peekedString, options);
        }
        int iJ1 = this.source.j1(options.doubleQuoteSuffix);
        if (iJ1 != -1) {
            this.peeked = 0;
            this.pathNames[this.stackSize - 1] = options.strings[iJ1];
            return iJ1;
        }
        String str = this.pathNames[this.stackSize - 1];
        String strNextName = nextName();
        int iFindName = findName(strNextName, options);
        if (iFindName == -1) {
            this.peeked = 15;
            this.peekedString = strNextName;
            this.pathNames[this.stackSize - 1] = str;
        }
        return iFindName;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipName() throws JsonEncodingException, EOFException {
        if (this.failOnUnknown) {
            StringBuilder sb3 = new StringBuilder("Cannot skip unexpected ");
            sb3.append(peek());
            a.b(sb3, " at ", getPath());
            return;
        }
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 14) {
            skipUnquotedValue();
        } else if (iDoPeek == 13) {
            skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (iDoPeek == 12) {
            skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (iDoPeek != 15) {
            StringBuilder sb4 = new StringBuilder("Expected a name but was ");
            sb4.append(peek());
            a.b(sb4, " at path ", getPath());
            return;
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = BuildConfig.TRAVIS;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipValue() throws JsonEncodingException, EOFException {
        if (this.failOnUnknown) {
            StringBuilder sb3 = new StringBuilder("Cannot skip unexpected ");
            sb3.append(peek());
            a.b(sb3, " at ", getPath());
            return;
        }
        int i14 = 0;
        do {
            int iDoPeek = this.peeked;
            if (iDoPeek == 0) {
                iDoPeek = doPeek();
            }
            if (iDoPeek == 3) {
                pushScope(1);
            } else {
                if (iDoPeek == 1) {
                    pushScope(3);
                } else if (iDoPeek == 4) {
                    i14--;
                    if (i14 < 0) {
                        StringBuilder sb4 = new StringBuilder("Expected a value but was ");
                        sb4.append(peek());
                        a.b(sb4, " at path ", getPath());
                        return;
                    }
                    this.stackSize--;
                } else if (iDoPeek == 2) {
                    i14--;
                    if (i14 < 0) {
                        StringBuilder sb5 = new StringBuilder("Expected a value but was ");
                        sb5.append(peek());
                        a.b(sb5, " at path ", getPath());
                        return;
                    }
                    this.stackSize--;
                } else if (iDoPeek == 14 || iDoPeek == 10) {
                    skipUnquotedValue();
                } else if (iDoPeek == 9 || iDoPeek == 13) {
                    skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                } else if (iDoPeek == 8 || iDoPeek == 12) {
                    skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
                } else if (iDoPeek == 17) {
                    this.buffer.skip(this.peekedNumberLength);
                } else if (iDoPeek == 18) {
                    StringBuilder sb6 = new StringBuilder("Expected a value but was ");
                    sb6.append(peek());
                    a.b(sb6, " at path ", getPath());
                    return;
                }
                this.peeked = 0;
            }
            i14++;
            this.peeked = 0;
        } while (i14 != 0);
        int[] iArr = this.pathIndices;
        int i15 = this.stackSize;
        int i16 = i15 - 1;
        iArr[i16] = iArr[i16] + 1;
        this.pathNames[i15 - 1] = BuildConfig.TRAVIS;
    }

    public String toString() {
        return "JsonReader(" + this.source + ")";
    }
}
