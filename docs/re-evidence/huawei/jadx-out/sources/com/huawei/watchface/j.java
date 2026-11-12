package com.huawei.watchface;

import com.huawei.watchface.utils.analytice.data.BaseEvent;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class j extends BaseEvent {
    public LinkedHashMap g;
    public String h;

    private LinkedHashMap l() {
        if (this.g == null) {
            this.g = new LinkedHashMap();
        }
        this.g.put("startts", String.valueOf(f()));
        this.g.put("endts", String.valueOf(c()));
        this.g.put("totalTime", String.valueOf(g()));
        this.g.put("url", x3.a(k()));
        return this.g;
    }

    @Override // com.huawei.watchface.s3
    public String a() {
        return "WATCHFACE_PAGE_START";
    }

    @Override // com.huawei.watchface.s3
    public LinkedHashMap b() {
        return l();
    }

    public void d(String str) {
        this.h = str;
    }

    @Override // com.huawei.watchface.utils.analytice.data.BaseEvent
    public void j() {
        super.j();
    }

    public String k() {
        return this.h;
    }
}
