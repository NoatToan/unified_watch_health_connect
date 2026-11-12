package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class agi extends AsArraySerializerBase<EnumSet<? extends Enum<?>>> {
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public agi _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return this;
    }

    public agi(JavaType javaType) {
        super((Class<?>) EnumSet.class, javaType, true, (TypeSerializer) null, (JsonSerializer<Object>) null);
    }

    public agi(agi agiVar, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super(agiVar, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public agi withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        return new agi(this, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean isEmpty(SerializerProvider serializerProvider, EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean hasSingleElement(EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(EnumSet<? extends Enum<?>> enumSet, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int size = enumSet.size();
        if (size == 1 && ((this._unwrapSingle == null && serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(enumSet, jsonGenerator, serializerProvider);
            return;
        }
        jsonGenerator.writeStartArray(enumSet, size);
        serializeContents(enumSet, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndArray();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serializeContents(EnumSet<? extends Enum<?>> enumSet, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        JsonSerializer<Object> jsonSerializerFindContentValueSerializer = this._elementSerializer;
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            Enum r1 = (Enum) it.next();
            if (jsonSerializerFindContentValueSerializer == null) {
                jsonSerializerFindContentValueSerializer = serializerProvider.findContentValueSerializer(r1.getDeclaringClass(), this._property);
            }
            jsonSerializerFindContentValueSerializer.serialize(r1, jsonGenerator, serializerProvider);
        }
    }
}
