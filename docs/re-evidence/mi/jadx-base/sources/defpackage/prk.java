package defpackage;

import java.util.Objects;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class prk<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Response f30683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f30684b;
    public final ResponseBody c;

    public prk(Response response, T t, ResponseBody responseBody) {
        this.f30683a = response;
        this.f30684b = t;
        this.c = responseBody;
    }

    public static <T> prk<T> c(ResponseBody responseBody, Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new prk<>(response, null, responseBody);
    }

    public static <T> prk<T> h(T t, Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new prk<>(response, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public T a() {
        return this.f30684b;
    }

    public int b() {
        return this.f30683a.code();
    }

    public Headers d() {
        return this.f30683a.headers();
    }

    public boolean e() {
        return this.f30683a.isSuccessful();
    }

    public String f() {
        return this.f30683a.message();
    }

    public Response g() {
        return this.f30683a;
    }

    public String toString() {
        return this.f30683a.toString();
    }
}
