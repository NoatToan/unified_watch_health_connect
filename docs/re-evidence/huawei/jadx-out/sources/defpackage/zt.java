package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes21.dex */
public final class zt extends SettableBeanProperty {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final acj f54560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f54561c;
    protected final transient Field e;

    public zt(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, acj acjVar) {
        super(beanPropertyDefinition, javaType, typeDeserializer, annotations);
        this.f54560b = acjVar;
        this.e = acjVar.getAnnotated();
        this.f54561c = aaa.c(this._nullProvider);
    }

    protected zt(zt ztVar, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider) {
        super(ztVar, jsonDeserializer, nullValueProvider);
        this.f54560b = ztVar.f54560b;
        this.e = ztVar.e;
        this.f54561c = aaa.c(nullValueProvider);
    }

    protected zt(zt ztVar, ys ysVar) {
        super(ztVar, ysVar);
        this.f54560b = ztVar.f54560b;
        this.e = ztVar.e;
        this.f54561c = ztVar.f54561c;
    }

    protected zt(zt ztVar) {
        super(ztVar);
        acj acjVar = ztVar.f54560b;
        this.f54560b = acjVar;
        Field annotated = acjVar.getAnnotated();
        if (annotated == null) {
            throw new IllegalArgumentException("Missing field (broken JDK (de)serialization?)");
        }
        this.e = annotated;
        this.f54561c = ztVar.f54561c;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(ys ysVar) {
        return new zt(this, ysVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
        if (this._valueDeserializer == jsonDeserializer) {
            return this;
        }
        return new zt(this, jsonDeserializer, this._valueDeserializer == this._nullProvider ? jsonDeserializer : this._nullProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider) {
        return new zt(this, this._valueDeserializer, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(yi yiVar) {
        ahw.a(this.e, yiVar.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        acj acjVar = this.f54560b;
        if (acjVar == null) {
            return null;
        }
        return (A) acjVar.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this.f54560b;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object objDeserializeWithType;
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            if (this.f54561c) {
                return;
            } else {
                objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
            }
        } else if (this._valueTypeDeserializer == null) {
            Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
            if (objDeserialize != null) {
                objDeserializeWithType = objDeserialize;
            } else if (this.f54561c) {
                return;
            } else {
                objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
            }
        } else {
            objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, this._valueTypeDeserializer);
        }
        try {
            this.e.set(obj, objDeserializeWithType);
        } catch (Exception e) {
            _throwAsIOE(jsonParser, e, objDeserializeWithType);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object objDeserializeWithType;
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            if (!this.f54561c) {
                objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                try {
                    this.e.set(obj, objDeserializeWithType);
                    return obj;
                } catch (Exception e) {
                    _throwAsIOE(jsonParser, e, objDeserializeWithType);
                }
            }
        } else {
            if (this._valueTypeDeserializer == null) {
                Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                if (objDeserialize != null) {
                    objDeserializeWithType = objDeserialize;
                } else if (!this.f54561c) {
                    objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                }
            } else {
                objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, this._valueTypeDeserializer);
            }
            this.e.set(obj, objDeserializeWithType);
            return obj;
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void set(Object obj, Object obj2) throws IOException {
        try {
            this.e.set(obj, obj2);
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        try {
            this.e.set(obj, obj2);
            return obj;
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
            return obj;
        }
    }

    Object readResolve() {
        return new zt(this);
    }
}
