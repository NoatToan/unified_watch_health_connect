package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.Converter;
import defpackage.ach;
import defpackage.acj;
import defpackage.ack;
import defpackage.aco;
import defpackage.acv;
import defpackage.ahn;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BeanDescription {
    protected final JavaType _type;

    @Deprecated
    public abstract ahn bindingsForBeanType();

    public abstract AnnotatedMember findAnyGetter();

    public abstract AnnotatedMember findAnySetterAccessor();

    @Deprecated
    public abstract Map<String, AnnotatedMember> findBackReferenceProperties();

    public abstract List<BeanPropertyDefinition> findBackReferences();

    public String findClassDescription() {
        return null;
    }

    public abstract ach findDefaultConstructor();

    public abstract Class<?>[] findDefaultViews();

    public abstract Converter<Object, Object> findDeserializationConverter();

    public abstract JsonFormat.c findExpectedFormat(JsonFormat.c cVar);

    public abstract Method findFactoryMethod(Class<?>... clsArr);

    public abstract Map<Object, AnnotatedMember> findInjectables();

    public AnnotatedMember findJsonKeyAccessor() {
        return null;
    }

    public abstract AnnotatedMember findJsonValueAccessor();

    @Deprecated
    public abstract aco findJsonValueMethod();

    public abstract aco findMethod(String str, Class<?>[] clsArr);

    public abstract Class<?> findPOJOBuilder();

    public abstract JsonPOJOBuilder.e findPOJOBuilderConfig();

    public abstract List<BeanPropertyDefinition> findProperties();

    public abstract JsonInclude.b findPropertyInclusion(JsonInclude.b bVar);

    public abstract Converter<Object, Object> findSerializationConverter();

    public abstract Constructor<?> findSingleArgConstructor(Class<?>... clsArr);

    public abstract Annotations getClassAnnotations();

    public abstract ack getClassInfo();

    public abstract List<ach> getConstructors();

    public abstract List<aco> getFactoryMethods();

    public abstract Set<String> getIgnoredPropertyNames();

    public abstract acv getObjectIdInfo();

    public abstract boolean hasKnownClassAnnotations();

    public abstract Object instantiateBean(boolean z);

    @Deprecated
    public abstract JavaType resolveType(Type type);

    public BeanDescription(JavaType javaType) {
        this._type = javaType;
    }

    public JavaType getType() {
        return this._type;
    }

    public Class<?> getBeanClass() {
        return this._type.getRawClass();
    }

    public boolean isNonStaticInnerClass() {
        return getClassInfo().g();
    }

    @Deprecated
    public aco findAnySetter() {
        AnnotatedMember annotatedMemberFindAnySetterAccessor = findAnySetterAccessor();
        if (annotatedMemberFindAnySetterAccessor instanceof aco) {
            return (aco) annotatedMemberFindAnySetterAccessor;
        }
        return null;
    }

    @Deprecated
    public AnnotatedMember findAnySetterField() {
        AnnotatedMember annotatedMemberFindAnySetterAccessor = findAnySetterAccessor();
        if (annotatedMemberFindAnySetterAccessor instanceof acj) {
            return annotatedMemberFindAnySetterAccessor;
        }
        return null;
    }
}
