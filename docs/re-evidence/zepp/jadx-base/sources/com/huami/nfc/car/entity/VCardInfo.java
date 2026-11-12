package com.huami.nfc.car.entity;

import com.android.billingclient.api.BillingFlowParams;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/nfc/car/entity/VCardInfo;", "", "", "component1", "component2", "component3", "vCardId", "aid", BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getVCardId", "()Ljava/lang/String;", "b", "getAid", "c", "getAccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "nfc-car_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class VCardInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("v_card_id")
    @NotNull
    private final String vCardId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("aid")
    @NotNull
    private final String aid;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("account_id")
    @NotNull
    private final String accountId;

    public VCardInfo() {
        this(null, null, null, 7, null);
    }

    public VCardInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.vCardId = str;
        this.aid = str2;
        this.accountId = str3;
    }

    public static /* synthetic */ VCardInfo copy$default(VCardInfo vCardInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vCardInfo.vCardId;
        }
        if ((i & 2) != 0) {
            str2 = vCardInfo.aid;
        }
        if ((i & 4) != 0) {
            str3 = vCardInfo.accountId;
        }
        return vCardInfo.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVCardId() {
        return this.vCardId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    public final VCardInfo copy(@NotNull String vCardId, @NotNull String aid, @NotNull String accountId) {
        return new VCardInfo(vCardId, aid, accountId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VCardInfo)) {
            return false;
        }
        VCardInfo vCardInfo = (VCardInfo) other;
        return Intrinsics.areEqual(this.vCardId, vCardInfo.vCardId) && Intrinsics.areEqual(this.aid, vCardInfo.aid) && Intrinsics.areEqual(this.accountId, vCardInfo.accountId);
    }

    @NotNull
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final String getVCardId() {
        return this.vCardId;
    }

    public int hashCode() {
        return (((this.vCardId.hashCode() * 31) + this.aid.hashCode()) * 31) + this.accountId.hashCode();
    }

    @NotNull
    public String toString() {
        return "VCardInfo(vCardId=" + this.vCardId + ", aid=" + this.aid + ", accountId=" + this.accountId + ')';
    }

    public /* synthetic */ VCardInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
