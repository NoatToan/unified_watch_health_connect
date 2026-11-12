package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import defpackage.ahp;

/* JADX INFO: loaded from: classes21.dex */
public abstract class StdConverter<IN, OUT> implements Converter<IN, OUT> {
    @Override // com.fasterxml.jackson.databind.util.Converter
    public abstract OUT convert(IN in);

    @Override // com.fasterxml.jackson.databind.util.Converter
    public JavaType getInputType(ahp ahpVar) {
        return _findConverterType(ahpVar).containedType(0);
    }

    @Override // com.fasterxml.jackson.databind.util.Converter
    public JavaType getOutputType(ahp ahpVar) {
        return _findConverterType(ahpVar).containedType(1);
    }

    protected JavaType _findConverterType(ahp ahpVar) {
        JavaType javaTypeFindSuperType = ahpVar.b(getClass()).findSuperType(Converter.class);
        if (javaTypeFindSuperType != null && javaTypeFindSuperType.containedTypeCount() >= 2) {
            return javaTypeFindSuperType;
        }
        throw new IllegalStateException("Cannot find OUT type parameter for Converter of type " + getClass().getName());
    }
}
