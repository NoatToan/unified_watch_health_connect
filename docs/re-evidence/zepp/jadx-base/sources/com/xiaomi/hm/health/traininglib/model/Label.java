package com.xiaomi.hm.health.traininglib.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public class Label implements Serializable {

    @SerializedName("color")
    public String bgColor;

    @SerializedName("labelDirection")
    public String direction;

    @SerializedName("value")
    public String value;
}
