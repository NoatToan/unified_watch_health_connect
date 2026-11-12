package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import defpackage.e5q;
import defpackage.wwl;
import java.io.IOException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public class TimeZoneSerializer extends StdScalarSerializer<TimeZone> {
    public TimeZoneSerializer() {
        super(TimeZone.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(TimeZone timeZone, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.Q0(timeZone.getID());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, defpackage.eud
    public void serializeWithType(TimeZone timeZone, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        WritableTypeId writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.f(timeZone, TimeZone.class, JsonToken.VALUE_STRING));
        serialize(timeZone, jsonGenerator, wwlVar);
        e5qVar.h(jsonGenerator, writableTypeIdG);
    }
}
