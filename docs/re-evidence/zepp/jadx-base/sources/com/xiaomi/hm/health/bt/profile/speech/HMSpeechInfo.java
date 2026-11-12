package com.xiaomi.hm.health.bt.profile.speech;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes18.dex */
public class HMSpeechInfo {
    private SpeechType a;
    private int b;
    private SpeechContent c;

    public HMSpeechInfo(int id, SpeechType type, SpeechContent content) {
        this.a = SpeechType.CHAT;
        this.b = 0;
        this.c = null;
        this.b = id;
        this.a = type;
        this.c = content;
    }

    public byte[] getBytes() {
        byte[] bytes;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.b);
        byteArrayOutputStream.write(this.a.getValue());
        SpeechContent speechContent = this.c;
        if (speechContent != null && (bytes = speechContent.getBytes()) != null && bytes.length > 0) {
            byteArrayOutputStream.write(bytes, 0, bytes.length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public SpeechContent getContent() {
        return this.c;
    }

    public int getId() {
        return this.b;
    }

    public SpeechType getType() {
        return this.a;
    }

    public String toString() {
        return "HMSpeechInfo{type=" + this.a + ", id=" + this.b + ", content=" + this.c + '}';
    }
}
