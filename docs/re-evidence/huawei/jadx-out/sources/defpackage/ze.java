package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class ze extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final JavaType f54017a;
    protected final aco d;

    public ze(zi ziVar, BeanDescription beanDescription, JavaType javaType, zr zrVar, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, Set<String> set2, boolean z2) {
        super(ziVar, beanDescription, zrVar, map, set, z, set2, z2);
        this.f54017a = javaType;
        this.d = ziVar.b();
        if (this._objectIdReader == null) {
            return;
        }
        throw new IllegalArgumentException("Cannot use Object Id with Builder-based deserialization (type " + beanDescription.getType() + Constants.RIGHT_BRACKET_ONLY);
    }

    protected ze(ze zeVar, boolean z) {
        super(zeVar, z);
        this.d = zeVar.d;
        this.f54017a = zeVar.f54017a;
    }

    protected ze(ze zeVar, NameTransformer nameTransformer) {
        super(zeVar, nameTransformer);
        this.d = zeVar.d;
        this.f54017a = zeVar.f54017a;
    }

    public ze(ze zeVar, aah aahVar) {
        super(zeVar, aahVar);
        this.d = zeVar.d;
        this.f54017a = zeVar.f54017a;
    }

    public ze(ze zeVar, Set<String> set, Set<String> set2) {
        super(zeVar, set, set2);
        this.d = zeVar.d;
        this.f54017a = zeVar.f54017a;
    }

    public ze(ze zeVar, zr zrVar) {
        super(zeVar, zrVar);
        this.d = zeVar.d;
        this.f54017a = zeVar.f54017a;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return new ze(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withObjectIdReader(aah aahVar) {
        return new ze(this, aahVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withByNameInclusion(Set<String> set, Set<String> set2) {
        return new ze(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnoreAllUnknown(boolean z) {
        return new ze(this, z);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(zr zrVar) {
        return new ze(this, zrVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return new zq(this, this.f54017a, this._beanProperties.e(), this.d);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(yi yiVar) {
        return Boolean.FALSE;
    }

    protected Object a(DeserializationContext deserializationContext, Object obj) throws IOException {
        aco acoVar = this.d;
        if (acoVar == null) {
            return obj;
        }
        try {
            return acoVar.getMember().invoke(obj, null);
        } catch (Exception e) {
            return wrapInstantiationProblem(e, deserializationContext);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.isExpectedStartObjectToken()) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (this._vanillaProcessing) {
                return a(deserializationContext, a(jsonParser, deserializationContext, jsonTokenNextToken));
            }
            return a(deserializationContext, deserializeFromObject(jsonParser, deserializationContext));
        }
        switch (jsonParser.currentTokenId()) {
            case 2:
            case 5:
                return a(deserializationContext, deserializeFromObject(jsonParser, deserializationContext));
            case 3:
                return _deserializeFromArray(jsonParser, deserializationContext);
            case 4:
            case 11:
            default:
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
            case 6:
                return a(deserializationContext, deserializeFromString(jsonParser, deserializationContext));
            case 7:
                return a(deserializationContext, deserializeFromNumber(jsonParser, deserializationContext));
            case 8:
                return a(deserializationContext, deserializeFromDouble(jsonParser, deserializationContext));
            case 9:
            case 10:
                return a(deserializationContext, deserializeFromBoolean(jsonParser, deserializationContext));
            case 12:
                return jsonParser.getEmbeddedObject();
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        JavaType javaType = this.f54017a;
        Class<?> clsHandledType = handledType();
        Class<?> cls = obj.getClass();
        if (clsHandledType.isAssignableFrom(cls)) {
            return deserializationContext.reportBadDefinition(javaType, String.format("Deserialization of %s by passing existing Builder (%s) instance not supported", javaType, clsHandledType.getName()));
        }
        return deserializationContext.reportBadDefinition(javaType, String.format("Deserialization of %s by passing existing instance (of %s) not supported", javaType, cls.getName()));
    }

    private final Object a(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        while (jsonParser.currentToken() == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
            if (settableBeanPropertyB != null) {
                try {
                    objCreateUsingDefault = settableBeanPropertyB.deserializeSetAndReturn(jsonParser, deserializationContext, objCreateUsingDefault);
                } catch (Exception e) {
                    wrapAndThrow(e, objCreateUsingDefault, strCurrentName, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, strCurrentName);
            }
            jsonParser.nextToken();
        }
        return objCreateUsingDefault;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> activeView;
        if (this._nonStandardCreation) {
            if (this._unwrappedPropertyHandler != null) {
                return d(jsonParser, deserializationContext);
            }
            if (this._externalTypeIdHandler != null) {
                return e(jsonParser, deserializationContext);
            }
            return deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        }
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return c(jsonParser, deserializationContext, objCreateUsingDefault, activeView);
        }
        while (jsonParser.currentToken() == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
            if (settableBeanPropertyB != null) {
                try {
                    objCreateUsingDefault = settableBeanPropertyB.deserializeSetAndReturn(jsonParser, deserializationContext, objCreateUsingDefault);
                } catch (Exception e) {
                    wrapAndThrow(e, objCreateUsingDefault, strCurrentName, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, strCurrentName);
            }
            jsonParser.nextToken();
        }
        return objCreateUsingDefault;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objWrapInstantiationProblem;
        aag aagVar = this._propertyBasedCreator;
        aai aaiVarE = aagVar.e(jsonParser, deserializationContext, this._objectIdReader);
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        aii aiiVar = null;
        while (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyE = aagVar.e(strCurrentName);
            if (!aaiVarE.e(strCurrentName) || settableBeanPropertyE != null) {
                if (settableBeanPropertyE != null) {
                    if (activeView != null && !settableBeanPropertyE.visibleInView(activeView)) {
                        jsonParser.skipChildren();
                    } else if (aaiVarE.b(settableBeanPropertyE, settableBeanPropertyE.deserialize(jsonParser, deserializationContext))) {
                        jsonParser.nextToken();
                        try {
                            Object objA = aagVar.a(deserializationContext, aaiVarE);
                            if (objA.getClass() != this._beanType.getRawClass()) {
                                return handlePolymorphic(jsonParser, deserializationContext, objA, aiiVar);
                            }
                            if (aiiVar != null) {
                                objA = handleUnknownProperties(deserializationContext, objA, aiiVar);
                            }
                            return b(jsonParser, deserializationContext, objA);
                        } catch (Exception e) {
                            wrapAndThrow(e, this._beanType.getRawClass(), strCurrentName, deserializationContext);
                        }
                    } else {
                        continue;
                    }
                } else {
                    SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
                    if (settableBeanPropertyB != null) {
                        aaiVarE.e(settableBeanPropertyB, settableBeanPropertyB.deserialize(jsonParser, deserializationContext));
                    } else if (ahy.b(strCurrentName, this._ignorableProps, this._includableProps)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strCurrentName);
                    } else if (this._anySetter != null) {
                        aaiVarE.c(this._anySetter, strCurrentName, this._anySetter.c(jsonParser, deserializationContext));
                    } else {
                        if (aiiVar == null) {
                            aiiVar = new aii(jsonParser, deserializationContext);
                        }
                        aiiVar.writeFieldName(strCurrentName);
                        aiiVar.copyCurrentStructure(jsonParser);
                    }
                }
            }
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        try {
            objWrapInstantiationProblem = aagVar.a(deserializationContext, aaiVarE);
        } catch (Exception e2) {
            objWrapInstantiationProblem = wrapInstantiationProblem(e2, deserializationContext);
        }
        if (aiiVar == null) {
            return objWrapInstantiationProblem;
        }
        if (objWrapInstantiationProblem.getClass() != this._beanType.getRawClass()) {
            return handlePolymorphic(null, deserializationContext, objWrapInstantiationProblem, aiiVar);
        }
        return handleUnknownProperties(deserializationContext, objWrapInstantiationProblem, aiiVar);
    }

    protected final Object b(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Class<?> activeView;
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        if (this._unwrappedPropertyHandler != null) {
            if (jsonParser.hasToken(JsonToken.START_OBJECT)) {
                jsonParser.nextToken();
            }
            aii aiiVar = new aii(jsonParser, deserializationContext);
            aiiVar.writeStartObject();
            return b(jsonParser, deserializationContext, obj, aiiVar);
        }
        if (this._externalTypeIdHandler != null) {
            return a(jsonParser, deserializationContext, obj);
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return c(jsonParser, deserializationContext, obj, activeView);
        }
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == JsonToken.START_OBJECT) {
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        while (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
            if (settableBeanPropertyB != null) {
                try {
                    obj = settableBeanPropertyB.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    wrapAndThrow(e, obj, strCurrentName, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, obj, strCurrentName);
            }
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public Object _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer = this._arrayDelegateDeserializer;
        if (jsonDeserializer != null || (jsonDeserializer = this._delegateDeserializer) != null) {
            Object objCreateUsingArrayDelegate = this._valueInstantiator.createUsingArrayDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingArrayDelegate);
            }
            return a(deserializationContext, objCreateUsingArrayDelegate);
        }
        CoercionAction coercionAction_findCoercionFromEmptyArray = _findCoercionFromEmptyArray(deserializationContext);
        boolean zIsEnabled = deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zIsEnabled || coercionAction_findCoercionFromEmptyArray != CoercionAction.Fail) {
            if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                int i = AnonymousClass2.e[coercionAction_findCoercionFromEmptyArray.ordinal()];
                if (i == 1) {
                    return getEmptyValue(deserializationContext);
                }
                if (i == 2 || i == 3) {
                    return getNullValue(deserializationContext);
                }
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
            }
            if (zIsEnabled) {
                Object objDeserialize = deserialize(jsonParser, deserializationContext);
                if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return objDeserialize;
            }
        }
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
    }

    /* JADX INFO: renamed from: ze$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            e = iArr;
            try {
                iArr[CoercionAction.AsEmpty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[CoercionAction.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[CoercionAction.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    protected final Object c(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) throws IOException {
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        while (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
            if (settableBeanPropertyB != null) {
                if (!settableBeanPropertyB.visibleInView(cls)) {
                    jsonParser.skipChildren();
                } else {
                    try {
                        obj = settableBeanPropertyB.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, strCurrentName, deserializationContext);
                    }
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, obj, strCurrentName);
            }
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        return obj;
    }

    protected Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._delegateDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, this._delegateDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (this._propertyBasedCreator != null) {
            return b(jsonParser, deserializationContext);
        }
        aii aiiVar = new aii(jsonParser, deserializationContext);
        aiiVar.writeStartObject();
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        while (jsonParser.currentToken() == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
            if (settableBeanPropertyB != null) {
                if (activeView != null && !settableBeanPropertyB.visibleInView(activeView)) {
                    jsonParser.skipChildren();
                } else {
                    try {
                        objCreateUsingDefault = settableBeanPropertyB.deserializeSetAndReturn(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, objCreateUsingDefault, strCurrentName, deserializationContext);
                    }
                }
            } else if (ahy.b(strCurrentName, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, objCreateUsingDefault, strCurrentName);
            } else {
                aiiVar.writeFieldName(strCurrentName);
                aiiVar.copyCurrentStructure(jsonParser);
                if (this._anySetter != null) {
                    try {
                        this._anySetter.e(jsonParser, deserializationContext, objCreateUsingDefault, strCurrentName);
                    } catch (Exception e2) {
                        wrapAndThrow(e2, objCreateUsingDefault, strCurrentName, deserializationContext);
                    }
                }
            }
            jsonParser.nextToken();
        }
        aiiVar.writeEndObject();
        return this._unwrappedPropertyHandler.a(jsonParser, deserializationContext, objCreateUsingDefault, aiiVar);
    }

    protected Object b(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        aag aagVar = this._propertyBasedCreator;
        aai aaiVarE = aagVar.e(jsonParser, deserializationContext, this._objectIdReader);
        aii aiiVar = new aii(jsonParser, deserializationContext);
        aiiVar.writeStartObject();
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        while (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyE = aagVar.e(strCurrentName);
            if (!aaiVarE.e(strCurrentName) || settableBeanPropertyE != null) {
                if (settableBeanPropertyE != null) {
                    if (aaiVarE.b(settableBeanPropertyE, settableBeanPropertyE.deserialize(jsonParser, deserializationContext))) {
                        jsonParser.nextToken();
                        try {
                            Object objA = aagVar.a(deserializationContext, aaiVarE);
                            if (objA.getClass() != this._beanType.getRawClass()) {
                                return handlePolymorphic(jsonParser, deserializationContext, objA, aiiVar);
                            }
                            return b(jsonParser, deserializationContext, objA, aiiVar);
                        } catch (Exception e) {
                            wrapAndThrow(e, this._beanType.getRawClass(), strCurrentName, deserializationContext);
                        }
                    } else {
                        continue;
                    }
                } else {
                    SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
                    if (settableBeanPropertyB != null) {
                        aaiVarE.e(settableBeanPropertyB, settableBeanPropertyB.deserialize(jsonParser, deserializationContext));
                    } else if (ahy.b(strCurrentName, this._ignorableProps, this._includableProps)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strCurrentName);
                    } else {
                        aiiVar.writeFieldName(strCurrentName);
                        aiiVar.copyCurrentStructure(jsonParser);
                        if (this._anySetter != null) {
                            aaiVarE.c(this._anySetter, strCurrentName, this._anySetter.c(jsonParser, deserializationContext));
                        }
                    }
                }
            }
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        aiiVar.writeEndObject();
        try {
            return this._unwrappedPropertyHandler.a(jsonParser, deserializationContext, aagVar.a(deserializationContext, aaiVarE), aiiVar);
        } catch (Exception e2) {
            return wrapInstantiationProblem(e2, deserializationContext);
        }
    }

    protected Object b(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, aii aiiVar) throws IOException {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        while (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
            jsonParser.nextToken();
            if (settableBeanPropertyB != null) {
                if (activeView != null && !settableBeanPropertyB.visibleInView(activeView)) {
                    jsonParser.skipChildren();
                } else {
                    try {
                        obj = settableBeanPropertyB.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, strCurrentName, deserializationContext);
                    }
                }
            } else if (ahy.b(strCurrentName, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, obj, strCurrentName);
            } else {
                aiiVar.writeFieldName(strCurrentName);
                aiiVar.copyCurrentStructure(jsonParser);
                if (this._anySetter != null) {
                    this._anySetter.e(jsonParser, deserializationContext, obj, strCurrentName);
                }
            }
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        aiiVar.writeEndObject();
        return this._unwrappedPropertyHandler.a(jsonParser, deserializationContext, obj, aiiVar);
    }

    protected Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return c(jsonParser, deserializationContext);
        }
        return a(jsonParser, deserializationContext, this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        zu zuVarE = this._externalTypeIdHandler.e();
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        while (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
            if (settableBeanPropertyB != null) {
                if (jsonTokenNextToken.isScalarValue()) {
                    zuVarE.b(jsonParser, deserializationContext, strCurrentName, obj);
                }
                if (activeView != null && !settableBeanPropertyB.visibleInView(activeView)) {
                    jsonParser.skipChildren();
                } else {
                    try {
                        obj = settableBeanPropertyB.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, strCurrentName, deserializationContext);
                    }
                }
            } else if (ahy.b(strCurrentName, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, obj, strCurrentName);
            } else if (!zuVarE.d(jsonParser, deserializationContext, strCurrentName, obj)) {
                if (this._anySetter != null) {
                    try {
                        this._anySetter.e(jsonParser, deserializationContext, obj, strCurrentName);
                    } catch (Exception e2) {
                        wrapAndThrow(e2, obj, strCurrentName, deserializationContext);
                    }
                } else {
                    handleUnknownProperty(jsonParser, deserializationContext, obj, strCurrentName);
                }
            }
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        return zuVarE.c(jsonParser, deserializationContext, obj);
    }

    protected Object c(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JavaType javaType = this.f54017a;
        return deserializationContext.reportBadDefinition(javaType, String.format("Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented", javaType));
    }
}
