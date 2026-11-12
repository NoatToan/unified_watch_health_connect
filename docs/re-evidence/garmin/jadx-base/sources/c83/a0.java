package c83;

import java.util.Objects;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class a0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Response f25745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f25746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResponseBody f25747c;

    private a0(Response response, T t7, ResponseBody responseBody) {
        this.f25745a = response;
        this.f25746b = t7;
        this.f25747c = responseBody;
    }

    public static <T> a0<T> a(ResponseBody responseBody, Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            return new a0<>(response, null, responseBody);
        }
        vb.h.s("rawResponse should not be successful response");
        return null;
    }

    public static <T> a0<T> b(T t7) {
        return c(t7, new Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> a0<T> c(T t7, Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new a0<>(response, t7, null);
        }
        vb.h.s("rawResponse must be successful response");
        return null;
    }

    public final String toString() {
        return this.f25745a.toString();
    }
}
