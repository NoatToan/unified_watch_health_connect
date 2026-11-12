package com.xiaomi.mi_connect_service.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class FileUtil {
    private static final String TAG = "FileUtil";
    private static final FileFilter FOLDER_FILTER = new FileFilter() { // from class: com.xiaomi.mi_connect_service.util.FileUtil.1
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.isDirectory();
        }
    };
    private static final FileFilter FILE_FILTER = new FileFilter() { // from class: com.xiaomi.mi_connect_service.util.FileUtil.2
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.isFile();
        }
    };

    public static void compress(String str, String str2) {
        File file = new File(str);
        if (file.exists()) {
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(str2));
                try {
                    compress(file, zipOutputStream, "/");
                    zipOutputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            zipOutputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e) {
                LogUtil.e(TAG, e.getMessage(), e);
            }
        }
    }

    public static void deleteDirectory(String str) {
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
                for (File file2 : file.listFiles()) {
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

    public static String loadFileFromAsset(Context context, String str) {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            try {
                byte[] bArr = new byte[inputStreamOpen.available()];
                inputStreamOpen.read(bArr);
                String str2 = new String(bArr, "UTF-8");
                inputStreamOpen.close();
                return str2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (Exception e) {
            LogUtil.e(TAG, e.getMessage(), e);
            return "";
        }
    }

    private static void compress(File file, ZipOutputStream zipOutputStream, String str) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles(FILE_FILTER);
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    compress(file2, zipOutputStream, new File(str, file2.getName()).getAbsolutePath());
                }
            }
            File[] fileArrListFiles2 = file.listFiles(FOLDER_FILTER);
            if (fileArrListFiles2 != null) {
                for (File file3 : fileArrListFiles2) {
                    compress(file3, zipOutputStream, new File(str, file3.getName()).getAbsolutePath());
                }
                return;
            }
            return;
        }
        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(str));
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i >= 0) {
                            zipOutputStream.write(bArr, 0, i);
                        } else {
                            fileInputStream.close();
                            return;
                        }
                        LogUtil.e(TAG, e.getMessage(), e);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e) {
                LogUtil.e(TAG, e.getMessage(), e);
            }
        }
    }
}
