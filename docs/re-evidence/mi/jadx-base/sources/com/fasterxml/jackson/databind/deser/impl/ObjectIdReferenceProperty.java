package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import defpackage.esd;
import defpackage.z1h;
import defpackage.z3h;
import java.io.IOException;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
public class ObjectIdReferenceProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    private final SettableBeanProperty _forward;

    public static final class a extends com.fasterxml.jackson.databind.deser.impl.a.AbstractC0178a {
        public final ObjectIdReferenceProperty c;
        public final Object d;

        public a(ObjectIdReferenceProperty objectIdReferenceProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this.c = objectIdReferenceProperty;
            this.d = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.a.AbstractC0178a
        public void c(Object obj, Object obj2) throws IOException {
            if (d(obj)) {
                this.c.set(this.d, obj2);
                return;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public ObjectIdReferenceProperty(SettableBeanProperty settableBeanProperty, z3h z3hVar) {
        super(settableBeanProperty);
        this._forward = settableBeanProperty;
        this._objectIdInfo = z3hVar;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        deserializeSetAndReturn(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        try {
            return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e) {
            if (this._objectIdInfo == null && this._valueDeserializer.getObjectIdReader() == null) {
                throw JsonMappingException.from(jsonParser, "Unresolved forward reference but no identity info", e);
            }
            e.getRoid().a(new a(this, e, this._type.getRawClass(), obj));
            return null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this._forward;
        if (settableBeanProperty != null) {
            settableBeanProperty.fixAccess(deserializationConfig);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this._forward.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public int getCreatorIndex() {
        return this._forward.getCreatorIndex();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._forward.getMember();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void set(Object obj, Object obj2) throws IOException {
        this._forward.set(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        return this._forward.setAndReturn(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(PropertyName propertyName) {
        return new ObjectIdReferenceProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(z1h z1hVar) {
        return new ObjectIdReferenceProperty(this, this._valueDeserializer, z1hVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withValueDeserializer(esd<?> esdVar) {
        esd<?> esdVar2 = this._valueDeserializer;
        if (esdVar2 == esdVar) {
            return this;
        }
        z1h z1hVar = this._nullProvider;
        if (esdVar2 == z1hVar) {
            z1hVar = esdVar;
        }
        return new ObjectIdReferenceProperty(this, esdVar, z1hVar);
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, esd<?> esdVar, z1h z1hVar) {
        super(objectIdReferenceProperty, esdVar, z1hVar);
        this._forward = objectIdReferenceProperty._forward;
        this._objectIdInfo = objectIdReferenceProperty._objectIdInfo;
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, PropertyName propertyName) {
        super(objectIdReferenceProperty, propertyName);
        this._forward = objectIdReferenceProperty._forward;
        this._objectIdInfo = objectIdReferenceProperty._objectIdInfo;
    }
}
