package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class agg extends DateTimeSerializerBase<Calendar> {
    public static final agg d = new agg();

    public agg() {
        this(null, null);
    }

    public agg(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public agg withFormat(Boolean bool, DateFormat dateFormat) {
        return new agg(bool, dateFormat);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public long _timestamp(Calendar calendar) {
        if (calendar == null) {
            return 0L;
        }
        return calendar.getTimeInMillis();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(Calendar calendar, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (_asTimestamp(serializerProvider)) {
            jsonGenerator.writeNumber(_timestamp(calendar));
        } else {
            _serializeAsString(calendar.getTime(), jsonGenerator, serializerProvider);
        }
    }
}
