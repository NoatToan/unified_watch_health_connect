package com.ximalaya.ting.android.opensdk.model.coldboot;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ColdBootTag extends XimalayaResponse {

    @SerializedName(DTransferConstants.COLDBOOT_GENRE)
    private String coldBootGenre;

    @SerializedName(DTransferConstants.COLDBOOT_SUB_GENRE)
    private String coldBootSubGenre;

    @SerializedName(DTransferConstants.COLDBOOT_TAGS)
    private List<String> coldBootTagList;
    private String kind;

    public String getColdBootGenre() {
        return this.coldBootGenre;
    }

    public String getColdBootSubGenre() {
        return this.coldBootSubGenre;
    }

    public List<String> getColdBootTagList() {
        return this.coldBootTagList;
    }

    public String getKind() {
        return this.kind;
    }

    public void setColdBootGenre(String str) {
        this.coldBootGenre = str;
    }

    public void setColdBootSubGenre(String str) {
        this.coldBootSubGenre = str;
    }

    public void setColdBootTagList(List<String> list) {
        this.coldBootTagList = list;
    }

    public void setKind(String str) {
        this.kind = str;
    }
}
