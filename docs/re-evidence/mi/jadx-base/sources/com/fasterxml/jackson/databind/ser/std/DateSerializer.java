package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import defpackage.qqd;
import defpackage.wwl;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class DateSerializer extends DateTimeSerializerBase<Date> {
    public static final DateSerializer instance = new DateSerializer();

    public DateSerializer() {
        this(null, null);
    }

    public DateSerializer(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    public long _timestamp(Date date) {
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(Date date, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        if (_asTimestamp(wwlVar)) {
            jsonGenerator.w0(_timestamp(date));
        } else {
            _serializeAsString(date, jsonGenerator, wwlVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* JADX INFO: renamed from: withFormat */
    public DateTimeSerializerBase<Date> withFormat2(Boolean bool, DateFormat dateFormat) {
        return new DateSerializer(bool, dateFormat);
    }
}
