package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.aj4;
import defpackage.esd;
import defpackage.q4q;
import java.io.IOException;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes4.dex */
public class EnumSetDeserializer extends StdDeserializer<EnumSet<?>> implements aj4 {
    private static final long serialVersionUID = 1;
    protected final Class<Enum> _enumClass;
    protected esd<Enum<?>> _enumDeserializer;
    protected final JavaType _enumType;
    protected final Boolean _unwrapSingle;

    /* JADX WARN: Multi-variable type inference failed */
    public EnumSetDeserializer(JavaType javaType, esd<?> esdVar) {
        super((Class<?>) EnumSet.class);
        this._enumType = javaType;
        Class rawClass = javaType.getRawClass();
        this._enumClass = rawClass;
        if (rawClass.isEnum()) {
            this._enumDeserializer = esdVar;
            this._unwrapSingle = null;
        } else {
            throw new IllegalArgumentException("Type " + javaType + " not Java Enum type");
        }
    }

    private EnumSet constructSet() {
        return EnumSet.noneOf(this._enumClass);
    }

    public final EnumSet<?> _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) throws IOException {
        while (true) {
            try {
                JsonToken jsonTokenG0 = jsonParser.G0();
                if (jsonTokenG0 == JsonToken.END_ARRAY) {
                    return enumSet;
                }
                if (jsonTokenG0 == JsonToken.VALUE_NULL) {
                    return (EnumSet) deserializationContext.handleUnexpectedToken(this._enumClass, jsonParser);
                }
                Enum<?> enumDeserialize = this._enumDeserializer.deserialize(jsonParser, deserializationContext);
                if (enumDeserialize != null) {
                    enumSet.add(enumDeserialize);
                }
            } catch (Exception e) {
                throw JsonMappingException.wrapWithPath(e, enumSet, enumSet.size());
            }
        }
    }

    @Override // defpackage.aj4
    public esd<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, EnumSet.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        esd<Enum<?>> esdVar = this._enumDeserializer;
        return withResolved(esdVar == null ? deserializationContext.findContextualValueDeserializer(this._enumType, beanProperty) : deserializationContext.handleSecondaryContextualization(esdVar, beanProperty, this._enumType), boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return q4qVar.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public EnumSet<?> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) throws IOException {
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (EnumSet) deserializationContext.handleUnexpectedToken(EnumSet.class, jsonParser);
        }
        if (jsonParser.y0(JsonToken.VALUE_NULL)) {
            return (EnumSet) deserializationContext.handleUnexpectedToken(this._enumClass, jsonParser);
        }
        try {
            Enum<?> enumDeserialize = this._enumDeserializer.deserialize(jsonParser, deserializationContext);
            if (enumDeserialize != null) {
                enumSet.add(enumDeserialize);
            }
            return enumSet;
        } catch (Exception e) {
            throw JsonMappingException.wrapWithPath(e, enumSet, enumSet.size());
        }
    }

    @Override // defpackage.esd
    public boolean isCachable() {
        return this._enumType.getValueHandler() == null;
    }

    @Override // defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public EnumSetDeserializer withDeserializer(esd<?> esdVar) {
        return this._enumDeserializer == esdVar ? this : new EnumSetDeserializer(this, esdVar, this._unwrapSingle);
    }

    public EnumSetDeserializer withResolved(esd<?> esdVar, Boolean bool) {
        return (this._unwrapSingle == bool && this._enumDeserializer == esdVar) ? this : new EnumSetDeserializer(this, esdVar, bool);
    }

    @Override // defpackage.esd
    public EnumSet<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        EnumSet enumSetConstructSet = constructSet();
        if (!jsonParser.B0()) {
            return handleNonArray(jsonParser, deserializationContext, enumSetConstructSet);
        }
        return _deserialize(jsonParser, deserializationContext, enumSetConstructSet);
    }

    @Override // defpackage.esd
    public EnumSet<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet<?> enumSet) throws IOException {
        if (!jsonParser.B0()) {
            return handleNonArray(jsonParser, deserializationContext, enumSet);
        }
        return _deserialize(jsonParser, deserializationContext, enumSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnumSetDeserializer(EnumSetDeserializer enumSetDeserializer, esd<?> esdVar, Boolean bool) {
        super(enumSetDeserializer);
        this._enumType = enumSetDeserializer._enumType;
        this._enumClass = enumSetDeserializer._enumClass;
        this._enumDeserializer = esdVar;
        this._unwrapSingle = bool;
    }
}
