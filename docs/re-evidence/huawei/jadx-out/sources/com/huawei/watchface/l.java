package com.huawei.watchface;

import com.huawei.watchface.utils.analytice.data.BaseEvent;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class l extends BaseEvent {
    public LinkedHashMap g;

    public l(LinkedHashMap linkedHashMap) {
        this.g = linkedHashMap;
    }

    private LinkedHashMap k() {
        if (this.g == null) {
            this.g = new LinkedHashMap();
        }
        return this.g;
    }

    @Override // com.huawei.watchface.s3
    public String a() {
        return "WATCHFACE_TLV";
    }

    @Override // com.huawei.watchface.s3
    public LinkedHashMap b() {
        return k();
    }
}
