package com.huami.nfc.bus.entities;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J+\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/nfc/bus/entities/PayAccountInfoPostBody;", "", "", "component1", "component2", "component3", "payAccountType", "payAccountId", "payAccountName", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPayAccountType", "()Ljava/lang/String;", "b", "getPayAccountId", "c", "getPayAccountName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PayAccountInfoPostBody {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("payAccountType")
    @NotNull
    private final String payAccountType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("payAccountId")
    @Nullable
    private final String payAccountId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("payAccountName")
    @Nullable
    private final String payAccountName;

    public PayAccountInfoPostBody(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        this.payAccountType = str;
        this.payAccountId = str2;
        this.payAccountName = str3;
    }

    public static /* synthetic */ PayAccountInfoPostBody copy$default(PayAccountInfoPostBody payAccountInfoPostBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payAccountInfoPostBody.payAccountType;
        }
        if ((i & 2) != 0) {
            str2 = payAccountInfoPostBody.payAccountId;
        }
        if ((i & 4) != 0) {
            str3 = payAccountInfoPostBody.payAccountName;
        }
        return payAccountInfoPostBody.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPayAccountType() {
        return this.payAccountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPayAccountId() {
        return this.payAccountId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPayAccountName() {
        return this.payAccountName;
    }

    @NotNull
    public final PayAccountInfoPostBody copy(@NotNull String payAccountType, @Nullable String payAccountId, @Nullable String payAccountName) {
        return new PayAccountInfoPostBody(payAccountType, payAccountId, payAccountName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayAccountInfoPostBody)) {
            return false;
        }
        PayAccountInfoPostBody payAccountInfoPostBody = (PayAccountInfoPostBody) other;
        return Intrinsics.areEqual(this.payAccountType, payAccountInfoPostBody.payAccountType) && Intrinsics.areEqual(this.payAccountId, payAccountInfoPostBody.payAccountId) && Intrinsics.areEqual(this.payAccountName, payAccountInfoPostBody.payAccountName);
    }

    @Nullable
    public final String getPayAccountId() {
        return this.payAccountId;
    }

    @Nullable
    public final String getPayAccountName() {
        return this.payAccountName;
    }

    @NotNull
    public final String getPayAccountType() {
        return this.payAccountType;
    }

    public int hashCode() {
        int iHashCode = this.payAccountType.hashCode() * 31;
        String str = this.payAccountId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.payAccountName;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PayAccountInfoPostBody(payAccountType=" + this.payAccountType + ", payAccountId=" + ((Object) this.payAccountId) + ", payAccountName=" + ((Object) this.payAccountName) + ')';
    }
}
