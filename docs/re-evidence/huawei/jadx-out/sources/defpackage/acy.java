package defpackage;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonKey;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.ext.Java7Support;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.huawei.operation.utils.Constants;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class acy extends AnnotationIntrospector implements Serializable {
    private static final Java7Support e;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class<? extends Annotation>[] f282c = {JsonSerialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonRawValue.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<? extends Annotation>[] f281b = {JsonDeserialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class, JsonMerge.class};
    protected transient aia<Class<?>, Boolean> d = new aia<>(48, 48);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f283a = true;

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationContentType(Annotated annotated, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationKeyType(Annotated annotated, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationType(Annotated annotated, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public ys findRenameByField(MapperConfig<?> mapperConfig, acj acjVar, ys ysVar) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationContentType(Annotated annotated, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationKeyType(Annotated annotated, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationType(Annotated annotated) {
        return null;
    }

    static {
        Java7Support java7SupportInstance;
        try {
            java7SupportInstance = Java7Support.instance();
        } catch (Throwable unused) {
            java7SupportInstance = null;
        }
        e = java7SupportInstance;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.core.Versioned
    public wu version() {
        return za.e;
    }

    protected Object readResolve() {
        if (this.d == null) {
            this.d = new aia<>(48, 48);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean isAnnotationBundle(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Boolean boolValueOf = this.d.get(clsAnnotationType);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(clsAnnotationType.getAnnotation(JacksonAnnotationsInside.class) != null);
            this.d.putIfAbsent(clsAnnotationType, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public String findEnumValue(Enum<?> r3) {
        JsonProperty jsonProperty;
        String strValue;
        try {
            Field field = r3.getDeclaringClass().getField(r3.name());
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
        for (Field field : cls.getDeclaredFields()) {
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
    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        JsonAlias jsonAlias;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (jsonAlias = (JsonAlias) field.getAnnotation(JsonAlias.class)) != null) {
                String[] strArrValue = jsonAlias.value();
                if (strArrValue.length != 0) {
                    String name = field.getName();
                    int length = enumArr.length;
                    for (int i = 0; i < length; i++) {
                        if (name.equals(enumArr[i].name())) {
                            strArr[i] = strArrValue;
                        }
                    }
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return ahw.d(cls, JsonEnumDefaultValue.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public ys findRootName(ack ackVar) {
        JsonRootName jsonRootName = (JsonRootName) _findAnnotation(ackVar, JsonRootName.class);
        if (jsonRootName == null) {
            return null;
        }
        String strNamespace = jsonRootName.namespace();
        return ys.a(jsonRootName.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isIgnorableType(ack ackVar) {
        JsonIgnoreType jsonIgnoreType = (JsonIgnoreType) _findAnnotation(ackVar, JsonIgnoreType.class);
        if (jsonIgnoreType == null) {
            return null;
        }
        return Boolean.valueOf(jsonIgnoreType.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIgnoreProperties.b findPropertyIgnoralByName(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonIgnoreProperties jsonIgnoreProperties = (JsonIgnoreProperties) _findAnnotation(annotated, JsonIgnoreProperties.class);
        if (jsonIgnoreProperties == null) {
            return JsonIgnoreProperties.b.c();
        }
        return JsonIgnoreProperties.b.b(jsonIgnoreProperties);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonIgnoreProperties.b findPropertyIgnorals(Annotated annotated) {
        return findPropertyIgnoralByName(null, annotated);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIncludeProperties.b findPropertyInclusionByName(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonIncludeProperties jsonIncludeProperties = (JsonIncludeProperties) _findAnnotation(annotated, JsonIncludeProperties.class);
        if (jsonIncludeProperties == null) {
            return JsonIncludeProperties.b.d();
        }
        return JsonIncludeProperties.b.b(jsonIncludeProperties);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findFilterId(Annotated annotated) {
        JsonFilter jsonFilter = (JsonFilter) _findAnnotation(annotated, JsonFilter.class);
        if (jsonFilter == null) {
            return null;
        }
        String strValue = jsonFilter.value();
        if (strValue.isEmpty()) {
            return null;
        }
        return strValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNamingStrategy(ack ackVar) {
        JsonNaming jsonNaming = (JsonNaming) _findAnnotation(ackVar, JsonNaming.class);
        if (jsonNaming == null) {
            return null;
        }
        return jsonNaming.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findClassDescription(ack ackVar) {
        JsonClassDescription jsonClassDescription = (JsonClassDescription) _findAnnotation(ackVar, JsonClassDescription.class);
        if (jsonClassDescription == null) {
            return null;
        }
        return jsonClassDescription.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public VisibilityChecker<?> findAutoDetectVisibility(ack ackVar, VisibilityChecker<?> visibilityChecker) {
        JsonAutoDetect jsonAutoDetect = (JsonAutoDetect) _findAnnotation(ackVar, JsonAutoDetect.class);
        return jsonAutoDetect == null ? visibilityChecker : visibilityChecker.with(jsonAutoDetect);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        ys ysVarE = e(annotatedMember);
        if (ysVarE == null) {
            return null;
        }
        return ysVarE.b();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<ys> findPropertyAliases(Annotated annotated) {
        JsonAlias jsonAlias = (JsonAlias) _findAnnotation(annotated, JsonAlias.class);
        if (jsonAlias == null) {
            return null;
        }
        String[] strArrValue = jsonAlias.value();
        int length = strArrValue.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (String str : strArrValue) {
            arrayList.add(ys.c(str));
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return d(annotatedMember);
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
    public JsonProperty.Access findPropertyAccess(Annotated annotated) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.access();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDescription(Annotated annotated) {
        JsonPropertyDescription jsonPropertyDescription = (JsonPropertyDescription) _findAnnotation(annotated, JsonPropertyDescription.class);
        if (jsonPropertyDescription == null) {
            return null;
        }
        return jsonPropertyDescription.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Integer findPropertyIndex(Annotated annotated) {
        int iIndex;
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty == null || (iIndex = jsonProperty.index()) == -1) {
            return null;
        }
        return Integer.valueOf(iIndex);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDefaultValue(Annotated annotated) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
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
    public JsonFormat.c findFormat(Annotated annotated) {
        JsonFormat jsonFormat = (JsonFormat) _findAnnotation(annotated, JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        return JsonFormat.c.b(jsonFormat);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        JsonManagedReference jsonManagedReference = (JsonManagedReference) _findAnnotation(annotatedMember, JsonManagedReference.class);
        if (jsonManagedReference != null) {
            return AnnotationIntrospector.ReferenceProperty.a(jsonManagedReference.value());
        }
        JsonBackReference jsonBackReference = (JsonBackReference) _findAnnotation(annotatedMember, JsonBackReference.class);
        if (jsonBackReference != null) {
            return AnnotationIntrospector.ReferenceProperty.d(jsonBackReference.value());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        JsonUnwrapped jsonUnwrapped = (JsonUnwrapped) _findAnnotation(annotatedMember, JsonUnwrapped.class);
        if (jsonUnwrapped == null || !jsonUnwrapped.enabled()) {
            return null;
        }
        return NameTransformer.simpleTransformer(jsonUnwrapped.prefix(), jsonUnwrapped.suffix());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JacksonInject.b findInjectableValue(AnnotatedMember annotatedMember) {
        String name;
        JacksonInject jacksonInject = (JacksonInject) _findAnnotation(annotatedMember, JacksonInject.class);
        if (jacksonInject == null) {
            return null;
        }
        JacksonInject.b bVarB = JacksonInject.b.b(jacksonInject);
        if (bVarB.d()) {
            return bVarB;
        }
        if (!(annotatedMember instanceof aco)) {
            name = annotatedMember.getRawType().getName();
        } else {
            aco acoVar = (aco) annotatedMember;
            if (acoVar.getParameterCount() == 0) {
                name = annotatedMember.getRawType().getName();
            } else {
                name = acoVar.getRawParameterType(0).getName();
            }
        }
        return bVarB.c(name);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        JacksonInject.b bVarFindInjectableValue = findInjectableValue(annotatedMember);
        if (bVarFindInjectableValue == null) {
            return null;
        }
        return bVarFindInjectableValue.c();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?>[] findViews(Annotated annotated) {
        JsonView jsonView = (JsonView) _findAnnotation(annotated, JsonView.class);
        if (jsonView == null) {
            return null;
        }
        return jsonView.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public aco resolveSetterConflict(MapperConfig<?> mapperConfig, aco acoVar, aco acoVar2) {
        Class<?> rawParameterType = acoVar.getRawParameterType(0);
        Class<?> rawParameterType2 = acoVar2.getRawParameterType(0);
        if (rawParameterType.isPrimitive()) {
            if (rawParameterType2.isPrimitive()) {
            }
            return acoVar;
        }
        if (!rawParameterType2.isPrimitive()) {
        }
        return acoVar2;
        if (rawParameterType == String.class) {
            if (rawParameterType2 != String.class) {
                return acoVar;
            }
            return null;
        }
        if (rawParameterType2 == String.class) {
            return acoVar2;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> mapperConfig, ack ackVar, JavaType javaType) {
        return d(mapperConfig, ackVar, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public TypeResolverBuilder<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return null;
        }
        return d(mapperConfig, annotatedMember, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public TypeResolverBuilder<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.getContentType() == null) {
            throw new IllegalArgumentException("Must call method with a container or reference type (got " + javaType + Constants.RIGHT_BRACKET_ONLY);
        }
        return d(mapperConfig, annotatedMember, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<adg> findSubtypes(Annotated annotated) {
        JsonSubTypes jsonSubTypes = (JsonSubTypes) _findAnnotation(annotated, JsonSubTypes.class);
        if (jsonSubTypes == null) {
            return null;
        }
        JsonSubTypes.Type[] typeArrValue = jsonSubTypes.value();
        ArrayList arrayList = new ArrayList(typeArrValue.length);
        for (JsonSubTypes.Type type : typeArrValue) {
            arrayList.add(new adg(type.value(), type.name()));
            for (String str : type.names()) {
                arrayList.add(new adg(type.value(), str));
            }
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findTypeName(ack ackVar) {
        JsonTypeName jsonTypeName = (JsonTypeName) _findAnnotation(ackVar, JsonTypeName.class);
        if (jsonTypeName == null) {
            return null;
        }
        return jsonTypeName.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return Boolean.valueOf(_hasAnnotation(annotatedMember, JsonTypeId.class));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public acv findObjectIdInfo(Annotated annotated) {
        JsonIdentityInfo jsonIdentityInfo = (JsonIdentityInfo) _findAnnotation(annotated, JsonIdentityInfo.class);
        if (jsonIdentityInfo == null || jsonIdentityInfo.generator() == ObjectIdGenerators.None.class) {
            return null;
        }
        return new acv(ys.c(jsonIdentityInfo.property()), jsonIdentityInfo.scope(), jsonIdentityInfo.generator(), jsonIdentityInfo.resolver());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public acv findObjectReferenceInfo(Annotated annotated, acv acvVar) {
        JsonIdentityReference jsonIdentityReference = (JsonIdentityReference) _findAnnotation(annotated, JsonIdentityReference.class);
        if (jsonIdentityReference == null) {
            return acvVar;
        }
        if (acvVar == null) {
            acvVar = acv.d();
        }
        return acvVar.e(jsonIdentityReference.alwaysAsId());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializer(Annotated annotated) {
        Class<? extends JsonSerializer> clsUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize != null && (clsUsing = jsonSerialize.using()) != JsonSerializer.None.class) {
            return clsUsing;
        }
        JsonRawValue jsonRawValue = (JsonRawValue) _findAnnotation(annotated, JsonRawValue.class);
        if (jsonRawValue == null || !jsonRawValue.value()) {
            return null;
        }
        return new agr(annotated.getRawType());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeySerializer(Annotated annotated) {
        Class<? extends JsonSerializer> clsKeyUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null || (clsKeyUsing = jsonSerialize.keyUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentSerializer(Annotated annotated) {
        Class<? extends JsonSerializer> clsContentUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null || (clsContentUsing = jsonSerialize.contentUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNullSerializer(Annotated annotated) {
        Class<? extends JsonSerializer> clsNullsUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null || (clsNullsUsing = jsonSerialize.nullsUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return clsNullsUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonInclude.b findPropertyInclusion(Annotated annotated) {
        JsonInclude jsonInclude = (JsonInclude) _findAnnotation(annotated, JsonInclude.class);
        JsonInclude.b bVarE = jsonInclude == null ? JsonInclude.b.e() : JsonInclude.b.c(jsonInclude);
        return bVarE.b() == JsonInclude.Include.USE_DEFAULTS ? a(annotated, bVarE) : bVarE;
    }

    private JsonInclude.b a(Annotated annotated, JsonInclude.b bVar) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize != null) {
            int i = AnonymousClass1.e[jsonSerialize.include().ordinal()];
            if (i == 1) {
                return bVar.c(JsonInclude.Include.ALWAYS);
            }
            if (i == 2) {
                return bVar.c(JsonInclude.Include.NON_NULL);
            }
            if (i == 3) {
                return bVar.c(JsonInclude.Include.NON_DEFAULT);
            }
            if (i == 4) {
                return bVar.c(JsonInclude.Include.NON_EMPTY);
            }
        }
        return bVar;
    }

    /* JADX INFO: renamed from: acy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[JsonSerialize.Inclusion.values().length];
            e = iArr;
            try {
                iArr[JsonSerialize.Inclusion.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[JsonSerialize.Inclusion.NON_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[JsonSerialize.Inclusion.NON_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[JsonSerialize.Inclusion.NON_EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[JsonSerialize.Inclusion.DEFAULT_INCLUSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSerialize.Typing findSerializationTyping(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return jsonSerialize.typing();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationConverter(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return e(jsonSerialize.converter(), Converter.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotatedMember, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return e(jsonSerialize.contentConverter(), Converter.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws ym {
        JavaType javaTypeWithStaticTyping;
        JavaType javaTypeWithStaticTyping2;
        ahp typeFactory = mapperConfig.getTypeFactory();
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        Class<?> clsA = jsonSerialize == null ? null : a(jsonSerialize.as());
        if (clsA != null) {
            if (javaType.hasRawClass(clsA)) {
                javaType = javaType.withStaticTyping();
            } else {
                Class<?> rawClass = javaType.getRawClass();
                try {
                    if (clsA.isAssignableFrom(rawClass)) {
                        javaType = typeFactory.b(javaType, clsA);
                    } else if (rawClass.isAssignableFrom(clsA)) {
                        javaType = typeFactory.c(javaType, clsA);
                    } else if (a(rawClass, clsA)) {
                        javaType = javaType.withStaticTyping();
                    } else {
                        throw new ym((Closeable) null, String.format("Cannot refine serialization type %s into %s; types not related", javaType, clsA.getName()));
                    }
                } catch (IllegalArgumentException e2) {
                    throw new ym((Closeable) null, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", javaType, clsA.getName(), annotated.getName(), e2.getMessage()), e2);
                }
            }
        }
        if (javaType.isMapLikeType()) {
            JavaType keyType = javaType.getKeyType();
            Class<?> clsA2 = jsonSerialize == null ? null : a(jsonSerialize.keyAs());
            if (clsA2 != null) {
                if (keyType.hasRawClass(clsA2)) {
                    javaTypeWithStaticTyping2 = keyType.withStaticTyping();
                } else {
                    Class<?> rawClass2 = keyType.getRawClass();
                    try {
                        if (clsA2.isAssignableFrom(rawClass2)) {
                            javaTypeWithStaticTyping2 = typeFactory.b(keyType, clsA2);
                        } else if (rawClass2.isAssignableFrom(clsA2)) {
                            javaTypeWithStaticTyping2 = typeFactory.c(keyType, clsA2);
                        } else if (a(rawClass2, clsA2)) {
                            javaTypeWithStaticTyping2 = keyType.withStaticTyping();
                        } else {
                            throw new ym((Closeable) null, String.format("Cannot refine serialization key type %s into %s; types not related", keyType, clsA2.getName()));
                        }
                    } catch (IllegalArgumentException e3) {
                        throw new ym((Closeable) null, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsA2.getName(), annotated.getName(), e3.getMessage()), e3);
                    }
                }
                javaType = ((ahk) javaType).e(javaTypeWithStaticTyping2);
            }
        }
        JavaType contentType = javaType.getContentType();
        if (contentType != null) {
            Class<?> clsA3 = jsonSerialize == null ? null : a(jsonSerialize.contentAs());
            if (clsA3 != null) {
                if (contentType.hasRawClass(clsA3)) {
                    javaTypeWithStaticTyping = contentType.withStaticTyping();
                } else {
                    Class<?> rawClass3 = contentType.getRawClass();
                    try {
                        if (clsA3.isAssignableFrom(rawClass3)) {
                            javaTypeWithStaticTyping = typeFactory.b(contentType, clsA3);
                        } else if (rawClass3.isAssignableFrom(clsA3)) {
                            javaTypeWithStaticTyping = typeFactory.c(contentType, clsA3);
                        } else if (a(rawClass3, clsA3)) {
                            javaTypeWithStaticTyping = contentType.withStaticTyping();
                        } else {
                            throw new ym((Closeable) null, String.format("Cannot refine serialization content type %s into %s; types not related", contentType, clsA3.getName()));
                        }
                    } catch (IllegalArgumentException e4) {
                        throw new ym((Closeable) null, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsA3.getName(), annotated.getName(), e4.getMessage()), e4);
                    }
                }
                return javaType.withContentType(javaTypeWithStaticTyping);
            }
        }
        return javaType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findSerializationPropertyOrder(ack ackVar) {
        JsonPropertyOrder jsonPropertyOrder = (JsonPropertyOrder) _findAnnotation(ackVar, JsonPropertyOrder.class);
        if (jsonPropertyOrder == null) {
            return null;
        }
        return jsonPropertyOrder.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findSerializationSortAlphabetically(Annotated annotated) {
        return c(annotated);
    }

    private final Boolean c(Annotated annotated) {
        JsonPropertyOrder jsonPropertyOrder = (JsonPropertyOrder) _findAnnotation(annotated, JsonPropertyOrder.class);
        if (jsonPropertyOrder == null || !jsonPropertyOrder.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, ack ackVar, List<aez> list) {
        JsonAppend jsonAppend = (JsonAppend) _findAnnotation(ackVar, JsonAppend.class);
        if (jsonAppend == null) {
            return;
        }
        boolean zPrepend = jsonAppend.prepend();
        JsonAppend.Attr[] attrArrAttrs = jsonAppend.attrs();
        int length = attrArrAttrs.length;
        JavaType javaTypeConstructType = null;
        for (int i = 0; i < length; i++) {
            if (javaTypeConstructType == null) {
                javaTypeConstructType = mapperConfig.constructType(Object.class);
            }
            aez aezVarA = a(attrArrAttrs[i], mapperConfig, ackVar, javaTypeConstructType);
            if (zPrepend) {
                list.add(i, aezVarA);
            } else {
                list.add(aezVarA);
            }
        }
        JsonAppend.Prop[] propArrProps = jsonAppend.props();
        int length2 = propArrProps.length;
        for (int i2 = 0; i2 < length2; i2++) {
            aez aezVarE = e(propArrProps[i2], mapperConfig, ackVar);
            if (zPrepend) {
                list.add(i2, aezVarE);
            } else {
                list.add(aezVarE);
            }
        }
    }

    protected aez a(JsonAppend.Attr attr, MapperConfig<?> mapperConfig, ack ackVar, JavaType javaType) {
        yq yqVar = attr.required() ? yq.d : yq.f53745a;
        String strValue = attr.value();
        ys ysVarC = c(attr.propName(), attr.propNamespace());
        if (!ysVarC.c()) {
            ysVarC = ys.c(strValue);
        }
        return afe.b(strValue, aih.d(mapperConfig, new ade(ackVar, ackVar.getRawType(), strValue, javaType), ysVarC, yqVar, attr.include()), ackVar.d(), javaType);
    }

    protected aez e(JsonAppend.Prop prop, MapperConfig<?> mapperConfig, ack ackVar) {
        yq yqVar = prop.required() ? yq.d : yq.f53745a;
        ys ysVarC = c(prop.name(), prop.namespace());
        JavaType javaTypeConstructType = mapperConfig.constructType(prop.type());
        aih aihVarD = aih.d(mapperConfig, new ade(ackVar, ackVar.getRawType(), ysVarC.b(), javaTypeConstructType), ysVarC, yqVar, prop.include());
        Class<? extends VirtualBeanPropertyWriter> clsValue = prop.value();
        HandlerInstantiator handlerInstantiator = mapperConfig.getHandlerInstantiator();
        VirtualBeanPropertyWriter virtualBeanPropertyWriterVirtualPropertyWriterInstance = handlerInstantiator == null ? null : handlerInstantiator.virtualPropertyWriterInstance(mapperConfig, clsValue);
        if (virtualBeanPropertyWriterVirtualPropertyWriterInstance == null) {
            virtualBeanPropertyWriterVirtualPropertyWriterInstance = (VirtualBeanPropertyWriter) ahw.b(clsValue, mapperConfig.canOverrideAccessModifiers());
        }
        return virtualBeanPropertyWriterVirtualPropertyWriterInstance.withConfig(mapperConfig, ackVar, aihVarD, javaTypeConstructType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public ys findNameForSerialization(Annotated annotated) {
        boolean z;
        JsonGetter jsonGetter = (JsonGetter) _findAnnotation(annotated, JsonGetter.class);
        if (jsonGetter != null) {
            String strValue = jsonGetter.value();
            if (!strValue.isEmpty()) {
                return ys.c(strValue);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty != null) {
            String strNamespace = jsonProperty.namespace();
            return ys.a(jsonProperty.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z || _hasOneOf(annotated, f282c)) {
            return ys.e;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAsKey(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonKey jsonKey = (JsonKey) _findAnnotation(annotated, JsonKey.class);
        if (jsonKey == null) {
            return null;
        }
        return Boolean.valueOf(jsonKey.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAsValue(Annotated annotated) {
        JsonValue jsonValue = (JsonValue) _findAnnotation(annotated, JsonValue.class);
        if (jsonValue == null) {
            return null;
        }
        return Boolean.valueOf(jsonValue.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnyGetter(Annotated annotated) {
        JsonAnyGetter jsonAnyGetter = (JsonAnyGetter) _findAnnotation(annotated, JsonAnyGetter.class);
        if (jsonAnyGetter == null) {
            return null;
        }
        return Boolean.valueOf(jsonAnyGetter.enabled());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnyGetterAnnotation(aco acoVar) {
        return _hasAnnotation(acoVar, JsonAnyGetter.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAsValueAnnotation(aco acoVar) {
        JsonValue jsonValue = (JsonValue) _findAnnotation(acoVar, JsonValue.class);
        return jsonValue != null && jsonValue.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializer(Annotated annotated) {
        Class<? extends JsonDeserializer> clsUsing;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null || (clsUsing = jsonDeserialize.using()) == JsonDeserializer.None.class) {
            return null;
        }
        return clsUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeyDeserializer(Annotated annotated) {
        Class<? extends KeyDeserializer> clsKeyUsing;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null || (clsKeyUsing = jsonDeserialize.keyUsing()) == KeyDeserializer.None.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentDeserializer(Annotated annotated) {
        Class<? extends JsonDeserializer> clsContentUsing;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null || (clsContentUsing = jsonDeserialize.contentUsing()) == JsonDeserializer.None.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationConverter(Annotated annotated) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return e(jsonDeserialize.converter(), Converter.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotatedMember, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return e(jsonDeserialize.contentConverter(), Converter.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws ym {
        ahp typeFactory = mapperConfig.getTypeFactory();
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        Class<?> clsA = jsonDeserialize == null ? null : a(jsonDeserialize.as());
        if (clsA != null && !javaType.hasRawClass(clsA) && !e(javaType, clsA)) {
            try {
                javaType = typeFactory.c(javaType, clsA);
            } catch (IllegalArgumentException e2) {
                throw new ym((Closeable) null, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", javaType, clsA.getName(), annotated.getName(), e2.getMessage()), e2);
            }
        }
        if (javaType.isMapLikeType()) {
            JavaType keyType = javaType.getKeyType();
            Class<?> clsA2 = jsonDeserialize == null ? null : a(jsonDeserialize.keyAs());
            if (clsA2 != null && !e(keyType, clsA2)) {
                try {
                    javaType = ((ahk) javaType).e(typeFactory.c(keyType, clsA2));
                } catch (IllegalArgumentException e3) {
                    throw new ym((Closeable) null, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsA2.getName(), annotated.getName(), e3.getMessage()), e3);
                }
            }
        }
        JavaType contentType = javaType.getContentType();
        if (contentType != null) {
            Class<?> clsA3 = jsonDeserialize == null ? null : a(jsonDeserialize.contentAs());
            if (clsA3 != null && !e(contentType, clsA3)) {
                try {
                    return javaType.withContentType(typeFactory.c(contentType, clsA3));
                } catch (IllegalArgumentException e4) {
                    throw new ym((Closeable) null, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsA3.getName(), annotated.getName(), e4.getMessage()), e4);
                }
            }
        }
        return javaType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findValueInstantiator(ack ackVar) {
        JsonValueInstantiator jsonValueInstantiator = (JsonValueInstantiator) _findAnnotation(ackVar, JsonValueInstantiator.class);
        if (jsonValueInstantiator == null) {
            return null;
        }
        return jsonValueInstantiator.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?> findPOJOBuilder(ack ackVar) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(ackVar, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return a(jsonDeserialize.builder());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonPOJOBuilder.e findPOJOBuilderConfig(ack ackVar) {
        JsonPOJOBuilder jsonPOJOBuilder = (JsonPOJOBuilder) _findAnnotation(ackVar, JsonPOJOBuilder.class);
        if (jsonPOJOBuilder == null) {
            return null;
        }
        return new JsonPOJOBuilder.e(jsonPOJOBuilder);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public ys findNameForDeserialization(Annotated annotated) {
        boolean z;
        JsonSetter jsonSetter = (JsonSetter) _findAnnotation(annotated, JsonSetter.class);
        if (jsonSetter != null) {
            String strValue = jsonSetter.value();
            if (!strValue.isEmpty()) {
                return ys.c(strValue);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty != null) {
            String strNamespace = jsonProperty.namespace();
            return ys.a(jsonProperty.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z || _hasOneOf(annotated, f281b)) {
            return ys.e;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnySetter(Annotated annotated) {
        JsonAnySetter jsonAnySetter = (JsonAnySetter) _findAnnotation(annotated, JsonAnySetter.class);
        if (jsonAnySetter == null) {
            return null;
        }
        return Boolean.valueOf(jsonAnySetter.enabled());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSetter.e findSetterInfo(Annotated annotated) {
        return JsonSetter.e.a((JsonSetter) _findAnnotation(annotated, JsonSetter.class));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findMergeInfo(Annotated annotated) {
        JsonMerge jsonMerge = (JsonMerge) _findAnnotation(annotated, JsonMerge.class);
        if (jsonMerge == null) {
            return null;
        }
        return jsonMerge.value().asBoolean();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnySetterAnnotation(aco acoVar) {
        return _hasAnnotation(acoVar, JsonAnySetter.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasCreatorAnnotation(Annotated annotated) {
        Java7Support java7Support;
        Boolean boolHasCreatorAnnotation;
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(annotated, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode() != JsonCreator.Mode.DISABLED;
        }
        if (!this.f283a || !(annotated instanceof ach) || (java7Support = e) == null || (boolHasCreatorAnnotation = java7Support.hasCreatorAnnotation(annotated)) == null) {
            return false;
        }
        return boolHasCreatorAnnotation.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonCreator.Mode findCreatorBinding(Annotated annotated) {
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(annotated, JsonCreator.class);
        if (jsonCreator == null) {
            return null;
        }
        return jsonCreator.mode();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, Annotated annotated) {
        Java7Support java7Support;
        Boolean boolHasCreatorAnnotation;
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(annotated, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode();
        }
        if (this.f283a && mapperConfig.isEnabled(MapperFeature.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES) && (annotated instanceof ach) && (java7Support = e) != null && (boolHasCreatorAnnotation = java7Support.hasCreatorAnnotation(annotated)) != null && boolHasCreatorAnnotation.booleanValue()) {
            return JsonCreator.Mode.PROPERTIES;
        }
        return null;
    }

    protected boolean d(Annotated annotated) {
        Boolean boolFindTransient;
        JsonIgnore jsonIgnore = (JsonIgnore) _findAnnotation(annotated, JsonIgnore.class);
        if (jsonIgnore != null) {
            return jsonIgnore.value();
        }
        Java7Support java7Support = e;
        if (java7Support == null || (boolFindTransient = java7Support.findTransient(annotated)) == null) {
            return false;
        }
        return boolFindTransient.booleanValue();
    }

    protected Class<?> a(Class<?> cls) {
        if (cls == null || ahw.l(cls)) {
            return null;
        }
        return cls;
    }

    protected Class<?> e(Class<?> cls, Class<?> cls2) {
        Class<?> clsA = a(cls);
        if (clsA == null || clsA == cls2) {
            return null;
        }
        return clsA;
    }

    protected ys c(String str, String str2) {
        if (str.isEmpty()) {
            return ys.e;
        }
        if (str2 == null || str2.isEmpty()) {
            return ys.c(str);
        }
        return ys.a(str, str2);
    }

    protected ys e(Annotated annotated) {
        Java7Support java7Support;
        ys ysVarFindConstructorName;
        if (!(annotated instanceof acp)) {
            return null;
        }
        acp acpVar = (acp) annotated;
        if (acpVar.e() == null || (java7Support = e) == null || (ysVarFindConstructorName = java7Support.findConstructorName(acpVar)) == null) {
            return null;
        }
        return ysVarFindConstructorName;
    }

    protected TypeResolverBuilder<?> d(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) {
        TypeResolverBuilder<?> typeResolverBuilderD;
        JsonTypeInfo jsonTypeInfo = (JsonTypeInfo) _findAnnotation(annotated, JsonTypeInfo.class);
        JsonTypeResolver jsonTypeResolver = (JsonTypeResolver) _findAnnotation(annotated, JsonTypeResolver.class);
        if (jsonTypeResolver != null) {
            if (jsonTypeInfo == null) {
                return null;
            }
            typeResolverBuilderD = mapperConfig.typeResolverBuilderInstance(annotated, jsonTypeResolver.value());
        } else {
            if (jsonTypeInfo == null) {
                return null;
            }
            if (jsonTypeInfo.use() == JsonTypeInfo.Id.NONE) {
                return b();
            }
            typeResolverBuilderD = d();
        }
        JsonTypeIdResolver jsonTypeIdResolver = (JsonTypeIdResolver) _findAnnotation(annotated, JsonTypeIdResolver.class);
        TypeIdResolver typeIdResolverTypeIdResolverInstance = jsonTypeIdResolver != null ? mapperConfig.typeIdResolverInstance(annotated, jsonTypeIdResolver.value()) : null;
        if (typeIdResolverTypeIdResolverInstance != null) {
            typeIdResolverTypeIdResolverInstance.init(javaType);
        }
        TypeResolverBuilder typeResolverBuilderInit = typeResolverBuilderD.init(jsonTypeInfo.use(), typeIdResolverTypeIdResolverInstance);
        JsonTypeInfo.As asInclude = jsonTypeInfo.include();
        if (asInclude == JsonTypeInfo.As.EXTERNAL_PROPERTY && (annotated instanceof ack)) {
            asInclude = JsonTypeInfo.As.PROPERTY;
        }
        TypeResolverBuilder typeResolverBuilderTypeProperty = typeResolverBuilderInit.inclusion(asInclude).typeProperty(jsonTypeInfo.property());
        Class<?> clsDefaultImpl = jsonTypeInfo.defaultImpl();
        if (clsDefaultImpl != JsonTypeInfo.None.class && !clsDefaultImpl.isAnnotation()) {
            typeResolverBuilderTypeProperty = typeResolverBuilderTypeProperty.defaultImpl(clsDefaultImpl);
        }
        return typeResolverBuilderTypeProperty.typeIdVisibility(jsonTypeInfo.visible());
    }

    protected adv d() {
        return new adv();
    }

    protected adv b() {
        return adv.e();
    }

    private boolean a(Class<?> cls, Class<?> cls2) {
        if (cls.isPrimitive()) {
            return cls == ahw.v(cls2);
        }
        return cls2.isPrimitive() && cls2 == ahw.v(cls);
    }

    private boolean e(JavaType javaType, Class<?> cls) {
        if (javaType.isPrimitive()) {
            return javaType.hasRawClass(ahw.v(cls));
        }
        return cls.isPrimitive() && cls == ahw.v(javaType.getRawClass());
    }
}
