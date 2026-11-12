package com.huami.nfc.bus.entities;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003JC\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006\""}, d2 = {"Lcom/huami/nfc/bus/entities/RefundTicketPostBody;", "", "", "component1", "component2", "component3", "component4", "component5", "channelType", Configs.Params.AUTHCODE, "account", "userName", "userPhone_no", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getChannelType", "()Ljava/lang/String;", "b", "getAuthCode", "c", "getAccount", GoogleApiAvailabilityLight.a, "getUserName", "e", "getUserPhone_no", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RefundTicketPostBody {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("channel_type")
    @NotNull
    private final String channelType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName(Configs.Params.AUTH_CODE)
    @Nullable
    private final String authCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("account")
    @Nullable
    private final String account;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("user_name")
    @Nullable
    private final String userName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("user_phone_no")
    @Nullable
    private final String userPhone_no;

    public RefundTicketPostBody(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.channelType = str;
        this.authCode = str2;
        this.account = str3;
        this.userName = str4;
        this.userPhone_no = str5;
    }

    public static /* synthetic */ RefundTicketPostBody copy$default(RefundTicketPostBody refundTicketPostBody, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = refundTicketPostBody.channelType;
        }
        if ((i & 2) != 0) {
            str2 = refundTicketPostBody.authCode;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = refundTicketPostBody.account;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = refundTicketPostBody.userName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = refundTicketPostBody.userPhone_no;
        }
        return refundTicketPostBody.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserPhone_no() {
        return this.userPhone_no;
    }

    @NotNull
    public final RefundTicketPostBody copy(@NotNull String channelType, @Nullable String authCode, @Nullable String account, @Nullable String userName, @Nullable String userPhone_no) {
        return new RefundTicketPostBody(channelType, authCode, account, userName, userPhone_no);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefundTicketPostBody)) {
            return false;
        }
        RefundTicketPostBody refundTicketPostBody = (RefundTicketPostBody) other;
        return Intrinsics.areEqual(this.channelType, refundTicketPostBody.channelType) && Intrinsics.areEqual(this.authCode, refundTicketPostBody.authCode) && Intrinsics.areEqual(this.account, refundTicketPostBody.account) && Intrinsics.areEqual(this.userName, refundTicketPostBody.userName) && Intrinsics.areEqual(this.userPhone_no, refundTicketPostBody.userPhone_no);
    }

    @Nullable
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    public final String getAuthCode() {
        return this.authCode;
    }

    @NotNull
    public final String getChannelType() {
        return this.channelType;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    public final String getUserPhone_no() {
        return this.userPhone_no;
    }

    public int hashCode() {
        int iHashCode = this.channelType.hashCode() * 31;
        String str = this.authCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.account;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userPhone_no;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RefundTicketPostBody(channelType=" + this.channelType + ", authCode=" + ((Object) this.authCode) + ", account=" + ((Object) this.account) + ", userName=" + ((Object) this.userName) + ", userPhone_no=" + ((Object) this.userPhone_no) + ')';
    }
}
