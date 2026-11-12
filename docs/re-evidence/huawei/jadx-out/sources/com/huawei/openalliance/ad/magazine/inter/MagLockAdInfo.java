package com.huawei.openalliance.ad.magazine.inter;

import com.huawei.openalliance.ad.ig;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public interface MagLockAdInfo {
    List<MagLockAd> getMultiAds();

    int getRetCode();

    void setMultiAds(List<MagLockAd> list);

    void setRetCode(int i);

    public static final class Builder {
        public final MagLockAdInfo build() {
            return new ig();
        }
    }
}
