package com.huawei.hihealthservice.store.interfaces;

import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.HiUserInfo;
import defpackage.kym;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface IUserData {
    HiAccountInfo fetchAccountInfo(kym kymVar);

    List<HiUserInfo> fetchUserData(int i);

    List<HiGoalInfo> getGoalInfo(int i, int i2, int i3);

    boolean hiLogin(HiAccountInfo hiAccountInfo, kym kymVar);

    int hiLogout(kym kymVar);

    boolean setGoalInfo(int i, int i2, HiGoalInfo hiGoalInfo);

    long setUserData(HiUserInfo hiUserInfo, kym kymVar);
}
