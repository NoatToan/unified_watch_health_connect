package com.xiaomi.fit.fitness.persist.process;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fB\t\b\u0016¢\u0006\u0004\b\u000b\u0010\rB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\u000eJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003JN\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0007HÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0010\"\u0004\b\u001f\u0010\u0012¨\u0006,"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/process/SyncRequestResult;", "", "success", "", "hasNewData", "isRequestOnline", "serverCode", "", "serverMsg", "", "isFirstCloudSync", "<init>", "(ZZZLjava/lang/Integer;Ljava/lang/String;Z)V", "()V", "(ZLjava/lang/Integer;Ljava/lang/String;)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "getHasNewData", "setHasNewData", "setRequestOnline", "getServerCode", "()Ljava/lang/Integer;", "setServerCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getServerMsg", "()Ljava/lang/String;", "setServerMsg", "(Ljava/lang/String;)V", "setFirstCloudSync", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZZZLjava/lang/Integer;Ljava/lang/String;Z)Lcom/xiaomi/fit/fitness/persist/process/SyncRequestResult;", "equals", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SyncRequestResult {
    private boolean hasNewData;
    private boolean isFirstCloudSync;
    private boolean isRequestOnline;

    @Nullable
    private Integer serverCode;

    @Nullable
    private String serverMsg;
    private boolean success;

    public SyncRequestResult(boolean z, boolean z2, boolean z3, @Nullable Integer num, @Nullable String str, boolean z4) {
        this.success = z;
        this.hasNewData = z2;
        this.isRequestOnline = z3;
        this.serverCode = num;
        this.serverMsg = str;
        this.isFirstCloudSync = z4;
    }

    public static /* synthetic */ SyncRequestResult copy$default(SyncRequestResult syncRequestResult, boolean z, boolean z2, boolean z3, Integer num, String str, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = syncRequestResult.success;
        }
        if ((i & 2) != 0) {
            z2 = syncRequestResult.hasNewData;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = syncRequestResult.isRequestOnline;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            num = syncRequestResult.serverCode;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str = syncRequestResult.serverMsg;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z4 = syncRequestResult.isFirstCloudSync;
        }
        return syncRequestResult.copy(z, z5, z6, num2, str2, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasNewData() {
        return this.hasNewData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsRequestOnline() {
        return this.isRequestOnline;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getServerCode() {
        return this.serverCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getServerMsg() {
        return this.serverMsg;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsFirstCloudSync() {
        return this.isFirstCloudSync;
    }

    @NotNull
    public final SyncRequestResult copy(boolean success, boolean hasNewData, boolean isRequestOnline, @Nullable Integer serverCode, @Nullable String serverMsg, boolean isFirstCloudSync) {
        return new SyncRequestResult(success, hasNewData, isRequestOnline, serverCode, serverMsg, isFirstCloudSync);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncRequestResult)) {
            return false;
        }
        SyncRequestResult syncRequestResult = (SyncRequestResult) other;
        return this.success == syncRequestResult.success && this.hasNewData == syncRequestResult.hasNewData && this.isRequestOnline == syncRequestResult.isRequestOnline && Intrinsics.areEqual(this.serverCode, syncRequestResult.serverCode) && Intrinsics.areEqual(this.serverMsg, syncRequestResult.serverMsg) && this.isFirstCloudSync == syncRequestResult.isFirstCloudSync;
    }

    public final boolean getHasNewData() {
        return this.hasNewData;
    }

    @Nullable
    public final Integer getServerCode() {
        return this.serverCode;
    }

    @Nullable
    public final String getServerMsg() {
        return this.serverMsg;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.success) * 31) + Boolean.hashCode(this.hasNewData)) * 31) + Boolean.hashCode(this.isRequestOnline)) * 31;
        Integer num = this.serverCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.serverMsg;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFirstCloudSync);
    }

    public final boolean isFirstCloudSync() {
        return this.isFirstCloudSync;
    }

    public final boolean isRequestOnline() {
        return this.isRequestOnline;
    }

    public final void setFirstCloudSync(boolean z) {
        this.isFirstCloudSync = z;
    }

    public final void setHasNewData(boolean z) {
        this.hasNewData = z;
    }

    public final void setRequestOnline(boolean z) {
        this.isRequestOnline = z;
    }

    public final void setServerCode(@Nullable Integer num) {
        this.serverCode = num;
    }

    public final void setServerMsg(@Nullable String str) {
        this.serverMsg = str;
    }

    public final void setSuccess(boolean z) {
        this.success = z;
    }

    @NotNull
    public String toString() {
        return "SyncRequestResult(success=" + this.success + ", hasNewData=" + this.hasNewData + ", isRequestOnline=" + this.isRequestOnline + ", serverCode=" + this.serverCode + ", serverMsg=" + this.serverMsg + ", isFirstCloudSync=" + this.isFirstCloudSync + ")";
    }

    public /* synthetic */ SyncRequestResult(boolean z, boolean z2, boolean z3, Integer num, String str, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? true : z2, (i & 4) == 0 ? z3 : true, (i & 8) != 0 ? null : num, (i & 16) == 0 ? str : null, (i & 32) != 0 ? false : z4);
    }

    public SyncRequestResult() {
        this(false, false, false, null, null, false, 56, null);
    }

    public /* synthetic */ SyncRequestResult(boolean z, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str);
    }

    public SyncRequestResult(boolean z, @Nullable Integer num, @Nullable String str) {
        this(z, true, true, num, str, false, 32, null);
    }
}
