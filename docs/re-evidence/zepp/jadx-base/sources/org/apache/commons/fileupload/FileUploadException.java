package org.apache.commons.fileupload;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes23.dex */
public class FileUploadException extends Exception {
    private static final long serialVersionUID = 8881893724388807504L;
    private final Throwable a;

    public FileUploadException() {
        this(null, null);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.a != null) {
            printStream.println("Caused by:");
            this.a.printStackTrace(printStream);
        }
    }

    public FileUploadException(String str) {
        this(str, null);
    }

    public FileUploadException(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.a != null) {
            printWriter.println("Caused by:");
            this.a.printStackTrace(printWriter);
        }
    }
}
