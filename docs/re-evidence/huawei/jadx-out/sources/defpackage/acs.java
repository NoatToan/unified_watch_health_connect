package defpackage;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class acs extends AnnotationIntrospector implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AnnotationIntrospector f269a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final AnnotationIntrospector f270c;

    public acs(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this.f270c = annotationIntrospector;
        this.f269a = annotationIntrospector2;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.core.Versioned
    public wu version() {
        return this.f270c.version();
    }

    public static AnnotationIntrospector a(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        if (annotationIntrospector == null) {
            return annotationIntrospector2;
        }
        return annotationIntrospector2 == null ? annotationIntrospector : new acs(annotationIntrospector, annotationIntrospector2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Collection<AnnotationIntrospector> allIntrospectors() {
        return allIntrospectors(new ArrayList());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Collection<AnnotationIntrospector> allIntrospectors(Collection<AnnotationIntrospector> collection) {
        this.f270c.allIntrospectors(collection);
        this.f269a.allIntrospectors(collection);
        return collection;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean isAnnotationBundle(Annotation annotation) {
        return this.f270c.isAnnotationBundle(annotation) || this.f269a.isAnnotationBundle(annotation);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public ys findRootName(ack ackVar) {
        ys ysVarFindRootName;
        ys ysVarFindRootName2 = this.f270c.findRootName(ackVar);
        if (ysVarFindRootName2 == null) {
            return this.f269a.findRootName(ackVar);
        }
        return (ysVarFindRootName2.c() || (ysVarFindRootName = this.f269a.findRootName(ackVar)) == null) ? ysVarFindRootName2 : ysVarFindRootName;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIgnoreProperties.b findPropertyIgnoralByName(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonIgnoreProperties.b bVarFindPropertyIgnoralByName = this.f269a.findPropertyIgnoralByName(mapperConfig, annotated);
        JsonIgnoreProperties.b bVarFindPropertyIgnoralByName2 = this.f270c.findPropertyIgnoralByName(mapperConfig, annotated);
        return bVarFindPropertyIgnoralByName == null ? bVarFindPropertyIgnoralByName2 : bVarFindPropertyIgnoralByName.c(bVarFindPropertyIgnoralByName2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIncludeProperties.b findPropertyInclusionByName(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonIncludeProperties.b bVarFindPropertyInclusionByName = this.f269a.findPropertyInclusionByName(mapperConfig, annotated);
        JsonIncludeProperties.b bVarFindPropertyInclusionByName2 = this.f270c.findPropertyInclusionByName(mapperConfig, annotated);
        return bVarFindPropertyInclusionByName == null ? bVarFindPropertyInclusionByName2 : bVarFindPropertyInclusionByName.a(bVarFindPropertyInclusionByName2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isIgnorableType(ack ackVar) {
        Boolean boolIsIgnorableType = this.f270c.isIgnorableType(ackVar);
        return boolIsIgnorableType == null ? this.f269a.isIgnorableType(ackVar) : boolIsIgnorableType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findFilterId(Annotated annotated) {
        Object objFindFilterId = this.f270c.findFilterId(annotated);
        return objFindFilterId == null ? this.f269a.findFilterId(annotated) : objFindFilterId;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNamingStrategy(ack ackVar) {
        Object objFindNamingStrategy = this.f270c.findNamingStrategy(ackVar);
        return objFindNamingStrategy == null ? this.f269a.findNamingStrategy(ackVar) : objFindNamingStrategy;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findClassDescription(ack ackVar) {
        String strFindClassDescription = this.f270c.findClassDescription(ackVar);
        return (strFindClassDescription == null || strFindClassDescription.isEmpty()) ? this.f269a.findClassDescription(ackVar) : strFindClassDescription;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public String[] findPropertiesToIgnore(Annotated annotated, boolean z) {
        String[] strArrFindPropertiesToIgnore = this.f270c.findPropertiesToIgnore(annotated, z);
        return strArrFindPropertiesToIgnore == null ? this.f269a.findPropertiesToIgnore(annotated, z) : strArrFindPropertiesToIgnore;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Boolean findIgnoreUnknownProperties(ack ackVar) {
        Boolean boolFindIgnoreUnknownProperties = this.f270c.findIgnoreUnknownProperties(ackVar);
        return boolFindIgnoreUnknownProperties == null ? this.f269a.findIgnoreUnknownProperties(ackVar) : boolFindIgnoreUnknownProperties;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonIgnoreProperties.b findPropertyIgnorals(Annotated annotated) {
        JsonIgnoreProperties.b bVarFindPropertyIgnorals = this.f269a.findPropertyIgnorals(annotated);
        JsonIgnoreProperties.b bVarFindPropertyIgnorals2 = this.f270c.findPropertyIgnorals(annotated);
        return bVarFindPropertyIgnorals == null ? bVarFindPropertyIgnorals2 : bVarFindPropertyIgnorals.c(bVarFindPropertyIgnorals2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public VisibilityChecker<?> findAutoDetectVisibility(ack ackVar, VisibilityChecker<?> visibilityChecker) {
        return this.f270c.findAutoDetectVisibility(ackVar, this.f269a.findAutoDetectVisibility(ackVar, visibilityChecker));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> mapperConfig, ack ackVar, JavaType javaType) {
        TypeResolverBuilder<?> typeResolverBuilderFindTypeResolver = this.f270c.findTypeResolver(mapperConfig, ackVar, javaType);
        return typeResolverBuilderFindTypeResolver == null ? this.f269a.findTypeResolver(mapperConfig, ackVar, javaType) : typeResolverBuilderFindTypeResolver;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public TypeResolverBuilder<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        TypeResolverBuilder<?> typeResolverBuilderFindPropertyTypeResolver = this.f270c.findPropertyTypeResolver(mapperConfig, annotatedMember, javaType);
        return typeResolverBuilderFindPropertyTypeResolver == null ? this.f269a.findPropertyTypeResolver(mapperConfig, annotatedMember, javaType) : typeResolverBuilderFindPropertyTypeResolver;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public TypeResolverBuilder<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        TypeResolverBuilder<?> typeResolverBuilderFindPropertyContentTypeResolver = this.f270c.findPropertyContentTypeResolver(mapperConfig, annotatedMember, javaType);
        return typeResolverBuilderFindPropertyContentTypeResolver == null ? this.f269a.findPropertyContentTypeResolver(mapperConfig, annotatedMember, javaType) : typeResolverBuilderFindPropertyContentTypeResolver;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<adg> findSubtypes(Annotated annotated) {
        List<adg> listFindSubtypes = this.f270c.findSubtypes(annotated);
        List<adg> listFindSubtypes2 = this.f269a.findSubtypes(annotated);
        if (listFindSubtypes == null || listFindSubtypes.isEmpty()) {
            return listFindSubtypes2;
        }
        if (listFindSubtypes2 == null || listFindSubtypes2.isEmpty()) {
            return listFindSubtypes;
        }
        ArrayList arrayList = new ArrayList(listFindSubtypes.size() + listFindSubtypes2.size());
        arrayList.addAll(listFindSubtypes);
        arrayList.addAll(listFindSubtypes2);
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findTypeName(ack ackVar) {
        String strFindTypeName = this.f270c.findTypeName(ackVar);
        return (strFindTypeName == null || strFindTypeName.isEmpty()) ? this.f269a.findTypeName(ackVar) : strFindTypeName;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        AnnotationIntrospector.ReferenceProperty referencePropertyFindReferenceType = this.f270c.findReferenceType(annotatedMember);
        return referencePropertyFindReferenceType == null ? this.f269a.findReferenceType(annotatedMember) : referencePropertyFindReferenceType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        NameTransformer nameTransformerFindUnwrappingNameTransformer = this.f270c.findUnwrappingNameTransformer(annotatedMember);
        return nameTransformerFindUnwrappingNameTransformer == null ? this.f269a.findUnwrappingNameTransformer(annotatedMember) : nameTransformerFindUnwrappingNameTransformer;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JacksonInject.b findInjectableValue(AnnotatedMember annotatedMember) {
        JacksonInject.b bVarFindInjectableValue;
        JacksonInject.b bVarFindInjectableValue2 = this.f270c.findInjectableValue(annotatedMember);
        if ((bVarFindInjectableValue2 == null || bVarFindInjectableValue2.e() == null) && (bVarFindInjectableValue = this.f269a.findInjectableValue(annotatedMember)) != null) {
            return bVarFindInjectableValue2 == null ? bVarFindInjectableValue : bVarFindInjectableValue2.e(bVarFindInjectableValue.e());
        }
        return bVarFindInjectableValue2;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return this.f270c.hasIgnoreMarker(annotatedMember) || this.f269a.hasIgnoreMarker(annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        Boolean boolHasRequiredMarker = this.f270c.hasRequiredMarker(annotatedMember);
        return boolHasRequiredMarker == null ? this.f269a.hasRequiredMarker(annotatedMember) : boolHasRequiredMarker;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        Object objFindInjectableValueId = this.f270c.findInjectableValueId(annotatedMember);
        return objFindInjectableValueId == null ? this.f269a.findInjectableValueId(annotatedMember) : objFindInjectableValueId;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializer(Annotated annotated) {
        Object objFindSerializer = this.f270c.findSerializer(annotated);
        return a(objFindSerializer, JsonSerializer.None.class) ? objFindSerializer : e(this.f269a.findSerializer(annotated), JsonSerializer.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeySerializer(Annotated annotated) {
        Object objFindKeySerializer = this.f270c.findKeySerializer(annotated);
        return a(objFindKeySerializer, JsonSerializer.None.class) ? objFindKeySerializer : e(this.f269a.findKeySerializer(annotated), JsonSerializer.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentSerializer(Annotated annotated) {
        Object objFindContentSerializer = this.f270c.findContentSerializer(annotated);
        return a(objFindContentSerializer, JsonSerializer.None.class) ? objFindContentSerializer : e(this.f269a.findContentSerializer(annotated), JsonSerializer.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNullSerializer(Annotated annotated) {
        Object objFindNullSerializer = this.f270c.findNullSerializer(annotated);
        return a(objFindNullSerializer, JsonSerializer.None.class) ? objFindNullSerializer : e(this.f269a.findNullSerializer(annotated), JsonSerializer.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonInclude.Include findSerializationInclusion(Annotated annotated, JsonInclude.Include include) {
        return this.f270c.findSerializationInclusion(annotated, this.f269a.findSerializationInclusion(annotated, include));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonInclude.Include findSerializationInclusionForContent(Annotated annotated, JsonInclude.Include include) {
        return this.f270c.findSerializationInclusionForContent(annotated, this.f269a.findSerializationInclusionForContent(annotated, include));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonInclude.b findPropertyInclusion(Annotated annotated) {
        JsonInclude.b bVarFindPropertyInclusion = this.f269a.findPropertyInclusion(annotated);
        JsonInclude.b bVarFindPropertyInclusion2 = this.f270c.findPropertyInclusion(annotated);
        return bVarFindPropertyInclusion == null ? bVarFindPropertyInclusion2 : bVarFindPropertyInclusion.b(bVarFindPropertyInclusion2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSerialize.Typing findSerializationTyping(Annotated annotated) {
        JsonSerialize.Typing typingFindSerializationTyping = this.f270c.findSerializationTyping(annotated);
        return typingFindSerializationTyping == null ? this.f269a.findSerializationTyping(annotated) : typingFindSerializationTyping;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationConverter(Annotated annotated) {
        Object objFindSerializationConverter = this.f270c.findSerializationConverter(annotated);
        return objFindSerializationConverter == null ? this.f269a.findSerializationConverter(annotated) : objFindSerializationConverter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        Object objFindSerializationContentConverter = this.f270c.findSerializationContentConverter(annotatedMember);
        return objFindSerializationContentConverter == null ? this.f269a.findSerializationContentConverter(annotatedMember) : objFindSerializationContentConverter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?>[] findViews(Annotated annotated) {
        Class<?>[] clsArrFindViews = this.f270c.findViews(annotated);
        return clsArrFindViews == null ? this.f269a.findViews(annotated) : clsArrFindViews;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        Boolean boolIsTypeId = this.f270c.isTypeId(annotatedMember);
        return boolIsTypeId == null ? this.f269a.isTypeId(annotatedMember) : boolIsTypeId;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public acv findObjectIdInfo(Annotated annotated) {
        acv acvVarFindObjectIdInfo = this.f270c.findObjectIdInfo(annotated);
        return acvVarFindObjectIdInfo == null ? this.f269a.findObjectIdInfo(annotated) : acvVarFindObjectIdInfo;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public acv findObjectReferenceInfo(Annotated annotated, acv acvVar) {
        return this.f270c.findObjectReferenceInfo(annotated, this.f269a.findObjectReferenceInfo(annotated, acvVar));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonFormat.c findFormat(Annotated annotated) {
        JsonFormat.c cVarFindFormat = this.f270c.findFormat(annotated);
        JsonFormat.c cVarFindFormat2 = this.f269a.findFormat(annotated);
        return cVarFindFormat2 == null ? cVarFindFormat : cVarFindFormat2.a(cVarFindFormat);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public ys findWrapperName(Annotated annotated) {
        ys ysVarFindWrapperName;
        ys ysVarFindWrapperName2 = this.f270c.findWrapperName(annotated);
        if (ysVarFindWrapperName2 == null) {
            return this.f269a.findWrapperName(annotated);
        }
        return (ysVarFindWrapperName2 != ys.e || (ysVarFindWrapperName = this.f269a.findWrapperName(annotated)) == null) ? ysVarFindWrapperName2 : ysVarFindWrapperName;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDefaultValue(Annotated annotated) {
        String strFindPropertyDefaultValue = this.f270c.findPropertyDefaultValue(annotated);
        return (strFindPropertyDefaultValue == null || strFindPropertyDefaultValue.isEmpty()) ? this.f269a.findPropertyDefaultValue(annotated) : strFindPropertyDefaultValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDescription(Annotated annotated) {
        String strFindPropertyDescription = this.f270c.findPropertyDescription(annotated);
        return strFindPropertyDescription == null ? this.f269a.findPropertyDescription(annotated) : strFindPropertyDescription;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Integer findPropertyIndex(Annotated annotated) {
        Integer numFindPropertyIndex = this.f270c.findPropertyIndex(annotated);
        return numFindPropertyIndex == null ? this.f269a.findPropertyIndex(annotated) : numFindPropertyIndex;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        String strFindImplicitPropertyName = this.f270c.findImplicitPropertyName(annotatedMember);
        return strFindImplicitPropertyName == null ? this.f269a.findImplicitPropertyName(annotatedMember) : strFindImplicitPropertyName;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<ys> findPropertyAliases(Annotated annotated) {
        List<ys> listFindPropertyAliases = this.f270c.findPropertyAliases(annotated);
        return listFindPropertyAliases == null ? this.f269a.findPropertyAliases(annotated) : listFindPropertyAliases;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonProperty.Access findPropertyAccess(Annotated annotated) {
        JsonProperty.Access accessFindPropertyAccess = this.f270c.findPropertyAccess(annotated);
        if (accessFindPropertyAccess != null && accessFindPropertyAccess != JsonProperty.Access.AUTO) {
            return accessFindPropertyAccess;
        }
        JsonProperty.Access accessFindPropertyAccess2 = this.f269a.findPropertyAccess(annotated);
        return accessFindPropertyAccess2 != null ? accessFindPropertyAccess2 : JsonProperty.Access.AUTO;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public aco resolveSetterConflict(MapperConfig<?> mapperConfig, aco acoVar, aco acoVar2) {
        aco acoVarResolveSetterConflict = this.f270c.resolveSetterConflict(mapperConfig, acoVar, acoVar2);
        return acoVarResolveSetterConflict == null ? this.f269a.resolveSetterConflict(mapperConfig, acoVar, acoVar2) : acoVarResolveSetterConflict;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public ys findRenameByField(MapperConfig<?> mapperConfig, acj acjVar, ys ysVar) {
        ys ysVarFindRenameByField = this.f269a.findRenameByField(mapperConfig, acjVar, ysVar);
        return ysVarFindRenameByField == null ? this.f270c.findRenameByField(mapperConfig, acjVar, ysVar) : ysVarFindRenameByField;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws ym {
        return this.f270c.refineSerializationType(mapperConfig, annotated, this.f269a.refineSerializationType(mapperConfig, annotated, javaType));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationType(Annotated annotated) {
        Class<?> clsFindSerializationType = this.f270c.findSerializationType(annotated);
        return clsFindSerializationType == null ? this.f269a.findSerializationType(annotated) : clsFindSerializationType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationKeyType(Annotated annotated, JavaType javaType) {
        Class<?> clsFindSerializationKeyType = this.f270c.findSerializationKeyType(annotated, javaType);
        return clsFindSerializationKeyType == null ? this.f269a.findSerializationKeyType(annotated, javaType) : clsFindSerializationKeyType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationContentType(Annotated annotated, JavaType javaType) {
        Class<?> clsFindSerializationContentType = this.f270c.findSerializationContentType(annotated, javaType);
        return clsFindSerializationContentType == null ? this.f269a.findSerializationContentType(annotated, javaType) : clsFindSerializationContentType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findSerializationPropertyOrder(ack ackVar) {
        String[] strArrFindSerializationPropertyOrder = this.f270c.findSerializationPropertyOrder(ackVar);
        return strArrFindSerializationPropertyOrder == null ? this.f269a.findSerializationPropertyOrder(ackVar) : strArrFindSerializationPropertyOrder;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findSerializationSortAlphabetically(Annotated annotated) {
        Boolean boolFindSerializationSortAlphabetically = this.f270c.findSerializationSortAlphabetically(annotated);
        return boolFindSerializationSortAlphabetically == null ? this.f269a.findSerializationSortAlphabetically(annotated) : boolFindSerializationSortAlphabetically;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, ack ackVar, List<aez> list) {
        this.f270c.findAndAddVirtualProperties(mapperConfig, ackVar, list);
        this.f269a.findAndAddVirtualProperties(mapperConfig, ackVar, list);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public ys findNameForSerialization(Annotated annotated) {
        ys ysVarFindNameForSerialization;
        ys ysVarFindNameForSerialization2 = this.f270c.findNameForSerialization(annotated);
        if (ysVarFindNameForSerialization2 == null) {
            return this.f269a.findNameForSerialization(annotated);
        }
        return (ysVarFindNameForSerialization2 != ys.e || (ysVarFindNameForSerialization = this.f269a.findNameForSerialization(annotated)) == null) ? ysVarFindNameForSerialization2 : ysVarFindNameForSerialization;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAsKey(MapperConfig<?> mapperConfig, Annotated annotated) {
        Boolean boolHasAsKey = this.f270c.hasAsKey(mapperConfig, annotated);
        return boolHasAsKey == null ? this.f269a.hasAsKey(mapperConfig, annotated) : boolHasAsKey;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAsValue(Annotated annotated) {
        Boolean boolHasAsValue = this.f270c.hasAsValue(annotated);
        return boolHasAsValue == null ? this.f269a.hasAsValue(annotated) : boolHasAsValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnyGetter(Annotated annotated) {
        Boolean boolHasAnyGetter = this.f270c.hasAnyGetter(annotated);
        return boolHasAnyGetter == null ? this.f269a.hasAnyGetter(annotated) : boolHasAnyGetter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return this.f270c.findEnumValues(cls, enumArr, this.f269a.findEnumValues(cls, enumArr, strArr));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        this.f269a.findEnumAliases(cls, enumArr, strArr);
        this.f270c.findEnumAliases(cls, enumArr, strArr);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        Enum<?> enumFindDefaultEnumValue = this.f270c.findDefaultEnumValue(cls);
        return enumFindDefaultEnumValue == null ? this.f269a.findDefaultEnumValue(cls) : enumFindDefaultEnumValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public String findEnumValue(Enum<?> r2) {
        String strFindEnumValue = this.f270c.findEnumValue(r2);
        return strFindEnumValue == null ? this.f269a.findEnumValue(r2) : strFindEnumValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAsValueAnnotation(aco acoVar) {
        return this.f270c.hasAsValueAnnotation(acoVar) || this.f269a.hasAsValueAnnotation(acoVar);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnyGetterAnnotation(aco acoVar) {
        return this.f270c.hasAnyGetterAnnotation(acoVar) || this.f269a.hasAnyGetterAnnotation(acoVar);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializer(Annotated annotated) {
        Object objFindDeserializer = this.f270c.findDeserializer(annotated);
        return a(objFindDeserializer, JsonDeserializer.None.class) ? objFindDeserializer : e(this.f269a.findDeserializer(annotated), JsonDeserializer.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeyDeserializer(Annotated annotated) {
        Object objFindKeyDeserializer = this.f270c.findKeyDeserializer(annotated);
        return a(objFindKeyDeserializer, KeyDeserializer.None.class) ? objFindKeyDeserializer : e(this.f269a.findKeyDeserializer(annotated), KeyDeserializer.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentDeserializer(Annotated annotated) {
        Object objFindContentDeserializer = this.f270c.findContentDeserializer(annotated);
        return a(objFindContentDeserializer, JsonDeserializer.None.class) ? objFindContentDeserializer : e(this.f269a.findContentDeserializer(annotated), JsonDeserializer.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationConverter(Annotated annotated) {
        Object objFindDeserializationConverter = this.f270c.findDeserializationConverter(annotated);
        return objFindDeserializationConverter == null ? this.f269a.findDeserializationConverter(annotated) : objFindDeserializationConverter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        Object objFindDeserializationContentConverter = this.f270c.findDeserializationContentConverter(annotatedMember);
        return objFindDeserializationContentConverter == null ? this.f269a.findDeserializationContentConverter(annotatedMember) : objFindDeserializationContentConverter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws ym {
        return this.f270c.refineDeserializationType(mapperConfig, annotated, this.f269a.refineDeserializationType(mapperConfig, annotated, javaType));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationType(Annotated annotated, JavaType javaType) {
        Class<?> clsFindDeserializationType = this.f270c.findDeserializationType(annotated, javaType);
        return clsFindDeserializationType != null ? clsFindDeserializationType : this.f269a.findDeserializationType(annotated, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationKeyType(Annotated annotated, JavaType javaType) {
        Class<?> clsFindDeserializationKeyType = this.f270c.findDeserializationKeyType(annotated, javaType);
        return clsFindDeserializationKeyType == null ? this.f269a.findDeserializationKeyType(annotated, javaType) : clsFindDeserializationKeyType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationContentType(Annotated annotated, JavaType javaType) {
        Class<?> clsFindDeserializationContentType = this.f270c.findDeserializationContentType(annotated, javaType);
        return clsFindDeserializationContentType == null ? this.f269a.findDeserializationContentType(annotated, javaType) : clsFindDeserializationContentType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findValueInstantiator(ack ackVar) {
        Object objFindValueInstantiator = this.f270c.findValueInstantiator(ackVar);
        return objFindValueInstantiator == null ? this.f269a.findValueInstantiator(ackVar) : objFindValueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?> findPOJOBuilder(ack ackVar) {
        Class<?> clsFindPOJOBuilder = this.f270c.findPOJOBuilder(ackVar);
        return clsFindPOJOBuilder == null ? this.f269a.findPOJOBuilder(ackVar) : clsFindPOJOBuilder;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonPOJOBuilder.e findPOJOBuilderConfig(ack ackVar) {
        JsonPOJOBuilder.e eVarFindPOJOBuilderConfig = this.f270c.findPOJOBuilderConfig(ackVar);
        return eVarFindPOJOBuilderConfig == null ? this.f269a.findPOJOBuilderConfig(ackVar) : eVarFindPOJOBuilderConfig;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public ys findNameForDeserialization(Annotated annotated) {
        ys ysVarFindNameForDeserialization;
        ys ysVarFindNameForDeserialization2 = this.f270c.findNameForDeserialization(annotated);
        if (ysVarFindNameForDeserialization2 == null) {
            return this.f269a.findNameForDeserialization(annotated);
        }
        return (ysVarFindNameForDeserialization2 != ys.e || (ysVarFindNameForDeserialization = this.f269a.findNameForDeserialization(annotated)) == null) ? ysVarFindNameForDeserialization2 : ysVarFindNameForDeserialization;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnySetter(Annotated annotated) {
        Boolean boolHasAnySetter = this.f270c.hasAnySetter(annotated);
        return boolHasAnySetter == null ? this.f269a.hasAnySetter(annotated) : boolHasAnySetter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSetter.e findSetterInfo(Annotated annotated) {
        JsonSetter.e eVarFindSetterInfo = this.f269a.findSetterInfo(annotated);
        JsonSetter.e eVarFindSetterInfo2 = this.f270c.findSetterInfo(annotated);
        return eVarFindSetterInfo == null ? eVarFindSetterInfo2 : eVarFindSetterInfo.b(eVarFindSetterInfo2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findMergeInfo(Annotated annotated) {
        Boolean boolFindMergeInfo = this.f270c.findMergeInfo(annotated);
        return boolFindMergeInfo == null ? this.f269a.findMergeInfo(annotated) : boolFindMergeInfo;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasCreatorAnnotation(Annotated annotated) {
        return this.f270c.hasCreatorAnnotation(annotated) || this.f269a.hasCreatorAnnotation(annotated);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonCreator.Mode findCreatorBinding(Annotated annotated) {
        JsonCreator.Mode modeFindCreatorBinding = this.f270c.findCreatorBinding(annotated);
        return modeFindCreatorBinding != null ? modeFindCreatorBinding : this.f269a.findCreatorBinding(annotated);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonCreator.Mode modeFindCreatorAnnotation = this.f270c.findCreatorAnnotation(mapperConfig, annotated);
        return modeFindCreatorAnnotation == null ? this.f269a.findCreatorAnnotation(mapperConfig, annotated) : modeFindCreatorAnnotation;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnySetterAnnotation(aco acoVar) {
        return this.f270c.hasAnySetterAnnotation(acoVar) || this.f269a.hasAnySetterAnnotation(acoVar);
    }

    protected boolean a(Object obj, Class<?> cls) {
        if (obj == null || obj == cls) {
            return false;
        }
        if (obj instanceof Class) {
            return !ahw.l((Class) obj);
        }
        return true;
    }

    protected Object e(Object obj, Class<?> cls) {
        if (obj == null || obj == cls) {
            return null;
        }
        if ((obj instanceof Class) && ahw.l((Class) obj)) {
            return null;
        }
        return obj;
    }
}
