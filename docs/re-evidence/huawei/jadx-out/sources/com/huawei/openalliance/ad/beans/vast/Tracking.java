package com.huawei.openalliance.ad.beans.vast;

import com.huawei.openalliance.ad.annotations.a;

/* JADX INFO: loaded from: classes12.dex */
public class Tracking {
    private String event;

    @a
    private String url;

    public String a() {
        return this.url;
    }

    public Tracking(String str, String str2) {
        this.url = str;
        this.event = str2;
    }
}
