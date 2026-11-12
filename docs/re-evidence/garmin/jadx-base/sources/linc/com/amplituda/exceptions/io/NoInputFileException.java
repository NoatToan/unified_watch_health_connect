package linc.com.amplituda.exceptions.io;

/* JADX INFO: loaded from: classes3.dex */
public final class NoInputFileException extends AmplitudaIOException {
    public NoInputFileException() {
        super("Input file not found! Please call fromFile() or fromPath() at first!", 23);
    }
}
