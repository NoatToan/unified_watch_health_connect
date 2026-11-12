package com.amap.api.mapcore.util;

import android.content.Context;
import com.twitter.sdk.android.core.identity.AuthHandler;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class il extends gq {
    public Context e;
    public gt f;

    public il(Context context, gt gtVar) {
        if (context != null) {
            this.e = context.getApplicationContext();
        }
        this.f = gtVar;
        setBinary(true);
    }

    private static byte[] j() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(gu.a("PANDORA$"));
            byteArrayOutputStream.write(new byte[]{1});
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                hk.a(th, "bre", "gbh");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                hk.a(th2, "bre", "gbh");
                try {
                    return null;
                } catch (Throwable th3) {
                    return null;
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    hk.a(th4, "bre", "gbh");
                }
            }
        }
    }

    private byte[] k() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(new byte[]{3});
            if (g()) {
                Context context = this.e;
                boolean zI = i();
                gt gtVar = this.f;
                byte[] bArrA = gm.a(context, zI, gtVar != null && "navi".equals(gtVar.a()));
                byteArrayOutputStream.write(gu.a(bArrA.length));
                byteArrayOutputStream.write(bArrA);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] bArrA2 = gu.a(f());
            if (bArrA2 == null || bArrA2.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(gu.a(bArrA2.length));
                byteArrayOutputStream.write(bArrA2);
            }
            byte[] bArrA3 = gu.a(h());
            if (bArrA3 == null || bArrA3.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(gu.a(bArrA3.length));
                byteArrayOutputStream.write(bArrA3);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                hk.a(th, "bre", "gred");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                hk.a(th2, "bre", "gpd");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    hk.a(th3, "bre", "gred");
                }
                return new byte[]{0};
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    hk.a(th5, "bre", "gred");
                }
                throw th4;
            }
        }
    }

    private byte[] l() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArrD = d();
            if (bArrD != null && bArrD.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byteArrayOutputStream.write(gu.a(bArrD.length));
                byteArrayOutputStream.write(bArrD);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    hk.a(th, "bre", "grrd");
                }
                return byteArray;
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                hk.a(th2, "bre", "grrd");
            }
            return byteArray2;
        } catch (Throwable th3) {
            try {
                hk.a(th3, "bre", "grrd");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    hk.a(th4, "bre", "grrd");
                }
                return new byte[]{0};
            } catch (Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th6) {
                    hk.a(th6, "bre", "grrd");
                }
                throw th5;
            }
        }
    }

    private byte[] m() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArrE = e();
            if (bArrE != null && bArrE.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byte[] bArrA = go.a(bArrE);
                byteArrayOutputStream.write(gu.a(bArrA.length));
                byteArrayOutputStream.write(bArrA);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    hk.a(th, "bre", "gred");
                }
                return byteArray;
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                hk.a(th2, "bre", "gred");
            }
            return byteArray2;
        } catch (Throwable th3) {
            try {
                hk.a(th3, "bre", "gred");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    hk.a(th4, "bre", "gred");
                }
                return new byte[]{0};
            } catch (Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th6) {
                    hk.a(th6, "bre", "gred");
                }
                throw th5;
            }
        }
    }

    public abstract byte[] d();

    public abstract byte[] e();

    public String f() {
        return "2.1";
    }

    public boolean g() {
        return true;
    }

    @Override // com.amap.api.mapcore.util.ir
    public final byte[] getEntityBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(j());
            byteArrayOutputStream.write(k());
            byteArrayOutputStream.write(l());
            byteArrayOutputStream.write(m());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                hk.a(th, "bre", "geb");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                hk.a(th2, "bre", "geb");
                try {
                    return null;
                } catch (Throwable th3) {
                    return null;
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    hk.a(th4, "bre", "geb");
                }
            }
        }
    }

    @Override // com.amap.api.mapcore.util.ir
    public Map<String, String> getParams() {
        String strF = gj.f(this.e);
        String strA = gm.a();
        String strA2 = gm.a(this.e, strA, "key=".concat(String.valueOf(strF)));
        HashMap map = new HashMap();
        map.put(AuthHandler.d, strA);
        map.put("key", strF);
        map.put("scode", strA2);
        return map;
    }

    public String h() {
        return String.format("platform=Android&sdkversion=%s&product=%s", this.f.c(), this.f.a());
    }

    public boolean i() {
        return false;
    }
}
