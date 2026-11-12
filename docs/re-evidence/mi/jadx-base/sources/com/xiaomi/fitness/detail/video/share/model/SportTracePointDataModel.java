package com.xiaomi.fitness.detail.video.share.model;

import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003JC\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/model/SportTracePointDataModel;", "", "selected", "", "feelings", "", "imgUriList", "", "Landroid/net/Uri;", "momentsModelList", "Lcom/xiaomi/fitness/detail/video/share/model/MomentsModel;", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getSelected", "()Z", "setSelected", "(Z)V", "getFeelings", "()Ljava/lang/String;", "setFeelings", "(Ljava/lang/String;)V", "getImgUriList", "()Ljava/util/List;", "setImgUriList", "(Ljava/util/List;)V", "getMomentsModelList", "setMomentsModelList", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportTracePointDataModel {

    @Nullable
    private String feelings;

    @Nullable
    private List<? extends Uri> imgUriList;

    @Nullable
    private List<MomentsModel> momentsModelList;
    private boolean selected;

    public SportTracePointDataModel() {
        this(false, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportTracePointDataModel copy$default(SportTracePointDataModel sportTracePointDataModel, boolean z, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sportTracePointDataModel.selected;
        }
        if ((i & 2) != 0) {
            str = sportTracePointDataModel.feelings;
        }
        if ((i & 4) != 0) {
            list = sportTracePointDataModel.imgUriList;
        }
        if ((i & 8) != 0) {
            list2 = sportTracePointDataModel.momentsModelList;
        }
        return sportTracePointDataModel.copy(z, str, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeelings() {
        return this.feelings;
    }

    @Nullable
    public final List<Uri> component3() {
        return this.imgUriList;
    }

    @Nullable
    public final List<MomentsModel> component4() {
        return this.momentsModelList;
    }

    @NotNull
    public final SportTracePointDataModel copy(boolean selected, @Nullable String feelings, @Nullable List<? extends Uri> imgUriList, @Nullable List<MomentsModel> momentsModelList) {
        return new SportTracePointDataModel(selected, feelings, imgUriList, momentsModelList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportTracePointDataModel)) {
            return false;
        }
        SportTracePointDataModel sportTracePointDataModel = (SportTracePointDataModel) other;
        return this.selected == sportTracePointDataModel.selected && Intrinsics.areEqual(this.feelings, sportTracePointDataModel.feelings) && Intrinsics.areEqual(this.imgUriList, sportTracePointDataModel.imgUriList) && Intrinsics.areEqual(this.momentsModelList, sportTracePointDataModel.momentsModelList);
    }

    @Nullable
    public final String getFeelings() {
        return this.feelings;
    }

    @Nullable
    public final List<Uri> getImgUriList() {
        return this.imgUriList;
    }

    @Nullable
    public final List<MomentsModel> getMomentsModelList() {
        return this.momentsModelList;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.selected) * 31;
        String str = this.feelings;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<? extends Uri> list = this.imgUriList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<MomentsModel> list2 = this.momentsModelList;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setFeelings(@Nullable String str) {
        this.feelings = str;
    }

    public final void setImgUriList(@Nullable List<? extends Uri> list) {
        this.imgUriList = list;
    }

    public final void setMomentsModelList(@Nullable List<MomentsModel> list) {
        this.momentsModelList = list;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    @NotNull
    public String toString() {
        return "SportTracePointDataModel(selected=" + this.selected + ", feelings=" + this.feelings + ", imgUriList=" + this.imgUriList + ", momentsModelList=" + this.momentsModelList + ")";
    }

    public SportTracePointDataModel(boolean z, @Nullable String str, @Nullable List<? extends Uri> list, @Nullable List<MomentsModel> list2) {
        this.selected = z;
        this.feelings = str;
        this.imgUriList = list;
        this.momentsModelList = list2;
    }

    public /* synthetic */ SportTracePointDataModel(boolean z, String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}
