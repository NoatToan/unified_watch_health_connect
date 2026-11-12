package androidx.core.net;

/* JADX INFO: loaded from: classes20.dex */
public class ParseException extends RuntimeException {
    public final String response;

    ParseException(String str) {
        super(str);
        this.response = str;
    }
}
