package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import defpackage.q4q;
import defpackage.r4q;

/* JADX INFO: loaded from: classes4.dex */
public class AsExternalTypeDeserializer extends AsArrayTypeDeserializer {
    private static final long serialVersionUID = 1;

    public AsExternalTypeDeserializer(JavaType javaType, r4q r4qVar, String str, boolean z, JavaType javaType2) {
        super(javaType, r4qVar, str, z, javaType2);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer
    public boolean _usesExternalId() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, defpackage.q4q
    public q4q forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsExternalTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, defpackage.q4q
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.EXTERNAL_PROPERTY;
    }

    public AsExternalTypeDeserializer(AsExternalTypeDeserializer asExternalTypeDeserializer, BeanProperty beanProperty) {
        super(asExternalTypeDeserializer, beanProperty);
    }
}
