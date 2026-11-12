package com.xiaomi.hm.health.bt.profile.speech;

import android.text.TextUtils;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes18.dex */
public class ReminderContent extends SpeechContent {
    public static final byte TYPE_CREATE = 1;
    public static final byte TYPE_DIALOGUE = 2;
    public static final byte TYPE_FULL = 3;
    private byte b = 1;
    private HMReminderInfo c = null;
    private String d = null;

    @Override // com.xiaomi.hm.health.bt.profile.speech.SpeechContent
    public byte[] getBytes() {
        byte[] bytes;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.b);
        HMReminderInfo hMReminderInfo = this.c;
        if (hMReminderInfo != null && (bytes = hMReminderInfo.getBytes()) != null && bytes.length > 0) {
            byteArrayOutputStream.write(bytes, 0, bytes.length);
        }
        if (!TextUtils.isEmpty(this.d)) {
            byteArrayOutputStream.write(this.d.getBytes(Charset.defaultCharset()), 0, this.d.getBytes(Charset.defaultCharset()).length);
        }
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }

    public String getContent() {
        return this.d;
    }

    public HMReminderInfo getReminderInfo() {
        return this.c;
    }

    public byte getType() {
        return this.b;
    }

    public void setContent(String content) {
        this.d = content;
    }

    public void setReminderInfo(HMReminderInfo reminderInfo) {
        this.c = reminderInfo;
    }

    public void setType(byte type) {
        this.b = type;
    }
}
