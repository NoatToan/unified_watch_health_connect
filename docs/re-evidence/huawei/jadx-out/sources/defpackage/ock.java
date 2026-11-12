package defpackage;

import android.content.Context;
import com.huawei.multisimsdk.cardpartmanager.simauth.SimAuthController;
import com.huawei.multisimsdk.multidevicemanager.common.AuthParam;

/* JADX INFO: loaded from: classes12.dex */
public class ock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f44123a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f44124c = "CardPartManager";
    private static final Object d = new Object();
    private static Context e;

    public static void e(Context context) {
        c(context, null);
    }

    public static void c(Context context, AuthParam authParam) {
        synchronized (d) {
            if (context != null) {
                try {
                    e = context.getApplicationContext();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (authParam != null) {
                f44123a = authParam.getSlotId();
                ocq.e(f44124c, "initCardPart slotId" + f44123a);
            }
        }
    }

    static String c() {
        obg obgVarE = obe.d().e(e, f44123a);
        if (obgVarE == null) {
            return null;
        }
        ocq.e(f44124c, "mCarrierConfigInfo.getCDMUrl()");
        return obgVarE.e();
    }

    public static String d() {
        obg obgVarE = obe.d().e(e, f44123a);
        if (obgVarE != null) {
            ocq.e(f44124c, "mCarrierConfigInfo.getESUrl()");
            return obgVarE.j();
        }
        return "";
    }

    public static String a() {
        obg obgVarE = obe.d().e(e, f44123a);
        if (obgVarE != null) {
            ocq.e(f44124c, "mCarrierConfigInfo.getBSFUrl()");
            return obgVarE.b();
        }
        return "";
    }

    public static String e() {
        obg obgVarE = obe.d().e(e, f44123a);
        if (obgVarE != null) {
            String strG = obgVarE.g();
            ocq.e(f44124c, "mCarrierConfigInfo.getSupportedProtocol is " + strG);
            return strG;
        }
        return "";
    }

    public static String b(String str, String str2) {
        String strB = "MSISDN".equals(str) ? ocm.c().b(e, str2) : null;
        if (strB == null) {
            ocq.e(f44124c, "simOperator is null");
            return null;
        }
        obg obgVarA = obl.a(e, strB);
        if (obgVarA != null) {
            return obgVarA.e();
        }
        return null;
    }

    static String d(String str) {
        return new SimAuthController(e).e(str);
    }

    public static void b() {
        f44123a = -1;
        e = null;
    }
}
