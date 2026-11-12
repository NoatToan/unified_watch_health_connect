package com.xmlywind.sdk.base.models;

import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public class SigImage implements Serializable {
    public int height;
    public String imageUrl;
    public int width;

    public int getHeight() {
        return this.height;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
