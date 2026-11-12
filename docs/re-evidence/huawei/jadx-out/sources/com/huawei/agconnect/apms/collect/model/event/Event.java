package com.huawei.agconnect.apms.collect.model.event;

import com.google.gson.JsonArray;
import com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation;
import com.huawei.agconnect.apms.collect.type.CollectableArray;
import com.huawei.agconnect.apms.k0;
import com.huawei.agconnect.apms.mno;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Event extends CollectableArray {
    public String eventName;
    public RuntimeEnvInformation runtimeEnvInformation;
    public long timestamp;

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray, com.huawei.agconnect.apms.collect.type.BaseCollectable, com.huawei.agconnect.apms.collect.type.Collectable
    public JsonArray asJsonArray() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(this.runtimeEnvInformation.asJsonArray());
        mno.abc(this.timestamp, jsonArray);
        jsonArray.add(k0.abc(this.eventName));
        return jsonArray;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
