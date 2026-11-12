package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import defpackage.esd;
import defpackage.h04;
import defpackage.q4q;
import defpackage.vzd;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class SettableAnyProperty implements Serializable {
    private static final long serialVersionUID = 1;
    protected final vzd _keyDeserializer;
    protected final BeanProperty _property;
    protected final AnnotatedMember _setter;
    final boolean _setterIsField;
    protected final JavaType _type;
    protected esd<Object> _valueDeserializer;
    protected final q4q _valueTypeDeserializer;

    public static class a extends com.fasterxml.jackson.databind.deser.impl.a.AbstractC0178a {
        public final SettableAnyProperty c;
        public final Object d;
        public final String e;

        public a(SettableAnyProperty settableAnyProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj, String str) {
            super(unresolvedForwardReference, cls);
            this.c = settableAnyProperty;
            this.d = obj;
            this.e = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.a.AbstractC0178a
        public void c(Object obj, Object obj2) throws IOException {
            if (d(obj)) {
                this.c.set(this.d, this.e, obj2);
                return;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj.toString() + "] that wasn't previously registered.");
        }
    }

    @Deprecated
    public SettableAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, esd<Object> esdVar, q4q q4qVar) {
        this(beanProperty, annotatedMember, javaType, null, esdVar, q4qVar);
    }

    private String getClassName() {
        return this._setter.getDeclaringClass().getName();
    }

    public void _throwAsIOE(Exception exc, Object obj, Object obj2) throws IOException {
        if (!(exc instanceof IllegalArgumentException)) {
            h04.e0(exc);
            h04.f0(exc);
            Throwable thH = h04.H(exc);
            throw new JsonMappingException((Closeable) null, h04.n(thH), thH);
        }
        String strG = h04.g(obj2);
        StringBuilder sb = new StringBuilder("Problem deserializing \"any\" property '");
        sb.append(obj);
        sb.append("' of class " + getClassName() + " (expected type: ");
        sb.append(this._type);
        sb.append("; actual type: ");
        sb.append(strG);
        sb.append(")");
        String strN = h04.n(exc);
        if (strN != null) {
            sb.append(", problem: ");
            sb.append(strN);
        } else {
            sb.append(" (no error message provided)");
        }
        throw new JsonMappingException((Closeable) null, sb.toString(), exc);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.K() == JsonToken.VALUE_NULL) {
            return this._valueDeserializer.getNullValue(deserializationContext);
        }
        q4q q4qVar = this._valueTypeDeserializer;
        return q4qVar != null ? this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, q4qVar) : this._valueDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public final void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        try {
            vzd vzdVar = this._keyDeserializer;
            set(obj, vzdVar == null ? str : vzdVar.deserializeKey(str, deserializationContext), deserialize(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e) {
            if (this._valueDeserializer.getObjectIdReader() == null) {
                throw JsonMappingException.from(jsonParser, "Unresolved forward reference but no identity info.", e);
            }
            e.getRoid().a(new a(this, e, this._type.getRawClass(), obj, str));
        }
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
        this._setter.fixAccess(deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public BeanProperty getProperty() {
        return this._property;
    }

    public JavaType getType() {
        return this._type;
    }

    public boolean hasValueDeserializer() {
        return this._valueDeserializer != null;
    }

    public Object readResolve() {
        AnnotatedMember annotatedMember = this._setter;
        if (annotatedMember == null || annotatedMember.getAnnotated() == null) {
            throw new IllegalArgumentException("Missing method (broken JDK (de)serialization?)");
        }
        return this;
    }

    public void set(Object obj, Object obj2, Object obj3) throws IOException {
        try {
            if (this._setterIsField) {
                Map map = (Map) ((AnnotatedField) this._setter).getValue(obj);
                if (map != null) {
                    map.put(obj2, obj3);
                }
            } else {
                ((AnnotatedMethod) this._setter).callOnWith(obj, obj2, obj3);
            }
        } catch (Exception e) {
            _throwAsIOE(e, obj2, obj3);
        }
    }

    public String toString() {
        return "[any property on class " + getClassName() + "]";
    }

    public SettableAnyProperty withValueDeserializer(esd<Object> esdVar) {
        return new SettableAnyProperty(this._property, this._setter, this._type, this._keyDeserializer, esdVar, this._valueTypeDeserializer);
    }

    public SettableAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, vzd vzdVar, esd<Object> esdVar, q4q q4qVar) {
        this._property = beanProperty;
        this._setter = annotatedMember;
        this._type = javaType;
        this._valueDeserializer = esdVar;
        this._valueTypeDeserializer = q4qVar;
        this._keyDeserializer = vzdVar;
        this._setterIsField = annotatedMember instanceof AnnotatedField;
    }
}
