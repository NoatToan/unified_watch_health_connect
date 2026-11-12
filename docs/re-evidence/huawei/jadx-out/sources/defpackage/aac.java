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
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes21.dex */
public final class aac extends SettableBeanProperty {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final transient Method f112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final aco f113b;
    protected final boolean e;

    public aac(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, aco acoVar) {
        super(beanPropertyDefinition, javaType, typeDeserializer, annotations);
        this.f113b = acoVar;
        this.f112a = acoVar.getAnnotated();
        this.e = aaa.c(this._nullProvider);
    }

    protected aac(aac aacVar, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider) {
        super(aacVar, jsonDeserializer, nullValueProvider);
        this.f113b = aacVar.f113b;
        this.f112a = aacVar.f112a;
        this.e = aaa.c(nullValueProvider);
    }

    protected aac(aac aacVar, ys ysVar) {
        super(aacVar, ysVar);
        this.f113b = aacVar.f113b;
        this.f112a = aacVar.f112a;
        this.e = aacVar.e;
    }

    protected aac(aac aacVar, Method method) {
        super(aacVar);
        this.f113b = aacVar.f113b;
        this.f112a = method;
        this.e = aacVar.e;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(ys ysVar) {
        return new aac(this, ysVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
        if (this._valueDeserializer == jsonDeserializer) {
            return this;
        }
        return new aac(this, jsonDeserializer, this._valueDeserializer == this._nullProvider ? jsonDeserializer : this._nullProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider) {
        return new aac(this, this._valueDeserializer, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(yi yiVar) {
        this.f113b.fixAccess(yiVar.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        aco acoVar = this.f113b;
        if (acoVar == null) {
            return null;
        }
        return (A) acoVar.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this.f113b;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object objDeserializeWithType;
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            if (this.e) {
                return;
            } else {
                objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
            }
        } else if (this._valueTypeDeserializer == null) {
            Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
            if (objDeserialize != null) {
                objDeserializeWithType = objDeserialize;
            } else if (this.e) {
                return;
            } else {
                objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
            }
        } else {
            objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, this._valueTypeDeserializer);
        }
        try {
            this.f112a.invoke(obj, objDeserializeWithType);
        } catch (Exception e) {
            _throwAsIOE(jsonParser, e, objDeserializeWithType);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043 A[RETURN] */
    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object objDeserializeWithType;
        Object objInvoke;
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            if (!this.e) {
                objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                try {
                    objInvoke = this.f112a.invoke(obj, objDeserializeWithType);
                    if (objInvoke == null) {
                        return objInvoke;
                    }
                } catch (Exception e) {
                    _throwAsIOE(jsonParser, e, objDeserializeWithType);
                    return null;
                }
            }
        } else {
            if (this._valueTypeDeserializer == null) {
                Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                if (objDeserialize != null) {
                    objDeserializeWithType = objDeserialize;
                } else if (!this.e) {
                    objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                }
            } else {
                objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, this._valueTypeDeserializer);
            }
            objInvoke = this.f112a.invoke(obj, objDeserializeWithType);
            if (objInvoke == null) {
                return objInvoke;
            }
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void set(Object obj, Object obj2) throws IOException {
        try {
            this.f112a.invoke(obj, obj2);
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        try {
            Object objInvoke = this.f112a.invoke(obj, obj2);
            return objInvoke == null ? obj : objInvoke;
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
            return null;
        }
    }

    Object readResolve() {
        return new aac(this, this.f113b.getAnnotated());
    }
}
