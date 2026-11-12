package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import defpackage.ahn;
import defpackage.ahp;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes21.dex */
public abstract class TypeModifier {
    public abstract JavaType modifyType(JavaType javaType, Type type, ahn ahnVar, ahp ahpVar);
}
