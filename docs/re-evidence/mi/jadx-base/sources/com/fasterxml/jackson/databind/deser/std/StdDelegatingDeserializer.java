package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.aj4;
import defpackage.ak4;
import defpackage.bqk;
import defpackage.esd;
import defpackage.h04;
import defpackage.q4q;
import defpackage.z1h;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class StdDelegatingDeserializer<T> extends StdDeserializer<T> implements aj4, bqk {
    private static final long serialVersionUID = 1;
    protected final ak4<Object, T> _converter;
    protected final esd<Object> _delegateDeserializer;
    protected final JavaType _delegateType;

    public StdDelegatingDeserializer(ak4<?, T> ak4Var) {
        super((Class<?>) Object.class);
        this._converter = ak4Var;
        this._delegateType = null;
        this._delegateDeserializer = null;
    }

    public Object _handleIncompatibleUpdateValue(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        throw new UnsupportedOperationException(String.format("Cannot update object of type %s (using deserializer for type %s)" + obj.getClass().getName(), this._delegateType));
    }

    public T convertValue(Object obj) {
        return this._converter.convert(obj);
    }

    @Override // defpackage.aj4
    public esd<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        esd<?> esdVar = this._delegateDeserializer;
        if (esdVar != null) {
            esd<?> esdVarHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(esdVar, beanProperty, this._delegateType);
            return esdVarHandleSecondaryContextualization != this._delegateDeserializer ? withDelegate(this._converter, this._delegateType, esdVarHandleSecondaryContextualization) : this;
        }
        JavaType javaTypeA = this._converter.a(deserializationContext.getTypeFactory());
        return withDelegate(this._converter, javaTypeA, deserializationContext.findContextualValueDeserializer(javaTypeA, beanProperty));
    }

    @Override // defpackage.esd
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objDeserialize = this._delegateDeserializer.deserialize(jsonParser, deserializationContext);
        if (objDeserialize == null) {
            return null;
        }
        return convertValue(objDeserialize);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        Object objDeserialize = this._delegateDeserializer.deserialize(jsonParser, deserializationContext);
        if (objDeserialize == null) {
            return null;
        }
        return convertValue(objDeserialize);
    }

    @Override // defpackage.esd
    public esd<?> getDelegatee() {
        return this._delegateDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Class<?> handledType() {
        return this._delegateDeserializer.handledType();
    }

    @Override // defpackage.bqk
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        z1h z1hVar = this._delegateDeserializer;
        if (z1hVar == null || !(z1hVar instanceof bqk)) {
            return;
        }
        ((bqk) z1hVar).resolve(deserializationContext);
    }

    @Override // defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._delegateDeserializer.supportsUpdate(deserializationConfig);
    }

    public StdDelegatingDeserializer<T> withDelegate(ak4<Object, T> ak4Var, JavaType javaType, esd<?> esdVar) {
        h04.j0(StdDelegatingDeserializer.class, this, "withDelegate");
        return new StdDelegatingDeserializer<>(ak4Var, javaType, esdVar);
    }

    @Override // defpackage.esd
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (this._delegateType.getRawClass().isAssignableFrom(obj.getClass())) {
            return (T) this._delegateDeserializer.deserialize(jsonParser, deserializationContext, obj);
        }
        return (T) _handleIncompatibleUpdateValue(jsonParser, deserializationContext, obj);
    }

    public StdDelegatingDeserializer(ak4<Object, T> ak4Var, JavaType javaType, esd<?> esdVar) {
        super(javaType);
        this._converter = ak4Var;
        this._delegateType = javaType;
        this._delegateDeserializer = esdVar;
    }

    public StdDelegatingDeserializer(StdDelegatingDeserializer<T> stdDelegatingDeserializer) {
        super(stdDelegatingDeserializer);
        this._converter = stdDelegatingDeserializer._converter;
        this._delegateType = stdDelegatingDeserializer._delegateType;
        this._delegateDeserializer = stdDelegatingDeserializer._delegateDeserializer;
    }
}
