package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class RtspMessageChannel implements Closeable {
    public static final Charset g = Charsets.UTF_8;
    private static final String h = "RtspMessageChannel";
    public static final int i = 554;
    private final MessageListener a;
    private final Loader b = new Loader("ExoPlayer:RtspMessageChannel:ReceiverLoader");
    private final Map<Integer, InterleavedBinaryDataListener> c = Collections.synchronizedMap(new HashMap());
    private e d;
    private Socket e;
    private volatile boolean f;

    public interface InterleavedBinaryDataListener {
        void onInterleavedBinaryDataReceived(byte[] data);
    }

    public interface MessageListener {
        void onReceivingFailed(Exception e);

        void onRtspMessageReceived(List<String> message);

        void onSendingFailed(List<String> message, Exception e);
    }

    public final class b implements Loader.Callback<d> {
        private b() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onLoadCanceled(d loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onLoadCompleted(d loadable, long elapsedRealtimeMs, long loadDurationMs) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.LoadErrorAction onLoadError(d loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
            if (!RtspMessageChannel.this.f) {
                RtspMessageChannel.this.a.onReceivingFailed(error);
            }
            return Loader.DONT_RETRY;
        }
    }

    public static final class c {
        private static final int d = 1;
        private static final int e = 2;
        private static final int f = 3;
        private final List<String> a = new ArrayList();

        @MessageParser.ReadingState
        private int b = 1;
        private long c;

        private ImmutableList<String> a(byte[] messageBodyBytes) {
            Assertions.checkState(this.b == 3);
            if (messageBodyBytes.length <= 0 || messageBodyBytes[messageBodyBytes.length - 1] != 10) {
                throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
            }
            this.a.add((messageBodyBytes.length <= 1 || messageBodyBytes[messageBodyBytes.length + (-2)] != 13) ? new String(messageBodyBytes, 0, messageBodyBytes.length - 1, RtspMessageChannel.g) : new String(messageBodyBytes, 0, messageBodyBytes.length - 2, RtspMessageChannel.g));
            ImmutableList<String> immutableListCopyOf = ImmutableList.copyOf((Collection) this.a);
            e();
            return immutableListCopyOf;
        }

        @Nullable
        private ImmutableList<String> b(byte[] lineBytes) throws ParserException {
            Assertions.checkArgument(lineBytes.length >= 2 && lineBytes[lineBytes.length - 2] == 13 && lineBytes[lineBytes.length - 1] == 10);
            String str = new String(lineBytes, 0, lineBytes.length - 2, RtspMessageChannel.g);
            this.a.add(str);
            int i = this.b;
            if (i == 1) {
                if (!RtspMessageUtil.d(str)) {
                    return null;
                }
                this.b = 2;
                return null;
            }
            if (i != 2) {
                throw new IllegalStateException();
            }
            long jE = RtspMessageUtil.e(str);
            if (jE != -1) {
                this.c = jE;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.c > 0) {
                this.b = 3;
                return null;
            }
            ImmutableList<String> immutableListCopyOf = ImmutableList.copyOf((Collection) this.a);
            e();
            return immutableListCopyOf;
        }

        private static byte[] d(byte firstByte, DataInputStream dataInputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {firstByte, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                bArr[1] = dataInputStream.readByte();
                byteArrayOutputStream.write(bArr[1]);
            }
        }

        private void e() {
            this.a.clear();
            this.b = 1;
            this.c = 0L;
        }

        public ImmutableList<String> c(byte firstByte, DataInputStream dataInputStream) throws IOException {
            ImmutableList<String> immutableListB = b(d(firstByte, dataInputStream));
            while (immutableListB == null) {
                if (this.b == 3) {
                    long j = this.c;
                    if (j <= 0) {
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    int iCheckedCast = Ints.checkedCast(j);
                    Assertions.checkState(iCheckedCast != -1);
                    byte[] bArr = new byte[iCheckedCast];
                    dataInputStream.readFully(bArr, 0, iCheckedCast);
                    immutableListB = a(bArr);
                } else {
                    immutableListB = b(d(dataInputStream.readByte(), dataInputStream));
                }
            }
            return immutableListB;
        }
    }

    public final class d implements Loader.Loadable {
        private static final byte e = 36;
        private final DataInputStream a;
        private final c b = new c();
        private volatile boolean c;

        public d(InputStream inputStream) {
            this.a = new DataInputStream(inputStream);
        }

        private void a() throws IOException {
            int unsignedByte = this.a.readUnsignedByte();
            int unsignedShort = this.a.readUnsignedShort();
            byte[] bArr = new byte[unsignedShort];
            this.a.readFully(bArr, 0, unsignedShort);
            InterleavedBinaryDataListener interleavedBinaryDataListener = (InterleavedBinaryDataListener) RtspMessageChannel.this.c.get(Integer.valueOf(unsignedByte));
            if (interleavedBinaryDataListener == null || RtspMessageChannel.this.f) {
                return;
            }
            interleavedBinaryDataListener.onInterleavedBinaryDataReceived(bArr);
        }

        private void b(byte firstByte) throws IOException {
            if (RtspMessageChannel.this.f) {
                return;
            }
            RtspMessageChannel.this.a.onRtspMessageReceived(this.b.c(firstByte, this.a));
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
            this.c = true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws IOException {
            while (!this.c) {
                byte b = this.a.readByte();
                if (b == 36) {
                    a();
                } else {
                    b(b);
                }
            }
        }
    }

    public final class e implements Closeable {
        private final OutputStream a;
        private final HandlerThread b;
        private final Handler c;

        public e(OutputStream outputStream) {
            this.a = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.b = handlerThread;
            handlerThread.start();
            this.c = new Handler(handlerThread.getLooper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(byte[] bArr, List list) {
            try {
                this.a.write(bArr);
            } catch (Exception e) {
                if (RtspMessageChannel.this.f) {
                    return;
                }
                RtspMessageChannel.this.a.onSendingFailed(list, e);
            }
        }

        public void c(final List<String> message) {
            final byte[] bArrA = RtspMessageUtil.a(message);
            this.c.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(bArrA, message);
                }
            });
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.c;
            final HandlerThread handlerThread = this.b;
            Objects.requireNonNull(handlerThread);
            handler.post(new Runnable() { // from class: vf6
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.b.join();
            } catch (InterruptedException unused) {
                this.b.interrupt();
            }
        }
    }

    public RtspMessageChannel(MessageListener messageListener) {
        this.a = messageListener;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f) {
            return;
        }
        try {
            e eVar = this.d;
            if (eVar != null) {
                eVar.close();
            }
            this.b.release();
            Socket socket = this.e;
            if (socket != null) {
                socket.close();
            }
        } finally {
            this.f = true;
        }
    }

    public void d(Socket socket) throws IOException {
        this.e = socket;
        this.d = new e(socket.getOutputStream());
        this.b.startLoading(new d(socket.getInputStream()), new b(), 0);
    }

    public void e(int channel, InterleavedBinaryDataListener listener) {
        this.c.put(Integer.valueOf(channel), listener);
    }

    public void f(List<String> message) {
        Assertions.checkStateNotNull(this.d);
        this.d.c(message);
    }
}
