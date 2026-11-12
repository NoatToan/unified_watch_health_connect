package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.v;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class SntpClient {
    public static final String DEFAULT_NTP_HOST = "time.android.com";
    private static final int NTP_LEAP_NOSYNC = 3;
    private static final int NTP_MODE_BROADCAST = 5;
    private static final int NTP_MODE_CLIENT = 3;
    private static final int NTP_MODE_SERVER = 4;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_PORT = 123;
    private static final int NTP_STRATUM_DEATH = 0;
    private static final int NTP_STRATUM_MAX = 15;
    private static final int NTP_VERSION = 3;
    private static final long OFFSET_1900_TO_1970 = 2208988800L;
    private static final int ORIGINATE_TIME_OFFSET = 24;
    private static final int RECEIVE_TIME_OFFSET = 32;
    private static final int TIMEOUT_MS = 10000;
    private static final int TRANSMIT_TIME_OFFSET = 40;
    private static long elapsedRealtimeOffsetMs = 0;
    private static boolean isInitialized = false;
    private static String ntpHost = "time.android.com";
    private static final Object loaderLock = new Object();
    private static final Object valueLock = new Object();

    public interface InitializationCallback {
        void onInitializationFailed(IOException iOException);

        void onInitialized();
    }

    public static final class NtpTimeCallback implements Loader.Callback<Loader.Loadable> {
        private final InitializationCallback callback;

        public NtpTimeCallback(InitializationCallback initializationCallback) {
            this.callback = initializationCallback;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(Loader.Loadable loadable, long j8, long j14, boolean z14) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(Loader.Loadable loadable, long j8, long j14) {
            if (this.callback != null) {
                boolean zIsInitialized = SntpClient.isInitialized();
                InitializationCallback initializationCallback = this.callback;
                if (zIsInitialized) {
                    initializationCallback.onInitialized();
                } else {
                    initializationCallback.onInitializationFailed(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(Loader.Loadable loadable, long j8, long j14, IOException iOException, int i14) {
            InitializationCallback initializationCallback = this.callback;
            if (initializationCallback != null) {
                initializationCallback.onInitializationFailed(iOException);
            }
            return Loader.DONT_RETRY;
        }
    }

    public static final class NtpTimeLoadable implements Loader.Loadable {
        private NtpTimeLoadable() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() {
            synchronized (SntpClient.loaderLock) {
                synchronized (SntpClient.valueLock) {
                    if (SntpClient.isInitialized) {
                        return;
                    }
                    long jLoadNtpTimeOffsetMs = SntpClient.loadNtpTimeOffsetMs();
                    synchronized (SntpClient.valueLock) {
                        long unused = SntpClient.elapsedRealtimeOffsetMs = jLoadNtpTimeOffsetMs;
                        boolean unused2 = SntpClient.isInitialized = true;
                    }
                }
            }
        }
    }

    private SntpClient() {
    }

    private static void checkValidServerReply(byte b14, byte b15, int i14, long j8) throws IOException {
        if (b14 == 3) {
            h.C("SNTP: Unsynchronized server");
            return;
        }
        if (b15 != 4 && b15 != 5) {
            h.C(v.b(26, b15, "SNTP: Untrusted mode: "));
            return;
        }
        if (i14 == 0 || i14 > 15) {
            h.C(v.b(36, i14, "SNTP: Untrusted stratum: "));
        } else {
            if (j8 != 0) {
                return;
            }
            h.C("SNTP: Zero transmitTime");
        }
    }

    public static long getElapsedRealtimeOffsetMs() {
        long j8;
        synchronized (valueLock) {
            try {
                j8 = isInitialized ? elapsedRealtimeOffsetMs : C.TIME_UNSET;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return j8;
    }

    public static String getNtpHost() {
        String str;
        synchronized (valueLock) {
            str = ntpHost;
        }
        return str;
    }

    public static void initialize(Loader loader, InitializationCallback initializationCallback) {
        if (isInitialized()) {
            if (initializationCallback != null) {
                initializationCallback.onInitialized();
            }
        } else {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.startLoading(new NtpTimeLoadable(), new NtpTimeCallback(initializationCallback), 1);
        }
    }

    public static boolean isInitialized() {
        boolean z14;
        synchronized (valueLock) {
            z14 = isInitialized;
        }
        return z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long loadNtpTimeOffsetMs() throws UnknownHostException {
        InetAddress byName = InetAddress.getByName(getNtpHost());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = Ascii.ESC;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            writeTimestamp(bArr, 40, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            long j8 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
            byte b14 = bArr[0];
            int i14 = bArr[1] & UnsignedBytes.MAX_VALUE;
            long timestamp = readTimestamp(bArr, 24);
            long timestamp2 = readTimestamp(bArr, 32);
            long timestamp3 = readTimestamp(bArr, 40);
            checkValidServerReply((byte) ((b14 >> 6) & 3), (byte) (b14 & 7), i14, timestamp3);
            long j14 = (j8 + (((timestamp3 - j8) + (timestamp2 - timestamp)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j14;
        } catch (Throwable th3) {
            try {
                datagramSocket.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static long read32(byte[] bArr, int i14) {
        int i15 = bArr[i14];
        int i16 = bArr[i14 + 1];
        int i17 = bArr[i14 + 2];
        int i18 = bArr[i14 + 3];
        if ((i15 & 128) == 128) {
            i15 = (i15 & 127) + 128;
        }
        if ((i16 & 128) == 128) {
            i16 = (i16 & 127) + 128;
        }
        if ((i17 & 128) == 128) {
            i17 = (i17 & 127) + 128;
        }
        if ((i18 & 128) == 128) {
            i18 = (i18 & 127) + 128;
        }
        return (((long) i15) << 24) + (((long) i16) << 16) + (((long) i17) << 8) + ((long) i18);
    }

    private static long readTimestamp(byte[] bArr, int i14) {
        long j8 = read32(bArr, i14);
        long j14 = read32(bArr, i14 + 4);
        if (j8 == 0 && j14 == 0) {
            return 0L;
        }
        return ((j14 * 1000) / 4294967296L) + ((j8 - OFFSET_1900_TO_1970) * 1000);
    }

    public static void setNtpHost(String str) {
        synchronized (valueLock) {
            try {
                if (!ntpHost.equals(str)) {
                    ntpHost = str;
                    isInitialized = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private static void writeTimestamp(byte[] bArr, int i14, long j8) {
        if (j8 == 0) {
            Arrays.fill(bArr, i14, i14 + 8, (byte) 0);
            return;
        }
        long j14 = j8 / 1000;
        long j15 = j8 - (j14 * 1000);
        long j16 = j14 + OFFSET_1900_TO_1970;
        bArr[i14] = (byte) (j16 >> 24);
        bArr[i14 + 1] = (byte) (j16 >> 16);
        bArr[i14 + 2] = (byte) (j16 >> 8);
        bArr[i14 + 3] = (byte) j16;
        long j17 = (j15 * 4294967296L) / 1000;
        bArr[i14 + 4] = (byte) (j17 >> 24);
        bArr[i14 + 5] = (byte) (j17 >> 16);
        bArr[i14 + 6] = (byte) (j17 >> 8);
        bArr[i14 + 7] = (byte) (Math.random() * 255.0d);
    }
}
