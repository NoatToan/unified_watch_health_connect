package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.StreamWriteCapability;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.huawei.hms.network.embedded.g4;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes21.dex */
public class aii extends JsonGenerator {
    protected static final int e = JsonGenerator.Feature.collectDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f461c;
    protected boolean d;
    protected e f;
    protected boolean g;
    protected boolean h;
    protected boolean i;
    protected int j;
    protected boolean k;
    protected Object l;
    protected ObjectCodec m;
    protected JsonStreamContext n;
    protected Object o;
    protected xm q;

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteBinaryNatively() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator useDefaultPrettyPrinter() {
        return this;
    }

    public aii(ObjectCodec objectCodec, boolean z) {
        this.i = false;
        this.m = objectCodec;
        this.j = e;
        this.q = xm.d(null);
        e eVar = new e();
        this.f = eVar;
        this.f461c = eVar;
        this.f459a = 0;
        this.h = z;
        this.g = z;
        this.k = z || z;
    }

    public aii(JsonParser jsonParser) {
        this(jsonParser, (DeserializationContext) null);
    }

    public aii(JsonParser jsonParser, DeserializationContext deserializationContext) {
        this.i = false;
        this.m = jsonParser.getCodec();
        this.n = jsonParser.getParsingContext();
        this.j = e;
        this.q = xm.d(null);
        e eVar = new e();
        this.f = eVar;
        this.f461c = eVar;
        this.f459a = 0;
        this.h = jsonParser.canReadTypeId();
        boolean zCanReadObjectId = jsonParser.canReadObjectId();
        this.g = zCanReadObjectId;
        this.k = this.h || zCanReadObjectId;
        this.f460b = deserializationContext != null ? deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) : false;
    }

    public static aii e(JsonParser jsonParser) throws IOException {
        aii aiiVar = new aii(jsonParser);
        aiiVar.copyCurrentStructure(jsonParser);
        return aiiVar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.core.Versioned
    public wu version() {
        return za.e;
    }

    public JsonParser b() {
        return b(this.m);
    }

    public JsonParser c() throws IOException {
        JsonParser jsonParserB = b(this.m);
        jsonParserB.nextToken();
        return jsonParserB;
    }

    public JsonParser b(ObjectCodec objectCodec) {
        return new a(this.f461c, objectCodec, this.h, this.g, this.n);
    }

    public JsonParser a(JsonParser jsonParser) {
        a aVar = new a(this.f461c, jsonParser.getCodec(), this.h, this.g, this.n);
        aVar.a(jsonParser.getTokenLocation());
        return aVar;
    }

    public JsonToken d() {
        return this.f461c.a(0);
    }

    public aii b(aii aiiVar) throws IOException {
        if (!this.h) {
            this.h = aiiVar.canWriteTypeId();
        }
        if (!this.g) {
            this.g = aiiVar.canWriteObjectId();
        }
        this.k = this.h || this.g;
        JsonParser jsonParserB = aiiVar.b();
        while (jsonParserB.nextToken() != null) {
            copyCurrentStructure(jsonParserB);
        }
        return this;
    }

    public void c(JsonGenerator jsonGenerator) throws IOException {
        e eVarD = this.f461c;
        boolean z = this.k;
        boolean z2 = z && eVarD.a();
        int i = -1;
        while (true) {
            i++;
            if (i >= 16) {
                eVarD = eVarD.d();
                if (eVarD == null) {
                    return;
                }
                z2 = z && eVarD.a();
                i = 0;
            }
            JsonToken jsonTokenA = eVarD.a(i);
            if (jsonTokenA == null) {
                return;
            }
            if (z2) {
                Object objD = eVarD.d(i);
                if (objD != null) {
                    jsonGenerator.writeObjectId(objD);
                }
                Object objC = eVarD.c(i);
                if (objC != null) {
                    jsonGenerator.writeTypeId(objC);
                }
            }
            switch (AnonymousClass5.f463c[jsonTokenA.ordinal()]) {
                case 1:
                    jsonGenerator.writeStartObject();
                    break;
                case 2:
                    jsonGenerator.writeEndObject();
                    break;
                case 3:
                    jsonGenerator.writeStartArray();
                    break;
                case 4:
                    jsonGenerator.writeEndArray();
                    break;
                case 5:
                    Object objB = eVarD.b(i);
                    if (objB instanceof SerializableString) {
                        jsonGenerator.writeFieldName((SerializableString) objB);
                    } else {
                        jsonGenerator.writeFieldName((String) objB);
                    }
                    break;
                case 6:
                    Object objB2 = eVarD.b(i);
                    if (objB2 instanceof SerializableString) {
                        jsonGenerator.writeString((SerializableString) objB2);
                    } else {
                        jsonGenerator.writeString((String) objB2);
                    }
                    break;
                case 7:
                    Object objB3 = eVarD.b(i);
                    if (objB3 instanceof Integer) {
                        jsonGenerator.writeNumber(((Integer) objB3).intValue());
                    } else if (objB3 instanceof BigInteger) {
                        jsonGenerator.writeNumber((BigInteger) objB3);
                    } else if (objB3 instanceof Long) {
                        jsonGenerator.writeNumber(((Long) objB3).longValue());
                    } else if (objB3 instanceof Short) {
                        jsonGenerator.writeNumber(((Short) objB3).shortValue());
                    } else {
                        jsonGenerator.writeNumber(((Number) objB3).intValue());
                    }
                    break;
                case 8:
                    Object objB4 = eVarD.b(i);
                    if (objB4 instanceof Double) {
                        jsonGenerator.writeNumber(((Double) objB4).doubleValue());
                    } else if (objB4 instanceof BigDecimal) {
                        jsonGenerator.writeNumber((BigDecimal) objB4);
                    } else if (objB4 instanceof Float) {
                        jsonGenerator.writeNumber(((Float) objB4).floatValue());
                    } else if (objB4 == null) {
                        jsonGenerator.writeNull();
                    } else if (objB4 instanceof String) {
                        jsonGenerator.writeNumber((String) objB4);
                    } else {
                        throw new wp(String.format("Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize", objB4.getClass().getName()), jsonGenerator);
                    }
                    break;
                case 9:
                    jsonGenerator.writeBoolean(true);
                    break;
                case 10:
                    jsonGenerator.writeBoolean(false);
                    break;
                case 11:
                    jsonGenerator.writeNull();
                    break;
                case 12:
                    Object objB5 = eVarD.b(i);
                    if (objB5 instanceof aid) {
                        ((aid) objB5).c(jsonGenerator);
                    } else if (objB5 instanceof JsonSerializable) {
                        jsonGenerator.writeObject(objB5);
                    } else {
                        jsonGenerator.writeEmbeddedObject(objB5);
                    }
                    break;
                default:
                    throw new RuntimeException("Internal error: should never end up through this code path");
            }
        }
    }

    public aii c(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonTokenNextToken;
        if (!jsonParser.hasToken(JsonToken.FIELD_NAME)) {
            copyCurrentStructure(jsonParser);
            return this;
        }
        writeStartObject();
        do {
            copyCurrentStructure(jsonParser);
            jsonTokenNextToken = jsonParser.nextToken();
        } while (jsonTokenNextToken == JsonToken.FIELD_NAME);
        if (jsonTokenNextToken != JsonToken.END_OBJECT) {
            deserializationContext.reportWrongTokenException(aii.class, JsonToken.END_OBJECT, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + jsonTokenNextToken, new Object[0]);
        }
        writeEndObject();
        return this;
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("[TokenBuffer: ");
        JsonParser jsonParserB = b();
        boolean z = false;
        if (this.h || this.g) {
            z = true;
            i = 0;
        } else {
            i = 0;
        }
        while (true) {
            try {
                JsonToken jsonTokenNextToken = jsonParserB.nextToken();
                if (jsonTokenNextToken == null) {
                    break;
                }
                if (z) {
                    d(sb);
                }
                if (i < 100) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(jsonTokenNextToken.toString());
                    if (jsonTokenNextToken == JsonToken.FIELD_NAME) {
                        sb.append(g4.k);
                        sb.append(jsonParserB.currentName());
                        sb.append(g4.l);
                    }
                }
                i++;
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }
        if (i >= 100) {
            sb.append(" ... (truncated ");
            sb.append(i - 100);
            sb.append(" entries)");
        }
        sb.append(']');
        return sb.toString();
    }

    private final void d(StringBuilder sb) {
        Object objD = this.f.d(this.f459a - 1);
        if (objD != null) {
            sb.append("[objectId=");
            sb.append(String.valueOf(objD));
            sb.append(']');
        }
        Object objC = this.f.c(this.f459a - 1);
        if (objC != null) {
            sb.append("[typeId=");
            sb.append(String.valueOf(objC));
            sb.append(']');
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator enable(JsonGenerator.Feature feature) {
        this.j = feature.getMask() | this.j;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator disable(JsonGenerator.Feature feature) {
        this.j = (~feature.getMask()) & this.j;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this.j) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getFeatureMask() {
        return this.j;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    @Deprecated
    public JsonGenerator setFeatureMask(int i) {
        this.j = i;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator overrideStdFeatures(int i, int i2) {
        this.j = (i & i2) | ((~i2) & getFeatureMask());
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator setCodec(ObjectCodec objectCodec) {
        this.m = objectCodec;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public ObjectCodec getCodec() {
        return this.m;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xm getOutputContext() {
        return this.q;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public yb<StreamWriteCapability> getWriteCapabilities() {
        return DEFAULT_WRITE_CAPABILITIES;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.d = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean isClosed() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray() throws IOException {
        this.q.i();
        b(JsonToken.START_ARRAY);
        this.q = this.q.b();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj) throws IOException {
        this.q.i();
        b(JsonToken.START_ARRAY);
        this.q = this.q.e(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj, int i) throws IOException {
        this.q.i();
        b(JsonToken.START_ARRAY);
        this.q = this.q.e(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndArray() throws IOException {
        d(JsonToken.END_ARRAY);
        xm parent = this.q.getParent();
        if (parent != null) {
            this.q = parent;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartObject() throws IOException {
        this.q.i();
        b(JsonToken.START_OBJECT);
        this.q = this.q.a();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) throws IOException {
        this.q.i();
        b(JsonToken.START_OBJECT);
        this.q = this.q.b(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj, int i) throws IOException {
        this.q.i();
        b(JsonToken.START_OBJECT);
        this.q = this.q.b(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndObject() throws IOException {
        d(JsonToken.END_OBJECT);
        xm parent = this.q.getParent();
        if (parent != null) {
            this.q = parent;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeFieldName(String str) throws IOException {
        this.q.b(str);
        b(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        this.q.b(serializableString.getValue());
        b(serializableString);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        if (str == null) {
            writeNull();
        } else {
            d(JsonToken.VALUE_STRING, str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i, int i2) throws IOException {
        writeString(new String(cArr, i, i2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) throws IOException {
        if (serializableString == null) {
            writeNull();
        } else {
            d(JsonToken.VALUE_STRING, serializableString);
        }
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
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str, int i, int i2) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i, int i2) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c2) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str) throws IOException {
        d(JsonToken.VALUE_EMBEDDED_OBJECT, new aid(str));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str, int i, int i2) throws IOException {
        if (i > 0 || i2 != str.length()) {
            str = str.substring(i, i2 + i);
        }
        d(JsonToken.VALUE_EMBEDDED_OBJECT, new aid(str));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(char[] cArr, int i, int i2) throws IOException {
        d(JsonToken.VALUE_EMBEDDED_OBJECT, new String(cArr, i, i2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s) throws IOException {
        d(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i) throws IOException {
        d(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j) throws IOException {
        d(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d) throws IOException {
        d(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f) throws IOException {
        d(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        if (bigDecimal == null) {
            writeNull();
        } else {
            d(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            writeNull();
        } else {
            d(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) throws IOException {
        d(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z) throws IOException {
        c(z ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        c(JsonToken.VALUE_NULL);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
            return;
        }
        if (obj.getClass() == byte[].class || (obj instanceof aid)) {
            d(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            return;
        }
        ObjectCodec objectCodec = this.m;
        if (objectCodec == null) {
            d(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            objectCodec.writeValue(this, obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeTree(TreeNode treeNode) throws IOException {
        if (treeNode == null) {
            writeNull();
            return;
        }
        ObjectCodec objectCodec = this.m;
        if (objectCodec == null) {
            d(JsonToken.VALUE_EMBEDDED_OBJECT, treeNode);
        } else {
            objectCodec.writeTree(this, treeNode);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        writeObject(bArr2);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteTypeId() {
        return this.h;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteObjectId() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeTypeId(Object obj) {
        this.o = obj;
        this.i = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeObjectId(Object obj) {
        this.l = obj;
        this.i = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEmbeddedObject(Object obj) throws IOException {
        d(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copyCurrentEvent(JsonParser jsonParser) throws IOException {
        if (this.k) {
            b(jsonParser);
        }
        switch (AnonymousClass5.f463c[jsonParser.currentToken().ordinal()]) {
            case 1:
                writeStartObject();
                return;
            case 2:
                writeEndObject();
                return;
            case 3:
                writeStartArray();
                return;
            case 4:
                writeEndArray();
                return;
            case 5:
                writeFieldName(jsonParser.currentName());
                return;
            case 6:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case 7:
                int i = AnonymousClass5.f462b[jsonParser.getNumberType().ordinal()];
                if (i == 1) {
                    writeNumber(jsonParser.getIntValue());
                    return;
                } else if (i == 2) {
                    writeNumber(jsonParser.getBigIntegerValue());
                    return;
                } else {
                    writeNumber(jsonParser.getLongValue());
                    return;
                }
            case 8:
                if (this.f460b) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                }
                int i2 = AnonymousClass5.f462b[jsonParser.getNumberType().ordinal()];
                if (i2 == 3) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                } else if (i2 == 4) {
                    writeNumber(jsonParser.getFloatValue());
                    return;
                } else {
                    writeNumber(jsonParser.getDoubleValue());
                    return;
                }
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: " + jsonParser.currentToken());
        }
    }

    /* JADX INFO: renamed from: aii$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f462b;

        static {
            int[] iArr = new int[JsonParser.NumberType.values().length];
            f462b = iArr;
            try {
                iArr[JsonParser.NumberType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f462b[JsonParser.NumberType.BIG_INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f462b[JsonParser.NumberType.BIG_DECIMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f462b[JsonParser.NumberType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f462b[JsonParser.NumberType.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            f463c = iArr2;
            try {
                iArr2[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f463c[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f463c[JsonToken.START_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f463c[JsonToken.END_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f463c[JsonToken.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f463c[JsonToken.VALUE_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f463c[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f463c[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f463c[JsonToken.VALUE_TRUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f463c[JsonToken.VALUE_FALSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f463c[JsonToken.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f463c[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copyCurrentStructure(JsonParser jsonParser) throws IOException {
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            if (this.k) {
                b(jsonParser);
            }
            writeFieldName(jsonParser.currentName());
            jsonTokenCurrentToken = jsonParser.nextToken();
        } else if (jsonTokenCurrentToken == null) {
            throw new IllegalStateException("No token available from argument `JsonParser`");
        }
        int i = AnonymousClass5.f463c[jsonTokenCurrentToken.ordinal()];
        if (i == 1) {
            if (this.k) {
                b(jsonParser);
            }
            writeStartObject();
            d(jsonParser);
            return;
        }
        if (i == 2) {
            writeEndObject();
            return;
        }
        if (i != 3) {
            if (i == 4) {
                writeEndArray();
                return;
            } else {
                b(jsonParser, jsonTokenCurrentToken);
                return;
            }
        }
        if (this.k) {
            b(jsonParser);
        }
        writeStartArray();
        d(jsonParser);
    }

    protected void d(JsonParser jsonParser) throws IOException {
        int i = 1;
        while (true) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == null) {
                return;
            }
            int i2 = AnonymousClass5.f463c[jsonTokenNextToken.ordinal()];
            if (i2 == 1) {
                if (this.k) {
                    b(jsonParser);
                }
                writeStartObject();
            } else if (i2 == 2) {
                writeEndObject();
                i--;
                if (i == 0) {
                    return;
                }
            } else if (i2 == 3) {
                if (this.k) {
                    b(jsonParser);
                }
                writeStartArray();
            } else if (i2 == 4) {
                writeEndArray();
                i--;
                if (i == 0) {
                    return;
                }
            } else if (i2 == 5) {
                if (this.k) {
                    b(jsonParser);
                }
                writeFieldName(jsonParser.currentName());
            } else {
                b(jsonParser, jsonTokenNextToken);
            }
            i++;
        }
    }

    private void b(JsonParser jsonParser, JsonToken jsonToken) throws IOException {
        if (this.k) {
            b(jsonParser);
        }
        switch (jsonToken) {
            case VALUE_STRING:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case VALUE_NUMBER_INT:
                int i = AnonymousClass5.f462b[jsonParser.getNumberType().ordinal()];
                if (i == 1) {
                    writeNumber(jsonParser.getIntValue());
                    return;
                } else if (i == 2) {
                    writeNumber(jsonParser.getBigIntegerValue());
                    return;
                } else {
                    writeNumber(jsonParser.getLongValue());
                    return;
                }
            case VALUE_NUMBER_FLOAT:
                if (this.f460b) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                } else {
                    d(JsonToken.VALUE_NUMBER_FLOAT, jsonParser.getNumberValueExact());
                    return;
                }
            case VALUE_TRUE:
                writeBoolean(true);
                return;
            case VALUE_FALSE:
                writeBoolean(false);
                return;
            case VALUE_NULL:
                writeNull();
                return;
            case VALUE_EMBEDDED_OBJECT:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: " + jsonToken);
        }
    }

    private final void b(JsonParser jsonParser) throws IOException {
        Object typeId = jsonParser.getTypeId();
        this.o = typeId;
        if (typeId != null) {
            this.i = true;
        }
        Object objectId = jsonParser.getObjectId();
        this.l = objectId;
        if (objectId != null) {
            this.i = true;
        }
    }

    protected final void c(JsonToken jsonToken) {
        e eVarA;
        this.q.i();
        if (this.i) {
            eVarA = this.f.e(this.f459a, jsonToken, this.l, this.o);
        } else {
            eVarA = this.f.a(this.f459a, jsonToken);
        }
        if (eVarA == null) {
            this.f459a++;
        } else {
            this.f = eVarA;
            this.f459a = 1;
        }
    }

    protected final void d(JsonToken jsonToken, Object obj) {
        e eVarA;
        this.q.i();
        if (this.i) {
            eVarA = this.f.e(this.f459a, jsonToken, obj, this.l, this.o);
        } else {
            eVarA = this.f.a(this.f459a, jsonToken, obj);
        }
        if (eVarA == null) {
            this.f459a++;
        } else {
            this.f = eVarA;
            this.f459a = 1;
        }
    }

    protected final void b(Object obj) {
        e eVarA;
        if (this.i) {
            eVarA = this.f.e(this.f459a, JsonToken.FIELD_NAME, obj, this.l, this.o);
        } else {
            eVarA = this.f.a(this.f459a, JsonToken.FIELD_NAME, obj);
        }
        if (eVarA == null) {
            this.f459a++;
        } else {
            this.f = eVarA;
            this.f459a = 1;
        }
    }

    protected final void b(JsonToken jsonToken) {
        e eVarA;
        if (this.i) {
            eVarA = this.f.e(this.f459a, jsonToken, this.l, this.o);
        } else {
            eVarA = this.f.a(this.f459a, jsonToken);
        }
        if (eVarA == null) {
            this.f459a++;
        } else {
            this.f = eVarA;
            this.f459a = 1;
        }
    }

    protected final void d(JsonToken jsonToken) {
        e eVarA = this.f.a(this.f459a, jsonToken);
        if (eVarA == null) {
            this.f459a++;
        } else {
            this.f = eVarA;
            this.f459a = 1;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    protected static final class a extends ParserMinimalBase {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final boolean f464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected boolean f465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected ObjectCodec f466c;
        protected transient xx d;
        protected final boolean e;
        protected final boolean f;
        protected e g;
        protected aij h;
        protected int i;
        protected wq j;

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public int getTextOffset() {
            return 0;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public boolean hasTextCharacters() {
            return false;
        }

        public a(e eVar, ObjectCodec objectCodec, boolean z, boolean z2, JsonStreamContext jsonStreamContext) {
            super(0);
            this.j = null;
            this.g = eVar;
            this.i = -1;
            this.f466c = objectCodec;
            this.h = aij.d(jsonStreamContext);
            this.f = z;
            this.e = z2;
            this.f464a = z || z2;
        }

        public void a(wq wqVar) {
            this.j = wqVar;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public ObjectCodec getCodec() {
            return this.f466c;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public void setCodec(ObjectCodec objectCodec) {
            this.f466c = objectCodec;
        }

        @Override // com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.core.Versioned
        public wu version() {
            return za.e;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public yb<StreamReadCapability> getReadCapabilities() {
            return DEFAULT_READ_CAPABILITIES;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f465b) {
                return;
            }
            this.f465b = true;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public JsonToken nextToken() throws IOException {
            e eVar;
            if (this.f465b || (eVar = this.g) == null) {
                return null;
            }
            int i = this.i + 1;
            this.i = i;
            if (i >= 16) {
                this.i = 0;
                e eVarD = eVar.d();
                this.g = eVarD;
                if (eVarD == null) {
                    return null;
                }
            }
            this._currToken = this.g.a(this.i);
            if (this._currToken == JsonToken.FIELD_NAME) {
                Object objA = a();
                this.h.e(objA instanceof String ? (String) objA : objA.toString());
            } else if (this._currToken == JsonToken.START_OBJECT) {
                this.h = this.h.b();
            } else if (this._currToken == JsonToken.START_ARRAY) {
                this.h = this.h.a();
            } else if (this._currToken == JsonToken.END_OBJECT || this._currToken == JsonToken.END_ARRAY) {
                this.h = this.h.e();
            } else {
                this.h.d();
            }
            return this._currToken;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public String nextFieldName() throws IOException {
            e eVar;
            if (this.f465b || (eVar = this.g) == null) {
                return null;
            }
            int i = this.i + 1;
            if (i < 16 && eVar.a(i) == JsonToken.FIELD_NAME) {
                this.i = i;
                this._currToken = JsonToken.FIELD_NAME;
                Object objB = this.g.b(i);
                String string = objB instanceof String ? (String) objB : objB.toString();
                this.h.e(string);
                return string;
            }
            if (nextToken() == JsonToken.FIELD_NAME) {
                return currentName();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public boolean isClosed() {
            return this.f465b;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public JsonStreamContext getParsingContext() {
            return this.h;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public wq getTokenLocation() {
            return getCurrentLocation();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public wq getCurrentLocation() {
            wq wqVar = this.j;
            return wqVar == null ? wq.f52339c : wqVar;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public String currentName() {
            if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
                return this.h.getParent().getCurrentName();
            }
            return this.h.getCurrentName();
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public String getCurrentName() {
            return currentName();
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public void overrideCurrentName(String str) {
            JsonStreamContext parent = this.h;
            if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
                parent = parent.getParent();
            }
            if (parent instanceof aij) {
                try {
                    ((aij) parent).e(str);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public String getText() {
            if (this._currToken == JsonToken.VALUE_STRING || this._currToken == JsonToken.FIELD_NAME) {
                Object objA = a();
                if (objA instanceof String) {
                    return (String) objA;
                }
                return ahw.e(objA);
            }
            if (this._currToken == null) {
                return null;
            }
            int i = AnonymousClass5.f463c[this._currToken.ordinal()];
            if (i == 7 || i == 8) {
                return ahw.e(a());
            }
            return this._currToken.asString();
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public char[] getTextCharacters() {
            String text = getText();
            if (text == null) {
                return null;
            }
            return text.toCharArray();
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public int getTextLength() {
            String text = getText();
            if (text == null) {
                return 0;
            }
            return text.length();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean isNaN() {
            if (this._currToken == JsonToken.VALUE_NUMBER_FLOAT) {
                Object objA = a();
                if (objA instanceof Double) {
                    Double d = (Double) objA;
                    return d.isNaN() || d.isInfinite();
                }
                if (objA instanceof Float) {
                    Float f = (Float) objA;
                    return f.isNaN() || f.isInfinite();
                }
            }
            return false;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigInteger getBigIntegerValue() throws IOException {
            Number numberValue = getNumberValue();
            if (numberValue instanceof BigInteger) {
                return (BigInteger) numberValue;
            }
            if (getNumberType() == JsonParser.NumberType.BIG_DECIMAL) {
                return ((BigDecimal) numberValue).toBigInteger();
            }
            return BigInteger.valueOf(numberValue.longValue());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigDecimal getDecimalValue() throws IOException {
            Number numberValue = getNumberValue();
            if (numberValue instanceof BigDecimal) {
                return (BigDecimal) numberValue;
            }
            int i = AnonymousClass5.f462b[getNumberType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new BigDecimal((BigInteger) numberValue);
                }
                if (i != 5) {
                    return BigDecimal.valueOf(numberValue.doubleValue());
                }
            }
            return BigDecimal.valueOf(numberValue.longValue());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public double getDoubleValue() throws IOException {
            return getNumberValue().doubleValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public float getFloatValue() throws IOException {
            return getNumberValue().floatValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int getIntValue() throws IOException {
            Number numberValue = this._currToken == JsonToken.VALUE_NUMBER_INT ? (Number) a() : getNumberValue();
            if ((numberValue instanceof Integer) || d(numberValue)) {
                return numberValue.intValue();
            }
            return c(numberValue);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public long getLongValue() throws IOException {
            Number numberValue = this._currToken == JsonToken.VALUE_NUMBER_INT ? (Number) a() : getNumberValue();
            if ((numberValue instanceof Long) || a(numberValue)) {
                return numberValue.longValue();
            }
            return b(numberValue);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonParser.NumberType getNumberType() throws IOException {
            Number numberValue = getNumberValue();
            if (numberValue instanceof Integer) {
                return JsonParser.NumberType.INT;
            }
            if (numberValue instanceof Long) {
                return JsonParser.NumberType.LONG;
            }
            if (numberValue instanceof Double) {
                return JsonParser.NumberType.DOUBLE;
            }
            if (numberValue instanceof BigDecimal) {
                return JsonParser.NumberType.BIG_DECIMAL;
            }
            if (numberValue instanceof BigInteger) {
                return JsonParser.NumberType.BIG_INTEGER;
            }
            if (numberValue instanceof Float) {
                return JsonParser.NumberType.FLOAT;
            }
            if (numberValue instanceof Short) {
                return JsonParser.NumberType.INT;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final Number getNumberValue() throws IOException {
            d();
            Object objA = a();
            if (objA instanceof Number) {
                return (Number) objA;
            }
            if (objA instanceof String) {
                String str = (String) objA;
                if (str.indexOf(46) >= 0) {
                    return Double.valueOf(Double.parseDouble(str));
                }
                return Long.valueOf(Long.parseLong(str));
            }
            if (objA == null) {
                return null;
            }
            throw new IllegalStateException("Internal error: entry should be a Number, but is of type " + objA.getClass().getName());
        }

        private final boolean d(Number number) {
            return (number instanceof Short) || (number instanceof Byte);
        }

        private final boolean a(Number number) {
            return (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }

        protected int c(Number number) throws IOException {
            if (number instanceof Long) {
                long jLongValue = number.longValue();
                int i = (int) jLongValue;
                if (i != jLongValue) {
                    reportOverflowInt();
                }
                return i;
            }
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (BI_MIN_INT.compareTo(bigInteger) > 0 || BI_MAX_INT.compareTo(bigInteger) < 0) {
                    reportOverflowInt();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double dDoubleValue = number.doubleValue();
                    if (dDoubleValue < -2.147483648E9d || dDoubleValue > 2.147483647E9d) {
                        reportOverflowInt();
                    }
                    return (int) dDoubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (BD_MIN_INT.compareTo(bigDecimal) > 0 || BD_MAX_INT.compareTo(bigDecimal) < 0) {
                        reportOverflowInt();
                    }
                } else {
                    _throwInternal();
                }
            }
            return number.intValue();
        }

        protected long b(Number number) throws IOException {
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (BI_MIN_LONG.compareTo(bigInteger) > 0 || BI_MAX_LONG.compareTo(bigInteger) < 0) {
                    reportOverflowLong();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double dDoubleValue = number.doubleValue();
                    if (dDoubleValue < -9.223372036854776E18d || dDoubleValue > 9.223372036854776E18d) {
                        reportOverflowLong();
                    }
                    return (long) dDoubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (BD_MIN_LONG.compareTo(bigDecimal) > 0 || BD_MAX_LONG.compareTo(bigDecimal) < 0) {
                        reportOverflowLong();
                    }
                } else {
                    _throwInternal();
                }
            }
            return number.longValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getEmbeddedObject() {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                return a();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object objA = a();
                if (objA instanceof byte[]) {
                    return (byte[]) objA;
                }
            }
            if (this._currToken != JsonToken.VALUE_STRING) {
                throw _constructError("Current token (" + this._currToken + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            }
            String text = getText();
            if (text == null) {
                return null;
            }
            xx xxVar = this.d;
            if (xxVar == null) {
                xxVar = new xx(100);
                this.d = xxVar;
            } else {
                xxVar.c();
            }
            _decodeBase64(text, xxVar, base64Variant);
            return xxVar.i();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
            byte[] binaryValue = getBinaryValue(base64Variant);
            if (binaryValue == null) {
                return 0;
            }
            outputStream.write(binaryValue, 0, binaryValue.length);
            return binaryValue.length;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean canReadObjectId() {
            return this.e;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean canReadTypeId() {
            return this.f;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getTypeId() {
            return this.g.c(this.i);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getObjectId() {
            return this.g.d(this.i);
        }

        protected final Object a() {
            return this.g.b(this.i);
        }

        protected final void d() throws wn {
            if (this._currToken == null || !this._currToken.isNumeric()) {
                throw _constructError("Current token (" + this._currToken + ") not numeric, cannot use numeric value accessors");
            }
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
        public void _handleEOF() throws wn {
            _throwInternal();
        }
    }

    protected static final class e {
        private static final JsonToken[] d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected e f467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected long f468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Object[] f469c = new Object[16];
        protected TreeMap<Integer, Object> e;

        private final int e(int i) {
            return i + i + 1;
        }

        private final int h(int i) {
            return i + i;
        }

        static {
            JsonToken[] jsonTokenArr = new JsonToken[16];
            d = jsonTokenArr;
            JsonToken[] jsonTokenArrValues = JsonToken.values();
            System.arraycopy(jsonTokenArrValues, 1, jsonTokenArr, 1, Math.min(15, jsonTokenArrValues.length - 1));
        }

        public JsonToken a(int i) {
            long j = this.f468b;
            if (i > 0) {
                j >>= i << 2;
            }
            return d[((int) j) & 15];
        }

        public Object b(int i) {
            return this.f469c[i];
        }

        public e d() {
            return this.f467a;
        }

        public boolean a() {
            return this.e != null;
        }

        public e a(int i, JsonToken jsonToken) {
            if (i < 16) {
                d(i, jsonToken);
                return null;
            }
            e eVar = new e();
            this.f467a = eVar;
            eVar.d(0, jsonToken);
            return this.f467a;
        }

        public e e(int i, JsonToken jsonToken, Object obj, Object obj2) {
            if (i < 16) {
                b(i, jsonToken, obj, obj2);
                return null;
            }
            e eVar = new e();
            this.f467a = eVar;
            eVar.b(0, jsonToken, obj, obj2);
            return this.f467a;
        }

        public e a(int i, JsonToken jsonToken, Object obj) {
            if (i < 16) {
                b(i, jsonToken, obj);
                return null;
            }
            e eVar = new e();
            this.f467a = eVar;
            eVar.b(0, jsonToken, obj);
            return this.f467a;
        }

        public e e(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            if (i < 16) {
                c(i, jsonToken, obj, obj2, obj3);
                return null;
            }
            e eVar = new e();
            this.f467a = eVar;
            eVar.c(0, jsonToken, obj, obj2, obj3);
            return this.f467a;
        }

        private void d(int i, JsonToken jsonToken) {
            long jOrdinal = jsonToken.ordinal();
            if (i > 0) {
                jOrdinal <<= i << 2;
            }
            this.f468b |= jOrdinal;
        }

        private void b(int i, JsonToken jsonToken, Object obj, Object obj2) {
            long jOrdinal = jsonToken.ordinal();
            if (i > 0) {
                jOrdinal <<= i << 2;
            }
            this.f468b = jOrdinal | this.f468b;
            e(i, obj, obj2);
        }

        private void b(int i, JsonToken jsonToken, Object obj) {
            this.f469c[i] = obj;
            long jOrdinal = jsonToken.ordinal();
            if (i > 0) {
                jOrdinal <<= i << 2;
            }
            this.f468b |= jOrdinal;
        }

        private void c(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            this.f469c[i] = obj;
            long jOrdinal = jsonToken.ordinal();
            if (i > 0) {
                jOrdinal <<= i << 2;
            }
            this.f468b = jOrdinal | this.f468b;
            e(i, obj2, obj3);
        }

        private final void e(int i, Object obj, Object obj2) {
            if (this.e == null) {
                this.e = new TreeMap<>();
            }
            if (obj != null) {
                this.e.put(Integer.valueOf(e(i)), obj);
            }
            if (obj2 != null) {
                this.e.put(Integer.valueOf(h(i)), obj2);
            }
        }

        Object d(int i) {
            TreeMap<Integer, Object> treeMap = this.e;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(e(i)));
        }

        Object c(int i) {
            TreeMap<Integer, Object> treeMap = this.e;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(h(i)));
        }
    }
}
