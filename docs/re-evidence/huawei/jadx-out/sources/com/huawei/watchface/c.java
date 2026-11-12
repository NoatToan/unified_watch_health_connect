package com.huawei.watchface;

import com.huawei.watchface.utils.analytice.data.BaseEvent;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class c extends BaseEvent {
    public LinkedHashMap g;

    public c(LinkedHashMap linkedHashMap) {
        this.g = linkedHashMap;
    }

    @Override // com.huawei.watchface.s3
    public String a() {
        return "WATCHFACE_ANR";
    }

    @Override // com.huawei.watchface.s3
    public LinkedHashMap b() {
        return this.g;
    }

    public static void a(LinkedHashMap linkedHashMap) {
        new c(linkedHashMap).j();
    }
}
