package com.amazon.alexa.avs.message.response;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface AttachedContentPayload {
    InputStream getAttachedContent();

    String getAttachedContentId();

    boolean hasAttachedContent();

    boolean requiresAttachedContent();

    void setAttachedContent(String str, InputStream inputStream);
}
