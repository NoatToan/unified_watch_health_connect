package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class abi<T> extends StdDeserializer<T> implements ContextualDeserializer, ResolvableDeserializer {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final JavaType f216a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final JsonDeserializer<Object> f217c;
    protected final Converter<Object, T> d;

    public abi(Converter<?, T> converter) {
        super((Class<?>) Object.class);
        this.d = converter;
        this.f216a = null;
        this.f217c = null;
    }

    public abi(Converter<Object, T> converter, JavaType javaType, JsonDeserializer<?> jsonDeserializer) {
        super(javaType);
        this.d = converter;
        this.f216a = javaType;
        this.f217c = jsonDeserializer;
    }

    protected abi<T> b(Converter<Object, T> converter, JavaType javaType, JsonDeserializer<?> jsonDeserializer) {
        ahw.c((Class<?>) abi.class, this, "withDelegate");
        return new abi<>(converter, javaType, jsonDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(DeserializationContext deserializationContext) throws ym {
        NullValueProvider nullValueProvider = this.f217c;
        if (nullValueProvider == null || !(nullValueProvider instanceof ResolvableDeserializer)) {
            return;
        }
        ((ResolvableDeserializer) nullValueProvider).resolve(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
        JsonDeserializer<?> jsonDeserializer = this.f217c;
        if (jsonDeserializer != null) {
            JsonDeserializer<?> jsonDeserializerHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(jsonDeserializer, beanProperty, this.f216a);
            return jsonDeserializerHandleSecondaryContextualization != this.f217c ? b(this.d, this.f216a, jsonDeserializerHandleSecondaryContextualization) : this;
        }
        JavaType inputType = this.d.getInputType(deserializationContext.getTypeFactory());
        return b(this.d, inputType, deserializationContext.findContextualValueDeserializer(inputType, beanProperty));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<?> getDelegatee() {
        return this.f217c;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Class<?> handledType() {
        return this.f217c.handledType();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return this.f217c.logicalType();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(yi yiVar) {
        return this.f217c.supportsUpdate(yiVar);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objDeserialize = this.f217c.deserialize(jsonParser, deserializationContext);
        if (objDeserialize == null) {
            return null;
        }
        return b(objDeserialize);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        Object objDeserialize = this.f217c.deserialize(jsonParser, deserializationContext);
        if (objDeserialize == null) {
            return null;
        }
        return b(objDeserialize);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (this.f216a.getRawClass().isAssignableFrom(obj.getClass())) {
            return (T) this.f217c.deserialize(jsonParser, deserializationContext, obj);
        }
        return (T) c(jsonParser, deserializationContext, obj);
    }

    protected Object c(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        throw new UnsupportedOperationException(String.format("Cannot update object of type %s (using deserializer for type %s)" + obj.getClass().getName(), this.f216a));
    }

    protected T b(Object obj) {
        return this.d.convert(obj);
    }
}
