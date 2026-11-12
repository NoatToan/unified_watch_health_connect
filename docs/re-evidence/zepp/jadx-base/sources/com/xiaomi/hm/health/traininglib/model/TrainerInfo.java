package com.xiaomi.hm.health.traininglib.model;

import com.xiaomi.hm.health.devicelib.DeviceCenter;
import com.xiaomi.hm.health.devicelib.UserData;

/* JADX INFO: loaded from: classes22.dex */
public class TrainerInfo {
    public int age;
    public String avatarPath;
    public String avatarUrl;
    public int gender;
    public boolean hasHrDevice = false;
    public int height;
    public boolean isMetric;
    public boolean isPlay;
    public String name;
    public String uid;
    public float weight;

    public static synchronized TrainerInfo get() {
        UserData userData = UserData.get();
        if (userData == null) {
            return null;
        }
        TrainerInfo trainerInfo = new TrainerInfo();
        trainerInfo.uid = userData.getUid();
        trainerInfo.age = userData.getAge();
        trainerInfo.isMetric = userData.isMetric();
        trainerInfo.weight = userData.getWeight();
        trainerInfo.height = userData.getHeight();
        trainerInfo.isPlay = userData.isPlay();
        trainerInfo.gender = userData.getGender();
        trainerInfo.hasHrDevice = DeviceCenter.getInstance().hasBoundHrDevice();
        trainerInfo.avatarUrl = userData.getAvatarUrl();
        trainerInfo.avatarPath = userData.getAvatarPath();
        trainerInfo.name = userData.getName();
        return trainerInfo;
    }
}
