package com.xmlywind.sdk.base.models;

/* JADX INFO: loaded from: classes22.dex */
public class VideoItem {
    public final int height;
    public final String url;
    public final int width;

    public VideoItem(String str, int i, int i2) {
        this.url = str;
        this.width = i;
        this.height = i2;
    }

    public String toString() {
        return "\"video\":{\"url\"=\"" + this.url + "\", \"width\"=" + this.width + ", \"height\"=" + this.height + '}';
    }
}
