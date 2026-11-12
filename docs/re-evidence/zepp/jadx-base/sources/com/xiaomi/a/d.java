package com.xiaomi.a;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* JADX INFO: loaded from: classes18.dex */
public class d extends BeanPropertyWriter {
    public final Object a;

    public d(BeanPropertyWriter beanPropertyWriter, Object obj) {
        super(beanPropertyWriter);
        this.a = obj;
    }

    public d(d dVar, PropertyName propertyName) {
        super(dVar, propertyName);
        this.a = dVar.a;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public BeanPropertyWriter _new(PropertyName propertyName) {
        return new d(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        Object obj2;
        if (this._nullSerializer == null && ((obj2 = get(obj)) == null || obj2.equals(this.a))) {
            return;
        }
        super.serializeAsField(obj, jsonGenerator, serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public BeanPropertyWriter unwrappingWriter(NameTransformer nameTransformer) {
        return new g(this, nameTransformer, this.a);
    }
}
