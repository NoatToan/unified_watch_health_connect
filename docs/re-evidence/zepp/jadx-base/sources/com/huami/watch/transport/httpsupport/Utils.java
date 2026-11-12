package com.huami.watch.transport.httpsupport;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class Utils {
    private static final String a = "http_service_pref";
    private static final String b = "CloudServiceTag";

    public static class BytesZipUtil {
        public static byte[] gZip(byte[] bArr) {
            byte[] bArr2;
            GZIPOutputStream gZIPOutputStream;
            ByteArrayOutputStream byteArrayOutputStream = null;
            byte[] byteArray = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                    try {
                        gZIPOutputStream.write(bArr);
                        gZIPOutputStream.finish();
                        gZIPOutputStream.close();
                        byteArray = byteArrayOutputStream2.toByteArray();
                        byteArrayOutputStream2.close();
                        try {
                            byteArrayOutputStream2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            gZIPOutputStream.close();
                            return byteArray;
                        } catch (IOException e2) {
                            e = e2;
                            e.printStackTrace();
                            return byteArray;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bArr2 = byteArray;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        try {
                            th.printStackTrace();
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e4) {
                                    e = e4;
                                    byteArray = bArr2;
                                    e.printStackTrace();
                                    return byteArray;
                                }
                            }
                            return bArr2;
                        } catch (Throwable th2) {
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            if (gZIPOutputStream == null) {
                                throw th2;
                            }
                            try {
                                gZIPOutputStream.close();
                                throw th2;
                            } catch (IOException e6) {
                                e6.printStackTrace();
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream = null;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    bArr2 = null;
                }
            } catch (Throwable th4) {
                th = th4;
                bArr2 = null;
                gZIPOutputStream = null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:110:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v13 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15, types: [java.util.zip.GZIPInputStream] */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v20 */
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
                                            e = e4;
                                            byteArray = bArr2;
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
                            e.printStackTrace();
                            return byteArray;
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
                            e = e10;
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
    }

    private Utils() {
    }

    public static void closeQuietly(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[SYNTHETIC] */
    public static void copyFile(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            if (new File(str).exists()) {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    fileOutputStream = new FileOutputStream(str2);
                    try {
                        byte[] bArr = new byte[1444];
                        int i = 0;
                        while (true) {
                            int i2 = fileInputStream2.read(bArr);
                            if (i2 == -1) {
                                break;
                            }
                            i += i2;
                            System.out.println(i);
                            fileOutputStream.write(bArr, 0, i2);
                        }
                        fileInputStream2.close();
                        fileInputStream = fileInputStream2;
                    } catch (Exception e) {
                        e = e;
                        fileInputStream = fileInputStream2;
                        try {
                            System.out.println("复制单个文件操作出错");
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            if (fileOutputStream == null) {
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            if (fileOutputStream != null) {
                                throw th;
                            }
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (IOException e4) {
                                e4.printStackTrace();
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream != null) {
                            throw th;
                        }
                        fileOutputStream.close();
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } else {
                fileOutputStream = null;
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            if (fileOutputStream == null) {
                return;
            }
        } catch (Exception e7) {
            e = e7;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.close();
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    public static void delete(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = a;
        }
        context.getSharedPreferences(str, 0).edit().remove(str2).apply();
    }

    public static void exception(String str) {
        try {
            throw new Exception(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static float formFloat(byte[] bArr, int i) {
        return Float.intBitsToFloat(formInt(bArr, i, 4));
    }

    public static int formInt(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (bArr != null && bArr.length >= i + i2) {
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                i3 = (i3 << 8) | (bArr[i4 + i] & 255);
            }
        }
        return i3;
    }

    public static boolean isEmpty(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = a;
        }
        return context.getSharedPreferences(str, 0).getAll().isEmpty();
    }

    public static void log(String str) {
        Log.i(b, str);
    }

    public static void log(String str, int[] iArr) {
        log(str);
        log(iArr);
    }

    public static void log(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < i2; i3++) {
            stringBuffer.append(String.format("0x%X ", Byte.valueOf(bArr[i + i3])));
        }
        log(stringBuffer.toString());
    }

    public static void log(float[] fArr) {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        if (fArr != null) {
            stringBuffer.append("[");
            if (fArr.length > 0) {
                stringBuffer.append(fArr[0]);
                if (fArr.length > 1) {
                    for (int i = 1; i < fArr.length; i++) {
                        stringBuffer.append("," + fArr[i]);
                    }
                }
            }
            str = "].len= " + fArr.length + " ";
        } else {
            str = "null";
        }
        stringBuffer.append(str);
        log(stringBuffer.toString());
    }

    public static void log(int[] iArr) {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        if (iArr != null) {
            stringBuffer.append("[");
            if (iArr.length > 0) {
                stringBuffer.append(iArr[0]);
                if (iArr.length > 1) {
                    for (int i = 1; i < iArr.length; i++) {
                        stringBuffer.append("," + iArr[i]);
                    }
                }
            }
            str = "].len= " + iArr.length + " ";
        } else {
            str = "null";
        }
        stringBuffer.append(str);
        log(stringBuffer.toString());
    }

    public static void log(Object[] objArr) {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        if (objArr != null) {
            stringBuffer.append("[");
            if (objArr.length > 0) {
                stringBuffer.append(objArr[0]);
                if (objArr.length > 1) {
                    for (int i = 1; i < objArr.length; i++) {
                        stringBuffer.append("," + objArr[i]);
                    }
                }
            }
            str = "].len= " + objArr.length + " ";
        } else {
            str = "null";
        }
        stringBuffer.append(str);
        log(stringBuffer.toString());
    }

    public static FileOutputStream openOutputStream(File file) throws IOException {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("File '" + file + "' could not be created");
            }
        } else {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (!file.canWrite()) {
                throw new IOException("File '" + file + "' cannot be written to");
            }
        }
        return new FileOutputStream(file);
    }

    public static String readFileToString(String str) {
        File file = new File(str);
        String str2 = "";
        if (file.isDirectory()) {
            Log.d("TestFile", "The File doesn't not exist.");
        } else {
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
            } catch (FileNotFoundException unused) {
                Log.d("TestFile", "The File doesn't not exist.");
            } catch (IOException e) {
                Log.d("TestFile", e.getMessage());
            }
        }
        return str2;
    }

    public static boolean restoreBoolean(Context context, String str, boolean z) {
        return context.getSharedPreferences(a, 0).getBoolean(str, z);
    }

    public static float restoreFloat(Context context, String str, float f) {
        return context.getSharedPreferences(a, 0).getFloat(str, f);
    }

    public static int restoreInt(Context context, String str, String str2, int i) {
        if (TextUtils.isEmpty(a)) {
            str = a;
        }
        return context.getSharedPreferences(str, 0).getInt(str2, i);
    }

    public static long restoreLong(Context context, String str, long j) {
        return context.getSharedPreferences(a, 0).getLong(str, j);
    }

    public static String restoreString(Context context, String str, String str2) {
        return restoreString(context, null, str, str2);
    }

    public static String restoreString(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            str = a;
        }
        return context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static void saveBoolean(Context context, String str, boolean z) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(a, 0).edit();
        editorEdit.putBoolean(str, z);
        editorEdit.commit();
    }

    public static void saveFloat(Context context, String str, float f) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(a, 0).edit();
        editorEdit.putFloat(str, f);
        editorEdit.commit();
    }

    public static void saveInt(Context context, String str, int i) {
        saveInt(context, null, str, i);
    }

    public static void saveInt(Context context, String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            str = a;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putInt(str2, i);
        editorEdit.commit();
    }

    public static void saveLong(Context context, String str, long j) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(a, 0).edit();
        editorEdit.putLong(str, j);
        editorEdit.commit();
    }

    public static void saveString(Context context, String str, String str2) {
        saveString(context, null, str, str2);
    }

    public static void saveString(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            str = a;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, str3);
        editorEdit.commit();
    }

    public static void write(String str, OutputStream outputStream) throws IOException {
        if (str != null) {
            outputStream.write(str.getBytes());
        }
    }

    public static boolean write(String str, OutputStream outputStream, String str2) throws IOException {
        if (str == null) {
            return false;
        }
        if (str2 == null) {
            write(str, outputStream);
            return true;
        }
        outputStream.write(str.getBytes(str2));
        return true;
    }

    public static boolean writeStringToFile(File file, String str, String str2) throws Throwable {
        FileOutputStream fileOutputStreamOpenOutputStream;
        try {
            fileOutputStreamOpenOutputStream = openOutputStream(file);
            try {
                write(str, fileOutputStreamOpenOutputStream, str2);
                closeQuietly(fileOutputStreamOpenOutputStream);
                return true;
            } catch (Throwable th) {
                th = th;
                closeQuietly(fileOutputStreamOpenOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStreamOpenOutputStream = null;
        }
    }
}
