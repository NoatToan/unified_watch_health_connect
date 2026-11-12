package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.concurrent.futures.e;
import com.garmin.proto.generated.GDIInReachMessaging;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e<c> f10234a = e.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f10235b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f10236c = null;

    public static class a {
        private a() {
        }

        public static PackageInfo a(Context context, PackageManager packageManager) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f10240d;

        public b(int i14, int i15, long j8, long j14) {
            this.f10237a = i14;
            this.f10238b = i15;
            this.f10239c = j8;
            this.f10240d = j14;
        }

        public static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th3) {
                try {
                    dataInputStream.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }

        public final void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f10237a);
                dataOutputStream.writeInt(this.f10238b);
                dataOutputStream.writeLong(this.f10239c);
                dataOutputStream.writeLong(this.f10240d);
                dataOutputStream.close();
            } catch (Throwable th3) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f10238b == bVar.f10238b && this.f10239c == bVar.f10239c && this.f10237a == bVar.f10237a && this.f10240d == bVar.f10240d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f10238b), Long.valueOf(this.f10239c), Integer.valueOf(this.f10237a), Long.valueOf(this.f10240d));
        }
    }

    public static class c {
        public c(int i14, boolean z14, boolean z15, boolean z16) {
        }
    }

    private d() {
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(context, packageManager).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b(int i14, boolean z14, boolean z15, boolean z16) {
        c cVar = new c(i14, z14, z15, z16);
        f10236c = cVar;
        f10234a.set(cVar);
        return f10236c;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0047 A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:9:0x000d, B:11:0x0011, B:16:0x001a, B:22:0x002f, B:33:0x0041, B:35:0x0047, B:36:0x004c, B:38:0x004f, B:44:0x0072, B:50:0x0095, B:51:0x0099, B:53:0x00aa, B:62:0x00ba, B:64:0x00c0, B:79:0x00dc, B:82:0x00e2, B:85:0x00e9, B:87:0x00f2, B:92:0x00fe, B:93:0x0101, B:89:0x00f8, B:56:0x00b1, B:57:0x00b4, B:95:0x0103, B:96:0x0108, B:31:0x003f, B:30:0x003c), top: B:102:0x000d, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x004f A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:9:0x000d, B:11:0x0011, B:16:0x001a, B:22:0x002f, B:33:0x0041, B:35:0x0047, B:36:0x004c, B:38:0x004f, B:44:0x0072, B:50:0x0095, B:51:0x0099, B:53:0x00aa, B:62:0x00ba, B:64:0x00c0, B:79:0x00dc, B:82:0x00e2, B:85:0x00e9, B:87:0x00f2, B:92:0x00fe, B:93:0x0101, B:89:0x00f8, B:56:0x00b1, B:57:0x00b4, B:95:0x0103, B:96:0x0108, B:31:0x003f, B:30:0x003c), top: B:102:0x000d, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    public static void c(Context context, boolean z14) {
        int i14;
        boolean z15;
        File file;
        boolean z16;
        File file2;
        long length;
        boolean z17;
        File file3;
        b bVarA;
        b bVar;
        int i15;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z14 || f10236c == null) {
            synchronized (f10235b) {
                if (z14) {
                    i14 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    if (Build.VERSION.SDK_INT == 30) {
                        b(GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, false, false, z15);
                        return;
                    }
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    long jA = a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        bVarA = b.a(file3);
                    } else {
                        bVarA = null;
                    }
                    if (bVarA == null) {
                        if (!z15) {
                            i14 = 327680;
                        } else if (z16) {
                            i14 = 1;
                        } else if (z17) {
                            i14 = 2;
                        }
                    } else if (!z15) {
                        i14 = 327680;
                    } else if (z16) {
                        i14 = 1;
                    } else if (z17) {
                        i14 = 2;
                    }
                    if (z14) {
                        i14 = 2;
                    }
                    if (bVarA != null) {
                        i14 = 3;
                    }
                    int i16 = i14;
                    bVar = new b(1, i16, jA, length);
                    if (bVarA != null) {
                        bVar.b(file3);
                    } else {
                        bVar.b(file3);
                    }
                    b(i16, z16, z17, z15);
                    return;
                }
                if (f10236c != null) {
                    return;
                }
                i14 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th3) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th3;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (IOException unused) {
                    z15 = false;
                }
                if (Build.VERSION.SDK_INT == 30) {
                    b(GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, false, false, z15);
                    return;
                }
                file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length3 = file.length();
                if (file.exists() || length3 <= 0) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file2.length();
                if (file2.exists() || length <= 0) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                try {
                    long jA2 = a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarA = b.a(file3);
                        } catch (IOException unused2) {
                            b(131072, z16, z17, z15);
                            return;
                        }
                    } else {
                        bVarA = null;
                    }
                    if (bVarA == null && bVarA.f10239c == jA2 && (i15 = bVarA.f10238b) != 2) {
                        i14 = i15;
                    } else if (!z15) {
                        i14 = 327680;
                    } else if (z16) {
                        i14 = 1;
                    } else if (z17) {
                        i14 = 2;
                    }
                    if (z14 && z17 && i14 != 1) {
                        i14 = 2;
                    }
                    if (bVarA != null && bVarA.f10238b == 2 && i14 == 1 && length3 < bVarA.f10240d) {
                        i14 = 3;
                    }
                    int i17 = i14;
                    bVar = new b(1, i17, jA2, length);
                    if (bVarA != null || !bVarA.equals(bVar)) {
                        try {
                            bVar.b(file3);
                        } catch (IOException unused3) {
                            i17 = 196608;
                        }
                    }
                    b(i17, z16, z17, z15);
                    return;
                } catch (PackageManager.NameNotFoundException unused4) {
                    b(65536, z16, z17, z15);
                    return;
                }
                throw th;
            }
        }
    }
}
