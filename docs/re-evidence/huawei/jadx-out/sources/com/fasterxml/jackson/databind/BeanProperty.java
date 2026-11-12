package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.util.Named;
import defpackage.ahp;
import defpackage.ym;
import defpackage.yq;
import defpackage.ys;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public interface BeanProperty extends Named {
    public static final JsonFormat.c EMPTY_FORMAT = new JsonFormat.c();
    public static final JsonInclude.b EMPTY_INCLUDE = JsonInclude.b.e();

    void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws ym;

    List<ys> findAliases(MapperConfig<?> mapperConfig);

    @Deprecated
    JsonFormat.c findFormatOverrides(AnnotationIntrospector annotationIntrospector);

    JsonFormat.c findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls);

    JsonInclude.b findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls);

    <A extends Annotation> A getAnnotation(Class<A> cls);

    <A extends Annotation> A getContextAnnotation(Class<A> cls);

    ys getFullName();

    AnnotatedMember getMember();

    yq getMetadata();

    @Override // com.fasterxml.jackson.databind.util.Named
    String getName();

    JavaType getType();

    ys getWrapperName();

    boolean isRequired();

    boolean isVirtual();

    public static class d implements BeanProperty, Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final yq f4089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final ys f4090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final AnnotatedMember f4091c;
        protected final ys d;
        protected final JavaType e;

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public boolean isVirtual() {
            return false;
        }

        public d(ys ysVar, JavaType javaType, ys ysVar2, AnnotatedMember annotatedMember, yq yqVar) {
            this.d = ysVar;
            this.e = javaType;
            this.f4090b = ysVar2;
            this.f4089a = yqVar;
            this.f4091c = annotatedMember;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            AnnotatedMember annotatedMember = this.f4091c;
            if (annotatedMember == null) {
                return null;
            }
            return (A) annotatedMember.getAnnotation(cls);
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        @Deprecated
        public JsonFormat.c findFormatOverrides(AnnotationIntrospector annotationIntrospector) {
            JsonFormat.c cVarFindFormat;
            AnnotatedMember annotatedMember = this.f4091c;
            return (annotatedMember == null || annotationIntrospector == null || (cVarFindFormat = annotationIntrospector.findFormat(annotatedMember)) == null) ? EMPTY_FORMAT : cVarFindFormat;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JsonFormat.c findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
            AnnotatedMember annotatedMember;
            JsonFormat.c cVarFindFormat;
            JsonFormat.c defaultPropertyFormat = mapperConfig.getDefaultPropertyFormat(cls);
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            return (annotationIntrospector == null || (annotatedMember = this.f4091c) == null || (cVarFindFormat = annotationIntrospector.findFormat(annotatedMember)) == null) ? defaultPropertyFormat : defaultPropertyFormat.a(cVarFindFormat);
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JsonInclude.b findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
            AnnotatedMember annotatedMember;
            JsonInclude.b bVarFindPropertyInclusion;
            JsonInclude.b defaultInclusion = mapperConfig.getDefaultInclusion(cls, this.e.getRawClass());
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            return (annotationIntrospector == null || (annotatedMember = this.f4091c) == null || (bVarFindPropertyInclusion = annotationIntrospector.findPropertyInclusion(annotatedMember)) == null) ? defaultInclusion : defaultInclusion.b(bVarFindPropertyInclusion);
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public List<ys> findAliases(MapperConfig<?> mapperConfig) {
            return Collections.EMPTY_LIST;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.util.Named
        public String getName() {
            return this.d.b();
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public ys getFullName() {
            return this.d;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JavaType getType() {
            return this.e;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public ys getWrapperName() {
            return this.f4090b;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public boolean isRequired() {
            return this.f4089a.g();
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public yq getMetadata() {
            return this.f4089a;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public AnnotatedMember getMember() {
            return this.f4091c;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) {
            throw new UnsupportedOperationException("Instances of " + getClass().getName() + " should not get visited");
        }
    }

    public static class a implements BeanProperty {
        @Override // com.fasterxml.jackson.databind.BeanProperty
        public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws ym {
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JsonInclude.b findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public AnnotatedMember getMember() {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public ys getWrapperName() {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public boolean isRequired() {
            return false;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public boolean isVirtual() {
            return false;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.util.Named
        public String getName() {
            return "";
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public ys getFullName() {
            return ys.f53793b;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JavaType getType() {
            return ahp.c();
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public yq getMetadata() {
            return yq.f53746b;
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        @Deprecated
        public JsonFormat.c findFormatOverrides(AnnotationIntrospector annotationIntrospector) {
            return JsonFormat.c.e();
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public JsonFormat.c findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
            return JsonFormat.c.e();
        }

        @Override // com.fasterxml.jackson.databind.BeanProperty
        public List<ys> findAliases(MapperConfig<?> mapperConfig) {
            return Collections.EMPTY_LIST;
        }
    }
}
