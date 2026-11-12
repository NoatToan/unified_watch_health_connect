package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class pxi {
    private static void d(lmn lmnVar, String str) {
        HashMap map = new HashMap(4);
        map.put("pageId", str);
        lmnVar.d(map);
    }

    private static void c(lmn lmnVar, int i, String str, String str2) {
        HashMap map = new HashMap(4);
        map.put("event", Integer.valueOf(i));
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        map.put("moduleName", str2);
        lmnVar.e(map);
    }

    private static void c(lmn lmnVar, int i, String str, String str2, String str3) {
        HashMap map = new HashMap(6);
        map.put("event", Integer.valueOf(i));
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        map.put("moduleName", str2);
        map.put("entrance", str3);
        lmnVar.e(map);
    }

    private static void b(lmn lmnVar, int i, String str, String str2, String str3, String str4) {
        HashMap map = new HashMap(6);
        map.put("event", Integer.valueOf(i));
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        map.put("moduleName", str2);
        map.put("entrance", str3);
        map.put("value", str4);
        lmnVar.e(map);
    }

    private static void e(lmn lmnVar, int i, String str, String str2) {
        List<Map<String, Object>> listE = lmnVar.e();
        if (listE == null) {
            listE = new ArrayList<>();
        }
        HashMap map = new HashMap(4);
        map.put("action", Integer.valueOf(i));
        map.put("moduleName", str);
        map.put(FunctionSetBeanReader.BI_HAS_DATA_TYPE, str2);
        listE.add(map);
        lmnVar.d(listE);
    }

    public static String e(Map<String, Object> map) {
        if (map == null) {
            LogUtil.e("EsimBiAnalyticsUtil", "getCarrierName: simCardInfo is null");
            return "";
        }
        String strC = pxk.c(map);
        if (pxk.d(strC)) {
            return "china_mobile";
        }
        if (pxk.h(strC)) {
            return "china_unicom";
        }
        if (pxk.a(strC)) {
            return "china_telecom";
        }
        Object obj = map.get("spn");
        if (obj instanceof String) {
            return (String) obj;
        }
        pxe pxeVarA = pxh.a(map);
        if (pxeVarA == null) {
            return "";
        }
        return pxeVarA.e();
    }

    public static String d(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        List<Map<String, Object>> listB = pxk.b(context);
        for (int i = 0; i < listB.size(); i++) {
            Map<String, Object> map = listB.get(i);
            if (map != null) {
                Object obj = listB.get(i).get("imsi");
                if ((obj instanceof String) && obj.equals(str)) {
                    return e(map);
                }
            }
        }
        return "";
    }

    public static String e(String str) {
        if (Objects.equals(str, "com.cmic.heduohao")) {
            return "china_mobile";
        }
        if (Objects.equals(str, "com.sinovatech.unicom.ui")) {
            return "china_unicom";
        }
        if (Objects.equals(str, "com.ct.client")) {
            return "china_telecom";
        }
        return "";
    }

    public static String a(Context context, String str) {
        if (context == null) {
            LogUtil.j("EsimBiAnalyticsUtil", "context is null.");
            return "";
        }
        if (Objects.equals(str, context.getString(R.string.IDS_plugin_multi_esim_cmcc_not_support))) {
            return "china_mobile";
        }
        if (Objects.equals(str, context.getString(R.string.IDS_plugin_multi_esim_provider_cucc))) {
            return "china_unicom";
        }
        if (!Objects.equals(str, context.getString(R.string.IDS_plugin_multi_esim_ctcc_not_support))) {
            return "";
        }
        return "china_telecom";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    public static String c(String str) {
        str.hashCode();
        switch (str) {
            case "01":
                return "offline";
            case "02":
            case "07":
                return "online_jump_APP";
            case "03":
            case "04":
            case "05":
                return "online_ES";
            case "06":
                return "online_other";
            default:
                return "";
        }
    }

    public static String d(int i) {
        if (i == 1) {
            return "one_number_multisim";
        }
        if (i == 2) {
            return "stand_alone";
        }
        return "";
    }

    public static String j() {
        String str = pxk.d;
        if (Objects.equals(str, "ShareNumber")) {
            return "one_number_multisim";
        }
        if (Objects.equals(str, "DiffNumber")) {
            return "stand_alone";
        }
        return "";
    }

    public static void e() {
        lmn lmnVar = new lmn();
        d(lmnVar, "Device_0003");
        c(lmnVar, 1, "eSIM", "main_page");
        LogUtil.d("EsimBiAnalyticsUtil", "clickEsimManagementBiEvent: ", AnalyticsValue.DEVICE_GENERAL_SETTING_H1010001003.value(), ", ", lmnVar.toString());
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.DEVICE_GENERAL_SETTING_H1010001003.value(), lmnVar, 0);
    }

    public static void d() {
        lmn lmnVar = new lmn();
        d(lmnVar, "Device_esim_0001");
        c(lmnVar, 0, "m0", "main_page");
        LogUtil.d("EsimBiAnalyticsUtil", "enterEsimManagementActivatePageBiEvent: ", AnalyticsValue.ESIM_MANAGE_ACTIVATE_H10100210001.value(), ", ", lmnVar.toString());
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.ESIM_MANAGE_ACTIVATE_H10100210001.value(), lmnVar, 0);
    }

    public static void a(String str) {
        lmn lmnVar = new lmn();
        d(lmnVar, "Device_esim_0001");
        c(lmnVar, 1, str, "main_page");
        LogUtil.d("EsimBiAnalyticsUtil", "clickEsimManagementActivatePageBiEvent: ", AnalyticsValue.ESIM_MANAGE_ACTIVATE_H10100210001.value(), ", ", lmnVar.toString());
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.ESIM_MANAGE_ACTIVATE_H10100210001.value(), lmnVar, 0);
    }

    public static void a() {
        lmn lmnVar = new lmn();
        d(lmnVar, "Device_esim_0002");
        c(lmnVar, 0, "m0", "main_page");
        LogUtil.d("EsimBiAnalyticsUtil", "enterEsimManagementActivatedPageBiEvent: ", AnalyticsValue.ESIM_MANAGE_ACTIVATED_H10100210002.value(), ", ", lmnVar.toString());
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.ESIM_MANAGE_ACTIVATED_H10100210002.value(), lmnVar, 0);
    }

    public static void b(String str) {
        lmn lmnVar = new lmn();
        d(lmnVar, "Device_esim_0002");
        c(lmnVar, 1, str, "main_page");
        LogUtil.d("EsimBiAnalyticsUtil", "clickEsimManagementActivatedPageBiEvent: ", AnalyticsValue.ESIM_MANAGE_ACTIVATED_H10100210002.value(), ", ", lmnVar.toString());
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.ESIM_MANAGE_ACTIVATED_H10100210002.value(), lmnVar, 0);
    }

    public static void d(String str) {
        lmn lmnVar = new lmn();
        d(lmnVar, "Device_esim_0002");
        c(lmnVar, 1, str, "more_control");
        LogUtil.d("EsimBiAnalyticsUtil", "clickEsimManagementMoreControlBiEvent: ", AnalyticsValue.ESIM_MANAGE_ACTIVATED_H10100210002.value(), ", ", lmnVar.toString());
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.ESIM_MANAGE_ACTIVATED_H10100210002.value(), lmnVar, 0);
    }

    public static void c() {
        lmn lmnVar = new lmn();
        d(lmnVar, "Device_esim_0003");
        c(lmnVar, 0, "m0", "main_page", CommonUtil.bg() ? "e1" : "e2");
        e(lmnVar, 0, "main_page", "");
        LogUtil.d("EsimBiAnalyticsUtil", "enterChooseCarrierPageBiEvent: ", AnalyticsValue.ESIM_CHOOSE_CARRIER_H10100210003.value(), ", ", lmnVar.toString());
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.ESIM_CHOOSE_CARRIER_H10100210003.value(), lmnVar, 0);
    }

    public static void c(String str, String str2) {
        lmn lmnVar = new lmn();
        d(lmnVar, "Device_esim_0003");
        c(lmnVar, 1, str, "main_page", CommonUtil.bg() ? "e1" : "e2");
        e(lmnVar, 0, "main_page", str2);
        LogUtil.d("EsimBiAnalyticsUtil", "clickChooseCarrierBiEvent: ", AnalyticsValue.ESIM_CHOOSE_CARRIER_H10100210003.value(), ", ", lmnVar.toString());
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.ESIM_CHOOSE_CARRIER_H10100210003.value(), lmnVar, 0);
    }

    public static void b() {
        lmn lmnVar = new lmn();
        d(lmnVar, "Device_esim_0004");
        c(lmnVar, 0, "m0", "main_page");
        e(lmnVar, 0, "main_page", "");
        LogUtil.d("EsimBiAnalyticsUtil", "enterChooseOpenMethodPageBiEvent: ", AnalyticsValue.ESIM_CHOOSE_OPEN_METHOD_H10100210004.value(), ", ", lmnVar.toString());
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.ESIM_CHOOSE_OPEN_METHOD_H10100210004.value(), lmnVar, 0);
    }

    public static void e(String str, String str2) {
        lmn lmnVar = new lmn();
        d(lmnVar, "Device_esim_0004");
        c(lmnVar, 1, str, "main_page");
        e(lmnVar, 0, "main_page", str2);
        LogUtil.d("EsimBiAnalyticsUtil", "clickChooseOpenMethodBiEvent: ", AnalyticsValue.ESIM_CHOOSE_OPEN_METHOD_H10100210004.value(), ", ", lmnVar.toString());
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.ESIM_CHOOSE_OPEN_METHOD_H10100210004.value(), lmnVar, 0);
    }

    public static void b(String str, String str2, String str3, String str4) {
        lmn lmnVar = new lmn();
        d(lmnVar, "Device_esim_0005");
        b(lmnVar, 0, "m0", "main_page", str, "");
        e(lmnVar, 0, "carrier", str2);
        e(lmnVar, 0, "open_method", str3);
        e(lmnVar, 0, "sim_type", str4);
        LogUtil.d("EsimBiAnalyticsUtil", "enterOpenResultPageBiEvent: ", AnalyticsValue.ESIM_OPEN_RESULT_H10100210005.value(), ", ", lmnVar.toString());
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.ESIM_OPEN_RESULT_H10100210005.value(), lmnVar, 0);
    }

    public static void c(String str, String str2, String str3, String str4, String str5, String str6) {
        lmn lmnVar = new lmn();
        d(lmnVar, "Device_esim_0005");
        b(lmnVar, 1, str, "main_page", str2, str3);
        e(lmnVar, 0, "carrier", str4);
        e(lmnVar, 0, "open_method", str5);
        e(lmnVar, 0, "sim_type", str6);
        LogUtil.d("EsimBiAnalyticsUtil", "clickOpenResultBiEvent: ", AnalyticsValue.ESIM_OPEN_RESULT_H10100210005.value(), ", ", lmnVar.toString());
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.ESIM_OPEN_RESULT_H10100210005.value(), lmnVar, 0);
    }
}
