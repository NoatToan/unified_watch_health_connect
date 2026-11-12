package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import io.jsonwebtoken.lang.Supplier;
import java.io.IOException;

/* JADX INFO: loaded from: classes46.dex */
final class yxs extends StdSerializer<Supplier<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final yxs f53893a = new yxs();

    public yxs() {
        super(Supplier.class, false);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Supplier<?> supplier, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object obj = supplier.get();
        if (obj == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
        } else {
            serializerProvider.findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, serializerProvider);
        }
    }
}
