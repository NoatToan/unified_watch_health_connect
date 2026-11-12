package com.huawei.watchface.mvp.model.latona;

import com.google.gson.annotations.SerializedName;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class Backgrounds {

    @SerializedName(WatchFaceProvider.BACKGROUND_LABEL)
    private List<Background> mBackgroundList;

    @SerializedName("@selected_index")
    private String mSelectedIndex;

    public List<Background> getBackgroundList() {
        return this.mBackgroundList;
    }

    public String getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public void setBackgroundList(List<Background> list) {
        this.mBackgroundList = list;
    }

    public void setSelectedIndex(String str) {
        this.mSelectedIndex = str;
    }

    public String toString() {
        return "LatonaStyles{mSelectedIndex='" + this.mSelectedIndex + "', mBackgroundList=" + this.mBackgroundList + '}';
    }
}
