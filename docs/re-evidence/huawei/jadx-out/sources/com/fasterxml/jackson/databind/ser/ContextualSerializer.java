package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import defpackage.ym;

/* JADX INFO: loaded from: classes21.dex */
public interface ContextualSerializer {
    JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym;
}
