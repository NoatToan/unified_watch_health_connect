package com.ximalaya.ting.android.opensdk.model.announcer;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import com.ximalaya.ting.android.opensdk.model.album.Announcer;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class AnnouncerList extends XimalayaResponse {

    @SerializedName("announcers")
    private List<Announcer> announcerList;

    @SerializedName("current_page")
    private int currentPage;

    @SerializedName("total_count")
    private int totalCount;

    @SerializedName(DTransferConstants.TOTAL_PAGE)
    private int totalPage;

    @SerializedName(DTransferConstants.VCATEGORY_ID)
    private long vCategoryId;

    public List<Announcer> getAnnouncerList() {
        return this.announcerList;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public int getTotalPage() {
        return this.totalPage;
    }

    public long getvCategoryId() {
        return this.vCategoryId;
    }

    public void setAnnouncerList(List<Announcer> list) {
        this.announcerList = list;
    }

    public void setCurrentPage(int i) {
        this.currentPage = i;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }

    public void setTotalPage(int i) {
        this.totalPage = i;
    }

    public void setvCategoryId(long j) {
        this.vCategoryId = j;
    }
}
