package javazoom.jl.decoder;

/* JADX INFO: loaded from: classes23.dex */
public class DecoderException extends JavaLayerException implements DecoderErrors {
    private int b;

    public DecoderException(String str, Throwable th) {
        super(str, th);
        this.b = 512;
    }

    public static String getErrorString(int i) {
        return "Decoder errorcode " + Integer.toHexString(i);
    }

    public int getErrorCode() {
        return this.b;
    }

    public DecoderException(int i, Throwable th) {
        this(getErrorString(i), th);
        this.b = i;
    }
}
