package com.huawei.openalliance.ad;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes41.dex */
public class nj extends oa {
    @Override // com.huawei.openalliance.ad.oa
    public void a() {
        long jLongValue = ((Long) com.huawei.openalliance.ad.utils.dj.a(new Callable<Long>() { // from class: com.huawei.openalliance.ad.nj.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Long call() {
                return Long.valueOf(nj.this.f19808a.bb());
            }
        }, 300L)).longValue();
        int iIntValue = ((Integer) com.huawei.openalliance.ad.utils.dj.a(new Callable<Integer>() { // from class: com.huawei.openalliance.ad.nj.2
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                return Integer.valueOf(nj.this.f19808a.aZ());
            }
        }, 2000)).intValue();
        b(jLongValue);
        a(iIntValue);
    }

    public nj(gk gkVar, ht htVar) {
        super(gkVar, htVar);
    }
}
