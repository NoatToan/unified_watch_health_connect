package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import dalvik.system.BaseDexClassLoader;
import defpackage.sl9;
import defpackage.u07;
import java.io.DataOutput;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.TreeSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes4.dex */
public final class SysUtil {

    @TargetApi(14)
    @u07
    public static class Api14Utils {
        public static String a() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            }
            throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
        }
    }

    @TargetApi(21)
    @u07
    public static final class LollipopSysdeps {
        private LollipopSysdeps() {
        }

        @u07
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) throws IOException {
            int i;
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j);
            } catch (ErrnoException e) {
                if (e.errno != OsConstants.EOPNOTSUPP && (i = e.errno) != OsConstants.ENOSYS && i != OsConstants.EINVAL) {
                    throw new IOException(e.toString(), e);
                }
            }
        }

        @u07
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (is64Bit()) {
                    treeSet.add(MinElf.ISA.AARCH64.toString());
                    treeSet.add(MinElf.ISA.X86_64.toString());
                } else {
                    treeSet.add(MinElf.ISA.ARM.toString());
                    treeSet.add(MinElf.ISA.X86.toString());
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e) {
                String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr), Integer.valueOf(e.errno), e.getMessage());
                return Build.SUPPORTED_ABIS;
            }
        }

        @u07
        public static boolean is64Bit() throws ErrnoException {
            return Os.readlink("/proc/self/exe").contains("64");
        }
    }

    @TargetApi(23)
    @u07
    public static final class MarshmallowSysdeps {
        private MarshmallowSysdeps() {
        }

        public static boolean a(Context context) throws IOException {
            ZipFile zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir));
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (true) {
                    if (!enumerationEntries.hasMoreElements()) {
                        zipFile.close();
                        return false;
                    }
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    if (zipEntryNextElement != null && zipEntryNextElement.getName().endsWith(".so") && zipEntryNextElement.getName().contains("/lib")) {
                        boolean z = zipEntryNextElement.getMethod() == 0;
                        zipFile.close();
                        return z;
                    }
                }
            } catch (Throwable th) {
                try {
                    zipFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public static boolean b(Context context) {
            return context != null && (context.getApplicationInfo().flags & 268435456) == 0;
        }

        public static boolean c(Context context, int i) throws IOException {
            return i == 2 ? a(context) : b(context);
        }

        @u07
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (is64Bit()) {
                treeSet.add(MinElf.ISA.AARCH64.toString());
                treeSet.add(MinElf.ISA.X86_64.toString());
            } else {
                treeSet.add(MinElf.ISA.ARM.toString());
                treeSet.add(MinElf.ISA.X86.toString());
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        @u07
        public static boolean is64Bit() {
            return Process.is64Bit();
        }
    }

    public static int a(DataOutput dataOutput, InputStream inputStream, int i, byte[] bArr) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, 0, Math.min(bArr.length, i - i2));
            if (i3 == -1) {
                break;
            }
            dataOutput.write(bArr, 0, i3);
            i2 += i3;
        }
        return i2;
    }

    public static void b(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Enable write permission failed: ");
            sb.append(parentFile);
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("Could not delete file " + file);
    }

    public static void c(File file) throws IOException {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                c(file2);
            }
        }
        b(file);
    }

    public static void d(FileDescriptor fileDescriptor, long j) throws IOException {
        LollipopSysdeps.fallocateIfSupported(fileDescriptor, j);
    }

    public static int e(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            if (str2 != null && str.equals(str2)) {
                return i;
            }
        }
        return -1;
    }

    public static void f(File file) throws IOException {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new IOException("cannot list directory " + file);
            }
            for (File file2 : fileArrListFiles) {
                f(file2);
            }
            return;
        }
        if (file.getPath().endsWith("_lock")) {
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    public static String h(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf > 0 ? str.substring(0, iLastIndexOf) : str;
    }

    public static sl9 i(File file, File file2, boolean z) throws Throwable {
        boolean z2;
        try {
            return z ? sl9.b(file2) : sl9.c(file2);
        } catch (FileNotFoundException e) {
            z2 = true;
            try {
                if (!file.setWritable(true)) {
                    throw e;
                }
                if (z) {
                    sl9 sl9VarB = sl9.b(file2);
                    if (!file.setWritable(false)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("error removing ");
                        sb.append(file.getCanonicalPath());
                        sb.append(" write permission");
                    }
                    return sl9VarB;
                }
                sl9 sl9VarC = sl9.c(file2);
                if (!file.setWritable(false)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("error removing ");
                    sb2.append(file.getCanonicalPath());
                    sb2.append(" write permission");
                }
                return sl9VarC;
            } catch (Throwable th) {
                th = th;
                if (z2 && !file.setWritable(false)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("error removing ");
                    sb3.append(file.getCanonicalPath());
                    sb3.append(" write permission");
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = false;
            if (z2) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("error removing ");
                sb4.append(file.getCanonicalPath());
                sb4.append(" write permission");
            }
            throw th;
        }
    }

    public static String[] j() {
        return MarshmallowSysdeps.getSupportedAbis();
    }

    @SuppressLint({"CatchGeneralException"})
    public static boolean k() {
        return MarshmallowSysdeps.is64Bit();
    }

    public static boolean l(Context context, int i) throws IOException {
        return MarshmallowSysdeps.c(context, i);
    }

    public static void m(File file) throws IOException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new IOException("cannot mkdir: " + file);
    }
}
