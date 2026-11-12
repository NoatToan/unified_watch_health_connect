package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import o2.c;
import p005kotlin.Metadata;
import w63.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "Ljava/nio/channels/FileChannel;", "fileChannel", "<init>", "(Ljava/nio/channels/FileChannel;)V", "", "pos", "Lw63/e;", "source", "byteCount", "", "write", "(JLw63/e;J)V", "sink", "read", "Ljava/nio/channels/FileChannel;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        fileChannel.getClass();
        this.fileChannel = fileChannel;
    }

    public final void read(long pos, e sink, long byteCount) throws IOException {
        sink.getClass();
        if (byteCount < 0) {
            c.q();
            return;
        }
        long j8 = pos;
        long j14 = byteCount;
        while (j14 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j8, j14, sink);
            j8 += jTransferTo;
            j14 -= jTransferTo;
        }
    }

    public final void write(long pos, e source, long byteCount) throws IOException {
        source.getClass();
        if (byteCount < 0 || byteCount > source.f183349b) {
            c.q();
            return;
        }
        long j8 = pos;
        long j14 = byteCount;
        while (j14 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(source, j8, j14);
            j8 += jTransferFrom;
            j14 -= jTransferFrom;
        }
    }
}
