package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class abd extends ContainerDeserializerBase<Map.Entry<Object, Object>> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final TypeDeserializer f203a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final JsonDeserializer<Object> f204c;
    protected final KeyDeserializer e;

    public abd(JavaType javaType, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType);
        if (javaType.containedTypeCount() != 2) {
            throw new IllegalArgumentException("Missing generic type information for " + javaType);
        }
        this.e = keyDeserializer;
        this.f204c = jsonDeserializer;
        this.f203a = typeDeserializer;
    }

    protected abd(abd abdVar, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(abdVar);
        this.e = keyDeserializer;
        this.f204c = jsonDeserializer;
        this.f203a = typeDeserializer;
    }

    protected abd c(KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        return (this.e == keyDeserializer && this.f204c == jsonDeserializer && this.f203a == typeDeserializer) ? this : new abd(this, keyDeserializer, jsonDeserializer, typeDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.fasterxml.jackson.databind.KeyDeserializer] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [abd] */
    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
        ?? CreateContextual;
        JsonDeserializer<?> jsonDeserializerHandleSecondaryContextualization;
        Object obj = this.e;
        if (obj == null) {
            CreateContextual = deserializationContext.findKeyDeserializer(this._containerType.containedType(0), beanProperty);
        } else if (obj instanceof ContextualKeyDeserializer) {
            CreateContextual = obj;
            CreateContextual = ((ContextualKeyDeserializer) obj).createContextual(deserializationContext, beanProperty);
        }
        CreateContextual = obj;
        JsonDeserializer<?> jsonDeserializerFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this.f204c);
        JavaType javaTypeContainedType = this._containerType.containedType(1);
        if (jsonDeserializerFindConvertingContentDeserializer == null) {
            jsonDeserializerHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(javaTypeContainedType, beanProperty);
        } else {
            jsonDeserializerHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(jsonDeserializerFindConvertingContentDeserializer, beanProperty, javaTypeContainedType);
        }
        TypeDeserializer typeDeserializerForProperty = this.f203a;
        if (typeDeserializerForProperty != null) {
            typeDeserializerForProperty = typeDeserializerForProperty.forProperty(beanProperty);
        }
        return c(CreateContextual, typeDeserializerForProperty, jsonDeserializerHandleSecondaryContextualization);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JavaType getContentType() {
        return this._containerType.containedType(1);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this.f204c;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objDeserializeWithType;
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == JsonToken.START_OBJECT) {
            jsonTokenCurrentToken = jsonParser.nextToken();
        } else if (jsonTokenCurrentToken != JsonToken.FIELD_NAME && jsonTokenCurrentToken != JsonToken.END_OBJECT) {
            if (jsonTokenCurrentToken == JsonToken.START_ARRAY) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            return (Map.Entry) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
        if (jsonTokenCurrentToken != JsonToken.FIELD_NAME) {
            if (jsonTokenCurrentToken == JsonToken.END_OBJECT) {
                return (Map.Entry) deserializationContext.reportInputMismatch(this, "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0]);
            }
            return (Map.Entry) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
        KeyDeserializer keyDeserializer = this.e;
        JsonDeserializer<Object> jsonDeserializer = this.f204c;
        TypeDeserializer typeDeserializer = this.f203a;
        String strCurrentName = jsonParser.currentName();
        Object objDeserializeKey = keyDeserializer.deserializeKey(strCurrentName, deserializationContext);
        try {
            if (jsonParser.nextToken() == JsonToken.VALUE_NULL) {
                objDeserializeWithType = jsonDeserializer.getNullValue(deserializationContext);
            } else if (typeDeserializer == null) {
                objDeserializeWithType = jsonDeserializer.deserialize(jsonParser, deserializationContext);
            } else {
                objDeserializeWithType = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            }
        } catch (Exception e) {
            wrapAndThrow(deserializationContext, e, Map.Entry.class, strCurrentName);
            objDeserializeWithType = null;
        }
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        if (jsonTokenNextToken != JsonToken.END_OBJECT) {
            if (jsonTokenNextToken == JsonToken.FIELD_NAME) {
                deserializationContext.reportInputMismatch(this, "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')", jsonParser.currentName());
            } else {
                deserializationContext.reportInputMismatch(this, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: " + jsonTokenNextToken, new Object[0]);
            }
            return null;
        }
        return new AbstractMap.SimpleEntry(objDeserializeKey, objDeserializeWithType);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Map.Entry<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map.Entry<Object, Object> entry) throws IOException {
        throw new IllegalStateException("Cannot update Map.Entry values");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }
}
