package com.huawei.openalliance.ad.inter.data;

import com.huawei.openalliance.ad.utils.dg;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class BaseRewardItem implements Serializable {
    private static final long serialVersionUID = 30414300;
    protected int amount;
    protected String type;

    public void setType(String str) {
        this.type = str;
    }

    public void setAmount(int i) {
        this.amount = i;
    }

    public String getType() {
        return dg.e(this.type);
    }

    public int getAmount() {
        return this.amount;
    }
}
