package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.Named;
import defpackage.acj;
import defpackage.aco;
import defpackage.acp;
import defpackage.acv;
import defpackage.ahw;
import defpackage.yq;
import defpackage.ys;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BeanPropertyDefinition implements Named {
    public static final JsonInclude.b EMPTY_INCLUDE = JsonInclude.b.e();

    public abstract JsonInclude.b findInclusion();

    public acv findObjectIdInfo() {
        return null;
    }

    public AnnotationIntrospector.ReferenceProperty findReferenceType() {
        return null;
    }

    public Class<?>[] findViews() {
        return null;
    }

    public abstract acp getConstructorParameter();

    public abstract acj getField();

    public abstract ys getFullName();

    public abstract aco getGetter();

    public abstract String getInternalName();

    public abstract yq getMetadata();

    @Override // com.fasterxml.jackson.databind.util.Named
    public abstract String getName();

    public abstract AnnotatedMember getPrimaryMember();

    public abstract JavaType getPrimaryType();

    public abstract Class<?> getRawPrimaryType();

    public abstract aco getSetter();

    public abstract ys getWrapperName();

    public abstract boolean hasConstructorParameter();

    public abstract boolean hasField();

    public abstract boolean hasGetter();

    public abstract boolean hasSetter();

    public abstract boolean isExplicitlyIncluded();

    public boolean isTypeId() {
        return false;
    }

    public abstract BeanPropertyDefinition withName(ys ysVar);

    public abstract BeanPropertyDefinition withSimpleName(String str);

    public boolean hasName(ys ysVar) {
        return getFullName().equals(ysVar);
    }

    public boolean isExplicitlyNamed() {
        return isExplicitlyIncluded();
    }

    public boolean isRequired() {
        return getMetadata().g();
    }

    public boolean couldDeserialize() {
        return getMutator() != null;
    }

    public boolean couldSerialize() {
        return getAccessor() != null;
    }

    public Iterator<acp> getConstructorParameters() {
        return ahw.d();
    }

    public AnnotatedMember getAccessor() {
        aco getter = getGetter();
        return getter == null ? getField() : getter;
    }

    public AnnotatedMember getMutator() {
        acp constructorParameter = getConstructorParameter();
        if (constructorParameter != null) {
            return constructorParameter;
        }
        aco setter = getSetter();
        return setter == null ? getField() : setter;
    }

    public AnnotatedMember getNonConstructorMutator() {
        aco setter = getSetter();
        return setter == null ? getField() : setter;
    }

    public String findReferenceName() {
        AnnotationIntrospector.ReferenceProperty referencePropertyFindReferenceType = findReferenceType();
        if (referencePropertyFindReferenceType == null) {
            return null;
        }
        return referencePropertyFindReferenceType.b();
    }
}
