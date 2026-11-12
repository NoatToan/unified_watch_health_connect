package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class aih extends BeanPropertyDefinition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ys f456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final yq f457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final AnnotatedMember f458c;
    protected final JsonInclude.b d;
    protected final AnnotationIntrospector e;

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isExplicitlyIncluded() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isExplicitlyNamed() {
        return false;
    }

    protected aih(AnnotationIntrospector annotationIntrospector, AnnotatedMember annotatedMember, ys ysVar, yq yqVar, JsonInclude.b bVar) {
        this.e = annotationIntrospector;
        this.f458c = annotatedMember;
        this.f456a = ysVar;
        this.f457b = yqVar == null ? yq.f53745a : yqVar;
        this.d = bVar;
    }

    public static aih e(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, ys ysVar) {
        return b(mapperConfig, annotatedMember, ysVar, null, EMPTY_INCLUDE);
    }

    public static aih d(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, ys ysVar, yq yqVar, JsonInclude.Include include) {
        return new aih(mapperConfig.getAnnotationIntrospector(), annotatedMember, ysVar, yqVar, (include == null || include == JsonInclude.Include.USE_DEFAULTS) ? EMPTY_INCLUDE : JsonInclude.b.a(include, null));
    }

    public static aih b(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, ys ysVar, yq yqVar, JsonInclude.b bVar) {
        return new aih(mapperConfig.getAnnotationIntrospector(), annotatedMember, ysVar, yqVar, bVar);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public BeanPropertyDefinition withSimpleName(String str) {
        return (!this.f456a.e(str) || this.f456a.e()) ? new aih(this.e, this.f458c, new ys(str), this.f457b, this.d) : this;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public BeanPropertyDefinition withName(ys ysVar) {
        return this.f456a.equals(ysVar) ? this : new aih(this.e, this.f458c, ysVar, this.f457b, this.d);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.util.Named
    public String getName() {
        return this.f456a.b();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public ys getFullName() {
        return this.f456a;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasName(ys ysVar) {
        return this.f456a.equals(ysVar);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public String getInternalName() {
        return getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public ys getWrapperName() {
        AnnotatedMember annotatedMember;
        AnnotationIntrospector annotationIntrospector = this.e;
        if (annotationIntrospector == null || (annotatedMember = this.f458c) == null) {
            return null;
        }
        return annotationIntrospector.findWrapperName(annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public yq getMetadata() {
        return this.f457b;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public JavaType getPrimaryType() {
        AnnotatedMember annotatedMember = this.f458c;
        if (annotatedMember == null) {
            return ahp.c();
        }
        return annotatedMember.getType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Class<?> getRawPrimaryType() {
        AnnotatedMember annotatedMember = this.f458c;
        if (annotatedMember == null) {
            return Object.class;
        }
        return annotatedMember.getRawType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public JsonInclude.b findInclusion() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasGetter() {
        return getGetter() != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasSetter() {
        return getSetter() != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasField() {
        return this.f458c instanceof acj;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasConstructorParameter() {
        return this.f458c instanceof acp;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public aco getGetter() {
        AnnotatedMember annotatedMember = this.f458c;
        if ((annotatedMember instanceof aco) && ((aco) annotatedMember).getParameterCount() == 0) {
            return (aco) this.f458c;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public aco getSetter() {
        AnnotatedMember annotatedMember = this.f458c;
        if ((annotatedMember instanceof aco) && ((aco) annotatedMember).getParameterCount() == 1) {
            return (aco) this.f458c;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public acj getField() {
        AnnotatedMember annotatedMember = this.f458c;
        if (annotatedMember instanceof acj) {
            return (acj) annotatedMember;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public acp getConstructorParameter() {
        AnnotatedMember annotatedMember = this.f458c;
        if (annotatedMember instanceof acp) {
            return (acp) annotatedMember;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Iterator<acp> getConstructorParameters() {
        acp constructorParameter = getConstructorParameter();
        if (constructorParameter == null) {
            return ahw.d();
        }
        return Collections.singleton(constructorParameter).iterator();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedMember getPrimaryMember() {
        return this.f458c;
    }
}
