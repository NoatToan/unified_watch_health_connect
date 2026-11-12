package com.huami.sleep.daysleep.sleepstagechart.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\"\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/vo/SelectItemInfoVo;", "", "", "component1", "", "component2", "component3", "", "component4", "icRes", "title", "id", "selected", "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getIcRes", "()I", "b", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "c", "getId", GoogleApiAvailabilityLight.a, "Z", "getSelected", "()Z", "setSelected", "(Z)V", "<init>", "(ILjava/lang/String;Ljava/lang/String;Z)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SelectItemInfoVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int icRes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private boolean selected;

    public SelectItemInfoVo(int i, @NotNull String str, @NotNull String str2, boolean z) {
        this.icRes = i;
        this.title = str;
        this.id = str2;
        this.selected = z;
    }

    public static /* synthetic */ SelectItemInfoVo copy$default(SelectItemInfoVo selectItemInfoVo, int i, String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = selectItemInfoVo.icRes;
        }
        if ((i2 & 2) != 0) {
            str = selectItemInfoVo.title;
        }
        if ((i2 & 4) != 0) {
            str2 = selectItemInfoVo.id;
        }
        if ((i2 & 8) != 0) {
            z = selectItemInfoVo.selected;
        }
        return selectItemInfoVo.copy(i, str, str2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIcRes() {
        return this.icRes;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final SelectItemInfoVo copy(int icRes, @NotNull String title, @NotNull String id, boolean selected) {
        return new SelectItemInfoVo(icRes, title, id, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectItemInfoVo)) {
            return false;
        }
        SelectItemInfoVo selectItemInfoVo = (SelectItemInfoVo) other;
        return this.icRes == selectItemInfoVo.icRes && Intrinsics.areEqual(this.title, selectItemInfoVo.title) && Intrinsics.areEqual(this.id, selectItemInfoVo.id) && this.selected == selectItemInfoVo.selected;
    }

    public final int getIcRes() {
        return this.icRes;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((((this.icRes * 31) + this.title.hashCode()) * 31) + this.id.hashCode()) * 31;
        boolean z = this.selected;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    @NotNull
    public String toString() {
        return "SelectItemInfoVo(icRes=" + this.icRes + ", title=" + this.title + ", id=" + this.id + ", selected=" + this.selected + ")";
    }

    public /* synthetic */ SelectItemInfoVo(int i, String str, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? false : z);
    }
}
