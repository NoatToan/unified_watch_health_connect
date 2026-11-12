package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.bud;
import defpackage.e5q;
import defpackage.ksd;
import defpackage.qqd;
import defpackage.wwl;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class SerializableSerializer extends StdSerializer<bud> {
    public static final SerializableSerializer instance = new SerializableSerializer();

    public SerializableSerializer() {
        super(bud.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        ksdVar.k(javaType);
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, bud budVar) {
        if (budVar instanceof bud.a) {
            return ((bud.a) budVar).g(wwlVar);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(bud budVar, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        budVar.serialize(jsonGenerator, wwlVar);
    }

    @Override // defpackage.eud
    public final void serializeWithType(bud budVar, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        budVar.serializeWithType(jsonGenerator, wwlVar, e5qVar);
    }
}
