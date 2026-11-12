package com.huami.account.service.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00014BA\b\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b2\u00103J\u0006\u0010\u0003\u001a\u00020\u0002J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003JA\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0012HÖ\u0001R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001e\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"¨\u00065"}, d2 = {"Lcom/huami/account/service/model/LoginViewOptions;", "Landroid/os/Parcelable;", "Landroid/os/Bundle;", "toExtras", "", "component1", "component2", "", "component3", "component4", "component5", "username", "password", "showLoginTip", LoginViewOptions.EXTRA_SHOW_BACK, LoginViewOptions.EXTRA_LOGIN_TOKEN, "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", "setUsername", "(Ljava/lang/String;)V", "b", "getPassword", "setPassword", "c", "Z", "getShowLoginTip", "()Z", "setShowLoginTip", "(Z)V", GoogleApiAvailabilityLight.a, "getShowBack", "setShowBack", "e", "getLoginToken", "setLoginToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "Companion", "service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LoginViewOptions implements Parcelable {

    @NotNull
    public static final String EXTRA_LOGIN_TOKEN = "loginToken";

    @NotNull
    public static final String EXTRA_PASSWORD = "password";

    @NotNull
    public static final String EXTRA_SHOW_BACK = "showBack";

    @NotNull
    public static final String EXTRA_SHOW_LOGIN_TIP = "showLoginFirst";

    @NotNull
    public static final String EXTRA_USERNAME = "username";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private String username;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private String password;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private boolean showLoginTip;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private boolean showBack;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private String loginToken;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<LoginViewOptions> CREATOR = new Creator();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0005H\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/huami/account/service/model/LoginViewOptions$Companion;", "", "", "username", "password", "Lcom/huami/account/service/model/LoginViewOptions;", "fillLogin", LoginViewOptions.EXTRA_LOGIN_TOKEN, "autoLogin", "showTip", "EXTRA_LOGIN_TOKEN", "Ljava/lang/String;", "EXTRA_PASSWORD", "EXTRA_SHOW_BACK", "EXTRA_SHOW_LOGIN_TIP", "EXTRA_USERNAME", "<init>", "()V", "service_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LoginViewOptions autoLogin(@NotNull String loginToken) {
            return new LoginViewOptions(null, null, false, false, loginToken, 15, null);
        }

        @NotNull
        public final LoginViewOptions fillLogin(@Nullable String username, @Nullable String password) {
            return new LoginViewOptions(username, password, false, false, null, 28, null);
        }

        @JvmStatic
        @NotNull
        public final LoginViewOptions showTip() {
            return new LoginViewOptions(null, null, true, false, null, 27, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<LoginViewOptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LoginViewOptions createFromParcel(@NotNull Parcel parcel) {
            return new LoginViewOptions(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LoginViewOptions[] newArray(int i) {
            return new LoginViewOptions[i];
        }
    }

    @JvmOverloads
    public LoginViewOptions() {
        this(null, null, false, false, null, 31, null);
    }

    @JvmOverloads
    public LoginViewOptions(@Nullable String str) {
        this(str, null, false, false, null, 30, null);
    }

    @JvmOverloads
    public LoginViewOptions(@Nullable String str, @Nullable String str2) {
        this(str, str2, false, false, null, 28, null);
    }

    @JvmOverloads
    public LoginViewOptions(@Nullable String str, @Nullable String str2, boolean z) {
        this(str, str2, z, false, null, 24, null);
    }

    @JvmOverloads
    public LoginViewOptions(@Nullable String str, @Nullable String str2, boolean z, boolean z2) {
        this(str, str2, z, z2, null, 16, null);
    }

    @JvmOverloads
    public LoginViewOptions(@Nullable String str, @Nullable String str2, boolean z, boolean z2, @Nullable String str3) {
        this.username = str;
        this.password = str2;
        this.showLoginTip = z;
        this.showBack = z2;
        this.loginToken = str3;
    }

    public static /* synthetic */ LoginViewOptions copy$default(LoginViewOptions loginViewOptions, String str, String str2, boolean z, boolean z2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginViewOptions.username;
        }
        if ((i & 2) != 0) {
            str2 = loginViewOptions.password;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = loginViewOptions.showLoginTip;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = loginViewOptions.showBack;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            str3 = loginViewOptions.loginToken;
        }
        return loginViewOptions.copy(str, str4, z3, z4, str3);
    }

    @JvmStatic
    @NotNull
    public static final LoginViewOptions showTip() {
        return INSTANCE.showTip();
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowLoginTip() {
        return this.showLoginTip;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowBack() {
        return this.showBack;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLoginToken() {
        return this.loginToken;
    }

    @NotNull
    public final LoginViewOptions copy(@Nullable String username, @Nullable String password, boolean showLoginTip, boolean showBack, @Nullable String loginToken) {
        return new LoginViewOptions(username, password, showLoginTip, showBack, loginToken);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginViewOptions)) {
            return false;
        }
        LoginViewOptions loginViewOptions = (LoginViewOptions) other;
        return Intrinsics.areEqual(this.username, loginViewOptions.username) && Intrinsics.areEqual(this.password, loginViewOptions.password) && this.showLoginTip == loginViewOptions.showLoginTip && this.showBack == loginViewOptions.showBack && Intrinsics.areEqual(this.loginToken, loginViewOptions.loginToken);
    }

    @Nullable
    public final String getLoginToken() {
        return this.loginToken;
    }

    @Nullable
    public final String getPassword() {
        return this.password;
    }

    public final boolean getShowBack() {
        return this.showBack;
    }

    public final boolean getShowLoginTip() {
        return this.showLoginTip;
    }

    @Nullable
    public final String getUsername() {
        return this.username;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        String str = this.username;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.password;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.showLoginTip;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode2 + r2) * 31;
        boolean z2 = this.showBack;
        int i2 = (i + (z2 ? 1 : z2)) * 31;
        String str3 = this.loginToken;
        return i2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setLoginToken(@Nullable String str) {
        this.loginToken = str;
    }

    public final void setPassword(@Nullable String str) {
        this.password = str;
    }

    public final void setShowBack(boolean z) {
        this.showBack = z;
    }

    public final void setShowLoginTip(boolean z) {
        this.showLoginTip = z;
    }

    public final void setUsername(@Nullable String str) {
        this.username = str;
    }

    @NotNull
    public final Bundle toExtras() {
        Bundle bundle = new Bundle();
        bundle.putString("username", getUsername());
        bundle.putString("password", getPassword());
        bundle.putBoolean(EXTRA_SHOW_LOGIN_TIP, getShowLoginTip());
        bundle.putString(EXTRA_LOGIN_TOKEN, getLoginToken());
        bundle.putBoolean(EXTRA_SHOW_BACK, getShowBack());
        return bundle;
    }

    @NotNull
    public String toString() {
        return "LoginViewOptions(username=" + ((Object) this.username) + ", password=" + ((Object) this.password) + ", showLoginTip=" + this.showLoginTip + ", showBack=" + this.showBack + ", loginToken=" + ((Object) this.loginToken) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.username);
        parcel.writeString(this.password);
        parcel.writeInt(this.showLoginTip ? 1 : 0);
        parcel.writeInt(this.showBack ? 1 : 0);
        parcel.writeString(this.loginToken);
    }

    public /* synthetic */ LoginViewOptions(String str, String str2, boolean z, boolean z2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : str3);
    }
}
