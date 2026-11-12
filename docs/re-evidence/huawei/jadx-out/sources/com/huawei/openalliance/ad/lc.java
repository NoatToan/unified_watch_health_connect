package com.huawei.openalliance.ad;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public abstract class lc<R> implements lj<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f19449a;

    protected abstract R a(String str);

    @Override // com.huawei.openalliance.ad.lj
    public R a(int i, InputStream inputStream, long j, kw kwVar) throws IOException {
        String strA = com.huawei.openalliance.ad.utils.df.a(inputStream);
        this.f19449a = System.currentTimeMillis();
        R rA = a(strA);
        if (kwVar != null) {
            kwVar.a(rA);
        }
        return rA;
    }

    @Override // com.huawei.openalliance.ad.lj
    public long a() {
        return this.f19449a;
    }
}
