package com.alipay.sdk.encrypt;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class b {
    /* JADX WARN: Code duplicated, block: B:44:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public static byte[] a(byte[] bArr) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        GZIPOutputStream gZIPOutputStream;
        Throwable th;
        ?? r6;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        byte[] bArr2 = new byte[4096];
                        while (true) {
                            int i = byteArrayInputStream.read(bArr2);
                            if (i == -1) {
                                break;
                            }
                            gZIPOutputStream.write(bArr2, 0, i);
                        }
                        gZIPOutputStream.flush();
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception unused) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused2) {
                        }
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused3) {
                        }
                        return byteArray;
                    } catch (Throwable th2) {
                        th = th2;
                        r6 = byteArrayOutputStream;
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Exception unused4) {
                            }
                        }
                        if (r6 != 0) {
                            try {
                                r6.close();
                            } catch (Exception unused5) {
                            }
                        }
                        if (gZIPOutputStream != null) {
                            throw th;
                        }
                        try {
                            gZIPOutputStream.close();
                            throw th;
                        } catch (Exception unused6) {
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    gZIPOutputStream = null;
                    th = th3;
                    r6 = byteArrayOutputStream;
                }
            } catch (Throwable th4) {
                th = th4;
                gZIPOutputStream = null;
                th = th;
                r6 = gZIPOutputStream;
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
                if (r6 != 0) {
                    r6.close();
                }
                if (gZIPOutputStream != null) {
                    throw th;
                }
                gZIPOutputStream.close();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            byteArrayInputStream = null;
            gZIPOutputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] b(byte[] bArr) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        GZIPInputStream gZIPInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(byteArrayInputStream);
                try {
                    byte[] bArr2 = new byte[4096];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int i = gZIPInputStream2.read(bArr2, 0, 4096);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, i);
                        } catch (Throwable th2) {
                            th = th2;
                            gZIPInputStream = gZIPInputStream2;
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused) {
                            }
                            try {
                                gZIPInputStream.close();
                            } catch (Exception unused2) {
                            }
                            try {
                                byteArrayInputStream.close();
                                throw th;
                            } catch (Exception unused3) {
                                throw th;
                            }
                        }
                    }
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused4) {
                    }
                    try {
                        gZIPInputStream2.close();
                    } catch (Exception unused5) {
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (Exception unused6) {
                    }
                    return byteArray;
                } catch (Throwable th3) {
                    byteArrayOutputStream = null;
                    th = th3;
                    gZIPInputStream = gZIPInputStream2;
                }
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
                th = th;
                gZIPInputStream = byteArrayOutputStream;
                byteArrayOutputStream.close();
                gZIPInputStream.close();
                byteArrayInputStream.close();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            byteArrayInputStream = null;
            byteArrayOutputStream = null;
        }
    }
}
