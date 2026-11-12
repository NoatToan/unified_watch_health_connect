package defpackage;

import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.model.unite.SportBasicInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiValidatorUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lgu {
    public static List<kuk> d(SportBasicInfo sportBasicInfo, kuk kukVar) {
        ArrayList arrayList = new ArrayList(3);
        int iFetchSteps = sportBasicInfo.fetchSteps();
        int iFetchDistance = sportBasicInfo.fetchDistance();
        int iFetchCalorie = sportBasicInfo.fetchCalorie();
        int iFetchDuration = sportBasicInfo.fetchDuration();
        if (!HiValidatorUtil.d(iFetchSteps)) {
            LogUtil.e("Debug_SportDataSwitch", "getSwimStatTable STEP is out of rang sportBasicInfo = ", HiJsonUtil.d(sportBasicInfo));
            return null;
        }
        if (HiValidatorUtil.e(iFetchDistance)) {
            arrayList.add(kukVar.a(40035, iFetchDistance, 2));
        }
        if (HiValidatorUtil.e(iFetchDuration)) {
            arrayList.add(kukVar.a(40045, iFetchDuration * 60, 13));
        }
        if (HiValidatorUtil.e(iFetchCalorie)) {
            arrayList.add(kukVar.a(40025, iFetchCalorie, 3));
        }
        return arrayList;
    }

    public static List<kuk> e(SportBasicInfo sportBasicInfo, kuk kukVar) {
        ArrayList arrayList = new ArrayList(4);
        int iFetchSteps = sportBasicInfo.fetchSteps();
        int iFetchDistance = sportBasicInfo.fetchDistance();
        int iFetchCalorie = sportBasicInfo.fetchCalorie();
        int iFetchDuration = sportBasicInfo.fetchDuration();
        if (!HiValidatorUtil.d(iFetchSteps)) {
            LogUtil.e("Debug_SportDataSwitch", "getWalkStatTable STEP is out of rang sportBasicInfo = ", HiJsonUtil.d(sportBasicInfo));
            return null;
        }
        if (HiValidatorUtil.e(iFetchSteps)) {
            arrayList.add(kukVar.a(40011, iFetchSteps, 1));
        }
        if (HiValidatorUtil.e(iFetchDistance)) {
            arrayList.add(kukVar.a(40031, iFetchDistance, 2));
        }
        if (HiValidatorUtil.e(iFetchDuration)) {
            arrayList.add(kukVar.a(40041, iFetchDuration * 60, 13));
        }
        if (HiValidatorUtil.e(iFetchCalorie)) {
            arrayList.add(kukVar.a(40021, iFetchCalorie, 3));
        }
        return arrayList;
    }

    public static List<kuk> a(SportBasicInfo sportBasicInfo, kuk kukVar) {
        ArrayList arrayList = new ArrayList(4);
        int iFetchSteps = sportBasicInfo.fetchSteps();
        int iFetchDistance = sportBasicInfo.fetchDistance();
        int iFetchCalorie = sportBasicInfo.fetchCalorie();
        int iFetchDuration = sportBasicInfo.fetchDuration();
        if (!HiValidatorUtil.d(iFetchSteps)) {
            LogUtil.e("Debug_SportDataSwitch", "getRunStatTable STEP is out of rang sportBasicInfo = ", HiJsonUtil.d(sportBasicInfo));
            return null;
        }
        if (HiValidatorUtil.e(iFetchSteps)) {
            arrayList.add(kukVar.a(40012, iFetchSteps, 1));
        }
        if (HiValidatorUtil.e(iFetchDistance)) {
            arrayList.add(kukVar.a(40032, iFetchDistance, 2));
        }
        if (HiValidatorUtil.e(iFetchDuration)) {
            arrayList.add(kukVar.a(40042, iFetchDuration * 60, 13));
        }
        if (HiValidatorUtil.e(iFetchCalorie)) {
            arrayList.add(kukVar.a(40022, iFetchCalorie, 3));
        }
        return arrayList;
    }

    public static List<kuk> b(SportBasicInfo sportBasicInfo, kuk kukVar) {
        ArrayList arrayList = new ArrayList(3);
        int iFetchDistance = sportBasicInfo.fetchDistance();
        int iFetchCalorie = sportBasicInfo.fetchCalorie();
        int iFetchDuration = sportBasicInfo.fetchDuration();
        if (!HiValidatorUtil.a(iFetchCalorie)) {
            LogUtil.e("Debug_SportDataSwitch", "getRideStatTable calorie is out of rang sportBasicInfo = ", HiJsonUtil.d(sportBasicInfo));
            return null;
        }
        if (HiValidatorUtil.e(iFetchDistance)) {
            arrayList.add(kukVar.a(40033, iFetchDistance, 2));
        }
        if (HiValidatorUtil.e(iFetchDuration)) {
            arrayList.add(kukVar.a(40043, iFetchDuration * 60, 13));
        }
        if (HiValidatorUtil.e(iFetchCalorie)) {
            arrayList.add(kukVar.a(40023, iFetchCalorie, 3));
        }
        return arrayList;
    }
}
