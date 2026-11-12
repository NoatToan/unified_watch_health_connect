package com.xiaomi.continuity.netbus;

import defpackage.m4q;

/* JADX INFO: loaded from: classes7.dex */
public enum TrustLevel implements m4q {
    UNKNOWN(0),
    SAME_ACCOUNT(16),
    TRUST_GROUP(32),
    EVERY_ONE(48),
    RAW(64);

    private final int mType;

    TrustLevel(int i) {
        this.mType = i;
    }

    public static TrustLevel valueOf(int i) {
        return (TrustLevel) m4q.a(values(), i);
    }

    @Override // defpackage.m4q
    public int getType() {
        return this.mType;
    }
}
