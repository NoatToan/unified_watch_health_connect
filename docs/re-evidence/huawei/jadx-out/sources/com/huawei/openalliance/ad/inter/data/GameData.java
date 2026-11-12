package com.huawei.openalliance.ad.inter.data;

/* JADX INFO: loaded from: classes41.dex */
public class GameData {
    private String pkgName;
    private long timestamp;

    public long getRecentPlayedTime() {
        return this.timestamp;
    }

    public String getGamePkgName() {
        return this.pkgName;
    }
}
