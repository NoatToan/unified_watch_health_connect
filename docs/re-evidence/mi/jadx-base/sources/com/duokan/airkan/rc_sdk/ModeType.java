package com.duokan.airkan.rc_sdk;

import defpackage.jpe;

/* JADX INFO: loaded from: classes4.dex */
public enum ModeType {
    KEY("KEY", "按键模式"),
    TOUCH("TOUCH", "手势模式"),
    MOUSE("MOUSE", "滑鼠模式"),
    GAMEPAD("GAMEPAD", "手柄模式");

    private final String code;
    private final String modeName;

    ModeType(String str, String str2) {
        this.code = str;
        this.modeName = str2;
    }

    public static ModeType getMode(String str) {
        for (ModeType modeType : values()) {
            if (modeType.code.equals(str.toUpperCase())) {
                jpe.a("modeType", modeType.code);
                return modeType;
            }
        }
        return null;
    }

    public static String getName(String str) {
        for (ModeType modeType : values()) {
            if (modeType.code.equals(str.toUpperCase())) {
                return modeType.modeName;
            }
        }
        return KEY.modeName;
    }

    public String code() {
        return this.code;
    }

    public String modeName() {
        return this.modeName;
    }
}
