package com.huami.relatives;

import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class UserCard implements Serializable {

    @SerializedName("icon")
    public String icon;

    @Nullable
    @SerializedName("ftoken")
    public String token;

    @SerializedName("uid")
    public long uid;

    @SerializedName("username")
    public String username;
}
