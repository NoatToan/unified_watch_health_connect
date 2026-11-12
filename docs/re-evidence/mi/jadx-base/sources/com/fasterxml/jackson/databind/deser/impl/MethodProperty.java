package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import defpackage.esd;
import defpackage.ih2;
import defpackage.ld1;
import defpackage.q4q;
import defpackage.z1h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class MethodProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    protected final AnnotatedMethod _annotated;
    protected final transient Method _setter;
    protected final boolean _skipNulls;

    public MethodProperty(ih2 ih2Var, JavaType javaType, q4q q4qVar, ld1 ld1Var, AnnotatedMethod annotatedMethod) {
        super(ih2Var, javaType, q4qVar, ld1Var);
        this._annotated = annotatedMethod;
        this._setter = annotatedMethod.getAnnotated();
        this._skipNulls = NullsConstantProvider.isSkipper(this._nullProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object objDeserializeWithType;
        if (!jsonParser.y0(JsonToken.VALUE_NULL)) {
            q4q q4qVar = this._valueTypeDeserializer;
            if (q4qVar == null) {
                Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                if (objDeserialize != null) {
                    objDeserializeWithType = objDeserialize;
                } else if (this._skipNulls) {
                    return;
                } else {
                    objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                }
            } else {
                objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, q4qVar);
            }
        } else if (this._skipNulls) {
            return;
        } else {
            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
        }
        try {
            this._setter.invoke(obj, objDeserializeWithType);
        } catch (Exception e) {
            _throwAsIOE(jsonParser, e, objDeserializeWithType);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object objDeserializeWithType;
        if (!jsonParser.y0(JsonToken.VALUE_NULL)) {
            q4q q4qVar = this._valueTypeDeserializer;
            if (q4qVar == null) {
                Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                if (objDeserialize != null) {
                    objDeserializeWithType = objDeserialize;
                } else {
                    if (this._skipNulls) {
                        return obj;
                    }
                    objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                }
            } else {
                objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, q4qVar);
            }
        } else {
            if (this._skipNulls) {
                return obj;
            }
            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
        }
        try {
            Object objInvoke = this._setter.invoke(obj, objDeserializeWithType);
            return objInvoke == null ? obj : objInvoke;
        } catch (Exception e) {
            _throwAsIOE(jsonParser, e, objDeserializeWithType);
            return null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(DeserializationConfig deserializationConfig) {
        this._annotated.fixAccess(deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedMethod annotatedMethod = this._annotated;
        if (annotatedMethod == null) {
            return null;
        }
        return (A) annotatedMethod.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public Object readResolve() {
        return new MethodProperty(this, this._annotated.getAnnotated());
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void set(Object obj, Object obj2) throws IOException {
        try {
            this._setter.invoke(obj, obj2);
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        try {
            Object objInvoke = this._setter.invoke(obj, obj2);
            return objInvoke == null ? obj : objInvoke;
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
            return null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(PropertyName propertyName) {
        return new MethodProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(z1h z1hVar) {
        return new MethodProperty(this, this._valueDeserializer, z1hVar);
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
        return new MethodProperty(this, esdVar, z1hVar);
    }

    public MethodProperty(MethodProperty methodProperty, esd<?> esdVar, z1h z1hVar) {
        super(methodProperty, esdVar, z1hVar);
        this._annotated = methodProperty._annotated;
        this._setter = methodProperty._setter;
        this._skipNulls = NullsConstantProvider.isSkipper(z1hVar);
    }

    public MethodProperty(MethodProperty methodProperty, PropertyName propertyName) {
        super(methodProperty, propertyName);
        this._annotated = methodProperty._annotated;
        this._setter = methodProperty._setter;
        this._skipNulls = methodProperty._skipNulls;
    }

    public MethodProperty(MethodProperty methodProperty, Method method) {
        super(methodProperty);
        this._annotated = methodProperty._annotated;
        this._setter = method;
        this._skipNulls = methodProperty._skipNulls;
    }
}
