package com.huami.ad.entity;

import com.alipay.sdk.m.u.i;

/* JADX INFO: loaded from: classes4.dex */
public class TextImageEntity {
    public String adMonitor;
    public String describe;
    public int displayCount;
    public long endTime;
    public String id;
    public String image;
    public int mode;
    public String sportTypes;
    public String target;
    public String title;

    public boolean equals(Object obj) {
        if (obj instanceof TextImageEntity) {
            return this.id.equals(((TextImageEntity) obj).id);
        }
        return false;
    }

    public String toString() {
        return "TextImageEntity{id:" + this.id + ", title:" + this.title + ", describe:" + this.describe + ", image:" + this.image + ", endTime:" + this.endTime + ", sportTypes:" + this.sportTypes + ", displayCount:" + this.displayCount + ", target:" + this.target + ", mode:" + this.mode + ", adMonitor:" + this.adMonitor + i.d;
    }
}
