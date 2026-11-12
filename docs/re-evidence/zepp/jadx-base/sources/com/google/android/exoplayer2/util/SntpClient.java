package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes3.dex */
public final class SntpClient {
    public static final String DEFAULT_NTP_HOST = "time.android.com";
    private static final int a = 10000;
    private static final int b = 24;
    private static final int c = 32;
    private static final int d = 40;
    private static final int e = 48;
    private static final int f = 123;
    private static final int g = 3;
    private static final int h = 4;
    private static final int i = 5;
    private static final int j = 3;
    private static final int k = 3;
    private static final int l = 0;
    private static final int m = 15;
    private static final long n = 2208988800L;
    private static final Object o = new Object();
    private static final Object p = new Object();

    @GuardedBy("valueLock")
    private static boolean q = false;

    @GuardedBy("valueLock")
    private static long r = 0;

    @GuardedBy("valueLock")
    private static String s = "time.android.com";

    public interface InitializationCallback {
        void onInitializationFailed(IOException error);

        void onInitialized();
    }

    public static final class b implements Loader.Callback<Loader.Loadable> {

        @Nullable
        private final InitializationCallback a;

        public b(@Nullable InitializationCallback callback) {
            this.a = callback;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(Loader.Loadable loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(Loader.Loadable loadable, long elapsedRealtimeMs, long loadDurationMs) {
            if (this.a != null) {
                if (SntpClient.isInitialized()) {
                    this.a.onInitialized();
                } else {
                    this.a.onInitializationFailed(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(Loader.Loadable loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
            InitializationCallback initializationCallback = this.a;
            if (initializationCallback != null) {
                initializationCallback.onInitializationFailed(error);
            }
            return Loader.DONT_RETRY;
        }
    }

    public static final class c implements Loader.Loadable {
        private c() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws IOException {
            synchronized (SntpClient.o) {
                synchronized (SntpClient.p) {
                    if (SntpClient.q) {
                        return;
                    }
                    long jH = SntpClient.h();
                    synchronized (SntpClient.p) {
                        long unused = SntpClient.r = jH;
                        boolean unused2 = SntpClient.q = true;
                    }
                }
            }
        }
    }

    private SntpClient() {
    }

    private static void g(byte leap, byte mode, int stratum, long transmitTime) throws IOException {
        if (leap == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (mode != 4 && mode != 5) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("SNTP: Untrusted mode: ");
            sb.append((int) mode);
            throw new IOException(sb.toString());
        }
        if (stratum != 0 && stratum <= 15) {
            if (transmitTime == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("SNTP: Untrusted stratum: ");
            sb2.append(stratum);
            throw new IOException(sb2.toString());
        }
    }

    public static long getElapsedRealtimeOffsetMs() {
        long j2;
        synchronized (p) {
            j2 = q ? r : C.TIME_UNSET;
        }
        return j2;
    }

    public static String getNtpHost() {
        String str;
        synchronized (p) {
            str = s;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long h() throws IOException {
        InetAddress byName = InetAddress.getByName(getNtpHost());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            k(bArr, 40, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            long j2 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            byte b2 = (byte) ((bArr[0] >> 6) & 3);
            byte b3 = (byte) (bArr[0] & 7);
            int i2 = bArr[1] & 255;
            long j3 = j(bArr, 24);
            long j4 = j(bArr, 32);
            long j5 = j(bArr, 40);
            g(b2, b3, i2, j5);
            long j6 = (j2 + (((j4 - j3) + (j5 - j2)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j6;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static long i(byte[] buffer, int offset) {
        int i2 = buffer[offset];
        int i3 = buffer[offset + 1];
        int i4 = buffer[offset + 2];
        int i5 = buffer[offset + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    public static void initialize(@Nullable Loader loader, @Nullable InitializationCallback callback) {
        if (isInitialized()) {
            if (callback != null) {
                callback.onInitialized();
            }
        } else {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.startLoading(new c(), new b(callback), 1);
        }
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (p) {
            z = q;
        }
        return z;
    }

    private static long j(byte[] buffer, int offset) {
        long jI = i(buffer, offset);
        long jI2 = i(buffer, offset + 4);
        if (jI == 0 && jI2 == 0) {
            return 0L;
        }
        return ((jI - n) * 1000) + ((jI2 * 1000) / 4294967296L);
    }

    private static void k(byte[] buffer, int offset, long time) {
        if (time == 0) {
            Arrays.fill(buffer, offset, offset + 8, (byte) 0);
            return;
        }
        long j2 = time / 1000;
        long j3 = time - (j2 * 1000);
        long j4 = j2 + n;
        int i2 = offset + 1;
        buffer[offset] = (byte) (j4 >> 24);
        int i3 = i2 + 1;
        buffer[i2] = (byte) (j4 >> 16);
        int i4 = i3 + 1;
        buffer[i3] = (byte) (j4 >> 8);
        int i5 = i4 + 1;
        buffer[i4] = (byte) (j4 >> 0);
        long j5 = (j3 * 4294967296L) / 1000;
        int i6 = i5 + 1;
        buffer[i5] = (byte) (j5 >> 24);
        int i7 = i6 + 1;
        buffer[i6] = (byte) (j5 >> 16);
        buffer[i7] = (byte) (j5 >> 8);
        buffer[i7 + 1] = (byte) (Math.random() * 255.0d);
    }

    public static void setNtpHost(String ntpHost) {
        synchronized (p) {
            if (!s.equals(ntpHost)) {
                s = ntpHost;
                q = false;
            }
        }
    }
}
