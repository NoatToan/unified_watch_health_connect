package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.huawei.hianalytics.core.storage.Event;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class aft extends aez implements Serializable {
    private static final long serialVersionUID = 1;
    protected final NameTransformer e;

    @Override // defpackage.aez
    public boolean isUnwrapping() {
        return true;
    }

    public aft(aez aezVar, NameTransformer nameTransformer) {
        super(aezVar);
        this.e = nameTransformer;
    }

    protected aft(aft aftVar, NameTransformer nameTransformer, xb xbVar) {
        super(aftVar, xbVar);
        this.e = nameTransformer;
    }

    @Override // defpackage.aez
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public aft rename(NameTransformer nameTransformer) {
        return e(NameTransformer.chainedTransformer(nameTransformer, this.e), new xb(nameTransformer.transform(this._name.getValue())));
    }

    protected aft e(NameTransformer nameTransformer, xb xbVar) {
        return new aft(this, nameTransformer, xbVar);
    }

    @Override // defpackage.aez, com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        Object obj2 = get(obj);
        if (obj2 == null) {
            return;
        }
        JsonSerializer<?> jsonSerializer_findAndAddDynamic = this._serializer;
        if (jsonSerializer_findAndAddDynamic == null) {
            Class<?> cls = obj2.getClass();
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            JsonSerializer<?> jsonSerializerSerializerFor = propertySerializerMap.serializerFor(cls);
            jsonSerializer_findAndAddDynamic = jsonSerializerSerializerFor == null ? _findAndAddDynamic(propertySerializerMap, cls, serializerProvider) : jsonSerializerSerializerFor;
        }
        if (this._suppressableValue != null) {
            if (MARKER_FOR_EMPTY == this._suppressableValue) {
                if (jsonSerializer_findAndAddDynamic.isEmpty(serializerProvider, obj2)) {
                    return;
                }
            } else if (this._suppressableValue.equals(obj2)) {
                return;
            }
        }
        if (obj2 == obj && _handleSelfReference(obj, jsonGenerator, serializerProvider, jsonSerializer_findAndAddDynamic)) {
            return;
        }
        if (!jsonSerializer_findAndAddDynamic.isUnwrappingSerializer()) {
            jsonGenerator.writeFieldName(this._name);
        }
        if (this._typeSerializer == null) {
            jsonSerializer_findAndAddDynamic.serialize(obj2, jsonGenerator, serializerProvider);
        } else {
            jsonSerializer_findAndAddDynamic.serializeWithType(obj2, jsonGenerator, serializerProvider, this._typeSerializer);
        }
    }

    @Override // defpackage.aez
    public void assignSerializer(JsonSerializer<Object> jsonSerializer) {
        if (jsonSerializer != null) {
            NameTransformer nameTransformerChainedTransformer = this.e;
            if (jsonSerializer.isUnwrappingSerializer() && (jsonSerializer instanceof afv)) {
                nameTransformerChainedTransformer = NameTransformer.chainedTransformer(nameTransformerChainedTransformer, ((afv) jsonSerializer).d);
            }
            jsonSerializer = jsonSerializer.unwrappingSerializer(nameTransformerChainedTransformer);
        }
        super.assignSerializer(jsonSerializer);
    }

    @Override // defpackage.aez, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(final JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws ym {
        JsonSerializer<Object> jsonSerializerUnwrappingSerializer = serializerProvider.findValueSerializer(getType(), this).unwrappingSerializer(this.e);
        if (jsonSerializerUnwrappingSerializer.isUnwrappingSerializer()) {
            jsonSerializerUnwrappingSerializer.acceptJsonFormatVisitor(new JsonFormatVisitorWrapper.d(serializerProvider) { // from class: aft.3
                @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.d, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper
                public JsonObjectFormatVisitor expectObjectFormat(JavaType javaType) throws ym {
                    return jsonObjectFormatVisitor;
                }
            }, getType());
        } else {
            super.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
        }
    }

    @Override // defpackage.aez
    protected void _depositSchemaProperty(aeu aeuVar, JsonNode jsonNode) {
        JsonNode jsonNode2 = jsonNode.get(Event.EventConstants.PROPERTIES);
        if (jsonNode2 != null) {
            Iterator<Map.Entry<String, JsonNode>> itFields = jsonNode2.fields();
            while (itFields.hasNext()) {
                Map.Entry<String, JsonNode> next = itFields.next();
                String key = next.getKey();
                NameTransformer nameTransformer = this.e;
                if (nameTransformer != null) {
                    key = nameTransformer.transform(key);
                }
                aeuVar.b(key, next.getValue());
            }
        }
    }

    @Override // defpackage.aez
    protected JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) throws ym {
        JsonSerializer<Object> jsonSerializerFindValueSerializer;
        if (this._nonTrivialBaseType != null) {
            jsonSerializerFindValueSerializer = serializerProvider.findValueSerializer(serializerProvider.constructSpecializedType(this._nonTrivialBaseType, cls), this);
        } else {
            jsonSerializerFindValueSerializer = serializerProvider.findValueSerializer(cls, this);
        }
        NameTransformer nameTransformerChainedTransformer = this.e;
        if (jsonSerializerFindValueSerializer.isUnwrappingSerializer() && (jsonSerializerFindValueSerializer instanceof afv)) {
            nameTransformerChainedTransformer = NameTransformer.chainedTransformer(nameTransformerChainedTransformer, ((afv) jsonSerializerFindValueSerializer).d);
        }
        JsonSerializer<Object> jsonSerializerUnwrappingSerializer = jsonSerializerFindValueSerializer.unwrappingSerializer(nameTransformerChainedTransformer);
        this._dynamicSerializers = this._dynamicSerializers.newWith(cls, jsonSerializerUnwrappingSerializer);
        return jsonSerializerUnwrappingSerializer;
    }
}
