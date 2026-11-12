package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.bip;
import defpackage.esd;
import defpackage.fh2;
import defpackage.gh2;
import defpackage.ldi;
import defpackage.pk8;
import defpackage.qdi;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class BuilderBasedDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    protected final AnnotatedMethod _buildMethod;
    protected final JavaType _targetType;

    public BuilderBasedDeserializer(gh2 gh2Var, fh2 fh2Var, JavaType javaType, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, boolean z2) {
        super(gh2Var, fh2Var, beanPropertyMap, map, set, z, z2);
        this._targetType = javaType;
        this._buildMethod = gh2Var.n();
        if (this._objectIdReader == null) {
            return;
        }
        throw new IllegalArgumentException("Cannot use Object Id with Builder-based deserialization (type " + fh2Var.z() + ")");
    }

    private final Object vanillaDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        while (jsonParser.K() == JsonToken.FIELD_NAME) {
            String strJ = jsonParser.J();
            jsonParser.G0();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
            if (settableBeanPropertyFind != null) {
                try {
                    objCreateUsingDefault = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, objCreateUsingDefault);
                } catch (Exception e) {
                    wrapAndThrow(e, objCreateUsingDefault, strJ, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, strJ);
            }
            jsonParser.G0();
        }
        return objCreateUsingDefault;
    }

    public final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Class<?> activeView;
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        if (this._unwrappedPropertyHandler != null) {
            if (jsonParser.y0(JsonToken.START_OBJECT)) {
                jsonParser.G0();
            }
            bip bipVar = new bip(jsonParser, deserializationContext);
            bipVar.N0();
            return deserializeWithUnwrapped(jsonParser, deserializationContext, obj, bipVar);
        }
        if (this._externalTypeIdHandler != null) {
            return deserializeWithExternalTypeId(jsonParser, deserializationContext, obj);
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return deserializeWithView(jsonParser, deserializationContext, obj, activeView);
        }
        JsonToken jsonTokenK = jsonParser.K();
        if (jsonTokenK == JsonToken.START_OBJECT) {
            jsonTokenK = jsonParser.G0();
        }
        while (jsonTokenK == JsonToken.FIELD_NAME) {
            String strJ = jsonParser.J();
            jsonParser.G0();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
            if (settableBeanPropertyFind != null) {
                try {
                    obj = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    wrapAndThrow(e, obj, strJ, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, handledType(), strJ);
            }
            jsonTokenK = jsonParser.G0();
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objWrapInstantiationProblem;
        ldi ldiVar = this._propertyBasedCreator;
        qdi qdiVarG = ldiVar.g(jsonParser, deserializationContext, this._objectIdReader);
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenK = jsonParser.K();
        bip bipVar = null;
        while (jsonTokenK == JsonToken.FIELD_NAME) {
            String strJ = jsonParser.J();
            jsonParser.G0();
            SettableBeanProperty settableBeanPropertyE = ldiVar.e(strJ);
            if (settableBeanPropertyE != null) {
                if (activeView != null && !settableBeanPropertyE.visibleInView(activeView)) {
                    jsonParser.O0();
                } else if (qdiVarG.b(settableBeanPropertyE, settableBeanPropertyE.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.G0();
                    try {
                        Object objA = ldiVar.a(deserializationContext, qdiVarG);
                        if (objA.getClass() != this._beanType.getRawClass()) {
                            return handlePolymorphic(jsonParser, deserializationContext, objA, bipVar);
                        }
                        if (bipVar != null) {
                            objA = handleUnknownProperties(deserializationContext, objA, bipVar);
                        }
                        return _deserialize(jsonParser, deserializationContext, objA);
                    } catch (Exception e) {
                        wrapAndThrow(e, this._beanType.getRawClass(), strJ, deserializationContext);
                    }
                } else {
                    continue;
                }
            } else if (!qdiVarG.i(strJ)) {
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
                if (settableBeanPropertyFind != null) {
                    qdiVarG.e(settableBeanPropertyFind, settableBeanPropertyFind.deserialize(jsonParser, deserializationContext));
                } else {
                    Set<String> set = this._ignorableProps;
                    if (set == null || !set.contains(strJ)) {
                        SettableAnyProperty settableAnyProperty = this._anySetter;
                        if (settableAnyProperty != null) {
                            qdiVarG.c(settableAnyProperty, strJ, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                        } else {
                            if (bipVar == null) {
                                bipVar = new bip(jsonParser, deserializationContext);
                            }
                            bipVar.r0(strJ);
                            bipVar.k1(jsonParser);
                        }
                    } else {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strJ);
                    }
                }
            }
            jsonTokenK = jsonParser.G0();
        }
        try {
            objWrapInstantiationProblem = ldiVar.a(deserializationContext, qdiVarG);
        } catch (Exception e2) {
            objWrapInstantiationProblem = wrapInstantiationProblem(e2, deserializationContext);
        }
        if (bipVar != null) {
            return objWrapInstantiationProblem.getClass() != this._beanType.getRawClass() ? handlePolymorphic(null, deserializationContext, objWrapInstantiationProblem, bipVar) : handleUnknownProperties(deserializationContext, objWrapInstantiationProblem, bipVar);
        }
        return objWrapInstantiationProblem;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return new BeanAsArrayBuilderDeserializer(this, this._targetType, this._beanProperties.getPropertiesInInsertionOrder(), this._buildMethod);
    }

    @Override // defpackage.esd
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.C0()) {
            return this._vanillaProcessing ? finishBuild(deserializationContext, vanillaDeserialize(jsonParser, deserializationContext, jsonParser.G0())) : finishBuild(deserializationContext, deserializeFromObject(jsonParser, deserializationContext));
        }
        switch (jsonParser.M()) {
            case 2:
            case 5:
                return finishBuild(deserializationContext, deserializeFromObject(jsonParser, deserializationContext));
            case 3:
                return finishBuild(deserializationContext, deserializeFromArray(jsonParser, deserializationContext));
            case 4:
            case 11:
            default:
                return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
            case 6:
                return finishBuild(deserializationContext, deserializeFromString(jsonParser, deserializationContext));
            case 7:
                return finishBuild(deserializationContext, deserializeFromNumber(jsonParser, deserializationContext));
            case 8:
                return finishBuild(deserializationContext, deserializeFromDouble(jsonParser, deserializationContext));
            case 9:
            case 10:
                return finishBuild(deserializationContext, deserializeFromBoolean(jsonParser, deserializationContext));
            case 12:
                return jsonParser.P();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> activeView;
        if (this._nonStandardCreation) {
            if (this._unwrappedPropertyHandler != null) {
                return deserializeWithUnwrapped(jsonParser, deserializationContext);
            }
            return this._externalTypeIdHandler != null ? deserializeWithExternalTypeId(jsonParser, deserializationContext) : deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        }
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return deserializeWithView(jsonParser, deserializationContext, objCreateUsingDefault, activeView);
        }
        while (jsonParser.K() == JsonToken.FIELD_NAME) {
            String strJ = jsonParser.J();
            jsonParser.G0();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
            if (settableBeanPropertyFind != null) {
                try {
                    objCreateUsingDefault = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, objCreateUsingDefault);
                } catch (Exception e) {
                    wrapAndThrow(e, objCreateUsingDefault, strJ, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, strJ);
            }
            jsonParser.G0();
        }
        return objCreateUsingDefault;
    }

    public Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JavaType javaType = this._targetType;
        return deserializationContext.reportBadDefinition(javaType, String.format("Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented", javaType));
    }

    public Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ldi ldiVar = this._propertyBasedCreator;
        qdi qdiVarG = ldiVar.g(jsonParser, deserializationContext, this._objectIdReader);
        bip bipVar = new bip(jsonParser, deserializationContext);
        bipVar.N0();
        JsonToken jsonTokenK = jsonParser.K();
        while (jsonTokenK == JsonToken.FIELD_NAME) {
            String strJ = jsonParser.J();
            jsonParser.G0();
            SettableBeanProperty settableBeanPropertyE = ldiVar.e(strJ);
            if (settableBeanPropertyE != null) {
                if (qdiVarG.b(settableBeanPropertyE, settableBeanPropertyE.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.G0();
                    try {
                        Object objA = ldiVar.a(deserializationContext, qdiVarG);
                        return objA.getClass() != this._beanType.getRawClass() ? handlePolymorphic(jsonParser, deserializationContext, objA, bipVar) : deserializeWithUnwrapped(jsonParser, deserializationContext, objA, bipVar);
                    } catch (Exception e) {
                        wrapAndThrow(e, this._beanType.getRawClass(), strJ, deserializationContext);
                    }
                } else {
                    continue;
                }
            } else if (!qdiVarG.i(strJ)) {
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
                if (settableBeanPropertyFind != null) {
                    qdiVarG.e(settableBeanPropertyFind, settableBeanPropertyFind.deserialize(jsonParser, deserializationContext));
                } else {
                    Set<String> set = this._ignorableProps;
                    if (set == null || !set.contains(strJ)) {
                        bipVar.r0(strJ);
                        bipVar.k1(jsonParser);
                        SettableAnyProperty settableAnyProperty = this._anySetter;
                        if (settableAnyProperty != null) {
                            qdiVarG.c(settableAnyProperty, strJ, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                        }
                    } else {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strJ);
                    }
                }
            }
            jsonTokenK = jsonParser.G0();
        }
        bipVar.m0();
        try {
            return this._unwrappedPropertyHandler.b(jsonParser, deserializationContext, ldiVar.a(deserializationContext, qdiVarG), bipVar);
        } catch (Exception e2) {
            return wrapInstantiationProblem(e2, deserializationContext);
        }
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this._propertyBasedCreator != null ? deserializeUsingPropertyBasedWithExternalTypeId(jsonParser, deserializationContext) : deserializeWithExternalTypeId(jsonParser, deserializationContext, this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        esd<Object> esdVar = this._delegateDeserializer;
        if (esdVar != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, esdVar.deserialize(jsonParser, deserializationContext));
        }
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithUnwrapped(jsonParser, deserializationContext);
        }
        bip bipVar = new bip(jsonParser, deserializationContext);
        bipVar.N0();
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        while (jsonParser.K() == JsonToken.FIELD_NAME) {
            String strJ = jsonParser.J();
            jsonParser.G0();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
            if (settableBeanPropertyFind == null) {
                Set<String> set = this._ignorableProps;
                if (set == null || !set.contains(strJ)) {
                    bipVar.r0(strJ);
                    bipVar.k1(jsonParser);
                    SettableAnyProperty settableAnyProperty = this._anySetter;
                    if (settableAnyProperty != null) {
                        try {
                            settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault, strJ);
                        } catch (Exception e) {
                            wrapAndThrow(e, objCreateUsingDefault, strJ, deserializationContext);
                        }
                    }
                } else {
                    handleIgnoredProperty(jsonParser, deserializationContext, objCreateUsingDefault, strJ);
                }
            } else if (activeView == null || settableBeanPropertyFind.visibleInView(activeView)) {
                try {
                    objCreateUsingDefault = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, objCreateUsingDefault);
                } catch (Exception e2) {
                    wrapAndThrow(e2, objCreateUsingDefault, strJ, deserializationContext);
                }
            } else {
                jsonParser.O0();
            }
            jsonParser.G0();
        }
        bipVar.m0();
        return this._unwrappedPropertyHandler.b(jsonParser, deserializationContext, objCreateUsingDefault, bipVar);
    }

    public final Object deserializeWithView(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) throws IOException {
        JsonToken jsonTokenK = jsonParser.K();
        while (jsonTokenK == JsonToken.FIELD_NAME) {
            String strJ = jsonParser.J();
            jsonParser.G0();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
            if (settableBeanPropertyFind == null) {
                handleUnknownVanilla(jsonParser, deserializationContext, obj, strJ);
            } else if (settableBeanPropertyFind.visibleInView(cls)) {
                try {
                    obj = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    wrapAndThrow(e, obj, strJ, deserializationContext);
                }
            } else {
                jsonParser.O0();
            }
            jsonTokenK = jsonParser.G0();
        }
        return obj;
    }

    public Object finishBuild(DeserializationContext deserializationContext, Object obj) throws IOException {
        AnnotatedMethod annotatedMethod = this._buildMethod;
        if (annotatedMethod == null) {
            return obj;
        }
        try {
            return annotatedMethod.getMember().invoke(obj, null);
        } catch (Exception e) {
            return wrapInstantiationProblem(e, deserializationContext);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, defpackage.esd
    public esd<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return new BuilderBasedDeserializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BuilderBasedDeserializer(this, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnorableProperties(Set<String> set) {
        return new BuilderBasedDeserializer(this, set);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BuilderBasedDeserializer(this, objectIdReader);
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        pk8 pk8VarI = this._externalTypeIdHandler.i();
        JsonToken jsonTokenK = jsonParser.K();
        while (jsonTokenK == JsonToken.FIELD_NAME) {
            String strJ = jsonParser.J();
            JsonToken jsonTokenG0 = jsonParser.G0();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
            if (settableBeanPropertyFind != null) {
                if (jsonTokenG0.isScalarValue()) {
                    pk8VarI.h(jsonParser, deserializationContext, strJ, obj);
                }
                if (activeView != null && !settableBeanPropertyFind.visibleInView(activeView)) {
                    jsonParser.O0();
                } else {
                    try {
                        obj = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, strJ, deserializationContext);
                    }
                }
            } else {
                Set<String> set = this._ignorableProps;
                if (set != null && set.contains(strJ)) {
                    handleIgnoredProperty(jsonParser, deserializationContext, obj, strJ);
                } else if (!pk8VarI.g(jsonParser, deserializationContext, strJ, obj)) {
                    SettableAnyProperty settableAnyProperty = this._anySetter;
                    if (settableAnyProperty != null) {
                        try {
                            settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, strJ);
                        } catch (Exception e2) {
                            wrapAndThrow(e2, obj, strJ, deserializationContext);
                        }
                    } else {
                        handleUnknownProperty(jsonParser, deserializationContext, obj, strJ);
                    }
                }
            }
            jsonTokenK = jsonParser.G0();
        }
        return pk8VarI.f(jsonParser, deserializationContext, obj);
    }

    @Deprecated
    public BuilderBasedDeserializer(gh2 gh2Var, fh2 fh2Var, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, boolean z2) {
        this(gh2Var, fh2Var, fh2Var.z(), beanPropertyMap, map, set, z, z2);
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer) {
        this(builderBasedDeserializer, builderBasedDeserializer._ignoreAllUnknown);
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, boolean z) {
        super(builderBasedDeserializer, z);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, NameTransformer nameTransformer) {
        super(builderBasedDeserializer, nameTransformer);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    @Override // defpackage.esd
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        JavaType javaType = this._targetType;
        Class<?> clsHandledType = handledType();
        Class<?> cls = obj.getClass();
        if (clsHandledType.isAssignableFrom(cls)) {
            return deserializationContext.reportBadDefinition(javaType, String.format("Deserialization of %s by passing existing Builder (%s) instance not supported", javaType, clsHandledType.getName()));
        }
        return deserializationContext.reportBadDefinition(javaType, String.format("Deserialization of %s by passing existing instance (of %s) not supported", javaType, cls.getName()));
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, ObjectIdReader objectIdReader) {
        super(builderBasedDeserializer, objectIdReader);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, Set<String> set) {
        super(builderBasedDeserializer, set);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, BeanPropertyMap beanPropertyMap) {
        super(builderBasedDeserializer, beanPropertyMap);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, bip bipVar) throws IOException {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenK = jsonParser.K();
        while (jsonTokenK == JsonToken.FIELD_NAME) {
            String strJ = jsonParser.J();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
            jsonParser.G0();
            if (settableBeanPropertyFind != null) {
                if (activeView != null && !settableBeanPropertyFind.visibleInView(activeView)) {
                    jsonParser.O0();
                } else {
                    try {
                        obj = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, strJ, deserializationContext);
                    }
                }
            } else {
                Set<String> set = this._ignorableProps;
                if (set != null && set.contains(strJ)) {
                    handleIgnoredProperty(jsonParser, deserializationContext, obj, strJ);
                } else {
                    bipVar.r0(strJ);
                    bipVar.k1(jsonParser);
                    SettableAnyProperty settableAnyProperty = this._anySetter;
                    if (settableAnyProperty != null) {
                        settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, strJ);
                    }
                }
            }
            jsonTokenK = jsonParser.G0();
        }
        bipVar.m0();
        return this._unwrappedPropertyHandler.b(jsonParser, deserializationContext, obj, bipVar);
    }
}
