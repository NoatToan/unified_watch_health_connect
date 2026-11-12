package com.xiaomi.hm.health.device.setting.appsort.merge;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/merge/AppGroup;", "", "", "component1", "component2", "group", "max", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getGroup", "()I", "b", "getMax", "<init>", "(II)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppGroup {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int group;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int max;

    public AppGroup(int i, int i2) {
        this.group = i;
        this.max = i2;
    }

    public static /* synthetic */ AppGroup copy$default(AppGroup appGroup, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = appGroup.group;
        }
        if ((i3 & 2) != 0) {
            i2 = appGroup.max;
        }
        return appGroup.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getGroup() {
        return this.group;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    @NotNull
    public final AppGroup copy(int group, int max) {
        return new AppGroup(group, max);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppGroup)) {
            return false;
        }
        AppGroup appGroup = (AppGroup) other;
        return this.group == appGroup.group && this.max == appGroup.max;
    }

    public final int getGroup() {
        return this.group;
    }

    public final int getMax() {
        return this.max;
    }

    public int hashCode() {
        return (this.group * 31) + this.max;
    }

    @NotNull
    public String toString() {
        return "AppGroup(group=" + this.group + ", max=" + this.max + ")";
    }
}
