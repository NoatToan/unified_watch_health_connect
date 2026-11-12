package com.xiaomi.hm.health.bt.profile.healthdevice.remind;

import com.huami.bluetooth.profile.heathdevice.RemindType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/EnableConfig;", "", "", "toString", "Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "component1", "", "component2", "remindType", "enable", "copy", "", "hashCode", "other", "equals", "a", "Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "getRemindType", "()Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "b", "Z", "getEnable", "()Z", "<init>", "(Lcom/huami/bluetooth/profile/heathdevice/RemindType;Z)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EnableConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final RemindType remindType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean enable;

    public EnableConfig(@NotNull RemindType remindType, boolean z) {
        this.remindType = remindType;
        this.enable = z;
    }

    public static /* synthetic */ EnableConfig copy$default(EnableConfig enableConfig, RemindType remindType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            remindType = enableConfig.remindType;
        }
        if ((i & 2) != 0) {
            z = enableConfig.enable;
        }
        return enableConfig.copy(remindType, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RemindType getRemindType() {
        return this.remindType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final EnableConfig copy(@NotNull RemindType remindType, boolean enable) {
        return new EnableConfig(remindType, enable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnableConfig)) {
            return false;
        }
        EnableConfig enableConfig = (EnableConfig) other;
        return Intrinsics.areEqual(this.remindType, enableConfig.remindType) && this.enable == enableConfig.enable;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final RemindType getRemindType() {
        return this.remindType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.remindType.hashCode() * 31;
        boolean z = this.enable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "EnableConfig[remindType: " + this.remindType + ", enable: " + this.enable + JsonLexerKt.END_LIST;
    }
}
