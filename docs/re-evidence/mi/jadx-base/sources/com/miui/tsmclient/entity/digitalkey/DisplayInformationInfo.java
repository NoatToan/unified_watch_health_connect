package com.miui.tsmclient.entity.digitalkey;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class DisplayInformationInfo {

    @SerializedName("description")
    private String mDescription;

    @SerializedName("imageURL")
    private String mImageURL;

    @SerializedName("title")
    private String mTitle;

    public String getDescription() {
        return this.mDescription;
    }

    public String getImageURL() {
        return this.mImageURL;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}
