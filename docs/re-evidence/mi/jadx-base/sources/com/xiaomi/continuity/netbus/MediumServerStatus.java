package com.xiaomi.continuity.netbus;

import defpackage.m4q;

/* JADX INFO: loaded from: classes7.dex */
public enum MediumServerStatus implements m4q {
    ServerStatusUnknown,
    ServerStatusStarted,
    ServerStatusSysConfigTurnedOff,
    ServerStatusLinkResourceOccupied,
    ServerStatusNoMediumAbility;

    public static MediumServerStatus valueOf(int i) {
        return (MediumServerStatus) m4q.a(values(), i);
    }

    @Override // defpackage.m4q
    public int getType() {
        return ordinal();
    }
}
