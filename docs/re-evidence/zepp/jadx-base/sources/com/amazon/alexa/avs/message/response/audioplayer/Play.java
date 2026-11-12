package com.amazon.alexa.avs.message.response.audioplayer;

import com.amazon.alexa.avs.message.Payload;
import com.amazon.alexa.avs.message.response.AttachedContentPayload;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class Play extends Payload implements AttachedContentPayload {
    private AudioItem audioItem;
    private PlayBehavior playBehavior;

    public enum PlayBehavior {
        REPLACE_ALL,
        ENQUEUE,
        REPLACE_ENQUEUED
    }

    @Override // com.amazon.alexa.avs.message.response.AttachedContentPayload
    public InputStream getAttachedContent() {
        return this.audioItem.getStream().getAttachedContent();
    }

    @Override // com.amazon.alexa.avs.message.response.AttachedContentPayload
    public String getAttachedContentId() {
        if (requiresAttachedContent()) {
            return this.audioItem.getStream().getUrl();
        }
        return null;
    }

    public AudioItem getAudioItem() {
        return this.audioItem;
    }

    public PlayBehavior getPlayBehavior() {
        return this.playBehavior;
    }

    @Override // com.amazon.alexa.avs.message.response.AttachedContentPayload
    public boolean hasAttachedContent() {
        return this.audioItem.getStream().hasAttachedContent();
    }

    @Override // com.amazon.alexa.avs.message.response.AttachedContentPayload
    public boolean requiresAttachedContent() {
        return this.audioItem.getStream().requiresAttachedContent();
    }

    @Override // com.amazon.alexa.avs.message.response.AttachedContentPayload
    public void setAttachedContent(String str, InputStream inputStream) {
        if (getAttachedContentId().equals(str)) {
            this.audioItem.getStream().setAttachedContent(inputStream);
            return;
        }
        throw new IllegalArgumentException("Tried to add the wrong audio content to a Play directive. This cid: " + getAttachedContentId() + " other cid: " + str);
    }

    public void setAudioItem(AudioItem audioItem) {
        this.audioItem = audioItem;
    }

    public void setPlayBehavior(String str) {
        this.playBehavior = PlayBehavior.valueOf(str);
    }
}
