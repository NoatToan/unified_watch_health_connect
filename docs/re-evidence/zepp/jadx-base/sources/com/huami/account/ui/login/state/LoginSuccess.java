package com.huami.account.ui.login.state;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/huami/account/ui/login/state/LoginSuccess;", "", "", "a", "Ljava/lang/String;", "getProvider", "()Ljava/lang/String;", "provider", "", "b", "Z", "isNewUser", "()Z", "c", "getShowLoginSuccessDialog", "showLoginSuccessDialog", "<init>", "(Ljava/lang/String;ZZ)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class LoginSuccess {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String provider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isNewUser;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean showLoginSuccessDialog;

    public LoginSuccess(@NotNull String str, boolean z, boolean z2) {
        this.provider = str;
        this.isNewUser = z;
        this.showLoginSuccessDialog = z2;
    }

    @NotNull
    public final String getProvider() {
        return this.provider;
    }

    public final boolean getShowLoginSuccessDialog() {
        return this.showLoginSuccessDialog;
    }

    /* JADX INFO: renamed from: isNewUser, reason: from getter */
    public final boolean getIsNewUser() {
        return this.isNewUser;
    }

    public /* synthetic */ LoginSuccess(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
