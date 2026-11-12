package com.huawei.ui.main.stories.nps.interactors.mode;

import com.huawei.phoneservice.websurvey.NpsSurveyResponse;

/* JADX INFO: loaded from: classes19.dex */
public class DeviceWebSurveyInfo {
    private String deviceId;
    private int deviceType;
    private NpsSurveyResponse npsSurveyResponse;

    public DeviceWebSurveyInfo(NpsSurveyResponse npsSurveyResponse, String str, int i) {
        this.npsSurveyResponse = npsSurveyResponse;
        this.deviceId = str;
        this.deviceType = i;
    }

    public NpsSurveyResponse getNpsSurveyResponse() {
        return this.npsSurveyResponse;
    }

    public void setNpsSurveyResponse(NpsSurveyResponse npsSurveyResponse) {
        this.npsSurveyResponse = npsSurveyResponse;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public void setDeviceType(int i) {
        this.deviceType = i;
    }
}
