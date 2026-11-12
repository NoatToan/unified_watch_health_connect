package oauth.signpost.exception;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OAuthException extends Exception {
    public OAuthException(String str) {
        super(str);
    }

    public OAuthException(Throwable th3) {
        super(th3);
    }

    public OAuthException(String str, Throwable th3) {
        super(str, th3);
    }
}
