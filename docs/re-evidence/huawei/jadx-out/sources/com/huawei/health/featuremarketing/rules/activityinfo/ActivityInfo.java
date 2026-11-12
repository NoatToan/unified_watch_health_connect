package com.huawei.health.featuremarketing.rules.activityinfo;

import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class ActivityInfo {
    private final String resultCode;
    private final String resultDesc;
    private final UserActivityInfo userActivityInfo;
    private final List<UserActivityInfo> userActivityInfoList;

    public ActivityInfo(d dVar) {
        this.resultCode = dVar.f6690b;
        this.resultDesc = dVar.e;
        this.userActivityInfo = dVar.f6689a;
        this.userActivityInfoList = dVar.d;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private UserActivityInfo f6689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6690b;
        private List<UserActivityInfo> d;
        private String e;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public String getResultDesc() {
        return this.resultDesc;
    }

    public UserActivityInfo getUserActivityInfo() {
        return this.userActivityInfo;
    }

    public List<UserActivityInfo> getUserActivityInfoList() {
        return this.userActivityInfoList;
    }
}
