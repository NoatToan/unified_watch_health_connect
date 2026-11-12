package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import defpackage.esd;
import defpackage.h04;
import defpackage.q4q;
import defpackage.r4q;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TypeDeserializerBase extends q4q implements Serializable {
    private static final long serialVersionUID = 1;
    protected final JavaType _baseType;
    protected final JavaType _defaultImpl;
    protected esd<Object> _defaultImplDeserializer;
    protected final Map<String, esd<Object>> _deserializers;
    protected final r4q _idResolver;
    protected final BeanProperty _property;
    protected final boolean _typeIdVisible;
    protected final String _typePropertyName;

    public TypeDeserializerBase(JavaType javaType, r4q r4qVar, String str, boolean z, JavaType javaType2) {
        this._baseType = javaType;
        this._idResolver = r4qVar;
        this._typePropertyName = h04.V(str);
        this._typeIdVisible = z;
        this._deserializers = new ConcurrentHashMap(16, 0.75f, 2);
        this._defaultImpl = javaType2;
        this._property = null;
    }

    @Deprecated
    public Object _deserializeWithNativeTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserializeWithNativeTypeId(jsonParser, deserializationContext, jsonParser.n0());
    }

    public final esd<Object> _findDefaultImplDeserializer(DeserializationContext deserializationContext) throws IOException {
        esd<Object> esdVar;
        JavaType javaType = this._defaultImpl;
        if (javaType == null) {
            if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
                return null;
            }
            return NullifyingDeserializer.instance;
        }
        if (h04.K(javaType.getRawClass())) {
            return NullifyingDeserializer.instance;
        }
        synchronized (this._defaultImpl) {
            try {
                if (this._defaultImplDeserializer == null) {
                    this._defaultImplDeserializer = deserializationContext.findContextualValueDeserializer(this._defaultImpl, this._property);
                }
                esdVar = this._defaultImplDeserializer;
            } catch (Throwable th) {
                throw th;
            }
        }
        return esdVar;
    }

    public final esd<Object> _findDeserializer(DeserializationContext deserializationContext, String str) throws IOException {
        esd<Object> esdVarFindContextualValueDeserializer;
        esd<Object> esdVar_findDefaultImplDeserializer = this._deserializers.get(str);
        if (esdVar_findDefaultImplDeserializer == null) {
            JavaType javaTypeD = this._idResolver.d(deserializationContext, str);
            if (javaTypeD == null) {
                esdVar_findDefaultImplDeserializer = _findDefaultImplDeserializer(deserializationContext);
                if (esdVar_findDefaultImplDeserializer == null) {
                    JavaType javaType_handleUnknownTypeId = _handleUnknownTypeId(deserializationContext, str);
                    if (javaType_handleUnknownTypeId == null) {
                        return NullifyingDeserializer.instance;
                    }
                    esdVarFindContextualValueDeserializer = deserializationContext.findContextualValueDeserializer(javaType_handleUnknownTypeId, this._property);
                }
                this._deserializers.put(str, esdVar_findDefaultImplDeserializer);
            } else {
                JavaType javaType = this._baseType;
                if (javaType != null && javaType.getClass() == javaTypeD.getClass() && !javaTypeD.hasGenericTypes()) {
                    javaTypeD = deserializationContext.getTypeFactory().constructSpecializedType(this._baseType, javaTypeD.getRawClass());
                }
                esdVarFindContextualValueDeserializer = deserializationContext.findContextualValueDeserializer(javaTypeD, this._property);
            }
            esdVar_findDefaultImplDeserializer = esdVarFindContextualValueDeserializer;
            this._deserializers.put(str, esdVar_findDefaultImplDeserializer);
        }
        return esdVar_findDefaultImplDeserializer;
    }

    public JavaType _handleMissingTypeId(DeserializationContext deserializationContext, String str) throws IOException {
        return deserializationContext.handleMissingTypeId(this._baseType, this._idResolver, str);
    }

    public JavaType _handleUnknownTypeId(DeserializationContext deserializationContext, String str) throws IOException {
        String str2;
        String strB = this._idResolver.b();
        if (strB == null) {
            str2 = "type ids are not statically known";
        } else {
            str2 = "known type ids = " + strB;
        }
        BeanProperty beanProperty = this._property;
        if (beanProperty != null) {
            str2 = String.format("%s (for POJO property '%s')", str2, beanProperty.getName());
        }
        return deserializationContext.handleUnknownTypeId(this._baseType, str, this._idResolver, str2);
    }

    public JavaType baseType() {
        return this._baseType;
    }

    public String baseTypeName() {
        return this._baseType.getRawClass().getName();
    }

    @Override // defpackage.q4q
    public abstract q4q forProperty(BeanProperty beanProperty);

    @Override // defpackage.q4q
    public Class<?> getDefaultImpl() {
        return h04.Z(this._defaultImpl);
    }

    @Override // defpackage.q4q
    public final String getPropertyName() {
        return this._typePropertyName;
    }

    @Override // defpackage.q4q
    public r4q getTypeIdResolver() {
        return this._idResolver;
    }

    @Override // defpackage.q4q
    public abstract JsonTypeInfo.As getTypeInclusion();

    public String toString() {
        return AbstractJsonLexerKt.BEGIN_LIST + getClass().getName() + "; base-type:" + this._baseType + "; id-resolver: " + this._idResolver + AbstractJsonLexerKt.END_LIST;
    }

    public Object _deserializeWithNativeTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        esd<Object> esdVar_findDeserializer;
        if (obj == null) {
            esdVar_findDeserializer = _findDefaultImplDeserializer(deserializationContext);
            if (esdVar_findDeserializer == null) {
                return deserializationContext.reportInputMismatch(baseType(), "No (native) type id found when one was expected for polymorphic type handling", new Object[0]);
            }
        } else {
            esdVar_findDeserializer = _findDeserializer(deserializationContext, obj instanceof String ? (String) obj : String.valueOf(obj));
        }
        return esdVar_findDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public TypeDeserializerBase(TypeDeserializerBase typeDeserializerBase, BeanProperty beanProperty) {
        this._baseType = typeDeserializerBase._baseType;
        this._idResolver = typeDeserializerBase._idResolver;
        this._typePropertyName = typeDeserializerBase._typePropertyName;
        this._typeIdVisible = typeDeserializerBase._typeIdVisible;
        this._deserializers = typeDeserializerBase._deserializers;
        this._defaultImpl = typeDeserializerBase._defaultImpl;
        this._defaultImplDeserializer = typeDeserializerBase._defaultImplDeserializer;
        this._property = beanProperty;
    }
}
