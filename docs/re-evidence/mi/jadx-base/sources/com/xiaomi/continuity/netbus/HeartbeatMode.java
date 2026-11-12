package com.xiaomi.continuity.netbus;

import defpackage.m4q;

/* JADX INFO: loaded from: classes7.dex */
public enum HeartbeatMode implements m4q {
    Normal,
    Low;

    public static HeartbeatMode valueOf(int i) {
        return (HeartbeatMode) m4q.a(values(), i);
    }

    @Override // defpackage.m4q
    public int getType() {
        return ordinal();
    }
}
