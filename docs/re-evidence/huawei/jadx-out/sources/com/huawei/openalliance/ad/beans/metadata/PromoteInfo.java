package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.utils.dg;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class PromoteInfo implements Serializable {
    private static final long serialVersionUID = 9086449717970534300L;
    private String name;
    private int type;

    public int getType() {
        return this.type;
    }

    public String getName() {
        return dg.e(this.name);
    }

    public void a(String str) {
        this.name = str;
    }

    public void a(int i) {
        this.type = i;
    }
}
