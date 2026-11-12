package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class agn extends StdScalarSerializer<Number> implements ContextualSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final agn f385a = new agn(Number.class);
    protected final boolean d;

    public agn(Class<? extends Number> cls) {
        super(cls, false);
        this.d = cls == BigInteger.class;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        JsonFormat.c cVarFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (cVarFindFormatOverrides == null || AnonymousClass5.f386c[cVarFindFormatOverrides.b().ordinal()] != 1) {
            return this;
        }
        if (handledType() == BigDecimal.class) {
            return c();
        }
        return aha.f401b;
    }

    /* JADX INFO: renamed from: agn$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f386c;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            f386c = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(Number number, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (number instanceof BigDecimal) {
            jsonGenerator.writeNumber((BigDecimal) number);
            return;
        }
        if (number instanceof BigInteger) {
            jsonGenerator.writeNumber((BigInteger) number);
            return;
        }
        if (number instanceof Long) {
            jsonGenerator.writeNumber(number.longValue());
            return;
        }
        if (number instanceof Double) {
            jsonGenerator.writeNumber(number.doubleValue());
            return;
        }
        if (number instanceof Float) {
            jsonGenerator.writeNumber(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            jsonGenerator.writeNumber(number.intValue());
        } else {
            jsonGenerator.writeNumber(number.toString());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode(this.d ? TypedValues.Custom.S_INT : "number", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
        if (this.d) {
            visitIntFormat(jsonFormatVisitorWrapper, javaType, JsonParser.NumberType.BIG_INTEGER);
        } else if (handledType() == BigDecimal.class) {
            visitFloatFormat(jsonFormatVisitorWrapper, javaType, JsonParser.NumberType.BIG_DECIMAL);
        } else {
            jsonFormatVisitorWrapper.expectNumberFormat(javaType);
        }
    }

    public static JsonSerializer<?> c() {
        return e.d;
    }

    static final class e extends ToStringSerializerBase {
        static final e d = new e();

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
        public boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
            return false;
        }

        public e() {
            super(BigDecimal.class);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            String string;
            if (jsonGenerator.isEnabled(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                if (!c(jsonGenerator, bigDecimal)) {
                    serializerProvider.reportMappingProblem(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(bigDecimal.scale()), 9999, 9999), new Object[0]);
                }
                string = bigDecimal.toPlainString();
            } else {
                string = obj.toString();
            }
            jsonGenerator.writeString(string);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase
        public String valueToString(Object obj) {
            throw new IllegalStateException();
        }

        protected boolean c(JsonGenerator jsonGenerator, BigDecimal bigDecimal) throws IOException {
            int iScale = bigDecimal.scale();
            return iScale >= -9999 && iScale <= 9999;
        }
    }
}
