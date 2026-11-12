package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.aj4;
import defpackage.bj4;
import defpackage.esd;
import defpackage.q4q;
import defpackage.qqd;
import defpackage.vzd;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class MapEntryDeserializer extends ContainerDeserializerBase<Map.Entry<Object, Object>> implements aj4 {
    private static final long serialVersionUID = 1;
    protected final vzd _keyDeserializer;
    protected final esd<Object> _valueDeserializer;
    protected final q4q _valueTypeDeserializer;

    public MapEntryDeserializer(JavaType javaType, vzd vzdVar, esd<Object> esdVar, q4q q4qVar) {
        super(javaType);
        if (javaType.containedTypeCount() == 2) {
            this._keyDeserializer = vzdVar;
            this._valueDeserializer = esdVar;
            this._valueTypeDeserializer = q4qVar;
        } else {
            throw new IllegalArgumentException("Missing generic type information for " + javaType);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [vzd] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer] */
    @Override // defpackage.aj4
    public esd<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        ?? CreateContextual;
        Object obj = this._keyDeserializer;
        if (obj == null) {
            CreateContextual = deserializationContext.findKeyDeserializer(this._containerType.containedType(0), beanProperty);
        } else if (obj instanceof bj4) {
            CreateContextual = obj;
            CreateContextual = ((bj4) obj).createContextual(deserializationContext, beanProperty);
        }
        CreateContextual = obj;
        esd<?> esdVarFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._valueDeserializer);
        JavaType javaTypeContainedType = this._containerType.containedType(1);
        esd<?> esdVarFindContextualValueDeserializer = esdVarFindConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(javaTypeContainedType, beanProperty) : deserializationContext.handleSecondaryContextualization(esdVarFindConvertingContentDeserializer, beanProperty, javaTypeContainedType);
        q4q q4qVarForProperty = this._valueTypeDeserializer;
        if (q4qVarForProperty != null) {
            q4qVarForProperty = q4qVarForProperty.forProperty(beanProperty);
        }
        return withResolved(CreateContextual, q4qVarForProperty, esdVarFindContextualValueDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return q4qVar.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public esd<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JavaType getContentType() {
        return this._containerType.containedType(1);
    }

    public MapEntryDeserializer withResolved(vzd vzdVar, q4q q4qVar, esd<?> esdVar) {
        return (this._keyDeserializer == vzdVar && this._valueDeserializer == esdVar && this._valueTypeDeserializer == q4qVar) ? this : new MapEntryDeserializer(this, vzdVar, esdVar, q4qVar);
    }

    @Override // defpackage.esd
    public Map.Entry<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objDeserializeWithType;
        JsonToken jsonTokenK = jsonParser.K();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (jsonTokenK != jsonToken && jsonTokenK != JsonToken.FIELD_NAME && jsonTokenK != JsonToken.END_OBJECT) {
            return _deserializeFromEmpty(jsonParser, deserializationContext);
        }
        if (jsonTokenK == jsonToken) {
            jsonTokenK = jsonParser.G0();
        }
        if (jsonTokenK != JsonToken.FIELD_NAME) {
            if (jsonTokenK == JsonToken.END_OBJECT) {
                return (Map.Entry) deserializationContext.reportInputMismatch(this, "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0]);
            }
            return (Map.Entry) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
        vzd vzdVar = this._keyDeserializer;
        esd<Object> esdVar = this._valueDeserializer;
        q4q q4qVar = this._valueTypeDeserializer;
        String strJ = jsonParser.J();
        Object objDeserializeKey = vzdVar.deserializeKey(strJ, deserializationContext);
        try {
            if (jsonParser.G0() == JsonToken.VALUE_NULL) {
                objDeserializeWithType = esdVar.getNullValue(deserializationContext);
            } else if (q4qVar == null) {
                objDeserializeWithType = esdVar.deserialize(jsonParser, deserializationContext);
            } else {
                objDeserializeWithType = esdVar.deserializeWithType(jsonParser, deserializationContext, q4qVar);
            }
        } catch (Exception e) {
            wrapAndThrow(e, Map.Entry.class, strJ);
            objDeserializeWithType = null;
        }
        JsonToken jsonTokenG0 = jsonParser.G0();
        if (jsonTokenG0 != JsonToken.END_OBJECT) {
            if (jsonTokenG0 == JsonToken.FIELD_NAME) {
                deserializationContext.reportInputMismatch(this, "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')", jsonParser.J());
            } else {
                deserializationContext.reportInputMismatch(this, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: " + jsonTokenG0, new Object[0]);
            }
            return null;
        }
        return new AbstractMap.SimpleEntry(objDeserializeKey, objDeserializeWithType);
    }

    public MapEntryDeserializer(MapEntryDeserializer mapEntryDeserializer) {
        super(mapEntryDeserializer);
        this._keyDeserializer = mapEntryDeserializer._keyDeserializer;
        this._valueDeserializer = mapEntryDeserializer._valueDeserializer;
        this._valueTypeDeserializer = mapEntryDeserializer._valueTypeDeserializer;
    }

    public MapEntryDeserializer(MapEntryDeserializer mapEntryDeserializer, vzd vzdVar, esd<Object> esdVar, q4q q4qVar) {
        super(mapEntryDeserializer);
        this._keyDeserializer = vzdVar;
        this._valueDeserializer = esdVar;
        this._valueTypeDeserializer = q4qVar;
    }

    @Override // defpackage.esd
    public Map.Entry<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map.Entry<Object, Object> entry) throws IOException {
        throw new IllegalStateException("Cannot update Map.Entry values");
    }
}
