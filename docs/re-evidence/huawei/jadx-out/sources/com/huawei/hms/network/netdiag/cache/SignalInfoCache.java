package com.huawei.hms.network.netdiag.cache;

import android.os.SystemClock;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.LimitQueue;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.network.embedded.e5;
import com.huawei.hms.network.embedded.r4;
import com.huawei.hms.network.netdiag.info.SignalInfoMetrics;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes34.dex */
public class SignalInfoCache extends r4<SignalInfoMetrics, Long> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15789c = "SignalInfoCache";
    public static volatile SignalInfoCache d = new SignalInfoCache();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LimitQueue<SignalInfoMetrics> f15790a = new LimitQueue<>(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SignalInfoMetrics f15791b;

    @Override // com.huawei.hms.network.embedded.r4
    public void updateCacheInfo(Long l) {
        SignalInfoMetrics signalInfoMetricsPeekLast = this.f15790a.peekLast();
        this.f15791b = getSignalInfo(SystemClock.elapsedRealtime());
        if (signalInfoMetricsPeekLast == null || Math.abs(signalInfoMetricsPeekLast.getWifiSignalStrength() - this.f15791b.getWifiSignalStrength()) > 15 || Math.abs(signalInfoMetricsPeekLast.getMobileSignalStrength() - this.f15791b.getMobileSignalStrength()) > 15) {
            this.f15790a.add(this.f15791b);
            return;
        }
        Logger.v(f15789c, "the signal not meet interval!" + this.f15791b.getMobileSignalStrength() + "/" + this.f15791b.getWifiSignalStrength());
    }

    public SignalInfoMetrics peekLastInfo() {
        SignalInfoMetrics signalInfoMetricsPeekLast = this.f15790a.peekLast();
        if (signalInfoMetricsPeekLast != null) {
            return signalInfoMetricsPeekLast;
        }
        Logger.v(f15789c, "the networkInfoMetrics is null,and return new object");
        e5 e5Var = new e5();
        e5Var.a(NetworkUtil.getWifiRssi(ContextHolder.getResourceContext()));
        return e5Var;
    }

    @Override // com.huawei.hms.network.embedded.r4
    public int obtainNetworkQuality(long j, long j2) {
        if (this.f15790a.size() <= 1) {
            return 0;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (int i = 0; i < this.f15790a.size(); i++) {
            SignalInfoMetrics signalInfoMetrics = this.f15790a.get(i);
            if (signalInfoMetrics != null && j <= signalInfoMetrics.getSignalTimeStamp() && signalInfoMetrics.getSignalTimeStamp() <= j2) {
                linkedHashSet.add(Integer.valueOf(signalInfoMetrics.getMobileSignalStrength()));
                linkedHashSet2.add(Integer.valueOf(signalInfoMetrics.getMobileSignalStrength()));
            }
        }
        return (linkedHashSet.size() <= 1 && linkedHashSet2.size() <= 1) ? 0 : 3;
    }

    public e5 getSignalInfo(long j) {
        e5 e5Var = new e5();
        e5Var.a(NetworkUtil.getWifiRssi(ContextHolder.getResourceContext()));
        e5Var.a(j);
        Logger.v(f15789c, e5Var);
        return e5Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.hms.network.embedded.r4
    public SignalInfoMetrics getPeekLastInfo() {
        SignalInfoMetrics signalInfoMetricsPeekLast = this.f15790a.peekLast();
        if (signalInfoMetricsPeekLast != null) {
            return signalInfoMetricsPeekLast;
        }
        Logger.v(f15789c, "the networkInfoMetrics is null,and return new object");
        return new e5();
    }

    public SignalInfoMetrics getLastInfo() {
        SignalInfoMetrics signalInfoMetrics = this.f15791b;
        return signalInfoMetrics != null ? signalInfoMetrics : new e5();
    }

    public static SignalInfoCache getInstance() {
        return d;
    }
}
