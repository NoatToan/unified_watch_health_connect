package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.a;
import com.huawei.openalliance.ad.annotations.d;
import com.huawei.openalliance.ad.beans.inner.FenceData;

/* JADX INFO: loaded from: classes12.dex */
public class ExtraReqField {

    @d(a = "feBrand")
    @a
    private FenceData fence;

    public void a(FenceData fenceData) {
        this.fence = fenceData;
    }
}
