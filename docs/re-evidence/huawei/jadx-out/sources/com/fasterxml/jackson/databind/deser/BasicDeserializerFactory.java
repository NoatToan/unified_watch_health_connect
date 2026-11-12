package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators;
import com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.huawei.operation.utils.Constants;
import defpackage.aar;
import defpackage.aas;
import defpackage.aat;
import defpackage.aaw;
import defpackage.aax;
import defpackage.aay;
import defpackage.aaz;
import defpackage.abc;
import defpackage.abd;
import defpackage.abe;
import defpackage.abg;
import defpackage.abl;
import defpackage.abm;
import defpackage.abn;
import defpackage.abo;
import defpackage.abq;
import defpackage.abu;
import defpackage.abv;
import defpackage.acd;
import defpackage.ach;
import defpackage.ack;
import defpackage.aco;
import defpackage.acp;
import defpackage.acq;
import defpackage.add;
import defpackage.adg;
import defpackage.ahb;
import defpackage.ahe;
import defpackage.ahg;
import defpackage.ahh;
import defpackage.ahi;
import defpackage.ahk;
import defpackage.ahp;
import defpackage.ahw;
import defpackage.ahz;
import defpackage.aih;
import defpackage.aii;
import defpackage.yi;
import defpackage.ym;
import defpackage.yq;
import defpackage.ys;
import defpackage.yx;
import defpackage.zd;
import defpackage.zh;
import defpackage.zo;
import defpackage.zs;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BasicDeserializerFactory extends DeserializerFactory implements Serializable {
    protected final yx _factoryConfig;
    private static final Class<?> CLASS_OBJECT = Object.class;
    private static final Class<?> CLASS_STRING = String.class;
    private static final Class<?> CLASS_CHAR_SEQUENCE = CharSequence.class;
    private static final Class<?> CLASS_ITERABLE = Iterable.class;
    private static final Class<?> CLASS_MAP_ENTRY = Map.Entry.class;
    private static final Class<?> CLASS_SERIALIZABLE = Serializable.class;
    protected static final ys UNWRAPPED_CREATOR_PARAM_NAME = new ys("@JsonUnwrapped");

    protected abstract DeserializerFactory withConfig(yx yxVar);

    public BasicDeserializerFactory(yx yxVar) {
        this._factoryConfig = yxVar;
    }

    public yx getFactoryConfig() {
        return this._factoryConfig;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final DeserializerFactory withAdditionalDeserializers(Deserializers deserializers) {
        return withConfig(this._factoryConfig.e(deserializers));
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers keyDeserializers) {
        return withConfig(this._factoryConfig.d(keyDeserializers));
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final DeserializerFactory withDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
        return withConfig(this._factoryConfig.b(beanDeserializerModifier));
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
        return withConfig(this._factoryConfig.a(abstractTypeResolver));
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public final DeserializerFactory withValueInstantiators(ValueInstantiators valueInstantiators) {
        return withConfig(this._factoryConfig.e(valueInstantiators));
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JavaType mapAbstractType(yi yiVar, JavaType javaType) throws ym {
        while (true) {
            JavaType javaType_mapAbstractType2 = _mapAbstractType2(yiVar, javaType);
            if (javaType_mapAbstractType2 == null) {
                return javaType;
            }
            Class<?> rawClass = javaType.getRawClass();
            Class<?> rawClass2 = javaType_mapAbstractType2.getRawClass();
            if (rawClass == rawClass2 || !rawClass.isAssignableFrom(rawClass2)) {
                throw new IllegalArgumentException("Invalid abstract type resolution from " + javaType + " to " + javaType_mapAbstractType2 + ": latter is not a subtype of former");
            }
            javaType = javaType_mapAbstractType2;
        }
    }

    private JavaType _mapAbstractType2(yi yiVar, JavaType javaType) throws ym {
        Class<?> rawClass = javaType.getRawClass();
        if (!this._factoryConfig.c()) {
            return null;
        }
        Iterator<AbstractTypeResolver> it = this._factoryConfig.a().iterator();
        while (it.hasNext()) {
            JavaType javaTypeFindTypeMapping = it.next().findTypeMapping(yiVar, javaType);
            if (javaTypeFindTypeMapping != null && !javaTypeFindTypeMapping.hasRawClass(rawClass)) {
                return javaTypeFindTypeMapping;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) throws ym {
        yi config = deserializationContext.getConfig();
        ack classInfo = beanDescription.getClassInfo();
        Object objFindValueInstantiator = deserializationContext.getAnnotationIntrospector().findValueInstantiator(classInfo);
        ValueInstantiator valueInstantiator_valueInstantiatorInstance = objFindValueInstantiator != null ? _valueInstantiatorInstance(config, classInfo, objFindValueInstantiator) : null;
        if (valueInstantiator_valueInstantiatorInstance == null && (valueInstantiator_valueInstantiatorInstance = JDKValueInstantiators.findStdValueInstantiator(config, beanDescription.getBeanClass())) == null) {
            valueInstantiator_valueInstantiatorInstance = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
        }
        if (this._factoryConfig.g()) {
            for (ValueInstantiators valueInstantiators : this._factoryConfig.f()) {
                valueInstantiator_valueInstantiatorInstance = valueInstantiators.findValueInstantiator(config, beanDescription, valueInstantiator_valueInstantiatorInstance);
                if (valueInstantiator_valueInstantiatorInstance == null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", valueInstantiators.getClass().getName());
                }
            }
        }
        return valueInstantiator_valueInstantiatorInstance != null ? valueInstantiator_valueInstantiatorInstance.createContextual(deserializationContext, beanDescription) : valueInstantiator_valueInstantiatorInstance;
    }

    protected ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) throws ym {
        ArrayList arrayList;
        ach achVarC;
        yi config = deserializationContext.getConfig();
        VisibilityChecker<?> defaultVisibilityChecker = config.getDefaultVisibilityChecker(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        ConstructorDetector constructorDetectorB = config.b();
        c cVar = new c(deserializationContext, beanDescription, defaultVisibilityChecker, new zs(beanDescription, config), _findCreatorsFromProperties(deserializationContext, beanDescription));
        _addExplicitFactoryCreators(deserializationContext, cVar, !constructorDetectorB.b());
        if (beanDescription.getType().isConcrete()) {
            if (beanDescription.getType().isRecordType() && (achVarC = add.c(deserializationContext, beanDescription, (arrayList = new ArrayList()))) != null) {
                _addRecordConstructor(deserializationContext, cVar, achVarC, arrayList);
                return cVar.d.c(deserializationContext);
            }
            if (!beanDescription.isNonStaticInnerClass()) {
                _addExplicitConstructorCreators(deserializationContext, cVar, constructorDetectorB.a(beanDescription.getBeanClass()));
                if (cVar.d() && !cVar.b()) {
                    _addImplicitConstructorCreators(deserializationContext, cVar, cVar.j());
                }
            }
        }
        if (cVar.e() && !cVar.a() && !cVar.b()) {
            _addImplicitFactoryCreators(deserializationContext, cVar, cVar.h());
        }
        return cVar.d.c(deserializationContext);
    }

    protected Map<AnnotatedWithParams, BeanPropertyDefinition[]> _findCreatorsFromProperties(DeserializationContext deserializationContext, BeanDescription beanDescription) throws ym {
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> linkedHashMap = Collections.EMPTY_MAP;
        for (BeanPropertyDefinition beanPropertyDefinition : beanDescription.findProperties()) {
            Iterator<acp> constructorParameters = beanPropertyDefinition.getConstructorParameters();
            while (constructorParameters.hasNext()) {
                acp next = constructorParameters.next();
                AnnotatedWithParams annotatedWithParamsE = next.e();
                BeanPropertyDefinition[] beanPropertyDefinitionArr = linkedHashMap.get(annotatedWithParamsE);
                int iD = next.d();
                if (beanPropertyDefinitionArr == null) {
                    if (linkedHashMap.isEmpty()) {
                        linkedHashMap = new LinkedHashMap<>();
                    }
                    beanPropertyDefinitionArr = new BeanPropertyDefinition[annotatedWithParamsE.getParameterCount()];
                    linkedHashMap.put(annotatedWithParamsE, beanPropertyDefinitionArr);
                } else {
                    BeanPropertyDefinition beanPropertyDefinition2 = beanPropertyDefinitionArr[iD];
                    if (beanPropertyDefinition2 != null) {
                        deserializationContext.reportBadTypeDefinition(beanDescription, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(iD), annotatedWithParamsE, beanPropertyDefinition2, beanPropertyDefinition);
                    }
                }
                beanPropertyDefinitionArr[iD] = beanPropertyDefinition;
            }
        }
        return linkedHashMap;
    }

    public ValueInstantiator _valueInstantiatorInstance(yi yiVar, Annotated annotated, Object obj) throws ym {
        ValueInstantiator valueInstantiatorValueInstantiatorInstance;
        if (obj == null) {
            return null;
        }
        if (obj instanceof ValueInstantiator) {
            return (ValueInstantiator) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
        }
        Class<?> cls = (Class) obj;
        if (ahw.l(cls)) {
            return null;
        }
        if (!ValueInstantiator.class.isAssignableFrom(cls)) {
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<ValueInstantiator>");
        }
        HandlerInstantiator handlerInstantiator = yiVar.getHandlerInstantiator();
        return (handlerInstantiator == null || (valueInstantiatorValueInstantiatorInstance = handlerInstantiator.valueInstantiatorInstance(yiVar, annotated, cls)) == null) ? (ValueInstantiator) ahw.b(cls, yiVar.canOverrideAccessModifiers()) : valueInstantiatorValueInstantiatorInstance;
    }

    protected void _addRecordConstructor(DeserializationContext deserializationContext, c cVar, ach achVar, List<String> list) throws ym {
        int parameterCount = achVar.getParameterCount();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[parameterCount];
        for (int i = 0; i < parameterCount; i++) {
            acp parameter = achVar.getParameter(i);
            JacksonInject.b bVarFindInjectableValue = annotationIntrospector.findInjectableValue(parameter);
            ys ysVarFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(parameter);
            if (ysVarFindNameForDeserialization == null || ysVarFindNameForDeserialization.a()) {
                ysVarFindNameForDeserialization = ys.c(list.get(i));
            }
            settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, cVar.e, ysVarFindNameForDeserialization, i, parameter, bVarFindInjectableValue);
        }
        cVar.d.d(achVar, false, settableBeanPropertyArr);
    }

    protected void _addExplicitConstructorCreators(DeserializationContext deserializationContext, c cVar, boolean z) throws ym {
        BeanDescription beanDescription = cVar.e;
        zs zsVar = cVar.d;
        AnnotationIntrospector annotationIntrospectorC = cVar.c();
        VisibilityChecker<?> visibilityChecker = cVar.f4109a;
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map = cVar.f4110b;
        ach achVarFindDefaultConstructor = beanDescription.findDefaultConstructor();
        if (achVarFindDefaultConstructor != null && (!zsVar.c() || _hasCreatorAnnotation(deserializationContext, achVarFindDefaultConstructor))) {
            zsVar.c(achVarFindDefaultConstructor);
        }
        for (ach achVar : beanDescription.getConstructors()) {
            JsonCreator.Mode modeFindCreatorAnnotation = annotationIntrospectorC.findCreatorAnnotation(deserializationContext.getConfig(), achVar);
            if (JsonCreator.Mode.DISABLED != modeFindCreatorAnnotation) {
                if (modeFindCreatorAnnotation == null) {
                    if (z && visibilityChecker.isCreatorVisible(achVar)) {
                        cVar.e(zo.e(annotationIntrospectorC, achVar, map.get(achVar)));
                    }
                } else {
                    int i = AnonymousClass3.d[modeFindCreatorAnnotation.ordinal()];
                    if (i == 1) {
                        _addExplicitDelegatingCreator(deserializationContext, beanDescription, zsVar, zo.e(annotationIntrospectorC, achVar, null));
                    } else if (i == 2) {
                        _addExplicitPropertyCreator(deserializationContext, beanDescription, zsVar, zo.e(annotationIntrospectorC, achVar, map.get(achVar)));
                    } else {
                        _addExplicitAnyCreator(deserializationContext, beanDescription, zsVar, zo.e(annotationIntrospectorC, achVar, map.get(achVar)), deserializationContext.getConfig().b());
                    }
                    cVar.g();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0180  */
    /* JADX WARN: Code duplicated, block: B:79:0x0187 A[SYNTHETIC] */
    protected void _addImplicitConstructorCreators(DeserializationContext deserializationContext, c cVar, List<zo> list) throws ym {
        VisibilityChecker<?> visibilityChecker;
        boolean z;
        Iterator<zo> it;
        LinkedList linkedList;
        int i;
        int i2;
        zo zoVar;
        VisibilityChecker<?> visibilityChecker2;
        boolean z2;
        Iterator<zo> it2;
        SettableBeanProperty[] settableBeanPropertyArr;
        AnnotatedWithParams annotatedWithParams;
        int i3;
        yi config = deserializationContext.getConfig();
        BeanDescription beanDescription = cVar.e;
        zs zsVar = cVar.d;
        AnnotationIntrospector annotationIntrospectorC = cVar.c();
        VisibilityChecker<?> visibilityChecker3 = cVar.f4109a;
        boolean zA = config.b().a();
        Iterator<zo> it3 = list.iterator();
        LinkedList linkedList2 = null;
        while (it3.hasNext()) {
            zo next = it3.next();
            int iE = next.e();
            AnnotatedWithParams annotatedWithParamsA = next.a();
            if (iE == 1) {
                BeanPropertyDefinition beanPropertyDefinitionI = next.i(0);
                if (zA || _checkIfCreatorPropertyBased(annotationIntrospectorC, annotatedWithParamsA, beanPropertyDefinitionI)) {
                    SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[1];
                    JacksonInject.b bVarA = next.a(0);
                    ys ysVarD = next.d(0);
                    if (ysVarD != null || (ysVarD = next.c(0)) != null || bVarA != null) {
                        settableBeanPropertyArr2[0] = constructCreatorProperty(deserializationContext, beanDescription, ysVarD, 0, next.b(0), bVarA);
                        zsVar.d(annotatedWithParamsA, false, settableBeanPropertyArr2);
                    }
                } else {
                    _handleSingleArgumentCreator(zsVar, annotatedWithParamsA, false, visibilityChecker3.isCreatorVisible(annotatedWithParamsA));
                    if (beanPropertyDefinitionI != null) {
                        ((POJOPropertyBuilder) beanPropertyDefinitionI).g();
                    }
                }
                visibilityChecker = visibilityChecker3;
                z = zA;
                it = it3;
            } else {
                SettableBeanProperty[] settableBeanPropertyArr3 = new SettableBeanProperty[iE];
                int i4 = -1;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (i5 < iE) {
                    acp parameter = annotatedWithParamsA.getParameter(i5);
                    BeanPropertyDefinition beanPropertyDefinitionI2 = next.i(i5);
                    JacksonInject.b bVarFindInjectableValue = annotationIntrospectorC.findInjectableValue(parameter);
                    ys fullName = beanPropertyDefinitionI2 == null ? null : beanPropertyDefinitionI2.getFullName();
                    if (beanPropertyDefinitionI2 == null || !beanPropertyDefinitionI2.isExplicitlyNamed()) {
                        i = i5;
                        i2 = i4;
                        zoVar = next;
                        visibilityChecker2 = visibilityChecker3;
                        z2 = zA;
                        it2 = it3;
                        settableBeanPropertyArr = settableBeanPropertyArr3;
                        annotatedWithParams = annotatedWithParamsA;
                        i3 = iE;
                        if (bVarFindInjectableValue != null) {
                            i7++;
                            settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, beanDescription, fullName, i, parameter, bVarFindInjectableValue);
                        } else if (annotationIntrospectorC.findUnwrappingNameTransformer(parameter) != null) {
                            _reportUnwrappedCreatorProperty(deserializationContext, beanDescription, parameter);
                        } else {
                            if (i2 < 0) {
                                i4 = i;
                            }
                            i5 = i + 1;
                            iE = i3;
                            settableBeanPropertyArr3 = settableBeanPropertyArr;
                            annotatedWithParamsA = annotatedWithParams;
                            zA = z2;
                            it3 = it2;
                            visibilityChecker3 = visibilityChecker2;
                            next = zoVar;
                        }
                    } else {
                        i6++;
                        i = i5;
                        i2 = i4;
                        z2 = zA;
                        settableBeanPropertyArr = settableBeanPropertyArr3;
                        it2 = it3;
                        annotatedWithParams = annotatedWithParamsA;
                        visibilityChecker2 = visibilityChecker3;
                        i3 = iE;
                        zoVar = next;
                        settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, beanDescription, fullName, i, parameter, bVarFindInjectableValue);
                    }
                    i4 = i2;
                    i5 = i + 1;
                    iE = i3;
                    settableBeanPropertyArr3 = settableBeanPropertyArr;
                    annotatedWithParamsA = annotatedWithParams;
                    zA = z2;
                    it3 = it2;
                    visibilityChecker3 = visibilityChecker2;
                    next = zoVar;
                }
                int i8 = i4;
                zo zoVar2 = next;
                visibilityChecker = visibilityChecker3;
                z = zA;
                it = it3;
                SettableBeanProperty[] settableBeanPropertyArr4 = settableBeanPropertyArr3;
                AnnotatedWithParams annotatedWithParams2 = annotatedWithParamsA;
                int i9 = iE;
                if (i6 > 0 || i7 > 0) {
                    if (i6 + i7 == i9) {
                        zsVar.d(annotatedWithParams2, false, settableBeanPropertyArr4);
                    } else if (i6 == 0 && i7 + 1 == i9) {
                        zsVar.d(annotatedWithParams2, false, settableBeanPropertyArr4, 0);
                    } else {
                        ys ysVarC = zoVar2.c(i8);
                        if (ysVarC == null || ysVarC.a()) {
                            deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(i8), annotatedWithParams2);
                        }
                        if (zsVar.c()) {
                            if (linkedList2 == null) {
                                linkedList = new LinkedList();
                            } else {
                                linkedList = linkedList2;
                            }
                            linkedList.add(annotatedWithParams2);
                            linkedList2 = linkedList;
                        }
                    }
                } else if (zsVar.c()) {
                    if (linkedList2 == null) {
                        linkedList = new LinkedList();
                    } else {
                        linkedList = linkedList2;
                    }
                    linkedList.add(annotatedWithParams2);
                    linkedList2 = linkedList;
                }
            }
            zA = z;
            it3 = it;
            visibilityChecker3 = visibilityChecker;
        }
        VisibilityChecker<?> visibilityChecker4 = visibilityChecker3;
        if (linkedList2 == null || zsVar.b() || zsVar.d()) {
            return;
        }
        _checkImplicitlyNamedConstructors(deserializationContext, beanDescription, visibilityChecker4, annotationIntrospectorC, zsVar, linkedList2);
    }

    protected void _addExplicitFactoryCreators(DeserializationContext deserializationContext, c cVar, boolean z) throws ym {
        BeanDescription beanDescription = cVar.e;
        zs zsVar = cVar.d;
        AnnotationIntrospector annotationIntrospectorC = cVar.c();
        VisibilityChecker<?> visibilityChecker = cVar.f4109a;
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map = cVar.f4110b;
        for (aco acoVar : beanDescription.getFactoryMethods()) {
            JsonCreator.Mode modeFindCreatorAnnotation = annotationIntrospectorC.findCreatorAnnotation(deserializationContext.getConfig(), acoVar);
            int parameterCount = acoVar.getParameterCount();
            if (modeFindCreatorAnnotation == null) {
                if (z && parameterCount == 1 && visibilityChecker.isCreatorVisible(acoVar)) {
                    cVar.d(zo.e(annotationIntrospectorC, acoVar, null));
                }
            } else if (modeFindCreatorAnnotation != JsonCreator.Mode.DISABLED) {
                if (parameterCount == 0) {
                    zsVar.c(acoVar);
                } else {
                    int i = AnonymousClass3.d[modeFindCreatorAnnotation.ordinal()];
                    if (i == 1) {
                        _addExplicitDelegatingCreator(deserializationContext, beanDescription, zsVar, zo.e(annotationIntrospectorC, acoVar, null));
                    } else if (i == 2) {
                        _addExplicitPropertyCreator(deserializationContext, beanDescription, zsVar, zo.e(annotationIntrospectorC, acoVar, map.get(acoVar)));
                    } else {
                        _addExplicitAnyCreator(deserializationContext, beanDescription, zsVar, zo.e(annotationIntrospectorC, acoVar, map.get(acoVar)), ConstructorDetector.e);
                    }
                    cVar.i();
                }
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected void _addImplicitFactoryCreators(DeserializationContext deserializationContext, c cVar, List<zo> list) throws ym {
        int i;
        VisibilityChecker<?> visibilityChecker;
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map;
        Iterator<zo> it;
        SettableBeanProperty[] settableBeanPropertyArr;
        boolean z;
        AnnotatedWithParams annotatedWithParams;
        BeanDescription beanDescription = cVar.e;
        zs zsVar = cVar.d;
        AnnotationIntrospector annotationIntrospectorC = cVar.c();
        VisibilityChecker<?> visibilityChecker2 = cVar.f4109a;
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map2 = cVar.f4110b;
        Iterator<zo> it2 = list.iterator();
        while (it2.hasNext()) {
            zo next = it2.next();
            int iE = next.e();
            AnnotatedWithParams annotatedWithParamsA = next.a();
            BeanPropertyDefinition[] beanPropertyDefinitionArr = map2.get(annotatedWithParamsA);
            if (iE == 1) {
                boolean z2 = false;
                BeanPropertyDefinition beanPropertyDefinitionI = next.i(0);
                if (!_checkIfCreatorPropertyBased(annotationIntrospectorC, annotatedWithParamsA, beanPropertyDefinitionI)) {
                    _handleSingleArgumentCreator(zsVar, annotatedWithParamsA, false, visibilityChecker2.isCreatorVisible(annotatedWithParamsA));
                    if (beanPropertyDefinitionI != null) {
                        ((POJOPropertyBuilder) beanPropertyDefinitionI).g();
                    }
                } else {
                    SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[iE];
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    acp acpVar = null;
                    while (i2 < iE) {
                        acp parameter = annotatedWithParamsA.getParameter(i2);
                        BeanPropertyDefinition beanPropertyDefinition = beanPropertyDefinitionArr == null ? null : beanPropertyDefinitionArr[i2];
                        JacksonInject.b bVarFindInjectableValue = annotationIntrospectorC.findInjectableValue(parameter);
                        ys fullName = beanPropertyDefinition == null ? null : beanPropertyDefinition.getFullName();
                        if (beanPropertyDefinition == null || !beanPropertyDefinition.isExplicitlyNamed()) {
                            i = i2;
                            visibilityChecker = visibilityChecker2;
                            map = map2;
                            it = it2;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            z = z2;
                            annotatedWithParams = annotatedWithParamsA;
                            if (bVarFindInjectableValue != null) {
                                i4++;
                                settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, beanDescription, fullName, i, parameter, bVarFindInjectableValue);
                            } else if (annotationIntrospectorC.findUnwrappingNameTransformer(parameter) != null) {
                                _reportUnwrappedCreatorProperty(deserializationContext, beanDescription, parameter);
                            } else if (acpVar == null) {
                                acpVar = parameter;
                            }
                        } else {
                            i3++;
                            i = i2;
                            visibilityChecker = visibilityChecker2;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            map = map2;
                            z = z2;
                            it = it2;
                            annotatedWithParams = annotatedWithParamsA;
                            settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, beanDescription, fullName, i, parameter, bVarFindInjectableValue);
                        }
                        i2 = i + 1;
                        settableBeanPropertyArr2 = settableBeanPropertyArr;
                        z2 = z;
                        annotatedWithParamsA = annotatedWithParams;
                        visibilityChecker2 = visibilityChecker;
                        map2 = map;
                        it2 = it;
                    }
                    VisibilityChecker<?> visibilityChecker3 = visibilityChecker2;
                    Map<AnnotatedWithParams, BeanPropertyDefinition[]> map3 = map2;
                    Iterator<zo> it3 = it2;
                    SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                    boolean z3 = z2;
                    AnnotatedWithParams annotatedWithParams2 = annotatedWithParamsA;
                    if (i3 > 0 || i4 > 0) {
                        if (i3 + i4 == iE) {
                            zsVar.d(annotatedWithParams2, z3, settableBeanPropertyArr3);
                        } else if (i3 == 0 && i4 + 1 == iE) {
                            zsVar.d(annotatedWithParams2, z3, settableBeanPropertyArr3, z3 ? 1 : 0);
                        } else {
                            deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(acpVar.d()), annotatedWithParams2);
                        }
                    }
                    it2 = it3;
                    visibilityChecker2 = visibilityChecker3;
                    map2 = map3;
                }
            }
        }
    }

    protected void _addExplicitDelegatingCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, zs zsVar, zo zoVar) throws ym {
        int iE = zoVar.e();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[iE];
        int i = -1;
        for (int i2 = 0; i2 < iE; i2++) {
            acp acpVarB = zoVar.b(i2);
            JacksonInject.b bVarA = zoVar.a(i2);
            if (bVarA != null) {
                settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, beanDescription, null, i2, acpVarB, bVarA);
            } else if (i < 0) {
                i = i2;
            } else {
                deserializationContext.reportBadTypeDefinition(beanDescription, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i), Integer.valueOf(i2), zoVar);
            }
        }
        if (i < 0) {
            deserializationContext.reportBadTypeDefinition(beanDescription, "No argument left as delegating for Creator %s: exactly one required", zoVar);
        }
        if (iE == 1) {
            _handleSingleArgumentCreator(zsVar, zoVar.a(), true, true);
            BeanPropertyDefinition beanPropertyDefinitionI = zoVar.i(0);
            if (beanPropertyDefinitionI != null) {
                ((POJOPropertyBuilder) beanPropertyDefinitionI).g();
                return;
            }
            return;
        }
        zsVar.d(zoVar.a(), true, settableBeanPropertyArr, i);
    }

    protected void _addExplicitPropertyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, zs zsVar, zo zoVar) throws ym {
        int iE = zoVar.e();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[iE];
        int i = 0;
        while (i < iE) {
            JacksonInject.b bVarA = zoVar.a(i);
            acp acpVarB = zoVar.b(i);
            ys ysVarD = zoVar.d(i);
            if (ysVarD == null) {
                if (deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(acpVarB) != null) {
                    _reportUnwrappedCreatorProperty(deserializationContext, beanDescription, acpVarB);
                }
                ys ysVarC = zoVar.c(i);
                _validateNamedPropertyParameter(deserializationContext, beanDescription, zoVar, i, ysVarC, bVarA);
                ysVarD = ysVarC;
            }
            int i2 = i;
            settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, beanDescription, ysVarD, i, acpVarB, bVarA);
            i = i2 + 1;
        }
        zsVar.d(zoVar.a(), true, settableBeanPropertyArr);
    }

    @Deprecated
    protected void _addExplicitAnyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, zs zsVar, zo zoVar) throws ym {
        _addExplicitAnyCreator(deserializationContext, beanDescription, zsVar, zoVar, deserializationContext.getConfig().b());
    }

    protected void _addExplicitAnyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, zs zsVar, zo zoVar, ConstructorDetector constructorDetector) throws ym {
        ys ysVar;
        boolean z;
        int iB;
        if (1 != zoVar.e()) {
            if (!constructorDetector.a() && (iB = zoVar.b()) >= 0 && (constructorDetector.e() || zoVar.d(iB) == null)) {
                _addExplicitDelegatingCreator(deserializationContext, beanDescription, zsVar, zoVar);
                return;
            } else {
                _addExplicitPropertyCreator(deserializationContext, beanDescription, zsVar, zoVar);
                return;
            }
        }
        acp acpVarB = zoVar.b(0);
        JacksonInject.b bVarA = zoVar.a(0);
        int i = AnonymousClass3.f4108b[constructorDetector.d().ordinal()];
        if (i == 1) {
            ysVar = null;
            z = false;
        } else if (i == 2) {
            ys ysVarD = zoVar.d(0);
            if (ysVarD == null) {
                _validateNamedPropertyParameter(deserializationContext, beanDescription, zoVar, 0, ysVarD, bVarA);
            }
            z = true;
            ysVar = ysVarD;
        } else {
            if (i == 3) {
                deserializationContext.reportBadTypeDefinition(beanDescription, "Single-argument constructor (%s) is annotated but no 'mode' defined; `CreatorDetector`configured with `SingleArgConstructor.REQUIRE_MODE`", zoVar.a());
                return;
            }
            BeanPropertyDefinition beanPropertyDefinitionI = zoVar.i(0);
            ys ysVarE = zoVar.e(0);
            z = (ysVarE == null && bVarA == null) ? false : true;
            if (!z && beanPropertyDefinitionI != null) {
                ysVarE = zoVar.d(0);
                z = ysVarE != null && beanPropertyDefinitionI.couldSerialize();
            }
            ysVar = ysVarE;
        }
        if (z) {
            zsVar.d(zoVar.a(), true, new SettableBeanProperty[]{constructCreatorProperty(deserializationContext, beanDescription, ysVar, 0, acpVarB, bVarA)});
            return;
        }
        _handleSingleArgumentCreator(zsVar, zoVar.a(), true, true);
        BeanPropertyDefinition beanPropertyDefinitionI2 = zoVar.i(0);
        if (beanPropertyDefinitionI2 != null) {
            ((POJOPropertyBuilder) beanPropertyDefinitionI2).g();
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f4108b;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ConstructorDetector.SingleArgConstructor.values().length];
            f4108b = iArr;
            try {
                iArr[ConstructorDetector.SingleArgConstructor.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4108b[ConstructorDetector.SingleArgConstructor.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4108b[ConstructorDetector.SingleArgConstructor.REQUIRE_MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4108b[ConstructorDetector.SingleArgConstructor.HEURISTIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[JsonCreator.Mode.values().length];
            d = iArr2;
            try {
                iArr2[JsonCreator.Mode.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[JsonCreator.Mode.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[JsonCreator.Mode.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private boolean _checkIfCreatorPropertyBased(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, BeanPropertyDefinition beanPropertyDefinition) {
        String name;
        if ((beanPropertyDefinition == null || !beanPropertyDefinition.isExplicitlyNamed()) && annotationIntrospector.findInjectableValue(annotatedWithParams.getParameter(0)) == null) {
            return (beanPropertyDefinition == null || (name = beanPropertyDefinition.getName()) == null || name.isEmpty() || !beanPropertyDefinition.couldSerialize()) ? false : true;
        }
        return true;
    }

    private void _checkImplicitlyNamedConstructors(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, zs zsVar, List<AnnotatedWithParams> list) throws ym {
        int i;
        Iterator<AnnotatedWithParams> it = list.iterator();
        AnnotatedWithParams annotatedWithParams = null;
        AnnotatedWithParams annotatedWithParams2 = null;
        SettableBeanProperty[] settableBeanPropertyArr = null;
        while (true) {
            if (!it.hasNext()) {
                annotatedWithParams = annotatedWithParams2;
                break;
            }
            AnnotatedWithParams next = it.next();
            if (visibilityChecker.isCreatorVisible(next)) {
                int parameterCount = next.getParameterCount();
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[parameterCount];
                int i2 = 0;
                while (true) {
                    if (i2 >= parameterCount) {
                        if (annotatedWithParams2 == null) {
                            annotatedWithParams2 = next;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            break;
                        }
                        break;
                    }
                    acp parameter = next.getParameter(i2);
                    ys ysVar_findParamName = _findParamName(parameter, annotationIntrospector);
                    if (ysVar_findParamName == null || ysVar_findParamName.a()) {
                        break;
                    }
                    settableBeanPropertyArr2[i2] = constructCreatorProperty(deserializationContext, beanDescription, ysVar_findParamName, parameter.d(), parameter, null);
                    i2++;
                }
            }
        }
        if (annotatedWithParams != null) {
            zsVar.d(annotatedWithParams, false, settableBeanPropertyArr);
            acq acqVar = (acq) beanDescription;
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                ys fullName = settableBeanProperty.getFullName();
                if (!acqVar.a(fullName)) {
                    acqVar.e(aih.e(deserializationContext.getConfig(), settableBeanProperty.getMember(), fullName));
                }
            }
        }
    }

    protected boolean _handleSingleArgumentCreator(zs zsVar, AnnotatedWithParams annotatedWithParams, boolean z, boolean z2) {
        Class<?> rawParameterType = annotatedWithParams.getRawParameterType(0);
        if (rawParameterType == String.class || rawParameterType == CLASS_CHAR_SEQUENCE) {
            if (z || z2) {
                zsVar.i(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Integer.TYPE || rawParameterType == Integer.class) {
            if (z || z2) {
                zsVar.c(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Long.TYPE || rawParameterType == Long.class) {
            if (z || z2) {
                zsVar.h(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Double.TYPE || rawParameterType == Double.class) {
            if (z || z2) {
                zsVar.a(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Boolean.TYPE || rawParameterType == Boolean.class) {
            if (z || z2) {
                zsVar.d(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == BigInteger.class && (z || z2)) {
            zsVar.e(annotatedWithParams, z);
        }
        if (rawParameterType == BigDecimal.class && (z || z2)) {
            zsVar.b(annotatedWithParams, z);
        }
        if (!z) {
            return false;
        }
        zsVar.d(annotatedWithParams, z, (SettableBeanProperty[]) null, 0);
        return true;
    }

    protected void _validateNamedPropertyParameter(DeserializationContext deserializationContext, BeanDescription beanDescription, zo zoVar, int i, ys ysVar, JacksonInject.b bVar) throws ym {
        if (ysVar == null && bVar == null) {
            deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator", Integer.valueOf(i), zoVar);
        }
    }

    protected void _reportUnwrappedCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, acp acpVar) throws ym {
        deserializationContext.reportBadTypeDefinition(beanDescription, "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", Integer.valueOf(acpVar.d()));
    }

    protected SettableBeanProperty constructCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, ys ysVar, int i, acp acpVar, JacksonInject.b bVar) throws ym {
        yq yqVarE;
        yi config = deserializationContext.getConfig();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            yqVarE = yq.f53746b;
        } else {
            yqVarE = yq.e(annotationIntrospector.hasRequiredMarker(acpVar), annotationIntrospector.findPropertyDescription(acpVar), annotationIntrospector.findPropertyIndex(acpVar), annotationIntrospector.findPropertyDefaultValue(acpVar));
        }
        yq yqVar = yqVarE;
        JavaType javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, acpVar, acpVar.getType());
        BeanProperty.d dVar = new BeanProperty.d(ysVar, javaTypeResolveMemberAndTypeAnnotations, annotationIntrospector.findWrapperName(acpVar), acpVar, yqVar);
        TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler();
        if (typeDeserializerFindTypeDeserializer == null) {
            typeDeserializerFindTypeDeserializer = findTypeDeserializer(config, javaTypeResolveMemberAndTypeAnnotations);
        }
        zh zhVarA = zh.a(ysVar, javaTypeResolveMemberAndTypeAnnotations, dVar.getWrapperName(), typeDeserializerFindTypeDeserializer, beanDescription.getClassAnnotations(), acpVar, i, bVar, _getSetterInfo(deserializationContext, dVar, yqVar));
        JsonDeserializer<?> jsonDeserializerFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, acpVar);
        if (jsonDeserializerFindDeserializerFromAnnotation == null) {
            jsonDeserializerFindDeserializerFromAnnotation = (JsonDeserializer) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        return jsonDeserializerFindDeserializerFromAnnotation != null ? zhVarA.withValueDeserializer(deserializationContext.handlePrimaryContextualization(jsonDeserializerFindDeserializerFromAnnotation, zhVarA, javaTypeResolveMemberAndTypeAnnotations)) : zhVarA;
    }

    private ys _findParamName(acp acpVar, AnnotationIntrospector annotationIntrospector) {
        if (annotationIntrospector == null) {
            return null;
        }
        ys ysVarFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(acpVar);
        if (ysVarFindNameForDeserialization != null && !ysVarFindNameForDeserialization.a()) {
            return ysVarFindNameForDeserialization;
        }
        String strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(acpVar);
        if (strFindImplicitPropertyName == null || strFindImplicitPropertyName.isEmpty()) {
            return null;
        }
        return ys.c(strFindImplicitPropertyName);
    }

    protected yq _getSetterInfo(DeserializationContext deserializationContext, BeanProperty beanProperty, yq yqVar) {
        Nulls nullsB;
        Nulls nullsD;
        JsonSetter.e eVarFindSetterInfo;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        yi config = deserializationContext.getConfig();
        AnnotatedMember member = beanProperty.getMember();
        Nulls nullsD2 = null;
        if (member != null) {
            if (annotationIntrospector == null || (eVarFindSetterInfo = annotationIntrospector.findSetterInfo(member)) == null) {
                nullsD = null;
            } else {
                nullsD = eVarFindSetterInfo.d();
                nullsD2 = eVarFindSetterInfo.b();
            }
            JsonSetter.e setterInfo = config.getConfigOverride(beanProperty.getType().getRawClass()).getSetterInfo();
            if (setterInfo != null) {
                Nulls nullsD3 = nullsD == null ? setterInfo.d() : nullsD;
                if (nullsD2 == null) {
                    nullsD2 = setterInfo.b();
                }
                nullsB = nullsD2;
                nullsD2 = nullsD3;
            } else {
                nullsB = nullsD2;
                nullsD2 = nullsD;
            }
        } else {
            nullsB = null;
        }
        JsonSetter.e defaultSetterInfo = config.getDefaultSetterInfo();
        if (nullsD2 == null) {
            nullsD2 = defaultSetterInfo.d();
        }
        if (nullsB == null) {
            nullsB = defaultSetterInfo.b();
        }
        return (nullsD2 == null && nullsB == null) ? yqVar : yqVar.e(nullsD2, nullsB);
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createArrayDeserializer(DeserializationContext deserializationContext, ahe aheVar, BeanDescription beanDescription) throws ym {
        yi config = deserializationContext.getConfig();
        JavaType contentType = aheVar.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializerFindTypeDeserializer == null) {
            typeDeserializerFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer = typeDeserializerFindTypeDeserializer;
        JsonDeserializer<?> jsonDeserializer_findCustomArrayDeserializer = _findCustomArrayDeserializer(aheVar, config, beanDescription, typeDeserializer, jsonDeserializer);
        if (jsonDeserializer_findCustomArrayDeserializer == null) {
            if (jsonDeserializer == null) {
                Class<?> rawClass = contentType.getRawClass();
                if (contentType.isPrimitive()) {
                    return PrimitiveArrayDeserializers.forType(rawClass);
                }
                if (rawClass == String.class) {
                    return abn.e;
                }
            }
            jsonDeserializer_findCustomArrayDeserializer = new abc(aheVar, jsonDeserializer, typeDeserializer);
        }
        if (this._factoryConfig.d()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.e().iterator();
            while (it.hasNext()) {
                jsonDeserializer_findCustomArrayDeserializer = it.next().modifyArrayDeserializer(config, aheVar, beanDescription, jsonDeserializer_findCustomArrayDeserializer);
            }
        }
        return jsonDeserializer_findCustomArrayDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createCollectionDeserializer(DeserializationContext deserializationContext, ahg ahgVar, BeanDescription beanDescription) throws ym {
        JsonDeserializer<?> aawVar;
        JavaType contentType = ahgVar.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        yi config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializerFindTypeDeserializer == null) {
            typeDeserializerFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer = typeDeserializerFindTypeDeserializer;
        JsonDeserializer<?> jsonDeserializer_findCustomCollectionDeserializer = _findCustomCollectionDeserializer(ahgVar, config, beanDescription, typeDeserializer, jsonDeserializer);
        if (jsonDeserializer_findCustomCollectionDeserializer == null) {
            Class<?> rawClass = ahgVar.getRawClass();
            if (jsonDeserializer == null && EnumSet.class.isAssignableFrom(rawClass)) {
                jsonDeserializer_findCustomCollectionDeserializer = new aaz(contentType, null);
            }
        }
        if (jsonDeserializer_findCustomCollectionDeserializer == null) {
            if (ahgVar.isInterface() || ahgVar.isAbstract()) {
                ahg ahgVar_mapAbstractCollectionType = _mapAbstractCollectionType(ahgVar, config);
                if (ahgVar_mapAbstractCollectionType == null) {
                    if (ahgVar.getTypeHandler() == null) {
                        throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Collection type " + ahgVar);
                    }
                    jsonDeserializer_findCustomCollectionDeserializer = zd.d(beanDescription);
                } else {
                    beanDescription = config.d(ahgVar_mapAbstractCollectionType);
                    ahgVar = ahgVar_mapAbstractCollectionType;
                }
            }
            if (jsonDeserializer_findCustomCollectionDeserializer == null) {
                ValueInstantiator valueInstantiatorFindValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
                if (!valueInstantiatorFindValueInstantiator.canCreateUsingDefault()) {
                    if (ahgVar.hasRawClass(ArrayBlockingQueue.class)) {
                        return new aar(ahgVar, jsonDeserializer, typeDeserializer, valueInstantiatorFindValueInstantiator);
                    }
                    JsonDeserializer<?> jsonDeserializerFindForCollection = JavaUtilCollectionsDeserializers.findForCollection(deserializationContext, ahgVar);
                    if (jsonDeserializerFindForCollection != null) {
                        return jsonDeserializerFindForCollection;
                    }
                }
                if (contentType.hasRawClass(String.class)) {
                    aawVar = new abo(ahgVar, jsonDeserializer, valueInstantiatorFindValueInstantiator);
                } else {
                    aawVar = new aaw(ahgVar, jsonDeserializer, typeDeserializer, valueInstantiatorFindValueInstantiator);
                }
                jsonDeserializer_findCustomCollectionDeserializer = aawVar;
            }
        }
        if (this._factoryConfig.d()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.e().iterator();
            while (it.hasNext()) {
                jsonDeserializer_findCustomCollectionDeserializer = it.next().modifyCollectionDeserializer(config, ahgVar, beanDescription, jsonDeserializer_findCustomCollectionDeserializer);
            }
        }
        return jsonDeserializer_findCustomCollectionDeserializer;
    }

    protected ahg _mapAbstractCollectionType(JavaType javaType, yi yiVar) {
        Class<?> clsE = d.e(javaType);
        if (clsE != null) {
            return (ahg) yiVar.getTypeFactory().b(javaType, clsE, true);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, ahb ahbVar, BeanDescription beanDescription) throws ym {
        JavaType contentType = ahbVar.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        yi config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        JsonDeserializer<?> jsonDeserializer_findCustomCollectionLikeDeserializer = _findCustomCollectionLikeDeserializer(ahbVar, config, beanDescription, typeDeserializer == null ? findTypeDeserializer(config, contentType) : typeDeserializer, jsonDeserializer);
        if (jsonDeserializer_findCustomCollectionLikeDeserializer != null && this._factoryConfig.d()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.e().iterator();
            while (it.hasNext()) {
                jsonDeserializer_findCustomCollectionLikeDeserializer = it.next().modifyCollectionLikeDeserializer(config, ahbVar, beanDescription, jsonDeserializer_findCustomCollectionLikeDeserializer);
            }
        }
        return jsonDeserializer_findCustomCollectionLikeDeserializer;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b  */
    /* JADX WARN: Code duplicated, block: B:56:0x011b A[LOOP:0: B:54:0x0115->B:56:0x011b, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [abg] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.fasterxml.jackson.databind.JsonDeserializer<?>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.fasterxml.jackson.databind.JsonDeserializer] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.fasterxml.jackson.databind.deser.BeanDeserializerModifier] */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createMapDeserializer(DeserializationContext deserializationContext, ahh ahhVar, BeanDescription beanDescription) throws ym {
        BeanDescription beanDescription2;
        ahh ahhVar_mapAbstractMapType;
        ?? ModifyMapDeserializer;
        Iterator<BeanDeserializerModifier> it;
        BeanDescription beanDescriptionD;
        ?? abgVar;
        JsonIgnoreProperties.b defaultPropertyIgnorals;
        Set<String> setB;
        JsonDeserializer<?> jsonDeserializerD;
        JsonDeserializer<?> jsonDeserializerFindForMap;
        ValueInstantiator valueInstantiatorFindValueInstantiator;
        aax aaxVar;
        yi config = deserializationContext.getConfig();
        JavaType keyType = ahhVar.getKeyType();
        JavaType contentType = ahhVar.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        KeyDeserializer keyDeserializer = (KeyDeserializer) keyType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        TypeDeserializer typeDeserializerFindTypeDeserializer = typeDeserializer == null ? findTypeDeserializer(config, contentType) : typeDeserializer;
        JsonDeserializer<?> jsonDeserializer_findCustomMapDeserializer = _findCustomMapDeserializer(ahhVar, config, beanDescription, keyDeserializer, typeDeserializerFindTypeDeserializer, jsonDeserializer);
        if (jsonDeserializer_findCustomMapDeserializer == null) {
            Class<?> rawClass = ahhVar.getRawClass();
            if (EnumMap.class.isAssignableFrom(rawClass)) {
                if (rawClass == EnumMap.class) {
                    beanDescription2 = beanDescription;
                    valueInstantiatorFindValueInstantiator = null;
                } else {
                    beanDescription2 = beanDescription;
                    valueInstantiatorFindValueInstantiator = findValueInstantiator(deserializationContext, beanDescription2);
                }
                if (!keyType.isEnumImplType()) {
                    throw new IllegalArgumentException("Cannot construct EnumMap; generic (key) type not available");
                }
                aaxVar = new aax(ahhVar, valueInstantiatorFindValueInstantiator, null, jsonDeserializer, typeDeserializerFindTypeDeserializer, null);
            } else {
                beanDescription2 = beanDescription;
            }
            if (jsonDeserializer_findCustomMapDeserializer == null) {
                jsonDeserializer_findCustomMapDeserializer = jsonDeserializer_findCustomMapDeserializer;
                if (ahhVar.isInterface() || ahhVar.isAbstract()) {
                    jsonDeserializer_findCustomMapDeserializer = aaxVar;
                    jsonDeserializer_findCustomMapDeserializer = aaxVar;
                    ahhVar_mapAbstractMapType = _mapAbstractMapType(ahhVar, config);
                    if (ahhVar_mapAbstractMapType != null) {
                        ahhVar_mapAbstractMapType.getRawClass();
                        beanDescriptionD = config.d(ahhVar_mapAbstractMapType);
                    } else {
                        if (ahhVar.getTypeHandler() == null) {
                            throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Map type " + ahhVar);
                        }
                        jsonDeserializerD = zd.d(beanDescription);
                    }
                    if (abgVar == 0) {
                        abgVar = jsonDeserializer_findCustomMapDeserializer;
                        abgVar = new abg(ahhVar_mapAbstractMapType, findValueInstantiator(deserializationContext, beanDescriptionD), keyDeserializer, jsonDeserializer, typeDeserializerFindTypeDeserializer);
                        defaultPropertyIgnorals = config.getDefaultPropertyIgnorals(Map.class, beanDescriptionD.getClassInfo());
                        if (defaultPropertyIgnorals == null) {
                            setB = null;
                        } else {
                            setB = defaultPropertyIgnorals.b();
                        }
                        abgVar.d(setB);
                        JsonIncludeProperties.b defaultPropertyInclusions = config.getDefaultPropertyInclusions(Map.class, beanDescriptionD.getClassInfo());
                        abgVar.c(defaultPropertyInclusions != null ? defaultPropertyInclusions.b() : null);
                    }
                    abgVar = jsonDeserializer_findCustomMapDeserializer;
                    beanDescription2 = beanDescriptionD;
                    ModifyMapDeserializer = abgVar;
                } else {
                    jsonDeserializerFindForMap = JavaUtilCollectionsDeserializers.findForMap(deserializationContext, ahhVar);
                    if (jsonDeserializerFindForMap != null) {
                        jsonDeserializer_findCustomMapDeserializer = aaxVar;
                        jsonDeserializerD = jsonDeserializerFindForMap;
                        return jsonDeserializerFindForMap;
                    }
                }
                jsonDeserializer_findCustomMapDeserializer = aaxVar;
                jsonDeserializerD = jsonDeserializerFindForMap;
                ahhVar_mapAbstractMapType = ahhVar;
                beanDescriptionD = beanDescription2;
                abgVar = jsonDeserializerD;
                if (abgVar == 0) {
                    abgVar = jsonDeserializer_findCustomMapDeserializer;
                    abgVar = new abg(ahhVar_mapAbstractMapType, findValueInstantiator(deserializationContext, beanDescriptionD), keyDeserializer, jsonDeserializer, typeDeserializerFindTypeDeserializer);
                    defaultPropertyIgnorals = config.getDefaultPropertyIgnorals(Map.class, beanDescriptionD.getClassInfo());
                    if (defaultPropertyIgnorals == null) {
                        setB = null;
                    } else {
                        setB = defaultPropertyIgnorals.b();
                    }
                    abgVar.d(setB);
                    JsonIncludeProperties.b defaultPropertyInclusions2 = config.getDefaultPropertyInclusions(Map.class, beanDescriptionD.getClassInfo());
                    abgVar.c(defaultPropertyInclusions2 != null ? defaultPropertyInclusions2.b() : null);
                }
                abgVar = jsonDeserializer_findCustomMapDeserializer;
                beanDescription2 = beanDescriptionD;
                ModifyMapDeserializer = abgVar;
            }
            if (this._factoryConfig.d()) {
                it = this._factoryConfig.e().iterator();
                ModifyMapDeserializer = ModifyMapDeserializer;
                while (it.hasNext()) {
                    ModifyMapDeserializer = it.next().modifyMapDeserializer(config, ahhVar_mapAbstractMapType, beanDescription2, ModifyMapDeserializer);
                }
            }
            return ModifyMapDeserializer;
        }
        beanDescription2 = beanDescription;
        jsonDeserializer_findCustomMapDeserializer = jsonDeserializer_findCustomMapDeserializer;
        jsonDeserializer_findCustomMapDeserializer = aaxVar;
        ahhVar_mapAbstractMapType = ahhVar;
        ModifyMapDeserializer = jsonDeserializer_findCustomMapDeserializer;
        if (this._factoryConfig.d()) {
            it = this._factoryConfig.e().iterator();
            ModifyMapDeserializer = ModifyMapDeserializer;
            while (it.hasNext()) {
                ModifyMapDeserializer = it.next().modifyMapDeserializer(config, ahhVar_mapAbstractMapType, beanDescription2, ModifyMapDeserializer);
            }
        }
        return ModifyMapDeserializer;
    }

    protected ahh _mapAbstractMapType(JavaType javaType, yi yiVar) {
        Class<?> clsD = d.d(javaType);
        if (clsD != null) {
            return (ahh) yiVar.getTypeFactory().b(javaType, clsD, true);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext deserializationContext, ahk ahkVar, BeanDescription beanDescription) throws ym {
        JavaType keyType = ahkVar.getKeyType();
        JavaType contentType = ahkVar.getContentType();
        yi config = deserializationContext.getConfig();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        KeyDeserializer keyDeserializer = (KeyDeserializer) keyType.getValueHandler();
        TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializerFindTypeDeserializer == null) {
            typeDeserializerFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer<?> jsonDeserializer_findCustomMapLikeDeserializer = _findCustomMapLikeDeserializer(ahkVar, config, beanDescription, keyDeserializer, typeDeserializerFindTypeDeserializer, jsonDeserializer);
        if (jsonDeserializer_findCustomMapLikeDeserializer != null && this._factoryConfig.d()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.e().iterator();
            while (it.hasNext()) {
                jsonDeserializer_findCustomMapLikeDeserializer = it.next().modifyMapLikeDeserializer(config, ahkVar, beanDescription, jsonDeserializer_findCustomMapLikeDeserializer);
            }
        }
        return jsonDeserializer_findCustomMapLikeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws ym {
        JsonDeserializer<?> jsonDeserializerD;
        yi config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        JsonDeserializer<?> jsonDeserializer_findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, beanDescription);
        if (jsonDeserializer_findCustomEnumDeserializer == null) {
            if (rawClass == Enum.class) {
                return zd.d(beanDescription);
            }
            ValueInstantiator valueInstantiator_constructDefaultValueInstantiator = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
            SettableBeanProperty[] fromObjectArguments = valueInstantiator_constructDefaultValueInstantiator == null ? null : valueInstantiator_constructDefaultValueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            for (aco acoVar : beanDescription.getFactoryMethods()) {
                if (_hasCreatorAnnotation(deserializationContext, acoVar)) {
                    if (acoVar.getParameterCount() == 0) {
                        jsonDeserializerD = aas.a(config, rawClass, acoVar);
                    } else {
                        if (!acoVar.a().isAssignableFrom(rawClass)) {
                            deserializationContext.reportBadDefinition(javaType, String.format("Invalid `@JsonCreator` annotated Enum factory method [%s]: needs to return compatible type", acoVar.toString()));
                        }
                        jsonDeserializerD = aas.d(config, rawClass, acoVar, valueInstantiator_constructDefaultValueInstantiator, fromObjectArguments);
                    }
                    jsonDeserializer_findCustomEnumDeserializer = jsonDeserializerD;
                    break;
                }
            }
            if (jsonDeserializer_findCustomEnumDeserializer == null) {
                jsonDeserializer_findCustomEnumDeserializer = new aas(constructEnumResolver(rawClass, config, beanDescription.findJsonValueAccessor()), Boolean.valueOf(config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)));
            }
        }
        if (this._factoryConfig.d()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.e().iterator();
            while (it.hasNext()) {
                jsonDeserializer_findCustomEnumDeserializer = it.next().modifyEnumDeserializer(config, javaType, beanDescription, jsonDeserializer_findCustomEnumDeserializer);
            }
        }
        return jsonDeserializer_findCustomEnumDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createTreeDeserializer(yi yiVar, JavaType javaType, BeanDescription beanDescription) throws ym {
        Class<?> rawClass = javaType.getRawClass();
        JsonDeserializer<?> jsonDeserializer_findCustomTreeNodeDeserializer = _findCustomTreeNodeDeserializer(rawClass, yiVar, beanDescription);
        return jsonDeserializer_findCustomTreeNodeDeserializer != null ? jsonDeserializer_findCustomTreeNodeDeserializer : abe.b(rawClass);
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createReferenceDeserializer(DeserializationContext deserializationContext, ahi ahiVar, BeanDescription beanDescription) throws ym {
        JavaType contentType = ahiVar.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        yi config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializerFindTypeDeserializer == null) {
            typeDeserializerFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer = typeDeserializerFindTypeDeserializer;
        JsonDeserializer<?> jsonDeserializer_findCustomReferenceDeserializer = _findCustomReferenceDeserializer(ahiVar, config, beanDescription, typeDeserializer, jsonDeserializer);
        if (jsonDeserializer_findCustomReferenceDeserializer == null && ahiVar.isTypeOrSubTypeOf(AtomicReference.class)) {
            return new aat(ahiVar, ahiVar.getRawClass() == AtomicReference.class ? null : findValueInstantiator(deserializationContext, beanDescription), typeDeserializer, jsonDeserializer);
        }
        if (jsonDeserializer_findCustomReferenceDeserializer != null && this._factoryConfig.d()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.e().iterator();
            while (it.hasNext()) {
                jsonDeserializer_findCustomReferenceDeserializer = it.next().modifyReferenceDeserializer(config, ahiVar, beanDescription, jsonDeserializer_findCustomReferenceDeserializer);
            }
        }
        return jsonDeserializer_findCustomReferenceDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public TypeDeserializer findTypeDeserializer(yi yiVar, JavaType javaType) throws ym {
        Collection<adg> collectionCollectAndResolveSubtypesByTypeId;
        JavaType javaTypeMapAbstractType;
        ack classInfo = yiVar.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder<?> typeResolverBuilderFindTypeResolver = yiVar.getAnnotationIntrospector().findTypeResolver(yiVar, classInfo, javaType);
        if (typeResolverBuilderFindTypeResolver == null) {
            typeResolverBuilderFindTypeResolver = yiVar.getDefaultTyper(javaType);
            if (typeResolverBuilderFindTypeResolver == null) {
                return null;
            }
            collectionCollectAndResolveSubtypesByTypeId = null;
        } else {
            collectionCollectAndResolveSubtypesByTypeId = yiVar.getSubtypeResolver().collectAndResolveSubtypesByTypeId(yiVar, classInfo);
        }
        if (typeResolverBuilderFindTypeResolver.getDefaultImpl() == null && javaType.isAbstract() && (javaTypeMapAbstractType = mapAbstractType(yiVar, javaType)) != null && !javaTypeMapAbstractType.hasRawClass(javaType.getRawClass())) {
            typeResolverBuilderFindTypeResolver = typeResolverBuilderFindTypeResolver.defaultImpl(javaTypeMapAbstractType.getRawClass());
        }
        try {
            return typeResolverBuilderFindTypeResolver.buildTypeDeserializer(yiVar, javaType, collectionCollectAndResolveSubtypesByTypeId);
        } catch (IllegalArgumentException | IllegalStateException e) {
            abv abvVarD = abv.d(null, ahw.a(e), javaType);
            abvVarD.initCause(e);
            throw abvVarD;
        }
    }

    protected JsonDeserializer<?> findOptionalStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws ym {
        return acd.f240c.d(javaType, deserializationContext.getConfig(), beanDescription);
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public KeyDeserializer createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws ym {
        BeanDescription beanDescriptionIntrospectClassAnnotations;
        yi config = deserializationContext.getConfig();
        KeyDeserializer keyDeserializerModifyKeyDeserializer = null;
        if (this._factoryConfig.j()) {
            beanDescriptionIntrospectClassAnnotations = config.introspectClassAnnotations(javaType);
            Iterator<KeyDeserializers> it = this._factoryConfig.h().iterator();
            while (it.hasNext() && (keyDeserializerModifyKeyDeserializer = it.next().findKeyDeserializer(javaType, config, beanDescriptionIntrospectClassAnnotations)) == null) {
            }
        } else {
            beanDescriptionIntrospectClassAnnotations = null;
        }
        if (keyDeserializerModifyKeyDeserializer == null) {
            if (beanDescriptionIntrospectClassAnnotations == null) {
                beanDescriptionIntrospectClassAnnotations = config.introspectClassAnnotations(javaType.getRawClass());
            }
            keyDeserializerModifyKeyDeserializer = findKeyDeserializerFromAnnotation(deserializationContext, beanDescriptionIntrospectClassAnnotations.getClassInfo());
            if (keyDeserializerModifyKeyDeserializer == null) {
                if (javaType.isEnumType()) {
                    keyDeserializerModifyKeyDeserializer = _createEnumKeyDeserializer(deserializationContext, javaType);
                } else {
                    keyDeserializerModifyKeyDeserializer = abl.d(config, javaType);
                }
            }
        }
        if (keyDeserializerModifyKeyDeserializer != null && this._factoryConfig.d()) {
            Iterator<BeanDeserializerModifier> it2 = this._factoryConfig.e().iterator();
            while (it2.hasNext()) {
                keyDeserializerModifyKeyDeserializer = it2.next().modifyKeyDeserializer(config, javaType, keyDeserializerModifyKeyDeserializer);
            }
        }
        return keyDeserializerModifyKeyDeserializer;
    }

    private KeyDeserializer _createEnumKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws ym {
        yi config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        BeanDescription beanDescriptionE = config.e(javaType);
        KeyDeserializer keyDeserializerFindKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, beanDescriptionE.getClassInfo());
        if (keyDeserializerFindKeyDeserializerFromAnnotation != null) {
            return keyDeserializerFindKeyDeserializerFromAnnotation;
        }
        JsonDeserializer<?> jsonDeserializer_findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, beanDescriptionE);
        if (jsonDeserializer_findCustomEnumDeserializer != null) {
            return abl.b(config, javaType, jsonDeserializer_findCustomEnumDeserializer);
        }
        JsonDeserializer<Object> jsonDeserializerFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, beanDescriptionE.getClassInfo());
        if (jsonDeserializerFindDeserializerFromAnnotation != null) {
            return abl.b(config, javaType, jsonDeserializerFindDeserializerFromAnnotation);
        }
        ahz ahzVarConstructEnumResolver = constructEnumResolver(rawClass, config, beanDescriptionE.findJsonValueAccessor());
        for (aco acoVar : beanDescriptionE.getFactoryMethods()) {
            if (_hasCreatorAnnotation(deserializationContext, acoVar)) {
                if (acoVar.getParameterCount() != 1 || !acoVar.a().isAssignableFrom(rawClass)) {
                    throw new IllegalArgumentException("Unsuitable method (" + acoVar + ") decorated with @JsonCreator (for Enum type " + rawClass.getName() + Constants.RIGHT_BRACKET_ONLY);
                }
                if (acoVar.getRawParameterType(0) == String.class) {
                    if (config.canOverrideAccessModifiers()) {
                        ahw.a(acoVar.getMember(), deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return abl.a(ahzVarConstructEnumResolver, acoVar);
                }
            }
        }
        return abl.c(ahzVarConstructEnumResolver);
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public boolean hasExplicitDeserializerFor(yi yiVar, Class<?> cls) {
        while (cls.isArray()) {
            cls = cls.getComponentType();
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return true;
        }
        String name = cls.getName();
        if (name.startsWith("java.")) {
            if (Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
                return true;
            }
            if (Number.class.isAssignableFrom(cls)) {
                return NumberDeserializers.e(cls, name) != null;
            }
            return aay.d(cls) || cls == CLASS_STRING || cls == Boolean.class || cls == EnumMap.class || cls == AtomicReference.class || DateDeserializers.a(cls);
        }
        if (name.startsWith("com.fasterxml.")) {
            return JsonNode.class.isAssignableFrom(cls) || cls == aii.class;
        }
        return acd.f240c.e(cls);
    }

    public TypeDeserializer findPropertyTypeDeserializer(yi yiVar, JavaType javaType, AnnotatedMember annotatedMember) throws ym {
        TypeResolverBuilder<?> typeResolverBuilderFindPropertyTypeResolver = yiVar.getAnnotationIntrospector().findPropertyTypeResolver(yiVar, annotatedMember, javaType);
        if (typeResolverBuilderFindPropertyTypeResolver == null) {
            return findTypeDeserializer(yiVar, javaType);
        }
        try {
            return typeResolverBuilderFindPropertyTypeResolver.buildTypeDeserializer(yiVar, javaType, yiVar.getSubtypeResolver().collectAndResolveSubtypesByTypeId(yiVar, annotatedMember, javaType));
        } catch (IllegalArgumentException | IllegalStateException e) {
            abv abvVarD = abv.d(null, ahw.a(e), javaType);
            abvVarD.initCause(e);
            throw abvVarD;
        }
    }

    public TypeDeserializer findPropertyContentTypeDeserializer(yi yiVar, JavaType javaType, AnnotatedMember annotatedMember) throws ym {
        TypeResolverBuilder<?> typeResolverBuilderFindPropertyContentTypeResolver = yiVar.getAnnotationIntrospector().findPropertyContentTypeResolver(yiVar, annotatedMember, javaType);
        JavaType contentType = javaType.getContentType();
        if (typeResolverBuilderFindPropertyContentTypeResolver == null) {
            return findTypeDeserializer(yiVar, contentType);
        }
        return typeResolverBuilderFindPropertyContentTypeResolver.buildTypeDeserializer(yiVar, contentType, yiVar.getSubtypeResolver().collectAndResolveSubtypesByTypeId(yiVar, annotatedMember, contentType));
    }

    public JsonDeserializer<?> findDefaultDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws ym {
        JavaType javaType_findRemappedType;
        JavaType javaType_findRemappedType2;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == CLASS_OBJECT || rawClass == CLASS_SERIALIZABLE) {
            yi config = deserializationContext.getConfig();
            if (this._factoryConfig.c()) {
                javaType_findRemappedType = _findRemappedType(config, List.class);
                javaType_findRemappedType2 = _findRemappedType(config, Map.class);
            } else {
                javaType_findRemappedType = null;
                javaType_findRemappedType2 = null;
            }
            return new abu(javaType_findRemappedType, javaType_findRemappedType2);
        }
        if (rawClass == CLASS_STRING || rawClass == CLASS_CHAR_SEQUENCE) {
            return abq.e;
        }
        Class<?> cls = CLASS_ITERABLE;
        if (rawClass == cls) {
            ahp typeFactory = deserializationContext.getTypeFactory();
            JavaType[] javaTypeArrA = typeFactory.a(javaType, cls);
            return createCollectionDeserializer(deserializationContext, typeFactory.b(Collection.class, (javaTypeArrA == null || javaTypeArrA.length != 1) ? ahp.c() : javaTypeArrA[0]), beanDescription);
        }
        if (rawClass == CLASS_MAP_ENTRY) {
            JavaType javaTypeContainedTypeOrUnknown = javaType.containedTypeOrUnknown(0);
            JavaType javaTypeContainedTypeOrUnknown2 = javaType.containedTypeOrUnknown(1);
            TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) javaTypeContainedTypeOrUnknown2.getTypeHandler();
            if (typeDeserializerFindTypeDeserializer == null) {
                typeDeserializerFindTypeDeserializer = findTypeDeserializer(deserializationContext.getConfig(), javaTypeContainedTypeOrUnknown2);
            }
            return new abd(javaType, (KeyDeserializer) javaTypeContainedTypeOrUnknown.getValueHandler(), (JsonDeserializer<Object>) javaTypeContainedTypeOrUnknown2.getValueHandler(), typeDeserializerFindTypeDeserializer);
        }
        String name = rawClass.getName();
        if (rawClass.isPrimitive() || name.startsWith("java.")) {
            JsonDeserializer<?> jsonDeserializerE = NumberDeserializers.e(rawClass, name);
            if (jsonDeserializerE == null) {
                jsonDeserializerE = DateDeserializers.b(rawClass, name);
            }
            if (jsonDeserializerE != null) {
                return jsonDeserializerE;
            }
        }
        if (rawClass == aii.class) {
            return new abm();
        }
        JsonDeserializer<?> jsonDeserializerFindOptionalStdDeserializer = findOptionalStdDeserializer(deserializationContext, javaType, beanDescription);
        return jsonDeserializerFindOptionalStdDeserializer != null ? jsonDeserializerFindOptionalStdDeserializer : aay.d(rawClass, name);
    }

    protected JavaType _findRemappedType(yi yiVar, Class<?> cls) throws ym {
        JavaType javaTypeMapAbstractType = mapAbstractType(yiVar, yiVar.constructType(cls));
        if (javaTypeMapAbstractType == null || javaTypeMapAbstractType.hasRawClass(cls)) {
            return null;
        }
        return javaTypeMapAbstractType;
    }

    protected JsonDeserializer<?> _findCustomTreeNodeDeserializer(Class<? extends JsonNode> cls, yi yiVar, BeanDescription beanDescription) throws ym {
        Iterator<Deserializers> it = this._factoryConfig.b().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindTreeNodeDeserializer = it.next().findTreeNodeDeserializer(cls, yiVar, beanDescription);
            if (jsonDeserializerFindTreeNodeDeserializer != null) {
                return jsonDeserializerFindTreeNodeDeserializer;
            }
        }
        return null;
    }

    protected JsonDeserializer<?> _findCustomReferenceDeserializer(ahi ahiVar, yi yiVar, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
        Iterator<Deserializers> it = this._factoryConfig.b().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindReferenceDeserializer = it.next().findReferenceDeserializer(ahiVar, yiVar, beanDescription, typeDeserializer, jsonDeserializer);
            if (jsonDeserializerFindReferenceDeserializer != null) {
                return jsonDeserializerFindReferenceDeserializer;
            }
        }
        return null;
    }

    protected JsonDeserializer<Object> _findCustomBeanDeserializer(JavaType javaType, yi yiVar, BeanDescription beanDescription) throws ym {
        Iterator<Deserializers> it = this._factoryConfig.b().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindBeanDeserializer = it.next().findBeanDeserializer(javaType, yiVar, beanDescription);
            if (jsonDeserializerFindBeanDeserializer != null) {
                return jsonDeserializerFindBeanDeserializer;
            }
        }
        return null;
    }

    protected JsonDeserializer<?> _findCustomArrayDeserializer(ahe aheVar, yi yiVar, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
        Iterator<Deserializers> it = this._factoryConfig.b().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindArrayDeserializer = it.next().findArrayDeserializer(aheVar, yiVar, beanDescription, typeDeserializer, jsonDeserializer);
            if (jsonDeserializerFindArrayDeserializer != null) {
                return jsonDeserializerFindArrayDeserializer;
            }
        }
        return null;
    }

    protected JsonDeserializer<?> _findCustomCollectionDeserializer(ahg ahgVar, yi yiVar, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
        Iterator<Deserializers> it = this._factoryConfig.b().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindCollectionDeserializer = it.next().findCollectionDeserializer(ahgVar, yiVar, beanDescription, typeDeserializer, jsonDeserializer);
            if (jsonDeserializerFindCollectionDeserializer != null) {
                return jsonDeserializerFindCollectionDeserializer;
            }
        }
        return null;
    }

    protected JsonDeserializer<?> _findCustomCollectionLikeDeserializer(ahb ahbVar, yi yiVar, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
        Iterator<Deserializers> it = this._factoryConfig.b().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindCollectionLikeDeserializer = it.next().findCollectionLikeDeserializer(ahbVar, yiVar, beanDescription, typeDeserializer, jsonDeserializer);
            if (jsonDeserializerFindCollectionLikeDeserializer != null) {
                return jsonDeserializerFindCollectionLikeDeserializer;
            }
        }
        return null;
    }

    protected JsonDeserializer<?> _findCustomEnumDeserializer(Class<?> cls, yi yiVar, BeanDescription beanDescription) throws ym {
        Iterator<Deserializers> it = this._factoryConfig.b().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindEnumDeserializer = it.next().findEnumDeserializer(cls, yiVar, beanDescription);
            if (jsonDeserializerFindEnumDeserializer != null) {
                return jsonDeserializerFindEnumDeserializer;
            }
        }
        return null;
    }

    protected JsonDeserializer<?> _findCustomMapDeserializer(ahh ahhVar, yi yiVar, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
        Iterator<Deserializers> it = this._factoryConfig.b().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindMapDeserializer = it.next().findMapDeserializer(ahhVar, yiVar, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (jsonDeserializerFindMapDeserializer != null) {
                return jsonDeserializerFindMapDeserializer;
            }
        }
        return null;
    }

    protected JsonDeserializer<?> _findCustomMapLikeDeserializer(ahk ahkVar, yi yiVar, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
        Iterator<Deserializers> it = this._factoryConfig.b().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindMapLikeDeserializer = it.next().findMapLikeDeserializer(ahkVar, yiVar, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (jsonDeserializerFindMapLikeDeserializer != null) {
                return jsonDeserializerFindMapLikeDeserializer;
            }
        }
        return null;
    }

    protected JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws ym {
        Object objFindDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindDeserializer = annotationIntrospector.findDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(annotated, objFindDeserializer);
    }

    protected KeyDeserializer findKeyDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws ym {
        Object objFindKeyDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindKeyDeserializer = annotationIntrospector.findKeyDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.keyDeserializerInstance(annotated, objFindKeyDeserializer);
    }

    protected JsonDeserializer<Object> findContentDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws ym {
        Object objFindContentDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindContentDeserializer = annotationIntrospector.findContentDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(annotated, objFindContentDeserializer);
    }

    protected JavaType resolveMemberAndTypeAnnotations(DeserializationContext deserializationContext, AnnotatedMember annotatedMember, JavaType javaType) throws ym {
        KeyDeserializer keyDeserializerKeyDeserializerInstance;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (javaType.isMapLikeType() && javaType.getKeyType() != null && (keyDeserializerKeyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotatedMember, annotationIntrospector.findKeyDeserializer(annotatedMember))) != null) {
            javaType = ((ahk) javaType).c(keyDeserializerKeyDeserializerInstance);
            javaType.getKeyType();
        }
        if (javaType.hasContentType()) {
            JsonDeserializer<Object> jsonDeserializerDeserializerInstance = deserializationContext.deserializerInstance(annotatedMember, annotationIntrospector.findContentDeserializer(annotatedMember));
            if (jsonDeserializerDeserializerInstance != null) {
                javaType = javaType.withContentValueHandler(jsonDeserializerDeserializerInstance);
            }
            TypeDeserializer typeDeserializerFindPropertyContentTypeDeserializer = findPropertyContentTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
            if (typeDeserializerFindPropertyContentTypeDeserializer != null) {
                javaType = javaType.withContentTypeHandler(typeDeserializerFindPropertyContentTypeDeserializer);
            }
        }
        TypeDeserializer typeDeserializerFindPropertyTypeDeserializer = findPropertyTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
        if (typeDeserializerFindPropertyTypeDeserializer != null) {
            javaType = javaType.withTypeHandler(typeDeserializerFindPropertyTypeDeserializer);
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotatedMember, javaType);
    }

    protected ahz constructEnumResolver(Class<?> cls, yi yiVar, AnnotatedMember annotatedMember) {
        if (annotatedMember != null) {
            if (yiVar.canOverrideAccessModifiers()) {
                ahw.a(annotatedMember.getMember(), yiVar.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return ahz.c(yiVar, cls, annotatedMember);
        }
        return ahz.a(yiVar, cls);
    }

    protected boolean _hasCreatorAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        JsonCreator.Mode modeFindCreatorAnnotation;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        return (annotationIntrospector == null || (modeFindCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), annotated)) == null || modeFindCreatorAnnotation == JsonCreator.Mode.DISABLED) ? false : true;
    }

    @Deprecated
    protected JavaType modifyTypeByAnnotation(DeserializationContext deserializationContext, Annotated annotated, JavaType javaType) throws ym {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        return annotationIntrospector == null ? javaType : annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotated, javaType);
    }

    @Deprecated
    protected JavaType resolveType(DeserializationContext deserializationContext, BeanDescription beanDescription, JavaType javaType, AnnotatedMember annotatedMember) throws ym {
        return resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, javaType);
    }

    @Deprecated
    protected aco _findJsonValueFor(yi yiVar, JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return yiVar.e(javaType).findJsonValueMethod();
    }

    protected static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final HashMap<String, Class<? extends Collection>> f4112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final HashMap<String, Class<? extends Map>> f4113b;

        protected d() {
        }

        static {
            HashMap<String, Class<? extends Collection>> map = new HashMap<>();
            map.put(Collection.class.getName(), ArrayList.class);
            map.put(List.class.getName(), ArrayList.class);
            map.put(Set.class.getName(), HashSet.class);
            map.put(SortedSet.class.getName(), TreeSet.class);
            map.put(Queue.class.getName(), LinkedList.class);
            map.put(AbstractList.class.getName(), ArrayList.class);
            map.put(AbstractSet.class.getName(), HashSet.class);
            map.put(Deque.class.getName(), LinkedList.class);
            map.put(NavigableSet.class.getName(), TreeSet.class);
            f4112a = map;
            HashMap<String, Class<? extends Map>> map2 = new HashMap<>();
            map2.put(Map.class.getName(), LinkedHashMap.class);
            map2.put(AbstractMap.class.getName(), LinkedHashMap.class);
            map2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
            map2.put(SortedMap.class.getName(), TreeMap.class);
            map2.put(NavigableMap.class.getName(), TreeMap.class);
            map2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
            f4113b = map2;
        }

        public static Class<?> e(JavaType javaType) {
            return f4112a.get(javaType.getRawClass().getName());
        }

        public static Class<?> d(JavaType javaType) {
            return f4113b.get(javaType.getRawClass().getName());
        }
    }

    protected static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VisibilityChecker<?> f4109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<AnnotatedWithParams, BeanPropertyDefinition[]> f4110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DeserializationContext f4111c;
        public final zs d;
        public final BeanDescription e;
        private int g;
        private List<zo> h;
        private List<zo> i;
        private int j;

        public c(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, zs zsVar, Map<AnnotatedWithParams, BeanPropertyDefinition[]> map) {
            this.f4111c = deserializationContext;
            this.e = beanDescription;
            this.f4109a = visibilityChecker;
            this.d = zsVar;
            this.f4110b = map;
        }

        public AnnotationIntrospector c() {
            return this.f4111c.getAnnotationIntrospector();
        }

        public void d(zo zoVar) {
            if (this.i == null) {
                this.i = new LinkedList();
            }
            this.i.add(zoVar);
        }

        public void i() {
            this.g++;
        }

        public boolean a() {
            return this.g > 0;
        }

        public boolean e() {
            return this.i != null;
        }

        public List<zo> h() {
            return this.i;
        }

        public void e(zo zoVar) {
            if (this.h == null) {
                this.h = new LinkedList();
            }
            this.h.add(zoVar);
        }

        public void g() {
            this.j++;
        }

        public boolean b() {
            return this.j > 0;
        }

        public boolean d() {
            return this.h != null;
        }

        public List<zo> j() {
            return this.h;
        }
    }
}
