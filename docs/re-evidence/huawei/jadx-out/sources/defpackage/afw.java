package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class afw extends StdSerializer<Object> {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JavaType f374b;

    public afw(JavaType javaType, String str) {
        super(Object.class);
        this.f374b = javaType;
        this.f373a = str;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        serializerProvider.reportBadDefinition(this.f374b, this.f373a);
    }
}
