package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import defpackage.ym;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public abstract class PolymorphicTypeValidator implements Serializable {
    private static final long serialVersionUID = 1;

    public enum Validity {
        ALLOWED,
        DENIED,
        INDETERMINATE
    }

    public abstract Validity validateBaseType(MapperConfig<?> mapperConfig, JavaType javaType);

    public abstract Validity validateSubClassName(MapperConfig<?> mapperConfig, JavaType javaType, String str) throws ym;

    public abstract Validity validateSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) throws ym;

    public static abstract class Base extends PolymorphicTypeValidator implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
        public Validity validateBaseType(MapperConfig<?> mapperConfig, JavaType javaType) {
            return Validity.INDETERMINATE;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
        public Validity validateSubClassName(MapperConfig<?> mapperConfig, JavaType javaType, String str) throws ym {
            return Validity.INDETERMINATE;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
        public Validity validateSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) throws ym {
            return Validity.INDETERMINATE;
        }
    }
}
