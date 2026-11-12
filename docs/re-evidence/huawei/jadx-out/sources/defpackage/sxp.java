package defpackage;

import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.ui.homehealth.runcard.operation.recommendalgo.model.SportLevel;
import com.huawei.ui.homehealth.runcard.operation.recommendalgo.sportlevelmapping.SportLevelByVo2Max;
import com.huawei.up.model.UserInfomation;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class sxp {
    public SportLevel a(List<HiHealthData> list, UserInfomation userInfomation) {
        if (userInfomation == null) {
            LogUtil.j("Track_Vo2MaxToSportLevel", "calSportLevel userInformation is null");
            return new SportLevel(-1, 1);
        }
        int gender = userInfomation.getGender();
        if (gender != 0 && gender != 1) {
            LogUtil.j("Track_Vo2MaxToSportLevel", "undefined gender");
            return new SportLevel(-1, 2);
        }
        return a(list, gender, userInfomation.getAgeOrDefaultValue());
    }

    private SportLevel a(List<HiHealthData> list, int i, int i2) {
        LogUtil.a("Track_Vo2MaxToSportLevel", "analyzeVo2MaxData ");
        if (njy.e(list)) {
            return new SportLevel(-1, 5);
        }
        float f = 0.0f;
        for (HiHealthData hiHealthData : list) {
            if (f < hiHealthData.getInt(MedalConstants.EVENT_KEY)) {
                f = hiHealthData.getInt(MedalConstants.EVENT_KEY);
            }
        }
        LogUtil.a("Track_Vo2MaxToSportLevel", "analyzeVo2MaxData ", Float.valueOf(f));
        SportLevelByVo2Max sportLevelByVo2MaxE = e(i, i2);
        if (sportLevelByVo2MaxE == null) {
            LogUtil.a("Track_Vo2MaxToSportLevel", "analyzeVo2MaxData cal null");
            return new SportLevel(-1, 0);
        }
        return sportLevelByVo2MaxE.calSportLevel(Math.round(f));
    }

    private SportLevelByVo2Max e(int i, int i2) {
        if (i2 <= 19) {
            return null;
        }
        if (i2 <= 24) {
            LogUtil.a("Track_Vo2MaxToSportLevel", "SportLevelByVo2Max20s");
            return new sxe(i);
        }
        if (i2 <= 29) {
            LogUtil.a("Track_Vo2MaxToSportLevel", "SportLevelByVo2Max25s");
            return new sxk(i);
        }
        if (i2 <= 34) {
            LogUtil.a("Track_Vo2MaxToSportLevel", "SportLevelByVo2Max30s");
            return new sxl(i);
        }
        if (i2 <= 39) {
            LogUtil.a("Track_Vo2MaxToSportLevel", "SportLevelByVo2Max35s");
            return new sxn(i);
        }
        if (i2 <= 44) {
            LogUtil.a("Track_Vo2MaxToSportLevel", "SportLevelByVo2Max40s");
            return new sxm(i);
        }
        if (i2 <= 49) {
            LogUtil.a("Track_Vo2MaxToSportLevel", "SportLevelByVo2Max45s");
            return new sxj(i);
        }
        if (i2 <= 54) {
            LogUtil.a("Track_Vo2MaxToSportLevel", "SportLevelByVo2Max50s");
            return new sxr(i);
        }
        if (i2 <= 59) {
            LogUtil.a("Track_Vo2MaxToSportLevel", "SportLevelByVo2Max55s");
            return new sxs(i);
        }
        if (i2 <= 65) {
            LogUtil.a("Track_Vo2MaxToSportLevel", "SportLevelByVo2Max60s");
            return new sxq(i);
        }
        LogUtil.a("Track_Vo2MaxToSportLevel", "Age larger than 65.");
        return null;
    }
}
