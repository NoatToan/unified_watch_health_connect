package com.xiaomi.hm.health.device.watchskinstore.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\"\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinCategory;", "", "", "toString", "category", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "", "categoryId", LogUtil.I, "getCategoryId", "()I", "setCategoryId", "(I)V", DTransferConstants.PAGE, "getPage", "setPage", "perPage", "getPerPage", "setPerPage", "totalPage", "getTotalPage", "setTotalPage", "", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinBean;", "data", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchSkinCategory {

    @Nullable
    private String category;

    @SerializedName(DTransferConstants.CATEGORY_ID)
    private int categoryId;

    @Nullable
    private List<WatchSkinBean> data;
    private int page;

    @SerializedName("per_page")
    private int perPage;

    @SerializedName(DTransferConstants.TOTAL_PAGE)
    private int totalPage;

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final List<WatchSkinBean> getData() {
        return this.data;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getPerPage() {
        return this.perPage;
    }

    public final int getTotalPage() {
        return this.totalPage;
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setCategoryId(int i) {
        this.categoryId = i;
    }

    public final void setData(@Nullable List<WatchSkinBean> list) {
        this.data = list;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final void setPerPage(int i) {
        this.perPage = i;
    }

    public final void setTotalPage(int i) {
        this.totalPage = i;
    }

    @NotNull
    public String toString() {
        return "WatchSkinCategory(category=" + this.category + ", categoryId=" + this.categoryId + ", page=" + this.page + ", perPage=" + this.perPage + ", totalPage=" + this.totalPage + ", data=" + this.data + ")";
    }
}
