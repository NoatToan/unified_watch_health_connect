package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import defpackage.q4q;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class StdScalarDeserializer<T> extends StdDeserializer<T> {
    private static final long serialVersionUID = 1;

    public StdScalarDeserializer(Class<?> cls) {
        super(cls);
    }

    @Override // defpackage.esd
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        deserializationContext.reportBadMerge(this);
        return deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return q4qVar.deserializeTypedFromScalar(jsonParser, deserializationContext);
    }

    @Override // defpackage.esd
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // defpackage.esd
    public AccessPattern getNullAccessPattern() {
        return AccessPattern.ALWAYS_NULL;
    }

    @Override // defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public StdScalarDeserializer(JavaType javaType) {
        super(javaType);
    }

    public StdScalarDeserializer(StdScalarDeserializer<?> stdScalarDeserializer) {
        super(stdScalarDeserializer);
    }
}
