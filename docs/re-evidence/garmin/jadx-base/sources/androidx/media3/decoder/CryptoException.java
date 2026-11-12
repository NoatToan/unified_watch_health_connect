package androidx.media3.decoder;

/* JADX INFO: loaded from: classes.dex */
public class CryptoException extends Exception {
    public final int errorCode;

    public CryptoException(int i14, String str) {
        super(str);
        this.errorCode = i14;
    }
}
