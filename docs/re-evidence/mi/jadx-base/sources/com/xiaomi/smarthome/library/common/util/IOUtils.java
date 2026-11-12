package com.xiaomi.smarthome.library.common.util;

import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public class IOUtils {
    private static final int BUFFER_SIZE = 1024;
    public static final String[] SUPPORTED_IMAGE_FORMATS = {"jpg", "png", "bmp", "gif", "webp"};

    public static void closeQuietly(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeResponseQuietly(Response response) {
        if (response == null || response.body() == null) {
            return;
        }
        response.close();
    }

    public static void copyFile(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        if (file.getAbsolutePath().equals(file2.getAbsolutePath())) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream2.read(bArr);
                        if (i < 0) {
                            fileInputStream2.close();
                            fileOutputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static void deleteDirs(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        file2.delete();
                    } else {
                        deleteDirs(file2);
                    }
                }
            }
            file.delete();
        }
    }

    public static byte[] getFileSha1Digest(String str) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        byte[] bArr = new byte[4096];
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                fileInputStream.close();
                return messageDigest.digest();
            }
            messageDigest.update(bArr, 0, i);
        }
    }

    public static String getFileSuffix(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf > 0 ? str.substring(iLastIndexOf + 1) : "";
    }

    public static Bitmap.CompressFormat getImageCompressFormat(String str) {
        return str.equals("png") ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    public static String getImageFileSuffixName(String str) {
        String fileSuffix = getFileSuffix(str);
        return (fileSuffix == null || fileSuffix == "" || !fileSuffix.toLowerCase().equals("png")) ? "jpg" : "png";
    }

    public static String getRawTxtString(Resources resources, int i) {
        if (i < 0) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resources.openRawResource(i)));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    public static void hideFromMediaScanner(File file) {
        File file2 = new File(file, ".nomedia");
        if (file2.exists() && file2.isFile()) {
            return;
        }
        try {
            file2.createNewFile();
        } catch (IOException unused) {
        }
    }

    public static boolean isSupportImageSuffix(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : SUPPORTED_IMAGE_FORMATS) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean zip(List<File> list, String str) throws Throwable {
        ZipOutputStream zipOutputStream = null;
        try {
            try {
                ZipOutputStream zipOutputStream2 = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(str)));
                try {
                    byte[] bArr = new byte[2048];
                    for (File file : list) {
                        if (file.isDirectory()) {
                            for (File file2 : file.listFiles()) {
                                zipOutputStream2.putNextEntry(new ZipEntry(file.getName() + "/" + file2.getName()));
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2), 2048);
                                while (true) {
                                    int i = bufferedInputStream.read(bArr, 0, 2048);
                                    if (i != -1) {
                                        zipOutputStream2.write(bArr, 0, i);
                                    }
                                }
                                bufferedInputStream.close();
                            }
                        } else {
                            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file), 2048);
                            zipOutputStream2.putNextEntry(new ZipEntry(file.getName()));
                            while (true) {
                                int i2 = bufferedInputStream2.read(bArr, 0, 2048);
                                if (i2 == -1) {
                                    break;
                                }
                                zipOutputStream2.write(bArr, 0, i2);
                            }
                            bufferedInputStream2.close();
                        }
                    }
                    zipOutputStream2.close();
                    closeQuietly(zipOutputStream2);
                    return true;
                } catch (Exception e) {
                    e = e;
                    zipOutputStream = zipOutputStream2;
                    e.printStackTrace();
                    closeQuietly(zipOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    zipOutputStream = zipOutputStream2;
                    closeQuietly(zipOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void closeQuietly(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeQuietly(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.flush();
            } catch (Exception unused) {
            }
            try {
                outputStream.close();
            } catch (Exception unused2) {
            }
        }
    }

    public static void closeQuietly(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }
}
