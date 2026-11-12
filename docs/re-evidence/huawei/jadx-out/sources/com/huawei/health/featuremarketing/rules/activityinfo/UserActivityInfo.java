package com.huawei.health.featuremarketing.rules.activityinfo;

/* JADX INFO: loaded from: classes28.dex */
public class UserActivityInfo {
    private final String activityId;
    private final int joinStatus;
    private final long joinTime;
    private final int level;

    public UserActivityInfo(a aVar) {
        this.activityId = aVar.e;
        this.level = aVar.f6692a;
        this.joinStatus = aVar.f6694c;
        this.joinTime = aVar.f6693b;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f6693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f6694c;
        private String e;
    }

    public String getActivityId() {
        return this.activityId;
    }

    public int getLevel() {
        return this.level;
    }

    public int getJoinStatus() {
        return this.joinStatus;
    }

    public long getJoinTime() {
        return this.joinTime;
    }
}
