package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes20.dex */
public class xmy {
    public static boolean e(xmt xmtVar, String str) {
        if (str.equals("over_sea_vip_card") && !b(xmtVar)) {
            xnd.d("QuerySupportedCard", "isSupportMembershipCard area not supported");
            return false;
        }
        xnd.d("QuerySupportedCard", "updateIssuerControlCache");
        if (!e()) {
            xnd.d("QuerySupportedCard", "updateIssuerControlCache local cache valid");
            return a(d(), str);
        }
        if (!xpf.c()) {
            return a(d(), str);
        }
        xod xodVarC = c(xmtVar);
        xpu xpuVar = new xpu(xml.d(), d(xmtVar));
        xodVarC.e(true);
        xnq xnqVarProcessTask = xpuVar.processTask(xodVarC);
        xnd.d("QuerySupportedCard", "updateIssuerControlCache query server returnCode=" + xnqVarProcessTask.f53201b);
        if (xnqVarProcessTask.f53201b != 0) {
            return false;
        }
        d(xnqVarProcessTask.e());
        return a(xnqVarProcessTask.e(), str);
    }

    public static void a() {
        xnv xnvVarE = xnv.e(xml.d());
        String str = new String[]{"VirtualCard"}[0];
        if (xnvVarE.e("NEW_ISSUER_CTRL_SUB_SDK" + str)) {
            xnvVarE.c("NEW_ISSUER_CTRL_SUB_SDK" + str);
        }
        if (xnvVarE.e("NEW_ISSUER_CTRL_QUERY_TIME_SUB_SDK" + str)) {
            xnvVarE.c("NEW_ISSUER_CTRL_QUERY_TIME_SUB_SDK" + str);
        }
    }

    private static boolean a(String str, String str2) {
        if (str2.equals("over_sea_vip_card")) {
            return b(str);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str3 : str.split("\\|")) {
            if (!TextUtils.isEmpty(str3) && str3.contains("#")) {
                String[] strArrSplit = str3.split("#");
                if (str2.equals(strArrSplit[0])) {
                    boolean zEquals = String.valueOf(0).equals(strArrSplit[1]);
                    xnd.d("QuerySupportedCard", "isSupportCard result=" + zEquals + ", issuerId=" + str2 + ", flag=" + strArrSplit[1]);
                    return zEquals;
                }
            }
        }
        return false;
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        for (String str2 : str.split("\\|")) {
            if (!TextUtils.isEmpty(str2) && str2.contains("#")) {
                String[] strArrSplit = str2.split("#");
                if ("over_sea_vip_card".equals(strArrSplit[0])) {
                    xnd.d("QuerySupportedCard", "checkOverseaVIPIssuerAndFlag flag=" + strArrSplit[1]);
                    return !String.valueOf(0).equals(strArrSplit[1]);
                }
            }
        }
        return true;
    }

    private static boolean c(long j, long j2) {
        return Math.abs(j2 - j) >= 3600000;
    }

    private static xod c(xmt xmtVar) {
        xod xodVar = new xod();
        xodVar.g(xmtVar.b());
        xodVar.i(xmtVar.h());
        xodVar.j(xmtVar.f());
        xodVar.a(xmtVar.n());
        xodVar.d("1");
        xodVar.f("1");
        xodVar.b(xmtVar.e());
        xodVar.e(xmtVar.c());
        return xodVar;
    }

    private static boolean e() {
        if (c(xnv.e(xml.d()).c("NEW_ISSUER_CTRL_QUERY_TIME_SUB_SDKVirtualCard", (Long) 0L).longValue(), System.currentTimeMillis())) {
            return true;
        }
        if (TextUtils.isEmpty(xnv.e(xml.d()).b("NEW_ISSUER_CTRL_SUB_SDKVirtualCard", ""))) {
            xnd.d("QuerySupportedCard", "isNeedQueryServer cache invalid serverModule");
            return true;
        }
        return TextUtils.isEmpty(d());
    }

    private static String d(xmt xmtVar) {
        return xot.e(xml.d(), "VIRTUALCARD", xmtVar.e());
    }

    private static void d(String str) {
        xnd.d("QuerySupportedCard", "saveCache issuerAndFlag=" + str);
        xnv.e(xml.d()).e("NEW_ISSUER_CTRL_SUB_SDKVirtualCard", str);
        xnv.e(xml.d()).a("NEW_ISSUER_CTRL_QUERY_TIME_SUB_SDKVirtualCard", Long.valueOf(System.currentTimeMillis()));
    }

    private static String d() {
        return xnv.e(xml.d()).b("NEW_ISSUER_CTRL_SUB_SDKVirtualCard", "");
    }

    private static boolean b(xmt xmtVar) {
        return !"CN".equals(xmtVar.e());
    }
}
