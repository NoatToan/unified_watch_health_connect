package com.huawei.openalliance.ad.inter.data;

import com.huawei.openalliance.ad.utils.dg;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class RewardItem extends BaseRewardItem implements Serializable {
    private static final long serialVersionUID = 30414300;
    private int displayInAd;

    @Override // com.huawei.openalliance.ad.inter.data.BaseRewardItem
    public void setType(String str) {
        this.type = str;
    }

    public void setDisplayInAd(int i) {
        this.displayInAd = i;
    }

    @Override // com.huawei.openalliance.ad.inter.data.BaseRewardItem
    public void setAmount(int i) {
        this.amount = i;
    }

    @Override // com.huawei.openalliance.ad.inter.data.BaseRewardItem
    public String getType() {
        return dg.e(this.type);
    }

    public int getDisplayInAd() {
        return this.displayInAd;
    }

    @Override // com.huawei.openalliance.ad.inter.data.BaseRewardItem
    public int getAmount() {
        return this.amount;
    }
}
