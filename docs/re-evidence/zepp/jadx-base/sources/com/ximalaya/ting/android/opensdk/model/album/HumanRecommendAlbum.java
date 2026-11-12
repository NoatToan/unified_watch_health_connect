package com.ximalaya.ting.android.opensdk.model.album;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
@Deprecated
public class HumanRecommendAlbum {

    @SerializedName("albums")
    private List<Album> albumList;

    @SerializedName(DTransferConstants.CATEGORY_ID)
    private long categoryId;

    @SerializedName(DTransferConstants.CATEGORY_NAME)
    private String categoryName;

    @SerializedName("human_recommend_category_name")
    private String humanRecommendCategoryName;

    public List<Album> getAlbumList() {
        return this.albumList;
    }

    public long getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public String getHumanRecommendCategoryName() {
        return this.humanRecommendCategoryName;
    }

    public void setAlbumList(List<Album> list) {
        this.albumList = list;
    }

    public void setCategoryId(long j) {
        this.categoryId = j;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public void setHumanRecommendCategoryName(String str) {
        this.humanRecommendCategoryName = str;
    }

    public String toString() {
        return "HumanRecommendAlbum [categoryId=" + this.categoryId + ", categoryName=" + this.categoryName + ", humanRecommendCategoryName=" + this.humanRecommendCategoryName + ", albumList=" + this.albumList + "]";
    }
}
