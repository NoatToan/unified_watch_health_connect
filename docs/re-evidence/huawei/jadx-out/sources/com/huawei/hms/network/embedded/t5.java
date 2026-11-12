package com.huawei.hms.network.embedded;

import com.huawei.hms.network.netdiag.qoe.QoeMetrics;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class t5 extends QoeMetrics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, Integer> f15395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15396c;

    @Override // com.huawei.hms.network.netdiag.qoe.QoeMetrics
    public boolean isSuccess() {
        return this.f15396c;
    }

    @Override // com.huawei.hms.network.netdiag.qoe.QoeMetrics
    public int getUlRtt() {
        Map<String, Integer> map = this.f15395b;
        if (map == null || !this.f15396c) {
            return Integer.MAX_VALUE;
        }
        return map.get(s5.h + this.f15394a).intValue();
    }

    @Override // com.huawei.hms.network.netdiag.qoe.QoeMetrics
    public int getUlRate() {
        Map<String, Integer> map = this.f15395b;
        if (map == null || !this.f15396c) {
            return Integer.MAX_VALUE;
        }
        return map.get(s5.l + this.f15394a).intValue();
    }

    @Override // com.huawei.hms.network.netdiag.qoe.QoeMetrics
    public int getUlPkgLossRate() {
        Map<String, Integer> map = this.f15395b;
        if (map == null || !this.f15396c) {
            return Integer.MAX_VALUE;
        }
        return map.get(s5.n + this.f15394a).intValue();
    }

    @Override // com.huawei.hms.network.netdiag.qoe.QoeMetrics
    public int getUlBandwidth() {
        Map<String, Integer> map = this.f15395b;
        if (map == null || !this.f15396c) {
            return Integer.MAX_VALUE;
        }
        return map.get(s5.j + this.f15394a).intValue();
    }

    @Override // com.huawei.hms.network.netdiag.qoe.QoeMetrics
    public int getNetQoeLevel() {
        Map<String, Integer> map = this.f15395b;
        if (map == null || !this.f15396c) {
            return Integer.MAX_VALUE;
        }
        return map.get(s5.o + this.f15394a).intValue();
    }

    @Override // com.huawei.hms.network.netdiag.qoe.QoeMetrics
    public int getDlRtt() {
        Map<String, Integer> map = this.f15395b;
        if (map == null || !this.f15396c) {
            return Integer.MAX_VALUE;
        }
        return map.get(s5.i + this.f15394a).intValue();
    }

    @Override // com.huawei.hms.network.netdiag.qoe.QoeMetrics
    public int getDlRate() {
        Map<String, Integer> map = this.f15395b;
        if (map == null || !this.f15396c) {
            return Integer.MAX_VALUE;
        }
        return map.get(s5.m + this.f15394a).intValue();
    }

    @Override // com.huawei.hms.network.netdiag.qoe.QoeMetrics
    public int getDlBandwidth() {
        Map<String, Integer> map = this.f15395b;
        if (map == null || !this.f15396c) {
            return Integer.MAX_VALUE;
        }
        return map.get(s5.k + this.f15394a).intValue();
    }

    @Override // com.huawei.hms.network.netdiag.qoe.QoeMetrics
    public int getChannelNum() {
        Map<String, Integer> map = this.f15395b;
        if (map == null || !this.f15396c) {
            return Integer.MAX_VALUE;
        }
        return map.get(s5.d).intValue();
    }

    @Override // com.huawei.hms.network.netdiag.qoe.QoeMetrics
    public int getChannelIndex() {
        Map<String, Integer> map = this.f15395b;
        if (map == null || !this.f15396c) {
            return Integer.MAX_VALUE;
        }
        return map.get(s5.e + this.f15394a).intValue();
    }

    public t5(Map<String, Integer> map) {
        String str;
        this.f15396c = false;
        this.f15395b = map;
        this.f15396c = map.get("status").intValue() == 1;
        if (map.containsKey("channelIndex0")) {
            str = "0";
        } else {
            if (!map.containsKey("channelIndex2")) {
                this.f15396c = false;
                return;
            }
            str = "2";
        }
        this.f15394a = str;
    }
}
