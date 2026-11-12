package com.huawei.hms.common;

/* JADX INFO: loaded from: classes2.dex */
public enum HmsCheckedState {
    UNCHECKED(0),
    NOT_NEED_UPDATE(1),
    NEED_UPDATE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13005a;

    HmsCheckedState(int i) {
        this.f13005a = i;
    }

    public int getState() {
        return this.f13005a;
    }
}
