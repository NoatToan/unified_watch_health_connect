package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import org.eclipse.californium.elements.util.StandardCharsets;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zzs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f54838b = aaex.a((Class<?>) zzs.class);

    public static void d(OutputStream outputStream) throws IOException {
        outputStream.write(0);
    }

    public static void e(zzl zzlVar) {
        zzlVar.d((byte) 0);
    }

    public static int e(zzl zzlVar, int i, int i2) {
        if (i == 0) {
            throw new IllegalArgumentException("version must not be 0!");
        }
        zzlVar.d((byte) i);
        return zzlVar.b(i2);
    }

    public static void a(zzl zzlVar, int i, int i2) {
        zzlVar.e(i, i2);
    }

    public static int c(zzh zzhVar, int i, int i2) {
        if (i == 0) {
            throw new IllegalArgumentException("Version must not be 0!");
        }
        int iE = zzhVar.e() & 255;
        if (iE == 0) {
            return -1;
        }
        if (iE != i) {
            throw new zze("Version mismatch! " + i + " is required, not " + iE + "!", iE);
        }
        return zzhVar.a(i2);
    }

    public static int b(zzh zzhVar, a aVar, int i) {
        if (aVar == null) {
            throw new NullPointerException("Version must not be null!");
        }
        int iE = zzhVar.e() & 255;
        if (iE == 0) {
            return -1;
        }
        if (!aVar.a(iE)) {
            throw new zze("Version mismatch! " + aVar + " are required, not " + iE + "!", iE);
        }
        return zzhVar.a(i);
    }

    public static void a(zzl zzlVar, String str, int i) {
        zzlVar.b(str == null ? null : str.getBytes(StandardCharsets.UTF_8), i);
    }

    public static String e(zzh zzhVar, int i) {
        byte[] bArrJ = zzhVar.j(i);
        if (bArrJ != null) {
            return new String(bArrJ, StandardCharsets.UTF_8);
        }
        return null;
    }

    public static void b(zzl zzlVar, InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress == null) {
            e(zzlVar);
            return;
        }
        int iE = e(zzlVar, 1, 8);
        zzlVar.d(inetSocketAddress.getPort(), 16);
        if (inetSocketAddress.isUnresolved()) {
            zzlVar.d((byte) 2);
            zzlVar.a(inetSocketAddress.getHostName().getBytes(StandardCharsets.US_ASCII));
        } else {
            zzlVar.d((byte) 1);
            zzlVar.a(inetSocketAddress.getAddress().getAddress());
        }
        a(zzlVar, iE, 8);
    }

    public static InetSocketAddress b(zzh zzhVar) {
        int iC = c(zzhVar, 1, 8);
        if (iC <= 0) {
            return null;
        }
        zzf zzfVarD = zzhVar.d(iC);
        int iA = zzfVarD.a(16);
        int iE = zzfVarD.e() & 255;
        byte[] bArrI = zzfVarD.i();
        if (iE == 1) {
            try {
                return new InetSocketAddress(InetAddress.getByAddress(bArrI), iA);
            } catch (UnknownHostException unused) {
                return null;
            }
        }
        if (iE != 2) {
            return null;
        }
        return new InetSocketAddress(new String(bArrI, StandardCharsets.US_ASCII), iA);
    }

    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f54840b;

        public b(int... iArr) {
            this(true, iArr);
        }

        protected b(boolean z, int... iArr) {
            if (iArr == null) {
                throw new NullPointerException("Versions must not be null!");
            }
            if (iArr.length == 0) {
                throw new IllegalArgumentException("Versions must not be empty!");
            }
            this.f54840b = z ? Arrays.copyOf(iArr, iArr.length) : iArr;
            if (a(0)) {
                throw new IllegalArgumentException("Versions must not contain NO_VERSION!");
            }
        }

        public boolean a(int i) {
            for (int i2 : this.f54840b) {
                if (i == i2) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return Arrays.toString(this.f54840b);
        }

        public a e() {
            return new a(this.f54840b);
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    public static class a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f54839c;

        private a(int... iArr) {
            super(false, iArr);
            this.f54839c = 0;
        }

        @Override // zzs.b
        public boolean a(int i) {
            if (super.a(i)) {
                this.f54839c = i;
                return true;
            }
            this.f54839c = 0;
            return false;
        }

        public int c() {
            return this.f54839c;
        }
    }
}
