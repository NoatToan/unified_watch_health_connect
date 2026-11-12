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
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class StringCollectionSerializer extends StaticListSerializerBase<Collection<String>> {
    public static final StringCollectionSerializer instance = new StringCollectionSerializer();

    public StringCollectionSerializer() {
        super(Collection.class);
    }

    private final void serializeContents(Collection<String> collection, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        int i = 0;
        try {
            for (String str : collection) {
                if (str == null) {
                    wwlVar.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonGenerator.Q0(str);
                }
                i++;
            }
        } catch (Exception e) {
            wrapAndThrow(wwlVar, e, collection, i);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public eud<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new StringCollectionSerializer(this, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public void acceptContentVisitor(yrd yrdVar) throws JsonMappingException {
        yrdVar.c(JsonFormatTypes.STRING);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public zsd contentSchema() {
        return createSchemaNode("string", true);
    }

    public StringCollectionSerializer(StringCollectionSerializer stringCollectionSerializer, Boolean bool) {
        super(stringCollectionSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(Collection<String> collection, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.M(collection);
        int size = collection.size();
        if (size == 1 && ((this._unwrapSingle == null && wwlVar.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(collection, jsonGenerator, wwlVar);
            return;
        }
        jsonGenerator.M0(size);
        serializeContents(collection, jsonGenerator, wwlVar);
        jsonGenerator.i0();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase, defpackage.eud
    public void serializeWithType(Collection<String> collection, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        jsonGenerator.M(collection);
        WritableTypeId writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.d(collection, JsonToken.START_ARRAY));
        serializeContents(collection, jsonGenerator, wwlVar);
        e5qVar.h(jsonGenerator, writableTypeIdG);
    }
}
