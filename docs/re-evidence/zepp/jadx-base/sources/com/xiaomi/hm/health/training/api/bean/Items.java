package com.xiaomi.hm.health.training.api.bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class Items<T> {

    @SerializedName("items")
    public List<T> items;

    @SerializedName("next")
    public Long next;
}
