package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import defpackage.esd;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class ObjectIdReader implements Serializable {
    private static final long serialVersionUID = 1;
    protected final esd<Object> _deserializer;
    protected final JavaType _idType;
    public final ObjectIdGenerator<?> generator;
    public final SettableBeanProperty idProperty;
    public final PropertyName propertyName;
    public final com.fasterxml.jackson.annotation.a resolver;

    public ObjectIdReader(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, esd<?> esdVar, SettableBeanProperty settableBeanProperty, com.fasterxml.jackson.annotation.a aVar) {
        this._idType = javaType;
        this.propertyName = propertyName;
        this.generator = objectIdGenerator;
        this.resolver = aVar;
        this._deserializer = esdVar;
        this.idProperty = settableBeanProperty;
    }

    public static ObjectIdReader construct(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, esd<?> esdVar, SettableBeanProperty settableBeanProperty, com.fasterxml.jackson.annotation.a aVar) {
        return new ObjectIdReader(javaType, propertyName, objectIdGenerator, esdVar, settableBeanProperty, aVar);
    }

    public esd<Object> getDeserializer() {
        return this._deserializer;
    }

    public JavaType getIdType() {
        return this._idType;
    }

    public boolean isValidReferencePropertyName(String str, JsonParser jsonParser) {
        return this.generator.isValidReferencePropertyName(str, jsonParser);
    }

    public boolean maySerializeAsObject() {
        return this.generator.maySerializeAsObject();
    }

    public Object readObjectReference(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this._deserializer.deserialize(jsonParser, deserializationContext);
    }
}
