package com.huami.widget.share;

import androidx.annotation.NonNull;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class ShareContent implements Serializable {
    public String bitmapUrl;
    public String content;
    public String h5ShareType;
    public boolean isValidShare;
    public String longBitmapUrl;
    public String shortBitmapUrl;
    public String title;
    public String topic;
    public String url;

    @NonNull
    public String toString() {
        return "title: " + this.title + "; content: " + this.content + "; url :" + this.url + "; bitmapUrl: " + this.bitmapUrl + "; h5ShareType: " + this.h5ShareType;
    }
}
