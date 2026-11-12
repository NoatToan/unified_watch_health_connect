package com.xiaomi.hm.health.eventbus;

import com.xiaomi.hm.health.model.app_upgrade.MyUpdateInfo;

/* JADX INFO: loaded from: classes21.dex */
public class EventAppUpgrade {
    private MyUpdateInfo a;
    private int b;
    private boolean c;
    private boolean d;
    private int e;

    public EventAppUpgrade(MyUpdateInfo updateInfo, int upgradeType, boolean isPlay, boolean isUserClicked) {
        this.a = updateInfo;
        this.b = upgradeType;
        this.c = isPlay;
        this.d = isUserClicked;
    }

    public MyUpdateInfo getData() {
        return this.a;
    }

    public int getInnerType() {
        return this.e;
    }

    public int getUpgradeType() {
        return this.b;
    }

    public boolean isPlay() {
        return this.c;
    }

    public boolean isUserClicked() {
        return this.d;
    }

    public void setInnerType(int innerType) {
        this.e = innerType;
    }
}
