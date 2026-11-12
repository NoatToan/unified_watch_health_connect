package com.xiaomi.a;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* JADX INFO: loaded from: classes18.dex */
public class g extends UnwrappingBeanPropertyWriter {
    public final Object a;

    public g(BeanPropertyWriter beanPropertyWriter, NameTransformer nameTransformer, Object obj) {
        super(beanPropertyWriter, nameTransformer);
        this.a = obj;
    }

    public g(g gVar, NameTransformer nameTransformer, SerializedString serializedString) {
        super(gVar, nameTransformer, serializedString);
        this.a = gVar.a;
    }

    @Override // com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter
    public UnwrappingBeanPropertyWriter _new(NameTransformer nameTransformer, SerializedString serializedString) {
        return new g(this, nameTransformer, serializedString);
    }

    @Override // com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter, com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        Object obj2;
        if (this._nullSerializer == null && ((obj2 = get(obj)) == null || obj2.equals(this.a))) {
            return;
        }
        super.serializeAsField(obj, jsonGenerator, serializerProvider);
    }
}
