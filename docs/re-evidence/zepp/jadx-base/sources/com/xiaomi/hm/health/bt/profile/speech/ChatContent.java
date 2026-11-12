package com.xiaomi.hm.health.bt.profile.speech;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes18.dex */
public class ChatContent extends SpeechContent {
    private String b;
    private String c;

    public String getAnswer() {
        return this.c;
    }

    @Override // com.xiaomi.hm.health.bt.profile.speech.SpeechContent
    public byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (!TextUtils.isEmpty(this.b)) {
            byteArrayOutputStream.write(this.b.getBytes(Charset.defaultCharset()), 0, this.b.getBytes(Charset.defaultCharset()).length);
        }
        byteArrayOutputStream.write(0);
        if (!TextUtils.isEmpty(this.c)) {
            byteArrayOutputStream.write(this.c.getBytes(Charset.defaultCharset()), 0, this.c.getBytes(Charset.defaultCharset()).length);
        }
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }

    public String getQuery() {
        return this.b;
    }

    public void setAnswer(String answer) {
        this.c = answer;
    }

    public void setQuery(String query) {
        this.b = query;
    }

    public String toString() {
        return "ChatContent{query='" + this.b + "', answer='" + this.c + "'}";
    }
}
