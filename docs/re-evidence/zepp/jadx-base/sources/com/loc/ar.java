package com.loc;

import android.content.Context;
import com.twitter.sdk.android.core.identity.AuthHandler;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public abstract class ar extends q {
    public Context a;
    public t b;

    public ar(Context context, t tVar) {
        if (context != null) {
            this.a = context.getApplicationContext();
        }
        this.b = tVar;
    }

    private static byte[] p() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(u.a("PANDORA$"));
            byteArrayOutputStream.write(new byte[]{1});
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                y.a(th, "bre", "gbh");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                y.a(th2, "bre", "gbh");
                try {
                    return null;
                } catch (Throwable th3) {
                    return null;
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    y.a(th4, "bre", "gbh");
                }
            }
        }
    }

    private byte[] q() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(new byte[]{3});
            if (j()) {
                Context context = this.a;
                boolean zL = l();
                t tVar = this.b;
                byte[] bArrA = m.a(context, zL, tVar != null && "navi".equals(tVar.a()));
                byteArrayOutputStream.write(u.a(bArrA.length));
                byteArrayOutputStream.write(bArrA);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] bArrA2 = u.a(g());
            if (bArrA2 == null || bArrA2.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(u.a(bArrA2.length));
                byteArrayOutputStream.write(bArrA2);
            }
            byte[] bArrA3 = u.a(k());
            if (bArrA3 == null || bArrA3.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(u.a(bArrA3.length));
                byteArrayOutputStream.write(bArrA3);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                y.a(th, "bre", "gred");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                y.a(th2, "bre", "gpd");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    y.a(th3, "bre", "gred");
                }
                return new byte[]{0};
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    y.a(th5, "bre", "gred");
                }
                throw th4;
            }
        }
    }

    private byte[] r() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArrA_ = a_();
            if (bArrA_ != null && bArrA_.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byteArrayOutputStream.write(u.a(bArrA_.length));
                byteArrayOutputStream.write(bArrA_);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    y.a(th, "bre", "grrd");
                }
                return byteArray;
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                y.a(th2, "bre", "grrd");
            }
            return byteArray2;
        } catch (Throwable th3) {
            try {
                y.a(th3, "bre", "grrd");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    y.a(th4, "bre", "grrd");
                }
                return new byte[]{0};
            } catch (Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th6) {
                    y.a(th6, "bre", "grrd");
                }
                throw th5;
            }
        }
    }

    private byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArrF = f();
            if (bArrF != null && bArrF.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byte[] bArrA = o.a(bArrF);
                byteArrayOutputStream.write(u.a(bArrA.length));
                byteArrayOutputStream.write(bArrA);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    y.a(th, "bre", "gred");
                }
                return byteArray;
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                y.a(th2, "bre", "gred");
            }
            return byteArray2;
        } catch (Throwable th3) {
            try {
                y.a(th3, "bre", "gred");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    y.a(th4, "bre", "gred");
                }
                return new byte[]{0};
            } catch (Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th6) {
                    y.a(th6, "bre", "gred");
                }
                throw th5;
            }
        }
    }

    public abstract byte[] a_();

    @Override // com.loc.au
    public Map<String, String> b_() {
        String strF = k.f(this.a);
        String strA = m.a();
        String strA2 = m.a(this.a, strA, "key=" + strF);
        HashMap map = new HashMap();
        map.put(AuthHandler.d, strA);
        map.put("key", strF);
        map.put("scode", strA2);
        return map;
    }

    @Override // com.loc.au
    public final byte[] e() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(p());
            byteArrayOutputStream.write(q());
            byteArrayOutputStream.write(r());
            byteArrayOutputStream.write(s());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                y.a(th, "bre", "geb");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                y.a(th2, "bre", "geb");
                try {
                    return null;
                } catch (Throwable th3) {
                    return null;
                }
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    y.a(th4, "bre", "geb");
                }
            }
        }
    }

    public abstract byte[] f();

    public String g() {
        return "2.1";
    }

    public boolean j() {
        return true;
    }

    public String k() {
        return String.format("platform=Android&sdkversion=%s&product=%s", this.b.c(), this.b.a());
    }

    public boolean l() {
        return false;
    }
}
