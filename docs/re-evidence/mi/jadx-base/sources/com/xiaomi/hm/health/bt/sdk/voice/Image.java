package com.xiaomi.hm.health.bt.sdk.voice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class Image implements Serializable {
    private static final long serialVersionUID = 1;
    private String contentDescription = "";
    private List<ImageSource> sources = new ArrayList();

    public String getContentDescription() {
        return this.contentDescription;
    }

    public List<ImageSource> getSources() {
        return this.sources;
    }

    public void setContentDescription(String str) {
        this.contentDescription = str;
    }

    public void setSources(List<ImageSource> list) {
        this.sources = list;
    }
}
