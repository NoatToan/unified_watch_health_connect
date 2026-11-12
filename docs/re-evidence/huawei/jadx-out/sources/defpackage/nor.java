package defpackage;

import android.text.TextUtils;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes3.dex */
public final class nor {
    private static boolean a(String str) {
        return new File(str).exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.FileOutputStream] */
    public static void d(String str, String str2, byte[] bArr) throws Throwable {
        Throwable th;
        ?? r5;
        Exception e;
        FileOutputStream fileOutputStream;
        if (str == null || TextUtils.isEmpty(str) || str2 == null || TextUtils.isEmpty(str2) || bArr == null) {
            nox.a("FileUtils", "parameter is null.", true);
            return;
        }
        try {
            try {
                File file = new File(str);
                if (!file.exists() && !file.mkdirs()) {
                    nox.a("FileUtils", "file is not existence.", true);
                    b((FileOutputStream) null, (FileInputStream) null, (InputStream) null);
                    return;
                }
                String str3 = str + str2;
                if (!g(str3)) {
                    nox.a("FileUtils", "file path is invalid.", true);
                    fileOutputStream = null;
                } else {
                    fileOutputStream = new FileOutputStream(new File(str3));
                    try {
                        fileOutputStream.write(bArr);
                        fileOutputStream.flush();
                    } catch (FileNotFoundException unused) {
                        nox.a("FileUtils", "FileNotFoundException", true);
                        b(fileOutputStream, (FileInputStream) null, (InputStream) null);
                        return;
                    } catch (IOException unused2) {
                        nox.a("FileUtils", "IOException", true);
                        b(fileOutputStream, (FileInputStream) null, (InputStream) null);
                        return;
                    } catch (Exception e2) {
                        e = e2;
                        nox.a("FileUtils", "Exception:" + e.getClass().getSimpleName(), true);
                        b(fileOutputStream, (FileInputStream) null, (InputStream) null);
                        return;
                    }
                }
                b(fileOutputStream, (FileInputStream) null, (InputStream) null);
            } catch (Throwable th2) {
                th = th2;
                r5 = str;
                b((FileOutputStream) r5, (FileInputStream) null, (InputStream) null);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            fileOutputStream = null;
        } catch (IOException unused4) {
            fileOutputStream = null;
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            r5 = 0;
            b((FileOutputStream) r5, (FileInputStream) null, (InputStream) null);
            throw th;
        }
    }

    private static boolean g(String str) throws IllegalArgumentException, UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            nox.a("FileUtils", "filePath is empty.", true);
            return false;
        }
        String strDecode = URLDecoder.decode(str, "utf-8");
        return (strDecode.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE) || strDecode.contains("./") || strDecode.contains("%00") || strDecode.contains("..")) ? false : true;
    }

    private static void b(FileOutputStream fileOutputStream, FileInputStream fileInputStream, InputStream inputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                nox.a("FileUtils", "fileOutputStream IOException" + e.getClass().getSimpleName(), true);
            }
        }
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException e2) {
                nox.a("FileUtils", "fileInputStream IOException" + e2.getClass().getSimpleName(), true);
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e3) {
                nox.a("FileUtils", "inputStream IOException" + e3.getClass().getSimpleName(), true);
            }
        }
    }

    public static void c(String str) {
        c(new File(str));
    }

    private static void c(File file) {
        if (!file.exists()) {
            nox.a("FileUtils", "files is not existence.", true);
            return;
        }
        if (!file.isDirectory()) {
            nox.a("FileUtils", "files is not directory.", true);
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            nox.a("FileUtils", "fileList is null.", true);
            return;
        }
        for (File file2 : fileArrListFiles) {
            boolean zDelete = file2.delete();
            nox.a("FileUtils", "result is " + zDelete, true);
            if (!zDelete) {
                return;
            }
        }
    }

    public static InputStream b(String str) throws Throwable {
        FileInputStream fileInputStream;
        if (!a(str)) {
            return null;
        }
        File file = new File(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        try {
            try {
                fileInputStream = new FileInputStream(file);
                while (true) {
                    try {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                            b((FileOutputStream) null, fileInputStream, byteArrayInputStream);
                            return byteArrayInputStream;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    } catch (FileNotFoundException unused) {
                        nox.a("FileUtils", "FileNotFoundException", true);
                        b((FileOutputStream) null, fileInputStream, (InputStream) null);
                        return null;
                    } catch (IOException unused2) {
                        nox.a("FileUtils", "IOException", true);
                        b((FileOutputStream) null, fileInputStream, (InputStream) null);
                        return null;
                    } catch (IndexOutOfBoundsException unused3) {
                        nox.a("FileUtils", "IndexOutOfBoundsException", true);
                        b((FileOutputStream) null, fileInputStream, (InputStream) null);
                        return null;
                    }
                }
            } catch (Throwable th) {
                th = th;
                b((FileOutputStream) null, (FileInputStream) null, (InputStream) null);
                throw th;
            }
        } catch (FileNotFoundException unused4) {
            fileInputStream = null;
        } catch (IOException unused5) {
            fileInputStream = null;
        } catch (IndexOutOfBoundsException unused6) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            b((FileOutputStream) null, (FileInputStream) null, (InputStream) null);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.FileOutputStream] */
    public void b(String str, String str2, String str3) throws Throwable {
        FileOutputStream fileOutputStream;
        ?? r7;
        if (str == null || TextUtils.isEmpty(str) || str2 == 0 || TextUtils.isEmpty(str2) || str3 == 0 || TextUtils.isEmpty(str3)) {
            nox.a("FileUtils", "parameter is null.", true);
            return;
        }
        try {
            try {
                File file = new File((String) str2);
                if (!file.exists() && !file.mkdirs()) {
                    nox.a("FileUtils", "new file is not existence.", true);
                    b((FileOutputStream) null, (FileInputStream) null, (InputStream) null);
                    return;
                }
                File file2 = new File(str);
                if (!file2.exists() && !file2.mkdirs()) {
                    nox.a("FileUtils", "old file is not existence.", true);
                    b((FileOutputStream) null, (FileInputStream) null, (InputStream) null);
                    return;
                }
                File file3 = new File(str + ((String) str3));
                File file4 = new File(((String) str2) + ((String) str3));
                str2 = new FileInputStream(file3);
                try {
                    fileOutputStream = new FileOutputStream(file4);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = str2.read(bArr);
                            if (-1 == i) {
                                b(fileOutputStream, (FileInputStream) null, (InputStream) str2);
                                return;
                            }
                            fileOutputStream.write(bArr, 0, i);
                        }
                    } catch (FileNotFoundException unused) {
                        nox.a("FileUtils", "FileNotFoundException", true);
                        r7 = str2;
                        b(fileOutputStream, (FileInputStream) null, (InputStream) r7);
                    } catch (IOException unused2) {
                        nox.a("FileUtils", "IOException", true);
                        r7 = str2;
                        b(fileOutputStream, (FileInputStream) null, (InputStream) r7);
                    } catch (IndexOutOfBoundsException unused3) {
                        nox.a("FileUtils", "IndexOutOfBoundsException", true);
                        r7 = str2;
                        b(fileOutputStream, (FileInputStream) null, (InputStream) r7);
                    }
                } catch (FileNotFoundException unused4) {
                    fileOutputStream = null;
                } catch (IOException unused5) {
                    fileOutputStream = null;
                } catch (IndexOutOfBoundsException unused6) {
                    fileOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    str3 = 0;
                    b((FileOutputStream) str3, (FileInputStream) null, (InputStream) str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException unused7) {
            str2 = 0;
            fileOutputStream = null;
        } catch (IOException unused8) {
            str2 = 0;
            fileOutputStream = null;
        } catch (IndexOutOfBoundsException unused9) {
            str2 = 0;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            str2 = 0;
            str3 = 0;
        }
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            nox.b("FileUtils", "file not exist", true);
            return false;
        }
    }

    public static String d(String str) throws Throwable {
        FileInputStream fileInputStream;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    int iAvailable = fileInputStream.available();
                    byte[] bArr = new byte[iAvailable];
                    if (iAvailable != fileInputStream.read(bArr)) {
                        nox.a("FileUtils", "readFile length is error.", true);
                    }
                    String str2 = new String(bArr, "UTF-8");
                    a(fileInputStream, null);
                    return str2;
                } catch (FileNotFoundException e) {
                    e = e;
                    nox.a("FileUtils", "FileNotFoundException " + e.getClass().getSimpleName(), true);
                    a(fileInputStream, null);
                    return "";
                } catch (UnsupportedEncodingException e2) {
                    e = e2;
                    nox.a("FileUtils", "UnsupportedEncodingException " + e.getClass().getSimpleName(), true);
                    a(fileInputStream, null);
                    return "";
                } catch (IOException e3) {
                    e = e3;
                    nox.a("FileUtils", "IOException " + e.getClass().getSimpleName(), true);
                    a(fileInputStream, null);
                    return "";
                } catch (Exception e4) {
                    e = e4;
                    nox.a("FileUtils", "Exception " + e.getClass().getSimpleName(), true);
                    a(fileInputStream, null);
                    return "";
                }
            } catch (Throwable th) {
                th = th;
                a(null, null);
                throw th;
            }
        } catch (FileNotFoundException e5) {
            e = e5;
            fileInputStream = null;
        } catch (UnsupportedEncodingException e6) {
            e = e6;
            fileInputStream = null;
        } catch (IOException e7) {
            e = e7;
            fileInputStream = null;
        } catch (Exception e8) {
            e = e8;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            a(null, null);
            throw th;
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                nox.a("FileUtils", "close InputStream error!" + e.getClass().getSimpleName(), true);
            }
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                nox.a("FileUtils", "close OutputStream error!" + e2.getClass().getSimpleName(), true);
            }
        }
    }
}
