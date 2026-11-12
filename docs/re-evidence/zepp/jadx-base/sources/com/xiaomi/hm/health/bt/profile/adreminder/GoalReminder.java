package com.xiaomi.hm.health.bt.profile.adreminder;

import android.text.TextUtils;
import com.alipay.sdk.m.u.i;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public class GoalReminder {
    public static final byte CATEGORY_TEMP_LESS = 1;
    public static final byte CATEGORY_TEMP_MORE = 0;
    public static final byte TYPE_LONG_SIT = 6;
    public static final byte TYPE_MEDAL = 4;
    public static final byte TYPE_SLEEP = 1;
    public static final byte TYPE_SPORT = 2;
    public static final byte TYPE_SPORT_END = 5;
    public static final byte TYPE_STEP = 0;
    public static final byte TYPE_TEMP = 8;
    public static final byte TYPE_TRAIN = 3;
    public static final byte TYPE_WEAHTER = 7;
    private byte a = 0;
    private byte b = 0;
    private Calendar c;
    private Calendar d;
    private String e;
    private String f;
    private byte g;
    private Goal h;

    public byte[] a() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.g);
        byteArrayOutputStream.write(this.b);
        byteArrayOutputStream.write(AdReminder.a(this.c));
        byteArrayOutputStream.write(AdReminder.a(this.d));
        if (!TextUtils.isEmpty(this.e)) {
            byteArrayOutputStream.write(this.e.getBytes());
        }
        byteArrayOutputStream.write(0);
        if (!TextUtils.isEmpty(this.f)) {
            byteArrayOutputStream.write(this.f.getBytes());
        }
        byteArrayOutputStream.write(0);
        byte b = this.g;
        if (b == 5 || b == 6) {
            byteArrayOutputStream.write(GattUtils.intToBytes(this.h.getFlag()));
        } else if (b == 7) {
            byteArrayOutputStream.write(GattUtils.intToBytes(Goal.e));
            byteArrayOutputStream.write(this.h.getValue());
        } else if (b != 8) {
            byteArrayOutputStream.write(this.h.a());
        } else {
            if (this.a == 0) {
                byteArrayOutputStream.write(GattUtils.intToBytes(Goal.c));
            } else {
                byteArrayOutputStream.write(GattUtils.intToBytes(Goal.d));
            }
            byteArrayOutputStream.write(this.h.getValue());
        }
        return byteArrayOutputStream.toByteArray();
    }

    public String getBody() {
        return this.f;
    }

    public Goal getGoal() {
        return this.h;
    }

    public byte getIcon() {
        return this.b;
    }

    public Calendar getStartTime() {
        return this.c;
    }

    public Calendar getStopTime() {
        return this.d;
    }

    public byte getTempCategory() {
        return this.a;
    }

    public String getTitle() {
        return this.e;
    }

    public byte getType() {
        return this.g;
    }

    public void setBody(String body) {
        this.f = body;
    }

    public void setGoal(Goal goal) {
        this.h = goal;
    }

    public void setIcon(byte icon) {
        this.b = icon;
    }

    public void setStartTime(Calendar startTime) {
        this.c = startTime;
    }

    public void setStopTime(Calendar stopTime) {
        this.d = stopTime;
    }

    public void setTempCategory(byte tempCategory) {
        this.a = tempCategory;
    }

    public void setTitle(String title) {
        this.e = title;
    }

    public void setType(byte type) {
        this.g = type;
    }

    public String toString() {
        return "GoalReminder{icon=" + ((int) this.b) + ", startTime=" + this.c.getTime() + ", stopTime=" + this.d.getTime() + ", title=" + this.e + ", type=" + ((int) this.g) + ", goal=" + this.h + i.d;
    }
}
