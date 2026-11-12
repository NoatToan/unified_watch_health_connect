package com.huawei.health.hwhealthlinkage.linkage.parsedata;

import defpackage.eed;
import defpackage.oax;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public interface LinkageDataHandler {
    void handle(double d, oax oaxVar);

    void reset();

    default eed packageSamplePointInfo(JSONObject jSONObject, String str, int i) {
        return new eed();
    }
}
