package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$None;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.ak4;
import defpackage.bsd;
import defpackage.c5q;
import defpackage.dsd;
import defpackage.ecm;
import defpackage.esd;
import defpackage.eud;
import defpackage.fd1;
import defpackage.h04;
import defpackage.hsd;
import defpackage.ihh;
import defpackage.isd;
import defpackage.iud;
import defpackage.jud;
import defpackage.kud;
import defpackage.lud;
import defpackage.mdo;
import defpackage.mtd;
import defpackage.mud;
import defpackage.nsd;
import defpackage.nud;
import defpackage.osd;
import defpackage.pqd;
import defpackage.psd;
import defpackage.r4q;
import defpackage.rsd;
import defpackage.rtd;
import defpackage.sqd;
import defpackage.ssd;
import defpackage.std;
import defpackage.trd;
import defpackage.ttd;
import defpackage.uud;
import defpackage.vrd;
import defpackage.vsd;
import defpackage.vud;
import defpackage.vzd;
import defpackage.wrd;
import defpackage.wud;
import defpackage.xrd;
import defpackage.xsd;
import defpackage.ysd;
import defpackage.ytd;
import defpackage.z3h;
import defpackage.zrd;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class JacksonAnnotationIntrospector extends AnnotationIntrospector implements Serializable {
    private static final sqd _java7Helper;
    private static final long serialVersionUID = 1;
    protected transient LRUMap<Class<?>, Boolean> _annotationsInside = new LRUMap<>(48, 48);
    protected boolean _cfgConstructorPropertiesImpliesCreator = true;
    private static final Class<? extends Annotation>[] ANNOTATIONS_TO_INFER_SER = {JsonSerialize.class, wud.class, JsonFormat.class, JsonTypeInfo.class, ttd.class, nud.class, zrd.class, vsd.class};
    private static final Class<? extends Annotation>[] ANNOTATIONS_TO_INFER_DESER = {dsd.class, wud.class, JsonFormat.class, JsonTypeInfo.class, nud.class, zrd.class, vsd.class, xsd.class};

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7676a;

        static {
            int[] iArr = new int[JsonSerialize.Inclusion.values().length];
            f7676a = iArr;
            try {
                iArr[JsonSerialize.Inclusion.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7676a[JsonSerialize.Inclusion.NON_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7676a[JsonSerialize.Inclusion.NON_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7676a[JsonSerialize.Inclusion.NON_EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7676a[JsonSerialize.Inclusion.DEFAULT_INCLUSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        sqd sqdVarF;
        try {
            sqdVarF = sqd.f();
        } catch (Throwable unused) {
            sqdVarF = null;
        }
        _java7Helper = sqdVarF;
    }

    private final Boolean _findSortAlpha(fd1 fd1Var) {
        std stdVar = (std) _findAnnotation(fd1Var, std.class);
        if (stdVar == null || !stdVar.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    private boolean _primitiveAndWrapper(Class<?> cls, Class<?> cls2) {
        if (cls.isPrimitive()) {
            return cls == h04.X(cls2);
        }
        return cls2.isPrimitive() && cls2 == h04.X(cls);
    }

    private JsonInclude.Value _refinePropertyInclusion(fd1 fd1Var, JsonInclude.Value value) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(fd1Var, JsonSerialize.class);
        if (jsonSerialize != null) {
            int i = a.f7676a[jsonSerialize.include().ordinal()];
            if (i == 1) {
                return value.withValueInclusion(JsonInclude.Include.ALWAYS);
            }
            if (i == 2) {
                return value.withValueInclusion(JsonInclude.Include.NON_NULL);
            }
            if (i == 3) {
                return value.withValueInclusion(JsonInclude.Include.NON_DEFAULT);
            }
            if (i == 4) {
                return value.withValueInclusion(JsonInclude.Include.NON_EMPTY);
            }
        }
        return value;
    }

    public Class<?> _classIfExplicit(Class<?> cls) {
        if (cls == null || h04.K(cls)) {
            return null;
        }
        return cls;
    }

    public mdo _constructNoTypeResolverBuilder() {
        return mdo.noTypeInfoBuilder();
    }

    public mdo _constructStdTypeResolverBuilder() {
        return new mdo();
    }

    public BeanPropertyWriter _constructVirtualProperty(xrd.a aVar, MapperConfig<?> mapperConfig, com.fasterxml.jackson.databind.introspect.a aVar2, JavaType javaType) {
        PropertyMetadata propertyMetadata = aVar.required() ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        String strValue = aVar.value();
        PropertyName propertyName_propertyName = _propertyName(aVar.propName(), aVar.propNamespace());
        if (!propertyName_propertyName.hasSimpleName()) {
            propertyName_propertyName = PropertyName.construct(strValue);
        }
        return AttributePropertyWriter.construct(strValue, ecm.G(mapperConfig, new VirtualAnnotatedMember(aVar2, aVar2.getRawType(), strValue, javaType), propertyName_propertyName, propertyMetadata, aVar.include()), aVar2.h(), javaType);
    }

    public PropertyName _findConstructorName(fd1 fd1Var) {
        sqd sqdVar;
        PropertyName propertyNameA;
        if (!(fd1Var instanceof AnnotatedParameter)) {
            return null;
        }
        AnnotatedParameter annotatedParameter = (AnnotatedParameter) fd1Var;
        if (annotatedParameter.getOwner() == null || (sqdVar = _java7Helper) == null || (propertyNameA = sqdVar.a(annotatedParameter)) == null) {
            return null;
        }
        return propertyNameA;
    }

    public c5q<?> _findTypeResolver(MapperConfig<?> mapperConfig, fd1 fd1Var, JavaType javaType) {
        c5q<?> c5qVar_constructStdTypeResolverBuilder;
        JsonTypeInfo jsonTypeInfo = (JsonTypeInfo) _findAnnotation(fd1Var, JsonTypeInfo.class);
        mud mudVar = (mud) _findAnnotation(fd1Var, mud.class);
        if (mudVar != null) {
            if (jsonTypeInfo == null) {
                return null;
            }
            c5qVar_constructStdTypeResolverBuilder = mapperConfig.typeResolverBuilderInstance(fd1Var, mudVar.value());
        } else {
            if (jsonTypeInfo == null) {
                return null;
            }
            if (jsonTypeInfo.use() == JsonTypeInfo.Id.NONE) {
                return _constructNoTypeResolverBuilder();
            }
            c5qVar_constructStdTypeResolverBuilder = _constructStdTypeResolverBuilder();
        }
        kud kudVar = (kud) _findAnnotation(fd1Var, kud.class);
        r4q r4qVarTypeIdResolverInstance = kudVar != null ? mapperConfig.typeIdResolverInstance(fd1Var, kudVar.value()) : null;
        if (r4qVarTypeIdResolverInstance != null) {
            r4qVarTypeIdResolverInstance.c(javaType);
        }
        c5q c5qVarInit = c5qVar_constructStdTypeResolverBuilder.init(jsonTypeInfo.use(), r4qVarTypeIdResolverInstance);
        JsonTypeInfo.As asInclude = jsonTypeInfo.include();
        if (asInclude == JsonTypeInfo.As.EXTERNAL_PROPERTY && (fd1Var instanceof com.fasterxml.jackson.databind.introspect.a)) {
            asInclude = JsonTypeInfo.As.PROPERTY;
        }
        c5q c5qVarTypeProperty = c5qVarInit.inclusion(asInclude).typeProperty(jsonTypeInfo.property());
        Class<?> clsDefaultImpl = jsonTypeInfo.defaultImpl();
        if (clsDefaultImpl != JsonTypeInfo.a.class && !clsDefaultImpl.isAnnotation()) {
            c5qVarTypeProperty = c5qVarTypeProperty.defaultImpl(clsDefaultImpl);
        }
        return c5qVarTypeProperty.typeIdVisibility(jsonTypeInfo.visible());
    }

    public boolean _isIgnorable(fd1 fd1Var) {
        Boolean boolB;
        rsd rsdVar = (rsd) _findAnnotation(fd1Var, rsd.class);
        if (rsdVar != null) {
            return rsdVar.value();
        }
        sqd sqdVar = _java7Helper;
        if (sqdVar == null || (boolB = sqdVar.b(fd1Var)) == null) {
            return false;
        }
        return boolB.booleanValue();
    }

    public PropertyName _propertyName(String str, String str2) {
        if (str.isEmpty()) {
            return PropertyName.USE_DEFAULT;
        }
        return (str2 == null || str2.isEmpty()) ? PropertyName.construct(str) : PropertyName.construct(str, str2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, com.fasterxml.jackson.databind.introspect.a aVar, List<BeanPropertyWriter> list) {
        xrd xrdVar = (xrd) _findAnnotation(aVar, xrd.class);
        if (xrdVar == null) {
            return;
        }
        boolean zPrepend = xrdVar.prepend();
        xrd.a[] aVarArrAttrs = xrdVar.attrs();
        int length = aVarArrAttrs.length;
        JavaType javaTypeConstructType = null;
        for (int i = 0; i < length; i++) {
            if (javaTypeConstructType == null) {
                javaTypeConstructType = mapperConfig.constructType(Object.class);
            }
            BeanPropertyWriter beanPropertyWriter_constructVirtualProperty = _constructVirtualProperty(aVarArrAttrs[i], mapperConfig, aVar, javaTypeConstructType);
            if (zPrepend) {
                list.add(i, beanPropertyWriter_constructVirtualProperty);
            } else {
                list.add(beanPropertyWriter_constructVirtualProperty);
            }
        }
        xrd.b[] bVarArrProps = xrdVar.props();
        int length2 = bVarArrProps.length;
        for (int i2 = 0; i2 < length2; i2++) {
            BeanPropertyWriter beanPropertyWriter_constructVirtualProperty2 = _constructVirtualProperty(bVarArrProps[i2], mapperConfig, aVar);
            if (zPrepend) {
                list.add(i2, beanPropertyWriter_constructVirtualProperty2);
            } else {
                list.add(beanPropertyWriter_constructVirtualProperty2);
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public VisibilityChecker<?> findAutoDetectVisibility(com.fasterxml.jackson.databind.introspect.a aVar, VisibilityChecker<?> visibilityChecker) {
        JsonAutoDetect jsonAutoDetect = (JsonAutoDetect) _findAnnotation(aVar, JsonAutoDetect.class);
        return jsonAutoDetect == null ? visibilityChecker : visibilityChecker.with(jsonAutoDetect);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findClassDescription(com.fasterxml.jackson.databind.introspect.a aVar) {
        bsd bsdVar = (bsd) _findAnnotation(aVar, bsd.class);
        if (bsdVar == null) {
            return null;
        }
        return bsdVar.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentDeserializer(fd1 fd1Var) {
        Class<? extends esd> clsContentUsing;
        dsd dsdVar = (dsd) _findAnnotation(fd1Var, dsd.class);
        if (dsdVar == null || (clsContentUsing = dsdVar.contentUsing()) == esd.a.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentSerializer(fd1 fd1Var) {
        Class<? extends eud> clsContentUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(fd1Var, JsonSerialize.class);
        if (jsonSerialize == null || (clsContentUsing = jsonSerialize.contentUsing()) == eud.a.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, fd1 fd1Var) {
        sqd sqdVar;
        Boolean boolE;
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(fd1Var, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode();
        }
        if (this._cfgConstructorPropertiesImpliesCreator && mapperConfig.isEnabled(MapperFeature.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES) && (fd1Var instanceof AnnotatedConstructor) && (sqdVar = _java7Helper) != null && (boolE = sqdVar.e(fd1Var)) != null && boolE.booleanValue()) {
            return JsonCreator.Mode.PROPERTIES;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonCreator.Mode findCreatorBinding(fd1 fd1Var) {
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(fd1Var, JsonCreator.class);
        if (jsonCreator == null) {
            return null;
        }
        return jsonCreator.mode();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return h04.u(cls, hsd.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        dsd dsdVar = (dsd) _findAnnotation(annotatedMember, dsd.class);
        if (dsdVar == null) {
            return null;
        }
        return _classIfExplicit(dsdVar.contentConverter(), ak4.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationContentType(fd1 fd1Var, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationConverter(fd1 fd1Var) {
        dsd dsdVar = (dsd) _findAnnotation(fd1Var, dsd.class);
        if (dsdVar == null) {
            return null;
        }
        return _classIfExplicit(dsdVar.converter(), ak4.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationKeyType(fd1 fd1Var, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationType(fd1 fd1Var, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializer(fd1 fd1Var) {
        Class<? extends esd> clsUsing;
        dsd dsdVar = (dsd) _findAnnotation(fd1Var, dsd.class);
        if (dsdVar == null || (clsUsing = dsdVar.using()) == esd.a.class) {
            return null;
        }
        return clsUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public String findEnumValue(Enum<?> r3) {
        JsonProperty jsonProperty;
        String strValue;
        try {
            Field field = r3.getClass().getField(r3.name());
            if (field != null && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null && (strValue = jsonProperty.value()) != null && !strValue.isEmpty()) {
                return strValue;
            }
        } catch (NoSuchFieldException | SecurityException unused) {
        }
        return r3.name();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        JsonProperty jsonProperty;
        HashMap map = null;
        for (Field field : h04.A(cls)) {
            if (field.isEnumConstant() && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null) {
                String strValue = jsonProperty.value();
                if (!strValue.isEmpty()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(field.getName(), strValue);
                }
            }
        }
        if (map != null) {
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                String str = (String) map.get(enumArr[i].name());
                if (str != null) {
                    strArr[i] = str;
                }
            }
        }
        return strArr;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findFilterId(fd1 fd1Var) {
        isd isdVar = (isd) _findAnnotation(fd1Var, isd.class);
        if (isdVar == null) {
            return null;
        }
        String strValue = isdVar.value();
        if (strValue.length() > 0) {
            return strValue;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonFormat.Value findFormat(fd1 fd1Var) {
        JsonFormat jsonFormat = (JsonFormat) _findAnnotation(fd1Var, JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        return new JsonFormat.Value(jsonFormat);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        PropertyName propertyName_findConstructorName = _findConstructorName(annotatedMember);
        if (propertyName_findConstructorName == null) {
            return null;
        }
        return propertyName_findConstructorName.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        String name;
        JacksonInject jacksonInject = (JacksonInject) _findAnnotation(annotatedMember, JacksonInject.class);
        if (jacksonInject == null) {
            return null;
        }
        JacksonInject.Value valueFrom = JacksonInject.Value.from(jacksonInject);
        if (valueFrom.hasId()) {
            return valueFrom;
        }
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            name = annotatedMethod.getParameterCount() == 0 ? annotatedMember.getRawType().getName() : annotatedMethod.getRawParameterType(0).getName();
        } else {
            name = annotatedMember.getRawType().getName();
        }
        return valueFrom.withId(name);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        JacksonInject.Value valueFindInjectableValue = findInjectableValue(annotatedMember);
        if (valueFindInjectableValue == null) {
            return null;
        }
        return valueFindInjectableValue.getId();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeyDeserializer(fd1 fd1Var) {
        Class<? extends vzd> clsKeyUsing;
        dsd dsdVar = (dsd) _findAnnotation(fd1Var, dsd.class);
        if (dsdVar == null || (clsKeyUsing = dsdVar.keyUsing()) == vzd.a.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeySerializer(fd1 fd1Var) {
        Class<? extends eud> clsKeyUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(fd1Var, JsonSerialize.class);
        if (jsonSerialize == null || (clsKeyUsing = jsonSerialize.keyUsing()) == eud.a.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findMergeInfo(fd1 fd1Var) {
        xsd xsdVar = (xsd) _findAnnotation(fd1Var, xsd.class);
        if (xsdVar == null) {
            return null;
        }
        return xsdVar.value().asBoolean();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findNameForDeserialization(fd1 fd1Var) {
        boolean z;
        JsonSetter jsonSetter = (JsonSetter) _findAnnotation(fd1Var, JsonSetter.class);
        if (jsonSetter != null) {
            String strValue = jsonSetter.value();
            if (!strValue.isEmpty()) {
                return PropertyName.construct(strValue);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(fd1Var, JsonProperty.class);
        if (jsonProperty != null) {
            return PropertyName.construct(jsonProperty.value());
        }
        if (z || _hasOneOf(fd1Var, ANNOTATIONS_TO_INFER_DESER)) {
            return PropertyName.USE_DEFAULT;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findNameForSerialization(fd1 fd1Var) {
        boolean z;
        nsd nsdVar = (nsd) _findAnnotation(fd1Var, nsd.class);
        if (nsdVar != null) {
            String strValue = nsdVar.value();
            if (!strValue.isEmpty()) {
                return PropertyName.construct(strValue);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(fd1Var, JsonProperty.class);
        if (jsonProperty != null) {
            return PropertyName.construct(jsonProperty.value());
        }
        if (z || _hasOneOf(fd1Var, ANNOTATIONS_TO_INFER_SER)) {
            return PropertyName.USE_DEFAULT;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNamingStrategy(com.fasterxml.jackson.databind.introspect.a aVar) {
        ysd ysdVar = (ysd) _findAnnotation(aVar, ysd.class);
        if (ysdVar == null) {
            return null;
        }
        return ysdVar.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNullSerializer(fd1 fd1Var) {
        Class<? extends eud> clsNullsUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(fd1Var, JsonSerialize.class);
        if (jsonSerialize == null || (clsNullsUsing = jsonSerialize.nullsUsing()) == eud.a.class) {
            return null;
        }
        return clsNullsUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public z3h findObjectIdInfo(fd1 fd1Var) {
        osd osdVar = (osd) _findAnnotation(fd1Var, osd.class);
        if (osdVar == null || osdVar.generator() == ObjectIdGenerators$None.class) {
            return null;
        }
        return new z3h(PropertyName.construct(osdVar.property()), osdVar.scope(), osdVar.generator(), osdVar.resolver());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public z3h findObjectReferenceInfo(fd1 fd1Var, z3h z3hVar) {
        psd psdVar = (psd) _findAnnotation(fd1Var, psd.class);
        if (psdVar == null) {
            return z3hVar;
        }
        if (z3hVar == null) {
            z3hVar = z3h.a();
        }
        return z3hVar.g(psdVar.alwaysAsId());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?> findPOJOBuilder(com.fasterxml.jackson.databind.introspect.a aVar) {
        dsd dsdVar = (dsd) _findAnnotation(aVar, dsd.class);
        if (dsdVar == null) {
            return null;
        }
        return _classIfExplicit(dsdVar.builder());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public mtd.a findPOJOBuilderConfig(com.fasterxml.jackson.databind.introspect.a aVar) {
        mtd mtdVar = (mtd) _findAnnotation(aVar, mtd.class);
        if (mtdVar == null) {
            return null;
        }
        return new mtd.a(mtdVar);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonProperty.Access findPropertyAccess(fd1 fd1Var) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(fd1Var, JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.access();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<PropertyName> findPropertyAliases(fd1 fd1Var) {
        trd trdVar = (trd) _findAnnotation(fd1Var, trd.class);
        if (trdVar == null) {
            return null;
        }
        String[] strArrValue = trdVar.value();
        int length = strArrValue.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        for (String str : strArrValue) {
            arrayList.add(PropertyName.construct(str));
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public c5q<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.getContentType() != null) {
            return _findTypeResolver(mapperConfig, annotatedMember, javaType);
        }
        throw new IllegalArgumentException("Must call method with a container or reference type (got " + javaType + ")");
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDefaultValue(fd1 fd1Var) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(fd1Var, JsonProperty.class);
        if (jsonProperty == null) {
            return null;
        }
        String strDefaultValue = jsonProperty.defaultValue();
        if (strDefaultValue.isEmpty()) {
            return null;
        }
        return strDefaultValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDescription(fd1 fd1Var) {
        rtd rtdVar = (rtd) _findAnnotation(fd1Var, rtd.class);
        if (rtdVar == null) {
            return null;
        }
        return rtdVar.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIgnoreProperties.Value findPropertyIgnorals(fd1 fd1Var) {
        JsonIgnoreProperties jsonIgnoreProperties = (JsonIgnoreProperties) _findAnnotation(fd1Var, JsonIgnoreProperties.class);
        return jsonIgnoreProperties == null ? JsonIgnoreProperties.Value.empty() : JsonIgnoreProperties.Value.from(jsonIgnoreProperties);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonInclude.Value findPropertyInclusion(fd1 fd1Var) {
        JsonInclude jsonInclude = (JsonInclude) _findAnnotation(fd1Var, JsonInclude.class);
        JsonInclude.Value valueEmpty = jsonInclude == null ? JsonInclude.Value.empty() : JsonInclude.Value.from(jsonInclude);
        return valueEmpty.getValueInclusion() == JsonInclude.Include.USE_DEFAULTS ? _refinePropertyInclusion(fd1Var, valueEmpty) : valueEmpty;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Integer findPropertyIndex(fd1 fd1Var) {
        int iIndex;
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(fd1Var, JsonProperty.class);
        if (jsonProperty == null || (iIndex = jsonProperty.index()) == -1) {
            return null;
        }
        return Integer.valueOf(iIndex);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public c5q<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return null;
        }
        return _findTypeResolver(mapperConfig, annotatedMember, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        vsd vsdVar = (vsd) _findAnnotation(annotatedMember, vsd.class);
        if (vsdVar != null) {
            return AnnotationIntrospector.ReferenceProperty.e(vsdVar.value());
        }
        zrd zrdVar = (zrd) _findAnnotation(annotatedMember, zrd.class);
        if (zrdVar != null) {
            return AnnotationIntrospector.ReferenceProperty.a(zrdVar.value());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findRootName(com.fasterxml.jackson.databind.introspect.a aVar) {
        ytd ytdVar = (ytd) _findAnnotation(aVar, ytd.class);
        if (ytdVar == null) {
            return null;
        }
        String strNamespace = ytdVar.namespace();
        return PropertyName.construct(ytdVar.value(), (strNamespace == null || strNamespace.length() != 0) ? strNamespace : null);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotatedMember, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.contentConverter(), ak4.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationContentType(fd1 fd1Var, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationConverter(fd1 fd1Var) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(fd1Var, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.converter(), ak4.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationKeyType(fd1 fd1Var, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findSerializationPropertyOrder(com.fasterxml.jackson.databind.introspect.a aVar) {
        std stdVar = (std) _findAnnotation(aVar, std.class);
        if (stdVar == null) {
            return null;
        }
        return stdVar.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findSerializationSortAlphabetically(fd1 fd1Var) {
        return _findSortAlpha(fd1Var);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationType(fd1 fd1Var) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSerialize.Typing findSerializationTyping(fd1 fd1Var) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(fd1Var, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return jsonSerialize.typing();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializer(fd1 fd1Var) {
        Class<? extends eud> clsUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(fd1Var, JsonSerialize.class);
        if (jsonSerialize != null && (clsUsing = jsonSerialize.using()) != eud.a.class) {
            return clsUsing;
        }
        ttd ttdVar = (ttd) _findAnnotation(fd1Var, ttd.class);
        if (ttdVar == null || !ttdVar.value()) {
            return null;
        }
        return new RawSerializer(fd1Var.getRawType());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSetter.Value findSetterInfo(fd1 fd1Var) {
        return JsonSetter.Value.from((JsonSetter) _findAnnotation(fd1Var, JsonSetter.class));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<NamedType> findSubtypes(fd1 fd1Var) {
        iud iudVar = (iud) _findAnnotation(fd1Var, iud.class);
        if (iudVar == null) {
            return null;
        }
        iud.a[] aVarArrValue = iudVar.value();
        ArrayList arrayList = new ArrayList(aVarArrValue.length);
        for (iud.a aVar : aVarArrValue) {
            arrayList.add(new NamedType(aVar.value(), aVar.name()));
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findTypeName(com.fasterxml.jackson.databind.introspect.a aVar) {
        lud ludVar = (lud) _findAnnotation(aVar, lud.class);
        if (ludVar == null) {
            return null;
        }
        return ludVar.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public c5q<?> findTypeResolver(MapperConfig<?> mapperConfig, com.fasterxml.jackson.databind.introspect.a aVar, JavaType javaType) {
        return _findTypeResolver(mapperConfig, aVar, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        nud nudVar = (nud) _findAnnotation(annotatedMember, nud.class);
        if (nudVar == null || !nudVar.enabled()) {
            return null;
        }
        return NameTransformer.simpleTransformer(nudVar.prefix(), nudVar.suffix());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findValueInstantiator(com.fasterxml.jackson.databind.introspect.a aVar) {
        vud vudVar = (vud) _findAnnotation(aVar, vud.class);
        if (vudVar == null) {
            return null;
        }
        return vudVar.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?>[] findViews(fd1 fd1Var) {
        wud wudVar = (wud) _findAnnotation(fd1Var, wud.class);
        if (wudVar == null) {
            return null;
        }
        return wudVar.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnyGetter(fd1 fd1Var) {
        vrd vrdVar = (vrd) _findAnnotation(fd1Var, vrd.class);
        if (vrdVar == null) {
            return null;
        }
        return Boolean.valueOf(vrdVar.enabled());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return _hasAnnotation(annotatedMethod, vrd.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnySetter(fd1 fd1Var) {
        wrd wrdVar = (wrd) _findAnnotation(fd1Var, wrd.class);
        if (wrdVar == null) {
            return null;
        }
        return Boolean.valueOf(wrdVar.enabled());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return _hasAnnotation(annotatedMethod, wrd.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAsValue(fd1 fd1Var) {
        uud uudVar = (uud) _findAnnotation(fd1Var, uud.class);
        if (uudVar == null) {
            return null;
        }
        return Boolean.valueOf(uudVar.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        uud uudVar = (uud) _findAnnotation(annotatedMethod, uud.class);
        return uudVar != null && uudVar.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasCreatorAnnotation(fd1 fd1Var) {
        sqd sqdVar;
        Boolean boolE;
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(fd1Var, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode() != JsonCreator.Mode.DISABLED;
        }
        if (!this._cfgConstructorPropertiesImpliesCreator || !(fd1Var instanceof AnnotatedConstructor) || (sqdVar = _java7Helper) == null || (boolE = sqdVar.e(fd1Var)) == null) {
            return false;
        }
        return boolE.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return _isIgnorable(annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotatedMember, JsonProperty.class);
        if (jsonProperty != null) {
            return Boolean.valueOf(jsonProperty.required());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean isAnnotationBundle(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Boolean boolValueOf = this._annotationsInside.get(clsAnnotationType);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(clsAnnotationType.getAnnotation(pqd.class) != null);
            this._annotationsInside.putIfAbsent(clsAnnotationType, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isIgnorableType(com.fasterxml.jackson.databind.introspect.a aVar) {
        ssd ssdVar = (ssd) _findAnnotation(aVar, ssd.class);
        if (ssdVar == null) {
            return null;
        }
        return Boolean.valueOf(ssdVar.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return Boolean.valueOf(_hasAnnotation(annotatedMember, jud.class));
    }

    public Object readResolve() {
        if (this._annotationsInside == null) {
            this._annotationsInside = new LRUMap<>(48, 48);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, fd1 fd1Var, JavaType javaType) throws JsonMappingException {
        TypeFactory typeFactory = mapperConfig.getTypeFactory();
        dsd dsdVar = (dsd) _findAnnotation(fd1Var, dsd.class);
        Class<?> cls_classIfExplicit = dsdVar == null ? null : _classIfExplicit(dsdVar.as());
        if (cls_classIfExplicit != null && !javaType.hasRawClass(cls_classIfExplicit) && !_primitiveAndWrapper(javaType, cls_classIfExplicit)) {
            try {
                javaType = typeFactory.constructSpecializedType(javaType, cls_classIfExplicit);
            } catch (IllegalArgumentException e) {
                throw new JsonMappingException((Closeable) null, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit.getName(), fd1Var.getName(), e.getMessage()), e);
            }
        }
        if (javaType.isMapLikeType()) {
            JavaType keyType = javaType.getKeyType();
            Class<?> cls_classIfExplicit2 = dsdVar == null ? null : _classIfExplicit(dsdVar.keyAs());
            if (cls_classIfExplicit2 != null && !_primitiveAndWrapper(keyType, cls_classIfExplicit2)) {
                try {
                    javaType = ((MapLikeType) javaType).withKeyType(typeFactory.constructSpecializedType(keyType, cls_classIfExplicit2));
                } catch (IllegalArgumentException e2) {
                    throw new JsonMappingException((Closeable) null, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit2.getName(), fd1Var.getName(), e2.getMessage()), e2);
                }
            }
        }
        JavaType contentType = javaType.getContentType();
        if (contentType == null) {
            return javaType;
        }
        Class<?> cls_classIfExplicit3 = dsdVar == null ? null : _classIfExplicit(dsdVar.contentAs());
        if (cls_classIfExplicit3 == null || _primitiveAndWrapper(contentType, cls_classIfExplicit3)) {
            return javaType;
        }
        try {
            return javaType.withContentType(typeFactory.constructSpecializedType(contentType, cls_classIfExplicit3));
        } catch (IllegalArgumentException e3) {
            throw new JsonMappingException((Closeable) null, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit3.getName(), fd1Var.getName(), e3.getMessage()), e3);
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, fd1 fd1Var, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeWithStaticTyping;
        JavaType javaTypeWithStaticTyping2;
        TypeFactory typeFactory = mapperConfig.getTypeFactory();
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(fd1Var, JsonSerialize.class);
        Class<?> cls_classIfExplicit = jsonSerialize == null ? null : _classIfExplicit(jsonSerialize.as());
        if (cls_classIfExplicit != null) {
            if (javaType.hasRawClass(cls_classIfExplicit)) {
                javaType = javaType.withStaticTyping();
            } else {
                Class<?> rawClass = javaType.getRawClass();
                try {
                    if (cls_classIfExplicit.isAssignableFrom(rawClass)) {
                        javaType = typeFactory.constructGeneralizedType(javaType, cls_classIfExplicit);
                    } else if (rawClass.isAssignableFrom(cls_classIfExplicit)) {
                        javaType = typeFactory.constructSpecializedType(javaType, cls_classIfExplicit);
                    } else {
                        if (!_primitiveAndWrapper(rawClass, cls_classIfExplicit)) {
                            throw new JsonMappingException((Closeable) null, String.format("Cannot refine serialization type %s into %s; types not related", javaType, cls_classIfExplicit.getName()));
                        }
                        javaType = javaType.withStaticTyping();
                    }
                } catch (IllegalArgumentException e) {
                    throw new JsonMappingException((Closeable) null, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit.getName(), fd1Var.getName(), e.getMessage()), e);
                }
            }
        }
        if (javaType.isMapLikeType()) {
            JavaType keyType = javaType.getKeyType();
            Class<?> cls_classIfExplicit2 = jsonSerialize == null ? null : _classIfExplicit(jsonSerialize.keyAs());
            if (cls_classIfExplicit2 != null) {
                if (keyType.hasRawClass(cls_classIfExplicit2)) {
                    javaTypeWithStaticTyping2 = keyType.withStaticTyping();
                } else {
                    Class<?> rawClass2 = keyType.getRawClass();
                    try {
                        if (cls_classIfExplicit2.isAssignableFrom(rawClass2)) {
                            javaTypeWithStaticTyping2 = typeFactory.constructGeneralizedType(keyType, cls_classIfExplicit2);
                        } else if (rawClass2.isAssignableFrom(cls_classIfExplicit2)) {
                            javaTypeWithStaticTyping2 = typeFactory.constructSpecializedType(keyType, cls_classIfExplicit2);
                        } else {
                            if (!_primitiveAndWrapper(rawClass2, cls_classIfExplicit2)) {
                                throw new JsonMappingException((Closeable) null, String.format("Cannot refine serialization key type %s into %s; types not related", keyType, cls_classIfExplicit2.getName()));
                            }
                            javaTypeWithStaticTyping2 = keyType.withStaticTyping();
                        }
                    } catch (IllegalArgumentException e2) {
                        throw new JsonMappingException((Closeable) null, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit2.getName(), fd1Var.getName(), e2.getMessage()), e2);
                    }
                }
                javaType = ((MapLikeType) javaType).withKeyType(javaTypeWithStaticTyping2);
            }
        }
        JavaType contentType = javaType.getContentType();
        if (contentType == null) {
            return javaType;
        }
        Class<?> cls_classIfExplicit3 = jsonSerialize == null ? null : _classIfExplicit(jsonSerialize.contentAs());
        if (cls_classIfExplicit3 == null) {
            return javaType;
        }
        if (contentType.hasRawClass(cls_classIfExplicit3)) {
            javaTypeWithStaticTyping = contentType.withStaticTyping();
        } else {
            Class<?> rawClass3 = contentType.getRawClass();
            try {
                if (cls_classIfExplicit3.isAssignableFrom(rawClass3)) {
                    javaTypeWithStaticTyping = typeFactory.constructGeneralizedType(contentType, cls_classIfExplicit3);
                } else if (rawClass3.isAssignableFrom(cls_classIfExplicit3)) {
                    javaTypeWithStaticTyping = typeFactory.constructSpecializedType(contentType, cls_classIfExplicit3);
                } else {
                    if (!_primitiveAndWrapper(rawClass3, cls_classIfExplicit3)) {
                        throw new JsonMappingException((Closeable) null, String.format("Cannot refine serialization content type %s into %s; types not related", contentType, cls_classIfExplicit3.getName()));
                    }
                    javaTypeWithStaticTyping = contentType.withStaticTyping();
                }
            } catch (IllegalArgumentException e3) {
                throw new JsonMappingException((Closeable) null, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, cls_classIfExplicit3.getName(), fd1Var.getName(), e3.getMessage()), e3);
            }
        }
        return javaType.withContentType(javaTypeWithStaticTyping);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        Class<?> rawParameterType = annotatedMethod.getRawParameterType(0);
        Class<?> rawParameterType2 = annotatedMethod2.getRawParameterType(0);
        if (rawParameterType.isPrimitive()) {
            if (!rawParameterType2.isPrimitive()) {
                return annotatedMethod;
            }
        } else if (rawParameterType2.isPrimitive()) {
            return annotatedMethod2;
        }
        if (rawParameterType == String.class) {
            if (rawParameterType2 != String.class) {
                return annotatedMethod;
            }
            return null;
        }
        if (rawParameterType2 == String.class) {
            return annotatedMethod2;
        }
        return null;
    }

    public JacksonAnnotationIntrospector setConstructorPropertiesImpliesCreator(boolean z) {
        this._cfgConstructorPropertiesImpliesCreator = z;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Version version() {
        return ihh.f21147a;
    }

    public Class<?> _classIfExplicit(Class<?> cls, Class<?> cls2) {
        Class<?> cls_classIfExplicit = _classIfExplicit(cls);
        if (cls_classIfExplicit == null || cls_classIfExplicit == cls2) {
            return null;
        }
        return cls_classIfExplicit;
    }

    private boolean _primitiveAndWrapper(JavaType javaType, Class<?> cls) {
        if (javaType.isPrimitive()) {
            return javaType.hasRawClass(h04.X(cls));
        }
        return cls.isPrimitive() && cls == h04.X(javaType.getRawClass());
    }

    public BeanPropertyWriter _constructVirtualProperty(xrd.b bVar, MapperConfig<?> mapperConfig, com.fasterxml.jackson.databind.introspect.a aVar) {
        PropertyMetadata propertyMetadata = bVar.required() ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        PropertyName propertyName_propertyName = _propertyName(bVar.name(), bVar.namespace());
        JavaType javaTypeConstructType = mapperConfig.constructType(bVar.type());
        ecm ecmVarG = ecm.G(mapperConfig, new VirtualAnnotatedMember(aVar, aVar.getRawType(), propertyName_propertyName.getSimpleName(), javaTypeConstructType), propertyName_propertyName, propertyMetadata, bVar.include());
        Class<? extends VirtualBeanPropertyWriter> clsValue = bVar.value();
        mapperConfig.getHandlerInstantiator();
        return ((VirtualBeanPropertyWriter) h04.k(clsValue, mapperConfig.canOverrideAccessModifiers())).withConfig(mapperConfig, aVar, ecmVarG, javaTypeConstructType);
    }
}
