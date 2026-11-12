package com.xiaomi.hm.health.utils;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/utils/AppItemData;", "", "", "component1", "component2", "", "component3", "component4", "component5", "type", "index", "enable", SecondaryScreen.KEY_UPDATED, SecondaryScreen.KEY_PARENT, "copy", "", "toString", "hashCode", "other", "equals", LogUtil.I, "getType", "()I", "setType", "(I)V", "getIndex", "setIndex", "Z", "getEnable", "()Z", "setEnable", "(Z)V", "getUpdated", "setUpdated", "getParentType", "setParentType", "<init>", "(IIZZI)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppItemData {
    private boolean enable;
    private int index;
    private int parentType;
    private int type;
    private boolean updated;

    public AppItemData() {
        this(0, 0, false, false, 0, 31, null);
    }

    public AppItemData(int i, int i2, boolean z, boolean z2, int i3) {
        this.type = i;
        this.index = i2;
        this.enable = z;
        this.updated = z2;
        this.parentType = i3;
    }

    public static /* synthetic */ AppItemData copy$default(AppItemData appItemData, int i, int i2, boolean z, boolean z2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = appItemData.type;
        }
        if ((i4 & 2) != 0) {
            i2 = appItemData.index;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            z = appItemData.enable;
        }
        boolean z3 = z;
        if ((i4 & 8) != 0) {
            z2 = appItemData.updated;
        }
        boolean z4 = z2;
        if ((i4 & 16) != 0) {
            i3 = appItemData.parentType;
        }
        return appItemData.copy(i, i5, z3, z4, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getUpdated() {
        return this.updated;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getParentType() {
        return this.parentType;
    }

    @NotNull
    public final AppItemData copy(int type, int index, boolean enable, boolean updated, int parentType) {
        return new AppItemData(type, index, enable, updated, parentType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppItemData)) {
            return false;
        }
        AppItemData appItemData = (AppItemData) other;
        return this.type == appItemData.type && this.index == appItemData.index && this.enable == appItemData.enable && this.updated == appItemData.updated && this.parentType == appItemData.parentType;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getParentType() {
        return this.parentType;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean getUpdated() {
        return this.updated;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int i = ((this.type * 31) + this.index) * 31;
        boolean z = this.enable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (i + r1) * 31;
        boolean z2 = this.updated;
        return ((i2 + (z2 ? 1 : z2)) * 31) + this.parentType;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setParentType(int i) {
        this.parentType = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUpdated(boolean z) {
        this.updated = z;
    }

    @NotNull
    public String toString() {
        return "AppItemData(type=" + this.type + ", index=" + this.index + ", enable=" + this.enable + ", updated=" + this.updated + ", parentType=" + this.parentType + ")";
    }

    public /* synthetic */ AppItemData(int i, int i2, boolean z, boolean z2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? false : z, (i4 & 8) == 0 ? z2 : false, (i4 & 16) != 0 ? -1 : i3);
    }
}
