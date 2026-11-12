package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.quickstart;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/quickstart/QuickStartVo;", "", "", "component1", "component2", "", "component3", "", "component4", "name", "id", "select", "index", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getId", "c", "Z", "getSelect", "()Z", "setSelect", "(Z)V", GoogleApiAvailabilityLight.a, LogUtil.I, "getIndex", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class QuickStartVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private boolean select;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int index;

    public QuickStartVo(@NotNull String str, @NotNull String str2, boolean z, int i) {
        this.name = str;
        this.id = str2;
        this.select = z;
        this.index = i;
    }

    public static /* synthetic */ QuickStartVo copy$default(QuickStartVo quickStartVo, String str, String str2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = quickStartVo.name;
        }
        if ((i2 & 2) != 0) {
            str2 = quickStartVo.id;
        }
        if ((i2 & 4) != 0) {
            z = quickStartVo.select;
        }
        if ((i2 & 8) != 0) {
            i = quickStartVo.index;
        }
        return quickStartVo.copy(str, str2, z, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSelect() {
        return this.select;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final QuickStartVo copy(@NotNull String name, @NotNull String id, boolean select, int index) {
        return new QuickStartVo(name, id, select, index);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickStartVo)) {
            return false;
        }
        QuickStartVo quickStartVo = (QuickStartVo) other;
        return Intrinsics.areEqual(this.name, quickStartVo.name) && Intrinsics.areEqual(this.id, quickStartVo.id) && this.select == quickStartVo.select && this.index == quickStartVo.index;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getSelect() {
        return this.select;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.id.hashCode()) * 31;
        boolean z = this.select;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.index;
    }

    public final void setSelect(boolean z) {
        this.select = z;
    }

    @NotNull
    public String toString() {
        return "QuickStartVo(name=" + this.name + ", id=" + this.id + ", select=" + this.select + ", index=" + this.index + ")";
    }
}
