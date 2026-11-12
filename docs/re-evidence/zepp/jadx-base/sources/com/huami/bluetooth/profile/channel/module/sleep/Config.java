package com.huami.bluetooth.profile.channel.module.sleep;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/Config;", "", "", "component1", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;", "component2", "maxDay", "dataFlag", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getMaxDay", "()I", "b", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;", "getDataFlag", "()Lcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;", "<init>", "(ILcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Config {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int maxDay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final DataFlag dataFlag;

    public Config(int i, @NotNull DataFlag dataFlag) {
        this.maxDay = i;
        this.dataFlag = dataFlag;
    }

    public static /* synthetic */ Config copy$default(Config config, int i, DataFlag dataFlag, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = config.maxDay;
        }
        if ((i2 & 2) != 0) {
            dataFlag = config.dataFlag;
        }
        return config.copy(i, dataFlag);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMaxDay() {
        return this.maxDay;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DataFlag getDataFlag() {
        return this.dataFlag;
    }

    @NotNull
    public final Config copy(int maxDay, @NotNull DataFlag dataFlag) {
        return new Config(maxDay, dataFlag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Config)) {
            return false;
        }
        Config config = (Config) other;
        return this.maxDay == config.maxDay && Intrinsics.areEqual(this.dataFlag, config.dataFlag);
    }

    @NotNull
    public final DataFlag getDataFlag() {
        return this.dataFlag;
    }

    public final int getMaxDay() {
        return this.maxDay;
    }

    public int hashCode() {
        return (this.maxDay * 31) + this.dataFlag.hashCode();
    }

    @NotNull
    public String toString() {
        return "Config(maxDay=" + this.maxDay + ", dataFlag=" + this.dataFlag + ')';
    }
}
