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
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class zf extends BeanDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile transient NameTransformer f54046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected transient Exception f54047b;

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public /* synthetic */ BeanDeserializerBase withByNameInclusion(Set set, Set set2) {
        return e((Set<String>) set, (Set<String>) set2);
    }

    public zf(zi ziVar, BeanDescription beanDescription, zr zrVar, Map<String, SettableBeanProperty> map, HashSet<String> hashSet, boolean z, Set<String> set, boolean z2) {
        super(ziVar, beanDescription, zrVar, map, hashSet, z, set, z2);
    }

    protected zf(BeanDeserializerBase beanDeserializerBase) {
        super(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    protected zf(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(beanDeserializerBase, z);
    }

    protected zf(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase, nameTransformer);
    }

    public zf(BeanDeserializerBase beanDeserializerBase, aah aahVar) {
        super(beanDeserializerBase, aahVar);
    }

    public zf(BeanDeserializerBase beanDeserializerBase, Set<String> set, Set<String> set2) {
        super(beanDeserializerBase, set, set2);
    }

    public zf(BeanDeserializerBase beanDeserializerBase, zr zrVar) {
        super(beanDeserializerBase, zrVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        if (getClass() != zf.class || this.f54046a == nameTransformer) {
            return this;
        }
        this.f54046a = nameTransformer;
        try {
            return new zf(this, nameTransformer);
        } finally {
            this.f54046a = null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zf withObjectIdReader(aah aahVar) {
        return new zf(this, aahVar);
    }

    public zf e(Set<String> set, Set<String> set2) {
        return new zf(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnoreAllUnknown(boolean z) {
        return new zf(this, z);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(zr zrVar) {
        return new zf(this, zrVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return new zp(this, this._beanProperties.e());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.isExpectedStartObjectToken()) {
            if (this._vanillaProcessing) {
                return c(jsonParser, deserializationContext, jsonParser.nextToken());
            }
            jsonParser.nextToken();
            if (this._objectIdReader != null) {
                return deserializeWithObjectId(jsonParser, deserializationContext);
            }
            return deserializeFromObject(jsonParser, deserializationContext);
        }
        return e(jsonParser, deserializationContext, jsonParser.currentToken());
    }

    protected final Object e(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        if (jsonToken != null) {
            switch (AnonymousClass1.d[jsonToken.ordinal()]) {
                case 1:
                    return deserializeFromString(jsonParser, deserializationContext);
                case 2:
                    return deserializeFromNumber(jsonParser, deserializationContext);
                case 3:
                    return deserializeFromDouble(jsonParser, deserializationContext);
                case 4:
                    return deserializeFromEmbedded(jsonParser, deserializationContext);
                case 5:
                case 6:
                    return deserializeFromBoolean(jsonParser, deserializationContext);
                case 7:
                    return d(jsonParser, deserializationContext);
                case 8:
                    return _deserializeFromArray(jsonParser, deserializationContext);
                case 9:
                case 10:
                    if (this._vanillaProcessing) {
                        return c(jsonParser, deserializationContext, jsonToken);
                    }
                    if (this._objectIdReader != null) {
                        return deserializeWithObjectId(jsonParser, deserializationContext);
                    }
                    return deserializeFromObject(jsonParser, deserializationContext);
            }
        }
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        String strCurrentName;
        SettableBeanProperty settableBeanPropertyB;
        Class<?> activeView;
        jsonParser.setCurrentValue(obj);
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        if (this._unwrappedPropertyHandler != null) {
            return a(jsonParser, deserializationContext, obj);
        }
        if (this._externalTypeIdHandler != null) {
            return b(jsonParser, deserializationContext, obj);
        }
        if (jsonParser.isExpectedStartObjectToken()) {
            strCurrentName = jsonParser.nextFieldName();
            if (strCurrentName != null) {
                if (!this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
                    return d(jsonParser, deserializationContext, obj, activeView);
                }
                do {
                    jsonParser.nextToken();
                    settableBeanPropertyB = this._beanProperties.b(strCurrentName);
                    if (settableBeanPropertyB != null) {
                        try {
                            settableBeanPropertyB.deserializeAndSet(jsonParser, deserializationContext, obj);
                        } catch (Exception e) {
                            wrapAndThrow(e, obj, strCurrentName, deserializationContext);
                        }
                    } else {
                        handleUnknownVanilla(jsonParser, deserializationContext, obj, strCurrentName);
                    }
                    strCurrentName = jsonParser.nextFieldName();
                } while (strCurrentName != null);
            }
        } else if (jsonParser.hasTokenId(5)) {
            strCurrentName = jsonParser.currentName();
            if (!this._needViewProcesing) {
            }
            do {
                jsonParser.nextToken();
                settableBeanPropertyB = this._beanProperties.b(strCurrentName);
                if (settableBeanPropertyB != null) {
                    settableBeanPropertyB.deserializeAndSet(jsonParser, deserializationContext, obj);
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, obj, strCurrentName);
                }
                strCurrentName = jsonParser.nextFieldName();
            } while (strCurrentName != null);
        }
        return obj;
    }

    private final Object c(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(objCreateUsingDefault);
        if (jsonParser.hasTokenId(5)) {
            String strCurrentName = jsonParser.currentName();
            do {
                jsonParser.nextToken();
                SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
                if (settableBeanPropertyB != null) {
                    try {
                        settableBeanPropertyB.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, objCreateUsingDefault, strCurrentName, deserializationContext);
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, strCurrentName);
                }
                strCurrentName = jsonParser.nextFieldName();
            } while (strCurrentName != null);
        }
        return objCreateUsingDefault;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> activeView;
        Object objectId;
        if (this._objectIdReader != null && this._objectIdReader.e() && jsonParser.hasTokenId(5) && this._objectIdReader.b(jsonParser.currentName(), jsonParser)) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        if (this._nonStandardCreation) {
            if (this._unwrappedPropertyHandler != null) {
                return e(jsonParser, deserializationContext);
            }
            if (this._externalTypeIdHandler != null) {
                return c(jsonParser, deserializationContext);
            }
            return deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        }
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(objCreateUsingDefault);
        if (jsonParser.canReadObjectId() && (objectId = jsonParser.getObjectId()) != null) {
            _handleTypedObjectId(jsonParser, deserializationContext, objCreateUsingDefault, objectId);
        }
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return d(jsonParser, deserializationContext, objCreateUsingDefault, activeView);
        }
        if (jsonParser.hasTokenId(5)) {
            String strCurrentName = jsonParser.currentName();
            do {
                jsonParser.nextToken();
                SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
                if (settableBeanPropertyB != null) {
                    try {
                        settableBeanPropertyB.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, objCreateUsingDefault, strCurrentName, deserializationContext);
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, strCurrentName);
                }
                strCurrentName = jsonParser.nextFieldName();
            } while (strCurrentName != null);
        }
        return objCreateUsingDefault;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objA;
        Object objWrapInstantiationProblem;
        aag aagVar = this._propertyBasedCreator;
        aai aaiVarE = aagVar.e(jsonParser, deserializationContext, this._objectIdReader);
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        aii aiiVar = null;
        ArrayList arrayList = null;
        while (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyE = aagVar.e(strCurrentName);
            if (!aaiVarE.e(strCurrentName) || settableBeanPropertyE != null) {
                if (settableBeanPropertyE != null) {
                    if (activeView != null && !settableBeanPropertyE.visibleInView(activeView)) {
                        jsonParser.skipChildren();
                    } else if (aaiVarE.b(settableBeanPropertyE, a(jsonParser, deserializationContext, settableBeanPropertyE))) {
                        jsonParser.nextToken();
                        try {
                            objWrapInstantiationProblem = aagVar.a(deserializationContext, aaiVarE);
                        } catch (Exception e) {
                            objWrapInstantiationProblem = wrapInstantiationProblem(e, deserializationContext);
                        }
                        if (objWrapInstantiationProblem == null) {
                            return deserializationContext.handleInstantiationProblem(handledType(), null, a());
                        }
                        jsonParser.setCurrentValue(objWrapInstantiationProblem);
                        if (objWrapInstantiationProblem.getClass() != this._beanType.getRawClass()) {
                            return handlePolymorphic(jsonParser, deserializationContext, objWrapInstantiationProblem, aiiVar);
                        }
                        if (aiiVar != null) {
                            objWrapInstantiationProblem = handleUnknownProperties(deserializationContext, objWrapInstantiationProblem, aiiVar);
                        }
                        return deserialize(jsonParser, deserializationContext, objWrapInstantiationProblem);
                    }
                } else {
                    SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
                    if (settableBeanPropertyB != null) {
                        try {
                            aaiVarE.e(settableBeanPropertyB, a(jsonParser, deserializationContext, settableBeanPropertyB));
                        } catch (zm e2) {
                            a aVarB = b(deserializationContext, settableBeanPropertyB, aaiVarE, e2);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(aVarB);
                        }
                    } else if (ahy.b(strCurrentName, this._ignorableProps, this._includableProps)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strCurrentName);
                    } else if (this._anySetter != null) {
                        try {
                            aaiVarE.c(this._anySetter, strCurrentName, this._anySetter.c(jsonParser, deserializationContext));
                        } catch (Exception e3) {
                            wrapAndThrow(e3, this._beanType.getRawClass(), strCurrentName, deserializationContext);
                        }
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
            objA = aagVar.a(deserializationContext, aaiVarE);
        } catch (Exception e4) {
            wrapInstantiationProblem(e4, deserializationContext);
            objA = null;
        }
        if (this._injectables != null) {
            injectValues(deserializationContext, objA);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(objA);
            }
        }
        if (aiiVar == null) {
            return objA;
        }
        if (objA.getClass() != this._beanType.getRawClass()) {
            return handlePolymorphic(null, deserializationContext, objA, aiiVar);
        }
        return handleUnknownProperties(deserializationContext, objA, aiiVar);
    }

    private a b(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, aai aaiVar, zm zmVar) throws ym {
        a aVar = new a(deserializationContext, zmVar, settableBeanProperty.getType(), aaiVar, settableBeanProperty);
        zmVar.e().a((ReadableObjectId.Referring) aVar);
        return aVar;
    }

    protected final Object a(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws IOException {
        try {
            return settableBeanProperty.deserialize(jsonParser, deserializationContext);
        } catch (Exception e) {
            wrapAndThrow(e, this._beanType.getRawClass(), settableBeanProperty.getName(), deserializationContext);
            return null;
        }
    }

    protected Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.requiresCustomCodec()) {
            aii aiiVar = new aii(jsonParser, deserializationContext);
            aiiVar.writeEndObject();
            JsonParser jsonParserA = aiiVar.a(jsonParser);
            jsonParserA.nextToken();
            Object objC = this._vanillaProcessing ? c(jsonParserA, deserializationContext, JsonToken.END_OBJECT) : deserializeFromObject(jsonParserA, deserializationContext);
            jsonParserA.close();
            return objC;
        }
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public Object _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer = this._arrayDelegateDeserializer;
        if (jsonDeserializer != null || (jsonDeserializer = this._delegateDeserializer) != null) {
            Object objCreateUsingArrayDelegate = this._valueInstantiator.createUsingArrayDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingArrayDelegate);
            }
            return objCreateUsingArrayDelegate;
        }
        CoercionAction coercionAction_findCoercionFromEmptyArray = _findCoercionFromEmptyArray(deserializationContext);
        boolean zIsEnabled = deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zIsEnabled || coercionAction_findCoercionFromEmptyArray != CoercionAction.Fail) {
            if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                int i = AnonymousClass1.f54048a[coercionAction_findCoercionFromEmptyArray.ordinal()];
                if (i == 1) {
                    return getEmptyValue(deserializationContext);
                }
                if (i == 2 || i == 3) {
                    return getNullValue(deserializationContext);
                }
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
            }
            if (zIsEnabled) {
                if (jsonParser.nextToken() == JsonToken.START_ARRAY) {
                    JavaType valueType = getValueType(deserializationContext);
                    return deserializationContext.handleUnexpectedToken(valueType, JsonToken.START_ARRAY, jsonParser, "Cannot deserialize value of type %s from deeply-nested JSON Array: only single wrapper allowed with `%s`", ahw.a(valueType), "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS");
                }
                Object objDeserialize = deserialize(jsonParser, deserializationContext);
                if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return objDeserialize;
            }
        }
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
    }

    /* JADX INFO: renamed from: zf$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f54048a;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f54048a = iArr;
            try {
                iArr[CoercionAction.AsEmpty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54048a[CoercionAction.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54048a[CoercionAction.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            d = iArr2;
            try {
                iArr2[JsonToken.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                d[JsonToken.VALUE_TRUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                d[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                d[JsonToken.VALUE_NULL.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                d[JsonToken.START_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                d[JsonToken.FIELD_NAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                d[JsonToken.END_OBJECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    protected final Object d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) throws IOException {
        if (jsonParser.hasTokenId(5)) {
            String strCurrentName = jsonParser.currentName();
            do {
                jsonParser.nextToken();
                SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
                if (settableBeanPropertyB != null) {
                    if (!settableBeanPropertyB.visibleInView(cls)) {
                        jsonParser.skipChildren();
                    } else {
                        try {
                            settableBeanPropertyB.deserializeAndSet(jsonParser, deserializationContext, obj);
                        } catch (Exception e) {
                            wrapAndThrow(e, obj, strCurrentName, deserializationContext);
                        }
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, obj, strCurrentName);
                }
                strCurrentName = jsonParser.nextFieldName();
            } while (strCurrentName != null);
        }
        return obj;
    }

    protected Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._delegateDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, this._delegateDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (this._propertyBasedCreator != null) {
            return b(jsonParser, deserializationContext);
        }
        aii aiiVar = new aii(jsonParser, deserializationContext);
        aiiVar.writeStartObject();
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(objCreateUsingDefault);
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        String strCurrentName = jsonParser.hasTokenId(5) ? jsonParser.currentName() : null;
        while (strCurrentName != null) {
            jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
            if (settableBeanPropertyB != null) {
                if (activeView != null && !settableBeanPropertyB.visibleInView(activeView)) {
                    jsonParser.skipChildren();
                } else {
                    try {
                        settableBeanPropertyB.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, objCreateUsingDefault, strCurrentName, deserializationContext);
                    }
                }
            } else if (ahy.b(strCurrentName, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, objCreateUsingDefault, strCurrentName);
            } else if (this._anySetter == null) {
                aiiVar.writeFieldName(strCurrentName);
                aiiVar.copyCurrentStructure(jsonParser);
            } else {
                aii aiiVarE = aii.e(jsonParser);
                aiiVar.writeFieldName(strCurrentName);
                aiiVar.b(aiiVarE);
                try {
                    this._anySetter.e(aiiVarE.c(), deserializationContext, objCreateUsingDefault, strCurrentName);
                } catch (Exception e2) {
                    wrapAndThrow(e2, objCreateUsingDefault, strCurrentName, deserializationContext);
                }
            }
            strCurrentName = jsonParser.nextFieldName();
        }
        aiiVar.writeEndObject();
        this._unwrappedPropertyHandler.a(jsonParser, deserializationContext, objCreateUsingDefault, aiiVar);
        return objCreateUsingDefault;
    }

    protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == JsonToken.START_OBJECT) {
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        aii aiiVar = new aii(jsonParser, deserializationContext);
        aiiVar.writeStartObject();
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        while (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
            jsonParser.nextToken();
            if (settableBeanPropertyB != null) {
                if (activeView != null && !settableBeanPropertyB.visibleInView(activeView)) {
                    jsonParser.skipChildren();
                } else {
                    try {
                        settableBeanPropertyB.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, strCurrentName, deserializationContext);
                    }
                }
            } else if (ahy.b(strCurrentName, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, obj, strCurrentName);
            } else if (this._anySetter == null) {
                aiiVar.writeFieldName(strCurrentName);
                aiiVar.copyCurrentStructure(jsonParser);
            } else {
                aii aiiVarE = aii.e(jsonParser);
                aiiVar.writeFieldName(strCurrentName);
                aiiVar.b(aiiVarE);
                try {
                    this._anySetter.e(aiiVarE.c(), deserializationContext, obj, strCurrentName);
                } catch (Exception e2) {
                    wrapAndThrow(e2, obj, strCurrentName, deserializationContext);
                }
            }
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        aiiVar.writeEndObject();
        this._unwrappedPropertyHandler.a(jsonParser, deserializationContext, obj, aiiVar);
        return obj;
    }

    protected Object b(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objWrapInstantiationProblem;
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
                    if (aaiVarE.b(settableBeanPropertyE, a(jsonParser, deserializationContext, settableBeanPropertyE))) {
                        JsonToken jsonTokenNextToken = jsonParser.nextToken();
                        try {
                            objWrapInstantiationProblem = aagVar.a(deserializationContext, aaiVarE);
                        } catch (Exception e) {
                            objWrapInstantiationProblem = wrapInstantiationProblem(e, deserializationContext);
                        }
                        jsonParser.setCurrentValue(objWrapInstantiationProblem);
                        while (jsonTokenNextToken == JsonToken.FIELD_NAME) {
                            aiiVar.copyCurrentStructure(jsonParser);
                            jsonTokenNextToken = jsonParser.nextToken();
                        }
                        if (jsonTokenNextToken != JsonToken.END_OBJECT) {
                            deserializationContext.reportWrongTokenException(this, JsonToken.END_OBJECT, "Attempted to unwrap '%s' value", handledType().getName());
                        }
                        aiiVar.writeEndObject();
                        if (objWrapInstantiationProblem.getClass() != this._beanType.getRawClass()) {
                            deserializationContext.reportInputMismatch(settableBeanPropertyE, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                            return null;
                        }
                        return this._unwrappedPropertyHandler.a(jsonParser, deserializationContext, objWrapInstantiationProblem, aiiVar);
                    }
                } else {
                    SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
                    if (settableBeanPropertyB != null) {
                        aaiVarE.e(settableBeanPropertyB, a(jsonParser, deserializationContext, settableBeanPropertyB));
                    } else if (ahy.b(strCurrentName, this._ignorableProps, this._includableProps)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strCurrentName);
                    } else if (this._anySetter == null) {
                        aiiVar.writeFieldName(strCurrentName);
                        aiiVar.copyCurrentStructure(jsonParser);
                    } else {
                        aii aiiVarE = aii.e(jsonParser);
                        aiiVar.writeFieldName(strCurrentName);
                        aiiVar.b(aiiVarE);
                        try {
                            aaiVarE.c(this._anySetter, strCurrentName, this._anySetter.c(aiiVarE.c(), deserializationContext));
                        } catch (Exception e2) {
                            wrapAndThrow(e2, this._beanType.getRawClass(), strCurrentName, deserializationContext);
                        }
                    }
                }
            }
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        try {
            return this._unwrappedPropertyHandler.a(jsonParser, deserializationContext, aagVar.a(deserializationContext, aaiVarE), aiiVar);
        } catch (Exception e3) {
            wrapInstantiationProblem(e3, deserializationContext);
            return null;
        }
    }

    protected Object c(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return a(jsonParser, deserializationContext);
        }
        if (this._delegateDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, this._delegateDeserializer.deserialize(jsonParser, deserializationContext));
        }
        return b(jsonParser, deserializationContext, this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    protected Object b(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return d(jsonParser, deserializationContext, obj, this._externalTypeIdHandler.e());
    }

    protected Object d(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, zu zuVar) throws IOException {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        while (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
            if (settableBeanPropertyB != null) {
                if (jsonTokenNextToken.isScalarValue()) {
                    zuVar.b(jsonParser, deserializationContext, strCurrentName, obj);
                }
                if (activeView != null && !settableBeanPropertyB.visibleInView(activeView)) {
                    jsonParser.skipChildren();
                } else {
                    try {
                        settableBeanPropertyB.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, strCurrentName, deserializationContext);
                    }
                }
            } else if (ahy.b(strCurrentName, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, obj, strCurrentName);
            } else if (!zuVar.d(jsonParser, deserializationContext, strCurrentName, obj)) {
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
        return zuVar.c(jsonParser, deserializationContext, obj);
    }

    protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        zu zuVarE = this._externalTypeIdHandler.e();
        aag aagVar = this._propertyBasedCreator;
        aai aaiVarE = aagVar.e(jsonParser, deserializationContext, this._objectIdReader);
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        while (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            SettableBeanProperty settableBeanPropertyE = aagVar.e(strCurrentName);
            if (!aaiVarE.e(strCurrentName) || settableBeanPropertyE != null) {
                if (settableBeanPropertyE != null) {
                    if (!zuVarE.d(jsonParser, deserializationContext, strCurrentName, null) && aaiVarE.b(settableBeanPropertyE, a(jsonParser, deserializationContext, settableBeanPropertyE))) {
                        jsonParser.nextToken();
                        try {
                            Object objA = aagVar.a(deserializationContext, aaiVarE);
                            if (objA.getClass() != this._beanType.getRawClass()) {
                                return deserializationContext.reportBadDefinition(this._beanType, String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", this._beanType, objA.getClass()));
                            }
                            return d(jsonParser, deserializationContext, objA, zuVarE);
                        } catch (Exception e) {
                            wrapAndThrow(e, this._beanType.getRawClass(), strCurrentName, deserializationContext);
                        }
                    }
                } else {
                    SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
                    if (settableBeanPropertyB != null) {
                        if (jsonTokenNextToken.isScalarValue()) {
                            zuVarE.b(jsonParser, deserializationContext, strCurrentName, null);
                        }
                        if (activeView != null && !settableBeanPropertyB.visibleInView(activeView)) {
                            jsonParser.skipChildren();
                        } else {
                            aaiVarE.e(settableBeanPropertyB, settableBeanPropertyB.deserialize(jsonParser, deserializationContext));
                        }
                    } else if (!zuVarE.d(jsonParser, deserializationContext, strCurrentName, null)) {
                        if (ahy.b(strCurrentName, this._ignorableProps, this._includableProps)) {
                            handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strCurrentName);
                        } else if (this._anySetter != null) {
                            aaiVarE.c(this._anySetter, strCurrentName, this._anySetter.c(jsonParser, deserializationContext));
                        } else {
                            handleUnknownProperty(jsonParser, deserializationContext, this._valueClass, strCurrentName);
                        }
                    }
                }
            }
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        try {
            return zuVarE.c(jsonParser, deserializationContext, aaiVarE, aagVar);
        } catch (Exception e2) {
            return wrapInstantiationProblem(e2, deserializationContext);
        }
    }

    protected Exception a() {
        if (this.f54047b == null) {
            this.f54047b = new NullPointerException("JSON Creator returned null");
        }
        return this.f54047b;
    }

    static class a extends ReadableObjectId.Referring {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SettableBeanProperty f54049b;
        private final DeserializationContext d;
        private Object e;

        a(DeserializationContext deserializationContext, zm zmVar, JavaType javaType, aai aaiVar, SettableBeanProperty settableBeanProperty) {
            super(zmVar, javaType);
            this.d = deserializationContext;
            this.f54049b = settableBeanProperty;
        }

        public void a(Object obj) {
            this.e = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
            if (this.e == null) {
                DeserializationContext deserializationContext = this.d;
                SettableBeanProperty settableBeanProperty = this.f54049b;
                deserializationContext.reportInputMismatch(settableBeanProperty, "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", settableBeanProperty.getName(), this.f54049b.getDeclaringClass().getName());
            }
            this.f54049b.set(this.e, obj2);
        }
    }
}
