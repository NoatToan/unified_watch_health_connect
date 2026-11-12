package com.huami.watch.util;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class FilesUtil {
    private static final String a = "Util-Files";
    private static final int b = 8192;

    @RequiresApi(api = 19)
    private static void a(File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i <= 0) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                    try {
                        fileInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            fileInputStream.close();
            throw th4;
        }
    }

    public static void copy(File file, File file2) throws IOException {
        Log.d(a, "Copy : " + file + " => " + file2, new Object[0]);
        if (Build.VERSION.SDK_INT >= 19) {
            a(file, file2);
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i <= 0) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            fileInputStream.close();
            throw th2;
        }
    }

    public static boolean copySafe(File file, File file2) {
        try {
            copy(file, file2);
            Log.d(a, "Copy : " + file + " => " + file2 + ", Success!!", new Object[0]);
            return true;
        } catch (Exception e) {
            Log.w(a, "CopyFileErr", e, new Object[0]);
            return false;
        }
    }

    public static boolean delete(File file) {
        boolean zDelete = true;
        if (file == null || !file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Delete : ");
            sb.append(file);
            sb.append(", Exists : ");
            sb.append(file != null && file.exists());
            Log.d(a, sb.toString(), new Object[0]);
            return false;
        }
        if (file.isFile()) {
            zDelete = file.delete();
        } else if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                zDelete = file.delete();
            } else {
                Log.d(a, "Delete..." + Arrays.toString(fileArrListFiles), new Object[0]);
                for (File file2 : fileArrListFiles) {
                    if (file2 != null) {
                        zDelete &= file2.delete();
                    }
                }
                zDelete &= file.delete();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Delete ");
        sb2.append(file.isFile() ? "File : " : "Dir : ");
        sb2.append(file);
        sb2.append(", Success : ");
        sb2.append(zDelete);
        Log.d(a, sb2.toString(), new Object[0]);
        return zDelete;
    }

    public static boolean exists(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append("File : ");
        sb.append(file);
        sb.append(", Exists : ");
        sb.append(file != null && file.exists());
        Log.d(a, sb.toString(), new Object[0]);
        return file != null && file.exists();
    }

    public static String read(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        boolean z = true;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                if (z) {
                    sb.append(line);
                    z = false;
                } else {
                    sb.append('\n');
                    sb.append(line);
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static byte[] readBytes(@NonNull File file) throws IOException {
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            bufferedInputStream.read(bArr, 0, length);
            bufferedInputStream.close();
            return bArr;
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] readBytesSafe(File file) {
        byte[] bytes = null;
        if (!exists(file)) {
            return null;
        }
        try {
            bytes = readBytes(file);
        } catch (Exception e) {
            Log.e(a, "ReadFileToBytesFail [" + file + "]", e, new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("File[");
        sb.append(file);
        sb.append("] => Bytes: ");
        sb.append(bytes);
        sb.append(", L: ");
        sb.append(bytes != null ? bytes.length : -1);
        Log.d(a, sb.toString(), new Object[0]);
        return bytes;
    }

    public static String readSafe(File file) {
        Log.d(a, "Read: " + file, new Object[0]);
        if (!exists(file)) {
            return null;
        }
        try {
            return read(file);
        } catch (Exception e) {
            Log.e(a, "Read Fail", e, new Object[0]);
            return null;
        }
    }

    public static void save(@NonNull byte[] bArr, @NonNull File file) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        try {
            bufferedOutputStream.write(bArr);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        } catch (Throwable th) {
            try {
                bufferedOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean saveSafe(byte[] bArr, File file) {
        StringBuilder sb = new StringBuilder();
        sb.append("Save: ");
        sb.append(bArr);
        sb.append(", L: ");
        sb.append(bArr != null ? bArr.length : -1);
        sb.append(" => ");
        sb.append(file);
        Log.d(a, sb.toString(), new Object[0]);
        if (bArr == null || bArr.length == 0 || file == null) {
            return false;
        }
        try {
            save(bArr, file);
            return true;
        } catch (Exception e) {
            Log.e(a, "Save Fail", e, new Object[0]);
            return false;
        }
    }
}
