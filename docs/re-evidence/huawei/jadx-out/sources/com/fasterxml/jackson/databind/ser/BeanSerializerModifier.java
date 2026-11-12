package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import defpackage.aez;
import defpackage.afa;
import defpackage.ahb;
import defpackage.ahe;
import defpackage.ahg;
import defpackage.ahh;
import defpackage.ahk;
import defpackage.yt;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BeanSerializerModifier {
    public List<aez> changeProperties(yt ytVar, BeanDescription beanDescription, List<aez> list) {
        return list;
    }

    public JsonSerializer<?> modifyArraySerializer(yt ytVar, ahe aheVar, BeanDescription beanDescription, JsonSerializer<?> jsonSerializer) {
        return jsonSerializer;
    }

    public JsonSerializer<?> modifyCollectionLikeSerializer(yt ytVar, ahb ahbVar, BeanDescription beanDescription, JsonSerializer<?> jsonSerializer) {
        return jsonSerializer;
    }

    public JsonSerializer<?> modifyCollectionSerializer(yt ytVar, ahg ahgVar, BeanDescription beanDescription, JsonSerializer<?> jsonSerializer) {
        return jsonSerializer;
    }

    public JsonSerializer<?> modifyEnumSerializer(yt ytVar, JavaType javaType, BeanDescription beanDescription, JsonSerializer<?> jsonSerializer) {
        return jsonSerializer;
    }

    public JsonSerializer<?> modifyKeySerializer(yt ytVar, JavaType javaType, BeanDescription beanDescription, JsonSerializer<?> jsonSerializer) {
        return jsonSerializer;
    }

    public JsonSerializer<?> modifyMapLikeSerializer(yt ytVar, ahk ahkVar, BeanDescription beanDescription, JsonSerializer<?> jsonSerializer) {
        return jsonSerializer;
    }

    public JsonSerializer<?> modifyMapSerializer(yt ytVar, ahh ahhVar, BeanDescription beanDescription, JsonSerializer<?> jsonSerializer) {
        return jsonSerializer;
    }

    public JsonSerializer<?> modifySerializer(yt ytVar, BeanDescription beanDescription, JsonSerializer<?> jsonSerializer) {
        return jsonSerializer;
    }

    public List<aez> orderProperties(yt ytVar, BeanDescription beanDescription, List<aez> list) {
        return list;
    }

    public afa updateBuilder(yt ytVar, BeanDescription beanDescription, afa afaVar) {
        return afaVar;
    }
}
