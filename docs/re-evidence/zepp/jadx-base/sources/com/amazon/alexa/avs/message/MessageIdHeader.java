package com.amazon.alexa.avs.message;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class MessageIdHeader extends Header {
    private String messageId;

    public MessageIdHeader() {
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final void setMessageId(String str) {
        this.messageId = str;
    }

    @Override // com.amazon.alexa.avs.message.Header
    public String toString() {
        return String.format("%1$s id:%2$s", super.toString(), this.messageId);
    }

    public MessageIdHeader(String str, String str2) {
        super(str, str2);
        this.messageId = UUID.randomUUID().toString();
    }
}
