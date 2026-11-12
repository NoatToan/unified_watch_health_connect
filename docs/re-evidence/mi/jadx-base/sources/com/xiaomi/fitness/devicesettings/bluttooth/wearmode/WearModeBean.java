package com.xiaomi.fitness.devicesettings.bluttooth.wearmode;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/WearModeBean;", "", "mode", "", "icon", "<init>", "(ILjava/lang/Integer;)V", "getMode", "()I", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "isSelect", "", "()Z", "setSelect", "(Z)V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "component1", "component2", "copy", "(ILjava/lang/Integer;)Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/WearModeBean;", "equals", "other", "hashCode", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WearModeBean {

    @Nullable
    private final Integer icon;
    private boolean isSelect;
    private final int mode;

    @NotNull
    private String url = "";

    public WearModeBean(int i, @Nullable Integer num) {
        this.mode = i;
        this.icon = num;
    }

    public static /* synthetic */ WearModeBean copy$default(WearModeBean wearModeBean, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wearModeBean.mode;
        }
        if ((i2 & 2) != 0) {
            num = wearModeBean.icon;
        }
        return wearModeBean.copy(i, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    @NotNull
    public final WearModeBean copy(int mode, @Nullable Integer icon) {
        return new WearModeBean(mode, icon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WearModeBean)) {
            return false;
        }
        WearModeBean wearModeBean = (WearModeBean) other;
        return this.mode == wearModeBean.mode && Intrinsics.areEqual(this.icon, wearModeBean.icon);
    }

    @Nullable
    public final Integer getIcon() {
        return this.icon;
    }

    public final int getMode() {
        return this.mode;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.mode) * 31;
        Integer num = this.icon;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    /* JADX INFO: renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    @NotNull
    public String toString() {
        return "WearModeBean(mode=" + this.mode + ", icon=" + this.icon + ")";
    }
}
