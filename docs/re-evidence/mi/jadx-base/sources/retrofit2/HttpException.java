package retrofit2;

import defpackage.prk;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient prk<?> response;

    public HttpException(prk<?> prkVar) {
        super(getMessage(prkVar));
        this.code = prkVar.b();
        this.message = prkVar.f();
        this.response = prkVar;
    }

    private static String getMessage(prk<?> prkVar) {
        Objects.requireNonNull(prkVar, "response == null");
        return "HTTP " + prkVar.b() + " " + prkVar.f();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public prk<?> response() {
        return this.response;
    }
}
