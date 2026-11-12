package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: loaded from: classes21.dex */
public final class aaj extends JsonDeserializer<Object> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final JsonDeserializer<Object> d;
    protected final TypeDeserializer e;

    public aaj(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        this.e = typeDeserializer;
        this.d = jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return this.d.logicalType();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Class<?> handledType() {
        return this.d.handledType();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(yi yiVar) {
        return this.d.supportsUpdate(yiVar);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<?> getDelegatee() {
        return this.d.getDelegatee();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Collection<Object> getKnownPropertyNames() {
        return this.d.getKnownPropertyNames();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public Object getNullValue(DeserializationContext deserializationContext) throws ym {
        return this.d.getNullValue(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
        return this.d.getEmptyValue(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this.d.deserializeWithType(jsonParser, deserializationContext, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return this.d.deserialize(jsonParser, deserializationContext, obj);
    }
}
