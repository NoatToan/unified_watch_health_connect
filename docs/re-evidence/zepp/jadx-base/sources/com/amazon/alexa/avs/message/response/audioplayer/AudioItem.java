package com.amazon.alexa.avs.message.response.audioplayer;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioItem {
    private String audioItemId;
    private Stream stream;

    public String getAudioItemId() {
        return this.audioItemId;
    }

    public Stream getStream() {
        return this.stream;
    }

    public void setAudioItemId(String str) {
        this.audioItemId = str;
    }

    public void setStream(Stream stream) {
        this.stream = stream;
    }
}
