package com.xiaomi.hm.health.device.setting.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\b\u0010\u0012R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/StartOfWeekSettingVo;", "", "", "component1", "", "component2", "", "component3", "isSupport", "value", "index", "copy", "toString", "hashCode", "other", "equals", "a", "Z", "()Z", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "c", LogUtil.I, "getIndex", "()I", "<init>", "(ZLjava/lang/String;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StartOfWeekSettingVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isSupport;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int index;

    public StartOfWeekSettingVo(boolean z, @NotNull String str, int i) {
        this.isSupport = z;
        this.value = str;
        this.index = i;
    }

    public static /* synthetic */ StartOfWeekSettingVo copy$default(StartOfWeekSettingVo startOfWeekSettingVo, boolean z, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = startOfWeekSettingVo.isSupport;
        }
        if ((i2 & 2) != 0) {
            str = startOfWeekSettingVo.value;
        }
        if ((i2 & 4) != 0) {
            i = startOfWeekSettingVo.index;
        }
        return startOfWeekSettingVo.copy(z, str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSupport() {
        return this.isSupport;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final StartOfWeekSettingVo copy(boolean isSupport, @NotNull String value, int index) {
        return new StartOfWeekSettingVo(isSupport, value, index);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartOfWeekSettingVo)) {
            return false;
        }
        StartOfWeekSettingVo startOfWeekSettingVo = (StartOfWeekSettingVo) other;
        return this.isSupport == startOfWeekSettingVo.isSupport && Intrinsics.areEqual(this.value, startOfWeekSettingVo.value) && this.index == startOfWeekSettingVo.index;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isSupport;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.value.hashCode()) * 31) + this.index;
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    @NotNull
    public String toString() {
        return "StartOfWeekSettingVo(isSupport=" + this.isSupport + ", value=" + this.value + ", index=" + this.index + ")";
    }
}
