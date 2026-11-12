package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.huawei.operation.utils.Constants;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public class xp extends ParserBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f53260a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected DataInput f53261c;
    protected ObjectCodec d;
    protected int e;
    protected boolean f;
    protected final xt g;
    private int p;
    private static final int m = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int o = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int l = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    private static final int h = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int i = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int k = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int j = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int n = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    private static final int[] t = wz.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final int[] f53259b = wz.a();

    private static final int d(int i2, int i3) {
        return i3 == 4 ? i2 : i2 | ((-1) << (i3 << 3));
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        return 0;
    }

    public xp(xa xaVar, int i2, DataInput dataInput, ObjectCodec objectCodec, xt xtVar, int i3) {
        super(xaVar, i2);
        this.f53260a = new int[16];
        this.d = objectCodec;
        this.g = xtVar;
        this.f53261c = dataInput;
        this.e = i3;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCodec(ObjectCodec objectCodec) {
        this.d = objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public yb<StreamReadCapability> getReadCapabilities() {
        return JSON_READ_CAPABILITIES;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return this.f53261c;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() throws IOException {
        super._releaseBuffers();
        this.g.d();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getText() throws IOException {
        if (this._currToken == JsonToken.VALUE_STRING) {
            if (this.f) {
                this.f = false;
                return i();
            }
            return this._textBuffer.d();
        }
        return b(this._currToken);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getText(Writer writer) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.f) {
                this.f = false;
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
    public String getValueAsString() throws IOException {
        if (this._currToken == JsonToken.VALUE_STRING) {
            if (this.f) {
                this.f = false;
                return i();
            }
            return this._textBuffer.d();
        }
        if (this._currToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(null);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) throws IOException {
        if (this._currToken == JsonToken.VALUE_STRING) {
            if (this.f) {
                this.f = false;
                return i();
            }
            return this._textBuffer.d();
        }
        if (this._currToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(str);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            if ((this._numTypesValid & 1) == 0) {
                if (this._numTypesValid == 0) {
                    return _parseIntValue();
                }
                if ((this._numTypesValid & 1) == 0) {
                    convertNumberToInt();
                }
            }
            return this._numberInt;
        }
        return super.getValueAsInt(0);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i2) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            if ((this._numTypesValid & 1) == 0) {
                if (this._numTypesValid == 0) {
                    return _parseIntValue();
                }
                if ((this._numTypesValid & 1) == 0) {
                    convertNumberToInt();
                }
            }
            return this._numberInt;
        }
        return super.getValueAsInt(i2);
    }

    protected final String b(JsonToken jsonToken) {
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
    public char[] getTextCharacters() throws IOException {
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
        } else if (this.f) {
            this.f = false;
            _finishString();
        }
        return this._textBuffer.m();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getTextLength() throws IOException {
        if (this._currToken == JsonToken.VALUE_STRING) {
            if (this.f) {
                this.f = false;
                _finishString();
            }
            return this._textBuffer.k();
        }
        if (this._currToken == JsonToken.FIELD_NAME) {
            return this._parsingContext.getCurrentName().length();
        }
        if (this._currToken == null) {
            return 0;
        }
        if (this._currToken.isNumeric()) {
            return this._textBuffer.k();
        }
        return this._currToken.asCharArray().length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getTextOffset() throws IOException {
        if (this._currToken != null) {
            int iId = this._currToken.id();
            if (iId != 6) {
                if (iId != 7) {
                }
            } else if (this.f) {
                this.f = false;
                _finishString();
            }
            return this._textBuffer.o();
        }
        return 0;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        if (this._currToken != JsonToken.VALUE_STRING && (this._currToken != JsonToken.VALUE_EMBEDDED_OBJECT || this._binaryValue == null)) {
            _reportError("Current token (" + this._currToken + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f) {
            try {
                this._binaryValue = e(base64Variant);
                this.f = false;
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
        if (!this.f || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] bArrC = this._ioContext.c();
        try {
            return b(base64Variant, outputStream, bArrC);
        } finally {
            this._ioContext.a(bArrC);
        }
    }

    protected int b(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int unsignedByte = this.f53261c.readUnsignedByte();
            if (unsignedByte > 32) {
                int iD = base64Variant.d(unsignedByte);
                if (iD < 0) {
                    if (unsignedByte == 34) {
                        break;
                    }
                    iD = _decodeBase64Escape(base64Variant, unsignedByte, 0);
                    if (iD < 0) {
                        continue;
                    }
                }
                if (i2 > length - 3) {
                    i3 += i2;
                    outputStream.write(bArr, 0, i2);
                    i2 = 0;
                }
                int unsignedByte2 = this.f53261c.readUnsignedByte();
                int iD2 = base64Variant.d(unsignedByte2);
                if (iD2 < 0) {
                    iD2 = _decodeBase64Escape(base64Variant, unsignedByte2, 1);
                }
                int i4 = (iD << 6) | iD2;
                int unsignedByte3 = this.f53261c.readUnsignedByte();
                int iD3 = base64Variant.d(unsignedByte3);
                if (iD3 < 0) {
                    if (iD3 != -2) {
                        if (unsignedByte3 == 34) {
                            bArr[i2] = (byte) (i4 >> 4);
                            if (base64Variant.h()) {
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i2++;
                            break;
                        }
                        iD3 = _decodeBase64Escape(base64Variant, unsignedByte3, 2);
                    }
                    if (iD3 == -2) {
                        int unsignedByte4 = this.f53261c.readUnsignedByte();
                        if (!base64Variant.b(unsignedByte4) && (unsignedByte4 != 92 || _decodeBase64Escape(base64Variant, unsignedByte4, 3) != -2)) {
                            throw reportInvalidBase64Char(base64Variant, unsignedByte4, 3, "expected padding character '" + base64Variant.j() + "'");
                        }
                        bArr[i2] = (byte) (i4 >> 4);
                        i2++;
                    }
                }
                int i5 = (i4 << 6) | iD3;
                int unsignedByte5 = this.f53261c.readUnsignedByte();
                int iD4 = base64Variant.d(unsignedByte5);
                if (iD4 < 0) {
                    if (iD4 != -2) {
                        if (unsignedByte5 == 34) {
                            bArr[i2] = (byte) (i5 >> 10);
                            int i6 = i2 + 2;
                            bArr[i2 + 1] = (byte) (i5 >> 2);
                            if (base64Variant.h()) {
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i2 = i6;
                            break;
                        }
                        iD4 = _decodeBase64Escape(base64Variant, unsignedByte5, 3);
                    }
                    if (iD4 == -2) {
                        bArr[i2] = (byte) (i5 >> 10);
                        bArr[i2 + 1] = (byte) (i5 >> 2);
                        i2 += 2;
                    }
                }
                int i7 = (i5 << 6) | iD4;
                bArr[i2] = (byte) (i7 >> 16);
                bArr[i2 + 1] = (byte) (i7 >> 8);
                bArr[i2 + 2] = (byte) i7;
                i2 += 3;
            }
        }
        this.f = false;
        if (i2 <= 0) {
            return i3;
        }
        int i8 = i3 + i2;
        outputStream.write(bArr, 0, i2);
        return i8;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        JsonToken jsonTokenE;
        if (this._closed) {
            return null;
        }
        if (this._currToken == JsonToken.FIELD_NAME) {
            return g();
        }
        this._numTypesValid = 0;
        if (this.f) {
            b();
        }
        int iS = s();
        if (iS < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        this._tokenInputRow = this._currInputRow;
        if (iS == 93 || iS == 125) {
            f(iS);
            return this._currToken;
        }
        if (this._parsingContext.e()) {
            if (iS != 44) {
                _reportUnexpectedChar(iS, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            iS = q();
            if ((this._features & m) != 0 && (iS == 93 || iS == 125)) {
                f(iS);
                return this._currToken;
            }
        }
        if (!this._parsingContext.inObject()) {
            return k(iS);
        }
        this._parsingContext.c(b(iS));
        this._currToken = JsonToken.FIELD_NAME;
        int iF = f();
        if (iF == 34) {
            this.f = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return this._currToken;
        }
        if (iF == 45) {
            jsonTokenE = e();
        } else if (iF == 46) {
            jsonTokenE = d();
        } else if (iF == 91) {
            jsonTokenE = JsonToken.START_ARRAY;
        } else if (iF == 102) {
            b("false", 1);
            jsonTokenE = JsonToken.VALUE_FALSE;
        } else if (iF == 110) {
            b(Constants.NULL, 1);
            jsonTokenE = JsonToken.VALUE_NULL;
        } else if (iF == 116) {
            b("true", 1);
            jsonTokenE = JsonToken.VALUE_TRUE;
        } else if (iF != 123) {
            switch (iF) {
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
                    jsonTokenE = c(iF);
                    break;
                default:
                    jsonTokenE = e(iF);
                    break;
            }
        } else {
            jsonTokenE = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonTokenE;
        return this._currToken;
    }

    private final JsonToken k(int i2) throws IOException {
        if (i2 == 34) {
            this.f = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        }
        if (i2 == 45) {
            JsonToken jsonTokenE = e();
            this._currToken = jsonTokenE;
            return jsonTokenE;
        }
        if (i2 == 46) {
            JsonToken jsonTokenD = d();
            this._currToken = jsonTokenD;
            return jsonTokenD;
        }
        if (i2 == 91) {
            this._parsingContext = this._parsingContext.c(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        if (i2 == 102) {
            b("false", 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (i2 == 110) {
            b(Constants.NULL, 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (i2 == 116) {
            b("true", 1);
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this._currToken = jsonToken5;
            return jsonToken5;
        }
        if (i2 == 123) {
            this._parsingContext = this._parsingContext.b(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this._currToken = jsonToken6;
            return jsonToken6;
        }
        switch (i2) {
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
                JsonToken jsonTokenC = c(i2);
                this._currToken = jsonTokenC;
                return jsonTokenC;
            default:
                JsonToken jsonTokenE2 = e(i2);
                this._currToken = jsonTokenE2;
                return jsonTokenE2;
        }
    }

    private final JsonToken g() {
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
        if (this.f) {
            this.f = false;
            _finishString();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws IOException {
        JsonToken jsonTokenE;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            g();
            return null;
        }
        if (this.f) {
            b();
        }
        int iQ = q();
        this._binaryValue = null;
        this._tokenInputRow = this._currInputRow;
        if (iQ == 93 || iQ == 125) {
            f(iQ);
            return null;
        }
        if (this._parsingContext.e()) {
            if (iQ != 44) {
                _reportUnexpectedChar(iQ, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            iQ = q();
            if ((this._features & m) != 0 && (iQ == 93 || iQ == 125)) {
                f(iQ);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            k(iQ);
            return null;
        }
        String strB = b(iQ);
        this._parsingContext.c(strB);
        this._currToken = JsonToken.FIELD_NAME;
        int iF = f();
        if (iF == 34) {
            this.f = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return strB;
        }
        if (iF == 45) {
            jsonTokenE = e();
        } else {
            if (iF == 46) {
                d();
            } else if (iF == 91) {
                jsonTokenE = JsonToken.START_ARRAY;
            } else if (iF == 102) {
                b("false", 1);
                jsonTokenE = JsonToken.VALUE_FALSE;
            } else if (iF == 110) {
                b(Constants.NULL, 1);
                jsonTokenE = JsonToken.VALUE_NULL;
            } else if (iF == 116) {
                b("true", 1);
                jsonTokenE = JsonToken.VALUE_TRUE;
            } else if (iF == 123) {
                jsonTokenE = JsonToken.START_OBJECT;
            } else {
                switch (iF) {
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
                        break;
                    default:
                        jsonTokenE = e(iF);
                        break;
                }
            }
            jsonTokenE = c(iF);
        }
        this._nextToken = jsonTokenE;
        return strB;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextTextValue() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this.f) {
                    this.f = false;
                    return i();
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
    public int nextIntValue(int i2) throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getIntValue() : i2;
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
            return i2;
        }
        if (jsonToken != JsonToken.START_OBJECT) {
            return i2;
        }
        this._parsingContext = this._parsingContext.b(this._tokenInputRow, this._tokenInputCol);
        return i2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long nextLongValue(long j2) throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getLongValue() : j2;
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
            return j2;
        }
        if (jsonToken != JsonToken.START_OBJECT) {
            return j2;
        }
        this._parsingContext = this._parsingContext.b(this._tokenInputRow, this._tokenInputCol);
        return j2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Boolean nextBooleanValue() throws IOException {
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
        if (jsonTokenNextToken == JsonToken.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (jsonTokenNextToken == JsonToken.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        return null;
    }

    protected final JsonToken d() throws IOException {
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return e(46);
        }
        return a(this._textBuffer.e(), 0, 46, false, 0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:36:0x003a A[SYNTHETIC] */
    protected JsonToken c(int i2) throws IOException {
        int unsignedByte;
        int i3;
        int unsignedByte2;
        char[] cArrH;
        int i4;
        int i5;
        char[] cArrE = this._textBuffer.e();
        if (i2 == 48) {
            unsignedByte = j();
            if (unsignedByte > 57 || unsignedByte < 48) {
                cArrE[0] = '0';
            } else {
                i3 = 0;
            }
            unsignedByte2 = unsignedByte;
            cArrH = cArrE;
            i4 = i3;
            i5 = i4;
            while (unsignedByte2 <= 57 && unsignedByte2 >= 48) {
                i5++;
                if (i4 >= cArrH.length) {
                    cArrH = this._textBuffer.h();
                    i4 = 0;
                }
                cArrH[i4] = (char) unsignedByte2;
                unsignedByte2 = this.f53261c.readUnsignedByte();
                i4++;
            }
            if (unsignedByte2 != 46 || unsignedByte2 == 101 || unsignedByte2 == 69) {
                return a(cArrH, i4, unsignedByte2, false, i5);
            }
            this._textBuffer.e(i4);
            if (this._parsingContext.inRoot()) {
                t();
            } else {
                this.e = unsignedByte2;
            }
            return resetInt(false, i5);
        }
        cArrE[0] = (char) i2;
        unsignedByte = this.f53261c.readUnsignedByte();
        i3 = 1;
        unsignedByte2 = unsignedByte;
        cArrH = cArrE;
        i4 = i3;
        i5 = i4;
        while (unsignedByte2 <= 57) {
            i5++;
            if (i4 >= cArrH.length) {
                cArrH = this._textBuffer.h();
                i4 = 0;
            }
            cArrH[i4] = (char) unsignedByte2;
            unsignedByte2 = this.f53261c.readUnsignedByte();
            i4++;
        }
        if (unsignedByte2 != 46) {
        }
        return a(cArrH, i4, unsignedByte2, false, i5);
    }

    protected JsonToken e() throws IOException {
        int unsignedByte;
        char[] cArrE = this._textBuffer.e();
        cArrE[0] = '-';
        int unsignedByte2 = this.f53261c.readUnsignedByte();
        cArrE[1] = (char) unsignedByte2;
        if (unsignedByte2 <= 48) {
            if (unsignedByte2 == 48) {
                unsignedByte = j();
            } else {
                return d(unsignedByte2, true);
            }
        } else {
            if (unsignedByte2 > 57) {
                return d(unsignedByte2, true);
            }
            unsignedByte = this.f53261c.readUnsignedByte();
        }
        int i2 = 2;
        int i3 = 1;
        while (unsignedByte <= 57 && unsignedByte >= 48) {
            i3++;
            cArrE[i2] = (char) unsignedByte;
            unsignedByte = this.f53261c.readUnsignedByte();
            i2++;
        }
        if (unsignedByte == 46 || unsignedByte == 101 || unsignedByte == 69) {
            return a(cArrE, i2, unsignedByte, true, i3);
        }
        this._textBuffer.e(i2);
        this.e = unsignedByte;
        if (this._parsingContext.inRoot()) {
            t();
        }
        return resetInt(true, i3);
    }

    private final int j() throws IOException {
        int unsignedByte = this.f53261c.readUnsignedByte();
        if (unsignedByte >= 48 && unsignedByte <= 57) {
            if ((this._features & o) == 0) {
                reportInvalidNumber("Leading zeroes not allowed");
            }
            while (unsignedByte == 48) {
                unsignedByte = this.f53261c.readUnsignedByte();
            }
        }
        return unsignedByte;
    }

    private final JsonToken a(char[] cArr, int i2, int i3, boolean z, int i4) throws IOException {
        int i5;
        int unsignedByte;
        int i6 = 0;
        if (i3 == 46) {
            cArr[i2] = (char) i3;
            i2++;
            int i7 = 0;
            while (true) {
                unsignedByte = this.f53261c.readUnsignedByte();
                if (unsignedByte < 48 || unsignedByte > 57) {
                    break;
                }
                i7++;
                if (i2 >= cArr.length) {
                    cArr = this._textBuffer.h();
                    i2 = 0;
                }
                cArr[i2] = (char) unsignedByte;
                i2++;
            }
            if (i7 == 0) {
                reportUnexpectedNumberChar(unsignedByte, "Decimal point not followed by a digit");
            }
            i5 = i7;
            i3 = unsignedByte;
        } else {
            i5 = 0;
        }
        if (i3 == 101 || i3 == 69) {
            if (i2 >= cArr.length) {
                cArr = this._textBuffer.h();
                i2 = 0;
            }
            int i8 = i2 + 1;
            cArr[i2] = (char) i3;
            int unsignedByte2 = this.f53261c.readUnsignedByte();
            if (unsignedByte2 == 45 || unsignedByte2 == 43) {
                if (i8 >= cArr.length) {
                    cArr = this._textBuffer.h();
                    i8 = 0;
                }
                cArr[i8] = (char) unsignedByte2;
                unsignedByte2 = this.f53261c.readUnsignedByte();
                i8++;
            }
            i3 = unsignedByte2;
            i2 = i8;
            int i9 = 0;
            while (i3 <= 57 && i3 >= 48) {
                i9++;
                if (i2 >= cArr.length) {
                    cArr = this._textBuffer.h();
                    i2 = 0;
                }
                cArr[i2] = (char) i3;
                i3 = this.f53261c.readUnsignedByte();
                i2++;
            }
            if (i9 == 0) {
                reportUnexpectedNumberChar(i3, "Exponent indicator not followed by a digit");
            }
            i6 = i9;
        }
        this.e = i3;
        if (this._parsingContext.inRoot()) {
            t();
        }
        this._textBuffer.e(i2);
        return resetFloat(z, i4, i5, i6);
    }

    private final void t() throws IOException {
        int i2 = this.e;
        if (i2 <= 32) {
            this.e = -1;
            if (i2 == 13 || i2 == 10) {
                this._currInputRow++;
                return;
            }
            return;
        }
        _reportMissingRootWS(i2);
    }

    protected final String b(int i2) throws IOException {
        if (i2 != 34) {
            return a(i2);
        }
        int[] iArr = f53259b;
        int unsignedByte = this.f53261c.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            if (unsignedByte == 34) {
                return "";
            }
            return a(0, unsignedByte, 0);
        }
        int unsignedByte2 = this.f53261c.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            if (unsignedByte2 == 34) {
                return c(unsignedByte, 1);
            }
            return a(unsignedByte, unsignedByte2, 1);
        }
        int i3 = (unsignedByte << 8) | unsignedByte2;
        int unsignedByte3 = this.f53261c.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            if (unsignedByte3 == 34) {
                return c(i3, 2);
            }
            return a(i3, unsignedByte3, 2);
        }
        int i4 = (i3 << 8) | unsignedByte3;
        int unsignedByte4 = this.f53261c.readUnsignedByte();
        if (iArr[unsignedByte4] != 0) {
            if (unsignedByte4 == 34) {
                return c(i4, 3);
            }
            return a(i4, unsignedByte4, 3);
        }
        int i5 = (i4 << 8) | unsignedByte4;
        int unsignedByte5 = this.f53261c.readUnsignedByte();
        if (iArr[unsignedByte5] == 0) {
            this.p = i5;
            return o(unsignedByte5);
        }
        if (unsignedByte5 == 34) {
            return c(i5, 4);
        }
        return a(i5, unsignedByte5, 4);
    }

    private final String o(int i2) throws IOException {
        int[] iArr = f53259b;
        int unsignedByte = this.f53261c.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            if (unsignedByte == 34) {
                return d(this.p, i2, 1);
            }
            return c(this.p, i2, unsignedByte, 1);
        }
        int i3 = (i2 << 8) | unsignedByte;
        int unsignedByte2 = this.f53261c.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            if (unsignedByte2 == 34) {
                return d(this.p, i3, 2);
            }
            return c(this.p, i3, unsignedByte2, 2);
        }
        int i4 = (i3 << 8) | unsignedByte2;
        int unsignedByte3 = this.f53261c.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            if (unsignedByte3 == 34) {
                return d(this.p, i4, 3);
            }
            return c(this.p, i4, unsignedByte3, 3);
        }
        int i5 = (i4 << 8) | unsignedByte3;
        int unsignedByte4 = this.f53261c.readUnsignedByte();
        if (iArr[unsignedByte4] == 0) {
            return e(unsignedByte4, i5);
        }
        if (unsignedByte4 == 34) {
            return d(this.p, i5, 4);
        }
        return c(this.p, i5, unsignedByte4, 4);
    }

    private final String e(int i2, int i3) throws IOException {
        int[] iArr = f53259b;
        int unsignedByte = this.f53261c.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            if (unsignedByte == 34) {
                return a(this.p, i3, i2, 1);
            }
            return d(this.p, i3, i2, unsignedByte, 1);
        }
        int i4 = (i2 << 8) | unsignedByte;
        int unsignedByte2 = this.f53261c.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            if (unsignedByte2 == 34) {
                return a(this.p, i3, i4, 2);
            }
            return d(this.p, i3, i4, unsignedByte2, 2);
        }
        int i5 = (i4 << 8) | unsignedByte2;
        int unsignedByte3 = this.f53261c.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            if (unsignedByte3 == 34) {
                return a(this.p, i3, i5, 3);
            }
            return d(this.p, i3, i5, unsignedByte3, 3);
        }
        int i6 = (i5 << 8) | unsignedByte3;
        int unsignedByte4 = this.f53261c.readUnsignedByte();
        if (iArr[unsignedByte4] == 0) {
            return e(unsignedByte4, i3, i6);
        }
        if (unsignedByte4 == 34) {
            return a(this.p, i3, i6, 4);
        }
        return d(this.p, i3, i6, unsignedByte4, 4);
    }

    private final String e(int i2, int i3, int i4) throws IOException {
        int[] iArr = this.f53260a;
        iArr[0] = this.p;
        iArr[1] = i3;
        iArr[2] = i4;
        int[] iArr2 = f53259b;
        int i5 = i2;
        int i6 = 3;
        while (true) {
            int unsignedByte = this.f53261c.readUnsignedByte();
            if (iArr2[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    return d(this.f53260a, i6, i5, 1);
                }
                return b(this.f53260a, i6, i5, unsignedByte, 1);
            }
            int i7 = (i5 << 8) | unsignedByte;
            int unsignedByte2 = this.f53261c.readUnsignedByte();
            if (iArr2[unsignedByte2] != 0) {
                if (unsignedByte2 == 34) {
                    return d(this.f53260a, i6, i7, 2);
                }
                return b(this.f53260a, i6, i7, unsignedByte2, 2);
            }
            int i8 = (i7 << 8) | unsignedByte2;
            int unsignedByte3 = this.f53261c.readUnsignedByte();
            if (iArr2[unsignedByte3] != 0) {
                if (unsignedByte3 == 34) {
                    return d(this.f53260a, i6, i8, 3);
                }
                return b(this.f53260a, i6, i8, unsignedByte3, 3);
            }
            int i9 = (i8 << 8) | unsignedByte3;
            int unsignedByte4 = this.f53261c.readUnsignedByte();
            if (iArr2[unsignedByte4] != 0) {
                if (unsignedByte4 == 34) {
                    return d(this.f53260a, i6, i9, 4);
                }
                return b(this.f53260a, i6, i9, unsignedByte4, 4);
            }
            int[] iArr3 = this.f53260a;
            if (i6 >= iArr3.length) {
                this.f53260a = e(iArr3, i6);
            }
            this.f53260a[i6] = i9;
            i6++;
            i5 = unsignedByte4;
        }
    }

    private final String a(int i2, int i3, int i4) throws IOException {
        return b(this.f53260a, 0, i2, i3, i4);
    }

    private final String c(int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = this.f53260a;
        iArr[0] = i2;
        return b(iArr, 1, i3, i4, i5);
    }

    private final String d(int i2, int i3, int i4, int i5, int i6) throws IOException {
        int[] iArr = this.f53260a;
        iArr[0] = i2;
        iArr[1] = i3;
        return b(iArr, 2, i4, i5, i6);
    }

    protected final String b(int[] iArr, int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr2 = f53259b;
        while (true) {
            if (iArr2[i4] != 0) {
                if (i4 == 34) {
                    break;
                }
                if (i4 != 92) {
                    _throwUnquotedSpace(i4, "name");
                } else {
                    i4 = _decodeEscaped();
                }
                if (i4 > 127) {
                    int i6 = 0;
                    if (i5 >= 4) {
                        if (i2 >= iArr.length) {
                            iArr = e(iArr, iArr.length);
                            this.f53260a = iArr;
                        }
                        iArr[i2] = i3;
                        i2++;
                        i3 = 0;
                        i5 = 0;
                    }
                    int i7 = i3 << 8;
                    if (i4 < 2048) {
                        i3 = i7 | (i4 >> 6) | PsExtractor.AUDIO_STREAM;
                        i5++;
                    } else {
                        int i8 = i7 | (i4 >> 12) | 224;
                        int i9 = i5 + 1;
                        if (i9 >= 4) {
                            if (i2 >= iArr.length) {
                                iArr = e(iArr, iArr.length);
                                this.f53260a = iArr;
                            }
                            iArr[i2] = i8;
                            i2++;
                            i9 = 0;
                        } else {
                            i6 = i8;
                        }
                        i3 = (i6 << 8) | ((i4 >> 6) & 63) | 128;
                        i5 = i9 + 1;
                    }
                    i4 = (i4 & 63) | 128;
                }
            }
            if (i5 < 4) {
                i5++;
                i3 = (i3 << 8) | i4;
            } else {
                if (i2 >= iArr.length) {
                    iArr = e(iArr, iArr.length);
                    this.f53260a = iArr;
                }
                iArr[i2] = i3;
                i2++;
                i3 = i4;
                i5 = 1;
            }
            i4 = this.f53261c.readUnsignedByte();
        }
        if (i5 > 0) {
            if (i2 >= iArr.length) {
                iArr = e(iArr, iArr.length);
                this.f53260a = iArr;
            }
            iArr[i2] = d(i3, i5);
            i2++;
        }
        String strB = this.g.b(iArr, i2);
        return strB == null ? e(iArr, i2, i5) : strB;
    }

    protected String a(int i2) throws IOException {
        if (i2 == 39 && (this._features & i) != 0) {
            return a();
        }
        if ((this._features & k) == 0) {
            _reportUnexpectedChar((char) d(i2), "was expecting double-quote to start field name");
        }
        int[] iArrF = wz.f();
        if (iArrF[i2] != 0) {
            _reportUnexpectedChar(i2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArrE = this.f53260a;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        do {
            if (i3 < 4) {
                i3++;
                i2 |= i5 << 8;
            } else {
                if (i4 >= iArrE.length) {
                    iArrE = e(iArrE, iArrE.length);
                    this.f53260a = iArrE;
                }
                iArrE[i4] = i5;
                i4++;
                i3 = 1;
            }
            i5 = i2;
            i2 = this.f53261c.readUnsignedByte();
        } while (iArrF[i2] == 0);
        this.e = i2;
        if (i3 > 0) {
            if (i4 >= iArrE.length) {
                int[] iArrE2 = e(iArrE, iArrE.length);
                this.f53260a = iArrE2;
                iArrE = iArrE2;
            }
            iArrE[i4] = i5;
            i4++;
        }
        String strB = this.g.b(iArrE, i4);
        return strB == null ? e(iArrE, i4, i3) : strB;
    }

    protected String a() throws IOException {
        int unsignedByte = this.f53261c.readUnsignedByte();
        if (unsignedByte == 39) {
            return "";
        }
        int[] iArrE = this.f53260a;
        int[] iArr = f53259b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (unsignedByte != 39) {
            if (unsignedByte != 34 && iArr[unsignedByte] != 0) {
                if (unsignedByte != 92) {
                    _throwUnquotedSpace(unsignedByte, "name");
                } else {
                    unsignedByte = _decodeEscaped();
                }
                if (unsignedByte > 127) {
                    if (i2 >= 4) {
                        if (i3 >= iArrE.length) {
                            iArrE = e(iArrE, iArrE.length);
                            this.f53260a = iArrE;
                        }
                        iArrE[i3] = i4;
                        i3++;
                        i2 = 0;
                        i4 = 0;
                    }
                    int i5 = i4 << 8;
                    if (unsignedByte < 2048) {
                        i4 = i5 | (unsignedByte >> 6) | PsExtractor.AUDIO_STREAM;
                        i2++;
                    } else {
                        int i6 = i5 | (unsignedByte >> 12) | 224;
                        int i7 = i2 + 1;
                        if (i7 >= 4) {
                            if (i3 >= iArrE.length) {
                                iArrE = e(iArrE, iArrE.length);
                                this.f53260a = iArrE;
                            }
                            iArrE[i3] = i6;
                            i3++;
                            i7 = 0;
                            i6 = 0;
                        }
                        i4 = (i6 << 8) | ((unsignedByte >> 6) & 63) | 128;
                        i2 = i7 + 1;
                    }
                    unsignedByte = (unsignedByte & 63) | 128;
                }
            }
            if (i2 < 4) {
                i2++;
                i4 = unsignedByte | (i4 << 8);
            } else {
                if (i3 >= iArrE.length) {
                    iArrE = e(iArrE, iArrE.length);
                    this.f53260a = iArrE;
                }
                iArrE[i3] = i4;
                i3++;
                i4 = unsignedByte;
                i2 = 1;
            }
            unsignedByte = this.f53261c.readUnsignedByte();
        }
        if (i2 > 0) {
            if (i3 >= iArrE.length) {
                int[] iArrE2 = e(iArrE, iArrE.length);
                this.f53260a = iArrE2;
                iArrE = iArrE2;
            }
            iArrE[i3] = d(i4, i2);
            i3++;
        }
        String strB = this.g.b(iArrE, i3);
        return strB == null ? e(iArrE, i3, i2) : strB;
    }

    private final String c(int i2, int i3) throws wn {
        int iD = d(i2, i3);
        String strB = this.g.b(iD);
        if (strB != null) {
            return strB;
        }
        int[] iArr = this.f53260a;
        iArr[0] = iD;
        return e(iArr, 1, i3);
    }

    private final String d(int i2, int i3, int i4) throws wn {
        int iD = d(i3, i4);
        String strD = this.g.d(i2, iD);
        if (strD != null) {
            return strD;
        }
        int[] iArr = this.f53260a;
        iArr[0] = i2;
        iArr[1] = iD;
        return e(iArr, 2, i4);
    }

    private final String a(int i2, int i3, int i4, int i5) throws wn {
        int iD = d(i4, i5);
        String strE = this.g.e(i2, i3, iD);
        if (strE != null) {
            return strE;
        }
        int[] iArr = this.f53260a;
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = d(iD, i5);
        return e(iArr, 3, i5);
    }

    private final String d(int[] iArr, int i2, int i3, int i4) throws wn {
        if (i2 >= iArr.length) {
            iArr = e(iArr, iArr.length);
            this.f53260a = iArr;
        }
        int i5 = i2 + 1;
        iArr[i2] = d(i3, i4);
        String strB = this.g.b(iArr, i5);
        return strB == null ? e(iArr, i5, i4) : strB;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0 A[PHI: r5 r14
      0x00c0: PHI (r5v17 int) = (r5v16 int), (r5v32 int) binds: [B:28:0x0082, B:37:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00c0: PHI (r14v6 int) = (r14v5 int), (r14v15 int) binds: [B:28:0x0082, B:37:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    private final String e(int[] iArr, int i2, int i3) throws wn {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = ((i2 << 2) - 4) + i3;
        if (i3 < 4) {
            int i14 = i2 - 1;
            i4 = iArr[i14];
            iArr[i14] = i4 << ((4 - i3) << 3);
        } else {
            i4 = 0;
        }
        char[] cArrE = this._textBuffer.e();
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            int i17 = iArr[i15 >> 2] >> ((3 - (i15 & 3)) << 3);
            int i18 = i17 & 255;
            int i19 = i15 + 1;
            if (i18 > 127) {
                if ((i17 & 224) == 192) {
                    i5 = i17 & 31;
                } else {
                    if ((i17 & 240) == 224) {
                        i5 = i17 & 15;
                        i6 = 2;
                    } else if ((i17 & 248) == 240) {
                        i5 = i17 & 7;
                        i6 = 3;
                    } else {
                        i(i18);
                        i5 = 1;
                    }
                    if (i19 + i6 > i13) {
                        _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                    }
                    i7 = iArr[i19 >> 2] >> ((3 - (i19 & 3)) << 3);
                    i19 = i15 + 2;
                    if ((i7 & PsExtractor.AUDIO_STREAM) != 128) {
                        m(i7);
                    }
                    i8 = (i5 << 6) | (i7 & 63);
                    if (i6 > 1) {
                        i10 = iArr[i19 >> 2] >> ((3 - (i19 & 3)) << 3);
                        i19 = i15 + 3;
                        if ((i10 & PsExtractor.AUDIO_STREAM) != 128) {
                            m(i10);
                        }
                        i11 = (i8 << 6) | (i10 & 63);
                        if (i6 > 2) {
                            i12 = iArr[i19 >> 2] >> ((3 - (i19 & 3)) << 3);
                            i19 = i15 + 4;
                            if ((i12 & PsExtractor.AUDIO_STREAM) != 128) {
                                m(i12 & 255);
                            }
                            i8 = (i11 << 6) | (i12 & 63);
                            i18 = i8;
                            i9 = 2;
                        } else {
                            i18 = i11;
                            i9 = 2;
                        }
                    } else {
                        i18 = i8;
                        i9 = 2;
                    }
                    if (i6 > i9) {
                        int i20 = i18 - 65536;
                        if (i16 >= cArrE.length) {
                            cArrE = this._textBuffer.i();
                        }
                        cArrE[i16] = (char) ((i20 >> 10) + GeneratorBase.SURR1_FIRST);
                        i18 = (i20 & 1023) | 56320;
                        i16++;
                    }
                }
                i6 = 1;
                if (i19 + i6 > i13) {
                    _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                }
                i7 = iArr[i19 >> 2] >> ((3 - (i19 & 3)) << 3);
                i19 = i15 + 2;
                if ((i7 & PsExtractor.AUDIO_STREAM) != 128) {
                    m(i7);
                }
                i8 = (i5 << 6) | (i7 & 63);
                if (i6 > 1) {
                    i10 = iArr[i19 >> 2] >> ((3 - (i19 & 3)) << 3);
                    i19 = i15 + 3;
                    if ((i10 & PsExtractor.AUDIO_STREAM) != 128) {
                        m(i10);
                    }
                    i11 = (i8 << 6) | (i10 & 63);
                    if (i6 > 2) {
                        i12 = iArr[i19 >> 2] >> ((3 - (i19 & 3)) << 3);
                        i19 = i15 + 4;
                        if ((i12 & PsExtractor.AUDIO_STREAM) != 128) {
                            m(i12 & 255);
                        }
                        i8 = (i11 << 6) | (i12 & 63);
                        i18 = i8;
                        i9 = 2;
                    } else {
                        i18 = i11;
                        i9 = 2;
                    }
                } else {
                    i18 = i8;
                    i9 = 2;
                }
                if (i6 > i9) {
                    int i21 = i18 - 65536;
                    if (i16 >= cArrE.length) {
                        cArrE = this._textBuffer.i();
                    }
                    cArrE[i16] = (char) ((i21 >> 10) + GeneratorBase.SURR1_FIRST);
                    i18 = (i21 & 1023) | 56320;
                    i16++;
                }
            }
            i15 = i19;
            if (i16 >= cArrE.length) {
                cArrE = this._textBuffer.i();
            }
            cArrE[i16] = (char) i18;
            i16++;
        }
        String str = new String(cArrE, 0, i16);
        if (i3 < 4) {
            iArr[i2 - 1] = i4;
        }
        return this.g.b(str, iArr, i2);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _finishString() throws IOException {
        char[] cArrE = this._textBuffer.e();
        int[] iArr = t;
        int length = cArrE.length;
        int i2 = 0;
        while (true) {
            int unsignedByte = this.f53261c.readUnsignedByte();
            if (iArr[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    this._textBuffer.e(i2);
                    return;
                } else {
                    e(cArrE, i2, unsignedByte);
                    return;
                }
            }
            int i3 = i2 + 1;
            cArrE[i2] = (char) unsignedByte;
            if (i3 >= length) {
                e(cArrE, i3, this.f53261c.readUnsignedByte());
                return;
            }
            i2 = i3;
        }
    }

    private String i() throws IOException {
        char[] cArrE = this._textBuffer.e();
        int[] iArr = t;
        int length = cArrE.length;
        int i2 = 0;
        while (true) {
            int unsignedByte = this.f53261c.readUnsignedByte();
            if (iArr[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    return this._textBuffer.c(i2);
                }
                e(cArrE, i2, unsignedByte);
                return this._textBuffer.d();
            }
            int i3 = i2 + 1;
            cArrE[i2] = (char) unsignedByte;
            if (i3 >= length) {
                e(cArrE, i3, this.f53261c.readUnsignedByte());
                return this._textBuffer.d();
            }
            i2 = i3;
        }
    }

    private final void e(char[] cArr, int i2, int i3) throws IOException {
        int[] iArr = t;
        int length = cArr.length;
        while (true) {
            int i4 = iArr[i3];
            int i5 = 0;
            if (i4 == 0) {
                if (i2 >= length) {
                    cArr = this._textBuffer.h();
                    length = cArr.length;
                    i2 = 0;
                }
                cArr[i2] = (char) i3;
                i3 = this.f53261c.readUnsignedByte();
                i2++;
            } else if (i3 != 34) {
                if (i4 == 1) {
                    i3 = _decodeEscaped();
                } else if (i4 == 2) {
                    i3 = g(i3);
                } else if (i4 == 3) {
                    i3 = h(i3);
                } else if (i4 == 4) {
                    int iN = n(i3);
                    if (i2 >= cArr.length) {
                        cArr = this._textBuffer.h();
                        length = cArr.length;
                        i2 = 0;
                    }
                    cArr[i2] = (char) ((iN >> 10) | GeneratorBase.SURR1_FIRST);
                    i3 = (iN & 1023) | 56320;
                    i2++;
                } else if (i3 < 32) {
                    _throwUnquotedSpace(i3, "string value");
                } else {
                    j(i3);
                }
                if (i2 >= cArr.length) {
                    cArr = this._textBuffer.h();
                    length = cArr.length;
                } else {
                    i5 = i2;
                }
                i2 = i5 + 1;
                cArr[i5] = (char) i3;
                i3 = this.f53261c.readUnsignedByte();
            } else {
                this._textBuffer.e(i2);
                return;
            }
        }
    }

    protected void b() throws IOException {
        this.f = false;
        int[] iArr = t;
        while (true) {
            int unsignedByte = this.f53261c.readUnsignedByte();
            int i2 = iArr[unsignedByte];
            if (i2 != 0) {
                if (unsignedByte == 34) {
                    return;
                }
                if (i2 == 1) {
                    _decodeEscaped();
                } else if (i2 == 2) {
                    k();
                } else if (i2 == 3) {
                    m();
                } else if (i2 == 4) {
                    l();
                } else if (unsignedByte < 32) {
                    _throwUnquotedSpace(unsignedByte, "string value");
                } else {
                    j(unsignedByte);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r3._parsingContext.inArray() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        if (r3._parsingContext.inRoot() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if ((r3._features & defpackage.xp.h) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        r3.e = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected JsonToken e(int i2) throws IOException {
        if (i2 == 39) {
            if ((this._features & i) != 0) {
                return c();
            }
        } else if (i2 == 73) {
            b("Infinity", 1);
            if ((this._features & l) != 0) {
                return resetAsNaN("Infinity", Double.POSITIVE_INFINITY);
            }
            _reportError("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        } else if (i2 == 78) {
            b("NaN", 1);
            if ((this._features & l) != 0) {
                return resetAsNaN("NaN", Double.NaN);
            }
            _reportError("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        } else if (i2 != 93) {
            if (i2 == 125) {
                _reportUnexpectedChar(i2, "expected a value");
                if ((this._features & i) != 0) {
                    return c();
                }
            } else if (i2 == 43) {
                return d(this.f53261c.readUnsignedByte(), false);
            }
        }
        if (Character.isJavaIdentifierStart(i2)) {
            e(i2, "" + ((char) i2), _validJsonTokenList());
        }
        _reportUnexpectedChar(i2, "expected a valid value " + _validJsonValueList());
        return null;
    }

    protected JsonToken c() throws IOException {
        int i2;
        char[] cArrE = this._textBuffer.e();
        int[] iArr = t;
        int i3 = 0;
        while (true) {
            int length = cArrE.length;
            if (i3 >= cArrE.length) {
                cArrE = this._textBuffer.h();
                length = cArrE.length;
                i3 = 0;
            }
            do {
                int unsignedByte = this.f53261c.readUnsignedByte();
                if (unsignedByte != 39) {
                    int i4 = iArr[unsignedByte];
                    if (i4 == 0 || unsignedByte == 34) {
                        i2 = i3 + 1;
                        cArrE[i3] = (char) unsignedByte;
                        i3 = i2;
                    } else {
                        if (i4 == 1) {
                            unsignedByte = _decodeEscaped();
                        } else if (i4 == 2) {
                            unsignedByte = g(unsignedByte);
                        } else if (i4 == 3) {
                            unsignedByte = h(unsignedByte);
                        } else if (i4 == 4) {
                            int iN = n(unsignedByte);
                            int i5 = i3 + 1;
                            cArrE[i3] = (char) ((iN >> 10) | GeneratorBase.SURR1_FIRST);
                            if (i5 >= cArrE.length) {
                                cArrE = this._textBuffer.h();
                                i3 = 0;
                            } else {
                                i3 = i5;
                            }
                            unsignedByte = (iN & 1023) | 56320;
                        } else {
                            if (unsignedByte < 32) {
                                _throwUnquotedSpace(unsignedByte, "string value");
                            }
                            j(unsignedByte);
                        }
                        if (i3 >= cArrE.length) {
                            cArrE = this._textBuffer.h();
                            i3 = 0;
                        }
                        cArrE[i3] = (char) unsignedByte;
                        i3++;
                        break;
                    }
                } else {
                    this._textBuffer.e(i3);
                    return JsonToken.VALUE_STRING;
                }
            } while (i2 < length);
        }
    }

    protected JsonToken d(int i2, boolean z) throws IOException {
        String str;
        while (i2 == 73) {
            i2 = this.f53261c.readUnsignedByte();
            if (i2 != 78) {
                if (i2 != 110) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            b(str, 3);
            if ((this._features & l) != 0) {
                return resetAsNaN(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            _reportError("Non-standard token '" + str + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        }
        reportUnexpectedNumberChar(i2, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    protected final void b(String str, int i2) throws IOException {
        int length = str.length();
        do {
            int unsignedByte = this.f53261c.readUnsignedByte();
            if (unsignedByte != str.charAt(i2)) {
                c(unsignedByte, str.substring(0, i2));
            }
            i2++;
        } while (i2 < length);
        int unsignedByte2 = this.f53261c.readUnsignedByte();
        if (unsignedByte2 >= 48 && unsignedByte2 != 93 && unsignedByte2 != 125) {
            d(str, i2, unsignedByte2);
        }
        this.e = unsignedByte2;
    }

    private final void d(String str, int i2, int i3) throws IOException {
        char cD = (char) d(i3);
        if (Character.isJavaIdentifierPart(cD)) {
            c(cD, str.substring(0, i2));
        }
    }

    private final int q() throws IOException {
        int unsignedByte = this.e;
        if (unsignedByte < 0) {
            unsignedByte = this.f53261c.readUnsignedByte();
        } else {
            this.e = -1;
        }
        while (unsignedByte <= 32) {
            if (unsignedByte == 13 || unsignedByte == 10) {
                this._currInputRow++;
            }
            unsignedByte = this.f53261c.readUnsignedByte();
        }
        return (unsignedByte == 47 || unsignedByte == 35) ? l(unsignedByte) : unsignedByte;
    }

    private final int s() throws IOException {
        int unsignedByte = this.e;
        if (unsignedByte < 0) {
            try {
                unsignedByte = this.f53261c.readUnsignedByte();
            } catch (EOFException unused) {
                return _eofAsNextChar();
            }
        } else {
            this.e = -1;
        }
        while (unsignedByte <= 32) {
            if (unsignedByte == 13 || unsignedByte == 10) {
                this._currInputRow++;
            }
            try {
                unsignedByte = this.f53261c.readUnsignedByte();
            } catch (EOFException unused2) {
                return _eofAsNextChar();
            }
        }
        return (unsignedByte == 47 || unsignedByte == 35) ? l(unsignedByte) : unsignedByte;
    }

    private final int l(int i2) throws IOException {
        while (true) {
            if (i2 > 32) {
                if (i2 == 47) {
                    o();
                } else if (i2 != 35 || !r()) {
                    break;
                }
            } else if (i2 == 13 || i2 == 10) {
                this._currInputRow++;
            }
            i2 = this.f53261c.readUnsignedByte();
        }
        return i2;
    }

    private final int f() throws IOException {
        int unsignedByte = this.e;
        if (unsignedByte < 0) {
            unsignedByte = this.f53261c.readUnsignedByte();
        } else {
            this.e = -1;
        }
        if (unsignedByte == 58) {
            int unsignedByte2 = this.f53261c.readUnsignedByte();
            if (unsignedByte2 > 32) {
                return (unsignedByte2 == 47 || unsignedByte2 == 35) ? b(unsignedByte2, true) : unsignedByte2;
            }
            if ((unsignedByte2 == 32 || unsignedByte2 == 9) && (unsignedByte2 = this.f53261c.readUnsignedByte()) > 32) {
                return (unsignedByte2 == 47 || unsignedByte2 == 35) ? b(unsignedByte2, true) : unsignedByte2;
            }
            return b(unsignedByte2, true);
        }
        if (unsignedByte == 32 || unsignedByte == 9) {
            unsignedByte = this.f53261c.readUnsignedByte();
        }
        if (unsignedByte == 58) {
            int unsignedByte3 = this.f53261c.readUnsignedByte();
            if (unsignedByte3 > 32) {
                return (unsignedByte3 == 47 || unsignedByte3 == 35) ? b(unsignedByte3, true) : unsignedByte3;
            }
            if ((unsignedByte3 == 32 || unsignedByte3 == 9) && (unsignedByte3 = this.f53261c.readUnsignedByte()) > 32) {
                return (unsignedByte3 == 47 || unsignedByte3 == 35) ? b(unsignedByte3, true) : unsignedByte3;
            }
            return b(unsignedByte3, true);
        }
        return b(unsignedByte, false);
    }

    private final int b(int i2, boolean z) throws IOException {
        while (true) {
            if (i2 > 32) {
                if (i2 == 47) {
                    o();
                } else if (i2 != 35 || !r()) {
                    if (z) {
                        return i2;
                    }
                    if (i2 != 58) {
                        _reportUnexpectedChar(i2, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i2 == 13 || i2 == 10) {
                this._currInputRow++;
            }
            i2 = this.f53261c.readUnsignedByte();
        }
    }

    private final void o() throws IOException {
        if ((this._features & j) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int unsignedByte = this.f53261c.readUnsignedByte();
        if (unsignedByte == 47) {
            n();
        } else if (unsignedByte == 42) {
            h();
        } else {
            _reportUnexpectedChar(unsignedByte, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void h() throws IOException {
        int[] iArrD = wz.d();
        int unsignedByte = this.f53261c.readUnsignedByte();
        while (true) {
            int i2 = iArrD[unsignedByte];
            if (i2 != 0) {
                if (i2 == 2) {
                    k();
                } else if (i2 == 3) {
                    m();
                } else if (i2 == 4) {
                    l();
                } else if (i2 == 10 || i2 == 13) {
                    this._currInputRow++;
                } else if (i2 == 42) {
                    unsignedByte = this.f53261c.readUnsignedByte();
                    if (unsignedByte == 47) {
                        return;
                    }
                } else {
                    j(unsignedByte);
                }
            }
            unsignedByte = this.f53261c.readUnsignedByte();
        }
    }

    private final boolean r() throws IOException {
        if ((this._features & n) == 0) {
            return false;
        }
        n();
        return true;
    }

    private final void n() throws IOException {
        int[] iArrD = wz.d();
        while (true) {
            int unsignedByte = this.f53261c.readUnsignedByte();
            int i2 = iArrD[unsignedByte];
            if (i2 != 0) {
                if (i2 == 2) {
                    k();
                } else if (i2 == 3) {
                    m();
                } else if (i2 == 4) {
                    l();
                } else if (i2 == 10 || i2 == 13) {
                    break;
                } else if (i2 != 42 && i2 < 0) {
                    j(unsignedByte);
                }
            }
        }
        this._currInputRow++;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        int unsignedByte = this.f53261c.readUnsignedByte();
        if (unsignedByte == 34 || unsignedByte == 47 || unsignedByte == 92) {
            return (char) unsignedByte;
        }
        if (unsignedByte == 98) {
            return '\b';
        }
        if (unsignedByte == 102) {
            return '\f';
        }
        if (unsignedByte == 110) {
            return '\n';
        }
        if (unsignedByte == 114) {
            return '\r';
        }
        if (unsignedByte == 116) {
            return '\t';
        }
        if (unsignedByte != 117) {
            return _handleUnrecognizedCharacterEscape((char) d(unsignedByte));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int unsignedByte2 = this.f53261c.readUnsignedByte();
            int iC = wz.c(unsignedByte2);
            if (iC < 0) {
                _reportUnexpectedChar(unsignedByte2, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | iC;
        }
        return (char) i2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    protected int d(int i2) throws IOException {
        int i3;
        char c2;
        int unsignedByte;
        int i4;
        int unsignedByte2;
        int unsignedByte3;
        int i5 = i2 & 255;
        if (i5 <= 127) {
            return i5;
        }
        if ((i2 & 224) != 192) {
            if ((i2 & 240) == 224) {
                i3 = i2 & 15;
                c2 = 2;
            } else if ((i2 & 248) == 240) {
                i3 = i2 & 7;
                c2 = 3;
            } else {
                i(i5);
            }
            unsignedByte = this.f53261c.readUnsignedByte();
            if ((unsignedByte & PsExtractor.AUDIO_STREAM) != 128) {
                m(unsignedByte & 255);
            }
            i4 = (i3 << 6) | (unsignedByte & 63);
            if (c2 > 1) {
                unsignedByte2 = this.f53261c.readUnsignedByte();
                if ((unsignedByte2 & PsExtractor.AUDIO_STREAM) != 128) {
                    m(unsignedByte2 & 255);
                }
                i4 = (i4 << 6) | (unsignedByte2 & 63);
                if (c2 > 2) {
                    unsignedByte3 = this.f53261c.readUnsignedByte();
                    if ((unsignedByte3 & PsExtractor.AUDIO_STREAM) != 128) {
                        m(unsignedByte3 & 255);
                    }
                    return (i4 << 6) | (unsignedByte3 & 63);
                }
            }
            return i4;
        }
        i5 = i2 & 31;
        i3 = i5;
        c2 = 1;
        unsignedByte = this.f53261c.readUnsignedByte();
        if ((unsignedByte & PsExtractor.AUDIO_STREAM) != 128) {
            m(unsignedByte & 255);
        }
        i4 = (i3 << 6) | (unsignedByte & 63);
        if (c2 > 1) {
            unsignedByte2 = this.f53261c.readUnsignedByte();
            if ((unsignedByte2 & PsExtractor.AUDIO_STREAM) != 128) {
                m(unsignedByte2 & 255);
            }
            i4 = (i4 << 6) | (unsignedByte2 & 63);
            if (c2 > 2) {
                unsignedByte3 = this.f53261c.readUnsignedByte();
                if ((unsignedByte3 & PsExtractor.AUDIO_STREAM) != 128) {
                    m(unsignedByte3 & 255);
                }
                return (i4 << 6) | (unsignedByte3 & 63);
            }
        }
        return i4;
    }

    private final int g(int i2) throws IOException {
        int unsignedByte = this.f53261c.readUnsignedByte();
        if ((unsignedByte & PsExtractor.AUDIO_STREAM) != 128) {
            m(unsignedByte & 255);
        }
        return ((i2 & 31) << 6) | (unsignedByte & 63);
    }

    private final int h(int i2) throws IOException {
        int unsignedByte = this.f53261c.readUnsignedByte();
        if ((unsignedByte & PsExtractor.AUDIO_STREAM) != 128) {
            m(unsignedByte & 255);
        }
        int unsignedByte2 = this.f53261c.readUnsignedByte();
        if ((unsignedByte2 & PsExtractor.AUDIO_STREAM) != 128) {
            m(unsignedByte2 & 255);
        }
        return ((((i2 & 15) << 6) | (unsignedByte & 63)) << 6) | (unsignedByte2 & 63);
    }

    private final int n(int i2) throws IOException {
        int unsignedByte = this.f53261c.readUnsignedByte();
        if ((unsignedByte & PsExtractor.AUDIO_STREAM) != 128) {
            m(unsignedByte & 255);
        }
        int unsignedByte2 = this.f53261c.readUnsignedByte();
        if ((unsignedByte2 & PsExtractor.AUDIO_STREAM) != 128) {
            m(unsignedByte2 & 255);
        }
        int unsignedByte3 = this.f53261c.readUnsignedByte();
        if ((unsignedByte3 & PsExtractor.AUDIO_STREAM) != 128) {
            m(unsignedByte3 & 255);
        }
        return (((((((i2 & 7) << 6) | (unsignedByte & 63)) << 6) | (unsignedByte2 & 63)) << 6) | (unsignedByte3 & 63)) - 65536;
    }

    private final void k() throws IOException {
        int unsignedByte = this.f53261c.readUnsignedByte();
        if ((unsignedByte & PsExtractor.AUDIO_STREAM) != 128) {
            m(unsignedByte & 255);
        }
    }

    private final void m() throws IOException {
        int unsignedByte = this.f53261c.readUnsignedByte();
        if ((unsignedByte & PsExtractor.AUDIO_STREAM) != 128) {
            m(unsignedByte & 255);
        }
        int unsignedByte2 = this.f53261c.readUnsignedByte();
        if ((unsignedByte2 & PsExtractor.AUDIO_STREAM) != 128) {
            m(unsignedByte2 & 255);
        }
    }

    private final void l() throws IOException {
        int unsignedByte = this.f53261c.readUnsignedByte();
        if ((unsignedByte & PsExtractor.AUDIO_STREAM) != 128) {
            m(unsignedByte & 255);
        }
        int unsignedByte2 = this.f53261c.readUnsignedByte();
        if ((unsignedByte2 & PsExtractor.AUDIO_STREAM) != 128) {
            m(unsignedByte2 & 255);
        }
        int unsignedByte3 = this.f53261c.readUnsignedByte();
        if ((unsignedByte3 & PsExtractor.AUDIO_STREAM) != 128) {
            m(unsignedByte3 & 255);
        }
    }

    protected void c(int i2, String str) throws IOException {
        e(i2, str, _validJsonTokenList());
    }

    protected void e(int i2, String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            char cD = (char) d(i2);
            if (Character.isJavaIdentifierPart(cD)) {
                sb.append(cD);
                i2 = this.f53261c.readUnsignedByte();
            } else {
                _reportError("Unrecognized token '" + sb.toString() + "': was expecting " + str2);
                return;
            }
        }
    }

    protected void j(int i2) throws wn {
        if (i2 < 32) {
            _throwInvalidSpace(i2);
        }
        i(i2);
    }

    protected void i(int i2) throws wn {
        _reportError("Invalid UTF-8 start byte 0x" + Integer.toHexString(i2));
    }

    private void m(int i2) throws wn {
        _reportError("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i2));
    }

    private static int[] e(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        return Arrays.copyOf(iArr, iArr.length + i2);
    }

    protected final byte[] e(Base64Variant base64Variant) throws IOException {
        xx xxVar_getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            int unsignedByte = this.f53261c.readUnsignedByte();
            if (unsignedByte > 32) {
                int iD = base64Variant.d(unsignedByte);
                if (iD < 0) {
                    if (unsignedByte == 34) {
                        return xxVar_getByteArrayBuilder.i();
                    }
                    iD = _decodeBase64Escape(base64Variant, unsignedByte, 0);
                    if (iD < 0) {
                        continue;
                    }
                }
                int unsignedByte2 = this.f53261c.readUnsignedByte();
                int iD2 = base64Variant.d(unsignedByte2);
                if (iD2 < 0) {
                    iD2 = _decodeBase64Escape(base64Variant, unsignedByte2, 1);
                }
                int i2 = (iD << 6) | iD2;
                int unsignedByte3 = this.f53261c.readUnsignedByte();
                int iD3 = base64Variant.d(unsignedByte3);
                if (iD3 < 0) {
                    if (iD3 != -2) {
                        if (unsignedByte3 == 34) {
                            xxVar_getByteArrayBuilder.c(i2 >> 4);
                            if (base64Variant.h()) {
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return xxVar_getByteArrayBuilder.i();
                        }
                        iD3 = _decodeBase64Escape(base64Variant, unsignedByte3, 2);
                    }
                    if (iD3 == -2) {
                        int unsignedByte4 = this.f53261c.readUnsignedByte();
                        if (!base64Variant.b(unsignedByte4) && (unsignedByte4 != 92 || _decodeBase64Escape(base64Variant, unsignedByte4, 3) != -2)) {
                            throw reportInvalidBase64Char(base64Variant, unsignedByte4, 3, "expected padding character '" + base64Variant.j() + "'");
                        }
                        xxVar_getByteArrayBuilder.c(i2 >> 4);
                    }
                }
                int i3 = (i2 << 6) | iD3;
                int unsignedByte5 = this.f53261c.readUnsignedByte();
                int iD4 = base64Variant.d(unsignedByte5);
                if (iD4 < 0) {
                    if (iD4 != -2) {
                        if (unsignedByte5 == 34) {
                            xxVar_getByteArrayBuilder.e(i3 >> 2);
                            if (base64Variant.h()) {
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return xxVar_getByteArrayBuilder.i();
                        }
                        iD4 = _decodeBase64Escape(base64Variant, unsignedByte5, 3);
                    }
                    if (iD4 == -2) {
                        xxVar_getByteArrayBuilder.e(i3 >> 2);
                    }
                }
                xxVar_getByteArrayBuilder.d((i3 << 6) | iD4);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public wq getTokenLocation() {
        return new wq(_getSourceReference(), -1L, -1L, this._tokenInputRow, -1);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public wq getCurrentLocation() {
        return new wq(_getSourceReference(), -1L, -1L, this._currInputRow, -1);
    }

    private void f(int i2) throws wn {
        if (i2 == 93) {
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(i2, '}');
            }
            this._parsingContext = this._parsingContext.b();
            this._currToken = JsonToken.END_ARRAY;
        }
        if (i2 == 125) {
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(i2, ']');
            }
            this._parsingContext = this._parsingContext.b();
            this._currToken = JsonToken.END_OBJECT;
        }
    }
}
