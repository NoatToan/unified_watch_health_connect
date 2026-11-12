package com.xiaomi.hm.health.reminder;

/* JADX INFO: loaded from: classes21.dex */
public class ReminderExt {
    public static final int FROM_AWATCH = 1;
    public static final int FROM_CLOUD = 2;
    public static final int FROM_MIFIT = 0;
    public static final int FROM_UNKNOWN = -1;
    public static final int OP_CLOSE = 0;
    public static final int OP_DELETE = 2;
    public static final int OP_OPEN = 1;
    public static final int OP_UNKNOWN = -1;
    public static final int VIB_TYPE_ALARM = 1;
    public static final int VIB_TYPE_REMINDER = 0;
    public int a = -1;
    public int b = 2;
    public int c = -1;
    public String d = null;
    public String e = null;
    public String f = null;
    public String g = null;
    public String h = null;
    public int i = 0;

    public String getBody() {
        return this.h;
    }

    public int getFrom() {
        return this.b;
    }

    public int getId() {
        return this.a;
    }

    public String getLoop() {
        return this.d;
    }

    public int getOp() {
        return this.c;
    }

    public String getStartDate() {
        return this.e;
    }

    public String getStopDate() {
        return this.f;
    }

    public String getTitle() {
        return this.g;
    }

    public int getVibrateType() {
        return this.i;
    }

    public void setBody(String str) {
        this.h = str;
    }

    public void setFrom(int i) {
        this.b = i;
    }

    public void setId(int i) {
        this.a = i;
    }

    public void setLoop(String str) {
        this.d = str;
    }

    public void setOp(int i) {
        this.c = i;
    }

    public void setStartDate(String str) {
        this.e = str;
    }

    public void setStopDate(String str) {
        this.f = str;
    }

    public void setTitle(String str) {
        this.g = str;
    }

    public void setVibrateType(int i) {
        this.i = i;
    }

    public String toString() {
        return "ReminderExt{id=" + this.a + ", from=" + this.b + ", op=" + this.c + ", loop='" + this.d + "', startDate='" + this.e + "', stopDate='" + this.f + "', title='" + this.g + "', body='" + this.h + "'}";
    }
}
