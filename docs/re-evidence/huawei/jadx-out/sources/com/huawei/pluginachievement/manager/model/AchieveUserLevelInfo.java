package com.huawei.pluginachievement.manager.model;

import defpackage.osf;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveUserLevelInfo extends osf {
    private long syncTimestamp;
    private int userExperience;
    private int userLevel;
    private double userReachDays;

    public AchieveUserLevelInfo() {
        super(14);
    }

    public int acquireUserLevel() {
        return this.userLevel;
    }

    public void saveUserLevel(int i) {
        this.userLevel = i;
    }

    public int acquireUserExperience() {
        return this.userExperience;
    }

    public void saveUserExperience(int i) {
        this.userExperience = i;
    }

    public double acquireUserReachDays() {
        return this.userReachDays;
    }

    public void saveUserReachDays(double d) {
        this.userReachDays = d;
    }

    public long acquireSyncTimestamp() {
        return this.syncTimestamp;
    }

    public void saveSyncTimestamp(long j) {
        this.syncTimestamp = j;
    }

    public String toString() {
        return "AchieveUserLevelInfo{userLevel=" + this.userLevel + ", userExperience=" + this.userExperience + ", userReachDays=" + this.userReachDays + ", syncTimestamp=" + this.syncTimestamp + '}';
    }
}
