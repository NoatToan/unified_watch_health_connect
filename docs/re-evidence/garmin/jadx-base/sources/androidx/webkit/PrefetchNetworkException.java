package androidx.webkit;

/* JADX INFO: loaded from: classes7.dex */
public class PrefetchNetworkException extends PrefetchException {
    public static final int NO_HTTP_RESPONSE_STATUS_CODE = 0;
    public final int httpResponseStatusCode;

    public PrefetchNetworkException(String str, int i14) {
        super(str);
        this.httpResponseStatusCode = i14;
    }

    public PrefetchNetworkException(String str) {
        this(str, 0);
    }

    public PrefetchNetworkException(int i14) {
        this.httpResponseStatusCode = i14;
    }

    public PrefetchNetworkException() {
        this(0);
    }
}
