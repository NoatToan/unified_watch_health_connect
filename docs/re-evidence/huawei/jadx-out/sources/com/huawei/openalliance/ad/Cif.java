package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.magazine.inter.MagLockAd;
import com.huawei.openalliance.ad.magazine.inter.MagLockAdContent;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.openalliance.ad.if, reason: invalid class name */
/* JADX INFO: loaded from: classes41.dex */
public class Cif implements MagLockAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f18952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<MagLockAdContent> f18953c;

    public String toString() {
        return "MagLockAdImpl [slotId=" + this.f18952b + ", contentList=" + this.f18953c + ", code=" + this.f18951a + "]";
    }

    @Override // com.huawei.openalliance.ad.magazine.inter.MagLockAd
    public void setSlotId(String str) {
        this.f18952b = str;
    }

    @Override // com.huawei.openalliance.ad.magazine.inter.MagLockAd
    public void setRetCode(int i) {
        this.f18951a = i;
    }

    @Override // com.huawei.openalliance.ad.magazine.inter.MagLockAd
    public void setAdList(List<MagLockAdContent> list) {
        this.f18953c = list;
    }

    @Override // com.huawei.openalliance.ad.magazine.inter.MagLockAd
    public String getSlotId() {
        return this.f18952b;
    }

    @Override // com.huawei.openalliance.ad.magazine.inter.MagLockAd
    public int getRetCode() {
        return this.f18951a;
    }

    @Override // com.huawei.openalliance.ad.magazine.inter.MagLockAd
    public List<MagLockAdContent> getAdList() {
        return this.f18953c;
    }
}
