package com.xiaomi.hm.health.bt.profile.alert;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class HMAlertModeExt {
    public static final byte TYPE_IGNORE = 4;
    public static final byte TYPE_MODIFY = 3;
    public static final byte TYPE_REMOVE = 2;
    public static final byte TYPE_START = 1;
    public static final byte TYPE_STOP = 0;
    private HMAlertMode a;
    private String b;
    private String c;
    private String d;
    private int e;
    private byte f;
    private int g;
    private boolean h;
    private boolean i;
    private HMAlertApp j;

    public HMAlertModeExt(HMAlertMode mode) {
        this(mode, (String) null, (String) null);
    }

    public HMAlertApp getAlertApp() {
        return this.j;
    }

    public String getAppName() {
        return this.d;
    }

    public int getId() {
        return this.g;
    }

    public String getMessage() {
        if (this.a != HMAlertMode.ALERT_INCALL) {
            return this.c;
        }
        return null;
    }

    public HMAlertMode getMode() {
        return this.a;
    }

    public String getPhoneNo() {
        if (this.a == HMAlertMode.ALERT_INCALL) {
            return this.c;
        }
        return null;
    }

    public String getTitle() {
        return this.b;
    }

    public byte getType() {
        return this.f;
    }

    public int getValue() {
        return this.e;
    }

    public boolean isAlertMaxLength() {
        return this.i;
    }

    public boolean isSupportHangUp() {
        return this.h;
    }

    public void setAlertMaxLength(boolean alertMaxLength) {
        this.i = alertMaxLength;
    }

    public void setAppName(String appName) {
        this.d = appName;
    }

    public void setId(int id) {
        this.g = id;
    }

    public void setMode(HMAlertMode mode) {
        this.a = mode;
    }

    public void setSupportHangUp(boolean supportHangUp) {
        this.h = supportHangUp;
    }

    public void setType(byte type) {
        this.f = type;
    }

    @NotNull
    public String toString() {
        return "HMAlertModeExt{mode=" + this.a + ", mTitle='" + this.b + "', message='" + this.c + "', appName='" + this.d + "', data=" + this.e + ", id=" + this.g + ", type=" + ((int) this.f) + ", mApp=" + this.j + ", supportHangUp=" + this.h + ", isAlterMaxLength" + this.i + '}';
    }

    public HMAlertModeExt(HMAlertApp app) {
        this.a = HMAlertMode.ALERT_FIND;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = (byte) 1;
        this.h = true;
        this.i = false;
        this.j = HMAlertApp.GENERIC;
        this.a = HMAlertMode.ALERT_THIRD_APP;
        this.j = app;
    }

    public HMAlertModeExt(int id, byte type) {
        this.a = HMAlertMode.ALERT_FIND;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = (byte) 1;
        this.h = true;
        this.i = false;
        HMAlertApp hMAlertApp = HMAlertApp.GENERIC;
        this.j = hMAlertApp;
        this.a = HMAlertMode.ALERT_THIRD_APP;
        this.j = hMAlertApp;
        this.g = id;
        this.f = type;
    }

    public HMAlertModeExt(HMAlertApp app, String title, String message) {
        this.a = HMAlertMode.ALERT_FIND;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = (byte) 1;
        this.h = true;
        this.i = false;
        this.j = HMAlertApp.GENERIC;
        this.a = HMAlertMode.ALERT_THIRD_APP;
        this.j = app;
        this.b = title;
        this.c = message;
    }

    public HMAlertModeExt(HMAlertMode mode, String title, boolean supportHangUp) {
        this(mode, title, (String) null);
        this.h = supportHangUp;
    }

    public HMAlertModeExt(HMAlertMode mode, String title, String number, boolean supportHangUp) {
        this(mode, title, number);
        this.h = supportHangUp;
    }

    public HMAlertModeExt(HMAlertMode mode, int value) {
        this.a = HMAlertMode.ALERT_FIND;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = (byte) 1;
        this.h = true;
        this.i = false;
        this.j = HMAlertApp.GENERIC;
        this.a = mode;
        this.e = value;
    }

    public HMAlertModeExt(HMAlertMode mode, String title, byte type) {
        this(mode, title, (String) null, type);
    }

    public HMAlertModeExt(HMAlertMode mode, String title) {
        this(mode, title, (String) null);
    }

    public HMAlertModeExt(HMAlertMode mode, String title, String message) {
        this(mode, title, message, (byte) 1);
    }

    private HMAlertModeExt(HMAlertMode mode, String title, String message, byte type) {
        this.a = HMAlertMode.ALERT_FIND;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = (byte) 1;
        this.h = true;
        this.i = false;
        this.j = HMAlertApp.GENERIC;
        this.a = mode;
        this.b = title;
        this.c = message;
        this.f = type;
    }
}
