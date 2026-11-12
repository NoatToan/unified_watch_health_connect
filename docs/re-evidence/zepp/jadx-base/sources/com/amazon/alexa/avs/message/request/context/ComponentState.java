package com.amazon.alexa.avs.message.request.context;

import com.amazon.alexa.avs.message.Header;
import com.amazon.alexa.avs.message.Payload;

/* JADX INFO: loaded from: classes2.dex */
public class ComponentState {
    private Header header;
    private Payload payload;

    public ComponentState(Header header, Payload payload) {
        this.header = header;
        this.payload = payload;
    }

    public Header getHeader() {
        return this.header;
    }

    public Payload getPayload() {
        return this.payload;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }
}
