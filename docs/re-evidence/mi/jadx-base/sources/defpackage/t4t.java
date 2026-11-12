package defpackage;

import android.content.Context;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t4t extends l0t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f34316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected o0t f34317b;
    protected byte[] g;

    public t4t(Context context, o0t o0tVar) {
        if (context != null) {
            this.f34316a = context.getApplicationContext();
        }
        this.f34317b = o0tVar;
        setBinary(true);
    }

    public static byte[] a(byte[] bArr) {
        return p0t.m(bArr.length);
    }

    private static byte[] i() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(p0t.n("PANDORA$"));
            byteArrayOutputStream.write(new byte[]{1});
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                j2t.e(th, "bre", "gbh");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                j2t.e(th2, "bre", "gbh");
                try {
                    return null;
                } catch (Throwable th3) {
                    return null;
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    j2t.e(th4, "bre", "gbh");
                }
            }
        }
    }

    private byte[] j() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(new byte[]{3});
            if (f()) {
                Context context = this.f34316a;
                boolean zH = h();
                o0t o0tVar = this.f34317b;
                byte[] bArrF = g0t.f(context, zH, o0tVar != null && "navi".equals(o0tVar.a()));
                byteArrayOutputStream.write(a(bArrF));
                byteArrayOutputStream.write(bArrF);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] bArrN = p0t.n(e());
            if (bArrN == null || bArrN.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(a(bArrN));
                byteArrayOutputStream.write(bArrN);
            }
            byte[] bArrN2 = p0t.n(g());
            if (bArrN2 == null || bArrN2.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(a(bArrN2));
                byteArrayOutputStream.write(bArrN2);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                j2t.e(th, "bre", "gred");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                j2t.e(th2, "bre", "gpd");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    j2t.e(th3, "bre", "gred");
                }
                return new byte[]{0};
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    j2t.e(th5, "bre", "gred");
                }
                throw th4;
            }
        }
    }

    private byte[] k() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArrC = c();
            if (bArrC != null && bArrC.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byteArrayOutputStream.write(a(bArrC));
                byteArrayOutputStream.write(bArrC);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    j2t.e(th, "bre", "grrd");
                }
                return byteArray;
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                j2t.e(th2, "bre", "grrd");
            }
            return byteArray2;
        } catch (Throwable th3) {
            try {
                j2t.e(th3, "bre", "grrd");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    j2t.e(th4, "bre", "grrd");
                }
                return new byte[]{0};
            } catch (Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th6) {
                    j2t.e(th6, "bre", "grrd");
                }
                throw th5;
            }
        }
    }

    private byte[] l() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArrD = d();
            if (bArrD != null && bArrD.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byte[] bArrG = g0t.g(bArrD);
                byteArrayOutputStream.write(a(bArrG));
                byteArrayOutputStream.write(bArrG);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    j2t.e(th, "bre", "gred");
                }
                return byteArray;
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                j2t.e(th2, "bre", "gred");
            }
            return byteArray2;
        } catch (Throwable th3) {
            try {
                j2t.e(th3, "bre", "gred");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    j2t.e(th4, "bre", "gred");
                }
                return new byte[]{0};
            } catch (Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th6) {
                    j2t.e(th6, "bre", "gred");
                }
                throw th5;
            }
        }
    }

    public abstract byte[] c();

    public abstract byte[] d();

    public String e() {
        return "2.1";
    }

    public boolean f() {
        return true;
    }

    public String g() {
        return String.format("platform=Android&sdkversion=%s&product=%s", this.f34317b.f(), this.f34317b.a());
    }

    @Override // com.amap.api.col.p0003sl.la
    public final byte[] getEntityBytes() {
        byte[] bArr = this.g;
        if (bArr != null) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(i());
            byteArrayOutputStream.write(j());
            byteArrayOutputStream.write(k());
            byteArrayOutputStream.write(l());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.g = byteArray;
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                j2t.e(th, "bre", "geb");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                j2t.e(th2, "bre", "geb");
                try {
                    return null;
                } catch (Throwable th3) {
                    return null;
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    j2t.e(th4, "bre", "geb");
                }
            }
        }
    }

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getParams() {
        String strK = e0t.k(this.f34316a);
        String strA = g0t.a();
        String strC = g0t.c(this.f34316a, strA, "key=".concat(String.valueOf(strK)));
        HashMap map = new HashMap();
        map.put(DeviceTagInterface.TAG_DATA_START, strA);
        map.put("key", strK);
        map.put("scode", strC);
        return map;
    }

    public boolean h() {
        return false;
    }
}
