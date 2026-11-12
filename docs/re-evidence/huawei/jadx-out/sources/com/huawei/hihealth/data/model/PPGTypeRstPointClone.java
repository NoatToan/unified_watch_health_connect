package com.huawei.hihealth.data.model;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class PPGTypeRstPointClone {

    @SerializedName(TtmlNode.END)
    private int end;

    @SerializedName("start")
    private int start;

    public int getStart() {
        return this.start;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public int getEnd() {
        return this.end;
    }

    public void setEnd(int i) {
        this.end = i;
    }
}
