package com.huami.ad.entity;

import android.text.TextUtils;
import com.alipay.sdk.m.u.i;

/* JADX INFO: loaded from: classes4.dex */
public class TextLinkEntity {
    public static final String BADGE_AD = "tuiguang";
    public String adMonitor;
    public String badge;
    public int displayCount;
    public String id;
    public int mode;
    public String summary;
    public String supportType;
    public String target;

    public boolean hasBadge() {
        return !TextUtils.isEmpty(this.badge);
    }

    public boolean isAd() {
        return TextUtils.equals(this.badge, BADGE_AD);
    }

    public String toString() {
        return "TextLinkEntity{id:" + this.id + ", summary:" + this.summary + ", badge:" + this.badge + ", target:" + this.target + ", supportType:" + this.supportType + ", mode:" + this.mode + ", displayCount:" + this.displayCount + ", adMonitor:" + this.adMonitor + i.d;
    }
}
