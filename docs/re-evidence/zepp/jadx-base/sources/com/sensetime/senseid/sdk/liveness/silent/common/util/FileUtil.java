package com.sensetime.senseid.sdk.liveness.silent.common.util;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public final class FileUtil {
    private FileUtil() {
    }

    public static void copyAssetsToFile(Context context, String str, String str2) {
        try {
            File file = new File(str2);
            if (!file.exists()) {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    return;
                }
            } else if (!file.delete()) {
                return;
            }
            InputStream inputStreamOpen = context.getApplicationContext().getAssets().open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (i <= 0) {
                    inputStreamOpen.close();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(@NonNull File file, @NonNull File file2) {
        if (file == null || !file.exists() || file.isDirectory() || file2 == null) {
            return;
        }
        try {
            if (file2.exists() && (file2.isDirectory() || !file2.delete())) {
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean deleteResultDir(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (!deleteResultDir(file2.getAbsolutePath())) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static String getStringFromFile(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return sb.toString();
                }
                sb.append(line);
                sb.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void saveDataToFile(byte[] bArr, String str) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                if (file.getParentFile().exists() || file.getParentFile().mkdirs()) {
                }
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            }
            file.delete();
            file.createNewFile();
            FileOutputStream fileOutputStream2 = new FileOutputStream(str);
            fileOutputStream2.write(bArr);
            fileOutputStream2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
