package defpackage;

import com.auth0.jwt.interfaces.Header;
import com.auth0.jwt.interfaces.JWTPartsParser;
import com.auth0.jwt.interfaces.Payload;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class rl implements JWTPartsParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final yo f47435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ObjectMapper f47436b;
    private static final yo d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yo f47437c = d;
    private final yo e = f47435a;

    static {
        ObjectMapper objectMapperC = c();
        f47436b = objectMapperC;
        d = objectMapperC.c(Payload.class);
        f47435a = objectMapperC.c(Header.class);
    }

    @Override // com.auth0.jwt.interfaces.JWTPartsParser
    public Payload parsePayload(String str) throws rf {
        if (str == null) {
            throw d();
        }
        try {
            return (Payload) this.f47437c.c(str);
        } catch (IOException unused) {
            throw c(str);
        }
    }

    @Override // com.auth0.jwt.interfaces.JWTPartsParser
    public Header parseHeader(String str) throws rf {
        if (str == null) {
            throw d();
        }
        try {
            return (Header) this.e.c(str);
        } catch (IOException unused) {
            throw c(str);
        }
    }

    static void e(ObjectMapper objectMapper) {
        aea aeaVar = new aea();
        aeaVar.d(Payload.class, new ro());
        aeaVar.d(Header.class, new rj());
        objectMapper.a(aeaVar);
    }

    private static ObjectMapper c() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.a(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objectMapper.d(JsonInclude.Include.NON_EMPTY);
        e(objectMapper);
        return objectMapper;
    }

    private static rf d() {
        return c(null);
    }

    private static rf c(String str) {
        return new rf(String.format("The string '%s' doesn't have a valid JSON format.", str));
    }
}
