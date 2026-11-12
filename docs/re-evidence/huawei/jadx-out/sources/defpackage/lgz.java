package defpackage;

import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.data.type.HiGoalType;
import com.huawei.hwcloudmodel.model.userprofile.UserBasicInfo;
import com.huawei.hwcloudmodel.model.userprofile.UserGoalsInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lgz {
    public UserBasicInfo a(HiUserInfo hiUserInfo) {
        if (hiUserInfo == null) {
            return null;
        }
        UserBasicInfo userBasicInfo = new UserBasicInfo();
        if (hiUserInfo.isBirthdayValid()) {
            userBasicInfo.setBirthday(Integer.valueOf(hiUserInfo.getBirthday()));
        }
        userBasicInfo.setEmail(hiUserInfo.getEmail());
        if (hiUserInfo.isGenderValid()) {
            userBasicInfo.setGender(Integer.valueOf(hiUserInfo.getGender()));
        }
        userBasicInfo.setMobile(hiUserInfo.getMobile());
        userBasicInfo.setName(hiUserInfo.getName());
        userBasicInfo.setPortraitUrl(hiUserInfo.getHeadImgUrl());
        if (hiUserInfo.isHeightValid()) {
            userBasicInfo.setHeight(Integer.valueOf(hiUserInfo.getHeight()));
            userBasicInfo.setUnitType(Integer.valueOf(hiUserInfo.getUnitType()));
        }
        if (hiUserInfo.isWeightValid()) {
            userBasicInfo.setWeight(Integer.valueOf((int) hiUserInfo.getWeight()));
            try {
                userBasicInfo.setWeightDb(Double.valueOf(new BigDecimal(hiUserInfo.getWeight()).setScale(2, 4).doubleValue()));
            } catch (NumberFormatException unused) {
                ReleaseLogUtil.a("HiH_UserInfoSwitch", "switchHiUserInfo Exception ", Float.valueOf(hiUserInfo.getWeight()));
            }
            userBasicInfo.setUnitType(Integer.valueOf(hiUserInfo.getUnitType()));
        }
        userBasicInfo.setModifyTime(Long.valueOf(hiUserInfo.getCreateTime()));
        return userBasicInfo;
    }

    public HiUserInfo d(UserBasicInfo userBasicInfo) {
        if (userBasicInfo == null) {
            return null;
        }
        HiUserInfo hiUserInfo = new HiUserInfo();
        if (userBasicInfo.getBirthday() != null) {
            hiUserInfo.setBirthday(userBasicInfo.getBirthday().intValue());
        }
        hiUserInfo.setEmail(userBasicInfo.getEmail());
        if (userBasicInfo.getGender() != null) {
            hiUserInfo.setGender(userBasicInfo.getGender().intValue());
        }
        if (userBasicInfo.getHeight() != null) {
            hiUserInfo.setHeight(userBasicInfo.getHeight().intValue());
        }
        hiUserInfo.setMobile(userBasicInfo.getMobile());
        hiUserInfo.setName(userBasicInfo.getName());
        hiUserInfo.setHeadImgUrl(userBasicInfo.getPortraitUrl());
        if (userBasicInfo.getWeight() != null) {
            hiUserInfo.setWeight(userBasicInfo.getWeight().intValue());
        }
        if (userBasicInfo.getWeightDb() != null && userBasicInfo.getWeightDb().doubleValue() > 0.0d) {
            hiUserInfo.setWeight(userBasicInfo.getWeightDb().floatValue());
        }
        if (userBasicInfo.getUnitType() != null) {
            hiUserInfo.setUnitType(userBasicInfo.getUnitType().intValue());
        }
        Long modifyTime = userBasicInfo.getModifyTime();
        if (modifyTime == null || modifyTime.longValue() <= 0) {
            LogUtil.a("HiH_UserInfoSwitch", "switchUserBasicInfo old cloud modifyTime , it is ", modifyTime);
            modifyTime = Long.valueOf(System.currentTimeMillis());
        }
        hiUserInfo.setCreateTime(modifyTime.longValue());
        return hiUserInfo;
    }

    private HiGoalInfo b(UserGoalsInfo userGoalsInfo) {
        if (userGoalsInfo == null) {
            return null;
        }
        int iA = HiGoalType.a(userGoalsInfo.getGoalType().intValue(), userGoalsInfo.getGoalPeriod().intValue());
        if (iA <= 0) {
            LogUtil.j("HiH_UserInfoSwitch", "switchUserGoalsInfo no such local goal type");
            return null;
        }
        HiGoalInfo hiGoalInfo = new HiGoalInfo();
        hiGoalInfo.setGoalType(iA);
        hiGoalInfo.setGoalValue(CommonUtil.a(userGoalsInfo.getGoalValue()));
        return hiGoalInfo;
    }

    public List<HiGoalInfo> c(List<UserGoalsInfo> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (UserGoalsInfo userGoalsInfo : list) {
            LogUtil.a("HiH_UserInfoSwitch", "switchUserGoalsInfos userGoalInfo is ", userGoalsInfo);
            HiGoalInfo hiGoalInfoB = b(userGoalsInfo);
            if (hiGoalInfoB != null) {
                arrayList.add(hiGoalInfoB);
            }
        }
        return arrayList;
    }

    private UserGoalsInfo c(HiGoalInfo hiGoalInfo) {
        if (hiGoalInfo == null || !e(hiGoalInfo.getGoalType())) {
            return null;
        }
        int iD = HiGoalType.d(hiGoalInfo.getGoalType());
        if (iD <= 0) {
            LogUtil.j("HiH_UserInfoSwitch", "switchHiGoalInfo no such goalPeriod, goalPeriod is ", Integer.valueOf(iD));
            return null;
        }
        int iC = HiGoalType.c(hiGoalInfo.getGoalType(), iD);
        if (iC <= 0) {
            LogUtil.j("HiH_UserInfoSwitch", "switchHiGoalInfo no such cloudGoalType,cloudGoalType is ", Integer.valueOf(iC));
            return null;
        }
        UserGoalsInfo userGoalsInfo = new UserGoalsInfo();
        userGoalsInfo.setGoalPeriod(Integer.valueOf(iD));
        userGoalsInfo.setGoalType(Integer.valueOf(iC));
        userGoalsInfo.setGoalValue(Double.toString(hiGoalInfo.getGoalValue()));
        return userGoalsInfo;
    }

    public List<UserGoalsInfo> d(List<HiGoalInfo> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<HiGoalInfo> it = list.iterator();
        while (it.hasNext()) {
            UserGoalsInfo userGoalsInfoC = c(it.next());
            LogUtil.a("HiH_UserInfoSwitch", "switchHiGoalInfos userGoalInfo is ", userGoalsInfoC);
            if (userGoalsInfoC != null) {
                arrayList.add(userGoalsInfoC);
            }
        }
        return arrayList;
    }

    public Map<String, String> e(List<HiUserPreference> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap(list.size());
        for (HiUserPreference hiUserPreference : list) {
            map.put(hiUserPreference.getKey(), hiUserPreference.getValue());
        }
        return map;
    }

    public List<HiUserPreference> e(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(map.entrySet().size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            HiUserPreference hiUserPreference = new HiUserPreference();
            hiUserPreference.setKey(entry.getKey());
            hiUserPreference.setValue(entry.getValue());
            hiUserPreference.setSyncStatus(1);
            arrayList.add(hiUserPreference);
        }
        return arrayList;
    }

    private boolean e(int i) {
        if (i >= 1 && i <= 46) {
            return true;
        }
        LogUtil.d("HiH_UserInfoSwitch", "no such goalType, goalType is ", Integer.valueOf(i));
        return false;
    }
}
