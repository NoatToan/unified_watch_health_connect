package com.huami.watch.util;

import androidx.annotation.Nullable;
import androidx.multidex.MultiDexExtractor;
import com.google.zxing.common.StringUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class ZipUtil {
    private static final String a = "Util-Zip";
    private static final int b = 8192;
    private static BufferedInputStream c;

    private static void a(File file, String str, ZipOutputStream zipOutputStream, byte[] bArr) throws IOException {
        Log.v(a, "DoZip : " + file + ", To : " + str, new Object[0]);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            c = bufferedInputStream;
            zipOutputStream.putNextEntry(new ZipEntry(str));
            while (true) {
                int i = bufferedInputStream.read(bArr, 0, 8192);
                if (i == -1) {
                    bufferedInputStream.close();
                    return;
                }
                zipOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.w(a, "Zip : doZip Fail", e, new Object[0]);
        }
    }

    private static void b(File file, ZipOutputStream zipOutputStream, byte[] bArr) throws IOException {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                Log.v(a, "Zip : " + file2, new Object[0]);
                b(file2, zipOutputStream, bArr);
            } else {
                a(file2, file2.getPath().substring(file.getParent().length()), zipOutputStream, bArr);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[SYNTHETIC] */
    @Nullable
    public static byte[] gZip(byte[] bArr) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] byteArray = null;
        byteArray = null;
        byteArray = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        try {
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.finish();
                            gZIPOutputStream.flush();
                            byteArray = byteArrayOutputStream.toByteArray();
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            gZIPOutputStream.close();
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.close();
                            }
                            return byteArray;
                        }
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (gZIPOutputStream == null) {
                            throw th;
                        }
                        try {
                            gZIPOutputStream.close();
                            throw th;
                        } catch (IOException e5) {
                            e5.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                    gZIPOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = null;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                    }
                    if (gZIPOutputStream == null) {
                        throw th;
                    }
                    gZIPOutputStream.close();
                    throw th;
                }
            } catch (IOException e7) {
                e7.printStackTrace();
            }
        } catch (Exception e8) {
            e = e8;
            byteArrayOutputStream = null;
            gZIPOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream = null;
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
            }
            if (gZIPOutputStream == null) {
                throw th;
            }
            gZIPOutputStream.close();
            throw th;
        }
        return byteArray;
    }

    /* JADX WARN: Code duplicated, block: B:109:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.zip.GZIPInputStream] */
    public static byte[] unGZip(byte[] bArr) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ?? gZIPInputStream;
        byte[] bArr2;
        Throwable th;
        ?? r9;
        ByteArrayInputStream byteArrayInputStream2 = null;
        byte[] byteArray = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    byte[] bArr3 = new byte[1024];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int i = gZIPInputStream.read(bArr3, 0, 1024);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr3, 0, i);
                        } catch (Exception e) {
                            e = e;
                            bArr2 = byteArray;
                            byteArrayInputStream2 = byteArrayInputStream;
                            gZIPInputStream = gZIPInputStream;
                            try {
                                e.printStackTrace();
                                if (byteArrayInputStream2 != null) {
                                    try {
                                        byteArrayInputStream2.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                if (gZIPInputStream != 0) {
                                    try {
                                        gZIPInputStream.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                if (byteArrayOutputStream != null) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                return bArr2;
                            } catch (Throwable th2) {
                                byteArrayInputStream = byteArrayInputStream2;
                                th = th2;
                                if (byteArrayInputStream != null) {
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (IOException e5) {
                                        e5.printStackTrace();
                                    }
                                }
                                if (gZIPInputStream != 0) {
                                    try {
                                        gZIPInputStream.close();
                                    } catch (IOException e6) {
                                        e6.printStackTrace();
                                    }
                                }
                                if (byteArrayOutputStream == null) {
                                    throw th;
                                }
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (IOException e7) {
                                    e7.printStackTrace();
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (byteArrayInputStream != null) {
                                byteArrayInputStream.close();
                            }
                            if (gZIPInputStream != 0) {
                                gZIPInputStream.close();
                            }
                            if (byteArrayOutputStream == null) {
                                throw th;
                            }
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    }
                    byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    try {
                        gZIPInputStream.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                    try {
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        return byteArray;
                    }
                } catch (Exception e11) {
                    e = e11;
                    byteArrayOutputStream = null;
                    r9 = gZIPInputStream;
                    byteArrayInputStream2 = byteArrayInputStream;
                    bArr2 = byteArrayOutputStream;
                    gZIPInputStream = r9;
                    e.printStackTrace();
                    if (byteArrayInputStream2 != null) {
                        byteArrayInputStream2.close();
                    }
                    if (gZIPInputStream != 0) {
                        gZIPInputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    return bArr2;
                } catch (Throwable th4) {
                    byteArrayOutputStream = null;
                    th = th4;
                }
            } catch (Exception e12) {
                e = e12;
                r9 = 0;
                byteArrayOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream = null;
                th = th;
                gZIPInputStream = byteArrayOutputStream;
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
                if (gZIPInputStream != 0) {
                    gZIPInputStream.close();
                }
                if (byteArrayOutputStream == null) {
                    throw th;
                }
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (Exception e13) {
            e = e13;
            gZIPInputStream = 0;
            bArr2 = null;
            byteArrayOutputStream = null;
        } catch (Throwable th6) {
            th = th6;
            byteArrayInputStream = null;
            byteArrayOutputStream = null;
        }
    }

    public static List<File> unzip(File file, File file2) {
        Log.d(a, "Unzip [" + file + "] => [" + file2 + "]", new Object[0]);
        if (file == null) {
            Log.w(a, "Zip File is Null, Abort!!", new Object[0]);
            return null;
        }
        if (file2 == null) {
            Log.w(a, "Unzip target dir is Null, Abort!!", new Object[0]);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (!file2.exists() || !file2.isDirectory()) {
                file2.mkdirs();
            }
            byte[] bArr = new byte[1024];
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                StringBuilder sb = new StringBuilder();
                sb.append(file2.getAbsolutePath());
                String str = File.separator;
                sb.append(str);
                sb.append(zipEntryNextElement.getName());
                String string = sb.toString();
                int iLastIndexOf = string.lastIndexOf(str);
                File file3 = new File(iLastIndexOf != -1 ? string.substring(0, iLastIndexOf) : "");
                if (!file3.exists() || !file3.isDirectory()) {
                    file3.mkdirs();
                }
                File file4 = new File(string);
                if (file4.exists()) {
                    new SecurityManager().checkDelete(string);
                    file4.delete();
                }
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file4));
                BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntryNextElement));
                while (true) {
                    int i = bufferedInputStream.read(bArr, 0, 1024);
                    if (i != -1) {
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                arrayList.add(file4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(a, "Unzip Files: " + ArraysUtil.toString(arrayList), new Object[0]);
        return arrayList;
    }

    public static List<File> upZipFile(File file, String str) throws IOException {
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        ZipFile zipFile = new ZipFile(file);
        ArrayList arrayList = new ArrayList();
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
            File file3 = new File(new String((str + File.separator + zipEntryNextElement.getName()).getBytes("8859_1"), StringUtils.GB2312));
            if (!file3.exists()) {
                File parentFile = file3.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file3.createNewFile();
            }
            arrayList.add(file3);
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStream.read(bArr);
                if (i > 0) {
                    fileOutputStream.write(bArr, 0, i);
                }
            }
            inputStream.close();
            fileOutputStream.close();
        }
        return arrayList;
    }

    public static ArrayList<File> upZipSelectedFile(File file, String str, String str2) throws IOException {
        ArrayList<File> arrayList = new ArrayList<>();
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            if (zipEntryNextElement.getName().contains(str2)) {
                InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                File file3 = new File(new String((str + File.separator + zipEntryNextElement.getName()).getBytes("8859_1"), StringUtils.GB2312));
                if (!file3.exists()) {
                    File parentFile = file3.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file3.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
                inputStream.close();
                fileOutputStream.close();
                arrayList.add(file3);
            }
        }
        return arrayList;
    }

    public static File zip(File file) {
        if (file != null) {
            return zip(new File[]{file});
        }
        Log.w(a, "No File to Zip!!", new Object[0]);
        return null;
    }

    public static File zip(File[] fileArr) {
        Log.d(a, "Zip Files : " + fileArr, new Object[0]);
        File file = null;
        if (fileArr != null && fileArr.length != 0) {
            if (fileArr[0] != null) {
                file = new File(fileArr[0].getParent(), fileArr[0].getName().replaceFirst("[.][^.]+$", "") + MultiDexExtractor.EXTRACTED_SUFFIX);
            }
            return zip(fileArr, file);
        }
        Log.w(a, "No Files to Zip!!", new Object[0]);
        return null;
    }

    public static File zip(File[] fileArr, File file) throws Throwable {
        ZipOutputStream zipOutputStream;
        StringBuilder sb = new StringBuilder();
        sb.append("Zip Files : ");
        sb.append(Arrays.toString(fileArr));
        sb.append(", ");
        boolean z = false;
        sb.append(fileArr != null ? fileArr.length : 0);
        sb.append(", To : ");
        sb.append(file);
        Log.d(a, sb.toString(), new Object[0]);
        ZipOutputStream zipOutputStream2 = null;
        if (fileArr == null || fileArr.length == 0) {
            Log.w(a, "No Files to Zip!!", new Object[0]);
            return null;
        }
        try {
            if (file == null) {
                Log.w(a, "No Target ZipFile!!", new Object[0]);
                return null;
            }
            try {
                zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                try {
                    byte[] bArr = new byte[8192];
                    for (File file2 : fileArr) {
                        Log.v(a, "Zip : " + file2, new Object[0]);
                        if (file2 == null || !file2.exists()) {
                            Log.w(a, "File : " + file2 + " is Null or not Exists!!", new Object[0]);
                        } else if (file2.isDirectory()) {
                            b(file2, zipOutputStream, bArr);
                        } else {
                            a(file2, file2.getName(), zipOutputStream, bArr);
                        }
                    }
                    zipOutputStream.close();
                    BufferedInputStream bufferedInputStream = c;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        c = null;
                    }
                    try {
                        zipOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    z = true;
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    Log.w(a, "Zip Fail", e, new Object[0]);
                    BufferedInputStream bufferedInputStream2 = c;
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        c = null;
                    }
                    if (zipOutputStream != null) {
                        try {
                            zipOutputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            } catch (Exception e6) {
                e = e6;
                zipOutputStream = null;
            } catch (Throwable th) {
                th = th;
                BufferedInputStream bufferedInputStream3 = c;
                if (bufferedInputStream3 != null) {
                    try {
                        bufferedInputStream3.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    c = null;
                }
                if (0 != 0) {
                    try {
                        zipOutputStream2.close();
                        throw th;
                    } catch (IOException e8) {
                        e8.printStackTrace();
                        throw th;
                    }
                }
                throw th;
            }
            if (z) {
                return file;
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
