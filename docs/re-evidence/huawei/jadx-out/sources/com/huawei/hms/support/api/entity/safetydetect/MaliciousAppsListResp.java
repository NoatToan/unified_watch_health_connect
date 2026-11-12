package com.huawei.hms.support.api.entity.safetydetect;

import com.huawei.hms.support.api.entity.safetydetect.base.BaseResp;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class MaliciousAppsListResp extends BaseResp {
    private ArrayList<MaliciousAppsData> maliciousAppsList = new ArrayList<>();

    public void setMaliciousAppsList(ArrayList<MaliciousAppsData> arrayList) {
        this.maliciousAppsList = arrayList;
    }

    public ArrayList<MaliciousAppsData> getMaliciousAppsList() {
        return this.maliciousAppsList;
    }

    public MaliciousAppsListResp(String str) {
        JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("harmfulAppsList");
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            this.maliciousAppsList.add(new MaliciousAppsData(jSONArrayOptJSONArray.getString(i)));
        }
    }
}
