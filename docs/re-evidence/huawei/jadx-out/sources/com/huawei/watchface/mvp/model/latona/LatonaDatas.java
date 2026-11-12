package com.huawei.watchface.mvp.model.latona;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class LatonaDatas {

    @SerializedName("data")
    private List<LatonaData> mLatonaDataList;

    @SerializedName("@selected_index")
    private String mSelectedIndex;

    public List<LatonaData> getLatonaDataList() {
        return this.mLatonaDataList;
    }

    public String getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public void setLatonaDataList(List<LatonaData> list) {
        this.mLatonaDataList = list;
    }

    public void setSelectedIndex(String str) {
        this.mSelectedIndex = str;
    }

    public String toString() {
        return "LatonaDatas{mLatonaDataList=" + this.mLatonaDataList + ", mSelectedIndex='" + this.mSelectedIndex + "'}";
    }
}
