package com.loc;

import android.text.TextUtils;
import com.amap.api.maps.AMapException;
import com.xiaomi.hm.health.Constant;
import java.net.Proxy;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class aq {
    public static int a = 0;
    public static String b = "";
    private static aq c;

    public interface a {
        URLConnection a();
    }

    public static aq a() {
        if (c == null) {
            c = new aq();
        }
        return c;
    }

    public static av a(au auVar, boolean z) throws j {
        av avVarA;
        byte[] bArr;
        int iA = as.a(auVar);
        try {
            avVarA = a(auVar, z, iA);
        } catch (j e) {
            if (!as.a(iA)) {
                throw e;
            }
            avVarA = null;
        }
        if ((avVarA != null && (bArr = avVarA.a) != null && bArr.length > 0) || !as.a(iA)) {
            return avVarA;
        }
        try {
            return a(auVar, z, 3);
        } catch (j e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    public static av a(au auVar, boolean z, int i) throws j {
        byte[] bArrA;
        try {
            if (auVar == null) {
                throw new j("requeust is null");
            }
            if (auVar.c() == null || "".equals(auVar.c())) {
                throw new j("request url is empty");
            }
            Proxy proxy = auVar.e;
            if (proxy == null) {
                proxy = null;
            }
            as asVar = new as(auVar.c, auVar.d, proxy, z);
            String strM = auVar.m();
            String strN = auVar.n();
            boolean zO = auVar.o();
            String strH = auVar.h();
            Map<String, String> mapB = auVar.b();
            byte[] bArrE = auVar.e();
            if (bArrE == null || bArrE.length == 0) {
                String strA = as.a(auVar.b_());
                if (TextUtils.isEmpty(strA)) {
                    bArrA = bArrE;
                } else {
                    bArrA = u.a(strA);
                }
            } else {
                bArrA = bArrE;
            }
            return asVar.a(strM, strN, zO, strH, mapB, bArrA, i);
        } catch (j e) {
            throw e;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new j(AMapException.ERROR_UNKNOWN);
        }
    }

    public static byte[] a(au auVar) throws j {
        try {
            av avVarA = a(auVar, true);
            if (avVarA != null) {
                return avVarA.a;
            }
            return null;
        } catch (j e) {
            throw e;
        } catch (Throwable unused) {
            throw new j(AMapException.ERROR_UNKNOWN);
        }
    }

    public static byte[] b(au auVar) throws j {
        try {
            av avVarA = a(auVar, false);
            if (avVarA != null) {
                return avVarA.a;
            }
            return null;
        } catch (j e) {
            throw e;
        } catch (Throwable th) {
            y.a(th, "bm", com.alipay.sdk.m.o.a.a);
            throw new j(AMapException.ERROR_UNKNOWN);
        }
    }

    public static av c(au auVar) throws j {
        try {
            av avVarA = a(auVar, false);
            if (avVarA != null) {
                return avVarA;
            }
            return null;
        } catch (j e) {
            throw e;
        } catch (Throwable th) {
            y.a(th, "bm", Constant.PAI_KEY_MEDIUM_ZONE_PAI);
            throw new j(AMapException.ERROR_UNKNOWN);
        }
    }
}
