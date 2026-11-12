package com.huawei.hms.hihealth.data;

import android.os.Parcelable;
import com.huawei.hms.health.aabq;
import com.huawei.hms.health.aabv;
import com.huawei.hms.health.aabw;
import com.huawei.hms.health.aaby;

/* JADX INFO: loaded from: classes10.dex */
public class aabb extends aabq {
    public static final Parcelable.Creator<aabb> CREATOR = new aabq.aab(aabb.class);

    @aaby(id = 1)
    private String aab;

    @aaby(id = 2)
    private int aaba;

    public String toString() {
        StringBuilder sbAab = com.huawei.hms.health.aab.aab("InterfaceCachePolicy{interfaceName='");
        sbAab.append(this.aab);
        sbAab.append('\'');
        sbAab.append(", cacheTime=");
        sbAab.append(this.aaba);
        sbAab.append('\'');
        sbAab.append('}');
        return sbAab.toString();
    }

    public String aaba() {
        return this.aab;
    }

    public int aab() {
        return this.aaba;
    }

    @aabw
    public aabb(@aabv(id = 1) String str, @aabv(id = 2) int i) {
        this.aab = str;
        this.aaba = i;
    }
}
