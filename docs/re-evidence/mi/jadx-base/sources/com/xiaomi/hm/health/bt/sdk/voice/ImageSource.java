package com.xiaomi.hm.health.bt.sdk.voice;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class ImageSource implements Serializable {
    private static final long serialVersionUID = 1;
    private String darkBackgroundUrl;
    private long heightPixels;
    private String size;
    private String url;
    private long widthPixels;

    public String getDarkBackgroundUrl() {
        return this.darkBackgroundUrl;
    }

    public long getHeightPixels() {
        return this.heightPixels;
    }

    public String getSize() {
        return this.size;
    }

    public String getUrl() {
        return this.url;
    }

    public long getWidthPixels() {
        return this.widthPixels;
    }

    public void setDarkBackgroundUrl(String str) {
        this.darkBackgroundUrl = str;
    }

    public void setHeightPixels(long j) {
        this.heightPixels = j;
    }

    public void setSize(String str) {
        this.size = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWidthPixels(long j) {
        this.widthPixels = j;
    }
}
