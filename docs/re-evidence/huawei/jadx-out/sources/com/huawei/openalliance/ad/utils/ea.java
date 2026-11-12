package com.huawei.openalliance.ad.utils;

import android.text.TextUtils;
import com.huawei.openalliance.ad.hw;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes12.dex */
public class ea {
    private static void c(File file) {
        if (file == null || file.exists() || file.mkdirs()) {
            return;
        }
        hw.d("ZipUtil", "mkdirs error , files exists or IOException.");
    }

    private static boolean b(String str) {
        return str.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE) || str.contains("..\\") || str.contains("..") || str.contains("./") || str.contains(".\\.\\") || str.contains("%00");
    }

    private static void b(File file) {
        if (file == null || file.delete()) {
            return;
        }
        hw.d("ZipUtil", "delete file error");
    }

    private static boolean a(List<File> list) {
        try {
            Iterator<File> it = list.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return true;
        } catch (Exception e) {
            hw.d("ZipUtil", "unzip fail delete file failed" + e.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean a(String str, String str2, boolean z, int i) {
        if (i <= 0) {
            i = 100;
        }
        return a(str, str2, 524288000, i, z);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0130  */
    public static boolean a(String str, String str2, int i, int i2, boolean z) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        ZipInputStream zipInputStream;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        ZipInputStream zipInputStream2;
        BufferedOutputStream bufferedOutputStream2;
        boolean z2;
        String strSubstring = str2;
        boolean z3 = false;
        if (!a(str, str2, i, i2)) {
            return false;
        }
        if (strSubstring.endsWith(File.separator) && str2.length() > File.separator.length()) {
            strSubstring = strSubstring.substring(0, str2.length() - File.separator.length());
        }
        byte[] bArr = new byte[4096];
        ArrayList arrayList = new ArrayList();
        FileInputStream fileInputStream2 = null;
        bufferedOutputStream = null;
        ZipInputStream zipInputStream3 = null;
        BufferedOutputStream bufferedOutputStream3 = null;
        BufferedOutputStream bufferedOutputStream4 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                zipInputStream2 = new ZipInputStream(new BufferedInputStream(fileInputStream), Charset.forName(a(str)));
                FileOutputStream fileOutputStream2 = null;
                while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream2.getNextEntry();
                        if (nextEntry == null) {
                            z2 = true;
                            break;
                        }
                        String name = nextEntry.getName();
                        if (b(name)) {
                            hw.c("ZipUtil", "File name is invalid");
                            z2 = false;
                            break;
                        }
                        File file = new File(strSubstring + File.separator + name);
                        if (z && file.exists()) {
                            a(file);
                        }
                        if (nextEntry.isDirectory()) {
                            c(file);
                            arrayList.add(file);
                        } else {
                            File parentFile = file.getParentFile();
                            if (parentFile != null && !parentFile.exists()) {
                                c(parentFile);
                            }
                            fileOutputStream = new FileOutputStream(file);
                            try {
                                bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                                int i3 = 0;
                                while (i3 + 4096 <= i) {
                                    try {
                                        int i4 = zipInputStream2.read(bArr, 0, 4096);
                                        if (i4 == -1) {
                                            break;
                                        }
                                        bufferedOutputStream2.write(bArr, 0, i4);
                                        i3 += i4;
                                    } catch (IOException e) {
                                        e = e;
                                        zipInputStream3 = zipInputStream2;
                                        zipInputStream = zipInputStream3;
                                        bufferedOutputStream4 = bufferedOutputStream2;
                                        try {
                                            hw.d("ZipUtil", "Unzip IOException : " + e.getClass().getSimpleName());
                                            a(fileInputStream, bufferedOutputStream4, zipInputStream, fileOutputStream);
                                            if (!z3) {
                                                a(arrayList);
                                            }
                                            return z3;
                                        } catch (Throwable th) {
                                            th = th;
                                            bufferedOutputStream = bufferedOutputStream4;
                                            fileInputStream2 = fileInputStream;
                                            a(fileInputStream2, bufferedOutputStream, zipInputStream, fileOutputStream);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bufferedOutputStream3 = bufferedOutputStream2;
                                        bufferedOutputStream = bufferedOutputStream3;
                                        fileInputStream2 = fileInputStream;
                                        zipInputStream = zipInputStream2;
                                        a(fileInputStream2, bufferedOutputStream, zipInputStream, fileOutputStream);
                                        throw th;
                                    }
                                }
                                arrayList.add(file);
                                bufferedOutputStream2.flush();
                                df.a(bufferedOutputStream2);
                                df.a(fileOutputStream);
                                bufferedOutputStream3 = bufferedOutputStream2;
                                fileOutputStream2 = fileOutputStream;
                            } catch (IOException e2) {
                                e = e2;
                                bufferedOutputStream2 = bufferedOutputStream3;
                                zipInputStream3 = zipInputStream2;
                                zipInputStream = zipInputStream3;
                                bufferedOutputStream4 = bufferedOutputStream2;
                                hw.d("ZipUtil", "Unzip IOException : " + e.getClass().getSimpleName());
                                a(fileInputStream, bufferedOutputStream4, zipInputStream, fileOutputStream);
                                if (!z3) {
                                    a(arrayList);
                                }
                                return z3;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        zipInputStream2.closeEntry();
                    } catch (IOException e3) {
                        e = e3;
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = fileOutputStream2;
                    }
                }
                df.a((Closeable) zipInputStream2);
                df.a((Closeable) fileInputStream);
                a(fileInputStream, bufferedOutputStream3, zipInputStream2, fileOutputStream2);
                z3 = z2;
            } catch (IOException e4) {
                e = e4;
                bufferedOutputStream2 = null;
                fileOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                zipInputStream2 = null;
                fileOutputStream = null;
            }
        } catch (IOException e5) {
            e = e5;
            zipInputStream = null;
            fileInputStream = null;
            fileOutputStream = null;
        } catch (Throwable th6) {
            th = th6;
            bufferedOutputStream = null;
            zipInputStream = null;
            fileOutputStream = null;
        }
        if (!z3) {
            a(arrayList);
        }
        return z3;
    }

    private static boolean a(String str, String str2, int i, int i2) throws com.huawei.openalliance.ad.exception.a {
        String str3;
        if (TextUtils.isEmpty(str) || b(str)) {
            str3 = "zip file is not valid";
        } else {
            if (!TextUtils.isEmpty(str2) && !b(str2)) {
                if (a(str, i, i2)) {
                    return true;
                }
                hw.d("ZipUtil", "zip file contains valid chars or too many files");
                throw new com.huawei.openalliance.ad.exception.a("unsecure zipfile!");
            }
            str3 = "target directory is not valid";
        }
        hw.d("ZipUtil", str3);
        return false;
    }

    private static boolean a(String str, int i, int i2) throws Throwable {
        ZipFile zipFile;
        ZipFile zipFile2 = null;
        boolean z = false;
        try {
            try {
                try {
                    zipFile = new ZipFile(str, Charset.forName(a(str)));
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        long size = 0;
                        int i3 = 0;
                        while (true) {
                            if (!enumerationEntries.hasMoreElements()) {
                                z = true;
                                break;
                            }
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            size += zipEntryNextElement.getSize();
                            i3++;
                            if (b(zipEntryNextElement.getName()) || i3 >= i2 || size > i || zipEntryNextElement.getSize() == -1) {
                                hw.d("ZipUtil", "File name is invalid or too many files or too big");
                                break;
                            }
                        }
                        zipFile.close();
                    } catch (Exception e) {
                        e = e;
                        zipFile2 = zipFile;
                        hw.d("ZipUtil", "not a valid zip file, IOException : " + e.getClass().getSimpleName());
                        if (zipFile2 != null) {
                            zipFile2.close();
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused) {
                                hw.d("ZipUtil", "close zipFile IOException ");
                            }
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                zipFile = zipFile2;
            }
        } catch (IOException unused2) {
            hw.d("ZipUtil", "close zipFile IOException ");
        }
        return z;
    }

    private static void a(FileInputStream fileInputStream, BufferedOutputStream bufferedOutputStream, ZipInputStream zipInputStream, FileOutputStream fileOutputStream) {
        df.a((Closeable) fileInputStream);
        df.a(bufferedOutputStream);
        df.a((Closeable) zipInputStream);
        df.a(fileOutputStream);
    }

    private static void a(File file) {
        if (file == null) {
            return;
        }
        if (file.isFile()) {
            b(file);
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                b(file);
                return;
            }
            for (File file2 : fileArrListFiles) {
                a(file2);
            }
            b(file);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.zip.ZipFile] */
    private static String a(String str) throws Throwable {
        ?? zipFile;
        boolean zHasMoreElements;
        String str2 = "UTF-8";
        ?? r3 = 0;
        r3 = 0;
        r3 = 0;
        try {
            try {
                try {
                    zipFile = new ZipFile(str);
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        while (true) {
                            zHasMoreElements = enumerationEntries.hasMoreElements();
                            if (!zHasMoreElements) {
                                break;
                            }
                            try {
                                enumerationEntries.nextElement();
                            } catch (Exception unused) {
                                hw.c("ZipUtil", "zipFile format exception");
                                str2 = "GBK";
                            }
                        }
                        zipFile.close();
                        r3 = zHasMoreElements;
                    } catch (IOException unused2) {
                        r3 = zipFile;
                        hw.c("ZipUtil", "zipFile create exception");
                        if (r3 != 0) {
                            r3.close();
                            r3 = r3;
                        }
                        return str2;
                    } catch (Throwable th) {
                        th = th;
                        if (zipFile != 0) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                                hw.d("ZipUtil", "close zipFile IOException ");
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused4) {
                    hw.d("ZipUtil", "close zipFile IOException ");
                }
            } catch (IOException unused5) {
            }
            return str2;
        } catch (Throwable th2) {
            th = th2;
            zipFile = r3;
        }
    }
}
