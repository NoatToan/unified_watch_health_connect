package fh;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Locale;
import nh.n;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f71574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71575b = n.a(24);

    public c(boolean z14) {
        this.f71574a = z14;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public static byte[] a(byte[]... bArr) {
        ?? r14;
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutputStream dataOutputStream;
        int length = bArr.length;
        ?? r15 = 0;
        byteArray = null;
        byte[] byteArray = null;
        try {
            if (length == 0) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    dataOutputStream = new DataOutputStream(byteArrayOutputStream2);
                    try {
                        for (byte[] bArr2 : bArr) {
                            dataOutputStream.write(String.format(Locale.getDefault(), "%05d", Integer.valueOf(bArr2.length)).getBytes());
                            dataOutputStream.write(bArr2);
                        }
                        dataOutputStream.flush();
                        byteArray = byteArrayOutputStream2.toByteArray();
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception unused) {
                        }
                    } catch (Exception e4) {
                        e = e4;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        nh.d.a(e);
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        if (dataOutputStream != null) {
                        }
                        return byteArray;
                    }
                } catch (Exception e14) {
                    e = e14;
                    dataOutputStream = null;
                    byteArrayOutputStream = byteArrayOutputStream2;
                } catch (Throwable th3) {
                    th = th3;
                    r14 = byteArrayOutputStream2;
                    r15 = r14;
                    if (r15 != 0) {
                        try {
                            r15.close();
                        } catch (Exception unused3) {
                        }
                    }
                    if (r15 != 0) {
                        throw th;
                    }
                    try {
                        r15.close();
                        throw th;
                    } catch (Exception unused4) {
                        throw th;
                    }
                }
            } catch (Exception e15) {
                e = e15;
                byteArrayOutputStream = null;
                dataOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                if (r15 != 0) {
                    r15.close();
                }
                if (r15 != 0) {
                    throw th;
                }
                r15.close();
                throw th;
            }
            try {
                dataOutputStream.close();
            } catch (Exception unused5) {
            }
            return byteArray;
        } catch (Throwable th5) {
            th = th5;
            r14 = length;
        }
    }
}
