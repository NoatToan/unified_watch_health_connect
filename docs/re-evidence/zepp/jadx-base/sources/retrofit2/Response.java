package retrofit2;

import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes23.dex */
public final class Response<T> {
    private final okhttp3.Response a;

    @Nullable
    private final T b;

    @Nullable
    private final ResponseBody c;

    private Response(okhttp3.Response response, @Nullable T t, @Nullable ResponseBody responseBody) {
        this.a = response;
        this.b = t;
        this.c = responseBody;
    }

    public static <T> Response<T> error(int i, ResponseBody responseBody) {
        if (i >= 400) {
            return error(responseBody, new okhttp3.Response.Builder().code(i).message("Response.error()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException("code < 400: " + i);
    }

    public static <T> Response<T> success(@Nullable T t) {
        return success(t, new okhttp3.Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    @Nullable
    public T body() {
        return this.b;
    }

    public int code() {
        return this.a.code();
    }

    @Nullable
    public ResponseBody errorBody() {
        return this.c;
    }

    public Headers headers() {
        return this.a.headers();
    }

    public boolean isSuccessful() {
        return this.a.isSuccessful();
    }

    public String message() {
        return this.a.message();
    }

    public okhttp3.Response raw() {
        return this.a;
    }

    public String toString() {
        return this.a.toString();
    }

    public static <T> Response<T> success(@Nullable T t, Headers headers) {
        i.b(headers, "headers == null");
        return success(t, new okhttp3.Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).headers(headers).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> Response<T> error(ResponseBody responseBody, okhttp3.Response response) {
        i.b(responseBody, "body == null");
        i.b(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            return new Response<>(response, null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> Response<T> success(@Nullable T t, okhttp3.Response response) {
        i.b(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new Response<>(response, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
}
