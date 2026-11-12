package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import defpackage.ahb;
import defpackage.ahe;
import defpackage.ahg;
import defpackage.ahh;
import defpackage.ahi;
import defpackage.ahk;
import defpackage.yi;
import defpackage.ym;

/* JADX INFO: loaded from: classes21.dex */
public interface Deserializers {

    public static abstract class Base implements Deserializers {
        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer<?> findArrayDeserializer(ahe aheVar, yi yiVar, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer<?> findBeanDeserializer(JavaType javaType, yi yiVar, BeanDescription beanDescription) throws ym {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer<?> findCollectionDeserializer(ahg ahgVar, yi yiVar, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer<?> findCollectionLikeDeserializer(ahb ahbVar, yi yiVar, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer<?> findEnumDeserializer(Class<?> cls, yi yiVar, BeanDescription beanDescription) throws ym {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer<?> findMapDeserializer(ahh ahhVar, yi yiVar, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer<?> findMapLikeDeserializer(ahk ahkVar, yi yiVar, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer<?> findReferenceDeserializer(ahi ahiVar, yi yiVar, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.Deserializers
        public JsonDeserializer<?> findTreeNodeDeserializer(Class<? extends JsonNode> cls, yi yiVar, BeanDescription beanDescription) throws ym {
            return null;
        }

        public boolean hasDeserializerFor(yi yiVar, Class<?> cls) {
            return false;
        }
    }

    JsonDeserializer<?> findArrayDeserializer(ahe aheVar, yi yiVar, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym;

    JsonDeserializer<?> findBeanDeserializer(JavaType javaType, yi yiVar, BeanDescription beanDescription) throws ym;

    JsonDeserializer<?> findCollectionDeserializer(ahg ahgVar, yi yiVar, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym;

    JsonDeserializer<?> findCollectionLikeDeserializer(ahb ahbVar, yi yiVar, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym;

    JsonDeserializer<?> findEnumDeserializer(Class<?> cls, yi yiVar, BeanDescription beanDescription) throws ym;

    JsonDeserializer<?> findMapDeserializer(ahh ahhVar, yi yiVar, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym;

    JsonDeserializer<?> findMapLikeDeserializer(ahk ahkVar, yi yiVar, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym;

    JsonDeserializer<?> findReferenceDeserializer(ahi ahiVar, yi yiVar, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym;

    JsonDeserializer<?> findTreeNodeDeserializer(Class<? extends JsonNode> cls, yi yiVar, BeanDescription beanDescription) throws ym;
}
