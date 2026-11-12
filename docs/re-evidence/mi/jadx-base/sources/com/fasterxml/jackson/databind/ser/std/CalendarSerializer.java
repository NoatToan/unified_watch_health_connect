package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import defpackage.qqd;
import defpackage.wwl;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class CalendarSerializer extends DateTimeSerializerBase<Calendar> {
    public static final CalendarSerializer instance = new CalendarSerializer();

    public CalendarSerializer() {
        this(null, null);
    }

    public CalendarSerializer(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    public long _timestamp(Calendar calendar) {
        if (calendar == null) {
            return 0L;
        }
        return calendar.getTimeInMillis();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(Calendar calendar, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        if (_asTimestamp(wwlVar)) {
            jsonGenerator.w0(_timestamp(calendar));
        } else {
            _serializeAsString(calendar.getTime(), jsonGenerator, wwlVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* JADX INFO: renamed from: withFormat, reason: merged with bridge method [inline-methods] */
    public DateTimeSerializerBase<Calendar> withFormat2(Boolean bool, DateFormat dateFormat) {
        return new CalendarSerializer(bool, dateFormat);
    }
}
