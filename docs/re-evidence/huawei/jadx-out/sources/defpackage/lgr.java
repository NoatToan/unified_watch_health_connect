package defpackage;

import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.model.unite.SportBasicInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import health.compact.a.HiDateUtil;
import health.compact.a.HiValidatorUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lgr {
    public static List<kuk> b(SportBasicInfo sportBasicInfo, kuk kukVar) {
        ArrayList arrayList = new ArrayList(5);
        int iFetchSteps = sportBasicInfo.fetchSteps();
        int iFetchDistance = sportBasicInfo.fetchDistance();
        int iFetchCalorie = sportBasicInfo.fetchCalorie();
        int iFetchDuration = sportBasicInfo.fetchDuration();
        float fFetchAltitude = sportBasicInfo.fetchAltitude() * 10.0f;
        if (HiValidatorUtil.d(iFetchSteps)) {
            double d = fFetchAltitude;
            if (HiValidatorUtil.b(d)) {
                if (HiValidatorUtil.e(iFetchDistance)) {
                    arrayList.add(kukVar.a(40034, iFetchDistance, 2));
                }
                if (HiValidatorUtil.e(iFetchDuration)) {
                    arrayList.add(kukVar.a(40044, iFetchDuration * 60, 13));
                }
                if (HiValidatorUtil.e(iFetchSteps)) {
                    arrayList.add(kukVar.a(40013, iFetchSteps, 1));
                }
                if (HiValidatorUtil.e(iFetchCalorie)) {
                    arrayList.add(kukVar.a(40024, iFetchCalorie, 3));
                }
                if (HiValidatorUtil.b(fFetchAltitude)) {
                    arrayList.add(kukVar.a(SmartMsgConstant.MSG_TYPE_RIDE_USER, d, 4));
                }
                return arrayList;
            }
        }
        LogUtil.e("Debug_SportDataSwitch", "getClimbStatTable STEP is out of rang sportBasicInfo = ", HiJsonUtil.d(sportBasicInfo));
        return null;
    }

    public static List<kuk> d(SportBasicInfo sportBasicInfo, kuk kukVar) {
        ArrayList arrayList = new ArrayList(5);
        int iFetchSteps = sportBasicInfo.fetchSteps();
        int iFetchDistance = sportBasicInfo.fetchDistance();
        int iFetchCalorie = sportBasicInfo.fetchCalorie();
        int iFetchDuration = sportBasicInfo.fetchDuration();
        float fFetchFloor = sportBasicInfo.fetchFloor() * 30;
        if (HiValidatorUtil.d(iFetchSteps)) {
            double d = fFetchFloor;
            if (HiValidatorUtil.b(d)) {
                if (HiValidatorUtil.e(iFetchSteps)) {
                    arrayList.add(kukVar.a(40013, iFetchSteps, 1));
                }
                if (HiValidatorUtil.e(iFetchDistance)) {
                    arrayList.add(kukVar.a(40034, iFetchDistance, 2));
                }
                if (HiValidatorUtil.e(iFetchDuration)) {
                    arrayList.add(kukVar.a(40044, iFetchDuration * 60, 13));
                }
                if (HiValidatorUtil.e(iFetchCalorie)) {
                    arrayList.add(kukVar.a(40024, iFetchCalorie, 3));
                }
                if (HiValidatorUtil.b(fFetchFloor)) {
                    arrayList.add(kukVar.a(SmartMsgConstant.MSG_TYPE_RIDE_USER, d, 4));
                }
                return arrayList;
            }
        }
        LogUtil.e("Debug_SportDataSwitch", "getStairStatTable STEP is out of rang sportBasicInfo = ", HiJsonUtil.d(sportBasicInfo));
        return null;
    }

    public static List<kuk> b(SportBasicInfo sportBasicInfo, kuk kukVar, int i) {
        int iFetchSteps = sportBasicInfo.fetchSteps();
        int iFetchDistance = sportBasicInfo.fetchDistance();
        int iFetchCalorie = sportBasicInfo.fetchCalorie();
        int iFetchDuration = sportBasicInfo.fetchDuration();
        int iFetchPushesVal = sportBasicInfo.fetchPushesVal();
        float fFetchAltitude = (sportBasicInfo.fetchAltitude() * 10.0f) + (sportBasicInfo.fetchFloor() * 30);
        if (HiValidatorUtil.d(iFetchSteps) && HiValidatorUtil.a(iFetchCalorie)) {
            double d = fFetchAltitude;
            if (HiValidatorUtil.b(d)) {
                ArrayList arrayList = new ArrayList(5);
                if (HiDateUtil.d(System.currentTimeMillis()) == i) {
                    LogUtil.a("HiH_SportDataSwitch", "getSportStatTable date=", Integer.valueOf(i), ": s=", Integer.valueOf(iFetchSteps), ", d=", Integer.valueOf(iFetchDistance), ", c=", Integer.valueOf(iFetchCalorie), ", p=", Integer.valueOf(iFetchPushesVal));
                }
                if (HiValidatorUtil.e(iFetchSteps)) {
                    arrayList.add(kukVar.a(40002, iFetchSteps, 1));
                }
                if (HiValidatorUtil.e(iFetchDistance)) {
                    arrayList.add(kukVar.a(40004, iFetchDistance, 2));
                }
                if (HiValidatorUtil.e(iFetchDuration)) {
                    arrayList.add(kukVar.a(SmartMsgConstant.MSG_TYPE_BLOOD_SUGAR_USER, iFetchDuration * 60, 13));
                }
                if (HiValidatorUtil.e(iFetchCalorie)) {
                    arrayList.add(kukVar.a(40003, iFetchCalorie, 3));
                }
                if (HiValidatorUtil.e(iFetchPushesVal)) {
                    arrayList.add(kukVar.a(40008, iFetchPushesVal, 16));
                }
                if (HiValidatorUtil.b(fFetchAltitude)) {
                    arrayList.add(kukVar.a(SmartMsgConstant.MSG_TYPE_RIDE_USER, d, 4));
                }
                return arrayList;
            }
        }
        LogUtil.e("HiH_SportDataSwitch", "getSportStatTable STEP OR CALORIE or altitude is out of rang sportBasicInfo = ", HiJsonUtil.d(sportBasicInfo));
        return null;
    }
}
