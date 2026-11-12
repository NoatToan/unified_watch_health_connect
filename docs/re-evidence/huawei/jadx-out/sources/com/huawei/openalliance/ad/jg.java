package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.constant.AdLoadMode;

/* JADX INFO: loaded from: classes41.dex */
public class jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f19341a = "jg";

    public static jf a(AdLoadMode adLoadMode, com.huawei.openalliance.ad.views.interfaces.l lVar) {
        hw.b(f19341a, "create ad mediator: %s", adLoadMode);
        return (adLoadMode == AdLoadMode.REAL || adLoadMode == AdLoadMode.REAL_NEW) ? new ji(lVar) : new jh(lVar);
    }
}
