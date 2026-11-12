package com.huawei.watchface;

import com.huawei.watchface.utils.analytice.data.BaseEvent;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes45.dex */
public class d extends BaseEvent {
    public String g;
    public LinkedHashMap h;

    public d(String str, LinkedHashMap linkedHashMap) {
        this.g = str;
        this.h = linkedHashMap;
    }

    @Override // com.huawei.watchface.s3
    public String a() {
        return this.g;
    }

    @Override // com.huawei.watchface.s3
    public LinkedHashMap b() {
        return this.h;
    }
}
