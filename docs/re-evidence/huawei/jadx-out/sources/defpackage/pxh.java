package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class pxh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<pxj> f45927a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<pxe> f45928c;

    public static boolean e() {
        File file = new File(pxk.b("simInfo_mapping.xml"));
        File file2 = new File(pxk.b("esim_open_method.xml"));
        if (!file.exists() || !file2.exists()) {
            return false;
        }
        LogUtil.a("SimMatchRuleUtils", "simInfoFile and openMethodFile exists");
        return true;
    }

    public static pxe a(Map<String, Object> map) {
        if (map == null) {
            LogUtil.j("SimMatchRuleUtils", "getEsimOpenMethod simCardInfo is null");
            return null;
        }
        String strD = d(map);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("SimMatchRuleUtils", "getEsimOpenMethod operatorKey is empty");
            return null;
        }
        List<pxe> listD = d();
        if (listD != null && listD.size() > 0) {
            for (pxe pxeVar : listD) {
                if (pxeVar.a().equals(strD)) {
                    return pxeVar;
                }
            }
        }
        return null;
    }

    private static String d(Map<String, Object> map) {
        List<pxj> listA = a();
        String strC = "";
        if (listA == null || listA.size() == 0) {
            LogUtil.j("SimMatchRuleUtils", "getRuleOperatorKey simInfoList is null or empty");
            return "";
        }
        String strD = c(map).d();
        for (int i = 0; i < listA.size(); i++) {
            pxj pxjVar = listA.get(i);
            if (d(pxjVar.d(), strD)) {
                if (pxjVar.b() == 1) {
                    String strC2 = pxjVar.c();
                    LogUtil.a("SimMatchRuleUtils", "getRuleOperatorKey is matched operatorKey = ", strC2);
                    return strC2;
                }
                if (TextUtils.isEmpty(strC)) {
                    strC = pxjVar.c();
                    LogUtil.a("SimMatchRuleUtils", "getRuleOperatorKey is matched first operatorKey = ", strC);
                }
            }
        }
        return strC;
    }

    private static boolean d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("SimMatchRuleUtils", "isEqualsMccMnc ruleMccMnc or cardMccMnc is empty");
            return false;
        }
        if (str.length() > 3 && str2.length() > 3) {
            try {
                int i = Integer.parseInt(str.substring(0, 3));
                int i2 = Integer.parseInt(str.substring(3));
                int i3 = Integer.parseInt(str2.substring(0, 3));
                int i4 = Integer.parseInt(str2.substring(3));
                if (i == i3 && i2 == i4) {
                    return true;
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("SimMatchRuleUtils", "isEqualsMccMnc NumberFormatException");
            }
        }
        return false;
    }

    private static pxj c(Map<String, Object> map) {
        String str;
        pxj pxjVar = new pxj();
        Object obj = map.get("mccmnc");
        if (!(obj instanceof String)) {
            str = "";
        } else {
            str = (String) obj;
        }
        pxjVar.d(str);
        return pxjVar;
    }

    public static List<pxe> d() {
        return f45928c;
    }

    public static void e(List<pxe> list) {
        f45928c = list;
    }

    public static List<pxj> a() {
        return f45927a;
    }

    public static void a(List<pxj> list) {
        f45927a = list;
    }
}
