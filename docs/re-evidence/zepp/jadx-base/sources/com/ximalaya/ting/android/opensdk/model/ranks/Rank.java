package com.ximalaya.ting.android.opensdk.model.ranks;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class Rank {

    @SerializedName(DTransferConstants.CATEGORY_ID)
    private long categoryId;

    @SerializedName("cover_url")
    private String coverUrl;

    @SerializedName("rank_content_type")
    private String rankContentType;

    @SerializedName("rank_first_item_id")
    private long rankFirstItemId;

    @SerializedName("rank_first_item_title")
    private String rankFirstItemTitle;

    @SerializedName("index_rank_items")
    private List<RankItem> rankItemList;

    @SerializedName("rank_item_num")
    private int rankItemNum;

    @SerializedName(DTransferConstants.RANK_KEY)
    private String rankKey;

    @SerializedName("rank_list_id")
    private long rankListId;

    @SerializedName("rank_order_num")
    private int rankOrderNum;

    @SerializedName("rank_period")
    private int rankPeriod;

    @SerializedName("rank_period_type")
    private String rankPeriodType;

    @SerializedName("rank_sub_title")
    private String rankSubTitle;

    @SerializedName("rank_title")
    private String rankTitle;

    @SerializedName(DTransferConstants.RANK_TYPE)
    private int rankType;

    public long getCategoryId() {
        return this.categoryId;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public String getRankContentType() {
        return this.rankContentType;
    }

    public long getRankFirstItemId() {
        return this.rankFirstItemId;
    }

    public String getRankFirstItemTitle() {
        return this.rankFirstItemTitle;
    }

    public List<RankItem> getRankItemList() {
        return this.rankItemList;
    }

    public int getRankItemNum() {
        return this.rankItemNum;
    }

    public String getRankKey() {
        return this.rankKey;
    }

    public long getRankListId() {
        return this.rankListId;
    }

    public int getRankOrderNum() {
        return this.rankOrderNum;
    }

    public int getRankPeriod() {
        return this.rankPeriod;
    }

    public String getRankPeriodType() {
        return this.rankPeriodType;
    }

    public String getRankSubTitle() {
        return this.rankSubTitle;
    }

    public String getRankTitle() {
        return this.rankTitle;
    }

    public int getRankType() {
        return this.rankType;
    }

    public void setCategoryId(long j) {
        this.categoryId = j;
    }

    public void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    public void setRankContentType(String str) {
        this.rankContentType = str;
    }

    public void setRankFirstItemId(long j) {
        this.rankFirstItemId = j;
    }

    public void setRankFirstItemTitle(String str) {
        this.rankFirstItemTitle = str;
    }

    public void setRankItemList(List<RankItem> list) {
        this.rankItemList = list;
    }

    public void setRankItemNum(int i) {
        this.rankItemNum = i;
    }

    public void setRankKey(String str) {
        this.rankKey = str;
    }

    public void setRankListId(long j) {
        this.rankListId = j;
    }

    public void setRankOrderNum(int i) {
        this.rankOrderNum = i;
    }

    public void setRankPeriod(int i) {
        this.rankPeriod = i;
    }

    public void setRankPeriodType(String str) {
        this.rankPeriodType = str;
    }

    public void setRankSubTitle(String str) {
        this.rankSubTitle = str;
    }

    public void setRankTitle(String str) {
        this.rankTitle = str;
    }

    public void setRankType(int i) {
        this.rankType = i;
    }

    public String toString() {
        return "Rank [rankKey=" + this.rankKey + ", rankTitle=" + this.rankTitle + ", rankType=" + this.rankType + ", rankSubTitle=" + this.rankSubTitle + ", rankPeriod=" + this.rankPeriod + ", rankPeriodType=" + this.rankPeriodType + ", rankItemNum=" + this.rankItemNum + ", rankOrderNum=" + this.rankOrderNum + ", coverUrl=" + this.coverUrl + ", categoryId=" + this.categoryId + ", rankCOntentType=" + this.rankContentType + ", rankFirstItemId=" + this.rankFirstItemId + ", rankFirstItemTitle=" + this.rankFirstItemTitle + ", rankItemList=" + this.rankItemList + "]";
    }
}
