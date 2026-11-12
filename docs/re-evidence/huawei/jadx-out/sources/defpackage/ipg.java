package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes9.dex */
public class ipg {
    public static final boolean e() {
        if (!Utils.o()) {
            return true;
        }
        fdi fdiVarD = fej.d("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.highlandcare");
        if (fdiVarD == null) {
            LogUtil.a("VersionControlUtil", "isBloodOxygenAltitudeShow isSupportByFile featureConfig is null");
            return false;
        }
        Integer numD = fdiVarD.d();
        int iIntValue = numD.intValue();
        Object obj = fdiVarD.e().get("support_highlandcare");
        if (!(obj instanceof Double)) {
            LogUtil.j("VersionControlUtil", "isBloodOxygenAltitudeShow object instanceof Double error");
            return false;
        }
        Double d = (Double) obj;
        LogUtil.a("VersionControlUtil", "isBloodOxygenAltitudeShow support: ", numD, "entraceSupport: ", d);
        return iIntValue > 0 && d.doubleValue() > 0.0d;
    }
}
