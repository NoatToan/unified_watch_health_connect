package com.huami.watchfacesstore.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003JC\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\r\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u000e\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/huami/watchfacesstore/bean/WatchListBean;", "", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "component1", "", "component2", "component3", "component4", "", "component5", "data", DTransferConstants.PAGE, "perPage", "totalPage", "categoryName", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/util/List;", "getData", "()Ljava/util/List;", LogUtil.I, "getPage", "()I", "getPerPage", "getTotalPage", "Ljava/lang/String;", "getCategoryName", "()Ljava/lang/String;", "setCategoryName", "(Ljava/lang/String;)V", "<init>", "(Ljava/util/List;IIILjava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WatchListBean {

    @SerializedName(alternate = {"title"}, value = "category")
    @Nullable
    private String categoryName;

    @NotNull
    private final List<WatchData> data;
    private final int page;

    @SerializedName("per_page")
    private final int perPage;

    @SerializedName(DTransferConstants.TOTAL_PAGE)
    private final int totalPage;

    public WatchListBean(@NotNull List<WatchData> list, int i, int i2, int i3, @Nullable String str) {
        this.data = list;
        this.page = i;
        this.perPage = i2;
        this.totalPage = i3;
        this.categoryName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WatchListBean copy$default(WatchListBean watchListBean, List list, int i, int i2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = watchListBean.data;
        }
        if ((i4 & 2) != 0) {
            i = watchListBean.page;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = watchListBean.perPage;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = watchListBean.totalPage;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            str = watchListBean.categoryName;
        }
        return watchListBean.copy(list, i5, i6, i7, str);
    }

    @NotNull
    public final List<WatchData> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPerPage() {
        return this.perPage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalPage() {
        return this.totalPage;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    @NotNull
    public final WatchListBean copy(@NotNull List<WatchData> data, int page, int perPage, int totalPage, @Nullable String categoryName) {
        return new WatchListBean(data, page, perPage, totalPage, categoryName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchListBean)) {
            return false;
        }
        WatchListBean watchListBean = (WatchListBean) other;
        return Intrinsics.areEqual(this.data, watchListBean.data) && this.page == watchListBean.page && this.perPage == watchListBean.perPage && this.totalPage == watchListBean.totalPage && Intrinsics.areEqual(this.categoryName, watchListBean.categoryName);
    }

    @Nullable
    public final String getCategoryName() {
        return this.categoryName;
    }

    @NotNull
    public final List<WatchData> getData() {
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

    public int hashCode() {
        int iHashCode = ((((((this.data.hashCode() * 31) + this.page) * 31) + this.perPage) * 31) + this.totalPage) * 31;
        String str = this.categoryName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setCategoryName(@Nullable String str) {
        this.categoryName = str;
    }

    @NotNull
    public String toString() {
        return "WatchListBean(data=" + this.data + ", page=" + this.page + ", perPage=" + this.perPage + ", totalPage=" + this.totalPage + ", categoryName=" + this.categoryName + ")";
    }

    public /* synthetic */ WatchListBean(List list, int i, int i2, int i3, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, i2, i3, (i4 & 16) != 0 ? null : str);
    }
}
