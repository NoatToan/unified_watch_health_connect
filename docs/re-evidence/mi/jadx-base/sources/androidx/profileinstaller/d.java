package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.cqk;
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
    public static final cqk<c> f2776a = cqk.r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f2777b = new Object();
    public static c c = null;

    @RequiresApi(33)
    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2779b;
        public final long c;
        public final long d;

        public b(int i, int i2, long j, long j2) {
            this.f2778a = i;
            this.f2779b = i2;
            this.c = j;
            this.d = j2;
        }

        public static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f2778a);
                dataOutputStream.writeInt(this.f2779b);
                dataOutputStream.writeLong(this.c);
                dataOutputStream.writeLong(this.d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2779b == bVar.f2779b && this.c == bVar.c && this.f2778a == bVar.f2778a && this.d == bVar.d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f2779b), Long.valueOf(this.c), Integer.valueOf(this.f2778a), Long.valueOf(this.d));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f2781b;
        public final boolean c;

        public c(int i, boolean z, boolean z2) {
            this.f2780a = i;
            this.c = z2;
            this.f2781b = z;
        }
    }

    public static long a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b(int i, boolean z, boolean z2) {
        c cVar = new c(i, z, z2);
        c = cVar;
        f2776a.o(cVar);
        return c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static c c(Context context, boolean z) {
        b bVarA;
        int i;
        c cVar;
        if (!z && (cVar = c) != null) {
            return cVar;
        }
        synchronized (f2777b) {
            if (!z) {
                try {
                    c cVar2 = c;
                    if (cVar2 != null) {
                        return cVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 0;
            if (i2 >= 28 && i2 != 30) {
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z2 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z3 = file2.exists() && length2 > 0;
                try {
                    long jA = a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarA = b.a(file3);
                        } catch (IOException unused) {
                            return b(131072, z2, z3);
                        }
                    } else {
                        bVarA = null;
                    }
                    if (bVarA != null && bVarA.c == jA && (i = bVarA.f2779b) != 2) {
                        i3 = i;
                    } else if (z2) {
                        i3 = 1;
                    } else if (z3) {
                        i3 = 2;
                    }
                    if (z && z3 && i3 != 1) {
                        i3 = 2;
                    }
                    if (bVarA != null && bVarA.f2779b == 2 && i3 == 1 && length < bVarA.d) {
                        i3 = 3;
                    }
                    b bVar = new b(1, i3, jA, length2);
                    if (bVarA == null || !bVarA.equals(bVar)) {
                        try {
                            bVar.b(file3);
                        } catch (IOException unused2) {
                            i3 = 196608;
                        }
                    }
                    return b(i3, z2, z3);
                } catch (PackageManager.NameNotFoundException unused3) {
                    return b(65536, z2, z3);
                }
            }
            return b(262144, false, false);
        }
    }
}
