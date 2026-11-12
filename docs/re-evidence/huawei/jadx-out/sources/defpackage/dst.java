package defpackage;

import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.measure.fragment.WeightMeasureGuideFragment;
import com.huawei.health.device.ui.measure.fragment.WeightResultFragment;
import com.huawei.health.device.ui.measure.fragment.WifiWeightMeasureGuideFragment;
import com.huawei.health.device.ui.measure.fragment.WifiWeightResultFragment;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.BloodPressureMeasureGuidFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.BloodPressureResultFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.BloodSugarResultFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.DnurseMeasureFragment;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dst {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[][] f32335a = {new String[]{"9bf158ba-49b0-46aa-9fdf-ed75da1569cf", BloodSugarResultFragment.class.getName()}, new String[]{"e4b0b1d5-2003-4d88-8b5f-c4f64542040b", WifiWeightResultFragment.class.getName()}, new String[]{"a8ba095d-4123-43c4-a30a-0240011c58de", WifiWeightResultFragment.class.getName()}, new String[]{"HDK_WEIGHT", WeightResultFragment.class.getName()}, new String[]{"HDK_BLOOD_PRESSURE", BloodPressureResultFragment.class.getName()}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[][] f32336c = {new String[]{"9bf158ba-49b0-46aa-9fdf-ed75da1569cf", DnurseMeasureFragment.class.getName()}, new String[]{"e4b0b1d5-2003-4d88-8b5f-c4f64542040b", WifiWeightMeasureGuideFragment.class.getName()}, new String[]{"a8ba095d-4123-43c4-a30a-0240011c58de", WifiWeightMeasureGuideFragment.class.getName()}, new String[]{"HDK_WEIGHT", WeightMeasureGuideFragment.class.getName()}, new String[]{"HDK_BLOOD_PRESSURE", BloodPressureMeasureGuidFragment.class.getName()}};

    public static BaseFragment a(String str) {
        return h(b(str));
    }

    public static BaseFragment c(String str) {
        return h(str);
    }

    private static BaseFragment h(String str) {
        if (str == null) {
            return null;
        }
        LogUtil.a("DeviceFragmentFactory", str);
        try {
            return (BaseFragment) Class.forName(str).newInstance();
        } catch (ClassNotFoundException e) {
            LogUtil.e("DeviceFragmentFactory", e.getMessage());
            return null;
        } catch (IllegalAccessException e2) {
            LogUtil.e("DeviceFragmentFactory", e2.getMessage());
            return null;
        } catch (InstantiationException e3) {
            LogUtil.e("DeviceFragmentFactory", e3.getMessage());
            return null;
        }
    }

    public static BaseFragment e(String str) {
        return h(d(str));
    }

    public static String d(String str) {
        for (String[] strArr : f32335a) {
            if (strArr[0].equals(str)) {
                return strArr[1];
            }
        }
        return null;
    }

    public static String b(String str) {
        String strD;
        HealthDevice healthDeviceB;
        String[][] strArr = f32336c;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                strD = null;
                break;
            }
            String[] strArr2 = strArr[i];
            if (strArr2[0].equals(str)) {
                strD = strArr2[1];
                break;
            }
            i++;
        }
        if (dxm.ag(str) && (healthDeviceB = drw.e().b(str)) != null) {
            strD = d(healthDeviceB, str);
        }
        LogUtil.a("DeviceFragmentFactory", "the classname is ", strD);
        return strD;
    }

    private static String d(HealthDevice healthDevice, String str) {
        if (!(healthDevice instanceof eby) || ((eby) healthDevice).a().m() != 2) {
            return "";
        }
        if (dmp.d().c(str, true) != null) {
            return WeightMeasureGuideFragment.class.getName();
        }
        LogUtil.j("DeviceFragmentFactory", "the measurableDevice is null");
        return "";
    }
}
