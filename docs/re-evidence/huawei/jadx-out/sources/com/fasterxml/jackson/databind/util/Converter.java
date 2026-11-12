package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import defpackage.ahp;

/* JADX INFO: loaded from: classes21.dex */
public interface Converter<IN, OUT> {

    public static abstract class None implements Converter<Object, Object> {
    }

    OUT convert(IN in);

    JavaType getInputType(ahp ahpVar);

    JavaType getOutputType(ahp ahpVar);
}
