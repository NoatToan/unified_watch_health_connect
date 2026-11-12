package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.c5q;
import defpackage.fd1;
import defpackage.mtd;
import defpackage.z3h;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AnnotationIntrospector implements Serializable {

    public static class ReferenceProperty {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f7627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7628b;

        public enum Type {
            MANAGED_REFERENCE,
            BACK_REFERENCE
        }

        public ReferenceProperty(Type type, String str) {
            this.f7627a = type;
            this.f7628b = str;
        }

        public static ReferenceProperty a(String str) {
            return new ReferenceProperty(Type.BACK_REFERENCE, str);
        }

        public static ReferenceProperty e(String str) {
            return new ReferenceProperty(Type.MANAGED_REFERENCE, str);
        }

        public String b() {
            return this.f7628b;
        }

        public boolean c() {
            return this.f7627a == Type.BACK_REFERENCE;
        }

        public boolean d() {
            return this.f7627a == Type.MANAGED_REFERENCE;
        }
    }

    public static AnnotationIntrospector nopInstance() {
        return NopAnnotationIntrospector.instance;
    }

    public static AnnotationIntrospector pair(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        return new AnnotationIntrospectorPair(annotationIntrospector, annotationIntrospector2);
    }

    public <A extends Annotation> A _findAnnotation(fd1 fd1Var, Class<A> cls) {
        return (A) fd1Var.getAnnotation(cls);
    }

    public boolean _hasAnnotation(fd1 fd1Var, Class<? extends Annotation> cls) {
        return fd1Var.hasAnnotation(cls);
    }

    public boolean _hasOneOf(fd1 fd1Var, Class<? extends Annotation>[] clsArr) {
        return fd1Var.hasOneOf(clsArr);
    }

    public Collection<AnnotationIntrospector> allIntrospectors() {
        return Collections.singletonList(this);
    }

    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, com.fasterxml.jackson.databind.introspect.a aVar, List<BeanPropertyWriter> list) {
    }

    public VisibilityChecker<?> findAutoDetectVisibility(com.fasterxml.jackson.databind.introspect.a aVar, VisibilityChecker<?> visibilityChecker) {
        return visibilityChecker;
    }

    public String findClassDescription(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public Object findContentDeserializer(fd1 fd1Var) {
        return null;
    }

    public Object findContentSerializer(fd1 fd1Var) {
        return null;
    }

    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, fd1 fd1Var) {
        if (!hasCreatorAnnotation(fd1Var)) {
            return null;
        }
        JsonCreator.Mode modeFindCreatorBinding = findCreatorBinding(fd1Var);
        return modeFindCreatorBinding == null ? JsonCreator.Mode.DEFAULT : modeFindCreatorBinding;
    }

    @Deprecated
    public JsonCreator.Mode findCreatorBinding(fd1 fd1Var) {
        return null;
    }

    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return null;
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationContentType(fd1 fd1Var, JavaType javaType) {
        return null;
    }

    public Object findDeserializationConverter(fd1 fd1Var) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationKeyType(fd1 fd1Var, JavaType javaType) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationType(fd1 fd1Var, JavaType javaType) {
        return null;
    }

    public Object findDeserializer(fd1 fd1Var) {
        return null;
    }

    @Deprecated
    public String findEnumValue(Enum<?> r1) {
        return r1.name();
    }

    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return strArr;
    }

    public Object findFilterId(fd1 fd1Var) {
        return null;
    }

    public JsonFormat.Value findFormat(fd1 fd1Var) {
        return JsonFormat.Value.empty();
    }

    @Deprecated
    public Boolean findIgnoreUnknownProperties(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        return null;
    }

    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        Object objFindInjectableValueId = findInjectableValueId(annotatedMember);
        if (objFindInjectableValueId != null) {
            return JacksonInject.Value.forId(objFindInjectableValueId);
        }
        return null;
    }

    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findKeyDeserializer(fd1 fd1Var) {
        return null;
    }

    public Object findKeySerializer(fd1 fd1Var) {
        return null;
    }

    public Boolean findMergeInfo(fd1 fd1Var) {
        return null;
    }

    public PropertyName findNameForDeserialization(fd1 fd1Var) {
        return null;
    }

    public PropertyName findNameForSerialization(fd1 fd1Var) {
        return null;
    }

    public Object findNamingStrategy(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public Object findNullSerializer(fd1 fd1Var) {
        return null;
    }

    public z3h findObjectIdInfo(fd1 fd1Var) {
        return null;
    }

    public z3h findObjectReferenceInfo(fd1 fd1Var, z3h z3hVar) {
        return z3hVar;
    }

    public Class<?> findPOJOBuilder(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public mtd.a findPOJOBuilderConfig(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    @Deprecated
    public String[] findPropertiesToIgnore(fd1 fd1Var) {
        return null;
    }

    public JsonProperty.Access findPropertyAccess(fd1 fd1Var) {
        return null;
    }

    public List<PropertyName> findPropertyAliases(fd1 fd1Var) {
        return null;
    }

    public c5q<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public String findPropertyDefaultValue(fd1 fd1Var) {
        return null;
    }

    public String findPropertyDescription(fd1 fd1Var) {
        return null;
    }

    public JsonIgnoreProperties.Value findPropertyIgnorals(fd1 fd1Var) {
        return JsonIgnoreProperties.Value.empty();
    }

    public JsonInclude.Value findPropertyInclusion(fd1 fd1Var) {
        return JsonInclude.Value.empty();
    }

    public Integer findPropertyIndex(fd1 fd1Var) {
        return null;
    }

    public c5q<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        return null;
    }

    public PropertyName findRootName(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationContentType(fd1 fd1Var, JavaType javaType) {
        return null;
    }

    public Object findSerializationConverter(fd1 fd1Var) {
        return null;
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusion(fd1 fd1Var, JsonInclude.Include include) {
        return include;
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusionForContent(fd1 fd1Var, JsonInclude.Include include) {
        return include;
    }

    @Deprecated
    public Class<?> findSerializationKeyType(fd1 fd1Var, JavaType javaType) {
        return null;
    }

    public String[] findSerializationPropertyOrder(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public Boolean findSerializationSortAlphabetically(fd1 fd1Var) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationType(fd1 fd1Var) {
        return null;
    }

    public JsonSerialize.Typing findSerializationTyping(fd1 fd1Var) {
        return null;
    }

    public Object findSerializer(fd1 fd1Var) {
        return null;
    }

    public JsonSetter.Value findSetterInfo(fd1 fd1Var) {
        return JsonSetter.Value.empty();
    }

    public List<NamedType> findSubtypes(fd1 fd1Var) {
        return null;
    }

    public String findTypeName(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public c5q<?> findTypeResolver(MapperConfig<?> mapperConfig, com.fasterxml.jackson.databind.introspect.a aVar, JavaType javaType) {
        return null;
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findValueInstantiator(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public Class<?>[] findViews(fd1 fd1Var) {
        return null;
    }

    public PropertyName findWrapperName(fd1 fd1Var) {
        return null;
    }

    public Boolean hasAnyGetter(fd1 fd1Var) {
        if ((fd1Var instanceof AnnotatedMethod) && hasAnyGetterAnnotation((AnnotatedMethod) fd1Var)) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public Boolean hasAnySetter(fd1 fd1Var) {
        return null;
    }

    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public Boolean hasAsValue(fd1 fd1Var) {
        if ((fd1Var instanceof AnnotatedMethod) && hasAsValueAnnotation((AnnotatedMethod) fd1Var)) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        return false;
    }

    @Deprecated
    public boolean hasCreatorAnnotation(fd1 fd1Var) {
        return false;
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return false;
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        return null;
    }

    public boolean isAnnotationBundle(Annotation annotation) {
        return false;
    }

    public Boolean isIgnorableType(com.fasterxml.jackson.databind.introspect.a aVar) {
        return null;
    }

    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return null;
    }

    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, fd1 fd1Var, JavaType javaType) throws JsonMappingException {
        return javaType;
    }

    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, fd1 fd1Var, JavaType javaType) throws JsonMappingException {
        return javaType;
    }

    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        return null;
    }

    public abstract Version version();

    public Collection<AnnotationIntrospector> allIntrospectors(Collection<AnnotationIntrospector> collection) {
        collection.add(this);
        return collection;
    }

    @Deprecated
    public String[] findPropertiesToIgnore(fd1 fd1Var, boolean z) {
        return null;
    }
}
