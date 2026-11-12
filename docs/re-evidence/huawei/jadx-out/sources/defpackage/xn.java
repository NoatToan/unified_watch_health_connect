package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
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
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes21.dex */
public class xn extends JsonGeneratorImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected byte[] f53179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected char[] f53180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f53181c;
    protected final int d;
    protected final int e;
    protected final OutputStream f;
    protected int h;
    protected final int i;
    protected byte j;
    private static final byte[] n = wz.b();
    private static final byte[] l = {110, 117, 108, 108};
    private static final byte[] k = {116, 114, 117, 101};
    private static final byte[] g = {102, 97, 108, 115, 101};

    public xn(xa xaVar, int i, ObjectCodec objectCodec, OutputStream outputStream, char c2) {
        super(xaVar, i, objectCodec);
        this.f = outputStream;
        this.j = (byte) c2;
        if (c2 != '\"') {
            this._outputEscapes = wz.d(c2);
        }
        this.f53181c = true;
        byte[] bArrA = xaVar.a();
        this.f53179a = bArrA;
        int length = bArrA.length;
        this.d = length;
        this.i = length >> 3;
        char[] cArrE = xaVar.e();
        this.f53180b = cArrE;
        this.e = cArrE.length;
        if (isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            setHighestNonEscapedChar(127);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public Object getOutputTarget() {
        return this.f;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getOutputBuffered() {
        return this.h;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            d(str);
            return;
        }
        int iB = this._writeContext.b(str);
        if (iB == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (iB == 1) {
            if (this.h >= this.d) {
                b();
            }
            byte[] bArr = this.f53179a;
            int i = this.h;
            this.h = i + 1;
            bArr[i] = 44;
        }
        if (this._cfgUnqNames) {
            b(str, false);
            return;
        }
        int length = str.length();
        if (length > this.e) {
            b(str, true);
            return;
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr2 = this.f53179a;
        int i2 = this.h;
        int i3 = i2 + 1;
        this.h = i3;
        bArr2[i2] = this.j;
        if (length <= this.i) {
            if (i3 + length > this.d) {
                b();
            }
            c(str, 0, length);
        } else {
            d(str, 0, length);
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr3 = this.f53179a;
        int i4 = this.h;
        this.h = i4 + 1;
        bArr3[i4] = this.j;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            b(serializableString);
            return;
        }
        int iB = this._writeContext.b(serializableString.getValue());
        if (iB == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (iB == 1) {
            if (this.h >= this.d) {
                b();
            }
            byte[] bArr = this.f53179a;
            int i = this.h;
            this.h = i + 1;
            bArr[i] = 44;
        }
        if (this._cfgUnqNames) {
            e(serializableString);
            return;
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr2 = this.f53179a;
        int i2 = this.h;
        int i3 = i2 + 1;
        this.h = i3;
        bArr2[i2] = this.j;
        int iAppendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr2, i3);
        if (iAppendQuotedUTF8 < 0) {
            e(serializableString.asQuotedUTF8());
        } else {
            this.h += iAppendQuotedUTF8;
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr3 = this.f53179a;
        int i4 = this.h;
        this.h = i4 + 1;
        bArr3[i4] = this.j;
    }

    private final void e(SerializableString serializableString) throws IOException {
        int iAppendQuotedUTF8 = serializableString.appendQuotedUTF8(this.f53179a, this.h);
        if (iAppendQuotedUTF8 < 0) {
            e(serializableString.asQuotedUTF8());
        } else {
            this.h += iAppendQuotedUTF8;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray() throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.b();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartArray(this);
            return;
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i = this.h;
        this.h = i + 1;
        bArr[i] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray(Object obj) throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.e(obj);
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartArray(this);
            return;
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i = this.h;
        this.h = i + 1;
        bArr[i] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj, int i) throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.e(obj);
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartArray(this);
            return;
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndArray() throws IOException {
        if (!this._writeContext.inArray()) {
            _reportError("Current context not Array but " + this._writeContext.typeDesc());
        }
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
        } else {
            if (this.h >= this.d) {
                b();
            }
            byte[] bArr = this.f53179a;
            int i = this.h;
            this.h = i + 1;
            bArr[i] = 93;
        }
        this._writeContext = this._writeContext.e();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartObject() throws IOException {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.a();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartObject(this);
            return;
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i = this.h;
        this.h = i + 1;
        bArr[i] = 123;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) throws IOException {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.b(obj);
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartObject(this);
            return;
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i = this.h;
        this.h = i + 1;
        bArr[i] = 123;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndObject() throws IOException {
        if (!this._writeContext.inObject()) {
            _reportError("Current context not Object but " + this._writeContext.typeDesc());
        }
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
        } else {
            if (this.h >= this.d) {
                b();
            }
            byte[] bArr = this.f53179a;
            int i = this.h;
            this.h = i + 1;
            bArr[i] = 125;
        }
        this._writeContext = this._writeContext.e();
    }

    protected final void d(String str) throws IOException {
        int iB = this._writeContext.b(str);
        if (iB == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (iB == 1) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            b(str, false);
            return;
        }
        int length = str.length();
        if (length > this.e) {
            b(str, true);
            return;
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i = this.h;
        this.h = i + 1;
        bArr[i] = this.j;
        str.getChars(0, length, this.f53180b, 0);
        if (length <= this.i) {
            if (this.h + length > this.d) {
                b();
            }
            b(this.f53180b, 0, length);
        } else {
            i(this.f53180b, 0, length);
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr2 = this.f53179a;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr2[i2] = this.j;
    }

    protected final void b(SerializableString serializableString) throws IOException {
        int iB = this._writeContext.b(serializableString.getValue());
        if (iB == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (iB == 1) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        boolean z = this._cfgUnqNames;
        if (!z) {
            if (this.h >= this.d) {
                b();
            }
            byte[] bArr = this.f53179a;
            int i = this.h;
            this.h = i + 1;
            bArr[i] = this.j;
        }
        int iAppendQuotedUTF8 = serializableString.appendQuotedUTF8(this.f53179a, this.h);
        if (iAppendQuotedUTF8 < 0) {
            e(serializableString.asQuotedUTF8());
        } else {
            this.h += iAppendQuotedUTF8;
        }
        if (z) {
            return;
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr2 = this.f53179a;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr2[i2] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        _verifyValueWrite("write a string");
        if (str == null) {
            c();
            return;
        }
        int length = str.length();
        if (length > this.i) {
            b(str, true);
            return;
        }
        if (this.h + length >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i = this.h;
        this.h = i + 1;
        bArr[i] = this.j;
        c(str, 0, length);
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr2 = this.f53179a;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr2[i2] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(Reader reader, int i) throws IOException {
        _verifyValueWrite("write a string");
        if (reader == null) {
            _reportError("null reader");
            return;
        }
        int i2 = i >= 0 ? i : Integer.MAX_VALUE;
        char[] cArr = this.f53180b;
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i3 = this.h;
        this.h = i3 + 1;
        bArr[i3] = this.j;
        while (i2 > 0) {
            int i4 = reader.read(cArr, 0, Math.min(i2, cArr.length));
            if (i4 <= 0) {
                break;
            }
            if (this.h + i >= this.d) {
                b();
            }
            i(cArr, 0, i4);
            i2 -= i4;
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr2 = this.f53179a;
        int i5 = this.h;
        this.h = i5 + 1;
        bArr2[i5] = this.j;
        if (i2 <= 0 || i < 0) {
            return;
        }
        _reportError("Didn't read enough from reader");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i, int i2) throws IOException {
        _verifyValueWrite("write a string");
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i3 = this.h;
        int i4 = i3 + 1;
        this.h = i4;
        bArr[i3] = this.j;
        if (i2 <= this.i) {
            if (i4 + i2 > this.d) {
                b();
            }
            b(cArr, i, i2);
        } else {
            i(cArr, i, i2);
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr2 = this.f53179a;
        int i5 = this.h;
        this.h = i5 + 1;
        bArr2[i5] = this.j;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public final void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a string");
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i = this.h;
        int i2 = i + 1;
        this.h = i2;
        bArr[i] = this.j;
        int iAppendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr, i2);
        if (iAppendQuotedUTF8 < 0) {
            e(serializableString.asQuotedUTF8());
        } else {
            this.h += iAppendQuotedUTF8;
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr2 = this.f53179a;
        int i3 = this.h;
        this.h = i3 + 1;
        bArr2[i3] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawUTF8String(byte[] bArr, int i, int i2) throws IOException {
        _verifyValueWrite("write a string");
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr2 = this.f53179a;
        int i3 = this.h;
        this.h = i3 + 1;
        bArr2[i3] = this.j;
        a(bArr, i, i2);
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr3 = this.f53179a;
        int i4 = this.h;
        this.h = i4 + 1;
        bArr3[i4] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeUTF8String(byte[] bArr, int i, int i2) throws IOException {
        _verifyValueWrite("write a string");
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr2 = this.f53179a;
        int i3 = this.h;
        this.h = i3 + 1;
        bArr2[i3] = this.j;
        if (i2 <= this.i) {
            e(bArr, i, i2);
        } else {
            d(bArr, i, i2);
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr3 = this.f53179a;
        int i4 = this.h;
        this.h = i4 + 1;
        bArr3[i4] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        int length = str.length();
        char[] cArr = this.f53180b;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            writeRaw(cArr, 0, length);
        } else {
            writeRaw(str, 0, length);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str, int i, int i2) throws IOException {
        int i3;
        char c2;
        char[] cArr = this.f53180b;
        int length = cArr.length;
        if (i2 <= length) {
            str.getChars(i, i + i2, cArr, 0);
            writeRaw(cArr, 0, i2);
            return;
        }
        int i4 = this.d;
        int iMin = Math.min(length, (i4 >> 2) + (i4 >> 4));
        while (i2 > 0) {
            int iMin2 = Math.min(iMin, i2);
            str.getChars(i, i + iMin2, cArr, 0);
            if (this.h + (iMin * 3) > this.d) {
                b();
            }
            if (iMin2 > 1 && (c2 = cArr[(i3 = iMin2 - 1)]) >= 55296 && c2 <= 56319) {
                iMin2 = i3;
            }
            d(cArr, 0, iMin2);
            i += iMin2;
            i2 -= iMin2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) throws IOException {
        int iAppendUnquotedUTF8 = serializableString.appendUnquotedUTF8(this.f53179a, this.h);
        if (iAppendUnquotedUTF8 < 0) {
            e(serializableString.asUnquotedUTF8());
        } else {
            this.h += iAppendUnquotedUTF8;
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a raw (unencoded) value");
        int iAppendUnquotedUTF8 = serializableString.appendUnquotedUTF8(this.f53179a, this.h);
        if (iAppendUnquotedUTF8 < 0) {
            e(serializableString.asUnquotedUTF8());
        } else {
            this.h += iAppendUnquotedUTF8;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeRaw(char[] cArr, int i, int i2) throws IOException {
        int i3 = i2 + i2 + i2;
        int i4 = this.h;
        int i5 = this.d;
        if (i4 + i3 > i5) {
            if (i5 < i3) {
                c(cArr, i, i2);
                return;
            }
            b();
        }
        int i6 = i2 + i;
        while (i < i6) {
            do {
                char c2 = cArr[i];
                if (c2 > 127) {
                    i++;
                    if (c2 < 2048) {
                        byte[] bArr = this.f53179a;
                        int i7 = this.h;
                        bArr[i7] = (byte) ((c2 >> 6) | PsExtractor.AUDIO_STREAM);
                        this.h = i7 + 2;
                        bArr[i7 + 1] = (byte) ((c2 & '?') | 128);
                    } else {
                        i = b(c2, cArr, i, i6);
                    }
                } else {
                    byte[] bArr2 = this.f53179a;
                    int i8 = this.h;
                    this.h = i8 + 1;
                    bArr2[i8] = (byte) c2;
                    i++;
                }
            } while (i < i6);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c2) throws IOException {
        if (this.h + 3 >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        if (c2 <= 127) {
            int i = this.h;
            this.h = i + 1;
            bArr[i] = (byte) c2;
        } else {
            if (c2 < 2048) {
                int i2 = this.h;
                bArr[i2] = (byte) ((c2 >> 6) | PsExtractor.AUDIO_STREAM);
                this.h = i2 + 2;
                bArr[i2 + 1] = (byte) ((c2 & '?') | 128);
                return;
            }
            b(c2, (char[]) null, 0, 0);
        }
    }

    private final void c(char[] cArr, int i, int i2) throws IOException {
        int i3 = this.d;
        byte[] bArr = this.f53179a;
        int i4 = i2 + i;
        while (i < i4) {
            do {
                char c2 = cArr[i];
                if (c2 < 128) {
                    if (this.h >= i3) {
                        b();
                    }
                    int i5 = this.h;
                    this.h = i5 + 1;
                    bArr[i5] = (byte) c2;
                    i++;
                } else {
                    if (this.h + 3 >= this.d) {
                        b();
                    }
                    int i6 = i + 1;
                    char c3 = cArr[i];
                    if (c3 < 2048) {
                        int i7 = this.h;
                        bArr[i7] = (byte) ((c3 >> 6) | PsExtractor.AUDIO_STREAM);
                        this.h = i7 + 2;
                        bArr[i7 + 1] = (byte) ((c3 & '?') | 128);
                        i = i6;
                    } else {
                        i = b(c3, cArr, i6, i4);
                    }
                }
            } while (i < i4);
            return;
        }
    }

    private void d(char[] cArr, int i, int i2) throws IOException {
        while (i < i2) {
            do {
                char c2 = cArr[i];
                if (c2 > 127) {
                    i++;
                    if (c2 < 2048) {
                        byte[] bArr = this.f53179a;
                        int i3 = this.h;
                        bArr[i3] = (byte) ((c2 >> 6) | PsExtractor.AUDIO_STREAM);
                        this.h = i3 + 2;
                        bArr[i3 + 1] = (byte) ((c2 & '?') | 128);
                    } else {
                        i = b(c2, cArr, i, i2);
                    }
                } else {
                    byte[] bArr2 = this.f53179a;
                    int i4 = this.h;
                    this.h = i4 + 1;
                    bArr2[i4] = (byte) c2;
                    i++;
                }
            } while (i < i2);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        _verifyValueWrite("write a binary value");
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr2 = this.f53179a;
        int i3 = this.h;
        this.h = i3 + 1;
        bArr2[i3] = this.j;
        c(base64Variant, bArr, i, i2 + i);
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr3 = this.f53179a;
        int i4 = this.h;
        this.h = i4 + 1;
        bArr3[i4] = this.j;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException {
        _verifyValueWrite("write a binary value");
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = this.j;
        byte[] bArrC = this._ioContext.c();
        try {
            if (i < 0) {
                i = c(base64Variant, inputStream, bArrC);
            } else {
                int iB = b(base64Variant, inputStream, bArrC, i);
                if (iB > 0) {
                    _reportError("Too few bytes available: missing " + iB + " bytes (out of " + i + Constants.RIGHT_BRACKET_ONLY);
                }
            }
            this._ioContext.a(bArrC);
            if (this.h >= this.d) {
                b();
            }
            byte[] bArr2 = this.f53179a;
            int i3 = this.h;
            this.h = i3 + 1;
            bArr2[i3] = this.j;
            return i;
        } catch (Throwable th) {
            this._ioContext.a(bArrC);
            throw th;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s) throws IOException {
        _verifyValueWrite("write a number");
        if (this.h + 6 >= this.d) {
            b();
        }
        if (this._cfgNumbersAsStrings) {
            e(s);
        } else {
            this.h = xc.d(s, this.f53179a, this.h);
        }
    }

    private final void e(short s) throws IOException {
        if (this.h + 8 >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i = this.h;
        int i2 = i + 1;
        this.h = i2;
        bArr[i] = this.j;
        int iD = xc.d(s, bArr, i2);
        byte[] bArr2 = this.f53179a;
        this.h = iD + 1;
        bArr2[iD] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i) throws IOException {
        _verifyValueWrite("write a number");
        if (this.h + 11 >= this.d) {
            b();
        }
        if (this._cfgNumbersAsStrings) {
            b(i);
        } else {
            this.h = xc.d(i, this.f53179a, this.h);
        }
    }

    private final void b(int i) throws IOException {
        if (this.h + 13 >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i2 = this.h;
        int i3 = i2 + 1;
        this.h = i3;
        bArr[i2] = this.j;
        int iD = xc.d(i, bArr, i3);
        byte[] bArr2 = this.f53179a;
        this.h = iD + 1;
        bArr2[iD] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            b(j);
            return;
        }
        if (this.h + 21 >= this.d) {
            b();
        }
        this.h = xc.b(j, this.f53179a, this.h);
    }

    private final void b(long j) throws IOException {
        if (this.h + 23 >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i = this.h;
        int i2 = i + 1;
        this.h = i2;
        bArr[i] = this.j;
        int iB = xc.b(j, bArr, i2);
        byte[] bArr2 = this.f53179a;
        this.h = iB + 1;
        bArr2[iB] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        _verifyValueWrite("write a number");
        if (bigInteger == null) {
            c();
        } else if (this._cfgNumbersAsStrings) {
            b(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d) throws IOException {
        if (this._cfgNumbersAsStrings || (xc.b(d) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            writeString(String.valueOf(d));
        } else {
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(d));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f) throws IOException {
        if (this._cfgNumbersAsStrings || (xc.b(f) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
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
            b(_asString(bigDecimal));
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
            b(str);
        } else {
            writeRaw(str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(char[] cArr, int i, int i2) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            e(cArr, i, i2);
        } else {
            writeRaw(cArr, i, i2);
        }
    }

    private final void b(String str) throws IOException {
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i = this.h;
        this.h = i + 1;
        bArr[i] = this.j;
        writeRaw(str);
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr2 = this.f53179a;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr2[i2] = this.j;
    }

    private void e(char[] cArr, int i, int i2) throws IOException {
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i3 = this.h;
        this.h = i3 + 1;
        bArr[i3] = this.j;
        writeRaw(cArr, i, i2);
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr2 = this.f53179a;
        int i4 = this.h;
        this.h = i4 + 1;
        bArr2[i4] = this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z) throws IOException {
        _verifyValueWrite("write a boolean value");
        if (this.h + 5 >= this.d) {
            b();
        }
        byte[] bArr = z ? k : g;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.f53179a, this.h, length);
        this.h += length;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _verifyValueWrite("write a null");
        c();
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public final void _verifyValueWrite(String str) throws IOException {
        byte b2;
        int i = this._writeContext.i();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, i);
            return;
        }
        if (i == 1) {
            b2 = 44;
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
                        byte[] bArrAsUnquotedUTF8 = this._rootValueSeparator.asUnquotedUTF8();
                        if (bArrAsUnquotedUTF8.length > 0) {
                            e(bArrAsUnquotedUTF8);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            b2 = 58;
        }
        if (this.h >= this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = b2;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        b();
        if (this.f == null || !isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.f.flush();
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.f53179a != null && isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
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
        b();
        this.h = 0;
        if (this.f != null) {
            if (this._ioContext.i() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this.f.close();
            } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this.f.flush();
            }
        }
        _releaseBuffers();
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public void _releaseBuffers() {
        byte[] bArr = this.f53179a;
        if (bArr != null && this.f53181c) {
            this.f53179a = null;
            this._ioContext.d(bArr);
        }
        char[] cArr = this.f53180b;
        if (cArr != null) {
            this.f53180b = null;
            this._ioContext.d(cArr);
        }
    }

    private final void e(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.h + length > this.d) {
            b();
            if (length > 512) {
                this.f.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.f53179a, this.h, length);
        this.h += length;
    }

    private final void a(byte[] bArr, int i, int i2) throws IOException {
        if (this.h + i2 > this.d) {
            b();
            if (i2 > 512) {
                this.f.write(bArr, i, i2);
                return;
            }
        }
        System.arraycopy(bArr, i, this.f53179a, this.h, i2);
        this.h += i2;
    }

    private final void b(String str, boolean z) throws IOException {
        if (z) {
            if (this.h >= this.d) {
                b();
            }
            byte[] bArr = this.f53179a;
            int i = this.h;
            this.h = i + 1;
            bArr[i] = this.j;
        }
        int length = str.length();
        int i2 = 0;
        while (length > 0) {
            int iMin = Math.min(this.i, length);
            if (this.h + iMin > this.d) {
                b();
            }
            c(str, i2, iMin);
            i2 += iMin;
            length -= iMin;
        }
        if (z) {
            if (this.h >= this.d) {
                b();
            }
            byte[] bArr2 = this.f53179a;
            int i3 = this.h;
            this.h = i3 + 1;
            bArr2[i3] = this.j;
        }
    }

    private final void i(char[] cArr, int i, int i2) throws IOException {
        do {
            int iMin = Math.min(this.i, i2);
            if (this.h + iMin > this.d) {
                b();
            }
            b(cArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    private final void d(String str, int i, int i2) throws IOException {
        do {
            int iMin = Math.min(this.i, i2);
            if (this.h + iMin > this.d) {
                b();
            }
            c(str, i, iMin);
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    private final void b(char[] cArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = this.h;
        byte[] bArr = this.f53179a;
        int[] iArr = this._outputEscapes;
        while (i < i3) {
            char c2 = cArr[i];
            if (c2 > 127 || iArr[c2] != 0) {
                break;
            }
            bArr[i4] = (byte) c2;
            i++;
            i4++;
        }
        this.h = i4;
        if (i < i3) {
            if (this._characterEscapes != null) {
                a(cArr, i, i3);
            } else if (this._maximumNonEscapedChar == 0) {
                j(cArr, i, i3);
            } else {
                h(cArr, i, i3);
            }
        }
    }

    private final void c(String str, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = this.h;
        byte[] bArr = this.f53179a;
        int[] iArr = this._outputEscapes;
        while (i < i3) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 127 || iArr[cCharAt] != 0) {
                break;
            }
            bArr[i4] = (byte) cCharAt;
            i++;
            i4++;
        }
        this.h = i4;
        if (i < i3) {
            if (this._characterEscapes != null) {
                e(str, i, i3);
            } else if (this._maximumNonEscapedChar == 0) {
                b(str, i, i3);
            } else {
                a(str, i, i3);
            }
        }
    }

    private final void j(char[] cArr, int i, int i2) throws IOException {
        int iC;
        if (this.h + ((i2 - i) * 6) > this.d) {
            b();
        }
        int i3 = this.h;
        byte[] bArr = this.f53179a;
        int[] iArr = this._outputEscapes;
        while (i < i2) {
            int i4 = i + 1;
            char c2 = cArr[i];
            if (c2 <= 127) {
                int i5 = iArr[c2];
                if (i5 == 0) {
                    bArr[i3] = (byte) c2;
                    i3++;
                } else {
                    if (i5 > 0) {
                        bArr[i3] = 92;
                        iC = i3 + 2;
                        bArr[i3 + 1] = (byte) i5;
                    } else {
                        iC = d(c2, i3);
                    }
                    i3 = iC;
                }
            } else if (c2 <= 2047) {
                bArr[i3] = (byte) ((c2 >> 6) | PsExtractor.AUDIO_STREAM);
                int i6 = i3 + 2;
                bArr[i3 + 1] = (byte) ((c2 & '?') | 128);
                i3 = i6;
            } else {
                iC = c(c2, i3);
                i3 = iC;
            }
            i = i4;
        }
        this.h = i3;
    }

    private final void b(String str, int i, int i2) throws IOException {
        int iC;
        if (this.h + ((i2 - i) * 6) > this.d) {
            b();
        }
        int i3 = this.h;
        byte[] bArr = this.f53179a;
        int[] iArr = this._outputEscapes;
        while (i < i2) {
            int i4 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                int i5 = iArr[cCharAt];
                if (i5 == 0) {
                    bArr[i3] = (byte) cCharAt;
                    i3++;
                } else {
                    if (i5 > 0) {
                        bArr[i3] = 92;
                        iC = i3 + 2;
                        bArr[i3 + 1] = (byte) i5;
                    } else {
                        iC = d(cCharAt, i3);
                    }
                    i3 = iC;
                }
            } else if (cCharAt <= 2047) {
                bArr[i3] = (byte) ((cCharAt >> 6) | PsExtractor.AUDIO_STREAM);
                int i6 = i3 + 2;
                bArr[i3 + 1] = (byte) ((cCharAt & '?') | 128);
                i3 = i6;
            } else {
                iC = c(cCharAt, i3);
                i3 = iC;
            }
            i = i4;
        }
        this.h = i3;
    }

    private final void h(char[] cArr, int i, int i2) throws IOException {
        int iC;
        if (this.h + ((i2 - i) * 6) > this.d) {
            b();
        }
        int i3 = this.h;
        byte[] bArr = this.f53179a;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar;
        while (i < i2) {
            int i5 = i + 1;
            char c2 = cArr[i];
            if (c2 <= 127) {
                int i6 = iArr[c2];
                if (i6 == 0) {
                    bArr[i3] = (byte) c2;
                    i3++;
                } else {
                    if (i6 > 0) {
                        bArr[i3] = 92;
                        iC = i3 + 2;
                        bArr[i3 + 1] = (byte) i6;
                    } else {
                        iC = d(c2, i3);
                    }
                    i3 = iC;
                }
            } else {
                if (c2 > i4) {
                    iC = d(c2, i3);
                } else if (c2 <= 2047) {
                    bArr[i3] = (byte) ((c2 >> 6) | PsExtractor.AUDIO_STREAM);
                    int i7 = i3 + 2;
                    bArr[i3 + 1] = (byte) ((c2 & '?') | 128);
                    i3 = i7;
                } else {
                    iC = c(c2, i3);
                }
                i3 = iC;
            }
            i = i5;
        }
        this.h = i3;
    }

    private final void a(String str, int i, int i2) throws IOException {
        int iC;
        if (this.h + ((i2 - i) * 6) > this.d) {
            b();
        }
        int i3 = this.h;
        byte[] bArr = this.f53179a;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar;
        while (i < i2) {
            int i5 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                int i6 = iArr[cCharAt];
                if (i6 == 0) {
                    bArr[i3] = (byte) cCharAt;
                    i3++;
                } else {
                    if (i6 > 0) {
                        bArr[i3] = 92;
                        iC = i3 + 2;
                        bArr[i3 + 1] = (byte) i6;
                    } else {
                        iC = d(cCharAt, i3);
                    }
                    i3 = iC;
                }
            } else {
                if (cCharAt > i4) {
                    iC = d(cCharAt, i3);
                } else if (cCharAt <= 2047) {
                    bArr[i3] = (byte) ((cCharAt >> 6) | PsExtractor.AUDIO_STREAM);
                    int i7 = i3 + 2;
                    bArr[i3 + 1] = (byte) ((cCharAt & '?') | 128);
                    i3 = i7;
                } else {
                    iC = c(cCharAt, i3);
                }
                i3 = iC;
            }
            i = i5;
        }
        this.h = i3;
    }

    private final void a(char[] cArr, int i, int i2) throws IOException {
        int iC;
        if (this.h + ((i2 - i) * 6) > this.d) {
            b();
        }
        int i3 = this.h;
        byte[] bArr = this.f53179a;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar <= 0 ? 65535 : this._maximumNonEscapedChar;
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (i < i2) {
            int i5 = i + 1;
            char c2 = cArr[i];
            if (c2 <= 127) {
                int i6 = iArr[c2];
                if (i6 == 0) {
                    bArr[i3] = (byte) c2;
                    i3++;
                } else {
                    if (i6 > 0) {
                        bArr[i3] = 92;
                        iC = i3 + 2;
                        bArr[i3 + 1] = (byte) i6;
                    } else if (i6 == -2) {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(c2);
                        if (escapeSequence == null) {
                            _reportError("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c2) + ", although was supposed to have one");
                        }
                        iC = b(bArr, i3, escapeSequence, i2 - i5);
                    } else {
                        iC = d(c2, i3);
                    }
                    i3 = iC;
                }
            } else {
                if (c2 > i4) {
                    iC = d(c2, i3);
                } else {
                    SerializableString escapeSequence2 = characterEscapes.getEscapeSequence(c2);
                    if (escapeSequence2 != null) {
                        iC = b(bArr, i3, escapeSequence2, i2 - i5);
                    } else if (c2 <= 2047) {
                        bArr[i3] = (byte) ((c2 >> 6) | PsExtractor.AUDIO_STREAM);
                        bArr[i3 + 1] = (byte) ((c2 & '?') | 128);
                        i3 += 2;
                    } else {
                        iC = c(c2, i3);
                    }
                }
                i3 = iC;
            }
            i = i5;
        }
        this.h = i3;
    }

    private final void e(String str, int i, int i2) throws IOException {
        int iC;
        if (this.h + ((i2 - i) * 6) > this.d) {
            b();
        }
        int i3 = this.h;
        byte[] bArr = this.f53179a;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar <= 0 ? 65535 : this._maximumNonEscapedChar;
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (i < i2) {
            int i5 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                int i6 = iArr[cCharAt];
                if (i6 == 0) {
                    bArr[i3] = (byte) cCharAt;
                    i3++;
                } else {
                    if (i6 > 0) {
                        bArr[i3] = 92;
                        iC = i3 + 2;
                        bArr[i3 + 1] = (byte) i6;
                    } else if (i6 == -2) {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(cCharAt);
                        if (escapeSequence == null) {
                            _reportError("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(cCharAt) + ", although was supposed to have one");
                        }
                        iC = b(bArr, i3, escapeSequence, i2 - i5);
                    } else {
                        iC = d(cCharAt, i3);
                    }
                    i3 = iC;
                }
            } else {
                if (cCharAt > i4) {
                    iC = d(cCharAt, i3);
                } else {
                    SerializableString escapeSequence2 = characterEscapes.getEscapeSequence(cCharAt);
                    if (escapeSequence2 != null) {
                        iC = b(bArr, i3, escapeSequence2, i2 - i5);
                    } else if (cCharAt <= 2047) {
                        bArr[i3] = (byte) ((cCharAt >> 6) | PsExtractor.AUDIO_STREAM);
                        bArr[i3 + 1] = (byte) ((cCharAt & '?') | 128);
                        i3 += 2;
                    } else {
                        iC = c(cCharAt, i3);
                    }
                }
                i3 = iC;
            }
            i = i5;
        }
        this.h = i3;
    }

    private final int b(byte[] bArr, int i, SerializableString serializableString, int i2) throws IOException {
        byte[] bArrAsUnquotedUTF8 = serializableString.asUnquotedUTF8();
        int length = bArrAsUnquotedUTF8.length;
        if (length > 6) {
            return d(bArr, i, this.d, bArrAsUnquotedUTF8, i2);
        }
        System.arraycopy(bArrAsUnquotedUTF8, 0, bArr, i, length);
        return i + length;
    }

    private final int d(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        int length = bArr2.length;
        if (i + length > i2) {
            this.h = i;
            b();
            i = this.h;
            if (length > bArr.length) {
                this.f.write(bArr2, 0, length);
                return i;
            }
        }
        System.arraycopy(bArr2, 0, bArr, i, length);
        int i4 = i + length;
        if ((i3 * 6) + i4 <= i2) {
            return i4;
        }
        this.h = i4;
        b();
        return this.h;
    }

    private final void d(byte[] bArr, int i, int i2) throws IOException {
        do {
            int iMin = Math.min(this.i, i2);
            e(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    private final void e(byte[] bArr, int i, int i2) throws IOException {
        int[] iArr = this._outputEscapes;
        for (int i3 = i; i3 < i + i2; i3++) {
            byte b2 = bArr[i3];
            if (b2 >= 0 && iArr[b2] != 0) {
                c(bArr, i, i2);
                return;
            }
        }
        if (this.h + i2 > this.d) {
            b();
        }
        System.arraycopy(bArr, i, this.f53179a, this.h, i2);
        this.h += i2;
    }

    private final void c(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int iD = this.h;
        if ((i2 * 6) + iD > this.d) {
            b();
            iD = this.h;
        }
        byte[] bArr2 = this.f53179a;
        int[] iArr = this._outputEscapes;
        int i4 = i;
        while (i4 < i2 + i) {
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 < 0 || (i3 = iArr[b2]) == 0) {
                bArr2[iD] = b2;
                iD++;
            } else if (i3 > 0) {
                bArr2[iD] = 92;
                bArr2[iD + 1] = (byte) i3;
                iD += 2;
            } else {
                iD = d(b2, iD);
            }
            i4 = i5;
        }
        this.h = iD;
    }

    protected final void c(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int iC;
        int i4 = this.d - 6;
        int iA = base64Variant.a();
        loop0: while (true) {
            int i5 = iA >> 2;
            while (true) {
                if (i > i2 - 3) {
                    break loop0;
                }
                if (this.h > i4) {
                    b();
                }
                byte b2 = bArr[i];
                byte b3 = bArr[i + 1];
                i3 = i + 3;
                iC = base64Variant.c((bArr[i + 2] & 255) | (((b2 << 8) | (b3 & 255)) << 8), this.f53179a, this.h);
                this.h = iC;
                i5--;
                if (i5 <= 0) {
                    break;
                } else {
                    i = i3;
                }
            }
            byte[] bArr2 = this.f53179a;
            bArr2[iC] = 92;
            this.h = iC + 2;
            bArr2[iC + 1] = 110;
            iA = base64Variant.a();
            i = i3;
        }
        int i6 = i2 - i;
        if (i6 > 0) {
            if (this.h > i4) {
                b();
            }
            int i7 = bArr[i] << 16;
            if (i6 == 2) {
                i7 |= (bArr[i + 1] & 255) << 8;
            }
            this.h = base64Variant.d(i7, i6, this.f53179a, this.h);
        }
    }

    protected final int b(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) throws IOException {
        int iA;
        int i2 = this.d - 6;
        int i3 = 2;
        int i4 = -3;
        int i5 = i;
        int iA2 = base64Variant.a() >> 2;
        int i6 = 0;
        int iA3 = 0;
        while (i5 > 2) {
            if (i6 > i4) {
                iA3 = a(inputStream, bArr, i6, iA3, i5);
                if (iA3 < 3) {
                    i6 = 0;
                    break;
                }
                i4 = iA3 - 3;
                i6 = 0;
            }
            if (this.h > i2) {
                b();
            }
            int i7 = i6 + 3;
            i5 -= 3;
            int iC = base64Variant.c((((bArr[i6] << 8) | (bArr[i6 + 1] & 255)) << 8) | (bArr[i6 + 2] & 255), this.f53179a, this.h);
            this.h = iC;
            iA2--;
            if (iA2 <= 0) {
                byte[] bArr2 = this.f53179a;
                bArr2[iC] = 92;
                this.h = iC + 2;
                bArr2[iC + 1] = 110;
                iA2 = base64Variant.a() >> 2;
            }
            i6 = i7;
        }
        if (i5 <= 0 || (iA = a(inputStream, bArr, i6, iA3, i5)) <= 0) {
            return i5;
        }
        if (this.h > i2) {
            b();
        }
        int i8 = bArr[0] << 16;
        if (1 < iA) {
            i8 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        this.h = base64Variant.d(i8, i3, this.f53179a, this.h);
        return i5 - i3;
    }

    protected final int c(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.d - 6;
        int i2 = 2;
        int iA = base64Variant.a() >> 2;
        int i3 = -3;
        int i4 = 0;
        int iA2 = 0;
        int i5 = 0;
        while (true) {
            if (i4 > i3) {
                iA2 = a(inputStream, bArr, i4, iA2, bArr.length);
                if (iA2 < 3) {
                    break;
                }
                i3 = iA2 - 3;
                i4 = 0;
            }
            if (this.h > i) {
                b();
            }
            int i6 = i4 + 3;
            i5 += 3;
            int iC = base64Variant.c((((bArr[i4] << 8) | (bArr[i4 + 1] & 255)) << 8) | (bArr[i4 + 2] & 255), this.f53179a, this.h);
            this.h = iC;
            iA--;
            if (iA <= 0) {
                byte[] bArr2 = this.f53179a;
                bArr2[iC] = 92;
                this.h = iC + 2;
                bArr2[iC + 1] = 110;
                iA = base64Variant.a() >> 2;
            }
            i4 = i6;
        }
        if (iA2 <= 0) {
            return i5;
        }
        if (this.h > i) {
            b();
        }
        int i7 = bArr[0] << 16;
        if (1 < iA2) {
            i7 |= (bArr[1] & 255) << 8;
        } else {
            i2 = 1;
        }
        int i8 = i5 + i2;
        this.h = base64Variant.d(i7, i2, this.f53179a, this.h);
        return i8;
    }

    private final int a(InputStream inputStream, byte[] bArr, int i, int i2, int i3) throws IOException {
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

    private final int b(int i, char[] cArr, int i2, int i3) throws IOException {
        if (i >= 55296 && i <= 57343) {
            if (i2 >= i3 || cArr == null) {
                _reportError(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i)));
            } else {
                a(i, cArr[i2]);
            }
            return i2 + 1;
        }
        byte[] bArr = this.f53179a;
        int i4 = this.h;
        bArr[i4] = (byte) ((i >> 12) | 224);
        bArr[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
        this.h = i4 + 3;
        bArr[i4 + 2] = (byte) ((i & 63) | 128);
        return i2;
    }

    protected final void a(int i, int i2) throws IOException {
        int i_decodeSurrogate = _decodeSurrogate(i, i2);
        if (this.h + 4 > this.d) {
            b();
        }
        byte[] bArr = this.f53179a;
        int i3 = this.h;
        bArr[i3] = (byte) ((i_decodeSurrogate >> 18) | 240);
        bArr[i3 + 1] = (byte) (((i_decodeSurrogate >> 12) & 63) | 128);
        bArr[i3 + 2] = (byte) (((i_decodeSurrogate >> 6) & 63) | 128);
        this.h = i3 + 4;
        bArr[i3 + 3] = (byte) ((i_decodeSurrogate & 63) | 128);
    }

    private final int c(int i, int i2) throws IOException {
        byte[] bArr = this.f53179a;
        if (i >= 55296 && i <= 57343) {
            bArr[i2] = 92;
            bArr[i2 + 1] = 117;
            byte[] bArr2 = n;
            bArr[i2 + 2] = bArr2[(i >> 12) & 15];
            bArr[i2 + 3] = bArr2[(i >> 8) & 15];
            bArr[i2 + 4] = bArr2[(i >> 4) & 15];
            bArr[i2 + 5] = bArr2[i & 15];
            return i2 + 6;
        }
        bArr[i2] = (byte) ((i >> 12) | 224);
        bArr[i2 + 1] = (byte) (((i >> 6) & 63) | 128);
        bArr[i2 + 2] = (byte) ((i & 63) | 128);
        return i2 + 3;
    }

    private final void c() throws IOException {
        if (this.h + 4 >= this.d) {
            b();
        }
        System.arraycopy(l, 0, this.f53179a, this.h, 4);
        this.h += 4;
    }

    private int d(int i, int i2) throws IOException {
        int i3;
        byte[] bArr = this.f53179a;
        bArr[i2] = 92;
        int i4 = i2 + 2;
        bArr[i2 + 1] = 117;
        if (i > 255) {
            int i5 = i >> 8;
            byte[] bArr2 = n;
            bArr[i4] = bArr2[(i5 & 255) >> 4];
            i3 = i2 + 4;
            bArr[i2 + 3] = bArr2[i5 & 15];
            i &= 255;
        } else {
            bArr[i4] = 48;
            i3 = i2 + 4;
            bArr[i2 + 3] = 48;
        }
        byte[] bArr3 = n;
        bArr[i3] = bArr3[i >> 4];
        bArr[i3 + 1] = bArr3[i & 15];
        return i3 + 2;
    }

    protected final void b() throws IOException {
        int i = this.h;
        if (i > 0) {
            this.h = 0;
            this.f.write(this.f53179a, 0, i);
        }
    }
}
