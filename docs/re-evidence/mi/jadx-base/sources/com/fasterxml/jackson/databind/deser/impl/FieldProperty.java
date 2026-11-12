package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import defpackage.esd;
import defpackage.h04;
import defpackage.ih2;
import defpackage.ld1;
import defpackage.q4q;
import defpackage.z1h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public final class FieldProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    protected final AnnotatedField _annotated;
    protected final transient Field _field;
    protected final boolean _skipNulls;

    public FieldProperty(ih2 ih2Var, JavaType javaType, q4q q4qVar, ld1 ld1Var, AnnotatedField annotatedField) {
        super(ih2Var, javaType, q4qVar, ld1Var);
        this._annotated = annotatedField;
        this._field = annotatedField.getAnnotated();
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
            this._field.set(obj, objDeserializeWithType);
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
            this._field.set(obj, objDeserializeWithType);
        } catch (Exception e) {
            _throwAsIOE(jsonParser, e, objDeserializeWithType);
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(DeserializationConfig deserializationConfig) {
        h04.f(this._field, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedField annotatedField = this._annotated;
        if (annotatedField == null) {
            return null;
        }
        return (A) annotatedField.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public Object readResolve() {
        return new FieldProperty(this);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void set(Object obj, Object obj2) throws IOException {
        try {
            this._field.set(obj, obj2);
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        try {
            this._field.set(obj, obj2);
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(PropertyName propertyName) {
        return new FieldProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(z1h z1hVar) {
        return new FieldProperty(this, this._valueDeserializer, z1hVar);
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
        return new FieldProperty(this, esdVar, z1hVar);
    }

    public FieldProperty(FieldProperty fieldProperty, esd<?> esdVar, z1h z1hVar) {
        super(fieldProperty, esdVar, z1hVar);
        this._annotated = fieldProperty._annotated;
        this._field = fieldProperty._field;
        this._skipNulls = NullsConstantProvider.isSkipper(z1hVar);
    }

    public FieldProperty(FieldProperty fieldProperty, PropertyName propertyName) {
        super(fieldProperty, propertyName);
        this._annotated = fieldProperty._annotated;
        this._field = fieldProperty._field;
        this._skipNulls = fieldProperty._skipNulls;
    }

    public FieldProperty(FieldProperty fieldProperty) {
        super(fieldProperty);
        AnnotatedField annotatedField = fieldProperty._annotated;
        this._annotated = annotatedField;
        Field annotated = annotatedField.getAnnotated();
        if (annotated != null) {
            this._field = annotated;
            this._skipNulls = fieldProperty._skipNulls;
            return;
        }
        throw new IllegalArgumentException("Missing field (broken JDK (de)serialization?)");
    }
}
