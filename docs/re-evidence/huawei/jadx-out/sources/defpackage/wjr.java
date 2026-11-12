package defpackage;

import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.ui.main.stories.privacy.datasourcemanager.bean.SourceInfo;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class wjr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f52109b = "BiUtil";

    private static int f(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return -1;
                        }
                    }
                }
            }
        }
        return i2;
    }

    private static int j(int i) {
        if (i == 1) {
            return 1;
        }
        return i == 2 ? 2 : -1;
    }

    private static void a(Map<String, Object> map) {
        map.put("sessionId", Long.valueOf(System.currentTimeMillis()));
        map.put("pageId", "BloodPressure_0002");
    }

    private static void c(Map<String, Object> map) {
        map.put("event", 1);
        map.put("moduleName", "main_page");
        map.put("value", "all_data");
    }

    public static void a() {
        HashMap map = new HashMap();
        a(map);
        HashMap map2 = new HashMap();
        map2.put(FunctionSetBeanReader.BI_ELEMENT, "m63");
        c(map2);
        lmn lmnVar = new lmn();
        lmnVar.d(map);
        lmnVar.e(map2);
        lmnVar.d(new ArrayList());
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.STATISTICS_BLOOD_PRESSURE_ALL_DATA.value(), lmnVar, 0);
    }

    public static void i() {
        HashMap map = new HashMap();
        c(map);
        map.put(FunctionSetBeanReader.BI_ELEMENT, "m8");
        map.put(ParamConstants.Param.VIEW_TYPE, "all_data");
        HashMap map2 = new HashMap();
        map2.put(WebViewHelp.BI_KEY_PULL_FROM, "BloodPressure_0002");
        map2.put("pullOrder", "");
        HashMap map3 = new HashMap();
        a(map3);
        ArrayList arrayList = new ArrayList(1);
        HashMap map4 = new HashMap();
        map4.put("action", 0);
        map4.put("moduleName", "main_page");
        map4.put(ParamConstants.Param.VIEW_TYPE, "all_data");
        map4.put(FunctionSetBeanReader.BI_HAS_DATA, "true");
        arrayList.add(map4);
        lmn lmnVar = new lmn();
        lmnVar.c(map2);
        lmnVar.d(map3);
        lmnVar.e(map);
        lmnVar.d(arrayList);
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.STATISTICS_BLOOD_PRESSURE_ALL_DATA.value(), lmnVar, 0);
    }

    public static void d(int i, boolean z) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        map.put("isAllData", Boolean.valueOf(z));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.DELETE_SLEEP_DATA.value(), map, 0);
    }

    public static void c(int i) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("dataType", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SWITCH_SLEEP_DATA_SOURCE.value(), map, 0);
    }

    public static void f() {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.TEMPERATURE_SWITCH_TYPE.value(), map, 0);
    }

    public static void b() {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.TEMPERATURE_ENTER_DAY_LIST.value(), map, 0);
    }

    public static void c() {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.TEMPERATURE_ENTER_DATA_DETAIL.value(), map, 0);
    }

    public static void e() {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.TEMPERATURE_DELETE_DAY_LIST.value(), map, 0);
    }

    public static void d() {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.TEMPERATURE_DELETE_DATA_DETAIL.value(), map, 0);
    }

    public static void a(int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.BLOOD_OXYGEN_SWITCHING_TYPE.value(), map, 0);
    }

    public static void a(int i, int i2, int i3) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("from", Integer.valueOf(i));
        map.put("type", Integer.valueOf(i2));
        map.put("level", Integer.valueOf(i3));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.ABNORMAL_BLOOD_OXYGEN_DATA_VIEW.value(), map, 0);
    }

    public static void b(int i, int i2) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        map.put("level", Integer.valueOf(i2));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.BLOOD_OXYGEN_ABNORMAL_DATA.value(), map, 0);
    }

    public static void e(int i) {
        int iA = wua.a(i);
        if (iA != 0) {
            b(1, iA);
        }
    }

    public static void b(int i) {
        int iIntValue = wua.f52491c.get(Integer.valueOf(i)).intValue();
        if (iIntValue != 0) {
            b(1, iIntValue);
        }
    }

    public static int d(int i) {
        if (i == 1001) {
            return 1;
        }
        if (i == 1002) {
            return 2;
        }
        LogUtil.d(f52109b, "getSpO2AbnormalType cardType is invalid");
        return Integer.MIN_VALUE;
    }

    public static int c(int i, int i2) {
        if (i == 1001) {
            return wua.f52491c.get(Integer.valueOf(i2)).intValue();
        }
        if (i == 1002) {
            return wua.a(i2);
        }
        LogUtil.d(f52109b, "getSpO2AbnormalLevel cardType is invalid");
        return Integer.MIN_VALUE;
    }

    public static void d(int i, int i2) {
        if (j(i) == -1 || f(i2) == -1) {
            LogUtil.d(f52109b, "pageType or dataType is invalid");
            return;
        }
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put(CommonUtil.PAGE_TYPE, Integer.valueOf(j(i)));
        map.put("dataType", Integer.valueOf(f(i2)));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.BLOOD_PRESSURE_ALL_DATA_DISPLAY_TYPE.value(), map, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    public static int b(SourceInfo sourceInfo) {
        byte b2;
        if (sourceInfo == null) {
            return 1;
        }
        if (wgr.d(sourceInfo.getPackageName(), sourceInfo.getDeviceUniqueCode())) {
            return 4;
        }
        String strB = wgt.b(String.valueOf(sourceInfo.getDeviceType()));
        strB.hashCode();
        switch (strB) {
            case "00E":
                b2 = 0;
                break;
            case "011":
                b2 = 1;
                break;
            case "06D":
                b2 = 2;
                break;
            case "06E":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0 || b2 == 1) {
            return 3;
        }
        return (b2 == 2 || b2 == 3) ? 2 : 5;
    }
}
