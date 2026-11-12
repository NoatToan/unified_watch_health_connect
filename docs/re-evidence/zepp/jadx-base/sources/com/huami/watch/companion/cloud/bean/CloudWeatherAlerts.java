package com.huami.watch.companion.cloud.bean;

/* JADX INFO: loaded from: classes16.dex */
public class CloudWeatherAlerts {
    private Alert[] alerts;

    public static class Alert {
        private String alertId;
        private String detail;
        private String level;
        private String locationKey;
        private String pubTime;
        private String title;
        private String type;

        public String getAlertId() {
            return this.alertId;
        }

        public String getDetail() {
            return this.detail;
        }

        public String getLevel() {
            return this.level;
        }

        public String getLocationKey() {
            return this.locationKey;
        }

        public String getPubTime() {
            return this.pubTime;
        }

        public String getTitle() {
            return this.title;
        }

        public String getType() {
            return this.type;
        }

        public void setAlertId(String str) {
            this.alertId = str;
        }

        public void setDetail(String str) {
            this.detail = str;
        }

        public void setLevel(String str) {
            this.level = str;
        }

        public void setLocationKey(String str) {
            this.locationKey = str;
        }

        public void setPubTime(String str) {
            this.pubTime = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    public Alert[] getAlerts() {
        return this.alerts;
    }

    public void setAlerts(Alert[] alertArr) {
        this.alerts = alertArr;
    }
}
