package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.KeyDeserializer;
import defpackage.yi;
import defpackage.ym;

/* JADX INFO: loaded from: classes21.dex */
public interface KeyDeserializers {
    KeyDeserializer findKeyDeserializer(JavaType javaType, yi yiVar, BeanDescription beanDescription) throws ym;
}
