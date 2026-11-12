package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.bip;
import defpackage.esd;
import defpackage.fh2;
import defpackage.gh2;
import defpackage.ldi;
import defpackage.pk8;
import defpackage.qdi;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class BeanDeserializer extends BeanDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;
    private volatile transient NameTransformer _currentlyTransforming;
    protected transient Exception _nullFromCreator;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7639a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f7639a = iArr;
            try {
                iArr[JsonToken.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7639a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7639a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7639a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7639a[JsonToken.VALUE_TRUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7639a[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7639a[JsonToken.VALUE_NULL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7639a[JsonToken.START_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7639a[JsonToken.FIELD_NAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7639a[JsonToken.END_OBJECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class b extends com.fasterxml.jackson.databind.deser.impl.a.AbstractC0178a {
        public final DeserializationContext c;
        public final SettableBeanProperty d;
        public Object e;

        public b(DeserializationContext deserializationContext, UnresolvedForwardReference unresolvedForwardReference, JavaType javaType, qdi qdiVar, SettableBeanProperty settableBeanProperty) {
            super(unresolvedForwardReference, javaType);
            this.c = deserializationContext;
            this.d = settableBeanProperty;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.a.AbstractC0178a
        public void c(Object obj, Object obj2) throws IOException {
            if (this.e == null) {
                DeserializationContext deserializationContext = this.c;
                SettableBeanProperty settableBeanProperty = this.d;
                deserializationContext.reportInputMismatch(settableBeanProperty, "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", settableBeanProperty.getName(), this.d.getDeclaringClass().getName());
            }
            this.d.set(this.e, obj2);
        }

        public void e(Object obj) {
            this.e = obj;
        }
    }

    public BeanDeserializer(gh2 gh2Var, fh2 fh2Var, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, HashSet<String> hashSet, boolean z, boolean z2) {
        super(gh2Var, fh2Var, beanPropertyMap, map, hashSet, z, z2);
    }

    private b handleUnresolvedReference(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, qdi qdiVar, UnresolvedForwardReference unresolvedForwardReference) throws JsonMappingException {
        b bVar = new b(deserializationContext, unresolvedForwardReference, settableBeanProperty.getType(), qdiVar, settableBeanProperty);
        unresolvedForwardReference.getRoid().a(bVar);
        return bVar;
    }

    private final Object vanillaDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.M0(objCreateUsingDefault);
        if (jsonParser.z0(5)) {
            String strJ = jsonParser.J();
            do {
                jsonParser.G0();
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
                if (settableBeanPropertyFind != null) {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, objCreateUsingDefault, strJ, deserializationContext);
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, strJ);
                }
                strJ = jsonParser.E0();
            } while (strJ != null);
        }
        return objCreateUsingDefault;
    }

    public Exception _creatorReturnedNullException() {
        if (this._nullFromCreator == null) {
            this._nullFromCreator = new NullPointerException("JSON Creator returned null");
        }
        return this._nullFromCreator;
    }

    public final Object _deserializeOther(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        if (jsonToken != null) {
            switch (a.f7639a[jsonToken.ordinal()]) {
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
                    return deserializeFromNull(jsonParser, deserializationContext);
                case 8:
                    return deserializeFromArray(jsonParser, deserializationContext);
                case 9:
                case 10:
                    if (this._vanillaProcessing) {
                        return vanillaDeserialize(jsonParser, deserializationContext, jsonToken);
                    }
                    return this._objectIdReader != null ? deserializeWithObjectId(jsonParser, deserializationContext) : deserializeFromObject(jsonParser, deserializationContext);
            }
        }
        return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objA;
        Object objWrapInstantiationProblem;
        ldi ldiVar = this._propertyBasedCreator;
        qdi qdiVarG = ldiVar.g(jsonParser, deserializationContext, this._objectIdReader);
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenK = jsonParser.K();
        ArrayList arrayList = null;
        bip bipVar = null;
        while (jsonTokenK == JsonToken.FIELD_NAME) {
            String strJ = jsonParser.J();
            jsonParser.G0();
            if (!qdiVarG.i(strJ)) {
                SettableBeanProperty settableBeanPropertyE = ldiVar.e(strJ);
                if (settableBeanPropertyE == null) {
                    SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
                    if (settableBeanPropertyFind != null) {
                        try {
                            qdiVarG.e(settableBeanPropertyFind, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyFind));
                        } catch (UnresolvedForwardReference e) {
                            b bVarHandleUnresolvedReference = handleUnresolvedReference(deserializationContext, settableBeanPropertyFind, qdiVarG, e);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(bVarHandleUnresolvedReference);
                        }
                    } else {
                        Set<String> set = this._ignorableProps;
                        if (set == null || !set.contains(strJ)) {
                            SettableAnyProperty settableAnyProperty = this._anySetter;
                            if (settableAnyProperty != null) {
                                try {
                                    qdiVarG.c(settableAnyProperty, strJ, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                                } catch (Exception e2) {
                                    wrapAndThrow(e2, this._beanType.getRawClass(), strJ, deserializationContext);
                                }
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
                } else if (activeView != null && !settableBeanPropertyE.visibleInView(activeView)) {
                    jsonParser.O0();
                } else if (qdiVarG.b(settableBeanPropertyE, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyE))) {
                    jsonParser.G0();
                    try {
                        objWrapInstantiationProblem = ldiVar.a(deserializationContext, qdiVarG);
                    } catch (Exception e3) {
                        objWrapInstantiationProblem = wrapInstantiationProblem(e3, deserializationContext);
                    }
                    if (objWrapInstantiationProblem == null) {
                        return deserializationContext.handleInstantiationProblem(handledType(), null, _creatorReturnedNullException());
                    }
                    jsonParser.M0(objWrapInstantiationProblem);
                    if (objWrapInstantiationProblem.getClass() != this._beanType.getRawClass()) {
                        return handlePolymorphic(jsonParser, deserializationContext, objWrapInstantiationProblem, bipVar);
                    }
                    if (bipVar != null) {
                        objWrapInstantiationProblem = handleUnknownProperties(deserializationContext, objWrapInstantiationProblem, bipVar);
                    }
                    return deserialize(jsonParser, deserializationContext, objWrapInstantiationProblem);
                }
            }
            jsonTokenK = jsonParser.G0();
        }
        try {
            objA = ldiVar.a(deserializationContext, qdiVarG);
        } catch (Exception e4) {
            wrapInstantiationProblem(e4, deserializationContext);
            objA = null;
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).e(objA);
            }
        }
        if (bipVar != null) {
            return objA.getClass() != this._beanType.getRawClass() ? handlePolymorphic(null, deserializationContext, objA, bipVar) : handleUnknownProperties(deserializationContext, objA, bipVar);
        }
        return objA;
    }

    public final Object _deserializeWithErrorWrapping(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws IOException {
        try {
            return settableBeanProperty.deserialize(jsonParser, deserializationContext);
        } catch (Exception e) {
            wrapAndThrow(e, this._beanType.getRawClass(), settableBeanProperty.getName(), deserializationContext);
            return null;
        }
    }

    @Deprecated
    public Object _missingToken(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        throw deserializationContext.endOfInputException(handledType());
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return new BeanAsArrayDeserializer(this, this._beanProperties.getPropertiesInInsertionOrder());
    }

    @Override // defpackage.esd
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.C0()) {
            return _deserializeOther(jsonParser, deserializationContext, jsonParser.K());
        }
        if (this._vanillaProcessing) {
            return vanillaDeserialize(jsonParser, deserializationContext, jsonParser.G0());
        }
        jsonParser.G0();
        return this._objectIdReader != null ? deserializeWithObjectId(jsonParser, deserializationContext) : deserializeFromObject(jsonParser, deserializationContext);
    }

    public Object deserializeFromNull(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.L0()) {
            return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
        bip bipVar = new bip(jsonParser, deserializationContext);
        bipVar.m0();
        JsonParser jsonParserH1 = bipVar.h1(jsonParser);
        jsonParserH1.G0();
        Object objVanillaDeserialize = this._vanillaProcessing ? vanillaDeserialize(jsonParserH1, deserializationContext, JsonToken.END_OBJECT) : deserializeFromObject(jsonParserH1, deserializationContext);
        jsonParserH1.close();
        return objVanillaDeserialize;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> activeView;
        Object objZ;
        ObjectIdReader objectIdReader = this._objectIdReader;
        if (objectIdReader != null && objectIdReader.maySerializeAsObject() && jsonParser.z0(5) && this._objectIdReader.isValidReferencePropertyName(jsonParser.J(), jsonParser)) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        if (this._nonStandardCreation) {
            if (this._unwrappedPropertyHandler != null) {
                return deserializeWithUnwrapped(jsonParser, deserializationContext);
            }
            if (this._externalTypeIdHandler != null) {
                return deserializeWithExternalTypeId(jsonParser, deserializationContext);
            }
            Object objDeserializeFromObjectUsingNonDefault = deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
            if (this._injectables != null) {
                injectValues(deserializationContext, objDeserializeFromObjectUsingNonDefault);
            }
            return objDeserializeFromObjectUsingNonDefault;
        }
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.M0(objCreateUsingDefault);
        if (jsonParser.c() && (objZ = jsonParser.Z()) != null) {
            _handleTypedObjectId(jsonParser, deserializationContext, objCreateUsingDefault, objZ);
        }
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return deserializeWithView(jsonParser, deserializationContext, objCreateUsingDefault, activeView);
        }
        if (jsonParser.z0(5)) {
            String strJ = jsonParser.J();
            do {
                jsonParser.G0();
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
                if (settableBeanPropertyFind != null) {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, objCreateUsingDefault, strJ, deserializationContext);
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, strJ);
                }
                strJ = jsonParser.E0();
            } while (strJ != null);
        }
        return objCreateUsingDefault;
    }

    public Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        pk8 pk8VarI = this._externalTypeIdHandler.i();
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
                if (!pk8VarI.g(jsonParser, deserializationContext, strJ, null) && qdiVarG.b(settableBeanPropertyE, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyE))) {
                    JsonToken jsonTokenG0 = jsonParser.G0();
                    try {
                        Object objA = ldiVar.a(deserializationContext, qdiVarG);
                        while (jsonTokenG0 == JsonToken.FIELD_NAME) {
                            jsonParser.G0();
                            bipVar.k1(jsonParser);
                            jsonTokenG0 = jsonParser.G0();
                        }
                        if (objA.getClass() == this._beanType.getRawClass()) {
                            return pk8VarI.f(jsonParser, deserializationContext, objA);
                        }
                        JavaType javaType = this._beanType;
                        return deserializationContext.reportBadDefinition(javaType, String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", javaType, objA.getClass()));
                    } catch (Exception e) {
                        wrapAndThrow(e, this._beanType.getRawClass(), strJ, deserializationContext);
                    }
                }
            } else if (!qdiVarG.i(strJ)) {
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
                if (settableBeanPropertyFind != null) {
                    qdiVarG.e(settableBeanPropertyFind, settableBeanPropertyFind.deserialize(jsonParser, deserializationContext));
                } else if (!pk8VarI.g(jsonParser, deserializationContext, strJ, null)) {
                    Set<String> set = this._ignorableProps;
                    if (set == null || !set.contains(strJ)) {
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
            return pk8VarI.e(jsonParser, deserializationContext, qdiVarG, ldiVar);
        } catch (Exception e2) {
            return wrapInstantiationProblem(e2, deserializationContext);
        }
    }

    public Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objWrapInstantiationProblem;
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
                if (qdiVarG.b(settableBeanPropertyE, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyE))) {
                    JsonToken jsonTokenG0 = jsonParser.G0();
                    try {
                        objWrapInstantiationProblem = ldiVar.a(deserializationContext, qdiVarG);
                    } catch (Exception e) {
                        objWrapInstantiationProblem = wrapInstantiationProblem(e, deserializationContext);
                    }
                    jsonParser.M0(objWrapInstantiationProblem);
                    while (jsonTokenG0 == JsonToken.FIELD_NAME) {
                        bipVar.k1(jsonParser);
                        jsonTokenG0 = jsonParser.G0();
                    }
                    JsonToken jsonToken = JsonToken.END_OBJECT;
                    if (jsonTokenG0 != jsonToken) {
                        deserializationContext.reportWrongTokenException(this, jsonToken, "Attempted to unwrap '%s' value", handledType().getName());
                    }
                    bipVar.m0();
                    if (objWrapInstantiationProblem.getClass() == this._beanType.getRawClass()) {
                        return this._unwrappedPropertyHandler.b(jsonParser, deserializationContext, objWrapInstantiationProblem, bipVar);
                    }
                    deserializationContext.reportInputMismatch(settableBeanPropertyE, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                    return null;
                }
            } else if (!qdiVarG.i(strJ)) {
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
                if (settableBeanPropertyFind != null) {
                    qdiVarG.e(settableBeanPropertyFind, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyFind));
                } else {
                    Set<String> set = this._ignorableProps;
                    if (set != null && set.contains(strJ)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strJ);
                    } else if (this._anySetter == null) {
                        bipVar.r0(strJ);
                        bipVar.k1(jsonParser);
                    } else {
                        bip bipVarE1 = bip.e1(jsonParser);
                        bipVar.r0(strJ);
                        bipVar.d1(bipVarE1);
                        try {
                            SettableAnyProperty settableAnyProperty = this._anySetter;
                            qdiVarG.c(settableAnyProperty, strJ, settableAnyProperty.deserialize(bipVarE1.i1(), deserializationContext));
                        } catch (Exception e2) {
                            wrapAndThrow(e2, this._beanType.getRawClass(), strJ, deserializationContext);
                        }
                    }
                }
            }
            jsonTokenK = jsonParser.G0();
        }
        try {
            return this._unwrappedPropertyHandler.b(jsonParser, deserializationContext, ldiVar.a(deserializationContext, qdiVarG), bipVar);
        } catch (Exception e3) {
            wrapInstantiationProblem(e3, deserializationContext);
            return null;
        }
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithExternalTypeId(jsonParser, deserializationContext);
        }
        esd<Object> esdVar = this._delegateDeserializer;
        return esdVar != null ? this._valueInstantiator.createUsingDelegate(deserializationContext, esdVar.deserialize(jsonParser, deserializationContext)) : deserializeWithExternalTypeId(jsonParser, deserializationContext, this._valueInstantiator.createUsingDefault(deserializationContext));
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
        jsonParser.M0(objCreateUsingDefault);
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        String strJ = jsonParser.z0(5) ? jsonParser.J() : null;
        while (strJ != null) {
            jsonParser.G0();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
            if (settableBeanPropertyFind == null) {
                Set<String> set = this._ignorableProps;
                if (set != null && set.contains(strJ)) {
                    handleIgnoredProperty(jsonParser, deserializationContext, objCreateUsingDefault, strJ);
                } else if (this._anySetter == null) {
                    bipVar.r0(strJ);
                    bipVar.k1(jsonParser);
                } else {
                    bip bipVarE1 = bip.e1(jsonParser);
                    bipVar.r0(strJ);
                    bipVar.d1(bipVarE1);
                    try {
                        this._anySetter.deserializeAndSet(bipVarE1.i1(), deserializationContext, objCreateUsingDefault, strJ);
                    } catch (Exception e) {
                        wrapAndThrow(e, objCreateUsingDefault, strJ, deserializationContext);
                    }
                }
            } else if (activeView == null || settableBeanPropertyFind.visibleInView(activeView)) {
                try {
                    settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                } catch (Exception e2) {
                    wrapAndThrow(e2, objCreateUsingDefault, strJ, deserializationContext);
                }
            } else {
                jsonParser.O0();
            }
            strJ = jsonParser.E0();
        }
        bipVar.m0();
        this._unwrappedPropertyHandler.b(jsonParser, deserializationContext, objCreateUsingDefault, bipVar);
        return objCreateUsingDefault;
    }

    public final Object deserializeWithView(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) throws IOException {
        if (jsonParser.z0(5)) {
            String strJ = jsonParser.J();
            do {
                jsonParser.G0();
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
                if (settableBeanPropertyFind == null) {
                    handleUnknownVanilla(jsonParser, deserializationContext, obj, strJ);
                } else if (settableBeanPropertyFind.visibleInView(cls)) {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, strJ, deserializationContext);
                    }
                } else {
                    jsonParser.O0();
                }
                strJ = jsonParser.E0();
            } while (strJ != null);
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, defpackage.esd
    public esd<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        if (getClass() != BeanDeserializer.class || this._currentlyTransforming == nameTransformer) {
            return this;
        }
        this._currentlyTransforming = nameTransformer;
        try {
            return new BeanDeserializer(this, nameTransformer);
        } finally {
            this._currentlyTransforming = null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BeanDeserializer(this, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public /* bridge */ /* synthetic */ BeanDeserializerBase withIgnorableProperties(Set set) {
        return withIgnorableProperties((Set<String>) set);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase) {
        super(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializer withIgnorableProperties(Set<String> set) {
        return new BeanDeserializer(this, set);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializer withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanDeserializer(this, objectIdReader);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(beanDeserializerBase, z);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase, nameTransformer);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase, objectIdReader);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        super(beanDeserializerBase, set);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase, beanPropertyMap);
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
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
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

    @Override // defpackage.esd
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        String strJ;
        Class<?> activeView;
        jsonParser.M0(obj);
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        if (this._unwrappedPropertyHandler != null) {
            return deserializeWithUnwrapped(jsonParser, deserializationContext, obj);
        }
        if (this._externalTypeIdHandler != null) {
            return deserializeWithExternalTypeId(jsonParser, deserializationContext, obj);
        }
        if (jsonParser.C0()) {
            strJ = jsonParser.E0();
            if (strJ == null) {
                return obj;
            }
        } else {
            if (jsonParser.z0(5)) {
                strJ = jsonParser.J();
            }
            return obj;
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return deserializeWithView(jsonParser, deserializationContext, obj, activeView);
        }
        do {
            jsonParser.G0();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
            if (settableBeanPropertyFind != null) {
                try {
                    settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    wrapAndThrow(e, obj, strJ, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, obj, strJ);
            }
            strJ = jsonParser.E0();
        } while (strJ != null);
        return obj;
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        JsonToken jsonTokenK = jsonParser.K();
        if (jsonTokenK == JsonToken.START_OBJECT) {
            jsonTokenK = jsonParser.G0();
        }
        bip bipVar = new bip(jsonParser, deserializationContext);
        bipVar.N0();
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        while (jsonTokenK == JsonToken.FIELD_NAME) {
            String strJ = jsonParser.J();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
            jsonParser.G0();
            if (settableBeanPropertyFind != null) {
                if (activeView != null && !settableBeanPropertyFind.visibleInView(activeView)) {
                    jsonParser.O0();
                } else {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, strJ, deserializationContext);
                    }
                }
            } else {
                Set<String> set = this._ignorableProps;
                if (set != null && set.contains(strJ)) {
                    handleIgnoredProperty(jsonParser, deserializationContext, obj, strJ);
                } else if (this._anySetter == null) {
                    bipVar.r0(strJ);
                    bipVar.k1(jsonParser);
                } else {
                    bip bipVarE1 = bip.e1(jsonParser);
                    bipVar.r0(strJ);
                    bipVar.d1(bipVarE1);
                    try {
                        this._anySetter.deserializeAndSet(bipVarE1.i1(), deserializationContext, obj, strJ);
                    } catch (Exception e2) {
                        wrapAndThrow(e2, obj, strJ, deserializationContext);
                    }
                }
            }
            jsonTokenK = jsonParser.G0();
        }
        bipVar.m0();
        this._unwrappedPropertyHandler.b(jsonParser, deserializationContext, obj, bipVar);
        return obj;
    }
}
