package c73;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    public interface b {
        FileChannel getChannel();
    }

    private c() {
    }

    public static a a(int i14, int i15, byte[] bArr) {
        return new a(ByteBuffer.wrap(bArr, i14, i15).slice(), 0);
    }

    public static final class a extends UploadDataProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f25257a;

        private a(ByteBuffer byteBuffer) {
            this.f25257a = byteBuffer;
        }

        @Override // org.chromium.net.UploadDataProvider
        public final long getLength() {
            return this.f25257a.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                h.z("Cronet passed a buffer with no bytes remaining");
                return;
            }
            int iRemaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = this.f25257a;
            if (iRemaining >= byteBuffer2.remaining()) {
                byteBuffer.put(byteBuffer2);
            } else {
                int iLimit = byteBuffer2.limit();
                byteBuffer.put(byteBuffer2);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void rewind(UploadDataSink uploadDataSink) {
            uploadDataSink.onRewindSucceeded();
        }

        public /* synthetic */ a(ByteBuffer byteBuffer, int i14) {
            this(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: c73.c$c, reason: collision with other inner class name */
    public static final class C0373c extends UploadDataProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile FileChannel f25258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f25259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f25260c;

        private C0373c(b bVar) {
            this.f25260c = new Object();
            this.f25259b = bVar;
        }

        public final FileChannel a() {
            if (this.f25258a == null) {
                synchronized (this.f25260c) {
                    try {
                        if (this.f25258a == null) {
                            this.f25258a = this.f25259b.getChannel();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            return this.f25258a;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            FileChannel fileChannel = this.f25258a;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        @Override // org.chromium.net.UploadDataProvider
        public final long getLength() {
            return a().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (!byteBuffer.hasRemaining()) {
                h.z("Cronet passed a buffer with no bytes remaining");
                return;
            }
            FileChannel fileChannelA = a();
            int i14 = 0;
            while (i14 == 0) {
                int i15 = fileChannelA.read(byteBuffer);
                if (i15 == -1) {
                    break;
                } else {
                    i14 += i15;
                }
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void rewind(UploadDataSink uploadDataSink) throws IOException {
            a().position(0L);
            uploadDataSink.onRewindSucceeded();
        }

        public /* synthetic */ C0373c(b bVar, int i14) {
            this(bVar);
        }
    }
}
