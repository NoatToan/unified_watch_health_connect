package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class aff extends StdSerializer<Object> {
    protected final String d;

    public aff(String str) {
        super(Object.class);
        this.d = str;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        serializerProvider.reportMappingProblem(this.d, new Object[0]);
    }
}
