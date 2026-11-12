package com.xiaomi.hm.health.bt.profile.speech;

import android.text.TextUtils;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes18.dex */
public class AlarmContent extends SpeechContent {
    public static final byte STATE_FULL = 3;
    public static final byte TYPE_CREATE = 1;
    public static final byte TYPE_INVALID = 2;
    public static final byte TYPE_UNKNOWN = 0;
    private byte b = 0;
    private AlarmClockExt c;
    private String d;

    public AlarmClockExt getAlarm() {
        return this.c;
    }

    @Override // com.xiaomi.hm.health.bt.profile.speech.SpeechContent
    public byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.b);
        AlarmClockExt alarmClockExt = this.c;
        if (alarmClockExt != null) {
            byte[] bytes = alarmClockExt.getBytes();
            Debug.fi(SpeechContent.a, "cmd:" + GattUtils.bytesToHexString(bytes));
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

    public byte getType() {
        return this.b;
    }

    public void setAlarm(AlarmClockExt alarm) {
        this.c = alarm;
    }

    public void setContent(String content) {
        this.d = content;
    }

    public void setType(byte type) {
        this.b = type;
    }

    public String toString() {
        return "AlarmContent{type=" + ((int) this.b) + ", alarm=" + this.c + ", content='" + this.d + "'}";
    }
}
