package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.aj4;
import defpackage.ak4;
import defpackage.bip;
import defpackage.bqk;
import defpackage.esd;
import defpackage.fh2;
import defpackage.gh2;
import defpackage.h04;
import defpackage.ldi;
import defpackage.pk8;
import defpackage.q4q;
import defpackage.qbq;
import defpackage.z1h;
import defpackage.z3h;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BeanDeserializerBase extends StdDeserializer<Object> implements aj4, bqk, Serializable {
    protected static final PropertyName TEMP_PROPERTY_NAME = new PropertyName("#temporary-name");
    private static final long serialVersionUID = 1;
    protected SettableAnyProperty _anySetter;
    protected esd<Object> _arrayDelegateDeserializer;
    protected final Map<String, SettableBeanProperty> _backRefs;
    protected final BeanPropertyMap _beanProperties;
    protected final JavaType _beanType;
    protected esd<Object> _delegateDeserializer;
    protected pk8 _externalTypeIdHandler;
    protected final Set<String> _ignorableProps;
    protected final boolean _ignoreAllUnknown;
    protected final ValueInjector[] _injectables;
    protected final boolean _needViewProcesing;
    protected boolean _nonStandardCreation;
    protected final ObjectIdReader _objectIdReader;
    protected ldi _propertyBasedCreator;
    protected final JsonFormat.Shape _serializationShape;
    protected transient HashMap<ClassKey, esd<Object>> _subDeserializers;
    protected qbq _unwrappedPropertyHandler;
    protected final b _valueInstantiator;
    protected boolean _vanillaProcessing;

    public BeanDeserializerBase(gh2 gh2Var, fh2 fh2Var, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, boolean z2) {
        super(fh2Var.z());
        this._beanType = fh2Var.z();
        b bVarQ = gh2Var.q();
        this._valueInstantiator = bVarQ;
        this._beanProperties = beanPropertyMap;
        this._backRefs = map;
        this._ignorableProps = set;
        this._ignoreAllUnknown = z;
        this._anySetter = gh2Var.m();
        List<ValueInjector> listO = gh2Var.o();
        ValueInjector[] valueInjectorArr = (listO == null || listO.isEmpty()) ? null : (ValueInjector[]) listO.toArray(new ValueInjector[listO.size()]);
        this._injectables = valueInjectorArr;
        ObjectIdReader objectIdReaderP = gh2Var.p();
        this._objectIdReader = objectIdReaderP;
        boolean z3 = false;
        this._nonStandardCreation = this._unwrappedPropertyHandler != null || bVarQ.canCreateUsingDelegate() || bVarQ.canCreateUsingArrayDelegate() || bVarQ.canCreateFromObjectWith() || !bVarQ.canCreateUsingDefault();
        JsonFormat.Value valueG = fh2Var.g(null);
        this._serializationShape = valueG != null ? valueG.getShape() : null;
        this._needViewProcesing = z2;
        if (!this._nonStandardCreation && valueInjectorArr == null && !z2 && objectIdReaderP == null) {
            z3 = true;
        }
        this._vanillaProcessing = z3;
    }

    private final esd<Object> _delegateDeserializer() {
        esd<Object> esdVar = this._delegateDeserializer;
        return esdVar == null ? this._arrayDelegateDeserializer : esdVar;
    }

    private esd<Object> _findDelegateDeserializer(DeserializationContext deserializationContext, JavaType javaType, AnnotatedWithParams annotatedWithParams) throws JsonMappingException {
        BeanProperty.Std std = new BeanProperty.Std(TEMP_PROPERTY_NAME, javaType, null, annotatedWithParams, PropertyMetadata.STD_OPTIONAL);
        q4q q4qVarFindTypeDeserializer = (q4q) javaType.getTypeHandler();
        if (q4qVarFindTypeDeserializer == null) {
            q4qVarFindTypeDeserializer = deserializationContext.getConfig().findTypeDeserializer(javaType);
        }
        esd<?> esdVar = (esd) javaType.getValueHandler();
        esd<?> esdVarFindDeserializer = esdVar == null ? findDeserializer(deserializationContext, javaType, std) : deserializationContext.handleSecondaryContextualization(esdVar, std, javaType);
        return q4qVarFindTypeDeserializer != null ? new TypeWrappedDeserializer(q4qVarFindTypeDeserializer.forProperty(std), esdVarFindDeserializer) : esdVarFindDeserializer;
    }

    private Throwable throwOrReturnThrowable(Throwable th, DeserializationContext deserializationContext) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        h04.d0(th);
        boolean z = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JsonProcessingException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            h04.f0(th);
        }
        return th;
    }

    public Object _convertObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, esd<Object> esdVar) throws IOException {
        bip bipVar = new bip(jsonParser, deserializationContext);
        if (obj instanceof String) {
            bipVar.Q0((String) obj);
        } else if (obj instanceof Long) {
            bipVar.w0(((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            bipVar.v0(((Integer) obj).intValue());
        } else {
            bipVar.B0(obj);
        }
        JsonParser jsonParserF1 = bipVar.f1();
        jsonParserF1.G0();
        return esdVar.deserialize(jsonParserF1, deserializationContext);
    }

    public abstract Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public NameTransformer _findPropertyUnwrapper(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        NameTransformer nameTransformerFindUnwrappingNameTransformer;
        AnnotatedMember member = settableBeanProperty.getMember();
        if (member == null || (nameTransformerFindUnwrappingNameTransformer = deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(member)) == null) {
            return null;
        }
        if (settableBeanProperty instanceof CreatorProperty) {
            deserializationContext.reportBadDefinition(getValueType(), String.format("Cannot define Creator property \"%s\" as `@JsonUnwrapped`: combination not yet supported", settableBeanProperty.getName()));
        }
        return nameTransformerFindUnwrappingNameTransformer;
    }

    public esd<Object> _findSubclassDeserializer(DeserializationContext deserializationContext, Object obj, bip bipVar) throws IOException {
        esd<Object> esdVar;
        synchronized (this) {
            HashMap<ClassKey, esd<Object>> map = this._subDeserializers;
            esdVar = map == null ? null : map.get(new ClassKey(obj.getClass()));
        }
        if (esdVar != null) {
            return esdVar;
        }
        esd<Object> esdVarFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(deserializationContext.constructType(obj.getClass()));
        if (esdVarFindRootValueDeserializer != null) {
            synchronized (this) {
                try {
                    if (this._subDeserializers == null) {
                        this._subDeserializers = new HashMap<>();
                    }
                    this._subDeserializers.put(new ClassKey(obj.getClass()), esdVarFindRootValueDeserializer);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return esdVarFindRootValueDeserializer;
    }

    public Object _handleTypedObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Object obj2) throws IOException {
        esd<Object> deserializer = this._objectIdReader.getDeserializer();
        if (deserializer.handledType() != obj2.getClass()) {
            obj2 = _convertObjectId(jsonParser, deserializationContext, obj2, deserializer);
        }
        ObjectIdReader objectIdReader = this._objectIdReader;
        deserializationContext.findObjectId(obj2, objectIdReader.generator, objectIdReader.resolver).b(obj);
        SettableBeanProperty settableBeanProperty = this._objectIdReader.idProperty;
        return settableBeanProperty != null ? settableBeanProperty.setAndReturn(obj, obj2) : obj;
    }

    public void _replaceProperty(BeanPropertyMap beanPropertyMap, SettableBeanProperty[] settableBeanPropertyArr, SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        beanPropertyMap.replace(settableBeanProperty, settableBeanProperty2);
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            for (int i = 0; i < length; i++) {
                if (settableBeanPropertyArr[i] == settableBeanProperty) {
                    settableBeanPropertyArr[i] = settableBeanProperty2;
                    return;
                }
            }
        }
    }

    public SettableBeanProperty _resolveInnerClassValuedProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        Class<?> rawClass;
        Class<?> clsF;
        esd<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
        if ((valueDeserializer instanceof BeanDeserializerBase) && !((BeanDeserializerBase) valueDeserializer).getValueInstantiator().canCreateUsingDefault() && (clsF = h04.F((rawClass = settableBeanProperty.getType().getRawClass()))) != null && clsF == this._beanType.getRawClass()) {
            for (Constructor<?> constructor : rawClass.getConstructors()) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == 1 && clsF.equals(parameterTypes[0])) {
                    if (deserializationContext.canOverrideAccessModifiers()) {
                        h04.f(constructor, deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return new InnerClassProperty(settableBeanProperty, constructor);
                }
            }
        }
        return settableBeanProperty;
    }

    public SettableBeanProperty _resolveManagedReferenceProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        String managedReferenceName = settableBeanProperty.getManagedReferenceName();
        if (managedReferenceName == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty settableBeanPropertyFindBackReference = settableBeanProperty.getValueDeserializer().findBackReference(managedReferenceName);
        if (settableBeanPropertyFindBackReference == null) {
            deserializationContext.reportBadDefinition(this._beanType, String.format("Cannot handle managed/back reference '%s': no back reference property found from type %s", managedReferenceName, settableBeanProperty.getType()));
        }
        JavaType javaType = this._beanType;
        JavaType type = settableBeanPropertyFindBackReference.getType();
        boolean zIsContainerType = settableBeanProperty.getType().isContainerType();
        if (!type.getRawClass().isAssignableFrom(javaType.getRawClass())) {
            deserializationContext.reportBadDefinition(this._beanType, String.format("Cannot handle managed/back reference '%s': back reference type (%s) not compatible with managed type (%s)", managedReferenceName, type.getRawClass().getName(), javaType.getRawClass().getName()));
        }
        return new ManagedReferenceProperty(settableBeanProperty, managedReferenceName, settableBeanPropertyFindBackReference, zIsContainerType);
    }

    public SettableBeanProperty _resolveMergeAndNullSettings(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyMetadata propertyMetadata) throws JsonMappingException {
        PropertyMetadata.a mergeInfo = propertyMetadata.getMergeInfo();
        if (mergeInfo != null) {
            esd<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
            Boolean boolSupportsUpdate = valueDeserializer.supportsUpdate(deserializationContext.getConfig());
            if (boolSupportsUpdate == null) {
                if (mergeInfo.f7634b) {
                    return settableBeanProperty;
                }
            } else if (!boolSupportsUpdate.booleanValue()) {
                if (!mergeInfo.f7634b) {
                    deserializationContext.reportBadMerge(valueDeserializer);
                }
                return settableBeanProperty;
            }
            AnnotatedMember annotatedMember = mergeInfo.f7633a;
            annotatedMember.fixAccess(deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            if (!(settableBeanProperty instanceof SetterlessProperty)) {
                settableBeanProperty = MergingSettableBeanProperty.construct(settableBeanProperty, annotatedMember);
            }
        }
        z1h z1hVarFindValueNullProvider = findValueNullProvider(deserializationContext, settableBeanProperty, propertyMetadata);
        return z1hVarFindValueNullProvider != null ? settableBeanProperty.withNullProvider(z1hVarFindValueNullProvider) : settableBeanProperty;
    }

    public SettableBeanProperty _resolvedObjectIdProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        z3h objectIdInfo = settableBeanProperty.getObjectIdInfo();
        esd<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
        return (objectIdInfo == null && (valueDeserializer == null ? null : valueDeserializer.getObjectIdReader()) == null) ? settableBeanProperty : new ObjectIdReferenceProperty(settableBeanProperty, objectIdInfo);
    }

    public abstract BeanDeserializerBase asArrayDeserializer();

    @Override // defpackage.aj4
    public esd<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        BeanPropertyMap beanPropertyMap;
        BeanPropertyMap beanPropertyMapWithCaseInsensitivity;
        JsonIgnoreProperties.Value valueFindPropertyIgnorals;
        z3h z3hVarFindObjectIdInfo;
        JavaType type;
        SettableBeanProperty settableBeanProperty;
        ObjectIdGenerator<?> objectIdGeneratorObjectIdGeneratorInstance;
        ObjectIdReader objectIdReaderConstruct = this._objectIdReader;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        JsonFormat.Shape shape = null;
        AnnotatedMember member = StdDeserializer._neitherNull(beanProperty, annotationIntrospector) ? beanProperty.getMember() : null;
        if (member != null && (z3hVarFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(member)) != null) {
            z3h z3hVarFindObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, z3hVarFindObjectIdInfo);
            Class<? extends ObjectIdGenerator<?>> clsC = z3hVarFindObjectReferenceInfo.c();
            com.fasterxml.jackson.annotation.a aVarObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, z3hVarFindObjectReferenceInfo);
            if (clsC == ObjectIdGenerators$PropertyGenerator.class) {
                PropertyName propertyNameD = z3hVarFindObjectReferenceInfo.d();
                SettableBeanProperty settableBeanPropertyFindProperty = findProperty(propertyNameD);
                if (settableBeanPropertyFindProperty == null) {
                    deserializationContext.reportBadDefinition(this._beanType, String.format("Invalid Object Id definition for %s: cannot find property with name '%s'", handledType().getName(), propertyNameD));
                }
                type = settableBeanPropertyFindProperty.getType();
                settableBeanProperty = settableBeanPropertyFindProperty;
                objectIdGeneratorObjectIdGeneratorInstance = new PropertyBasedObjectIdGenerator(z3hVarFindObjectReferenceInfo.f());
            } else {
                type = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType((Class<?>) clsC), ObjectIdGenerator.class)[0];
                settableBeanProperty = null;
                objectIdGeneratorObjectIdGeneratorInstance = deserializationContext.objectIdGeneratorInstance(member, z3hVarFindObjectReferenceInfo);
            }
            JavaType javaType = type;
            objectIdReaderConstruct = ObjectIdReader.construct(javaType, z3hVarFindObjectReferenceInfo.d(), objectIdGeneratorObjectIdGeneratorInstance, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty, aVarObjectIdResolverInstance);
        }
        BeanDeserializerBase beanDeserializerBaseWithObjectIdReader = (objectIdReaderConstruct == null || objectIdReaderConstruct == this._objectIdReader) ? this : withObjectIdReader(objectIdReaderConstruct);
        if (member != null && (valueFindPropertyIgnorals = annotationIntrospector.findPropertyIgnorals(member)) != null) {
            Set<String> setFindIgnoredForDeserialization = valueFindPropertyIgnorals.findIgnoredForDeserialization();
            if (!setFindIgnoredForDeserialization.isEmpty()) {
                Set<String> set = beanDeserializerBaseWithObjectIdReader._ignorableProps;
                if (set != null && !set.isEmpty()) {
                    HashSet hashSet = new HashSet(setFindIgnoredForDeserialization);
                    hashSet.addAll(set);
                    setFindIgnoredForDeserialization = hashSet;
                }
                beanDeserializerBaseWithObjectIdReader = beanDeserializerBaseWithObjectIdReader.withIgnorableProperties(setFindIgnoredForDeserialization);
            }
        }
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
        if (valueFindFormatOverrides != null) {
            shape = valueFindFormatOverrides.hasShape() ? valueFindFormatOverrides.getShape() : null;
            Boolean feature = valueFindFormatOverrides.getFeature(JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
            if (feature != null && (beanPropertyMapWithCaseInsensitivity = (beanPropertyMap = this._beanProperties).withCaseInsensitivity(feature.booleanValue())) != beanPropertyMap) {
                beanDeserializerBaseWithObjectIdReader = beanDeserializerBaseWithObjectIdReader.withBeanProperties(beanPropertyMapWithCaseInsensitivity);
            }
        }
        if (shape == null) {
            shape = this._serializationShape;
        }
        return shape == JsonFormat.Shape.ARRAY ? beanDeserializerBaseWithObjectIdReader.asArrayDeserializer() : beanDeserializerBaseWithObjectIdReader;
    }

    public Iterator<SettableBeanProperty> creatorProperties() {
        ldi ldiVar = this._propertyBasedCreator;
        return ldiVar == null ? Collections.emptyList().iterator() : ldiVar.f().iterator();
    }

    public Object deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        esd<Object> esdVar = this._arrayDelegateDeserializer;
        if (esdVar != null || (esdVar = this._delegateDeserializer) != null) {
            Object objCreateUsingArrayDelegate = this._valueInstantiator.createUsingArrayDelegate(deserializationContext, esdVar.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingArrayDelegate);
            }
            return objCreateUsingArrayDelegate;
        }
        if (!deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
            }
            if (jsonParser.G0() == JsonToken.END_ARRAY) {
                return null;
            }
            return deserializationContext.handleUnexpectedToken(handledType(), JsonToken.START_ARRAY, jsonParser, null, new Object[0]);
        }
        JsonToken jsonTokenG0 = jsonParser.G0();
        JsonToken jsonToken = JsonToken.END_ARRAY;
        if (jsonTokenG0 == jsonToken && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
            return null;
        }
        Object objDeserialize = deserialize(jsonParser, deserializationContext);
        if (jsonParser.G0() != jsonToken) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
        return objDeserialize;
    }

    public Object deserializeFromBoolean(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        esd<Object> esdVar_delegateDeserializer = _delegateDeserializer();
        if (esdVar_delegateDeserializer == null || this._valueInstantiator.canCreateFromBoolean()) {
            return this._valueInstantiator.createFromBoolean(deserializationContext, jsonParser.K() == JsonToken.VALUE_TRUE);
        }
        Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, esdVar_delegateDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDelegate);
        }
        return objCreateUsingDelegate;
    }

    public Object deserializeFromDouble(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonParser.NumberType numberTypeT = jsonParser.T();
        if (numberTypeT != JsonParser.NumberType.DOUBLE && numberTypeT != JsonParser.NumberType.FLOAT) {
            esd<Object> esdVar_delegateDeserializer = _delegateDeserializer();
            return esdVar_delegateDeserializer != null ? this._valueInstantiator.createUsingDelegate(deserializationContext, esdVar_delegateDeserializer.deserialize(jsonParser, deserializationContext)) : deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.U());
        }
        esd<Object> esdVar_delegateDeserializer2 = _delegateDeserializer();
        if (esdVar_delegateDeserializer2 == null || this._valueInstantiator.canCreateFromDouble()) {
            return this._valueInstantiator.createFromDouble(deserializationContext, jsonParser.O());
        }
        Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, esdVar_delegateDeserializer2.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDelegate);
        }
        return objCreateUsingDelegate;
    }

    public Object deserializeFromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        esd<Object> esdVar_delegateDeserializer = _delegateDeserializer();
        if (esdVar_delegateDeserializer == null || this._valueInstantiator.canCreateFromString()) {
            Object objP = jsonParser.P();
            return (objP == null || this._beanType.isTypeOrSuperTypeOf(objP.getClass())) ? objP : deserializationContext.handleWeirdNativeValue(this._beanType, objP, jsonParser);
        }
        Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, esdVar_delegateDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDelegate);
        }
        return objCreateUsingDelegate;
    }

    public Object deserializeFromNumber(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        esd<Object> esdVar_delegateDeserializer = _delegateDeserializer();
        JsonParser.NumberType numberTypeT = jsonParser.T();
        if (numberTypeT == JsonParser.NumberType.INT) {
            if (esdVar_delegateDeserializer == null || this._valueInstantiator.canCreateFromInt()) {
                return this._valueInstantiator.createFromInt(deserializationContext, jsonParser.R());
            }
            Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, esdVar_delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate);
            }
            return objCreateUsingDelegate;
        }
        if (numberTypeT != JsonParser.NumberType.LONG) {
            if (esdVar_delegateDeserializer == null) {
                return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.U());
            }
            Object objCreateUsingDelegate2 = this._valueInstantiator.createUsingDelegate(deserializationContext, esdVar_delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate2);
            }
            return objCreateUsingDelegate2;
        }
        if (esdVar_delegateDeserializer == null || this._valueInstantiator.canCreateFromInt()) {
            return this._valueInstantiator.createFromLong(deserializationContext, jsonParser.S());
        }
        Object objCreateUsingDelegate3 = this._valueInstantiator.createUsingDelegate(deserializationContext, esdVar_delegateDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDelegate3);
        }
        return objCreateUsingDelegate3;
    }

    public abstract Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public Object deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objectReference = this._objectIdReader.readObjectReference(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this._objectIdReader;
        com.fasterxml.jackson.databind.deser.impl.a aVarFindObjectId = deserializationContext.findObjectId(objectReference, objectIdReader.generator, objectIdReader.resolver);
        Object objF = aVarFindObjectId.f();
        if (objF != null) {
            return objF;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + objectReference + "] (for " + this._beanType + ").", jsonParser.E(), aVarFindObjectId);
    }

    public Object deserializeFromObjectUsingNonDefault(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        esd<Object> esdVar_delegateDeserializer = _delegateDeserializer();
        if (esdVar_delegateDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, esdVar_delegateDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        Class<?> rawClass = this._beanType.getRawClass();
        return h04.P(rawClass) ? deserializationContext.handleMissingInstantiator(rawClass, null, jsonParser, "can only instantiate non-static inner class by using default, no-argument constructor", new Object[0]) : deserializationContext.handleMissingInstantiator(rawClass, getValueInstantiator(), jsonParser, "cannot deserialize from Object value (no delegate- or property-based Creator)", new Object[0]);
    }

    public Object deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        esd<Object> esdVar_delegateDeserializer = _delegateDeserializer();
        if (esdVar_delegateDeserializer == null || this._valueInstantiator.canCreateFromString()) {
            return this._valueInstantiator.createFromString(deserializationContext, jsonParser.d0());
        }
        Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, esdVar_delegateDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDelegate);
        }
        return objCreateUsingDelegate;
    }

    public Object deserializeWithObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializeFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        Object objZ;
        if (this._objectIdReader != null) {
            if (jsonParser.c() && (objZ = jsonParser.Z()) != null) {
                return _handleTypedObjectId(jsonParser, deserializationContext, q4qVar.deserializeTypedFromObject(jsonParser, deserializationContext), objZ);
            }
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK != null) {
                if (jsonTokenK.isScalarValue()) {
                    return deserializeFromObjectId(jsonParser, deserializationContext);
                }
                if (jsonTokenK == JsonToken.START_OBJECT) {
                    jsonTokenK = jsonParser.G0();
                }
                if (jsonTokenK == JsonToken.FIELD_NAME && this._objectIdReader.maySerializeAsObject() && this._objectIdReader.isValidReferencePropertyName(jsonParser.J(), jsonParser)) {
                    return deserializeFromObjectId(jsonParser, deserializationContext);
                }
            }
        }
        return q4qVar.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // defpackage.esd
    public SettableBeanProperty findBackReference(String str) {
        Map<String, SettableBeanProperty> map = this._backRefs;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public esd<Object> findConvertingDeserializer(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        Object objFindDeserializationConverter;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindDeserializationConverter = annotationIntrospector.findDeserializationConverter(settableBeanProperty.getMember())) == null) {
            return null;
        }
        ak4<Object, Object> ak4VarConverterInstance = deserializationContext.converterInstance(settableBeanProperty.getMember(), objFindDeserializationConverter);
        JavaType javaTypeA = ak4VarConverterInstance.a(deserializationContext.getTypeFactory());
        return new StdDelegatingDeserializer(ak4VarConverterInstance, javaTypeA, deserializationContext.findNonContextualValueDeserializer(javaTypeA));
    }

    public SettableBeanProperty findProperty(PropertyName propertyName) {
        return findProperty(propertyName.getSimpleName());
    }

    @Deprecated
    public final Class<?> getBeanClass() {
        return this._beanType.getRawClass();
    }

    @Override // defpackage.esd
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // defpackage.esd
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        try {
            return this._valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e) {
            return h04.c0(deserializationContext, e);
        }
    }

    @Override // defpackage.esd
    public Collection<Object> getKnownPropertyNames() {
        ArrayList arrayList = new ArrayList();
        Iterator<SettableBeanProperty> it = this._beanProperties.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return arrayList;
    }

    @Override // defpackage.esd
    public AccessPattern getNullAccessPattern() {
        return AccessPattern.ALWAYS_NULL;
    }

    @Override // defpackage.esd
    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    public int getPropertyCount() {
        return this._beanProperties.size();
    }

    public b getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._beanType;
    }

    public void handleIgnoredProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)) {
            throw IgnoredPropertyException.from(jsonParser, obj, str, getKnownPropertyNames());
        }
        jsonParser.O0();
    }

    public Object handlePolymorphic(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, bip bipVar) throws IOException {
        esd<Object> esdVar_findSubclassDeserializer = _findSubclassDeserializer(deserializationContext, obj, bipVar);
        if (esdVar_findSubclassDeserializer == null) {
            if (bipVar != null) {
                obj = handleUnknownProperties(deserializationContext, obj, bipVar);
            }
            return jsonParser != null ? deserialize(jsonParser, deserializationContext, obj) : obj;
        }
        if (bipVar != null) {
            bipVar.m0();
            JsonParser jsonParserF1 = bipVar.f1();
            jsonParserF1.G0();
            obj = esdVar_findSubclassDeserializer.deserialize(jsonParserF1, deserializationContext, obj);
        }
        return jsonParser != null ? esdVar_findSubclassDeserializer.deserialize(jsonParser, deserializationContext, obj) : obj;
    }

    public Object handleUnknownProperties(DeserializationContext deserializationContext, Object obj, bip bipVar) throws IOException {
        bipVar.m0();
        JsonParser jsonParserF1 = bipVar.f1();
        while (jsonParserF1.G0() != JsonToken.END_OBJECT) {
            String strJ = jsonParserF1.J();
            jsonParserF1.G0();
            handleUnknownProperty(jsonParserF1, deserializationContext, obj, strJ);
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (this._ignoreAllUnknown) {
            jsonParser.O0();
            return;
        }
        Set<String> set = this._ignorableProps;
        if (set != null && set.contains(str)) {
            handleIgnoredProperty(jsonParser, deserializationContext, obj, str);
        }
        super.handleUnknownProperty(jsonParser, deserializationContext, obj, str);
    }

    public void handleUnknownVanilla(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        Set<String> set = this._ignorableProps;
        if (set != null && set.contains(str)) {
            handleIgnoredProperty(jsonParser, deserializationContext, obj, str);
            return;
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty == null) {
            handleUnknownProperty(jsonParser, deserializationContext, obj, str);
            return;
        }
        try {
            settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, str);
        } catch (Exception e) {
            wrapAndThrow(e, obj, str, deserializationContext);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Class<?> handledType() {
        return this._beanType.getRawClass();
    }

    public boolean hasProperty(String str) {
        return this._beanProperties.find(str) != null;
    }

    public boolean hasViews() {
        return this._needViewProcesing;
    }

    public void injectValues(DeserializationContext deserializationContext, Object obj) throws IOException {
        for (ValueInjector valueInjector : this._injectables) {
            valueInjector.inject(deserializationContext, obj);
        }
    }

    @Override // defpackage.esd
    public boolean isCachable() {
        return true;
    }

    public Iterator<SettableBeanProperty> properties() {
        BeanPropertyMap beanPropertyMap = this._beanProperties;
        if (beanPropertyMap != null) {
            return beanPropertyMap.iterator();
        }
        throw new IllegalStateException("Can only call after BeanDeserializer has been resolved");
    }

    public void replaceProperty(SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        this._beanProperties.replace(settableBeanProperty, settableBeanProperty2);
    }

    @Override // defpackage.bqk
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        SettableBeanProperty[] fromObjectArguments;
        esd<Object> valueDeserializer;
        esd<Object> esdVarUnwrappingDeserializer;
        boolean z = false;
        pk8.a aVarD = null;
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            fromObjectArguments = this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            if (this._ignorableProps != null) {
                int length = fromObjectArguments.length;
                for (int i = 0; i < length; i++) {
                    if (this._ignorableProps.contains(fromObjectArguments[i].getName())) {
                        fromObjectArguments[i].markAsIgnorable();
                    }
                }
            }
        } else {
            fromObjectArguments = null;
        }
        for (SettableBeanProperty settableBeanProperty : this._beanProperties) {
            if (!settableBeanProperty.hasValueDeserializer()) {
                esd<Object> esdVarFindConvertingDeserializer = findConvertingDeserializer(deserializationContext, settableBeanProperty);
                if (esdVarFindConvertingDeserializer == null) {
                    esdVarFindConvertingDeserializer = deserializationContext.findNonContextualValueDeserializer(settableBeanProperty.getType());
                }
                _replaceProperty(this._beanProperties, fromObjectArguments, settableBeanProperty, settableBeanProperty.withValueDeserializer(esdVarFindConvertingDeserializer));
            }
        }
        qbq qbqVar = null;
        for (SettableBeanProperty settableBeanProperty2 : this._beanProperties) {
            SettableBeanProperty settableBeanProperty_resolveManagedReferenceProperty = _resolveManagedReferenceProperty(deserializationContext, settableBeanProperty2.withValueDeserializer(deserializationContext.handlePrimaryContextualization(settableBeanProperty2.getValueDeserializer(), settableBeanProperty2, settableBeanProperty2.getType())));
            if (!(settableBeanProperty_resolveManagedReferenceProperty instanceof ManagedReferenceProperty)) {
                settableBeanProperty_resolveManagedReferenceProperty = _resolvedObjectIdProperty(deserializationContext, settableBeanProperty_resolveManagedReferenceProperty);
            }
            NameTransformer nameTransformer_findPropertyUnwrapper = _findPropertyUnwrapper(deserializationContext, settableBeanProperty_resolveManagedReferenceProperty);
            if (nameTransformer_findPropertyUnwrapper == null || (esdVarUnwrappingDeserializer = (valueDeserializer = settableBeanProperty_resolveManagedReferenceProperty.getValueDeserializer()).unwrappingDeserializer(nameTransformer_findPropertyUnwrapper)) == valueDeserializer || esdVarUnwrappingDeserializer == null) {
                SettableBeanProperty settableBeanProperty_resolveInnerClassValuedProperty = _resolveInnerClassValuedProperty(deserializationContext, _resolveMergeAndNullSettings(deserializationContext, settableBeanProperty_resolveManagedReferenceProperty, settableBeanProperty_resolveManagedReferenceProperty.getMetadata()));
                if (settableBeanProperty_resolveInnerClassValuedProperty != settableBeanProperty2) {
                    _replaceProperty(this._beanProperties, fromObjectArguments, settableBeanProperty2, settableBeanProperty_resolveInnerClassValuedProperty);
                }
                if (settableBeanProperty_resolveInnerClassValuedProperty.hasValueTypeDeserializer()) {
                    q4q valueTypeDeserializer = settableBeanProperty_resolveInnerClassValuedProperty.getValueTypeDeserializer();
                    if (valueTypeDeserializer.getTypeInclusion() == JsonTypeInfo.As.EXTERNAL_PROPERTY) {
                        if (aVarD == null) {
                            aVarD = pk8.d(this._beanType);
                        }
                        aVarD.b(settableBeanProperty_resolveInnerClassValuedProperty, valueTypeDeserializer);
                        this._beanProperties.remove(settableBeanProperty_resolveInnerClassValuedProperty);
                    }
                }
            } else {
                SettableBeanProperty settableBeanPropertyWithValueDeserializer = settableBeanProperty_resolveManagedReferenceProperty.withValueDeserializer(esdVarUnwrappingDeserializer);
                if (qbqVar == null) {
                    qbqVar = new qbq();
                }
                qbqVar.a(settableBeanPropertyWithValueDeserializer);
                this._beanProperties.remove(settableBeanPropertyWithValueDeserializer);
            }
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty != null && !settableAnyProperty.hasValueDeserializer()) {
            SettableAnyProperty settableAnyProperty2 = this._anySetter;
            this._anySetter = settableAnyProperty2.withValueDeserializer(findDeserializer(deserializationContext, settableAnyProperty2.getType(), this._anySetter.getProperty()));
        }
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._beanType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this._valueInstantiator.getClass().getName()));
            }
            this._delegateDeserializer = _findDelegateDeserializer(deserializationContext, delegateType, this._valueInstantiator.getDelegateCreator());
        }
        if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._beanType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this._valueInstantiator.getClass().getName()));
            }
            this._arrayDelegateDeserializer = _findDelegateDeserializer(deserializationContext, arrayDelegateType, this._valueInstantiator.getArrayDelegateCreator());
        }
        if (fromObjectArguments != null) {
            this._propertyBasedCreator = ldi.b(deserializationContext, this._valueInstantiator, fromObjectArguments, this._beanProperties);
        }
        if (aVarD != null) {
            this._externalTypeIdHandler = aVarD.c(this._beanProperties);
            this._nonStandardCreation = true;
        }
        this._unwrappedPropertyHandler = qbqVar;
        if (qbqVar != null) {
            this._nonStandardCreation = true;
        }
        if (this._vanillaProcessing && !this._nonStandardCreation) {
            z = true;
        }
        this._vanillaProcessing = z;
    }

    @Override // defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    @Override // defpackage.esd
    public abstract esd<Object> unwrappingDeserializer(NameTransformer nameTransformer);

    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        throw new UnsupportedOperationException("Class " + getClass().getName() + " does not override `withBeanProperties()`, needs to");
    }

    public abstract BeanDeserializerBase withIgnorableProperties(Set<String> set);

    public abstract BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader);

    public void wrapAndThrow(Throwable th, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(th, deserializationContext), obj, str);
    }

    public Object wrapInstantiationProblem(Throwable th, DeserializationContext deserializationContext) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        h04.d0(th);
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            h04.f0(th);
        }
        return deserializationContext.handleInstantiationProblem(this._beanType.getRawClass(), null, th);
    }

    public SettableBeanProperty findProperty(String str) {
        ldi ldiVar;
        BeanPropertyMap beanPropertyMap = this._beanProperties;
        SettableBeanProperty settableBeanPropertyFind = beanPropertyMap == null ? null : beanPropertyMap.find(str);
        return (settableBeanPropertyFind != null || (ldiVar = this._propertyBasedCreator) == null) ? settableBeanPropertyFind : ldiVar.e(str);
    }

    public SettableBeanProperty findProperty(int i) {
        ldi ldiVar;
        BeanPropertyMap beanPropertyMap = this._beanProperties;
        SettableBeanProperty settableBeanPropertyFind = beanPropertyMap == null ? null : beanPropertyMap.find(i);
        return (settableBeanPropertyFind != null || (ldiVar = this._propertyBasedCreator) == null) ? settableBeanPropertyFind : ldiVar.d(i);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase) {
        this(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = beanDeserializerBase._beanProperties;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = z;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = nameTransformer != null || beanDeserializerBase._ignoreAllUnknown;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        qbq qbqVarC = beanDeserializerBase._unwrappedPropertyHandler;
        if (nameTransformer != null) {
            qbqVarC = qbqVarC != null ? qbqVarC.c(nameTransformer) : qbqVarC;
            this._beanProperties = beanDeserializerBase._beanProperties.renameAll(nameTransformer);
        } else {
            this._beanProperties = beanDeserializerBase._beanProperties;
        }
        this._unwrappedPropertyHandler = qbqVarC;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = false;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._objectIdReader = objectIdReader;
        if (objectIdReader == null) {
            this._beanProperties = beanDeserializerBase._beanProperties;
            this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        } else {
            this._beanProperties = beanDeserializerBase._beanProperties.withProperty(new ObjectIdValueProperty(objectIdReader, PropertyMetadata.STD_REQUIRED));
            this._vanillaProcessing = false;
        }
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = set;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._beanProperties = beanDeserializerBase._beanProperties.withoutProperties(set);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = beanPropertyMap;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
    }
}
