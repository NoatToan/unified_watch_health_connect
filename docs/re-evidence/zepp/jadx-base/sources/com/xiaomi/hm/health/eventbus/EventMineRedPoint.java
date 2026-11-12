package com.xiaomi.hm.health.eventbus;

import com.xiaomi.hm.health.keeper.HMKeeper;

/* JADX INFO: loaded from: classes21.dex */
public class EventMineRedPoint {
    public EventMineRedPoint(int serverCode) {
        HMKeeper.keepServerVersion(serverCode);
    }
}
