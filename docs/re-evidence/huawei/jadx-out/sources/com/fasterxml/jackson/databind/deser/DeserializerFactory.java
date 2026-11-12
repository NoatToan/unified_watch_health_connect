package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
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
public abstract class DeserializerFactory {
    protected static final Deserializers[] NO_DESERIALIZERS = new Deserializers[0];

    public abstract JsonDeserializer<?> createArrayDeserializer(DeserializationContext deserializationContext, ahe aheVar, BeanDescription beanDescription) throws ym;

    public abstract JsonDeserializer<Object> createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws ym;

    public abstract JsonDeserializer<Object> createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription, Class<?> cls) throws ym;

    public abstract JsonDeserializer<?> createCollectionDeserializer(DeserializationContext deserializationContext, ahg ahgVar, BeanDescription beanDescription) throws ym;

    public abstract JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, ahb ahbVar, BeanDescription beanDescription) throws ym;

    public abstract JsonDeserializer<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws ym;

    public abstract KeyDeserializer createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws ym;

    public abstract JsonDeserializer<?> createMapDeserializer(DeserializationContext deserializationContext, ahh ahhVar, BeanDescription beanDescription) throws ym;

    public abstract JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext deserializationContext, ahk ahkVar, BeanDescription beanDescription) throws ym;

    public abstract JsonDeserializer<?> createReferenceDeserializer(DeserializationContext deserializationContext, ahi ahiVar, BeanDescription beanDescription) throws ym;

    public abstract JsonDeserializer<?> createTreeDeserializer(yi yiVar, JavaType javaType, BeanDescription beanDescription) throws ym;

    public abstract TypeDeserializer findTypeDeserializer(yi yiVar, JavaType javaType) throws ym;

    public abstract ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) throws ym;

    public abstract boolean hasExplicitDeserializerFor(yi yiVar, Class<?> cls);

    public abstract JavaType mapAbstractType(yi yiVar, JavaType javaType) throws ym;

    public abstract DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver);

    public abstract DeserializerFactory withAdditionalDeserializers(Deserializers deserializers);

    public abstract DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers keyDeserializers);

    public abstract DeserializerFactory withDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier);

    public abstract DeserializerFactory withValueInstantiators(ValueInstantiators valueInstantiators);
}
