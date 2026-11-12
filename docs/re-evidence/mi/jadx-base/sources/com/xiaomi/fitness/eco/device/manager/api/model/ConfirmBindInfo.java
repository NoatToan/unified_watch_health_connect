package com.xiaomi.fitness.eco.device.manager.api.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/api/model/ConfirmBindInfo;", "", "bindIndex", "", "bindDid", "bindSign", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBindIndex", "()Ljava/lang/String;", "setBindIndex", "(Ljava/lang/String;)V", "getBindDid", "setBindDid", "getBindSign", "setBindSign", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfirmBindInfo {

    @SerializedName("bind_did")
    @NotNull
    private String bindDid;

    @SerializedName("bind_index")
    @NotNull
    private String bindIndex;

    @SerializedName("bind_sign")
    @NotNull
    private String bindSign;

    public ConfirmBindInfo(@NotNull String bindIndex, @NotNull String bindDid, @NotNull String bindSign) {
        Intrinsics.checkNotNullParameter(bindIndex, "bindIndex");
        Intrinsics.checkNotNullParameter(bindDid, "bindDid");
        Intrinsics.checkNotNullParameter(bindSign, "bindSign");
        this.bindIndex = bindIndex;
        this.bindDid = bindDid;
        this.bindSign = bindSign;
    }

    public static /* synthetic */ ConfirmBindInfo copy$default(ConfirmBindInfo confirmBindInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmBindInfo.bindIndex;
        }
        if ((i & 2) != 0) {
            str2 = confirmBindInfo.bindDid;
        }
        if ((i & 4) != 0) {
            str3 = confirmBindInfo.bindSign;
        }
        return confirmBindInfo.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBindIndex() {
        return this.bindIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBindDid() {
        return this.bindDid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBindSign() {
        return this.bindSign;
    }

    @NotNull
    public final ConfirmBindInfo copy(@NotNull String bindIndex, @NotNull String bindDid, @NotNull String bindSign) {
        Intrinsics.checkNotNullParameter(bindIndex, "bindIndex");
        Intrinsics.checkNotNullParameter(bindDid, "bindDid");
        Intrinsics.checkNotNullParameter(bindSign, "bindSign");
        return new ConfirmBindInfo(bindIndex, bindDid, bindSign);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmBindInfo)) {
            return false;
        }
        ConfirmBindInfo confirmBindInfo = (ConfirmBindInfo) other;
        return Intrinsics.areEqual(this.bindIndex, confirmBindInfo.bindIndex) && Intrinsics.areEqual(this.bindDid, confirmBindInfo.bindDid) && Intrinsics.areEqual(this.bindSign, confirmBindInfo.bindSign);
    }

    @NotNull
    public final String getBindDid() {
        return this.bindDid;
    }

    @NotNull
    public final String getBindIndex() {
        return this.bindIndex;
    }

    @NotNull
    public final String getBindSign() {
        return this.bindSign;
    }

    public int hashCode() {
        return (((this.bindIndex.hashCode() * 31) + this.bindDid.hashCode()) * 31) + this.bindSign.hashCode();
    }

    public final void setBindDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindDid = str;
    }

    public final void setBindIndex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindIndex = str;
    }

    public final void setBindSign(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindSign = str;
    }

    @NotNull
    public String toString() {
        return "ConfirmBindInfo(bindIndex=" + this.bindIndex + ", bindDid=" + this.bindDid + ", bindSign=" + this.bindSign + ")";
    }
}
