package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.json.JsonGeneratorImpl;
import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes21.dex */
public class xq extends JsonGeneratorImpl {
    protected static final char[] e = wz.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected SerializableString f53279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected char[] f53280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected char[] f53281c;
    protected char[] d;
    protected int f;
    protected final Writer g;
    protected int h;
    protected int i;
    protected char j;

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteFormattedNumbers() {
        return true;
    }

    public xq(xa xaVar, int i, ObjectCodec objectCodec, Writer writer, char c2) {
        super(xaVar, i, objectCodec);
        this.g = writer;
        char[] cArrE = xaVar.e();
        this.f53280b = cArrE;
        this.h = cArrE.length;
        this.j = c2;
        if (c2 != '\"') {
            this._outputEscapes = wz.d(c2);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public Object getOutputTarget() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getOutputBuffered() {
        return Math.max(0, this.i - this.f);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) throws IOException {
        int iB = this._writeContext.b(str);
        if (iB == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        b(str, iB == 1);
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        int iB = this._writeContext.b(serializableString.getValue());
        if (iB == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        a(serializableString, iB == 1);
    }

    protected final void b(String str, boolean z) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            d(str, z);
            return;
        }
        if (this.i + 1 >= this.h) {
            e();
        }
        if (z) {
            char[] cArr = this.f53280b;
            int i = this.i;
            this.i = i + 1;
            cArr[i] = ',';
        }
        if (this._cfgUnqNames) {
            c(str);
            return;
        }
        char[] cArr2 = this.f53280b;
        int i2 = this.i;
        this.i = i2 + 1;
        cArr2[i2] = this.j;
        c(str);
        if (this.i >= this.h) {
            e();
        }
        char[] cArr3 = this.f53280b;
        int i3 = this.i;
        this.i = i3 + 1;
        cArr3[i3] = this.j;
    }

    protected final void a(SerializableString serializableString, boolean z) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            c(serializableString, z);
            return;
        }
        if (this.i + 1 >= this.h) {
            e();
        }
        if (z) {
            char[] cArr = this.f53280b;
            int i = this.i;
            this.i = i + 1;
            cArr[i] = ',';
        }
        if (this._cfgUnqNames) {
            char[] cArrAsQuotedChars = serializableString.asQuotedChars();
            writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        char[] cArr2 = this.f53280b;
        int i2 = this.i;
        int i3 = i2 + 1;
        this.i = i3;
        cArr2[i2] = this.j;
        int iAppendQuoted = serializableString.appendQuoted(cArr2, i3);
        if (iAppendQuoted < 0) {
            b(serializableString);
            return;
        }
        int i4 = this.i + iAppendQuoted;
        this.i = i4;
        if (i4 >= this.h) {
            e();
        }
        char[] cArr3 = this.f53280b;
        int i5 = this.i;
        this.i = i5 + 1;
        cArr3[i5] = this.j;
    }

    private final void b(SerializableString serializableString) throws IOException {
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i = this.i;
        this.i = i + 1;
        cArr[i] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray() throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.b();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartArray(this);
            return;
        }
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i = this.i;
        this.i = i + 1;
        cArr[i] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj) throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.e(obj);
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartArray(this);
            return;
        }
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i = this.i;
        this.i = i + 1;
        cArr[i] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj, int i) throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.e(obj);
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartArray(this);
            return;
        }
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i2 = this.i;
        this.i = i2 + 1;
        cArr[i2] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndArray() throws IOException {
        if (!this._writeContext.inArray()) {
            _reportError("Current context not Array but " + this._writeContext.typeDesc());
        }
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
        } else {
            if (this.i >= this.h) {
                e();
            }
            char[] cArr = this.f53280b;
            int i = this.i;
            this.i = i + 1;
            cArr[i] = ']';
        }
        this._writeContext = this._writeContext.e();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject() throws IOException {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.a();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartObject(this);
            return;
        }
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i = this.i;
        this.i = i + 1;
        cArr[i] = '{';
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) throws IOException {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.b(obj);
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartObject(this);
            return;
        }
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i = this.i;
        this.i = i + 1;
        cArr[i] = '{';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndObject() throws IOException {
        if (!this._writeContext.inObject()) {
            _reportError("Current context not Object but " + this._writeContext.typeDesc());
        }
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
        } else {
            if (this.i >= this.h) {
                e();
            }
            char[] cArr = this.f53280b;
            int i = this.i;
            this.i = i + 1;
            cArr[i] = '}';
        }
        this._writeContext = this._writeContext.e();
    }

    protected final void d(String str, boolean z) throws IOException {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            c(str);
            return;
        }
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i = this.i;
        this.i = i + 1;
        cArr[i] = this.j;
        c(str);
        if (this.i >= this.h) {
            e();
        }
        char[] cArr2 = this.f53280b;
        int i2 = this.i;
        this.i = i2 + 1;
        cArr2[i2] = this.j;
    }

    protected final void c(SerializableString serializableString, boolean z) throws IOException {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        if (this._cfgUnqNames) {
            writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i = this.i;
        this.i = i + 1;
        cArr[i] = this.j;
        writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
        if (this.i >= this.h) {
            e();
        }
        char[] cArr2 = this.f53280b;
        int i2 = this.i;
        this.i = i2 + 1;
        cArr2[i2] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        _verifyValueWrite("write a string");
        if (str == null) {
            c();
            return;
        }
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i = this.i;
        this.i = i + 1;
        cArr[i] = this.j;
        c(str);
        if (this.i >= this.h) {
            e();
        }
        char[] cArr2 = this.f53280b;
        int i2 = this.i;
        this.i = i2 + 1;
        cArr2[i2] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(Reader reader, int i) throws IOException {
        _verifyValueWrite("write a string");
        if (reader == null) {
            _reportError("null reader");
            return;
        }
        int i2 = i >= 0 ? i : Integer.MAX_VALUE;
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i3 = this.i;
        this.i = i3 + 1;
        cArr[i3] = this.j;
        char[] cArrB = b();
        while (i2 > 0) {
            int i4 = reader.read(cArrB, 0, Math.min(i2, cArrB.length));
            if (i4 <= 0) {
                break;
            }
            e(cArrB, 0, i4);
            i2 -= i4;
        }
        if (this.i >= this.h) {
            e();
        }
        char[] cArr2 = this.f53280b;
        int i5 = this.i;
        this.i = i5 + 1;
        cArr2[i5] = this.j;
        if (i2 <= 0 || i < 0) {
            return;
        }
        _reportError("Didn't read enough from reader");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i, int i2) throws IOException {
        _verifyValueWrite("write a string");
        if (this.i >= this.h) {
            e();
        }
        char[] cArr2 = this.f53280b;
        int i3 = this.i;
        this.i = i3 + 1;
        cArr2[i3] = this.j;
        e(cArr, i, i2);
        if (this.i >= this.h) {
            e();
        }
        char[] cArr3 = this.f53280b;
        int i4 = this.i;
        this.i = i4 + 1;
        cArr3[i4] = this.j;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a string");
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i = this.i;
        int i2 = i + 1;
        this.i = i2;
        cArr[i] = this.j;
        int iAppendQuoted = serializableString.appendQuoted(cArr, i2);
        if (iAppendQuoted < 0) {
            d(serializableString);
            return;
        }
        int i3 = this.i + iAppendQuoted;
        this.i = i3;
        if (i3 >= this.h) {
            e();
        }
        char[] cArr2 = this.f53280b;
        int i4 = this.i;
        this.i = i4 + 1;
        cArr2[i4] = this.j;
    }

    private void d(SerializableString serializableString) throws IOException {
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        int length = cArrAsQuotedChars.length;
        if (length < 32) {
            if (length > this.h - this.i) {
                e();
            }
            System.arraycopy(cArrAsQuotedChars, 0, this.f53280b, this.i, length);
            this.i += length;
        } else {
            e();
            this.g.write(cArrAsQuotedChars, 0, length);
        }
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i = this.i;
        this.i = i + 1;
        cArr[i] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawUTF8String(byte[] bArr, int i, int i2) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeUTF8String(byte[] bArr, int i, int i2) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        int length = str.length();
        int i = this.h - this.i;
        if (i == 0) {
            e();
            i = this.h - this.i;
        }
        if (i >= length) {
            str.getChars(0, length, this.f53280b, this.i);
            this.i += length;
        } else {
            e(str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str, int i, int i2) throws IOException {
        int i3 = this.h - this.i;
        if (i3 < i2) {
            e();
            i3 = this.h - this.i;
        }
        if (i3 >= i2) {
            str.getChars(i, i + i2, this.f53280b, this.i);
            this.i += i2;
        } else {
            e(str.substring(i, i2 + i));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) throws IOException {
        int iAppendUnquoted = serializableString.appendUnquoted(this.f53280b, this.i);
        if (iAppendUnquoted < 0) {
            writeRaw(serializableString.getValue());
        } else {
            this.i += iAppendUnquoted;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i, int i2) throws IOException {
        if (i2 < 32) {
            if (i2 > this.h - this.i) {
                e();
            }
            System.arraycopy(cArr, i, this.f53280b, this.i, i2);
            this.i += i2;
            return;
        }
        e();
        this.g.write(cArr, i, i2);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c2) throws IOException {
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i = this.i;
        this.i = i + 1;
        cArr[i] = c2;
    }

    private void e(String str) throws IOException {
        int i = this.h;
        int i2 = this.i;
        int i3 = i - i2;
        str.getChars(0, i3, this.f53280b, i2);
        this.i += i3;
        e();
        int length = str.length() - i3;
        while (true) {
            int i4 = this.h;
            if (length > i4) {
                int i5 = i3 + i4;
                str.getChars(i3, i5, this.f53280b, 0);
                this.f = 0;
                this.i = i4;
                e();
                length -= i4;
                i3 = i5;
            } else {
                str.getChars(i3, i3 + length, this.f53280b, 0);
                this.f = 0;
                this.i = length;
                return;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        _verifyValueWrite("write a binary value");
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i3 = this.i;
        this.i = i3 + 1;
        cArr[i3] = this.j;
        e(base64Variant, bArr, i, i2 + i);
        if (this.i >= this.h) {
            e();
        }
        char[] cArr2 = this.f53280b;
        int i4 = this.i;
        this.i = i4 + 1;
        cArr2[i4] = this.j;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException {
        _verifyValueWrite("write a binary value");
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i2 = this.i;
        this.i = i2 + 1;
        cArr[i2] = this.j;
        byte[] bArrC = this._ioContext.c();
        try {
            if (i < 0) {
                i = d(base64Variant, inputStream, bArrC);
            } else {
                int iB = b(base64Variant, inputStream, bArrC, i);
                if (iB > 0) {
                    _reportError("Too few bytes available: missing " + iB + " bytes (out of " + i + Constants.RIGHT_BRACKET_ONLY);
                }
            }
            this._ioContext.a(bArrC);
            if (this.i >= this.h) {
                e();
            }
            char[] cArr2 = this.f53280b;
            int i3 = this.i;
            this.i = i3 + 1;
            cArr2[i3] = this.j;
            return i;
        } catch (Throwable th) {
            this._ioContext.a(bArrC);
            throw th;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            c(s);
            return;
        }
        if (this.i + 6 >= this.h) {
            e();
        }
        this.i = xc.c(s, this.f53280b, this.i);
    }

    private void c(short s) throws IOException {
        if (this.i + 8 >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i = this.i;
        int i2 = i + 1;
        this.i = i2;
        cArr[i] = this.j;
        int iC = xc.c(s, cArr, i2);
        char[] cArr2 = this.f53280b;
        this.i = iC + 1;
        cArr2[iC] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            d(i);
            return;
        }
        if (this.i + 11 >= this.h) {
            e();
        }
        this.i = xc.c(i, this.f53280b, this.i);
    }

    private void d(int i) throws IOException {
        if (this.i + 13 >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i2 = this.i;
        int i3 = i2 + 1;
        this.i = i3;
        cArr[i2] = this.j;
        int iC = xc.c(i, cArr, i3);
        char[] cArr2 = this.f53280b;
        this.i = iC + 1;
        cArr2[iC] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            c(j);
            return;
        }
        if (this.i + 21 >= this.h) {
            e();
        }
        this.i = xc.a(j, this.f53280b, this.i);
    }

    private void c(long j) throws IOException {
        if (this.i + 23 >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i = this.i;
        int i2 = i + 1;
        this.i = i2;
        cArr[i] = this.j;
        int iA = xc.a(j, cArr, i2);
        char[] cArr2 = this.f53280b;
        this.i = iA + 1;
        cArr2[iA] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        _verifyValueWrite("write a number");
        if (bigInteger == null) {
            c();
        } else if (this._cfgNumbersAsStrings) {
            d(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d) throws IOException {
        if (this._cfgNumbersAsStrings || (xc.b(d) && isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            writeString(String.valueOf(d));
        } else {
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(d));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f) throws IOException {
        if (this._cfgNumbersAsStrings || (xc.b(f) && isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            writeString(String.valueOf(f));
        } else {
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(f));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        _verifyValueWrite("write a number");
        if (bigDecimal == null) {
            c();
        } else if (this._cfgNumbersAsStrings) {
            d(_asString(bigDecimal));
        } else {
            writeRaw(_asString(bigDecimal));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) throws IOException {
        _verifyValueWrite("write a number");
        if (str == null) {
            c();
        } else if (this._cfgNumbersAsStrings) {
            d(str);
        } else {
            writeRaw(str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(char[] cArr, int i, int i2) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            b(cArr, i, i2);
        } else {
            writeRaw(cArr, i, i2);
        }
    }

    private void d(String str) throws IOException {
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i = this.i;
        this.i = i + 1;
        cArr[i] = this.j;
        writeRaw(str);
        if (this.i >= this.h) {
            e();
        }
        char[] cArr2 = this.f53280b;
        int i2 = this.i;
        this.i = i2 + 1;
        cArr2[i2] = this.j;
    }

    private void b(char[] cArr, int i, int i2) throws IOException {
        if (this.i >= this.h) {
            e();
        }
        char[] cArr2 = this.f53280b;
        int i3 = this.i;
        this.i = i3 + 1;
        cArr2[i3] = this.j;
        writeRaw(cArr, i, i2);
        if (this.i >= this.h) {
            e();
        }
        char[] cArr3 = this.f53280b;
        int i4 = this.i;
        this.i = i4 + 1;
        cArr3[i4] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z) throws IOException {
        int i;
        _verifyValueWrite("write a boolean value");
        if (this.i + 5 >= this.h) {
            e();
        }
        int i2 = this.i;
        char[] cArr = this.f53280b;
        if (z) {
            cArr[i2] = 't';
            cArr[i2 + 1] = 'r';
            cArr[i2 + 2] = 'u';
            i = i2 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = 'l';
            cArr[i2 + 3] = 's';
            i = i2 + 4;
            cArr[i] = 'e';
        }
        this.i = i + 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _verifyValueWrite("write a null");
        c();
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public final void _verifyValueWrite(String str) throws IOException {
        char c2;
        int i = this._writeContext.i();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, i);
            return;
        }
        if (i == 1) {
            c2 = ',';
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        return;
                    }
                    _reportCantWriteValueExpectName(str);
                    return;
                } else {
                    if (this._rootValueSeparator != null) {
                        writeRaw(this._rootValueSeparator.getValue());
                        return;
                    }
                    return;
                }
            }
            c2 = ':';
        }
        if (this.i >= this.h) {
            e();
        }
        char[] cArr = this.f53280b;
        int i2 = this.i;
        this.i = i2 + 1;
        cArr[i2] = c2;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        e();
        if (this.g == null || !isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.g.flush();
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.f53280b != null && isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                JsonStreamContext outputContext = getOutputContext();
                if (outputContext.inArray()) {
                    writeEndArray();
                } else if (!outputContext.inObject()) {
                    break;
                } else {
                    writeEndObject();
                }
            }
        }
        e();
        this.f = 0;
        this.i = 0;
        if (this.g != null) {
            if (this._ioContext.i() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this.g.close();
            } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this.g.flush();
            }
        }
        _releaseBuffers();
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public void _releaseBuffers() {
        char[] cArr = this.f53280b;
        if (cArr != null) {
            this.f53280b = null;
            this._ioContext.d(cArr);
        }
        char[] cArr2 = this.f53281c;
        if (cArr2 != null) {
            this.f53281c = null;
            this._ioContext.e(cArr2);
        }
    }

    private void c(String str) throws IOException {
        int length = str.length();
        int i = this.h;
        if (length > i) {
            a(str);
            return;
        }
        if (this.i + length > i) {
            e();
        }
        str.getChars(0, length, this.f53280b, this.i);
        if (this._characterEscapes != null) {
            a(length);
        } else if (this._maximumNonEscapedChar != 0) {
            c(length, this._maximumNonEscapedChar);
        } else {
            e(length);
        }
    }

    private void e(int i) throws IOException {
        int i2;
        int i3 = this.i + i;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (this.i < i3) {
            do {
                char[] cArr = this.f53280b;
                int i4 = this.i;
                char c2 = cArr[i4];
                if (c2 >= length || iArr[c2] == 0) {
                    i2 = i4 + 1;
                    this.i = i2;
                } else {
                    int i5 = this.f;
                    int i6 = i4 - i5;
                    if (i6 > 0) {
                        this.g.write(cArr, i5, i6);
                    }
                    char[] cArr2 = this.f53280b;
                    int i7 = this.i;
                    this.i = i7 + 1;
                    char c3 = cArr2[i7];
                    a(c3, iArr[c3]);
                }
            } while (i2 < i3);
            return;
        }
    }

    private void a(String str) throws IOException {
        e();
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = this.h;
            if (i + i2 > length) {
                i2 = length - i;
            }
            int i3 = i + i2;
            str.getChars(i, i3, this.f53280b, 0);
            if (this._characterEscapes != null) {
                c(i2);
            } else if (this._maximumNonEscapedChar != 0) {
                d(i2, this._maximumNonEscapedChar);
            } else {
                b(i2);
            }
            if (i3 >= length) {
                return;
            } else {
                i = i3;
            }
        }
    }

    private void b(int i) throws IOException {
        char[] cArr;
        char c2;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        int i2 = 0;
        int iB = 0;
        while (i2 < i) {
            do {
                cArr = this.f53280b;
                c2 = cArr[i2];
                if (c2 < length && iArr[c2] != 0) {
                    break;
                } else {
                    i2++;
                }
            } while (i2 < i);
            int i3 = i2 - iB;
            if (i3 > 0) {
                this.g.write(cArr, iB, i3);
                if (i2 >= i) {
                    return;
                }
            }
            i2++;
            iB = b(this.f53280b, i2, i, c2, iArr[c2]);
        }
    }

    private void e(char[] cArr, int i, int i2) throws IOException {
        if (this._characterEscapes != null) {
            a(cArr, i, i2);
            return;
        }
        if (this._maximumNonEscapedChar != 0) {
            c(cArr, i, i2, this._maximumNonEscapedChar);
            return;
        }
        int i3 = i2 + i;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (i < i3) {
            int i4 = i;
            do {
                char c2 = cArr[i4];
                if (c2 < length && iArr[c2] != 0) {
                    break;
                } else {
                    i4++;
                }
            } while (i4 < i3);
            int i5 = i4 - i;
            if (i5 < 32) {
                if (this.i + i5 > this.h) {
                    e();
                }
                if (i5 > 0) {
                    System.arraycopy(cArr, i, this.f53280b, this.i, i5);
                    this.i += i5;
                }
            } else {
                e();
                this.g.write(cArr, i, i5);
            }
            if (i4 >= i3) {
                return;
            }
            i = i4 + 1;
            char c3 = cArr[i4];
            c(c3, iArr[c3]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:22:0x002a A[SYNTHETIC] */
    private void c(int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.i + i;
        int[] iArr = this._outputEscapes;
        int iMin = Math.min(iArr.length, i2 + 1);
        while (this.i < i7) {
            do {
                char[] cArr = this.f53280b;
                int i8 = this.i;
                char c2 = cArr[i8];
                if (c2 < iMin) {
                    i3 = iArr[c2];
                    if (i3 != 0) {
                        i4 = this.f;
                        i5 = i8 - i4;
                        if (i5 > 0) {
                            this.g.write(cArr, i4, i5);
                        }
                        this.i++;
                        a(c2, i3);
                    }
                    i6 = i8 + 1;
                    this.i = i6;
                } else {
                    if (c2 > i2) {
                        i3 = -1;
                        i4 = this.f;
                        i5 = i8 - i4;
                        if (i5 > 0) {
                            this.g.write(cArr, i4, i5);
                        }
                        this.i++;
                        a(c2, i3);
                    }
                    i6 = i8 + 1;
                    this.i = i6;
                }
            } while (i6 < i7);
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d A[PHI: r3
      0x001d: PHI (r3v5 int) = (r3v2 int), (r3v6 int) binds: [B:9:0x0019, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    private void d(int i, int i2) throws IOException {
        char[] cArr;
        char c2;
        int[] iArr = this._outputEscapes;
        int iMin = Math.min(iArr.length, i2 + 1);
        int i3 = 0;
        int i4 = 0;
        int iB = 0;
        while (i3 < i) {
            do {
                cArr = this.f53280b;
                c2 = cArr[i3];
                if (c2 < iMin) {
                    i4 = iArr[c2];
                    if (i4 != 0) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    if (c2 > i2) {
                        i4 = -1;
                        break;
                    }
                    i3++;
                }
            } while (i3 < i);
            int i5 = i3 - iB;
            if (i5 > 0) {
                this.g.write(cArr, iB, i5);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            iB = b(this.f53280b, i3, i, c2, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b A[PHI: r2
      0x001b: PHI (r2v6 int) = (r2v3 int), (r2v7 int) binds: [B:10:0x0017, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    private void c(char[] cArr, int i, int i2, int i3) throws IOException {
        char c2;
        int i4 = i2 + i;
        int[] iArr = this._outputEscapes;
        int iMin = Math.min(iArr.length, i3 + 1);
        int i5 = 0;
        while (i < i4) {
            int i6 = i;
            do {
                c2 = cArr[i6];
                if (c2 < iMin) {
                    i5 = iArr[c2];
                    if (i5 != 0) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    if (c2 > i3) {
                        i5 = -1;
                        break;
                    }
                    i6++;
                }
            } while (i6 < i4);
            int i7 = i6 - i;
            if (i7 < 32) {
                if (this.i + i7 > this.h) {
                    e();
                }
                if (i7 > 0) {
                    System.arraycopy(cArr, i, this.f53280b, this.i, i7);
                    this.i += i7;
                }
            } else {
                e();
                this.g.write(cArr, i, i7);
            }
            if (i6 >= i4) {
                return;
            }
            i = i6 + 1;
            c(c2, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0045 A[SYNTHETIC] */
    private void a(int i) throws IOException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.i + i;
        int[] iArr = this._outputEscapes;
        int i7 = this._maximumNonEscapedChar < 1 ? 65535 : this._maximumNonEscapedChar;
        int iMin = Math.min(iArr.length, i7 + 1);
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (this.i < i6) {
            do {
                char c2 = this.f53280b[this.i];
                if (c2 < iMin) {
                    i2 = iArr[c2];
                    if (i2 != 0) {
                        int i8 = this.i;
                        i3 = this.f;
                        i4 = i8 - i3;
                        if (i4 > 0) {
                            this.g.write(this.f53280b, i3, i4);
                        }
                        this.i++;
                        a(c2, i2);
                    }
                    i5 = this.i + 1;
                    this.i = i5;
                } else {
                    if (c2 > i7) {
                        i2 = -1;
                    } else {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(c2);
                        this.f53279a = escapeSequence;
                        if (escapeSequence != null) {
                            i2 = -2;
                        }
                        i5 = this.i + 1;
                        this.i = i5;
                    }
                    int i9 = this.i;
                    i3 = this.f;
                    i4 = i9 - i3;
                    if (i4 > 0) {
                        this.g.write(this.f53280b, i3, i4);
                    }
                    this.i++;
                    a(c2, i2);
                }
            } while (i5 < i6);
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[PHI: r5
      0x0034: PHI (r5v6 int) = (r5v2 int), (r5v7 int) binds: [B:16:0x0030, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    private void c(int i) throws IOException {
        char c2;
        int[] iArr = this._outputEscapes;
        int i2 = this._maximumNonEscapedChar < 1 ? 65535 : this._maximumNonEscapedChar;
        int iMin = Math.min(iArr.length, i2 + 1);
        CharacterEscapes characterEscapes = this._characterEscapes;
        int i3 = 0;
        int i4 = 0;
        int iB = 0;
        while (i3 < i) {
            do {
                c2 = this.f53280b[i3];
                if (c2 < iMin) {
                    i4 = iArr[c2];
                    if (i4 != 0) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    if (c2 > i2) {
                        i4 = -1;
                        break;
                    }
                    SerializableString escapeSequence = characterEscapes.getEscapeSequence(c2);
                    this.f53279a = escapeSequence;
                    if (escapeSequence != null) {
                        i4 = -2;
                        break;
                    }
                    i3++;
                }
            } while (i3 < i);
            int i5 = i3 - iB;
            if (i5 > 0) {
                this.g.write(this.f53280b, iB, i5);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            iB = b(this.f53280b, i3, i, c2, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0032 A[PHI: r4
      0x0032: PHI (r4v6 int) = (r4v2 int), (r4v7 int) binds: [B:17:0x002e, B:12:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    private void a(char[] cArr, int i, int i2) throws IOException {
        char c2;
        int i3 = i2 + i;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar < 1 ? 65535 : this._maximumNonEscapedChar;
        int iMin = Math.min(iArr.length, i4 + 1);
        CharacterEscapes characterEscapes = this._characterEscapes;
        int i5 = 0;
        while (i < i3) {
            int i6 = i;
            do {
                c2 = cArr[i6];
                if (c2 < iMin) {
                    i5 = iArr[c2];
                    if (i5 != 0) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    if (c2 > i4) {
                        i5 = -1;
                        break;
                    }
                    SerializableString escapeSequence = characterEscapes.getEscapeSequence(c2);
                    this.f53279a = escapeSequence;
                    if (escapeSequence != null) {
                        i5 = -2;
                        break;
                    }
                    i6++;
                }
            } while (i6 < i3);
            int i7 = i6 - i;
            if (i7 < 32) {
                if (this.i + i7 > this.h) {
                    e();
                }
                if (i7 > 0) {
                    System.arraycopy(cArr, i, this.f53280b, this.i, i7);
                    this.i += i7;
                }
            } else {
                e();
                this.g.write(cArr, i, i7);
            }
            if (i6 >= i3) {
                return;
            }
            i = i6 + 1;
            c(c2, i5);
        }
    }

    protected final void e(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int iD;
        int i4 = this.h - 6;
        int iA = base64Variant.a();
        loop0: while (true) {
            int i5 = iA >> 2;
            while (true) {
                if (i > i2 - 3) {
                    break loop0;
                }
                if (this.i > i4) {
                    e();
                }
                byte b2 = bArr[i];
                byte b3 = bArr[i + 1];
                i3 = i + 3;
                iD = base64Variant.d((bArr[i + 2] & 255) | (((b2 << 8) | (b3 & 255)) << 8), this.f53280b, this.i);
                this.i = iD;
                i5--;
                if (i5 <= 0) {
                    break;
                } else {
                    i = i3;
                }
            }
            char[] cArr = this.f53280b;
            cArr[iD] = IOUtils.DIR_SEPARATOR_WINDOWS;
            this.i = iD + 2;
            cArr[iD + 1] = 'n';
            iA = base64Variant.a();
            i = i3;
        }
        int i6 = i2 - i;
        if (i6 > 0) {
            if (this.i > i4) {
                e();
            }
            int i7 = bArr[i] << 16;
            if (i6 == 2) {
                i7 |= (bArr[i + 1] & 255) << 8;
            }
            this.i = base64Variant.b(i7, i6, this.f53280b, this.i);
        }
    }

    protected final int b(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) throws IOException {
        int iD;
        int i2 = this.h - 6;
        int i3 = 2;
        int i4 = -3;
        int i5 = i;
        int iA = base64Variant.a() >> 2;
        int i6 = 0;
        int iD2 = 0;
        while (i5 > 2) {
            if (i6 > i4) {
                iD2 = d(inputStream, bArr, i6, iD2, i5);
                if (iD2 < 3) {
                    i6 = 0;
                    break;
                }
                i4 = iD2 - 3;
                i6 = 0;
            }
            if (this.i > i2) {
                e();
            }
            int i7 = i6 + 3;
            i5 -= 3;
            int iD3 = base64Variant.d((((bArr[i6] << 8) | (bArr[i6 + 1] & 255)) << 8) | (bArr[i6 + 2] & 255), this.f53280b, this.i);
            this.i = iD3;
            iA--;
            if (iA <= 0) {
                char[] cArr = this.f53280b;
                cArr[iD3] = IOUtils.DIR_SEPARATOR_WINDOWS;
                this.i = iD3 + 2;
                cArr[iD3 + 1] = 'n';
                iA = base64Variant.a() >> 2;
            }
            i6 = i7;
        }
        if (i5 <= 0 || (iD = d(inputStream, bArr, i6, iD2, i5)) <= 0) {
            return i5;
        }
        if (this.i > i2) {
            e();
        }
        int i8 = bArr[0] << 16;
        if (1 < iD) {
            i8 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        this.i = base64Variant.b(i8, i3, this.f53280b, this.i);
        return i5 - i3;
    }

    protected final int d(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.h - 6;
        int i2 = 2;
        int iA = base64Variant.a() >> 2;
        int i3 = -3;
        int i4 = 0;
        int iD = 0;
        int i5 = 0;
        while (true) {
            if (i4 > i3) {
                iD = d(inputStream, bArr, i4, iD, bArr.length);
                if (iD < 3) {
                    break;
                }
                i3 = iD - 3;
                i4 = 0;
            }
            if (this.i > i) {
                e();
            }
            int i6 = i4 + 3;
            i5 += 3;
            int iD2 = base64Variant.d((((bArr[i4] << 8) | (bArr[i4 + 1] & 255)) << 8) | (bArr[i4 + 2] & 255), this.f53280b, this.i);
            this.i = iD2;
            iA--;
            if (iA <= 0) {
                char[] cArr = this.f53280b;
                cArr[iD2] = IOUtils.DIR_SEPARATOR_WINDOWS;
                this.i = iD2 + 2;
                cArr[iD2 + 1] = 'n';
                iA = base64Variant.a() >> 2;
            }
            i4 = i6;
        }
        if (iD <= 0) {
            return i5;
        }
        if (this.i > i) {
            e();
        }
        int i7 = bArr[0] << 16;
        if (1 < iD) {
            i7 |= (bArr[1] & 255) << 8;
        } else {
            i2 = 1;
        }
        int i8 = i5 + i2;
        this.i = base64Variant.b(i7, i2, this.f53280b, this.i);
        return i8;
    }

    private int d(InputStream inputStream, byte[] bArr, int i, int i2, int i3) throws IOException {
        int i4;
        int i5 = 0;
        while (i < i2) {
            bArr[i5] = bArr[i];
            i5++;
            i++;
        }
        int iMin = Math.min(i3, bArr.length);
        do {
            int i6 = iMin - i5;
            if (i6 == 0 || (i4 = inputStream.read(bArr, i5, i6)) < 0) {
                return i5;
            }
            i5 += i4;
        } while (i5 < 3);
        return i5;
    }

    private final void c() throws IOException {
        if (this.i + 4 >= this.h) {
            e();
        }
        int i = this.i;
        char[] cArr = this.f53280b;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.i = i + 4;
    }

    private void a(char c2, int i) throws IOException {
        String value;
        int i2;
        if (i >= 0) {
            int i3 = this.i;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.f = i4;
                char[] cArr = this.f53280b;
                cArr[i4] = IOUtils.DIR_SEPARATOR_WINDOWS;
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArrD = this.d;
            if (cArrD == null) {
                cArrD = d();
            }
            this.f = this.i;
            cArrD[1] = (char) i;
            this.g.write(cArrD, 0, 2);
            return;
        }
        if (i != -2) {
            int i5 = this.i;
            if (i5 >= 6) {
                char[] cArr2 = this.f53280b;
                int i6 = i5 - 6;
                this.f = i6;
                cArr2[i6] = IOUtils.DIR_SEPARATOR_WINDOWS;
                cArr2[i5 - 5] = 'u';
                if (c2 > 255) {
                    int i7 = c2 >> '\b';
                    char[] cArr3 = e;
                    cArr2[i5 - 4] = cArr3[(i7 & 255) >> 4];
                    i2 = i5 - 3;
                    cArr2[i2] = cArr3[i7 & 15];
                    c2 = (char) (c2 & 255);
                } else {
                    cArr2[i5 - 4] = '0';
                    i2 = i5 - 3;
                    cArr2[i2] = '0';
                }
                char[] cArr4 = e;
                cArr2[i2 + 1] = cArr4[c2 >> 4];
                cArr2[i2 + 2] = cArr4[c2 & 15];
                return;
            }
            char[] cArrD2 = this.d;
            if (cArrD2 == null) {
                cArrD2 = d();
            }
            this.f = this.i;
            if (c2 > 255) {
                int i8 = c2 >> '\b';
                char[] cArr5 = e;
                cArrD2[10] = cArr5[(i8 & 255) >> 4];
                cArrD2[11] = cArr5[i8 & 15];
                cArrD2[12] = cArr5[(c2 & 255) >> 4];
                cArrD2[13] = cArr5[c2 & 15];
                this.g.write(cArrD2, 8, 6);
                return;
            }
            char[] cArr6 = e;
            cArrD2[6] = cArr6[c2 >> 4];
            cArrD2[7] = cArr6[c2 & 15];
            this.g.write(cArrD2, 2, 6);
            return;
        }
        SerializableString serializableString = this.f53279a;
        if (serializableString == null) {
            value = this._characterEscapes.getEscapeSequence(c2).getValue();
        } else {
            value = serializableString.getValue();
            this.f53279a = null;
        }
        int length = value.length();
        int i9 = this.i;
        if (i9 >= length) {
            int i10 = i9 - length;
            this.f = i10;
            value.getChars(0, length, this.f53280b, i10);
        } else {
            this.f = i9;
            this.g.write(value);
        }
    }

    private int b(char[] cArr, int i, int i2, char c2, int i3) throws IOException {
        String value;
        int i4;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = IOUtils.DIR_SEPARATOR_WINDOWS;
                cArr[i - 1] = (char) i3;
                return i5;
            }
            char[] cArrD = this.d;
            if (cArrD == null) {
                cArrD = d();
            }
            cArrD[1] = (char) i3;
            this.g.write(cArrD, 0, 2);
            return i;
        }
        if (i3 == -2) {
            SerializableString serializableString = this.f53279a;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c2).getValue();
            } else {
                value = serializableString.getValue();
                this.f53279a = null;
            }
            int length = value.length();
            if (i >= length && i < i2) {
                int i6 = i - length;
                value.getChars(0, length, cArr, i6);
                return i6;
            }
            this.g.write(value);
            return i;
        }
        if (i > 5 && i < i2) {
            cArr[i - 6] = IOUtils.DIR_SEPARATOR_WINDOWS;
            int i7 = i - 4;
            cArr[i - 5] = 'u';
            if (c2 > 255) {
                int i8 = c2 >> '\b';
                char[] cArr2 = e;
                cArr[i7] = cArr2[(i8 & 255) >> 4];
                i4 = i - 2;
                cArr[i - 3] = cArr2[i8 & 15];
                c2 = (char) (c2 & 255);
            } else {
                cArr[i7] = '0';
                i4 = i - 2;
                cArr[i - 3] = '0';
            }
            char[] cArr3 = e;
            cArr[i4] = cArr3[c2 >> 4];
            cArr[i4 + 1] = cArr3[c2 & 15];
            return i4 - 4;
        }
        char[] cArrD2 = this.d;
        if (cArrD2 == null) {
            cArrD2 = d();
        }
        this.f = this.i;
        if (c2 > 255) {
            int i9 = c2 >> '\b';
            char[] cArr4 = e;
            cArrD2[10] = cArr4[(i9 & 255) >> 4];
            cArrD2[11] = cArr4[i9 & 15];
            cArrD2[12] = cArr4[(c2 & 255) >> 4];
            cArrD2[13] = cArr4[c2 & 15];
            this.g.write(cArrD2, 8, 6);
            return i;
        }
        char[] cArr5 = e;
        cArrD2[6] = cArr5[c2 >> 4];
        cArrD2[7] = cArr5[c2 & 15];
        this.g.write(cArrD2, 2, 6);
        return i;
    }

    private void c(char c2, int i) throws IOException {
        String value;
        int i2;
        if (i >= 0) {
            if (this.i + 2 > this.h) {
                e();
            }
            char[] cArr = this.f53280b;
            int i3 = this.i;
            cArr[i3] = IOUtils.DIR_SEPARATOR_WINDOWS;
            this.i = i3 + 2;
            cArr[i3 + 1] = (char) i;
            return;
        }
        if (i != -2) {
            if (this.i + 5 >= this.h) {
                e();
            }
            int i4 = this.i;
            char[] cArr2 = this.f53280b;
            cArr2[i4] = IOUtils.DIR_SEPARATOR_WINDOWS;
            int i5 = i4 + 2;
            cArr2[i4 + 1] = 'u';
            if (c2 > 255) {
                int i6 = c2 >> '\b';
                char[] cArr3 = e;
                cArr2[i5] = cArr3[(i6 & 255) >> 4];
                i2 = i4 + 4;
                cArr2[i4 + 3] = cArr3[i6 & 15];
                c2 = (char) (c2 & 255);
            } else {
                cArr2[i5] = '0';
                i2 = i4 + 4;
                cArr2[i4 + 3] = '0';
            }
            char[] cArr4 = e;
            cArr2[i2] = cArr4[c2 >> 4];
            cArr2[i2 + 1] = cArr4[c2 & 15];
            this.i = i2 + 2;
            return;
        }
        SerializableString serializableString = this.f53279a;
        if (serializableString == null) {
            value = this._characterEscapes.getEscapeSequence(c2).getValue();
        } else {
            value = serializableString.getValue();
            this.f53279a = null;
        }
        int length = value.length();
        if (this.i + length > this.h) {
            e();
            if (length > this.h) {
                this.g.write(value);
                return;
            }
        }
        value.getChars(0, length, this.f53280b, this.i);
        this.i += length;
    }

    private char[] d() {
        char[] cArr = {IOUtils.DIR_SEPARATOR_WINDOWS, 0, IOUtils.DIR_SEPARATOR_WINDOWS, 'u', '0', '0', 0, 0, IOUtils.DIR_SEPARATOR_WINDOWS, 'u', 0, 0, 0, 0};
        this.d = cArr;
        return cArr;
    }

    private char[] b() {
        if (this.f53281c == null) {
            this.f53281c = this._ioContext.b(2000);
        }
        return this.f53281c;
    }

    protected void e() throws IOException {
        int i = this.i;
        int i2 = this.f;
        int i3 = i - i2;
        if (i3 > 0) {
            this.f = 0;
            this.i = 0;
            this.g.write(this.f53280b, i2, i3);
        }
    }
}
