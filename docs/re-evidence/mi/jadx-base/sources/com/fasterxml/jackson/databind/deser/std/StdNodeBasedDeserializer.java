package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.bqk;
import defpackage.esd;
import defpackage.q4q;
import defpackage.zsd;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class StdNodeBasedDeserializer<T> extends StdDeserializer<T> implements bqk {
    private static final long serialVersionUID = 1;
    protected esd<Object> _treeDeserializer;

    public StdNodeBasedDeserializer(JavaType javaType) {
        super(javaType);
    }

    public abstract T convert(zsd zsdVar, DeserializationContext deserializationContext) throws IOException;

    @Override // defpackage.esd
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return convert((zsd) this._treeDeserializer.deserialize(jsonParser, deserializationContext), deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return convert((zsd) this._treeDeserializer.deserializeWithType(jsonParser, deserializationContext, q4qVar), deserializationContext);
    }

    @Override // defpackage.bqk
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        this._treeDeserializer = deserializationContext.findRootValueDeserializer(deserializationContext.constructType(zsd.class));
    }

    public StdNodeBasedDeserializer(Class<T> cls) {
        super((Class<?>) cls);
    }

    public StdNodeBasedDeserializer(StdNodeBasedDeserializer<?> stdNodeBasedDeserializer) {
        super(stdNodeBasedDeserializer);
        this._treeDeserializer = stdNodeBasedDeserializer._treeDeserializer;
    }
}
