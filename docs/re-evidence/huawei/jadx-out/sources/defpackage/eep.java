package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class eep {
    public static String e(edl edlVar, int i, DeviceInfo deviceInfo) {
        String strA = "";
        if (edlVar == null) {
            LogUtil.j("HwCloudDeviceInfoUtil", "ezPluginInfo is null.");
            return "";
        }
        edz edzVarI = edlVar.i();
        if (edzVarI != null) {
            LogUtil.a("HwCloudDeviceInfoUtil", "imageType:", Integer.valueOf(i));
            strA = a(edzVarI, i, deviceInfo);
        }
        LogUtil.a("HwCloudDeviceInfoUtil", "imageName:", strA);
        return strA;
    }

    public static String a(edl edlVar, String str, DeviceInfo deviceInfo) {
        if (edlVar == null || str == null || deviceInfo == null) {
            LogUtil.j("HwCloudDeviceInfoUtil", "getMappingWearHomeDeviceBackground descriptionInfo or styleType or deviceInfo is null.");
            return null;
        }
        edz edzVarI = edlVar.i();
        if (edzVarI == null || deviceInfo.getHiLinkDeviceId() == null || deviceInfo.getDeviceModel() == null) {
            LogUtil.j("HwCloudDeviceInfoUtil", "getMappingWearHomeDeviceBackground wearDeviceInfo or deviceInfo deviceKey is null.");
            return null;
        }
        String strConcat = deviceInfo.getHiLinkDeviceId().concat("_").concat(deviceInfo.getDeviceModel());
        Map<String, Map<String, String>> mapBm = edzVarI.bm();
        if (CollectionUtils.c(mapBm)) {
            LogUtil.j("HwCloudDeviceInfoUtil", "getMappingWearHomeDeviceBackground productWearHomeBackgroundMap is empty.");
            return null;
        }
        Map<String, String> value = mapBm.get(strConcat);
        if (value == null) {
            for (Map.Entry<String, Map<String, String>> entry : mapBm.entrySet()) {
                if (entry.getKey().contains(deviceInfo.getHiLinkDeviceId()) && entry.getKey().contains(deviceInfo.getDeviceModel())) {
                    value = entry.getValue();
                    break;
                }
            }
        }
        if (value == null) {
            LogUtil.j("HwCloudDeviceInfoUtil", "getMappingWearHomeDeviceBackground deviceWearHomeBackgroundMap is null.");
            return null;
        }
        return value.get(str);
    }

    public static ArrayList<String> b(edl edlVar, int i) {
        if (edlVar == null) {
            LogUtil.j("HwCloudDeviceInfoUtil", "ezPluginInfo is null.");
            return null;
        }
        edz edzVarI = edlVar.i();
        if (edzVarI != null) {
            LogUtil.a("HwCloudDeviceInfoUtil", "imageType:", Integer.valueOf(i));
            if (i == 5) {
                return edzVarI.an();
            }
            if (i != 6) {
                LogUtil.j("HwCloudDeviceInfoUtil", "imageList is null");
            } else {
                return edzVarI.al();
            }
        }
        return null;
    }

    public static ArrayList<String> b(edl edlVar, String str, String str2) {
        ArrayList<edr> arrayListF;
        LogUtil.a("HwCloudDeviceInfoUtil", "enter getGuideTitleList");
        ArrayList<String> arrayList = new ArrayList<>();
        new ArrayList();
        if (str.equals("xiao_yi_guide_data")) {
            arrayListF = d(edlVar, str2);
        } else {
            arrayListF = f(edlVar);
        }
        if (arrayListF != null && !arrayListF.isEmpty()) {
            for (int i = 0; i < arrayListF.size(); i++) {
                edr edrVar = arrayListF.get(i);
                if (edrVar != null) {
                    arrayList.add(edrVar.c());
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<String> a(edl edlVar, String str, String str2) {
        ArrayList<edr> arrayListF;
        LogUtil.a("HwCloudDeviceInfoUtil", "enter getGuideDescriptionList.");
        ArrayList<String> arrayList = new ArrayList<>();
        new ArrayList();
        if (str.equals("xiao_yi_guide_data")) {
            arrayListF = d(edlVar, str2);
        } else {
            arrayListF = f(edlVar);
        }
        if (arrayListF == null || arrayListF.isEmpty()) {
            LogUtil.a("HwCloudDeviceInfoUtil", "this device don't support user guide");
            return arrayList;
        }
        for (int i = 0; i < arrayListF.size(); i++) {
            edr edrVar = arrayListF.get(i);
            if (edrVar.d() != null) {
                arrayList.add(edrVar.d());
            }
        }
        if (arrayList.size() == arrayListF.size()) {
            return arrayList;
        }
        LogUtil.a("HwCloudDeviceInfoUtil", "getGuideDescriptionList is null");
        return new ArrayList<>();
    }

    public static List<List<String>> d(edl edlVar) {
        LogUtil.a("HwCloudDeviceInfoUtil", "enter getGuideDescriptionList.");
        ArrayList arrayList = new ArrayList();
        ArrayList<edr> arrayListF = f(edlVar);
        if (arrayListF == null || arrayListF.isEmpty()) {
            LogUtil.j("HwCloudDeviceInfoUtil", "deviceUserGuideBeanList is null");
            return arrayList;
        }
        for (int i = 0; i < arrayListF.size(); i++) {
            edr edrVar = arrayListF.get(i);
            if (edrVar.e() == null || edrVar.e().isEmpty()) {
                LogUtil.j("HwCloudDeviceInfoUtil", "descriptionList is null");
            } else {
                arrayList.add(edrVar.e());
            }
        }
        if (!arrayList.isEmpty() && arrayList.size() == arrayListF.size()) {
            return arrayList;
        }
        LogUtil.j("HwCloudDeviceInfoUtil", "getGuideDescriptionList is null or substandard");
        return new ArrayList();
    }

    public static List<List<String>> d(edl edlVar, String str, String str2) {
        ArrayList<edr> arrayListF;
        LogUtil.a("HwCloudDeviceInfoUtil", "enter getGuideImageList.");
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        if (str.equals("xiao_yi_guide_data")) {
            arrayListF = d(edlVar, str2);
        } else {
            arrayListF = f(edlVar);
        }
        if (arrayListF != null && !arrayListF.isEmpty()) {
            for (int i = 0; i < arrayListF.size(); i++) {
                edr edrVar = arrayListF.get(i);
                if (edrVar.a() == null || edrVar.a().isEmpty()) {
                    LogUtil.a("HwCloudDeviceInfoUtil", "imageList is null");
                } else {
                    arrayList.add(edrVar.a());
                }
            }
            if (arrayList.isEmpty() || arrayList.size() != arrayListF.size()) {
                LogUtil.a("HwCloudDeviceInfoUtil", "guideImageNameList is null or substandard");
                return new ArrayList();
            }
        }
        return arrayList;
    }

    public static boolean c(edl edlVar) {
        LogUtil.a("HwCloudDeviceInfoUtil", "enter isShowGuidePage");
        return (f(edlVar).isEmpty() && b(edlVar).isEmpty()) ? false : true;
    }

    private static ArrayList<edr> f(edl edlVar) {
        if (edlVar == null) {
            LogUtil.a("HwCloudDeviceInfoUtil", "ezPluginInfo is null");
            return new ArrayList<>();
        }
        edz edzVarI = edlVar.i();
        if (edzVarI == null) {
            LogUtil.a("HwCloudDeviceInfoUtil", "getGuideDataList exPluginInfoForWear is null");
            return new ArrayList<>();
        }
        ArrayList<edr> arrayListAp = edzVarI.ap();
        if (arrayListAp != null && !arrayListAp.isEmpty()) {
            return arrayListAp;
        }
        LogUtil.a("HwCloudDeviceInfoUtil", "guideDataList is null");
        return new ArrayList<>();
    }

    private static ArrayList<edr> b(edl edlVar) {
        if (edlVar == null) {
            LogUtil.a("HwCloudDeviceInfoUtil", "ezPluginInfo is null");
            return new ArrayList<>();
        }
        edz edzVarI = edlVar.i();
        if (edzVarI == null) {
            LogUtil.a("HwCloudDeviceInfoUtil", "getDesignGuideDataList exPluginInfoForWear is null");
            return new ArrayList<>();
        }
        ArrayList<edr> arrayListZ = edzVarI.z();
        if (arrayListZ != null && !arrayListZ.isEmpty()) {
            return arrayListZ;
        }
        LogUtil.a("HwCloudDeviceInfoUtil", "getDesignGuideDataList is null");
        return new ArrayList<>();
    }

    private static ArrayList<edr> d(edl edlVar, String str) {
        if (edlVar == null) {
            LogUtil.a("HwCloudDeviceInfoUtil", "ezPluginInfo is null");
            return new ArrayList<>();
        }
        edz edzVarI = edlVar.i();
        if (edzVarI == null) {
            LogUtil.a("HwCloudDeviceInfoUtil", "getXiaoYiGuideDataList exPluginInfoForWear is null");
            return new ArrayList<>();
        }
        ArrayList<edr> arrayListBt = edzVarI.bt();
        Iterator<edr> it = arrayListBt.iterator();
        while (it.hasNext()) {
            edr next = it.next();
            if (!TextUtils.isEmpty(str) && !str.equals(next.b())) {
                it.remove();
            }
        }
        if (arrayListBt != null && !arrayListBt.isEmpty()) {
            return arrayListBt;
        }
        LogUtil.a("HwCloudDeviceInfoUtil", "getXiaoYiGuideDataList is null");
        return new ArrayList<>();
    }

    private static String a(edz edzVar, int i, DeviceInfo deviceInfo) {
        if (i == 1) {
            return a(edzVar.az(), edzVar.as(), deviceInfo);
        }
        if (i == 2) {
            return a(edzVar.au(), edzVar.ab(), deviceInfo);
        }
        if (i == 3) {
            return a(edzVar.bo(), edzVar.bq(), deviceInfo);
        }
        if (i == 4) {
            return a(edzVar.bo(), edzVar.ae(), deviceInfo);
        }
        LogUtil.j("HwCloudDeviceInfoUtil", "getDeviceImageNameWithModel default.");
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    private static String a(String str, ArrayList<String> arrayList, DeviceInfo deviceInfo) {
        LogUtil.a("HwCloudDeviceInfoUtil", "imageList:", arrayList, "defaultImage:", str);
        if (deviceInfo == null || arrayList == null || arrayList.isEmpty()) {
            LogUtil.j("HwCloudDeviceInfoUtil", "deviceInfo or imageList is null.");
            return str;
        }
        for (String str2 : arrayList) {
            LogUtil.j("HwCloudDeviceInfoUtil", "deviceInfo imageString:", str2);
            if (!TextUtils.isEmpty(deviceInfo.getHiLinkDeviceId()) && !TextUtils.isEmpty(deviceInfo.getDeviceSubModelId())) {
                if (!str2.contains(deviceInfo.getHiLinkDeviceId() + Constants.LINK + deviceInfo.getDeviceSubModelId())) {
                    if (!TextUtils.isEmpty(deviceInfo.getDeviceModel())) {
                    }
                }
            } else if ((!TextUtils.isEmpty(deviceInfo.getDeviceModel()) || !str2.contains(deviceInfo.getDeviceModel())) && (TextUtils.isEmpty(deviceInfo.getHiLinkDeviceId()) || !str2.contains(deviceInfo.getHiLinkDeviceId()) || str2.contains("subId"))) {
            }
            return str2;
        }
        return str;
    }

    public static int e(edl edlVar) {
        if (edlVar == null) {
            LogUtil.a("HwCloudDeviceInfoUtil", "ezPluginInfo is null");
            return 200;
        }
        edz edzVarI = edlVar.i();
        if (edzVarI == null) {
            LogUtil.a("HwCloudDeviceInfoUtil", "getGuideDataList exPluginInfoForWear is null");
            return 200;
        }
        return edzVarI.ao();
    }

    public static int a(edl edlVar) {
        if (edlVar == null) {
            LogUtil.a("HwCloudDeviceInfoUtil", "ezPluginInfo is null");
            return 0;
        }
        edz edzVarI = edlVar.i();
        if (edzVarI == null) {
            LogUtil.a("HwCloudDeviceInfoUtil", "getGuideDataList exPluginInfoForWear is null");
            return 0;
        }
        return edzVarI.bb();
    }

    public static void e(edl edlVar, String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, List<List<String>> list) {
        LogUtil.a("HwCloudDeviceInfoUtil", "enter addDesignGuideData");
        if (edlVar == null) {
            ReleaseLogUtil.e("R_GRS_HwCloudDeviceInfoUtil", "addDesignGuideData descriptionInfo is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("R_GRS_HwCloudDeviceInfoUtil", "addDesignGuideData hiLinkDeviceId is null");
            return;
        }
        if (arrayList == null || arrayList2 == null || list == null) {
            ReleaseLogUtil.e("R_GRS_HwCloudDeviceInfoUtil", "addDesignGuideData param list is null");
            return;
        }
        if (arrayList2.size() != list.size()) {
            LogUtil.a("HwCloudDeviceInfoUtil", "addDesignGuideData user guide data not show");
            arrayList.clear();
            arrayList2.clear();
            list.clear();
        }
        edz edzVarI = edlVar.i();
        if (edzVarI == null) {
            ReleaseLogUtil.e("R_GRS_HwCloudDeviceInfoUtil", "addDesignGuideData wearDeviceInfo is null");
            return;
        }
        ArrayList<edr> arrayListZ = edzVarI.z();
        if (CollectionUtils.a(arrayListZ)) {
            ReleaseLogUtil.e("R_GRS_HwCloudDeviceInfoUtil", "designGuideDataList isEmpty");
            return;
        }
        for (int i = 0; i < arrayListZ.size(); i++) {
            edr edrVar = arrayListZ.get(i);
            if (edrVar == null) {
                ReleaseLogUtil.e("R_GRS_HwCloudDeviceInfoUtil", "deviceUserGuideBean is null");
                return;
            }
            String strB = edrVar.b();
            if (TextUtils.isEmpty(strB) || !TextUtils.equals(strB, str) || CollectionUtils.a(edrVar.a())) {
                ReleaseLogUtil.e("R_GRS_HwCloudDeviceInfoUtil", "deviceUserGuideBean doesn't match");
            } else {
                arrayList.add(edrVar.c());
                arrayList2.add(edrVar.d());
                list.add(edrVar.a());
            }
        }
    }

    public static String c(edl edlVar, int i, DeviceInfo deviceInfo) {
        edz edzVarI = edlVar.i();
        if (edzVarI == null) {
            return "";
        }
        LogUtil.a("HwCloudDeviceInfoUtil", "imageType:", Integer.valueOf(i));
        String strAz = edzVarI.az();
        ArrayList<String> arrayListAs = edzVarI.as();
        LogUtil.a("HwCloudDeviceInfoUtil", "imageList:", arrayListAs, "defaultImage:", strAz);
        if (deviceInfo == null || arrayListAs == null || arrayListAs.isEmpty()) {
            LogUtil.j("HwCloudDeviceInfoUtil", "deviceInfo or imageList is null.");
            return strAz;
        }
        for (String str : arrayListAs) {
            LogUtil.j("HwCloudDeviceInfoUtil", "deviceInfo imageString:", str);
            if (!TextUtils.isEmpty(deviceInfo.getHiLinkDeviceId()) && str.contains(deviceInfo.getHiLinkDeviceId())) {
                return str;
            }
        }
        return strAz;
    }
}
