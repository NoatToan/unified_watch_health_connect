package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class nz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f43987a;
    public String e = ox.b(24);

    public nz(boolean z) {
        this.f43987a = z;
    }

    public static byte[] c(String str, byte[] bArr, String str2) {
        return nm.d(str, bArr, str2);
    }

    public nv b(nw nwVar, boolean z, String str) {
        if (nwVar == null) {
            return null;
        }
        byte[] bytes = nwVar.b().getBytes();
        byte[] bytes2 = nwVar.e().getBytes();
        if (z) {
            try {
                bytes2 = nk.e(bytes2);
            } catch (Exception unused) {
                z = false;
            }
        }
        return new nv(z, this.f43987a ? c(bytes, d(this.e, mz.f42719a), c(this.e, bytes2, str)) : c(bytes, bytes2));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public nw d(nv nvVar, String str) {
        ByteArrayInputStream byteArrayInputStream;
        String str2;
        String str3;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(nvVar.d());
            try {
                try {
                    byte[] bArr = new byte[5];
                    byteArrayInputStream.read(bArr);
                    byte[] bArr2 = new byte[d(new String(bArr))];
                    byteArrayInputStream.read(bArr2);
                    str2 = new String(bArr2);
                    try {
                        byte[] bArr3 = new byte[5];
                        byteArrayInputStream.read(bArr3);
                        int iD = d(new String(bArr3));
                        if (iD > 0) {
                            byte[] bArrB = new byte[iD];
                            byteArrayInputStream.read(bArrB);
                            if (this.f43987a) {
                                bArrB = e(this.e, bArrB, str);
                            }
                            if (nvVar.e()) {
                                bArrB = nk.b(bArrB);
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
                        try {
                            oq.c(e);
                            if (byteArrayInputStream != null) {
                                try {
                                    byteArrayInputStream.close();
                                } catch (Exception unused2) {
                                }
                            }
                            str3 = null;
                        } catch (Throwable th) {
                            th = th;
                            byteArrayInputStream2 = byteArrayInputStream;
                            byteArrayInputStream = byteArrayInputStream2;
                            if (byteArrayInputStream != null) {
                                try {
                                    byteArrayInputStream.close();
                                } catch (Exception unused3) {
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    str2 = null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            byteArrayInputStream = null;
            str2 = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayInputStream = byteArrayInputStream2;
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
            }
            throw th;
        }
        if (str2 == null && str3 == null) {
            return null;
        }
        return new nw(str2, str3);
    }

    public static byte[] d(String str, String str2) {
        return nj.a(str, str2);
    }

    public static byte[] e(String str, byte[] bArr, String str2) {
        return nm.b(str, bArr, str2);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[SYNTHETIC] */
    public static byte[] c(byte[]... bArr) throws Throwable {
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] byteArray = null;
        byteArray = null;
        byteArray = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                            try {
                                try {
                                    for (byte[] bArr2 : bArr) {
                                        dataOutputStream.write(c(bArr2.length).getBytes());
                                        dataOutputStream.write(bArr2);
                                    }
                                    dataOutputStream.flush();
                                    byteArray = byteArrayOutputStream.toByteArray();
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception unused) {
                                    }
                                    dataOutputStream.close();
                                } catch (Exception e) {
                                    e = e;
                                    oq.c(e);
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Exception unused2) {
                                        }
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
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
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.close();
                                        throw th;
                                    } catch (Exception unused4) {
                                        throw th;
                                    }
                                }
                                throw th;
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
                            if (dataOutputStream != null) {
                                dataOutputStream.close();
                                throw th;
                            }
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
                        if (dataOutputStream != null) {
                            dataOutputStream.close();
                            throw th;
                        }
                        throw th;
                    }
                    return byteArray;
                }
            } catch (Exception unused5) {
            }
        }
        return null;
    }

    public static String c(int i) {
        return String.format(Locale.getDefault(), "%05d", Integer.valueOf(i));
    }

    public static int d(String str) {
        return Integer.parseInt(str);
    }
}
