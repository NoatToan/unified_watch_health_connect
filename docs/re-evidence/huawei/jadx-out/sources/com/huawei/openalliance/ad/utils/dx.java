package com.huawei.openalliance.ad.utils;

import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.tx;

/* JADX INFO: loaded from: classes12.dex */
public class dx {
    public static void a(final AdSlotParam adSlotParam) {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.dx.1
            @Override // java.lang.Runnable
            public void run() {
                Integer numValueOf;
                try {
                    numValueOf = Integer.valueOf(new tx().a());
                } catch (Throwable th) {
                    hw.c("WLACManagerUtils", "getWlacStatus ex: %s", th.getClass().getSimpleName());
                    numValueOf = null;
                }
                AdSlotParam adSlotParam2 = adSlotParam;
                if (adSlotParam2 != null) {
                    adSlotParam2.e(numValueOf);
                }
            }
        });
    }
}
