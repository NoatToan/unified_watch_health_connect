package com.amap.api.col.p0003sl;

import android.content.Context;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ku extends is {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f2986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ix f2987b;
    protected byte[] g;

    public abstract byte[] c();

    public abstract byte[] d();

    public boolean f() {
        return true;
    }

    protected boolean h() {
        return false;
    }

    public ku(Context context, ix ixVar) {
        if (context != null) {
            this.f2986a = context.getApplicationContext();
        }
        this.f2987b = ixVar;
        setBinary(true);
    }

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getParams() {
        String strF = il.f(this.f2986a);
        String strA = io.a();
        String strA2 = io.a(this.f2986a, strA, "key=".concat(String.valueOf(strF)));
        HashMap map = new HashMap();
        map.put("ts", strA);
        map.put(MedalConstants.EVENT_KEY, strF);
        map.put("scode", strA2);
        return map;
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
                return byteArray;
            } catch (Throwable th) {
                js.a(th, "bre", "geb");
                return byteArray;
            }
        } catch (Throwable th2) {
            try {
                js.a(th2, "bre", "geb");
                try {
                    return null;
                } catch (Throwable th3) {
                    return null;
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    js.a(th4, "bre", "geb");
                }
            }
        }
    }

    private static byte[] i() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(iy.a("PANDORA$"));
            byteArrayOutputStream.write(new byte[]{1});
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                js.a(th, "bre", "gbh");
                return byteArray;
            }
        } catch (Throwable th2) {
            try {
                js.a(th2, "bre", "gbh");
                try {
                    return null;
                } catch (Throwable th3) {
                    return null;
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    js.a(th4, "bre", "gbh");
                }
            }
        }
    }

    private byte[] j() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(new byte[]{3});
            if (f()) {
                Context context = this.f2986a;
                boolean zH = h();
                ix ixVar = this.f2987b;
                byte[] bArrA = io.a(context, zH, ixVar != null && "navi".equals(ixVar.a()));
                byteArrayOutputStream.write(a(bArrA));
                byteArrayOutputStream.write(bArrA);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] bArrA2 = iy.a(e());
            if (bArrA2 != null && bArrA2.length > 0) {
                byteArrayOutputStream.write(a(bArrA2));
                byteArrayOutputStream.write(bArrA2);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] bArrA3 = iy.a(g());
            if (bArrA3 != null && bArrA3.length > 0) {
                byteArrayOutputStream.write(a(bArrA3));
                byteArrayOutputStream.write(bArrA3);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                js.a(th, "bre", "gred");
                return byteArray;
            }
        } catch (Throwable th2) {
            try {
                js.a(th2, "bre", "gpd");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    js.a(th3, "bre", "gred");
                }
                return new byte[]{0};
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    js.a(th5, "bre", "gred");
                }
                throw th4;
            }
        }
    }

    public String g() {
        return String.format("platform=Android&sdkversion=%s&product=%s", this.f2987b.c(), this.f2987b.a());
    }

    protected String e() {
        return "2.1";
    }

    protected static byte[] a(byte[] bArr) {
        return iy.a(bArr.length);
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
                    return byteArray;
                } catch (Throwable th) {
                    js.a(th, "bre", "grrd");
                    return byteArray;
                }
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray2;
            } catch (Throwable th2) {
                js.a(th2, "bre", "grrd");
                return byteArray2;
            }
        } catch (Throwable th3) {
            try {
                js.a(th3, "bre", "grrd");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    js.a(th4, "bre", "grrd");
                }
                return new byte[]{0};
            } catch (Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th6) {
                    js.a(th6, "bre", "grrd");
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
                byte[] bArrA = io.a(bArrD);
                byteArrayOutputStream.write(a(bArrA));
                byteArrayOutputStream.write(bArrA);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    js.a(th, "bre", "gred");
                    return byteArray;
                }
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray2;
            } catch (Throwable th2) {
                js.a(th2, "bre", "gred");
                return byteArray2;
            }
        } catch (Throwable th3) {
            try {
                js.a(th3, "bre", "gred");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    js.a(th4, "bre", "gred");
                }
                return new byte[]{0};
            } catch (Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th6) {
                    js.a(th6, "bre", "gred");
                }
                throw th5;
            }
        }
    }
}
