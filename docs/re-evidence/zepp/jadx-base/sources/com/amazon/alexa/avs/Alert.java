package com.amazon.alexa.avs;

import com.amazon.alexa.avs.message.response.alerts.SetAlert;

/* JADX INFO: loaded from: classes2.dex */
public class Alert {
    private final String scheduledTime;
    private final String token;
    private final SetAlert.AlertType type;

    public Alert(String str, SetAlert.AlertType alertType, String str2) {
        this.token = str;
        this.type = alertType;
        this.scheduledTime = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Alert alert = (Alert) obj;
        String str = this.token;
        if (str == null) {
            if (alert.token != null) {
                return false;
            }
        } else if (!str.equals(alert.token)) {
            return false;
        }
        return true;
    }

    public String getScheduledTime() {
        return this.scheduledTime;
    }

    public String getToken() {
        return this.token;
    }

    public SetAlert.AlertType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.token;
        return 31 + (str == null ? 0 : str.hashCode());
    }
}
