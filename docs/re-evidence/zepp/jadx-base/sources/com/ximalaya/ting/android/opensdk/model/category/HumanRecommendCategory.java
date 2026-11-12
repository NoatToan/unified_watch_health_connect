package com.ximalaya.ting.android.opensdk.model.category;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;

/* JADX INFO: loaded from: classes22.dex */
public class HumanRecommendCategory extends XimalayaResponse {

    @SerializedName("id")
    private long categoryId;

    @SerializedName(DTransferConstants.CATEGORY_NAME)
    private String categoryName;

    @SerializedName("cover_url_large")
    private String coverUrlLarge;

    @SerializedName("cover_url_middle")
    private String coverUrlMiddle;

    @SerializedName("cover_url_small")
    private String coverUrlSmall;

    @SerializedName("human_recommend_category_name")
    private String humanRecommendCategoryName;

    @SerializedName("order_num")
    private int orderNum;

    public long getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public String getCoverUrlLarge() {
        return this.coverUrlLarge;
    }

    public String getCoverUrlMiddle() {
        return this.coverUrlMiddle;
    }

    public String getCoverUrlSmall() {
        return this.coverUrlSmall;
    }

    public String getHumanRecommendCategoryName() {
        return this.humanRecommendCategoryName;
    }

    public int getOrderNum() {
        return this.orderNum;
    }

    public void setCategoryId(long j) {
        this.categoryId = j;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public void setCoverUrlLarge(String str) {
        this.coverUrlLarge = str;
    }

    public void setCoverUrlMiddle(String str) {
        this.coverUrlMiddle = str;
    }

    public void setCoverUrlSmall(String str) {
        this.coverUrlSmall = str;
    }

    public void setHumanRecommendCategoryName(String str) {
        this.humanRecommendCategoryName = str;
    }

    public void setOrderNum(int i) {
        this.orderNum = i;
    }

    public String toString() {
        return "HumanRecommendCategory [categoryId=" + this.categoryId + ", categoryName=" + this.categoryName + ", coverUrlSmall=" + this.coverUrlSmall + ", coverUrlMiddle=" + this.coverUrlMiddle + ", coverUrlLarge=" + this.coverUrlLarge + ", orderNum=" + this.orderNum + ", humanRecommendCategoryName=" + this.humanRecommendCategoryName + "]";
    }
}
