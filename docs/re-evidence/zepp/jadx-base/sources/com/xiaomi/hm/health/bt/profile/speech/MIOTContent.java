package com.xiaomi.hm.health.bt.profile.speech;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes18.dex */
public class MIOTContent extends SpeechContent {
    public static final byte DIALOGUE = 4;
    public static final byte NO_DEVICE = 2;
    public static final byte NO_PERMISSION = 1;
    public static final byte RESERVED = 0;
    public static final byte RESPONSE = 3;
    private byte b;
    private String c;

    public MIOTContent(byte errorCode) {
        this.b = errorCode;
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

    public byte getErrorCode() {
        return this.b;
    }

    public void setContent(String content) {
        this.c = content;
    }

    public void setErrorCode(byte errorCode) {
        this.b = errorCode;
    }

    public String toString() {
        return "MIOTContent{errorCode=" + ((int) this.b) + ", content='" + this.c + "'}";
    }

    public MIOTContent(String response) {
        this.c = response;
    }

    public MIOTContent(byte errorCode, String response) {
        this.b = errorCode;
        this.c = response;
    }
}
