package com.xiaomi.hm.health.device.setting.appsort.condition;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/condition/AppHideCondition;", "", "", "component1", "", "component2", "type", "canDisable", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getType", "()I", "b", "Z", "getCanDisable", "()Z", "<init>", "(IZ)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppHideCondition {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean canDisable;

    public AppHideCondition(int i, boolean z) {
        this.type = i;
        this.canDisable = z;
    }

    public static /* synthetic */ AppHideCondition copy$default(AppHideCondition appHideCondition, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = appHideCondition.type;
        }
        if ((i2 & 2) != 0) {
            z = appHideCondition.canDisable;
        }
        return appHideCondition.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCanDisable() {
        return this.canDisable;
    }

    @NotNull
    public final AppHideCondition copy(int type, boolean canDisable) {
        return new AppHideCondition(type, canDisable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppHideCondition)) {
            return false;
        }
        AppHideCondition appHideCondition = (AppHideCondition) other;
        return this.type == appHideCondition.type && this.canDisable == appHideCondition.canDisable;
    }

    public final boolean getCanDisable() {
        return this.canDisable;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int i = this.type * 31;
        boolean z = this.canDisable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return i + r1;
    }

    @NotNull
    public String toString() {
        return "AppHideCondition(type=" + this.type + ", canDisable=" + this.canDisable + ")";
    }

    public /* synthetic */ AppHideCondition(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z);
    }
}
