package com.huami.moving.ui.sport.detail.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J=\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#¨\u0006("}, d2 = {"Lcom/huami/moving/ui/sport/detail/data/SportShowDataBean;", "", "", "component1", "", "component2", "", "Lcom/huami/moving/ui/sport/detail/data/SportTypeItemBean;", "component3", "Lcom/huami/moving/ui/sport/detail/data/ShowItemBean;", "component4", "useMap", "mainData", "sportType", "showData", "copy", "toString", "", "hashCode", "other", "equals", "Z", "getUseMap", "()Z", "setUseMap", "(Z)V", "Ljava/lang/String;", "getMainData", "()Ljava/lang/String;", "setMainData", "(Ljava/lang/String;)V", "Ljava/util/List;", "getSportType", "()Ljava/util/List;", "setSportType", "(Ljava/util/List;)V", "getShowData", "setShowData", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SportShowDataBean {

    @NotNull
    private String mainData;

    @NotNull
    private List<ShowItemBean> showData;

    @NotNull
    private List<SportTypeItemBean> sportType;
    private boolean useMap;

    public SportShowDataBean() {
        this(false, null, null, null, 15, null);
    }

    public SportShowDataBean(boolean z, @NotNull String str, @NotNull List<SportTypeItemBean> list, @NotNull List<ShowItemBean> list2) {
        this.useMap = z;
        this.mainData = str;
        this.sportType = list;
        this.showData = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportShowDataBean copy$default(SportShowDataBean sportShowDataBean, boolean z, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sportShowDataBean.useMap;
        }
        if ((i & 2) != 0) {
            str = sportShowDataBean.mainData;
        }
        if ((i & 4) != 0) {
            list = sportShowDataBean.sportType;
        }
        if ((i & 8) != 0) {
            list2 = sportShowDataBean.showData;
        }
        return sportShowDataBean.copy(z, str, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getUseMap() {
        return this.useMap;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMainData() {
        return this.mainData;
    }

    @NotNull
    public final List<SportTypeItemBean> component3() {
        return this.sportType;
    }

    @NotNull
    public final List<ShowItemBean> component4() {
        return this.showData;
    }

    @NotNull
    public final SportShowDataBean copy(boolean useMap, @NotNull String mainData, @NotNull List<SportTypeItemBean> sportType, @NotNull List<ShowItemBean> showData) {
        return new SportShowDataBean(useMap, mainData, sportType, showData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportShowDataBean)) {
            return false;
        }
        SportShowDataBean sportShowDataBean = (SportShowDataBean) other;
        return this.useMap == sportShowDataBean.useMap && Intrinsics.areEqual(this.mainData, sportShowDataBean.mainData) && Intrinsics.areEqual(this.sportType, sportShowDataBean.sportType) && Intrinsics.areEqual(this.showData, sportShowDataBean.showData);
    }

    @NotNull
    public final String getMainData() {
        return this.mainData;
    }

    @NotNull
    public final List<ShowItemBean> getShowData() {
        return this.showData;
    }

    @NotNull
    public final List<SportTypeItemBean> getSportType() {
        return this.sportType;
    }

    public final boolean getUseMap() {
        return this.useMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.useMap;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((r0 * 31) + this.mainData.hashCode()) * 31) + this.sportType.hashCode()) * 31) + this.showData.hashCode();
    }

    public final void setMainData(@NotNull String str) {
        this.mainData = str;
    }

    public final void setShowData(@NotNull List<ShowItemBean> list) {
        this.showData = list;
    }

    public final void setSportType(@NotNull List<SportTypeItemBean> list) {
        this.sportType = list;
    }

    public final void setUseMap(boolean z) {
        this.useMap = z;
    }

    @NotNull
    public String toString() {
        return "SportShowDataBean(useMap=" + this.useMap + ", mainData=" + this.mainData + ", sportType=" + this.sportType + ", showData=" + this.showData + ")";
    }

    public /* synthetic */ SportShowDataBean(boolean z, String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new ArrayList() : list, (i & 8) != 0 ? new ArrayList() : list2);
    }
}
