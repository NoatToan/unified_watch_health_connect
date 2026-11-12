package com.huami.flutter.appletcompanionplugin;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J7\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/flutter/appletcompanionplugin/AppListInfo;", "", "", "component1", "component2", "component3", "", "Lcom/huami/flutter/appletcompanionplugin/Datum;", "component4", DTransferConstants.PAGE, "perPage", "totalPage", "data", "copy", "", "toString", "", "hashCode", "other", "", "equals", "F", "getPage", "()F", "getPerPage", "getTotalPage", "Ljava/util/List;", "getData", "()Ljava/util/List;", "<init>", "(FFFLjava/util/List;)V", "applet_companion_plugin_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppListInfo {

    @NotNull
    private final List<Datum> data;
    private final float page;

    @SerializedName("per_page")
    private final float perPage;

    @SerializedName(DTransferConstants.TOTAL_PAGE)
    private final float totalPage;

    public AppListInfo(float f, float f2, float f3, @NotNull List<Datum> list) {
        this.page = f;
        this.perPage = f2;
        this.totalPage = f3;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppListInfo copy$default(AppListInfo appListInfo, float f, float f2, float f3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            f = appListInfo.page;
        }
        if ((i & 2) != 0) {
            f2 = appListInfo.perPage;
        }
        if ((i & 4) != 0) {
            f3 = appListInfo.totalPage;
        }
        if ((i & 8) != 0) {
            list = appListInfo.data;
        }
        return appListInfo.copy(f, f2, f3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getPerPage() {
        return this.perPage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getTotalPage() {
        return this.totalPage;
    }

    @NotNull
    public final List<Datum> component4() {
        return this.data;
    }

    @NotNull
    public final AppListInfo copy(float page, float perPage, float totalPage, @NotNull List<Datum> data) {
        return new AppListInfo(page, perPage, totalPage, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppListInfo)) {
            return false;
        }
        AppListInfo appListInfo = (AppListInfo) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.page), (Object) Float.valueOf(appListInfo.page)) && Intrinsics.areEqual((Object) Float.valueOf(this.perPage), (Object) Float.valueOf(appListInfo.perPage)) && Intrinsics.areEqual((Object) Float.valueOf(this.totalPage), (Object) Float.valueOf(appListInfo.totalPage)) && Intrinsics.areEqual(this.data, appListInfo.data);
    }

    @NotNull
    public final List<Datum> getData() {
        return this.data;
    }

    public final float getPage() {
        return this.page;
    }

    public final float getPerPage() {
        return this.perPage;
    }

    public final float getTotalPage() {
        return this.totalPage;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.page) * 31) + Float.floatToIntBits(this.perPage)) * 31) + Float.floatToIntBits(this.totalPage)) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "AppListInfo(page=" + this.page + ", perPage=" + this.perPage + ", totalPage=" + this.totalPage + ", data=" + this.data + ')';
    }
}
