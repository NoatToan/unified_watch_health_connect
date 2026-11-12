package defpackage;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes4.dex */
public final class z3n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f40845a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f40846b = new Object();

    @GuardedBy("valueLock")
    public static boolean c = false;

    @GuardedBy("valueLock")
    public static long d = 0;

    @GuardedBy("valueLock")
    public static String e = "time.android.com";

    public interface b {
        void a(IOException iOException);

        void b();
    }

    public static final class c implements Loader.b<Loader.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f40847a;

        public c(b bVar) {
            this.f40847a = bVar;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public void o(Loader.e eVar, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public void q(Loader.e eVar, long j, long j2) {
            if (this.f40847a != null) {
                if (z3n.k()) {
                    this.f40847a.b();
                } else {
                    this.f40847a.a(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public Loader.c s(Loader.e eVar, long j, long j2, IOException iOException, int i) {
            b bVar = this.f40847a;
            if (bVar != null) {
                bVar.a(iOException);
            }
            return Loader.f;
        }
    }

    public static final class d implements Loader.e {
        public d() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void b() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void load() throws IOException {
            synchronized (z3n.f40845a) {
                synchronized (z3n.f40846b) {
                    if (z3n.c) {
                        return;
                    }
                    long jL = z3n.l();
                    synchronized (z3n.f40846b) {
                        long unused = z3n.d = jL;
                        boolean unused2 = z3n.c = true;
                    }
                }
            }
        }
    }

    public static void g(byte b2, byte b3, int i, long j) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("SNTP: Untrusted mode: ");
            sb.append((int) b3);
            throw new IOException(sb.toString());
        }
        if (i != 0 && i <= 15) {
            if (j == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("SNTP: Untrusted stratum: ");
            sb2.append(i);
            throw new IOException(sb2.toString());
        }
    }

    public static long h() {
        long j;
        synchronized (f40846b) {
            try {
                j = c ? d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    public static String i() {
        String str;
        synchronized (f40846b) {
            str = e;
        }
        return str;
    }

    public static void j(Loader loader, b bVar) {
        if (k()) {
            if (bVar != null) {
                bVar.b();
            }
        } else {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.n(new d(), new c(bVar), 1);
        }
    }

    public static boolean k() {
        boolean z;
        synchronized (f40846b) {
            z = c;
        }
        return z;
    }

    public static long l() throws IOException {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            o(bArr, 40, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            byte b2 = bArr[0];
            int i = bArr[1] & 255;
            long jN = n(bArr, 24);
            long jN2 = n(bArr, 32);
            long jN3 = n(bArr, 40);
            g((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i, jN3);
            long j2 = (j + (((jN2 - jN) + (jN3 - j)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j2;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
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

    public static long n(byte[] bArr, int i) {
        long jM = m(bArr, i);
        long jM2 = m(bArr, i + 4);
        if (jM == 0 && jM2 == 0) {
            return 0L;
        }
        return ((jM - 2208988800L) * 1000) + ((jM2 * 1000) / 4294967296L);
    }

    public static void o(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        long j4 = j2 + 2208988800L;
        bArr[i] = (byte) (j4 >> 24);
        bArr[i + 1] = (byte) (j4 >> 16);
        bArr[i + 2] = (byte) (j4 >> 8);
        bArr[i + 3] = (byte) j4;
        long j5 = (j3 * 4294967296L) / 1000;
        bArr[i + 4] = (byte) (j5 >> 24);
        bArr[i + 5] = (byte) (j5 >> 16);
        bArr[i + 6] = (byte) (j5 >> 8);
        bArr[i + 7] = (byte) (Math.random() * 255.0d);
    }
}
