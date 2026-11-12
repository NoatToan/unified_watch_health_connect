package com.xiaomi.hm.health.device.setting.appsort;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B%\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b \u0010!B\u001f\b\u0016\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b \u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000e\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppGroup;", "", "", "isDisableGroup", "isMoreGroup", "", "component1", "", "Lcom/xiaomi/hm/health/device/setting/appsort/AppItem;", "component2", "", "component3", "group", "items", "desc", "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getGroup", "()I", "b", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "c", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "<init>", "(ILjava/util/List;Ljava/lang/String;)V", "(Ljava/util/List;Ljava/lang/String;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppGroup {
    public static final int DISABLE_GROUP = -1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int group;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<AppItem> items;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String desc;

    /* JADX WARN: Multi-variable type inference failed */
    public AppGroup(int i, @NotNull List<? extends AppItem> list, @NotNull String str) {
        this.group = i;
        this.items = list;
        this.desc = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppGroup copy$default(AppGroup appGroup, int i, List list, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = appGroup.group;
        }
        if ((i2 & 2) != 0) {
            list = appGroup.items;
        }
        if ((i2 & 4) != 0) {
            str = appGroup.desc;
        }
        return appGroup.copy(i, list, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getGroup() {
        return this.group;
    }

    @NotNull
    public final List<AppItem> component2() {
        return this.items;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final AppGroup copy(int group, @NotNull List<? extends AppItem> items, @NotNull String desc) {
        return new AppGroup(group, items, desc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppGroup)) {
            return false;
        }
        AppGroup appGroup = (AppGroup) other;
        return this.group == appGroup.group && Intrinsics.areEqual(this.items, appGroup.items) && Intrinsics.areEqual(this.desc, appGroup.desc);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getGroup() {
        return this.group;
    }

    @NotNull
    public final List<AppItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        return (((this.group * 31) + this.items.hashCode()) * 31) + this.desc.hashCode();
    }

    public final boolean isDisableGroup() {
        return this.group == -1;
    }

    public final boolean isMoreGroup() {
        return this.group == 7;
    }

    @NotNull
    public String toString() {
        return "AppGroup(group=" + this.group + ", items=" + this.items + ", desc=" + this.desc + ")";
    }

    public AppGroup(@NotNull List<? extends AppItem> list, @NotNull String str) {
        this(-1, list, str);
    }
}
