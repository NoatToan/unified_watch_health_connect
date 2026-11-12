package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class agf extends DateTimeSerializerBase<Date> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final agf f380b = new agf();

    public agf() {
        this(null, null);
    }

    public agf(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public agf withFormat(Boolean bool, DateFormat dateFormat) {
        return new agf(bool, dateFormat);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public long _timestamp(Date date) {
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (_asTimestamp(serializerProvider)) {
            jsonGenerator.writeNumber(_timestamp(date));
        } else {
            _serializeAsString(date, jsonGenerator, serializerProvider);
        }
    }
}
