package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import defpackage.e5q;
import defpackage.eud;
import defpackage.qqd;
import defpackage.wwl;
import defpackage.yrd;
import defpackage.zsd;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public final class IndexedStringListSerializer extends StaticListSerializerBase<List<String>> {
    public static final IndexedStringListSerializer instance = new IndexedStringListSerializer();
    private static final long serialVersionUID = 1;

    public IndexedStringListSerializer() {
        super(List.class);
    }

    private final void serializeContents(List<String> list, JsonGenerator jsonGenerator, wwl wwlVar, int i) throws IOException {
        jsonGenerator.M(list);
        for (int i2 = 0; i2 < i; i2++) {
            try {
                String str = list.get(i2);
                if (str == null) {
                    wwlVar.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonGenerator.Q0(str);
                }
            } catch (Exception e) {
                wrapAndThrow(wwlVar, e, list, i2);
                return;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public eud<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new IndexedStringListSerializer(this, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public void acceptContentVisitor(yrd yrdVar) throws JsonMappingException {
        yrdVar.c(JsonFormatTypes.STRING);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public zsd contentSchema() {
        return createSchemaNode("string", true);
    }

    public IndexedStringListSerializer(IndexedStringListSerializer indexedStringListSerializer, Boolean bool) {
        super(indexedStringListSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(List<String> list, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        int size = list.size();
        if (size == 1 && ((this._unwrapSingle == null && wwlVar.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(list, jsonGenerator, wwlVar, 1);
            return;
        }
        jsonGenerator.M0(size);
        serializeContents(list, jsonGenerator, wwlVar, size);
        jsonGenerator.i0();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public void serializeWithType(List<String> list, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        WritableTypeId writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.d(list, JsonToken.START_ARRAY));
        serializeContents(list, jsonGenerator, wwlVar, list.size());
        e5qVar.h(jsonGenerator, writableTypeIdG);
    }
}
