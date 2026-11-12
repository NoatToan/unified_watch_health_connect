package retrofit2;

/* JADX INFO: loaded from: classes23.dex */
public class HttpException extends RuntimeException {
    private final int a;
    private final String b;
    private final transient Response<?> c;

    public HttpException(Response<?> response) {
        super(a(response));
        this.a = response.code();
        this.b = response.message();
        this.c = response;
    }

    private static String a(Response<?> response) {
        i.b(response, "response == null");
        return "HTTP " + response.code() + " " + response.message();
    }

    public int code() {
        return this.a;
    }

    public String message() {
        return this.b;
    }

    public Response<?> response() {
        return this.c;
    }
}
