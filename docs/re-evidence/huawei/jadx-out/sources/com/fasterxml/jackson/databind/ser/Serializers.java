package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import defpackage.ahb;
import defpackage.ahe;
import defpackage.ahg;
import defpackage.ahh;
import defpackage.ahi;
import defpackage.ahk;
import defpackage.yt;

/* JADX INFO: loaded from: classes21.dex */
public interface Serializers {
    JsonSerializer<?> findArraySerializer(yt ytVar, ahe aheVar, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer);

    JsonSerializer<?> findCollectionLikeSerializer(yt ytVar, ahb ahbVar, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer);

    JsonSerializer<?> findCollectionSerializer(yt ytVar, ahg ahgVar, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer);

    JsonSerializer<?> findMapLikeSerializer(yt ytVar, ahk ahkVar, BeanDescription beanDescription, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer2);

    JsonSerializer<?> findMapSerializer(yt ytVar, ahh ahhVar, BeanDescription beanDescription, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer2);

    JsonSerializer<?> findReferenceSerializer(yt ytVar, ahi ahiVar, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer);

    JsonSerializer<?> findSerializer(yt ytVar, JavaType javaType, BeanDescription beanDescription);

    public static class e implements Serializers {
        @Override // com.fasterxml.jackson.databind.ser.Serializers
        public JsonSerializer<?> findArraySerializer(yt ytVar, ahe aheVar, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.Serializers
        public JsonSerializer<?> findCollectionLikeSerializer(yt ytVar, ahb ahbVar, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.Serializers
        public JsonSerializer<?> findCollectionSerializer(yt ytVar, ahg ahgVar, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.Serializers
        public JsonSerializer<?> findMapLikeSerializer(yt ytVar, ahk ahkVar, BeanDescription beanDescription, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer2) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.Serializers
        public JsonSerializer<?> findMapSerializer(yt ytVar, ahh ahhVar, BeanDescription beanDescription, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer2) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.Serializers
        public JsonSerializer<?> findSerializer(yt ytVar, JavaType javaType, BeanDescription beanDescription) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.Serializers
        public JsonSerializer<?> findReferenceSerializer(yt ytVar, ahi ahiVar, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
            return findSerializer(ytVar, ahiVar, beanDescription);
        }
    }
}
