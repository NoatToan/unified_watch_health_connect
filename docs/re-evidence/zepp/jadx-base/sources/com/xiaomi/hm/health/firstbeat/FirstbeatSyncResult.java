package com.xiaomi.hm.health.firstbeat;

import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeatData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/firstbeat/FirstbeatSyncResult;", "", "Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/BleFirstbeatData;", "component1", "firstbeatData", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/BleFirstbeatData;", "getFirstbeatData", "()Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/BleFirstbeatData;", "setFirstbeatData", "(Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/BleFirstbeatData;)V", "<init>", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FirstbeatSyncResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private BleFirstbeatData firstbeatData;

    /* JADX WARN: Multi-variable type inference failed */
    public FirstbeatSyncResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public FirstbeatSyncResult(@Nullable BleFirstbeatData bleFirstbeatData) {
        this.firstbeatData = bleFirstbeatData;
    }

    public static /* synthetic */ FirstbeatSyncResult copy$default(FirstbeatSyncResult firstbeatSyncResult, BleFirstbeatData bleFirstbeatData, int i, Object obj) {
        if ((i & 1) != 0) {
            bleFirstbeatData = firstbeatSyncResult.firstbeatData;
        }
        return firstbeatSyncResult.copy(bleFirstbeatData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BleFirstbeatData getFirstbeatData() {
        return this.firstbeatData;
    }

    @NotNull
    public final FirstbeatSyncResult copy(@Nullable BleFirstbeatData firstbeatData) {
        return new FirstbeatSyncResult(firstbeatData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FirstbeatSyncResult) && Intrinsics.areEqual(this.firstbeatData, ((FirstbeatSyncResult) other).firstbeatData);
    }

    @Nullable
    public final BleFirstbeatData getFirstbeatData() {
        return this.firstbeatData;
    }

    public int hashCode() {
        BleFirstbeatData bleFirstbeatData = this.firstbeatData;
        if (bleFirstbeatData == null) {
            return 0;
        }
        return bleFirstbeatData.hashCode();
    }

    public final void setFirstbeatData(@Nullable BleFirstbeatData bleFirstbeatData) {
        this.firstbeatData = bleFirstbeatData;
    }

    @NotNull
    public String toString() {
        return "FirstbeatSyncResult(firstbeatData=" + this.firstbeatData + ")";
    }

    public /* synthetic */ FirstbeatSyncResult(BleFirstbeatData bleFirstbeatData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bleFirstbeatData);
    }
}
