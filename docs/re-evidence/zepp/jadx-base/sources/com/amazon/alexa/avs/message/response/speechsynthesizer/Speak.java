package com.amazon.alexa.avs.message.response.speechsynthesizer;

import com.amazon.alexa.avs.message.Payload;
import com.amazon.alexa.avs.message.response.AttachedContentPayload;
import com.google.gson.annotations.Expose;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class Speak extends Payload implements AttachedContentPayload {

    @Expose(serialize = false)
    private InputStream attachedContent;
    private String format;
    private String token;
    private String url;

    @Override // com.amazon.alexa.avs.message.response.AttachedContentPayload
    public InputStream getAttachedContent() {
        return this.attachedContent;
    }

    @Override // com.amazon.alexa.avs.message.response.AttachedContentPayload
    public String getAttachedContentId() {
        return this.url.substring(4);
    }

    public String getFormat() {
        return this.format;
    }

    public String getToken() {
        return this.token;
    }

    public String getUrl() {
        return this.url;
    }

    @Override // com.amazon.alexa.avs.message.response.AttachedContentPayload
    public boolean hasAttachedContent() {
        return this.attachedContent != null;
    }

    @Override // com.amazon.alexa.avs.message.response.AttachedContentPayload
    public boolean requiresAttachedContent() {
        return !hasAttachedContent();
    }

    @Override // com.amazon.alexa.avs.message.response.AttachedContentPayload
    public void setAttachedContent(String str, InputStream inputStream) {
        if (getAttachedContentId().equals(str)) {
            this.attachedContent = inputStream;
            return;
        }
        throw new IllegalArgumentException("Tried to add the wrong audio content to a Speak directive. This cid: " + getAttachedContentId() + " other cid: " + str);
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
