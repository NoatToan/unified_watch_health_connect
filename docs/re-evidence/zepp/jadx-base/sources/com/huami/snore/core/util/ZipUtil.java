package com.huami.snore.core.util;

import android.util.Log;
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

/* JADX INFO: loaded from: classes13.dex */
public class ZipUtil {
    private static final String a = "Util-Zip";
    private static final int b = 8192;
    private static BufferedInputStream c;

    private static void a(File file, String zipEntryName, ZipOutputStream zipOut, byte[] buffer) throws IOException {
        Log.v(a, "DoZip : " + file + ", To : " + zipEntryName);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            c = bufferedInputStream;
            zipOut.putNextEntry(new ZipEntry(zipEntryName));
            while (true) {
                int i = bufferedInputStream.read(buffer, 0, 8192);
                if (i == -1) {
                    bufferedInputStream.close();
                    return;
                }
                zipOut.write(buffer, 0, i);
            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.w(a, "Zip : doZip Fail", e);
        }
    }

    private static void b(File folder, ZipOutputStream out, byte[] buffer) throws IOException {
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) {
                Log.v(a, "Zip : " + file);
                b(file, out, buffer);
            } else {
                a(file, file.getPath().substring(folder.getParent().length()), out, buffer);
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

    public static List<File> unzip(File zipFile, File unzipFileDir) {
        Log.d(a, "Unzip [" + zipFile + "] => [" + unzipFileDir + "]");
        if (zipFile == null) {
            Log.w(a, "Zip File is Null, Abort!!");
            return null;
        }
        if (unzipFileDir == null) {
            Log.w(a, "Unzip target dir is Null, Abort!!");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (!unzipFileDir.exists() || !unzipFileDir.isDirectory()) {
                unzipFileDir.mkdirs();
            }
            byte[] bArr = new byte[1024];
            ZipFile zipFile2 = new ZipFile(zipFile);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                StringBuilder sb = new StringBuilder();
                sb.append(unzipFileDir.getAbsolutePath());
                String str = File.separator;
                sb.append(str);
                sb.append(zipEntryNextElement.getName());
                String string = sb.toString();
                int iLastIndexOf = string.lastIndexOf(str);
                File file = new File(iLastIndexOf != -1 ? string.substring(0, iLastIndexOf) : "");
                if (!file.exists() || !file.isDirectory()) {
                    file.mkdirs();
                }
                File file2 = new File(string);
                if (file2.exists()) {
                    new SecurityManager().checkDelete(string);
                    file2.delete();
                }
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile2.getInputStream(zipEntryNextElement));
                while (true) {
                    int i = bufferedInputStream.read(bArr, 0, 1024);
                    if (i != -1) {
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                arrayList.add(file2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(a, "Unzip Files: " + arrayList.toString());
        return arrayList;
    }

    public static List<File> upZipFile(File zipFile, String folderPath) throws IOException {
        File file = new File(folderPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        ZipFile zipFile2 = new ZipFile(zipFile);
        ArrayList arrayList = new ArrayList();
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            InputStream inputStream = zipFile2.getInputStream(zipEntryNextElement);
            File file2 = new File(new String((folderPath + File.separator + zipEntryNextElement.getName()).getBytes("8859_1"), StringUtils.GB2312));
            if (!file2.exists()) {
                File parentFile = file2.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file2.createNewFile();
            }
            arrayList.add(file2);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
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

    public static ArrayList<File> upZipSelectedFile(File zipFile, String folderPath, String nameContains) throws IOException {
        ArrayList<File> arrayList = new ArrayList<>();
        File file = new File(folderPath);
        if (!file.exists()) {
            file.mkdir();
        }
        ZipFile zipFile2 = new ZipFile(zipFile);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            if (zipEntryNextElement.getName().contains(nameContains)) {
                InputStream inputStream = zipFile2.getInputStream(zipEntryNextElement);
                File file2 = new File(new String((folderPath + File.separator + zipEntryNextElement.getName()).getBytes("8859_1"), StringUtils.GB2312));
                if (!file2.exists()) {
                    File parentFile = file2.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file2.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
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
                arrayList.add(file2);
            }
        }
        return arrayList;
    }

    public static File zip(File file) {
        if (file != null) {
            return zip(new File[]{file});
        }
        Log.w(a, "No File to Zip!!");
        return null;
    }

    public static File zip(File[] files) {
        Log.d(a, "Zip Files : " + files);
        File file = null;
        if (files == null || files.length == 0) {
            return null;
        }
        if (files[0] != null) {
            file = new File(files[0].getParent(), files[0].getName().replaceFirst("[.][^.]+$", "") + MultiDexExtractor.EXTRACTED_SUFFIX);
        }
        return zip(files, file);
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static File zip(File[] files, File targetZipFile) throws Throwable {
        ZipOutputStream zipOutputStream;
        BufferedInputStream bufferedInputStream;
        StringBuilder sb = new StringBuilder();
        sb.append("Zip Files : ");
        sb.append(Arrays.toString(files));
        sb.append(", ");
        boolean z = false;
        sb.append(files != null ? files.length : 0);
        sb.append(", To : ");
        sb.append(targetZipFile);
        Log.d(a, sb.toString());
        if (files == null || files.length == 0) {
            Log.w(a, "No Files to Zip!!");
            return null;
        }
        if (targetZipFile == null) {
            Log.w(a, "No Target ZipFile!!");
            return null;
        }
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(targetZipFile)));
            try {
                try {
                    byte[] bArr = new byte[8192];
                    for (File file : files) {
                        Log.v(a, "Zip : " + file);
                        if (file == null || !file.exists()) {
                            Log.w(a, "File : " + file + " is Null or not Exists!!");
                        } else if (file.isDirectory()) {
                            b(file, zipOutputStream, bArr);
                        } else {
                            a(file, file.getName(), zipOutputStream, bArr);
                        }
                    }
                    zipOutputStream.close();
                    BufferedInputStream bufferedInputStream2 = c;
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
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
                    Log.w(a, "Zip Fail", e);
                    BufferedInputStream bufferedInputStream3 = c;
                    if (bufferedInputStream3 != null) {
                        try {
                            bufferedInputStream3.close();
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
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = c;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    c = null;
                }
                if (zipOutputStream != null) {
                    try {
                        zipOutputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        e7.printStackTrace();
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            zipOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream = null;
            bufferedInputStream = c;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
                c = null;
            }
            if (zipOutputStream != null) {
                zipOutputStream.close();
                throw th;
            }
            throw th;
        }
        if (z) {
            return targetZipFile;
        }
        return null;
    }
}
