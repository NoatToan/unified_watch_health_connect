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
import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes21.dex */
public final class aam extends SettableBeanProperty {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Method f179a;
    protected final aco d;

    public aam(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, aco acoVar) {
        super(beanPropertyDefinition, javaType, typeDeserializer, annotations);
        this.d = acoVar;
        this.f179a = acoVar.getAnnotated();
    }

    protected aam(aam aamVar, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider) {
        super(aamVar, jsonDeserializer, nullValueProvider);
        this.d = aamVar.d;
        this.f179a = aamVar.f179a;
    }

    protected aam(aam aamVar, ys ysVar) {
        super(aamVar, ysVar);
        this.d = aamVar.d;
        this.f179a = aamVar.f179a;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(ys ysVar) {
        return new aam(this, ysVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
        if (this._valueDeserializer == jsonDeserializer) {
            return this;
        }
        return new aam(this, jsonDeserializer, this._valueDeserializer == this._nullProvider ? jsonDeserializer : this._nullProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider) {
        return new aam(this, this._valueDeserializer, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(yi yiVar) {
        this.d.fixAccess(yiVar.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.d.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            return;
        }
        if (this._valueTypeDeserializer != null) {
            deserializationContext.reportBadDefinition(getType(), String.format("Problem deserializing 'setterless' property (\"%s\"): no way to handle typed deser with setterless yet", getName()));
        }
        try {
            Object objInvoke = this.f179a.invoke(obj, null);
            if (objInvoke == null) {
                deserializationContext.reportBadDefinition(getType(), String.format("Problem deserializing 'setterless' property '%s': get method returned null", getName()));
            }
            this._valueDeserializer.deserialize(jsonParser, deserializationContext, objInvoke);
        } catch (Exception e) {
            _throwAsIOE(jsonParser, e);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        deserializeAndSet(jsonParser, deserializationContext, obj);
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void set(Object obj, Object obj2) throws IOException {
        throw new UnsupportedOperationException("Should never call `set()` on setterless property ('" + getName() + Constants.RIGHT_BRACKET);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        set(obj, obj2);
        return obj;
    }
}
