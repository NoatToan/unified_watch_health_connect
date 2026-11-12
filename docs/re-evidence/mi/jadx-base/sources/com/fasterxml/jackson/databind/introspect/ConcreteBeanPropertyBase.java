package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import defpackage.itd;
import defpackage.wwl;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ConcreteBeanPropertyBase implements BeanProperty, Serializable {
    private static final long serialVersionUID = 1;
    protected transient List<PropertyName> _aliases;
    protected final PropertyMetadata _metadata;
    protected transient JsonFormat.Value _propertyFormat;

    public ConcreteBeanPropertyBase(PropertyMetadata propertyMetadata) {
        this._metadata = propertyMetadata == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : propertyMetadata;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ void depositSchemaProperty(itd itdVar, wwl wwlVar) throws JsonMappingException;

    public List<PropertyName> findAliases(MapperConfig<?> mapperConfig) {
        List<PropertyName> listEmptyList = this._aliases;
        if (listEmptyList == null) {
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector != null) {
                listEmptyList = annotationIntrospector.findPropertyAliases(getMember());
            }
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
            }
            this._aliases = listEmptyList;
        }
        return listEmptyList;
    }

    @Deprecated
    public final JsonFormat.Value findFormatOverrides(AnnotationIntrospector annotationIntrospector) {
        AnnotatedMember member;
        JsonFormat.Value valueFindFormat = (annotationIntrospector == null || (member = getMember()) == null) ? null : annotationIntrospector.findFormat(member);
        return valueFindFormat == null ? BeanProperty.Tb : valueFindFormat;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
        AnnotatedMember member;
        JsonFormat.Value value = this._propertyFormat;
        if (value == null) {
            JsonFormat.Value defaultPropertyFormat = mapperConfig.getDefaultPropertyFormat(cls);
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            JsonFormat.Value valueFindFormat = (annotationIntrospector == null || (member = getMember()) == null) ? null : annotationIntrospector.findFormat(member);
            if (defaultPropertyFormat == null) {
                if (valueFindFormat == null) {
                    valueFindFormat = BeanProperty.Tb;
                }
                value = valueFindFormat;
            } else {
                if (valueFindFormat != null) {
                    defaultPropertyFormat = defaultPropertyFormat.withOverrides(valueFindFormat);
                }
                value = defaultPropertyFormat;
            }
            this._propertyFormat = value;
        }
        return value;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        AnnotatedMember member = getMember();
        if (member == null) {
            return mapperConfig.getDefaultPropertyInclusion(cls);
        }
        JsonInclude.Value defaultInclusion = mapperConfig.getDefaultInclusion(cls, member.getRawType());
        if (annotationIntrospector == null) {
            return defaultInclusion;
        }
        JsonInclude.Value valueFindPropertyInclusion = annotationIntrospector.findPropertyInclusion(member);
        return defaultInclusion == null ? valueFindPropertyInclusion : defaultInclusion.withOverrides(valueFindPropertyInclusion);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ Annotation getAnnotation(Class cls);

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ Annotation getContextAnnotation(Class cls);

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ PropertyName getFullName();

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ AnnotatedMember getMember();

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public PropertyMetadata getMetadata() {
        return this._metadata;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty, defpackage.ogg
    public abstract /* synthetic */ String getName();

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ JavaType getType();

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract /* synthetic */ PropertyName getWrapperName();

    public boolean isRequired() {
        return this._metadata.isRequired();
    }

    public boolean isVirtual() {
        return false;
    }

    public ConcreteBeanPropertyBase(ConcreteBeanPropertyBase concreteBeanPropertyBase) {
        this._metadata = concreteBeanPropertyBase._metadata;
        this._propertyFormat = concreteBeanPropertyBase._propertyFormat;
    }
}
