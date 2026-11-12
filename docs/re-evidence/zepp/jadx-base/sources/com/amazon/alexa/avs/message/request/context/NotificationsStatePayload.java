package com.amazon.alexa.avs.message.request.context;

import com.amazon.alexa.avs.message.Payload;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationsStatePayload extends Payload {
    private boolean isEnabled;
    private boolean isVisualIndicatorPersisted;

    public NotificationsStatePayload() {
    }

    public boolean getIsEnabled() {
        return this.isEnabled;
    }

    public boolean getIsVisualIndicatorPersisted() {
        return this.isVisualIndicatorPersisted;
    }

    public void setIsEnabled(boolean z) {
        this.isEnabled = z;
    }

    public void setIsVisualIndicatorPersisted(boolean z) {
        this.isVisualIndicatorPersisted = z;
    }

    public NotificationsStatePayload(boolean z, boolean z2) {
        this.isEnabled = z;
        this.isVisualIndicatorPersisted = z2;
    }
}
