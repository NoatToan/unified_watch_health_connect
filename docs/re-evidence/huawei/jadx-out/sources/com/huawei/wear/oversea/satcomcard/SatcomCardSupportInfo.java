package com.huawei.wear.oversea.satcomcard;

/* JADX INFO: loaded from: classes20.dex */
public class SatcomCardSupportInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f30711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30712b;
    private int e;

    /* JADX INFO: loaded from: classes46.dex */
    public interface ActivityPeriodConstant {
        public static final int ACTIVITY_PERIOD_FORMAL = 2;
        public static final int ACTIVITY_PERIOD_MASSTEST = 1;
        public static final int ACTIVITY_PERIOD_STOP = 0;
    }

    public boolean b() {
        return this.f30711a;
    }

    public void e(boolean z) {
        this.f30711a = z;
    }

    public int d() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public int e() {
        return this.f30712b;
    }

    public void c(int i) {
        this.f30712b = i;
    }

    public String toString() {
        return "SatcomCardSupportInfo{isSupportSatcomCard=" + this.f30711a + ", activityPeriod=" + this.e + ", returnCode=" + this.f30712b + '}';
    }
}
