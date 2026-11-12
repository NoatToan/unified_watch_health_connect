package com.huami.nfc.watch.unionpay.entity;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.wallet.datasource.cloud.Const;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J;\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u000b\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\f\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\r\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000e\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001c\u0010\u000f\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019¨\u0006&"}, d2 = {"Lcom/huami/nfc/watch/unionpay/entity/BankCardBindStatus;", "", "", "isBinding", "", "component1", "component2", "", "component3", "component4", "component5", "aid", "cplc", "lastStatusUpdateTime", "status", "userId", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getAid", "()Ljava/lang/String;", "b", "getCplc", "c", "J", "getLastStatusUpdateTime", "()J", GoogleApiAvailabilityLight.a, "getStatus", "e", "getUserId", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "nfc-watch-unionpay_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BankCardBindStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("aid")
    @NotNull
    private final String aid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("cplc")
    @NotNull
    private final String cplc;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("lastStatusUpdateTime")
    private final long lastStatusUpdateTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("userId")
    @NotNull
    private final String userId;

    public BankCardBindStatus(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4) {
        this.aid = str;
        this.cplc = str2;
        this.lastStatusUpdateTime = j;
        this.status = str3;
        this.userId = str4;
    }

    public static /* synthetic */ BankCardBindStatus copy$default(BankCardBindStatus bankCardBindStatus, String str, String str2, long j, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankCardBindStatus.aid;
        }
        if ((i & 2) != 0) {
            str2 = bankCardBindStatus.cplc;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            j = bankCardBindStatus.lastStatusUpdateTime;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = bankCardBindStatus.status;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = bankCardBindStatus.userId;
        }
        return bankCardBindStatus.copy(str, str5, j2, str6, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLastStatusUpdateTime() {
        return this.lastStatusUpdateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final BankCardBindStatus copy(@NotNull String aid, @NotNull String cplc, long lastStatusUpdateTime, @NotNull String status, @NotNull String userId) {
        return new BankCardBindStatus(aid, cplc, lastStatusUpdateTime, status, userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankCardBindStatus)) {
            return false;
        }
        BankCardBindStatus bankCardBindStatus = (BankCardBindStatus) other;
        return Intrinsics.areEqual(this.aid, bankCardBindStatus.aid) && Intrinsics.areEqual(this.cplc, bankCardBindStatus.cplc) && this.lastStatusUpdateTime == bankCardBindStatus.lastStatusUpdateTime && Intrinsics.areEqual(this.status, bankCardBindStatus.status) && Intrinsics.areEqual(this.userId, bankCardBindStatus.userId);
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }

    public final long getLastStatusUpdateTime() {
        return this.lastStatusUpdateTime;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((this.aid.hashCode() * 31) + this.cplc.hashCode()) * 31) + b.a(this.lastStatusUpdateTime)) * 31) + this.status.hashCode()) * 31) + this.userId.hashCode();
    }

    public final boolean isBinding() {
        return Intrinsics.areEqual(Const.CardState.BINDING, this.status);
    }

    @NotNull
    public String toString() {
        return "BankCardBindStatus(aid=" + this.aid + ", cplc=" + this.cplc + ", lastStatusUpdateTime=" + this.lastStatusUpdateTime + ", status=" + this.status + ", userId=" + this.userId + ')';
    }

    public /* synthetic */ BankCardBindStatus(String str, String str2, long j, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? 0L : j, str3, str4);
    }
}
