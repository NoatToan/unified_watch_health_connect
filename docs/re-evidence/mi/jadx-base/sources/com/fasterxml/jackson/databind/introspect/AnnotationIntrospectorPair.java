package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.c5q;
import defpackage.esd;
import defpackage.eud;
import defpackage.fd1;
import defpackage.h04;
import defpackage.mtd;
import defpackage.vzd;
import defpackage.z3h;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AnnotationIntrospectorPair extends AnnotationIntrospector implements Serializable {
    private static final long serialVersionUID = 1;
    protected final AnnotationIntrospector _primary;
    protected final AnnotationIntrospector _secondary;

    public AnnotationIntrospectorPair(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._primary = annotationIntrospector;
        this._secondary = annotationIntrospector2;
    }

    public static AnnotationIntrospector create(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        if (annotationIntrospector == null) {
            return annotationIntrospector2;
        }
        return annotationIntrospector2 == null ? annotationIntrospector : new AnnotationIntrospectorPair(annotationIntrospector, annotationIntrospector2);
    }

    public Object _explicitClassOrOb(Object obj, Class<?> cls) {
        if (obj == null || obj == cls) {
            return null;
        }
        if ((obj instanceof Class) && h04.K((Class) obj)) {
            return null;
        }
        return obj;
    }

    public boolean _isExplicitClassOrOb(Object obj, Class<?> cls) {
        if (obj == null || obj == cls) {
            return false;
        }
        if (obj instanceof Class) {
            return !h04.K((Class) obj);
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Collection<AnnotationIntrospector> allIntrospectors() {
        return allIntrospectors(new ArrayList());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, a aVar, List<BeanPropertyWriter> list) {
        this._primary.findAndAddVirtualProperties(mapperConfig, aVar, list);
        this._secondary.findAndAddVirtualProperties(mapperConfig, aVar, list);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public VisibilityChecker<?> findAutoDetectVisibility(a aVar, VisibilityChecker<?> visibilityChecker) {
        return this._primary.findAutoDetectVisibility(aVar, this._secondary.findAutoDetectVisibility(aVar, visibilityChecker));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findClassDescription(a aVar) {
        String strFindClassDescription = this._primary.findClassDescription(aVar);
        return (strFindClassDescription == null || strFindClassDescription.isEmpty()) ? this._secondary.findClassDescription(aVar) : strFindClassDescription;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentDeserializer(fd1 fd1Var) {
        Object objFindContentDeserializer = this._primary.findContentDeserializer(fd1Var);
        return _isExplicitClassOrOb(objFindContentDeserializer, esd.a.class) ? objFindContentDeserializer : _explicitClassOrOb(this._secondary.findContentDeserializer(fd1Var), esd.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentSerializer(fd1 fd1Var) {
        Object objFindContentSerializer = this._primary.findContentSerializer(fd1Var);
        return _isExplicitClassOrOb(objFindContentSerializer, eud.a.class) ? objFindContentSerializer : _explicitClassOrOb(this._secondary.findContentSerializer(fd1Var), eud.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, fd1 fd1Var) {
        JsonCreator.Mode modeFindCreatorAnnotation = this._primary.findCreatorAnnotation(mapperConfig, fd1Var);
        return modeFindCreatorAnnotation == null ? this._secondary.findCreatorAnnotation(mapperConfig, fd1Var) : modeFindCreatorAnnotation;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonCreator.Mode findCreatorBinding(fd1 fd1Var) {
        JsonCreator.Mode modeFindCreatorBinding = this._primary.findCreatorBinding(fd1Var);
        return modeFindCreatorBinding != null ? modeFindCreatorBinding : this._secondary.findCreatorBinding(fd1Var);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        Enum<?> enumFindDefaultEnumValue = this._primary.findDefaultEnumValue(cls);
        return enumFindDefaultEnumValue == null ? this._secondary.findDefaultEnumValue(cls) : enumFindDefaultEnumValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        Object objFindDeserializationContentConverter = this._primary.findDeserializationContentConverter(annotatedMember);
        return objFindDeserializationContentConverter == null ? this._secondary.findDeserializationContentConverter(annotatedMember) : objFindDeserializationContentConverter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationContentType(fd1 fd1Var, JavaType javaType) {
        Class<?> clsFindDeserializationContentType = this._primary.findDeserializationContentType(fd1Var, javaType);
        return clsFindDeserializationContentType == null ? this._secondary.findDeserializationContentType(fd1Var, javaType) : clsFindDeserializationContentType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationConverter(fd1 fd1Var) {
        Object objFindDeserializationConverter = this._primary.findDeserializationConverter(fd1Var);
        return objFindDeserializationConverter == null ? this._secondary.findDeserializationConverter(fd1Var) : objFindDeserializationConverter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationKeyType(fd1 fd1Var, JavaType javaType) {
        Class<?> clsFindDeserializationKeyType = this._primary.findDeserializationKeyType(fd1Var, javaType);
        return clsFindDeserializationKeyType == null ? this._secondary.findDeserializationKeyType(fd1Var, javaType) : clsFindDeserializationKeyType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findDeserializationType(fd1 fd1Var, JavaType javaType) {
        Class<?> clsFindDeserializationType = this._primary.findDeserializationType(fd1Var, javaType);
        return clsFindDeserializationType != null ? clsFindDeserializationType : this._secondary.findDeserializationType(fd1Var, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializer(fd1 fd1Var) {
        Object objFindDeserializer = this._primary.findDeserializer(fd1Var);
        return _isExplicitClassOrOb(objFindDeserializer, esd.a.class) ? objFindDeserializer : _explicitClassOrOb(this._secondary.findDeserializer(fd1Var), esd.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public String findEnumValue(Enum<?> r2) {
        String strFindEnumValue = this._primary.findEnumValue(r2);
        return strFindEnumValue == null ? this._secondary.findEnumValue(r2) : strFindEnumValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return this._primary.findEnumValues(cls, enumArr, this._secondary.findEnumValues(cls, enumArr, strArr));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findFilterId(fd1 fd1Var) {
        Object objFindFilterId = this._primary.findFilterId(fd1Var);
        return objFindFilterId == null ? this._secondary.findFilterId(fd1Var) : objFindFilterId;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonFormat.Value findFormat(fd1 fd1Var) {
        JsonFormat.Value valueFindFormat = this._primary.findFormat(fd1Var);
        JsonFormat.Value valueFindFormat2 = this._secondary.findFormat(fd1Var);
        return valueFindFormat2 == null ? valueFindFormat : valueFindFormat2.withOverrides(valueFindFormat);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Boolean findIgnoreUnknownProperties(a aVar) {
        Boolean boolFindIgnoreUnknownProperties = this._primary.findIgnoreUnknownProperties(aVar);
        return boolFindIgnoreUnknownProperties == null ? this._secondary.findIgnoreUnknownProperties(aVar) : boolFindIgnoreUnknownProperties;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        String strFindImplicitPropertyName = this._primary.findImplicitPropertyName(annotatedMember);
        return strFindImplicitPropertyName == null ? this._secondary.findImplicitPropertyName(annotatedMember) : strFindImplicitPropertyName;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        JacksonInject.Value valueFindInjectableValue = this._primary.findInjectableValue(annotatedMember);
        return valueFindInjectableValue == null ? this._secondary.findInjectableValue(annotatedMember) : valueFindInjectableValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        Object objFindInjectableValueId = this._primary.findInjectableValueId(annotatedMember);
        return objFindInjectableValueId == null ? this._secondary.findInjectableValueId(annotatedMember) : objFindInjectableValueId;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeyDeserializer(fd1 fd1Var) {
        Object objFindKeyDeserializer = this._primary.findKeyDeserializer(fd1Var);
        return _isExplicitClassOrOb(objFindKeyDeserializer, vzd.a.class) ? objFindKeyDeserializer : _explicitClassOrOb(this._secondary.findKeyDeserializer(fd1Var), vzd.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeySerializer(fd1 fd1Var) {
        Object objFindKeySerializer = this._primary.findKeySerializer(fd1Var);
        return _isExplicitClassOrOb(objFindKeySerializer, eud.a.class) ? objFindKeySerializer : _explicitClassOrOb(this._secondary.findKeySerializer(fd1Var), eud.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findMergeInfo(fd1 fd1Var) {
        Boolean boolFindMergeInfo = this._primary.findMergeInfo(fd1Var);
        return boolFindMergeInfo == null ? this._secondary.findMergeInfo(fd1Var) : boolFindMergeInfo;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findNameForDeserialization(fd1 fd1Var) {
        PropertyName propertyNameFindNameForDeserialization;
        PropertyName propertyNameFindNameForDeserialization2 = this._primary.findNameForDeserialization(fd1Var);
        if (propertyNameFindNameForDeserialization2 == null) {
            return this._secondary.findNameForDeserialization(fd1Var);
        }
        return (propertyNameFindNameForDeserialization2 != PropertyName.USE_DEFAULT || (propertyNameFindNameForDeserialization = this._secondary.findNameForDeserialization(fd1Var)) == null) ? propertyNameFindNameForDeserialization2 : propertyNameFindNameForDeserialization;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findNameForSerialization(fd1 fd1Var) {
        PropertyName propertyNameFindNameForSerialization;
        PropertyName propertyNameFindNameForSerialization2 = this._primary.findNameForSerialization(fd1Var);
        if (propertyNameFindNameForSerialization2 == null) {
            return this._secondary.findNameForSerialization(fd1Var);
        }
        return (propertyNameFindNameForSerialization2 != PropertyName.USE_DEFAULT || (propertyNameFindNameForSerialization = this._secondary.findNameForSerialization(fd1Var)) == null) ? propertyNameFindNameForSerialization2 : propertyNameFindNameForSerialization;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNamingStrategy(a aVar) {
        Object objFindNamingStrategy = this._primary.findNamingStrategy(aVar);
        return objFindNamingStrategy == null ? this._secondary.findNamingStrategy(aVar) : objFindNamingStrategy;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNullSerializer(fd1 fd1Var) {
        Object objFindNullSerializer = this._primary.findNullSerializer(fd1Var);
        return _isExplicitClassOrOb(objFindNullSerializer, eud.a.class) ? objFindNullSerializer : _explicitClassOrOb(this._secondary.findNullSerializer(fd1Var), eud.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public z3h findObjectIdInfo(fd1 fd1Var) {
        z3h z3hVarFindObjectIdInfo = this._primary.findObjectIdInfo(fd1Var);
        return z3hVarFindObjectIdInfo == null ? this._secondary.findObjectIdInfo(fd1Var) : z3hVarFindObjectIdInfo;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public z3h findObjectReferenceInfo(fd1 fd1Var, z3h z3hVar) {
        return this._primary.findObjectReferenceInfo(fd1Var, this._secondary.findObjectReferenceInfo(fd1Var, z3hVar));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?> findPOJOBuilder(a aVar) {
        Class<?> clsFindPOJOBuilder = this._primary.findPOJOBuilder(aVar);
        return clsFindPOJOBuilder == null ? this._secondary.findPOJOBuilder(aVar) : clsFindPOJOBuilder;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public mtd.a findPOJOBuilderConfig(a aVar) {
        mtd.a aVarFindPOJOBuilderConfig = this._primary.findPOJOBuilderConfig(aVar);
        return aVarFindPOJOBuilderConfig == null ? this._secondary.findPOJOBuilderConfig(aVar) : aVarFindPOJOBuilderConfig;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public String[] findPropertiesToIgnore(fd1 fd1Var) {
        String[] strArrFindPropertiesToIgnore = this._primary.findPropertiesToIgnore(fd1Var);
        return strArrFindPropertiesToIgnore == null ? this._secondary.findPropertiesToIgnore(fd1Var) : strArrFindPropertiesToIgnore;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonProperty.Access findPropertyAccess(fd1 fd1Var) {
        JsonProperty.Access accessFindPropertyAccess = this._primary.findPropertyAccess(fd1Var);
        if (accessFindPropertyAccess != null && accessFindPropertyAccess != JsonProperty.Access.AUTO) {
            return accessFindPropertyAccess;
        }
        JsonProperty.Access accessFindPropertyAccess2 = this._secondary.findPropertyAccess(fd1Var);
        return accessFindPropertyAccess2 != null ? accessFindPropertyAccess2 : JsonProperty.Access.AUTO;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<PropertyName> findPropertyAliases(fd1 fd1Var) {
        List<PropertyName> listFindPropertyAliases = this._primary.findPropertyAliases(fd1Var);
        return listFindPropertyAliases == null ? this._secondary.findPropertyAliases(fd1Var) : listFindPropertyAliases;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public c5q<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        c5q<?> c5qVarFindPropertyContentTypeResolver = this._primary.findPropertyContentTypeResolver(mapperConfig, annotatedMember, javaType);
        return c5qVarFindPropertyContentTypeResolver == null ? this._secondary.findPropertyContentTypeResolver(mapperConfig, annotatedMember, javaType) : c5qVarFindPropertyContentTypeResolver;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDefaultValue(fd1 fd1Var) {
        String strFindPropertyDefaultValue = this._primary.findPropertyDefaultValue(fd1Var);
        return (strFindPropertyDefaultValue == null || strFindPropertyDefaultValue.isEmpty()) ? this._secondary.findPropertyDefaultValue(fd1Var) : strFindPropertyDefaultValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDescription(fd1 fd1Var) {
        String strFindPropertyDescription = this._primary.findPropertyDescription(fd1Var);
        return strFindPropertyDescription == null ? this._secondary.findPropertyDescription(fd1Var) : strFindPropertyDescription;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIgnoreProperties.Value findPropertyIgnorals(fd1 fd1Var) {
        JsonIgnoreProperties.Value valueFindPropertyIgnorals = this._secondary.findPropertyIgnorals(fd1Var);
        JsonIgnoreProperties.Value valueFindPropertyIgnorals2 = this._primary.findPropertyIgnorals(fd1Var);
        return valueFindPropertyIgnorals == null ? valueFindPropertyIgnorals2 : valueFindPropertyIgnorals.withOverrides(valueFindPropertyIgnorals2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonInclude.Value findPropertyInclusion(fd1 fd1Var) {
        JsonInclude.Value valueFindPropertyInclusion = this._secondary.findPropertyInclusion(fd1Var);
        JsonInclude.Value valueFindPropertyInclusion2 = this._primary.findPropertyInclusion(fd1Var);
        return valueFindPropertyInclusion == null ? valueFindPropertyInclusion2 : valueFindPropertyInclusion.withOverrides(valueFindPropertyInclusion2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Integer findPropertyIndex(fd1 fd1Var) {
        Integer numFindPropertyIndex = this._primary.findPropertyIndex(fd1Var);
        return numFindPropertyIndex == null ? this._secondary.findPropertyIndex(fd1Var) : numFindPropertyIndex;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public c5q<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        c5q<?> c5qVarFindPropertyTypeResolver = this._primary.findPropertyTypeResolver(mapperConfig, annotatedMember, javaType);
        return c5qVarFindPropertyTypeResolver == null ? this._secondary.findPropertyTypeResolver(mapperConfig, annotatedMember, javaType) : c5qVarFindPropertyTypeResolver;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        AnnotationIntrospector.ReferenceProperty referencePropertyFindReferenceType = this._primary.findReferenceType(annotatedMember);
        return referencePropertyFindReferenceType == null ? this._secondary.findReferenceType(annotatedMember) : referencePropertyFindReferenceType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findRootName(a aVar) {
        PropertyName propertyNameFindRootName;
        PropertyName propertyNameFindRootName2 = this._primary.findRootName(aVar);
        if (propertyNameFindRootName2 == null) {
            return this._secondary.findRootName(aVar);
        }
        return (propertyNameFindRootName2.hasSimpleName() || (propertyNameFindRootName = this._secondary.findRootName(aVar)) == null) ? propertyNameFindRootName2 : propertyNameFindRootName;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        Object objFindSerializationContentConverter = this._primary.findSerializationContentConverter(annotatedMember);
        return objFindSerializationContentConverter == null ? this._secondary.findSerializationContentConverter(annotatedMember) : objFindSerializationContentConverter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationContentType(fd1 fd1Var, JavaType javaType) {
        Class<?> clsFindSerializationContentType = this._primary.findSerializationContentType(fd1Var, javaType);
        return clsFindSerializationContentType == null ? this._secondary.findSerializationContentType(fd1Var, javaType) : clsFindSerializationContentType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationConverter(fd1 fd1Var) {
        Object objFindSerializationConverter = this._primary.findSerializationConverter(fd1Var);
        return objFindSerializationConverter == null ? this._secondary.findSerializationConverter(fd1Var) : objFindSerializationConverter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonInclude.Include findSerializationInclusion(fd1 fd1Var, JsonInclude.Include include) {
        return this._primary.findSerializationInclusion(fd1Var, this._secondary.findSerializationInclusion(fd1Var, include));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonInclude.Include findSerializationInclusionForContent(fd1 fd1Var, JsonInclude.Include include) {
        return this._primary.findSerializationInclusionForContent(fd1Var, this._secondary.findSerializationInclusionForContent(fd1Var, include));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationKeyType(fd1 fd1Var, JavaType javaType) {
        Class<?> clsFindSerializationKeyType = this._primary.findSerializationKeyType(fd1Var, javaType);
        return clsFindSerializationKeyType == null ? this._secondary.findSerializationKeyType(fd1Var, javaType) : clsFindSerializationKeyType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findSerializationPropertyOrder(a aVar) {
        String[] strArrFindSerializationPropertyOrder = this._primary.findSerializationPropertyOrder(aVar);
        return strArrFindSerializationPropertyOrder == null ? this._secondary.findSerializationPropertyOrder(aVar) : strArrFindSerializationPropertyOrder;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findSerializationSortAlphabetically(fd1 fd1Var) {
        Boolean boolFindSerializationSortAlphabetically = this._primary.findSerializationSortAlphabetically(fd1Var);
        return boolFindSerializationSortAlphabetically == null ? this._secondary.findSerializationSortAlphabetically(fd1Var) : boolFindSerializationSortAlphabetically;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Class<?> findSerializationType(fd1 fd1Var) {
        Class<?> clsFindSerializationType = this._primary.findSerializationType(fd1Var);
        return clsFindSerializationType == null ? this._secondary.findSerializationType(fd1Var) : clsFindSerializationType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSerialize.Typing findSerializationTyping(fd1 fd1Var) {
        JsonSerialize.Typing typingFindSerializationTyping = this._primary.findSerializationTyping(fd1Var);
        return typingFindSerializationTyping == null ? this._secondary.findSerializationTyping(fd1Var) : typingFindSerializationTyping;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializer(fd1 fd1Var) {
        Object objFindSerializer = this._primary.findSerializer(fd1Var);
        return _isExplicitClassOrOb(objFindSerializer, eud.a.class) ? objFindSerializer : _explicitClassOrOb(this._secondary.findSerializer(fd1Var), eud.a.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSetter.Value findSetterInfo(fd1 fd1Var) {
        JsonSetter.Value valueFindSetterInfo = this._secondary.findSetterInfo(fd1Var);
        JsonSetter.Value valueFindSetterInfo2 = this._primary.findSetterInfo(fd1Var);
        return valueFindSetterInfo == null ? valueFindSetterInfo2 : valueFindSetterInfo.withOverrides(valueFindSetterInfo2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<NamedType> findSubtypes(fd1 fd1Var) {
        List<NamedType> listFindSubtypes = this._primary.findSubtypes(fd1Var);
        List<NamedType> listFindSubtypes2 = this._secondary.findSubtypes(fd1Var);
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
    public String findTypeName(a aVar) {
        String strFindTypeName = this._primary.findTypeName(aVar);
        return (strFindTypeName == null || strFindTypeName.length() == 0) ? this._secondary.findTypeName(aVar) : strFindTypeName;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public c5q<?> findTypeResolver(MapperConfig<?> mapperConfig, a aVar, JavaType javaType) {
        c5q<?> c5qVarFindTypeResolver = this._primary.findTypeResolver(mapperConfig, aVar, javaType);
        return c5qVarFindTypeResolver == null ? this._secondary.findTypeResolver(mapperConfig, aVar, javaType) : c5qVarFindTypeResolver;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        NameTransformer nameTransformerFindUnwrappingNameTransformer = this._primary.findUnwrappingNameTransformer(annotatedMember);
        return nameTransformerFindUnwrappingNameTransformer == null ? this._secondary.findUnwrappingNameTransformer(annotatedMember) : nameTransformerFindUnwrappingNameTransformer;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findValueInstantiator(a aVar) {
        Object objFindValueInstantiator = this._primary.findValueInstantiator(aVar);
        return objFindValueInstantiator == null ? this._secondary.findValueInstantiator(aVar) : objFindValueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?>[] findViews(fd1 fd1Var) {
        Class<?>[] clsArrFindViews = this._primary.findViews(fd1Var);
        return clsArrFindViews == null ? this._secondary.findViews(fd1Var) : clsArrFindViews;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findWrapperName(fd1 fd1Var) {
        PropertyName propertyNameFindWrapperName;
        PropertyName propertyNameFindWrapperName2 = this._primary.findWrapperName(fd1Var);
        if (propertyNameFindWrapperName2 == null) {
            return this._secondary.findWrapperName(fd1Var);
        }
        return (propertyNameFindWrapperName2 != PropertyName.USE_DEFAULT || (propertyNameFindWrapperName = this._secondary.findWrapperName(fd1Var)) == null) ? propertyNameFindWrapperName2 : propertyNameFindWrapperName;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnyGetter(fd1 fd1Var) {
        Boolean boolHasAnyGetter = this._primary.hasAnyGetter(fd1Var);
        return boolHasAnyGetter == null ? this._secondary.hasAnyGetter(fd1Var) : boolHasAnyGetter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return this._primary.hasAnyGetterAnnotation(annotatedMethod) || this._secondary.hasAnyGetterAnnotation(annotatedMethod);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnySetter(fd1 fd1Var) {
        Boolean boolHasAnySetter = this._primary.hasAnySetter(fd1Var);
        return boolHasAnySetter == null ? this._secondary.hasAnySetter(fd1Var) : boolHasAnySetter;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return this._primary.hasAnySetterAnnotation(annotatedMethod) || this._secondary.hasAnySetterAnnotation(annotatedMethod);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAsValue(fd1 fd1Var) {
        Boolean boolHasAsValue = this._primary.hasAsValue(fd1Var);
        return boolHasAsValue == null ? this._secondary.hasAsValue(fd1Var) : boolHasAsValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        return this._primary.hasAsValueAnnotation(annotatedMethod) || this._secondary.hasAsValueAnnotation(annotatedMethod);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasCreatorAnnotation(fd1 fd1Var) {
        return this._primary.hasCreatorAnnotation(fd1Var) || this._secondary.hasCreatorAnnotation(fd1Var);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return this._primary.hasIgnoreMarker(annotatedMember) || this._secondary.hasIgnoreMarker(annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        Boolean boolHasRequiredMarker = this._primary.hasRequiredMarker(annotatedMember);
        return boolHasRequiredMarker == null ? this._secondary.hasRequiredMarker(annotatedMember) : boolHasRequiredMarker;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean isAnnotationBundle(Annotation annotation) {
        return this._primary.isAnnotationBundle(annotation) || this._secondary.isAnnotationBundle(annotation);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isIgnorableType(a aVar) {
        Boolean boolIsIgnorableType = this._primary.isIgnorableType(aVar);
        return boolIsIgnorableType == null ? this._secondary.isIgnorableType(aVar) : boolIsIgnorableType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        Boolean boolIsTypeId = this._primary.isTypeId(annotatedMember);
        return boolIsTypeId == null ? this._secondary.isTypeId(annotatedMember) : boolIsTypeId;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, fd1 fd1Var, JavaType javaType) throws JsonMappingException {
        return this._primary.refineDeserializationType(mapperConfig, fd1Var, this._secondary.refineDeserializationType(mapperConfig, fd1Var, javaType));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, fd1 fd1Var, JavaType javaType) throws JsonMappingException {
        return this._primary.refineSerializationType(mapperConfig, fd1Var, this._secondary.refineSerializationType(mapperConfig, fd1Var, javaType));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        AnnotatedMethod annotatedMethodResolveSetterConflict = this._primary.resolveSetterConflict(mapperConfig, annotatedMethod, annotatedMethod2);
        return annotatedMethodResolveSetterConflict == null ? this._secondary.resolveSetterConflict(mapperConfig, annotatedMethod, annotatedMethod2) : annotatedMethodResolveSetterConflict;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Version version() {
        return this._primary.version();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Collection<AnnotationIntrospector> allIntrospectors(Collection<AnnotationIntrospector> collection) {
        this._primary.allIntrospectors(collection);
        this._secondary.allIntrospectors(collection);
        return collection;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public String[] findPropertiesToIgnore(fd1 fd1Var, boolean z) {
        String[] strArrFindPropertiesToIgnore = this._primary.findPropertiesToIgnore(fd1Var, z);
        return strArrFindPropertiesToIgnore == null ? this._secondary.findPropertiesToIgnore(fd1Var, z) : strArrFindPropertiesToIgnore;
    }
}
