package com.xiaomi.smarthome.framework.plugin.rn.utils;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import com.xiaomi.smarthome.library.mime.MimeUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public class FileUtils {
    private static String TAG = "FileUtils";
    public static final int TYPE_PICTURE = 1;
    public static final int TYPE_VIDEO = 2;

    public static void close(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                MRnLog.w(TAG, "close error:", e);
            }
        }
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        long j = 0;
        if (inputStream == null || outputStream == null) {
            return 0L;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            byte[] bArr = new byte[16384];
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                bufferedOutputStream = new BufferedOutputStream(outputStream);
                while (true) {
                    try {
                        int i = bufferedInputStream2.read(bArr);
                        if (i == -1) {
                            bufferedOutputStream.flush();
                            close(bufferedInputStream2);
                            close(bufferedOutputStream);
                            return j;
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                        j += (long) i;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        close(bufferedInputStream);
                        close(bufferedOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
        }
    }

    public static void copyAsserts(Context context, String str, String str2) throws IOException {
        InputStream inputStreamOpen = context.getResources().getAssets().open(str);
        FileOutputStream fileOutputStream = new FileOutputStream(createFileWhetherExists(str2));
        byte[] bArr = new byte[2048];
        while (true) {
            int i = inputStreamOpen.read(bArr);
            if (i == -1) {
                fileOutputStream.flush();
                inputStreamOpen.close();
                fileOutputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i);
        }
    }

    public static boolean copyFileToFile(String str, String str2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            FileOutputStream fileOutputStream = new FileOutputStream(createFileWhetherExists(str2));
            byte[] bArr = new byte[2048];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    fileOutputStream.flush();
                    fileInputStream.close();
                    fileOutputStream.close();
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public static void createDirIfNotExists(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static File createFileIfNotExists(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException unused) {
        }
        return file;
    }

    public static File createFileWhetherExists(String str) {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        return file;
    }

    public static void deleteDirectory(String str) {
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2 != null && file2.exists()) {
                        deleteDirectory(file2.getAbsolutePath());
                    }
                }
            }
            file.delete();
        }
    }

    public static boolean deleteFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && !file.isDirectory() && file.delete();
    }

    public static boolean fileExists(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }

    public static String generateFileNameByTime(int i, String str) {
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(1);
        int i3 = calendar.get(2) + 1;
        int i4 = calendar.get(5);
        int i5 = calendar.get(11);
        int i6 = calendar.get(12);
        int i7 = calendar.get(13);
        int i8 = calendar.get(14);
        if (i != 1) {
            return i != 2 ? String.format("MIOT_%d%02d%02d_%02d%02d%02d%03d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)) : String.format("VIDEO_%d%02d%02d_%02d%02d%02d%03d.mp4", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
        }
        return String.format("PIC_%d%02d%02d_%02d%02d%02d%03d." + str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
    }

    public static String getExtensionFromFileName(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf != -1 ? str.substring(iLastIndexOf + 1) : "";
    }

    public static String getMimeTypeFromFilePath(String str) {
        String strGuessMimeTypeFromExtension;
        if (TextUtils.isEmpty(str)) {
            return "application/octet-stream";
        }
        String nameFromFilePath = getNameFromFilePath(str);
        return (TextUtils.isEmpty(nameFromFilePath) || (strGuessMimeTypeFromExtension = MimeUtils.guessMimeTypeFromExtension(getExtensionFromFileName(nameFromFilePath))) == null) ? "application/octet-stream" : strGuessMimeTypeFromExtension;
    }

    public static String getNameFromFileName(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf != -1 ? str.substring(0, iLastIndexOf) : str;
    }

    public static String getNameFromFilePath(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf != -1 ? str.substring(iLastIndexOf + 1) : str;
    }

    public static boolean insertFileToMediaStore(Context context, String str, String str2) throws Exception {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            ContentResolver contentResolver = context.getContentResolver();
            if (!TextUtils.isEmpty(str)) {
                Uri contentUri = MediaStore.Files.getContentUri("external");
                String str3 = Environment.DIRECTORY_DOCUMENTS + File.separator + "external";
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", getMimeTypeFromFilePath(str2));
                contentValues.put("relative_path", str3);
                contentValues.put("is_pending", (Integer) 1);
                Uri uriInsert = contentResolver.insert(contentUri, contentValues);
                if (uriInsert == null) {
                    contentValues.put("relative_path", str3 + System.currentTimeMillis());
                    uriInsert = contentResolver.insert(contentUri, contentValues);
                }
                copy(new FileInputStream(str2), contentResolver.openOutputStream(uriInsert));
                contentValues.clear();
                contentValues.put("is_pending", (Integer) 0);
                contentResolver.update(uriInsert, contentValues, null, null);
                return true;
            }
        }
        return false;
    }

    public static void makeFileDirectories(String str) {
        File parentFile;
        if (TextUtils.isEmpty(str) || (parentFile = new File(str).getParentFile()) == null || parentFile.exists()) {
            return;
        }
        parentFile.mkdirs();
    }

    public static byte[] readFile(String str) {
        byte[] bArr = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (FileNotFoundException | IOException unused) {
            return bArr;
        }
    }

    public static String readTxtFromFile(String str) {
        File file = new File(str);
        String str2 = "";
        if (file.isFile()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    str2 = str2 + line + "\n";
                }
                fileInputStream.close();
            } catch (FileNotFoundException | IOException unused) {
            }
        }
        return str2;
    }
}
