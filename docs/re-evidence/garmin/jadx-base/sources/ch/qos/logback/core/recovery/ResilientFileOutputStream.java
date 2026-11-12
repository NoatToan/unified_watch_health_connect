package ch.qos.logback.core.recovery;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes7.dex */
public class ResilientFileOutputStream extends ResilientOutputStreamBase {
    private File file;
    private FileOutputStream fos;

    public ResilientFileOutputStream(File file, boolean z14, long j8) {
        this.file = file;
        this.fos = new FileOutputStream(file, z14);
        this.f27284os = new BufferedOutputStream(this.fos, (int) j8);
        this.presumedClean = true;
    }

    public FileChannel getChannel() {
        if (this.f27284os == null) {
            return null;
        }
        return this.fos.getChannel();
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    public String getDescription() {
        return "file [" + this.file + "]";
    }

    public File getFile() {
        return this.file;
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    public OutputStream openNewOutputStream() {
        this.fos = new FileOutputStream(this.file, true);
        return new BufferedOutputStream(this.fos);
    }

    public String toString() {
        return "c.q.l.c.recovery.ResilientFileOutputStream@" + System.identityHashCode(this);
    }
}
