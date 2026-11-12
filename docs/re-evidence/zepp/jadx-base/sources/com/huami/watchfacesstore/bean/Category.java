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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003JU\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001c\u0010\u0011\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u001c\u0010\u0012\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b%\u0010\u001fR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/huami/watchfacesstore/bean/Category;", "", "", "component1", "", "component2", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "component3", "component4", "component5", "component6", "component7", "category", DTransferConstants.CATEGORY_ID, "data", DTransferConstants.PAGE, "perPage", "totalPage", "categoryNum", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", LogUtil.I, "getCategory_id", "()I", "Ljava/util/List;", "getData", "()Ljava/util/List;", "getPage", "getPerPage", "getTotalPage", "getCategoryNum", "setCategoryNum", "(I)V", "<init>", "(Ljava/lang/String;ILjava/util/List;IIII)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Category {

    @NotNull
    private final String category;
    private int categoryNum;
    private final int category_id;

    @NotNull
    private final List<WatchData> data;
    private final int page;

    @SerializedName("per_page")
    private final int perPage;

    @SerializedName(DTransferConstants.TOTAL_PAGE)
    private final int totalPage;

    public Category(@NotNull String str, int i, @NotNull List<WatchData> list, int i2, int i3, int i4, int i5) {
        this.category = str;
        this.category_id = i;
        this.data = list;
        this.page = i2;
        this.perPage = i3;
        this.totalPage = i4;
        this.categoryNum = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Category copy$default(Category category, String str, int i, List list, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = category.category;
        }
        if ((i6 & 2) != 0) {
            i = category.category_id;
        }
        int i7 = i;
        if ((i6 & 4) != 0) {
            list = category.data;
        }
        List list2 = list;
        if ((i6 & 8) != 0) {
            i2 = category.page;
        }
        int i8 = i2;
        if ((i6 & 16) != 0) {
            i3 = category.perPage;
        }
        int i9 = i3;
        if ((i6 & 32) != 0) {
            i4 = category.totalPage;
        }
        int i10 = i4;
        if ((i6 & 64) != 0) {
            i5 = category.categoryNum;
        }
        return category.copy(str, i7, list2, i8, i9, i10, i5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCategory_id() {
        return this.category_id;
    }

    @NotNull
    public final List<WatchData> component3() {
        return this.data;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPerPage() {
        return this.perPage;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTotalPage() {
        return this.totalPage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getCategoryNum() {
        return this.categoryNum;
    }

    @NotNull
    public final Category copy(@NotNull String category, int category_id, @NotNull List<WatchData> data, int page, int perPage, int totalPage, int categoryNum) {
        return new Category(category, category_id, data, page, perPage, totalPage, categoryNum);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Category)) {
            return false;
        }
        Category category = (Category) other;
        return Intrinsics.areEqual(this.category, category.category) && this.category_id == category.category_id && Intrinsics.areEqual(this.data, category.data) && this.page == category.page && this.perPage == category.perPage && this.totalPage == category.totalPage && this.categoryNum == category.categoryNum;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    public final int getCategoryNum() {
        return this.categoryNum;
    }

    public final int getCategory_id() {
        return this.category_id;
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
        return (((((((((((this.category.hashCode() * 31) + this.category_id) * 31) + this.data.hashCode()) * 31) + this.page) * 31) + this.perPage) * 31) + this.totalPage) * 31) + this.categoryNum;
    }

    public final void setCategoryNum(int i) {
        this.categoryNum = i;
    }

    @NotNull
    public String toString() {
        return "Category(category=" + this.category + ", category_id=" + this.category_id + ", data=" + this.data + ", page=" + this.page + ", perPage=" + this.perPage + ", totalPage=" + this.totalPage + ", categoryNum=" + this.categoryNum + ")";
    }

    public /* synthetic */ Category(String str, int i, List list, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, list, i2, i3, i4, (i6 & 64) != 0 ? 0 : i5);
    }
}
