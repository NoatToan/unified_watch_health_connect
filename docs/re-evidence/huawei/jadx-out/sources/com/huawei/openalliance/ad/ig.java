package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.magazine.inter.MagLockAd;
import com.huawei.openalliance.ad.magazine.inter.MagLockAdInfo;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class ig implements MagLockAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<MagLockAd> f18955b;

    public String toString() {
        return "MagLockAdInfoImpl [multiAds=" + this.f18955b + ", code=" + this.f18954a + "]";
    }

    @Override // com.huawei.openalliance.ad.magazine.inter.MagLockAdInfo
    public void setRetCode(int i) {
        this.f18954a = i;
    }

    @Override // com.huawei.openalliance.ad.magazine.inter.MagLockAdInfo
    public void setMultiAds(List<MagLockAd> list) {
        this.f18955b = list;
    }

    @Override // com.huawei.openalliance.ad.magazine.inter.MagLockAdInfo
    public int getRetCode() {
        return this.f18954a;
    }

    @Override // com.huawei.openalliance.ad.magazine.inter.MagLockAdInfo
    public List<MagLockAd> getMultiAds() {
        return this.f18955b;
    }
}
