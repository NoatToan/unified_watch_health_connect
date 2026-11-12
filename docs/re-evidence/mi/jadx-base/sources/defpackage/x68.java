package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes4.dex */
public class x68 implements w68 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f38746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileInputStream f38747b;
    public FileChannel c;

    public x68(File file) throws IOException {
        this.f38746a = file;
        a();
    }

    public void a() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(this.f38746a);
        this.f38747b = fileInputStream;
        this.c = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f38747b.close();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.c.isOpen();
    }

    @Override // defpackage.w68
    public int q(ByteBuffer byteBuffer, long j) throws IOException {
        return this.c.read(byteBuffer, j);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.c.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.c.write(byteBuffer);
    }
}
