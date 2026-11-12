package javazoom.jl.decoder;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes23.dex */
public class JavaLayerException extends Exception {
    private Throwable a;

    public JavaLayerException() {
    }

    public Throwable getException() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public JavaLayerException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        Throwable th = this.a;
        if (th == null) {
            super.printStackTrace(printStream);
        } else {
            th.printStackTrace();
        }
    }

    public JavaLayerException(String str, Throwable th) {
        super(str);
        this.a = th;
    }
}
