package com.xiaomi.ai.android.capability;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ResourceCapability implements Capability {
    public abstract JSONObject onGetAppList();

    public abstract JSONObject onGetContactList();

    public JSONObject onGetIotData() {
        return null;
    }

    public abstract JSONObject onGetSkillList();

    public abstract JSONObject onGetTopContactList();
}
