package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import okio.Utf8;

/* JADX INFO: loaded from: classes21.dex */
public class xs extends ParserBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected byte[] f53290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f53291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected InputStream f53292c;
    protected int e;
    protected ObjectCodec f;
    protected final xt g;
    protected int[] h;
    protected int i;
    protected int j;
    protected boolean m;
    private int v;
    private static final int p = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int t = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int q = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    private static final int k = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int o = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int n = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int l = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int r = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    private static final int[] s = wz.g();
    protected static final int[] d = wz.a();

    private static final int a(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    public xs(xa xaVar, int i, InputStream inputStream, ObjectCodec objectCodec, xt xtVar, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(xaVar, i);
        this.h = new int[16];
        this.f53292c = inputStream;
        this.f = objectCodec;
        this.g = xtVar;
        this.f53290a = bArr;
        this._inputPtr = i2;
        this._inputEnd = i3;
        this._currInputRowStart = i2 - i4;
        this._currInputProcessed = (-i2) + i4;
        this.f53291b = z;
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
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i = this._inputEnd - this._inputPtr;
        if (i < 1) {
            return 0;
        }
        int i2 = this._inputPtr;
        this._inputPtr += i;
        outputStream.write(this.f53290a, i2, i);
        return i;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return this.f53292c;
    }

    protected final boolean a() throws IOException {
        byte[] bArr;
        int length;
        InputStream inputStream = this.f53292c;
        if (inputStream == null || (length = (bArr = this.f53290a).length) == 0) {
            return false;
        }
        int i = inputStream.read(bArr, 0, length);
        if (i > 0) {
            int i2 = this._inputEnd;
            this._currInputProcessed += (long) i2;
            this._currInputRowStart -= i2;
            this.i -= i2;
            this._inputPtr = 0;
            this._inputEnd = i;
            return true;
        }
        _closeInput();
        if (i == 0) {
            throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.f53290a.length + " bytes");
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
        if (this.f53292c != null) {
            if (this._ioContext.i() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.f53292c.close();
            }
            this.f53292c = null;
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() throws IOException {
        byte[] bArr;
        super._releaseBuffers();
        this.g.d();
        if (!this.f53291b || (bArr = this.f53290a) == null || bArr == NO_BYTES) {
            return;
        }
        this.f53290a = NO_BYTES;
        this._ioContext.e(bArr);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getText() throws IOException {
        if (this._currToken == JsonToken.VALUE_STRING) {
            if (this.m) {
                this.m = false;
                return b();
            }
            return this._textBuffer.d();
        }
        return a(this._currToken);
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
    public String getValueAsString() throws IOException {
        if (this._currToken == JsonToken.VALUE_STRING) {
            if (this.m) {
                this.m = false;
                return b();
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
            if (this.m) {
                this.m = false;
                return b();
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
    public int getValueAsInt(int i) throws IOException {
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
        return super.getValueAsInt(i);
    }

    protected final String a(JsonToken jsonToken) {
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
        } else if (this.m) {
            this.m = false;
            _finishString();
        }
        return this._textBuffer.m();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getTextLength() throws IOException {
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
    public int getTextOffset() throws IOException {
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
        if (this._currToken != JsonToken.VALUE_STRING && (this._currToken != JsonToken.VALUE_EMBEDDED_OBJECT || this._binaryValue == null)) {
            _reportError("Current token (" + this._currToken + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.m) {
            try {
                this._binaryValue = a(base64Variant);
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
            return c(base64Variant, outputStream, bArrC);
        } finally {
            this._ioContext.a(bArrC);
        }
    }

    protected int c(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                d();
            }
            byte[] bArr2 = this.f53290a;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            int i4 = bArr2[i3] & 255;
            if (i4 > 32) {
                int iD = base64Variant.d(i4);
                if (iD < 0) {
                    if (i4 == 34) {
                        break;
                    }
                    iD = _decodeBase64Escape(base64Variant, i4, 0);
                    if (iD < 0) {
                        continue;
                    }
                }
                if (i > length - 3) {
                    i2 += i;
                    outputStream.write(bArr, 0, i);
                    i = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    d();
                }
                byte[] bArr3 = this.f53290a;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                int i6 = bArr3[i5] & 255;
                int iD2 = base64Variant.d(i6);
                if (iD2 < 0) {
                    iD2 = _decodeBase64Escape(base64Variant, i6, 1);
                }
                int i7 = (iD << 6) | iD2;
                if (this._inputPtr >= this._inputEnd) {
                    d();
                }
                byte[] bArr4 = this.f53290a;
                int i8 = this._inputPtr;
                this._inputPtr = i8 + 1;
                int i9 = bArr4[i8] & 255;
                int iD3 = base64Variant.d(i9);
                if (iD3 < 0) {
                    if (iD3 != -2) {
                        if (i9 == 34) {
                            bArr[i] = (byte) (i7 >> 4);
                            if (base64Variant.h()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i++;
                            break;
                        }
                        iD3 = _decodeBase64Escape(base64Variant, i9, 2);
                    }
                    if (iD3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            d();
                        }
                        byte[] bArr5 = this.f53290a;
                        int i10 = this._inputPtr;
                        this._inputPtr = i10 + 1;
                        int i11 = bArr5[i10] & 255;
                        if (!base64Variant.b(i11) && _decodeBase64Escape(base64Variant, i11, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, i11, 3, "expected padding character '" + base64Variant.j() + "'");
                        }
                        bArr[i] = (byte) (i7 >> 4);
                        i++;
                    }
                }
                int i12 = (i7 << 6) | iD3;
                if (this._inputPtr >= this._inputEnd) {
                    d();
                }
                byte[] bArr6 = this.f53290a;
                int i13 = this._inputPtr;
                this._inputPtr = i13 + 1;
                int i14 = bArr6[i13] & 255;
                int iD4 = base64Variant.d(i14);
                if (iD4 < 0) {
                    if (iD4 != -2) {
                        if (i14 == 34) {
                            bArr[i] = (byte) (i12 >> 10);
                            int i15 = i + 2;
                            bArr[i + 1] = (byte) (i12 >> 2);
                            if (base64Variant.h()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i = i15;
                            break;
                        }
                        iD4 = _decodeBase64Escape(base64Variant, i14, 3);
                    }
                    if (iD4 == -2) {
                        bArr[i] = (byte) (i12 >> 10);
                        bArr[i + 1] = (byte) (i12 >> 2);
                        i += 2;
                    }
                }
                int i16 = (i12 << 6) | iD4;
                bArr[i] = (byte) (i16 >> 16);
                bArr[i + 1] = (byte) (i16 >> 8);
                bArr[i + 2] = (byte) i16;
                i += 3;
            }
        }
        this.m = false;
        if (i <= 0) {
            return i2;
        }
        int i17 = i2 + i;
        outputStream.write(bArr, 0, i);
        return i17;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        JsonToken jsonTokenI;
        if (this._currToken == JsonToken.FIELD_NAME) {
            return q();
        }
        this._numTypesValid = 0;
        if (this.m) {
            n();
        }
        int iW = w();
        if (iW < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (iW == 93) {
            k();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            this._currToken = jsonToken;
            return jsonToken;
        }
        if (iW == 125) {
            l();
            JsonToken jsonToken2 = JsonToken.END_OBJECT;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        if (this._parsingContext.e()) {
            if (iW != 44) {
                _reportUnexpectedChar(iW, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            iW = v();
            if ((this._features & p) != 0 && (iW == 93 || iW == 125)) {
                return j(iW);
            }
        }
        if (!this._parsingContext.inObject()) {
            ac();
            return r(iW);
        }
        ab();
        this._parsingContext.c(c(iW));
        this._currToken = JsonToken.FIELD_NAME;
        int iP = p();
        ac();
        if (iP == 34) {
            this.m = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return this._currToken;
        }
        if (iP == 45) {
            jsonTokenI = i();
        } else if (iP == 46) {
            jsonTokenI = j();
        } else if (iP == 91) {
            jsonTokenI = JsonToken.START_ARRAY;
        } else if (iP == 102) {
            e();
            jsonTokenI = JsonToken.VALUE_FALSE;
        } else if (iP == 110) {
            g();
            jsonTokenI = JsonToken.VALUE_NULL;
        } else if (iP == 116) {
            h();
            jsonTokenI = JsonToken.VALUE_TRUE;
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
                    jsonTokenI = d(iP);
                    break;
                default:
                    jsonTokenI = b(iP);
                    break;
            }
        } else {
            jsonTokenI = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonTokenI;
        return this._currToken;
    }

    private final JsonToken r(int i) throws IOException {
        if (i == 34) {
            this.m = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        }
        if (i == 45) {
            JsonToken jsonTokenI = i();
            this._currToken = jsonTokenI;
            return jsonTokenI;
        }
        if (i == 46) {
            JsonToken jsonTokenJ = j();
            this._currToken = jsonTokenJ;
            return jsonTokenJ;
        }
        if (i == 91) {
            this._parsingContext = this._parsingContext.c(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        if (i == 102) {
            e();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (i == 110) {
            g();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (i == 116) {
            h();
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
            default:
                JsonToken jsonTokenB = b(i);
                this._currToken = jsonTokenB;
                return jsonTokenB;
        }
    }

    private final JsonToken q() {
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
            q();
            return false;
        }
        if (this.m) {
            n();
        }
        int iW = w();
        if (iW < 0) {
            close();
            this._currToken = null;
            return false;
        }
        this._binaryValue = null;
        if (iW == 93) {
            k();
            this._currToken = JsonToken.END_ARRAY;
            return false;
        }
        if (iW == 125) {
            l();
            this._currToken = JsonToken.END_OBJECT;
            return false;
        }
        if (this._parsingContext.e()) {
            if (iW != 44) {
                _reportUnexpectedChar(iW, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            iW = v();
            if ((this._features & p) != 0 && (iW == 93 || iW == 125)) {
                j(iW);
                return false;
            }
        }
        if (!this._parsingContext.inObject()) {
            ac();
            r(iW);
            return false;
        }
        ab();
        if (iW == 34) {
            byte[] bArrAsQuotedUTF8 = serializableString.asQuotedUTF8();
            int length = bArrAsQuotedUTF8.length;
            if (this._inputPtr + length + 4 < this._inputEnd) {
                int i2 = this._inputPtr + length;
                if (this.f53290a[i2] == 34) {
                    int i3 = this._inputPtr;
                    while (i3 != i2) {
                        if (bArrAsQuotedUTF8[i] == this.f53290a[i3]) {
                            i++;
                            i3++;
                        }
                    }
                    this._parsingContext.c(serializableString.getValue());
                    l(q(i3 + 1));
                    return true;
                }
            }
        }
        return a(iW, serializableString);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws IOException {
        JsonToken jsonTokenI;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            q();
            return null;
        }
        if (this.m) {
            n();
        }
        int iW = w();
        if (iW < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (iW == 93) {
            k();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        }
        if (iW == 125) {
            l();
            this._currToken = JsonToken.END_OBJECT;
            return null;
        }
        if (this._parsingContext.e()) {
            if (iW != 44) {
                _reportUnexpectedChar(iW, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            iW = v();
            if ((this._features & p) != 0 && (iW == 93 || iW == 125)) {
                j(iW);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            ac();
            r(iW);
            return null;
        }
        ab();
        String strC = c(iW);
        this._parsingContext.c(strC);
        this._currToken = JsonToken.FIELD_NAME;
        int iP = p();
        ac();
        if (iP == 34) {
            this.m = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return strC;
        }
        if (iP == 45) {
            jsonTokenI = i();
        } else if (iP == 46) {
            jsonTokenI = j();
        } else if (iP == 91) {
            jsonTokenI = JsonToken.START_ARRAY;
        } else if (iP == 102) {
            e();
            jsonTokenI = JsonToken.VALUE_FALSE;
        } else if (iP == 110) {
            g();
            jsonTokenI = JsonToken.VALUE_NULL;
        } else if (iP == 116) {
            h();
            jsonTokenI = JsonToken.VALUE_TRUE;
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
                    jsonTokenI = d(iP);
                    break;
                default:
                    jsonTokenI = b(iP);
                    break;
            }
        } else {
            jsonTokenI = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonTokenI;
        return strC;
    }

    private final int q(int i) throws IOException {
        byte[] bArr = this.f53290a;
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 == 58) {
            int i3 = i + 2;
            byte b3 = bArr[i2];
            if (b3 > 32) {
                if (b3 != 47 && b3 != 35) {
                    this._inputPtr = i3;
                    return b3;
                }
            } else if (b3 == 32 || b3 == 9) {
                int i4 = i + 3;
                byte b4 = bArr[i3];
                if (b4 > 32 && b4 != 47 && b4 != 35) {
                    this._inputPtr = i4;
                    return b4;
                }
                i3 = i4;
            }
            this._inputPtr = i3 - 1;
            return e(true);
        }
        if (b2 == 32 || b2 == 9) {
            b2 = bArr[i2];
            i2 = i + 2;
        }
        if (b2 == 58) {
            int i5 = i2 + 1;
            byte b5 = bArr[i2];
            if (b5 > 32) {
                if (b5 != 47 && b5 != 35) {
                    this._inputPtr = i5;
                    return b5;
                }
            } else if (b5 == 32 || b5 == 9) {
                int i6 = i2 + 2;
                byte b6 = bArr[i5];
                if (b6 > 32 && b6 != 47 && b6 != 35) {
                    this._inputPtr = i6;
                    return b6;
                }
                i5 = i6;
            }
            this._inputPtr = i5 - 1;
            return e(true);
        }
        this._inputPtr = i2 - 1;
        return e(false);
    }

    private final void l(int i) throws IOException {
        this._currToken = JsonToken.FIELD_NAME;
        ac();
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
            e();
            this._nextToken = JsonToken.VALUE_FALSE;
            return;
        }
        if (i == 110) {
            g();
            this._nextToken = JsonToken.VALUE_NULL;
            return;
        }
        if (i == 116) {
            h();
            this._nextToken = JsonToken.VALUE_TRUE;
            return;
        }
        if (i == 123) {
            this._nextToken = JsonToken.START_OBJECT;
            return;
        }
        if (i == 45) {
            this._nextToken = i();
            return;
        }
        if (i == 46) {
            this._nextToken = j();
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
                this._nextToken = b(i);
                break;
        }
    }

    private final boolean a(int i, SerializableString serializableString) throws IOException {
        JsonToken jsonTokenI;
        String strC = c(i);
        this._parsingContext.c(strC);
        boolean zEquals = strC.equals(serializableString.getValue());
        this._currToken = JsonToken.FIELD_NAME;
        int iP = p();
        ac();
        if (iP == 34) {
            this.m = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return zEquals;
        }
        if (iP == 45) {
            jsonTokenI = i();
        } else if (iP == 46) {
            jsonTokenI = j();
        } else if (iP == 91) {
            jsonTokenI = JsonToken.START_ARRAY;
        } else if (iP == 102) {
            e();
            jsonTokenI = JsonToken.VALUE_FALSE;
        } else if (iP == 110) {
            g();
            jsonTokenI = JsonToken.VALUE_NULL;
        } else if (iP == 116) {
            h();
            jsonTokenI = JsonToken.VALUE_TRUE;
        } else if (iP == 123) {
            jsonTokenI = JsonToken.START_OBJECT;
        } else {
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
                    jsonTokenI = d(iP);
                    break;
                default:
                    jsonTokenI = b(iP);
                    break;
            }
        }
        this._nextToken = jsonTokenI;
        return zEquals;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextTextValue() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this.m) {
                    this.m = false;
                    return b();
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
    public int nextIntValue(int i) throws IOException {
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
    public long nextLongValue(long j) throws IOException {
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

    protected final JsonToken j() throws IOException {
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return b(46);
        }
        return e(this._textBuffer.e(), 0, 46, false, 0);
    }

    protected JsonToken d(int i) throws IOException {
        char[] cArrE = this._textBuffer.e();
        if (i == 48) {
            i = z();
        }
        cArrE[0] = (char) i;
        int iMin = Math.min(this._inputEnd, (this._inputPtr + cArrE.length) - 1);
        int i2 = 1;
        int i3 = 1;
        while (this._inputPtr < iMin) {
            byte[] bArr = this.f53290a;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            int i5 = bArr[i4] & 255;
            if (i5 < 48 || i5 > 57) {
                if (i5 == 46 || i5 == 101 || i5 == 69) {
                    return e(cArrE, i2, i5, false, i3);
                }
                this._inputPtr--;
                this._textBuffer.e(i2);
                if (this._parsingContext.inRoot()) {
                    s(i5);
                }
                return resetInt(false, i3);
            }
            i3++;
            cArrE[i2] = (char) i5;
            i2++;
        }
        return c(cArrE, i2, false, i3);
    }

    protected JsonToken i() throws IOException {
        char[] cArrE = this._textBuffer.e();
        cArrE[0] = '-';
        if (this._inputPtr >= this._inputEnd) {
            d();
        }
        byte[] bArr = this.f53290a;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int iZ = bArr[i] & 255;
        if (iZ <= 48) {
            if (iZ != 48) {
                return d(iZ, true);
            }
            iZ = z();
        } else if (iZ > 57) {
            return d(iZ, true);
        }
        cArrE[1] = (char) iZ;
        int i2 = 2;
        int iMin = Math.min(this._inputEnd, (this._inputPtr + cArrE.length) - 2);
        int i3 = 1;
        while (this._inputPtr < iMin) {
            byte[] bArr2 = this.f53290a;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            int i5 = bArr2[i4] & 255;
            if (i5 < 48 || i5 > 57) {
                if (i5 == 46 || i5 == 101 || i5 == 69) {
                    return e(cArrE, i2, i5, true, i3);
                }
                this._inputPtr--;
                this._textBuffer.e(i2);
                if (this._parsingContext.inRoot()) {
                    s(i5);
                }
                return resetInt(true, i3);
            }
            i3++;
            cArrE[i2] = (char) i5;
            i2++;
        }
        return c(cArrE, i2, true, i3);
    }

    private final JsonToken c(char[] cArr, int i, boolean z, int i2) throws IOException {
        char[] cArrH = cArr;
        int i3 = i;
        int i4 = i2;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !a()) {
                this._textBuffer.e(i3);
                return resetInt(z, i4);
            }
            byte[] bArr = this.f53290a;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            int i6 = bArr[i5] & 255;
            if (i6 > 57 || i6 < 48) {
                if (i6 == 46 || i6 == 101 || i6 == 69) {
                    return e(cArrH, i3, i6, z, i4);
                }
                this._inputPtr--;
                this._textBuffer.e(i3);
                if (this._parsingContext.inRoot()) {
                    s(this.f53290a[this._inputPtr] & 255);
                }
                return resetInt(z, i4);
            }
            if (i3 >= cArrH.length) {
                i3 = 0;
                cArrH = this._textBuffer.h();
            }
            cArrH[i3] = (char) i6;
            i4++;
            i3++;
        }
    }

    private final int z() throws IOException {
        int i;
        if ((this._inputPtr >= this._inputEnd && !a()) || (i = this.f53290a[this._inputPtr] & 255) < 48 || i > 57) {
            return 48;
        }
        if ((this._features & t) == 0) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        this._inputPtr++;
        if (i != 48) {
            return i;
        }
        do {
            if (this._inputPtr >= this._inputEnd && !a()) {
                return i;
            }
            i = this.f53290a[this._inputPtr] & 255;
            if (i < 48 || i > 57) {
                return 48;
            }
            this._inputPtr++;
        } while (i == 48);
        return i;
    }

    private final JsonToken e(char[] cArr, int i, int i2, boolean z, int i3) throws IOException {
        int i4;
        boolean z2;
        int i5 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.h();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            i4 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !a()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.f53290a;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                i2 = bArr[i6] & 255;
                if (i2 < 48 || i2 > 57) {
                    z2 = false;
                    break;
                }
                i4++;
                if (i >= cArr.length) {
                    cArr = this._textBuffer.h();
                    i = 0;
                }
                cArr[i] = (char) i2;
                i++;
            }
            if (i4 == 0) {
                reportUnexpectedNumberChar(i2, "Decimal point not followed by a digit");
            }
        } else {
            i4 = 0;
            z2 = false;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.h();
                i = 0;
            }
            int i7 = i + 1;
            cArr[i] = (char) i2;
            if (this._inputPtr >= this._inputEnd) {
                d();
            }
            byte[] bArr2 = this.f53290a;
            int i8 = this._inputPtr;
            this._inputPtr = i8 + 1;
            int i9 = bArr2[i8] & 255;
            if (i9 == 45 || i9 == 43) {
                if (i7 >= cArr.length) {
                    cArr = this._textBuffer.h();
                    i7 = 0;
                }
                cArr[i7] = (char) i9;
                if (this._inputPtr >= this._inputEnd) {
                    d();
                }
                byte[] bArr3 = this.f53290a;
                int i10 = this._inputPtr;
                this._inputPtr = i10 + 1;
                i9 = bArr3[i10] & 255;
                i7++;
            }
            i2 = i9;
            int i11 = 0;
            while (true) {
                if (i2 >= 48 && i2 <= 57) {
                    i11++;
                    if (i7 >= cArr.length) {
                        cArr = this._textBuffer.h();
                        i7 = 0;
                    }
                    int i12 = i7 + 1;
                    cArr[i7] = (char) i2;
                    if (this._inputPtr >= this._inputEnd && !a()) {
                        i5 = i11;
                        z2 = true;
                        i = i12;
                        break;
                    }
                    byte[] bArr4 = this.f53290a;
                    int i13 = this._inputPtr;
                    this._inputPtr = i13 + 1;
                    i2 = bArr4[i13] & 255;
                    i7 = i12;
                } else {
                    i5 = i11;
                    i = i7;
                    break;
                }
            }
            if (i5 == 0) {
                reportUnexpectedNumberChar(i2, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                s(i2);
            }
        }
        this._textBuffer.e(i);
        return resetFloat(z, i3, i4, i5);
    }

    private final void s(int i) throws IOException {
        this._inputPtr++;
        if (i != 9) {
            if (i == 10) {
                this._currInputRow++;
                this._currInputRowStart = this._inputPtr;
            } else if (i == 13) {
                m();
            } else if (i != 32) {
                _reportMissingRootWS(i);
            }
        }
    }

    protected final String c(int i) throws IOException {
        if (i != 34) {
            return e(i);
        }
        if (this._inputPtr + 13 > this._inputEnd) {
            return o();
        }
        byte[] bArr = this.f53290a;
        int[] iArr = d;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        if (iArr[i3] != 0) {
            if (i3 == 34) {
                return "";
            }
            return a(0, i3, 0);
        }
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        int i5 = bArr[i4] & 255;
        if (iArr[i5] != 0) {
            if (i5 == 34) {
                return c(i3, 1);
            }
            return a(i3, i5, 1);
        }
        int i6 = (i3 << 8) | i5;
        int i7 = this._inputPtr;
        this._inputPtr = i7 + 1;
        int i8 = bArr[i7] & 255;
        if (iArr[i8] != 0) {
            if (i8 == 34) {
                return c(i6, 2);
            }
            return a(i6, i8, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        int i11 = bArr[i10] & 255;
        if (iArr[i11] != 0) {
            if (i11 == 34) {
                return c(i9, 3);
            }
            return a(i9, i11, 3);
        }
        int i12 = (i9 << 8) | i11;
        int i13 = this._inputPtr;
        this._inputPtr = i13 + 1;
        int i14 = bArr[i13] & 255;
        if (iArr[i14] == 0) {
            this.v = i12;
            return g(i14);
        }
        if (i14 == 34) {
            return c(i12, 4);
        }
        return a(i12, i14, 4);
    }

    protected final String g(int i) throws IOException {
        byte[] bArr = this.f53290a;
        int[] iArr = d;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        if (iArr[i3] != 0) {
            if (i3 == 34) {
                return b(this.v, i, 1);
            }
            return e(this.v, i, i3, 1);
        }
        int i4 = (i << 8) | i3;
        int i5 = this._inputPtr;
        this._inputPtr = i5 + 1;
        int i6 = bArr[i5] & 255;
        if (iArr[i6] != 0) {
            if (i6 == 34) {
                return b(this.v, i4, 2);
            }
            return e(this.v, i4, i6, 2);
        }
        int i7 = (i4 << 8) | i6;
        int i8 = this._inputPtr;
        this._inputPtr = i8 + 1;
        int i9 = bArr[i8] & 255;
        if (iArr[i9] != 0) {
            if (i9 == 34) {
                return b(this.v, i7, 3);
            }
            return e(this.v, i7, i9, 3);
        }
        int i10 = (i7 << 8) | i9;
        int i11 = this._inputPtr;
        this._inputPtr = i11 + 1;
        int i12 = bArr[i11] & 255;
        if (iArr[i12] == 0) {
            return e(i12, i10);
        }
        if (i12 == 34) {
            return b(this.v, i10, 4);
        }
        return e(this.v, i10, i12, 4);
    }

    protected final String e(int i, int i2) throws IOException {
        byte[] bArr = this.f53290a;
        int[] iArr = d;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        int i4 = bArr[i3] & 255;
        if (iArr[i4] != 0) {
            if (i4 == 34) {
                return c(this.v, i2, i, 1);
            }
            return c(this.v, i2, i, i4, 1);
        }
        int i5 = (i << 8) | i4;
        int i6 = this._inputPtr;
        this._inputPtr = i6 + 1;
        int i7 = bArr[i6] & 255;
        if (iArr[i7] != 0) {
            if (i7 == 34) {
                return c(this.v, i2, i5, 2);
            }
            return c(this.v, i2, i5, i7, 2);
        }
        int i8 = (i5 << 8) | i7;
        int i9 = this._inputPtr;
        this._inputPtr = i9 + 1;
        int i10 = bArr[i9] & 255;
        if (iArr[i10] != 0) {
            if (i10 == 34) {
                return c(this.v, i2, i8, 3);
            }
            return c(this.v, i2, i8, i10, 3);
        }
        int i11 = (i8 << 8) | i10;
        int i12 = this._inputPtr;
        this._inputPtr = i12 + 1;
        int i13 = bArr[i12] & 255;
        if (iArr[i13] == 0) {
            return d(i13, i2, i11);
        }
        if (i13 == 34) {
            return c(this.v, i2, i11, 4);
        }
        return c(this.v, i2, i11, i13, 4);
    }

    protected final String d(int i, int i2, int i3) throws IOException {
        int[] iArr = this.h;
        iArr[0] = this.v;
        iArr[1] = i2;
        iArr[2] = i3;
        byte[] bArr = this.f53290a;
        int[] iArr2 = d;
        int i4 = i;
        int i5 = 3;
        while (this._inputPtr + 4 <= this._inputEnd) {
            int i6 = this._inputPtr;
            this._inputPtr = i6 + 1;
            int i7 = bArr[i6] & 255;
            if (iArr2[i7] != 0) {
                if (i7 == 34) {
                    return e(this.h, i5, i4, 1);
                }
                return a(this.h, i5, i4, i7, 1);
            }
            int i8 = (i4 << 8) | i7;
            int i9 = this._inputPtr;
            this._inputPtr = i9 + 1;
            int i10 = bArr[i9] & 255;
            if (iArr2[i10] != 0) {
                if (i10 == 34) {
                    return e(this.h, i5, i8, 2);
                }
                return a(this.h, i5, i8, i10, 2);
            }
            int i11 = (i8 << 8) | i10;
            int i12 = this._inputPtr;
            this._inputPtr = i12 + 1;
            int i13 = bArr[i12] & 255;
            if (iArr2[i13] != 0) {
                if (i13 == 34) {
                    return e(this.h, i5, i11, 3);
                }
                return a(this.h, i5, i11, i13, 3);
            }
            int i14 = (i11 << 8) | i13;
            int i15 = this._inputPtr;
            this._inputPtr = i15 + 1;
            int i16 = bArr[i15] & 255;
            if (iArr2[i16] != 0) {
                if (i16 == 34) {
                    return e(this.h, i5, i14, 4);
                }
                return a(this.h, i5, i14, i16, 4);
            }
            int[] iArr3 = this.h;
            if (i5 >= iArr3.length) {
                this.h = growArrayBy(iArr3, i5);
            }
            this.h[i5] = i14;
            i5++;
            i4 = i16;
        }
        return a(this.h, i5, 0, i4, 0);
    }

    protected String o() throws IOException {
        if (this._inputPtr >= this._inputEnd && !a()) {
            _reportInvalidEOF(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this.f53290a;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 34) {
            return "";
        }
        return a(this.h, 0, 0, i2, 0);
    }

    private final String a(int i, int i2, int i3) throws IOException {
        return a(this.h, 0, i, i2, i3);
    }

    private final String e(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = this.h;
        iArr[0] = i;
        return a(iArr, 1, i2, i3, i4);
    }

    private final String c(int i, int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = this.h;
        iArr[0] = i;
        iArr[1] = i2;
        return a(iArr, 2, i3, i4, i5);
    }

    protected final String a(int[] iArr, int i, int i2, int i3, int i4) throws IOException {
        int[] iArr2 = d;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    _throwUnquotedSpace(i3, "name");
                } else {
                    i3 = _decodeEscaped();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = growArrayBy(iArr, iArr.length);
                            this.h = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    int i6 = i2 << 8;
                    if (i3 < 2048) {
                        i2 = i6 | (i3 >> 6) | PsExtractor.AUDIO_STREAM;
                        i4++;
                    } else {
                        int i7 = i6 | (i3 >> 12) | 224;
                        int i8 = i4 + 1;
                        if (i8 >= 4) {
                            if (i >= iArr.length) {
                                iArr = growArrayBy(iArr, iArr.length);
                                this.h = iArr;
                            }
                            iArr[i] = i7;
                            i++;
                            i8 = 0;
                        } else {
                            i5 = i7;
                        }
                        i2 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        i4 = i8 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = growArrayBy(iArr, iArr.length);
                    this.h = iArr;
                }
                iArr[i] = i2;
                i++;
                i2 = i3;
                i4 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !a()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this.f53290a;
            int i9 = this._inputPtr;
            this._inputPtr = i9 + 1;
            i3 = bArr[i9] & 255;
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                iArr = growArrayBy(iArr, iArr.length);
                this.h = iArr;
            }
            iArr[i] = a(i2, i4);
            i++;
        }
        String strB = this.g.b(iArr, i);
        return strB == null ? e(iArr, i, i4) : strB;
    }

    protected String e(int i) throws IOException {
        if (i == 39 && (this._features & o) != 0) {
            return f();
        }
        if ((this._features & n) == 0) {
            _reportUnexpectedChar((char) a(i), "was expecting double-quote to start field name");
        }
        int[] iArrF = wz.f();
        if (iArrF[i] != 0) {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArrGrowArrayBy = this.h;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < 4) {
                i2++;
                i4 = i | (i4 << 8);
            } else {
                if (i3 >= iArrGrowArrayBy.length) {
                    iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                    this.h = iArrGrowArrayBy;
                }
                iArrGrowArrayBy[i3] = i4;
                i3++;
                i4 = i;
                i2 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !a()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            i = this.f53290a[this._inputPtr] & 255;
            if (iArrF[i] != 0) {
                break;
            }
            this._inputPtr++;
        }
        if (i2 > 0) {
            if (i3 >= iArrGrowArrayBy.length) {
                int[] iArrGrowArrayBy2 = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                this.h = iArrGrowArrayBy2;
                iArrGrowArrayBy = iArrGrowArrayBy2;
            }
            iArrGrowArrayBy[i3] = i4;
            i3++;
        }
        String strB = this.g.b(iArrGrowArrayBy, i3);
        return strB == null ? e(iArrGrowArrayBy, i3, i2) : strB;
    }

    protected String f() throws IOException {
        if (this._inputPtr >= this._inputEnd && !a()) {
            _reportInvalidEOF(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this.f53290a;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i_decodeEscaped = bArr[i] & 255;
        if (i_decodeEscaped == 39) {
            return "";
        }
        int[] iArrGrowArrayBy = this.h;
        int[] iArr = d;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i_decodeEscaped != 39) {
            if (iArr[i_decodeEscaped] != 0 && i_decodeEscaped != 34) {
                if (i_decodeEscaped != 92) {
                    _throwUnquotedSpace(i_decodeEscaped, "name");
                } else {
                    i_decodeEscaped = _decodeEscaped();
                }
                if (i_decodeEscaped > 127) {
                    if (i2 >= 4) {
                        if (i3 >= iArrGrowArrayBy.length) {
                            iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                            this.h = iArrGrowArrayBy;
                        }
                        iArrGrowArrayBy[i3] = i4;
                        i3++;
                        i2 = 0;
                        i4 = 0;
                    }
                    int i5 = i4 << 8;
                    if (i_decodeEscaped < 2048) {
                        i4 = i5 | (i_decodeEscaped >> 6) | PsExtractor.AUDIO_STREAM;
                        i2++;
                    } else {
                        int i6 = i5 | (i_decodeEscaped >> 12) | 224;
                        int i7 = i2 + 1;
                        if (i7 >= 4) {
                            if (i3 >= iArrGrowArrayBy.length) {
                                iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                                this.h = iArrGrowArrayBy;
                            }
                            iArrGrowArrayBy[i3] = i6;
                            i3++;
                            i7 = 0;
                            i6 = 0;
                        }
                        i4 = (i6 << 8) | ((i_decodeEscaped >> 6) & 63) | 128;
                        i2 = i7 + 1;
                    }
                    i_decodeEscaped = (i_decodeEscaped & 63) | 128;
                }
            }
            if (i2 < 4) {
                i2++;
                i4 = i_decodeEscaped | (i4 << 8);
            } else {
                if (i3 >= iArrGrowArrayBy.length) {
                    iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                    this.h = iArrGrowArrayBy;
                }
                iArrGrowArrayBy[i3] = i4;
                i3++;
                i4 = i_decodeEscaped;
                i2 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !a()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr2 = this.f53290a;
            int i8 = this._inputPtr;
            this._inputPtr = i8 + 1;
            i_decodeEscaped = bArr2[i8] & 255;
        }
        if (i2 > 0) {
            if (i3 >= iArrGrowArrayBy.length) {
                int[] iArrGrowArrayBy2 = growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                this.h = iArrGrowArrayBy2;
                iArrGrowArrayBy = iArrGrowArrayBy2;
            }
            iArrGrowArrayBy[i3] = a(i4, i2);
            i3++;
        }
        String strB = this.g.b(iArrGrowArrayBy, i3);
        return strB == null ? e(iArrGrowArrayBy, i3, i2) : strB;
    }

    private final String c(int i, int i2) throws wn {
        int iA = a(i, i2);
        String strB = this.g.b(iA);
        if (strB != null) {
            return strB;
        }
        int[] iArr = this.h;
        iArr[0] = iA;
        return e(iArr, 1, i2);
    }

    private final String b(int i, int i2, int i3) throws wn {
        int iA = a(i2, i3);
        String strD = this.g.d(i, iA);
        if (strD != null) {
            return strD;
        }
        int[] iArr = this.h;
        iArr[0] = i;
        iArr[1] = iA;
        return e(iArr, 2, i3);
    }

    private final String c(int i, int i2, int i3, int i4) throws wn {
        int iA = a(i3, i4);
        String strE = this.g.e(i, i2, iA);
        if (strE != null) {
            return strE;
        }
        int[] iArr = this.h;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = a(iA, i4);
        return e(iArr, 3, i4);
    }

    private final String e(int[] iArr, int i, int i2, int i3) throws wn {
        if (i >= iArr.length) {
            iArr = growArrayBy(iArr, iArr.length);
            this.h = iArr;
        }
        int i4 = i + 1;
        iArr[i] = a(i2, i3);
        String strB = this.g.b(iArr, i4);
        return strB == null ? e(iArr, i4, i3) : strB;
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
    private final String e(int[] iArr, int i, int i2) throws wn {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = ((i << 2) - 4) + i2;
        if (i2 < 4) {
            int i13 = i - 1;
            i3 = iArr[i13];
            iArr[i13] = i3 << ((4 - i2) << 3);
        } else {
            i3 = 0;
        }
        char[] cArrE = this._textBuffer.e();
        int i14 = 0;
        int i15 = 0;
        while (i14 < i12) {
            int i16 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
            int i17 = i16 & 255;
            int i18 = i14 + 1;
            if (i17 > 127) {
                if ((i16 & 224) == 192) {
                    i4 = i16 & 31;
                } else {
                    if ((i16 & 240) == 224) {
                        i4 = i16 & 15;
                        i5 = 2;
                    } else if ((i16 & 248) == 240) {
                        i4 = i16 & 7;
                        i5 = 3;
                    } else {
                        f(i17);
                        i4 = 1;
                    }
                    if (i18 + i5 > i12) {
                        _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                    }
                    i6 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                    i18 = i14 + 2;
                    if ((i6 & PsExtractor.AUDIO_STREAM) != 128) {
                        i(i6);
                    }
                    i7 = (i4 << 6) | (i6 & 63);
                    if (i5 > 1) {
                        i9 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                        i18 = i14 + 3;
                        if ((i9 & PsExtractor.AUDIO_STREAM) != 128) {
                            i(i9);
                        }
                        i10 = (i7 << 6) | (i9 & 63);
                        if (i5 > 2) {
                            i11 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                            i18 = i14 + 4;
                            if ((i11 & PsExtractor.AUDIO_STREAM) != 128) {
                                i(i11 & 255);
                            }
                            i7 = (i10 << 6) | (i11 & 63);
                            i17 = i7;
                            i8 = 2;
                        } else {
                            i17 = i10;
                            i8 = 2;
                        }
                    } else {
                        i17 = i7;
                        i8 = 2;
                    }
                    if (i5 > i8) {
                        int i19 = i17 - 65536;
                        if (i15 >= cArrE.length) {
                            cArrE = this._textBuffer.i();
                        }
                        cArrE[i15] = (char) ((i19 >> 10) + GeneratorBase.SURR1_FIRST);
                        i17 = (i19 & 1023) | 56320;
                        i15++;
                    }
                }
                i5 = 1;
                if (i18 + i5 > i12) {
                    _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                }
                i6 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                i18 = i14 + 2;
                if ((i6 & PsExtractor.AUDIO_STREAM) != 128) {
                    i(i6);
                }
                i7 = (i4 << 6) | (i6 & 63);
                if (i5 > 1) {
                    i9 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                    i18 = i14 + 3;
                    if ((i9 & PsExtractor.AUDIO_STREAM) != 128) {
                        i(i9);
                    }
                    i10 = (i7 << 6) | (i9 & 63);
                    if (i5 > 2) {
                        i11 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                        i18 = i14 + 4;
                        if ((i11 & PsExtractor.AUDIO_STREAM) != 128) {
                            i(i11 & 255);
                        }
                        i7 = (i10 << 6) | (i11 & 63);
                        i17 = i7;
                        i8 = 2;
                    } else {
                        i17 = i10;
                        i8 = 2;
                    }
                } else {
                    i17 = i7;
                    i8 = 2;
                }
                if (i5 > i8) {
                    int i110 = i17 - 65536;
                    if (i15 >= cArrE.length) {
                        cArrE = this._textBuffer.i();
                    }
                    cArrE[i15] = (char) ((i110 >> 10) + GeneratorBase.SURR1_FIRST);
                    i17 = (i110 & 1023) | 56320;
                    i15++;
                }
            }
            i14 = i18;
            if (i15 >= cArrE.length) {
                cArrE = this._textBuffer.i();
            }
            cArrE[i15] = (char) i17;
            i15++;
        }
        String str = new String(cArrE, 0, i15);
        if (i2 < 4) {
            iArr[i - 1] = i3;
        }
        return this.g.b(str, iArr, i);
    }

    protected void d() throws IOException {
        if (a()) {
            return;
        }
        _reportInvalidEOF();
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _finishString() throws IOException {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            d();
            i = this._inputPtr;
        }
        char[] cArrE = this._textBuffer.e();
        int[] iArr = s;
        int iMin = Math.min(this._inputEnd, cArrE.length + i);
        byte[] bArr = this.f53290a;
        int i2 = 0;
        while (i < iMin) {
            int i3 = bArr[i] & 255;
            if (iArr[i3] != 0) {
                if (i3 != 34) {
                    break;
                }
                this._inputPtr = i + 1;
                this._textBuffer.e(i2);
                return;
            }
            i++;
            cArrE[i2] = (char) i3;
            i2++;
        }
        this._inputPtr = i;
        c(cArrE, i2);
    }

    protected String b() throws IOException {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            d();
            i = this._inputPtr;
        }
        char[] cArrE = this._textBuffer.e();
        int[] iArr = s;
        int iMin = Math.min(this._inputEnd, cArrE.length + i);
        byte[] bArr = this.f53290a;
        int i2 = 0;
        while (i < iMin) {
            int i3 = bArr[i] & 255;
            if (iArr[i3] != 0) {
                if (i3 != 34) {
                    break;
                }
                this._inputPtr = i + 1;
                return this._textBuffer.c(i2);
            }
            i++;
            cArrE[i2] = (char) i3;
            i2++;
        }
        this._inputPtr = i;
        c(cArrE, i2);
        return this._textBuffer.d();
    }

    private final void c(char[] cArr, int i) throws IOException {
        int[] iArr = s;
        byte[] bArr = this.f53290a;
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                d();
                i2 = this._inputPtr;
            }
            int i3 = 0;
            if (i >= cArr.length) {
                cArr = this._textBuffer.h();
                i = 0;
            }
            int iMin = Math.min(this._inputEnd, (cArr.length - i) + i2);
            while (true) {
                if (i2 < iMin) {
                    int i4 = i2 + 1;
                    int i_decodeEscaped = bArr[i2] & 255;
                    if (iArr[i_decodeEscaped] != 0) {
                        this._inputPtr = i4;
                        if (i_decodeEscaped != 34) {
                            int i5 = iArr[i_decodeEscaped];
                            if (i5 == 1) {
                                i_decodeEscaped = _decodeEscaped();
                            } else if (i5 == 2) {
                                i_decodeEscaped = o(i_decodeEscaped);
                            } else if (i5 == 3) {
                                i_decodeEscaped = this._inputEnd - this._inputPtr >= 2 ? n(i_decodeEscaped) : k(i_decodeEscaped);
                            } else if (i5 == 4) {
                                int iM = m(i_decodeEscaped);
                                int i6 = i + 1;
                                cArr[i] = (char) ((iM >> 10) | GeneratorBase.SURR1_FIRST);
                                if (i6 >= cArr.length) {
                                    cArr = this._textBuffer.h();
                                    i = 0;
                                } else {
                                    i = i6;
                                }
                                i_decodeEscaped = (iM & 1023) | 56320;
                            } else if (i_decodeEscaped < 32) {
                                _throwUnquotedSpace(i_decodeEscaped, "string value");
                            } else {
                                h(i_decodeEscaped);
                            }
                            if (i >= cArr.length) {
                                cArr = this._textBuffer.h();
                            } else {
                                i3 = i;
                            }
                            i = i3 + 1;
                            cArr[i3] = (char) i_decodeEscaped;
                            break;
                        }
                        this._textBuffer.e(i);
                        return;
                    }
                    cArr[i] = (char) i_decodeEscaped;
                    i++;
                    i2 = i4;
                } else {
                    this._inputPtr = i2;
                    break;
                }
            }
        }
    }

    protected void n() throws IOException {
        this.m = false;
        int[] iArr = s;
        byte[] bArr = this.f53290a;
        while (true) {
            int i = this._inputPtr;
            int i2 = this._inputEnd;
            if (i >= i2) {
                d();
                i = this._inputPtr;
                i2 = this._inputEnd;
            }
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    int i4 = bArr[i] & 255;
                    if (iArr[i4] != 0) {
                        this._inputPtr = i3;
                        if (i4 != 34) {
                            int i5 = iArr[i4];
                            if (i5 == 1) {
                                _decodeEscaped();
                                break;
                            }
                            if (i5 == 2) {
                                y();
                                break;
                            }
                            if (i5 == 3) {
                                u();
                                break;
                            }
                            if (i5 == 4) {
                                p(i4);
                                break;
                            } else if (i4 < 32) {
                                _throwUnquotedSpace(i4, "string value");
                                break;
                            } else {
                                h(i4);
                                break;
                            }
                        }
                        return;
                    }
                    i = i3;
                } else {
                    this._inputPtr = i;
                    break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a1  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r3._parsingContext.inArray() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r3._parsingContext.inRoot() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if ((r3._features & defpackage.xs.k) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r3._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected JsonToken b(int i) throws IOException {
        if (i == 39) {
            if ((this._features & o) != 0) {
                return c();
            }
        } else if (i == 73) {
            b("Infinity", 1);
            if ((this._features & q) != 0) {
                return resetAsNaN("Infinity", Double.POSITIVE_INFINITY);
            }
            _reportError("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        } else if (i == 78) {
            b("NaN", 1);
            if ((this._features & q) != 0) {
                return resetAsNaN("NaN", Double.NaN);
            }
            _reportError("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        } else if (i != 93) {
            if (i == 125) {
                _reportUnexpectedChar(i, "expected a value");
                if ((this._features & o) != 0) {
                    return c();
                }
            } else if (i == 43) {
                if (this._inputPtr >= this._inputEnd && !a()) {
                    _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
                }
                byte[] bArr = this.f53290a;
                int i2 = this._inputPtr;
                this._inputPtr = i2 + 1;
                return d(bArr[i2] & 255, false);
            }
        }
        if (Character.isJavaIdentifierStart(i)) {
            a("" + ((char) i), _validJsonTokenList());
        }
        _reportUnexpectedChar(i, "expected a valid value " + _validJsonValueList());
        return null;
    }

    protected JsonToken c() throws IOException {
        char[] cArrE = this._textBuffer.e();
        int[] iArr = s;
        byte[] bArr = this.f53290a;
        int i = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                d();
            }
            if (i >= cArrE.length) {
                cArrE = this._textBuffer.h();
                i = 0;
            }
            int i2 = this._inputEnd;
            int length = this._inputPtr + (cArrE.length - i);
            if (length < i2) {
                i2 = length;
            }
            while (this._inputPtr < i2) {
                int i3 = this._inputPtr;
                this._inputPtr = i3 + 1;
                int i_decodeEscaped = bArr[i3] & 255;
                if (i_decodeEscaped != 39) {
                    int i4 = iArr[i_decodeEscaped];
                    if (i4 == 0 || i_decodeEscaped == 34) {
                        cArrE[i] = (char) i_decodeEscaped;
                        i++;
                    } else {
                        if (i4 == 1) {
                            i_decodeEscaped = _decodeEscaped();
                        } else if (i4 == 2) {
                            i_decodeEscaped = o(i_decodeEscaped);
                        } else if (i4 != 3) {
                            if (i4 == 4) {
                                int iM = m(i_decodeEscaped);
                                int i5 = i + 1;
                                cArrE[i] = (char) ((iM >> 10) | GeneratorBase.SURR1_FIRST);
                                if (i5 >= cArrE.length) {
                                    cArrE = this._textBuffer.h();
                                    i = 0;
                                } else {
                                    i = i5;
                                }
                                i_decodeEscaped = (iM & 1023) | 56320;
                            } else {
                                if (i_decodeEscaped < 32) {
                                    _throwUnquotedSpace(i_decodeEscaped, "string value");
                                }
                                h(i_decodeEscaped);
                            }
                        } else if (this._inputEnd - this._inputPtr >= 2) {
                            i_decodeEscaped = n(i_decodeEscaped);
                        } else {
                            i_decodeEscaped = k(i_decodeEscaped);
                        }
                        if (i >= cArrE.length) {
                            cArrE = this._textBuffer.h();
                            i = 0;
                        }
                        cArrE[i] = (char) i_decodeEscaped;
                        i++;
                        break;
                    }
                } else {
                    this._textBuffer.e(i);
                    return JsonToken.VALUE_STRING;
                }
            }
        }
    }

    protected JsonToken d(int i, boolean z) throws IOException {
        String str;
        while (i == 73) {
            if (this._inputPtr >= this._inputEnd && !a()) {
                _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this.f53290a;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            i = bArr[i2];
            if (i != 78) {
                if (i != 110) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            b(str, 3);
            if ((this._features & q) != 0) {
                return resetAsNaN(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            _reportError("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
        }
        reportUnexpectedNumberChar(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    protected final void h() throws IOException {
        int i;
        int i2 = this._inputPtr;
        int i3 = i2 + 3;
        if (i3 < this._inputEnd) {
            byte[] bArr = this.f53290a;
            if (bArr[i2] == 114 && bArr[i2 + 1] == 117 && bArr[i2 + 2] == 101 && ((i = bArr[i3] & 255) < 48 || i == 93 || i == 125)) {
                this._inputPtr = i3;
                return;
            }
        }
        a("true", 1);
    }

    protected final void e() throws IOException {
        int i;
        int i2 = this._inputPtr;
        int i3 = i2 + 4;
        if (i3 < this._inputEnd) {
            byte[] bArr = this.f53290a;
            if (bArr[i2] == 97 && bArr[i2 + 1] == 108 && bArr[i2 + 2] == 115 && bArr[i2 + 3] == 101 && ((i = bArr[i3] & 255) < 48 || i == 93 || i == 125)) {
                this._inputPtr = i3;
                return;
            }
        }
        a("false", 1);
    }

    protected final void g() throws IOException {
        int i;
        int i2 = this._inputPtr;
        int i3 = i2 + 3;
        if (i3 < this._inputEnd) {
            byte[] bArr = this.f53290a;
            if (bArr[i2] == 117 && bArr[i2 + 1] == 108 && bArr[i2 + 2] == 108 && ((i = bArr[i3] & 255) < 48 || i == 93 || i == 125)) {
                this._inputPtr = i3;
                return;
            }
        }
        a(Constants.NULL, 1);
    }

    protected final void b(String str, int i) throws IOException {
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            a(str, i);
            return;
        }
        do {
            if (this.f53290a[this._inputPtr] != str.charAt(i)) {
                e(str.substring(0, i));
            }
            this._inputPtr++;
            i++;
        } while (i < length);
        int i2 = this.f53290a[this._inputPtr] & 255;
        if (i2 < 48 || i2 == 93 || i2 == 125) {
            return;
        }
        d(str, i, i2);
    }

    private final void a(String str, int i) throws IOException {
        int i2;
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !a()) || this.f53290a[this._inputPtr] != str.charAt(i)) {
                e(str.substring(0, i));
            }
            this._inputPtr++;
            i++;
        } while (i < length);
        if ((this._inputPtr < this._inputEnd || a()) && (i2 = this.f53290a[this._inputPtr] & 255) >= 48 && i2 != 93 && i2 != 125) {
            d(str, i, i2);
        }
    }

    private final void d(String str, int i, int i2) throws IOException {
        if (Character.isJavaIdentifierPart((char) a(i2))) {
            e(str.substring(0, i));
        }
    }

    private final int v() throws IOException {
        while (this._inputPtr < this._inputEnd) {
            byte[] bArr = this.f53290a;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            int i2 = bArr[i] & 255;
            if (i2 > 32) {
                if (i2 != 47 && i2 != 35) {
                    return i2;
                }
                this._inputPtr--;
                return x();
            }
            if (i2 != 32) {
                if (i2 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 == 13) {
                    m();
                } else if (i2 != 9) {
                    _throwInvalidSpace(i2);
                }
            }
        }
        return x();
    }

    private final int x() throws IOException {
        while (true) {
            if (this._inputPtr < this._inputEnd || a()) {
                byte[] bArr = this.f53290a;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                int i2 = bArr[i] & 255;
                if (i2 > 32) {
                    if (i2 == 47) {
                        r();
                    } else if (i2 != 35 || !ad()) {
                        return i2;
                    }
                } else if (i2 != 32) {
                    if (i2 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                    } else if (i2 == 13) {
                        m();
                    } else if (i2 != 9) {
                        _throwInvalidSpace(i2);
                    }
                }
            } else {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
        }
    }

    private final int w() throws IOException {
        if (this._inputPtr >= this._inputEnd && !a()) {
            return _eofAsNextChar();
        }
        byte[] bArr = this.f53290a;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 > 32) {
            if (i2 != 47 && i2 != 35) {
                return i2;
            }
            this._inputPtr--;
            return aa();
        }
        if (i2 != 32) {
            if (i2 == 10) {
                this._currInputRow++;
                this._currInputRowStart = this._inputPtr;
            } else if (i2 == 13) {
                m();
            } else if (i2 != 9) {
                _throwInvalidSpace(i2);
            }
        }
        while (this._inputPtr < this._inputEnd) {
            byte[] bArr2 = this.f53290a;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            int i4 = bArr2[i3] & 255;
            if (i4 > 32) {
                if (i4 != 47 && i4 != 35) {
                    return i4;
                }
                this._inputPtr--;
                return aa();
            }
            if (i4 != 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i4 == 13) {
                    m();
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
            }
        }
        return aa();
    }

    private final int aa() throws IOException {
        while (true) {
            if (this._inputPtr < this._inputEnd || a()) {
                byte[] bArr = this.f53290a;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                int i2 = bArr[i] & 255;
                if (i2 > 32) {
                    if (i2 == 47) {
                        r();
                    } else if (i2 != 35 || !ad()) {
                        return i2;
                    }
                } else if (i2 != 32) {
                    if (i2 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                    } else if (i2 == 13) {
                        m();
                    } else if (i2 != 9) {
                        _throwInvalidSpace(i2);
                    }
                }
            } else {
                return _eofAsNextChar();
            }
        }
    }

    private final int p() throws IOException {
        if (this._inputPtr + 4 >= this._inputEnd) {
            return e(false);
        }
        byte b2 = this.f53290a[this._inputPtr];
        if (b2 == 58) {
            byte[] bArr = this.f53290a;
            int i = this._inputPtr + 1;
            this._inputPtr = i;
            byte b3 = bArr[i];
            if (b3 > 32) {
                if (b3 == 47 || b3 == 35) {
                    return e(true);
                }
                this._inputPtr++;
                return b3;
            }
            if (b3 == 32 || b3 == 9) {
                byte[] bArr2 = this.f53290a;
                int i2 = this._inputPtr + 1;
                this._inputPtr = i2;
                byte b4 = bArr2[i2];
                if (b4 > 32) {
                    if (b4 == 47 || b4 == 35) {
                        return e(true);
                    }
                    this._inputPtr++;
                    return b4;
                }
            }
            return e(true);
        }
        if (b2 == 32 || b2 == 9) {
            byte[] bArr3 = this.f53290a;
            int i3 = this._inputPtr + 1;
            this._inputPtr = i3;
            b2 = bArr3[i3];
        }
        if (b2 == 58) {
            byte[] bArr4 = this.f53290a;
            int i4 = this._inputPtr + 1;
            this._inputPtr = i4;
            byte b5 = bArr4[i4];
            if (b5 > 32) {
                if (b5 == 47 || b5 == 35) {
                    return e(true);
                }
                this._inputPtr++;
                return b5;
            }
            if (b5 == 32 || b5 == 9) {
                byte[] bArr5 = this.f53290a;
                int i5 = this._inputPtr + 1;
                this._inputPtr = i5;
                byte b6 = bArr5[i5];
                if (b6 > 32) {
                    if (b6 == 47 || b6 == 35) {
                        return e(true);
                    }
                    this._inputPtr++;
                    return b6;
                }
            }
            return e(true);
        }
        return e(false);
    }

    private final int e(boolean z) throws IOException {
        while (true) {
            if (this._inputPtr < this._inputEnd || a()) {
                byte[] bArr = this.f53290a;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                int i2 = bArr[i] & 255;
                if (i2 > 32) {
                    if (i2 == 47) {
                        r();
                    } else if (i2 != 35 || !ad()) {
                        if (z) {
                            return i2;
                        }
                        if (i2 != 58) {
                            _reportUnexpectedChar(i2, "was expecting a colon to separate field name and value");
                        }
                        z = true;
                    }
                } else if (i2 != 32) {
                    if (i2 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                    } else if (i2 == 13) {
                        m();
                    } else if (i2 != 9) {
                        _throwInvalidSpace(i2);
                    }
                }
            } else {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", null);
                return -1;
            }
        }
    }

    private final void r() throws IOException {
        if ((this._features & l) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !a()) {
            _reportInvalidEOF(" in a comment", null);
        }
        byte[] bArr = this.f53290a;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 47) {
            s();
        } else if (i2 == 42) {
            t();
        } else {
            _reportUnexpectedChar(i2, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void t() throws IOException {
        int[] iArrD = wz.d();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !a()) {
                break;
            }
            byte[] bArr = this.f53290a;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            int i2 = bArr[i] & 255;
            int i3 = iArrD[i2];
            if (i3 != 0) {
                if (i3 == 2) {
                    y();
                } else if (i3 == 3) {
                    u();
                } else if (i3 == 4) {
                    p(i2);
                } else if (i3 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i3 == 13) {
                    m();
                } else if (i3 == 42) {
                    if (this._inputPtr >= this._inputEnd && !a()) {
                        break;
                    } else if (this.f53290a[this._inputPtr] == 47) {
                        this._inputPtr++;
                        return;
                    }
                } else {
                    h(i2);
                }
            }
        }
        _reportInvalidEOF(" in a comment", null);
    }

    private final boolean ad() throws IOException {
        if ((this._features & r) == 0) {
            return false;
        }
        s();
        return true;
    }

    private final void s() throws IOException {
        int[] iArrD = wz.d();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !a()) {
                return;
            }
            byte[] bArr = this.f53290a;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            int i2 = bArr[i] & 255;
            int i3 = iArrD[i2];
            if (i3 != 0) {
                if (i3 == 2) {
                    y();
                } else if (i3 == 3) {
                    u();
                } else if (i3 == 4) {
                    p(i2);
                } else if (i3 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                    return;
                } else if (i3 == 13) {
                    m();
                    return;
                } else if (i3 != 42 && i3 < 0) {
                    h(i2);
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        if (this._inputPtr >= this._inputEnd && !a()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        byte[] bArr = this.f53290a;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b2 = bArr[i];
        if (b2 == 34 || b2 == 47 || b2 == 92) {
            return (char) b2;
        }
        if (b2 == 98) {
            return '\b';
        }
        if (b2 == 102) {
            return '\f';
        }
        if (b2 == 110) {
            return '\n';
        }
        if (b2 == 114) {
            return '\r';
        }
        if (b2 == 116) {
            return '\t';
        }
        if (b2 != 117) {
            return _handleUnrecognizedCharacterEscape((char) a(b2));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this._inputPtr >= this._inputEnd && !a()) {
                _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            byte[] bArr2 = this.f53290a;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            byte b3 = bArr2[i4];
            int iC = wz.c(b3);
            if (iC < 0) {
                _reportUnexpectedChar(b3 & 255, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | iC;
        }
        return (char) i2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    protected int a(int i) throws IOException {
        int i2;
        char c2;
        int iAf;
        int i3;
        int iAf2;
        int iAf3;
        int i4 = i & 255;
        if (i4 <= 127) {
            return i4;
        }
        if ((i & 224) != 192) {
            if ((i & 240) == 224) {
                i2 = i & 15;
                c2 = 2;
            } else if ((i & 248) == 240) {
                i2 = i & 7;
                c2 = 3;
            } else {
                f(i4);
            }
            iAf = af();
            if ((iAf & PsExtractor.AUDIO_STREAM) != 128) {
                i(iAf & 255);
            }
            i3 = (i2 << 6) | (iAf & 63);
            if (c2 > 1) {
                iAf2 = af();
                if ((iAf2 & PsExtractor.AUDIO_STREAM) != 128) {
                    i(iAf2 & 255);
                }
                i3 = (i3 << 6) | (iAf2 & 63);
                if (c2 > 2) {
                    iAf3 = af();
                    if ((iAf3 & PsExtractor.AUDIO_STREAM) != 128) {
                        i(iAf3 & 255);
                    }
                    return (i3 << 6) | (iAf3 & 63);
                }
            }
            return i3;
        }
        i4 = i & 31;
        i2 = i4;
        c2 = 1;
        iAf = af();
        if ((iAf & PsExtractor.AUDIO_STREAM) != 128) {
            i(iAf & 255);
        }
        i3 = (i2 << 6) | (iAf & 63);
        if (c2 > 1) {
            iAf2 = af();
            if ((iAf2 & PsExtractor.AUDIO_STREAM) != 128) {
                i(iAf2 & 255);
            }
            i3 = (i3 << 6) | (iAf2 & 63);
            if (c2 > 2) {
                iAf3 = af();
                if ((iAf3 & PsExtractor.AUDIO_STREAM) != 128) {
                    i(iAf3 & 255);
                }
                return (i3 << 6) | (iAf3 & 63);
            }
        }
        return i3;
    }

    private final int o(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            d();
        }
        byte[] bArr = this.f53290a;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b2 = bArr[i2];
        if ((b2 & 192) != 128) {
            d(b2 & 255, this._inputPtr);
        }
        return ((i & 31) << 6) | (b2 & Utf8.REPLACEMENT_BYTE);
    }

    private final int k(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            d();
        }
        byte[] bArr = this.f53290a;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b2 = bArr[i2];
        if ((b2 & 192) != 128) {
            d(b2 & 255, this._inputPtr);
        }
        if (this._inputPtr >= this._inputEnd) {
            d();
        }
        byte[] bArr2 = this.f53290a;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b3 = bArr2[i3];
        if ((b3 & 192) != 128) {
            d(b3 & 255, this._inputPtr);
        }
        return ((((i & 15) << 6) | (b2 & Utf8.REPLACEMENT_BYTE)) << 6) | (b3 & Utf8.REPLACEMENT_BYTE);
    }

    private final int n(int i) throws IOException {
        byte[] bArr = this.f53290a;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b2 = bArr[i2];
        if ((b2 & 192) != 128) {
            d(b2 & 255, this._inputPtr);
        }
        byte[] bArr2 = this.f53290a;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b3 = bArr2[i3];
        if ((b3 & 192) != 128) {
            d(b3 & 255, this._inputPtr);
        }
        return ((((i & 15) << 6) | (b2 & Utf8.REPLACEMENT_BYTE)) << 6) | (b3 & Utf8.REPLACEMENT_BYTE);
    }

    private final int m(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            d();
        }
        byte[] bArr = this.f53290a;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b2 = bArr[i2];
        if ((b2 & 192) != 128) {
            d(b2 & 255, this._inputPtr);
        }
        if (this._inputPtr >= this._inputEnd) {
            d();
        }
        byte[] bArr2 = this.f53290a;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b3 = bArr2[i3];
        if ((b3 & 192) != 128) {
            d(b3 & 255, this._inputPtr);
        }
        if (this._inputPtr >= this._inputEnd) {
            d();
        }
        byte[] bArr3 = this.f53290a;
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        byte b4 = bArr3[i4];
        if ((b4 & 192) != 128) {
            d(b4 & 255, this._inputPtr);
        }
        return (((((((i & 7) << 6) | (b2 & Utf8.REPLACEMENT_BYTE)) << 6) | (b3 & Utf8.REPLACEMENT_BYTE)) << 6) | (b4 & Utf8.REPLACEMENT_BYTE)) - 65536;
    }

    private final void y() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            d();
        }
        byte[] bArr = this.f53290a;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b2 = bArr[i];
        if ((b2 & 192) != 128) {
            d(b2 & 255, this._inputPtr);
        }
    }

    private final void u() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            d();
        }
        byte[] bArr = this.f53290a;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b2 = bArr[i];
        if ((b2 & 192) != 128) {
            d(b2 & 255, this._inputPtr);
        }
        if (this._inputPtr >= this._inputEnd) {
            d();
        }
        byte[] bArr2 = this.f53290a;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b3 = bArr2[i2];
        if ((b3 & 192) != 128) {
            d(b3 & 255, this._inputPtr);
        }
    }

    private final void p(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            d();
        }
        byte[] bArr = this.f53290a;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b2 = bArr[i2];
        if ((b2 & 192) != 128) {
            d(b2 & 255, this._inputPtr);
        }
        if (this._inputPtr >= this._inputEnd) {
            d();
        }
        byte[] bArr2 = this.f53290a;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b3 = bArr2[i3];
        if ((b3 & 192) != 128) {
            d(b3 & 255, this._inputPtr);
        }
        if (this._inputPtr >= this._inputEnd) {
            d();
        }
        byte[] bArr3 = this.f53290a;
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        byte b4 = bArr3[i4];
        if ((b4 & 192) != 128) {
            d(b4 & 255, this._inputPtr);
        }
    }

    protected final void m() throws IOException {
        if ((this._inputPtr < this._inputEnd || a()) && this.f53290a[this._inputPtr] == 10) {
            this._inputPtr++;
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    private int af() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            d();
        }
        byte[] bArr = this.f53290a;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        return bArr[i] & 255;
    }

    protected void e(String str) throws IOException {
        a(str, _validJsonTokenList());
    }

    protected void a(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        do {
            if (this._inputPtr < this._inputEnd || a()) {
                byte[] bArr = this.f53290a;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                char cA = (char) a(bArr[i]);
                if (Character.isJavaIdentifierPart(cA)) {
                    sb.append(cA);
                }
            }
            _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
        } while (sb.length() < 256);
        sb.append("...");
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    protected void h(int i) throws wn {
        if (i < 32) {
            _throwInvalidSpace(i);
        }
        f(i);
    }

    protected void f(int i) throws wn {
        _reportError("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
    }

    protected void i(int i) throws wn {
        _reportError("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    protected void d(int i, int i2) throws wn {
        this._inputPtr = i2;
        i(i);
    }

    protected final byte[] a(Base64Variant base64Variant) throws IOException {
        xx xxVar_getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                d();
            }
            byte[] bArr = this.f53290a;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            int i2 = bArr[i] & 255;
            if (i2 > 32) {
                int iD = base64Variant.d(i2);
                if (iD < 0) {
                    if (i2 == 34) {
                        return xxVar_getByteArrayBuilder.i();
                    }
                    iD = _decodeBase64Escape(base64Variant, i2, 0);
                    if (iD < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    d();
                }
                byte[] bArr2 = this.f53290a;
                int i3 = this._inputPtr;
                this._inputPtr = i3 + 1;
                int i4 = bArr2[i3] & 255;
                int iD2 = base64Variant.d(i4);
                if (iD2 < 0) {
                    iD2 = _decodeBase64Escape(base64Variant, i4, 1);
                }
                int i5 = (iD << 6) | iD2;
                if (this._inputPtr >= this._inputEnd) {
                    d();
                }
                byte[] bArr3 = this.f53290a;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                int i7 = bArr3[i6] & 255;
                int iD3 = base64Variant.d(i7);
                if (iD3 < 0) {
                    if (iD3 != -2) {
                        if (i7 == 34) {
                            xxVar_getByteArrayBuilder.c(i5 >> 4);
                            if (base64Variant.h()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return xxVar_getByteArrayBuilder.i();
                        }
                        iD3 = _decodeBase64Escape(base64Variant, i7, 2);
                    }
                    if (iD3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            d();
                        }
                        byte[] bArr4 = this.f53290a;
                        int i8 = this._inputPtr;
                        this._inputPtr = i8 + 1;
                        int i9 = bArr4[i8] & 255;
                        if (!base64Variant.b(i9) && _decodeBase64Escape(base64Variant, i9, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, i9, 3, "expected padding character '" + base64Variant.j() + "'");
                        }
                        xxVar_getByteArrayBuilder.c(i5 >> 4);
                    }
                }
                int i10 = (i5 << 6) | iD3;
                if (this._inputPtr >= this._inputEnd) {
                    d();
                }
                byte[] bArr5 = this.f53290a;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                int i12 = bArr5[i11] & 255;
                int iD4 = base64Variant.d(i12);
                if (iD4 < 0) {
                    if (iD4 != -2) {
                        if (i12 == 34) {
                            xxVar_getByteArrayBuilder.e(i10 >> 2);
                            if (base64Variant.h()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return xxVar_getByteArrayBuilder.i();
                        }
                        iD4 = _decodeBase64Escape(base64Variant, i12, 3);
                    }
                    if (iD4 == -2) {
                        xxVar_getByteArrayBuilder.e(i10 >> 2);
                    }
                }
                xxVar_getByteArrayBuilder.d((i10 << 6) | iD4);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public wq getTokenLocation() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return new wq(_getSourceReference(), this._currInputProcessed + ((long) (this.i - 1)), -1L, this.j, this.e);
        }
        return new wq(_getSourceReference(), this._tokenInputTotal - 1, -1L, this._tokenInputRow, this._tokenInputCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public wq getCurrentLocation() {
        return new wq(_getSourceReference(), this._currInputProcessed + ((long) this._inputPtr), -1L, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    private final void ac() {
        this._tokenInputRow = this._currInputRow;
        int i = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + ((long) i);
        this._tokenInputCol = i - this._currInputRowStart;
    }

    private final void ab() {
        this.j = this._currInputRow;
        int i = this._inputPtr;
        this.i = i;
        this.e = i - this._currInputRowStart;
    }

    private final JsonToken j(int i) throws wn {
        if (i == 125) {
            l();
            JsonToken jsonToken = JsonToken.END_OBJECT;
            this._currToken = jsonToken;
            return jsonToken;
        }
        k();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private final void k() throws wn {
        ac();
        if (!this._parsingContext.inArray()) {
            _reportMismatchedEndMarker(93, '}');
        }
        this._parsingContext = this._parsingContext.b();
    }

    private final void l() throws wn {
        ac();
        if (!this._parsingContext.inObject()) {
            _reportMismatchedEndMarker(125, ']');
        }
        this._parsingContext = this._parsingContext.b();
    }
}
