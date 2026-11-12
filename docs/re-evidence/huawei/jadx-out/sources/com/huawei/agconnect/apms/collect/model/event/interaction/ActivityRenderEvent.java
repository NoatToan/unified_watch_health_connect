package com.huawei.agconnect.apms.collect.model.event.interaction;

import com.google.gson.JsonArray;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.agconnect.apms.collect.model.event.Event;
import com.huawei.agconnect.apms.k0;
import com.huawei.agconnect.apms.mno;

/* JADX INFO: loaded from: classes3.dex */
public class ActivityRenderEvent extends Event {
    private String activityName;
    private long duration;
    private long frozenFrameNum;
    private long slowFrameNum;
    private long totalFrameNum;

    public ActivityRenderEvent(long j, String str, long j2, long j3, long j4, long j5) {
        this.timestamp = j;
        this.eventName = EventType.ACTIVITY_RENDER;
        this.duration = j2;
        this.activityName = str;
        this.slowFrameNum = j3;
        this.frozenFrameNum = j4;
        this.totalFrameNum = j5;
        this.runtimeEnvInformation = Agent.getRuntimeEnvInformation();
    }

    @Override // com.huawei.agconnect.apms.collect.model.event.Event, com.huawei.agconnect.apms.collect.type.CollectableArray, com.huawei.agconnect.apms.collect.type.BaseCollectable, com.huawei.agconnect.apms.collect.type.Collectable
    public JsonArray asJsonArray() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(this.runtimeEnvInformation.asJsonArray());
        mno.abc(this.timestamp, jsonArray);
        jsonArray.add(k0.abc(this.activityName));
        mno.abc(this.duration, jsonArray);
        mno.abc(this.slowFrameNum, jsonArray);
        mno.abc(this.frozenFrameNum, jsonArray);
        mno.abc(this.totalFrameNum, jsonArray);
        return jsonArray;
    }
}
