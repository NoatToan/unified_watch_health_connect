package com.xiaomi.hm.health.device;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.ScaleMode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/SettingMode;", "", "", "toString", "", "component1", "Lcom/huami/bluetooth/profile/channel/module/ScaleMode;", "component2", "type", "measureMode", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getType", "()I", "b", "Lcom/huami/bluetooth/profile/channel/module/ScaleMode;", "getMeasureMode", "()Lcom/huami/bluetooth/profile/channel/module/ScaleMode;", "<init>", "(ILcom/huami/bluetooth/profile/channel/module/ScaleMode;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SettingMode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final ScaleMode measureMode;

    public SettingMode(int i, @NotNull ScaleMode scaleMode) {
        this.type = i;
        this.measureMode = scaleMode;
    }

    public static /* synthetic */ SettingMode copy$default(SettingMode settingMode, int i, ScaleMode scaleMode, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = settingMode.type;
        }
        if ((i2 & 2) != 0) {
            scaleMode = settingMode.measureMode;
        }
        return settingMode.copy(i, scaleMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ScaleMode getMeasureMode() {
        return this.measureMode;
    }

    @NotNull
    public final SettingMode copy(int type, @NotNull ScaleMode measureMode) {
        return new SettingMode(type, measureMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingMode)) {
            return false;
        }
        SettingMode settingMode = (SettingMode) other;
        return this.type == settingMode.type && this.measureMode == settingMode.measureMode;
    }

    @NotNull
    public final ScaleMode getMeasureMode() {
        return this.measureMode;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type * 31) + this.measureMode.hashCode();
    }

    @NotNull
    public String toString() {
        return "SettingMode(type=" + this.type + ", measureMode=" + this.measureMode + ")";
    }
}
