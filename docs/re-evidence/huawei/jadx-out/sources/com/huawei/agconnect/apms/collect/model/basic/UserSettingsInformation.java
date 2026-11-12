package com.huawei.agconnect.apms.collect.model.basic;

import com.google.gson.JsonArray;
import com.huawei.agconnect.apms.collect.type.CollectableArray;
import com.huawei.agconnect.apms.k0;

/* JADX INFO: loaded from: classes3.dex */
public class UserSettingsInformation extends CollectableArray {
    private String defaultLanguage;
    private String dns;
    private String timeZone;

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray, com.huawei.agconnect.apms.collect.type.BaseCollectable, com.huawei.agconnect.apms.collect.type.Collectable
    public JsonArray asJsonArray() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(k0.abc(this.timeZone));
        jsonArray.add(k0.abc(this.defaultLanguage));
        jsonArray.add(k0.abc(this.dns));
        return jsonArray;
    }

    public void setDefaultLanguage(String str) {
        this.defaultLanguage = str;
    }

    public void setDns(String str) {
        this.dns = str;
    }

    public void setTimeZone(String str) {
        this.timeZone = str;
    }
}
