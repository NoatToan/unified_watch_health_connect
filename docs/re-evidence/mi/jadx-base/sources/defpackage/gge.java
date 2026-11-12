package defpackage;

import cn.hutool.core.io.IORuntimeException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.WatchEvent;

/* JADX INFO: loaded from: classes.dex */
public class gge extends rdm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f18953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f18954b;
    public final dge c;

    public gge(RandomAccessFile randomAccessFile, Charset charset, dge dgeVar) {
        this.f18953a = randomAccessFile;
        this.f18954b = charset;
        this.c = dgeVar;
    }

    @Override // defpackage.f6r
    public void a(WatchEvent<?> watchEvent, Path path) {
        RandomAccessFile randomAccessFile = this.f18953a;
        Charset charset = this.f18954b;
        dge dgeVar = this.c;
        try {
            long length = randomAccessFile.length();
            long filePointer = randomAccessFile.getFilePointer();
            if (0 != length && filePointer != length) {
                if (length < filePointer) {
                    randomAccessFile.seek(length);
                } else {
                    jm9.H(randomAccessFile, charset, dgeVar);
                    randomAccessFile.seek(length);
                }
            }
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        a(null, null);
    }
}
