package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.wear.R;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xot {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile xot f53247b;
    private static final byte[] e = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, List<xos>> f53248a = new HashMap();

    private xot() {
    }

    public static xot d() {
        if (f53247b == null) {
            synchronized (e) {
                if (f53247b == null) {
                    f53247b = new xot();
                }
            }
        }
        return f53247b;
    }

    public static String e(Context context, String str, String str2) {
        String canonicalName;
        String strD = xox.d(context).d(str, str2);
        if (TextUtils.isEmpty(strD)) {
            xnd.b("AddressNameMgr", "getGrsUrlSync(),check empty", false);
            if (!"CN".equals(str2)) {
                xnd.b("AddressNameMgr", "getGrsUrlSync(),oversea grsUrl is null", false);
                return " ";
            }
            strD = xox.d(context).b(str2, str);
            if (TextUtils.isEmpty(strD)) {
                xnd.b("AddressNameMgr", "getGrsUrlSync(),getUrlFromLocal is null", false);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("log_time", new Date(System.currentTimeMillis()).toString());
            if (context.getClass().getCanonicalName() == null) {
                canonicalName = context.getClass().getName();
            } else {
                canonicalName = context.getClass().getCanonicalName();
            }
            linkedHashMap.put("event_result_des", canonicalName);
            linkedHashMap.put("log", xni.e());
            linkedHashMap.put(HeaderType.EVENT_ID, "cfg.url");
            linkedHashMap.put("local", str2);
            if (TextUtils.equals(str, "TRANSPORTATIONCARD")) {
                linkedHashMap.put("server_name", "TRANSPORTATIONCARD");
            } else if (TextUtils.equals(str, "BANKCARD")) {
                linkedHashMap.put("server_name", "BANKCARD");
            } else if (TextUtils.equals(str, "VIRTUALCARD")) {
                linkedHashMap.put("server_name", "VIRTUALCARD");
            } else if (TextUtils.equals(str, "PAYCHANGE")) {
                linkedHashMap.put("server_name", "PAYCHANGE");
            } else if (TextUtils.equals(str, "HUAWEICARD")) {
                linkedHashMap.put("server_name", "HUAWEICARD");
            } else if (TextUtils.equals(str, "WALLET")) {
                linkedHashMap.put("server_name", "WALLET");
            } else if (TextUtils.equals(str, "WALLETPASSTRUST")) {
                linkedHashMap.put("server_name", "WALLETPASSTRUST");
            } else {
                linkedHashMap.put("server_name", str);
                xnd.b("AddressNameMgr", "getGrsUrlSync,not traffic,bank and wallet condition", false);
            }
            xob.d(0, "cfg.url", linkedHashMap);
        }
        return strD;
    }

    public void a(Context context) {
        new xpb().a(context, this.f53248a, R.xml.server_address_oversea);
    }

    public String d(String str, String str2, String str3, String str4, Context context) {
        if (TextUtils.equals(str2, "TransportationCard")) {
            str = a(str, "TransportationCard", null);
        } else if (TextUtils.equals(str2, "BankCard")) {
            str = a(str, "BankCard", null);
        } else if (TextUtils.equals(str2, "WalletPass")) {
            str = a(str, "WalletPass", null);
        } else if (TextUtils.equals(str2, "VirtualCard")) {
            str = a(str, "VirtualCard", null);
        } else if (TextUtils.equals(str2, "PayChange")) {
            str = a(str, "PayChange", null);
        } else if (TextUtils.equals(str2, "HuaweiCard")) {
            str = a(str, "HuaweiCard", null);
        } else if (TextUtils.equals(str2, "Wallet")) {
            str = a(str, "Wallet", null);
        } else if (TextUtils.equals(str2, "WalletTrusteeship")) {
            str = a(str, "WalletTrusteeship", null);
        }
        xnd.b("AddressNameMgr", "getAddress success = " + str, false);
        return e(context, str, str4) + "?clientVersion=" + str3;
    }

    public String a(String str, String str2, Map<String, String> map) {
        String strD;
        Map<String, List<xos>> mapB = b();
        if (mapB.containsKey(str2)) {
            strD = d(str, map, mapB.get(str2));
            xnd.b("AddressNameMgr", "getAddressName= " + strD, false);
        } else {
            strD = null;
        }
        if (strD == null) {
            strD = d(str, map, mapB.get("Default"));
            xnd.b("AddressNameMgr", "getAddressName Default = " + strD, false);
        }
        if (strD == null) {
            return str;
        }
        xnd.b("AddressNameMgr", "getAddressName serverAddressName = " + strD, false);
        return strD;
    }

    private String d(String str, Map<String, String> map, List<xos> list) {
        if (list == null || str == null) {
            return " ";
        }
        for (xos xosVar : list) {
            if (str.equalsIgnoreCase(xosVar.d()) && xosVar.d(map)) {
                xnd.b("AddressNameMgr", "getServerAddressName = " + xosVar.b(), false);
                return xosVar.b();
            }
        }
        return " ";
    }

    private Map<String, List<xos>> b() {
        return this.f53248a;
    }
}
