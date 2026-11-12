package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import defpackage.e5q;
import defpackage.wwl;
import java.io.IOException;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes4.dex */
public class NioPathSerializer extends StdScalarSerializer<Path> {
    private static final long serialVersionUID = 1;

    public NioPathSerializer() {
        super(Path.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(Path path, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.Q0(path.toUri().toString());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, defpackage.eud
    public void serializeWithType(Path path, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        WritableTypeId writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.f(path, Path.class, JsonToken.VALUE_STRING));
        serialize(path, jsonGenerator, wwlVar);
        e5qVar.h(jsonGenerator, writableTypeIdG);
    }
}
