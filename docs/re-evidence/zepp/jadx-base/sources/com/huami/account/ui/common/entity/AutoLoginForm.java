package com.huami.account.ui.common.entity;

import com.huami.passport.entity.LoginInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/account/ui/common/entity/AutoLoginForm;", "", "Lcom/huami/passport/entity/LoginInfo;", "component1", "", "component2", "loginInfo", "countryCode", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/passport/entity/LoginInfo;", "getLoginInfo", "()Lcom/huami/passport/entity/LoginInfo;", "b", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", "<init>", "(Lcom/huami/passport/entity/LoginInfo;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AutoLoginForm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final LoginInfo loginInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String countryCode;

    public AutoLoginForm(@NotNull LoginInfo loginInfo, @NotNull String str) {
        this.loginInfo = loginInfo;
        this.countryCode = str;
    }

    public static /* synthetic */ AutoLoginForm copy$default(AutoLoginForm autoLoginForm, LoginInfo loginInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            loginInfo = autoLoginForm.loginInfo;
        }
        if ((i & 2) != 0) {
            str = autoLoginForm.countryCode;
        }
        return autoLoginForm.copy(loginInfo, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LoginInfo getLoginInfo() {
        return this.loginInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final AutoLoginForm copy(@NotNull LoginInfo loginInfo, @NotNull String countryCode) {
        return new AutoLoginForm(loginInfo, countryCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoLoginForm)) {
            return false;
        }
        AutoLoginForm autoLoginForm = (AutoLoginForm) other;
        return Intrinsics.areEqual(this.loginInfo, autoLoginForm.loginInfo) && Intrinsics.areEqual(this.countryCode, autoLoginForm.countryCode);
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final LoginInfo getLoginInfo() {
        return this.loginInfo;
    }

    public int hashCode() {
        return (this.loginInfo.hashCode() * 31) + this.countryCode.hashCode();
    }

    @NotNull
    public String toString() {
        return "AutoLoginForm(loginInfo=" + this.loginInfo + ", countryCode=" + this.countryCode + ")";
    }
}
