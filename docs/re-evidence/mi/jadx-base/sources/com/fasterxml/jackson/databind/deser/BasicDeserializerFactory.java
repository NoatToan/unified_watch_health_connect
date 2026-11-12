package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.EnumResolver;
import defpackage.bip;
import defpackage.c5q;
import defpackage.ecm;
import defpackage.esd;
import defpackage.fd1;
import defpackage.fh2;
import defpackage.h04;
import defpackage.hh2;
import defpackage.i45;
import defpackage.ih2;
import defpackage.mgh;
import defpackage.nf4;
import defpackage.oz5;
import defpackage.pnq;
import defpackage.q4q;
import defpackage.uf2;
import defpackage.usd;
import defpackage.vzd;
import defpackage.wzd;
import defpackage.x10;
import defpackage.xqd;
import defpackage.zsd;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

/* JADX INFO: loaded from: classes4.dex */
public abstract class BasicDeserializerFactory extends com.fasterxml.jackson.databind.deser.a implements Serializable {
    static final HashMap<String, Class<? extends Collection>> _collectionFallbacks;
    static final HashMap<String, Class<? extends Map>> _mapFallbacks;
    protected final DeserializerFactoryConfig _factoryConfig;
    private static final Class<?> CLASS_OBJECT = Object.class;
    private static final Class<?> CLASS_STRING = String.class;
    private static final Class<?> CLASS_CHAR_SEQUENCE = CharSequence.class;
    private static final Class<?> CLASS_ITERABLE = Iterable.class;
    private static final Class<?> CLASS_MAP_ENTRY = Map.Entry.class;
    protected static final PropertyName UNWRAPPED_CREATOR_PARAM_NAME = new PropertyName("@JsonUnwrapped");

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7638a;

