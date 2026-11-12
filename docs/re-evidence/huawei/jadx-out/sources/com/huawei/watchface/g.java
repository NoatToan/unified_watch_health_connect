package com.huawei.watchface;

import com.huawei.watchface.utils.analytice.data.BaseEvent;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class g extends BaseEvent {
    public LinkedHashMap g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;

    private LinkedHashMap q() {
        if (this.g == null) {
            this.g = new LinkedHashMap();
        }
        this.g.put("startts", String.valueOf(f()));
        this.g.put("endts", String.valueOf(c()));
        this.g.put("totalTime", String.valueOf(g()));
        this.g.put("errorCode", d());
        this.g.put(BaseEvent.KEY_DESCINFO, k());
        this.g.put("protocal", n());
        this.g.put("url", p());
        this.g.put("pagePosition", m());
        this.g.put("pageName", l());
        return this.g;
    }

    @Override // com.huawei.watchface.s3
    public String a() {
        return "WATCHFACE_LOAD_H5";
    }

    @Override // com.huawei.watchface.s3
    public LinkedHashMap b() {
        return q();
    }

    public void d(String str) {
        this.h = str;
    }

    public void e(String str) {
        this.i = str;
    }

    public void f(String str) {
        this.k = str;
    }

    public void g(String str) {
        this.j = str;
    }

    @Override // com.huawei.watchface.utils.analytice.data.BaseEvent
    public void j() {
        super.j();
    }

    public String k() {
        return this.h;
    }

    public String l() {
        return this.m;
    }

    public String m() {
        return this.l;
    }

    public String n() {
        return this.i;
    }

    public String o() {
        return this.k;
    }

    public String p() {
        return this.j;
    }

    public void a(int i, String str) {
        d(str);
        f(String.valueOf(i));
    }
}
