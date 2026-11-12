package com.huawei.openalliance.ad.inter.data;

/* JADX INFO: loaded from: classes41.dex */
public enum PlacementEvent {
    VIP("clickvip"),
    CLOSE("userclose");

    private final String event;

    public String a() {
        return this.event;
    }

    PlacementEvent(String str) {
        this.event = str;
    }
}
