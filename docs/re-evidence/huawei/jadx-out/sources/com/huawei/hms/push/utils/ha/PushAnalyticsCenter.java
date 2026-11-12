package com.huawei.hms.push.utils.ha;

/* JADX INFO: loaded from: classes34.dex */
public class PushAnalyticsCenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PushBaseAnalytics f15895a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static PushAnalyticsCenter f15896a = new PushAnalyticsCenter();
    }

    public static PushAnalyticsCenter getInstance() {
        return a.f15896a;
    }

    public PushBaseAnalytics getPushAnalytics() {
        return this.f15895a;
    }

    public void register(PushBaseAnalytics pushBaseAnalytics) {
        this.f15895a = pushBaseAnalytics;
    }
}
