package com.huami.nfc.bus;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJb\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u000bR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u000b¨\u0006/"}, d2 = {"Lcom/huami/nfc/bus/MiRefundStatus;", "", "", "component1", "", "component2", "component3", "component4", "component5", "", "component6", "()Ljava/lang/Boolean;", "component7", "status", "refundDesc", "refundTicket", "returnCardTicket", "returnCardDesc", "xmReturnCardFlg", "xmReturnFeeFlg", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/huami/nfc/bus/MiRefundStatus;", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getStatus", "()I", "b", "Ljava/lang/String;", "getRefundDesc", "()Ljava/lang/String;", "c", "getRefundTicket", GoogleApiAvailabilityLight.a, "getReturnCardTicket", "e", "getReturnCardDesc", "f", "Ljava/lang/Boolean;", "getXmReturnCardFlg", "g", "getXmReturnFeeFlg", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MiRefundStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("status")
    private final int status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("refundDesc")
    @Nullable
    private final String refundDesc;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("refundTicket")
    @Nullable
    private final String refundTicket;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("returnCardTicket")
    @Nullable
    private final String returnCardTicket;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("returnCardDesc")
    @Nullable
    private final String returnCardDesc;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("xmReturnCardFlg")
    @Nullable
    private final Boolean xmReturnCardFlg;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("xmReturnFeeFlg")
    @Nullable
    private final Boolean xmReturnFeeFlg;

    public MiRefundStatus(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.status = i;
        this.refundDesc = str;
        this.refundTicket = str2;
        this.returnCardTicket = str3;
        this.returnCardDesc = str4;
        this.xmReturnCardFlg = bool;
        this.xmReturnFeeFlg = bool2;
    }

    public static /* synthetic */ MiRefundStatus copy$default(MiRefundStatus miRefundStatus, int i, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = miRefundStatus.status;
        }
        if ((i2 & 2) != 0) {
            str = miRefundStatus.refundDesc;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = miRefundStatus.refundTicket;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = miRefundStatus.returnCardTicket;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = miRefundStatus.returnCardDesc;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            bool = miRefundStatus.xmReturnCardFlg;
        }
        Boolean bool3 = bool;
        if ((i2 & 64) != 0) {
            bool2 = miRefundStatus.xmReturnFeeFlg;
        }
        return miRefundStatus.copy(i, str5, str6, str7, str8, bool3, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRefundDesc() {
        return this.refundDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRefundTicket() {
        return this.refundTicket;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReturnCardTicket() {
        return this.returnCardTicket;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReturnCardDesc() {
        return this.returnCardDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getXmReturnCardFlg() {
        return this.xmReturnCardFlg;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getXmReturnFeeFlg() {
        return this.xmReturnFeeFlg;
    }

    @NotNull
    public final MiRefundStatus copy(int status, @Nullable String refundDesc, @Nullable String refundTicket, @Nullable String returnCardTicket, @Nullable String returnCardDesc, @Nullable Boolean xmReturnCardFlg, @Nullable Boolean xmReturnFeeFlg) {
        return new MiRefundStatus(status, refundDesc, refundTicket, returnCardTicket, returnCardDesc, xmReturnCardFlg, xmReturnFeeFlg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiRefundStatus)) {
            return false;
        }
        MiRefundStatus miRefundStatus = (MiRefundStatus) other;
        return this.status == miRefundStatus.status && Intrinsics.areEqual(this.refundDesc, miRefundStatus.refundDesc) && Intrinsics.areEqual(this.refundTicket, miRefundStatus.refundTicket) && Intrinsics.areEqual(this.returnCardTicket, miRefundStatus.returnCardTicket) && Intrinsics.areEqual(this.returnCardDesc, miRefundStatus.returnCardDesc) && Intrinsics.areEqual(this.xmReturnCardFlg, miRefundStatus.xmReturnCardFlg) && Intrinsics.areEqual(this.xmReturnFeeFlg, miRefundStatus.xmReturnFeeFlg);
    }

    @Nullable
    public final String getRefundDesc() {
        return this.refundDesc;
    }

    @Nullable
    public final String getRefundTicket() {
        return this.refundTicket;
    }

    @Nullable
    public final String getReturnCardDesc() {
        return this.returnCardDesc;
    }

    @Nullable
    public final String getReturnCardTicket() {
        return this.returnCardTicket;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final Boolean getXmReturnCardFlg() {
        return this.xmReturnCardFlg;
    }

    @Nullable
    public final Boolean getXmReturnFeeFlg() {
        return this.xmReturnFeeFlg;
    }

    public int hashCode() {
        int i = this.status * 31;
        String str = this.refundDesc;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.refundTicket;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.returnCardTicket;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.returnCardDesc;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.xmReturnCardFlg;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.xmReturnFeeFlg;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MiRefundStatus(status=" + this.status + ", refundDesc=" + ((Object) this.refundDesc) + ", refundTicket=" + ((Object) this.refundTicket) + ", returnCardTicket=" + ((Object) this.returnCardTicket) + ", returnCardDesc=" + ((Object) this.returnCardDesc) + ", xmReturnCardFlg=" + this.xmReturnCardFlg + ", xmReturnFeeFlg=" + this.xmReturnFeeFlg + ')';
    }
}
