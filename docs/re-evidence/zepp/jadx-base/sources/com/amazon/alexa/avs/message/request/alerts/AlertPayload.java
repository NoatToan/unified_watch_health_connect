package com.amazon.alexa.avs.message.request.alerts;

import com.amazon.alexa.avs.message.Payload;

/* JADX INFO: loaded from: classes2.dex */
public final class AlertPayload extends Payload {
    private final String token;

    public AlertPayload(String str) {
        this.token = str;
    }

    public String getToken() {
        return this.token;
    }
}