        static {
            int[] iArr = new int[JsonCreator.Mode.values().length];
            f7638a = iArr;
            try {
                iArr[JsonCreator.Mode.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7638a[JsonCreator.Mode.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7638a[JsonCreator.Mode.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap<String, Class<? extends Map>> map = new HashMap<>();
        _mapFallbacks = map;
        map.put(Map.class.getName(), LinkedHashMap.class);
        map.put(AbstractMap.class.getName(), LinkedHashMap.class);
        map.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
        map.put(SortedMap.class.getName(), TreeMap.class);
        map.put(NavigableMap.class.getName(), TreeMap.class);
        map.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
        HashMap<String, Class<? extends Collection>> map2 = new HashMap<>();
        _collectionFallbacks = map2;
        map2.put(Collection.class.getName(), ArrayList.class);
        map2.put(List.class.getName(), ArrayList.class);
        map2.put(Set.class.getName(), HashSet.class);
        map2.put(SortedSet.class.getName(), TreeSet.class);
        map2.put(Queue.class.getName(), LinkedList.class);
        map2.put(AbstractList.class.getName(), ArrayList.class);
        map2.put(AbstractSet.class.getName(), HashSet.class);
        map2.put("java.util.Deque", LinkedList.class);
        map2.put("java.util.NavigableSet", TreeSet.class);
    }

    public BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this._factoryConfig = deserializerFactoryConfig;
    }

    private boolean _checkIfCreatorPropertyBased(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, ih2 ih2Var) {
        String name;
        if ((ih2Var == null || !ih2Var.D()) && annotationIntrospector.findInjectableValue(annotatedWithParams.getParameter(0)) == null) {
            return (ih2Var == null || (name = ih2Var.getName()) == null || name.isEmpty() || !ih2Var.b()) ? false : true;
        }
        return true;
    }

    private void _checkImplicitlyNamedConstructors(DeserializationContext deserializationContext, fh2 fh2Var, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, List<AnnotatedWithParams> list) throws JsonMappingException {
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
                    AnnotatedParameter parameter = next.getParameter(i2);
                    PropertyName propertyName_findParamName = _findParamName(parameter, annotationIntrospector);
                    if (propertyName_findParamName == null || propertyName_findParamName.isEmpty()) {
                        break;
                    }
                    settableBeanPropertyArr2[i2] = constructCreatorProperty(deserializationContext, fh2Var, propertyName_findParamName, parameter.getIndex(), parameter, null);
                    i2++;
                }
            }
        }
        if (annotatedWithParams != null) {
            creatorCollector.i(annotatedWithParams, false, settableBeanPropertyArr);
            uf2 uf2Var = (uf2) fh2Var;
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                PropertyName fullName = settableBeanProperty.getFullName();
                if (!uf2Var.K(fullName)) {
                    uf2Var.F(ecm.F(deserializationContext.getConfig(), settableBeanProperty.getMember(), fullName));
                }
            }
        }
    }

    private vzd _createEnumKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        fh2 fh2VarIntrospect = config.introspect(javaType);
        vzd vzdVarFindKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, fh2VarIntrospect.u());
        if (vzdVarFindKeyDeserializerFromAnnotation != null) {
            return vzdVarFindKeyDeserializerFromAnnotation;
        }
        esd<?> esdVar_findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, fh2VarIntrospect);
        if (esdVar_findCustomEnumDeserializer != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, esdVar_findCustomEnumDeserializer);
        }
        esd<Object> esdVarFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, fh2VarIntrospect.u());
        if (esdVarFindDeserializerFromAnnotation != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, esdVarFindDeserializerFromAnnotation);
        }
        EnumResolver enumResolverConstructEnumResolver = constructEnumResolver(rawClass, config, fh2VarIntrospect.j());
        for (AnnotatedMethod annotatedMethod : fh2VarIntrospect.w()) {
            if (_hasCreatorAnnotation(deserializationContext, annotatedMethod)) {
                if (annotatedMethod.getParameterCount() != 1 || !annotatedMethod.getRawReturnType().isAssignableFrom(rawClass)) {
                    throw new IllegalArgumentException("Unsuitable method (" + annotatedMethod + ") decorated with @JsonCreator (for Enum type " + rawClass.getName() + ")");
                }
                if (annotatedMethod.getRawParameterType(0) == String.class) {
                    if (config.canOverrideAccessModifiers()) {
                        h04.f(annotatedMethod.getMember(), deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return StdKeyDeserializers.constructEnumKeyDeserializer(enumResolverConstructEnumResolver, annotatedMethod);
                }
                throw new IllegalArgumentException("Parameter #0 type for factory method (" + annotatedMethod + ") not suitable, must be java.lang.String");
            }
        }
        return StdKeyDeserializers.constructEnumKeyDeserializer(enumResolverConstructEnumResolver);
    }

    private PropertyName _findParamName(AnnotatedParameter annotatedParameter, AnnotationIntrospector annotationIntrospector) {
        if (annotatedParameter == null || annotationIntrospector == null) {
            return null;
        }
        PropertyName propertyNameFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedParameter);
        if (propertyNameFindNameForDeserialization != null) {
            return propertyNameFindNameForDeserialization;
        }
        String strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedParameter);
        if (strFindImplicitPropertyName == null || strFindImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(strFindImplicitPropertyName);
    }

    private b _findStdValueInstantiator(DeserializationConfig deserializationConfig, fh2 fh2Var) throws JsonMappingException {
        Class<?> clsS = fh2Var.s();
        if (clsS == JsonLocation.class) {
            return new usd();
        }
        if (!Collection.class.isAssignableFrom(clsS)) {
            if (!Map.class.isAssignableFrom(clsS)) {
                return null;
            }
            Map map = Collections.EMPTY_MAP;
            if (map.getClass() == clsS) {
                return new nf4(map);
            }
            return null;
        }
        Set set = Collections.EMPTY_SET;
        if (set.getClass() == clsS) {
            return new nf4(set);
        }
        List list = Collections.EMPTY_LIST;
        if (list.getClass() == clsS) {
            return new nf4(list);
        }
        return null;
    }

    private JavaType _mapAbstractType2(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (!this._factoryConfig.hasAbstractTypeResolvers()) {
            return null;
        }
        Iterator<x10> it = this._factoryConfig.abstractTypeResolvers().iterator();
        while (it.hasNext()) {
            JavaType javaTypeFindTypeMapping = it.next().findTypeMapping(deserializationConfig, javaType);
            if (javaTypeFindTypeMapping != null && !javaTypeFindTypeMapping.hasRawClass(rawClass)) {
                return javaTypeFindTypeMapping;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0146  */
    /* JADX WARN: Code duplicated, block: B:57:0x0151  */
    /* JADX WARN: Code duplicated, block: B:58:0x0168  */
    /* JADX WARN: Code duplicated, block: B:60:0x0170  */
    /* JADX WARN: Code duplicated, block: B:61:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0176  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [int] */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [int] */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r23v0, types: [i45] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.fasterxml.jackson.databind.deser.BasicDeserializerFactory] */
    /* JADX WARN: Type inference failed for: r28v0, types: [com.fasterxml.jackson.databind.AnnotationIntrospector] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.fasterxml.jackson.databind.deser.impl.CreatorCollector] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [i45] */
    /* JADX WARN: Type inference failed for: r6v3, types: [i45] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public void _addDeserializerConstructors(DeserializationContext deserializationContext, fh2 fh2Var, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, Map<AnnotatedWithParams, ih2[]> map) throws JsonMappingException {
        int i;
        ?? r18;
        ?? r6;
        ?? r2;
        ?? r0;
        ?? r22;
        byte b2;
        SettableBeanProperty[] settableBeanPropertyArr;
        int i2;
        ?? r23;
        byte b3;
        byte b4;
        VisibilityChecker<?> visibilityChecker2 = visibilityChecker;
        if (fh2Var.C()) {
            return;
        }
        AnnotatedConstructor annotatedConstructorD = fh2Var.d();
        if (annotatedConstructorD != null && (!creatorCollector.l() || _hasCreatorAnnotation(deserializationContext, annotatedConstructorD))) {
            creatorCollector.o(annotatedConstructorD);
        }
        LinkedList<??> linkedList = new LinkedList();
        Iterator<AnnotatedConstructor> it = fh2Var.v().iterator();
        ?? r13 = 0;
        int i3 = 0;
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            AnnotatedConstructor next = it.next();
            JsonCreator.Mode modeFindCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), next);
            if (JsonCreator.Mode.DISABLED != modeFindCreatorAnnotation) {
                if (modeFindCreatorAnnotation != null) {
                    int i4 = a.f7638a[modeFindCreatorAnnotation.ordinal()];
                    if (i4 == 1) {
                        _addExplicitDelegatingCreator(deserializationContext, fh2Var, creatorCollector, i45.a(annotationIntrospector, next, null));
                    } else if (i4 != 2) {
                        _addExplicitAnyCreator(deserializationContext, fh2Var, creatorCollector, i45.a(annotationIntrospector, next, map.get(next)));
                    } else {
                        _addExplicitPropertyCreator(deserializationContext, fh2Var, creatorCollector, i45.a(annotationIntrospector, next, map.get(next)));
                    }
                    i3++;
                } else if (visibilityChecker2.isCreatorVisible(next)) {
                    linkedList.add(i45.a(annotationIntrospector, next, map.get(next)));
                }
            }
        }
        if (i3 > 0) {
            return;
        }
        LinkedList linkedList2 = null;
        for (?? r7 : linkedList) {
            int iG = r7.g();
            ?? B = r7.b();
            if (iG == i) {
                ih2 ih2VarJ = r7.j(r13);
                if (_checkIfCreatorPropertyBased(annotationIntrospector, B, ih2VarJ)) {
                    creatorCollector.i(B, r13, new SettableBeanProperty[]{constructCreatorProperty(deserializationContext, fh2Var, r7.h(r13), 0, r7.i(r13), r7.f(r13))});
                } else {
                    _handleSingleArgumentCreator(creatorCollector, B, r13, visibilityChecker2.isCreatorVisible(B));
                    if (ih2VarJ != null) {
                        ((mgh) ih2VarJ).p0();
                    }
                }
                r0 = r13;
            } else {
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[iG];
                byte b5 = -1;
                ?? r3 = r13;
                ?? r19 = r3;
                int i5 = r19 == true ? 1 : 0;
                while (r2 < iG) {
                    AnnotatedParameter parameter = B.getParameter(r2);
                    ih2 ih2VarJ2 = r6.j(r2);
                    JacksonInject.Value valueFindInjectableValue = annotationIntrospector.findInjectableValue(parameter);
                    PropertyName fullName = ih2VarJ2 == null ? null : ih2VarJ2.getFullName();
                    if (ih2VarJ2 != null) {
                        r2 = r3;
                        r6 = r7;
                        r18 = r19;
                        if (ih2VarJ2.D()) {
                            r2 = r3;
                            r6 = r7;
                            r18 = r19;
                            ?? r24 = r2;
                            b4 = b5;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            i2 = iG;
                            r23 = r6;
                            settableBeanPropertyArr[r24 == true ? 1 : 0] = constructCreatorProperty(deserializationContext, fh2Var, fullName, r24 == true ? 1 : 0, parameter, valueFindInjectableValue);
                            r18++;
                            r22 = r24;
                        } else {
                            r2 = r3;
                            r6 = r7;
                            r18 = r19;
                            r2 = r3;
                            r6 = r7;
                            r18 = r19;
                            r2 = r3;
                            r6 = r7;
                            r18 = r19;
                            r22 = r2;
                            b2 = b5;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            i2 = iG;
                            r23 = r6;
                            if (valueFindInjectableValue != null) {
                                i5++;
                                settableBeanPropertyArr[r22 == true ? 1 : 0] = constructCreatorProperty(deserializationContext, fh2Var, fullName, r22 == true ? 1 : 0, parameter, valueFindInjectableValue);
                                b4 = b2;
                                r18 = r18;
                                r22 = r22;
                                r23 = r23;
                            } else if (annotationIntrospector.findUnwrappingNameTransformer(parameter) != null) {
                                b4 = b2;
                                r18 = r18;
                                r22 = r22;
                                r23 = r23;
                                _reportUnwrappedCreatorProperty(deserializationContext, fh2Var, parameter);
                                b4 = b2;
                                r18 = r18;
                                r22 = r22;
                                r23 = r23;
                            } else if (b2 < 0) {
                                b3 = r22 == true ? 1 : 0;
                            }
                        }
                        b3 = b4;
                    } else {
                        r2 = r3;
                        r6 = r7;
                        r18 = r19;
                        r2 = r3;
                        r6 = r7;
                        r18 = r19;
                        r2 = r3;
                        r6 = r7;
                        r18 = r19;
                        r22 = r2;
                        b2 = b5;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                        i2 = iG;
                        r23 = r6;
                        if (valueFindInjectableValue != null) {
                            i5++;
                            settableBeanPropertyArr[r22 == true ? 1 : 0] = constructCreatorProperty(deserializationContext, fh2Var, fullName, r22 == true ? 1 : 0, parameter, valueFindInjectableValue);
                            b4 = b2;
                            r18 = r18;
                            r22 = r22;
                            r23 = r23;
                        } else if (annotationIntrospector.findUnwrappingNameTransformer(parameter) != null) {
                            b4 = b2;
                            r18 = r18;
                            r22 = r22;
                            r23 = r23;
                            _reportUnwrappedCreatorProperty(deserializationContext, fh2Var, parameter);
                            b4 = b2;
                            r18 = r18;
                            r22 = r22;
                            r23 = r23;
                        } else if (b2 < 0) {
                            b3 = r22 == true ? 1 : 0;
                        }
                        b3 = b4;
                    }
                    iG = i2;
                    settableBeanPropertyArr2 = settableBeanPropertyArr;
                    r6 = r23;
                    r2 = r22 + 1;
                    b5 = b3;
                    r18 = r18;
                }
                r2 = r3;
                r6 = r7;
                r18 = r19;
                byte b6 = b5;
                SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                int i6 = iG;
                ?? r25 = r6;
                if (r18 <= 0 && i5 <= 0) {
                    r0 = 0;
                } else if (r18 + i5 == i6) {
                    r0 = 0;
                    creatorCollector.i(B, false, settableBeanPropertyArr3);
                } else {
                    r0 = 0;
                    r0 = 0;
                    r0 = 0;
                    if (r18 == 0 && i5 + 1 == i6) {
                        creatorCollector.e(B, false, settableBeanPropertyArr3, 0);
                    } else {
                        PropertyName propertyNameD = r25.d(b6 == true ? 1 : 0);
                        if (propertyNameD == null || propertyNameD.isEmpty()) {
                            deserializationContext.reportBadTypeDefinition(fh2Var, "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(b6 == true ? 1 : 0), B);
                        }
                    }
                }
                if (!creatorCollector.l()) {
                    if (linkedList2 == null) {
                        linkedList2 = new LinkedList();
                    }
                    LinkedList linkedList3 = linkedList2;
                    linkedList3.add(B);
                    linkedList2 = linkedList3;
                }
            }
            visibilityChecker2 = visibilityChecker;
            r13 = r0;
            i = 1;
        }
        if (linkedList2 == null || creatorCollector.m() || creatorCollector.n()) {
            return;
        }
        _checkImplicitlyNamedConstructors(deserializationContext, fh2Var, visibilityChecker, annotationIntrospector, creatorCollector, linkedList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [ih2] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    public void _addDeserializerFactoryMethods(DeserializationContext deserializationContext, fh2 fh2Var, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, Map<AnnotatedWithParams, ih2[]> map) throws JsonMappingException {
        AnnotatedParameter annotatedParameter;
        int i;
        int i2;
        SettableBeanProperty[] settableBeanPropertyArr;
        AnnotatedWithParams annotatedWithParams;
        int i3;
        int i4;
        VisibilityChecker<?> visibilityChecker2 = visibilityChecker;
        Map<AnnotatedWithParams, ih2[]> map2 = map;
        LinkedList<i45> linkedList = new LinkedList();
        Iterator<AnnotatedMethod> it = fh2Var.w().iterator();
        int i5 = 0;
        while (true) {
            annotatedParameter = null;
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            AnnotatedMethod next = it.next();
            JsonCreator.Mode modeFindCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), next);
            int parameterCount = next.getParameterCount();
            if (modeFindCreatorAnnotation == null) {
                if (parameterCount == 1 && visibilityChecker2.isCreatorVisible(next)) {
                    linkedList.add(i45.a(annotationIntrospector, next, null));
                }
            } else if (modeFindCreatorAnnotation != JsonCreator.Mode.DISABLED) {
                if (parameterCount == 0) {
                    creatorCollector.o(next);
                } else {
                    int i6 = a.f7638a[modeFindCreatorAnnotation.ordinal()];
                    if (i6 == 1) {
                        _addExplicitDelegatingCreator(deserializationContext, fh2Var, creatorCollector, i45.a(annotationIntrospector, next, null));
                    } else if (i6 != 2) {
                        _addExplicitAnyCreator(deserializationContext, fh2Var, creatorCollector, i45.a(annotationIntrospector, next, map2.get(next)));
                    } else {
                        _addExplicitPropertyCreator(deserializationContext, fh2Var, creatorCollector, i45.a(annotationIntrospector, next, map2.get(next)));
                    }
                    i5++;
                }
            }
        }
        if (i5 > 0) {
            return;
        }
        for (i45 i45Var : linkedList) {
            int iG = i45Var.g();
            AnnotatedWithParams annotatedWithParamsB = i45Var.b();
            ih2[] ih2VarArr = map2.get(annotatedWithParamsB);
            if (iG == i) {
                ih2 ih2VarJ = i45Var.j(0);
                if (_checkIfCreatorPropertyBased(annotationIntrospector, annotatedWithParamsB, ih2VarJ)) {
                    SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[iG];
                    AnnotatedParameter annotatedParameter2 = annotatedParameter;
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    while (i7 < iG) {
                        AnnotatedParameter parameter = annotatedWithParamsB.getParameter(i7);
                        ?? r0 = ih2VarArr == null ? annotatedParameter : ih2VarArr[i7];
                        JacksonInject.Value valueFindInjectableValue = annotationIntrospector.findInjectableValue(parameter);
                        PropertyName fullName = r0 == 0 ? annotatedParameter : r0.getFullName();
                        if (r0 == 0 || !r0.D()) {
                            i2 = i7;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            annotatedWithParams = annotatedWithParamsB;
                            i3 = iG;
                            i4 = i;
                            if (valueFindInjectableValue != null) {
                                i9++;
                                settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, fh2Var, fullName, i2, parameter, valueFindInjectableValue);
                            } else if (annotationIntrospector.findUnwrappingNameTransformer(parameter) != null) {
                                _reportUnwrappedCreatorProperty(deserializationContext, fh2Var, parameter);
                            } else if (annotatedParameter2 == null) {
                                annotatedParameter2 = parameter;
                            }
                        } else {
                            i8++;
                            i2 = i7;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            annotatedWithParams = annotatedWithParamsB;
                            i3 = iG;
                            i4 = i;
                            settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, fh2Var, fullName, i2, parameter, valueFindInjectableValue);
                        }
                        i7 = i2 + 1;
                        annotatedWithParamsB = annotatedWithParams;
                        iG = i3;
                        settableBeanPropertyArr2 = settableBeanPropertyArr;
                        i = i4;
                        annotatedParameter = null;
                    }
                    SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                    AnnotatedWithParams annotatedWithParams2 = annotatedWithParamsB;
                    int i10 = iG;
                    int i11 = i;
                    if (i8 > 0 || i9 > 0) {
                        if (i8 + i9 == i10) {
                            creatorCollector.i(annotatedWithParams2, false, settableBeanPropertyArr3);
                        } else if (i8 == 0 && i9 + 1 == i10) {
                            creatorCollector.e(annotatedWithParams2, false, settableBeanPropertyArr3, 0);
                        } else {
                            deserializationContext.reportBadTypeDefinition(fh2Var, "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(annotatedParameter2.getIndex()), annotatedWithParams2);
                        }
                    }
                    visibilityChecker2 = visibilityChecker;
                    map2 = map;
                    i = i11;
                    annotatedParameter = null;
                } else {
                    _handleSingleArgumentCreator(creatorCollector, annotatedWithParamsB, false, visibilityChecker2.isCreatorVisible(annotatedWithParamsB));
                    if (ih2VarJ != null) {
                        ((mgh) ih2VarJ).p0();
                    }
                }
            }
        }
    }

    public void _addExplicitAnyCreator(DeserializationContext deserializationContext, fh2 fh2Var, CreatorCollector creatorCollector, i45 i45Var) throws JsonMappingException {
        if (1 != i45Var.g()) {
            int iE = i45Var.e();
            if (iE < 0 || i45Var.h(iE) != null) {
                _addExplicitPropertyCreator(deserializationContext, fh2Var, creatorCollector, i45Var);
                return;
            } else {
                _addExplicitDelegatingCreator(deserializationContext, fh2Var, creatorCollector, i45Var);
                return;
            }
        }
        boolean z = false;
        AnnotatedParameter annotatedParameterI = i45Var.i(0);
        JacksonInject.Value valueF = i45Var.f(0);
        PropertyName propertyNameC = i45Var.c(0);
        ih2 ih2VarJ = i45Var.j(0);
        boolean z2 = (propertyNameC == null && valueF == null) ? false : true;
        if (!z2 && ih2VarJ != null) {
            propertyNameC = i45Var.h(0);
            if (propertyNameC != null && ih2VarJ.b()) {
                z = true;
            }
            z2 = z;
        }
        PropertyName propertyName = propertyNameC;
        if (z2) {
            creatorCollector.i(i45Var.b(), true, new SettableBeanProperty[]{constructCreatorProperty(deserializationContext, fh2Var, propertyName, 0, annotatedParameterI, valueF)});
            return;
        }
        _handleSingleArgumentCreator(creatorCollector, i45Var.b(), true, true);
        if (ih2VarJ != null) {
            ((mgh) ih2VarJ).p0();
        }
    }

    public void _addExplicitDelegatingCreator(DeserializationContext deserializationContext, fh2 fh2Var, CreatorCollector creatorCollector, i45 i45Var) throws JsonMappingException {
        int iG = i45Var.g();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[iG];
        int i = -1;
        for (int i2 = 0; i2 < iG; i2++) {
            AnnotatedParameter annotatedParameterI = i45Var.i(i2);
            JacksonInject.Value valueF = i45Var.f(i2);
            if (valueF != null) {
                settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, fh2Var, null, i2, annotatedParameterI, valueF);
            } else if (i < 0) {
                i = i2;
            } else {
                deserializationContext.reportBadTypeDefinition(fh2Var, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i), Integer.valueOf(i2), i45Var);
            }
        }
        if (i < 0) {
            deserializationContext.reportBadTypeDefinition(fh2Var, "No argument left as delegating for Creator %s: exactly one required", i45Var);
        }
        if (iG != 1) {
            creatorCollector.e(i45Var.b(), true, settableBeanPropertyArr, i);
            return;
        }
        _handleSingleArgumentCreator(creatorCollector, i45Var.b(), true, true);
        ih2 ih2VarJ = i45Var.j(0);
        if (ih2VarJ != null) {
            ((mgh) ih2VarJ).p0();
        }
    }

    public void _addExplicitPropertyCreator(DeserializationContext deserializationContext, fh2 fh2Var, CreatorCollector creatorCollector, i45 i45Var) throws JsonMappingException {
        int iG = i45Var.g();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[iG];
        for (int i = 0; i < iG; i++) {
            JacksonInject.Value valueF = i45Var.f(i);
            AnnotatedParameter annotatedParameterI = i45Var.i(i);
            PropertyName propertyNameH = i45Var.h(i);
            if (propertyNameH == null) {
                if (deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(annotatedParameterI) != null) {
                    _reportUnwrappedCreatorProperty(deserializationContext, fh2Var, annotatedParameterI);
                }
                propertyNameH = i45Var.d(i);
                if (propertyNameH == null && valueF == null) {
                    deserializationContext.reportBadTypeDefinition(fh2Var, "Argument #%d has no property name, is not Injectable: can not use as Creator %s", Integer.valueOf(i), i45Var);
                }
            }
            settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, fh2Var, propertyNameH, i, annotatedParameterI, valueF);
        }
        creatorCollector.i(i45Var.b(), true, settableBeanPropertyArr);
    }

    public b _constructDefaultValueInstantiator(DeserializationContext deserializationContext, fh2 fh2Var) throws JsonMappingException {
        CreatorCollector creatorCollector = new CreatorCollector(fh2Var, deserializationContext.getConfig());
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        VisibilityChecker<?> defaultVisibilityChecker = deserializationContext.getConfig().getDefaultVisibilityChecker(fh2Var.s(), fh2Var.u());
        Map<AnnotatedWithParams, ih2[]> map_findCreatorsFromProperties = _findCreatorsFromProperties(deserializationContext, fh2Var);
        _addDeserializerFactoryMethods(deserializationContext, fh2Var, defaultVisibilityChecker, annotationIntrospector, creatorCollector, map_findCreatorsFromProperties);
        if (fh2Var.z().isConcrete()) {
            _addDeserializerConstructors(deserializationContext, fh2Var, defaultVisibilityChecker, annotationIntrospector, creatorCollector, map_findCreatorsFromProperties);
        }
        return creatorCollector.k(deserializationContext);
    }

    public Map<AnnotatedWithParams, ih2[]> _findCreatorsFromProperties(DeserializationContext deserializationContext, fh2 fh2Var) throws JsonMappingException {
        Map<AnnotatedWithParams, ih2[]> mapEmptyMap = Collections.emptyMap();
        for (ih2 ih2Var : fh2Var.o()) {
            Iterator<AnnotatedParameter> itM = ih2Var.m();
            while (itM.hasNext()) {
                AnnotatedParameter next = itM.next();
                AnnotatedWithParams owner = next.getOwner();
                ih2[] ih2VarArr = mapEmptyMap.get(owner);
                int index = next.getIndex();
                if (ih2VarArr == null) {
                    if (mapEmptyMap.isEmpty()) {
                        mapEmptyMap = new LinkedHashMap<>();
                    }
                    ih2VarArr = new ih2[owner.getParameterCount()];
                    mapEmptyMap.put(owner, ih2VarArr);
                } else if (ih2VarArr[index] != null) {
                    deserializationContext.reportBadTypeDefinition(fh2Var, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(index), owner, ih2VarArr[index], ih2Var);
                }
                ih2VarArr[index] = ih2Var;
            }
        }
        return mapEmptyMap;
    }

    public esd<?> _findCustomArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, fh2 fh2Var, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
        Iterator<oz5> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            esd<?> esdVarFindArrayDeserializer = it.next().findArrayDeserializer(arrayType, deserializationConfig, fh2Var, q4qVar, esdVar);
            if (esdVarFindArrayDeserializer != null) {
                return esdVarFindArrayDeserializer;
            }
        }
        return null;
    }

    public esd<Object> _findCustomBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, fh2 fh2Var) throws JsonMappingException {
        Iterator<oz5> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            esd<?> esdVarFindBeanDeserializer = it.next().findBeanDeserializer(javaType, deserializationConfig, fh2Var);
            if (esdVarFindBeanDeserializer != null) {
                return esdVarFindBeanDeserializer;
            }
        }
        return null;
    }

    public esd<?> _findCustomCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, fh2 fh2Var, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
        Iterator<oz5> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            esd<?> esdVarFindCollectionDeserializer = it.next().findCollectionDeserializer(collectionType, deserializationConfig, fh2Var, q4qVar, esdVar);
            if (esdVarFindCollectionDeserializer != null) {
                return esdVarFindCollectionDeserializer;
            }
        }
        return null;
    }

    public esd<?> _findCustomCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, fh2 fh2Var, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
        Iterator<oz5> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            esd<?> esdVarFindCollectionLikeDeserializer = it.next().findCollectionLikeDeserializer(collectionLikeType, deserializationConfig, fh2Var, q4qVar, esdVar);
            if (esdVarFindCollectionLikeDeserializer != null) {
                return esdVarFindCollectionLikeDeserializer;
            }
        }
        return null;
    }

    public esd<?> _findCustomEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, fh2 fh2Var) throws JsonMappingException {
        Iterator<oz5> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            esd<?> esdVarFindEnumDeserializer = it.next().findEnumDeserializer(cls, deserializationConfig, fh2Var);
            if (esdVarFindEnumDeserializer != null) {
                return esdVarFindEnumDeserializer;
            }
        }
        return null;
    }

    public esd<?> _findCustomMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, fh2 fh2Var, vzd vzdVar, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
        Iterator<oz5> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            esd<?> esdVarFindMapDeserializer = it.next().findMapDeserializer(mapType, deserializationConfig, fh2Var, vzdVar, q4qVar, esdVar);
            if (esdVarFindMapDeserializer != null) {
                return esdVarFindMapDeserializer;
            }
        }
        return null;
    }

    public esd<?> _findCustomMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, fh2 fh2Var, vzd vzdVar, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
        Iterator<oz5> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            esd<?> esdVarFindMapLikeDeserializer = it.next().findMapLikeDeserializer(mapLikeType, deserializationConfig, fh2Var, vzdVar, q4qVar, esdVar);
            if (esdVarFindMapLikeDeserializer != null) {
                return esdVarFindMapLikeDeserializer;
            }
        }
        return null;
    }

    public esd<?> _findCustomReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, fh2 fh2Var, q4q q4qVar, esd<?> esdVar) throws JsonMappingException {
        Iterator<oz5> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            esd<?> esdVarFindReferenceDeserializer = it.next().findReferenceDeserializer(referenceType, deserializationConfig, fh2Var, q4qVar, esdVar);
            if (esdVarFindReferenceDeserializer != null) {
                return esdVarFindReferenceDeserializer;
            }
        }
        return null;
    }

    public esd<?> _findCustomTreeNodeDeserializer(Class<? extends zsd> cls, DeserializationConfig deserializationConfig, fh2 fh2Var) throws JsonMappingException {
        Iterator<oz5> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            esd<?> esdVarFindTreeNodeDeserializer = it.next().findTreeNodeDeserializer(cls, deserializationConfig, fh2Var);
            if (esdVarFindTreeNodeDeserializer != null) {
                return esdVarFindTreeNodeDeserializer;
            }
        }
        return null;
    }

    @Deprecated
    public AnnotatedMethod _findJsonValueFor(DeserializationConfig deserializationConfig, JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return deserializationConfig.introspect(javaType).k();
    }

    public JavaType _findRemappedType(DeserializationConfig deserializationConfig, Class<?> cls) throws JsonMappingException {
        JavaType javaTypeMapAbstractType = mapAbstractType(deserializationConfig, deserializationConfig.constructType(cls));
        if (javaTypeMapAbstractType == null || javaTypeMapAbstractType.hasRawClass(cls)) {
            return null;
        }
        return javaTypeMapAbstractType;
    }

    public boolean _handleSingleArgumentCreator(CreatorCollector creatorCollector, AnnotatedWithParams annotatedWithParams, boolean z, boolean z2) {
        Class<?> rawParameterType = annotatedWithParams.getRawParameterType(0);
        if (rawParameterType == String.class || rawParameterType == CLASS_CHAR_SEQUENCE) {
            if (z || z2) {
                creatorCollector.j(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Integer.TYPE || rawParameterType == Integer.class) {
            if (z || z2) {
                creatorCollector.g(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Long.TYPE || rawParameterType == Long.class) {
            if (z || z2) {
                creatorCollector.h(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Double.TYPE || rawParameterType == Double.class) {
            if (z || z2) {
                creatorCollector.f(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Boolean.TYPE || rawParameterType == Boolean.class) {
            if (z || z2) {
                creatorCollector.d(annotatedWithParams, z);
            }
            return true;
        }
        if (!z) {
            return false;
        }
        creatorCollector.e(annotatedWithParams, z, null, 0);
        return true;
    }

    public boolean _hasCreatorAnnotation(DeserializationContext deserializationContext, fd1 fd1Var) {
        JsonCreator.Mode modeFindCreatorAnnotation;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        return (annotationIntrospector == null || (modeFindCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), fd1Var)) == null || modeFindCreatorAnnotation == JsonCreator.Mode.DISABLED) ? false : true;
    }

    public CollectionType _mapAbstractCollectionType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<? extends Collection> cls = _collectionFallbacks.get(javaType.getRawClass().getName());
        if (cls == null) {
            return null;
        }
        return (CollectionType) deserializationConfig.constructSpecializedType(javaType, cls);
    }

    public void _reportUnwrappedCreatorProperty(DeserializationContext deserializationContext, fh2 fh2Var, AnnotatedParameter annotatedParameter) throws JsonMappingException {
        deserializationContext.reportBadDefinition(fh2Var.z(), String.format("Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", Integer.valueOf(annotatedParameter.getIndex())));
    }

    public b _valueInstantiatorInstance(DeserializationConfig deserializationConfig, fd1 fd1Var, Object obj) throws JsonMappingException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof b) {
            return (b) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
        }
        Class cls = (Class) obj;
        if (h04.K(cls)) {
            return null;
        }
        if (b.class.isAssignableFrom(cls)) {
            deserializationConfig.getHandlerInstantiator();
            return (b) h04.k(cls, deserializationConfig.canOverrideAccessModifiers());
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<ValueInstantiator>");
    }

    public SettableBeanProperty constructCreatorProperty(DeserializationContext deserializationContext, fh2 fh2Var, PropertyName propertyName, int i, AnnotatedParameter annotatedParameter, JacksonInject.Value value) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        PropertyMetadata propertyMetadataConstruct = annotationIntrospector == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : PropertyMetadata.construct(annotationIntrospector.hasRequiredMarker(annotatedParameter), annotationIntrospector.findPropertyDescription(annotatedParameter), annotationIntrospector.findPropertyIndex(annotatedParameter), annotationIntrospector.findPropertyDefaultValue(annotatedParameter));
        JavaType javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedParameter, annotatedParameter.getType());
        BeanProperty.Std std = new BeanProperty.Std(propertyName, javaTypeResolveMemberAndTypeAnnotations, annotationIntrospector.findWrapperName(annotatedParameter), annotatedParameter, propertyMetadataConstruct);
        q4q q4qVarFindTypeDeserializer = (q4q) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler();
        if (q4qVarFindTypeDeserializer == null) {
            q4qVarFindTypeDeserializer = findTypeDeserializer(config, javaTypeResolveMemberAndTypeAnnotations);
        }
        CreatorProperty creatorProperty = new CreatorProperty(propertyName, javaTypeResolveMemberAndTypeAnnotations, std.getWrapperName(), q4qVarFindTypeDeserializer, fh2Var.t(), annotatedParameter, i, value == null ? null : value.getId(), propertyMetadataConstruct);
        esd<?> esdVarFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedParameter);
        if (esdVarFindDeserializerFromAnnotation == null) {
            esdVarFindDeserializerFromAnnotation = (esd) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        return esdVarFindDeserializerFromAnnotation != null ? creatorProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(esdVarFindDeserializerFromAnnotation, creatorProperty, javaTypeResolveMemberAndTypeAnnotations)) : creatorProperty;
    }

    public EnumResolver constructEnumResolver(Class<?> cls, DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember == null) {
            return EnumResolver.constructUnsafe(cls, deserializationConfig.getAnnotationIntrospector());
        }
        if (deserializationConfig.canOverrideAccessModifiers()) {
            h04.f(annotatedMember.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return EnumResolver.constructUnsafeUsingMethod(cls, annotatedMember, deserializationConfig.getAnnotationIntrospector());
    }

    @Override // com.fasterxml.jackson.databind.deser.a
    public esd<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, fh2 fh2Var) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType contentType = arrayType.getContentType();
        esd<?> esdVar = (esd) contentType.getValueHandler();
        q4q q4qVarFindTypeDeserializer = (q4q) contentType.getTypeHandler();
        if (q4qVarFindTypeDeserializer == null) {
            q4qVarFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        q4q q4qVar = q4qVarFindTypeDeserializer;
        esd<?> esdVar_findCustomArrayDeserializer = _findCustomArrayDeserializer(arrayType, config, fh2Var, q4qVar, esdVar);
        if (esdVar_findCustomArrayDeserializer == null) {
            if (esdVar == null) {
                Class<?> rawClass = contentType.getRawClass();
                if (contentType.isPrimitive()) {
                    return PrimitiveArrayDeserializers.forType(rawClass);
                }
                if (rawClass == String.class) {
                    return StringArrayDeserializer.instance;
                }
            }
            esdVar_findCustomArrayDeserializer = new ObjectArrayDeserializer(arrayType, esdVar, q4qVar);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<hh2> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                esdVar_findCustomArrayDeserializer = it.next().a(config, arrayType, fh2Var, esdVar_findCustomArrayDeserializer);
            }
        }
        return esdVar_findCustomArrayDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.a
    public esd<?> createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, fh2 fh2Var) throws JsonMappingException {
        JavaType contentType = collectionType.getContentType();
        esd<?> esdVar = (esd) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        q4q q4qVarFindTypeDeserializer = (q4q) contentType.getTypeHandler();
        if (q4qVarFindTypeDeserializer == null) {
            q4qVarFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        q4q q4qVar = q4qVarFindTypeDeserializer;
        esd<?> esdVar_findCustomCollectionDeserializer = _findCustomCollectionDeserializer(collectionType, config, fh2Var, q4qVar, esdVar);
        if (esdVar_findCustomCollectionDeserializer == null) {
            Class<?> rawClass = collectionType.getRawClass();
            if (esdVar == null && EnumSet.class.isAssignableFrom(rawClass)) {
                esdVar_findCustomCollectionDeserializer = new EnumSetDeserializer(contentType, null);
            }
        }
        if (esdVar_findCustomCollectionDeserializer == null) {
            if (collectionType.isInterface() || collectionType.isAbstract()) {
                CollectionType collectionType_mapAbstractCollectionType = _mapAbstractCollectionType(collectionType, config);
                if (collectionType_mapAbstractCollectionType != null) {
                    fh2Var = config.introspectForCreation(collectionType_mapAbstractCollectionType);
                    collectionType = collectionType_mapAbstractCollectionType;
                } else {
                    if (collectionType.getTypeHandler() == null) {
                        throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Collection type " + collectionType);
                    }
                    esdVar_findCustomCollectionDeserializer = AbstractDeserializer.constructForNonPOJO(fh2Var);
                }
            }
            if (esdVar_findCustomCollectionDeserializer == null) {
                b bVarFindValueInstantiator = findValueInstantiator(deserializationContext, fh2Var);
                if (!bVarFindValueInstantiator.canCreateUsingDefault()) {
                    if (collectionType.hasRawClass(ArrayBlockingQueue.class)) {
                        return new ArrayBlockingQueueDeserializer(collectionType, esdVar, q4qVar, bVarFindValueInstantiator);
                    }
                    esd<?> esdVarB = xqd.b(deserializationContext, collectionType);
                    if (esdVarB != null) {
                        return esdVarB;
                    }
                }
                esdVar_findCustomCollectionDeserializer = contentType.hasRawClass(String.class) ? new StringCollectionDeserializer(collectionType, esdVar, bVarFindValueInstantiator) : new CollectionDeserializer(collectionType, esdVar, q4qVar, bVarFindValueInstantiator);
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<hh2> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                esdVar_findCustomCollectionDeserializer = it.next().b(config, collectionType, fh2Var, esdVar_findCustomCollectionDeserializer);
            }
        }
        return esdVar_findCustomCollectionDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.a
    public esd<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, fh2 fh2Var) throws JsonMappingException {
        JavaType contentType = collectionLikeType.getContentType();
        esd<?> esdVar = (esd) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        q4q q4qVar = (q4q) contentType.getTypeHandler();
        esd<?> esdVar_findCustomCollectionLikeDeserializer = _findCustomCollectionLikeDeserializer(collectionLikeType, config, fh2Var, q4qVar == null ? findTypeDeserializer(config, contentType) : q4qVar, esdVar);
        if (esdVar_findCustomCollectionLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<hh2> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                esdVar_findCustomCollectionLikeDeserializer = it.next().c(config, collectionLikeType, fh2Var, esdVar_findCustomCollectionLikeDeserializer);
            }
        }
        return esdVar_findCustomCollectionLikeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.a
    public esd<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, fh2 fh2Var) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        esd<?> esdVar_findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, fh2Var);
        if (esdVar_findCustomEnumDeserializer == null) {
            b bVar_constructDefaultValueInstantiator = _constructDefaultValueInstantiator(deserializationContext, fh2Var);
            SettableBeanProperty[] fromObjectArguments = bVar_constructDefaultValueInstantiator == null ? null : bVar_constructDefaultValueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            for (AnnotatedMethod annotatedMethod : fh2Var.w()) {
                if (_hasCreatorAnnotation(deserializationContext, annotatedMethod)) {
                    if (annotatedMethod.getParameterCount() == 0) {
                        esdVar_findCustomEnumDeserializer = EnumDeserializer.deserializerForNoArgsCreator(config, rawClass, annotatedMethod);
                        break;
                    }
                    if (annotatedMethod.getRawReturnType().isAssignableFrom(rawClass)) {
                        esdVar_findCustomEnumDeserializer = EnumDeserializer.deserializerForCreator(config, rawClass, annotatedMethod, bVar_constructDefaultValueInstantiator, fromObjectArguments);
                        break;
                    }
                }
            }
            if (esdVar_findCustomEnumDeserializer == null) {
                esdVar_findCustomEnumDeserializer = new EnumDeserializer(constructEnumResolver(rawClass, config, fh2Var.j()), Boolean.valueOf(config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)));
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<hh2> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                esdVar_findCustomEnumDeserializer = it.next().e(config, javaType, fh2Var, esdVar_findCustomEnumDeserializer);
            }
        }
        return esdVar_findCustomEnumDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.a
    public vzd createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        vzd vzdVarF = null;
        if (this._factoryConfig.hasKeyDeserializers()) {
            fh2 fh2VarIntrospectClassAnnotations = config.introspectClassAnnotations(javaType.getRawClass());
            Iterator<wzd> it = this._factoryConfig.keyDeserializers().iterator();
            while (it.hasNext() && (vzdVarF = it.next().findKeyDeserializer(javaType, config, fh2VarIntrospectClassAnnotations)) == null) {
            }
        }
        if (vzdVarF == null) {
            vzdVarF = javaType.isEnumType() ? _createEnumKeyDeserializer(deserializationContext, javaType) : StdKeyDeserializers.findStringBasedKeyDeserializer(config, javaType);
        }
        if (vzdVarF != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<hh2> it2 = this._factoryConfig.deserializerModifiers().iterator();
            while (it2.hasNext()) {
                vzdVarF = it2.next().f(config, javaType, vzdVarF);
            }
        }
        return vzdVarF;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0111  */
    /* JADX WARN: Code duplicated, block: B:55:0x0121 A[LOOP:0: B:53:0x011b->B:55:0x0121, LOOP_END] */
    @Override // com.fasterxml.jackson.databind.deser.a
    public esd<?> createMapDeserializer(DeserializationContext deserializationContext, MapType mapType, fh2 fh2Var) throws JsonMappingException {
        fh2 fh2VarIntrospectForCreation;
        MapType mapType2;
        esd<?> esdVarG;
        Iterator<hh2> it;
        esd<?> esdVarConstructForNonPOJO;
        esd<?> esdVar;
        b bVarFindValueInstantiator;
        EnumMapDeserializer enumMapDeserializer;
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType keyType = mapType.getKeyType();
        JavaType contentType = mapType.getContentType();
        esd esdVar2 = (esd) contentType.getValueHandler();
        vzd vzdVar = (vzd) keyType.getValueHandler();
        q4q q4qVar = (q4q) contentType.getTypeHandler();
        q4q q4qVarFindTypeDeserializer = q4qVar == null ? findTypeDeserializer(config, contentType) : q4qVar;
        esd<?> esdVar_findCustomMapDeserializer = _findCustomMapDeserializer(mapType, config, fh2Var, vzdVar, q4qVarFindTypeDeserializer, esdVar2);
        if (esdVar_findCustomMapDeserializer == null) {
            Class<?> rawClass = mapType.getRawClass();
            if (EnumMap.class.isAssignableFrom(rawClass)) {
                if (rawClass == EnumMap.class) {
                    fh2VarIntrospectForCreation = fh2Var;
                    bVarFindValueInstantiator = null;
                } else {
                    fh2VarIntrospectForCreation = fh2Var;
                    bVarFindValueInstantiator = findValueInstantiator(deserializationContext, fh2VarIntrospectForCreation);
                }
                Class<?> rawClass2 = keyType.getRawClass();
                if (rawClass2 == null || !rawClass2.isEnum()) {
                    throw new IllegalArgumentException("Cannot construct EnumMap; generic (key) type not available");
                }
                enumMapDeserializer = new EnumMapDeserializer(mapType, bVarFindValueInstantiator, null, esdVar2, q4qVarFindTypeDeserializer, null);
            } else {
                fh2VarIntrospectForCreation = fh2Var;
            }
            if (esdVar_findCustomMapDeserializer == null) {
                esdVar_findCustomMapDeserializer = esdVar_findCustomMapDeserializer;
                if (mapType.isInterface() || mapType.isAbstract()) {
                    esdVar_findCustomMapDeserializer = enumMapDeserializer;
                    esdVar_findCustomMapDeserializer = enumMapDeserializer;
                    Class<? extends Map> cls = _mapFallbacks.get(rawClass.getName());
                    if (cls != null) {
                        mapType2 = (MapType) config.constructSpecializedType(mapType, cls);
                        fh2VarIntrospectForCreation = config.introspectForCreation(mapType2);
                        esdVarConstructForNonPOJO = esdVar_findCustomMapDeserializer;
                    } else {
                        if (mapType.getTypeHandler() == null) {
                            throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Map type " + mapType);
                        }
                        mapType2 = mapType;
                        esdVarConstructForNonPOJO = AbstractDeserializer.constructForNonPOJO(fh2Var);
                    }
                    esdVar = esdVarConstructForNonPOJO;
                } else {
                    esd<?> esdVarC = xqd.c(deserializationContext, mapType);
                    if (esdVarC != null) {
                        esdVar_findCustomMapDeserializer = enumMapDeserializer;
                        return esdVarC;
                    }
                    esdVar_findCustomMapDeserializer = enumMapDeserializer;
                    esdVar = esdVarC;
                    mapType2 = mapType;
                }
                fh2 fh2Var2 = fh2VarIntrospectForCreation;
                esd<?> esdVar3 = esdVar;
                if (esdVar == null) {
                    MapDeserializer mapDeserializer = new MapDeserializer(mapType2, findValueInstantiator(deserializationContext, fh2Var2), vzdVar, esdVar2, q4qVarFindTypeDeserializer);
                    JsonIgnoreProperties.Value defaultPropertyIgnorals = config.getDefaultPropertyIgnorals(Map.class, fh2Var2.u());
                    mapDeserializer.setIgnorableProperties(defaultPropertyIgnorals != null ? defaultPropertyIgnorals.findIgnoredForDeserialization() : null);
                    esdVar3 = mapDeserializer;
                }
                fh2VarIntrospectForCreation = fh2Var2;
                esdVarG = esdVar3;
            }
            if (this._factoryConfig.hasDeserializerModifiers()) {
                it = this._factoryConfig.deserializerModifiers().iterator();
                esdVarG = esdVarG;
                while (it.hasNext()) {
                    esdVarG = it.next().g(config, mapType2, fh2VarIntrospectForCreation, esdVarG);
                }
            }
            return esdVarG;
        }
        fh2VarIntrospectForCreation = fh2Var;
        esdVar_findCustomMapDeserializer = esdVar_findCustomMapDeserializer;
        esdVar_findCustomMapDeserializer = enumMapDeserializer;
        mapType2 = mapType;
        esdVarG = esdVar_findCustomMapDeserializer;
        if (this._factoryConfig.hasDeserializerModifiers()) {
            it = this._factoryConfig.deserializerModifiers().iterator();
            esdVarG = esdVarG;
            while (it.hasNext()) {
                esdVarG = it.next().g(config, mapType2, fh2VarIntrospectForCreation, esdVarG);
            }
        }
        return esdVarG;
    }

    @Override // com.fasterxml.jackson.databind.deser.a
    public esd<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, fh2 fh2Var) throws JsonMappingException {
        JavaType keyType = mapLikeType.getKeyType();
        JavaType contentType = mapLikeType.getContentType();
        DeserializationConfig config = deserializationContext.getConfig();
        esd<?> esdVar = (esd) contentType.getValueHandler();
        vzd vzdVar = (vzd) keyType.getValueHandler();
        q4q q4qVarFindTypeDeserializer = (q4q) contentType.getTypeHandler();
        if (q4qVarFindTypeDeserializer == null) {
            q4qVarFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        esd<?> esdVar_findCustomMapLikeDeserializer = _findCustomMapLikeDeserializer(mapLikeType, config, fh2Var, vzdVar, q4qVarFindTypeDeserializer, esdVar);
        if (esdVar_findCustomMapLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<hh2> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                esdVar_findCustomMapLikeDeserializer = it.next().h(config, mapLikeType, fh2Var, esdVar_findCustomMapLikeDeserializer);
            }
        }
        return esdVar_findCustomMapLikeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.a
    public esd<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, fh2 fh2Var) throws JsonMappingException {
        JavaType contentType = referenceType.getContentType();
        esd<?> esdVar = (esd) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        q4q q4qVarFindTypeDeserializer = (q4q) contentType.getTypeHandler();
        if (q4qVarFindTypeDeserializer == null) {
            q4qVarFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        q4q q4qVar = q4qVarFindTypeDeserializer;
        esd<?> esdVar_findCustomReferenceDeserializer = _findCustomReferenceDeserializer(referenceType, config, fh2Var, q4qVar, esdVar);
        if (esdVar_findCustomReferenceDeserializer == null && referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            return new AtomicReferenceDeserializer(referenceType, referenceType.getRawClass() == AtomicReference.class ? null : findValueInstantiator(deserializationContext, fh2Var), q4qVar, esdVar);
        }
        if (esdVar_findCustomReferenceDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<hh2> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                esdVar_findCustomReferenceDeserializer = it.next().i(config, referenceType, fh2Var, esdVar_findCustomReferenceDeserializer);
            }
        }
        return esdVar_findCustomReferenceDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.a
    public esd<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, fh2 fh2Var) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        esd<?> esdVar_findCustomTreeNodeDeserializer = _findCustomTreeNodeDeserializer(rawClass, deserializationConfig, fh2Var);
        return esdVar_findCustomTreeNodeDeserializer != null ? esdVar_findCustomTreeNodeDeserializer : JsonNodeDeserializer.getDeserializer(rawClass);
    }

    public esd<Object> findContentDeserializerFromAnnotation(DeserializationContext deserializationContext, fd1 fd1Var) throws JsonMappingException {
        Object objFindContentDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindContentDeserializer = annotationIntrospector.findContentDeserializer(fd1Var)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(fd1Var, objFindContentDeserializer);
    }

    public esd<?> findDefaultDeserializer(DeserializationContext deserializationContext, JavaType javaType, fh2 fh2Var) throws JsonMappingException {
        JavaType javaType_findRemappedType;
        JavaType javaType_findRemappedType2;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == CLASS_OBJECT) {
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasAbstractTypeResolvers()) {
                javaType_findRemappedType = _findRemappedType(config, List.class);
                javaType_findRemappedType2 = _findRemappedType(config, Map.class);
            } else {
                javaType_findRemappedType = null;
                javaType_findRemappedType2 = null;
            }
            return new UntypedObjectDeserializer(javaType_findRemappedType, javaType_findRemappedType2);
        }
        if (rawClass == CLASS_STRING || rawClass == CLASS_CHAR_SEQUENCE) {
            return StringDeserializer.instance;
        }
        Class<?> cls = CLASS_ITERABLE;
        if (rawClass == cls) {
            TypeFactory typeFactory = deserializationContext.getTypeFactory();
            JavaType[] javaTypeArrFindTypeParameters = typeFactory.findTypeParameters(javaType, cls);
            return createCollectionDeserializer(deserializationContext, typeFactory.constructCollectionType(Collection.class, (javaTypeArrFindTypeParameters == null || javaTypeArrFindTypeParameters.length != 1) ? TypeFactory.unknownType() : javaTypeArrFindTypeParameters[0]), fh2Var);
        }
        if (rawClass == CLASS_MAP_ENTRY) {
            JavaType javaTypeContainedTypeOrUnknown = javaType.containedTypeOrUnknown(0);
            JavaType javaTypeContainedTypeOrUnknown2 = javaType.containedTypeOrUnknown(1);
            q4q q4qVarFindTypeDeserializer = (q4q) javaTypeContainedTypeOrUnknown2.getTypeHandler();
            if (q4qVarFindTypeDeserializer == null) {
                q4qVarFindTypeDeserializer = findTypeDeserializer(deserializationContext.getConfig(), javaTypeContainedTypeOrUnknown2);
            }
            return new MapEntryDeserializer(javaType, (vzd) javaTypeContainedTypeOrUnknown.getValueHandler(), (esd<Object>) javaTypeContainedTypeOrUnknown2.getValueHandler(), q4qVarFindTypeDeserializer);
        }
        String name = rawClass.getName();
        if (rawClass.isPrimitive() || name.startsWith("java.")) {
            esd<?> esdVarA = NumberDeserializers.a(rawClass, name);
            if (esdVarA == null) {
                esdVarA = DateDeserializers.a(rawClass, name);
            }
            if (esdVarA != null) {
                return esdVarA;
            }
        }
        if (rawClass == bip.class) {
            return new TokenBufferDeserializer();
        }
        esd<?> esdVarFindOptionalStdDeserializer = findOptionalStdDeserializer(deserializationContext, javaType, fh2Var);
        return esdVarFindOptionalStdDeserializer != null ? esdVarFindOptionalStdDeserializer : com.fasterxml.jackson.databind.deser.std.a.a(rawClass, name);
    }

    public esd<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, fd1 fd1Var) throws JsonMappingException {
        Object objFindDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindDeserializer = annotationIntrospector.findDeserializer(fd1Var)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(fd1Var, objFindDeserializer);
    }

    public vzd findKeyDeserializerFromAnnotation(DeserializationContext deserializationContext, fd1 fd1Var) throws JsonMappingException {
        Object objFindKeyDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindKeyDeserializer = annotationIntrospector.findKeyDeserializer(fd1Var)) == null) {
            return null;
        }
        return deserializationContext.keyDeserializerInstance(fd1Var, objFindKeyDeserializer);
    }

    public esd<?> findOptionalStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, fh2 fh2Var) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findDeserializer(javaType, deserializationContext.getConfig(), fh2Var);
    }

    public q4q findPropertyContentTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        c5q<?> c5qVarFindPropertyContentTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(deserializationConfig, annotatedMember, javaType);
        JavaType contentType = javaType.getContentType();
        return c5qVarFindPropertyContentTypeResolver == null ? findTypeDeserializer(deserializationConfig, contentType) : c5qVarFindPropertyContentTypeResolver.buildTypeDeserializer(deserializationConfig, contentType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, contentType));
    }

    public q4q findPropertyTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        c5q<?> c5qVarFindPropertyTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(deserializationConfig, annotatedMember, javaType);
        return c5qVarFindPropertyTypeResolver == null ? findTypeDeserializer(deserializationConfig, javaType) : c5qVarFindPropertyTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, javaType));
    }

    @Override // com.fasterxml.jackson.databind.deser.a
    public q4q findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Collection<NamedType> collectionCollectAndResolveSubtypesByTypeId;
        JavaType javaTypeMapAbstractType;
        com.fasterxml.jackson.databind.introspect.a aVarU = deserializationConfig.introspectClassAnnotations(javaType.getRawClass()).u();
        c5q<?> c5qVarFindTypeResolver = deserializationConfig.getAnnotationIntrospector().findTypeResolver(deserializationConfig, aVarU, javaType);
        if (c5qVarFindTypeResolver == null) {
            c5qVarFindTypeResolver = deserializationConfig.getDefaultTyper(javaType);
            if (c5qVarFindTypeResolver == null) {
                return null;
            }
            collectionCollectAndResolveSubtypesByTypeId = null;
        } else {
            collectionCollectAndResolveSubtypesByTypeId = deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, aVarU);
        }
        if (c5qVarFindTypeResolver.getDefaultImpl() == null && javaType.isAbstract() && (javaTypeMapAbstractType = mapAbstractType(deserializationConfig, javaType)) != null && !javaTypeMapAbstractType.hasRawClass(javaType.getRawClass())) {
            c5qVarFindTypeResolver = c5qVarFindTypeResolver.defaultImpl(javaTypeMapAbstractType.getRawClass());
        }
        try {
            return c5qVarFindTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, collectionCollectAndResolveSubtypesByTypeId);
        } catch (IllegalArgumentException e) {
            InvalidDefinitionException invalidDefinitionExceptionFrom = InvalidDefinitionException.from((JsonParser) null, h04.n(e), javaType);
            invalidDefinitionExceptionFrom.initCause(e);
            throw invalidDefinitionExceptionFrom;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.a
    public b findValueInstantiator(DeserializationContext deserializationContext, fh2 fh2Var) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        com.fasterxml.jackson.databind.introspect.a aVarU = fh2Var.u();
        Object objFindValueInstantiator = deserializationContext.getAnnotationIntrospector().findValueInstantiator(aVarU);
        b bVar_valueInstantiatorInstance = objFindValueInstantiator != null ? _valueInstantiatorInstance(config, aVarU, objFindValueInstantiator) : null;
        if (bVar_valueInstantiatorInstance == null && (bVar_valueInstantiatorInstance = _findStdValueInstantiator(config, fh2Var)) == null) {
            bVar_valueInstantiatorInstance = _constructDefaultValueInstantiator(deserializationContext, fh2Var);
        }
        if (this._factoryConfig.hasValueInstantiators()) {
            for (pnq pnqVar : this._factoryConfig.valueInstantiators()) {
                bVar_valueInstantiatorInstance = pnqVar.findValueInstantiator(config, fh2Var, bVar_valueInstantiatorInstance);
                if (bVar_valueInstantiatorInstance == null) {
                    deserializationContext.reportBadTypeDefinition(fh2Var, "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", pnqVar.getClass().getName());
                }
            }
        }
        if (bVar_valueInstantiatorInstance.getIncompleteParameter() == null) {
            return bVar_valueInstantiatorInstance;
        }
        AnnotatedParameter incompleteParameter = bVar_valueInstantiatorInstance.getIncompleteParameter();
        throw new IllegalArgumentException("Argument #" + incompleteParameter.getIndex() + " of constructor " + incompleteParameter.getOwner() + " has no property name annotation; must have name when multiple-parameter constructor annotated as Creator");
    }

    public DeserializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    @Override // com.fasterxml.jackson.databind.deser.a
    public JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        while (true) {
            JavaType javaType_mapAbstractType2 = _mapAbstractType2(deserializationConfig, javaType);
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

    @Deprecated
    public JavaType modifyTypeByAnnotation(DeserializationContext deserializationContext, fd1 fd1Var, JavaType javaType) throws JsonMappingException {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        return annotationIntrospector == null ? javaType : annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), fd1Var, javaType);
    }

    public JavaType resolveMemberAndTypeAnnotations(DeserializationContext deserializationContext, AnnotatedMember annotatedMember, JavaType javaType) throws JsonMappingException {
        vzd vzdVarKeyDeserializerInstance;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (javaType.isMapLikeType() && javaType.getKeyType() != null && (vzdVarKeyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotatedMember, annotationIntrospector.findKeyDeserializer(annotatedMember))) != null) {
            javaType = ((MapLikeType) javaType).withKeyValueHandler(vzdVarKeyDeserializerInstance);
            javaType.getKeyType();
        }
        if (javaType.hasContentType()) {
            esd<Object> esdVarDeserializerInstance = deserializationContext.deserializerInstance(annotatedMember, annotationIntrospector.findContentDeserializer(annotatedMember));
            if (esdVarDeserializerInstance != null) {
                javaType = javaType.withContentValueHandler(esdVarDeserializerInstance);
            }
            q4q q4qVarFindPropertyContentTypeDeserializer = findPropertyContentTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
            if (q4qVarFindPropertyContentTypeDeserializer != null) {
                javaType = javaType.withContentTypeHandler(q4qVarFindPropertyContentTypeDeserializer);
            }
        }
        q4q q4qVarFindPropertyTypeDeserializer = findPropertyTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
        if (q4qVarFindPropertyTypeDeserializer != null) {
            javaType = javaType.withTypeHandler(q4qVarFindPropertyTypeDeserializer);
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotatedMember, javaType);
    }

    @Deprecated
    public JavaType resolveType(DeserializationContext deserializationContext, fh2 fh2Var, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        return resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, javaType);
    }

    @Override // com.fasterxml.jackson.databind.deser.a
    public final com.fasterxml.jackson.databind.deser.a withAbstractTypeResolver(x10 x10Var) {
        return withConfig(this._factoryConfig.withAbstractTypeResolver(x10Var));
    }

    @Override // com.fasterxml.jackson.databind.deser.a
    public final com.fasterxml.jackson.databind.deser.a withAdditionalDeserializers(oz5 oz5Var) {
        return withConfig(this._factoryConfig.withAdditionalDeserializers(oz5Var));
    }

    @Override // com.fasterxml.jackson.databind.deser.a
    public final com.fasterxml.jackson.databind.deser.a withAdditionalKeyDeserializers(wzd wzdVar) {
        return withConfig(this._factoryConfig.withAdditionalKeyDeserializers(wzdVar));
    }

    public abstract com.fasterxml.jackson.databind.deser.a withConfig(DeserializerFactoryConfig deserializerFactoryConfig);

    @Override // com.fasterxml.jackson.databind.deser.a
    public final com.fasterxml.jackson.databind.deser.a withDeserializerModifier(hh2 hh2Var) {
        return withConfig(this._factoryConfig.withDeserializerModifier(hh2Var));
    }

    @Override // com.fasterxml.jackson.databind.deser.a
    public final com.fasterxml.jackson.databind.deser.a withValueInstantiators(pnq pnqVar) {
        return withConfig(this._factoryConfig.withValueInstantiators(pnqVar));
    }
}
