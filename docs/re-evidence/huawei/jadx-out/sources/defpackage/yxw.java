package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.io.AbstractDeserializer;
import java.io.Reader;

/* JADX INFO: loaded from: classes46.dex */
public class yxw<T> extends AbstractDeserializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<T> f53896a;
    private final ObjectMapper e;

    public yxw() {
        this(yxu.f53894a);
    }

    public yxw(ObjectMapper objectMapper) {
        this(objectMapper, Object.class);
    }

    private yxw(ObjectMapper objectMapper, Class<T> cls) {
        yxz.b(objectMapper, "ObjectMapper cannot be null.");
        yxz.b(cls, "Return type cannot be null.");
        this.e = objectMapper;
        this.f53896a = cls;
    }

    @Override // io.jsonwebtoken.io.AbstractDeserializer
    public T doDeserialize(Reader reader) throws Exception {
        return (T) this.e.e(reader, this.f53896a);
    }
}
