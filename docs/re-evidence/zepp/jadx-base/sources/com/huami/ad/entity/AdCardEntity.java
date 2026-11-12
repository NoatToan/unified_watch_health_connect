package com.huami.ad.entity;

import com.alipay.sdk.m.u.i;

/* JADX INFO: loaded from: classes4.dex */
public class AdCardEntity {
    public String adMonitor;
    public int displayCount;
    public String iconUrl;
    public String id;
    public String imageUrl;
    public boolean isMessageAd;
    public int mode;
    public int status;
    public String target;
    public String title;

    public String toString() {
        return "AdCardEntity{id:" + this.id + ", title:" + this.title + ", imageUrl:" + this.imageUrl + ", iconUrl:" + this.iconUrl + ", target:" + this.target + ", status:" + this.status + ", displayCount:" + this.displayCount + ", mode:" + this.mode + ", isMessageAd:" + this.isMessageAd + ", adMonitor:" + this.adMonitor + i.d;
    }
}
