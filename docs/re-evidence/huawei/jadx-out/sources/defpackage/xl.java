package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* JADX INFO: loaded from: classes21.dex */
public class xl extends ParserBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected char[] f53152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f53153c;
    protected int d;
    protected boolean e;
    protected ObjectCodec f;
    protected int g;
    protected final xr h;
    protected Reader i;
    protected long j;
    protected boolean m;
    private static final int s = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int p = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int t = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    private static final int l = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int k = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int o = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int n = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int r = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final int[] f53151a = wz.a();

    public xl(xa xaVar, int i, Reader reader, ObjectCodec objectCodec, xr xrVar, char[] cArr, int i2, int i3, boolean z) {
        super(xaVar, i);
        this.i = reader;
        this.f53152b = cArr;
        this._inputPtr = i2;
        this._inputEnd = i3;
        this.f = objectCodec;
        this.h = xrVar;
        this.f53153c = xrVar.e();
        this.e = z;
    }

    public xl(xa xaVar, int i, Reader reader, ObjectCodec objectCodec, xr xrVar) {
        super(xaVar, i);
        this.i = reader;
        this.f53152b = xaVar.b();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this.f = objectCodec;
        this.h = xrVar;
        this.f53153c = xrVar.e();
        this.e = true;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this.f;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCodec(ObjectCodec objectCodec) {
        this.f = objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public yb<StreamReadCapability> getReadCapabilities() {
        return JSON_READ_CAPABILITIES;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(Writer writer) throws IOException {
        int i = this._inputEnd - this._inputPtr;
        if (i < 1) {
            return 0;
        }
        int i2 = this._inputPtr;
        this._inputPtr += i;
        writer.write(this.f53152b, i2, i);
        return i;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return this.i;
    }

    @Deprecated
    protected char b(String str) throws IOException {
        return a(str, (JsonToken) null);
    }

    protected char a(String str, JsonToken jsonToken) throws IOException {
        if (this._inputPtr >= this._inputEnd && !c()) {
            _reportInvalidEOF(str, jsonToken);
        }
        char[] cArr = this.f53152b;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        return cArr[i];
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
        if (this.i != null) {
            if (this._ioContext.i() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.i.close();
            }
            this.i = null;
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() throws IOException {
        char[] cArr;
        super._releaseBuffers();
        this.h.d();
        if (!this.e || (cArr = this.f53152b) == null) {
            return;
        }
        this.f53152b = null;
        this._ioContext.b(cArr);
    }

    protected void b() throws IOException {
        if (c()) {
            return;
        }
        _reportInvalidEOF();
    }

    protected boolean c() throws IOException {
        Reader reader = this.i;
        if (reader != null) {
            char[] cArr = this.f53152b;
            int i = reader.read(cArr, 0, cArr.length);
            if (i > 0) {
                int i2 = this._inputEnd;
                long j = i2;
                this._currInputProcessed += j;
                this._currInputRowStart -= i2;
                this.j -= j;
                this._inputPtr = 0;
                this._inputEnd = i;
                return true;
            }
            _closeInput();
            if (i == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this._inputEnd);
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getText() throws IOException {
        if (this._currToken == JsonToken.VALUE_STRING) {
            if (this.m) {
                this.m = false;
                _finishString();
            }
            return this._textBuffer.d();
        }
        return c(this._currToken);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getText(Writer writer) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.m) {
                this.m = false;
                _finishString();
            }
            return this._textBuffer.a(writer);
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            String currentName = this._parsingContext.getCurrentName();
            writer.write(currentName);
            return currentName.length();
        }
        if (jsonToken == null) {
            return 0;
        }
        if (jsonToken.isNumeric()) {
            return this._textBuffer.a(writer);
        }
        char[] cArrAsCharArray = jsonToken.asCharArray();
        writer.write(cArrAsCharArray);
        return cArrAsCharArray.length;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getValueAsString() throws IOException {
        if (this._currToken == JsonToken.VALUE_STRING) {
            if (this.m) {
                this.m = false;
                _finishString();
            }
            return this._textBuffer.d();
        }
        if (this._currToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(null);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getValueAsString(String str) throws IOException {
        if (this._currToken == JsonToken.VALUE_STRING) {
            if (this.m) {
                this.m = false;
                _finishString();
            }
            return this._textBuffer.d();
        }
        if (this._currToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(str);
    }

    protected final String c(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        if (iId == 5) {
            return this._parsingContext.getCurrentName();
        }
        if (iId == 6 || iId == 7 || iId == 8) {
            return this._textBuffer.d();
        }
        return jsonToken.asString();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final char[] getTextCharacters() throws IOException {
        if (this._currToken == null) {
            return null;
        }
        int iId = this._currToken.id();
        if (iId == 5) {
            if (!this._nameCopied) {
                String currentName = this._parsingContext.getCurrentName();
                int length = currentName.length();
                if (this._nameCopyBuffer == null) {
                    this._nameCopyBuffer = this._ioContext.b(length);
                } else if (this._nameCopyBuffer.length < length) {
                    this._nameCopyBuffer = new char[length];
                }
                currentName.getChars(0, length, this._nameCopyBuffer, 0);
                this._nameCopied = true;
            }
            return this._nameCopyBuffer;
        }
        if (iId != 6) {
            if (iId != 7 && iId != 8) {
                return this._currToken.asCharArray();
            }
        } else if (this.m) {
            this.m = false;
            _finishString();
        }
        return this._textBuffer.m();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final int getTextLength() throws IOException {
        if (this._currToken == null) {
            return 0;
        }
        int iId = this._currToken.id();
        if (iId == 5) {
            return this._parsingContext.getCurrentName().length();
        }
        if (iId != 6) {
            if (iId != 7 && iId != 8) {
                return this._currToken.asCharArray().length;
            }
        } else if (this.m) {
            this.m = false;
            _finishString();
        }
        return this._textBuffer.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getTextOffset() throws IOException {
        if (this._currToken != null) {
            int iId = this._currToken.id();
            if (iId != 6) {
                if (iId != 7) {
                }
            } else if (this.m) {
                this.m = false;
                _finishString();
            }
            return this._textBuffer.o();
        }
        return 0;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT && this._binaryValue != null) {
            return this._binaryValue;
        }
        if (this._currToken != JsonToken.VALUE_STRING) {
            _reportError("Current token (" + this._currToken + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.m) {
            try {
                this._binaryValue = b(base64Variant);
                this.m = false;
            } catch (IllegalArgumentException e) {
                throw _constructError("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e.getMessage());
            }
        } else if (this._binaryValue == null) {
            xx xxVar_getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), xxVar_getByteArrayBuilder, base64Variant);
            this._binaryValue = xxVar_getByteArrayBuilder.i();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this.m || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] bArrC = this._ioContext.c();
        try {
            return a(base64Variant, outputStream, bArrC);
        } finally {
            this._ioContext.a(bArrC);
        }
    }

    protected int a(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                b();
            }
            char[] cArr = this.f53152b;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            char c2 = cArr[i3];
            if (c2 > ' ') {
                int iC = base64Variant.c(c2);
                if (iC < 0) {
                    if (c2 == '\"') {
                        break;
                    }
                    iC = _decodeBase64Escape(base64Variant, c2, 0);
                    if (iC < 0) {
                        continue;
                    }
                }
                if (i > length - 3) {
                    i2 += i;
                    outputStream.write(bArr, 0, i);
                    i = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    b();
                }
                char[] cArr2 = this.f53152b;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                char c3 = cArr2[i4];
                int iC2 = base64Variant.c(c3);
                if (iC2 < 0) {
                    iC2 = _decodeBase64Escape(base64Variant, c3, 1);
                }
                int i5 = (iC << 6) | iC2;
                if (this._inputPtr >= this._inputEnd) {
                    b();
                }
                char[] cArr3 = this.f53152b;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                char c4 = cArr3[i6];
                int iC3 = base64Variant.c(c4);
                if (iC3 < 0) {
                    if (iC3 != -2) {
                        if (c4 == '\"') {
                            bArr[i] = (byte) (i5 >> 4);
                            if (base64Variant.h()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i++;
                            break;
                        }
                        iC3 = _decodeBase64Escape(base64Variant, c4, 2);
                    }
                    if (iC3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            b();
                        }
                        char[] cArr4 = this.f53152b;
                        int i7 = this._inputPtr;
                        this._inputPtr = i7 + 1;
                        char c5 = cArr4[i7];
                        if (!base64Variant.b(c5) && _decodeBase64Escape(base64Variant, c5, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, c5, 3, "expected padding character '" + base64Variant.j() + "'");
                        }
                        bArr[i] = (byte) (i5 >> 4);
                        i++;
                    }
                }
                int i8 = (i5 << 6) | iC3;
                if (this._inputPtr >= this._inputEnd) {
                    b();
                }
                char[] cArr5 = this.f53152b;
                int i9 = this._inputPtr;
                this._inputPtr = i9 + 1;
                char c6 = cArr5[i9];
                int iC4 = base64Variant.c(c6);
                if (iC4 < 0) {
                    if (iC4 != -2) {
                        if (c6 == '\"') {
                            bArr[i] = (byte) (i8 >> 10);
                            int i10 = i + 2;
                            bArr[i + 1] = (byte) (i8 >> 2);
                            if (base64Variant.h()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i = i10;
                            break;
                        }
                        iC4 = _decodeBase64Escape(base64Variant, c6, 3);
                    }
                    if (iC4 == -2) {
                        bArr[i] = (byte) (i8 >> 10);
                        bArr[i + 1] = (byte) (i8 >> 2);
                        i += 2;
                    }
                }
                int i11 = (i8 << 6) | iC4;
                bArr[i] = (byte) (i11 >> 16);
                bArr[i + 1] = (byte) (i11 >> 8);
                bArr[i + 2] = (byte) i11;
                i += 3;
            }
        }
        this.m = false;
        if (i <= 0) {
            return i2;
        }
        int i12 = i2 + i;
        outputStream.write(bArr, 0, i);
        return i12;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final JsonToken nextToken() throws IOException {
        JsonToken jsonTokenG;
        if (this._currToken == JsonToken.FIELD_NAME) {
            return k();
        }
        this._numTypesValid = 0;
        if (this.m) {
            i();
        }
        int iT = t();
        if (iT < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (iT == 93 || iT == 125) {
            e(iT);
            return this._currToken;
        }
        if (this._parsingContext.e()) {
            iT = g(iT);
            if ((this._features & s) != 0 && (iT == 93 || iT == 125)) {
                e(iT);
                return this._currToken;
            }
        }
        boolean zInObject = this._parsingContext.inObject();
        if (zInObject) {
            x();
            this._parsingContext.c(iT == 34 ? j() : c(iT));
            this._currToken = JsonToken.FIELD_NAME;
            iT = p();
        }
        y();
        if (iT == 34) {
            this.m = true;
            jsonTokenG = JsonToken.VALUE_STRING;
        } else if (iT == 91) {
            if (!zInObject) {
                this._parsingContext = this._parsingContext.c(this._tokenInputRow, this._tokenInputCol);
            }
            jsonTokenG = JsonToken.START_ARRAY;
        } else if (iT == 102) {
            n();
            jsonTokenG = JsonToken.VALUE_FALSE;
        } else if (iT == 110) {
            l();
            jsonTokenG = JsonToken.VALUE_NULL;
        } else if (iT == 116) {
            o();
            jsonTokenG = JsonToken.VALUE_TRUE;
        } else if (iT == 123) {
            if (!zInObject) {
                this._parsingContext = this._parsingContext.b(this._tokenInputRow, this._tokenInputCol);
            }
            jsonTokenG = JsonToken.START_OBJECT;
        } else if (iT == 125) {
            _reportUnexpectedChar(iT, "expected a value");
            o();
            jsonTokenG = JsonToken.VALUE_TRUE;
        } else if (iT == 45) {
            jsonTokenG = g();
        } else if (iT == 46) {
            jsonTokenG = h();
        } else {
            switch (iT) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonTokenG = d(iT);
                    break;
                default:
                    jsonTokenG = a(iT);
                    break;
            }
        }
        if (zInObject) {
            this._nextToken = jsonTokenG;
            return this._currToken;
        }
        this._currToken = jsonTokenG;
        return jsonTokenG;
    }

    private final JsonToken k() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.c(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.b(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void finishToken() throws IOException {
        if (this.m) {
            this.m = false;
            _finishString();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean nextFieldName(SerializableString serializableString) throws IOException {
        int i = 0;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            k();
            return false;
        }
        if (this.m) {
            i();
        }
        int iT = t();
        if (iT < 0) {
            close();
            this._currToken = null;
            return false;
        }
        this._binaryValue = null;
        if (iT == 93 || iT == 125) {
            e(iT);
            return false;
        }
        if (this._parsingContext.e()) {
            iT = g(iT);
            if ((this._features & s) != 0 && (iT == 93 || iT == 125)) {
                e(iT);
                return false;
            }
        }
        if (!this._parsingContext.inObject()) {
            y();
            f(iT);
            return false;
        }
        x();
        if (iT == 34) {
            char[] cArrAsQuotedChars = serializableString.asQuotedChars();
            int length = cArrAsQuotedChars.length;
            if (this._inputPtr + length + 4 < this._inputEnd) {
                int i2 = this._inputPtr + length;
                if (this.f53152b[i2] == '\"') {
                    int i3 = this._inputPtr;
                    while (i3 != i2) {
                        if (cArrAsQuotedChars[i] == this.f53152b[i3]) {
                            i++;
                            i3++;
                        }
                    }
                    this._parsingContext.c(serializableString.getValue());
                    b(h(i3 + 1));
                    return true;
                }
            }
        }
        return b(iT, serializableString.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws IOException {
        JsonToken jsonTokenG;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            k();
            return null;
        }
        if (this.m) {
            i();
        }
        int iT = t();
        if (iT < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (iT == 93 || iT == 125) {
            e(iT);
            return null;
        }
        if (this._parsingContext.e()) {
            iT = g(iT);
            if ((this._features & s) != 0 && (iT == 93 || iT == 125)) {
                e(iT);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            y();
            f(iT);
            return null;
        }
        x();
        String strJ = iT == 34 ? j() : c(iT);
        this._parsingContext.c(strJ);
        this._currToken = JsonToken.FIELD_NAME;
        int iP = p();
        y();
        if (iP == 34) {
            this.m = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return strJ;
        }
        if (iP == 45) {
            jsonTokenG = g();
        } else if (iP == 46) {
            jsonTokenG = h();
        } else if (iP == 91) {
            jsonTokenG = JsonToken.START_ARRAY;
        } else if (iP == 102) {
            n();
            jsonTokenG = JsonToken.VALUE_FALSE;
        } else if (iP == 110) {
            l();
            jsonTokenG = JsonToken.VALUE_NULL;
        } else if (iP == 116) {
            o();
            jsonTokenG = JsonToken.VALUE_TRUE;
        } else if (iP != 123) {
            switch (iP) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonTokenG = d(iP);
                    break;
                default:
                    jsonTokenG = a(iP);
                    break;
            }
        } else {
            jsonTokenG = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonTokenG;
        return strJ;
    }

    private final void b(int i) throws IOException {
        this._currToken = JsonToken.FIELD_NAME;
        y();
        if (i == 34) {
            this.m = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return;
        }
        if (i == 91) {
            this._nextToken = JsonToken.START_ARRAY;
            return;
        }
        if (i == 102) {
            e("false", 1);
            this._nextToken = JsonToken.VALUE_FALSE;
            return;
        }
        if (i == 110) {
            e(Constants.NULL, 1);
            this._nextToken = JsonToken.VALUE_NULL;
            return;
        }
        if (i == 116) {
            e("true", 1);
            this._nextToken = JsonToken.VALUE_TRUE;
            return;
        }
        if (i == 123) {
            this._nextToken = JsonToken.START_OBJECT;
            return;
        }
        if (i == 45) {
            this._nextToken = g();
            return;
        }
        if (i == 46) {
            this._nextToken = h();
            return;
        }
        switch (i) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                this._nextToken = d(i);
                break;
            default:
                this._nextToken = a(i);
                break;
        }
    }

    protected boolean b(int i, String str) throws IOException {
        JsonToken jsonTokenG;
        String strJ = i == 34 ? j() : c(i);
        this._parsingContext.c(strJ);
        this._currToken = JsonToken.FIELD_NAME;
        int iP = p();
        y();
        if (iP == 34) {
            this.m = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return str.equals(strJ);
        }
        if (iP == 45) {
            jsonTokenG = g();
        } else if (iP == 46) {
            jsonTokenG = h();
        } else if (iP == 91) {
            jsonTokenG = JsonToken.START_ARRAY;
        } else if (iP == 102) {
            n();
            jsonTokenG = JsonToken.VALUE_FALSE;
        } else if (iP == 110) {
            l();
            jsonTokenG = JsonToken.VALUE_NULL;
        } else if (iP == 116) {
            o();
            jsonTokenG = JsonToken.VALUE_TRUE;
        } else if (iP != 123) {
            switch (iP) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonTokenG = d(iP);
                    break;
                default:
                    jsonTokenG = a(iP);
                    break;
            }
        } else {
            jsonTokenG = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonTokenG;
        return str.equals(strJ);
    }

    private final JsonToken f(int i) throws IOException {
        if (i == 34) {
            this.m = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        }
        if (i == 91) {
            this._parsingContext = this._parsingContext.c(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        if (i == 102) {
            e("false", 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (i == 110) {
            e(Constants.NULL, 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (i == 116) {
            e("true", 1);
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this._currToken = jsonToken5;
            return jsonToken5;
        }
        if (i == 123) {
            this._parsingContext = this._parsingContext.b(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this._currToken = jsonToken6;
            return jsonToken6;
        }
        switch (i) {
            case 44:
                if (!this._parsingContext.inRoot() && (this._features & l) != 0) {
                    this._inputPtr--;
                    JsonToken jsonToken7 = JsonToken.VALUE_NULL;
                    this._currToken = jsonToken7;
                    return jsonToken7;
                }
                break;
            case 45:
                JsonToken jsonTokenG = g();
                this._currToken = jsonTokenG;
                return jsonTokenG;
            case 46:
                JsonToken jsonTokenH = h();
                this._currToken = jsonTokenH;
                return jsonTokenH;
            default:
                switch (i) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        JsonToken jsonTokenD = d(i);
                        this._currToken = jsonTokenD;
                        return jsonTokenD;
                }
        }
        JsonToken jsonTokenA = a(i);
        this._currToken = jsonTokenA;
        return jsonTokenA;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String nextTextValue() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this.m) {
                    this.m = false;
                    _finishString();
                }
                return this._textBuffer.d();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.c(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.b(this._tokenInputRow, this._tokenInputCol);
            }
            return null;
        }
        if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int nextIntValue(int i) throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getIntValue() : i;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            return getIntValue();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.c(this._tokenInputRow, this._tokenInputCol);
            return i;
        }
        if (jsonToken != JsonToken.START_OBJECT) {
            return i;
        }
        this._parsingContext = this._parsingContext.b(this._tokenInputRow, this._tokenInputCol);
        return i;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final long nextLongValue(long j) throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getLongValue() : j;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            return getLongValue();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.c(this._tokenInputRow, this._tokenInputCol);
            return j;
        }
        if (jsonToken != JsonToken.START_OBJECT) {
            return j;
        }
        this._parsingContext = this._parsingContext.b(this._tokenInputRow, this._tokenInputCol);
        return j;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Boolean nextBooleanValue() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (jsonToken == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.c(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.b(this._tokenInputRow, this._tokenInputCol);
            }
            return null;
        }
        JsonToken jsonTokenNextToken = nextToken();
        if (jsonTokenNextToken != null) {
            int iId = jsonTokenNextToken.id();
            if (iId == 9) {
                return Boolean.TRUE;
            }
            if (iId == 10) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    protected final JsonToken h() throws IOException {
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return a(46);
        }
        return c(46, this._inputPtr - 1, this._inputPtr, false, 0);
    }

    protected final JsonToken d(int i) throws IOException {
        int i2 = this._inputPtr;
        int i3 = i2 - 1;
        int i4 = this._inputEnd;
        if (i == 48) {
            return e(false, i3);
        }
        int i5 = 1;
        while (i2 < i4) {
            int i6 = i2 + 1;
            char c2 = this.f53152b[i2];
            if (c2 < '0' || c2 > '9') {
                if (c2 == '.' || c2 == 'e' || c2 == 'E') {
                    this._inputPtr = i6;
                    return c(c2, i3, i6, false, i5);
                }
                this._inputPtr = i2;
                if (this._parsingContext.inRoot()) {
                    j(c2);
                }
                this._textBuffer.b(this.f53152b, i3, i2 - i3);
                return resetInt(false, i5);
            }
            i5++;
            i2 = i6;
        }
        this._inputPtr = i3;
        return e(false, i3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    private final com.fasterxml.jackson.core.JsonToken c(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    protected final JsonToken g() throws IOException {
        int i = this._inputPtr;
        int i2 = i - 1;
        int i3 = this._inputEnd;
        if (i >= i3) {
            return e(true, i2);
        }
        int i4 = i + 1;
        char c2 = this.f53152b[i];
        if (c2 > '9' || c2 < '0') {
            this._inputPtr = i4;
            return c((int) c2, true);
        }
        if (c2 == '0') {
            return e(true, i2);
        }
        int i5 = 1;
        while (i4 < i3) {
            int i6 = i4 + 1;
            char c3 = this.f53152b[i4];
            if (c3 < '0' || c3 > '9') {
                if (c3 == '.' || c3 == 'e' || c3 == 'E') {
                    this._inputPtr = i6;
                    return c(c3, i2, i6, true, i5);
                }
                this._inputPtr = i4;
                if (this._parsingContext.inRoot()) {
                    j(c3);
                }
                this._textBuffer.b(this.f53152b, i2, i4 - i2);
                return resetInt(true, i5);
            }
            i5++;
            i4 = i6;
        }
        return e(true, i2);
    }

    private final JsonToken e(boolean z, int i) throws IOException {
        int i2;
        char cA;
        boolean z2;
        int i3;
        char cB;
        char cB2;
        if (z) {
            i++;
        }
        this._inputPtr = i;
        char[] cArrE = this._textBuffer.e();
        int i4 = 0;
        if (z) {
            cArrE[0] = '-';
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this._inputPtr < this._inputEnd) {
            char[] cArr = this.f53152b;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            cA = cArr[i5];
        } else {
            cA = a("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
        }
        if (cA == '0') {
            cA = z();
        }
        int i6 = 0;
        while (true) {
            if (cA >= '0' && cA <= '9') {
                i6++;
                if (i2 >= cArrE.length) {
                    cArrE = this._textBuffer.h();
                    i2 = 0;
                }
                int i7 = i2 + 1;
                cArrE[i2] = cA;
                if (this._inputPtr >= this._inputEnd && !c()) {
                    cA = 0;
                    i2 = i7;
                    z2 = true;
                    break;
                }
                char[] cArr2 = this.f53152b;
                int i8 = this._inputPtr;
                this._inputPtr = i8 + 1;
                cA = cArr2[i8];
                i2 = i7;
            } else {
                z2 = false;
                break;
            }
        }
        if (i6 == 0) {
            return c(cA, z);
        }
        if (cA == '.') {
            if (i2 >= cArrE.length) {
                cArrE = this._textBuffer.h();
                i2 = 0;
            }
            cArrE[i2] = cA;
            i2++;
            i3 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !c()) {
                    z2 = true;
                    break;
                }
                char[] cArr3 = this.f53152b;
                int i9 = this._inputPtr;
                this._inputPtr = i9 + 1;
                cA = cArr3[i9];
                if (cA < '0' || cA > '9') {
                    break;
                }
                i3++;
                if (i2 >= cArrE.length) {
                    cArrE = this._textBuffer.h();
                    i2 = 0;
                }
                cArrE[i2] = cA;
                i2++;
            }
            if (i3 == 0) {
                reportUnexpectedNumberChar(cA, "Decimal point not followed by a digit");
            }
        } else {
            i3 = 0;
        }
        if (cA == 'e' || cA == 'E') {
            if (i2 >= cArrE.length) {
                cArrE = this._textBuffer.h();
                i2 = 0;
            }
            int i10 = i2 + 1;
            cArrE[i2] = cA;
            if (this._inputPtr < this._inputEnd) {
                char[] cArr4 = this.f53152b;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                cB = cArr4[i11];
            } else {
                cB = b("expected a digit for number exponent");
            }
            if (cB == '-' || cB == '+') {
                if (i10 >= cArrE.length) {
                    cArrE = this._textBuffer.h();
                    i10 = 0;
                }
                cArrE[i10] = cB;
                if (this._inputPtr < this._inputEnd) {
                    char[] cArr5 = this.f53152b;
                    int i12 = this._inputPtr;
                    this._inputPtr = i12 + 1;
                    cB2 = cArr5[i12];
                } else {
                    cB2 = b("expected a digit for number exponent");
                }
                cB = cB2;
                i10++;
            }
            int i13 = 0;
            cA = cB;
            while (true) {
                if (cA <= '9' && cA >= '0') {
                    i13++;
                    if (i10 >= cArrE.length) {
                        cArrE = this._textBuffer.h();
                        i10 = 0;
                    }
                    i2 = i10 + 1;
                    cArrE[i10] = cA;
                    if (this._inputPtr >= this._inputEnd && !c()) {
                        i4 = i13;
                        z2 = true;
                        break;
                    }
                    char[] cArr6 = this.f53152b;
                    int i14 = this._inputPtr;
                    this._inputPtr = i14 + 1;
                    cA = cArr6[i14];
                    i10 = i2;
                } else {
                    i4 = i13;
                    i2 = i10;
                    break;
                }
            }
            if (i4 == 0) {
                reportUnexpectedNumberChar(cA, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                j(cA);
            }
        }
        this._textBuffer.e(i2);
        return reset(z, i6, i3, i4);
    }

    private final char z() throws IOException {
        char c2;
        if (this._inputPtr >= this._inputEnd || ((c2 = this.f53152b[this._inputPtr]) >= '0' && c2 <= '9')) {
            return w();
        }
        return '0';
    }

    private char w() throws IOException {
        char c2;
        if ((this._inputPtr >= this._inputEnd && !c()) || (c2 = this.f53152b[this._inputPtr]) < '0' || c2 > '9') {
            return '0';
        }
        if ((this._features & p) == 0) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        this._inputPtr++;
        if (c2 != '0') {
            return c2;
        }
        do {
            if (this._inputPtr >= this._inputEnd && !c()) {
                return c2;
            }
            c2 = this.f53152b[this._inputPtr];
            if (c2 < '0' || c2 > '9') {
                return '0';
            }
            this._inputPtr++;
        } while (c2 == '0');
        return c2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    protected com.fasterxml.jackson.core.JsonToken c(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    private final void j(int i) throws IOException {
        this._inputPtr++;
        if (i != 9) {
            if (i == 10) {
                this._currInputRow++;
                this._currInputRowStart = this._inputPtr;
            } else if (i == 13) {
                f();
            } else if (i != 32) {
                _reportMissingRootWS(i);
            }
        }
    }

    protected final String j() throws IOException {
        int i = this._inputPtr;
        int i2 = this.f53153c;
        int[] iArr = f53151a;
        while (i < this._inputEnd) {
            char c2 = this.f53152b[i];
            if (c2 < iArr.length && iArr[c2] != 0) {
                if (c2 != '\"') {
                    break;
                }
                int i3 = this._inputPtr;
                this._inputPtr = i + 1;
                return this.h.c(this.f53152b, i3, i - i3, i2);
            }
            i2 = (i2 * 33) + c2;
            i++;
        }
        int i4 = this._inputPtr;
        this._inputPtr = i;
        return a(i4, i2, 34);
    }

    private String a(int i, int i2, int i3) throws IOException {
        this._textBuffer.b(this.f53152b, i, this._inputPtr - i);
        char[] cArrF = this._textBuffer.f();
        int iJ = this._textBuffer.j();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !c()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            char[] cArr = this.f53152b;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            char c_decodeEscaped = cArr[i4];
            if (c_decodeEscaped <= '\\') {
                if (c_decodeEscaped == '\\') {
                    c_decodeEscaped = _decodeEscaped();
                } else if (c_decodeEscaped <= i3) {
                    if (c_decodeEscaped == i3) {
                        this._textBuffer.e(iJ);
                        yh yhVar = this._textBuffer;
                        return this.h.c(yhVar.m(), yhVar.o(), yhVar.k(), i2);
                    }
                    if (c_decodeEscaped < ' ') {
                        _throwUnquotedSpace(c_decodeEscaped, "name");
                    }
                }
            }
            i2 = (i2 * 33) + c_decodeEscaped;
            int i5 = iJ + 1;
            cArrF[iJ] = c_decodeEscaped;
            if (i5 >= cArrF.length) {
                cArrF = this._textBuffer.h();
                iJ = 0;
            } else {
                iJ = i5;
            }
        }
    }

    protected String c(int i) throws IOException {
        if (i == 39 && (this._features & k) != 0) {
            return e();
        }
        if ((this._features & o) == 0) {
            _reportUnexpectedChar(i, "was expecting double-quote to start field name");
        }
        int[] iArrI = wz.i();
        int length = iArrI.length;
        if (i >= length ? !Character.isJavaIdentifierPart((char) i) : iArrI[i] != 0) {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i2 = this._inputPtr;
        int i3 = this.f53153c;
        int i4 = this._inputEnd;
        if (i2 < i4) {
            do {
                char c2 = this.f53152b[i2];
                if (c2 < length) {
                    if (iArrI[c2] != 0) {
                        int i5 = this._inputPtr - 1;
                        this._inputPtr = i2;
                        return this.h.c(this.f53152b, i5, i2 - i5, i3);
                    }
                } else if (!Character.isJavaIdentifierPart(c2)) {
                    int i6 = this._inputPtr - 1;
                    this._inputPtr = i2;
                    return this.h.c(this.f53152b, i6, i2 - i6, i3);
                }
                i3 = (i3 * 33) + c2;
                i2++;
            } while (i2 < i4);
        }
        int i7 = this._inputPtr;
        this._inputPtr = i2;
        return a(i7 - 1, i3, iArrI);
    }

    protected String e() throws IOException {
        int i = this._inputPtr;
        int i2 = this.f53153c;
        int i3 = this._inputEnd;
        if (i < i3) {
            int[] iArr = f53151a;
            int length = iArr.length;
            do {
                char c2 = this.f53152b[i];
                if (c2 == '\'') {
                    int i4 = this._inputPtr;
                    this._inputPtr = i + 1;
                    return this.h.c(this.f53152b, i4, i - i4, i2);
                }
                if (c2 < length && iArr[c2] != 0) {
                    break;
                }
                i2 = (i2 * 33) + c2;
                i++;
            } while (i < i3);
        }
        int i5 = this._inputPtr;
        this._inputPtr = i;
        return a(i5, i2, 39);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    protected JsonToken a(int i) throws IOException {
        if (i != 39) {
            if (i == 73) {
                e("Infinity", 1);
                if ((this._features & t) != 0) {
                    return resetAsNaN("Infinity", Double.POSITIVE_INFINITY);
                }
                _reportError("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            } else if (i == 78) {
                e("NaN", 1);
                if ((this._features & t) != 0) {
                    return resetAsNaN("NaN", Double.NaN);
                }
                _reportError("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            } else if (i != 93) {
                if (i == 43) {
                    if (this._inputPtr >= this._inputEnd && !c()) {
                        _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
                    }
                    char[] cArr = this.f53152b;
                    int i2 = this._inputPtr;
                    this._inputPtr = i2 + 1;
                    return c((int) cArr[i2], false);
                }
                if (i == 44) {
                    if (!this._parsingContext.inRoot() && (this._features & l) != 0) {
                        this._inputPtr--;
                        return JsonToken.VALUE_NULL;
                    }
                }
            } else if (this._parsingContext.inArray()) {
                if (!this._parsingContext.inRoot()) {
                    this._inputPtr--;
                    return JsonToken.VALUE_NULL;
                }
            }
        } else if ((this._features & k) != 0) {
            return d();
        }
        if (Character.isJavaIdentifierStart(i)) {
            c("" + ((char) i), _validJsonTokenList());
        }
        _reportUnexpectedChar(i, "expected a valid value " + _validJsonValueList());
        return null;
    }

    protected JsonToken d() throws IOException {
        char[] cArrE = this._textBuffer.e();
        int iJ = this._textBuffer.j();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !c()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this.f53152b;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c_decodeEscaped = cArr[i];
            if (c_decodeEscaped <= '\\') {
                if (c_decodeEscaped == '\\') {
                    c_decodeEscaped = _decodeEscaped();
                } else if (c_decodeEscaped <= '\'') {
                    if (c_decodeEscaped == '\'') {
                        this._textBuffer.e(iJ);
                        return JsonToken.VALUE_STRING;
                    }
                    if (c_decodeEscaped < ' ') {
                        _throwUnquotedSpace(c_decodeEscaped, "string value");
                    }
                }
            }
            if (iJ >= cArrE.length) {
                cArrE = this._textBuffer.h();
                iJ = 0;
            }
            cArrE[iJ] = c_decodeEscaped;
            iJ++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[SYNTHETIC] */
    private String a(int i, int i2, int[] iArr) throws IOException {
        int i3;
        this._textBuffer.b(this.f53152b, i, this._inputPtr - i);
        char[] cArrF = this._textBuffer.f();
        int iJ = this._textBuffer.j();
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !c()) {
                break;
            }
            char c2 = this.f53152b[this._inputPtr];
            if (c2 < length) {
                if (iArr[c2] != 0) {
                    break;
                }
                this._inputPtr++;
                i2 = (i2 * 33) + c2;
                i3 = iJ + 1;
                cArrF[iJ] = c2;
                if (i3 >= cArrF.length) {
                    cArrF = this._textBuffer.h();
                    iJ = 0;
                } else {
                    iJ = i3;
                }
            } else {
                if (!Character.isJavaIdentifierPart(c2)) {
                    break;
                }
                this._inputPtr++;
                i2 = (i2 * 33) + c2;
                i3 = iJ + 1;
                cArrF[iJ] = c2;
                if (i3 >= cArrF.length) {
                    cArrF = this._textBuffer.h();
                    iJ = 0;
                } else {
                    iJ = i3;
                }
            }
        }
        this._textBuffer.e(iJ);
        yh yhVar = this._textBuffer;
        return this.h.c(yhVar.m(), yhVar.o(), yhVar.k(), i2);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public final void _finishString() throws IOException {
        int i = this._inputPtr;
        int i2 = this._inputEnd;
        if (i < i2) {
            int[] iArr = f53151a;
            int length = iArr.length;
            do {
                char c2 = this.f53152b[i];
                if (c2 < length && iArr[c2] != 0) {
                    if (c2 != '\"') {
                        break;
                    }
                    this._textBuffer.b(this.f53152b, this._inputPtr, i - this._inputPtr);
                    this._inputPtr = i + 1;
                    return;
                }
                i++;
            } while (i < i2);
        }
        this._textBuffer.a(this.f53152b, this._inputPtr, i - this._inputPtr);
        this._inputPtr = i;
        a();
    }

    protected void a() throws IOException {
        char[] cArrF = this._textBuffer.f();
        int iJ = this._textBuffer.j();
        int[] iArr = f53151a;
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !c()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this.f53152b;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c_decodeEscaped = cArr[i];
            if (c_decodeEscaped < length && iArr[c_decodeEscaped] != 0) {
                if (c_decodeEscaped == '\"') {
                    this._textBuffer.e(iJ);
                    return;
                } else if (c_decodeEscaped == '\\') {
                    c_decodeEscaped = _decodeEscaped();
                } else if (c_decodeEscaped < ' ') {
                    _throwUnquotedSpace(c_decodeEscaped, "string value");
                }
            }
            if (iJ >= cArrF.length) {
                cArrF = this._textBuffer.h();
                iJ = 0;
            }
            cArrF[iJ] = c_decodeEscaped;
            iJ++;
        }
    }

    protected final void i() throws IOException {
        this.m = false;
        int i = this._inputPtr;
        int i2 = this._inputEnd;
        char[] cArr = this.f53152b;
        while (true) {
            if (i >= i2) {
                this._inputPtr = i;
                if (!c()) {
                    _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                }
                i = this._inputPtr;
                i2 = this._inputEnd;
            }
            int i3 = i + 1;
            char c2 = cArr[i];
            if (c2 <= '\\') {
                if (c2 == '\\') {
                    this._inputPtr = i3;
                    _decodeEscaped();
                    i = this._inputPtr;
                    i2 = this._inputEnd;
                } else if (c2 <= '\"') {
                    if (c2 == '\"') {
                        this._inputPtr = i3;
                        return;
                    } else if (c2 < ' ') {
                        this._inputPtr = i3;
                        _throwUnquotedSpace(c2, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    protected final void f() throws IOException {
        if ((this._inputPtr < this._inputEnd || c()) && this.f53152b[this._inputPtr] == '\n') {
            this._inputPtr++;
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    private final int p() throws IOException {
        if (this._inputPtr + 4 >= this._inputEnd) {
            return e(false);
        }
        char c2 = this.f53152b[this._inputPtr];
        if (c2 == ':') {
            char[] cArr = this.f53152b;
            int i = this._inputPtr + 1;
            this._inputPtr = i;
            char c3 = cArr[i];
            if (c3 > ' ') {
                if (c3 == '/' || c3 == '#') {
                    return e(true);
                }
                this._inputPtr++;
                return c3;
            }
            if (c3 == ' ' || c3 == '\t') {
                char[] cArr2 = this.f53152b;
                int i2 = this._inputPtr + 1;
                this._inputPtr = i2;
                char c4 = cArr2[i2];
                if (c4 > ' ') {
                    if (c4 == '/' || c4 == '#') {
                        return e(true);
                    }
                    this._inputPtr++;
                    return c4;
                }
            }
            return e(true);
        }
        if (c2 == ' ' || c2 == '\t') {
            char[] cArr3 = this.f53152b;
            int i3 = this._inputPtr + 1;
            this._inputPtr = i3;
            c2 = cArr3[i3];
        }
        if (c2 == ':') {
            char[] cArr4 = this.f53152b;
            int i4 = this._inputPtr + 1;
            this._inputPtr = i4;
            char c5 = cArr4[i4];
            if (c5 > ' ') {
                if (c5 == '/' || c5 == '#') {
                    return e(true);
                }
                this._inputPtr++;
                return c5;
            }
            if (c5 == ' ' || c5 == '\t') {
                char[] cArr5 = this.f53152b;
                int i5 = this._inputPtr + 1;
                this._inputPtr = i5;
                char c6 = cArr5[i5];
                if (c6 > ' ') {
                    if (c6 == '/' || c6 == '#') {
                        return e(true);
                    }
                    this._inputPtr++;
                    return c6;
                }
            }
            return e(true);
        }
        return e(false);
    }

    private final int e(boolean z) throws IOException {
        while (true) {
            if (this._inputPtr < this._inputEnd || c()) {
                char[] cArr = this.f53152b;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                char c2 = cArr[i];
                if (c2 > ' ') {
                    if (c2 == '/') {
                        s();
                    } else if (c2 != '#' || !u()) {
                        if (z) {
                            return c2;
                        }
                        if (c2 != ':') {
                            _reportUnexpectedChar(c2, "was expecting a colon to separate field name and value");
                        }
                        z = true;
                    }
                } else if (c2 < ' ') {
                    if (c2 == '\n') {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                    } else if (c2 == '\r') {
                        f();
                    } else if (c2 != '\t') {
                        _throwInvalidSpace(c2);
                    }
                }
            } else {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", null);
                return -1;
            }
        }
    }

    private final int h(int i) throws IOException {
        char[] cArr = this.f53152b;
        int i2 = i + 1;
        char c2 = cArr[i];
        if (c2 == ':') {
            int i3 = i + 2;
            char c3 = cArr[i2];
            if (c3 > ' ') {
                if (c3 != '/' && c3 != '#') {
                    this._inputPtr = i3;
                    return c3;
                }
            } else if (c3 == ' ' || c3 == '\t') {
                int i4 = i + 3;
                char c4 = cArr[i3];
                if (c4 > ' ' && c4 != '/' && c4 != '#') {
                    this._inputPtr = i4;
                    return c4;
                }
                i3 = i4;
            }
            this._inputPtr = i3 - 1;
            return e(true);
        }
        if (c2 == ' ' || c2 == '\t') {
            c2 = cArr[i2];
            i2 = i + 2;
        }
        boolean z = c2 == ':';
        if (z) {
            int i5 = i2 + 1;
            char c5 = cArr[i2];
            if (c5 > ' ') {
                if (c5 != '/' && c5 != '#') {
                    this._inputPtr = i5;
                    return c5;
                }
            } else if (c5 == ' ' || c5 == '\t') {
                i2 += 2;
                char c6 = cArr[i5];
                if (c6 > ' ' && c6 != '/' && c6 != '#') {
                    this._inputPtr = i2;
                    return c6;
                }
            }
            i2 = i5;
        }
        this._inputPtr = i2 - 1;
        return e(z);
    }

    private final int g(int i) throws IOException {
        if (i != 44) {
            _reportUnexpectedChar(i, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        while (this._inputPtr < this._inputEnd) {
            char[] cArr = this.f53152b;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 != '/' && c2 != '#') {
                    return c2;
                }
                this._inputPtr--;
                return m();
            }
            if (c2 < ' ') {
                if (c2 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (c2 == '\r') {
                    f();
                } else if (c2 != '\t') {
                    _throwInvalidSpace(c2);
                }
            }
        }
        return m();
    }

    private final int m() throws IOException {
        while (true) {
            if (this._inputPtr < this._inputEnd || c()) {
                char[] cArr = this.f53152b;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                char c2 = cArr[i];
                if (c2 > ' ') {
                    if (c2 == '/') {
                        s();
                    } else if (c2 != '#' || !u()) {
                        return c2;
                    }
                } else if (c2 < ' ') {
                    if (c2 == '\n') {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                    } else if (c2 == '\r') {
                        f();
                    } else if (c2 != '\t') {
                        _throwInvalidSpace(c2);
                    }
                }
            } else {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
        }
    }

    private final int t() throws IOException {
        if (this._inputPtr >= this._inputEnd && !c()) {
            return _eofAsNextChar();
        }
        char[] cArr = this.f53152b;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        char c2 = cArr[i];
        if (c2 > ' ') {
            if (c2 != '/' && c2 != '#') {
                return c2;
            }
            this._inputPtr--;
            return v();
        }
        if (c2 != ' ') {
            if (c2 == '\n') {
                this._currInputRow++;
                this._currInputRowStart = this._inputPtr;
            } else if (c2 == '\r') {
                f();
            } else if (c2 != '\t') {
                _throwInvalidSpace(c2);
            }
        }
        while (this._inputPtr < this._inputEnd) {
            char[] cArr2 = this.f53152b;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c3 = cArr2[i2];
            if (c3 > ' ') {
                if (c3 != '/' && c3 != '#') {
                    return c3;
                }
                this._inputPtr--;
                return v();
            }
            if (c3 != ' ') {
                if (c3 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (c3 == '\r') {
                    f();
                } else if (c3 != '\t') {
                    _throwInvalidSpace(c3);
                }
            }
        }
        return v();
    }

    private int v() throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !c()) {
                return _eofAsNextChar();
            }
            char[] cArr = this.f53152b;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c2 = cArr[i];
            if (c2 > ' ') {
                if (c2 == '/') {
                    s();
                } else if (c2 != '#' || !u()) {
                    return c2;
                }
            } else if (c2 != ' ') {
                if (c2 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (c2 == '\r') {
                    f();
                } else if (c2 != '\t') {
                    _throwInvalidSpace(c2);
                }
            }
        }
    }

    private void s() throws IOException {
        if ((this._features & n) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !c()) {
            _reportInvalidEOF(" in a comment", null);
        }
        char[] cArr = this.f53152b;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        char c2 = cArr[i];
        if (c2 == '/') {
            q();
        } else if (c2 == '*') {
            r();
        } else {
            _reportUnexpectedChar(c2, "was expecting either '*' or '/' for a comment");
        }
    }

    private void r() throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !c()) {
                break;
            }
            char[] cArr = this.f53152b;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c2 = cArr[i];
            if (c2 <= '*') {
                if (c2 == '*') {
                    if (this._inputPtr >= this._inputEnd && !c()) {
                        break;
                    } else if (this.f53152b[this._inputPtr] == '/') {
                        this._inputPtr++;
                        return;
                    }
                } else if (c2 < ' ') {
                    if (c2 == '\n') {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                    } else if (c2 == '\r') {
                        f();
                    } else if (c2 != '\t') {
                        _throwInvalidSpace(c2);
                    }
                }
            }
        }
        _reportInvalidEOF(" in a comment", null);
    }

    private boolean u() throws IOException {
        if ((this._features & r) == 0) {
            return false;
        }
        q();
        return true;
    }

    private void q() throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !c()) {
                return;
            }
            char[] cArr = this.f53152b;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c2 = cArr[i];
            if (c2 < ' ') {
                if (c2 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                    return;
                } else if (c2 == '\r') {
                    f();
                    return;
                } else if (c2 != '\t') {
                    _throwInvalidSpace(c2);
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        if (this._inputPtr >= this._inputEnd && !c()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        char[] cArr = this.f53152b;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        char c2 = cArr[i];
        if (c2 == '\"' || c2 == '/' || c2 == '\\') {
            return c2;
        }
        if (c2 == 'b') {
            return '\b';
        }
        if (c2 == 'f') {
            return '\f';
        }
        if (c2 == 'n') {
            return '\n';
        }
        if (c2 == 'r') {
            return '\r';
        }
        if (c2 == 't') {
            return '\t';
        }
        if (c2 != 'u') {
            return _handleUnrecognizedCharacterEscape(c2);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this._inputPtr >= this._inputEnd && !c()) {
                _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            char[] cArr2 = this.f53152b;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            char c3 = cArr2[i4];
            int iC = wz.c(c3);
            if (iC < 0) {
                _reportUnexpectedChar(c3, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | iC;
        }
        return (char) i2;
    }

    private final void o() throws IOException {
        char c2;
        int i = this._inputPtr;
        int i2 = i + 3;
        if (i2 < this._inputEnd) {
            char[] cArr = this.f53152b;
            if (cArr[i] == 'r' && cArr[i + 1] == 'u' && cArr[i + 2] == 'e' && ((c2 = cArr[i2]) < '0' || c2 == ']' || c2 == '}')) {
                this._inputPtr = i2;
                return;
            }
        }
        e("true", 1);
    }

    private final void n() throws IOException {
        char c2;
        int i = this._inputPtr;
        int i2 = i + 4;
        if (i2 < this._inputEnd) {
            char[] cArr = this.f53152b;
            if (cArr[i] == 'a' && cArr[i + 1] == 'l' && cArr[i + 2] == 's' && cArr[i + 3] == 'e' && ((c2 = cArr[i2]) < '0' || c2 == ']' || c2 == '}')) {
                this._inputPtr = i2;
                return;
            }
        }
        e("false", 1);
    }

    private final void l() throws IOException {
        char c2;
        int i = this._inputPtr;
        int i2 = i + 3;
        if (i2 < this._inputEnd) {
            char[] cArr = this.f53152b;
            if (cArr[i] == 'u' && cArr[i + 1] == 'l' && cArr[i + 2] == 'l' && ((c2 = cArr[i2]) < '0' || c2 == ']' || c2 == '}')) {
                this._inputPtr = i2;
                return;
            }
        }
        e(Constants.NULL, 1);
    }

    protected final void e(String str, int i) throws IOException {
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            a(str, i);
            return;
        }
        do {
            if (this.f53152b[this._inputPtr] != str.charAt(i)) {
                a(str.substring(0, i));
            }
            this._inputPtr++;
            i++;
        } while (i < length);
        char c2 = this.f53152b[this._inputPtr];
        if (c2 < '0' || c2 == ']' || c2 == '}') {
            return;
        }
        e(str, i, c2);
    }

    private final void a(String str, int i) throws IOException {
        char c2;
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !c()) || this.f53152b[this._inputPtr] != str.charAt(i)) {
                a(str.substring(0, i));
            }
            this._inputPtr++;
            i++;
        } while (i < length);
        if ((this._inputPtr < this._inputEnd || c()) && (c2 = this.f53152b[this._inputPtr]) >= '0' && c2 != ']' && c2 != '}') {
            e(str, i, c2);
        }
    }

    private final void e(String str, int i, int i2) throws IOException {
        if (Character.isJavaIdentifierPart((char) i2)) {
            a(str.substring(0, i));
        }
    }

    protected byte[] b(Base64Variant base64Variant) throws IOException {
        xx xxVar_getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                b();
            }
            char[] cArr = this.f53152b;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c2 = cArr[i];
            if (c2 > ' ') {
                int iC = base64Variant.c(c2);
                if (iC < 0) {
                    if (c2 == '\"') {
                        return xxVar_getByteArrayBuilder.i();
                    }
                    iC = _decodeBase64Escape(base64Variant, c2, 0);
                    if (iC < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    b();
                }
                char[] cArr2 = this.f53152b;
                int i2 = this._inputPtr;
                this._inputPtr = i2 + 1;
                char c3 = cArr2[i2];
                int iC2 = base64Variant.c(c3);
                if (iC2 < 0) {
                    iC2 = _decodeBase64Escape(base64Variant, c3, 1);
                }
                int i3 = (iC << 6) | iC2;
                if (this._inputPtr >= this._inputEnd) {
                    b();
                }
                char[] cArr3 = this.f53152b;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                char c4 = cArr3[i4];
                int iC3 = base64Variant.c(c4);
                if (iC3 < 0) {
                    if (iC3 != -2) {
                        if (c4 == '\"') {
                            xxVar_getByteArrayBuilder.c(i3 >> 4);
                            if (base64Variant.h()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return xxVar_getByteArrayBuilder.i();
                        }
                        iC3 = _decodeBase64Escape(base64Variant, c4, 2);
                    }
                    if (iC3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            b();
                        }
                        char[] cArr4 = this.f53152b;
                        int i5 = this._inputPtr;
                        this._inputPtr = i5 + 1;
                        char c5 = cArr4[i5];
                        if (!base64Variant.b(c5) && _decodeBase64Escape(base64Variant, c5, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, c5, 3, "expected padding character '" + base64Variant.j() + "'");
                        }
                        xxVar_getByteArrayBuilder.c(i3 >> 4);
                    }
                }
                int i6 = (i3 << 6) | iC3;
                if (this._inputPtr >= this._inputEnd) {
                    b();
                }
                char[] cArr5 = this.f53152b;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                char c6 = cArr5[i7];
                int iC4 = base64Variant.c(c6);
                if (iC4 < 0) {
                    if (iC4 != -2) {
                        if (c6 == '\"') {
                            xxVar_getByteArrayBuilder.e(i6 >> 2);
                            if (base64Variant.h()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return xxVar_getByteArrayBuilder.i();
                        }
                        iC4 = _decodeBase64Escape(base64Variant, c6, 3);
                    }
                    if (iC4 == -2) {
                        xxVar_getByteArrayBuilder.e(i6 >> 2);
                    }
                }
                xxVar_getByteArrayBuilder.d((i6 << 6) | iC4);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public wq getTokenLocation() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return new wq(_getSourceReference(), -1L, this._currInputProcessed + (this.j - 1), this.g, this.d);
        }
        return new wq(_getSourceReference(), -1L, this._tokenInputTotal - 1, this._tokenInputRow, this._tokenInputCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public wq getCurrentLocation() {
        int i = this._inputPtr;
        int i2 = this._currInputRowStart;
        return new wq(_getSourceReference(), -1L, ((long) this._inputPtr) + this._currInputProcessed, this._currInputRow, (i - i2) + 1);
    }

    private final void y() {
        int i = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + ((long) i);
        this._tokenInputRow = this._currInputRow;
        this._tokenInputCol = i - this._currInputRowStart;
    }

    private final void x() {
        int i = this._inputPtr;
        this.j = i;
        this.g = this._currInputRow;
        this.d = i - this._currInputRowStart;
    }

    protected void a(String str) throws IOException {
        c(str, _validJsonTokenList());
    }

    protected void c(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        do {
            if (this._inputPtr < this._inputEnd || c()) {
                char c2 = this.f53152b[this._inputPtr];
                if (Character.isJavaIdentifierPart(c2)) {
                    this._inputPtr++;
                    sb.append(c2);
                }
            }
            _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
        } while (sb.length() < 256);
        sb.append("...");
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    private void e(int i) throws wn {
        if (i == 93) {
            y();
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(i, '}');
            }
            this._parsingContext = this._parsingContext.b();
            this._currToken = JsonToken.END_ARRAY;
        }
        if (i == 125) {
            y();
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(i, ']');
            }
            this._parsingContext = this._parsingContext.b();
            this._currToken = JsonToken.END_OBJECT;
        }
    }
}
