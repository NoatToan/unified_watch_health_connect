package com.huami.thirdparty.webauth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.account.AccountStatEvent;
import com.huami.passport.Configs;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00016B1\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b4\u00105J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0002J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u001a\u001a\u00020\rHÖ\u0001J\u0019\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\rHÖ\u0001R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\"\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010 \u001a\u0004\b2\u0010\"\"\u0004\b3\u0010$¨\u00067"}, d2 = {"Lcom/huami/thirdparty/webauth/TokenInfo;", "Landroid/os/Parcelable;", "", "isExpires", "isAuth", "", "accessToken", "refreshToken", "expiresIn", "", Configs.Params.RESET, "isValid", "component1", "", "component2", "component3", "component4", "component5", "state", AccountStatEvent.KEY_ACCOUNT_SIGN_THIRD_NAME, "copy", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "writeToParcel", "a", "Ljava/lang/String;", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "b", LogUtil.I, "getState", "()I", "setState", "(I)V", "c", "getExpiresIn", "setExpiresIn", GoogleApiAvailabilityLight.a, "getRefreshToken", "setRefreshToken", "e", "getThirdName", "setThirdName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "webauth_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class TokenInfo implements Parcelable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("access_token")
    @NotNull
    private String accessToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("state")
    private int state;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("expires_in")
    @NotNull
    private String expiresIn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("refresh_token")
    @NotNull
    private String refreshToken;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName(AccountStatEvent.KEY_ACCOUNT_SIGN_THIRD_NAME)
    @NotNull
    private String thirdName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<TokenInfo> CREATOR = new Creator();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/thirdparty/webauth/TokenInfo$Companion;", "", "Lcom/huami/thirdparty/webauth/TokenInfo;", "empty", "<init>", "()V", "webauth_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final TokenInfo empty() {
            return new TokenInfo("", -1, "", "", null, 16, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 1})
    public static class Creator implements Parcelable.Creator<TokenInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TokenInfo createFromParcel(@NotNull Parcel parcel) {
            return new TokenInfo(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TokenInfo[] newArray(int i) {
            return new TokenInfo[i];
        }
    }

    public TokenInfo(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.accessToken = str;
        this.state = i;
        this.expiresIn = str2;
        this.refreshToken = str3;
        this.thirdName = str4;
    }

    public static /* synthetic */ TokenInfo copy$default(TokenInfo tokenInfo, String str, int i, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tokenInfo.accessToken;
        }
        if ((i2 & 2) != 0) {
            i = tokenInfo.state;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = tokenInfo.expiresIn;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = tokenInfo.refreshToken;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = tokenInfo.thirdName;
        }
        return tokenInfo.copy(str, i3, str5, str6, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExpiresIn() {
        return this.expiresIn;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getThirdName() {
        return this.thirdName;
    }

    @NotNull
    public final TokenInfo copy(@NotNull String accessToken, int state, @NotNull String expiresIn, @NotNull String refreshToken, @NotNull String thirdName) {
        return new TokenInfo(accessToken, state, expiresIn, refreshToken, thirdName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenInfo)) {
            return false;
        }
        TokenInfo tokenInfo = (TokenInfo) other;
        return Intrinsics.areEqual(this.accessToken, tokenInfo.accessToken) && this.state == tokenInfo.state && Intrinsics.areEqual(this.expiresIn, tokenInfo.expiresIn) && Intrinsics.areEqual(this.refreshToken, tokenInfo.refreshToken) && Intrinsics.areEqual(this.thirdName, tokenInfo.thirdName);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final String getExpiresIn() {
        return this.expiresIn;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final int getState() {
        return this.state;
    }

    @NotNull
    public final String getThirdName() {
        return this.thirdName;
    }

    public int hashCode() {
        String str = this.accessToken;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.state) * 31;
        String str2 = this.expiresIn;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.refreshToken;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.thirdName;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isAuth() {
        return (this.state == 0 || TextUtils.isEmpty(this.accessToken) || TextUtils.isEmpty(this.expiresIn) || TextUtils.isEmpty(this.refreshToken)) ? false : true;
    }

    public final boolean isExpires() {
        return Long.parseLong(this.expiresIn) <= System.currentTimeMillis() / 1000;
    }

    public final boolean isValid() {
        return (this.state == 0 || TextUtils.isEmpty(this.accessToken) || TextUtils.isEmpty(this.expiresIn) || TextUtils.isEmpty(this.refreshToken)) ? false : true;
    }

    public final void reset(@NotNull String accessToken, @NotNull String refreshToken, @NotNull String expiresIn) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.expiresIn = expiresIn;
    }

    public final void setAccessToken(@NotNull String str) {
        this.accessToken = str;
    }

    public final void setExpiresIn(@NotNull String str) {
        this.expiresIn = str;
    }

    public final void setRefreshToken(@NotNull String str) {
        this.refreshToken = str;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setThirdName(@NotNull String str) {
        this.thirdName = str;
    }

    @NotNull
    public String toString() {
        return "TokenInfo(accessToken=" + this.accessToken + ", state=" + this.state + ", expiresIn=" + this.expiresIn + ", refreshToken=" + this.refreshToken + ", thirdName=" + this.thirdName + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.accessToken);
        parcel.writeInt(this.state);
        parcel.writeString(this.expiresIn);
        parcel.writeString(this.refreshToken);
        parcel.writeString(this.thirdName);
    }

    public /* synthetic */ TokenInfo(String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, (i2 & 16) != 0 ? "" : str4);
    }
}
