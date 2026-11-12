package com.huawei.agconnect.apms.collect.model.event.interaction;

import com.google.gson.JsonArray;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.agconnect.apms.collect.model.event.Event;
import com.huawei.agconnect.apms.k0;
import com.huawei.agconnect.apms.mno;

/* JADX INFO: loaded from: classes3.dex */
public class AppStartEvent extends Event {
    private String activityName;
    private long interactionCost;
    private long startCost;
    private String startType;
    private long viewPreparedCost;

    /* JADX INFO: loaded from: classes22.dex */
    public interface StartType {
        public static final String COLD_START = "cold_start";
        public static final String HOT_START = "hot_start";
    }

    public AppStartEvent(long j, String str, String str2, long j2, long j3, long j4) {
        this.timestamp = j;
        this.eventName = EventType.APP_START;
        this.activityName = str;
        this.startType = str2;
        this.startCost = j2;
        this.viewPreparedCost = j3;
        this.interactionCost = j4;
        this.runtimeEnvInformation = Agent.getRuntimeEnvInformation();
    }

    @Override // com.huawei.agconnect.apms.collect.model.event.Event, com.huawei.agconnect.apms.collect.type.CollectableArray, com.huawei.agconnect.apms.collect.type.BaseCollectable, com.huawei.agconnect.apms.collect.type.Collectable
    public JsonArray asJsonArray() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(this.runtimeEnvInformation.asJsonArray());
        mno.abc(this.timestamp, jsonArray);
        jsonArray.add(k0.abc(this.activityName));
        jsonArray.add(k0.abc(this.startType));
        mno.abc(this.startCost, jsonArray);
        mno.abc(this.viewPreparedCost, jsonArray);
        mno.abc(this.interactionCost, jsonArray);
        return jsonArray;
    }
}
