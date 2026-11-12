package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.io.AbstractSerializer;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes46.dex */
public class yxu<T> extends AbstractSerializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ObjectMapper f53894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Module f53895b;
    protected final ObjectMapper d;

    static {
        aea aeaVar = new aea("jjwt-jackson");
        aeaVar.e(yxs.f53893a);
        f53895b = aeaVar;
        f53894a = a();
    }

    static ObjectMapper a() {
        return new ObjectMapper().a(f53895b).e(JsonParser.Feature.STRICT_DUPLICATE_DETECTION, true).c(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public yxu() {
        this(f53894a);
    }

    public yxu(ObjectMapper objectMapper) {
        yxz.b(objectMapper, "ObjectMapper cannot be null.");
        this.d = objectMapper.a(f53895b);
    }

    @Override // io.jsonwebtoken.io.AbstractSerializer
    public void doSerialize(T t, OutputStream outputStream) throws Exception {
        yxz.b(outputStream, "OutputStream cannot be null.");
        this.d.n().b(JsonGenerator.Feature.AUTO_CLOSE_TARGET).c(outputStream, t);
    }
}
