package com.xiaomi.hm.health.bt.profile.speech;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes18.dex */
public class ErrorContent extends SpeechContent {
    public static final byte TYPE_CUSTOM = -1;
    public static final byte TYPE_NO_CONNECTION = 4;
    public static final byte TYPE_NO_INTENT = 2;
    public static final byte TYPE_NO_REG = 1;
    public static final byte TYPE_TIMEOUT = 3;
    private byte b;
    private String c;

    public ErrorContent(String content) {
        this.b = (byte) 1;
        this.c = content;
    }

    @Override // com.xiaomi.hm.health.bt.profile.speech.SpeechContent
    public byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.b);
        if (!TextUtils.isEmpty(this.c)) {
            byteArrayOutputStream.write(this.c.getBytes(Charset.defaultCharset()), 0, this.c.getBytes(Charset.defaultCharset()).length);
        }
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }

    public String getContent() {
        return this.c;
    }

    public byte getType() {
        return this.b;
    }

    public void setContent(String content) {
        this.c = content;
    }

    public void setType(byte type) {
        this.b = type;
    }

    public ErrorContent(byte type, String content) {
        this.b = (byte) 1;
        this.b = type;
        this.c = content;
    }
}
