package com.xiaomi.hm.health.device.watchskinstore.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinPage;", "", "", "toString", "", DTransferConstants.PAGE, LogUtil.I, "getPage", "()I", "setPage", "(I)V", "perPage", "getPerPage", "setPerPage", "totalPage", "getTotalPage", "setTotalPage", "", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchSkinBean;", "data", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "categoryName", "Ljava/lang/String;", "getCategoryName", "()Ljava/lang/String;", "setCategoryName", "(Ljava/lang/String;)V", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchSkinPage {

    @SerializedName("category")
    @Nullable
    private String categoryName;

    @Nullable
    private List<WatchSkinBean> data;
    private int page;

    @SerializedName("per_page")
    private int perPage;

    @SerializedName(DTransferConstants.TOTAL_PAGE)
    private int totalPage;

    @Nullable
    public final String getCategoryName() {
        return this.categoryName;
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

    public final void setCategoryName(@Nullable String str) {
        this.categoryName = str;
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
        return "WatchSkinPage(page=" + this.page + ", perPage=" + this.perPage + ", totalPage=" + this.totalPage + ", data=" + this.data + ")";
    }
}
