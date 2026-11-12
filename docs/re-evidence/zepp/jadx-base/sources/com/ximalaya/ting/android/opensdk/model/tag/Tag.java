package com.ximalaya.ting.android.opensdk.model.tag;

import com.google.gson.annotations.SerializedName;
import com.huami.watch.companion.ximalaya.XimalayaConst;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;

/* JADX INFO: loaded from: classes22.dex */
public class Tag {

    @SerializedName(XimalayaConst.KIND)
    private String kind;

    @SerializedName(DTransferConstants.TAG_NAME)
    private String tagName;

    public String getKind() {
        return this.kind;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setKind(String str) {
        this.kind = str;
    }

    public void setTagName(String str) {
        this.tagName = str;
    }

    public String toString() {
        return "Tag{tagName='" + this.tagName + "', kind='" + this.kind + "'}";
    }
}
