package com.huawei.openalliance.ad;

import android.content.Context;

/* JADX INFO: loaded from: classes41.dex */
public class db extends dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gk f18371a;

    @Override // com.huawei.openalliance.ad.dc
    public boolean a() {
        String strB = com.huawei.openalliance.ad.utils.as.b("yyyy-MM-dd");
        int iBc = this.f18371a.bc();
        if (!strB.equals(this.f18371a.be()) || iBc <= 0 || this.f18371a.bd() < iBc) {
            return b();
        }
        hw.b("AppDayFcRule", "isTriggerDisturb true");
        return true;
    }

    public db(Context context) {
        this.f18371a = fp.b(context);
    }
}
