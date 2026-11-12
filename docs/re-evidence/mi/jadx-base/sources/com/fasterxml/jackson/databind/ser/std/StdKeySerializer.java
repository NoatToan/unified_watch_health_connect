package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import defpackage.wwl;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class StdKeySerializer extends StdSerializer<Object> {
    public StdKeySerializer() {
        super(Object.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.r0(obj.toString());
    }
}
