package com.service.mi.wallet.entity;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class MediaContent implements Serializable {
    private String contentType;
    private int height;
    private String type;
    private String url;
    private int width;

    public String getContentType() {
        return this.contentType;
    }

    public int getHeight() {
        return this.height;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
