package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import defpackage.aj4;
import defpackage.esd;
import defpackage.fh2;
import defpackage.gh2;
import defpackage.q4q;
import defpackage.z3h;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class AbstractDeserializer extends esd<Object> implements aj4, Serializable {
    private static final long serialVersionUID = 1;
    protected final boolean _acceptBoolean;
    protected final boolean _acceptDouble;
    protected final boolean _acceptInt;
    protected final boolean _acceptString;
    protected final Map<String, SettableBeanProperty> _backRefProperties;
    protected final JavaType _baseType;
    protected final ObjectIdReader _objectIdReader;
    protected transient Map<String, SettableBeanProperty> _properties;

    @Deprecated
    public AbstractDeserializer(gh2 gh2Var, fh2 fh2Var, Map<String, SettableBeanProperty> map) {
        this(gh2Var, fh2Var, map, null);
    }

    public static AbstractDeserializer constructForNonPOJO(fh2 fh2Var) {
        return new AbstractDeserializer(fh2Var);
    }

    public Object _deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objectReference = this._objectIdReader.readObjectReference(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this._objectIdReader;
        com.fasterxml.jackson.databind.deser.impl.a aVarFindObjectId = deserializationContext.findObjectId(objectReference, objectIdReader.generator, objectIdReader.resolver);
        Object objF = aVarFindObjectId.f();
        if (objF != null) {
            return objF;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + objectReference + "] -- unresolved forward-reference?", jsonParser.E(), aVarFindObjectId);
    }

    public Object _deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.M()) {
            case 6:
                if (this._acceptString) {
                    return jsonParser.d0();
                }
                return null;
            case 7:
                if (this._acceptInt) {
                    return Integer.valueOf(jsonParser.R());
                }
                return null;
            case 8:
                if (this._acceptDouble) {
                    return Double.valueOf(jsonParser.O());
                }
                return null;
            case 9:
                if (this._acceptBoolean) {
                    return Boolean.TRUE;
                }
                return null;
            case 10:
                if (this._acceptBoolean) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // defpackage.aj4
    public esd<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AnnotatedMember member;
        z3h z3hVarFindObjectIdInfo;
        ObjectIdGenerator<?> objectIdGeneratorObjectIdGeneratorInstance;
        SettableBeanProperty settableBeanProperty;
        JavaType javaType;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (beanProperty == null || annotationIntrospector == null || (member = beanProperty.getMember()) == null || (z3hVarFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(member)) == null) {
            return this._properties == null ? this : new AbstractDeserializer(this, this._objectIdReader, (Map<String, SettableBeanProperty>) null);
        }
        com.fasterxml.jackson.annotation.a aVarObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, z3hVarFindObjectIdInfo);
        z3h z3hVarFindObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, z3hVarFindObjectIdInfo);
        Class<? extends ObjectIdGenerator<?>> clsC = z3hVarFindObjectReferenceInfo.c();
        if (clsC == ObjectIdGenerators$PropertyGenerator.class) {
            PropertyName propertyNameD = z3hVarFindObjectReferenceInfo.d();
            Map<String, SettableBeanProperty> map = this._properties;
            SettableBeanProperty settableBeanProperty2 = map == null ? null : map.get(propertyNameD.getSimpleName());
            if (settableBeanProperty2 == null) {
                deserializationContext.reportBadDefinition(this._baseType, String.format("Invalid Object Id definition for %s: cannot find property with name '%s'", handledType().getName(), propertyNameD));
            }
            JavaType type = settableBeanProperty2.getType();
            objectIdGeneratorObjectIdGeneratorInstance = new PropertyBasedObjectIdGenerator(z3hVarFindObjectReferenceInfo.f());
            javaType = type;
            settableBeanProperty = settableBeanProperty2;
        } else {
            aVarObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, z3hVarFindObjectReferenceInfo);
            JavaType javaType2 = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType((Class<?>) clsC), ObjectIdGenerator.class)[0];
            objectIdGeneratorObjectIdGeneratorInstance = deserializationContext.objectIdGeneratorInstance(member, z3hVarFindObjectReferenceInfo);
            settableBeanProperty = null;
            javaType = javaType2;
        }
        return new AbstractDeserializer(this, ObjectIdReader.construct(javaType, z3hVarFindObjectReferenceInfo.d(), objectIdGeneratorObjectIdGeneratorInstance, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty, aVarObjectIdResolverInstance), (Map<String, SettableBeanProperty>) null);
    }

    @Override // defpackage.esd
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleMissingInstantiator(this._baseType.getRawClass(), new b.a(this._baseType), jsonParser, "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
    }

    @Override // defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        JsonToken jsonTokenK;
        if (this._objectIdReader != null && (jsonTokenK = jsonParser.K()) != null) {
            if (jsonTokenK.isScalarValue()) {
                return _deserializeFromObjectId(jsonParser, deserializationContext);
            }
            if (jsonTokenK == JsonToken.START_OBJECT) {
                jsonTokenK = jsonParser.G0();
            }
            if (jsonTokenK == JsonToken.FIELD_NAME && this._objectIdReader.maySerializeAsObject() && this._objectIdReader.isValidReferencePropertyName(jsonParser.J(), jsonParser)) {
                return _deserializeFromObjectId(jsonParser, deserializationContext);
            }
        }
        Object obj_deserializeIfNatural = _deserializeIfNatural(jsonParser, deserializationContext);
        return obj_deserializeIfNatural != null ? obj_deserializeIfNatural : q4qVar.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // defpackage.esd
    public SettableBeanProperty findBackReference(String str) {
        Map<String, SettableBeanProperty> map = this._backRefProperties;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // defpackage.esd
    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    @Override // defpackage.esd
    public Class<?> handledType() {
        return this._baseType.getRawClass();
    }

    @Override // defpackage.esd
    public boolean isCachable() {
        return true;
    }

    @Override // defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    public AbstractDeserializer(gh2 gh2Var, fh2 fh2Var, Map<String, SettableBeanProperty> map, Map<String, SettableBeanProperty> map2) {
        JavaType javaTypeZ = fh2Var.z();
        this._baseType = javaTypeZ;
        this._objectIdReader = gh2Var.p();
        this._backRefProperties = map;
        this._properties = map2;
        Class<?> rawClass = javaTypeZ.getRawClass();
        this._acceptString = rawClass.isAssignableFrom(String.class);
        this._acceptBoolean = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this._acceptInt = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        this._acceptDouble = rawClass == Double.TYPE || rawClass.isAssignableFrom(Double.class);
    }

    public AbstractDeserializer(fh2 fh2Var) {
        JavaType javaTypeZ = fh2Var.z();
        this._baseType = javaTypeZ;
        this._objectIdReader = null;
        this._backRefProperties = null;
        Class<?> rawClass = javaTypeZ.getRawClass();
        this._acceptString = rawClass.isAssignableFrom(String.class);
        this._acceptBoolean = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this._acceptInt = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        this._acceptDouble = rawClass == Double.TYPE || rawClass.isAssignableFrom(Double.class);
    }

    public AbstractDeserializer(AbstractDeserializer abstractDeserializer, ObjectIdReader objectIdReader, Map<String, SettableBeanProperty> map) {
        this._baseType = abstractDeserializer._baseType;
        this._backRefProperties = abstractDeserializer._backRefProperties;
        this._acceptString = abstractDeserializer._acceptString;
        this._acceptBoolean = abstractDeserializer._acceptBoolean;
        this._acceptInt = abstractDeserializer._acceptInt;
        this._acceptDouble = abstractDeserializer._acceptDouble;
        this._objectIdReader = objectIdReader;
        this._properties = map;
    }
}
