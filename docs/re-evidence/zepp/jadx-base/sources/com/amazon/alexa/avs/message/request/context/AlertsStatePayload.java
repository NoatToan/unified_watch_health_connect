package com.amazon.alexa.avs.message.request.context;

import com.amazon.alexa.avs.Alert;
import com.amazon.alexa.avs.message.Payload;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AlertsStatePayload extends Payload {
    private final List<Alert> activeAlerts;
    private final List<Alert> allAlerts;

    public AlertsStatePayload(List<Alert> list, List<Alert> list2) {
        this.allAlerts = list;
        this.activeAlerts = list2;
    }

    public List<Alert> getActiveAlerts() {
        return this.activeAlerts;
    }

    public List<Alert> getAllAlerts() {
        return this.allAlerts;
    }
}
