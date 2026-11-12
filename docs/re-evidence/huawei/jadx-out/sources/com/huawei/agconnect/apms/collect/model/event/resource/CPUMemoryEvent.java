package com.huawei.agconnect.apms.collect.model.event.resource;

import com.google.gson.JsonArray;
import com.huawei.agconnect.apms.collect.model.event.Event;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.opq;
import com.huawei.agconnect.apms.yxw;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class CPUMemoryEvent extends Event {
    private static final AgentLog LOG = AgentLogManager.getAgentLog();
    private List<yxw> cpuResourceList = new ArrayList();
    private List<opq> appMemoryResourceList = new ArrayList();

    private JsonArray changeCpuAsJsonArray(List<yxw> list) {
        JsonArray jsonArray = new JsonArray();
        for (yxw yxwVar : list) {
            if (yxwVar != null) {
                jsonArray.add(yxwVar.asJsonArray());
            }
        }
        return jsonArray;
    }

    private JsonArray changeMemoryAsJsonArray(List<opq> list) {
        JsonArray jsonArray = new JsonArray();
        for (opq opqVar : list) {
            if (opqVar != null) {
                jsonArray.add(opqVar.asJsonArray());
            }
        }
        return jsonArray;
    }

    @Override // com.huawei.agconnect.apms.collect.model.event.Event, com.huawei.agconnect.apms.collect.type.CollectableArray, com.huawei.agconnect.apms.collect.type.BaseCollectable, com.huawei.agconnect.apms.collect.type.Collectable
    public JsonArray asJsonArray() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(changeCpuAsJsonArray(this.cpuResourceList));
        jsonArray.add(changeMemoryAsJsonArray(this.appMemoryResourceList));
        return jsonArray;
    }

    public JSONObject changeCpuAndMemoryAsJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cpu", changeCpuAsJsonArray(this.cpuResourceList));
            jSONObject.put("memory", changeMemoryAsJsonArray(this.appMemoryResourceList));
            return jSONObject;
        } catch (JSONException unused) {
            LOG.warn("JSONException while occurrence changeCpuAndMemoryAsJsonObject.");
            return jSONObject;
        }
    }

    public List<opq> getAppMemoryResourceList() {
        return this.appMemoryResourceList;
    }

    public List<yxw> getCpuResourceList() {
        return this.cpuResourceList;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }
}
