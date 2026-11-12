package com.xiaomi.hm.health.model.app_upgrade;

import com.xiaomi.market.sdk.UpdateResponse;

/* JADX INFO: loaded from: classes21.dex */
public class MyUpdateInfo extends UpdateResponse {
    public int areaType;
    public String path;
    public String updateLog;
    public String versionTitle;

    public String toString() {
        return "\n----------------\nversionTitle:" + this.versionTitle + "\nupdateLog:" + this.updateLog + "\npath:" + this.path + "\nareaType:" + this.areaType + "\n----------------\n";
    }
}
