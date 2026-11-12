package com.alipay.sdk.packet;

import com.alipay.sdk.util.k;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5856b = k.e(24);

    public c(boolean z) {
        this.f5855a = z;
    }

    public static int a(String str) {
        return Integer.parseInt(str);
    }

    public static String d(int i) {
        return String.format(Locale.getDefault(), "%05d", Integer.valueOf(i));
    }

    public static byte[] e(String str, String str2) {
        return com.alipay.sdk.encrypt.d.a(str, str2);
    }

    public static byte[] f(String str, byte[] bArr, String str2) {
        return com.alipay.sdk.encrypt.e.b(str, bArr, str2);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[SYNTHETIC] */
    public static byte[] g(byte[]... bArr) throws Throwable {
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        byteArray = null;
        byte[] byteArray = null;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    try {
                        for (byte[] bArr2 : bArr) {
                            dataOutputStream.write(d(bArr2.length).getBytes());
                            dataOutputStream.write(bArr2);
                        }
                        dataOutputStream.flush();
                        byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused) {
                        }
                    } catch (Exception e) {
                        e = e;
                        com.alipay.sdk.util.c.d(e);
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
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception unused3) {
                        }
                    }
                    if (dataOutputStream == null) {
                        throw th;
                    }
                    try {
                        dataOutputStream.close();
                        throw th;
                    } catch (Exception unused4) {
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                dataOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
                byteArrayOutputStream2 = byteArrayOutputStream;
                if (byteArrayOutputStream2 != null) {
                    byteArrayOutputStream2.close();
                }
                if (dataOutputStream == null) {
                    throw th;
                }
                dataOutputStream.close();
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            byteArrayOutputStream = null;
            dataOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream = null;
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
            }
            if (dataOutputStream == null) {
                throw th;
            }
            dataOutputStream.close();
            throw th;
        }
        try {
            dataOutputStream.close();
        } catch (Exception unused5) {
        }
        return byteArray;
    }

    public static byte[] h(String str, byte[] bArr, String str2) {
        return com.alipay.sdk.encrypt.e.d(str, bArr, str2);
    }

    public b b(d dVar, String str) {
        ByteArrayInputStream byteArrayInputStream;
        String str2;
        String str3;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(dVar.b());
            try {
                try {
                    byte[] bArr = new byte[5];
                    byteArrayInputStream.read(bArr);
                    byte[] bArr2 = new byte[a(new String(bArr))];
                    byteArrayInputStream.read(bArr2);
                    str2 = new String(bArr2);
                    try {
                        byte[] bArr3 = new byte[5];
                        byteArrayInputStream.read(bArr3);
                        int iA = a(new String(bArr3));
                        if (iA > 0) {
                            byte[] bArrB = new byte[iA];
                            byteArrayInputStream.read(bArrB);
                            if (this.f5855a) {
                                bArrB = h(this.f5856b, bArrB, str);
                            }
                            if (dVar.a()) {
                                bArrB = com.alipay.sdk.encrypt.b.b(bArrB);
                            }
                            str3 = new String(bArrB);
                        } else {
                            str3 = null;
                        }
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception unused) {
                        }
                    } catch (Exception e) {
                        e = e;
                        com.alipay.sdk.util.c.d(e);
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        str3 = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str2 = null;
                }
            } catch (Throwable th) {
                th = th;
                byteArrayInputStream2 = byteArrayInputStream;
                if (byteArrayInputStream2 != null) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            byteArrayInputStream = null;
            str2 = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (str2 == null && str3 == null) {
            return null;
        }
        return new b(str2, str3);
    }

    public d c(b bVar, boolean z, String str) {
        if (bVar == null) {
            return null;
        }
        byte[] bytes = bVar.a().getBytes();
        byte[] bytes2 = bVar.b().getBytes();
        if (z) {
            try {
                bytes2 = com.alipay.sdk.encrypt.b.a(bytes2);
            } catch (Exception unused) {
                z = false;
            }
        }
        return new d(z, this.f5855a ? g(bytes, e(this.f5856b, com.alipay.sdk.cons.a.f5831b), f(this.f5856b, bytes2, str)) : g(bytes, bytes2));
    }
}
