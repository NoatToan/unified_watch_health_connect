package com.huawei.openalliance.ad;

import android.content.Context;

/* JADX INFO: loaded from: classes41.dex */
public class dd extends dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gk f18376a;

    @Override // com.huawei.openalliance.ad.dc
    public boolean a() {
        if (this.f18376a.bi() < com.huawei.openalliance.ad.utils.as.c()) {
            return b();
        }
        hw.b("UserCloseRule", "isTriggerDisturb true");
        return true;
    }

    public dd(Context context) {
        this.f18376a = fp.b(context);
    }
}
