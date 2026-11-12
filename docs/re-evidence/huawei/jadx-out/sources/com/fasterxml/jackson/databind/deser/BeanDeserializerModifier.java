package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import defpackage.ahb;
import defpackage.ahe;
import defpackage.ahg;
import defpackage.ahh;
import defpackage.ahi;
import defpackage.ahk;
import defpackage.yi;
import defpackage.zi;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BeanDeserializerModifier {
    public JsonDeserializer<?> modifyArrayDeserializer(yi yiVar, ahe aheVar, BeanDescription beanDescription, JsonDeserializer<?> jsonDeserializer) {
        return jsonDeserializer;
    }

    public JsonDeserializer<?> modifyCollectionDeserializer(yi yiVar, ahg ahgVar, BeanDescription beanDescription, JsonDeserializer<?> jsonDeserializer) {
        return jsonDeserializer;
    }

    public JsonDeserializer<?> modifyCollectionLikeDeserializer(yi yiVar, ahb ahbVar, BeanDescription beanDescription, JsonDeserializer<?> jsonDeserializer) {
        return jsonDeserializer;
    }

    public JsonDeserializer<?> modifyDeserializer(yi yiVar, BeanDescription beanDescription, JsonDeserializer<?> jsonDeserializer) {
        return jsonDeserializer;
    }

    public JsonDeserializer<?> modifyEnumDeserializer(yi yiVar, JavaType javaType, BeanDescription beanDescription, JsonDeserializer<?> jsonDeserializer) {
        return jsonDeserializer;
    }

    public KeyDeserializer modifyKeyDeserializer(yi yiVar, JavaType javaType, KeyDeserializer keyDeserializer) {
        return keyDeserializer;
    }

    public JsonDeserializer<?> modifyMapDeserializer(yi yiVar, ahh ahhVar, BeanDescription beanDescription, JsonDeserializer<?> jsonDeserializer) {
        return jsonDeserializer;
    }

    public JsonDeserializer<?> modifyMapLikeDeserializer(yi yiVar, ahk ahkVar, BeanDescription beanDescription, JsonDeserializer<?> jsonDeserializer) {
        return jsonDeserializer;
    }

    public JsonDeserializer<?> modifyReferenceDeserializer(yi yiVar, ahi ahiVar, BeanDescription beanDescription, JsonDeserializer<?> jsonDeserializer) {
        return jsonDeserializer;
    }

    public zi updateBuilder(yi yiVar, BeanDescription beanDescription, zi ziVar) {
        return ziVar;
    }

    public List<BeanPropertyDefinition> updateProperties(yi yiVar, BeanDescription beanDescription, List<BeanPropertyDefinition> list) {
        return list;
    }
}
