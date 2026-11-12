package com.xiaomi.hm.health.bt.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/HMNBInfo;", "", "", "toString", "component1", "component2", "component3", "imei", "imsi", "nbVersion", "copy", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getImei", "()Ljava/lang/String;", "b", "getImsi", "c", "getNbVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HMNBInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String imei;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String imsi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String nbVersion;

    public HMNBInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.imei = str;
        this.imsi = str2;
        this.nbVersion = str3;
    }

    public static /* synthetic */ HMNBInfo copy$default(HMNBInfo hMNBInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hMNBInfo.imei;
        }
        if ((i & 2) != 0) {
            str2 = hMNBInfo.imsi;
        }
        if ((i & 4) != 0) {
            str3 = hMNBInfo.nbVersion;
        }
        return hMNBInfo.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImei() {
        return this.imei;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImsi() {
        return this.imsi;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNbVersion() {
        return this.nbVersion;
    }

    @NotNull
    public final HMNBInfo copy(@NotNull String imei, @NotNull String imsi, @NotNull String nbVersion) {
        return new HMNBInfo(imei, imsi, nbVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMNBInfo)) {
            return false;
        }
        HMNBInfo hMNBInfo = (HMNBInfo) other;
        return Intrinsics.areEqual(this.imei, hMNBInfo.imei) && Intrinsics.areEqual(this.imsi, hMNBInfo.imsi) && Intrinsics.areEqual(this.nbVersion, hMNBInfo.nbVersion);
    }

    @NotNull
    public final String getImei() {
        return this.imei;
    }

    @NotNull
    public final String getImsi() {
        return this.imsi;
    }

    @NotNull
    public final String getNbVersion() {
        return this.nbVersion;
    }

    public int hashCode() {
        return (((this.imei.hashCode() * 31) + this.imsi.hashCode()) * 31) + this.nbVersion.hashCode();
    }

    @NotNull
    public String toString() {
        return "[NBInfo] IMEI:" + this.imei + " IMSI:" + this.imsi + " NB-Ver:" + this.nbVersion;
    }
}
