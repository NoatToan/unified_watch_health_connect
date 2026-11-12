package com.xmlywind.sdk.common.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.xmlywind.logger.SigmobLog;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes22.dex */
public final class d {
    public static String a = "SigHtmlResource";
    public static String b = "SigHtmlPrivacy";
    private static String c;
    private static String d;

    public static File a(Context context) {
        return new File(d, "SigDownload");
    }

    public static File a(String str, String str2) {
        try {
            File file = new File(d, a);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str2);
            SigmobLog.d("SigHtmlResource: " + file2.getAbsolutePath());
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            FileWriter fileWriter = new FileWriter(file2, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
            return file2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String a() {
        return c;
    }

    public static String a(Context context, Uri uri) {
        Cursor cursorQuery;
        int columnIndex;
        String string = null;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme == null || "file".equals(scheme)) {
            return uri.getPath();
        }
        if (!"content".equals(scheme) || (cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null)) == null) {
            return null;
        }
        if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_data")) > -1) {
            string = cursorQuery.getString(columnIndex);
        }
        cursorQuery.close();
        return string;
    }

    public static void a(Context context, String str) {
        File cacheDir = context.getCacheDir();
        File externalCacheDir = context.getExternalCacheDir();
        if (str != null) {
            File file = new File(cacheDir, str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(externalCacheDir, str);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            externalCacheDir = file2;
            cacheDir = file;
        }
        c = cacheDir.getAbsolutePath();
        d = externalCacheDir.getAbsolutePath();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[Catch: all -> 0x006e, TRY_LEAVE, TryCatch #5 {all -> 0x006e, blocks: (B:29:0x006a, B:33:0x0072), top: B:45:0x006a }] */
    public static void a(Object obj, String str) {
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                File file = new File(str);
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream);
                    try {
                        objectOutputStream2.writeObject(obj);
                        SigmobLog.d("writeCache :" + file.getName());
                        fileOutputStream.close();
                        objectOutputStream2.close();
                    } catch (Throwable th) {
                        th = th;
                        objectOutputStream = objectOutputStream2;
                        try {
                            SigmobLog.e(th.getMessage());
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                        } catch (Throwable th2) {
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                    if (objectOutputStream != null) {
                                        objectOutputStream.close();
                                    }
                                } catch (Throwable th3) {
                                    SigmobLog.e(th3.getMessage());
                                    throw th2;
                                }
                            } else if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                SigmobLog.e(th5.getMessage());
            }
        } catch (Throwable th6) {
            th = th6;
            fileOutputStream = null;
        }
    }

    public static boolean a(String str) {
        try {
            String str2 = File.separator;
            if (!str.endsWith(str2)) {
                str = str + str2;
            }
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                boolean zA = true;
                for (File file2 : file.listFiles()) {
                    if (!file2.isFile()) {
                        if (file2.isDirectory() && !(zA = a(file2.getAbsolutePath()))) {
                            break;
                        }
                    } else {
                        zA = b(file2.getAbsolutePath());
                        if (!zA) {
                            break;
                        }
                    }
                }
                if (zA && file.delete()) {
                    SigmobLog.d("删除目录" + str + "成功！");
                    return true;
                }
            } else {
                SigmobLog.d("删除目录失败：" + str + "不存在！");
            }
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
        return false;
    }

    public static File[] a(File[] fileArr, int i) {
        if (fileArr == null || fileArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(fileArr));
        for (int i2 = 0; i2 < fileArr.length && arrayList.size() > i; i2++) {
            File file = fileArr[i2];
            if (file.exists()) {
                file.delete();
                arrayList.remove(file);
                SigmobLog.d("file delete " + file.getName());
            }
        }
        return (File[]) arrayList.toArray(new File[0]);
    }

    public static String b() {
        String str = c + File.separator + "splashAd";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static boolean b(String str) {
        String str2;
        try {
            new SecurityManager().checkDelete(str);
            File file = new File(str);
            if (!file.exists() || !file.isFile()) {
                str2 = "删除单个文件失败：" + str + "不存在！";
            } else {
                if (file.delete()) {
                    SigmobLog.d("删除单个文件" + str + "成功！");
                    return true;
                }
                str2 = "删除单个文件" + str + "失败！";
            }
            SigmobLog.d(str2);
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
        return false;
    }

    public static String c() {
        String str = c + File.separator + "nativeAd";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static String c(String str) {
        int iLastIndexOf;
        return (str == null || str.length() <= 0 || (iLastIndexOf = str.lastIndexOf(46)) <= -1 || iLastIndexOf >= str.length() + (-1)) ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0052 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #5 {all -> 0x004e, blocks: (B:27:0x004a, B:31:0x0052), top: B:44:0x004a }] */
    public static Object d(String str) {
        Throwable th;
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        Object object = null;
        try {
            try {
                File file = new File(str);
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        objectInputStream = new ObjectInputStream(fileInputStream);
                        try {
                            object = objectInputStream.readObject();
                            fileInputStream.close();
                            objectInputStream.close();
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                SigmobLog.e(th.getMessage());
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (objectInputStream != null) {
                                    objectInputStream.close();
                                }
                            } catch (Throwable th3) {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                        if (objectInputStream != null) {
                                            objectInputStream.close();
                                        }
                                    } catch (Throwable th4) {
                                        SigmobLog.e(th4.getMessage());
                                        throw th3;
                                    }
                                } else if (objectInputStream != null) {
                                    objectInputStream.close();
                                }
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        objectInputStream = null;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                fileInputStream = null;
                objectInputStream = null;
            }
        } catch (Throwable th7) {
            SigmobLog.e(th7.getMessage());
        }
        return object;
    }

    public static String d() {
        String str = c + File.separator + "downloadAPKLog";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static String e() {
        String str;
        synchronized (d.class) {
            str = c + File.separator + "splashAdUnit";
        }
        return str;
    }

    public static byte[] e(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    fileInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
            return null;
        }
    }

    public static void f() {
        if (c != null) {
            File file = new File(c);
            if (file.exists()) {
                a(c);
            }
            if (!file.exists() || file.isFile()) {
                file.mkdirs();
            }
        }
    }

    public static File[] f(String str) {
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles != null) {
            Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.xmlywind.sdk.common.utils.d.1
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(File file, File file2) {
                    long jLastModified = file.lastModified() - file2.lastModified();
                    if (jLastModified > 0) {
                        return 1;
                    }
                    return jLastModified == 0 ? 0 : -1;
                }

                @Override // java.util.Comparator
                public boolean equals(Object obj) {
                    return true;
                }
            });
        }
        return fileArrListFiles;
    }

    public static File g(String str) {
        File file = new File(d, str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
