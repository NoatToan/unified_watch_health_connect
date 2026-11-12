package com.miui.tsmclient.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;

/* JADX INFO: loaded from: classes6.dex */
public class FileProviderHelper {
    private static final String FILE_PROVIDER_AUTHORITY = "com.miui.nextpay.fileprovider";

    private FileProviderHelper() {
    }

    public static String getFileUri(Context context, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        Uri uriForFile = FileProvider.getUriForFile(context, FILE_PROVIDER_AUTHORITY, file);
        context.grantUriPermission("com.miui.tsmclient", uriForFile, 1);
        return uriForFile.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static String readFromFileProvider(Context context, String str) throws Throwable {
        StringBuilder sb = new StringBuilder();
        FileInputStream fileInputStream = null;
        try {
            try {
                context = context.getContentResolver().openFileDescriptor(Uri.parse(str), "r");
                if (context != 0) {
                    try {
                        byte[] bArr = new byte[1024];
                        FileInputStream fileInputStream2 = new FileInputStream(context.getFileDescriptor());
                        while (true) {
                            try {
                                int i = fileInputStream2.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                sb.append(new String(bArr, 0, i));
                            } catch (IOException e) {
                                e = e;
                                fileInputStream = fileInputStream2;
                                LogUtils.e("FileProviderHelper readFromFileProvider fail:", e);
                                context = context;
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                IOUtils.closeQuietly((InputStream) fileInputStream);
                                IOUtils.closeQuietly((Closeable) context);
                                throw th;
                            }
                        }
                        fileInputStream = fileInputStream2;
                        context = context;
                    } catch (IOException e2) {
                        e = e2;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
            context = 0;
        } catch (Throwable th3) {
            th = th3;
            context = 0;
        }
        IOUtils.closeQuietly((InputStream) fileInputStream);
        IOUtils.closeQuietly((Closeable) context);
        return sb.toString();
    }

    public static boolean saveContent2File(String str, String str2) throws Throwable {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        FileWriter fileWriter = null;
        try {
            try {
                File file = new File(str2);
                if (!file.exists()) {
                    if (file.getParentFile() != null && !file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    if (file.isFile()) {
                        file.createNewFile();
                    }
                }
                FileWriter fileWriter2 = new FileWriter(str2);
                try {
                    fileWriter2.write(str);
                    fileWriter2.flush();
                    IOUtils.closeQuietly((Writer) fileWriter2);
                    return true;
                } catch (IOException e) {
                    e = e;
                    fileWriter = fileWriter2;
                    LogUtils.e("FileProviderHelper saveContent2File fail:", e);
                    IOUtils.closeQuietly((Writer) fileWriter);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    IOUtils.closeQuietly((Writer) fileWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }
}
