package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.CreativeType;
import health.compact.a.Utils;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class grt {
    private static final String e = "ArrhythmiaUtil";

    public static boolean e(DeviceInfo deviceInfo) {
        if (b(deviceInfo) || c(deviceInfo)) {
            return true;
        }
        return a(deviceInfo);
    }

    public static boolean c(DeviceInfo deviceInfo) {
        if (Utils.o()) {
            boolean zD = eey.d(deviceInfo, 255);
            boolean zE = e("support_ce");
            LogUtil.a(e, "isSupportEuropeCE isSupportCapability is ", Boolean.valueOf(zD), " isSupportCEFile is ", Boolean.valueOf(zE));
            return zD && zE;
        }
        LogUtil.a(e, "isSupportEuropeCE is not oversea");
        return false;
    }

    public static boolean a(DeviceInfo deviceInfo) {
        if (Utils.o()) {
            boolean zD = eey.d(deviceInfo, CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON);
            boolean zA = fej.a("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.ppg");
            LogUtil.a(e, "isSupportOverseaOther  isSupportCapability is ", Boolean.valueOf(zD), " isFeatureSupport is ", Boolean.valueOf(zA));
            return zD && zA;
        }
        LogUtil.a(e, "isSupportOverseaOther is not oversea");
        return false;
    }

    public static boolean b(DeviceInfo deviceInfo) {
        if (Utils.o()) {
            LogUtil.a(e, "isSupportDomestic is oversea");
            return false;
        }
        boolean zD = eey.d(deviceInfo, 168);
        boolean zE = e("support_ppg");
        LogUtil.a(e, "isSupportDomestic isSupportCapability is ", Boolean.valueOf(zD), " isSupportPpg:", Boolean.valueOf(zE));
        return zD && zE;
    }

    private static boolean e(String str) {
        Object obj;
        String str2 = e;
        LogUtil.a(str2, "isSupportByFile key  is ", str);
        fdi fdiVarD = fej.d("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.ppg");
        if (fdiVarD == null) {
            LogUtil.j(str2, "isSupportByFile featureConfig is null");
            return false;
        }
        Map mapE = fdiVarD.e();
        if (mapE == null) {
            LogUtil.j(str2, "isSupportByFile getExtInfo is null");
            return false;
        }
        str.hashCode();
        if (str.equals("support_ppg")) {
            obj = mapE.get("support_ppg");
        } else if (str.equals("support_ce")) {
            obj = mapE.get("support_ce");
        } else {
            obj = -1;
        }
        LogUtil.a(str2, "isSupportByFile object:", obj);
        return (obj instanceof Double) && ((Double) obj).doubleValue() > 0.0d;
    }
}
