package com.xiaomi.hm.health.traininglib.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes22.dex */
public class RecyclePopupItem {

    @SerializedName("id")
    public String id;
    public boolean isChecked;

    @SerializedName("name")
    public String name;

    @SerializedName("type")
    public String type;

    public RecyclePopupItem(String str, String str2, boolean z) {
        this.id = str;
        this.name = str2;
        this.isChecked = z;
    }

    public String toString() {
        return "RecyclePopupItem{id='" + this.id + "', type='" + this.type + "', name='" + this.name + "', isChecked=" + this.isChecked + '}';
    }
}
