package com.huawei.openalliance.ad.beans.inner;

import com.huawei.openalliance.ad.beans.metadata.Content;

/* JADX INFO: loaded from: classes12.dex */
public class ContentFilterParam {
    private int adType;
    private Content content;
    private int filterId;
    private String slotId;

    public int d() {
        return this.adType;
    }

    public int c() {
        return this.filterId;
    }

    public void b(int i) {
        this.adType = i;
    }

    public Content b() {
        return this.content;
    }

    public void a(String str) {
        this.slotId = str;
    }

    public void a(Content content) {
        this.content = content;
    }

    public void a(int i) {
        this.filterId = i;
    }

    public String a() {
        return this.slotId;
    }
}
