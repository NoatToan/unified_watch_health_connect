package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes30.dex */
public class grb {
    public static byte[] b(byte[] bArr) throws Throwable {
        byte[] bArr2 = new byte[0];
        ByteArrayOutputStream byteArrayOutputStreamA = a(bArr);
        return byteArrayOutputStreamA != null ? byteArrayOutputStreamA.toByteArray() : bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0031: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:12:0x0031 */
    private static ByteArrayOutputStream a(byte[] bArr) throws Throwable {
        GZIPInputStream gZIPInputStream;
        GZIPInputStream gZIPInputStream2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byte[] bArr2 = new byte[4096];
        GZIPInputStream gZIPInputStream3 = null;
        try {
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                while (true) {
                    try {
                        int i = gZIPInputStream.read(bArr2);
                        if (i != -1) {
                            byteArrayOutputStream.write(bArr2, 0, i);
                        } else {
                            try {
                                gZIPInputStream.close();
                                return byteArrayOutputStream;
                            } catch (IOException unused) {
                                grn.c("CompressUtil", "getDecompressByteArray close zip IOException");
                                return byteArrayOutputStream;
                            }
                        }
                    } catch (IOException unused2) {
                        grn.c("CompressUtil", "getDecompressByteArray IOException");
                        if (gZIPInputStream != null) {
                            try {
                                gZIPInputStream.close();
                            } catch (IOException unused3) {
                                grn.c("CompressUtil", "getDecompressByteArray close zip IOException");
                            }
                        }
                        return null;
                    }
                }
            } catch (Throwable th) {
                th = th;
                gZIPInputStream3 = gZIPInputStream2;
                if (gZIPInputStream3 != null) {
                    try {
                        gZIPInputStream3.close();
                    } catch (IOException unused4) {
                        grn.c("CompressUtil", "getDecompressByteArray close zip IOException");
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            gZIPInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (gZIPInputStream3 != null) {
                gZIPInputStream3.close();
            }
            throw th;
        }
    }
}
