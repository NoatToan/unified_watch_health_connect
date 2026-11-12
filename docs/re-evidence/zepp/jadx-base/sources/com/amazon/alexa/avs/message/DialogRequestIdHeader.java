package com.amazon.alexa.avs.message;

/* JADX INFO: loaded from: classes2.dex */
public class DialogRequestIdHeader extends MessageIdHeader {
    private String dialogRequestId;

    public DialogRequestIdHeader() {
    }

    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    public final void setDialogRequestId(String str) {
        this.dialogRequestId = str;
    }

    @Override // com.amazon.alexa.avs.message.MessageIdHeader, com.amazon.alexa.avs.message.Header
    public String toString() {
        return String.format("%1$s dialogRequestId:%2$s", super.toString(), this.dialogRequestId);
    }

    public DialogRequestIdHeader(String str, String str2, String str3) {
        super(str, str2);
        this.dialogRequestId = str3;
    }
}
