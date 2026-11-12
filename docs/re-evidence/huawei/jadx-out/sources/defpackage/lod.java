package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class lod {
    private static final Object d = new Object();

    /* JADX WARN: Code duplicated, block: B:141:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.graphics.Bitmap] */
    public static String b(Context context, String str, Bitmap bitmap) {
        ?? fileOutputStream;
        synchronized (d) {
            String strB = lsp.b(context, str);
            File file = new File(Utils.e(context));
            if (!file.exists() && !file.mkdirs()) {
                LogUtil.e("ImageStorageAdapter", "create file error");
            }
            String str2 = Utils.e(context) + File.separator + strB;
            File file2 = new File(str2);
            ?? r1 = 0;
            r1 = 0;
            r1 = 0;
            if (bitmap == 0) {
                return null;
            }
            if (file2.exists() && !file2.delete()) {
                LogUtil.e("ImageStorageAdapter", "delete old file error");
            }
            try {
                try {
                    if (!file2.createNewFile()) {
                        return null;
                    }
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        r1 = 70;
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
                        try {
                            try {
                                fileOutputStream.flush();
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e) {
                                    r1 = "saveImage finally close IOException exception = ";
                                    LogUtil.e("ImageStorageAdapter", "saveImage finally close IOException exception = ", e.getMessage());
                                }
                            } catch (IOException e2) {
                                r1 = "saveImage finally flush IOException exception = ";
                                LogUtil.e("ImageStorageAdapter", "saveImage finally flush IOException exception = ", e2.getMessage());
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                    r1 = "saveImage finally close IOException exception = ";
                                    LogUtil.e("ImageStorageAdapter", "saveImage finally close IOException exception = ", e3.getMessage());
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                LogUtil.e("ImageStorageAdapter", "saveImage finally close IOException exception = ", e4.getMessage());
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        r1 = fileOutputStream;
                        LogUtil.e("ImageStorageAdapter", "saveImage FileNotFoundException.");
                        if (r1 != 0) {
                            try {
                                try {
                                    r1.flush();
                                } catch (IOException e5) {
                                    LogUtil.e("ImageStorageAdapter", "saveImage finally flush IOException exception = ", e5.getMessage());
                                    if (r1 != 0) {
                                        try {
                                            r1.close();
                                        } catch (IOException e6) {
                                            r1 = "saveImage finally close IOException exception = ";
                                            LogUtil.e("ImageStorageAdapter", "saveImage finally close IOException exception = ", e6.getMessage());
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                if (r1 != 0) {
                                    try {
                                        r1.close();
                                    } catch (IOException e7) {
                                        LogUtil.e("ImageStorageAdapter", "saveImage finally close IOException exception = ", e7.getMessage());
                                    }
                                }
                                throw th2;
                            }
                        }
                        if (r1 != 0) {
                            try {
                                r1.close();
                            } catch (IOException e8) {
                                r1 = "saveImage finally close IOException exception = ";
                                LogUtil.e("ImageStorageAdapter", "saveImage finally close IOException exception = ", e8.getMessage());
                            }
                        }
                    } catch (IOException unused2) {
                        r1 = fileOutputStream;
                        LogUtil.e("ImageStorageAdapter", "saveImage Exception");
                        if (r1 != 0) {
                            try {
                                try {
                                    r1.flush();
                                } catch (IOException e9) {
                                    LogUtil.e("ImageStorageAdapter", "saveImage finally flush IOException exception = ", e9.getMessage());
                                    if (r1 != 0) {
                                        try {
                                            r1.close();
                                        } catch (IOException e10) {
                                            r1 = "saveImage finally close IOException exception = ";
                                            LogUtil.e("ImageStorageAdapter", "saveImage finally close IOException exception = ", e10.getMessage());
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                if (r1 != 0) {
                                    try {
                                        r1.close();
                                    } catch (IOException e11) {
                                        LogUtil.e("ImageStorageAdapter", "saveImage finally close IOException exception = ", e11.getMessage());
                                    }
                                }
                                throw th3;
                            }
                        }
                        if (r1 != 0) {
                            try {
                                r1.close();
                            } catch (IOException e12) {
                                r1 = "saveImage finally close IOException exception = ";
                                LogUtil.e("ImageStorageAdapter", "saveImage finally close IOException exception = ", e12.getMessage());
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            if (fileOutputStream != 0) {
                                try {
                                    fileOutputStream.flush();
                                } catch (IOException e13) {
                                    LogUtil.e("ImageStorageAdapter", "saveImage finally flush IOException exception = ", e13.getMessage());
                                    if (fileOutputStream != 0) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException e14) {
                                            LogUtil.e("ImageStorageAdapter", "saveImage finally close IOException exception = ", e14.getMessage());
                                        }
                                    }
                                    throw th;
                                }
                            }
                            if (fileOutputStream != 0) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e15) {
                                    LogUtil.e("ImageStorageAdapter", "saveImage finally close IOException exception = ", e15.getMessage());
                                }
                            }
                            throw th;
                        } catch (Throwable th5) {
                            if (fileOutputStream != 0) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e16) {
                                    LogUtil.e("ImageStorageAdapter", "saveImage finally close IOException exception = ", e16.getMessage());
                                }
                            }
                            throw th5;
                        }
                    }
                    return str2;
                } catch (Throwable th6) {
                    th = th6;
                    fileOutputStream = r1;
                }
            } catch (FileNotFoundException unused3) {
            } catch (IOException unused4) {
            }
            LogUtil.e("ImageStorageAdapter", "saveImage FileNotFoundException.");
            if (r1 != 0) {
                r1.flush();
            }
            if (r1 != 0) {
                r1.close();
            }
            return str2;
        }
    }
}
