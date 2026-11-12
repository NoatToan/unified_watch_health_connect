package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class w9s {
    public static String a(byte[] bArr) {
        return b(bArr, "UTF-8");
    }

    public static String b(byte[] bArr, String str) {
        String string = null;
        if (bArr != null && bArr.length != 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                        try {
                            byte[] bArr2 = new byte[256];
                            while (true) {
                                int i = gZIPInputStream.read(bArr2);
                                if (i < 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, i);
                                try {
                                    throw th;
                                } catch (Throwable th) {
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                            string = byteArrayOutputStream.toString(str);
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                try {
                                    gZIPInputStream.close();
                                } catch (Throwable th5) {
                                    th3.addSuppressed(th5);
                                }
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th9) {
                            th7.addSuppressed(th9);
                        }
                        throw th8;
                    }
                }
            } catch (IOException e) {
                wpe.e("GZipUtil", wpe.o(e));
            }
        }
        return string;
    }

    public static byte[] c(String str) {
        return d(str, "UTF-8");
    }

    public static byte[] d(String str, String str2) {
        byte[] byteArray = null;
        if (str != null && str.length() != 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(str.getBytes(str2));
                        gZIPOutputStream.close();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th6) {
                            th4.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
            } catch (IOException e) {
                wpe.e("GZipUtil", wpe.o(e));
            }
        }
        return byteArray;
    }
}
