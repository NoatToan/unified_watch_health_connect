package com.xiaomi.hm.health.device.setting.network.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0002\u001a\u00020\u0000J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001R$\u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/Sort;", "Lcom/xiaomi/hm/health/device/setting/network/bean/IWatchSettings;", "clone", "", "other", "", "equals", "", "hashCode", "", "component1", "component2", "component3", "screenEdit", "ctrlCenter", "appSort", "copy", "toString", "a", "Ljava/lang/String;", "getScreenEdit", "()Ljava/lang/String;", "setScreenEdit", "(Ljava/lang/String;)V", "b", "getCtrlCenter", "setCtrlCenter", "c", "getAppSort", "setAppSort", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Sort implements IWatchSettings {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("screenEdit")
    @Nullable
    private String screenEdit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("ctrlCenter")
    @Nullable
    private String ctrlCenter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("appSort")
    @Nullable
    private String appSort;

    public Sort() {
        this(null, null, null, 7, null);
    }

    public Sort(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.screenEdit = str;
        this.ctrlCenter = str2;
        this.appSort = str3;
    }

    public static /* synthetic */ Sort copy$default(Sort sort, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sort.screenEdit;
        }
        if ((i & 2) != 0) {
            str2 = sort.ctrlCenter;
        }
        if ((i & 4) != 0) {
            str3 = sort.appSort;
        }
        return sort.copy(str, str2, str3);
    }

    @NotNull
    public final Sort clone() {
        return new Sort(this.screenEdit, this.ctrlCenter, this.appSort);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScreenEdit() {
        return this.screenEdit;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCtrlCenter() {
        return this.ctrlCenter;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppSort() {
        return this.appSort;
    }

    @NotNull
    public final Sort copy(@Nullable String screenEdit, @Nullable String ctrlCenter, @Nullable String appSort) {
        return new Sort(screenEdit, ctrlCenter, appSort);
    }

    public boolean equals(@Nullable Object other) {
        Sort sort = other instanceof Sort ? (Sort) other : null;
        return sort != null && Intrinsics.areEqual(this.screenEdit, sort.screenEdit) && Intrinsics.areEqual(this.ctrlCenter, sort.ctrlCenter) && Intrinsics.areEqual(this.appSort, sort.appSort);
    }

    @Nullable
    public final String getAppSort() {
        return this.appSort;
    }

    @Nullable
    public final String getCtrlCenter() {
        return this.ctrlCenter;
    }

    @Nullable
    public final String getScreenEdit() {
        return this.screenEdit;
    }

    public int hashCode() {
        String str = this.screenEdit;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ctrlCenter;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appSort;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAppSort(@Nullable String str) {
        this.appSort = str;
    }

    public final void setCtrlCenter(@Nullable String str) {
        this.ctrlCenter = str;
    }

    public final void setScreenEdit(@Nullable String str) {
        this.screenEdit = str;
    }

    @NotNull
    public String toString() {
        return "Sort(screenEdit=" + this.screenEdit + ", ctrlCenter=" + this.ctrlCenter + ", appSort=" + this.appSort + ")";
    }

    public /* synthetic */ Sort(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
