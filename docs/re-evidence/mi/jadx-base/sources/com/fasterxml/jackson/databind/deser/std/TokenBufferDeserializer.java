package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import defpackage.bip;
import defpackage.qqd;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class TokenBufferDeserializer extends StdScalarDeserializer<bip> {
    private static final long serialVersionUID = 1;

    public TokenBufferDeserializer() {
        super((Class<?>) bip.class);
    }

    public bip createBufferInstance(JsonParser jsonParser) {
        return new bip(jsonParser);
    }

    @Override // defpackage.esd
    public bip deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return createBufferInstance(jsonParser).l1(jsonParser, deserializationContext);
    }
}
