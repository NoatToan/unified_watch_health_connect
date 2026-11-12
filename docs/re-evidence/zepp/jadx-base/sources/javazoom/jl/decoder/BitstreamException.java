package javazoom.jl.decoder;

/* JADX INFO: loaded from: classes23.dex */
public class BitstreamException extends JavaLayerException implements BitstreamErrors {
    private int b;

    public BitstreamException(String str, Throwable th) {
        super(str, th);
        this.b = 256;
    }

    public static String getErrorString(int i) {
        return "Bitstream errorcode " + Integer.toHexString(i);
    }

    public int getErrorCode() {
        return this.b;
    }

    public BitstreamException(int i, Throwable th) {
        this(getErrorString(i), th);
        this.b = i;
    }
}
