package defpackage;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes46.dex */
public class ymh {
    private ymh() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.BufferedInputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static File d(String str, ParcelFileDescriptor parcelFileDescriptor) {
        BufferedOutputStream bufferedOutputStream;
        synchronized (ymh.class) {
            yis.b("WearEngineFileUtil", "begin createFileFromPfd, fileName: " + str);
            ?? r2 = 0;
            if (!b(str, parcelFileDescriptor)) {
                return null;
            }
            String strC = c(str);
            ?? IsEmpty = TextUtils.isEmpty(strC);
            try {
                if (IsEmpty != 0) {
                    yis.c("WearEngineFileUtil", "createFileFromPfd path is invalid");
                    return null;
                }
                try {
                    File fileD = d(strC);
                    if (fileD == null) {
                        yis.c("WearEngineFileUtil", "createFileFromPfd dest file is null");
                        c((Closeable) null);
                        c((Closeable) null);
                        c(parcelFileDescriptor);
                        return null;
                    }
                    FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                    if (fileDescriptor != null && fileDescriptor.valid()) {
                        IsEmpty = new BufferedInputStream(new FileInputStream(fileDescriptor));
                        try {
                            byte[] bArr = new byte[2048];
                            int i = IsEmpty.read(bArr);
                            if (i == -1) {
                                yis.d("WearEngineFileUtil", "inputStream is empty, do not write file");
                                c((Closeable) IsEmpty);
                                c((Closeable) null);
                                c(parcelFileDescriptor);
                                return fileD;
                            }
                            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileD));
                            while (i != -1) {
                                try {
                                    bufferedOutputStream.write(bArr, 0, i);
                                    i = IsEmpty.read(bArr);
                                } catch (IOException unused) {
                                    yis.c("WearEngineFileUtil", "createFileFromPfd IOException");
                                    c((Closeable) IsEmpty);
                                    c(bufferedOutputStream);
                                    c(parcelFileDescriptor);
                                    return null;
                                } catch (Exception unused2) {
                                    yis.c("WearEngineFileUtil", "createFileFromPfd Exception");
                                    c((Closeable) IsEmpty);
                                    c(bufferedOutputStream);
                                    c(parcelFileDescriptor);
                                    return null;
                                }
                            }
                            bufferedOutputStream.flush();
                            c((Closeable) IsEmpty);
                            c(bufferedOutputStream);
                            c(parcelFileDescriptor);
                            return fileD;
                        } catch (IOException unused3) {
                            bufferedOutputStream = null;
                        } catch (Exception unused4) {
                            bufferedOutputStream = null;
                        } catch (Throwable th) {
                            th = th;
                            r2 = IsEmpty;
                            c((Closeable) r2);
                            c((Closeable) 0);
                            c(parcelFileDescriptor);
                            throw th;
                        }
                    }
                    yis.d("WearEngineFileUtil", "fd is invalid");
                    c((Closeable) null);
                    c((Closeable) null);
                    c(parcelFileDescriptor);
                    return fileD;
                } catch (IOException unused5) {
                    IsEmpty = 0;
                    bufferedOutputStream = null;
                } catch (Exception unused6) {
                    IsEmpty = 0;
                    bufferedOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    c((Closeable) r2);
                    c((Closeable) 0);
                    c(parcelFileDescriptor);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    private static File d(String str) throws IOException {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            yis.c("WearEngineFileUtil", "createFileFromPfd parentFile is invalid");
            return null;
        }
        if (!parentFile.exists()) {
            yis.b("WearEngineFileUtil", "createFileFromPfd isFileMkdir:" + parentFile.mkdirs());
        }
        if (!file.exists()) {
            yis.b("WearEngineFileUtil", "createFileFromPfd isFileCreate:" + file.createNewFile());
        }
        return file;
    }

    private static boolean b(String str, ParcelFileDescriptor parcelFileDescriptor) {
        if (TextUtils.isEmpty(str)) {
            yis.c("WearEngineFileUtil", "createFileFromPfd fileName is invalid");
            return false;
        }
        if (parcelFileDescriptor != null) {
            return true;
        }
        yis.c("WearEngineFileUtil", "createFileFromPfd fileDescriptor is null");
        return false;
    }

    private static String c(String str) {
        Context contextE = ylx.e();
        if (contextE == null) {
            yis.c("WearEngineFileUtil", "getCheckedFilePath context is null");
            return "";
        }
        try {
            String str2 = contextE.getFilesDir().getCanonicalPath() + File.separator + "WearEngine" + File.separator + str;
            if (TextUtils.isEmpty(str2)) {
                yis.c("WearEngineFileUtil", "createFileFromPfd path is invalid");
                return "";
            }
            try {
                return new File(str2).getCanonicalPath();
            } catch (IOException unused) {
                yis.c("WearEngineFileUtil", "getCheckedFilePath IOException");
                return null;
            }
        } catch (IOException unused2) {
            yis.c("WearEngineFileUtil", "getCanonicalPath IOException");
            return "";
        }
    }

    private static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                yis.c("WearEngineFileUtil", "closeQuietly IOException");
            }
        }
    }
}
