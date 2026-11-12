package com.huawei.openalliance.ad.beans.inner;

import android.content.Context;
import com.huawei.openalliance.ad.annotations.d;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dg;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class FenceData {

    @d(a = "bi")
    private List<String> brandIds;

    @d(a = "cc")
    private String cityCode;

    @d(a = "fe")
    private String fenceId;

    @d(a = "ts")
    private Long timestamp;

    public boolean b() {
        if (!dg.b(this.fenceId)) {
            return false;
        }
        Long l = this.timestamp;
        return (l == null || l.longValue() <= 0) && dg.b(this.cityCode) && bm.a(this.brandIds);
    }

    public void a(String str) {
        this.fenceId = str;
    }

    public String a() {
        List<String> list = this.brandIds;
        return list == null ? "" : list.toString();
    }

    public FenceData a(Context context) {
        List<String> listAG = fp.b(context).aG();
        if (!bm.a(listAG)) {
            if (!listAG.contains("fe")) {
                this.fenceId = null;
            }
            if (!listAG.contains("bi")) {
                this.brandIds = null;
            }
            if (!listAG.contains("cc")) {
                this.cityCode = null;
            }
            if (!listAG.contains("ts")) {
                this.timestamp = null;
            }
        }
        return this;
    }
}
