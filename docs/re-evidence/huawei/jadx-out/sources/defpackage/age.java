package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class age extends StdScalarSerializer<Enum<?>> implements ContextualSerializer {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final ahx f379b;
    protected final Boolean e;

    public age(ahx ahxVar, Boolean bool) {
        super(ahxVar.b(), false);
        this.f379b = ahxVar;
        this.e = bool;
    }

    public static age b(Class<?> cls, yt ytVar, BeanDescription beanDescription, JsonFormat.c cVar) {
        return new age(ahx.b(ytVar, cls), a(cls, cVar, true, null));
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        JsonFormat.c cVarFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (cVarFindFormatOverrides != null) {
            Boolean boolA = a(handledType(), cVarFindFormatOverrides, false, this.e);
            if (!Objects.equals(boolA, this.e)) {
                return new age(this.f379b, boolA);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(Enum<?> r2, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (d(serializerProvider)) {
            jsonGenerator.writeNumber(r2.ordinal());
        } else if (serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
            jsonGenerator.writeString(r2.toString());
        } else {
            jsonGenerator.writeString(this.f379b.b(r2));
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        if (d(serializerProvider)) {
            return createSchemaNode(TypedValues.Custom.S_INT, true);
        }
        aeu aeuVarCreateSchemaNode = createSchemaNode("string", true);
        if (type != null && serializerProvider.constructType(type).isEnumType()) {
            aeg aegVarA = aeuVarCreateSchemaNode.a("enum");
            Iterator<SerializableString> it = this.f379b.a().iterator();
            while (it.hasNext()) {
                aegVarA.c(it.next().getValue());
            }
        }
        return aeuVarCreateSchemaNode;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
        SerializerProvider provider = jsonFormatVisitorWrapper.getProvider();
        if (d(provider)) {
            visitIntFormat(jsonFormatVisitorWrapper, javaType, JsonParser.NumberType.INT);
            return;
        }
        JsonStringFormatVisitor jsonStringFormatVisitorExpectStringFormat = jsonFormatVisitorWrapper.expectStringFormat(javaType);
        if (jsonStringFormatVisitorExpectStringFormat != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (provider != null && provider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                Iterator<Enum<?>> it = this.f379b.d().iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(it.next().toString());
                }
            } else {
                Iterator<SerializableString> it2 = this.f379b.a().iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(it2.next().getValue());
                }
            }
            jsonStringFormatVisitorExpectStringFormat.enumTypes(linkedHashSet);
        }
    }

    protected final boolean d(SerializerProvider serializerProvider) {
        Boolean bool = this.e;
        if (bool != null) {
            return bool.booleanValue();
        }
        return serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);
    }

    protected static Boolean a(Class<?> cls, JsonFormat.c cVar, boolean z, Boolean bool) {
        JsonFormat.Shape shapeB = cVar == null ? null : cVar.b();
        if (shapeB == null || shapeB == JsonFormat.Shape.ANY || shapeB == JsonFormat.Shape.SCALAR) {
            return bool;
        }
        if (shapeB == JsonFormat.Shape.STRING || shapeB == JsonFormat.Shape.NATURAL) {
            return Boolean.FALSE;
        }
        if (shapeB.isNumeric() || shapeB == JsonFormat.Shape.ARRAY) {
            return Boolean.TRUE;
        }
        throw new IllegalArgumentException(String.format("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", shapeB, cls.getName(), z ? "class" : "property"));
    }
}
