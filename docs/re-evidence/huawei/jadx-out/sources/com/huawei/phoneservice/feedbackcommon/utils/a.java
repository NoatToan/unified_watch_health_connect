package com.huawei.phoneservice.feedbackcommon.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:105:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00d7 A[EXC_TOP_SPLITTER, PHI: r6
      0x00d7: PHI (r6v14 ??) = (r6v13 ??), (r6v18 ??), (r6v18 ??) binds: [B:57:0x00d5, B:19:0x0084, B:16:0x007e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r6v18, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.BufferedOutputStream] */
    public static File c(Context context, Uri uri, String str) throws Throwable {
        Throwable th;
        ?? r6;
        Exception e;
        ?? r2;
        FileInputStream fileInputStream;
        Exception e2;
        ?? r7;
        String str2 = context.getCacheDir() + File.separator + "picCache";
        new File(str2).mkdirs();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(File.separator);
        sb.append(str);
        File file = new File(sb.toString());
        ?? r1 = 0;
        try {
            try {
                try {
                    context = context.getContentResolver().openFileDescriptor(uri, "r");
                    try {
                        file.createNewFile();
                        uri = new BufferedOutputStream(new FileOutputStream(file));
                        try {
                            fileInputStream = new FileInputStream(context.getFileDescriptor());
                            try {
                                byte[] bArr = new byte[Constants.GIF_SIZE_UPPER_LIMIT_KB];
                                while (true) {
                                    int i = fileInputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    }
                                    uri.write(bArr, 0, i);
                                }
                                uri.flush();
                                try {
                                    uri.close();
                                } catch (IOException e3) {
                                    com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e3.getMessage());
                                }
                                try {
                                    fileInputStream.close();
                                } catch (IOException e4) {
                                    com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e4.getMessage());
                                }
                            } catch (IOException e5) {
                                e2 = e5;
                                com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e2.getMessage());
                                if (uri != 0) {
                                    try {
                                        uri.close();
                                    } catch (IOException e6) {
                                        com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e6.getMessage());
                                    }
                                }
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e7) {
                                        com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e7.getMessage());
                                    }
                                }
                                if (context != 0) {
                                }
                                return file;
                            } catch (IllegalStateException e8) {
                                e2 = e8;
                                com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e2.getMessage());
                                if (uri != 0) {
                                    uri.close();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (context != 0) {
                                }
                                return file;
                            }
                        } catch (IOException e9) {
                            e = e9;
                            Exception exc = e;
                            fileInputStream = null;
                            e2 = exc;
                            com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e2.getMessage());
                            if (uri != 0) {
                                uri.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (context != 0) {
                                context.close();
                            }
                            return file;
                        } catch (IllegalStateException e10) {
                            e = e10;
                            Exception exc2 = e;
                            fileInputStream = null;
                            e2 = exc2;
                            com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e2.getMessage());
                            if (uri != 0) {
                                uri.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (context != 0) {
                                context.close();
                            }
                            return file;
                        } catch (Throwable th2) {
                            th = th2;
                            sb = null;
                            r1 = uri;
                            r2 = sb;
                            r7 = context;
                            if (r1 != 0) {
                                try {
                                    r1.close();
                                } catch (IOException e11) {
                                    com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e11.getMessage());
                                }
                            }
                            if (r2 != 0) {
                                try {
                                    r2.close();
                                } catch (IOException e12) {
                                    com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e12.getMessage());
                                }
                            }
                            if (r7 != 0) {
                                throw th;
                            }
                            try {
                                r7.close();
                                throw th;
                            } catch (IOException e13) {
                                com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e13.getMessage());
                                throw th;
                            }
                        }
                    } catch (IOException e14) {
                        e = e14;
                        fileInputStream = null;
                        e2 = e;
                        uri = 0;
                        com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e2.getMessage());
                        if (uri != 0) {
                            uri.close();
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (context != 0) {
                            context.close();
                        }
                        return file;
                    } catch (IllegalStateException e15) {
                        e = e15;
                        fileInputStream = null;
                        e2 = e;
                        uri = 0;
                        com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e2.getMessage());
                        if (uri != 0) {
                            uri.close();
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (context != 0) {
                            context.close();
                        }
                        return file;
                    } catch (Throwable th3) {
                        th = th3;
                        r6 = context;
                        r2 = 0;
                        r7 = r6;
                        if (r1 != 0) {
                            r1.close();
                        }
                        if (r2 != 0) {
                            r2.close();
                        }
                        if (r7 != 0) {
                            throw th;
                        }
                        r7.close();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (IOException e16) {
                e = e16;
                e = e;
                context = 0;
                fileInputStream = null;
                e2 = e;
                uri = 0;
                com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e2.getMessage());
                if (uri != 0) {
                    uri.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (context != 0) {
                    context.close();
                }
                return file;
            } catch (IllegalStateException e17) {
                e = e17;
                e = e;
                context = 0;
                fileInputStream = null;
                e2 = e;
                uri = 0;
                com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e2.getMessage());
                if (uri != 0) {
                    uri.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (context != 0) {
                    context.close();
                }
                return file;
            } catch (Throwable th5) {
                th = th5;
                r6 = 0;
            }
            context.close();
        } catch (IOException e18) {
            com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e18.getMessage());
        }
        return file;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    public static File a(Bitmap bitmap, String str) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        BufferedOutputStream bufferedOutputStream;
        ByteArrayInputStream byteArrayInputStream2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        File file = new File(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        byteArrayInputStream = null;
        ByteArrayInputStream byteArrayInputStream3 = null;
        ByteArrayInputStream byteArrayInputStream4 = null;
        try {
            try {
                file.createNewFile();
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    try {
                        byte[] bArr = new byte[Constants.GIF_SIZE_UPPER_LIMIT_KB];
                        while (true) {
                            int i = byteArrayInputStream2.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, i);
                        }
                        bufferedOutputStream.flush();
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e) {
                            com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e.getMessage());
                        }
                    } catch (IOException e2) {
                        e = e2;
                        byteArrayInputStream4 = byteArrayInputStream2;
                        try {
                            com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e.getMessage());
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException e3) {
                                    com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e3.getMessage());
                                }
                            }
                            if (byteArrayInputStream4 != null) {
                                byteArrayInputStream2 = byteArrayInputStream4;
                            }
                            return file;
                        } catch (Throwable th) {
                            th = th;
                            byteArrayInputStream = byteArrayInputStream4;
                            bufferedOutputStream2 = bufferedOutputStream;
                            bufferedOutputStream = bufferedOutputStream2;
                            byteArrayInputStream3 = byteArrayInputStream;
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException e4) {
                                    com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e4.getMessage());
                                }
                            }
                            if (byteArrayInputStream3 == null) {
                                throw th;
                            }
                            try {
                                byteArrayInputStream3.close();
                                throw th;
                            } catch (IOException e5) {
                                com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e5.getMessage());
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayInputStream3 = byteArrayInputStream2;
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        if (byteArrayInputStream3 == null) {
                            throw th;
                        }
                        byteArrayInputStream3.close();
                        throw th;
                    }
                } catch (IOException e6) {
                    e = e6;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e7) {
                e = e7;
                bufferedOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayInputStream = null;
                bufferedOutputStream = bufferedOutputStream2;
                byteArrayInputStream3 = byteArrayInputStream;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (byteArrayInputStream3 == null) {
                    throw th;
                }
                byteArrayInputStream3.close();
                throw th;
            }
            byteArrayInputStream2.close();
        } catch (IOException e8) {
            com.huawei.phoneservice.faq.base.util.g.c("BitmapUtils", e8.getMessage());
        }
        return file;
    }
}
