package p005kotlin.io;

import java.io.File;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B)\bF\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u00020\u0003X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/io/FileSystemException;", "Ljava/io/IOException;", "file", "Ljava/io/File;", "other", "reason", "", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "getOther", "getReason", "()Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class FileSystemException extends IOException {
    private final File file;
    private final File other;
    private final String reason;

    public FileSystemException(File file, File file2, String str) {
        file.getClass();
        StringBuilder sb3 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb3.append(" -> " + file2);
        }
        if (str != null) {
            sb3.append(": ".concat(str));
        }
        super(sb3.toString());
        this.file = file;
        this.other = file2;
        this.reason = str;
    }

    public final File getFile() {
        return this.file;
    }

    public final File getOther() {
        return this.other;
    }

    public final String getReason() {
        return this.reason;
    }

    public /* synthetic */ FileSystemException(File file, File file2, String str, int i14, j jVar) {
        this(file, (i14 & 2) != 0 ? null : file2, (i14 & 4) != 0 ? null : str);
    }
}
