package com.huawei.haf.common.os;

import android.os.Build;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.LogUtil;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;

/* JADX INFO: loaded from: classes.dex */
public final class FileUtils {
    private FileUtils() {
    }

    public static long e(File file, File file2) throws IOException {
        h(file);
        b(file2, true);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                long jA = a(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
                return jA;
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static long d(InputStream inputStream, File file) throws IOException {
        b(file, true);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            long jA = a(inputStream, fileOutputStream);
            fileOutputStream.close();
            return jA;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        long jCopy;
        if (Build.VERSION.SDK_INT >= 29) {
            jCopy = android.os.FileUtils.copy(inputStream, outputStream);
        } else {
            byte[] bArr = new byte[8192];
            long j = 0;
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                outputStream.write(bArr, 0, i);
                j += (long) i;
            }
            jCopy = j;
        }
        outputStream.flush();
        if (outputStream instanceof FileOutputStream) {
            ((FileOutputStream) outputStream).getFD().sync();
        }
        return jCopy;
    }

    public static void b(File[] fileArr, File file) throws Throwable {
        FileInputStream fileInputStream;
        b(file, true);
        FileInputStream fileInputStream2 = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[8192];
                fileInputStream = null;
                for (File file2 : fileArr) {
                    try {
                        if (file2 == null) {
                            LogUtil.e("HAF_FileUtils", "mergeFiles, file is null");
                        } else {
                            h(file2);
                            FileInputStream fileInputStream3 = new FileInputStream(file2);
                            while (true) {
                                try {
                                    int i = fileInputStream3.read(bArr);
                                    if (i == -1) {
                                        break;
                                    } else {
                                        fileOutputStream.write(bArr, 0, i);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    fileInputStream2 = fileInputStream3;
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                            a(fileInputStream3);
                            fileInputStream = null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream2 = fileInputStream;
                    }
                }
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
                try {
                    fileOutputStream.close();
                    a(fileInputStream);
                } catch (Throwable th4) {
                    th = th4;
                    a(fileInputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            fileInputStream = fileInputStream2;
        }
    }

    public static void d(File file, File file2, boolean z) throws IOException {
        h(file);
        b(file2, z);
        if (file.renameTo(file2)) {
            return;
        }
        e(file, file2);
        if (b(file)) {
            return;
        }
        throw new IOException("Failed to delete original file '" + file + "' after copy to '" + file2 + "'");
    }

    private static void b(File file, boolean z) throws IOException {
        a(file, true, z);
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.mkdirs() || parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Destination '" + parentFile + "' directory cannot be created");
    }

    private static void h(File file) throws IOException {
        if (!file.exists()) {
            throw new IOException("Source file '" + file + "' is not exists");
        }
        if (file.isDirectory()) {
            throw new IOException("Source file '" + file + "' is directory");
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    private static void a(File file, boolean z, boolean z2) throws IOException {
        String str;
        if (!z2 && file.exists()) {
            throw new IOException("Destination file '" + file + "' already exists");
        }
        if (file.isDirectory()) {
            if (z) {
                str = "' is directory";
            } else {
                str = null;
            }
        } else if (z) {
            str = null;
        } else {
            str = "' is file";
        }
        if (str == null) {
            return;
        }
        throw new IOException("Destination file '" + file + str);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                LogUtil.d("HAF_FileUtils", "An exception occurred while closing the 'Closeable' object.");
            }
        }
    }

    public static void c(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception unused) {
                LogUtil.d("HAF_FileUtils", "An exception occurred while closing the 'AutoCloseable' object.");
            }
        }
    }

    public static String a(File file, long j) throws IOException {
        h(file);
        StringBuilder sb = new StringBuilder(2048);
        byte[] bArr = new byte[1024];
        for (int i = 0; i < 3; i++) {
            long length = file.length();
            if (length > j) {
                throw new IOException("file too length, length=" + length + ", maxLength=" + j);
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    a(fileInputStream, sb, bArr, j);
                    fileInputStream.close();
                    break;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                if (i >= 2) {
                    throw e;
                }
                LogUtil.d("HAF_FileUtils", "readContentFromFile num=", Integer.valueOf(i), ", ex=", LogUtil.c(e));
            }
        }
        return sb.toString();
    }

    public static String e(InputStream inputStream, long j) throws IOException {
        StringBuilder sb = new StringBuilder(2048);
        a(inputStream, sb, new byte[1024], j);
        return sb.toString();
    }

    private static void a(InputStream inputStream, StringBuilder sb, byte[] bArr, long j) throws IOException {
        sb.delete(0, sb.length());
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            }
            String str = new String(bArr, 0, i, StandardCharsets.UTF_8);
            int length = sb.length() + str.length();
            if (length > j) {
                throw new IOException("read data too length, length=" + length + ", maxLength=" + j);
            }
            sb.append(str);
        }
    }

    public static boolean d(File file, boolean z) {
        try {
            a(file, z);
        } catch (IOException e) {
            LogUtil.e("HAF_FileUtils", "createNewFile, ex=", LogUtil.c(e));
        }
        return file.exists();
    }

    public static void a(File file, boolean z) throws IOException {
        if (file == null || file.exists()) {
            if (z) {
                f(file);
                return;
            }
            return;
        }
        IOException e = null;
        int i = 0;
        boolean z2 = false;
        while (i < 3 && !z2) {
            i++;
            try {
                if (!file.createNewFile()) {
                    LogUtil.e("HAF_FileUtils", "File ", file.getPath(), " already exists");
                }
                if (z) {
                    f(file);
                }
                z2 = true;
            } catch (IOException e2) {
                e = e2;
                z2 = false;
            }
        }
        if (z2) {
            return;
        }
        throw new IOException("Failed to create file " + file.getPath(), e);
    }

    public static boolean b(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        int i = 0;
        boolean z = false;
        while (i < 3 && !z) {
            i++;
            if (file.delete()) {
                z = true;
            }
        }
        if (z) {
            return z;
        }
        if (!file.exists()) {
            return true;
        }
        LogUtil.e("HAF_FileUtils", "Failed to delete file: ", file.getPath());
        return z;
    }

    public static File c(File file) {
        if (!file.exists() && !file.mkdirs() && !file.exists()) {
            LogUtil.e("HAF_FileUtils", "mkdirs fail, dir=", file.getPath());
        }
        return file;
    }

    public static void d(File file) {
        e(file, true);
    }

    public static void e(File file, boolean z) {
        if (file != null && file.exists() && file.isDirectory()) {
            c(file, z);
        }
    }

    public static void e(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        c(file, true);
    }

    public static void a(File file, FilenameFilter filenameFilter) {
        if (file != null && file.exists() && file.isDirectory()) {
            File[] fileArrListFiles = filenameFilter != null ? file.listFiles(filenameFilter) : file.listFiles();
            if (fileArrListFiles == null) {
                LogUtil.e("HAF_FileUtils", "list files is null");
                return;
            }
            for (File file2 : fileArrListFiles) {
                c(file2, true);
            }
        }
    }

    private static void c(File file, boolean z) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    c(file2, true);
                }
                if (z) {
                    j(file);
                    return;
                }
                return;
            }
            return;
        }
        j(file);
    }

    public static boolean j(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        boolean zDelete = file.delete();
        if (!zDelete && file.exists()) {
            LogUtil.e("HAF_FileUtils", "Failed to delete file, try to delete when exit. path: ", file.getPath());
            file.deleteOnExit();
        }
        return zDelete;
    }

    public static boolean a(File file) {
        return file != null && file.exists() && file.canRead() && file.isFile() && file.length() > 0;
    }

    public static boolean f(File file) {
        boolean z = false;
        if (file != null && file.exists()) {
            try {
                boolean readOnly = file.setReadOnly();
                if (!readOnly) {
                    try {
                        LogUtil.e("HAF_FileUtils", "setReadOnly failed. path:", file.getPath());
                    } catch (SecurityException e) {
                        e = e;
                        z = readOnly;
                        LogUtil.d("HAF_FileUtils", "setReadOnly ex=", LogUtil.c(e));
                        return z;
                    }
                }
                return readOnly;
            } catch (SecurityException e2) {
                e = e2;
            }
        }
        return z;
    }

    public static long i(File file) {
        if (file == null || !file.exists()) {
            return 0L;
        }
        return n(file);
    }

    private static long n(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        try {
            return FileVisitUtils.a(file.toPath());
        } catch (IOException e) {
            LogUtil.e("HAF_FileUtils", "sizeOfDirectory ", file.getPath(), " fail, ex=", LogUtil.c(e));
            return l(file);
        }
    }

    private static long l(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return 0L;
        }
        long jN = 0;
        for (File file2 : fileArrListFiles) {
            if (!g(file2)) {
                jN += n(file2);
                if (jN < 0) {
                    return jN;
                }
            }
        }
        return jN;
    }

    private static boolean g(File file) {
        try {
            return Files.isSymbolicLink(file.toPath());
        } catch (InvalidPathException e) {
            LogUtil.d("isSymlink", "Invalid path: " + file.getPath(), "  e=", LogUtil.c(e));
            return false;
        }
    }

    public static File d(File file, String str) throws IOException {
        try {
            File canonicalFile = new File(file, str).getCanonicalFile();
            if (canonicalFile.getPath().startsWith(file.getCanonicalPath())) {
                return canonicalFile;
            }
            throw new IOException("Possible path traversa issues. path=" + str);
        } catch (IOException e) {
            LogUtil.d("HAF_FileUtils", "getSafeFile ex=", ExceptionUtils.c(e));
            throw e;
        }
    }

    public static boolean c(File file, String str) {
        File fileD;
        try {
            fileD = d(file, str);
        } catch (IOException unused) {
            fileD = null;
        }
        return fileD != null;
    }
}
