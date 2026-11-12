package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import androidx.annotation.RestrictTo;
import defpackage.rbi;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC0065c f2774a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC0065c f2775b = new b();

    public class a implements InterfaceC0065c {
        @Override // androidx.profileinstaller.c.InterfaceC0065c
        public void a(int i, Object obj) {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0065c
        public void b(int i, Object obj) {
        }
    }

    public class b implements InterfaceC0065c {
        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0000. Please report as an issue. */
        @Override // androidx.profileinstaller.c.InterfaceC0065c
        public void a(int i, Object obj) {
            switch (i) {
            }
            if (i == 6 || i == 7 || i == 8) {
            }
        }

        @Override // androidx.profileinstaller.c.InterfaceC0065c
        public void b(int i, Object obj) {
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$c, reason: collision with other inner class name */
    public interface InterfaceC0065c {
        void a(int i, Object obj);

        void b(int i, Object obj);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    public static void c(Context context, Executor executor, InterfaceC0065c interfaceC0065c) {
        b(context.getFilesDir());
        g(executor, interfaceC0065c, 11, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean d(PackageInfo packageInfo, File file, InterfaceC0065c interfaceC0065c) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j = dataInputStream.readLong();
                dataInputStream.close();
                boolean z = j == packageInfo.lastUpdateTime;
                if (z) {
                    interfaceC0065c.a(2, null);
                }
                return z;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void f(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static void g(Executor executor, final InterfaceC0065c interfaceC0065c, final int i, final Object obj) {
        executor.execute(new Runnable() { // from class: sbi
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC0065c.a(i, obj);
            }
        });
    }

    public static boolean h(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, InterfaceC0065c interfaceC0065c) {
        androidx.profileinstaller.b bVar = new androidx.profileinstaller.b(assetManager, executor, interfaceC0065c, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!bVar.e()) {
            return false;
        }
        boolean zN = bVar.i().m().n();
        if (zN) {
            f(packageInfo, file);
        }
        return zN;
    }

    public static void i(Context context) {
        j(context, new rbi(), f2774a);
    }

    public static void j(Context context, Executor executor, InterfaceC0065c interfaceC0065c) {
        k(context, executor, interfaceC0065c, false);
    }

    public static void k(Context context, Executor executor, InterfaceC0065c interfaceC0065c, boolean z) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z && d(packageInfo, filesDir, interfaceC0065c)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Skipping profile installation for ");
                sb.append(context.getPackageName());
                d.c(context, false);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Installing profile for ");
            sb2.append(context.getPackageName());
            if (h(assets, packageName, packageInfo, filesDir, name, executor, interfaceC0065c) && z) {
                z2 = true;
            }
            d.c(context, z2);
        } catch (PackageManager.NameNotFoundException e) {
            interfaceC0065c.a(7, e);
            d.c(context, false);
        }
    }

    public static void l(Context context, Executor executor, InterfaceC0065c interfaceC0065c) {
        try {
            f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            g(executor, interfaceC0065c, 10, null);
        } catch (PackageManager.NameNotFoundException e) {
            g(executor, interfaceC0065c, 7, e);
        }
    }
}
