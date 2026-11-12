package com.huawei.phoneservice.websurvey;

import com.google.gson.annotations.SerializedName;
import com.huawei.ui.main.stories.nps.interactors.mode.WebSurveyRequestParam;

/* JADX INFO: loaded from: classes13.dex */
public class NpsSurveyResponse {

    @SerializedName(WebSurveyRequestParam.ACTIVATED_TIME)
    private String activatedTime;

    @SerializedName("firstTime")
    private String firstTime;

    @SerializedName("keepAliveDays")
    private String keepAliveDays;

    @SerializedName("keepAliveTime")
    private String keepAliveTime;

    @SerializedName("model")
    private String model;

    @SerializedName("notificationContent")
    private String notificationContent;

    @SerializedName("notificationTitle")
    private String notificationTitle;

    @SerializedName("npsLink")
    private String npsLink;

    @SerializedName("pushTimeWindow")
    private String pushTimeWindow;

    @SerializedName("pushWindow")
    private String pushWindow;

    @SerializedName("surveyReqCycleTime")
    private String surveyReqCycleTime;

    public void setSurveyReqCycleTime(String str) {
        this.surveyReqCycleTime = str;
    }

    public void setPushWindow(String str) {
        this.pushWindow = str;
    }

    public void setPushTimeWindow(String str) {
        this.pushTimeWindow = str;
    }

    public void setNpsLink(String str) {
        this.npsLink = str;
    }

    public void setNotificationTitle(String str) {
        this.notificationTitle = str;
    }

    public void setNotificationContent(String str) {
        this.notificationContent = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setKeepAliveTime(String str) {
        this.keepAliveTime = str;
    }

    public void setKeepAliveDays(String str) {
        this.keepAliveDays = str;
    }

    public void setFirstTime(String str) {
        this.firstTime = str;
    }

    public void setActivatedTime(String str) {
        this.activatedTime = str;
    }

    public String getSurveyReqCycleTime() {
        return this.surveyReqCycleTime;
    }

    public String getPushWindow() {
        return this.pushWindow;
    }

    public String getPushTimeWindow() {
        return this.pushTimeWindow;
    }

    public String getNpsLink() {
        return this.npsLink;
    }

    public String getNotificationTitle() {
        return this.notificationTitle;
    }

    public String getNotificationContent() {
        return this.notificationContent;
    }

    public String getModel() {
        return this.model;
    }

    public String getKeepAliveTime() {
        return this.keepAliveTime;
    }

    public String getKeepAliveDays() {
        return this.keepAliveDays;
    }

    public String getFirstTime() {
        return this.firstTime;
    }

    public String getActivatedTime() {
        return this.activatedTime;
    }
}
