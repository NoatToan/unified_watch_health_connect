package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.huawei.operation.utils.Constants;
import defpackage.wn;
import defpackage.wq;
import defpackage.wr;
import defpackage.wu;
import defpackage.xa;
import defpackage.xd;
import defpackage.xh;
import defpackage.xj;
import defpackage.xo;
import defpackage.xx;
import defpackage.yb;
import defpackage.yh;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ParserBase extends ParserMinimalBase {
    protected static final yb<StreamReadCapability> JSON_READ_CAPABILITIES = DEFAULT_READ_CAPABILITIES;
    protected byte[] _binaryValue;
    protected xx _byteArrayBuilder;
    protected boolean _closed;
    protected long _currInputProcessed;
    protected int _currInputRow;
    protected int _currInputRowStart;
    protected int _expLength;
    protected int _fractLength;
    protected int _inputEnd;
    protected int _inputPtr;
    protected int _intLength;
    protected final xa _ioContext;
    protected boolean _nameCopied;
    protected char[] _nameCopyBuffer;
    protected JsonToken _nextToken;
    protected int _numTypesValid;
    protected BigDecimal _numberBigDecimal;
    protected BigInteger _numberBigInt;
    protected double _numberDouble;
    protected int _numberInt;
    protected long _numberLong;
    protected boolean _numberNegative;
    protected xh _parsingContext;
    protected final yh _textBuffer;
    protected int _tokenInputCol;
    protected int _tokenInputRow;
    protected long _tokenInputTotal;

    protected abstract void _closeInput() throws IOException;

    protected void _finishString() throws IOException {
    }

    @Deprecated
    protected boolean loadMore() throws IOException {
        return false;
    }

    public ParserBase(xa xaVar, int i) {
        super(i);
        this._currInputRow = 1;
        this._tokenInputRow = 1;
        this._numTypesValid = 0;
        this._ioContext = xaVar;
        this._textBuffer = xaVar.h();
        this._parsingContext = xh.a(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? xj.d(this) : null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.core.Versioned
    public wu version() {
        return xo.d;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getCurrentValue() {
        return this._parsingContext.getCurrentValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCurrentValue(Object obj) {
        this._parsingContext.setCurrentValue(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser enable(JsonParser.Feature feature) {
        this._features |= feature.getMask();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION && this._parsingContext.c() == null) {
            this._parsingContext = this._parsingContext.d(xj.d(this));
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser disable(JsonParser.Feature feature) {
        this._features &= ~feature.getMask();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION) {
            this._parsingContext = this._parsingContext.d(null);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonParser setFeatureMask(int i) {
        int i2 = this._features ^ i;
        if (i2 != 0) {
            this._features = i;
            _checkStdFeatureChanges(i, i2);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser overrideStdFeatures(int i, int i2) {
        int i3 = this._features;
        int i4 = (i & i2) | ((~i2) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this._features = i4;
            _checkStdFeatureChanges(i4, i5);
        }
        return this;
    }

    protected void _checkStdFeatureChanges(int i, int i2) {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i2 & mask) == 0 || (i & mask) == 0) {
            return;
        }
        if (this._parsingContext.c() == null) {
            this._parsingContext = this._parsingContext.d(xj.d(this));
        } else {
            this._parsingContext = this._parsingContext.d(null);
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getCurrentName() throws IOException {
        xh parent;
        if ((this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) && (parent = this._parsingContext.getParent()) != null) {
            return parent.getCurrentName();
        }
        return this._parsingContext.getCurrentName();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public void overrideCurrentName(String str) {
        xh parent = this._parsingContext;
        if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
            parent = parent.getParent();
        }
        try {
            parent.c(str);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this._closed) {
            return;
        }
        this._inputPtr = Math.max(this._inputPtr, this._inputEnd);
        this._closed = true;
        try {
            _closeInput();
        } finally {
            _releaseBuffers();
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public boolean isClosed() {
        return this._closed;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public xh getParsingContext() {
        return this._parsingContext;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public wq getTokenLocation() {
        return new wq(_getSourceReference(), -1L, getTokenCharacterOffset(), getTokenLineNr(), getTokenColumnNr());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public wq getCurrentLocation() {
        int i = this._inputPtr;
        int i2 = this._currInputRowStart;
        return new wq(_getSourceReference(), -1L, ((long) this._inputPtr) + this._currInputProcessed, this._currInputRow, (i - i2) + 1);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        if (this._currToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (this._currToken == JsonToken.FIELD_NAME) {
            return this._nameCopied;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        if (this._binaryValue == null) {
            if (this._currToken != JsonToken.VALUE_STRING) {
                _reportError("Current token (" + this._currToken + ") not VALUE_STRING, can not access as binary");
            }
            xx xxVar_getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), xxVar_getByteArrayBuilder, base64Variant);
            this._binaryValue = xxVar_getByteArrayBuilder.i();
        }
        return this._binaryValue;
    }

    public long getTokenCharacterOffset() {
        return this._tokenInputTotal;
    }

    public int getTokenLineNr() {
        return this._tokenInputRow;
    }

    public int getTokenColumnNr() {
        int i = this._tokenInputCol;
        return i < 0 ? i : i + 1;
    }

    public void _releaseBuffers() throws IOException {
        this._textBuffer.l();
        char[] cArr = this._nameCopyBuffer;
        if (cArr != null) {
            this._nameCopyBuffer = null;
            this._ioContext.e(cArr);
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    protected void _handleEOF() throws wn {
        if (this._parsingContext.inRoot()) {
            return;
        }
        _reportInvalidEOF(String.format(": expected close marker for %s (start marker at %s)", this._parsingContext.inArray() ? "Array" : "Object", this._parsingContext.getStartLocation(_getSourceReference())), null);
    }

    protected final int _eofAsNextChar() throws wn {
        _handleEOF();
        return -1;
    }

    public xx _getByteArrayBuilder() {
        xx xxVar = this._byteArrayBuilder;
        if (xxVar == null) {
            this._byteArrayBuilder = new xx();
        } else {
            xxVar.c();
        }
        return this._byteArrayBuilder;
    }

    protected final JsonToken reset(boolean z, int i, int i2, int i3) {
        if (i2 < 1 && i3 < 1) {
            return resetInt(z, i);
        }
        return resetFloat(z, i, i2, i3);
    }

    protected final JsonToken resetInt(boolean z, int i) {
        this._numberNegative = z;
        this._intLength = i;
        this._fractLength = 0;
        this._expLength = 0;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    protected final JsonToken resetFloat(boolean z, int i, int i2, int i3) {
        this._numberNegative = z;
        this._intLength = i;
        this._fractLength = i2;
        this._expLength = i3;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    protected final JsonToken resetAsNaN(String str, double d) {
        this._textBuffer.d(str);
        this._numberDouble = d;
        this._numTypesValid = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isNaN() {
        if (this._currToken != JsonToken.VALUE_NUMBER_FLOAT || (this._numTypesValid & 8) == 0) {
            return false;
        }
        double d = this._numberDouble;
        return Double.isNaN(d) || Double.isInfinite(d);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValue() throws IOException {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i = this._numTypesValid;
            if ((i & 1) != 0) {
                return Integer.valueOf(this._numberInt);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this._numberLong);
            }
            if ((i & 4) != 0) {
                return this._numberBigInt;
            }
            _throwInternal();
        }
        int i2 = this._numTypesValid;
        if ((i2 & 16) != 0) {
            return this._numberBigDecimal;
        }
        if ((i2 & 8) == 0) {
            _throwInternal();
        }
        return Double.valueOf(this._numberDouble);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValueExact() throws IOException {
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(0);
            }
            int i = this._numTypesValid;
            if ((i & 1) != 0) {
                return Integer.valueOf(this._numberInt);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this._numberLong);
            }
            if ((i & 4) != 0) {
                return this._numberBigInt;
            }
            _throwInternal();
        }
        if (this._numTypesValid == 0) {
            _parseNumericValue(16);
        }
        int i2 = this._numTypesValid;
        if ((i2 & 16) != 0) {
            return this._numberBigDecimal;
        }
        if ((i2 & 8) == 0) {
            _throwInternal();
        }
        return Double.valueOf(this._numberDouble);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType getNumberType() throws IOException {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i = this._numTypesValid;
            if ((i & 1) != 0) {
                return JsonParser.NumberType.INT;
            }
            if ((i & 2) != 0) {
                return JsonParser.NumberType.LONG;
            }
            return JsonParser.NumberType.BIG_INTEGER;
        }
        if ((this._numTypesValid & 16) != 0) {
            return JsonParser.NumberType.BIG_DECIMAL;
        }
        return JsonParser.NumberType.DOUBLE;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getIntValue() throws IOException {
        int i = this._numTypesValid;
        int i2 = i & 1;
        if (i2 == 0) {
            if (i == 0) {
                return _parseIntValue();
            }
            if (i2 == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getLongValue() throws IOException {
        int i = this._numTypesValid;
        if ((i & 2) == 0) {
            if (i == 0) {
                _parseNumericValue(2);
            }
            if ((this._numTypesValid & 2) == 0) {
                convertNumberToLong();
            }
        }
        return this._numberLong;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger getBigIntegerValue() throws IOException {
        int i = this._numTypesValid;
        if ((i & 4) == 0) {
            if (i == 0) {
                _parseNumericValue(4);
            }
            if ((this._numTypesValid & 4) == 0) {
                convertNumberToBigInteger();
            }
        }
        return this._numberBigInt;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float getFloatValue() throws IOException {
        return (float) getDoubleValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double getDoubleValue() throws IOException {
        int i = this._numTypesValid;
        if ((i & 8) == 0) {
            if (i == 0) {
                _parseNumericValue(8);
            }
            if ((this._numTypesValid & 8) == 0) {
                convertNumberToDouble();
            }
        }
        return this._numberDouble;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal getDecimalValue() throws IOException {
        int i = this._numTypesValid;
        if ((i & 16) == 0) {
            if (i == 0) {
                _parseNumericValue(16);
            }
            if ((this._numTypesValid & 16) == 0) {
                convertNumberToBigDecimal();
            }
        }
        return this._numberBigDecimal;
    }

    protected void _parseNumericValue(int i) throws IOException {
        if (this._closed) {
            _reportError("Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i2 = this._intLength;
            if (i2 <= 9) {
                this._numberInt = this._textBuffer.d(this._numberNegative);
                this._numTypesValid = 1;
                return;
            }
            if (i2 <= 18) {
                long jA = this._textBuffer.a(this._numberNegative);
                if (i2 == 10) {
                    if (this._numberNegative) {
                        if (jA >= -2147483648L) {
                            this._numberInt = (int) jA;
                            this._numTypesValid = 1;
                            return;
                        }
                    } else if (jA <= 2147483647L) {
                        this._numberInt = (int) jA;
                        this._numTypesValid = 1;
                        return;
                    }
                }
                this._numberLong = jA;
                this._numTypesValid = 2;
                return;
            }
            _parseSlowInt(i);
            return;
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_FLOAT) {
            _parseSlowFloat(i);
        } else {
            _reportError("Current token (%s) not numeric, can not use numeric value accessors", this._currToken);
        }
    }

    protected int _parseIntValue() throws IOException {
        if (this._closed) {
            _reportError("Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT && this._intLength <= 9) {
            int iD = this._textBuffer.d(this._numberNegative);
            this._numberInt = iD;
            this._numTypesValid = 1;
            return iD;
        }
        _parseNumericValue(1);
        if ((this._numTypesValid & 1) == 0) {
            convertNumberToInt();
        }
        return this._numberInt;
    }

    private void _parseSlowFloat(int i) throws IOException {
        try {
            if (i == 16) {
                this._numberBigDecimal = this._textBuffer.c();
                this._numTypesValid = 16;
            } else {
                this._numberDouble = this._textBuffer.a();
                this._numTypesValid = 8;
            }
        } catch (NumberFormatException e) {
            _wrapError("Malformed numeric value (" + _longNumberDesc(this._textBuffer.d()) + Constants.RIGHT_BRACKET_ONLY, e);
        }
    }

    private void _parseSlowInt(int i) throws IOException {
        String strD = this._textBuffer.d();
        try {
            int i2 = this._intLength;
            char[] cArrM = this._textBuffer.m();
            int iO = this._textBuffer.o();
            boolean z = this._numberNegative;
            if (z) {
                iO++;
            }
            if (xd.d(cArrM, iO, i2, z)) {
                this._numberLong = Long.parseLong(strD);
                this._numTypesValid = 2;
                return;
            }
            if (i == 1 || i == 2) {
                _reportTooLongIntegral(i, strD);
            }
            if (i != 8 && i != 32) {
                this._numberBigInt = new BigInteger(strD);
                this._numTypesValid = 4;
                return;
            }
            this._numberDouble = xd.e(strD);
            this._numTypesValid = 8;
        } catch (NumberFormatException e) {
            _wrapError("Malformed numeric value (" + _longNumberDesc(strD) + Constants.RIGHT_BRACKET_ONLY, e);
        }
    }

    protected void _reportTooLongIntegral(int i, String str) throws IOException {
        if (i == 1) {
            reportOverflowInt(str);
        } else {
            reportOverflowLong(str);
        }
    }

    protected void convertNumberToInt() throws IOException {
        int i = this._numTypesValid;
        if ((i & 2) != 0) {
            long j = this._numberLong;
            int i2 = (int) j;
            if (i2 != j) {
                reportOverflowInt(getText(), currentToken());
            }
            this._numberInt = i2;
        } else if ((i & 4) != 0) {
            if (BI_MIN_INT.compareTo(this._numberBigInt) > 0 || BI_MAX_INT.compareTo(this._numberBigInt) < 0) {
                reportOverflowInt();
            }
            this._numberInt = this._numberBigInt.intValue();
        } else if ((i & 8) != 0) {
            double d = this._numberDouble;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                reportOverflowInt();
            }
            this._numberInt = (int) this._numberDouble;
        } else if ((i & 16) != 0) {
            if (BD_MIN_INT.compareTo(this._numberBigDecimal) > 0 || BD_MAX_INT.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowInt();
            }
            this._numberInt = this._numberBigDecimal.intValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 1;
    }

    protected void convertNumberToLong() throws IOException {
        int i = this._numTypesValid;
        if ((i & 1) != 0) {
            this._numberLong = this._numberInt;
        } else if ((i & 4) != 0) {
            if (BI_MIN_LONG.compareTo(this._numberBigInt) > 0 || BI_MAX_LONG.compareTo(this._numberBigInt) < 0) {
                reportOverflowLong();
            }
            this._numberLong = this._numberBigInt.longValue();
        } else if ((i & 8) != 0) {
            double d = this._numberDouble;
            if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                reportOverflowLong();
            }
            this._numberLong = (long) this._numberDouble;
        } else if ((i & 16) != 0) {
            if (BD_MIN_LONG.compareTo(this._numberBigDecimal) > 0 || BD_MAX_LONG.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowLong();
            }
            this._numberLong = this._numberBigDecimal.longValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 2;
    }

    protected void convertNumberToBigInteger() throws IOException {
        int i = this._numTypesValid;
        if ((i & 16) != 0) {
            this._numberBigInt = this._numberBigDecimal.toBigInteger();
        } else if ((i & 2) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberLong);
        } else if ((i & 1) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberInt);
        } else if ((i & 8) != 0) {
            this._numberBigInt = BigDecimal.valueOf(this._numberDouble).toBigInteger();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 4;
    }

    protected void convertNumberToDouble() throws IOException {
        int i = this._numTypesValid;
        if ((i & 16) != 0) {
            this._numberDouble = this._numberBigDecimal.doubleValue();
        } else if ((i & 4) != 0) {
            this._numberDouble = this._numberBigInt.doubleValue();
        } else if ((i & 2) != 0) {
            this._numberDouble = this._numberLong;
        } else if ((i & 1) != 0) {
            this._numberDouble = this._numberInt;
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 8;
    }

    protected void convertNumberToBigDecimal() throws IOException {
        int i = this._numTypesValid;
        if ((i & 8) != 0) {
            this._numberBigDecimal = xd.d(getText());
        } else if ((i & 4) != 0) {
            this._numberBigDecimal = new BigDecimal(this._numberBigInt);
        } else if ((i & 2) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberLong);
        } else if ((i & 1) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberInt);
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 16;
    }

    protected void _reportMismatchedEndMarker(int i, char c2) throws wn {
        xh parsingContext = getParsingContext();
        _reportError(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i), Character.valueOf(c2), parsingContext.typeDesc(), parsingContext.getStartLocation(_getSourceReference())));
    }

    protected char _handleUnrecognizedCharacterEscape(char c2) throws wr {
        if (isEnabled(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER) || (c2 == '\'' && isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES))) {
            return c2;
        }
        _reportError("Unrecognized character escape " + _getCharDesc(c2));
        return c2;
    }

    protected void _throwUnquotedSpace(int i, String str) throws wn {
        if (!isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32) {
            _reportError("Illegal unquoted character (" + _getCharDesc((char) i) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    protected String _validJsonTokenList() throws IOException {
        return _validJsonValueList();
    }

    protected String _validJsonValueList() throws IOException {
        if (isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
            return "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')";
        }
        return "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    protected char _decodeEscaped() throws IOException {
        throw new UnsupportedOperationException();
    }

    protected final int _decodeBase64Escape(Base64Variant base64Variant, int i, int i2) throws IOException {
        if (i != 92) {
            throw reportInvalidBase64Char(base64Variant, i, i2);
        }
        char c_decodeEscaped = _decodeEscaped();
        if (c_decodeEscaped <= ' ' && i2 == 0) {
            return -1;
        }
        int iD = base64Variant.d(c_decodeEscaped);
        if (iD >= 0 || iD == -2) {
            return iD;
        }
        throw reportInvalidBase64Char(base64Variant, c_decodeEscaped, i2);
    }

    protected final int _decodeBase64Escape(Base64Variant base64Variant, char c2, int i) throws IOException {
        if (c2 != '\\') {
            throw reportInvalidBase64Char(base64Variant, c2, i);
        }
        char c_decodeEscaped = _decodeEscaped();
        if (c_decodeEscaped <= ' ' && i == 0) {
            return -1;
        }
        int iC = base64Variant.c(c_decodeEscaped);
        if (iC >= 0 || (iC == -2 && i >= 2)) {
            return iC;
        }
        throw reportInvalidBase64Char(base64Variant, c_decodeEscaped, i);
    }

    protected IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i, int i2) throws IllegalArgumentException {
        return reportInvalidBase64Char(base64Variant, i, i2, null);
    }

    protected IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i, int i2, String str) throws IllegalArgumentException {
        String str2;
        if (i <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i), Integer.valueOf(i2 + 1));
        } else if (base64Variant.b(i)) {
            str2 = "Unexpected padding character ('" + base64Variant.j() + "') as character #" + (i2 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i) || Character.isISOControl(i)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(i) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + ((char) i) + "' (code 0x" + Integer.toHexString(i) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }

    protected void _handleBase64MissingPadding(Base64Variant base64Variant) throws IOException {
        _reportError(base64Variant.g());
    }

    protected Object _getSourceReference() {
        if (JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this._features)) {
            return this._ioContext.g();
        }
        return null;
    }

    protected static int[] growArrayBy(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return Arrays.copyOf(iArr, iArr.length + i);
    }

    @Deprecated
    protected void loadMoreGuaranteed() throws IOException {
        if (loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }
}
