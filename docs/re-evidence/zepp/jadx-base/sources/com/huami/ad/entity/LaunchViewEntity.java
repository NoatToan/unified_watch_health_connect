package com.huami.ad.entity;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class LaunchViewEntity {
    public String adType;
    public String cookie;
    public long endTime;
    public String extensions;
    public long id;
    public String imageUrl;
    public Integer mode;
    public int share;
    public String shareSubtitle;
    public String shareTitle;
    public String shareUrl;
    public long startTime;
    public String title;
    public String url;

    public boolean isGif() {
        return TextUtils.equals("GIF", this.adType);
    }

    public boolean isPic() {
        return TextUtils.equals("PIC", this.adType);
    }

    public boolean isVideo() {
        return TextUtils.equals("VIDEO", this.adType);
    }
}
