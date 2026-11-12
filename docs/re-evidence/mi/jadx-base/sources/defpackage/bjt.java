package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class bjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4299b;
    public File c;

    public bjt(Context context) throws PackageManager.NameNotFoundException {
        this.f4299b = context;
        this.f4298a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static void l(File file) throws IOException {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                l(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }

    public static void m(File file) {
        file.setWritable(false, true);
        file.setWritable(false, false);
    }

    public static boolean p(File file) {
        return !file.canWrite();
    }

    public static File q(File file, String str) throws IOException {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    public static File u(File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                return file;
            }
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
        file.mkdirs();
        if (file.isDirectory()) {
            return file;
        }
        throw new IOException("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
    }

    public static String x(String str) {
        return String.valueOf(str).concat(".apk");
    }

    public final File a(String str) throws IOException {
        File file = new File(w(), "dex");
        u(file);
        File fileQ = q(file, str);
        u(fileQ);
        return fileQ;
    }

    public final File b() throws IOException {
        File file = new File(w(), "unverified-splits");
        u(file);
        return file;
    }

    public final File c(String str, String str2) throws IOException {
        return q(s(str), str2);
    }

    public final File d() throws IOException {
        return new File(w(), "lock.tmp");
    }

    public final File e(String str) throws IOException {
        return q(b(), x(str));
    }

    public final File f(File file) throws IOException {
        return q(t(), file.getName());
    }

    public final File g(String str) throws IOException {
        return q(t(), x(str));
    }

    public final List h() throws IOException {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = r().listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    public final Set i(String str) throws IOException {
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = s(str).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    public final Set j() throws IOException {
        File fileT = t();
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = fileT.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && file.getName().endsWith(".apk") && p(file)) {
                    String name = file.getName();
                    hashSet.add(new kit(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final void k() throws IOException {
        File fileV = v();
        String[] list = fileV.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f4298a))) {
                    File file = new File(fileV, str);
                    String string = file.toString();
                    long j = this.f4298a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("FileStorage: removing directory for different version code (directory = ");
                    sb.append(string);
                    sb.append(", current version code = ");
                    sb.append(j);
                    sb.append(")");
                    l(file);
                }
            }
        }
    }

    public final void n(String str) throws IOException {
        l(s(str));
    }

    public final void o(File file) throws IOException {
        if (!file.getParentFile().getParentFile().equals(r())) {
            throw new IllegalStateException("File to remove is not a native library");
        }
        l(file);
    }

    public final File r() throws IOException {
        File file = new File(w(), "native-libraries");
        u(file);
        return file;
    }

    public final File s(String str) throws IOException {
        File fileQ = q(r(), str);
        u(fileQ);
        return fileQ;
    }

    public final File t() throws IOException {
        File file = new File(w(), "verified-splits");
        u(file);
        return file;
    }

    public final File v() throws IOException {
        if (this.c == null) {
            Context context = this.f4299b;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.c = context.getFilesDir();
        }
        File file = new File(this.c, "splitcompat");
        u(file);
        return file;
    }

    public final File w() throws IOException {
        File file = new File(v(), Long.toString(this.f4298a));
        u(file);
        return file;
    }
}
