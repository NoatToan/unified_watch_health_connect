package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes21.dex */
public final class zv extends SettableBeanProperty.Delegating {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final transient Constructor<?> f54599b;
    protected ach d;

    public zv(SettableBeanProperty settableBeanProperty, Constructor<?> constructor) {
        super(settableBeanProperty);
        this.f54599b = constructor;
    }

    protected zv(SettableBeanProperty settableBeanProperty, ach achVar) {
        super(settableBeanProperty);
        this.d = achVar;
        Constructor<?> annotated = achVar == null ? null : achVar.getAnnotated();
        this.f54599b = annotated;
        if (annotated == null) {
            throw new IllegalArgumentException("Missing constructor (broken JDK (de)serialization?)");
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
    public SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty) {
        return settableBeanProperty == this.delegate ? this : new zv(settableBeanProperty, this.f54599b);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object objNewInstance;
        Object objDeserializeWithType;
        if (jsonParser.currentToken() == JsonToken.VALUE_NULL) {
            objDeserializeWithType = this._valueDeserializer.getNullValue(deserializationContext);
        } else if (this._valueTypeDeserializer != null) {
            objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, this._valueTypeDeserializer);
        } else {
            try {
                objNewInstance = this.f54599b.newInstance(obj);
            } catch (Exception e) {
                ahw.d(e, String.format("Failed to instantiate class %s, problem: %s", this.f54599b.getDeclaringClass().getName(), e.getMessage()));
                objNewInstance = null;
            }
            this._valueDeserializer.deserialize(jsonParser, deserializationContext, objNewInstance);
            objDeserializeWithType = objNewInstance;
        }
        set(obj, objDeserializeWithType);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    Object readResolve() {
        return new zv(this, this.d);
    }

    Object writeReplace() {
        return this.d == null ? new zv(this, new ach(null, this.f54599b, null, null)) : this;
    }
}
