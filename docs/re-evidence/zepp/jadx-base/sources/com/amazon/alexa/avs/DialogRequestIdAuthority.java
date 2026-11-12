package com.amazon.alexa.avs;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class DialogRequestIdAuthority {
    private static final DialogRequestIdAuthority INSTANCE = new DialogRequestIdAuthority();
    private String currentDialogRequestId;

    private DialogRequestIdAuthority() {
    }

    public static DialogRequestIdAuthority getInstance() {
        return INSTANCE;
    }

    public String createNewDialogRequestId() {
        String string = UUID.randomUUID().toString();
        this.currentDialogRequestId = string;
        return string;
    }

    public boolean isCurrentDialogRequestId(String str) {
        String str2 = this.currentDialogRequestId;
        return str2 != null && str2.equals(str);
    }
}
