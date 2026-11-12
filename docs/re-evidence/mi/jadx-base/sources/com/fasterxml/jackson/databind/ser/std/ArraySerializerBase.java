package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import defpackage.cj4;
import defpackage.e5q;
import defpackage.eud;
import defpackage.wwl;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ArraySerializerBase<T> extends ContainerSerializer<T> implements cj4 {
    protected final BeanProperty _property;
    protected final Boolean _unwrapSingle;

    public ArraySerializerBase(Class<T> cls) {
        super(cls);
        this._property = null;
        this._unwrapSingle = null;
    }

    public final boolean _shouldUnwrapSingle(wwl wwlVar) {
        Boolean bool = this._unwrapSingle;
        return bool == null ? wwlVar.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : bool.booleanValue();
    }

    public abstract eud<?> _withResolved(BeanProperty beanProperty, Boolean bool);

    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value valueFindFormatOverrides;
        Boolean feature;
        return (beanProperty == null || (valueFindFormatOverrides = findFormatOverrides(wwlVar, beanProperty, handledType())) == null || (feature = valueFindFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) == this._unwrapSingle) ? this : _withResolved(beanProperty, feature);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(T t, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        if (_shouldUnwrapSingle(wwlVar) && hasSingleElement(t)) {
            serializeContents(t, jsonGenerator, wwlVar);
            return;
        }
        jsonGenerator.M(t);
        jsonGenerator.L0();
        serializeContents(t, jsonGenerator, wwlVar);
        jsonGenerator.i0();
    }

    public abstract void serializeContents(T t, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException;

    @Override // defpackage.eud
    public final void serializeWithType(T t, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        jsonGenerator.M(t);
        WritableTypeId writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.d(t, JsonToken.START_ARRAY));
        serializeContents(t, jsonGenerator, wwlVar);
        e5qVar.h(jsonGenerator, writableTypeIdG);
    }

    @Deprecated
    public ArraySerializerBase(Class<T> cls, BeanProperty beanProperty) {
        super(cls);
        this._property = beanProperty;
        this._unwrapSingle = null;
    }

    public ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase) {
        super(arraySerializerBase._handledType, false);
        this._property = arraySerializerBase._property;
        this._unwrapSingle = arraySerializerBase._unwrapSingle;
    }

    public ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase, BeanProperty beanProperty, Boolean bool) {
        super(arraySerializerBase._handledType, false);
        this._property = beanProperty;
        this._unwrapSingle = bool;
    }

    @Deprecated
    public ArraySerializerBase(ArraySerializerBase<?> arraySerializerBase, BeanProperty beanProperty) {
        super(arraySerializerBase._handledType, false);
        this._property = beanProperty;
        this._unwrapSingle = arraySerializerBase._unwrapSingle;
    }
}
