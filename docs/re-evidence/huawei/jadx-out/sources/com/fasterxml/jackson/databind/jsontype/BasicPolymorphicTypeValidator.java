package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import defpackage.ym;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class BasicPolymorphicTypeValidator extends PolymorphicTypeValidator.Base implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Set<Class<?>> f4173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final TypeMatcher[] f4174c;
    protected final TypeMatcher[] d;
    protected final NameMatcher[] e;

    public static abstract class NameMatcher {
        public abstract boolean match(MapperConfig<?> mapperConfig, String str);
    }

    public static abstract class TypeMatcher {
        public abstract boolean match(MapperConfig<?> mapperConfig, Class<?> cls);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity validateBaseType(MapperConfig<?> mapperConfig, JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        Set<Class<?>> set = this.f4173b;
        if (set != null && set.contains(rawClass)) {
            return PolymorphicTypeValidator.Validity.DENIED;
        }
        TypeMatcher[] typeMatcherArr = this.d;
        if (typeMatcherArr != null) {
            for (TypeMatcher typeMatcher : typeMatcherArr) {
                if (typeMatcher.match(mapperConfig, rawClass)) {
                    return PolymorphicTypeValidator.Validity.ALLOWED;
                }
            }
        }
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity validateSubClassName(MapperConfig<?> mapperConfig, JavaType javaType, String str) throws ym {
        NameMatcher[] nameMatcherArr = this.e;
        if (nameMatcherArr != null) {
            for (NameMatcher nameMatcher : nameMatcherArr) {
                if (nameMatcher.match(mapperConfig, str)) {
                    return PolymorphicTypeValidator.Validity.ALLOWED;
                }
            }
        }
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity validateSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) throws ym {
        if (this.f4174c != null) {
            Class<?> rawClass = javaType2.getRawClass();
            for (TypeMatcher typeMatcher : this.f4174c) {
                if (typeMatcher.match(mapperConfig, rawClass)) {
                    return PolymorphicTypeValidator.Validity.ALLOWED;
                }
            }
        }
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }
}
