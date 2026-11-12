package defpackage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes21.dex */
public class ahc extends StdScalarSerializer<UUID> implements ContextualSerializer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final char[] f402c = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Boolean f403a;

    public ahc() {
        this(null);
    }

    protected ahc(Boolean bool) {
        super(UUID.class);
        this.f403a = bool;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean isEmpty(SerializerProvider serializerProvider, UUID uuid) {
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        Boolean bool;
        JsonFormat.c cVarFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (cVarFindFormatOverrides == null) {
            bool = null;
        } else {
            JsonFormat.Shape shapeB = cVarFindFormatOverrides.b();
            if (shapeB == JsonFormat.Shape.BINARY) {
                bool = true;
            } else if (shapeB == JsonFormat.Shape.STRING) {
                bool = false;
            } else {
                bool = null;
            }
        }
        return !Objects.equals(bool, this.f403a) ? new ahc(bool) : this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(UUID uuid, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (a(jsonGenerator)) {
            jsonGenerator.writeBinary(a(uuid));
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits = uuid.getMostSignificantBits();
        a((int) (mostSignificantBits >> 32), cArr, 0);
        cArr[8] = '-';
        int i = (int) mostSignificantBits;
        e(i >>> 16, cArr, 9);
        cArr[13] = '-';
        e(i, cArr, 14);
        cArr[18] = '-';
        long leastSignificantBits = uuid.getLeastSignificantBits();
        e((int) (leastSignificantBits >>> 48), cArr, 19);
        cArr[23] = '-';
        e((int) (leastSignificantBits >>> 32), cArr, 24);
        a((int) leastSignificantBits, cArr, 28);
        jsonGenerator.writeString(cArr, 0, 36);
    }

    protected boolean a(JsonGenerator jsonGenerator) {
        Boolean bool = this.f403a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return !(jsonGenerator instanceof aii) && jsonGenerator.canWriteBinaryNatively();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
        visitStringFormat(jsonFormatVisitorWrapper, javaType, JsonValueFormat.UUID);
    }

    private static void a(int i, char[] cArr, int i2) {
        e(i >> 16, cArr, i2);
        e(i, cArr, i2 + 4);
    }

    private static void e(int i, char[] cArr, int i2) {
        char[] cArr2 = f402c;
        cArr[i2] = cArr2[(i >> 12) & 15];
        cArr[i2 + 1] = cArr2[(i >> 8) & 15];
        cArr[i2 + 2] = cArr2[(i >> 4) & 15];
        cArr[i2 + 3] = cArr2[i & 15];
    }

    private static final byte[] a(UUID uuid) {
        byte[] bArr = new byte[16];
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        d((int) (mostSignificantBits >> 32), bArr, 0);
        d((int) mostSignificantBits, bArr, 4);
        d((int) (leastSignificantBits >> 32), bArr, 8);
        d((int) leastSignificantBits, bArr, 12);
        return bArr;
    }

    private static final void d(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }
}
