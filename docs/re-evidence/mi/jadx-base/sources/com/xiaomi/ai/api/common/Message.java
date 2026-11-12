package com.xiaomi.ai.api.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.MessageHeader;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Message<H extends MessageHeader<?>, P> {
    private H header;
    private P payload;

    public Message() {
    }

    public Message(H h, P p) {
        this.header = h;
        this.payload = p;
    }

    public String getFullName() {
        return getHeader().getFullName();
    }

    public H getHeader() {
        return this.header;
    }

    public String getName() {
        return getHeader().getName();
    }

    public String getNamespace() {
        return getHeader().getNamespace();
    }

    public P getPayload() {
        return this.payload;
    }

    public void setHeader(H h) {
        this.header = h;
    }

    public void setPayload(P p) {
        this.payload = p;
    }

    public String toJsonString() throws JsonProcessingException {
        return APIUtils.toJsonString(this);
    }

    public String toString() {
        try {
            return APIUtils.toJsonString(this);
        } catch (JsonProcessingException e) {
            return e.getMessage();
        }
    }
}
