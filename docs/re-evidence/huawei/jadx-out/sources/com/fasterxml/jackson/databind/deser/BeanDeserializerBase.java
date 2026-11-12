package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.aad;
import defpackage.aaf;
import defpackage.aag;
import defpackage.aah;
import defpackage.aaj;
import defpackage.aak;
import defpackage.aam;
import defpackage.aan;
import defpackage.aaq;
import defpackage.abi;
import defpackage.abr;
import defpackage.acv;
import defpackage.ahd;
import defpackage.ahw;
import defpackage.ahy;
import defpackage.aii;
import defpackage.wr;
import defpackage.yi;
import defpackage.ym;
import defpackage.yq;
import defpackage.ys;
import defpackage.zh;
import defpackage.zi;
import defpackage.zj;
import defpackage.zm;
import defpackage.zr;
import defpackage.zu;
import defpackage.zv;
import defpackage.zy;
import defpackage.zz;
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

/* JADX INFO: loaded from: classes21.dex */
public abstract class BeanDeserializerBase extends StdDeserializer<Object> implements ContextualDeserializer, ResolvableDeserializer, ValueInstantiator.Gettable, Serializable {
    protected static final ys TEMP_PROPERTY_NAME = new ys("#temporary-name");
    private static final long serialVersionUID = 1;
    protected zj _anySetter;
    protected JsonDeserializer<Object> _arrayDelegateDeserializer;
    protected final Map<String, SettableBeanProperty> _backRefs;
    protected final zr _beanProperties;
    protected final JavaType _beanType;
    protected JsonDeserializer<Object> _delegateDeserializer;
    protected zu _externalTypeIdHandler;
    protected final Set<String> _ignorableProps;
    public final boolean _ignoreAllUnknown;
    protected final Set<String> _includableProps;
    protected final aan[] _injectables;
    protected final boolean _needViewProcesing;
    protected boolean _nonStandardCreation;
    protected final aah _objectIdReader;
    protected aag _propertyBasedCreator;
    protected final JsonFormat.Shape _serializationShape;
    protected transient HashMap<ahd, JsonDeserializer<Object>> _subDeserializers;
    protected aaq _unwrappedPropertyHandler;
    protected final ValueInstantiator _valueInstantiator;
    protected boolean _vanillaProcessing;

    protected abstract Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    protected abstract BeanDeserializerBase asArrayDeserializer();

