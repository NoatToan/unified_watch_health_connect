package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.async.ByteArrayFeeder;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase;
import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes21.dex */
public class xu extends NonBlockingJsonParserBase implements ByteArrayFeeder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected byte[] f53301c;
    protected int d;
    private static final int h = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int i = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f53299a = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int j = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int g = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int e = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int f = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    private static final int[] o = wz.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final int[] f53300b = wz.a();

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ByteArrayFeeder getNonBlockingInputFeeder() {
        return this;
    }

    public xu(xa xaVar, int i2, xt xtVar) {
        super(xaVar, i2, xtVar);
        this.f53301c = NO_BYTES;
    }

    @Override // com.fasterxml.jackson.core.async.NonBlockingInputFeeder
    public final boolean needMoreInput() {
        return this._inputPtr >= this._inputEnd && !this._endOfInput;
    }

    @Override // com.fasterxml.jackson.core.async.ByteArrayFeeder
    public void feedInput(byte[] bArr, int i2, int i3) throws IOException {
        if (this._inputPtr < this._inputEnd) {
            _reportError("Still have %d undecoded bytes, should not call 'feedInput'", Integer.valueOf(this._inputEnd - this._inputPtr));
        }
        if (i3 < i2) {
            _reportError("Input end (%d) may not be before start (%d)", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if (this._endOfInput) {
            _reportError("Already closed, can not feed more input");
        }
        this._currInputProcessed += (long) this.d;
        this._currInputRowStart = i2 - (this._inputEnd - this._currInputRowStart);
        this._currBufferStart = i2;
        this.f53301c = bArr;
        this._inputPtr = i2;
        this._inputEnd = i3;
        this.d = i3 - i2;
    }

    @Override // com.fasterxml.jackson.core.async.NonBlockingInputFeeder
    public void endOfInput() {
        this._endOfInput = true;
    }

    @Override // com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase, com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i2 = this._inputEnd - this._inputPtr;
        if (i2 > 0) {
            outputStream.write(this.f53301c, this._inputPtr, i2);
        }
        return i2;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        yj.d();
        return ' ';
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            if (this._closed) {
                return null;
            }
            if (this._endOfInput) {
                if (this._currToken == JsonToken.NOT_AVAILABLE) {
                    return g();
                }
                return _eofAsNextToken();
            }
            return JsonToken.NOT_AVAILABLE;
        }
        if (this._currToken == JsonToken.NOT_AVAILABLE) {
            return f();
        }
        this._numTypesValid = 0;
        this._tokenInputTotal = this._currInputProcessed + ((long) this._inputPtr);
        this._binaryValue = null;
        byte[] bArr = this.f53301c;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        switch (this._majorState) {
            case 0:
                return g(i3);
            case 1:
                return l(i3);
            case 2:
                return j(i3);
            case 3:
                return k(i3);
            case 4:
                return n(i3);
            case 5:
                return l(i3);
            case 6:
                return p(i3);
            default:
                yj.d();
                return null;
        }
    }

    protected final JsonToken f() throws IOException {
        int i2 = this._minorState;
        if (i2 == 1) {
            return b(this._pending32);
        }
        if (i2 == 4) {
            byte[] bArr = this.f53301c;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            return j(bArr[i3] & 255);
        }
        if (i2 == 5) {
            byte[] bArr2 = this.f53301c;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            return k(bArr2[i4] & 255);
        }
        switch (i2) {
            case 7:
                return f(this._quadLength, this._pending32, this._pendingBytes);
            case 8:
                return a();
            case 9:
                return b(this._quadLength, this._pending32, this._pendingBytes);
            case 10:
                return c(this._quadLength, this._pending32, this._pendingBytes);
            default:
                switch (i2) {
                    case 12:
                        byte[] bArr3 = this.f53301c;
                        int i5 = this._inputPtr;
                        this._inputPtr = i5 + 1;
                        return l(bArr3[i5] & 255);
                    case 13:
                        byte[] bArr4 = this.f53301c;
                        int i6 = this._inputPtr;
                        this._inputPtr = i6 + 1;
                        return p(bArr4[i6] & 255);
                    case 14:
                        byte[] bArr5 = this.f53301c;
                        int i7 = this._inputPtr;
                        this._inputPtr = i7 + 1;
                        return n(bArr5[i7] & 255);
                    case 15:
                        byte[] bArr6 = this.f53301c;
                        int i8 = this._inputPtr;
                        this._inputPtr = i8 + 1;
                        return m(bArr6[i8] & 255);
                    case 16:
                        return c(Constants.NULL, this._pending32, JsonToken.VALUE_NULL);
                    case 17:
                        return c("true", this._pending32, JsonToken.VALUE_TRUE);
                    case 18:
                        return c("false", this._pending32, JsonToken.VALUE_FALSE);
                    case 19:
                        return c(this._nonStdTokenType, this._pending32);
                    default:
                        switch (i2) {
                            case 23:
                                byte[] bArr7 = this.f53301c;
                                int i9 = this._inputPtr;
                                this._inputPtr = i9 + 1;
                                return c(bArr7[i9] & 255);
                            case 24:
                                return i();
                            case 25:
                                return e();
                            case 26:
                                return b(this._textBuffer.g(), this._textBuffer.j());
                            default:
                                switch (i2) {
                                    case 30:
                                        return b();
                                    case 31:
                                        byte[] bArr8 = this.f53301c;
                                        int i10 = this._inputPtr;
                                        this._inputPtr = i10 + 1;
                                        return d(true, bArr8[i10] & 255);
                                    case 32:
                                        byte[] bArr9 = this.f53301c;
                                        int i11 = this._inputPtr;
                                        this._inputPtr = i11 + 1;
                                        return d(false, bArr9[i11] & 255);
                                    default:
                                        switch (i2) {
                                            case 40:
                                                return v();
                                            case 41:
                                                int iE = e(this._quoted32, this._quotedDigits);
                                                if (iE < 0) {
                                                    return JsonToken.NOT_AVAILABLE;
                                                }
                                                this._textBuffer.c((char) iE);
                                                if (this._minorStateAfterSplit == 45) {
                                                    return y();
                                                }
                                                return v();
                                            case 42:
                                                yh yhVar = this._textBuffer;
                                                int i12 = this._pending32;
                                                byte[] bArr10 = this.f53301c;
                                                int i13 = this._inputPtr;
                                                this._inputPtr = i13 + 1;
                                                yhVar.c((char) a(i12, bArr10[i13]));
                                                if (this._minorStateAfterSplit == 45) {
                                                    return y();
                                                }
                                                return v();
                                            case 43:
                                                int i14 = this._pending32;
                                                int i15 = this._pendingBytes;
                                                byte[] bArr11 = this.f53301c;
                                                int i16 = this._inputPtr;
                                                this._inputPtr = i16 + 1;
                                                if (!d(i14, i15, bArr11[i16])) {
                                                    return JsonToken.NOT_AVAILABLE;
                                                }
                                                if (this._minorStateAfterSplit == 45) {
                                                    return y();
                                                }
                                                return v();
                                            case 44:
                                                int i17 = this._pending32;
                                                int i18 = this._pendingBytes;
                                                byte[] bArr12 = this.f53301c;
                                                int i19 = this._inputPtr;
                                                this._inputPtr = i19 + 1;
                                                if (!a(i17, i18, bArr12[i19])) {
                                                    return JsonToken.NOT_AVAILABLE;
                                                }
                                                if (this._minorStateAfterSplit == 45) {
                                                    return y();
                                                }
                                                return v();
                                            case 45:
                                                return y();
                                            default:
                                                switch (i2) {
                                                    case 50:
                                                        return c();
                                                    case 51:
                                                        return o(this._pending32);
                                                    case 52:
                                                        return a(this._pending32, true);
                                                    case 53:
                                                        return a(this._pending32, false);
                                                    case 54:
                                                        return d(this._pending32);
                                                    case 55:
                                                        return a(this._pending32);
                                                    default:
                                                        yj.d();
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected final JsonToken g() throws IOException {
        JsonToken jsonToken = this._currToken;
        int i2 = this._minorState;
        if (i2 == 3) {
            return _eofAsNextToken();
        }
        if (i2 == 12) {
            return _eofAsNextToken();
        }
        if (i2 != 50) {
            switch (i2) {
                case 16:
                    return d(Constants.NULL, this._pending32, JsonToken.VALUE_NULL);
                case 17:
                    return d("true", this._pending32, JsonToken.VALUE_TRUE);
                case 18:
                    return d("false", this._pending32, JsonToken.VALUE_FALSE);
                case 19:
                    return b(this._nonStdTokenType, this._pending32);
                default:
                    switch (i2) {
                        case 24:
                        case 25:
                            return _valueCompleteInt(0, "0");
                        case 26:
                            int iJ = this._textBuffer.j();
                            if (this._numberNegative) {
                                iJ--;
                            }
                            this._intLength = iJ;
                            return _valueComplete(JsonToken.VALUE_NUMBER_INT);
                        default:
                            switch (i2) {
                                case 30:
                                    this._expLength = 0;
                                    return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
                                case 31:
                                    _reportInvalidEOF(": was expecting fraction after exponent marker", JsonToken.VALUE_NUMBER_FLOAT);
                                    _reportInvalidEOF(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                    return _eofAsNextToken();
                                case 32:
                                    return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
                                default:
                                    switch (i2) {
                                        case 52:
                                        case 53:
                                            _reportInvalidEOF(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                            break;
                                        case 54:
                                        case 55:
                                            break;
                                        default:
                                            _reportInvalidEOF(": was expecting rest of token (internal state: " + this._minorState + Constants.RIGHT_BRACKET_ONLY, this._currToken);
                                            return jsonToken;
                                    }
                                    return _eofAsNextToken();
                            }
                    }
            }
        }
        return d();
    }

    private final JsonToken g(int i2) throws IOException {
        int i3 = i2 & 255;
        if (i3 == 239 && this._minorState != 1) {
            return b(1);
        }
        while (i3 <= 32) {
            if (i3 != 32) {
                if (i3 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i3 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i3 != 9) {
                    _throwInvalidSpace(i3);
                }
            }
            if (this._inputPtr >= this._inputEnd) {
                this._minorState = 3;
                if (this._closed) {
                    return null;
                }
                if (this._endOfInput) {
                    return _eofAsNextToken();
                }
                return JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr = this.f53301c;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            i3 = bArr[i4] & 255;
        }
        return l(i3);
    }

    private final JsonToken b(int i2) throws IOException {
        while (this._inputPtr < this._inputEnd) {
            byte[] bArr = this.f53301c;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            int i4 = bArr[i3] & 255;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        this._currInputProcessed -= 3;
                        return g(i4);
                    }
                } else if (i4 != 191) {
                    _reportError("Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM", Integer.valueOf(i4));
                }
            } else if (i4 != 187) {
                _reportError("Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM", Integer.valueOf(i4));
            }
            i2++;
        }
        this._pending32 = i2;
        this._minorState = 1;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken j(int i2) throws IOException {
        String strT;
        if (i2 <= 32 && (i2 = i(i2)) <= 0) {
            this._minorState = 4;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i2 != 34) {
            if (i2 == 125) {
                return _closeObjectScope();
            }
            return h(i2);
        }
        if (this._inputPtr + 13 <= this._inputEnd && (strT = t()) != null) {
            return _fieldComplete(strT);
        }
        return f(0, 0, 0);
    }

    private final JsonToken k(int i2) throws IOException {
        String strT;
        if (i2 <= 32 && (i2 = i(i2)) <= 0) {
            this._minorState = 5;
            return this._currToken;
        }
        if (i2 != 44) {
            if (i2 == 125) {
                return _closeObjectScope();
            }
            if (i2 == 35) {
                return a(5);
            }
            if (i2 == 47) {
                return o(5);
            }
            _reportUnexpectedChar(i2, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        int i3 = this._inputPtr;
        if (i3 >= this._inputEnd) {
            this._minorState = 4;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i4 = this.f53301c[i3];
        this._inputPtr = i3 + 1;
        if (i4 <= 32 && (i4 = i(i4)) <= 0) {
            this._minorState = 4;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i4 != 34) {
            if (i4 == 125 && (this._features & h) != 0) {
                return _closeObjectScope();
            }
            return h(i4);
        }
        if (this._inputPtr + 13 <= this._inputEnd && (strT = t()) != null) {
            return _fieldComplete(strT);
        }
        return f(0, 0, 0);
    }

    private final JsonToken l(int i2) throws IOException {
        if (i2 <= 32 && (i2 = i(i2)) <= 0) {
            this._minorState = 12;
            return this._currToken;
        }
        _updateTokenLocation();
        this._parsingContext.e();
        if (i2 == 34) {
            return m();
        }
        if (i2 == 35) {
            return a(12);
        }
        if (i2 == 91) {
            return _startArrayScope();
        }
        if (i2 == 93) {
            return _closeArrayScope();
        }
        if (i2 == 102) {
            return j();
        }
        if (i2 == 110) {
            return k();
        }
        if (i2 == 116) {
            return r();
        }
        if (i2 == 123) {
            return _startObjectScope();
        }
        if (i2 != 125) {
            switch (i2) {
                case 45:
                    return n();
                case 46:
                    if (isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                        return l();
                    }
                    break;
                case 47:
                    return o(12);
                case 48:
                    return o();
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    return e(i2);
            }
            return a(false, i2);
        }
        return _closeObjectScope();
    }

    private final JsonToken p(int i2) throws IOException {
        if (i2 <= 32 && (i2 = i(i2)) <= 0) {
            this._minorState = 13;
            return this._currToken;
        }
        if (i2 != 44) {
            if (i2 == 93) {
                return _closeArrayScope();
            }
            if (i2 == 125) {
                return _closeObjectScope();
            }
            if (i2 == 47) {
                return o(13);
            }
            if (i2 == 35) {
                return a(13);
            }
            _reportUnexpectedChar(i2, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        this._parsingContext.e();
        int i3 = this._inputPtr;
        if (i3 >= this._inputEnd) {
            this._minorState = 15;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i4 = this.f53301c[i3];
        this._inputPtr = i3 + 1;
        if (i4 <= 32 && (i4 = i(i4)) <= 0) {
            this._minorState = 15;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i4 == 34) {
            return m();
        }
        if (i4 == 35) {
            return a(15);
        }
        if (i4 == 45) {
            return n();
        }
        if (i4 == 91) {
            return _startArrayScope();
        }
        if (i4 != 93) {
            if (i4 == 102) {
                return j();
            }
            if (i4 == 110) {
                return k();
            }
            if (i4 == 116) {
                return r();
            }
            if (i4 == 123) {
                return _startObjectScope();
            }
            if (i4 != 125) {
                switch (i4) {
                    case 47:
                        return o(15);
                    case 48:
                        return o();
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        return e(i4);
                }
            }
            if ((this._features & h) != 0) {
                return _closeObjectScope();
            }
        } else if ((this._features & h) != 0) {
            return _closeArrayScope();
        }
        return a(true, i4);
    }

    private final JsonToken n(int i2) throws IOException {
        if (i2 <= 32 && (i2 = i(i2)) <= 0) {
            this._minorState = 14;
            return this._currToken;
        }
        if (i2 != 58) {
            if (i2 == 47) {
                return o(14);
            }
            if (i2 == 35) {
                return a(14);
            }
            _reportUnexpectedChar(i2, "was expecting a colon to separate field name and value");
        }
        int i3 = this._inputPtr;
        if (i3 >= this._inputEnd) {
            this._minorState = 12;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i4 = this.f53301c[i3];
        this._inputPtr = i3 + 1;
        if (i4 <= 32 && (i4 = i(i4)) <= 0) {
            this._minorState = 12;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i4 == 34) {
            return m();
        }
        if (i4 == 35) {
            return a(12);
        }
        if (i4 == 45) {
            return n();
        }
        if (i4 == 91) {
            return _startArrayScope();
        }
        if (i4 == 102) {
            return j();
        }
        if (i4 == 110) {
            return k();
        }
        if (i4 == 116) {
            return r();
        }
        if (i4 != 123) {
            switch (i4) {
                case 47:
                    return o(12);
                case 48:
                    return o();
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    return e(i4);
                default:
                    return a(false, i4);
            }
        }
        return _startObjectScope();
    }

    private final JsonToken m(int i2) throws IOException {
        if (i2 <= 32 && (i2 = i(i2)) <= 0) {
            this._minorState = 15;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i2 == 34) {
            return m();
        }
        if (i2 == 35) {
            return a(15);
        }
        if (i2 == 45) {
            return n();
        }
        if (i2 == 91) {
            return _startArrayScope();
        }
        if (i2 != 93) {
            if (i2 == 102) {
                return j();
            }
            if (i2 == 110) {
                return k();
            }
            if (i2 == 116) {
                return r();
            }
            if (i2 == 123) {
                return _startObjectScope();
            }
            if (i2 != 125) {
                switch (i2) {
                    case 47:
                        return o(15);
                    case 48:
                        return o();
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        return e(i2);
                }
            }
            if ((this._features & h) != 0) {
                return _closeObjectScope();
            }
        } else if ((this._features & h) != 0) {
            return _closeArrayScope();
        }
        return a(true, i2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002d  */
    protected JsonToken a(boolean z, int i2) throws IOException {
        if (i2 != 39) {
            if (i2 == 73) {
                return c(1, 1);
            }
            if (i2 == 78) {
                return c(0, 1);
            }
            if (i2 != 93) {
                if (i2 != 125) {
                    if (i2 == 43) {
                        return c(2, 1);
                    }
                    if (i2 == 44) {
                        if (!this._parsingContext.inRoot() && (this._features & f53299a) != 0) {
                            this._inputPtr--;
                            return _valueComplete(JsonToken.VALUE_NULL);
                        }
                    }
                }
            } else if (this._parsingContext.inArray()) {
                if (!this._parsingContext.inRoot()) {
                    this._inputPtr--;
                    return _valueComplete(JsonToken.VALUE_NULL);
                }
            }
        } else if ((this._features & j) != 0) {
            return h();
        }
        _reportUnexpectedChar(i2, "expected a valid value " + _validJsonValueList());
        return null;
    }

    private final int i(int i2) throws IOException {
        do {
            if (i2 != 32) {
                if (i2 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 != 9) {
                    _throwInvalidSpace(i2);
                }
            }
            if (this._inputPtr >= this._inputEnd) {
                this._currToken = JsonToken.NOT_AVAILABLE;
                return 0;
            }
            byte[] bArr = this.f53301c;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            i2 = bArr[i3] & 255;
        } while (i2 <= 32);
        return i2;
    }

    private final JsonToken o(int i2) throws IOException {
        if ((this._features & e) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd) {
            this._pending32 = i2;
            this._minorState = 51;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this.f53301c;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 == 42) {
            return a(i2, false);
        }
        if (b2 == 47) {
            return d(i2);
        }
        _reportUnexpectedChar(b2 & 255, "was expecting either '*' or '/' for a comment");
        return null;
    }

    private final JsonToken a(int i2) throws IOException {
        if ((this._features & f) == 0) {
            _reportUnexpectedChar(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
        }
        while (this._inputPtr < this._inputEnd) {
            byte[] bArr = this.f53301c;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            int i4 = bArr[i3] & 255;
            if (i4 < 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i4 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
                return f(i2);
            }
        }
        this._minorState = 55;
        this._pending32 = i2;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken d(int i2) throws IOException {
        while (this._inputPtr < this._inputEnd) {
            byte[] bArr = this.f53301c;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            int i4 = bArr[i3] & 255;
            if (i4 < 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i4 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
                return f(i2);
            }
        }
        this._minorState = 54;
        this._pending32 = i2;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken a(int i2, boolean z) throws IOException {
        while (this._inputPtr < this._inputEnd) {
            byte[] bArr = this.f53301c;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            int i4 = bArr[i3] & 255;
            if (i4 < 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i4 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
            } else if (i4 == 42) {
                z = true;
            } else if (i4 == 47 && z) {
                return f(i2);
            }
            z = false;
        }
        this._minorState = z ? 52 : 53;
        this._pending32 = i2;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken f(int i2) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            this._minorState = i2;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this.f53301c;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        int i4 = bArr[i3] & 255;
        if (i2 == 4) {
            return j(i4);
        }
        if (i2 == 5) {
            return k(i4);
        }
        switch (i2) {
            case 12:
                return l(i4);
            case 13:
                return p(i4);
            case 14:
                return n(i4);
            case 15:
                return m(i4);
            default:
                yj.d();
                return null;
        }
    }

    protected JsonToken j() throws IOException {
        int i2;
        int i3 = this._inputPtr;
        int i4 = i3 + 4;
        if (i4 < this._inputEnd) {
            byte[] bArr = this.f53301c;
            if (bArr[i3] == 97 && bArr[i3 + 1] == 108 && bArr[i3 + 2] == 115 && bArr[i3 + 3] == 101 && ((i2 = bArr[i4] & 255) < 48 || i2 == 93 || i2 == 125)) {
                this._inputPtr = i4;
                return _valueComplete(JsonToken.VALUE_FALSE);
            }
        }
        this._minorState = 18;
        return c("false", 1, JsonToken.VALUE_FALSE);
    }

    protected JsonToken r() throws IOException {
        int i2;
        int i3 = this._inputPtr;
        int i4 = i3 + 3;
        if (i4 < this._inputEnd) {
            byte[] bArr = this.f53301c;
            if (bArr[i3] == 114 && bArr[i3 + 1] == 117 && bArr[i3 + 2] == 101 && ((i2 = bArr[i4] & 255) < 48 || i2 == 93 || i2 == 125)) {
                this._inputPtr = i4;
                return _valueComplete(JsonToken.VALUE_TRUE);
            }
        }
        this._minorState = 17;
        return c("true", 1, JsonToken.VALUE_TRUE);
    }

    protected JsonToken k() throws IOException {
        int i2;
        int i3 = this._inputPtr;
        int i4 = i3 + 3;
        if (i4 < this._inputEnd) {
            byte[] bArr = this.f53301c;
            if (bArr[i3] == 117 && bArr[i3 + 1] == 108 && bArr[i3 + 2] == 108 && ((i2 = bArr[i4] & 255) < 48 || i2 == 93 || i2 == 125)) {
                this._inputPtr = i4;
                return _valueComplete(JsonToken.VALUE_NULL);
            }
        }
        this._minorState = 16;
        return c(Constants.NULL, 1, JsonToken.VALUE_NULL);
    }

    protected JsonToken c(String str, int i2, JsonToken jsonToken) throws IOException {
        int length = str.length();
        while (this._inputPtr < this._inputEnd) {
            byte b2 = this.f53301c[this._inputPtr];
            if (i2 == length) {
                if (b2 < 48 || b2 == 93 || b2 == 125) {
                    return _valueComplete(jsonToken);
                }
            } else if (b2 == str.charAt(i2)) {
                i2++;
                this._inputPtr++;
            }
            this._minorState = 50;
            this._textBuffer.d(str, 0, i2);
            return c();
        }
        this._pending32 = i2;
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    protected JsonToken d(String str, int i2, JsonToken jsonToken) throws IOException {
        if (i2 == str.length()) {
            this._currToken = jsonToken;
            return jsonToken;
        }
        this._textBuffer.d(str, 0, i2);
        return d();
    }

    protected JsonToken c(int i2, int i3) throws IOException {
        String str_nonStdToken = _nonStdToken(i2);
        int length = str_nonStdToken.length();
        while (this._inputPtr < this._inputEnd) {
            byte b2 = this.f53301c[this._inputPtr];
            if (i3 == length) {
                if (b2 < 48 || b2 == 93 || b2 == 125) {
                    return _valueNonStdNumberComplete(i2);
                }
            } else if (b2 == str_nonStdToken.charAt(i3)) {
                i3++;
                this._inputPtr++;
            }
            this._minorState = 50;
            this._textBuffer.d(str_nonStdToken, 0, i3);
            return c();
        }
        this._nonStdTokenType = i2;
        this._pending32 = i3;
        this._minorState = 19;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    protected JsonToken b(int i2, int i3) throws IOException {
        String str_nonStdToken = _nonStdToken(i2);
        if (i3 == str_nonStdToken.length()) {
            return _valueNonStdNumberComplete(i2);
        }
        this._textBuffer.d(str_nonStdToken, 0, i3);
        return d();
    }

    protected JsonToken c() throws IOException {
        while (this._inputPtr < this._inputEnd) {
            byte[] bArr = this.f53301c;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c2 = (char) bArr[i2];
            if (Character.isJavaIdentifierPart(c2)) {
                this._textBuffer.c(c2);
                if (this._textBuffer.k() < 256) {
                }
            }
            return b(this._textBuffer.d());
        }
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    protected JsonToken d() throws IOException {
        return b(this._textBuffer.d());
    }

    protected JsonToken b(String str) throws IOException {
        _reportError("Unrecognized token '%s': was expecting %s", this._textBuffer.d(), _validJsonTokenList());
        return JsonToken.NOT_AVAILABLE;
    }

    protected JsonToken l() throws IOException {
        this._numberNegative = false;
        this._intLength = 0;
        return a(this._textBuffer.e(), 0, 46);
    }

    protected JsonToken e(int i2) throws IOException {
        this._numberNegative = false;
        char[] cArrE = this._textBuffer.e();
        cArrE[0] = (char) i2;
        if (this._inputPtr >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.e(1);
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i3 = this.f53301c[this._inputPtr] & 255;
        int i4 = 1;
        while (i3 >= 48) {
            if (i3 <= 57) {
                if (i4 >= cArrE.length) {
                    cArrE = this._textBuffer.i();
                }
                int i5 = i4 + 1;
                cArrE[i4] = (char) i3;
                int i6 = this._inputPtr + 1;
                this._inputPtr = i6;
                if (i6 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.e(i5);
                    JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken2;
                    return jsonToken2;
                }
                i3 = this.f53301c[this._inputPtr] & 255;
                i4 = i5;
            } else {
                if (i3 == 101 || i3 == 69) {
                    this._intLength = i4;
                    this._inputPtr++;
                    return a(cArrE, i4, i3);
                }
                this._intLength = i4;
                this._textBuffer.e(i4);
                return _valueComplete(JsonToken.VALUE_NUMBER_INT);
            }
        }
        if (i3 == 46) {
            this._intLength = i4;
            this._inputPtr++;
            return a(cArrE, i4, i3);
        }
        this._intLength = i4;
        this._textBuffer.e(i4);
        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
    }

    protected JsonToken n() throws IOException {
        this._numberNegative = true;
        if (this._inputPtr >= this._inputEnd) {
            this._minorState = 23;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this.f53301c;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        int i4 = 2;
        if (i3 <= 48) {
            if (i3 == 48) {
                return e();
            }
            reportUnexpectedNumberChar(i3, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i3 > 57) {
            if (i3 == 73) {
                return c(3, 2);
            }
            reportUnexpectedNumberChar(i3, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] cArrE = this._textBuffer.e();
        cArrE[0] = '-';
        cArrE[1] = (char) i3;
        if (this._inputPtr >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.e(2);
            this._intLength = 1;
            JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        int i5 = this.f53301c[this._inputPtr];
        while (i5 >= 48) {
            if (i5 <= 57) {
                if (i4 >= cArrE.length) {
                    cArrE = this._textBuffer.i();
                }
                int i6 = i4 + 1;
                cArrE[i4] = (char) i5;
                int i7 = this._inputPtr + 1;
                this._inputPtr = i7;
                if (i7 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.e(i6);
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken3;
                    return jsonToken3;
                }
                i5 = this.f53301c[this._inputPtr] & 255;
                i4 = i6;
            } else {
                if (i5 == 101 || i5 == 69) {
                    this._intLength = i4 - 1;
                    this._inputPtr++;
                    return a(cArrE, i4, i5);
                }
                this._intLength = i4 - 1;
                this._textBuffer.e(i4);
                return _valueComplete(JsonToken.VALUE_NUMBER_INT);
            }
        }
        if (i5 == 46) {
            this._intLength = i4 - 1;
            this._inputPtr++;
            return a(cArrE, i4, i5);
        }
        this._intLength = i4 - 1;
        this._textBuffer.e(i4);
        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
    }

    protected JsonToken o() throws IOException {
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = 24;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i3 = i2 + 1;
        int i4 = this.f53301c[i2] & 255;
        if (i4 < 48) {
            if (i4 == 46) {
                this._inputPtr = i3;
                this._intLength = 1;
                char[] cArrE = this._textBuffer.e();
                cArrE[0] = '0';
                return a(cArrE, 1, i4);
            }
        } else {
            if (i4 <= 57) {
                return i();
            }
            if (i4 == 101 || i4 == 69) {
                this._inputPtr = i3;
                this._intLength = 1;
                char[] cArrE2 = this._textBuffer.e();
                cArrE2[0] = '0';
                return a(cArrE2, 1, i4);
            }
            if (i4 != 93 && i4 != 125) {
                reportUnexpectedNumberChar(i4, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
        }
        return _valueCompleteInt(0, "0");
    }

    protected JsonToken c(int i2) throws IOException {
        if (i2 <= 48) {
            if (i2 == 48) {
                return e();
            }
            reportUnexpectedNumberChar(i2, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i2 > 57) {
            if (i2 == 73) {
                return c(3, 2);
            }
            reportUnexpectedNumberChar(i2, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] cArrE = this._textBuffer.e();
        cArrE[0] = '-';
        cArrE[1] = (char) i2;
        this._intLength = 1;
        return b(cArrE, 2);
    }

    protected JsonToken i() throws IOException {
        while (this._inputPtr < this._inputEnd) {
            byte[] bArr = this.f53301c;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            int i3 = bArr[i2] & 255;
            if (i3 < 48) {
                if (i3 == 46) {
                    char[] cArrE = this._textBuffer.e();
                    cArrE[0] = '0';
                    this._intLength = 1;
                    return a(cArrE, 1, i3);
                }
            } else if (i3 <= 57) {
                if ((this._features & i) == 0) {
                    reportInvalidNumber("Leading zeroes not allowed");
                }
                if (i3 != 48) {
                    char[] cArrE2 = this._textBuffer.e();
                    cArrE2[0] = (char) i3;
                    this._intLength = 1;
                    return b(cArrE2, 1);
                }
            } else {
                if (i3 == 101 || i3 == 69) {
                    char[] cArrE3 = this._textBuffer.e();
                    cArrE3[0] = '0';
                    this._intLength = 1;
                    return a(cArrE3, 1, i3);
                }
                if (i3 != 93 && i3 != 125) {
                    reportUnexpectedNumberChar(i3, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            }
            this._inputPtr--;
            return _valueCompleteInt(0, "0");
        }
        this._minorState = 24;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    protected JsonToken e() throws IOException {
        while (this._inputPtr < this._inputEnd) {
            byte[] bArr = this.f53301c;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            int i3 = bArr[i2] & 255;
            if (i3 < 48) {
                if (i3 == 46) {
                    char[] cArrE = this._textBuffer.e();
                    cArrE[0] = '-';
                    cArrE[1] = '0';
                    this._intLength = 1;
                    return a(cArrE, 2, i3);
                }
            } else if (i3 <= 57) {
                if ((this._features & i) == 0) {
                    reportInvalidNumber("Leading zeroes not allowed");
                }
                if (i3 != 48) {
                    char[] cArrE2 = this._textBuffer.e();
                    cArrE2[0] = '-';
                    cArrE2[1] = (char) i3;
                    this._intLength = 1;
                    return b(cArrE2, 2);
                }
            } else {
                if (i3 == 101 || i3 == 69) {
                    char[] cArrE3 = this._textBuffer.e();
                    cArrE3[0] = '-';
                    cArrE3[1] = '0';
                    this._intLength = 1;
                    return a(cArrE3, 2, i3);
                }
                if (i3 != 93 && i3 != 125) {
                    reportUnexpectedNumberChar(i3, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            }
            this._inputPtr--;
            return _valueCompleteInt(0, "0");
        }
        this._minorState = 25;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    protected JsonToken b(char[] cArr, int i2) throws IOException {
        int i3 = this._numberNegative ? -1 : 0;
        while (this._inputPtr < this._inputEnd) {
            int i4 = this.f53301c[this._inputPtr] & 255;
            if (i4 < 48) {
                if (i4 == 46) {
                    this._intLength = i3 + i2;
                    this._inputPtr++;
                    return a(cArr, i2, i4);
                }
            } else if (i4 <= 57) {
                this._inputPtr++;
                if (i2 >= cArr.length) {
                    cArr = this._textBuffer.i();
                }
                cArr[i2] = (char) i4;
                i2++;
            } else if (i4 == 101 || i4 == 69) {
                this._intLength = i3 + i2;
                this._inputPtr++;
                return a(cArr, i2, i4);
            }
            this._intLength = i3 + i2;
            this._textBuffer.e(i2);
            return _valueComplete(JsonToken.VALUE_NUMBER_INT);
        }
        this._minorState = 26;
        this._textBuffer.e(i2);
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    protected JsonToken a(char[] cArr, int i2, int i3) throws IOException {
        int i4;
        int i5;
        byte b2;
        byte b3;
        int i6 = 0;
        if (i3 == 46) {
            if (i2 >= cArr.length) {
                cArr = this._textBuffer.i();
            }
            cArr[i2] = FilenameUtils.EXTENSION_SEPARATOR;
            i2++;
            i5 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd) {
                    this._textBuffer.e(i2);
                    this._minorState = 30;
                    this._fractLength = i5;
                    JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken;
                    return jsonToken;
                }
                byte[] bArr = this.f53301c;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                b3 = bArr[i7];
                if (b3 < 48 || b3 > 57) {
                    break;
                }
                if (i2 >= cArr.length) {
                    cArr = this._textBuffer.i();
                }
                cArr[i2] = (char) b3;
                i5++;
                i2++;
            }
            i4 = b3 & 255;
            if (i5 == 0) {
                reportUnexpectedNumberChar(i4, "Decimal point not followed by a digit");
            }
        } else {
            i4 = i3;
            i5 = 0;
        }
        this._fractLength = i5;
        if (i4 == 101 || i4 == 69) {
            if (i2 >= cArr.length) {
                cArr = this._textBuffer.i();
            }
            int i8 = i2 + 1;
            cArr[i2] = (char) i4;
            if (this._inputPtr >= this._inputEnd) {
                this._textBuffer.e(i8);
                this._minorState = 31;
                this._expLength = 0;
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken2;
                return jsonToken2;
            }
            byte[] bArr2 = this.f53301c;
            int i9 = this._inputPtr;
            this._inputPtr = i9 + 1;
            byte b4 = bArr2[i9];
            if (b4 == 45 || b4 == 43) {
                if (i8 >= cArr.length) {
                    cArr = this._textBuffer.i();
                }
                i2 += 2;
                cArr[i8] = (char) b4;
                if (this._inputPtr >= this._inputEnd) {
                    this._textBuffer.e(i2);
                    this._minorState = 32;
                    this._expLength = 0;
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken3;
                    return jsonToken3;
                }
                byte[] bArr3 = this.f53301c;
                int i10 = this._inputPtr;
                this._inputPtr = i10 + 1;
                b2 = bArr3[i10];
            } else {
                i2 = i8;
                b2 = b4;
            }
            while (b2 >= 48 && b2 <= 57) {
                i6++;
                if (i2 >= cArr.length) {
                    cArr = this._textBuffer.i();
                }
                int i11 = i2 + 1;
                cArr[i2] = (char) b2;
                if (this._inputPtr >= this._inputEnd) {
                    this._textBuffer.e(i11);
                    this._minorState = 32;
                    this._expLength = i6;
                    JsonToken jsonToken4 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken4;
                    return jsonToken4;
                }
                byte[] bArr4 = this.f53301c;
                int i12 = this._inputPtr;
                this._inputPtr = i12 + 1;
                b2 = bArr4[i12];
                i2 = i11;
            }
            if (i6 == 0) {
                reportUnexpectedNumberChar(b2 & 255, "Exponent indicator not followed by a digit");
            }
        }
        this._inputPtr--;
        this._textBuffer.e(i2);
        this._expLength = i6;
        return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
    }

    protected JsonToken b() throws IOException {
        byte b2;
        int i2 = this._fractLength;
        char[] cArrG = this._textBuffer.g();
        int iJ = this._textBuffer.j();
        while (true) {
            byte[] bArr = this.f53301c;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            b2 = bArr[i3];
            if (b2 < 48 || b2 > 57) {
                break;
            }
            i2++;
            if (iJ >= cArrG.length) {
                cArrG = this._textBuffer.i();
            }
            int i4 = iJ + 1;
            cArrG[iJ] = (char) b2;
            if (this._inputPtr >= this._inputEnd) {
                this._textBuffer.e(i4);
                this._fractLength = i2;
                return JsonToken.NOT_AVAILABLE;
            }
            iJ = i4;
        }
        if (i2 == 0) {
            reportUnexpectedNumberChar(b2, "Decimal point not followed by a digit");
        }
        this._fractLength = i2;
        this._textBuffer.e(iJ);
        if (b2 == 101 || b2 == 69) {
            this._textBuffer.c((char) b2);
            this._expLength = 0;
            if (this._inputPtr >= this._inputEnd) {
                this._minorState = 31;
                return JsonToken.NOT_AVAILABLE;
            }
            this._minorState = 32;
            byte[] bArr2 = this.f53301c;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            return d(true, bArr2[i5] & 255);
        }
        this._inputPtr--;
        this._textBuffer.e(iJ);
        this._expLength = 0;
        return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
    }

    protected JsonToken d(boolean z, int i2) throws IOException {
        if (z) {
            this._minorState = 32;
            if (i2 == 45 || i2 == 43) {
                this._textBuffer.c((char) i2);
                if (this._inputPtr >= this._inputEnd) {
                    this._minorState = 32;
                    this._expLength = 0;
                    return JsonToken.NOT_AVAILABLE;
                }
                byte[] bArr = this.f53301c;
                int i3 = this._inputPtr;
                this._inputPtr = i3 + 1;
                i2 = bArr[i3];
            }
        }
        char[] cArrG = this._textBuffer.g();
        int iJ = this._textBuffer.j();
        int i4 = this._expLength;
        while (i2 >= 48 && i2 <= 57) {
            i4++;
            if (iJ >= cArrG.length) {
                cArrG = this._textBuffer.i();
            }
            int i5 = iJ + 1;
            cArrG[iJ] = (char) i2;
            if (this._inputPtr >= this._inputEnd) {
                this._textBuffer.e(i5);
                this._expLength = i4;
                return JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr2 = this.f53301c;
            int i6 = this._inputPtr;
            this._inputPtr = i6 + 1;
            i2 = bArr2[i6];
            iJ = i5;
        }
        if (i4 == 0) {
            reportUnexpectedNumberChar(i2 & 255, "Exponent indicator not followed by a digit");
        }
        this._inputPtr--;
        this._textBuffer.e(iJ);
        this._expLength = i4;
        return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
    }

    private final String t() throws IOException {
        byte[] bArr = this.f53301c;
        int[] iArr = f53300b;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        int i4 = bArr[i2] & 255;
        if (iArr[i4] != 0) {
            if (i4 != 34) {
                return null;
            }
            this._inputPtr = i3;
            return "";
        }
        int i5 = i2 + 2;
        int i6 = bArr[i3] & 255;
        if (iArr[i6] != 0) {
            if (i6 != 34) {
                return null;
            }
            this._inputPtr = i5;
            return _findName(i4, 1);
        }
        int i7 = i6 | (i4 << 8);
        int i8 = i2 + 3;
        int i9 = bArr[i5] & 255;
        if (iArr[i9] != 0) {
            if (i9 != 34) {
                return null;
            }
            this._inputPtr = i8;
            return _findName(i7, 2);
        }
        int i10 = (i7 << 8) | i9;
        int i11 = i2 + 4;
        int i12 = bArr[i8] & 255;
        if (iArr[i12] != 0) {
            if (i12 != 34) {
                return null;
            }
            this._inputPtr = i11;
            return _findName(i10, 3);
        }
        int i13 = (i10 << 8) | i12;
        int i14 = i2 + 5;
        int i15 = bArr[i11] & 255;
        if (iArr[i15] == 0) {
            this._quad1 = i13;
            return d(i14, i15);
        }
        if (i15 != 34) {
            return null;
        }
        this._inputPtr = i14;
        return _findName(i13, 4);
    }

    private final String d(int i2, int i3) throws IOException {
        byte[] bArr = this.f53301c;
        int[] iArr = f53300b;
        int i4 = i2 + 1;
        int i5 = bArr[i2] & 255;
        if (iArr[i5] != 0) {
            if (i5 != 34) {
                return null;
            }
            this._inputPtr = i4;
            return _findName(this._quad1, i3, 1);
        }
        int i6 = (i3 << 8) | i5;
        int i7 = i2 + 2;
        int i8 = bArr[i4] & 255;
        if (iArr[i8] != 0) {
            if (i8 != 34) {
                return null;
            }
            this._inputPtr = i7;
            return _findName(this._quad1, i6, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = i2 + 3;
        int i11 = bArr[i7] & 255;
        if (iArr[i11] != 0) {
            if (i11 != 34) {
                return null;
            }
            this._inputPtr = i10;
            return _findName(this._quad1, i9, 3);
        }
        int i12 = (i9 << 8) | i11;
        int i13 = i2 + 4;
        int i14 = bArr[i10] & 255;
        if (iArr[i14] == 0) {
            return h(i13, i14, i12);
        }
        if (i14 != 34) {
            return null;
        }
        this._inputPtr = i13;
        return _findName(this._quad1, i12, 4);
    }

    private final String h(int i2, int i3, int i4) throws IOException {
        byte[] bArr = this.f53301c;
        int[] iArr = f53300b;
        int i5 = i2 + 1;
        int i6 = bArr[i2] & 255;
        if (iArr[i6] != 0) {
            if (i6 != 34) {
                return null;
            }
            this._inputPtr = i5;
            return _findName(this._quad1, i4, i3, 1);
        }
        int i7 = (i3 << 8) | i6;
        int i8 = i2 + 2;
        int i9 = bArr[i5] & 255;
        if (iArr[i9] != 0) {
            if (i9 != 34) {
                return null;
            }
            this._inputPtr = i8;
            return _findName(this._quad1, i4, i7, 2);
        }
        int i10 = (i7 << 8) | i9;
        int i11 = i2 + 3;
        int i12 = bArr[i8] & 255;
        if (iArr[i12] != 0) {
            if (i12 != 34) {
                return null;
            }
            this._inputPtr = i11;
            return _findName(this._quad1, i4, i10, 3);
        }
        if ((bArr[i11] & 255) != 34) {
            return null;
        }
        this._inputPtr = i2 + 4;
        return _findName(this._quad1, i4, (i10 << 8) | i12, 4);
    }

    private final JsonToken f(int i2, int i3, int i4) throws IOException {
        int i5;
        int[] iArrGrowArrayBy = this._quadBuffer;
        int[] iArr = f53300b;
        while (this._inputPtr < this._inputEnd) {
            byte[] bArr = this.f53301c;
            int i6 = this._inputPtr;
            this._inputPtr = i6 + 1;
            int iS = bArr[i6] & 255;
            if (iArr[iS] == 0) {
                if (i4 < 4) {
                    i4++;
                    i3 = (i3 << 8) | iS;
                } else {
                    if (i2 >= iArrGrowArrayBy.length) {
                        iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                        this._quadBuffer = iArrGrowArrayBy;
                    }
                    i5 = i2 + 1;
                    iArrGrowArrayBy[i2] = i3;
                    i2 = i5;
                    i3 = iS;
                    i4 = 1;
                }
            } else if (iS != 34) {
                if (iS != 92) {
                    _throwUnquotedSpace(iS, "name");
                } else {
                    iS = s();
                    if (iS < 0) {
                        this._minorState = 8;
                        this._minorStateAfterSplit = 7;
                        this._quadLength = i2;
                        this._pending32 = i3;
                        this._pendingBytes = i4;
                        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                        this._currToken = jsonToken;
                        return jsonToken;
                    }
                }
                if (i2 >= iArrGrowArrayBy.length) {
                    iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                    this._quadBuffer = iArrGrowArrayBy;
                }
                if (iS > 127) {
                    int i7 = 0;
                    if (i4 >= 4) {
                        iArrGrowArrayBy[i2] = i3;
                        i2++;
                        i3 = 0;
                        i4 = 0;
                    }
                    int i8 = i3 << 8;
                    if (iS < 2048) {
                        i3 = i8 | (iS >> 6) | PsExtractor.AUDIO_STREAM;
                        i4++;
                    } else {
                        int i9 = i8 | (iS >> 12) | 224;
                        int i10 = i4 + 1;
                        if (i10 >= 4) {
                            iArrGrowArrayBy[i2] = i9;
                            i2++;
                            i10 = 0;
                        } else {
                            i7 = i9;
                        }
                        i3 = (i7 << 8) | ((iS >> 6) & 63) | 128;
                        i4 = i10 + 1;
                    }
                    iS = (iS & 63) | 128;
                }
                if (i4 < 4) {
                    i4++;
                    i3 = (i3 << 8) | iS;
                } else {
                    i5 = i2 + 1;
                    iArrGrowArrayBy[i2] = i3;
                    i2 = i5;
                    i3 = iS;
                    i4 = 1;
                }
            } else {
                if (i4 > 0) {
                    if (i2 >= iArrGrowArrayBy.length) {
                        iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                        this._quadBuffer = iArrGrowArrayBy;
                    }
                    iArrGrowArrayBy[i2] = _padLastQuad(i3, i4);
                    i2++;
                } else if (i2 == 0) {
                    return _fieldComplete("");
                }
                String strB = this._symbols.b(iArrGrowArrayBy, i2);
                if (strB == null) {
                    strB = _addName(iArrGrowArrayBy, i2, i4);
                }
                return _fieldComplete(strB);
            }
        }
        this._quadLength = i2;
        this._pending32 = i3;
        this._pendingBytes = i4;
        this._minorState = 7;
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private JsonToken h(int i2) throws IOException {
        if (i2 != 35) {
            if (i2 != 39) {
                if (i2 == 47) {
                    return o(4);
                }
                if (i2 == 93) {
                    return _closeArrayScope();
                }
            } else if ((this._features & j) != 0) {
                return b(0, 0, 0);
            }
        } else if ((this._features & f) != 0) {
            return a(4);
        }
        if ((this._features & g) == 0) {
            _reportUnexpectedChar((char) i2, "was expecting double-quote to start field name");
        }
        if (wz.f()[i2] != 0) {
            _reportUnexpectedChar(i2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        return c(0, i2, 1);
    }

    private JsonToken c(int i2, int i3, int i4) throws IOException {
        int[] iArrGrowArrayBy = this._quadBuffer;
        int[] iArrF = wz.f();
        while (this._inputPtr < this._inputEnd) {
            int i5 = this.f53301c[this._inputPtr] & 255;
            if (iArrF[i5] == 0) {
                this._inputPtr++;
                if (i4 < 4) {
                    i4++;
                    i3 = (i3 << 8) | i5;
                } else {
                    if (i2 >= iArrGrowArrayBy.length) {
                        int[] iArrGrowArrayBy2 = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                        this._quadBuffer = iArrGrowArrayBy2;
                        iArrGrowArrayBy = iArrGrowArrayBy2;
                    }
                    iArrGrowArrayBy[i2] = i3;
                    i2++;
                    i3 = i5;
                    i4 = 1;
                }
            } else {
                if (i4 > 0) {
                    if (i2 >= iArrGrowArrayBy.length) {
                        iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                        this._quadBuffer = iArrGrowArrayBy;
                    }
                    iArrGrowArrayBy[i2] = i3;
                    i2++;
                }
                String strB = this._symbols.b(iArrGrowArrayBy, i2);
                if (strB == null) {
                    strB = _addName(iArrGrowArrayBy, i2, i4);
                }
                return _fieldComplete(strB);
            }
        }
        this._quadLength = i2;
        this._pending32 = i3;
        this._pendingBytes = i4;
        this._minorState = 10;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken;
        return jsonToken;
    }

    private JsonToken b(int i2, int i3, int i4) throws IOException {
        int[] iArrGrowArrayBy = this._quadBuffer;
        int[] iArr = f53300b;
        while (this._inputPtr < this._inputEnd) {
            byte[] bArr = this.f53301c;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            int iS = bArr[i5] & 255;
            if (iS != 39) {
                if (iS != 34 && iArr[iS] != 0) {
                    if (iS != 92) {
                        _throwUnquotedSpace(iS, "name");
                    } else {
                        iS = s();
                        if (iS < 0) {
                            this._minorState = 8;
                            this._minorStateAfterSplit = 9;
                            this._quadLength = i2;
                            this._pending32 = i3;
                            this._pendingBytes = i4;
                            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                            this._currToken = jsonToken;
                            return jsonToken;
                        }
                    }
                    if (iS > 127) {
                        int i6 = 0;
                        if (i4 >= 4) {
                            if (i2 >= iArrGrowArrayBy.length) {
                                iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                                this._quadBuffer = iArrGrowArrayBy;
                            }
                            iArrGrowArrayBy[i2] = i3;
                            i2++;
                            i3 = 0;
                            i4 = 0;
                        }
                        int i7 = i3 << 8;
                        if (iS < 2048) {
                            i3 = i7 | (iS >> 6) | PsExtractor.AUDIO_STREAM;
                            i4++;
                        } else {
                            int i8 = i7 | (iS >> 12) | 224;
                            int i9 = i4 + 1;
                            if (i9 >= 4) {
                                if (i2 >= iArrGrowArrayBy.length) {
                                    iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                                    this._quadBuffer = iArrGrowArrayBy;
                                }
                                iArrGrowArrayBy[i2] = i8;
                                i2++;
                                i9 = 0;
                            } else {
                                i6 = i8;
                            }
                            i3 = (i6 << 8) | ((iS >> 6) & 63) | 128;
                            i4 = i9 + 1;
                        }
                        iS = (iS & 63) | 128;
                    }
                }
                if (i4 < 4) {
                    i4++;
                    i3 = (i3 << 8) | iS;
                } else {
                    if (i2 >= iArrGrowArrayBy.length) {
                        int[] iArrGrowArrayBy2 = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                        this._quadBuffer = iArrGrowArrayBy2;
                        iArrGrowArrayBy = iArrGrowArrayBy2;
                    }
                    iArrGrowArrayBy[i2] = i3;
                    i2++;
                    i3 = iS;
                    i4 = 1;
                }
            } else {
                if (i4 > 0) {
                    if (i2 >= iArrGrowArrayBy.length) {
                        iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                        this._quadBuffer = iArrGrowArrayBy;
                    }
                    iArrGrowArrayBy[i2] = _padLastQuad(i3, i4);
                    i2++;
                } else if (i2 == 0) {
                    return _fieldComplete("");
                }
                String strB = this._symbols.b(iArrGrowArrayBy, i2);
                if (strB == null) {
                    strB = _addName(iArrGrowArrayBy, i2, i4);
                }
                return _fieldComplete(strB);
            }
        }
        this._quadLength = i2;
        this._pending32 = i3;
        this._pendingBytes = i4;
        this._minorState = 9;
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    protected final JsonToken a() throws IOException {
        int i2;
        int iE = e(this._quoted32, this._quotedDigits);
        if (iE < 0) {
            this._minorState = 8;
            return JsonToken.NOT_AVAILABLE;
        }
        if (this._quadLength >= this._quadBuffer.length) {
            this._quadBuffer = growArrayBy(this._quadBuffer, 32);
        }
        int i3 = this._pending32;
        int i4 = this._pendingBytes;
        int i5 = 1;
        if (iE > 127) {
            int i6 = 0;
            if (i4 >= 4) {
                int[] iArr = this._quadBuffer;
                int i7 = this._quadLength;
                this._quadLength = i7 + 1;
                iArr[i7] = i3;
                i3 = 0;
                i4 = 0;
            }
            int i8 = i3 << 8;
            if (iE < 2048) {
                i2 = (iE >> 6) | PsExtractor.AUDIO_STREAM;
            } else {
                int i9 = i8 | (iE >> 12) | 224;
                i4++;
                if (i4 >= 4) {
                    int[] iArr2 = this._quadBuffer;
                    int i10 = this._quadLength;
                    this._quadLength = i10 + 1;
                    iArr2[i10] = i9;
                    i4 = 0;
                } else {
                    i6 = i9;
                }
                i8 = i6 << 8;
                i2 = ((iE >> 6) & 63) | 128;
            }
            i3 = i8 | i2;
            i4++;
            iE = (iE & 63) | 128;
        }
        if (i4 < 4) {
            i5 = 1 + i4;
            iE |= i3 << 8;
        } else {
            int[] iArr3 = this._quadBuffer;
            int i11 = this._quadLength;
            this._quadLength = i11 + 1;
            iArr3[i11] = i3;
        }
        if (this._minorStateAfterSplit == 9) {
            return b(this._quadLength, iE, i5);
        }
        return f(this._quadLength, iE, i5);
    }

    private int e(int i2, int i3) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            this._quoted32 = i2;
            this._quotedDigits = i3;
            return -1;
        }
        byte[] bArr = this.f53301c;
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        byte b2 = bArr[i4];
        if (i3 == -1) {
            if (b2 == 34 || b2 == 47 || b2 == 92) {
                return b2;
            }
            if (b2 == 98) {
                return 8;
            }
            if (b2 == 102) {
                return 12;
            }
            if (b2 == 110) {
                return 10;
            }
            if (b2 == 114) {
                return 13;
            }
            if (b2 == 116) {
                return 9;
            }
            if (b2 != 117) {
                return _handleUnrecognizedCharacterEscape((char) b2);
            }
            if (this._inputPtr >= this._inputEnd) {
                this._quotedDigits = 0;
                this._quoted32 = 0;
                return -1;
            }
            byte[] bArr2 = this.f53301c;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            b2 = bArr2[i5];
            i3 = 0;
        }
        while (true) {
            int iC = wz.c(b2 & 255);
            if (iC < 0) {
                _reportUnexpectedChar(b2 & 255, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | iC;
            i3++;
            if (i3 == 4) {
                return i2;
            }
            if (this._inputPtr >= this._inputEnd) {
                this._quotedDigits = i3;
                this._quoted32 = i2;
                return -1;
            }
            byte[] bArr3 = this.f53301c;
            int i6 = this._inputPtr;
            this._inputPtr = i6 + 1;
            b2 = bArr3[i6];
        }
    }

    protected JsonToken m() throws IOException {
        int i2 = this._inputPtr;
        char[] cArrE = this._textBuffer.e();
        int[] iArr = o;
        int iMin = Math.min(this._inputEnd, cArrE.length + i2);
        byte[] bArr = this.f53301c;
        int i3 = 0;
        while (i2 < iMin) {
            int i4 = bArr[i2] & 255;
            if (iArr[i4] != 0) {
                if (i4 != 34) {
                    break;
                }
                this._inputPtr = i2 + 1;
                this._textBuffer.e(i3);
                return _valueComplete(JsonToken.VALUE_STRING);
            }
            i2++;
            cArrE[i3] = (char) i4;
            i3++;
        }
        this._textBuffer.e(i3);
        this._inputPtr = i2;
        return v();
    }

    private final JsonToken v() throws IOException {
        int[] iArr = o;
        byte[] bArr = this.f53301c;
        char[] cArrG = this._textBuffer.g();
        int iJ = this._textBuffer.j();
        int i2 = this._inputPtr;
        int i3 = this._inputEnd;
        while (i2 < this._inputEnd) {
            int i4 = 0;
            if (iJ >= cArrG.length) {
                cArrG = this._textBuffer.h();
                iJ = 0;
            }
            int iMin = Math.min(this._inputEnd, (cArrG.length - iJ) + i2);
            while (i2 < iMin) {
                int i5 = i2 + 1;
                int iP = bArr[i2] & 255;
                int i6 = iArr[iP];
                if (i6 != 0) {
                    if (iP != 34) {
                        if (i5 >= i3 - 5) {
                            this._inputPtr = i5;
                            this._textBuffer.e(iJ);
                            if (!e(iP, iArr[iP], i5 < this._inputEnd)) {
                                this._minorStateAfterSplit = 40;
                                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                                this._currToken = jsonToken;
                                return jsonToken;
                            }
                            cArrG = this._textBuffer.g();
                            iJ = this._textBuffer.j();
                            i2 = this._inputPtr;
                            break;
                        }
                        if (i6 == 1) {
                            this._inputPtr = i5;
                            iP = p();
                            i2 = this._inputPtr;
                        } else if (i6 != 2) {
                            if (i6 == 3) {
                                byte[] bArr2 = this.f53301c;
                                byte b2 = bArr2[i5];
                                i5 = i2 + 3;
                                iP = e(iP, b2, bArr2[i2 + 2]);
                            } else if (i6 == 4) {
                                byte[] bArr3 = this.f53301c;
                                int i7 = i2 + 4;
                                int iC = c(iP, bArr3[i5], bArr3[i2 + 2], bArr3[i2 + 3]);
                                int i8 = iJ + 1;
                                cArrG[iJ] = (char) ((iC >> 10) | GeneratorBase.SURR1_FIRST);
                                if (i8 >= cArrG.length) {
                                    cArrG = this._textBuffer.h();
                                    iJ = 0;
                                } else {
                                    iJ = i8;
                                }
                                iP = (iC & 1023) | 56320;
                                i2 = i7;
                            } else if (iP < 32) {
                                _throwUnquotedSpace(iP, "string value");
                            } else {
                                _reportInvalidChar(iP);
                            }
                            i2 = i5;
                        } else {
                            i2 += 2;
                            iP = a(iP, this.f53301c[i5]);
                        }
                        if (iJ >= cArrG.length) {
                            cArrG = this._textBuffer.h();
                        } else {
                            i4 = iJ;
                        }
                        iJ = i4 + 1;
                        cArrG[i4] = (char) iP;
                        break;
                    }
                    this._inputPtr = i5;
                    this._textBuffer.e(iJ);
                    return _valueComplete(JsonToken.VALUE_STRING);
                }
                cArrG[iJ] = (char) iP;
                iJ++;
                i2 = i5;
            }
        }
        this._inputPtr = i2;
        this._minorState = 40;
        this._textBuffer.e(iJ);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    protected JsonToken h() throws IOException {
        int i2 = this._inputPtr;
        char[] cArrE = this._textBuffer.e();
        int[] iArr = o;
        int iMin = Math.min(this._inputEnd, cArrE.length + i2);
        byte[] bArr = this.f53301c;
        int i3 = 0;
        while (i2 < iMin) {
            int i4 = bArr[i2] & 255;
            if (i4 == 39) {
                this._inputPtr = i2 + 1;
                this._textBuffer.e(i3);
                return _valueComplete(JsonToken.VALUE_STRING);
            }
            if (iArr[i4] != 0) {
                break;
            }
            i2++;
            cArrE[i3] = (char) i4;
            i3++;
        }
        this._textBuffer.e(i3);
        this._inputPtr = i2;
        return y();
    }

    private final JsonToken y() throws IOException {
        int[] iArr = o;
        byte[] bArr = this.f53301c;
        char[] cArrG = this._textBuffer.g();
        int iJ = this._textBuffer.j();
        int i2 = this._inputPtr;
        int i3 = this._inputEnd;
        while (i2 < this._inputEnd) {
            int i4 = 0;
            if (iJ >= cArrG.length) {
                cArrG = this._textBuffer.h();
                iJ = 0;
            }
            int iMin = Math.min(this._inputEnd, (cArrG.length - iJ) + i2);
            while (i2 < iMin) {
                int i5 = i2 + 1;
                int iP = bArr[i2] & 255;
                int i6 = iArr[iP];
                if (i6 != 0 && iP != 34) {
                    if (i5 >= i3 - 5) {
                        this._inputPtr = i5;
                        this._textBuffer.e(iJ);
                        if (!e(iP, iArr[iP], i5 < this._inputEnd)) {
                            this._minorStateAfterSplit = 45;
                            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                            this._currToken = jsonToken;
                            return jsonToken;
                        }
                        cArrG = this._textBuffer.g();
                        iJ = this._textBuffer.j();
                        i2 = this._inputPtr;
                        break;
                    }
                    if (i6 == 1) {
                        this._inputPtr = i5;
                        iP = p();
                        i2 = this._inputPtr;
                    } else if (i6 != 2) {
                        if (i6 == 3) {
                            byte[] bArr2 = this.f53301c;
                            byte b2 = bArr2[i5];
                            i5 = i2 + 3;
                            iP = e(iP, b2, bArr2[i2 + 2]);
                        } else if (i6 == 4) {
                            byte[] bArr3 = this.f53301c;
                            int i7 = i2 + 4;
                            int iC = c(iP, bArr3[i5], bArr3[i2 + 2], bArr3[i2 + 3]);
                            int i8 = iJ + 1;
                            cArrG[iJ] = (char) ((iC >> 10) | GeneratorBase.SURR1_FIRST);
                            if (i8 >= cArrG.length) {
                                cArrG = this._textBuffer.h();
                                iJ = 0;
                            } else {
                                iJ = i8;
                            }
                            iP = (iC & 1023) | 56320;
                            i2 = i7;
                        } else if (iP < 32) {
                            _throwUnquotedSpace(iP, "string value");
                        } else {
                            _reportInvalidChar(iP);
                        }
                        i2 = i5;
                    } else {
                        i2 += 2;
                        iP = a(iP, this.f53301c[i5]);
                    }
                    if (iJ >= cArrG.length) {
                        cArrG = this._textBuffer.h();
                    } else {
                        i4 = iJ;
                    }
                    iJ = i4 + 1;
                    cArrG[i4] = (char) iP;
                    break;
                }
                if (iP == 39) {
                    this._inputPtr = i5;
                    this._textBuffer.e(iJ);
                    return _valueComplete(JsonToken.VALUE_STRING);
                }
                cArrG[iJ] = (char) iP;
                iJ++;
                i2 = i5;
            }
        }
        this._inputPtr = i2;
        this._minorState = 45;
        this._textBuffer.e(iJ);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private final boolean e(int i2, int i3, boolean z) throws IOException {
        if (i3 == 1) {
            int iE = e(0, -1);
            if (iE < 0) {
                this._minorState = 41;
                return false;
            }
            this._textBuffer.c((char) iE);
            return true;
        }
        if (i3 == 2) {
            if (z) {
                byte[] bArr = this.f53301c;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                this._textBuffer.c((char) a(i2, bArr[i4]));
                return true;
            }
            this._minorState = 42;
            this._pending32 = i2;
            return false;
        }
        if (i3 == 3) {
            int i5 = i2 & 15;
            if (z) {
                byte[] bArr2 = this.f53301c;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                return d(i5, 1, bArr2[i6]);
            }
            this._minorState = 43;
            this._pending32 = i5;
            this._pendingBytes = 1;
            return false;
        }
        if (i3 != 4) {
            if (i2 < 32) {
                _throwUnquotedSpace(i2, "string value");
            } else {
                _reportInvalidChar(i2);
            }
            this._textBuffer.c((char) i2);
            return true;
        }
        int i7 = i2 & 7;
        if (z) {
            byte[] bArr3 = this.f53301c;
            int i8 = this._inputPtr;
            this._inputPtr = i8 + 1;
            return a(i7, 1, bArr3[i8]);
        }
        this._pending32 = i7;
        this._pendingBytes = 1;
        this._minorState = 44;
        return false;
    }

    private final boolean d(int i2, int i3, int i4) throws IOException {
        if (i3 == 1) {
            if ((i4 & PsExtractor.AUDIO_STREAM) != 128) {
                _reportInvalidOther(i4 & 255, this._inputPtr);
            }
            i2 = (i2 << 6) | (i4 & 63);
            if (this._inputPtr >= this._inputEnd) {
                this._minorState = 43;
                this._pending32 = i2;
                this._pendingBytes = 2;
                return false;
            }
            byte[] bArr = this.f53301c;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            i4 = bArr[i5];
        }
        if ((i4 & PsExtractor.AUDIO_STREAM) != 128) {
            _reportInvalidOther(i4 & 255, this._inputPtr);
        }
        this._textBuffer.c((char) ((i2 << 6) | (i4 & 63)));
        return true;
    }

    private final boolean a(int i2, int i3, int i4) throws IOException {
        if (i3 == 1) {
            if ((i4 & PsExtractor.AUDIO_STREAM) != 128) {
                _reportInvalidOther(i4 & 255, this._inputPtr);
            }
            i2 = (i2 << 6) | (i4 & 63);
            if (this._inputPtr >= this._inputEnd) {
                this._minorState = 44;
                this._pending32 = i2;
                this._pendingBytes = 2;
                return false;
            }
            byte[] bArr = this.f53301c;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            i4 = bArr[i5];
            i3 = 2;
        }
        if (i3 == 2) {
            if ((i4 & PsExtractor.AUDIO_STREAM) != 128) {
                _reportInvalidOther(i4 & 255, this._inputPtr);
            }
            i2 = (i2 << 6) | (i4 & 63);
            if (this._inputPtr >= this._inputEnd) {
                this._minorState = 44;
                this._pending32 = i2;
                this._pendingBytes = 3;
                return false;
            }
            byte[] bArr2 = this.f53301c;
            int i6 = this._inputPtr;
            this._inputPtr = i6 + 1;
            i4 = bArr2[i6];
        }
        if ((i4 & PsExtractor.AUDIO_STREAM) != 128) {
            _reportInvalidOther(i4 & 255, this._inputPtr);
        }
        int i7 = ((i2 << 6) | (i4 & 63)) - 65536;
        this._textBuffer.c((char) ((i7 >> 10) | GeneratorBase.SURR1_FIRST));
        this._textBuffer.c((char) ((i7 & 1023) | 56320));
        return true;
    }

    private final int s() throws IOException {
        if (this._inputEnd - this._inputPtr < 5) {
            return e(0, -1);
        }
        return p();
    }

    private final int p() throws IOException {
        byte[] bArr = this.f53301c;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 == 34 || b2 == 47 || b2 == 92) {
            return (char) b2;
        }
        if (b2 == 98) {
            return 8;
        }
        if (b2 == 102) {
            return 12;
        }
        if (b2 == 110) {
            return 10;
        }
        if (b2 == 114) {
            return 13;
        }
        if (b2 == 116) {
            return 9;
        }
        if (b2 != 117) {
            return _handleUnrecognizedCharacterEscape((char) b2);
        }
        byte[] bArr2 = this.f53301c;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b3 = bArr2[i3];
        int iC = wz.c(b3);
        if (iC >= 0) {
            byte[] bArr3 = this.f53301c;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            b3 = bArr3[i4];
            int iC2 = wz.c(b3);
            if (iC2 >= 0) {
                byte[] bArr4 = this.f53301c;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                b3 = bArr4[i5];
                int iC3 = wz.c(b3);
                if (iC3 >= 0) {
                    byte[] bArr5 = this.f53301c;
                    int i6 = this._inputPtr;
                    this._inputPtr = i6 + 1;
                    b3 = bArr5[i6];
                    int iC4 = wz.c(b3);
                    if (iC4 >= 0) {
                        return (((((iC << 4) | iC2) << 4) | iC3) << 4) | iC4;
                    }
                }
            }
        }
        _reportUnexpectedChar(b3 & 255, "expected a hex-digit for character escape sequence");
        return -1;
    }

    private final int a(int i2, int i3) throws IOException {
        if ((i3 & PsExtractor.AUDIO_STREAM) != 128) {
            _reportInvalidOther(i3 & 255, this._inputPtr);
        }
        return ((i2 & 31) << 6) | (i3 & 63);
    }

    private final int e(int i2, int i3, int i4) throws IOException {
        if ((i3 & PsExtractor.AUDIO_STREAM) != 128) {
            _reportInvalidOther(i3 & 255, this._inputPtr);
        }
        if ((i4 & PsExtractor.AUDIO_STREAM) != 128) {
            _reportInvalidOther(i4 & 255, this._inputPtr);
        }
        return ((((i2 & 15) << 6) | (i3 & 63)) << 6) | (i4 & 63);
    }

    private final int c(int i2, int i3, int i4, int i5) throws IOException {
        if ((i3 & PsExtractor.AUDIO_STREAM) != 128) {
            _reportInvalidOther(i3 & 255, this._inputPtr);
        }
        if ((i4 & PsExtractor.AUDIO_STREAM) != 128) {
            _reportInvalidOther(i4 & 255, this._inputPtr);
        }
        if ((i5 & PsExtractor.AUDIO_STREAM) != 128) {
            _reportInvalidOther(i5 & 255, this._inputPtr);
        }
        return (((((((i2 & 7) << 6) | (i3 & 63)) << 6) | (i4 & 63)) << 6) | (i5 & 63)) - 65536;
    }
}
