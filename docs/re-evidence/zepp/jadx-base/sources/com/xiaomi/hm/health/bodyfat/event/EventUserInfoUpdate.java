package com.xiaomi.hm.health.bodyfat.event;

import com.xiaomi.hm.health.databases.model.UserInfos;

/* JADX INFO: loaded from: classes19.dex */
public class EventUserInfoUpdate {
    public UserInfos info;

    public EventUserInfoUpdate(UserInfos userInfos) {
        this.info = userInfos;
    }

    public UserInfos getInfo() {
        return this.info;
    }
}
