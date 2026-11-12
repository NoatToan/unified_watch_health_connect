package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import defpackage.yq;
import defpackage.ys;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ConcreteBeanPropertyBase implements BeanProperty, Serializable {
    private static final long serialVersionUID = 1;
    protected transient List<ys> _aliases;
    protected final yq _metadata;

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public boolean isVirtual() {
        return false;
    }

    public ConcreteBeanPropertyBase(yq yqVar) {
        this._metadata = yqVar == null ? yq.f53746b : yqVar;
    }

    public ConcreteBeanPropertyBase(ConcreteBeanPropertyBase concreteBeanPropertyBase) {
        this._metadata = concreteBeanPropertyBase._metadata;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public boolean isRequired() {
        return this._metadata.g();
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public yq getMetadata() {
        return this._metadata;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    @Deprecated
    public final JsonFormat.c findFormatOverrides(AnnotationIntrospector annotationIntrospector) {
        AnnotatedMember member;
        JsonFormat.c cVarFindFormat = (annotationIntrospector == null || (member = getMember()) == null) ? null : annotationIntrospector.findFormat(member);
        return cVarFindFormat == null ? EMPTY_FORMAT : cVarFindFormat;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JsonFormat.c findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
        AnnotatedMember member;
        JsonFormat.c defaultPropertyFormat = mapperConfig.getDefaultPropertyFormat(cls);
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        JsonFormat.c cVarFindFormat = (annotationIntrospector == null || (member = getMember()) == null) ? null : annotationIntrospector.findFormat(member);
        if (defaultPropertyFormat == null) {
            return cVarFindFormat == null ? EMPTY_FORMAT : cVarFindFormat;
        }
        return cVarFindFormat == null ? defaultPropertyFormat : defaultPropertyFormat.a(cVarFindFormat);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JsonInclude.b findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        AnnotatedMember member = getMember();
        if (member == null) {
            return mapperConfig.getDefaultPropertyInclusion(cls);
        }
        JsonInclude.b defaultInclusion = mapperConfig.getDefaultInclusion(cls, member.getRawType());
        if (annotationIntrospector == null) {
            return defaultInclusion;
        }
        JsonInclude.b bVarFindPropertyInclusion = annotationIntrospector.findPropertyInclusion(member);
        return defaultInclusion == null ? bVarFindPropertyInclusion : defaultInclusion.b(bVarFindPropertyInclusion);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public List<ys> findAliases(MapperConfig<?> mapperConfig) {
        AnnotatedMember member;
        List<ys> listFindPropertyAliases = this._aliases;
        if (listFindPropertyAliases == null) {
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector != null && (member = getMember()) != null) {
                listFindPropertyAliases = annotationIntrospector.findPropertyAliases(member);
            }
            if (listFindPropertyAliases == null) {
                listFindPropertyAliases = Collections.EMPTY_LIST;
            }
            this._aliases = listFindPropertyAliases;
        }
        return listFindPropertyAliases;
    }
}
