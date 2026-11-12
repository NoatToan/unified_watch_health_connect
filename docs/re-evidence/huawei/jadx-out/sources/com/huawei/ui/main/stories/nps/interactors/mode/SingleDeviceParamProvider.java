package com.huawei.ui.main.stories.nps.interactors.mode;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class SingleDeviceParamProvider implements DeviceParamProvider {
    private String deviceActivatedTime;
    private String externalModel;
    private String odid;
    private String romVersion;

    public SingleDeviceParamProvider(String str, String str2, String str3, String str4) {
        this.romVersion = str;
        this.odid = str2;
        this.deviceActivatedTime = str3;
        this.externalModel = str4;
    }

    @Override // com.huawei.ui.main.stories.nps.interactors.mode.DeviceParamProvider
    public Map<String, String> getSpecificParams() {
        HashMap map = new HashMap();
        map.put("appVersion", "100101621");
        map.put("romVersion", this.romVersion);
        map.put(WebSurveyRequestParam.ODID, this.odid);
        map.put(WebSurveyRequestParam.DEVICE_ACTIVATED_TIME, this.deviceActivatedTime);
        map.put(WebSurveyRequestParam.EXTERNAL_MODEL, this.externalModel);
        return map;
    }

    public String getRomVersion() {
        return this.romVersion;
    }

    public String getOdid() {
        return this.odid;
    }

    public String getDeviceActivatedTime() {
        return this.deviceActivatedTime;
    }

    public String getExternalModel() {
        return this.externalModel;
    }
}
