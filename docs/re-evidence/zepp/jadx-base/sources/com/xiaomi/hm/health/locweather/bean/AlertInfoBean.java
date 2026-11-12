package com.xiaomi.hm.health.locweather.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class AlertInfoBean {

    @SerializedName("alerts")
    private List<AlertsBean> a;

    public static class AlertsBean {

        @SerializedName("locationKey")
        private String a;

        @SerializedName("alertId")
        private String b;

        @SerializedName("pubTime")
        private String c;

        @SerializedName("title")
        private String d;

        @SerializedName("type")
        private String e;

        @SerializedName(FirebaseAnalytics.Param.LEVEL)
        private String f;

        @SerializedName("detail")
        private String g;

        @SerializedName("icon")
        private String h;

        public String getAlertId() {
            return this.b;
        }

        public String getDetail() {
            return this.g;
        }

        public String getIcon() {
            return this.h;
        }

        public String getLevel() {
            return this.f;
        }

        public String getLocationKey() {
            return this.a;
        }

        public String getPubTime() {
            return this.c;
        }

        public String getTitle() {
            return this.d;
        }

        public String getType() {
            return this.e;
        }

        public void setAlertId(String str) {
            this.b = str;
        }

        public void setDetail(String str) {
            this.g = str;
        }

        public void setIcon(String str) {
            this.h = str;
        }

        public void setLevel(String str) {
            this.f = str;
        }

        public void setLocationKey(String str) {
            this.a = str;
        }

        public void setPubTime(String str) {
            this.c = str;
        }

        public void setTitle(String str) {
            this.d = str;
        }

        public void setType(String str) {
            this.e = str;
        }
    }

    public List<AlertsBean> getAlerts() {
        return this.a;
    }

    public void setAlerts(List<AlertsBean> list) {
        this.a = list;
    }
}