    public abstract Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public abstract JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer);

    public abstract BeanDeserializerBase withByNameInclusion(Set<String> set, Set<String> set2);

    public abstract BeanDeserializerBase withIgnoreAllUnknown(boolean z);

    public abstract BeanDeserializerBase withObjectIdReader(aah aahVar);

    public BeanDeserializerBase(zi ziVar, BeanDescription beanDescription, zr zrVar, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, Set<String> set2, boolean z2) {
        super(beanDescription.getType());
        this._beanType = beanDescription.getType();
        ValueInstantiator valueInstantiatorH = ziVar.h();
        this._valueInstantiator = valueInstantiatorH;
        this._delegateDeserializer = null;
        this._arrayDelegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._beanProperties = zrVar;
        this._backRefs = map;
        this._ignorableProps = set;
        this._ignoreAllUnknown = z;
        this._includableProps = set2;
        this._anySetter = ziVar.d();
        List<aan> listJ = ziVar.j();
        aan[] aanVarArr = (listJ == null || listJ.isEmpty()) ? null : (aan[]) listJ.toArray(new aan[listJ.size()]);
        this._injectables = aanVarArr;
        aah aahVarI = ziVar.i();
        this._objectIdReader = aahVarI;
        this._nonStandardCreation = this._unwrappedPropertyHandler != null || valueInstantiatorH.canCreateUsingDelegate() || valueInstantiatorH.canCreateFromObjectWith() || !valueInstantiatorH.canCreateUsingDefault();
        this._serializationShape = beanDescription.findExpectedFormat(null).b();
        this._needViewProcesing = z2;
        this._vanillaProcessing = !this._nonStandardCreation && aanVarArr == null && !z2 && aahVarI == null;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase) {
        this(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = beanDeserializerBase._beanProperties;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = z;
        this._includableProps = beanDeserializerBase._includableProps;
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
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = nameTransformer != null || beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        aaq aaqVarC = beanDeserializerBase._unwrappedPropertyHandler;
        if (nameTransformer != null) {
            aaqVarC = aaqVarC != null ? aaqVarC.c(nameTransformer) : aaqVarC;
            this._beanProperties = beanDeserializerBase._beanProperties.e(nameTransformer);
        } else {
            this._beanProperties = beanDeserializerBase._beanProperties;
        }
        this._unwrappedPropertyHandler = aaqVarC;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = false;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, aah aahVar) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._objectIdReader = aahVar;
        if (aahVar == null) {
            this._beanProperties = beanDeserializerBase._beanProperties;
            this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        } else {
            this._beanProperties = beanDeserializerBase._beanProperties.d(new aaf(aahVar, yq.d));
            this._vanillaProcessing = false;
        }
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, Set<String> set, Set<String> set2) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = set;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = set2;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._beanProperties = beanDeserializerBase._beanProperties.a(set, set2);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, zr zrVar) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = zrVar;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
    }

    @Deprecated
    protected BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        this(beanDeserializerBase, set, beanDeserializerBase._includableProps);
    }

    public BeanDeserializerBase withBeanProperties(zr zrVar) {
        throw new UnsupportedOperationException("Class " + getClass().getName() + " does not override `withBeanProperties()`, needs to");
    }

    @Deprecated
    public BeanDeserializerBase withIgnorableProperties(Set<String> set) {
        return withByNameInclusion(set, this._includableProps);
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(DeserializationContext deserializationContext) throws ym {
        SettableBeanProperty[] fromObjectArguments;
        JsonDeserializer<Object> valueDeserializer;
        JsonDeserializer<Object> jsonDeserializerUnwrappingDeserializer;
        boolean z = false;
        zu.a aVarC = null;
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            fromObjectArguments = this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            if (this._ignorableProps != null || this._includableProps != null) {
                int length = fromObjectArguments.length;
                for (int i = 0; i < length; i++) {
                    if (ahy.b(fromObjectArguments[i].getName(), this._ignorableProps, this._includableProps)) {
                        fromObjectArguments[i].markAsIgnorable();
                    }
                }
            }
        } else {
            fromObjectArguments = null;
        }
        for (SettableBeanProperty settableBeanProperty : this._beanProperties) {
            if (!settableBeanProperty.hasValueDeserializer()) {
                JsonDeserializer<Object> jsonDeserializerFindConvertingDeserializer = findConvertingDeserializer(deserializationContext, settableBeanProperty);
                if (jsonDeserializerFindConvertingDeserializer == null) {
                    jsonDeserializerFindConvertingDeserializer = deserializationContext.findNonContextualValueDeserializer(settableBeanProperty.getType());
                }
                _replaceProperty(this._beanProperties, fromObjectArguments, settableBeanProperty, settableBeanProperty.withValueDeserializer(jsonDeserializerFindConvertingDeserializer));
            }
        }
        aaq aaqVar = null;
        for (SettableBeanProperty settableBeanProperty2 : this._beanProperties) {
            SettableBeanProperty settableBeanProperty_resolveManagedReferenceProperty = _resolveManagedReferenceProperty(deserializationContext, settableBeanProperty2.withValueDeserializer(deserializationContext.handlePrimaryContextualization(settableBeanProperty2.getValueDeserializer(), settableBeanProperty2, settableBeanProperty2.getType())));
            if (!(settableBeanProperty_resolveManagedReferenceProperty instanceof zy)) {
                settableBeanProperty_resolveManagedReferenceProperty = _resolvedObjectIdProperty(deserializationContext, settableBeanProperty_resolveManagedReferenceProperty);
            }
            NameTransformer nameTransformer_findPropertyUnwrapper = _findPropertyUnwrapper(deserializationContext, settableBeanProperty_resolveManagedReferenceProperty);
            if (nameTransformer_findPropertyUnwrapper != null && (jsonDeserializerUnwrappingDeserializer = (valueDeserializer = settableBeanProperty_resolveManagedReferenceProperty.getValueDeserializer()).unwrappingDeserializer(nameTransformer_findPropertyUnwrapper)) != valueDeserializer && jsonDeserializerUnwrappingDeserializer != null) {
                SettableBeanProperty settableBeanPropertyWithValueDeserializer = settableBeanProperty_resolveManagedReferenceProperty.withValueDeserializer(jsonDeserializerUnwrappingDeserializer);
                if (aaqVar == null) {
                    aaqVar = new aaq();
                }
                aaqVar.e(settableBeanPropertyWithValueDeserializer);
                this._beanProperties.e(settableBeanPropertyWithValueDeserializer);
            } else {
                SettableBeanProperty settableBeanProperty_resolveInnerClassValuedProperty = _resolveInnerClassValuedProperty(deserializationContext, _resolveMergeAndNullSettings(deserializationContext, settableBeanProperty_resolveManagedReferenceProperty, settableBeanProperty_resolveManagedReferenceProperty.getMetadata()));
                if (settableBeanProperty_resolveInnerClassValuedProperty != settableBeanProperty2) {
                    _replaceProperty(this._beanProperties, fromObjectArguments, settableBeanProperty2, settableBeanProperty_resolveInnerClassValuedProperty);
                }
                if (settableBeanProperty_resolveInnerClassValuedProperty.hasValueTypeDeserializer()) {
                    TypeDeserializer valueTypeDeserializer = settableBeanProperty_resolveInnerClassValuedProperty.getValueTypeDeserializer();
                    if (valueTypeDeserializer.getTypeInclusion() == JsonTypeInfo.As.EXTERNAL_PROPERTY) {
                        if (aVarC == null) {
                            aVarC = zu.c(this._beanType);
                        }
                        aVarC.c(settableBeanProperty_resolveInnerClassValuedProperty, valueTypeDeserializer);
                        this._beanProperties.e(settableBeanProperty_resolveInnerClassValuedProperty);
                    }
                }
            }
        }
        zj zjVar = this._anySetter;
        if (zjVar != null && !zjVar.a()) {
            zj zjVar2 = this._anySetter;
            this._anySetter = zjVar2.c(findDeserializer(deserializationContext, zjVar2.b(), this._anySetter.c()));
        }
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._beanType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", ahw.a(javaType), ahw.b(this._valueInstantiator)));
            }
            this._delegateDeserializer = _findDelegateDeserializer(deserializationContext, delegateType, this._valueInstantiator.getDelegateCreator());
        }
        if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._beanType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", ahw.a(javaType2), ahw.b(this._valueInstantiator)));
            }
            this._arrayDelegateDeserializer = _findDelegateDeserializer(deserializationContext, arrayDelegateType, this._valueInstantiator.getArrayDelegateCreator());
        }
        if (fromObjectArguments != null) {
            this._propertyBasedCreator = aag.c(deserializationContext, this._valueInstantiator, fromObjectArguments, this._beanProperties);
        }
        if (aVarC != null) {
            this._externalTypeIdHandler = aVarC.e(this._beanProperties);
            this._nonStandardCreation = true;
        }
        this._unwrappedPropertyHandler = aaqVar;
        if (aaqVar != null) {
            this._nonStandardCreation = true;
        }
        if (this._vanillaProcessing && !this._nonStandardCreation) {
            z = true;
        }
        this._vanillaProcessing = z;
    }

    protected void _replaceProperty(zr zrVar, SettableBeanProperty[] settableBeanPropertyArr, SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        zrVar.b(settableBeanProperty, settableBeanProperty2);
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

    private JsonDeserializer<Object> _findDelegateDeserializer(DeserializationContext deserializationContext, JavaType javaType, AnnotatedWithParams annotatedWithParams) throws ym {
        JsonDeserializer<?> jsonDeserializerHandleSecondaryContextualization;
        BeanProperty.d dVar = new BeanProperty.d(TEMP_PROPERTY_NAME, javaType, null, annotatedWithParams, yq.f53745a);
        TypeDeserializer typeDeserializerA = (TypeDeserializer) javaType.getTypeHandler();
        if (typeDeserializerA == null) {
            typeDeserializerA = deserializationContext.getConfig().a(javaType);
        }
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) javaType.getValueHandler();
        if (jsonDeserializer == null) {
            jsonDeserializerHandleSecondaryContextualization = findDeserializer(deserializationContext, javaType, dVar);
        } else {
            jsonDeserializerHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(jsonDeserializer, dVar, javaType);
        }
        return typeDeserializerA != null ? new aaj(typeDeserializerA.forProperty(dVar), jsonDeserializerHandleSecondaryContextualization) : jsonDeserializerHandleSecondaryContextualization;
    }

    protected JsonDeserializer<Object> findConvertingDeserializer(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws ym {
        Object objFindDeserializationConverter;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindDeserializationConverter = annotationIntrospector.findDeserializationConverter(settableBeanProperty.getMember())) == null) {
            return null;
        }
        Converter<Object, Object> converterConverterInstance = deserializationContext.converterInstance(settableBeanProperty.getMember(), objFindDeserializationConverter);
        JavaType inputType = converterConverterInstance.getInputType(deserializationContext.getTypeFactory());
        return new abi(converterConverterInstance, inputType, deserializationContext.findNonContextualValueDeserializer(inputType));
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
        zr zrVar;
        zr zrVarA;
        acv acvVarFindObjectIdInfo;
        JavaType type;
        SettableBeanProperty settableBeanProperty;
        ObjectIdGenerator<?> objectIdGeneratorObjectIdGeneratorInstance;
        aah aahVarA = this._objectIdReader;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        JsonFormat.Shape shapeB = null;
        AnnotatedMember member = _neitherNull(beanProperty, annotationIntrospector) ? beanProperty.getMember() : null;
        if (member != null && (acvVarFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(member)) != null) {
            acv acvVarFindObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, acvVarFindObjectIdInfo);
            Class<? extends ObjectIdGenerator<?>> clsE = acvVarFindObjectReferenceInfo.e();
            ObjectIdResolver objectIdResolverObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, acvVarFindObjectReferenceInfo);
            if (clsE == ObjectIdGenerators.PropertyGenerator.class) {
                ys ysVarC = acvVarFindObjectReferenceInfo.c();
                SettableBeanProperty settableBeanPropertyFindProperty = findProperty(ysVarC);
                if (settableBeanPropertyFindProperty == null) {
                    deserializationContext.reportBadDefinition(this._beanType, String.format("Invalid Object Id definition for %s: cannot find property with name %s", ahw.u(handledType()), ahw.e(ysVarC)));
                }
                type = settableBeanPropertyFindProperty.getType();
                settableBeanProperty = settableBeanPropertyFindProperty;
                objectIdGeneratorObjectIdGeneratorInstance = new aak(acvVarFindObjectReferenceInfo.f());
            } else {
                type = deserializationContext.getTypeFactory().a(deserializationContext.constructType((Class<?>) clsE), ObjectIdGenerator.class)[0];
                settableBeanProperty = null;
                objectIdGeneratorObjectIdGeneratorInstance = deserializationContext.objectIdGeneratorInstance(member, acvVarFindObjectReferenceInfo);
            }
            JavaType javaType = type;
            aahVarA = aah.a(javaType, acvVarFindObjectReferenceInfo.c(), objectIdGeneratorObjectIdGeneratorInstance, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty, objectIdResolverObjectIdResolverInstance);
        }
        BeanDeserializerBase beanDeserializerBaseWithObjectIdReader = (aahVarA == null || aahVarA == this._objectIdReader) ? this : withObjectIdReader(aahVarA);
        if (member != null) {
            beanDeserializerBaseWithObjectIdReader = _handleByNameInclusion(deserializationContext, annotationIntrospector, beanDeserializerBaseWithObjectIdReader, member);
        }
        JsonFormat.c cVarFindFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
        if (cVarFindFormatOverrides != null) {
            shapeB = cVarFindFormatOverrides.g() ? cVarFindFormatOverrides.b() : null;
            Boolean boolA = cVarFindFormatOverrides.a(JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
            if (boolA != null && (zrVarA = (zrVar = this._beanProperties).a(boolA.booleanValue())) != zrVar) {
                beanDeserializerBaseWithObjectIdReader = beanDeserializerBaseWithObjectIdReader.withBeanProperties(zrVarA);
            }
        }
        if (shapeB == null) {
            shapeB = this._serializationShape;
        }
        return shapeB == JsonFormat.Shape.ARRAY ? beanDeserializerBaseWithObjectIdReader.asArrayDeserializer() : beanDeserializerBaseWithObjectIdReader;
    }

    protected BeanDeserializerBase _handleByNameInclusion(DeserializationContext deserializationContext, AnnotationIntrospector annotationIntrospector, BeanDeserializerBase beanDeserializerBase, AnnotatedMember annotatedMember) throws ym {
        yi config = deserializationContext.getConfig();
        JsonIgnoreProperties.b bVarFindPropertyIgnoralByName = annotationIntrospector.findPropertyIgnoralByName(config, annotatedMember);
        if (bVarFindPropertyIgnoralByName.d() && !this._ignoreAllUnknown) {
            beanDeserializerBase = beanDeserializerBase.withIgnoreAllUnknown(true);
        }
        Set<String> setB = bVarFindPropertyIgnoralByName.b();
        Set<String> set = beanDeserializerBase._ignorableProps;
        if (setB.isEmpty()) {
            setB = set;
        } else if (set != null && !set.isEmpty()) {
            HashSet hashSet = new HashSet(set);
            hashSet.addAll(setB);
            setB = hashSet;
        }
        Set<String> set2 = beanDeserializerBase._includableProps;
        Set<String> setE = ahy.e(set2, annotationIntrospector.findPropertyInclusionByName(config, annotatedMember).b());
        return (setB == set && setE == set2) ? beanDeserializerBase : beanDeserializerBase.withByNameInclusion(setB, setE);
    }

    protected SettableBeanProperty _resolveManagedReferenceProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws ym {
        String managedReferenceName = settableBeanProperty.getManagedReferenceName();
        if (managedReferenceName == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty settableBeanPropertyFindBackReference = settableBeanProperty.getValueDeserializer().findBackReference(managedReferenceName);
        if (settableBeanPropertyFindBackReference == null) {
            deserializationContext.reportBadDefinition(this._beanType, String.format("Cannot handle managed/back reference %s: no back reference property found from type %s", ahw.e(managedReferenceName), ahw.a(settableBeanProperty.getType())));
        }
        JavaType javaType = this._beanType;
        JavaType type = settableBeanPropertyFindBackReference.getType();
        boolean zIsContainerType = settableBeanProperty.getType().isContainerType();
        if (!type.getRawClass().isAssignableFrom(javaType.getRawClass())) {
            deserializationContext.reportBadDefinition(this._beanType, String.format("Cannot handle managed/back reference %s: back reference type (%s) not compatible with managed type (%s)", ahw.e(managedReferenceName), ahw.a(type), javaType.getRawClass().getName()));
        }
        return new zy(settableBeanProperty, managedReferenceName, settableBeanPropertyFindBackReference, zIsContainerType);
    }

    protected SettableBeanProperty _resolvedObjectIdProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws ym {
        acv objectIdInfo = settableBeanProperty.getObjectIdInfo();
        JsonDeserializer<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
        return (objectIdInfo == null && (valueDeserializer == null ? null : valueDeserializer.getObjectIdReader()) == null) ? settableBeanProperty : new aad(settableBeanProperty, objectIdInfo);
    }

    protected NameTransformer _findPropertyUnwrapper(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws ym {
        NameTransformer nameTransformerFindUnwrappingNameTransformer;
        AnnotatedMember member = settableBeanProperty.getMember();
        if (member == null || (nameTransformerFindUnwrappingNameTransformer = deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(member)) == null) {
            return null;
        }
        if (settableBeanProperty instanceof zh) {
            deserializationContext.reportBadDefinition(getValueType(), String.format("Cannot define Creator property \"%s\" as `@JsonUnwrapped`: combination not yet supported", settableBeanProperty.getName()));
        }
        return nameTransformerFindUnwrappingNameTransformer;
    }

    protected SettableBeanProperty _resolveInnerClassValuedProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        Class<?> rawClass;
        Class<?> clsF;
        JsonDeserializer<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
        if ((valueDeserializer instanceof BeanDeserializerBase) && !((BeanDeserializerBase) valueDeserializer).getValueInstantiator().canCreateUsingDefault() && (clsF = ahw.f((rawClass = settableBeanProperty.getType().getRawClass()))) != null && clsF == this._beanType.getRawClass()) {
            for (Constructor<?> constructor : rawClass.getConstructors()) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == 1 && clsF.equals(parameterTypes[0])) {
                    if (deserializationContext.canOverrideAccessModifiers()) {
                        ahw.a(constructor, deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return new zv(settableBeanProperty, constructor);
                }
            }
        }
        return settableBeanProperty;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r0.f53748a != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected SettableBeanProperty _resolveMergeAndNullSettings(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, yq yqVar) throws ym {
        yq.d dVarA = yqVar.a();
        if (dVarA != null) {
            JsonDeserializer<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
            Boolean boolSupportsUpdate = valueDeserializer.supportsUpdate(deserializationContext.getConfig());
            if (boolSupportsUpdate != null) {
                if (!boolSupportsUpdate.booleanValue()) {
                    if (!dVarA.f53748a) {
                        deserializationContext.handleBadMerge(valueDeserializer);
                    }
                    return settableBeanProperty;
                }
                AnnotatedMember annotatedMember = dVarA.d;
                annotatedMember.fixAccess(deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                if (!(settableBeanProperty instanceof aam)) {
                    settableBeanProperty = zz.b(settableBeanProperty, annotatedMember);
                }
            }
        }
        NullValueProvider nullValueProviderFindValueNullProvider = findValueNullProvider(deserializationContext, settableBeanProperty, yqVar);
        return nullValueProviderFindValueNullProvider != null ? settableBeanProperty.withNullProvider(nullValueProviderFindValueNullProvider) : settableBeanProperty;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public AccessPattern getNullAccessPattern() {
        return AccessPattern.ALWAYS_NULL;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
        try {
            return this._valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e) {
            return ahw.b(deserializationContext, e);
        }
    }

    public boolean isCaseInsensitive() {
        return this._beanProperties.b();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(yi yiVar) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Class<?> handledType() {
        return this._beanType.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public aah getObjectIdReader() {
        return this._objectIdReader;
    }

    public boolean hasProperty(String str) {
        return this._beanProperties.b(str) != null;
    }

    public boolean hasViews() {
        return this._needViewProcesing;
    }

    public int getPropertyCount() {
        return this._beanProperties.d();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Collection<Object> getKnownPropertyNames() {
        ArrayList arrayList = new ArrayList();
        Iterator<SettableBeanProperty> it = this._beanProperties.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return arrayList;
    }

    @Deprecated
    public final Class<?> getBeanClass() {
        return this._beanType.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._beanType;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.POJO;
    }

    public Iterator<SettableBeanProperty> properties() {
        zr zrVar = this._beanProperties;
        if (zrVar == null) {
            throw new IllegalStateException("Can only call after BeanDeserializer has been resolved");
        }
        return zrVar.iterator();
    }

    public Iterator<SettableBeanProperty> creatorProperties() {
        aag aagVar = this._propertyBasedCreator;
        if (aagVar == null) {
            return Collections.EMPTY_LIST.iterator();
        }
        return aagVar.c().iterator();
    }

    public SettableBeanProperty findProperty(ys ysVar) {
        return findProperty(ysVar.b());
    }

    public SettableBeanProperty findProperty(String str) {
        aag aagVar;
        zr zrVar = this._beanProperties;
        SettableBeanProperty settableBeanPropertyB = zrVar == null ? null : zrVar.b(str);
        return (settableBeanPropertyB != null || (aagVar = this._propertyBasedCreator) == null) ? settableBeanPropertyB : aagVar.e(str);
    }

    public SettableBeanProperty findProperty(int i) {
        aag aagVar;
        zr zrVar = this._beanProperties;
        SettableBeanProperty settableBeanPropertyC = zrVar == null ? null : zrVar.c(i);
        return (settableBeanPropertyC != null || (aagVar = this._propertyBasedCreator) == null) ? settableBeanPropertyC : aagVar.e(i);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public SettableBeanProperty findBackReference(String str) {
        Map<String, SettableBeanProperty> map = this._backRefs;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public void replaceProperty(SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        this._beanProperties.b(settableBeanProperty, settableBeanProperty2);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        Object objectId;
        if (this._objectIdReader != null) {
            if (jsonParser.canReadObjectId() && (objectId = jsonParser.getObjectId()) != null) {
                return _handleTypedObjectId(jsonParser, deserializationContext, typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext), objectId);
            }
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken != null) {
                if (jsonTokenCurrentToken.isScalarValue()) {
                    return deserializeFromObjectId(jsonParser, deserializationContext);
                }
                if (jsonTokenCurrentToken == JsonToken.START_OBJECT) {
                    jsonTokenCurrentToken = jsonParser.nextToken();
                }
                if (jsonTokenCurrentToken == JsonToken.FIELD_NAME && this._objectIdReader.e() && this._objectIdReader.b(jsonParser.currentName(), jsonParser)) {
                    return deserializeFromObjectId(jsonParser, deserializationContext);
                }
            }
        }
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    protected Object _handleTypedObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Object obj2) throws IOException {
        JsonDeserializer<Object> jsonDeserializerB = this._objectIdReader.b();
        if (jsonDeserializerB.handledType() != obj2.getClass()) {
            obj2 = _convertObjectId(jsonParser, deserializationContext, obj2, jsonDeserializerB);
        }
        deserializationContext.findObjectId(obj2, this._objectIdReader.e, this._objectIdReader.h).a(obj);
        SettableBeanProperty settableBeanProperty = this._objectIdReader.f173b;
        return settableBeanProperty != null ? settableBeanProperty.setAndReturn(obj, obj2) : obj;
    }

    protected Object _convertObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, JsonDeserializer<Object> jsonDeserializer) throws IOException {
        aii aiiVar = new aii(jsonParser, deserializationContext);
        if (obj instanceof String) {
            aiiVar.writeString((String) obj);
        } else if (obj instanceof Long) {
            aiiVar.writeNumber(((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            aiiVar.writeNumber(((Integer) obj).intValue());
        } else {
            aiiVar.writeObject(obj);
        }
        JsonParser jsonParserB = aiiVar.b();
        jsonParserB.nextToken();
        return jsonDeserializer.deserialize(jsonParserB, deserializationContext);
    }

    protected Object deserializeWithObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializeFromObject(jsonParser, deserializationContext);
    }

    protected Object deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objC = this._objectIdReader.c(jsonParser, deserializationContext);
        ReadableObjectId readableObjectIdFindObjectId = deserializationContext.findObjectId(objC, this._objectIdReader.e, this._objectIdReader.h);
        Object objA = readableObjectIdFindObjectId.a();
        if (objA != null) {
            return objA;
        }
        throw new zm(jsonParser, "Could not resolve Object Id [" + objC + "] (for " + this._beanType + ").", jsonParser.getCurrentLocation(), readableObjectIdFindObjectId);
    }

    protected Object deserializeFromObjectUsingNonDefault(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer_delegateDeserializer = _delegateDeserializer();
        if (jsonDeserializer_delegateDeserializer != null) {
            Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate);
            }
            return objCreateUsingDelegate;
        }
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        Class<?> rawClass = this._beanType.getRawClass();
        if (ahw.q(rawClass)) {
            return deserializationContext.handleMissingInstantiator(rawClass, null, jsonParser, "non-static inner classes like this can only by instantiated using default, no-argument constructor", new Object[0]);
        }
        return deserializationContext.handleMissingInstantiator(rawClass, getValueInstantiator(), jsonParser, "cannot deserialize from Object value (no delegate- or property-based Creator)", new Object[0]);
    }

    public Object deserializeFromNumber(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer_delegateDeserializer = _delegateDeserializer();
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        if (numberType == JsonParser.NumberType.INT) {
            if (jsonDeserializer_delegateDeserializer != null && !this._valueInstantiator.canCreateFromInt()) {
                Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer.deserialize(jsonParser, deserializationContext));
                if (this._injectables != null) {
                    injectValues(deserializationContext, objCreateUsingDelegate);
                }
                return objCreateUsingDelegate;
            }
            return this._valueInstantiator.createFromInt(deserializationContext, jsonParser.getIntValue());
        }
        if (numberType == JsonParser.NumberType.LONG) {
            if (jsonDeserializer_delegateDeserializer != null && !this._valueInstantiator.canCreateFromInt()) {
                Object objCreateUsingDelegate2 = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer.deserialize(jsonParser, deserializationContext));
                if (this._injectables != null) {
                    injectValues(deserializationContext, objCreateUsingDelegate2);
                }
                return objCreateUsingDelegate2;
            }
            return this._valueInstantiator.createFromLong(deserializationContext, jsonParser.getLongValue());
        }
        if (numberType == JsonParser.NumberType.BIG_INTEGER) {
            if (jsonDeserializer_delegateDeserializer != null && !this._valueInstantiator.canCreateFromBigInteger()) {
                Object objCreateUsingDelegate3 = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer.deserialize(jsonParser, deserializationContext));
                if (this._injectables != null) {
                    injectValues(deserializationContext, objCreateUsingDelegate3);
                }
                return objCreateUsingDelegate3;
            }
            return this._valueInstantiator.createFromBigInteger(deserializationContext, jsonParser.getBigIntegerValue());
        }
        return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.getNumberValue());
    }

    public Object deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer_delegateDeserializer = _delegateDeserializer();
        if (jsonDeserializer_delegateDeserializer != null && !this._valueInstantiator.canCreateFromString()) {
            Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate);
            }
            return objCreateUsingDelegate;
        }
        return _deserializeFromString(jsonParser, deserializationContext);
    }

    public Object deserializeFromDouble(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        if (numberType == JsonParser.NumberType.DOUBLE || numberType == JsonParser.NumberType.FLOAT) {
            JsonDeserializer<Object> jsonDeserializer_delegateDeserializer = _delegateDeserializer();
            if (jsonDeserializer_delegateDeserializer != null && !this._valueInstantiator.canCreateFromDouble()) {
                Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer.deserialize(jsonParser, deserializationContext));
                if (this._injectables != null) {
                    injectValues(deserializationContext, objCreateUsingDelegate);
                }
                return objCreateUsingDelegate;
            }
            return this._valueInstantiator.createFromDouble(deserializationContext, jsonParser.getDoubleValue());
        }
        if (numberType == JsonParser.NumberType.BIG_DECIMAL) {
            JsonDeserializer<Object> jsonDeserializer_delegateDeserializer2 = _delegateDeserializer();
            if (jsonDeserializer_delegateDeserializer2 != null && !this._valueInstantiator.canCreateFromBigDecimal()) {
                Object objCreateUsingDelegate2 = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer2.deserialize(jsonParser, deserializationContext));
                if (this._injectables != null) {
                    injectValues(deserializationContext, objCreateUsingDelegate2);
                }
                return objCreateUsingDelegate2;
            }
            return this._valueInstantiator.createFromBigDecimal(deserializationContext, jsonParser.getDecimalValue());
        }
        return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.getNumberValue());
    }

    public Object deserializeFromBoolean(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer_delegateDeserializer = _delegateDeserializer();
        if (jsonDeserializer_delegateDeserializer != null && !this._valueInstantiator.canCreateFromBoolean()) {
            Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate);
            }
            return objCreateUsingDelegate;
        }
        return this._valueInstantiator.createFromBoolean(deserializationContext, jsonParser.currentToken() == JsonToken.VALUE_TRUE);
    }

    @Deprecated
    public Object deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserializeFromArray(jsonParser, deserializationContext);
    }

    public Object deserializeFromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer_delegateDeserializer = _delegateDeserializer();
        if (jsonDeserializer_delegateDeserializer != null && !this._valueInstantiator.canCreateFromString()) {
            Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer_delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate);
            }
            return objCreateUsingDelegate;
        }
        Object embeddedObject = jsonParser.getEmbeddedObject();
        return (embeddedObject == null || this._beanType.isTypeOrSuperTypeOf(embeddedObject.getClass())) ? embeddedObject : deserializationContext.handleWeirdNativeValue(this._beanType, embeddedObject, jsonParser);
    }

    protected final JsonDeserializer<Object> _delegateDeserializer() {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        return jsonDeserializer == null ? this._arrayDelegateDeserializer : jsonDeserializer;
    }

    protected void injectValues(DeserializationContext deserializationContext, Object obj) throws IOException {
        for (aan aanVar : this._injectables) {
            aanVar.e(deserializationContext, obj);
        }
    }

    protected Object handleUnknownProperties(DeserializationContext deserializationContext, Object obj, aii aiiVar) throws IOException {
        aiiVar.writeEndObject();
        JsonParser jsonParserB = aiiVar.b();
        while (jsonParserB.nextToken() != JsonToken.END_OBJECT) {
            String strCurrentName = jsonParserB.currentName();
            jsonParserB.nextToken();
            handleUnknownProperty(jsonParserB, deserializationContext, obj, strCurrentName);
        }
        return obj;
    }

    protected void handleUnknownVanilla(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (ahy.b(str, this._ignorableProps, this._includableProps)) {
            handleIgnoredProperty(jsonParser, deserializationContext, obj, str);
            return;
        }
        zj zjVar = this._anySetter;
        if (zjVar != null) {
            try {
                zjVar.e(jsonParser, deserializationContext, obj, str);
                return;
            } catch (Exception e) {
                wrapAndThrow(e, obj, str, deserializationContext);
                return;
            }
        }
        handleUnknownProperty(jsonParser, deserializationContext, obj, str);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (this._ignoreAllUnknown) {
            jsonParser.skipChildren();
            return;
        }
        if (ahy.b(str, this._ignorableProps, this._includableProps)) {
            handleIgnoredProperty(jsonParser, deserializationContext, obj, str);
        }
        super.handleUnknownProperty(jsonParser, deserializationContext, obj, str);
    }

    protected void handleIgnoredProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)) {
            throw abr.d(jsonParser, obj, str, getKnownPropertyNames());
        }
        jsonParser.skipChildren();
    }

    protected Object handlePolymorphic(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, aii aiiVar) throws IOException {
        JsonDeserializer<Object> jsonDeserializer_findSubclassDeserializer = _findSubclassDeserializer(deserializationContext, obj, aiiVar);
        if (jsonDeserializer_findSubclassDeserializer == null) {
            if (aiiVar != null) {
                obj = handleUnknownProperties(deserializationContext, obj, aiiVar);
            }
            return jsonParser != null ? deserialize(jsonParser, deserializationContext, obj) : obj;
        }
        if (aiiVar != null) {
            aiiVar.writeEndObject();
            JsonParser jsonParserB = aiiVar.b();
            jsonParserB.nextToken();
            obj = jsonDeserializer_findSubclassDeserializer.deserialize(jsonParserB, deserializationContext, obj);
        }
        return jsonParser != null ? jsonDeserializer_findSubclassDeserializer.deserialize(jsonParser, deserializationContext, obj) : obj;
    }

    protected JsonDeserializer<Object> _findSubclassDeserializer(DeserializationContext deserializationContext, Object obj, aii aiiVar) throws IOException {
        JsonDeserializer<Object> jsonDeserializer;
        synchronized (this) {
            HashMap<ahd, JsonDeserializer<Object>> map = this._subDeserializers;
            jsonDeserializer = map == null ? null : map.get(new ahd(obj.getClass()));
        }
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(deserializationContext.constructType(obj.getClass()));
        if (jsonDeserializerFindRootValueDeserializer == null) {
            return jsonDeserializerFindRootValueDeserializer;
        }
        synchronized (this) {
            if (this._subDeserializers == null) {
                this._subDeserializers = new HashMap<>();
            }
            this._subDeserializers.put(new ahd(obj.getClass()), jsonDeserializerFindRootValueDeserializer);
        }
        return jsonDeserializerFindRootValueDeserializer;
    }

    public void wrapAndThrow(Throwable th, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        throw ym.wrapWithPath(throwOrReturnThrowable(th, deserializationContext), obj, str);
    }

    private Throwable throwOrReturnThrowable(Throwable th, DeserializationContext deserializationContext) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ahw.e(th);
        boolean z = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof wr)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            ahw.i(th);
        }
        return th;
    }

    protected Object wrapInstantiationProblem(Throwable th, DeserializationContext deserializationContext) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ahw.e(th);
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            ahw.i(th);
        }
        return deserializationContext.handleInstantiationProblem(this._beanType.getRawClass(), null, th);
    }
}
