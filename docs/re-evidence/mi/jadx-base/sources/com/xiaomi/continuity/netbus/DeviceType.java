package com.xiaomi.continuity.netbus;

import defpackage.m4q;

/* JADX INFO: loaded from: classes7.dex */
public enum DeviceType implements m4q {
    NONE,
    PHONE,
    PAD,
    TV,
    PC,
    SOUND,
    VELA_WEAR,
    VELA_SOUND,
    MI_AUTOMOTIVE;

    public static DeviceType parse(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return NONE;
        }
    }

    public static DeviceType valueOf(int i) {
        return (DeviceType) m4q.a(values(), i);
    }

    @Override // defpackage.m4q
    public int getType() {
        return ordinal();
    }
}
