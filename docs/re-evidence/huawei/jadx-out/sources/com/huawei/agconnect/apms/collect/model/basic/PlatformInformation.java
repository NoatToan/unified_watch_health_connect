package com.huawei.agconnect.apms.collect.model.basic;

import com.google.gson.JsonArray;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.collect.type.CollectableArray;
import com.huawei.agconnect.apms.k0;

/* JADX INFO: loaded from: classes3.dex */
public class PlatformInformation extends CollectableArray {
    private String osVersion;
    private String romName;
    private String romVersion;
    private String osName = Agent.OS_NAME;
    private String agentName = Agent.NAME;
    private String agentVersion = Agent.VERSION;

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray, com.huawei.agconnect.apms.collect.type.BaseCollectable, com.huawei.agconnect.apms.collect.type.Collectable
    public JsonArray asJsonArray() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(k0.abc(this.osName));
        jsonArray.add(k0.abc(this.osVersion));
        jsonArray.add(k0.abc(this.romName));
        jsonArray.add(k0.abc(this.romVersion));
        jsonArray.add(k0.abc(this.agentName));
        jsonArray.add(k0.abc(this.agentVersion));
        return jsonArray;
    }

    public void setOsName(String str) {
        this.osName = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setRomName(String str) {
        this.romName = str;
    }

    public void setRomVersion(String str) {
        this.romVersion = str;
    }
}
