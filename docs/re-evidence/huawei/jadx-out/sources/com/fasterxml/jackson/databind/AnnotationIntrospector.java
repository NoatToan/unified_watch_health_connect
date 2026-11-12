package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.acj;
import defpackage.ack;
import defpackage.aco;
import defpackage.acs;
import defpackage.acv;
import defpackage.adg;
import defpackage.aez;
import defpackage.wu;
import defpackage.ym;
import defpackage.ys;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AnnotationIntrospector implements Versioned, Serializable {
    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, ack ackVar, List<aez> list) {
    }

    public VisibilityChecker<?> findAutoDetectVisibility(ack ackVar, VisibilityChecker<?> visibilityChecker) {
        return visibilityChecker;
    }

    public String findClassDescription(ack ackVar) {
        return null;
    }

    public Object findContentDeserializer(Annotated annotated) {
        return null;
    }

    public Object findContentSerializer(Annotated annotated) {
        return null;
    }

    @Deprecated
    public JsonCreator.Mode findCreatorBinding(Annotated annotated) {
        return null;
    }

    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return null;
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationContentType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public Object findDeserializationConverter(Annotated annotated) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationKeyType(Annotated annotated, JavaType javaType) {
        return null;
    }

    @Deprecated
    public Class<?> findDeserializationType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public Object findDeserializer(Annotated annotated) {
        return null;
    }

    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
    }

    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return strArr;
    }

    public Object findFilterId(Annotated annotated) {
        return null;
    }

    @Deprecated
    public Boolean findIgnoreUnknownProperties(ack ackVar) {
        return null;
    }

    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findKeyDeserializer(Annotated annotated) {
        return null;
    }

    public Object findKeySerializer(Annotated annotated) {
        return null;
    }

    public Boolean findMergeInfo(Annotated annotated) {
        return null;
    }

    public ys findNameForDeserialization(Annotated annotated) {
        return null;
    }

    public ys findNameForSerialization(Annotated annotated) {
        return null;
    }

    public Object findNamingStrategy(ack ackVar) {
        return null;
    }

    public Object findNullSerializer(Annotated annotated) {
        return null;
    }

    public acv findObjectIdInfo(Annotated annotated) {
        return null;
    }

    public acv findObjectReferenceInfo(Annotated annotated, acv acvVar) {
        return acvVar;
    }

    public Class<?> findPOJOBuilder(ack ackVar) {
        return null;
    }

    public JsonPOJOBuilder.e findPOJOBuilderConfig(ack ackVar) {
        return null;
    }

    @Deprecated
    public String[] findPropertiesToIgnore(Annotated annotated, boolean z) {
        return null;
    }

    public JsonProperty.Access findPropertyAccess(Annotated annotated) {
        return null;
    }

    public List<ys> findPropertyAliases(Annotated annotated) {
        return null;
    }

    public TypeResolverBuilder<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public String findPropertyDefaultValue(Annotated annotated) {
        return null;
    }

    public String findPropertyDescription(Annotated annotated) {
        return null;
    }

    public Integer findPropertyIndex(Annotated annotated) {
        return null;
    }

    public TypeResolverBuilder<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        return null;
    }

    public ys findRenameByField(MapperConfig<?> mapperConfig, acj acjVar, ys ysVar) {
        return null;
    }

    public ys findRootName(ack ackVar) {
        return null;
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationContentType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public Object findSerializationConverter(Annotated annotated) {
        return null;
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusion(Annotated annotated, JsonInclude.Include include) {
        return include;
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusionForContent(Annotated annotated, JsonInclude.Include include) {
        return include;
    }

    @Deprecated
    public Class<?> findSerializationKeyType(Annotated annotated, JavaType javaType) {
        return null;
    }

    public String[] findSerializationPropertyOrder(ack ackVar) {
        return null;
    }

    public Boolean findSerializationSortAlphabetically(Annotated annotated) {
        return null;
    }

    @Deprecated
    public Class<?> findSerializationType(Annotated annotated) {
        return null;
    }

    public JsonSerialize.Typing findSerializationTyping(Annotated annotated) {
        return null;
    }

    public Object findSerializer(Annotated annotated) {
        return null;
    }

    public List<adg> findSubtypes(Annotated annotated) {
        return null;
    }

    public String findTypeName(ack ackVar) {
        return null;
    }

    public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> mapperConfig, ack ackVar, JavaType javaType) {
        return null;
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object findValueInstantiator(ack ackVar) {
        return null;
    }

    public Class<?>[] findViews(Annotated annotated) {
        return null;
    }

    public ys findWrapperName(Annotated annotated) {
        return null;
    }

    @Deprecated
    public boolean hasAnyGetterAnnotation(aco acoVar) {
        return false;
    }

    public Boolean hasAnySetter(Annotated annotated) {
        return null;
    }

    @Deprecated
    public boolean hasAnySetterAnnotation(aco acoVar) {
        return false;
    }

    public Boolean hasAsKey(MapperConfig<?> mapperConfig, Annotated annotated) {
        return null;
    }

    @Deprecated
    public boolean hasAsValueAnnotation(aco acoVar) {
        return false;
    }

    @Deprecated
    public boolean hasCreatorAnnotation(Annotated annotated) {
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

    public Boolean isIgnorableType(ack ackVar) {
        return null;
    }

    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return null;
    }

    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws ym {
        return javaType;
    }

    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws ym {
        return javaType;
    }

    public aco resolveSetterConflict(MapperConfig<?> mapperConfig, aco acoVar, aco acoVar2) {
        return null;
    }

    @Override // com.fasterxml.jackson.core.Versioned
    public abstract wu version();

    public static class ReferenceProperty {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Type f4088c;
        private final String e;

        public enum Type {
            MANAGED_REFERENCE,
            BACK_REFERENCE
        }

        public ReferenceProperty(Type type, String str) {
            this.f4088c = type;
            this.e = str;
        }

        public static ReferenceProperty a(String str) {
            return new ReferenceProperty(Type.MANAGED_REFERENCE, str);
        }

        public static ReferenceProperty d(String str) {
            return new ReferenceProperty(Type.BACK_REFERENCE, str);
        }

        public String b() {
            return this.e;
        }

        public boolean d() {
            return this.f4088c == Type.MANAGED_REFERENCE;
        }

        public boolean e() {
            return this.f4088c == Type.BACK_REFERENCE;
        }
    }

    public static AnnotationIntrospector nopInstance() {
        return NopAnnotationIntrospector.instance;
    }

    public static AnnotationIntrospector pair(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        return new acs(annotationIntrospector, annotationIntrospector2);
    }

    public Collection<AnnotationIntrospector> allIntrospectors() {
        return Collections.singletonList(this);
    }

    public Collection<AnnotationIntrospector> allIntrospectors(Collection<AnnotationIntrospector> collection) {
        collection.add(this);
        return collection;
    }

    public JsonIgnoreProperties.b findPropertyIgnoralByName(MapperConfig<?> mapperConfig, Annotated annotated) {
        return findPropertyIgnorals(annotated);
    }

    public JsonIncludeProperties.b findPropertyInclusionByName(MapperConfig<?> mapperConfig, Annotated annotated) {
        return JsonIncludeProperties.b.d();
    }

    @Deprecated
    public JsonIgnoreProperties.b findPropertyIgnorals(Annotated annotated) {
        return JsonIgnoreProperties.b.c();
    }

    public JacksonInject.b findInjectableValue(AnnotatedMember annotatedMember) {
        Object objFindInjectableValueId = findInjectableValueId(annotatedMember);
        if (objFindInjectableValueId != null) {
            return JacksonInject.b.d(objFindInjectableValueId);
        }
        return null;
    }

    public JsonFormat.c findFormat(Annotated annotated) {
        return JsonFormat.c.e();
    }

    public JsonInclude.b findPropertyInclusion(Annotated annotated) {
        return JsonInclude.b.e();
    }

    public Boolean hasAsValue(Annotated annotated) {
        return ((annotated instanceof aco) && hasAsValueAnnotation((aco) annotated)) ? true : null;
    }

    public Boolean hasAnyGetter(Annotated annotated) {
        return ((annotated instanceof aco) && hasAnyGetterAnnotation((aco) annotated)) ? true : null;
    }

    @Deprecated
    public String findEnumValue(Enum<?> r1) {
        return r1.name();
    }

    public JsonSetter.e findSetterInfo(Annotated annotated) {
        return JsonSetter.e.c();
    }

    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, Annotated annotated) {
        if (!hasCreatorAnnotation(annotated)) {
            return null;
        }
        JsonCreator.Mode modeFindCreatorBinding = findCreatorBinding(annotated);
        return modeFindCreatorBinding == null ? JsonCreator.Mode.DEFAULT : modeFindCreatorBinding;
    }

    protected <A extends Annotation> A _findAnnotation(Annotated annotated, Class<A> cls) {
        return (A) annotated.getAnnotation(cls);
    }

    protected boolean _hasAnnotation(Annotated annotated, Class<? extends Annotation> cls) {
        return annotated.hasAnnotation(cls);
    }

    protected boolean _hasOneOf(Annotated annotated, Class<? extends Annotation>[] clsArr) {
        return annotated.hasOneOf(clsArr);
    }
}
