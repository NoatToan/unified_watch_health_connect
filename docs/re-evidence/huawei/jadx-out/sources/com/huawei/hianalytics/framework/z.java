package com.huawei.hianalytics.framework;

import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hms.ads.uiengineloader.aj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z {
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] a(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Deflater deflater;
        ByteArrayOutputStream byteArrayOutputStream2;
        byte[] bArr2 = new byte[0];
        Deflater deflater2 = null;
        deflater2 = null;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                deflater = new Deflater();
                try {
                    deflater.setInput(bArr);
                    deflater.finish();
                    byte[] bArr3 = new byte[1024];
                    while (!deflater.finished()) {
                        byteArrayOutputStream2.write(bArr3, 0, deflater.deflate(bArr3));
                    }
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    deflater.end();
                    try {
                        byteArrayOutputStream2.close();
                        return byteArray;
                    } catch (IOException unused) {
                        bArr2 = byteArray;
                        HiLog.sw(aj.f12896a, "close OutputStream error");
                        return bArr2;
                    }
                } catch (Exception unused2) {
                    byteArrayOutputStream3 = byteArrayOutputStream2;
                    try {
                        HiLog.e(aj.f12896a, "getBitZip exception");
                        if (deflater != null) {
                            deflater.end();
                        }
                        if (byteArrayOutputStream3 != null) {
                            try {
                                byteArrayOutputStream3.close();
                            } catch (IOException unused3) {
                                HiLog.sw(aj.f12896a, "close OutputStream error");
                                return bArr2;
                            }
                        }
                        return bArr2;
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream3;
                        deflater2 = deflater;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        if (deflater2 != null) {
                            deflater2.end();
                        }
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (IOException unused4) {
                                HiLog.sw(aj.f12896a, "close OutputStream error");
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    deflater2 = deflater;
                    if (deflater2 != null) {
                        deflater2.end();
                    }
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                    }
                    throw th;
                }
            } catch (Exception unused5) {
                deflater = null;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused6) {
            deflater = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            byteArrayOutputStream2 = byteArrayOutputStream;
            if (deflater2 != null) {
                deflater2.end();
            }
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
            }
            throw th;
        }
    }
}
