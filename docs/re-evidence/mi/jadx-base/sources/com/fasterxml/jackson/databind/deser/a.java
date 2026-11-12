package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import defpackage.esd;
import defpackage.fh2;
import defpackage.hh2;
import defpackage.oz5;
import defpackage.pnq;
import defpackage.q4q;
import defpackage.vzd;
import defpackage.wzd;
import defpackage.x10;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    protected static final oz5[] NO_DESERIALIZERS = new oz5[0];

    public abstract esd<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, fh2 fh2Var) throws JsonMappingException;

    public abstract esd<Object> createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, fh2 fh2Var) throws JsonMappingException;

    public abstract esd<Object> createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, fh2 fh2Var, Class<?> cls) throws JsonMappingException;

    public abstract esd<?> createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, fh2 fh2Var) throws JsonMappingException;

    public abstract esd<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, fh2 fh2Var) throws JsonMappingException;

    public abstract esd<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, fh2 fh2Var) throws JsonMappingException;

    public abstract vzd createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException;

    public abstract esd<?> createMapDeserializer(DeserializationContext deserializationContext, MapType mapType, fh2 fh2Var) throws JsonMappingException;

    public abstract esd<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, fh2 fh2Var) throws JsonMappingException;

    public abstract esd<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, fh2 fh2Var) throws JsonMappingException;

    public abstract esd<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, fh2 fh2Var) throws JsonMappingException;

    public abstract q4q findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException;

    public abstract b findValueInstantiator(DeserializationContext deserializationContext, fh2 fh2Var) throws JsonMappingException;

    public abstract JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException;

    public abstract a withAbstractTypeResolver(x10 x10Var);

    public abstract a withAdditionalDeserializers(oz5 oz5Var);

    public abstract a withAdditionalKeyDeserializers(wzd wzdVar);

    public abstract a withDeserializerModifier(hh2 hh2Var);

    public abstract a withValueInstantiators(pnq pnqVar);
}
