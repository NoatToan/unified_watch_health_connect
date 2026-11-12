package com.huawei.openalliance.ad.inter.data;

/* JADX INFO: loaded from: classes12.dex */
public enum RewardEvent {
    CLOSE("userclose"),
    BACKPRESSED("backpressed");

    private final String event;

    public String a() {
        return this.event;
    }

    RewardEvent(String str) {
        this.event = str;
    }
}
