package dz2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import o13.m;
import o13.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldz2/h;", "Ldz2/a;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "util-io_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f61813b;

    public h(File file) {
        file.getClass();
        this.f61813b = m.b(new g(file, 0));
    }

    @Override // dz2.a
    public final void close() throws IOException {
        ((RandomAccessFile) this.f61813b.getValue()).close();
    }

    @Override // dz2.a
    public final long getSize() {
        return ((RandomAccessFile) this.f61813b.getValue()).length();
    }

    @Override // dz2.a
    public final void write(byte[] bArr) throws IOException {
        bArr.getClass();
        ((RandomAccessFile) this.f61813b.getValue()).write(bArr);
    }
}
