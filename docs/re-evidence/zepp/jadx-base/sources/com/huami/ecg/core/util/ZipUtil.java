package com.huami.ecg.core.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.multidex.MultiDexExtractor;
import com.google.zxing.common.StringUtils;
import com.huami.ecg.core.util.ZipUtil;
import com.huami.tools.log.HMLog;
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
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class ZipUtil {
    private static final String a = "Util-Zip";
    private static final int b = 8192;
    private static BufferedInputStream c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String A(File[] fileArr, File file) {
        StringBuilder sb = new StringBuilder();
        sb.append("Zip Files : ");
        sb.append(Arrays.toString(fileArr));
        sb.append(", ");
        sb.append(fileArr != null ? fileArr.length : 0);
        sb.append(", To : ");
        sb.append(file);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String B() {
        return "No Files to Zip!!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String C() {
        return "No Target ZipFile!!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D(File file) {
        return "Zip : " + file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String E(File file) {
        return "File : " + file + " is Null or not Exists!!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String F() {
        return "Zip Fail";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String G(File file) {
        return "Zip : " + file;
    }

    private static void H(File file, ZipOutputStream zipOutputStream, byte[] bArr) throws IOException {
        for (final File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                HMLog.info(a, new Function0() { // from class: n19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ZipUtil.G(file2);
                    }
                });
                H(file2, zipOutputStream, bArr);
            } else {
                q(file2, file2.getPath().substring(file.getParent().length()), zipOutputStream, bArr);
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

    private static void q(final File file, final String str, ZipOutputStream zipOutputStream, byte[] bArr) throws IOException {
        HMLog.info(a, new Function0() { // from class: p19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ZipUtil.r(file, str);
            }
        });
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
            HMLog.warn(a, e, new Function0() { // from class: t19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZipUtil.s();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r(File file, String str) {
        return "DoZip : " + file + ", To : " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s() {
        return "Zip : doZip Fail";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t(File file, File file2) {
        return "Unzip [" + file + "] => [" + file2 + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String u() {
        return "Zip File is Null, Abort!!";
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

    public static List<File> unzip(final File file, final File file2) {
        HMLog.info(a, new Function0() { // from class: o19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ZipUtil.t(file, file2);
            }
        });
        if (file == null) {
            HMLog.warn(a, new Function0() { // from class: k19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZipUtil.u();
                }
            });
            return null;
        }
        if (file2 == null) {
            HMLog.warn(a, new Function0() { // from class: h19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZipUtil.v();
                }
            });
            return null;
        }
        final ArrayList arrayList = new ArrayList();
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
        HMLog.info(a, new Function0() { // from class: q19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ZipUtil.w(arrayList);
            }
        });
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String v() {
        return "Unzip target dir is Null, Abort!!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String w(List list) {
        return "Unzip Files: " + TextUtils.join(",", list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String x() {
        return "No File to Zip!!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String y(File[] fileArr) {
        return "Zip Files : " + fileArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z() {
        return "No Files to Zip!!";
    }

    public static File zip(File file) {
        if (file != null) {
            return zip(new File[]{file});
        }
        HMLog.info(a, new Function0() { // from class: g19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ZipUtil.x();
            }
        });
        return null;
    }

    public static File zip(final File[] fileArr) {
        HMLog.info(a, new Function0() { // from class: r19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ZipUtil.y(fileArr);
            }
        });
        File file = null;
        if (fileArr != null && fileArr.length != 0) {
            if (fileArr[0] != null) {
                file = new File(fileArr[0].getParent(), fileArr[0].getName().replaceFirst("[.][^.]+$", "") + MultiDexExtractor.EXTRACTED_SUFFIX);
            }
            return zip(fileArr, file);
        }
        HMLog.warn(a, new Function0() { // from class: i19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ZipUtil.z();
            }
        });
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static File zip(final File[] fileArr, final File file) throws Throwable {
        ZipOutputStream zipOutputStream;
        BufferedInputStream bufferedInputStream;
        HMLog.info(a, new Function0() { // from class: s19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ZipUtil.A(fileArr, file);
            }
        });
        if (fileArr == null || fileArr.length == 0) {
            HMLog.warn(a, new Function0() { // from class: u19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZipUtil.B();
                }
            });
            return null;
        }
        if (file == null) {
            HMLog.warn(a, new Function0() { // from class: l19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZipUtil.C();
                }
            });
            return null;
        }
        boolean z = false;
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            try {
                try {
                    byte[] bArr = new byte[8192];
                    for (final File file2 : fileArr) {
                        HMLog.info(a, new Function0() { // from class: m19
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ZipUtil.D(file2);
                            }
                        });
                        if (file2 != null && file2.exists()) {
                            if (file2.isDirectory()) {
                                H(file2, zipOutputStream, bArr);
                            } else {
                                q(file2, file2.getName(), zipOutputStream, bArr);
                            }
                        } else {
                            HMLog.warn(a, new Function0() { // from class: f19
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ZipUtil.E(file2);
                                }
                            });
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
                    HMLog.warn(a, e, new Function0() { // from class: j19
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ZipUtil.F();
                        }
                    });
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
            return file;
        }
        return null;
    }
}
