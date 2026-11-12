package com.amazon.alexa.avs.message.response.system;

import com.amazon.alexa.avs.message.Payload;

/* JADX INFO: loaded from: classes2.dex */
public class SetEndpoint extends Payload {
    private String endpoint;

    public String getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(String str) {
        this.endpoint = str;
    }
}
