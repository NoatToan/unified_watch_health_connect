package com.huawei.watchface.mvp.model.latona;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class LatonaStyles {

    @SerializedName("@selected_index")
    private String mSelectedIndex;

    @SerializedName(TtmlNode.TAG_STYLE)
    private List<LatonaStyle> mStyleList;

    public String getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public List<LatonaStyle> getStyles() {
        return this.mStyleList;
    }

    public void setSelectedIndex(String str) {
        this.mSelectedIndex = str;
    }

    public void setStyles(List<LatonaStyle> list) {
        this.mStyleList = list;
    }

    public String toString() {
        return "LatonaStyles{mSelectedIndex='" + this.mSelectedIndex + "', mStyleList=" + this.mStyleList + '}';
    }
}
