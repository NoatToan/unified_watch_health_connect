package defpackage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public class aaz extends StdDeserializer<EnumSet<?>> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected JsonDeserializer<Enum<?>> f194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final NullValueProvider f195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final JavaType f196c;
    protected final Boolean d;
    protected final boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public aaz(JavaType javaType, JsonDeserializer<?> jsonDeserializer) {
        super((Class<?>) EnumSet.class);
        this.f196c = javaType;
        if (!javaType.isEnumType()) {
            throw new IllegalArgumentException("Type " + javaType + " not Java Enum type");
        }
        this.f194a = jsonDeserializer;
        this.d = null;
        this.f195b = null;
        this.e = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected aaz(aaz aazVar, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        super(aazVar);
        this.f196c = aazVar.f196c;
        this.f194a = jsonDeserializer;
        this.f195b = nullValueProvider;
        this.e = aaa.c(nullValueProvider);
        this.d = bool;
    }

    public aaz e(JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        return (Objects.equals(this.d, bool) && this.f194a == jsonDeserializer && this.f195b == jsonDeserializer) ? this : new aaz(this, jsonDeserializer, nullValueProvider, bool);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this.f196c.getValueHandler() == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Collection;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(yi yiVar) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
        return a();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
        JsonDeserializer<?> jsonDeserializerHandleSecondaryContextualization;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, EnumSet.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JsonDeserializer<Enum<?>> jsonDeserializer = this.f194a;
        if (jsonDeserializer == null) {
            jsonDeserializerHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(this.f196c, beanProperty);
        } else {
            jsonDeserializerHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(jsonDeserializer, beanProperty, this.f196c);
        }
        return e(jsonDeserializerHandleSecondaryContextualization, findContentNullProvider(deserializationContext, beanProperty, jsonDeserializerHandleSecondaryContextualization), boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public EnumSet<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        EnumSet enumSetA = a();
        if (!jsonParser.isExpectedStartArrayToken()) {
            return d(jsonParser, deserializationContext, enumSetA);
        }
        return e(jsonParser, deserializationContext, enumSetA);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public EnumSet<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet<?> enumSet) throws IOException {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return d(jsonParser, deserializationContext, enumSet);
        }
        return e(jsonParser, deserializationContext, enumSet);
    }

    protected final EnumSet<?> e(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) throws IOException {
        Enum<?> enumDeserialize;
        while (true) {
            try {
                JsonToken jsonTokenNextToken = jsonParser.nextToken();
                if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                    return enumSet;
                }
                if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                    if (!this.e) {
                        enumDeserialize = (Enum) this.f195b.getNullValue(deserializationContext);
                    }
                } else {
                    enumDeserialize = this.f194a.deserialize(jsonParser, deserializationContext);
                }
                if (enumDeserialize != null) {
                    enumSet.add(enumDeserialize);
                }
            } catch (Exception e) {
                throw ym.wrapWithPath(e, enumSet, enumSet.size());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    private EnumSet a() {
        return EnumSet.noneOf(this.f196c.getRawClass());
    }

    protected EnumSet<?> d(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) throws IOException {
        if (this.d != Boolean.TRUE && (this.d != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (EnumSet) deserializationContext.handleUnexpectedToken(EnumSet.class, jsonParser);
        }
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            return (EnumSet) deserializationContext.handleUnexpectedToken(this.f196c, jsonParser);
        }
        try {
            Enum<?> enumDeserialize = this.f194a.deserialize(jsonParser, deserializationContext);
            if (enumDeserialize != null) {
                enumSet.add(enumDeserialize);
            }
            return enumSet;
        } catch (Exception e) {
            throw ym.wrapWithPath(e, enumSet, enumSet.size());
        }
    }
}
