package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.datatype.BaseDeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.DevicePerfPurchaseInfo;
import com.huawei.trade.datatype.OtherServiceInfo;
import com.huawei.trade.datatype.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class faw {
    public static Map<String, Object> e(String str) {
        HashMap map = new HashMap();
        map.put("sessionId", Long.valueOf(System.currentTimeMillis()));
        map.put("pageId", str);
        return map;
    }

    public static void e(BaseDeviceBenefitInfo baseDeviceBenefitInfo, int i, int i2) {
        if (baseDeviceBenefitInfo == null) {
            return;
        }
        int iA = a(baseDeviceBenefitInfo);
        if (iA == -1) {
            LogUtil.e("BenefitRedemptionBiUtil", "reportExposure benefitType error");
            return;
        }
        String strB = b(iA, i2);
        if (TextUtils.isEmpty(strB)) {
            LogUtil.e("BenefitRedemptionBiUtil", "reportExposure element error");
            return;
        }
        List<OtherServiceInfo> listD = d(baseDeviceBenefitInfo);
        Map<String, Object> mapD = d(0, strB, a(iA, e(baseDeviceBenefitInfo), baseDeviceBenefitInfo), i, a(baseDeviceBenefitInfo, "inbox"));
        Map<String, Object> mapE = e(listD);
        ArrayList arrayList = new ArrayList();
        arrayList.add(mapE);
        a(a(mapD, arrayList), AnalyticsValue.INBOX_RIGHTS_ACTIVATION_CLAIMING_AND_EXPOSURE.value());
    }

    public static void d(BaseDeviceBenefitInfo baseDeviceBenefitInfo, int i, int i2) {
        if (baseDeviceBenefitInfo == null) {
            return;
        }
        int iA = a(baseDeviceBenefitInfo);
        if (iA == -1) {
            LogUtil.e("BenefitRedemptionBiUtil", "reportActivatedSuccessEvent benefitType error");
            return;
        }
        String strB = b(iA, i2);
        if (TextUtils.isEmpty(strB)) {
            LogUtil.e("BenefitRedemptionBiUtil", "reportActivatedSuccessEvent element error");
        } else {
            a(a(d(1, strB, a(iA, e(baseDeviceBenefitInfo), baseDeviceBenefitInfo), i, a(baseDeviceBenefitInfo, "inbox")), (List<Map<String, Object>>) null), AnalyticsValue.INBOX_RIGHTS_ACTIVATION_ACTIVATED_SUCCESS.value());
        }
    }

    public static void b(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        if (baseDeviceBenefitInfo == null) {
            return;
        }
        if (a(baseDeviceBenefitInfo) != 3) {
            LogUtil.a("BenefitRedemptionBiUtil", "reportVipWorkSuccessEvent benefitType is not purchase");
            return;
        }
        String strF = f(baseDeviceBenefitInfo);
        if (TextUtils.isEmpty(strF)) {
            LogUtil.a("BenefitRedemptionBiUtil", "reportVipWorkSuccessEvent purchaseType is empty");
            return;
        }
        String strA = a(baseDeviceBenefitInfo, "");
        HashMap map = new HashMap();
        map.put("event", 0);
        map.put("type", strF);
        map.put("ActivationMode", 6);
        map.put("from", 5);
        map.put("payResourceType", "会员活动");
        map.put("packageSource", "会员");
        map.put("name", "会员活动");
        map.put("bundledDevice", strA);
        map.put("moduleName", "main_page");
        a(a(map, (List<Map<String, Object>>) null), AnalyticsValue.VIP_PAY_SUCCESS_EVENT.value());
    }

    public static void a(BaseDeviceBenefitInfo baseDeviceBenefitInfo, String str, int i) {
        if (baseDeviceBenefitInfo == null || TextUtils.isEmpty(str)) {
            return;
        }
        int iA = a(baseDeviceBenefitInfo);
        if (iA == -1) {
            LogUtil.e("BenefitRedemptionBiUtil", "reportClickEvent benefitType error");
            return;
        }
        List<OtherServiceInfo> listD = d(baseDeviceBenefitInfo);
        Map<String, Object> mapD = d(1, str, a(iA, e(baseDeviceBenefitInfo), baseDeviceBenefitInfo), i, a(baseDeviceBenefitInfo, "ufeninbox"));
        Map<String, Object> mapE = e(listD);
        ArrayList arrayList = new ArrayList();
        arrayList.add(mapE);
        a(a(mapD, arrayList), AnalyticsValue.INBOX_RIGHTS_ACTIVATION_CLAIMING_AND_EXPOSURE.value());
    }

    public static void c(BaseDeviceBenefitInfo baseDeviceBenefitInfo, String str, int i) {
        if (baseDeviceBenefitInfo == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!a(str)) {
            LogUtil.e("BenefitRedemptionBiUtil", "reportAgreementClickEvent agreementElement is not effective agreement , agreementElement is ", str);
            return;
        }
        List<OtherServiceInfo> listD = d(baseDeviceBenefitInfo);
        String strA = a(baseDeviceBenefitInfo, "ufeninbox");
        HashMap map = new HashMap();
        map.put("event", 1);
        map.put(FunctionSetBeanReader.BI_ELEMENT, "m6");
        map.put("value", str);
        map.put("from", Integer.valueOf(i));
        map.put("bundledDevice", strA);
        map.put("moduleName", "main_page");
        Map<String, Object> mapE = e(listD);
        ArrayList arrayList = new ArrayList();
        arrayList.add(mapE);
        a(a(map, arrayList), AnalyticsValue.INBOX_RIGHTS_ACTIVATION_CLAIMING_AND_EXPOSURE.value());
    }

    private static Map<String, Object> d(int i, String str, String str2, int i2, String str3) {
        HashMap map = new HashMap();
        map.put("event", Integer.valueOf(i));
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        map.put("value", str2);
        map.put("from", Integer.valueOf(i2));
        map.put("bundledDevice", str3);
        map.put("moduleName", "main_page");
        return map;
    }

    private static Map<String, Object> e(List<OtherServiceInfo> list) {
        HashMap map = new HashMap();
        map.put("action", 0);
        map.put("moduleName", "additionalBenefit");
        map.put(FunctionSetBeanReader.BI_HAS_DATA, Boolean.valueOf(njy.b(list)));
        if (njy.b(list)) {
            map.put(FunctionSetBeanReader.BI_HAS_DATA_TYPE, c(list));
        }
        return map;
    }

    private static lmn a(Map<String, Object> map, List<Map<String, Object>> list) {
        lmn lmnVar = new lmn();
        lmnVar.e(map);
        lmnVar.d(e("Inboxactivepage"));
        if (list != null) {
            lmnVar.d(list);
        }
        return lmnVar;
    }

    private static String a(BaseDeviceBenefitInfo baseDeviceBenefitInfo, String str) {
        if (baseDeviceBenefitInfo != null) {
            String deviceName = baseDeviceBenefitInfo.getDeviceName();
            if (!TextUtils.isEmpty(deviceName)) {
                return deviceName;
            }
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static String f(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        if (baseDeviceBenefitInfo == null) {
            return "";
        }
        if (a(baseDeviceBenefitInfo) != 3) {
            LogUtil.a("BenefitRedemptionBiUtil", "getPurchaseType benefitType is not purchase");
            return "";
        }
        DevicePerfPurchaseInfo devicePerfPurchaseInfo = (DevicePerfPurchaseInfo) baseDeviceBenefitInfo;
        if (devicePerfPurchaseInfo.getProductInfo() == null) {
            LogUtil.e("BenefitRedemptionBiUtil", "getPurchaseType Purchase get product is null");
            return "";
        }
        String strE = e(baseDeviceBenefitInfo);
        LogUtil.a("BenefitRedemptionBiUtil", "getPurchaseType benefitDuration is ", strE);
        byte b2 = 0;
        if (devicePerfPurchaseInfo.getProductInfo().getPurchasePolicy() != Product.SUBSCRIPTION_PURCHASE_FLAG) {
            strE.hashCode();
            switch (strE.hashCode()) {
                case 78476:
                    if (!strE.equals(Product.MONTH_DURATION_FLAG)) {
                        b2 = -1;
                    }
                    break;
                case 78486:
                    b2 = !strE.equals("P1W") ? (byte) -1 : (byte) 1;
                    break;
                case 78488:
                    b2 = !strE.equals(Product.YEAR_DURATION_FLAG) ? (byte) -1 : (byte) 2;
                    break;
                case 78538:
                    b2 = !strE.equals(Product.SEASON_DURATION_FLAG) ? (byte) -1 : (byte) 3;
                    break;
                case 78653:
                    b2 = !strE.equals("P7D") ? (byte) -1 : (byte) 4;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                return "1";
            }
            if (b2 == 1) {
                return "7";
            }
            if (b2 == 2) {
                return "3";
            }
            if (b2 == 3) {
                return "2";
            }
            if (b2 != 4) {
                return "";
            }
            return "7";
        }
        strE.hashCode();
        int iHashCode = strE.hashCode();
        if (iHashCode != 78476) {
            if (iHashCode != 78488) {
                if (iHashCode == 78538 && strE.equals(Product.SEASON_DURATION_FLAG)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (strE.equals(Product.YEAR_DURATION_FLAG)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (!strE.equals(Product.MONTH_DURATION_FLAG)) {
            b2 = -1;
        }
        if (b2 == 0) {
            return "4";
        }
        if (b2 == 1) {
            return "6";
        }
        if (b2 != 2) {
            return "";
        }
        return "5";
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals("member_services", str) || TextUtils.equals("auto_renewal", str) || TextUtils.equals("pingan_services", str);
    }

    private static void a(lmn lmnVar, String str) {
        if (lmnVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        lmf.d().a(BaseApplication.b(), str, lmnVar, 0);
    }

    private static String e(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        if (baseDeviceBenefitInfo == null) {
            return "";
        }
        if (baseDeviceBenefitInfo instanceof DeviceInboxInfo) {
            return irx.e((DeviceInboxInfo) baseDeviceBenefitInfo);
        }
        if (!(baseDeviceBenefitInfo instanceof DevicePerfPurchaseInfo)) {
            return "";
        }
        return irx.d((DevicePerfPurchaseInfo) baseDeviceBenefitInfo);
    }

    private static List<OtherServiceInfo> d(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        ArrayList arrayList = new ArrayList();
        if (baseDeviceBenefitInfo != null) {
            if (baseDeviceBenefitInfo instanceof DeviceInboxInfo) {
                return ((DeviceInboxInfo) baseDeviceBenefitInfo).getOtherServiceList();
            }
            if (baseDeviceBenefitInfo instanceof DevicePerfPurchaseInfo) {
                return ((DevicePerfPurchaseInfo) baseDeviceBenefitInfo).getOtherServiceList();
            }
        }
        return arrayList;
    }

    private static String c(List<OtherServiceInfo> list) {
        if (njy.e(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            int serviceType = list.get(i).getServiceType();
            if (i == 0) {
                sb.append(serviceType);
            } else {
                sb.append(",");
                sb.append(serviceType);
            }
        }
        return sb.toString();
    }

    private static int a(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        if (baseDeviceBenefitInfo == null) {
            return -1;
        }
        if (baseDeviceBenefitInfo instanceof DeviceInboxInfo) {
            if (baseDeviceBenefitInfo.getBenefitType() == 1) {
                return 1;
            }
            if (baseDeviceBenefitInfo.getBenefitType() == 2) {
                return 2;
            }
            LogUtil.e("BenefitRedemptionBiUtil", "getBenefitType inbox type error ", Integer.valueOf(baseDeviceBenefitInfo.getBenefitType()));
            return -1;
        }
        if (baseDeviceBenefitInfo instanceof DevicePerfPurchaseInfo) {
            return 3;
        }
        LogUtil.e("BenefitRedemptionBiUtil", "getBenefitType benefitInfo type error");
        return -1;
    }

    private static String b(int i, int i2) {
        if (i == 1) {
            if (i2 == 1) {
                return "membership_Training_plan_inbox_package";
            }
            return "membership_inbox_package";
        }
        if (i == 2) {
            return "guardian_service_inbox_package";
        }
        if (i == 3) {
            return "membership_benefit_package";
        }
        LogUtil.e("BenefitRedemptionBiUtil", "getBenefitTypeEnum benefitType is not an ideal type ");
        return null;
    }

    private static String a(int i, String str, BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        if (baseDeviceBenefitInfo == null || TextUtils.isEmpty(str)) {
            return "";
        }
        if (i == 1) {
            if (TextUtils.equals(str, "P3D")) {
                return "3days_membership";
            }
            if (TextUtils.equals(str, Product.MONTH_DURATION_FLAG)) {
                return "monthly_card";
            }
            if (TextUtils.equals(str, Product.YEAR_DURATION_FLAG)) {
                return "annual_card";
            }
            if (TextUtils.equals(str, Product.SEASON_DURATION_FLAG)) {
                return "season_card";
            }
        }
        if (i == 2) {
            if (TextUtils.equals(str, "P14D") || TextUtils.equals(str, "P2W")) {
                return "14days_experience";
            }
            if (TextUtils.equals(str, Product.YEAR_DURATION_FLAG)) {
                return "guardian_annual_card";
            }
        }
        if (i == 3) {
            if (j(baseDeviceBenefitInfo)) {
                return "phone_benefit";
            }
            return "wearable_benefit";
        }
        LogUtil.e("BenefitRedemptionBiUtil", "getValueEnum benefitType is not an ideal type ");
        return "";
    }

    private static boolean j(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        if (baseDeviceBenefitInfo == null) {
            return false;
        }
        return TextUtils.equals(qhu.c(BaseApplication.b()), baseDeviceBenefitInfo.getDeviceSn());
    }

    public static String c(BaseDeviceBenefitInfo baseDeviceBenefitInfo) {
        if (baseDeviceBenefitInfo == null) {
            return "";
        }
        if (baseDeviceBenefitInfo instanceof DeviceInboxInfo) {
            return "m2";
        }
        if (!(baseDeviceBenefitInfo instanceof DevicePerfPurchaseInfo)) {
            return "";
        }
        return "m4";
    }
}
