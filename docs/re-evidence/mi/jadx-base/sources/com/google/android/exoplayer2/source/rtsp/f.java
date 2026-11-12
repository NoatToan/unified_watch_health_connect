package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.ImmutableList;
import defpackage.bu3;
import defpackage.rk1;
import defpackage.wlq;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f8237b;
    public C0199f d;
    public Socket e;
    public volatile boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f8236a = wlq.x();
    public final Loader c = new Loader("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    public final class b implements Loader.b<d> {
        public b() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void o(d dVar, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void q(d dVar, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c s(d dVar, long j, long j2, IOException iOException, int i) {
            f.this.f8237b.d(iOException);
            return Loader.f;
        }
    }

    public interface c {
        default void a(List<String> list, Exception exc) {
        }

        void b(List<String> list);

        default void c(byte[] bArr, int i) {
        }

        default void d(Exception exc) {
        }
    }

    public final class d implements Loader.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataInputStream f8239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f8240b = new e();
        public volatile boolean c;

        public d(InputStream inputStream) {
            this.f8239a = new DataInputStream(inputStream);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void b() {
            this.c = true;
        }

        public final void d() throws IOException {
            final int unsignedByte = this.f8239a.readUnsignedByte();
            int unsignedShort = this.f8239a.readUnsignedShort();
            final byte[] bArr = new byte[unsignedShort];
            this.f8239a.readFully(bArr, 0, unsignedShort);
            f.this.f8236a.post(new Runnable() { // from class: g0l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18433a.g(bArr, unsignedByte);
                }
            });
        }

        public final void e(byte b2) throws IOException {
            ImmutableList<String> immutableListA = this.f8240b.a(f(b2));
            while (immutableListA == null) {
                immutableListA = this.f8240b.a(f(this.f8239a.readByte()));
            }
            final ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) immutableListA);
            f.this.f8236a.post(new Runnable() { // from class: h0l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19545a.h(immutableListCopyOf);
                }
            });
        }

        public final byte[] f(byte b2) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b2, this.f8239a.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                byte b3 = this.f8239a.readByte();
                bArr[1] = b3;
                byteArrayOutputStream.write(b3);
            }
        }

        public final /* synthetic */ void g(byte[] bArr, int i) {
            if (f.this.f) {
                return;
            }
            f.this.f8237b.c(bArr, i);
        }

        public final /* synthetic */ void h(ImmutableList immutableList) {
            if (f.this.f) {
                return;
            }
            f.this.f8237b.b(immutableList);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void load() throws IOException {
            while (!this.c) {
                byte b2 = this.f8239a.readByte();
                if (b2 == 36) {
                    d();
                } else {
                    e(b2);
                }
            }
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f8241a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @RtspMessageChannel.RtspMessageBuilder.ReadingState
        public int f8242b = 1;
        public long c;
        public long d;

        public ImmutableList<String> a(byte[] bArr) throws ParserException {
            rk1.a(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, bu3.c);
            this.f8241a.add(str);
            int i = this.f8242b;
            if (i == 1) {
                if (!g.b(str)) {
                    return null;
                }
                this.f8242b = 2;
                return null;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException();
                }
                long length = this.d + ((long) bArr.length);
                this.d = length;
                if (length < this.c) {
                    return null;
                }
                ImmutableList<String> immutableListCopyOf = ImmutableList.copyOf((Collection) this.f8241a);
                b();
                return immutableListCopyOf;
            }
            long jC = g.c(str);
            if (jC != -1) {
                this.c = jC;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.c > 0) {
                this.f8242b = 3;
                return null;
            }
            ImmutableList<String> immutableListCopyOf2 = ImmutableList.copyOf((Collection) this.f8241a);
            b();
            return immutableListCopyOf2;
        }

        public final void b() {
            this.f8241a.clear();
            this.f8242b = 1;
            this.c = 0L;
            this.d = 0L;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.f$f, reason: collision with other inner class name */
    public final class C0199f implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputStream f8243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HandlerThread f8244b;
        public final Handler c;

        public C0199f(OutputStream outputStream) {
            this.f8243a = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.f8244b = handlerThread;
            handlerThread.start();
            this.c = new Handler(handlerThread.getLooper());
        }

        public final /* synthetic */ void c(List list, Exception exc) {
            if (f.this.f) {
                return;
            }
            f.this.f8237b.a(list, exc);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.c;
            final HandlerThread handlerThread = this.f8244b;
            Objects.requireNonNull(handlerThread);
            handler.post(new Runnable() { // from class: i0l
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.f8244b.join();
            } catch (InterruptedException unused) {
                this.f8244b.interrupt();
            }
        }

        public final /* synthetic */ void d(byte[] bArr, final List list) {
            try {
                this.f8243a.write(bArr);
            } catch (Exception e) {
                f.this.f8236a.post(new Runnable() { // from class: k0l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23302a.c(list, e);
                    }
                });
            }
        }

        public void l(final List<String> list) {
            final byte[] bArrA = g.a(list);
            this.c.post(new Runnable() { // from class: j0l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22302a.d(bArrA, list);
                }
            });
        }
    }

    public f(c cVar) {
        this.f8237b = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f) {
            return;
        }
        try {
            C0199f c0199f = this.d;
            if (c0199f != null) {
                c0199f.close();
            }
            this.c.l();
            this.f8236a.removeCallbacksAndMessages(null);
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
        this.d = new C0199f(socket.getOutputStream());
        this.c.n(new d(socket.getInputStream()), new b(), 0);
    }

    public void l(List<String> list) {
        rk1.i(this.d);
        this.d.l(list);
    }
}
