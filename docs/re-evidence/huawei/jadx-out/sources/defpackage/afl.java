package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class afl extends AsArraySerializerBase<Iterator<?>> {
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean hasSingleElement(Iterator<?> it) {
        return false;
    }

    public afl(JavaType javaType, boolean z, TypeSerializer typeSerializer) {
        super((Class<?>) Iterator.class, javaType, z, typeSerializer, (JsonSerializer<Object>) null);
    }

    public afl(afl aflVar, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super(aflVar, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean isEmpty(SerializerProvider serializerProvider, Iterator<?> it) {
        return !it.hasNext();
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new afl(this, this._property, typeSerializer, this._elementSerializer, this._unwrapSingle);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public afl withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        return new afl(this, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void serialize(Iterator<?> it, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartArray(it);
        serializeContents(it, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndArray();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serializeContents(Iterator<?> it, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (it.hasNext()) {
            JsonSerializer<Object> jsonSerializer = this._elementSerializer;
            if (jsonSerializer == null) {
                c(it, jsonGenerator, serializerProvider);
                return;
            }
            TypeSerializer typeSerializer = this._valueTypeSerializer;
            do {
                Object next = it.next();
                if (next == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else if (typeSerializer == null) {
                    jsonSerializer.serialize(next, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer.serializeWithType(next, jsonGenerator, serializerProvider, typeSerializer);
                }
            } while (it.hasNext());
        }
    }

    protected void c(Iterator<?> it, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        JsonSerializer<Object> jsonSerializer_findAndAddDynamic;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
        do {
            Object next = it.next();
            if (next == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
            } else {
                Class<?> cls = next.getClass();
                JsonSerializer<Object> jsonSerializerSerializerFor = propertySerializerMap.serializerFor(cls);
                if (jsonSerializerSerializerFor == null) {
                    if (this._elementType.hasGenericTypes()) {
                        jsonSerializer_findAndAddDynamic = _findAndAddDynamic(propertySerializerMap, serializerProvider.constructSpecializedType(this._elementType, cls), serializerProvider);
                    } else {
                        jsonSerializer_findAndAddDynamic = _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                    }
                    jsonSerializerSerializerFor = jsonSerializer_findAndAddDynamic;
                    propertySerializerMap = this._dynamicSerializers;
                }
                if (typeSerializer == null) {
                    jsonSerializerSerializerFor.serialize(next, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializerSerializerFor.serializeWithType(next, jsonGenerator, serializerProvider, typeSerializer);
                }
            }
        } while (it.hasNext());
    }
}
