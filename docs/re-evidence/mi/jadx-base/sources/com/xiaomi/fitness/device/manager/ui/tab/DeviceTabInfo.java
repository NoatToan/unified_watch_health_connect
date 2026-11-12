package com.xiaomi.fitness.device.manager.ui.tab;

import com.xiaomi.fitness.device.manager.export.DeviceTabInfoProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import miuix.miuixbasewidget.widget.FilterSortView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabInfo;", "", "tabView", "Lmiuix/miuixbasewidget/widget/FilterSortView$TabView;", "infoProvider", "Lcom/xiaomi/fitness/device/manager/export/DeviceTabInfoProvider;", "<init>", "(Lmiuix/miuixbasewidget/widget/FilterSortView$TabView;Lcom/xiaomi/fitness/device/manager/export/DeviceTabInfoProvider;)V", "getTabView", "()Lmiuix/miuixbasewidget/widget/FilterSortView$TabView;", "getInfoProvider", "()Lcom/xiaomi/fitness/device/manager/export/DeviceTabInfoProvider;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceTabInfo {

    @NotNull
    private final DeviceTabInfoProvider infoProvider;

    @NotNull
    private final FilterSortView.TabView tabView;

    public DeviceTabInfo(@NotNull FilterSortView.TabView tabView, @NotNull DeviceTabInfoProvider infoProvider) {
        Intrinsics.checkNotNullParameter(tabView, "tabView");
        Intrinsics.checkNotNullParameter(infoProvider, "infoProvider");
        this.tabView = tabView;
        this.infoProvider = infoProvider;
    }

    public static /* synthetic */ DeviceTabInfo copy$default(DeviceTabInfo deviceTabInfo, FilterSortView.TabView tabView, DeviceTabInfoProvider deviceTabInfoProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            tabView = deviceTabInfo.tabView;
        }
        if ((i & 2) != 0) {
            deviceTabInfoProvider = deviceTabInfo.infoProvider;
        }
        return deviceTabInfo.copy(tabView, deviceTabInfoProvider);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FilterSortView.TabView getTabView() {
        return this.tabView;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DeviceTabInfoProvider getInfoProvider() {
        return this.infoProvider;
    }

    @NotNull
    public final DeviceTabInfo copy(@NotNull FilterSortView.TabView tabView, @NotNull DeviceTabInfoProvider infoProvider) {
        Intrinsics.checkNotNullParameter(tabView, "tabView");
        Intrinsics.checkNotNullParameter(infoProvider, "infoProvider");
        return new DeviceTabInfo(tabView, infoProvider);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceTabInfo)) {
            return false;
        }
        DeviceTabInfo deviceTabInfo = (DeviceTabInfo) other;
        return Intrinsics.areEqual(this.tabView, deviceTabInfo.tabView) && Intrinsics.areEqual(this.infoProvider, deviceTabInfo.infoProvider);
    }

    @NotNull
    public final DeviceTabInfoProvider getInfoProvider() {
        return this.infoProvider;
    }

    @NotNull
    public final FilterSortView.TabView getTabView() {
        return this.tabView;
    }

    public int hashCode() {
        return (this.tabView.hashCode() * 31) + this.infoProvider.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceTabInfo(tabView=" + this.tabView + ", infoProvider=" + this.infoProvider + ")";
    }
}
